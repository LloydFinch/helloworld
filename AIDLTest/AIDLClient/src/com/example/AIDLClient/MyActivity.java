package com.example.AIDLClient;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import android.view.View;
import com.example.AIDLServer.aidl.AIDLServer;

public class MyActivity extends Activity implements ServiceConnection {
	private AIDLServer server;

	/**
	 * Called when the activity is first created.
	 */
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
	}

	protected void onResume() {
		super.onResume();

		Intent intent = new Intent("com.service.AIDL_SERVER");
		bindService(intent, this, BIND_AUTO_CREATE);
	}

	protected void onPause() {
		super.onPause();
		unbindService(this);
	}

	public void onServiceConnected(ComponentName name, IBinder service) {

		//使用AIDL获取服务的IBinder，需要通过asInterface()来转换为相应的接口
		//转换的server就是AIDL定义的接口,可以通过它调用Service内部的方法
		server = AIDLServer.Stub.asInterface(service);
		try {
			int version = server.getVersion();
			Log.d("=======>", "AIDL Version:  " + version);
		} catch (RemoteException e) {
			e.printStackTrace();
		}
	}

	public void onServiceDisconnected(ComponentName name) {

		//释放server对象
		server = null;
	}

	public void btnSend_onclick(View view) {

		Log.d("--------->","发送信息给客户端...");
		try {
			server.sendMessage("Hello world !");
		} catch (RemoteException e) {
			e.printStackTrace();
		}
	}
}

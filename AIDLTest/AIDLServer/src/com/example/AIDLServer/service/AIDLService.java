package com.example.AIDLServer.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import com.example.AIDLServer.aidl.AIDLServer;

/**
 * Created by VennUser on 2015/7/13.
 */
public class AIDLService extends Service {


	public IBinder onBind(Intent intent) {
		return new Controller();
	}

	public class Controller extends AIDLServer.Stub {

		public int getVersion() throws RemoteException {
			return 741;
		}

		public void sendMessage(String receiver) throws RemoteException {
			Log.d("----------->", "sendMessage" + receiver);
		}

		public long sum(byte[] data) throws RemoteException {
			return data.length;
		}

		public void send(Message message) throws RemoteException {

		}
	}
}

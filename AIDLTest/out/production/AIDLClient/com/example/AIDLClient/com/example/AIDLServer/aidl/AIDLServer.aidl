package com.example.AIDLServer.aidl;

interface AIDLServer{

	int getVersion();

	//将内容发送给服务
	void sendMessage(String receiver);


	//参数为byte数组或list集合时，需要指明是用来输入还是输出(in , out ,inout)
	long sum(in byte[] data);

}
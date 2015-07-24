/*___Generated_by_IDEA___*/

/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: F:\\Projects\\AIDLTest\\AIDLServer\\src\\com\\example\\AIDLServer\\aidl\\AIDLServer.aidl
 */
package com.example.AIDLServer.aidl;
public interface AIDLServer extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements com.example.AIDLServer.aidl.AIDLServer
{
private static final java.lang.String DESCRIPTOR = "com.example.AIDLServer.aidl.AIDLServer";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an com.example.AIDLServer.aidl.AIDLServer interface,
 * generating a proxy if needed.
 */
public static com.example.AIDLServer.aidl.AIDLServer asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof com.example.AIDLServer.aidl.AIDLServer))) {
return ((com.example.AIDLServer.aidl.AIDLServer)iin);
}
return new com.example.AIDLServer.aidl.AIDLServer.Stub.Proxy(obj);
}
@Override public android.os.IBinder asBinder()
{
return this;
}
@Override public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException
{
switch (code)
{
case INTERFACE_TRANSACTION:
{
reply.writeString(DESCRIPTOR);
return true;
}
case TRANSACTION_getVersion:
{
data.enforceInterface(DESCRIPTOR);
int _result = this.getVersion();
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_sendMessage:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
this.sendMessage(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_sum:
{
data.enforceInterface(DESCRIPTOR);
byte[] _arg0;
_arg0 = data.createByteArray();
long _result = this.sum(_arg0);
reply.writeNoException();
reply.writeLong(_result);
return true;
}
case TRANSACTION_send:
{
data.enforceInterface(DESCRIPTOR);
android.os.Message _arg0;
if ((0!=data.readInt())) {
_arg0 = android.os.Message.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
this.send(_arg0);
reply.writeNoException();
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements com.example.AIDLServer.aidl.AIDLServer
{
private android.os.IBinder mRemote;
Proxy(android.os.IBinder remote)
{
mRemote = remote;
}
@Override public android.os.IBinder asBinder()
{
return mRemote;
}
public java.lang.String getInterfaceDescriptor()
{
return DESCRIPTOR;
}
@Override public int getVersion() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getVersion, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
//灏嗗唴瀹瑰彂閫佺粰鏈嶅姟

@Override public void sendMessage(java.lang.String receiver) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(receiver);
mRemote.transact(Stub.TRANSACTION_sendMessage, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
//鍙傛暟涓篵yte鏁扮粍鎴杔ist闆嗗悎鏃讹紝闇�瑕佹寚鏄庢槸鐢ㄦ潵杈撳叆杩樻槸杈撳嚭(in , out ,inout)

@Override public long sum(byte[] data) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
long _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeByteArray(data);
mRemote.transact(Stub.TRANSACTION_sum, _data, _reply, 0);
_reply.readException();
_result = _reply.readLong();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
//妯′豢淇′娇鍔熻兘,娉ㄦ剰瀵煎叆鍖�

@Override public void send(android.os.Message message) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((message!=null)) {
_data.writeInt(1);
message.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_send, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
}
static final int TRANSACTION_getVersion = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_sendMessage = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_sum = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_send = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
}
public int getVersion() throws android.os.RemoteException;
//灏嗗唴瀹瑰彂閫佺粰鏈嶅姟

public void sendMessage(java.lang.String receiver) throws android.os.RemoteException;
//鍙傛暟涓篵yte鏁扮粍鎴杔ist闆嗗悎鏃讹紝闇�瑕佹寚鏄庢槸鐢ㄦ潵杈撳叆杩樻槸杈撳嚭(in , out ,inout)

public long sum(byte[] data) throws android.os.RemoteException;
//妯′豢淇′娇鍔熻兘,娉ㄦ剰瀵煎叆鍖�

public void send(android.os.Message message) throws android.os.RemoteException;
}

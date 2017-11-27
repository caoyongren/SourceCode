/*___Generated_by_IDEA___*/

/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /media/matthew/Android-studio/OTOSOURCECODE/base/core/java/android/app/IEphemeralResolver.aidl
 */
package android.app;
/** @hide @deprecated */
public interface IEphemeralResolver extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.app.IEphemeralResolver
{
private static final java.lang.String DESCRIPTOR = "android.app.IEphemeralResolver";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.app.IEphemeralResolver interface,
 * generating a proxy if needed.
 */
public static android.app.IEphemeralResolver asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.app.IEphemeralResolver))) {
return ((android.app.IEphemeralResolver)iin);
}
return new android.app.IEphemeralResolver.Stub.Proxy(obj);
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
case TRANSACTION_getEphemeralResolveInfoList:
{
data.enforceInterface(DESCRIPTOR);
android.os.IRemoteCallback _arg0;
_arg0 = android.os.IRemoteCallback.Stub.asInterface(data.readStrongBinder());
int[] _arg1;
_arg1 = data.createIntArray();
int _arg2;
_arg2 = data.readInt();
this.getEphemeralResolveInfoList(_arg0, _arg1, _arg2);
return true;
}
case TRANSACTION_getEphemeralIntentFilterList:
{
data.enforceInterface(DESCRIPTOR);
android.os.IRemoteCallback _arg0;
_arg0 = android.os.IRemoteCallback.Stub.asInterface(data.readStrongBinder());
java.lang.String _arg1;
_arg1 = data.readString();
int _arg2;
_arg2 = data.readInt();
this.getEphemeralIntentFilterList(_arg0, _arg1, _arg2);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.app.IEphemeralResolver
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
@Override public void getEphemeralResolveInfoList(android.os.IRemoteCallback callback, int[] digestPrefix, int sequence) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
_data.writeIntArray(digestPrefix);
_data.writeInt(sequence);
mRemote.transact(Stub.TRANSACTION_getEphemeralResolveInfoList, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void getEphemeralIntentFilterList(android.os.IRemoteCallback callback, java.lang.String hostName, int sequence) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
_data.writeString(hostName);
_data.writeInt(sequence);
mRemote.transact(Stub.TRANSACTION_getEphemeralIntentFilterList, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
}
static final int TRANSACTION_getEphemeralResolveInfoList = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_getEphemeralIntentFilterList = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
}
public void getEphemeralResolveInfoList(android.os.IRemoteCallback callback, int[] digestPrefix, int sequence) throws android.os.RemoteException;
public void getEphemeralIntentFilterList(android.os.IRemoteCallback callback, java.lang.String hostName, int sequence) throws android.os.RemoteException;
}

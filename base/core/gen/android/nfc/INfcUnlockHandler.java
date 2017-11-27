/*___Generated_by_IDEA___*/

/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /media/matthew/Android-studio/OTOSOURCECODE/base/core/java/android/nfc/INfcUnlockHandler.aidl
 */
package android.nfc;
/**
 * @hide
 */
public interface INfcUnlockHandler extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.nfc.INfcUnlockHandler
{
private static final java.lang.String DESCRIPTOR = "android.nfc.INfcUnlockHandler";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.nfc.INfcUnlockHandler interface,
 * generating a proxy if needed.
 */
public static android.nfc.INfcUnlockHandler asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.nfc.INfcUnlockHandler))) {
return ((android.nfc.INfcUnlockHandler)iin);
}
return new android.nfc.INfcUnlockHandler.Stub.Proxy(obj);
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
case TRANSACTION_onUnlockAttempted:
{
data.enforceInterface(DESCRIPTOR);
android.nfc.Tag _arg0;
if ((0!=data.readInt())) {
_arg0 = android.nfc.Tag.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
boolean _result = this.onUnlockAttempted(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.nfc.INfcUnlockHandler
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
@Override public boolean onUnlockAttempted(android.nfc.Tag tag) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((tag!=null)) {
_data.writeInt(1);
tag.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_onUnlockAttempted, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
}
static final int TRANSACTION_onUnlockAttempted = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
}
public boolean onUnlockAttempted(android.nfc.Tag tag) throws android.os.RemoteException;
}

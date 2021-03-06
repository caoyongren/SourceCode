/*___Generated_by_IDEA___*/

/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /media/matthew/Android-studio/OTOSOURCECODE/base/core/java/android/os/storage/IObbActionListener.aidl
 */
package android.os.storage;
/**
 * Callback class for receiving events from StorageManagerService about Opaque Binary
 * Blobs (OBBs).
 *
 * Don't change the existing transaction Ids as they could be used in the native code.
 * When adding a new method, assign the next available transaction id.
 *
 * @hide - Applications should use StorageManager to interact with OBBs.
 */
public interface IObbActionListener extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.os.storage.IObbActionListener
{
private static final java.lang.String DESCRIPTOR = "android.os.storage.IObbActionListener";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.os.storage.IObbActionListener interface,
 * generating a proxy if needed.
 */
public static android.os.storage.IObbActionListener asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.os.storage.IObbActionListener))) {
return ((android.os.storage.IObbActionListener)iin);
}
return new android.os.storage.IObbActionListener.Stub.Proxy(obj);
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
case TRANSACTION_onObbResult:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _arg1;
_arg1 = data.readInt();
int _arg2;
_arg2 = data.readInt();
this.onObbResult(_arg0, _arg1, _arg2);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.os.storage.IObbActionListener
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
/**
     * Return from an OBB action result.
     *
     * @param filename the path to the OBB the operation was performed on
     * @param nonce identifier that is meaningful to the receiver
     * @param status status code as defined in {@link OnObbStateChangeListener}
     */
@Override public void onObbResult(java.lang.String filename, int nonce, int status) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(filename);
_data.writeInt(nonce);
_data.writeInt(status);
mRemote.transact(Stub.TRANSACTION_onObbResult, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
}
static final int TRANSACTION_onObbResult = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
}
/**
     * Return from an OBB action result.
     *
     * @param filename the path to the OBB the operation was performed on
     * @param nonce identifier that is meaningful to the receiver
     * @param status status code as defined in {@link OnObbStateChangeListener}
     */
public void onObbResult(java.lang.String filename, int nonce, int status) throws android.os.RemoteException;
}

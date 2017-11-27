/*___Generated_by_IDEA___*/

/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /media/matthew/Android-studio/OTOSOURCECODE/base/core/java/android/app/IUidObserver.aidl
 */
package android.app;
/** {@hide} */
public interface IUidObserver extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.app.IUidObserver
{
private static final java.lang.String DESCRIPTOR = "android.app.IUidObserver";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.app.IUidObserver interface,
 * generating a proxy if needed.
 */
public static android.app.IUidObserver asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.app.IUidObserver))) {
return ((android.app.IUidObserver)iin);
}
return new android.app.IUidObserver.Stub.Proxy(obj);
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
case TRANSACTION_onUidStateChanged:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
long _arg2;
_arg2 = data.readLong();
this.onUidStateChanged(_arg0, _arg1, _arg2);
return true;
}
case TRANSACTION_onUidGone:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
boolean _arg1;
_arg1 = (0!=data.readInt());
this.onUidGone(_arg0, _arg1);
return true;
}
case TRANSACTION_onUidActive:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.onUidActive(_arg0);
return true;
}
case TRANSACTION_onUidIdle:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
boolean _arg1;
_arg1 = (0!=data.readInt());
this.onUidIdle(_arg0, _arg1);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.app.IUidObserver
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
     * General report of a state change of an uid.
     *
     * @param uid The uid for which the state change is being reported.
     * @param procState The updated process state for the uid.
     * @param procStateSeq The sequence no. associated with process state change of the uid,
     *                     see UidRecord.procStateSeq for details.
     */
@Override public void onUidStateChanged(int uid, int procState, long procStateSeq) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(uid);
_data.writeInt(procState);
_data.writeLong(procStateSeq);
mRemote.transact(Stub.TRANSACTION_onUidStateChanged, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
/**
     * Report that there are no longer any processes running for a uid.
     */
@Override public void onUidGone(int uid, boolean disabled) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(uid);
_data.writeInt(((disabled)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_onUidGone, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
/**
     * Report that a uid is now active (no longer idle).
     */
@Override public void onUidActive(int uid) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(uid);
mRemote.transact(Stub.TRANSACTION_onUidActive, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
/**
     * Report that a uid is idle -- it has either been running in the background for
     * a sufficient period of time, or all of its processes have gone away.
     */
@Override public void onUidIdle(int uid, boolean disabled) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(uid);
_data.writeInt(((disabled)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_onUidIdle, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
}
static final int TRANSACTION_onUidStateChanged = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_onUidGone = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_onUidActive = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_onUidIdle = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
}
/**
     * General report of a state change of an uid.
     *
     * @param uid The uid for which the state change is being reported.
     * @param procState The updated process state for the uid.
     * @param procStateSeq The sequence no. associated with process state change of the uid,
     *                     see UidRecord.procStateSeq for details.
     */
public void onUidStateChanged(int uid, int procState, long procStateSeq) throws android.os.RemoteException;
/**
     * Report that there are no longer any processes running for a uid.
     */
public void onUidGone(int uid, boolean disabled) throws android.os.RemoteException;
/**
     * Report that a uid is now active (no longer idle).
     */
public void onUidActive(int uid) throws android.os.RemoteException;
/**
     * Report that a uid is idle -- it has either been running in the background for
     * a sufficient period of time, or all of its processes have gone away.
     */
public void onUidIdle(int uid, boolean disabled) throws android.os.RemoteException;
}

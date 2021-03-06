/*___Generated_by_IDEA___*/

/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /media/matthew/Android-studio/OTOSOURCECODE/base/core/java/android/app/IWallpaperManager.aidl
 */
package android.app;
/** @hide */
public interface IWallpaperManager extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.app.IWallpaperManager
{
private static final java.lang.String DESCRIPTOR = "android.app.IWallpaperManager";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.app.IWallpaperManager interface,
 * generating a proxy if needed.
 */
public static android.app.IWallpaperManager asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.app.IWallpaperManager))) {
return ((android.app.IWallpaperManager)iin);
}
return new android.app.IWallpaperManager.Stub.Proxy(obj);
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
case TRANSACTION_setWallpaper:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String _arg1;
_arg1 = data.readString();
android.graphics.Rect _arg2;
if ((0!=data.readInt())) {
_arg2 = android.graphics.Rect.CREATOR.createFromParcel(data);
}
else {
_arg2 = null;
}
boolean _arg3;
_arg3 = (0!=data.readInt());
android.os.Bundle _arg4;
_arg4 = new android.os.Bundle();
int _arg5;
_arg5 = data.readInt();
android.app.IWallpaperManagerCallback _arg6;
_arg6 = android.app.IWallpaperManagerCallback.Stub.asInterface(data.readStrongBinder());
int _arg7;
_arg7 = data.readInt();
android.os.ParcelFileDescriptor _result = this.setWallpaper(_arg0, _arg1, _arg2, _arg3, _arg4, _arg5, _arg6, _arg7);
reply.writeNoException();
if ((_result!=null)) {
reply.writeInt(1);
_result.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
}
else {
reply.writeInt(0);
}
if ((_arg4!=null)) {
reply.writeInt(1);
_arg4.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
}
else {
reply.writeInt(0);
}
return true;
}
case TRANSACTION_setWallpaperComponentChecked:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
java.lang.String _arg1;
_arg1 = data.readString();
int _arg2;
_arg2 = data.readInt();
this.setWallpaperComponentChecked(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_setWallpaperComponent:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
this.setWallpaperComponent(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_getWallpaper:
{
data.enforceInterface(DESCRIPTOR);
android.app.IWallpaperManagerCallback _arg0;
_arg0 = android.app.IWallpaperManagerCallback.Stub.asInterface(data.readStrongBinder());
int _arg1;
_arg1 = data.readInt();
android.os.Bundle _arg2;
_arg2 = new android.os.Bundle();
int _arg3;
_arg3 = data.readInt();
android.os.ParcelFileDescriptor _result = this.getWallpaper(_arg0, _arg1, _arg2, _arg3);
reply.writeNoException();
if ((_result!=null)) {
reply.writeInt(1);
_result.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
}
else {
reply.writeInt(0);
}
if ((_arg2!=null)) {
reply.writeInt(1);
_arg2.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
}
else {
reply.writeInt(0);
}
return true;
}
case TRANSACTION_getWallpaperIdForUser:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
int _result = this.getWallpaperIdForUser(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_getWallpaperInfo:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
android.app.WallpaperInfo _result = this.getWallpaperInfo(_arg0);
reply.writeNoException();
if ((_result!=null)) {
reply.writeInt(1);
_result.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
}
else {
reply.writeInt(0);
}
return true;
}
case TRANSACTION_clearWallpaper:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _arg1;
_arg1 = data.readInt();
int _arg2;
_arg2 = data.readInt();
this.clearWallpaper(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_hasNamedWallpaper:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
boolean _result = this.hasNamedWallpaper(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_setDimensionHints:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
java.lang.String _arg2;
_arg2 = data.readString();
this.setDimensionHints(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_getWidthHint:
{
data.enforceInterface(DESCRIPTOR);
int _result = this.getWidthHint();
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_getHeightHint:
{
data.enforceInterface(DESCRIPTOR);
int _result = this.getHeightHint();
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_setDisplayPadding:
{
data.enforceInterface(DESCRIPTOR);
android.graphics.Rect _arg0;
if ((0!=data.readInt())) {
_arg0 = android.graphics.Rect.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
java.lang.String _arg1;
_arg1 = data.readString();
this.setDisplayPadding(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_getName:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _result = this.getName();
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_settingsRestored:
{
data.enforceInterface(DESCRIPTOR);
this.settingsRestored();
reply.writeNoException();
return true;
}
case TRANSACTION_isWallpaperSupported:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
boolean _result = this.isWallpaperSupported(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_isSetWallpaperAllowed:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
boolean _result = this.isSetWallpaperAllowed(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_isWallpaperBackupEligible:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
boolean _result = this.isWallpaperBackupEligible(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_setLockWallpaperCallback:
{
data.enforceInterface(DESCRIPTOR);
android.app.IWallpaperManagerCallback _arg0;
_arg0 = android.app.IWallpaperManagerCallback.Stub.asInterface(data.readStrongBinder());
boolean _result = this.setLockWallpaperCallback(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.app.IWallpaperManager
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
     * Set the wallpaper for the current user.
     *
     * If 'extras' is non-null, on successful return it will contain:
     *   EXTRA_SET_WALLPAPER_ID : integer ID that the new wallpaper will have
     *
     * 'which' is some combination of:
     *   FLAG_SET_SYSTEM
     *   FLAG_SET_LOCK
     *
     * A 'null' cropHint rectangle is explicitly permitted as a sentinel for "whatever
     * the source image's bounding rect is."
     *
     * The completion callback's "onWallpaperChanged()" method is invoked when the
     * new wallpaper content is ready to display.
     */
@Override public android.os.ParcelFileDescriptor setWallpaper(java.lang.String name, java.lang.String callingPackage, android.graphics.Rect cropHint, boolean allowBackup, android.os.Bundle extras, int which, android.app.IWallpaperManagerCallback completion, int userId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.os.ParcelFileDescriptor _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(name);
_data.writeString(callingPackage);
if ((cropHint!=null)) {
_data.writeInt(1);
cropHint.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(((allowBackup)?(1):(0)));
_data.writeInt(which);
_data.writeStrongBinder((((completion!=null))?(completion.asBinder()):(null)));
_data.writeInt(userId);
mRemote.transact(Stub.TRANSACTION_setWallpaper, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.os.ParcelFileDescriptor.CREATOR.createFromParcel(_reply);
}
else {
_result = null;
}
if ((0!=_reply.readInt())) {
extras.readFromParcel(_reply);
}
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Set the live wallpaper. This only affects the system wallpaper.
     */
@Override public void setWallpaperComponentChecked(android.content.ComponentName name, java.lang.String callingPackage, int userId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((name!=null)) {
_data.writeInt(1);
name.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeString(callingPackage);
_data.writeInt(userId);
mRemote.transact(Stub.TRANSACTION_setWallpaperComponentChecked, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Set the live wallpaper. This only affects the system wallpaper.
     */
@Override public void setWallpaperComponent(android.content.ComponentName name) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((name!=null)) {
_data.writeInt(1);
name.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_setWallpaperComponent, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Get the wallpaper for a given user.
     */
@Override public android.os.ParcelFileDescriptor getWallpaper(android.app.IWallpaperManagerCallback cb, int which, android.os.Bundle outParams, int userId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.os.ParcelFileDescriptor _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((cb!=null))?(cb.asBinder()):(null)));
_data.writeInt(which);
_data.writeInt(userId);
mRemote.transact(Stub.TRANSACTION_getWallpaper, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.os.ParcelFileDescriptor.CREATOR.createFromParcel(_reply);
}
else {
_result = null;
}
if ((0!=_reply.readInt())) {
outParams.readFromParcel(_reply);
}
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int getWallpaperIdForUser(int which, int userId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(which);
_data.writeInt(userId);
mRemote.transact(Stub.TRANSACTION_getWallpaperIdForUser, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * If the current system wallpaper is a live wallpaper component, return the
     * information about that wallpaper.  Otherwise, if it is a static image,
     * simply return null.
     */
@Override public android.app.WallpaperInfo getWallpaperInfo(int userId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.app.WallpaperInfo _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(userId);
mRemote.transact(Stub.TRANSACTION_getWallpaperInfo, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.app.WallpaperInfo.CREATOR.createFromParcel(_reply);
}
else {
_result = null;
}
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Clear the system wallpaper.
     */
@Override public void clearWallpaper(java.lang.String callingPackage, int which, int userId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(callingPackage);
_data.writeInt(which);
_data.writeInt(userId);
mRemote.transact(Stub.TRANSACTION_clearWallpaper, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Return whether the current system wallpaper has the given name.
     */
@Override public boolean hasNamedWallpaper(java.lang.String name) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(name);
mRemote.transact(Stub.TRANSACTION_hasNamedWallpaper, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Sets the dimension hint for the wallpaper. These hints indicate the desired
     * minimum width and height for the wallpaper.
     */
@Override public void setDimensionHints(int width, int height, java.lang.String callingPackage) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(width);
_data.writeInt(height);
_data.writeString(callingPackage);
mRemote.transact(Stub.TRANSACTION_setDimensionHints, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public int getWidthHint() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getWidthHint, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int getHeightHint() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getHeightHint, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Sets extra padding that we would like the wallpaper to have outside of the display.
     */
@Override public void setDisplayPadding(android.graphics.Rect padding, java.lang.String callingPackage) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((padding!=null)) {
_data.writeInt(1);
padding.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeString(callingPackage);
mRemote.transact(Stub.TRANSACTION_setDisplayPadding, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public java.lang.String getName() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getName, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Informs the service that wallpaper settings have been restored. Private API.
     */
@Override public void settingsRestored() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_settingsRestored, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Check whether wallpapers are supported for the calling user.
     */
@Override public boolean isWallpaperSupported(java.lang.String callingPackage) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(callingPackage);
mRemote.transact(Stub.TRANSACTION_isWallpaperSupported, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Check whether setting of wallpapers are allowed for the calling user.
     */
@Override public boolean isSetWallpaperAllowed(java.lang.String callingPackage) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(callingPackage);
mRemote.transact(Stub.TRANSACTION_isSetWallpaperAllowed, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/*
     * Backup: is the current system wallpaper image eligible for off-device backup?
     */
@Override public boolean isWallpaperBackupEligible(int which, int userId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(which);
_data.writeInt(userId);
mRemote.transact(Stub.TRANSACTION_isWallpaperBackupEligible, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/*
     * Keyguard: register a callback for being notified that lock-state relevant
     * wallpaper content has changed.
     */
@Override public boolean setLockWallpaperCallback(android.app.IWallpaperManagerCallback cb) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((cb!=null))?(cb.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_setLockWallpaperCallback, _data, _reply, 0);
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
static final int TRANSACTION_setWallpaper = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_setWallpaperComponentChecked = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_setWallpaperComponent = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_getWallpaper = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_getWallpaperIdForUser = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_getWallpaperInfo = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_clearWallpaper = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
static final int TRANSACTION_hasNamedWallpaper = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
static final int TRANSACTION_setDimensionHints = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
static final int TRANSACTION_getWidthHint = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
static final int TRANSACTION_getHeightHint = (android.os.IBinder.FIRST_CALL_TRANSACTION + 10);
static final int TRANSACTION_setDisplayPadding = (android.os.IBinder.FIRST_CALL_TRANSACTION + 11);
static final int TRANSACTION_getName = (android.os.IBinder.FIRST_CALL_TRANSACTION + 12);
static final int TRANSACTION_settingsRestored = (android.os.IBinder.FIRST_CALL_TRANSACTION + 13);
static final int TRANSACTION_isWallpaperSupported = (android.os.IBinder.FIRST_CALL_TRANSACTION + 14);
static final int TRANSACTION_isSetWallpaperAllowed = (android.os.IBinder.FIRST_CALL_TRANSACTION + 15);
static final int TRANSACTION_isWallpaperBackupEligible = (android.os.IBinder.FIRST_CALL_TRANSACTION + 16);
static final int TRANSACTION_setLockWallpaperCallback = (android.os.IBinder.FIRST_CALL_TRANSACTION + 17);
}
/**
     * Set the wallpaper for the current user.
     *
     * If 'extras' is non-null, on successful return it will contain:
     *   EXTRA_SET_WALLPAPER_ID : integer ID that the new wallpaper will have
     *
     * 'which' is some combination of:
     *   FLAG_SET_SYSTEM
     *   FLAG_SET_LOCK
     *
     * A 'null' cropHint rectangle is explicitly permitted as a sentinel for "whatever
     * the source image's bounding rect is."
     *
     * The completion callback's "onWallpaperChanged()" method is invoked when the
     * new wallpaper content is ready to display.
     */
public android.os.ParcelFileDescriptor setWallpaper(java.lang.String name, java.lang.String callingPackage, android.graphics.Rect cropHint, boolean allowBackup, android.os.Bundle extras, int which, android.app.IWallpaperManagerCallback completion, int userId) throws android.os.RemoteException;
/**
     * Set the live wallpaper. This only affects the system wallpaper.
     */
public void setWallpaperComponentChecked(android.content.ComponentName name, java.lang.String callingPackage, int userId) throws android.os.RemoteException;
/**
     * Set the live wallpaper. This only affects the system wallpaper.
     */
public void setWallpaperComponent(android.content.ComponentName name) throws android.os.RemoteException;
/**
     * Get the wallpaper for a given user.
     */
public android.os.ParcelFileDescriptor getWallpaper(android.app.IWallpaperManagerCallback cb, int which, android.os.Bundle outParams, int userId) throws android.os.RemoteException;
public int getWallpaperIdForUser(int which, int userId) throws android.os.RemoteException;
/**
     * If the current system wallpaper is a live wallpaper component, return the
     * information about that wallpaper.  Otherwise, if it is a static image,
     * simply return null.
     */
public android.app.WallpaperInfo getWallpaperInfo(int userId) throws android.os.RemoteException;
/**
     * Clear the system wallpaper.
     */
public void clearWallpaper(java.lang.String callingPackage, int which, int userId) throws android.os.RemoteException;
/**
     * Return whether the current system wallpaper has the given name.
     */
public boolean hasNamedWallpaper(java.lang.String name) throws android.os.RemoteException;
/**
     * Sets the dimension hint for the wallpaper. These hints indicate the desired
     * minimum width and height for the wallpaper.
     */
public void setDimensionHints(int width, int height, java.lang.String callingPackage) throws android.os.RemoteException;
public int getWidthHint() throws android.os.RemoteException;
public int getHeightHint() throws android.os.RemoteException;
/**
     * Sets extra padding that we would like the wallpaper to have outside of the display.
     */
public void setDisplayPadding(android.graphics.Rect padding, java.lang.String callingPackage) throws android.os.RemoteException;
public java.lang.String getName() throws android.os.RemoteException;
/**
     * Informs the service that wallpaper settings have been restored. Private API.
     */
public void settingsRestored() throws android.os.RemoteException;
/**
     * Check whether wallpapers are supported for the calling user.
     */
public boolean isWallpaperSupported(java.lang.String callingPackage) throws android.os.RemoteException;
/**
     * Check whether setting of wallpapers are allowed for the calling user.
     */
public boolean isSetWallpaperAllowed(java.lang.String callingPackage) throws android.os.RemoteException;
/*
     * Backup: is the current system wallpaper image eligible for off-device backup?
     */
public boolean isWallpaperBackupEligible(int which, int userId) throws android.os.RemoteException;
/*
     * Keyguard: register a callback for being notified that lock-state relevant
     * wallpaper content has changed.
     */
public boolean setLockWallpaperCallback(android.app.IWallpaperManagerCallback cb) throws android.os.RemoteException;
}

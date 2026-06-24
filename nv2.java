import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.cast.CastDevice;

public final class nv2 extends he0 {
  public static final rp0 D = new rp0("CastClientImplCxless", null);
  
  public final CastDevice A;
  
  public final Bundle B;
  
  public final String C;
  
  public nv2(Context paramContext, Looper paramLooper, m2 paramm2, CastDevice paramCastDevice, Bundle paramBundle, String paramString, qa2 paramqa21, qa2 paramqa22) {
    super(paramContext, paramLooper, 10, paramm2, paramqa21, paramqa22, 0);
    this.A = paramCastDevice;
    this.B = paramBundle;
    this.C = paramString;
  }
  
  public final void b() {
    try {
      qd2 qd2 = (qd2)i();
      n5 n5 = g92.g0();
      Parcel parcel = qd2.o();
      mh2.b(parcel, n5);
      qd2.p0(parcel, 1);
    } catch (RemoteException remoteException) {
      D.a((Exception)remoteException, "Error while disconnecting the controller interface", new Object[0]);
    } catch (IllegalStateException illegalStateException) {
    
    } finally {
      Exception exception;
    } 
    super.b();
  }
  
  public final u70[] d() {
    return g92.m;
  }
  
  public final Bundle f() {
    Bundle bundle1 = new Bundle();
    D.b("getRemoteService()", new Object[0]);
    CastDevice castDevice = this.A;
    castDevice.getClass();
    bundle1.putParcelable("com.google.android.gms.cast.EXTRA_CAST_DEVICE", (Parcelable)castDevice);
    bundle1.putLong("com.google.android.gms.cast.EXTRA_CAST_FLAGS", 0L);
    bundle1.putString("connectionless_client_record_id", this.C);
    Bundle bundle2 = this.B;
    if (bundle2 != null)
      bundle1.putAll(bundle2); 
    return bundle1;
  }
  
  public final int g() {
    return 19390000;
  }
  
  public final String j() {
    return "com.google.android.gms.cast.internal.ICastDeviceController";
  }
  
  public final String k() {
    return "com.google.android.gms.cast.service.BIND_CAST_DEVICE_CONTROLLER_SERVICE";
  }
  
  public final boolean r() {
    return true;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\nv2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
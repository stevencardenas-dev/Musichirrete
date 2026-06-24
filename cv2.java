import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.common.internal.BinderWrapper;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicLong;

public final class cv2 extends he0 {
  public static final rp0 S = new rp0("CastClientImpl", null);
  
  public static final Object T = new Object();
  
  public static final Object U = new Object();
  
  public q8 A;
  
  public final CastDevice B;
  
  public final fu2 C;
  
  public final HashMap D;
  
  public final Bundle E;
  
  public cu2 F;
  
  public String G;
  
  public boolean H;
  
  public boolean I;
  
  public boolean J;
  
  public double K;
  
  public oe2 L;
  
  public int M;
  
  public int N;
  
  public String O;
  
  public String P;
  
  public Bundle Q;
  
  public final HashMap R;
  
  public cv2(Context paramContext, Looper paramLooper, m2 paramm2, CastDevice paramCastDevice, fu2 paramfu2, Bundle paramBundle, qa2 paramqa21, qa2 paramqa22) {
    super(paramContext, paramLooper, 10, paramm2, paramqa21, paramqa22, 0);
    this.B = paramCastDevice;
    this.C = paramfu2;
    this.E = paramBundle;
    this.D = new HashMap<Object, Object>();
    new AtomicLong(0L);
    this.R = new HashMap<Object, Object>();
    this.M = -1;
    this.N = -1;
    this.A = null;
    this.G = null;
    this.K = 0.0D;
    u();
    this.H = false;
    this.L = null;
    u();
  }
  
  public final void b() {
    cu2 cu21 = this.F;
    boolean bool = m();
    rp0 rp01 = S;
    rp01.b("disconnect(); ServiceListener=%s, isConnected=%b", new Object[] { cu21, Boolean.valueOf(bool) });
    cu2 cu22 = this.F;
    cu21 = null;
    this.F = null;
    if (cu22 != null) {
      cv2 cv21;
      cv2 cv22 = cu22.g.getAndSet(null);
      if (cv22 != null) {
        cv22.M = -1;
        cv22.N = -1;
        cv22.A = null;
        cv22.G = null;
        cv22.K = 0.0D;
        cv22.u();
        cv22.H = false;
        cv22.L = null;
        cv21 = cv22;
      } 
      if (cv21 != null) {
        w();
        try {
          qd2 qd2 = (qd2)i();
          n5 n5 = g92.g0();
          Parcel parcel = qd2.o();
          mh2.b(parcel, n5);
          qd2.p0(parcel, 1);
        } catch (RemoteException remoteException) {
          rp01.a((Exception)remoteException, "Error while disconnecting the controller interface", new Object[0]);
        } catch (IllegalStateException illegalStateException) {
        
        } finally {}
        super.b();
        return;
      } 
    } 
    rp01.b("already disposed, so short-circuiting", new Object[0]);
  }
  
  public final Bundle e() {
    Bundle bundle = this.Q;
    if (bundle != null) {
      this.Q = null;
      return bundle;
    } 
    return null;
  }
  
  public final Bundle f() {
    Bundle bundle1 = new Bundle();
    String str2 = this.O;
    String str3 = this.P;
    S.b("getRemoteService(): mLastApplicationId=%s, mLastSessionId=%s", new Object[] { str2, str3 });
    CastDevice castDevice = this.B;
    castDevice.getClass();
    bundle1.putParcelable("com.google.android.gms.cast.EXTRA_CAST_DEVICE", (Parcelable)castDevice);
    bundle1.putLong("com.google.android.gms.cast.EXTRA_CAST_FLAGS", 0L);
    Bundle bundle2 = this.E;
    if (bundle2 != null)
      bundle1.putAll(bundle2); 
    cu2 cu21 = new cu2(this);
    this.F = cu21;
    bundle1.putParcelable("listener", (Parcelable)new BinderWrapper(cu21));
    String str1 = this.O;
    if (str1 != null) {
      bundle1.putString("last_application_id", str1);
      str1 = this.P;
      if (str1 != null)
        bundle1.putString("last_session_id", str1); 
    } 
    return bundle1;
  }
  
  public final int g() {
    return 12800000;
  }
  
  public final String j() {
    return "com.google.android.gms.cast.internal.ICastDeviceController";
  }
  
  public final String k() {
    return "com.google.android.gms.cast.service.BIND_CAST_DEVICE_CONTROLLER_SERVICE";
  }
  
  public final void o(sp paramsp) {
    super.o(paramsp);
    w();
  }
  
  public final void p(int paramInt1, IBinder paramIBinder, Bundle paramBundle, int paramInt2) {
    S.b("in onPostInitHandler; statusCode=%d", new Object[] { Integer.valueOf(paramInt1) });
    if (paramInt1 == 0 || paramInt1 == 2300) {
      this.I = true;
      this.J = true;
    } 
    int i = paramInt1;
    if (paramInt1 == 2300) {
      Bundle bundle = new Bundle();
      this.Q = bundle;
      bundle.putBoolean("com.google.android.gms.cast.EXTRA_APP_NO_LONGER_RUNNING", true);
      i = 0;
    } 
    super.p(i, paramIBinder, paramBundle, paramInt2);
  }
  
  public final void u() {
    CastDevice castDevice = this.B;
    n21.n("device should not be null", castDevice);
    qp0 qp0 = castDevice.k;
    if (!qp0.l(2048) && qp0.l(4) && !qp0.l(1))
      "Chromecast Audio".equals(castDevice.g); 
  }
  
  public final void v(long paramLong) {
    HashMap hashMap = this.R;
    /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{java/util/HashMap}, name=null} */
    try {
      if (hashMap.remove(Long.valueOf(paramLong)) == null) {
        /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/util/HashMap}, name=null} */
        return;
      } 
    } finally {
      Exception exception;
    } 
    ClassCastException classCastException = new ClassCastException();
    this();
    throw classCastException;
  }
  
  public final void w() {
    S.b("removing all MessageReceivedCallbacks", new Object[0]);
    synchronized (this.D) {
      null.clear();
      return;
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\cv2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
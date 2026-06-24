import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.cast.CastDevice;

public final class fp2 {
  public static final rp0 i = new rp0("ApplicationAnalytics", null);
  
  public final hn2 a;
  
  public final hf2 b;
  
  public final sp2 c;
  
  public final yi1 d;
  
  public final cl e;
  
  public final SharedPreferences f;
  
  public op2 g;
  
  public oj h;
  
  public fp2(SharedPreferences paramSharedPreferences, hn2 paramhn2, hf2 paramhf2, Bundle paramBundle, String paramString) {
    this.f = paramSharedPreferences;
    this.a = paramhn2;
    this.b = paramhf2;
    this.c = new sp2(paramString, paramBundle);
    this.e = new cl(Looper.getMainLooper(), 6);
    this.d = new yi1(23, this);
  }
  
  public final void a() {
    op2 op21 = this.g;
    op21.getClass();
    SharedPreferences sharedPreferences = this.f;
    if (sharedPreferences == null)
      return; 
    op2.q.b("Save the ApplicationAnalyticsSession to SharedPreferences %s", new Object[] { sharedPreferences });
    SharedPreferences.Editor editor = sharedPreferences.edit();
    editor.putString("application_id", op21.b);
    editor.putString("receiver_metrics_id", op21.c);
    editor.putLong("analytics_session_id", op21.d);
    editor.putInt("event_sequence_number", op21.e);
    editor.putString("receiver_session_id", op21.f);
    editor.putInt("device_capabilities", op21.g);
    editor.putString("device_model_name", op21.h);
    editor.putString("manufacturer", op21.i);
    editor.putString("product_name", op21.j);
    editor.putString("build_type", op21.k);
    editor.putString("cast_build_version", op21.l);
    editor.putString("system_build_number", op21.m);
    editor.putInt("device_category", op21.n);
    editor.putInt("analytics_session_start_type", op21.p);
    editor.putBoolean("is_output_switcher_enabled", op21.o);
    editor.apply();
  }
  
  public final void b(int paramInt) {
    i.b("log session ended with error = %d", new Object[] { Integer.valueOf(paramInt) });
    e();
    oq2 oq2 = this.c.a(this.g, paramInt);
    this.a.a(oq2, 228);
    this.e.removeCallbacks(this.d);
    this.g = null;
  }
  
  public final void c() {
    cl cl1 = this.e;
    n21.m(cl1);
    yi1 yi11 = this.d;
    n21.m(yi11);
    cl1.postDelayed(yi11, 300000L);
  }
  
  public final void d() {
    boolean bool;
    CastDevice castDevice;
    rp0 rp01 = i;
    int i = 0;
    rp01.b("Create a new ApplicationAnalyticsSession based on CastSession", new Object[0]);
    op2 op23 = new op2(this.b);
    op2.r++;
    this.g = op23;
    oj oj3 = this.h;
    if (oj3 != null && oj3.g.q0()) {
      bool = true;
    } else {
      bool = false;
    } 
    op23.o = bool;
    op2 op21 = this.g;
    n21.m(op21);
    rp0 rp02 = kj.k;
    n21.j();
    kj kj = kj.m;
    n21.m(kj);
    n21.j();
    op21.b = kj.e.b;
    oj oj2 = this.h;
    if (oj2 == null) {
      oj2 = null;
    } else {
      n21.j();
      castDevice = oj2.k;
    } 
    if (castDevice != null)
      f(castDevice); 
    op2 op22 = this.g;
    n21.m(op22);
    oj oj1 = this.h;
    if (oj1 != null)
      i = oj1.g(); 
    op22.p = i;
    n21.m(this.g);
  }
  
  public final void e() {
    if (g()) {
      oj oj1 = this.h;
      if (oj1 != null) {
        n21.j();
        CastDevice castDevice = oj1.k;
      } else {
        oj1 = null;
      } 
      if (oj1 != null && !TextUtils.equals(this.g.c, ((CastDevice)oj1).n))
        f((CastDevice)oj1); 
      n21.m(this.g);
      return;
    } 
    rp0 rp01 = i;
    Log.w(rp01.a, rp01.c("The analyticsSession should not be null for logging. Create a dummy one.", new Object[0]));
    d();
  }
  
  public final void f(CastDevice paramCastDevice) {
    op2 op21 = this.g;
    if (op21 != null) {
      op21.c = paramCastDevice.n;
      op21.g = paramCastDevice.k.b;
      op21.h = paramCastDevice.g;
      op21.n = paramCastDevice.i();
      ec2 ec2 = paramCastDevice.f();
      if (ec2 != null) {
        String str2 = ec2.f;
        if (str2 != null)
          op21.i = str2; 
        str2 = ec2.g;
        if (str2 != null)
          op21.j = str2; 
        str2 = ec2.h;
        if (str2 != null)
          op21.k = str2; 
        str2 = ec2.i;
        if (str2 != null)
          op21.l = str2; 
        String str1 = ec2.j;
        if (str1 != null)
          op21.m = str1; 
      } 
    } 
  }
  
  public final boolean g() {
    rp0 rp01 = i;
    if (this.g == null) {
      rp01.b("The analytics session is null when matching with application ID.", new Object[0]);
      return false;
    } 
    rp0 rp02 = kj.k;
    n21.j();
    kj kj = kj.m;
    n21.m(kj);
    n21.j();
    String str = kj.e.b;
    if (str != null) {
      String str1 = this.g.b;
      if (str1 != null && TextUtils.equals(str1, str)) {
        n21.m(this.g);
        return true;
      } 
    } 
    rp01.b("The analytics session doesn't match the application ID %s", new Object[] { str });
    return false;
  }
  
  public final boolean h(String paramString) {
    if (!g())
      return false; 
    n21.m(this.g);
    if (paramString != null) {
      String str = this.g.f;
      if (str != null && TextUtils.equals(str, paramString))
        return true; 
    } 
    i.b("The analytics session doesn't match the receiver session ID %s.", new Object[] { paramString });
    return false;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\fp2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
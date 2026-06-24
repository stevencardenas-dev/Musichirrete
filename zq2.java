import android.content.SharedPreferences;
import android.os.Looper;
import java.util.HashSet;
import java.util.Iterator;

public final class zq2 {
  public static final rp0 i = new rp0("FeatureUsageAnalytics", null);
  
  public static final String j = "22.3.1";
  
  public static zq2 k;
  
  public final hn2 a;
  
  public final SharedPreferences b;
  
  public final String c;
  
  public final yi1 d;
  
  public final cl e;
  
  public final HashSet f;
  
  public final HashSet g;
  
  public long h;
  
  public zq2(SharedPreferences paramSharedPreferences, hn2 paramhn2, String paramString) {
    this.b = paramSharedPreferences;
    this.a = paramhn2;
    this.c = paramString;
    this.f = new HashSet();
    this.g = new HashSet();
    this.e = new cl(Looper.getMainLooper(), 6);
    this.d = new yi1(26, this);
  }
  
  public static void a(wp2 paramwp2) {
    if (hn2.k) {
      zq2 zq21 = k;
      if (zq21 != null) {
        SharedPreferences sharedPreferences = zq21.b;
        String str2 = Integer.toString(paramwp2.b);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        String str1 = x41.k("feature_usage_timestamp_reported_feature_", str2);
        if (!sharedPreferences.contains(str1))
          str1 = x41.k("feature_usage_timestamp_detected_feature_", str2); 
        editor.putLong(str1, System.currentTimeMillis()).apply();
        zq21.f.add(paramwp2);
        zq21.e.post(zq21.d);
      } 
    } 
  }
  
  public static wp2 c(String paramString) {
    try {
      switch (Integer.parseInt(paramString)) {
        default:
          return null;
        case 57:
          return wp2.i0;
        case 56:
          return wp2.h0;
        case 55:
          return wp2.g0;
        case 54:
          return wp2.f0;
        case 53:
          return wp2.e0;
        case 52:
          return wp2.d0;
        case 51:
          return wp2.c0;
        case 50:
          return wp2.b0;
        case 49:
          return wp2.a0;
        case 48:
          return wp2.Z;
        case 47:
          return wp2.Y;
        case 46:
          return wp2.X;
        case 45:
          return wp2.W;
        case 44:
          return wp2.V;
        case 43:
          return wp2.U;
        case 42:
          return wp2.T;
        case 41:
          return wp2.S;
        case 40:
          return wp2.R;
        case 39:
          return wp2.Q;
        case 38:
          return wp2.P;
        case 37:
          return wp2.O;
        case 36:
          return wp2.N;
        case 35:
          return wp2.M;
        case 34:
          return wp2.L;
        case 33:
          return wp2.K;
        case 32:
          return wp2.J;
        case 31:
          return wp2.I;
        case 30:
          return wp2.H;
        case 29:
          return wp2.G;
        case 28:
          return wp2.F;
        case 27:
          return wp2.E;
        case 26:
          return wp2.D;
        case 25:
          return wp2.C;
        case 24:
          return wp2.B;
        case 23:
          return wp2.A;
        case 22:
          return wp2.z;
        case 21:
          return wp2.y;
        case 20:
          return wp2.x;
        case 19:
          return wp2.w;
        case 18:
          return wp2.v;
        case 17:
          return wp2.u;
        case 16:
          return wp2.t;
        case 15:
          return wp2.s;
        case 14:
          return wp2.r;
        case 13:
          return wp2.q;
        case 12:
          return wp2.p;
        case 11:
          return wp2.o;
        case 10:
          return wp2.n;
        case 9:
          return wp2.m;
        case 8:
          return wp2.l;
        case 7:
          return wp2.k;
        case 6:
          return wp2.j;
        case 5:
          return wp2.i;
        case 4:
          return wp2.h;
        case 3:
          return wp2.g;
        case 2:
          return wp2.f;
        case 1:
          return wp2.e;
        case 0:
          break;
      } 
    } catch (NumberFormatException numberFormatException) {}
    return wp2.c;
  }
  
  public final void b(HashSet paramHashSet) {
    if (paramHashSet.isEmpty())
      return; 
    SharedPreferences.Editor editor = this.b.edit();
    Iterator<String> iterator = paramHashSet.iterator();
    while (iterator.hasNext())
      editor.remove(iterator.next()); 
    editor.apply();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\zq2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
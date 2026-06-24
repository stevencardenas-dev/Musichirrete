import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.util.SparseArray;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Calendar;
import java.util.HashMap;
import java.util.TimeZone;
import org.jaudiotagger.audio.dff.vR.CKYHNesT;

public final class sj implements uw1 {
  public final bh0 a;
  
  public final ConnectivityManager b;
  
  public final Context c;
  
  public final URL d;
  
  public final am e;
  
  public final am f;
  
  public final int g;
  
  public sj(Context paramContext, am paramam1, am paramam2) {
    mk0 mk0 = new mk0();
    ea ea = ea.a;
    mk0.a(we.class, ea);
    mk0.a(va.class, ea);
    ha ha = ha.a;
    mk0.a(np0.class, ha);
    mk0.a(cb.class, ha);
    fa fa = fa.a;
    mk0.a(wl.class, fa);
    mk0.a(wa.class, fa);
    da da = da.a;
    mk0.a(o4.class, da);
    mk0.a(ta.class, da);
    ga ga = ga.a;
    mk0.a(kp0.class, ga);
    mk0.a(bb.class, ga);
    ia ia = ia.a;
    mk0.a(s11.class, ia);
    mk0.a(eb.class, ia);
    mk0.f = true;
    this.a = new bh0(3, mk0);
    this.c = paramContext;
    this.b = (ConnectivityManager)paramContext.getSystemService("connectivity");
    this.d = b(sh.c);
    this.e = paramam2;
    this.f = paramam1;
    this.g = 130000;
  }
  
  public static URL b(String paramString) {
    try {
      return new URL(paramString);
    } catch (MalformedURLException malformedURLException) {
      throw new IllegalArgumentException(x41.k("Invalid url: ", paramString), malformedURLException);
    } 
  }
  
  public final za a(za paramza) {
    NetworkInfo networkInfo = this.b.getActiveNetworkInfo();
    m2 m2 = paramza.c();
    int i = Build.VERSION.SDK_INT;
    HashMap<String, String> hashMap = (HashMap)m2.f;
    String str = CKYHNesT.mGaXWIctJjbCC;
    if (hashMap != null) {
      hashMap.put("sdk-version", String.valueOf(i));
      m2.a("model", Build.MODEL);
      m2.a("hardware", Build.HARDWARE);
      m2.a("device", Build.DEVICE);
      m2.a("product", Build.PRODUCT);
      m2.a("os-uild", Build.ID);
      m2.a("manufacturer", Build.MANUFACTURER);
      m2.a("fingerprint", Build.FINGERPRINT);
      Calendar.getInstance();
      long l = (TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / 1000);
      hashMap = (HashMap<String, String>)m2.f;
      if (hashMap != null) {
        hashMap.put("tz-offset", String.valueOf(l));
        byte b = -1;
        if (networkInfo == null) {
          SparseArray sparseArray = r11.b;
          i = -1;
        } else {
          i = networkInfo.getType();
        } 
        hashMap = (HashMap<String, String>)m2.f;
        if (hashMap != null) {
          SparseArray sparseArray;
          hashMap.put("net-type", String.valueOf(i));
          if (networkInfo == null) {
            sparseArray = q11.b;
          } else {
            i = sparseArray.getSubtype();
            if (i == -1) {
              sparseArray = q11.b;
              i = 100;
            } else {
              if ((q11)q11.b.get(i) != null)
                HashMap hashMap2 = (HashMap)m2.f; 
              i = 0;
            } 
            HashMap hashMap1 = (HashMap)m2.f;
          } 
        } else {
          tp.f(str);
          return null;
        } 
      } else {
        tp.f(str);
        return null;
      } 
    } else {
      tp.f(str);
      return null;
    } 
    i = 0;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\sj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
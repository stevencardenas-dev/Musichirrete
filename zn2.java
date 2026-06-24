import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashSet;

public final class zn2 implements Runnable {
  public final int b;
  
  public final Object c;
  
  public final Object e;
  
  public final void run() {
    double d;
    boolean bool;
    bv2 bv2;
    cv2 cv21;
    cd2 cd2;
    ArrayList<?> arrayList1;
    String str;
    fu2 fu2;
    v90 v90;
    Bundle bundle;
    cv2 cv22;
    ArrayList<?> arrayList2;
    oe2 oe2;
    q8 q8;
    rp0 rp0;
    int i = this.b;
    boolean bool2 = true;
    boolean bool1 = true;
    switch (i) {
      default:
        bv2 = ((hc2)this.e).b;
        v90 = (v90)this.c;
        arrayList1 = v90.b;
        arrayList2 = hc2.k(v90.c);
        bundle = new Bundle();
        bundle.putInt("session_id", 0);
        bundle.putInt("status", 5);
        bundle.putInt("error_code", 0);
        if (!arrayList1.isEmpty())
          bundle.putStringArrayList("module_names", new ArrayList(arrayList1)); 
        if (!arrayList2.isEmpty())
          bundle.putStringArrayList("languages", new ArrayList(arrayList2)); 
        bundle.putLong("total_bytes_to_download", 0L);
        bundle.putLong("bytes_downloaded", 0L);
        bv2.c(tb2.b(bundle));
        return;
      case 4:
        cv21 = (cv2)this.c;
        str = ((wb2)this.e).b;
        if (!qj.c(str, cv21.G)) {
          cv21.G = str;
        } else {
          bool1 = false;
        } 
        cv2.S.b("hasChanged=%b, mFirstApplicationStatusUpdate=%b", new Object[] { Boolean.valueOf(bool1), Boolean.valueOf(cv21.I) });
        fu2 = cv21.C;
        if (fu2 != null && (bool1 || cv21.I))
          fu2.d(); 
        cv21.I = false;
        return;
      case 3:
        cv22 = (cv2)this.c;
        cd2 = (cd2)this.e;
        fu2 = cv22.C;
        q8 = cd2.f;
        oe2 = cd2.h;
        if (!qj.c(q8, cv22.A)) {
          cv22.A = q8;
          fu2.c();
        } 
        d = cd2.b;
        if (!Double.isNaN(d) && Math.abs(d - cv22.K) > 1.0E-7D) {
          cv22.K = d;
          bool1 = true;
        } else {
          bool1 = false;
        } 
        bool = cd2.c;
        if (bool != cv22.H) {
          cv22.H = bool;
          bool1 = true;
        } 
        Double.isNaN(cd2.i);
        rp0 = cv2.S;
        rp0.b("hasVolumeChanged=%b, mFirstDeviceStatusUpdate=%b", new Object[] { Boolean.valueOf(bool1), Boolean.valueOf(cv22.J) });
        if (fu2 != null && (bool1 || cv22.J))
          fu2.f(); 
        i = cd2.e;
        if (i != cv22.M) {
          cv22.M = i;
          bool1 = true;
        } else {
          bool1 = false;
        } 
        rp0.b("hasActiveInputChanged=%b, mFirstDeviceStatusUpdate=%b", new Object[] { Boolean.valueOf(bool1), Boolean.valueOf(cv22.J) });
        if (fu2 != null && (bool1 || cv22.J))
          fu2.a(); 
        i = cd2.g;
        if (i != cv22.N) {
          cv22.N = i;
          bool1 = bool2;
        } else {
          bool1 = false;
        } 
        rp0.b("hasStandbyStateChanged=%b, mFirstDeviceStatusUpdate=%b", new Object[] { Boolean.valueOf(bool1), Boolean.valueOf(cv22.J) });
        if (fu2 != null && (bool1 || cv22.J))
          fu2.e(); 
        if (!qj.c(cv22.L, oe2))
          cv22.L = oe2; 
        cv22.J = false;
        return;
      case 2:
        try {
          ((io1)this.e).b((HashSet)this.c);
        } catch (Exception exception) {
          Log.e("SplitCompat", "Failed to remove from splitcompat storage split that is already installed", exception);
        } 
        return;
      case 1:
        null = (jn2)this.e;
        synchronized (null.c) {
          ((r41)null.d).i(((du2)this.c).e());
          return;
        } 
      case 0:
        break;
    } 
    null = (jn2)this.e;
    synchronized (null.c) {
      i41 i41 = (i41)null.d;
      Exception exception = ((du2)this.c).d();
      n21.m(exception);
      i41.f(exception);
      return;
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\zn2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
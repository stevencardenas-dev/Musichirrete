import android.content.Context;
import android.os.Looper;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.accessibility.CaptioningManager;
import java.util.Locale;

public final class px {
  public String a = null;
  
  public int b = 0;
  
  public int c;
  
  public int d;
  
  public int e;
  
  public int f;
  
  public boolean g;
  
  public boolean h;
  
  public int i;
  
  public int j;
  
  public boolean k;
  
  public int l;
  
  public int m;
  
  public boolean n;
  
  public boolean o;
  
  public final SparseArray p;
  
  public final SparseBooleanArray q;
  
  public px() {
    this(false);
    b();
    this.p = new SparseArray();
    this.q = new SparseBooleanArray();
  }
  
  public px(Context paramContext) {
    this(false);
    int i = d12.a;
    if (i >= 19 && (i >= 23 || Looper.myLooper() != null)) {
      CaptioningManager captioningManager = (CaptioningManager)paramContext.getSystemService("captioning");
      if (captioningManager != null && captioningManager.isEnabled()) {
        this.b = 1088;
        Locale locale = captioningManager.getLocale();
        if (locale != null) {
          String str;
          if (i >= 21) {
            str = locale.toLanguageTag();
          } else {
            str = str.toString();
          } 
          this.a = str;
        } 
      } 
    } 
    b();
    this.p = new SparseArray();
    this.q = new SparseBooleanArray();
  }
  
  public px(boolean paramBoolean) {}
  
  public final ox a() {
    return new ox(this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.a, this.b, this.o, this.p, this.q);
  }
  
  public final void b() {
    this.c = Integer.MAX_VALUE;
    this.d = Integer.MAX_VALUE;
    this.e = Integer.MAX_VALUE;
    this.f = Integer.MAX_VALUE;
    this.g = true;
    this.h = true;
    this.i = Integer.MAX_VALUE;
    this.j = Integer.MAX_VALUE;
    this.k = true;
    this.l = Integer.MAX_VALUE;
    this.m = Integer.MAX_VALUE;
    this.n = true;
    this.o = true;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\px.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
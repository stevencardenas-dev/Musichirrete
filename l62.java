import android.graphics.Rect;
import java.util.List;

public abstract class l62 {
  public final x62 a;
  
  public fi0[] b;
  
  public final Rect[][] c = new Rect[10][];
  
  public final Rect[][] d = new Rect[10][];
  
  public l62() {
    this(new x62());
  }
  
  public l62(x62 paramx62) {
    this.a = paramx62;
    c(paramx62);
  }
  
  public final void a() {
    fi0[] arrayOfFi0 = this.b;
    if (arrayOfFi0 != null) {
      fi0 fi03 = arrayOfFi0[0];
      fi0 fi02 = arrayOfFi0[1];
      x62 x621 = this.a;
      fi0 fi01 = fi02;
      if (fi02 == null)
        fi01 = x621.a.h(2); 
      fi02 = fi03;
      if (fi03 == null)
        fi02 = x621.a.h(1); 
      h(fi0.a(fi02, fi01));
      fi01 = this.b[m92.H(16)];
      if (fi01 != null)
        g(fi01); 
      fi01 = this.b[m92.H(32)];
      if (fi01 != null)
        e(fi01); 
      fi01 = this.b[m92.H(64)];
      if (fi01 != null)
        i(fi01); 
    } 
  }
  
  public abstract x62 b();
  
  public void c(x62 paramx62) {
    for (int i = 1; i <= 512; i <<= 1) {
      List<Rect> list = paramx62.a.e(i);
      int j = m92.H(i);
      Rect[] arrayOfRect = list.<Rect>toArray(new Rect[list.size()]);
      this.c[j] = arrayOfRect;
      if (i != 8) {
        List<Rect> list1 = paramx62.a.f(i);
        Rect[] arrayOfRect1 = list1.<Rect>toArray(new Rect[list1.size()]);
        this.d[j] = arrayOfRect1;
      } 
    } 
  }
  
  public void d(int paramInt, fi0 paramfi0) {
    if (this.b == null)
      this.b = new fi0[10]; 
    for (int i = 1; i <= 512; i <<= 1) {
      if ((paramInt & i) != 0)
        this.b[m92.H(i)] = paramfi0; 
    } 
  }
  
  public void e(fi0 paramfi0) {}
  
  public abstract void f(fi0 paramfi0);
  
  public void g(fi0 paramfi0) {}
  
  public abstract void h(fi0 paramfi0);
  
  public void i(fi0 paramfi0) {}
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\l62.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
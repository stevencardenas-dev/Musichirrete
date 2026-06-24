import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class u62 {
  public static final x62 b;
  
  public final x62 a;
  
  static {
    e62 e62;
    int i = Build.VERSION.SDK_INT;
    if (i >= 36) {
      k62 k62 = new k62();
    } else if (i >= 35) {
      j62 j62 = new j62();
    } else if (i >= 34) {
      i62 i62 = new i62();
    } else if (i >= 31) {
      h62 h62 = new h62();
    } else if (i >= 30) {
      g62 g62 = new g62();
    } else if (i >= 29) {
      f62 f62 = new f62();
    } else {
      e62 = new e62();
    } 
    b = (((e62.b()).a.a()).a.b()).a.c();
  }
  
  public u62(x62 paramx62) {
    this.a = paramx62;
  }
  
  public void A(Rect[][] paramArrayOfRect) {}
  
  public x62 a() {
    return this.a;
  }
  
  public x62 b() {
    return this.a;
  }
  
  public x62 c() {
    return this.a;
  }
  
  public void d(View paramView) {}
  
  public List<Rect> e(int paramInt) {
    return Collections.EMPTY_LIST;
  }
  
  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (!(paramObject instanceof u62))
      return false; 
    paramObject = paramObject;
    return (s() == paramObject.s() && r() == paramObject.r() && Objects.equals(m(), paramObject.m()) && Objects.equals(k(), paramObject.k()) && Objects.equals(g(), paramObject.g()));
  }
  
  public List<Rect> f(int paramInt) {
    return Collections.EMPTY_LIST;
  }
  
  public g00 g() {
    return null;
  }
  
  public fi0 h(int paramInt) {
    return fi0.e;
  }
  
  public int hashCode() {
    return Objects.hash(new Object[] { Boolean.valueOf(s()), Boolean.valueOf(r()), m(), k(), g() });
  }
  
  public fi0 i(int paramInt) {
    if ((paramInt & 0x8) == 0)
      return fi0.e; 
    l0.l("Unable to query the maximum insets for IME");
    return null;
  }
  
  public fi0 j() {
    return m();
  }
  
  public fi0 k() {
    return fi0.e;
  }
  
  public fi0 l() {
    return m();
  }
  
  public fi0 m() {
    return fi0.e;
  }
  
  public fi0 n() {
    return m();
  }
  
  public void o(View paramView) {}
  
  public void p() {}
  
  public x62 q(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    return b;
  }
  
  public boolean r() {
    return false;
  }
  
  public boolean s() {
    return false;
  }
  
  public boolean t(int paramInt) {
    return true;
  }
  
  public void u(i00 parami00) {}
  
  public void v(fi0[] paramArrayOffi0) {}
  
  public void w(x62 paramx62) {}
  
  public void x(fi0 paramfi0) {}
  
  public void y(int paramInt) {}
  
  public void z(Rect[][] paramArrayOfRect) {}
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar\\u62.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
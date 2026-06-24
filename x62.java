import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.Objects;
import java.util.WeakHashMap;

public final class x62 {
  public static final x62 b = u62.b;
  
  public final u62 a;
  
  public x62() {
    this.a = new u62(this);
  }
  
  public x62(WindowInsets paramWindowInsets) {
    int i = Build.VERSION.SDK_INT;
    if (i >= 35) {
      this.a = new t62(this, paramWindowInsets);
      return;
    } 
    if (i >= 34) {
      this.a = new s62(this, paramWindowInsets);
      return;
    } 
    if (i >= 31) {
      this.a = new r62(this, paramWindowInsets);
      return;
    } 
    if (i >= 30) {
      this.a = new q62(this, paramWindowInsets);
      return;
    } 
    if (i >= 29) {
      this.a = new p62(this, paramWindowInsets);
      return;
    } 
    if (i >= 28) {
      this.a = new o62(this, paramWindowInsets);
      return;
    } 
    this.a = new n62(this, paramWindowInsets);
  }
  
  public static fi0 e(fi0 paramfi0, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    int j = Math.max(0, paramfi0.a - paramInt1);
    int m = Math.max(0, paramfi0.b - paramInt2);
    int k = Math.max(0, paramfi0.c - paramInt3);
    int i = Math.max(0, paramfi0.d - paramInt4);
    return (j == paramInt1 && m == paramInt2 && k == paramInt3 && i == paramInt4) ? paramfi0 : fi0.c(j, m, k, i);
  }
  
  public static x62 h(View paramView, WindowInsets paramWindowInsets) {
    paramWindowInsets.getClass();
    x62 x621 = new x62(paramWindowInsets);
    if (paramView != null && paramView.isAttachedToWindow()) {
      WeakHashMap weakHashMap = v22.a;
      x62 x622 = n22.a(paramView);
      u62 u621 = x621.a;
      u621.w(x622);
      View view = paramView.getRootView();
      u621.d(view);
      u621.o(view);
      u621.p();
      u621.y(paramView.getWindowSystemUiVisibility());
    } 
    return x621;
  }
  
  public final int a() {
    return (this.a.m()).d;
  }
  
  public final int b() {
    return (this.a.m()).a;
  }
  
  public final int c() {
    return (this.a.m()).c;
  }
  
  public final int d() {
    return (this.a.m()).b;
  }
  
  public final boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (!(paramObject instanceof x62))
      return false; 
    paramObject = paramObject;
    return Objects.equals(this.a, ((x62)paramObject).a);
  }
  
  public final x62 f(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    e62 e62;
    int i = Build.VERSION.SDK_INT;
    if (i >= 36) {
      k62 k62 = new k62(this);
    } else if (i >= 35) {
      j62 j62 = new j62(this);
    } else if (i >= 34) {
      i62 i62 = new i62(this);
    } else if (i >= 31) {
      h62 h62 = new h62(this);
    } else if (i >= 30) {
      g62 g62 = new g62(this);
    } else if (i >= 29) {
      f62 f62 = new f62(this);
    } else {
      e62 = new e62(this);
    } 
    e62.h(fi0.c(paramInt1, paramInt2, paramInt3, paramInt4));
    return e62.b();
  }
  
  public final WindowInsets g() {
    u62 u621 = this.a;
    return (u621 instanceof m62) ? ((m62)u621).c : null;
  }
  
  public final int hashCode() {
    u62 u621 = this.a;
    return (u621 == null) ? 0 : u621.hashCode();
  }
  
  static {
    int i = Build.VERSION.SDK_INT;
    if (i >= 34) {
      b = s62.w;
      return;
    } 
    if (i >= 30) {
      b = q62.v;
      return;
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\x62.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
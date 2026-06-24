import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public abstract class m62 extends u62 {
  public static boolean m;
  
  public static Method n;
  
  public static Class o;
  
  public static Field p;
  
  public static Field q;
  
  public final WindowInsets c;
  
  public fi0[] d;
  
  public fi0 e = null;
  
  public x62 f;
  
  public fi0 g;
  
  public int h;
  
  public int i;
  
  public int j;
  
  public Rect[][] k = new Rect[10][];
  
  public Rect[][] l = new Rect[10][];
  
  public m62(x62 paramx62, WindowInsets paramWindowInsets) {
    super(paramx62);
    this.c = paramWindowInsets;
  }
  
  private i00 B(View paramView) {
    boolean bool1;
    boolean bool2;
    boolean bool3;
    if (paramView == null)
      return null; 
    Display display = paramView.getDisplay();
    if (display == null)
      return null; 
    Point point = new Point();
    display.getRealSize(point);
    if (this.a.a.s())
      return i00.a(point.x, point.y, true, 0, 0, 0, 0); 
    int i = 0;
    kh1 kh12 = f00.b(display, 0);
    kh1 kh11 = f00.b(display, 1);
    kh1 kh13 = f00.b(display, 2);
    kh1 kh14 = f00.b(display, 3);
    int j = point.x;
    int k = point.y;
    if (kh12 != null) {
      bool1 = kh12.b;
    } else {
      bool1 = false;
    } 
    if (kh11 != null) {
      bool2 = kh11.b;
    } else {
      bool2 = false;
    } 
    if (kh13 != null) {
      bool3 = kh13.b;
    } else {
      bool3 = false;
    } 
    if (kh14 != null)
      i = kh14.b; 
    return i00.a(j, k, false, bool1, bool2, bool3, i);
  }
  
  public static List<Rect> C(Rect[][] paramArrayOfRect, int paramInt) {
    Rect[] arrayOfRect = null;
    for (int i = 1; i <= 512; i <<= 1) {
      if ((paramInt & i) != 0) {
        Rect[] arrayOfRect1 = paramArrayOfRect[m92.H(i)];
        if (arrayOfRect1 != null)
          if (arrayOfRect == null) {
            arrayOfRect = arrayOfRect1;
          } else {
            Rect[] arrayOfRect2 = new Rect[arrayOfRect.length + arrayOfRect1.length];
            System.arraycopy(arrayOfRect, 0, arrayOfRect2, 0, arrayOfRect.length);
            System.arraycopy(arrayOfRect1, 0, arrayOfRect2, arrayOfRect.length, arrayOfRect1.length);
            arrayOfRect = arrayOfRect2;
          }  
      } 
    } 
    return (arrayOfRect == null) ? Collections.EMPTY_LIST : Arrays.asList(arrayOfRect);
  }
  
  private Rect[] D(fi0 paramfi0) {
    ArrayList<Rect> arrayList = new ArrayList();
    int k = paramfi0.a;
    int i = paramfi0.d;
    int j = paramfi0.c;
    int m = paramfi0.b;
    if (k != 0)
      arrayList.add(new Rect(0, 0, paramfi0.a, this.i)); 
    if (m != 0)
      arrayList.add(new Rect(0, 0, this.j, m)); 
    if (j != 0) {
      k = this.j;
      arrayList.add(new Rect(k - j, 0, k, this.i));
    } 
    if (i != 0) {
      j = this.i;
      arrayList.add(new Rect(0, j - i, this.j, j));
    } 
    return arrayList.<Rect>toArray(new Rect[arrayList.size()]);
  }
  
  private fi0 E(int paramInt, boolean paramBoolean) {
    fi0 fi01 = fi0.e;
    for (int i = 1; i <= 512; i <<= 1) {
      if ((paramInt & i) != 0)
        fi01 = fi0.a(fi01, F(i, paramBoolean)); 
    } 
    return fi01;
  }
  
  private fi0 G() {
    x62 x621 = this.f;
    return (x621 != null) ? x621.a.k() : fi0.e;
  }
  
  private fi0 H(View paramView) {
    if (Build.VERSION.SDK_INT < 30) {
      if (!m)
        J(); 
      Method method = n;
      if (method != null && o != null && p != null) {
        try {
          object = method.invoke(paramView, null);
          if (object == null) {
            object = new NullPointerException();
            super();
            Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", (Throwable)object);
            return null;
          } 
        } catch (ReflectiveOperationException object) {}
        object = q.get(object);
        object = p.get(object);
        return (object != null) ? fi0.c(((Rect)object).left, ((Rect)object).top, ((Rect)object).right, ((Rect)object).bottom) : null;
      } 
      return null;
    } 
    tp.j("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
    return null;
  }
  
  public static void J() {
    try {
      n = View.class.getDeclaredMethod("getViewRootImpl", null);
      Class<?> clazz = Class.forName("android.view.View$AttachInfo");
      o = clazz;
      p = clazz.getDeclaredField("mVisibleInsets");
      q = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
      p.setAccessible(true);
      q.setAccessible(true);
    } catch (ReflectiveOperationException reflectiveOperationException) {
      StringBuilder stringBuilder = new StringBuilder("Failed to get visible insets. (Reflection error). ");
      stringBuilder.append(reflectiveOperationException.getMessage());
      Log.e("WindowInsetsCompat", stringBuilder.toString(), reflectiveOperationException);
    } 
    m = true;
  }
  
  public static boolean L(int paramInt1, int paramInt2) {
    return ((paramInt1 & 0x6) == (paramInt2 & 0x6));
  }
  
  public void A(Rect[][] paramArrayOfRect) {
    Objects.requireNonNull(paramArrayOfRect);
    this.l = (Rect[][])paramArrayOfRect.clone();
  }
  
  public fi0 F(int paramInt, boolean paramBoolean) {
    x62 x621;
    fi0 fi01 = fi0.e;
    int i = 0;
    if (paramInt != 1) {
      x62 x622 = null;
      x62 x623 = null;
      if (paramInt != 2) {
        if (paramInt != 8) {
          if (paramInt != 16) {
            if (paramInt != 32) {
              if (paramInt != 64) {
                if (paramInt == 128) {
                  g00 g00;
                  x622 = this.f;
                  if (x622 != null) {
                    g00 = x622.a.g();
                  } else {
                    g00 = g();
                  } 
                  if (g00 != null) {
                    boolean bool1;
                    boolean bool2;
                    int j = Build.VERSION.SDK_INT;
                    if (j >= 28) {
                      paramInt = k5.k(g00.a);
                    } else {
                      paramInt = 0;
                    } 
                    if (j >= 28) {
                      bool1 = k5.m(g00.a);
                    } else {
                      bool1 = false;
                    } 
                    if (j >= 28) {
                      bool2 = k5.l(g00.a);
                    } else {
                      bool2 = false;
                    } 
                    if (j >= 28)
                      i = k5.j(g00.a); 
                    return fi0.c(paramInt, bool1, bool2, i);
                  } 
                } 
              } else {
                return n();
              } 
            } else {
              return j();
            } 
          } else {
            return l();
          } 
        } else {
          fi0[] arrayOfFi0 = this.d;
          x622 = x623;
          if (arrayOfFi0 != null)
            fi02 = arrayOfFi0[m92.H(8)]; 
          if (fi02 != null)
            return fi02; 
          fi0 fi03 = m();
          fi0 fi02 = G();
          paramInt = fi03.d;
          if (paramInt > fi02.d)
            return fi0.c(0, 0, 0, paramInt); 
          fi03 = this.g;
          if (fi03 != null && !fi03.equals(fi01)) {
            paramInt = this.g.d;
            if (paramInt > fi02.d)
              return fi0.c(0, 0, 0, paramInt); 
          } 
        } 
      } else {
        if (paramBoolean) {
          fi0 fi03 = G();
          fi0 fi02 = k();
          return fi0.c(Math.max(fi03.a, fi02.a), 0, Math.max(fi03.c, fi02.c), Math.max(fi03.d, fi02.d));
        } 
        if ((this.h & 0x2) == 0) {
          fi0 fi02;
          fi0 fi03 = m();
          x621 = this.f;
          if (x621 != null)
            fi02 = x621.a.k(); 
          int j = fi03.d;
          paramInt = j;
          if (fi02 != null)
            paramInt = Math.min(j, fi02.d); 
          return fi0.c(fi03.a, 0, fi03.c, paramInt);
        } 
      } 
    } else {
      if (paramBoolean)
        return fi0.c(0, Math.max((G()).b, (m()).b), 0, 0); 
      if ((this.h & 0x4) == 0)
        return fi0.c(0, (m()).b, 0, 0); 
    } 
    return (fi0)x621;
  }
  
  public boolean I(int paramInt) {
    if (paramInt != 1 && paramInt != 2)
      if (paramInt != 4) {
        if (paramInt != 8 && paramInt != 128)
          return true; 
      } else {
        return false;
      }  
    return F(paramInt, false).equals(fi0.e) ^ true;
  }
  
  public void K(fi0 paramfi0) {
    this.g = paramfi0;
  }
  
  public void d(View paramView) {
    this.j = paramView.getWidth();
    this.i = paramView.getHeight();
    fi0 fi02 = H(paramView);
    fi0 fi01 = fi02;
    if (fi02 == null)
      fi01 = fi0.e; 
    K(fi01);
  }
  
  public List<Rect> e(int paramInt) {
    return C(this.k, paramInt);
  }
  
  public boolean equals(Object paramObject) {
    if (!super.equals(paramObject))
      return false; 
    paramObject = paramObject;
    return (Objects.equals(this.g, ((m62)paramObject).g) && L(this.h, ((m62)paramObject).h));
  }
  
  public List<Rect> f(int paramInt) {
    return C(this.l, paramInt);
  }
  
  public fi0 h(int paramInt) {
    return E(paramInt, false);
  }
  
  public fi0 i(int paramInt) {
    return E(paramInt, true);
  }
  
  public final fi0 m() {
    if (this.e == null) {
      WindowInsets windowInsets = this.c;
      this.e = fi0.c(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
    } 
    return this.e;
  }
  
  public void o(View paramView) {
    B(paramView);
  }
  
  public void p() {
    for (int i = 1; i <= 512; i <<= 1) {
      int j = m92.H(i);
      this.k[j] = D(h(i));
      if (i != 8)
        this.l[j] = D(i(i)); 
    } 
  }
  
  public x62 q(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    k62 k62;
    e62 e62;
    x62 x621 = x62.h(null, this.c);
    int i = Build.VERSION.SDK_INT;
    if (i >= 36) {
      k62 = new k62(x621);
    } else {
      j62 j62;
      if (i >= 35) {
        j62 = new j62((x62)k62);
      } else {
        i62 i62;
        if (i >= 34) {
          i62 = new i62((x62)j62);
        } else {
          h62 h62;
          if (i >= 31) {
            h62 = new h62((x62)i62);
          } else {
            g62 g62;
            if (i >= 30) {
              g62 = new g62((x62)h62);
            } else {
              f62 f62;
              if (i >= 29) {
                f62 = new f62((x62)g62);
              } else {
                e62 = new e62((x62)f62);
              } 
            } 
          } 
        } 
      } 
    } 
    e62.h(x62.e(m(), paramInt1, paramInt2, paramInt3, paramInt4));
    e62.f(x62.e(k(), paramInt1, paramInt2, paramInt3, paramInt4));
    return e62.b();
  }
  
  public boolean s() {
    return this.c.isRound();
  }
  
  public boolean t(int paramInt) {
    for (int i = 1; i <= 512; i <<= 1) {
      if ((paramInt & i) != 0 && !I(i))
        return false; 
    } 
    return true;
  }
  
  public void u(i00 parami00) {}
  
  public void v(fi0[] paramArrayOffi0) {
    this.d = paramArrayOffi0;
  }
  
  public void w(x62 paramx62) {
    this.f = paramx62;
  }
  
  public void y(int paramInt) {
    this.h = paramInt;
  }
  
  public void z(Rect[][] paramArrayOfRect) {
    Objects.requireNonNull(paramArrayOfRect);
    this.k = (Rect[][])paramArrayOfRect.clone();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\m62.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import java.util.Objects;
import java.util.WeakHashMap;

public final class x52 implements View.OnApplyWindowInsetsListener {
  public final hd a;
  
  public x62 b;
  
  public x52(View paramView, hd paramhd) {
    this.a = paramhd;
    WeakHashMap weakHashMap = v22.a;
    x62 x621 = n22.a(paramView);
    if (x621 != null) {
      k62 k62;
      e62 e62;
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
      x62 x622 = e62.b();
    } else {
      x621 = null;
    } 
    this.b = x621;
  }
  
  public final WindowInsets onApplyWindowInsets(View paramView, WindowInsets paramWindowInsets) {
    if (!paramView.isLaidOut()) {
      this.b = x62.h(paramView, paramWindowInsets);
      return (paramView.getTag(2131297578) != null) ? paramWindowInsets : paramView.onApplyWindowInsets(paramWindowInsets);
    } 
    x62 x621 = x62.h(paramView, paramWindowInsets);
    u62 u62 = x621.a;
    if (this.b == null) {
      WeakHashMap weakHashMap = v22.a;
      this.b = n22.a(paramView);
    } 
    if (this.b == null) {
      this.b = x621;
      if (paramView.getTag(2131297578) == null)
        return paramView.onApplyWindowInsets(paramWindowInsets); 
    } else {
      hd hd1 = y52.j(paramView);
      if (hd1 != null && Objects.equals(hd1.a, x621)) {
        if (paramView.getTag(2131297578) == null)
          return paramView.onApplyWindowInsets(paramWindowInsets); 
      } else {
        int[] arrayOfInt1 = new int[1];
        int[] arrayOfInt2 = new int[1];
        x62 x622 = this.b;
        int i;
        for (i = 1; i <= 512; i <<= 1) {
          int m;
          fi0 fi01 = u62.h(i);
          fi0 fi02 = x622.a.h(i);
          int n = fi01.a;
          int i1 = fi01.d;
          int i2 = fi01.c;
          int i5 = fi01.b;
          int i3 = fi02.a;
          int i4 = fi02.d;
          int i6 = fi02.c;
          int i7 = fi02.b;
          if (n > i3 || i5 > i7 || i2 > i6 || i1 > i4) {
            m = 1;
          } else {
            m = 0;
          } 
          if (n < i3 || i5 < i7 || i2 < i6 || i1 < i4) {
            n = 1;
          } else {
            n = 0;
          } 
          if (m != n)
            if (m != 0) {
              arrayOfInt1[0] = arrayOfInt1[0] | i;
            } else {
              arrayOfInt2[0] = arrayOfInt2[0] | i;
            }  
        } 
        int k = arrayOfInt1[0];
        int j = arrayOfInt2[0];
        i = k | j;
        if (i == 0) {
          this.b = x621;
          if (paramView.getTag(2131297578) == null)
            return paramView.onApplyWindowInsets(paramWindowInsets); 
        } else {
          long l;
          x622 = this.b;
          if ((k & 0x8) != 0) {
            PathInterpolator pathInterpolator = y52.e;
          } else if ((j & 0x8) != 0) {
            o70 o70 = y52.f;
          } else if ((k & 0x207) != 0) {
            DecelerateInterpolator decelerateInterpolator = y52.g;
          } else if ((j & 0x207) != 0) {
            AccelerateInterpolator accelerateInterpolator = y52.h;
          } else {
            arrayOfInt1 = null;
          } 
          if ((i & 0x8) != 0) {
            l = 160L;
          } else {
            l = 250L;
          } 
          d62 d62 = new d62(i, (Interpolator)arrayOfInt1, l);
          d62.a.e(0.0F);
          ValueAnimator valueAnimator = ValueAnimator.ofFloat(new float[] { 0.0F, 1.0F }).setDuration(d62.a.b());
          fi0 fi02 = u62.h(i);
          fi0 fi01 = x622.a.h(i);
          j = Math.min(fi02.a, fi01.a);
          k = fi02.b;
          int i5 = fi01.b;
          int i3 = Math.min(k, i5);
          int i2 = fi02.c;
          int m = fi01.c;
          int i1 = Math.min(i2, m);
          int n = fi02.d;
          int i4 = fi01.d;
          j01 j01 = new j01(fi0.c(j, i3, i1, Math.min(n, i4)), fi0.c(Math.max(fi02.a, fi01.a), Math.max(k, i5), Math.max(i2, m), Math.max(n, i4)), 17, false);
          y52.g(paramView, d62, x621, false);
          valueAnimator.addUpdateListener(new w52(d62, x621, x622, i, paramView));
          valueAnimator.addListener((Animator.AnimatorListener)new ew1(d62, paramView));
          s41.a(paramView, new wi(paramView, d62, j01, valueAnimator));
          this.b = x621;
          if (paramView.getTag(2131297578) == null)
            return paramView.onApplyWindowInsets(paramWindowInsets); 
        } 
      } 
    } 
    return paramWindowInsets;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\x52.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
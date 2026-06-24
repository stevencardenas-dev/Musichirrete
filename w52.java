import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.PathInterpolator;
import java.util.Collections;
import java.util.List;

public final class w52 implements ValueAnimator.AnimatorUpdateListener {
  public final d62 a;
  
  public final x62 b;
  
  public final x62 c;
  
  public final int d;
  
  public final View e;
  
  public w52(d62 paramd62, x62 paramx621, x62 paramx622, int paramInt, View paramView) {
    this.a = paramd62;
    this.b = paramx621;
    this.c = paramx622;
    this.d = paramInt;
    this.e = paramView;
  }
  
  public final void onAnimationUpdate(ValueAnimator paramValueAnimator) {
    e62 e62;
    float f1 = paramValueAnimator.getAnimatedFraction();
    d62 d621 = this.a;
    c62 c62 = d621.a;
    c62.e(f1);
    float f2 = c62.c();
    PathInterpolator pathInterpolator = y52.e;
    int i = Build.VERSION.SDK_INT;
    x62 x622 = this.b;
    if (i >= 36) {
      k62 k62 = new k62(x622);
    } else if (i >= 35) {
      j62 j62 = new j62(x622);
    } else if (i >= 34) {
      i62 i62 = new i62(x622);
    } else if (i >= 31) {
      h62 h62 = new h62(x622);
    } else if (i >= 30) {
      g62 g62 = new g62(x622);
    } else if (i >= 29) {
      f62 f62 = new f62(x622);
    } else {
      e62 = new e62(x622);
    } 
    for (i = 1; i <= 512; i <<= 1) {
      int j = this.d;
      u62 u62 = x622.a;
      if ((j & i) == 0) {
        e62.d(i, u62.h(i));
      } else {
        fi0 fi02 = u62.h(i);
        fi0 fi01 = this.c.a.h(i);
        float f = (fi02.a - fi01.a);
        f1 = 1.0F - f2;
        e62.d(i, x62.e(fi02, (int)((f * f1) + 0.5D), (int)(((fi02.b - fi01.b) * f1) + 0.5D), (int)(((fi02.c - fi01.c) * f1) + 0.5D), (int)(((fi02.d - fi01.d) * f1) + 0.5D)));
      } 
    } 
    x62 x621 = e62.b();
    List<d62> list = Collections.singletonList(d621);
    y52.h(this.e, x621, list);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\w52.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
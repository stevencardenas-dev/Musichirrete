import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;

public final class ej0 implements Animator.AnimatorListener {
  public final float a;
  
  public final float b;
  
  public final float c;
  
  public final float d;
  
  public final he1 e;
  
  public final int f;
  
  public final ValueAnimator g;
  
  public boolean h;
  
  public float i;
  
  public float j;
  
  public boolean k;
  
  public boolean l;
  
  public float m;
  
  public final int n;
  
  public final he1 o;
  
  public final ij0 p;
  
  public ej0(ij0 paramij0, he1 paramhe11, int paramInt1, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, int paramInt2, he1 paramhe12) {
    this.p = paramij0;
    this.n = paramInt2;
    this.o = paramhe12;
    this.k = false;
    this.l = false;
    this.f = paramInt1;
    this.e = paramhe11;
    this.a = paramFloat1;
    this.b = paramFloat2;
    this.c = paramFloat3;
    this.d = paramFloat4;
    ValueAnimator valueAnimator = ValueAnimator.ofFloat(new float[] { 0.0F, 1.0F });
    this.g = valueAnimator;
    valueAnimator.addUpdateListener(new vd(5, this));
    valueAnimator.setTarget(paramhe11.b);
    valueAnimator.addListener(this);
    this.m = 0.0F;
  }
  
  public final void a(Animator paramAnimator) {
    if (!this.l)
      this.e.p(true); 
    this.l = true;
  }
  
  public final void onAnimationCancel(Animator paramAnimator) {
    this.m = 1.0F;
  }
  
  public final void onAnimationEnd(Animator paramAnimator) {
    a(paramAnimator);
    if (!this.k) {
      int i = this.n;
      he1 he11 = this.o;
      ij0 ij01 = this.p;
      if (i <= 0) {
        ij01.m.a(ij01.r, he11);
      } else {
        ij01.a.add(he11.b);
        this.h = true;
        if (i > 0)
          ij01.r.post(new vi2(ij01, this, i)); 
      } 
      View view1 = ij01.w;
      View view2 = he11.b;
      if (view1 == view2 && view2 == view1)
        ij01.w = null; 
    } 
  }
  
  public final void onAnimationRepeat(Animator paramAnimator) {}
  
  public final void onAnimationStart(Animator paramAnimator) {}
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\ej0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
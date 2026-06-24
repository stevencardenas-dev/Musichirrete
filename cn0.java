import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import java.util.ArrayList;

public final class cn0 extends r6 {
  public static final int[] k = new int[] { 533, 567, 850, 750 };
  
  public static final int[] l = new int[] { 1267, 1000, 333, 0 };
  
  public static final xj m = new xj(Float.class, "animationFraction", 7);
  
  public ObjectAnimator c;
  
  public ObjectAnimator d;
  
  public final Interpolator[] e;
  
  public final jn0 f;
  
  public int g = 0;
  
  public boolean h;
  
  public float i;
  
  public md j = null;
  
  public cn0(Context paramContext, jn0 paramjn0) {
    super(2);
    this.f = paramjn0;
    this.e = new Interpolator[] { AnimationUtils.loadInterpolator(paramContext, 2130772000), AnimationUtils.loadInterpolator(paramContext, 2130772001), AnimationUtils.loadInterpolator(paramContext, 2130772002), AnimationUtils.loadInterpolator(paramContext, 2130772003) };
  }
  
  public final void c() {
    ObjectAnimator objectAnimator = this.c;
    if (objectAnimator != null)
      objectAnimator.cancel(); 
  }
  
  public final void h() {
    o();
    ObjectAnimator objectAnimator = this.c;
    jn0 jn01 = this.f;
    objectAnimator.setDuration((long)(jn01.n * 1800.0F));
    this.d.setDuration((long)(jn01.n * 1800.0F));
    p();
  }
  
  public final void j(md parammd) {
    this.j = parammd;
  }
  
  public final void k() {
    ObjectAnimator objectAnimator = this.d;
    if (objectAnimator != null && !objectAnimator.isRunning()) {
      c();
      if (((sh0)this.a).isVisible()) {
        this.d.setFloatValues(new float[] { this.i, 1.0F });
        this.d.setDuration((long)((1.0F - this.i) * 1800.0F));
        this.d.start();
      } 
    } 
  }
  
  public final void m() {
    o();
    p();
    this.c.start();
  }
  
  public final void n() {
    this.j = null;
  }
  
  public final void o() {
    ObjectAnimator objectAnimator = this.c;
    jn0 jn01 = this.f;
    xj xj1 = m;
    if (objectAnimator == null) {
      objectAnimator = ObjectAnimator.ofFloat(this, xj1, new float[] { 0.0F, 1.0F });
      this.c = objectAnimator;
      objectAnimator.setDuration((long)(jn01.n * 1800.0F));
      this.c.setInterpolator(null);
      this.c.setRepeatCount(-1);
      this.c.addListener((Animator.AnimatorListener)new bn0(this, 0));
    } 
    if (this.d == null) {
      ObjectAnimator objectAnimator1 = ObjectAnimator.ofFloat(this, xj1, new float[] { 1.0F });
      this.d = objectAnimator1;
      objectAnimator1.setDuration((long)(jn01.n * 1800.0F));
      this.d.setInterpolator(null);
      this.d.addListener((Animator.AnimatorListener)new bn0(this, 1));
    } 
  }
  
  public final void p() {
    this.g = 0;
    ArrayList<Object> arrayList = (ArrayList)this.b;
    int i = arrayList.size();
    byte b = 0;
    while (b < i) {
      Object object = arrayList.get(b);
      b++;
      ((o10)object).c = this.f.e[0];
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\cn0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
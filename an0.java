import android.animation.Animator;
import android.animation.ObjectAnimator;
import java.util.ArrayList;

public final class an0 extends r6 {
  public static final xj i = new xj(Float.class, "animationFraction", 6);
  
  public ObjectAnimator c;
  
  public final o70 d;
  
  public final jn0 e;
  
  public int f = 1;
  
  public boolean g;
  
  public float h;
  
  public an0(jn0 paramjn0) {
    super(3);
    this.e = paramjn0;
    this.d = new o70(1);
  }
  
  public final void c() {
    ObjectAnimator objectAnimator = this.c;
    if (objectAnimator != null)
      objectAnimator.cancel(); 
  }
  
  public final void h() {
    o();
    this.c.setDuration((long)(this.e.n * 333.0F));
    p();
  }
  
  public final void j(md parammd) {}
  
  public final void k() {}
  
  public final void m() {
    o();
    p();
    this.c.start();
  }
  
  public final void n() {}
  
  public final void o() {
    if (this.c == null) {
      ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(this, i, new float[] { 0.0F, 1.0F });
      this.c = objectAnimator;
      objectAnimator.setDuration((long)(this.e.n * 333.0F));
      this.c.setInterpolator(null);
      this.c.setRepeatCount(-1);
      this.c.addListener((Animator.AnimatorListener)new j1(9, this));
    } 
  }
  
  public final void p() {
    this.g = true;
    this.f = 1;
    ArrayList<Object> arrayList = (ArrayList)this.b;
    int i = arrayList.size();
    byte b = 0;
    while (b < i) {
      o10 o101 = (o10)arrayList.get(b);
      b++;
      o10 o102 = o101;
      jn0 jn01 = this.e;
      o102.c = jn01.e[0];
      o102.d = jn01.i / 2;
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\an0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
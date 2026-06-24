import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.EditText;

public final class ul extends o40 {
  public final int e;
  
  public final int f;
  
  public final TimeInterpolator g;
  
  public final TimeInterpolator h;
  
  public EditText i;
  
  public final ql j = new ql(0, this);
  
  public final rl k = new rl(this, 0);
  
  public AnimatorSet l;
  
  public ValueAnimator m;
  
  public ul(n40 paramn40) {
    super(paramn40);
    this.e = zo2.P(paramn40.getContext(), 2130969692, 100);
    this.f = zo2.P(paramn40.getContext(), 2130969692, 150);
    this.g = zo2.Q(paramn40.getContext(), 2130969701, (TimeInterpolator)g5.a);
    this.h = zo2.Q(paramn40.getContext(), 2130969699, (TimeInterpolator)g5.d);
  }
  
  public final void a() {
    if (this.b.r != null)
      return; 
    s(t());
  }
  
  public final int c() {
    return 2131886362;
  }
  
  public final int d() {
    return 2131231551;
  }
  
  public final View.OnFocusChangeListener e() {
    return this.k;
  }
  
  public final View.OnClickListener f() {
    return this.j;
  }
  
  public final View.OnFocusChangeListener g() {
    return this.k;
  }
  
  public final void l(EditText paramEditText) {
    this.i = paramEditText;
    this.a.setEndIconVisible(t());
  }
  
  public final void o(boolean paramBoolean) {
    if (this.b.r == null)
      return; 
    s(paramBoolean);
  }
  
  public final void q() {
    ValueAnimator valueAnimator1 = ValueAnimator.ofFloat(new float[] { 0.8F, 1.0F });
    valueAnimator1.setInterpolator(this.h);
    valueAnimator1.setDuration(this.f);
    valueAnimator1.addUpdateListener(new sl(this, 1));
    ValueAnimator valueAnimator2 = ValueAnimator.ofFloat(new float[] { 0.0F, 1.0F });
    TimeInterpolator timeInterpolator = this.g;
    valueAnimator2.setInterpolator(timeInterpolator);
    int i = this.e;
    valueAnimator2.setDuration(i);
    valueAnimator2.addUpdateListener(new sl(this, 0));
    AnimatorSet animatorSet = new AnimatorSet();
    this.l = animatorSet;
    animatorSet.playTogether(new Animator[] { (Animator)valueAnimator1, (Animator)valueAnimator2 });
    this.l.addListener((Animator.AnimatorListener)new tl(this, 0));
    valueAnimator1 = ValueAnimator.ofFloat(new float[] { 1.0F, 0.0F });
    valueAnimator1.setInterpolator(timeInterpolator);
    valueAnimator1.setDuration(i);
    valueAnimator1.addUpdateListener(new sl(this, 0));
    this.m = valueAnimator1;
    valueAnimator1.addListener((Animator.AnimatorListener)new tl(this, 1));
  }
  
  public final void r() {
    EditText editText = this.i;
    if (editText != null)
      editText.post(new e(8, this)); 
  }
  
  public final void s(boolean paramBoolean) {
    boolean bool;
    if (this.b.c() == paramBoolean) {
      bool = true;
    } else {
      bool = false;
    } 
    if (paramBoolean && !this.l.isRunning()) {
      this.m.cancel();
      this.l.start();
      if (bool) {
        this.l.end();
        return;
      } 
    } else if (!paramBoolean) {
      this.l.cancel();
      this.m.start();
      if (bool)
        this.m.end(); 
    } 
  }
  
  public final boolean t() {
    EditText editText = this.i;
    return (editText != null && (editText.hasFocus() || this.d.hasFocus()) && this.i.getText().length() > 0);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar\\ul.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
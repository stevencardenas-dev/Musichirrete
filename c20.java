import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.os.SystemClock;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

public final class c20 extends o40 {
  public final int e;
  
  public final int f;
  
  public final TimeInterpolator g;
  
  public AutoCompleteTextView h;
  
  public final ql i = new ql(2, this);
  
  public final rl j = new rl(this, 1);
  
  public final b20 k = new b20(this);
  
  public boolean l;
  
  public boolean m;
  
  public boolean n;
  
  public long o = Long.MAX_VALUE;
  
  public AccessibilityManager p;
  
  public ValueAnimator q;
  
  public ValueAnimator r;
  
  public c20(n40 paramn40) {
    super(paramn40);
    this.f = zo2.P(paramn40.getContext(), 2130969692, 67);
    this.e = zo2.P(paramn40.getContext(), 2130969692, 50);
    this.g = zo2.Q(paramn40.getContext(), 2130969701, (TimeInterpolator)g5.a);
  }
  
  public final void a() {
    if (this.p.isTouchExplorationEnabled() && this.h.getInputType() != 0 && !this.d.hasFocus())
      this.h.dismissDropDown(); 
    this.h.post(new e(14, this));
  }
  
  public final int c() {
    return 2131886539;
  }
  
  public final int d() {
    return 2131231548;
  }
  
  public final View.OnFocusChangeListener e() {
    return this.j;
  }
  
  public final View.OnClickListener f() {
    return this.i;
  }
  
  public final AccessibilityManager.TouchExplorationStateChangeListener h() {
    return this.k;
  }
  
  public final boolean i(int paramInt) {
    return (paramInt != 0);
  }
  
  public final boolean k() {
    return this.n;
  }
  
  public final void l(EditText paramEditText) {
    if (paramEditText instanceof AutoCompleteTextView) {
      AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView)paramEditText;
      this.h = autoCompleteTextView;
      autoCompleteTextView.setOnTouchListener(new lz(1, this));
      this.h.setOnDismissListener(new a20(this));
      this.h.setThreshold(0);
      TextInputLayout textInputLayout = this.a;
      textInputLayout.setErrorIconDrawable(null);
      if (paramEditText.getInputType() == 0 && this.p.isTouchExplorationEnabled())
        this.d.setImportantForAccessibility(2); 
      textInputLayout.setEndIconVisible(true);
      return;
    } 
    l0.f("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
  }
  
  public final void m(t0 paramt0) {
    if (this.h.getInputType() == 0)
      paramt0.i("android.widget.Spinner"); 
    if (paramt0.g())
      paramt0.l(null); 
  }
  
  public final void n(AccessibilityEvent paramAccessibilityEvent) {
    if (this.p.isEnabled()) {
      boolean bool;
      if (this.h.getInputType() != 0)
        return; 
      if ((paramAccessibilityEvent.getEventType() == 32768 || paramAccessibilityEvent.getEventType() == 8) && this.n && !this.h.isPopupShowing()) {
        bool = true;
      } else {
        bool = false;
      } 
      if (paramAccessibilityEvent.getEventType() == 1 || bool) {
        t();
        this.m = true;
        this.o = SystemClock.uptimeMillis();
      } 
    } 
  }
  
  public final void q() {
    ValueAnimator valueAnimator = ValueAnimator.ofFloat(new float[] { 0.0F, 1.0F });
    TimeInterpolator timeInterpolator = this.g;
    valueAnimator.setInterpolator(timeInterpolator);
    valueAnimator.setDuration(this.f);
    valueAnimator.addUpdateListener(new pd(2, this));
    this.r = valueAnimator;
    valueAnimator = ValueAnimator.ofFloat(new float[] { 1.0F, 0.0F });
    valueAnimator.setInterpolator(timeInterpolator);
    valueAnimator.setDuration(this.e);
    valueAnimator.addUpdateListener(new pd(2, this));
    this.q = valueAnimator;
    valueAnimator.addListener((Animator.AnimatorListener)new j1(5, this));
    this.p = (AccessibilityManager)this.c.getSystemService("accessibility");
  }
  
  public final void r() {
    AutoCompleteTextView autoCompleteTextView = this.h;
    if (autoCompleteTextView != null) {
      autoCompleteTextView.setOnTouchListener(null);
      this.h.setOnDismissListener(null);
    } 
  }
  
  public final void s(boolean paramBoolean) {
    if (this.n != paramBoolean) {
      this.n = paramBoolean;
      this.r.cancel();
      this.q.start();
    } 
  }
  
  public final void t() {
    if (this.h == null)
      return; 
    long l = SystemClock.uptimeMillis() - this.o;
    if (l < 0L || l > 300L)
      this.m = false; 
    if (!this.m) {
      s(this.n ^ true);
      boolean bool = this.n;
      AutoCompleteTextView autoCompleteTextView = this.h;
      if (bool) {
        autoCompleteTextView.requestFocus();
        this.h.showDropDown();
        return;
      } 
      autoCompleteTextView.dismissDropDown();
      return;
    } 
    this.m = false;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\c20.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
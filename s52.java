import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

public final class s52 extends y1 implements pw0 {
  public final Context e;
  
  public final rw0 f;
  
  public g7 g;
  
  public WeakReference h;
  
  public final t52 i;
  
  public s52(t52 paramt52, Context paramContext, g7 paramg7) {
    this.i = paramt52;
    this.e = paramContext;
    this.g = paramg7;
    rw0 rw01 = new rw0(paramContext);
    rw01.l = 1;
    this.f = rw01;
    rw01.e = this;
  }
  
  public final void a() {
    t52 t521 = this.i;
    if (t521.w != this)
      return; 
    if (t521.D) {
      t521.x = this;
      t521.y = this.g;
    } else {
      this.g.D(this);
    } 
    this.g = null;
    t521.D0(false);
    ActionBarContextView actionBarContextView = t521.t;
    if (actionBarContextView.m == null)
      actionBarContextView.e(); 
    t521.q.setHideOnContentScrollEnabled(t521.I);
    t521.w = null;
  }
  
  public final View b() {
    WeakReference<View> weakReference = this.h;
    return (weakReference != null) ? weakReference.get() : null;
  }
  
  public final boolean c(rw0 paramrw0, MenuItem paramMenuItem) {
    g7 g71 = this.g;
    return (g71 != null) ? ((n2)g71.c).D(this, paramMenuItem) : false;
  }
  
  public final rw0 d() {
    return this.f;
  }
  
  public final MenuInflater e() {
    return new cr1(this.e);
  }
  
  public final CharSequence f() {
    return this.i.t.getSubtitle();
  }
  
  public final void g(rw0 paramrw0) {
    if (this.g != null) {
      i();
      u1 u1 = this.i.t.f;
      if (u1 != null)
        u1.l(); 
    } 
  }
  
  public final CharSequence h() {
    return this.i.t.getTitle();
  }
  
  public final void i() {
    if (this.i.w != this)
      return; 
    rw0 rw01 = this.f;
    rw01.w();
    try {
      this.g.E(this, rw01);
      return;
    } finally {
      rw01.v();
    } 
  }
  
  public final boolean j() {
    return this.i.t.u;
  }
  
  public final void k(View paramView) {
    this.i.t.setCustomView(paramView);
    this.h = new WeakReference<View>(paramView);
  }
  
  public final void l(int paramInt) {
    m(this.i.o.getResources().getString(paramInt));
  }
  
  public final void m(CharSequence paramCharSequence) {
    this.i.t.setSubtitle(paramCharSequence);
  }
  
  public final void n(int paramInt) {
    o(this.i.o.getResources().getString(paramInt));
  }
  
  public final void o(CharSequence paramCharSequence) {
    this.i.t.setTitle(paramCharSequence);
  }
  
  public final void p(boolean paramBoolean) {
    this.c = paramBoolean;
    this.i.t.setTitleOptional(paramBoolean);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\s52.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
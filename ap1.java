import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

public final class ap1 extends y1 implements pw0 {
  public Context e;
  
  public ActionBarContextView f;
  
  public g7 g;
  
  public WeakReference h;
  
  public boolean i;
  
  public rw0 j;
  
  public final void a() {
    if (this.i)
      return; 
    this.i = true;
    this.g.D(this);
  }
  
  public final View b() {
    WeakReference<View> weakReference = this.h;
    return (weakReference != null) ? weakReference.get() : null;
  }
  
  public final boolean c(rw0 paramrw0, MenuItem paramMenuItem) {
    return ((n2)this.g.c).D(this, paramMenuItem);
  }
  
  public final rw0 d() {
    return this.j;
  }
  
  public final MenuInflater e() {
    return new cr1(this.f.getContext());
  }
  
  public final CharSequence f() {
    return this.f.getSubtitle();
  }
  
  public final void g(rw0 paramrw0) {
    i();
    u1 u1 = this.f.f;
    if (u1 != null)
      u1.l(); 
  }
  
  public final CharSequence h() {
    return this.f.getTitle();
  }
  
  public final void i() {
    this.g.E(this, this.j);
  }
  
  public final boolean j() {
    return this.f.u;
  }
  
  public final void k(View paramView) {
    this.f.setCustomView(paramView);
    if (paramView != null) {
      WeakReference<View> weakReference = new WeakReference<View>(paramView);
    } else {
      paramView = null;
    } 
    this.h = (WeakReference)paramView;
  }
  
  public final void l(int paramInt) {
    m(this.e.getString(paramInt));
  }
  
  public final void m(CharSequence paramCharSequence) {
    this.f.setSubtitle(paramCharSequence);
  }
  
  public final void n(int paramInt) {
    o(this.e.getString(paramInt));
  }
  
  public final void o(CharSequence paramCharSequence) {
    this.f.setTitle(paramCharSequence);
  }
  
  public final void p(boolean paramBoolean) {
    this.c = paramBoolean;
    this.f.setTitleOptional(paramBoolean);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\ap1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
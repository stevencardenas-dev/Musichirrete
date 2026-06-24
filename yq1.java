import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;

public final class yq1 extends ActionMode {
  public final Context a;
  
  public final y1 b;
  
  public yq1(Context paramContext, y1 paramy1) {
    this.a = paramContext;
    this.b = paramy1;
  }
  
  public final void finish() {
    this.b.a();
  }
  
  public final View getCustomView() {
    return this.b.b();
  }
  
  public final Menu getMenu() {
    rw0 rw0 = this.b.d();
    return new kx0(this.a, rw0);
  }
  
  public final MenuInflater getMenuInflater() {
    return this.b.e();
  }
  
  public final CharSequence getSubtitle() {
    return this.b.f();
  }
  
  public final Object getTag() {
    return this.b.b;
  }
  
  public final CharSequence getTitle() {
    return this.b.h();
  }
  
  public final boolean getTitleOptionalHint() {
    return this.b.c;
  }
  
  public final void invalidate() {
    this.b.i();
  }
  
  public final boolean isTitleOptional() {
    return this.b.j();
  }
  
  public final void setCustomView(View paramView) {
    this.b.k(paramView);
  }
  
  public final void setSubtitle(int paramInt) {
    this.b.l(paramInt);
  }
  
  public final void setSubtitle(CharSequence paramCharSequence) {
    this.b.m(paramCharSequence);
  }
  
  public final void setTag(Object paramObject) {
    this.b.b = paramObject;
  }
  
  public final void setTitle(int paramInt) {
    this.b.n(paramInt);
  }
  
  public final void setTitle(CharSequence paramCharSequence) {
    this.b.o(paramCharSequence);
  }
  
  public final void setTitleOptionalHint(boolean paramBoolean) {
    this.b.p(paramBoolean);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\yq1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
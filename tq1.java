import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

public final class tq1 extends rw0 implements SubMenu {
  public final uw0 A;
  
  public final rw0 z;
  
  public tq1(Context paramContext, rw0 paramrw0, uw0 paramuw0) {
    super(paramContext);
    this.z = paramrw0;
    this.A = paramuw0;
  }
  
  public final boolean d(uw0 paramuw0) {
    return this.z.d(paramuw0);
  }
  
  public final boolean e(rw0 paramrw0, MenuItem paramMenuItem) {
    return (super.e(paramrw0, paramMenuItem) || this.z.e(paramrw0, paramMenuItem));
  }
  
  public final boolean f(uw0 paramuw0) {
    return this.z.f(paramuw0);
  }
  
  public final MenuItem getItem() {
    return this.A;
  }
  
  public final String j() {
    boolean bool;
    uw0 uw01 = this.A;
    if (uw01 != null) {
      bool = uw01.a;
    } else {
      bool = false;
    } 
    return !bool ? null : ga1.i("android:menu:actionviewstates:", bool);
  }
  
  public final rw0 k() {
    return this.z.k();
  }
  
  public final boolean m() {
    return this.z.m();
  }
  
  public final boolean n() {
    return this.z.n();
  }
  
  public final boolean o() {
    return this.z.o();
  }
  
  public final void setGroupDividerEnabled(boolean paramBoolean) {
    this.z.setGroupDividerEnabled(paramBoolean);
  }
  
  public final SubMenu setHeaderIcon(int paramInt) {
    u(0, null, paramInt, null, null);
    return this;
  }
  
  public final SubMenu setHeaderIcon(Drawable paramDrawable) {
    u(0, null, 0, paramDrawable, null);
    return this;
  }
  
  public final SubMenu setHeaderTitle(int paramInt) {
    u(paramInt, null, 0, null, null);
    return this;
  }
  
  public final SubMenu setHeaderTitle(CharSequence paramCharSequence) {
    u(0, paramCharSequence, 0, null, null);
    return this;
  }
  
  public final SubMenu setHeaderView(View paramView) {
    u(0, null, 0, null, paramView);
    return this;
  }
  
  public final SubMenu setIcon(int paramInt) {
    this.A.setIcon(paramInt);
    return this;
  }
  
  public final SubMenu setIcon(Drawable paramDrawable) {
    this.A.setIcon(paramDrawable);
    return this;
  }
  
  public final void setQwertyMode(boolean paramBoolean) {
    this.z.setQwertyMode(paramBoolean);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\tq1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
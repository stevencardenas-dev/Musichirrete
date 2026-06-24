import android.view.View;
import androidx.appcompat.view.menu.ActionMenuItemView;

public final class p1 extends pa0 {
  public final int l;
  
  public final View m;
  
  public p1(ActionMenuItemView paramActionMenuItemView) {
    super((View)paramActionMenuItemView);
  }
  
  public p1(t1 paramt11, t1 paramt12) {
    super((View)paramt12);
  }
  
  public final rm1 b() {
    zw0 zw01;
    int i = this.l;
    r1 r12 = null;
    zw0 zw02 = null;
    View view = this.m;
    switch (i) {
      default:
        r12 = ((t1)view).f.u;
        if (r12 != null)
          zw02 = r12.a(); 
        return zw02;
      case 0:
        break;
    } 
    q1 q1 = ((ActionMenuItemView)view).o;
    r1 r11 = r12;
    if (q1 != null) {
      r1 r1 = ((s1)q1).a.v;
      r11 = r12;
      if (r1 != null)
        zw01 = r1.a(); 
    } 
    return zw01;
  }
  
  public final boolean c() {
    int i = this.l;
    null = true;
    View view = this.m;
    switch (i) {
      default:
        ((t1)view).f.l();
        return true;
      case 0:
        break;
    } 
    ActionMenuItemView actionMenuItemView = (ActionMenuItemView)view;
    qw0 qw0 = actionMenuItemView.m;
    if (qw0 != null && qw0.a(actionMenuItemView.j)) {
      rm1 rm1 = b();
      if (rm1 != null && rm1.b())
        return null; 
    } 
    return false;
  }
  
  public boolean d() {
    boolean bool;
    switch (this.l) {
      default:
        return super.d();
      case 1:
        break;
    } 
    u1 u1 = ((t1)this.m).f;
    if (u1.w != null) {
      bool = false;
    } else {
      u1.d();
      bool = true;
    } 
    return bool;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\p1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
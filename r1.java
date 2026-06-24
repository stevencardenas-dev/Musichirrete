import android.content.Context;
import android.view.View;

public final class r1 extends bx0 {
  public final int l;
  
  public final u1 m;
  
  public r1(u1 paramu1, Context paramContext, rw0 paramrw0, View paramView) {
    super(paramContext, paramrw0, paramView, true, 2130968610, 0);
    this.f = 8388613;
    gh1 gh1 = paramu1.y;
    this.h = gh1;
    zw0 zw0 = this.i;
    if (zw0 != null)
      zw0.e(gh1); 
  }
  
  public r1(u1 paramu1, Context paramContext, tq1 paramtq1, View paramView) {
    super(paramContext, paramtq1, paramView, false, 2130968610, 0);
    if ((paramtq1.A.x & 0x20) != 32) {
      View view;
      t1 t12 = paramu1.k;
      t1 t11 = t12;
      if (t12 == null)
        view = (View)paramu1.j; 
      this.e = view;
    } 
    gh1 gh1 = paramu1.y;
    this.h = gh1;
    zw0 zw0 = this.i;
    if (zw0 != null)
      zw0.e(gh1); 
  }
  
  public final void c() {
    rw0 rw0;
    int i = this.l;
    u1 u11 = this.m;
    switch (i) {
      default:
        rw0 = u11.e;
        if (rw0 != null)
          rw0.c(true); 
        u11.u = null;
        super.c();
        return;
      case 0:
        break;
    } 
    u11.v = null;
    super.c();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\r1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
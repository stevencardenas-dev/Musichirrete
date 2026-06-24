import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;

public class bx0 {
  public final Context a;
  
  public final rw0 b;
  
  public final boolean c;
  
  public final int d;
  
  public View e;
  
  public int f = 8388611;
  
  public boolean g;
  
  public gx0 h;
  
  public zw0 i;
  
  public PopupWindow.OnDismissListener j;
  
  public final ax0 k = new ax0(0, this);
  
  public bx0(Context paramContext, rw0 paramrw0, View paramView) {
    this(paramContext, paramrw0, paramView, false, 2130969811, 0);
  }
  
  public bx0(Context paramContext, rw0 paramrw0, View paramView, boolean paramBoolean, int paramInt1, int paramInt2) {
    this.a = paramContext;
    this.b = paramrw0;
    this.e = paramView;
    this.c = paramBoolean;
    this.d = paramInt1;
  }
  
  public final zw0 a() {
    if (this.i == null) {
      yi yi;
      dp1 dp1;
      Context context = this.a;
      Display display = ((WindowManager)context.getSystemService("window")).getDefaultDisplay();
      Point point = new Point();
      display.getRealSize(point);
      int i = Math.min(point.x, point.y);
      int j = context.getResources().getDimensionPixelSize(2131165206);
      context = this.a;
      if (i >= j) {
        yi = new yi(context, this.e, this.d, this.c);
      } else {
        View view = this.e;
        i = this.d;
        boolean bool = this.c;
        dp1 = new dp1((Context)yi, this.b, view, i, bool);
      } 
      dp1.l(this.b);
      dp1.r(this.k);
      dp1.n(this.e);
      dp1.e(this.h);
      dp1.o(this.g);
      dp1.p(this.f);
      this.i = dp1;
    } 
    return this.i;
  }
  
  public final boolean b() {
    zw0 zw01 = this.i;
    return (zw01 != null && zw01.b());
  }
  
  public void c() {
    this.i = null;
    PopupWindow.OnDismissListener onDismissListener = this.j;
    if (onDismissListener != null)
      onDismissListener.onDismiss(); 
  }
  
  public final void d(boolean paramBoolean) {
    this.g = paramBoolean;
    zw0 zw01 = this.i;
    if (zw01 != null)
      zw01.o(paramBoolean); 
  }
  
  public final void e() {
    if (b())
      return; 
    if (this.e != null) {
      f(0, 0, false, false);
      return;
    } 
    tp.f("MenuPopupHelper cannot be used without an anchor");
  }
  
  public final void f(int paramInt1, int paramInt2, boolean paramBoolean1, boolean paramBoolean2) {
    zw0 zw01 = a();
    zw01.s(paramBoolean2);
    if (paramBoolean1) {
      int i = paramInt1;
      if ((Gravity.getAbsoluteGravity(this.f, this.e.getLayoutDirection()) & 0x7) == 5)
        i = paramInt1 - this.e.getWidth(); 
      zw01.q(i);
      zw01.t(paramInt2);
      paramInt1 = (int)((this.a.getResources().getDisplayMetrics()).density * 48.0F / 2.0F);
      zw01.b = new Rect(i - paramInt1, paramInt2 - paramInt1, i + paramInt1, paramInt2 + paramInt1);
    } 
    zw01.d();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\bx0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
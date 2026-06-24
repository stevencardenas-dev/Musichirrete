import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.TextView;

public final class dp1 extends zw0 implements PopupWindow.OnDismissListener, View.OnKeyListener {
  public final Context c;
  
  public final rw0 e;
  
  public final ow0 f;
  
  public final boolean g;
  
  public final int h;
  
  public final int i;
  
  public final fx0 j;
  
  public final l7 k = new l7(5, this);
  
  public final vi l = new vi(5, this);
  
  public PopupWindow.OnDismissListener m;
  
  public View n;
  
  public View o;
  
  public gx0 p;
  
  public ViewTreeObserver q;
  
  public boolean r;
  
  public boolean s;
  
  public int t;
  
  public int u = 0;
  
  public boolean v;
  
  public dp1(Context paramContext, rw0 paramrw0, View paramView, int paramInt, boolean paramBoolean) {
    this.c = paramContext;
    this.e = paramrw0;
    this.g = paramBoolean;
    this.f = new ow0(paramrw0, LayoutInflater.from(paramContext), paramBoolean, 2131492883);
    this.i = paramInt;
    Resources resources = paramContext.getResources();
    this.h = Math.max((resources.getDisplayMetrics()).widthPixels / 2, resources.getDimensionPixelSize(2131165207));
    this.n = paramView;
    this.j = (fx0)new co0(paramContext, null, paramInt, 0);
    paramrw0.b(this, paramContext);
  }
  
  public final void a(rw0 paramrw0, boolean paramBoolean) {
    if (paramrw0 == this.e) {
      dismiss();
      gx0 gx01 = this.p;
      if (gx01 != null)
        gx01.a(paramrw0, paramBoolean); 
    } 
  }
  
  public final boolean b() {
    return (!this.r && this.j.B.isShowing());
  }
  
  public final void d() {
    if (b())
      return; 
    if (!this.r) {
      View view = this.n;
      if (view != null) {
        boolean bool;
        this.o = view;
        fx0 fx01 = this.j;
        f7 f72 = fx01.B;
        f7 f71 = fx01.B;
        f72.setOnDismissListener(this);
        fx01.r = this;
        fx01.A = true;
        f71.setFocusable(true);
        View view1 = this.o;
        if (this.q == null) {
          bool = true;
        } else {
          bool = false;
        } 
        ViewTreeObserver viewTreeObserver = view1.getViewTreeObserver();
        this.q = viewTreeObserver;
        if (bool)
          viewTreeObserver.addOnGlobalLayoutListener(this.k); 
        view1.addOnAttachStateChangeListener(this.l);
        fx01.q = view1;
        fx01.n = this.u;
        boolean bool1 = this.s;
        Context context = this.c;
        ow0 ow01 = this.f;
        if (!bool1) {
          this.t = zw0.m((ListAdapter)ow01, context, this.h);
          this.s = true;
        } 
        fx01.r(this.t);
        f71.setInputMethodMode(2);
        Rect rect = this.b;
        if (rect != null) {
          rect = new Rect(rect);
        } else {
          rect = null;
        } 
        fx01.z = rect;
        fx01.d();
        y10 y10 = fx01.e;
        y10.setOnKeyListener(this);
        if (this.v) {
          rw0 rw01 = this.e;
          if (rw01.m != null) {
            FrameLayout frameLayout = (FrameLayout)LayoutInflater.from(context).inflate(2131492882, (ViewGroup)y10, false);
            TextView textView = (TextView)frameLayout.findViewById(16908310);
            if (textView != null)
              textView.setText(rw01.m); 
            frameLayout.setEnabled(false);
            y10.addHeaderView((View)frameLayout, null, false);
          } 
        } 
        fx01.q((ListAdapter)ow01);
        fx01.d();
        return;
      } 
    } 
    tp.f("StandardMenuPopup cannot be used without an anchor");
  }
  
  public final void dismiss() {
    if (b())
      this.j.dismiss(); 
  }
  
  public final void e(gx0 paramgx0) {
    this.p = paramgx0;
  }
  
  public final void g() {
    this.s = false;
    ow0 ow01 = this.f;
    if (ow01 != null)
      ow01.notifyDataSetChanged(); 
  }
  
  public final y10 h() {
    return this.j.e;
  }
  
  public final boolean j(tq1 paramtq1) {
    if (paramtq1.hasVisibleItems()) {
      boolean bool;
      View view = this.o;
      int i = this.i;
      bx0 bx0 = new bx0(this.c, paramtq1, view, this.g, i, 0);
      gx0 gx02 = this.p;
      bx0.h = gx02;
      zw0 zw01 = bx0.i;
      if (zw01 != null)
        zw01.e(gx02); 
      int j = paramtq1.f.size();
      i = 0;
      while (true) {
        if (i < j) {
          MenuItem menuItem = paramtq1.getItem(i);
          if (menuItem.isVisible() && menuItem.getIcon() != null) {
            boolean bool1 = true;
            break;
          } 
          i++;
          continue;
        } 
        bool = false;
        break;
      } 
      bx0.d(bool);
      bx0.j = this.m;
      this.m = null;
      this.e.c(false);
      fx0 fx01 = this.j;
      j = fx01.h;
      int k = fx01.o();
      i = j;
      if ((Gravity.getAbsoluteGravity(this.u, this.n.getLayoutDirection()) & 0x7) == 5)
        i = j + this.n.getWidth(); 
      if (!bx0.b()) {
        if (bx0.e == null)
          return false; 
        bx0.f(i, k, true, true);
      } 
      gx0 gx01 = this.p;
      if (gx01 != null)
        gx01.k(paramtq1); 
      return true;
    } 
    return false;
  }
  
  public final boolean k() {
    return false;
  }
  
  public final void l(rw0 paramrw0) {}
  
  public final void n(View paramView) {
    this.n = paramView;
  }
  
  public final void o(boolean paramBoolean) {
    this.f.e = paramBoolean;
  }
  
  public final void onDismiss() {
    this.r = true;
    this.e.c(true);
    ViewTreeObserver viewTreeObserver = this.q;
    if (viewTreeObserver != null) {
      if (!viewTreeObserver.isAlive())
        this.q = this.o.getViewTreeObserver(); 
      this.q.removeGlobalOnLayoutListener(this.k);
      this.q = null;
    } 
    this.o.removeOnAttachStateChangeListener(this.l);
    PopupWindow.OnDismissListener onDismissListener = this.m;
    if (onDismissListener != null)
      onDismissListener.onDismiss(); 
  }
  
  public final boolean onKey(View paramView, int paramInt, KeyEvent paramKeyEvent) {
    if (paramKeyEvent.getAction() == 1 && paramInt == 82) {
      dismiss();
      return true;
    } 
    return false;
  }
  
  public final void p(int paramInt) {
    this.u = paramInt;
  }
  
  public final void q(int paramInt) {
    this.j.h = paramInt;
  }
  
  public final void r(PopupWindow.OnDismissListener paramOnDismissListener) {
    this.m = paramOnDismissListener;
  }
  
  public final void s(boolean paramBoolean) {
    this.v = paramBoolean;
  }
  
  public final void t(int paramInt) {
    this.j.k(paramInt);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\dp1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
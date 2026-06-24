import android.view.View;
import in.krosbits.android.widgets.swipetoloadlayout.SwipeToLoadLayout;

public final class tr1 implements wr1 {
  public final SwipeToLoadLayout b;
  
  public tr1(SwipeToLoadLayout paramSwipeToLoadLayout) {
    this.b = paramSwipeToLoadLayout;
  }
  
  public final void a(int paramInt, boolean paramBoolean1, boolean paramBoolean2) {
    SwipeToLoadLayout swipeToLoadLayout = this.b;
    View view = swipeToLoadLayout.h;
    if (view != null && view instanceof wr1 && swipeToLoadLayout.p > 0) {
      if (view.getVisibility() != 0)
        swipeToLoadLayout.h.setVisibility(0); 
      ((wr1)swipeToLoadLayout.h).a(paramInt, paramBoolean1, paramBoolean2);
    } 
  }
  
  public final void b(int paramInt) {}
  
  public final void c() {
    SwipeToLoadLayout swipeToLoadLayout = this.b;
    if (swipeToLoadLayout.h != null && swipeToLoadLayout.p == 3) {
      l41 l41 = swipeToLoadLayout.e;
      if (l41 != null)
        l41.D(); 
    } 
  }
  
  public final void d() {
    SwipeToLoadLayout swipeToLoadLayout = this.b;
    View view = swipeToLoadLayout.h;
    if (view != null && view instanceof wr1 && qv.a(swipeToLoadLayout.p))
      ((wr1)swipeToLoadLayout.h).d(); 
  }
  
  public final void e() {
    SwipeToLoadLayout swipeToLoadLayout = this.b;
    View view = swipeToLoadLayout.h;
    if (view != null && view instanceof wr1 && swipeToLoadLayout.p == 0) {
      view.setVisibility(0);
      ((wr1)swipeToLoadLayout.h).e();
    } 
  }
  
  public final void f() {
    SwipeToLoadLayout swipeToLoadLayout = this.b;
    View view = swipeToLoadLayout.h;
    if (view != null && view instanceof wr1 && swipeToLoadLayout.p == 0) {
      ((wr1)view).f();
      swipeToLoadLayout.h.setVisibility(8);
    } 
  }
  
  public final void onComplete() {
    View view = this.b.h;
    if (view != null && view instanceof wr1)
      ((wr1)view).onComplete(); 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\tr1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
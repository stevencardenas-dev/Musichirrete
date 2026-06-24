import android.view.View;
import in.krosbits.android.widgets.swipetoloadlayout.SwipeToLoadLayout;

public final class sr1 implements wr1, rr1 {
  public final SwipeToLoadLayout b;
  
  public sr1(SwipeToLoadLayout paramSwipeToLoadLayout) {
    this.b = paramSwipeToLoadLayout;
  }
  
  public final void a(int paramInt, boolean paramBoolean1, boolean paramBoolean2) {
    SwipeToLoadLayout swipeToLoadLayout = this.b;
    View view = swipeToLoadLayout.f;
    if (view != null && view instanceof wr1 && swipeToLoadLayout.p < 0) {
      if (view.getVisibility() != 0)
        swipeToLoadLayout.f.setVisibility(0); 
      ((wr1)swipeToLoadLayout.f).a(paramInt, paramBoolean1, paramBoolean2);
    } 
  }
  
  public final void b(int paramInt) {}
  
  public final void c() {
    SwipeToLoadLayout swipeToLoadLayout = this.b;
    View view = swipeToLoadLayout.f;
    if (view != null && swipeToLoadLayout.p == -3) {
      if (view instanceof rr1)
        ((rr1)view).c(); 
      o41 o41 = swipeToLoadLayout.c;
      if (o41 != null)
        o41.c(); 
    } 
  }
  
  public final void d() {
    SwipeToLoadLayout swipeToLoadLayout = this.b;
    View view = swipeToLoadLayout.f;
    if (view != null && view instanceof wr1 && qv.b(swipeToLoadLayout.p))
      ((wr1)swipeToLoadLayout.f).d(); 
  }
  
  public final void e() {
    SwipeToLoadLayout swipeToLoadLayout = this.b;
    View view = swipeToLoadLayout.f;
    if (view != null && view instanceof wr1 && swipeToLoadLayout.p == 0) {
      view.setVisibility(0);
      ((wr1)swipeToLoadLayout.f).e();
    } 
  }
  
  public final void f() {
    SwipeToLoadLayout swipeToLoadLayout = this.b;
    View view = swipeToLoadLayout.f;
    if (view != null && view instanceof wr1 && swipeToLoadLayout.p == 0) {
      ((wr1)view).f();
      swipeToLoadLayout.f.setVisibility(8);
    } 
  }
  
  public final void onComplete() {
    View view = this.b.f;
    if (view != null && view instanceof wr1)
      ((wr1)view).onComplete(); 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\sr1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
import android.widget.Scroller;
import in.krosbits.android.widgets.swipetoloadlayout.SwipeToLoadLayout;

public final class ur1 implements Runnable {
  public final Scroller b;
  
  public int c;
  
  public boolean e;
  
  public boolean f;
  
  public final SwipeToLoadLayout g;
  
  public ur1(SwipeToLoadLayout paramSwipeToLoadLayout) {
    this.g = paramSwipeToLoadLayout;
    this.e = false;
    this.f = false;
    this.b = new Scroller(paramSwipeToLoadLayout.getContext());
  }
  
  public static void a(ur1 paramur1, int paramInt1, int paramInt2) {
    SwipeToLoadLayout swipeToLoadLayout = paramur1.g;
    swipeToLoadLayout.removeCallbacks(paramur1);
    paramur1.c = 0;
    Scroller scroller = paramur1.b;
    if (!scroller.isFinished())
      scroller.forceFinished(true); 
    scroller.startScroll(0, 0, 0, paramInt1, paramInt2);
    swipeToLoadLayout.post(paramur1);
    paramur1.e = true;
  }
  
  public final void run() {
    int i;
    Scroller scroller = this.b;
    if (!scroller.computeScrollOffset() || scroller.isFinished()) {
      i = 1;
    } else {
      i = 0;
    } 
    int j = scroller.getCurrY();
    int k = this.c;
    SwipeToLoadLayout swipeToLoadLayout = this.g;
    if (i) {
      this.c = 0;
      this.e = false;
      swipeToLoadLayout.removeCallbacks(this);
      if (!this.f) {
        i = SwipeToLoadLayout.Q;
        swipeToLoadLayout.a();
      } 
      return;
    } 
    this.c = j;
    float f = (j - k);
    tr1 tr1 = swipeToLoadLayout.P;
    sr1 sr1 = swipeToLoadLayout.O;
    if (qv.c(swipeToLoadLayout.p)) {
      sr1.a(swipeToLoadLayout.r, false, true);
    } else if (qv.b(swipeToLoadLayout.p)) {
      sr1.a(swipeToLoadLayout.r, false, true);
    } else {
      i = swipeToLoadLayout.p;
      if (i == -3) {
        sr1.a(swipeToLoadLayout.r, true, true);
      } else if (i == 1) {
        tr1.a(swipeToLoadLayout.r, false, true);
      } else if (qv.a(i)) {
        tr1.a(swipeToLoadLayout.r, false, true);
      } else if (swipeToLoadLayout.p == 3) {
        tr1.a(swipeToLoadLayout.r, true, true);
      } 
    } 
    swipeToLoadLayout.k(f);
    swipeToLoadLayout.post(this);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar\\ur1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
import android.view.animation.Animation;
import androidx.mediarouter.app.OverlayListView;
import java.util.ArrayList;

public final class gu0 implements Animation.AnimationListener {
  public final int a;
  
  public final qu0 b;
  
  private final void a(Animation paramAnimation) {}
  
  private final void b(Animation paramAnimation) {}
  
  private final void c(Animation paramAnimation) {}
  
  private final void d(Animation paramAnimation) {}
  
  public final void onAnimationEnd(Animation paramAnimation) {
    switch (this.a) {
      default:
        return;
      case 0:
        break;
    } 
    this.b.k(true);
  }
  
  public final void onAnimationRepeat(Animation paramAnimation) {
    int i = this.a;
  }
  
  public final void onAnimationStart(Animation paramAnimation) {
    qu0 qu01;
    int i;
    int j;
    OverlayListView overlayListView;
    ArrayList<Object> arrayList;
    switch (this.a) {
      default:
        qu01 = this.b;
        overlayListView = qu01.H;
        arrayList = overlayListView.b;
        j = arrayList.size();
        i = 0;
        while (i < j) {
          j51 j51 = (j51)arrayList.get(i);
          int k = i + 1;
          j51 = j51;
          i = k;
          if (!j51.j) {
            j51.i = overlayListView.getDrawingTime();
            j51.j = true;
            i = k;
          } 
        } 
        qu01.H.postDelayed(qu01.r0, qu01.k0);
        break;
      case 0:
        break;
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\gu0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
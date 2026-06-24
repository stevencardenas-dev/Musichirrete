import android.view.View;
import android.view.ViewTreeObserver;
import in.krosbits.musicolet.MostPlayedActivity;

public final class by0 implements ViewTreeObserver.OnGlobalLayoutListener {
  public final View b;
  
  public final MostPlayedActivity c;
  
  public by0(MostPlayedActivity paramMostPlayedActivity, View paramView) {
    this.c = paramMostPlayedActivity;
    this.b = paramView;
  }
  
  public final void onGlobalLayout() {
    MostPlayedActivity mostPlayedActivity = this.c;
    View view = this.b;
    try {
      view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
      if (view.getParent() == null || view.getWidth() == 0)
        return; 
      hq0 hq0 = new hq0();
      this(1, this);
      mostPlayedActivity.R = hq0;
      hq0.start();
      return;
    } catch (Exception exception) {
      exception.printStackTrace();
      mostPlayedActivity.finish();
      return;
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\by0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
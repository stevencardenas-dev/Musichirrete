import android.content.Context;
import android.view.View;
import android.view.animation.PathInterpolator;

public abstract class wr0 {
  public final PathInterpolator a = new PathInterpolator(0.1F, 0.1F, 0.0F, 1.0F);
  
  public final View b;
  
  public final int c;
  
  public final int d;
  
  public final int e;
  
  public kb f;
  
  public wr0(View paramView) {
    this.b = paramView;
    Context context = paramView.getContext();
    this.c = zo2.P(context, 2130969687, 300);
    this.d = zo2.P(context, 2130969692, 150);
    this.e = zo2.P(context, 2130969691, 100);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\wr0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.transformation.ExpandableBehavior;

public final class y60 implements ViewTreeObserver.OnPreDrawListener {
  public final View b;
  
  public final int c;
  
  public final z60 e;
  
  public final ExpandableBehavior f;
  
  public y60(ExpandableBehavior paramExpandableBehavior, View paramView, int paramInt, z60 paramz60) {
    this.f = paramExpandableBehavior;
    this.b = paramView;
    this.c = paramInt;
    this.e = paramz60;
  }
  
  public final boolean onPreDraw() {
    View view = this.b;
    view.getViewTreeObserver().removeOnPreDrawListener(this);
    ExpandableBehavior expandableBehavior = this.f;
    if (expandableBehavior.a == this.c) {
      z60 z601 = this.e;
      expandableBehavior.w((View)z601, view, ((FloatingActionButton)z601).q.a, false);
    } 
    return false;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\y60.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
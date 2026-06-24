import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.esafirm.stubutton.StuButton;

public final class js implements ViewTreeObserver.OnPreDrawListener {
  public final int b;
  
  public final ViewGroup c;
  
  public final boolean onPreDraw() {
    StuButton stuButton;
    int i = this.b;
    ViewGroup viewGroup = this.c;
    switch (i) {
      default:
        stuButton = (StuButton)viewGroup;
        stuButton.c.getViewTreeObserver().removeOnPreDrawListener(this);
        stuButton.g = stuButton.c.getWidth();
        return false;
      case 0:
        break;
    } 
    ((CoordinatorLayout)stuButton).q(0);
    return true;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\js.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
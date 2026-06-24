import android.graphics.Matrix;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

public abstract class d32 {
  public static final ThreadLocal a = new ThreadLocal();
  
  public static final ThreadLocal b = new ThreadLocal();
  
  public static void a(CoordinatorLayout paramCoordinatorLayout, View paramView, Matrix paramMatrix) {
    ViewParent viewParent = paramView.getParent();
    if (viewParent instanceof View && viewParent != paramCoordinatorLayout) {
      View view = (View)viewParent;
      a(paramCoordinatorLayout, view, paramMatrix);
      paramMatrix.preTranslate(-view.getScrollX(), -view.getScrollY());
    } 
    paramMatrix.preTranslate(paramView.getLeft(), paramView.getTop());
    if (!paramView.getMatrix().isIdentity())
      paramMatrix.preConcat(paramView.getMatrix()); 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\d32.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
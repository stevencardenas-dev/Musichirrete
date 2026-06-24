import android.graphics.Matrix;
import android.view.View;

public abstract class f42 {
  public static void a(View paramView, Matrix paramMatrix) {
    paramView.setAnimationMatrix(paramMatrix);
  }
  
  public static void b(View paramView, Matrix paramMatrix) {
    paramView.transformMatrixToGlobal(paramMatrix);
  }
  
  public static void c(View paramView, Matrix paramMatrix) {
    paramView.transformMatrixToLocal(paramMatrix);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\f42.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
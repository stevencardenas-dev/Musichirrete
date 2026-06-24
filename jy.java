import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

public abstract class jy {
  public static final ThreadLocal a = new ThreadLocal();
  
  public static final ThreadLocal b = new ThreadLocal();
  
  public static void a(ViewGroup paramViewGroup, View paramView, Rect paramRect) {
    paramRect.set(0, 0, paramView.getWidth(), paramView.getHeight());
    c(paramViewGroup, paramView, paramRect);
  }
  
  public static void b(ViewParent paramViewParent, View paramView, Matrix paramMatrix) {
    ViewParent viewParent = paramView.getParent();
    if (viewParent instanceof View && viewParent != paramViewParent) {
      View view = (View)viewParent;
      b(paramViewParent, view, paramMatrix);
      paramMatrix.preTranslate(-view.getScrollX(), -view.getScrollY());
    } 
    paramMatrix.preTranslate(paramView.getLeft(), paramView.getTop());
    if (!paramView.getMatrix().isIdentity())
      paramMatrix.preConcat(paramView.getMatrix()); 
  }
  
  public static void c(ViewGroup paramViewGroup, View paramView, Rect paramRect) {
    ThreadLocal<Matrix> threadLocal = a;
    Matrix matrix = threadLocal.get();
    if (matrix == null) {
      matrix = new Matrix();
      threadLocal.set(matrix);
    } else {
      matrix.reset();
    } 
    b((ViewParent)paramViewGroup, paramView, matrix);
    threadLocal = b;
    RectF rectF2 = (RectF)threadLocal.get();
    RectF rectF1 = rectF2;
    if (rectF2 == null) {
      rectF1 = new RectF();
      threadLocal.set(rectF1);
    } 
    rectF1.set(paramRect);
    matrix.mapRect(rectF1);
    paramRect.set((int)(rectF1.left + 0.5F), (int)(rectF1.top + 0.5F), (int)(rectF1.right + 0.5F), (int)(rectF1.bottom + 0.5F));
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\jy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
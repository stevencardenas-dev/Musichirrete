import android.graphics.Matrix;
import android.view.View;
import android.view.ViewGroup;

public final class j42 extends i42 {
  public final void M(View paramView, float paramFloat) {
    paramView.setTransitionAlpha(paramFloat);
  }
  
  public final void Z(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    paramView.setLeftTopRightBottom(paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public final void a0(View paramView, int paramInt) {
    paramView.setTransitionVisibility(paramInt);
  }
  
  public final void b0(View paramView, Matrix paramMatrix) {
    paramView.transformMatrixToGlobal(paramMatrix);
  }
  
  public final void c0(ViewGroup paramViewGroup, Matrix paramMatrix) {
    paramViewGroup.transformMatrixToLocal(paramMatrix);
  }
  
  public final float q(View paramView) {
    return paramView.getTransitionAlpha();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\j42.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
import android.view.View;
import androidx.appcompat.widget.SearchView;

public final class vg implements View.OnLayoutChangeListener {
  public final int a;
  
  public final Object b;
  
  public final void onLayoutChange(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8) {
    qv1 qv1;
    paramInt1 = this.a;
    Object object = this.b;
    switch (paramInt1) {
      default:
        qv1 = (qv1)object;
        object = new int[2];
        paramView.getLocationOnScreen((int[])object);
        qv1.V = object[0];
        paramView.getWindowVisibleDisplayFrame(qv1.O);
        return;
      case 1:
        ((SearchView)object).adjustDropDownSizeAndPosition();
        return;
      case 0:
        break;
    } 
    throw null;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\vg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
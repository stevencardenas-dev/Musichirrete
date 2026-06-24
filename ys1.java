import android.view.View;

public final class ys1 implements View.OnLayoutChangeListener {
  public final View a;
  
  public final zs1 b;
  
  public ys1(zs1 paramzs1, View paramView) {
    this.b = paramzs1;
    this.a = paramView;
  }
  
  public final void onLayoutChange(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8) {
    paramView = this.a;
    if (paramView.getVisibility() == 0)
      this.b.c(paramView); 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\ys1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
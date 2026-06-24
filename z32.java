import android.view.View;

public final class z32 implements View.OnAttachStateChangeListener {
  public final void onViewAttachedToWindow(View paramView) {
    paramView.removeOnAttachStateChangeListener(this);
    paramView.requestApplyInsets();
  }
  
  public final void onViewDetachedFromWindow(View paramView) {}
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\z32.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
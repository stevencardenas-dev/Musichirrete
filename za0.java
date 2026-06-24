import android.view.View;
import android.view.ViewGroup;

public final class za0 implements View.OnAttachStateChangeListener {
  public final int b;
  
  public final Object c;
  
  public final Object e;
  
  public za0(ab0 paramab0, sb0 paramsb0) {
    this.e = paramab0;
    this.c = paramsb0;
  }
  
  public za0(ViewGroup paramViewGroup, es1 parames1) {
    this.c = paramViewGroup;
    this.e = parames1;
  }
  
  private final void a(View paramView) {}
  
  public final void onViewAttachedToWindow(View paramView) {
    int i = this.b;
    Object object1 = this.e;
    Object object2 = this.c;
    switch (i) {
      default:
        ((ViewGroup)object2).addView((es1)object1, 0);
        paramView.removeOnAttachStateChangeListener(this);
        return;
      case 0:
        break;
    } 
    object2 = object2;
    ua0 ua0 = ((sb0)object2).c;
    object2.k();
    jx.i((ViewGroup)ua0.K.getParent(), ((ab0)object1).b).h();
  }
  
  public final void onViewDetachedFromWindow(View paramView) {
    switch (this.b) {
      default:
        ((ViewGroup)this.c).addView((es1)this.e, 0);
        paramView.removeOnAttachStateChangeListener(this);
        break;
      case 0:
        break;
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\za0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
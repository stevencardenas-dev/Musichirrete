import android.content.res.Resources;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;

public final class ys0 extends wr0 {
  public final float g;
  
  public final float h;
  
  public final float i;
  
  public ys0(View paramView) {
    super(paramView);
    Resources resources = paramView.getResources();
    this.g = resources.getDimension(2131165430);
    this.h = resources.getDimension(2131165429);
    this.i = resources.getDimension(2131165431);
  }
  
  public final void a(float paramFloat, boolean paramBoolean, int paramInt) {
    boolean bool;
    float f = this.a.getInterpolation(paramFloat);
    View view = this.b;
    int i = Gravity.getAbsoluteGravity(paramInt, view.getLayoutDirection());
    byte b = 0;
    paramInt = 1;
    if ((i & 0x3) == 3) {
      bool = true;
    } else {
      bool = false;
    } 
    if (paramBoolean != bool)
      paramInt = 0; 
    i = view.getWidth();
    int j = view.getHeight();
    paramFloat = i;
    if (paramFloat > 0.0F) {
      float f1 = j;
      if (f1 > 0.0F) {
        float f3 = this.g / paramFloat;
        float f2 = this.h / paramFloat;
        float f4 = this.i / f1;
        if (bool)
          paramFloat = 0.0F; 
        view.setPivotX(paramFloat);
        if (paramInt != 0) {
          paramFloat = f2;
        } else {
          paramFloat = -f3;
        } 
        f1 = g5.a(0.0F, paramFloat, f);
        f3 = f1 + 1.0F;
        f = 1.0F - g5.a(0.0F, f4, f);
        if (!Float.isNaN(f3) && !Float.isNaN(f)) {
          view.setScaleX(f3);
          view.setScaleY(f);
          if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup)view;
            while (b < viewGroup.getChildCount()) {
              view = viewGroup.getChildAt(b);
              if (bool) {
                j = view.getRight();
                paramFloat = (view.getWidth() + i - j);
              } else {
                paramFloat = -view.getLeft();
              } 
              view.setPivotX(paramFloat);
              view.setPivotY(-view.getTop());
              if (paramInt != 0) {
                paramFloat = 1.0F - f1;
              } else {
                paramFloat = 1.0F;
              } 
              if (f != 0.0F) {
                f2 = f3 / f * paramFloat;
              } else {
                f2 = 1.0F;
              } 
              if (!Float.isNaN(paramFloat) && !Float.isNaN(f2)) {
                view.setScaleX(paramFloat);
                view.setScaleY(f2);
              } 
              b++;
            } 
          } 
        } 
      } 
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\ys0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
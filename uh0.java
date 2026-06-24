import android.content.Context;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;

public abstract class uh0 extends ImageView {
  public boolean b = false;
  
  public final int c;
  
  public boolean e;
  
  public uh0(Context paramContext, int paramInt, boolean paramBoolean) {
    super(paramContext);
    this.c = paramInt;
    this.e = paramBoolean;
    if (paramInt == 0)
      this.c = (int)getResources().getDimension(2131165334); 
    paramInt = this.c;
    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(paramInt, paramInt);
    paramInt = getResources().getDimensionPixelSize(2131165333);
    layoutParams.gravity = 16;
    layoutParams.setMargins(paramInt, 0, paramInt, 0);
    setLayoutParams((ViewGroup.LayoutParams)layoutParams);
  }
  
  public final void a(int paramInt) {
    ScaleAnimation scaleAnimation = new ScaleAnimation(2.0F, 1.0F, 2.0F, 1.0F, 1, 0.5F, 1, 0.5F);
    scaleAnimation.setDuration(paramInt);
    scaleAnimation.setFillAfter(true);
    startAnimation((Animation)scaleAnimation);
  }
  
  public void b(boolean paramBoolean) {
    if (this.b != paramBoolean) {
      if (this.e) {
        if (paramBoolean) {
          c(150);
        } else {
          a(150);
        } 
      } else if (paramBoolean) {
        c(0);
      } else {
        a(0);
      } 
      this.b = paramBoolean;
    } 
  }
  
  public final void c(int paramInt) {
    ScaleAnimation scaleAnimation = new ScaleAnimation(1.0F, 2.0F, 1.0F, 2.0F, 1, 0.5F, 1, 0.5F);
    scaleAnimation.setDuration(paramInt);
    scaleAnimation.setFillAfter(true);
    startAnimation((Animation)scaleAnimation);
  }
  
  public void setMustAnimateChange(boolean paramBoolean) {
    this.e = paramBoolean;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar\\uh0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
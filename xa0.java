import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;

public final class xa0 extends AnimationSet implements Runnable {
  public final ViewGroup b;
  
  public final View c;
  
  public boolean e;
  
  public boolean f;
  
  public boolean g = true;
  
  public xa0(Animation paramAnimation, ViewGroup paramViewGroup, View paramView) {
    super(false);
    this.b = paramViewGroup;
    this.c = paramView;
    addAnimation(paramAnimation);
    paramViewGroup.post(this);
  }
  
  public final boolean getTransformation(long paramLong, Transformation paramTransformation) {
    this.g = true;
    if (this.e)
      return this.f ^ true; 
    if (!super.getTransformation(paramLong, paramTransformation)) {
      this.e = true;
      s41.a((View)this.b, this);
    } 
    return true;
  }
  
  public final boolean getTransformation(long paramLong, Transformation paramTransformation, float paramFloat) {
    this.g = true;
    if (this.e)
      return this.f ^ true; 
    if (!super.getTransformation(paramLong, paramTransformation, paramFloat)) {
      this.e = true;
      s41.a((View)this.b, this);
    } 
    return true;
  }
  
  public final void run() {
    boolean bool = this.e;
    ViewGroup viewGroup = this.b;
    if (!bool && this.g) {
      this.g = false;
      viewGroup.post(this);
      return;
    } 
    viewGroup.endViewTransition(this.c);
    this.f = true;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\xa0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
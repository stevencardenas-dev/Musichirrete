import android.view.View;

public final class k20 extends qv {
  public final int i;
  
  public final float A(Object paramObject) {
    switch (this.i) {
      default:
        return ((View)paramObject).getRotationY();
      case 4:
        return ((View)paramObject).getRotationX();
      case 3:
        return ((View)paramObject).getRotation();
      case 2:
        return ((View)paramObject).getScaleY();
      case 1:
        return ((View)paramObject).getScaleX();
      case 0:
        break;
    } 
    return ((View)paramObject).getAlpha();
  }
  
  public final void Z(Object paramObject, float paramFloat) {
    switch (this.i) {
      default:
        ((View)paramObject).setRotationY(paramFloat);
        return;
      case 4:
        ((View)paramObject).setRotationX(paramFloat);
        return;
      case 3:
        ((View)paramObject).setRotation(paramFloat);
        return;
      case 2:
        ((View)paramObject).setScaleY(paramFloat);
        return;
      case 1:
        ((View)paramObject).setScaleX(paramFloat);
        return;
      case 0:
        break;
    } 
    ((View)paramObject).setAlpha(paramFloat);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\k20.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.ActionBarContainer;

public final class h1 extends Drawable {
  public final ActionBarContainer a;
  
  public h1(ActionBarContainer paramActionBarContainer) {
    this.a = paramActionBarContainer;
  }
  
  public final void draw(Canvas paramCanvas) {
    Drawable drawable;
    ActionBarContainer actionBarContainer = this.a;
    if (actionBarContainer.i) {
      drawable = actionBarContainer.h;
      if (drawable != null) {
        drawable.draw(paramCanvas);
        return;
      } 
    } else {
      Drawable drawable1 = ((ActionBarContainer)drawable).f;
      if (drawable1 != null)
        drawable1.draw(paramCanvas); 
      drawable1 = ((ActionBarContainer)drawable).g;
      if (drawable1 != null && ((ActionBarContainer)drawable).j)
        drawable1.draw(paramCanvas); 
    } 
  }
  
  public final int getOpacity() {
    return 0;
  }
  
  public final void getOutline(Outline paramOutline) {
    ActionBarContainer actionBarContainer = this.a;
    if (actionBarContainer.i) {
      if (actionBarContainer.h != null) {
        actionBarContainer.f.getOutline(paramOutline);
        return;
      } 
    } else {
      Drawable drawable = actionBarContainer.f;
      if (drawable != null)
        drawable.getOutline(paramOutline); 
    } 
  }
  
  public final void setAlpha(int paramInt) {}
  
  public final void setColorFilter(ColorFilter paramColorFilter) {}
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\h1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
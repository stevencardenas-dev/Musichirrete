import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;

public abstract class n12 extends Drawable {
  public Drawable b;
  
  public void applyTheme(Resources.Theme paramTheme) {
    Drawable drawable = this.b;
    if (drawable != null)
      drawable.applyTheme(paramTheme); 
  }
  
  public final void clearColorFilter() {
    Drawable drawable = this.b;
    if (drawable != null) {
      drawable.clearColorFilter();
      return;
    } 
    super.clearColorFilter();
  }
  
  public final Drawable getCurrent() {
    Drawable drawable = this.b;
    return (drawable != null) ? drawable.getCurrent() : super.getCurrent();
  }
  
  public final int getMinimumHeight() {
    Drawable drawable = this.b;
    return (drawable != null) ? drawable.getMinimumHeight() : super.getMinimumHeight();
  }
  
  public final int getMinimumWidth() {
    Drawable drawable = this.b;
    return (drawable != null) ? drawable.getMinimumWidth() : super.getMinimumWidth();
  }
  
  public final boolean getPadding(Rect paramRect) {
    Drawable drawable = this.b;
    return (drawable != null) ? drawable.getPadding(paramRect) : super.getPadding(paramRect);
  }
  
  public final int[] getState() {
    Drawable drawable = this.b;
    return (drawable != null) ? drawable.getState() : super.getState();
  }
  
  public final Region getTransparentRegion() {
    Drawable drawable = this.b;
    return (drawable != null) ? drawable.getTransparentRegion() : super.getTransparentRegion();
  }
  
  public final void jumpToCurrentState() {
    Drawable drawable = this.b;
    if (drawable != null)
      drawable.jumpToCurrentState(); 
  }
  
  public boolean onLevelChange(int paramInt) {
    Drawable drawable = this.b;
    return (drawable != null) ? drawable.setLevel(paramInt) : super.onLevelChange(paramInt);
  }
  
  public final void setChangingConfigurations(int paramInt) {
    Drawable drawable = this.b;
    if (drawable != null) {
      drawable.setChangingConfigurations(paramInt);
      return;
    } 
    super.setChangingConfigurations(paramInt);
  }
  
  public final void setColorFilter(int paramInt, PorterDuff.Mode paramMode) {
    Drawable drawable = this.b;
    if (drawable != null) {
      drawable.setColorFilter(paramInt, paramMode);
      return;
    } 
    super.setColorFilter(paramInt, paramMode);
  }
  
  public final void setFilterBitmap(boolean paramBoolean) {
    Drawable drawable = this.b;
    if (drawable != null)
      drawable.setFilterBitmap(paramBoolean); 
  }
  
  public final void setHotspot(float paramFloat1, float paramFloat2) {
    Drawable drawable = this.b;
    if (drawable != null)
      drawable.setHotspot(paramFloat1, paramFloat2); 
  }
  
  public final void setHotspotBounds(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    Drawable drawable = this.b;
    if (drawable != null)
      drawable.setHotspotBounds(paramInt1, paramInt2, paramInt3, paramInt4); 
  }
  
  public final boolean setState(int[] paramArrayOfint) {
    Drawable drawable = this.b;
    return (drawable != null) ? drawable.setState(paramArrayOfint) : super.setState(paramArrayOfint);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\n12.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
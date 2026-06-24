import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;

public final class w10 extends Drawable implements Drawable.Callback {
  public Drawable b;
  
  public boolean c;
  
  public final void a(Canvas paramCanvas) {
    this.b.draw(paramCanvas);
  }
  
  public final void b(float paramFloat1, float paramFloat2) {
    this.b.setHotspot(paramFloat1, paramFloat2);
  }
  
  public final void c(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    this.b.setHotspotBounds(paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public final boolean d(boolean paramBoolean1, boolean paramBoolean2) {
    return (super.setVisible(paramBoolean1, paramBoolean2) || this.b.setVisible(paramBoolean1, paramBoolean2));
  }
  
  public final void draw(Canvas paramCanvas) {
    if (this.c)
      a(paramCanvas); 
  }
  
  public final int getChangingConfigurations() {
    return this.b.getChangingConfigurations();
  }
  
  public final Drawable getCurrent() {
    return this.b.getCurrent();
  }
  
  public final int getIntrinsicHeight() {
    return this.b.getIntrinsicHeight();
  }
  
  public final int getIntrinsicWidth() {
    return this.b.getIntrinsicWidth();
  }
  
  public final int getMinimumHeight() {
    return this.b.getMinimumHeight();
  }
  
  public final int getMinimumWidth() {
    return this.b.getMinimumWidth();
  }
  
  public final int getOpacity() {
    return this.b.getOpacity();
  }
  
  public final boolean getPadding(Rect paramRect) {
    return this.b.getPadding(paramRect);
  }
  
  public final int[] getState() {
    return this.b.getState();
  }
  
  public final Region getTransparentRegion() {
    return this.b.getTransparentRegion();
  }
  
  public final void invalidateDrawable(Drawable paramDrawable) {
    invalidateSelf();
  }
  
  public final boolean isAutoMirrored() {
    return this.b.isAutoMirrored();
  }
  
  public final boolean isStateful() {
    return this.b.isStateful();
  }
  
  public final void jumpToCurrentState() {
    this.b.jumpToCurrentState();
  }
  
  public final void onBoundsChange(Rect paramRect) {
    this.b.setBounds(paramRect);
  }
  
  public final boolean onLevelChange(int paramInt) {
    return this.b.setLevel(paramInt);
  }
  
  public final void scheduleDrawable(Drawable paramDrawable, Runnable paramRunnable, long paramLong) {
    scheduleSelf(paramRunnable, paramLong);
  }
  
  public final void setAlpha(int paramInt) {
    this.b.setAlpha(paramInt);
  }
  
  public final void setAutoMirrored(boolean paramBoolean) {
    this.b.setAutoMirrored(paramBoolean);
  }
  
  public final void setChangingConfigurations(int paramInt) {
    this.b.setChangingConfigurations(paramInt);
  }
  
  public final void setColorFilter(ColorFilter paramColorFilter) {
    this.b.setColorFilter(paramColorFilter);
  }
  
  public final void setDither(boolean paramBoolean) {
    this.b.setDither(paramBoolean);
  }
  
  public final void setFilterBitmap(boolean paramBoolean) {
    this.b.setFilterBitmap(paramBoolean);
  }
  
  public final void setHotspot(float paramFloat1, float paramFloat2) {
    if (this.c)
      b(paramFloat1, paramFloat2); 
  }
  
  public final void setHotspotBounds(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    if (this.c)
      c(paramInt1, paramInt2, paramInt3, paramInt4); 
  }
  
  public final boolean setState(int[] paramArrayOfint) {
    return this.c ? this.b.setState(paramArrayOfint) : false;
  }
  
  public final void setTint(int paramInt) {
    this.b.setTint(paramInt);
  }
  
  public final void setTintList(ColorStateList paramColorStateList) {
    this.b.setTintList(paramColorStateList);
  }
  
  public final void setTintMode(PorterDuff.Mode paramMode) {
    this.b.setTintMode(paramMode);
  }
  
  public final boolean setVisible(boolean paramBoolean1, boolean paramBoolean2) {
    return this.c ? d(paramBoolean1, paramBoolean2) : false;
  }
  
  public final void unscheduleDrawable(Drawable paramDrawable, Runnable paramRunnable) {
    unscheduleSelf(paramRunnable);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\w10.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
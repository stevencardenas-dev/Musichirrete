package androidx.mediarouter.app;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.util.Log;
import androidx.appcompat.widget.AppCompatSeekBar;
import qz1;

public class MediaRouteVolumeSlider extends AppCompatSeekBar {
  public final float c;
  
  public boolean e;
  
  public Drawable f;
  
  public int g;
  
  public int h;
  
  public MediaRouteVolumeSlider(Context paramContext) {
    this(paramContext, null);
  }
  
  public MediaRouteVolumeSlider(Context paramContext, AttributeSet paramAttributeSet) {
    this(paramContext, paramAttributeSet, 2130969898);
  }
  
  public MediaRouteVolumeSlider(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(paramContext, paramAttributeSet, paramInt);
    this.c = qz1.x(paramContext);
  }
  
  public final void a(int paramInt1, int paramInt2) {
    if (this.g != paramInt1) {
      if (Color.alpha(paramInt1) != 255) {
        StringBuilder stringBuilder = new StringBuilder("Volume slider progress and thumb color cannot be translucent: #");
        stringBuilder.append(Integer.toHexString(paramInt1));
        Log.e("MediaRouteVolumeSlider", stringBuilder.toString());
      } 
      this.g = paramInt1;
    } 
    if (this.h != paramInt2) {
      if (Color.alpha(paramInt2) != 255) {
        StringBuilder stringBuilder = new StringBuilder("Volume slider background color cannot be translucent: #");
        stringBuilder.append(Integer.toHexString(paramInt2));
        Log.e("MediaRouteVolumeSlider", stringBuilder.toString());
      } 
      this.h = paramInt2;
    } 
  }
  
  public final void b(boolean paramBoolean) {
    Drawable drawable;
    if (this.e == paramBoolean)
      return; 
    this.e = paramBoolean;
    if (paramBoolean) {
      drawable = null;
    } else {
      drawable = this.f;
    } 
    super.setThumb(drawable);
  }
  
  public final void drawableStateChanged() {
    int i;
    super.drawableStateChanged();
    if (isEnabled()) {
      i = 255;
    } else {
      i = (int)(this.c * 255.0F);
    } 
    Drawable drawable1 = this.f;
    int j = this.g;
    PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
    drawable1.setColorFilter(j, mode);
    this.f.setAlpha(i);
    Drawable drawable2 = getProgressDrawable();
    drawable1 = drawable2;
    if (drawable2 instanceof LayerDrawable) {
      LayerDrawable layerDrawable = (LayerDrawable)getProgressDrawable();
      drawable1 = layerDrawable.findDrawableByLayerId(16908301);
      layerDrawable.findDrawableByLayerId(16908288).setColorFilter(this.h, mode);
    } 
    drawable1.setColorFilter(this.g, mode);
    drawable1.setAlpha(i);
  }
  
  public final void setThumb(Drawable paramDrawable) {
    this.f = paramDrawable;
    if (this.e)
      paramDrawable = null; 
    super.setThumb(paramDrawable);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\androidx\mediarouter\app\MediaRouteVolumeSlider.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
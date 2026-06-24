package com.google.android.gms.cast.framework.internal.featurehighlight;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;

class InnerZoneDrawable extends Drawable {
  public float a;
  
  public float b;
  
  public final void draw(Canvas paramCanvas) {
    if (this.b <= 0.0F) {
      paramCanvas.drawCircle(0.0F, 0.0F, this.a * 0.0F, null);
      return;
    } 
    throw null;
  }
  
  public final int getOpacity() {
    return -3;
  }
  
  public final void setAlpha(int paramInt) {
    throw null;
  }
  
  public final void setColorFilter(ColorFilter paramColorFilter) {
    throw null;
  }
  
  public void setPulseAlpha(float paramFloat) {
    this.b = paramFloat;
    invalidateSelf();
  }
  
  public void setPulseScale(float paramFloat) {
    invalidateSelf();
  }
  
  public void setScale(float paramFloat) {
    this.a = paramFloat;
    invalidateSelf();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\com\google\android\gms\cast\framework\internal\featurehighlight\InnerZoneDrawable.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
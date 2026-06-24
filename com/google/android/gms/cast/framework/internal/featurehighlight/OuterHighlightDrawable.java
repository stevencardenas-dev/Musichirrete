package com.google.android.gms.cast.framework.internal.featurehighlight;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;

class OuterHighlightDrawable extends Drawable {
  public float a;
  
  public float b;
  
  public float c;
  
  public final void draw(Canvas paramCanvas) {
    paramCanvas.drawCircle(this.b + 0.0F, this.c + 0.0F, 0.0F * this.a, null);
  }
  
  public final int getAlpha() {
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
  
  public void setScale(float paramFloat) {
    this.a = paramFloat;
    invalidateSelf();
  }
  
  public void setTranslationX(float paramFloat) {
    this.b = paramFloat;
    invalidateSelf();
  }
  
  public void setTranslationY(float paramFloat) {
    this.c = paramFloat;
    invalidateSelf();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\com\google\android\gms\cast\framework\internal\featurehighlight\OuterHighlightDrawable.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
package uk.co.senab.photoview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.View;
import android.widget.ImageView;
import m61;
import p61;
import q61;
import r61;
import s61;
import t61;
import tg0;
import tw;
import u61;

public class PhotoView extends ImageView implements tg0 {
  public u61 b;
  
  public ImageView.ScaleType c;
  
  public PhotoView(Context paramContext) {
    this(paramContext, null);
  }
  
  public PhotoView(Context paramContext, AttributeSet paramAttributeSet) {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public PhotoView(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(paramContext, paramAttributeSet, paramInt);
    super.setScaleType(ImageView.ScaleType.MATRIX);
    u61 u611 = this.b;
    if (u611 == null || u611.h() == null)
      this.b = new u61(this); 
    ImageView.ScaleType scaleType = this.c;
    if (scaleType != null) {
      setScaleType(scaleType);
      this.c = null;
    } 
  }
  
  public RectF getDisplayRect() {
    u61 u611 = this.b;
    u611.c();
    return u611.f(u611.g());
  }
  
  public tg0 getIPhotoViewImplementation() {
    return (tg0)this.b;
  }
  
  public Matrix getImageMatrix() {
    return this.b.n;
  }
  
  public float getMaximumScale() {
    return this.b.g;
  }
  
  public float getMediumScale() {
    return this.b.f;
  }
  
  public float getMinimumScale() {
    return this.b.e;
  }
  
  public float getScale() {
    return this.b.k();
  }
  
  public ImageView.ScaleType getScaleType() {
    return this.b.A;
  }
  
  public Bitmap getVisibleRectangleBitmap() {
    ImageView imageView = this.b.h();
    return (imageView == null) ? null : imageView.getDrawingCache();
  }
  
  public final void onAttachedToWindow() {
    u61 u611 = this.b;
    if (u611 == null || u611.h() == null)
      this.b = new u61(this); 
    ImageView.ScaleType scaleType = this.c;
    if (scaleType != null) {
      setScaleType(scaleType);
      this.c = null;
    } 
    super.onAttachedToWindow();
  }
  
  public final void onDetachedFromWindow() {
    this.b.e();
    this.b = null;
    super.onDetachedFromWindow();
  }
  
  public final void onMeasure(int paramInt1, int paramInt2) {
    if (View.MeasureSpec.getMode(paramInt2) == 0)
      try {
        Drawable drawable = getDrawable();
        if (drawable == null) {
          setMeasuredDimension(0, 0);
          return;
        } 
        int j = View.MeasureSpec.getSize(paramInt1);
        View.MeasureSpec.getSize(paramInt2);
        int i = drawable.getIntrinsicHeight() * j / drawable.getIntrinsicWidth();
        setMeasuredDimension(j, i);
        setMeasuredDimension(j, i);
        return;
      } catch (Exception exception) {
        super.onMeasure(paramInt1, paramInt2);
        return;
      }  
    super.onMeasure(paramInt1, paramInt2);
  }
  
  public void setAllowParentInterceptOnEdge(boolean paramBoolean) {
    this.b.h = paramBoolean;
  }
  
  public final boolean setFrame(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    boolean bool = super.setFrame(paramInt1, paramInt2, paramInt3, paramInt4);
    u61 u611 = this.b;
    if (u611 != null)
      u611.o(); 
    return bool;
  }
  
  public void setImageDrawable(Drawable paramDrawable) {
    super.setImageDrawable(paramDrawable);
    u61 u611 = this.b;
    if (u611 != null)
      u611.o(); 
  }
  
  public void setImageResource(int paramInt) {
    super.setImageResource(paramInt);
    u61 u611 = this.b;
    if (u611 != null)
      u611.o(); 
  }
  
  public void setImageURI(Uri paramUri) {
    super.setImageURI(paramUri);
    u61 u611 = this.b;
    if (u611 != null)
      u611.o(); 
  }
  
  public void setMaximumScale(float paramFloat) {
    u61 u611 = this.b;
    u61.d(u611.e, u611.f, paramFloat);
    u611.g = paramFloat;
  }
  
  public void setMediumScale(float paramFloat) {
    u61 u611 = this.b;
    u61.d(u611.e, paramFloat, u611.g);
    u611.f = paramFloat;
  }
  
  public void setMinimumScale(float paramFloat) {
    u61 u611 = this.b;
    u61.d(paramFloat, u611.f, u611.g);
    u611.e = paramFloat;
  }
  
  public void setOnDoubleTapListener(GestureDetector.OnDoubleTapListener paramOnDoubleTapListener) {
    u61 u611 = this.b;
    GestureDetector gestureDetector = u611.k;
    if (paramOnDoubleTapListener != null) {
      gestureDetector.setOnDoubleTapListener(paramOnDoubleTapListener);
      return;
    } 
    gestureDetector.setOnDoubleTapListener((GestureDetector.OnDoubleTapListener)new tw(u611));
  }
  
  public void setOnLongClickListener(View.OnLongClickListener paramOnLongClickListener) {
    this.b.s = paramOnLongClickListener;
  }
  
  public void setOnMatrixChangeListener(p61 paramp61) {
    this.b.getClass();
  }
  
  public void setOnPhotoTapListener(q61 paramq61) {
    this.b.r = paramq61;
  }
  
  public void setOnScaleChangeListener(r61 paramr61) {
    this.b.getClass();
  }
  
  public void setOnSingleFlingListener(s61 params61) {
    this.b.getClass();
  }
  
  public void setOnViewTapListener(t61 paramt61) {
    this.b.getClass();
  }
  
  public void setRotationBy(float paramFloat) {
    u61 u611 = this.b;
    u611.o.postRotate(paramFloat % 360.0F);
    u611.b();
  }
  
  public void setRotationTo(float paramFloat) {
    u61 u611 = this.b;
    u611.o.setRotate(paramFloat % 360.0F);
    u611.b();
  }
  
  public void setScale(float paramFloat) {
    u61 u611 = this.b;
    ImageView imageView = u611.h();
    if (imageView != null)
      u611.n(paramFloat, (imageView.getRight() / 2), (imageView.getBottom() / 2), false); 
  }
  
  public void setScaleType(ImageView.ScaleType paramScaleType) {
    StringBuilder stringBuilder;
    u61 u611 = this.b;
    if (u611 != null) {
      u611.getClass();
      if (paramScaleType != null) {
        if (m61.a[paramScaleType.ordinal()] != 1) {
          if (paramScaleType != u611.A) {
            u611.A = paramScaleType;
            u611.o();
          } 
          return;
        } 
        String str = paramScaleType.name();
        stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append(" is not supported in PhotoView");
        throw new IllegalArgumentException(stringBuilder.toString());
      } 
      return;
    } 
    this.c = (ImageView.ScaleType)stringBuilder;
  }
  
  public void setZoomTransitionDuration(int paramInt) {
    u61 u611 = this.b;
    u611.getClass();
    int i = paramInt;
    if (paramInt < 0)
      i = 200; 
    u611.c = i;
  }
  
  public void setZoomable(boolean paramBoolean) {
    u61 u611 = this.b;
    u611.z = paramBoolean;
    u611.o();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar\\uk\co\senab\photoview\PhotoView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
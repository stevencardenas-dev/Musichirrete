package in.krosbits.android.widgets;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Shader;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import bc1;
import bh0;
import com.google.android.material.textview.MaterialTextView;
import e6;
import mm1;
import nm1;

public class MSTextView extends MaterialTextView {
  public final nm1 j;
  
  public MSTextView(Context paramContext) {
    this(paramContext, null);
  }
  
  public MSTextView(Context paramContext, AttributeSet paramAttributeSet) {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public MSTextView(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(paramContext, paramAttributeSet, paramInt);
    TextPaint textPaint = getPaint();
    Object object = new Object();
    ((nm1)object).a = this;
    ((nm1)object).b = textPaint;
    ((nm1)object).g = -1;
    boolean bool = false;
    if (paramAttributeSet != null) {
      TypedArray typedArray = getContext().obtainStyledAttributes(paramAttributeSet, bc1.a, 0, 0);
      if (typedArray != null)
        try {
          ((nm1)object).g = typedArray.getColor(0, -1);
          typedArray.recycle();
        } catch (Exception exception) {
          Log.e("ShimmerTextView", "Error while creating the view:", exception);
          typedArray.recycle();
        } finally {} 
    } 
    ((nm1)object).e = new Matrix();
    this.j = (nm1)object;
    if (getVisibility() == 0)
      bool = true; 
    setShimmering(bool);
  }
  
  public MSTextView(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2) {
    this(paramContext, paramAttributeSet, paramInt1);
  }
  
  public float getGradientX() {
    nm1 nm11 = this.j;
    return (nm11 != null) ? nm11.c : 0.0F;
  }
  
  public int getPrimaryColor() {
    nm1 nm11 = this.j;
    return (nm11 != null) ? nm11.f : 0;
  }
  
  public int getReflectionColor() {
    nm1 nm11 = this.j;
    return (nm11 != null) ? nm11.g : 0;
  }
  
  public final void onDraw(Canvas paramCanvas) {
    nm1 nm11 = this.j;
    if (nm11 != null) {
      boolean bool = nm11.h;
      TextPaint textPaint = nm11.b;
      if (bool) {
        if (textPaint.getShader() == null)
          textPaint.setShader((Shader)nm11.d); 
        nm11.e.setTranslate(nm11.c * 2.0F, 0.0F);
        nm11.d.setLocalMatrix(nm11.e);
      } else {
        textPaint.setShader(null);
      } 
    } 
    super.onDraw(paramCanvas);
  }
  
  public final void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    nm1 nm11 = this.j;
    if (nm11 != null) {
      nm11.a();
      if (!nm11.i) {
        nm11.i = true;
        mm1 mm1 = nm11.j;
        if (mm1 != null) {
          bh0 bh0 = (bh0)mm1;
          try {
            ((e6)bh0.c).run();
            return;
          } catch (Exception exception) {
            exception.printStackTrace();
          } 
        } 
      } 
    } 
  }
  
  public final void onVisibilityChanged(View paramView, int paramInt) {
    boolean bool;
    super.onVisibilityChanged(paramView, paramInt);
    if (getVisibility() == 0) {
      bool = true;
    } else {
      bool = false;
    } 
    setShimmering(bool);
  }
  
  public void setAnimationSetupCallback(mm1 parammm1) {
    nm1 nm11 = this.j;
    if (nm11 != null)
      nm11.j = parammm1; 
  }
  
  public void setGradientX(float paramFloat) {
    nm1 nm11 = this.j;
    if (nm11 != null) {
      nm11.c = paramFloat;
      nm11.a.invalidate();
    } 
  }
  
  public void setPrimaryColor(int paramInt) {
    nm1 nm11 = this.j;
    if (nm11 != null) {
      nm11.f = paramInt;
      if (nm11.i)
        nm11.a(); 
    } 
  }
  
  public void setReflectionColor(int paramInt) {
    nm1 nm11 = this.j;
    if (nm11 != null) {
      nm11.g = paramInt;
      if (nm11.i)
        nm11.a(); 
    } 
  }
  
  public void setShimmering(boolean paramBoolean) {
    nm1 nm11 = this.j;
    if (nm11 != null)
      nm11.h = paramBoolean; 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\in\krosbits\android\widgets\MSTextView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
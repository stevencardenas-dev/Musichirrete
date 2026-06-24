package com.afollestad.materialdialogs.color;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.StateListDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.graphics.drawable.shapes.Shape;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.FrameLayout;
import wb1;

public class CircleView extends FrameLayout {
  public final int b;
  
  public final int c;
  
  public final Paint e;
  
  public final Paint f;
  
  public final Paint g;
  
  public boolean h;
  
  public CircleView(Context paramContext) {
    this(paramContext, null, 0);
  }
  
  public CircleView(Context paramContext, AttributeSet paramAttributeSet) {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public CircleView(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(paramContext, paramAttributeSet, paramInt);
    Resources resources = getResources();
    this.b = (int)TypedValue.applyDimension(1, 3.0F, resources.getDisplayMetrics());
    this.c = (int)TypedValue.applyDimension(1, 5.0F, resources.getDisplayMetrics());
    Paint paint = new Paint();
    this.f = paint;
    paint.setAntiAlias(true);
    paint.setColor(-1);
    paint = new Paint();
    this.g = paint;
    paint.setAntiAlias(true);
    paint = new Paint();
    this.e = paint;
    paint.setAntiAlias(true);
    TypedArray typedArray = paramContext.obtainStyledAttributes(paramAttributeSet, wb1.a);
    paramInt = typedArray.getColor(0, -12303292);
    typedArray.recycle();
    b(paramInt);
    setWillNotDraw(false);
  }
  
  public static int a(int paramInt, float paramFloat) {
    if (paramFloat == 1.0F)
      return paramInt; 
    float[] arrayOfFloat = new float[3];
    Color.colorToHSV(paramInt, arrayOfFloat);
    arrayOfFloat[2] = arrayOfFloat[2] * paramFloat;
    return Color.HSVToColor(arrayOfFloat);
  }
  
  public final void b(int paramInt) {
    this.g.setColor(paramInt);
    int i = a(paramInt, 0.9F);
    this.e.setColor(i);
    ShapeDrawable shapeDrawable = new ShapeDrawable((Shape)new OvalShape());
    Paint paint = shapeDrawable.getPaint();
    i = a(paramInt, 1.1F);
    paint.setColor(Color.argb(Math.round(Color.alpha(i) * 0.7F), Color.red(i), Color.green(i), Color.blue(i)));
    StateListDrawable stateListDrawable = new StateListDrawable();
    stateListDrawable.addState(new int[] { 16842919 }, (Drawable)shapeDrawable);
    paramInt = a(paramInt, 1.1F);
    setForeground((Drawable)new RippleDrawable(new ColorStateList(new int[][] { { 16842919 },  }, new int[] { paramInt }), (Drawable)stateListDrawable, null));
  }
  
  public final void onDraw(Canvas paramCanvas) {
    super.onDraw(paramCanvas);
    int i = getMeasuredWidth() / 2;
    boolean bool = this.h;
    Paint paint = this.g;
    if (bool) {
      int k = i - this.c;
      int j = this.b;
      paramCanvas.drawCircle((getMeasuredWidth() / 2), (getMeasuredHeight() / 2), i, this.e);
      paramCanvas.drawCircle((getMeasuredWidth() / 2), (getMeasuredHeight() / 2), k, this.f);
      paramCanvas.drawCircle((getMeasuredWidth() / 2), (getMeasuredHeight() / 2), (k - j), paint);
      return;
    } 
    paramCanvas.drawCircle((getMeasuredWidth() / 2), (getMeasuredHeight() / 2), i, paint);
  }
  
  public final void onMeasure(int paramInt1, int paramInt2) {
    super.onMeasure(paramInt1, paramInt1);
    setMeasuredDimension(getMeasuredWidth(), getMeasuredWidth());
  }
  
  @Deprecated
  public void setActivated(boolean paramBoolean) {
    throw new IllegalStateException("Cannot use setActivated() on CircleView.");
  }
  
  @Deprecated
  public void setBackground(Drawable paramDrawable) {
    throw new IllegalStateException("Cannot use setBackground() on CircleView.");
  }
  
  public void setBackgroundColor(int paramInt) {
    b(paramInt);
    requestLayout();
    invalidate();
  }
  
  @Deprecated
  public void setBackgroundDrawable(Drawable paramDrawable) {
    throw new IllegalStateException("Cannot use setBackgroundDrawable() on CircleView.");
  }
  
  public void setBackgroundResource(int paramInt) {
    setBackgroundColor(getContext().getColor(paramInt));
  }
  
  public void setSelected(boolean paramBoolean) {
    this.h = paramBoolean;
    requestLayout();
    invalidate();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\com\afollestad\materialdialogs\color\CircleView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
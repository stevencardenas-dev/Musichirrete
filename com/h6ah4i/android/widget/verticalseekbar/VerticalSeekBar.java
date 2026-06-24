package com.h6ah4i.android.widget.verticalseekbar;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import cc1;
import ga1;
import in.krosbits.android.widgets.AdvanceSeekbar;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import l0;
import v22;

public class VerticalSeekBar extends AdvanceSeekbar {
  public boolean t;
  
  public Method u;
  
  public int v = 90;
  
  public SeekBar.OnSeekBarChangeListener w;
  
  public VerticalSeekBar(Context paramContext) {
    super(paramContext);
    d(paramContext, null, 0);
  }
  
  public VerticalSeekBar(Context paramContext, AttributeSet paramAttributeSet) {
    super(paramContext, paramAttributeSet);
    d(paramContext, paramAttributeSet, 0);
  }
  
  public VerticalSeekBar(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(paramContext, paramAttributeSet, paramInt);
    d(paramContext, paramAttributeSet, paramInt);
  }
  
  private VerticalSeekBarWrapper getWrapper() {
    ViewParent viewParent = getParent();
    return (viewParent instanceof VerticalSeekBarWrapper) ? (VerticalSeekBarWrapper)viewParent : null;
  }
  
  public final void c(int paramInt) {
    /* monitor enter ThisExpression{ObjectType{com/h6ah4i/android/widget/verticalseekbar/VerticalSeekBar}} */
    try {
      Method method1 = this.u;
      if (method1 == null)
        try {
          method1 = ProgressBar.class.getDeclaredMethod("setProgress", new Class[] { int.class, boolean.class });
          method1.setAccessible(true);
          this.u = method1;
        } catch (NoSuchMethodException noSuchMethodException) {} 
    } finally {
      Exception exception;
    } 
    Method method = this.u;
    if (method != null) {
      try {
        method.invoke(this, new Object[] { Integer.valueOf(paramInt), Boolean.TRUE });
      } catch (IllegalArgumentException|IllegalAccessException|java.lang.reflect.InvocationTargetException illegalArgumentException) {}
    } else {
      super.setProgress(paramInt);
    } 
    onSizeChanged(getWidth(), getHeight(), 0, 0);
    /* monitor exit ThisExpression{ObjectType{com/h6ah4i/android/widget/verticalseekbar/VerticalSeekBar}} */
  }
  
  public final void d(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    WeakHashMap weakHashMap = v22.a;
    setLayoutDirection(0);
    if (paramAttributeSet != null) {
      TypedArray typedArray = paramContext.obtainStyledAttributes(paramAttributeSet, cc1.k, paramInt, 0);
      paramInt = typedArray.getInteger(0, 0);
      if (paramInt == 90 || paramInt == 270)
        this.v = paramInt; 
      typedArray.recycle();
    } 
    this.k = true;
  }
  
  public final void e(MotionEvent paramMotionEvent) {
    float f1;
    int i = getPaddingLeft();
    int k = getPaddingRight();
    int j = getHeight() - i;
    int n = j - k;
    int m = (int)paramMotionEvent.getY();
    k = this.v;
    float f3 = 0.0F;
    if (k != 90) {
      if (k != 270) {
        f1 = 0.0F;
      } else {
        f1 = (j - m);
      } 
    } else {
      f1 = (m - i);
    } 
    float f2 = f3;
    if (f1 >= 0.0F)
      if (n == 0) {
        f2 = f3;
      } else {
        f2 = n;
        if (f1 > f2) {
          f2 = 1.0F;
        } else {
          f2 = f1 / f2;
        } 
      }  
    c((int)(f2 * getMax()));
  }
  
  public final boolean f() {
    return isInEditMode() ^ true;
  }
  
  public int getRotationAngle() {
    return this.v;
  }
  
  public final void onDraw(Canvas paramCanvas) {
    /* monitor enter ThisExpression{ObjectType{com/h6ah4i/android/widget/verticalseekbar/VerticalSeekBar}} */
    try {
      if (!f()) {
        int i = this.v;
        if (i != 90) {
          if (i == 270) {
            paramCanvas.rotate(-90.0F);
            paramCanvas.translate(-getHeight(), 0.0F);
          } 
        } else {
          paramCanvas.rotate(90.0F);
          paramCanvas.translate(0.0F, -getWidth());
        } 
      } 
    } finally {}
    super.onDraw(paramCanvas);
    /* monitor exit ThisExpression{ObjectType{com/h6ah4i/android/widget/verticalseekbar/VerticalSeekBar}} */
  }
  
  public final boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent) {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual isEnabled : ()Z
    //   4: ifeq -> 117
    //   7: iconst_m1
    //   8: istore_3
    //   9: iconst_0
    //   10: istore #4
    //   12: iload_1
    //   13: tableswitch default -> 44, 19 -> 68, 20 -> 51, 21 -> 49, 22 -> 49
    //   44: iconst_0
    //   45: istore_3
    //   46: goto -> 81
    //   49: iconst_0
    //   50: ireturn
    //   51: aload_0
    //   52: getfield v : I
    //   55: bipush #90
    //   57: if_icmpne -> 62
    //   60: iconst_1
    //   61: istore_3
    //   62: iconst_1
    //   63: istore #4
    //   65: goto -> 81
    //   68: aload_0
    //   69: getfield v : I
    //   72: sipush #270
    //   75: if_icmpne -> 62
    //   78: goto -> 60
    //   81: iload #4
    //   83: ifeq -> 117
    //   86: iload_3
    //   87: aload_0
    //   88: invokevirtual getKeyProgressIncrement : ()I
    //   91: imul
    //   92: aload_0
    //   93: invokevirtual getProgress : ()I
    //   96: iadd
    //   97: istore_1
    //   98: iload_1
    //   99: iflt -> 115
    //   102: iload_1
    //   103: aload_0
    //   104: invokevirtual getMax : ()I
    //   107: if_icmpgt -> 115
    //   110: aload_0
    //   111: iload_1
    //   112: invokevirtual c : (I)V
    //   115: iconst_1
    //   116: ireturn
    //   117: aload_0
    //   118: iload_1
    //   119: aload_2
    //   120: invokespecial onKeyDown : (ILandroid/view/KeyEvent;)Z
    //   123: ireturn
  }
  
  public final void onMeasure(int paramInt1, int paramInt2) {
    /* monitor enter ThisExpression{ObjectType{com/h6ah4i/android/widget/verticalseekbar/VerticalSeekBar}} */
    try {
      if (f()) {
        super.onMeasure(paramInt1, paramInt2);
      } else {
        super.onMeasure(paramInt2, paramInt1);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (isInEditMode() && layoutParams != null && layoutParams.height >= 0) {
          setMeasuredDimension(getMeasuredHeight(), layoutParams.height);
        } else {
          setMeasuredDimension(getMeasuredHeight(), getMeasuredWidth());
        } 
      } 
    } finally {
      Exception exception;
    } 
    /* monitor exit ThisExpression{ObjectType{com/h6ah4i/android/widget/verticalseekbar/VerticalSeekBar}} */
  }
  
  public final void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    if (f()) {
      super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
      return;
    } 
    super.onSizeChanged(paramInt2, paramInt1, paramInt4, paramInt3);
  }
  
  public final boolean onTouchEvent(MotionEvent paramMotionEvent) {
    if (f()) {
      boolean bool = super.onTouchEvent(paramMotionEvent);
      if (bool) {
        int j = paramMotionEvent.getAction();
        if (j != 0) {
          if (j == 1 || j == 3) {
            viewParent = getParent();
            if (viewParent != null) {
              viewParent.requestDisallowInterceptTouchEvent(false);
              return bool;
            } 
          } 
        } else {
          viewParent = getParent();
          if (viewParent != null)
            viewParent.requestDisallowInterceptTouchEvent(true); 
        } 
      } 
      return bool;
    } 
    if (!isEnabled())
      return false; 
    int i = viewParent.getAction();
    if (i != 0) {
      SeekBar.OnSeekBarChangeListener onSeekBarChangeListener;
      if (i != 1) {
        if (i != 2) {
          if (i == 3) {
            if (this.t) {
              this.t = false;
              onSeekBarChangeListener = this.w;
              if (onSeekBarChangeListener != null)
                onSeekBarChangeListener.onStopTrackingTouch((SeekBar)this); 
              setPressed(false);
            } 
            invalidate();
            return true;
          } 
        } else if (this.t) {
          e((MotionEvent)onSeekBarChangeListener);
        } 
        return true;
      } 
      if (this.t) {
        e((MotionEvent)onSeekBarChangeListener);
        this.t = false;
        onSeekBarChangeListener = this.w;
        if (onSeekBarChangeListener != null)
          onSeekBarChangeListener.onStopTrackingTouch((SeekBar)this); 
        setPressed(false);
      } else {
        this.t = true;
        e((MotionEvent)onSeekBarChangeListener);
        this.t = false;
        onSeekBarChangeListener = this.w;
        if (onSeekBarChangeListener != null)
          onSeekBarChangeListener.onStopTrackingTouch((SeekBar)this); 
        viewParent = getParent();
        if (viewParent != null)
          viewParent.requestDisallowInterceptTouchEvent(false); 
      } 
      invalidate();
      return true;
    } 
    setPressed(true);
    this.t = true;
    e((MotionEvent)viewParent);
    ViewParent viewParent = getParent();
    if (viewParent != null)
      viewParent.requestDisallowInterceptTouchEvent(true); 
    invalidate();
    return true;
  }
  
  public void setOnSeekBarChangeListener(SeekBar.OnSeekBarChangeListener paramOnSeekBarChangeListener) {
    super.setOnSeekBarChangeListener(paramOnSeekBarChangeListener);
    this.w = paramOnSeekBarChangeListener;
  }
  
  public void setProgress(int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: iload_1
    //   4: invokespecial setProgress : (I)V
    //   7: aload_0
    //   8: invokevirtual f : ()Z
    //   11: ifne -> 28
    //   14: aload_0
    //   15: aload_0
    //   16: invokespecial getWidth : ()I
    //   19: aload_0
    //   20: invokespecial getHeight : ()I
    //   23: iconst_0
    //   24: iconst_0
    //   25: invokevirtual onSizeChanged : (IIII)V
    //   28: aload_0
    //   29: monitorexit
    //   30: return
    //   31: astore_2
    //   32: aload_0
    //   33: monitorexit
    //   34: aload_2
    //   35: athrow
    // Exception table:
    //   from	to	target	type
    //   2	28	31	finally
    //   32	34	31	finally
  }
  
  public void setRotationAngle(int paramInt) {
    if (paramInt == 90 || paramInt == 270) {
      if (this.v != paramInt) {
        this.v = paramInt;
        if (f()) {
          VerticalSeekBarWrapper verticalSeekBarWrapper = getWrapper();
          if (verticalSeekBarWrapper != null)
            verticalSeekBarWrapper.a(verticalSeekBarWrapper.getWidth(), verticalSeekBarWrapper.getHeight()); 
          return;
        } 
        requestLayout();
        return;
      } 
      return;
    } 
    l0.l(ga1.i("Invalid angle specified :", paramInt));
  }
  
  public void setThumb(Drawable paramDrawable) {
    super.setThumb(paramDrawable);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\com\h6ah4i\android\widget\verticalseekbar\VerticalSeekBar.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
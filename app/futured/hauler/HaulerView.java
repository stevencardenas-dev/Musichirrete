package app.futured.hauler;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.PathInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import e;
import ep0;
import fp0;
import g10;
import g41;
import h41;
import in.krosbits.musicolet.LockScreenActivity;
import in.krosbits.musicolet.MyApplication;
import lc1;
import tp;
import xv;

public final class HaulerView extends FrameLayout {
  public final float b;
  
  public final float c;
  
  public final boolean e;
  
  public final float f;
  
  public float g;
  
  public boolean h;
  
  public int i;
  
  public h41 j;
  
  public g41 k;
  
  public boolean l;
  
  public View m;
  
  public float n;
  
  public HaulerView(Context paramContext) {
    this(paramContext, null, 0, 6, null);
  }
  
  public HaulerView(Context paramContext, AttributeSet paramAttributeSet) {
    this(paramContext, paramAttributeSet, 0, 4, null);
  }
  
  public HaulerView(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(paramContext, paramAttributeSet, paramInt);
    this.b = paramContext.getResources().getDimensionPixelSize(2131165331);
    this.c = 0.95F;
    this.e = true;
    this.f = 0.8F;
    paramContext = getContext();
    paramContext.getClass();
    int[] arrayOfInt = lc1.a;
    paramInt = 0;
    TypedArray typedArray = paramContext.obtainStyledAttributes(paramAttributeSet, arrayOfInt, 0, 0);
    boolean bool1 = typedArray.hasValue(0);
    boolean bool2 = typedArray.hasValue(1);
    if (!bool1 || !bool2) {
      if (bool1) {
        this.b = typedArray.getDimensionPixelSize(0, 0);
      } else if (bool2) {
        typedArray.getFloat(1, -1.0F);
      } 
      float f = typedArray.getFloat(2, 0.95F);
      this.c = f;
      this.l = typedArray.getBoolean(4, this.l);
      this.f = typedArray.getFloat(3, 0.8F);
      typedArray.recycle();
      if (f == 1.0F)
        paramInt = 1; 
      this.e = paramInt ^ 0x1;
      return;
    } 
    tp.f("Do not specify both dragDismissDistance and dragDismissFraction. Choose one.");
    throw null;
  }
  
  public final void a(float paramFloat) {
    g41 g411 = this.k;
    if (g411 != null) {
      Animation animation;
      fp0 fp0 = (fp0)g411;
      LockScreenActivity lockScreenActivity = fp0.a;
      ImageView imageView = lockScreenActivity.h0;
      if (paramFloat == 0.0F) {
        imageView.setAlpha(0.7F);
        animation = AnimationUtils.loadAnimation(MyApplication.i.getApplicationContext(), 2130772026);
        animation.setAnimationListener((Animation.AnimationListener)new ep0(1, fp0));
        lockScreenActivity.h0.setAnimation(animation);
        lockScreenActivity.h0.animate();
        return;
      } 
      animation.setAlpha(0.0F);
    } 
  }
  
  public final float getDownY() {
    return this.n;
  }
  
  public final View getScaleChild() {
    return this.m;
  }
  
  public final void onMeasure(int paramInt1, int paramInt2) {
    if (this.m == null)
      this.m = getChildAt(0); 
    super.onMeasure(paramInt1, paramInt2);
  }
  
  public final boolean onTouchEvent(MotionEvent paramMotionEvent) {
    Integer integer;
    if (paramMotionEvent != null)
      this.i = paramMotionEvent.getActionMasked(); 
    if (paramMotionEvent != null) {
      integer = Integer.valueOf(paramMotionEvent.getActionMasked());
    } else {
      integer = null;
    } 
    if (integer != null && integer.intValue() == 0) {
      requestDisallowInterceptTouchEvent(true);
      this.n = paramMotionEvent.getY(0);
      return true;
    } 
    float f = this.b;
    if (integer != null && integer.intValue() == 2) {
      boolean bool;
      int i = (int)paramMotionEvent.getY(0);
      if (this.g == 0.0F) {
        bool = true;
      } else {
        bool = false;
      } 
      float f1 = this.n;
      if (i != (int)f1) {
        f1 -= i;
        this.g = f1;
        if (bool && f1 != 0.0F)
          a(Math.min(1.0F, Math.abs(f1) / f)); 
        f1 = this.g;
        if (f1 >= 0.0F || this.h) {
          boolean bool1 = this.e;
          if (f1 > 0.0F && !this.h) {
            this.h = true;
            if (bool1) {
              View view1 = this.m;
              view1.getClass();
              view1.setPivotY(0.0F);
            } 
          } 
          View view = this.m;
          view.getClass();
          view.setPivotX(getWidth() / 2.0F);
          float f3 = (float)Math.log10((Math.abs(this.g) / f + 1.0F));
          float f2 = f3 * f * this.f;
          f1 = f2;
          if (this.h)
            f1 = f2 * -1.0F; 
          view = this.m;
          view.getClass();
          view.setTranslationY(f1);
          if (bool1) {
            f1 = 1.0F - (1.0F - this.c) * f3;
            view = this.m;
            view.getClass();
            view.setScaleX(f1);
            view = this.m;
            view.getClass();
            view.setScaleY(f1);
          } 
          if (this.g >= f) {
            setAlpha(0.5F);
          } else {
            setAlpha(1.0F);
          } 
          if (this.h && this.g <= 0.0F) {
            this.g = 0.0F;
            this.h = false;
            setTranslationY(0.0F);
            view = this.m;
            view.getClass();
            view.setScaleX(1.0F);
            view = this.m;
            view.getClass();
            view.setScaleY(1.0F);
            return true;
          } 
        } 
      } 
    } else if ((integer != null && integer.intValue() == 1) || (integer != null && integer.intValue() == 3)) {
      g10 g101;
      float f1;
      if (this.l && this.h) {
        f1 = this.g;
      } else {
        f1 = 0.0F;
      } 
      float f2 = this.g;
      g10 g102 = g10.b;
      if (f2 > 0.0F) {
        g101 = g102;
      } else {
        g101 = g10.c;
      } 
      if (f1 >= f) {
        View view = this.m;
        view.getClass();
        ViewPropertyAnimator viewPropertyAnimator = view.animate();
        f2 = getHeight();
        f1 = f2;
        if (g101 == g102)
          f1 = -f2; 
        viewPropertyAnimator.translationY(f1).scaleX(0.0F).scaleY(0.0F).setDuration(250L).setInterpolator((TimeInterpolator)new AccelerateInterpolator()).setListener(null).start();
        postDelayed((Runnable)new e(23, this, g101), 250L);
      } else {
        int i = this.i;
        View view = this.m;
        if (i == 0) {
          view.getClass();
          view.setTranslationY(0.0F);
          view = this.m;
          view.getClass();
          view.setScaleX(1.0F);
          view = this.m;
          view.getClass();
          view.setScaleY(1.0F);
        } else {
          view.getClass();
          view.setPivotY(0.0F);
          view = this.m;
          view.getClass();
          view.animate().translationY(0.0F).scaleX(1.0F).scaleY(1.0F).setDuration(200L).setInterpolator((TimeInterpolator)new PathInterpolator(0.4F, 0.0F, 0.2F, 1.0F)).setListener(null).start();
          a(0.0F);
        } 
        this.g = 0.0F;
        this.h = false;
      } 
      this.n = 0.0F;
      requestDisallowInterceptTouchEvent(false);
      return true;
    } 
    return true;
  }
  
  public final void setDownY(float paramFloat) {
    this.n = paramFloat;
  }
  
  public final void setDragEnabled(boolean paramBoolean) {}
  
  public final void setDragUpEnabled(boolean paramBoolean) {
    this.l = paramBoolean;
  }
  
  public final void setOnDragActivityListener(g41 paramg41) {
    paramg41.getClass();
    this.k = paramg41;
  }
  
  public final void setOnDragDismissedListener(h41 paramh41) {
    paramh41.getClass();
    this.j = paramh41;
  }
  
  public final void setScaleChild(View paramView) {
    this.m = paramView;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\app\futured\hauler\HaulerView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
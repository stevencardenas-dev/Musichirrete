package com.esafirm.stubutton;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import fp0;
import in.krosbits.musicolet.KitkatHackActivity;
import in.krosbits.musicolet.LockScreenActivity;
import java.util.ArrayList;
import js;
import pq1;
import qq1;
import xb1;

public class StuButton extends RelativeLayout {
  public TextView b;
  
  public ImageView c;
  
  public ImageView e;
  
  public qq1 f;
  
  public int g = 0;
  
  public boolean h = false;
  
  public int i = 0;
  
  public int j = 0;
  
  public float k = 0.0F;
  
  public boolean l = false;
  
  public StuButton(Context paramContext) {
    this(paramContext, null);
  }
  
  public StuButton(Context paramContext, AttributeSet paramAttributeSet) {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public StuButton(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(paramContext, paramAttributeSet, paramInt);
    new ArrayList();
    new Rect();
    TypedArray typedArray = paramContext.getTheme().obtainStyledAttributes(paramAttributeSet, xb1.a, 0, 0);
    ((LayoutInflater)paramContext.getSystemService("layout_inflater")).inflate(2131493212, (ViewGroup)this, true);
    this.b = (TextView)findViewById(2131297548);
    this.c = (ImageView)findViewById(2131297547);
    this.e = (ImageView)findViewById(2131297546);
    this.g = Math.round(48.0F * (getResources().getDisplayMetrics()).density);
    this.c.getViewTreeObserver().addOnPreDrawListener((ViewTreeObserver.OnPreDrawListener)new js((ViewGroup)this, 1));
    setLabel(typedArray.getString(1));
    typedArray.recycle();
    this.b.setVisibility(4);
    this.b.setTextColor(-1);
  }
  
  private void setMarginLeft(int paramInt) {
    ImageView imageView = this.c;
    if (imageView == null)
      return; 
    RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams)imageView.getLayoutParams();
    layoutParams.setMargins(paramInt, layoutParams.topMargin, layoutParams.rightMargin, layoutParams.bottomMargin);
    this.c.setLayoutParams((ViewGroup.LayoutParams)layoutParams);
  }
  
  public final void onDetachedFromWindow() {
    this.b = null;
    this.c = null;
    this.e = null;
    super.onDetachedFromWindow();
  }
  
  public final void onDraw(Canvas paramCanvas) {
    super.onDraw(paramCanvas);
  }
  
  public final void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public final boolean onTouchEvent(MotionEvent paramMotionEvent) {
    super.onTouchEvent(paramMotionEvent);
    if (paramMotionEvent.getAction() == 0) {
      if (paramMotionEvent.getX() > this.i && paramMotionEvent.getX() < (this.i + this.g)) {
        LockScreenActivity lockScreenActivity1 = ((fp0)this.f).a;
        LockScreenActivity lockScreenActivity2 = LockScreenActivity.a1;
        lockScreenActivity1.s0(true);
        lockScreenActivity1.i0.setVisibility(4);
        this.b.setVisibility(0);
        this.h = true;
        this.k = paramMotionEvent.getX();
        this.j = this.i;
        getParent().requestDisallowInterceptTouchEvent(true);
        return true;
      } 
    } else {
      ValueAnimator valueAnimator;
      if (paramMotionEvent.getAction() == 1 || paramMotionEvent.getAction() == 4 || paramMotionEvent.getAction() == 3) {
        LockScreenActivity lockScreenActivity1 = ((fp0)this.f).a;
        LockScreenActivity lockScreenActivity2 = LockScreenActivity.a1;
        lockScreenActivity1.s0(false);
        lockScreenActivity1.i0.setVisibility(0);
        this.b.setVisibility(4);
        getParent().requestDisallowInterceptTouchEvent(false);
        if (this.i >= getMeasuredWidth() - this.g * 3) {
          qq1 qq11 = this.f;
          if (qq11 != null) {
            LockScreenActivity lockScreenActivity = ((fp0)qq11).a;
            lockScreenActivity.u0();
            if (Build.VERSION.SDK_INT < 26)
              lockScreenActivity.startActivity(new Intent((Context)lockScreenActivity, KitkatHackActivity.class)); 
          } 
          return true;
        } 
        this.h = false;
        this.i = 0;
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams)this.c.getLayoutParams();
        valueAnimator = ValueAnimator.ofInt(new int[] { layoutParams.leftMargin, 0 });
        valueAnimator.addUpdateListener((ValueAnimator.AnimatorUpdateListener)new pq1(this, layoutParams));
        valueAnimator.setDuration(300L);
        valueAnimator.start();
        this.b.setAlpha(1.0F);
        return true;
      } 
      if (valueAnimator.getAction() == 2 && this.h) {
        float f = this.j;
        int i = (int)(valueAnimator.getX() - this.k + f);
        this.i = i;
        if (i <= 0)
          this.i = 0; 
        if (this.i >= getMeasuredWidth() - this.g * 3) {
          i = 1;
        } else {
          i = 0;
        } 
        boolean bool = this.l;
        if (i != 0) {
          if (!bool) {
            ((fp0)this.f).a.J0.setAlpha(0.7F);
            this.l = true;
          } 
        } else {
          if (bool) {
            ((fp0)this.f).a.J0.setAlpha(1.0F);
            this.l = false;
          } 
          int j = getMeasuredWidth();
          i = this.g;
          float f1 = this.i / (j - i * 2) * 1.0F;
          f = f1;
          if (f1 > 1.0F)
            f = 1.0F; 
          this.b.setAlpha(1.0F - f);
        } 
        setMarginLeft(this.i);
        return true;
      } 
    } 
    return true;
  }
  
  public void setLabel(int paramInt) {
    setLabel(getContext().getString(paramInt));
  }
  
  public void setLabel(String paramString) {
    TextView textView = this.b;
    if (textView != null)
      textView.setText(paramString); 
  }
  
  public void setOnUnlockListener(qq1 paramqq1) {
    this.f = paramqq1;
  }
  
  public void setStuBackground(Drawable paramDrawable) {
    ImageView imageView = this.e;
    if (imageView != null)
      imageView.setImageDrawable(paramDrawable); 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\com\esafirm\stubutton\StuButton.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
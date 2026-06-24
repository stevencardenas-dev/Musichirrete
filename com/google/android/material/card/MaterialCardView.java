package com.google.android.material.card;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import g92;
import gm1;
import is0;
import k;
import ks0;
import ls;
import m92;
import n21;
import qi;
import qv;
import ul1;
import vl1;
import wf2;
import ws0;
import ws2;
import zb1;
import zo2;

public class MaterialCardView extends qi implements Checkable, gm1 {
  public static final int[] m = new int[] { 16842911 };
  
  public static final int[] n = new int[] { 16842912 };
  
  public static final int[] o = new int[] { 2130970002 };
  
  public final ks0 i;
  
  public final boolean j;
  
  public boolean k;
  
  public boolean l;
  
  public MaterialCardView(Context paramContext) {
    this(paramContext, null);
  }
  
  public MaterialCardView(Context paramContext, AttributeSet paramAttributeSet) {
    this(paramContext, paramAttributeSet, 2130969571);
  }
  
  public MaterialCardView(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(qv.n0(paramContext, paramAttributeSet, paramInt, 2131952863), paramAttributeSet, paramInt);
    LayerDrawable layerDrawable;
    this.k = false;
    this.l = false;
    this.j = true;
    TypedArray typedArray = g92.S(getContext(), paramAttributeSet, zb1.q, paramInt, 2131952863, new int[0]);
    ks0 ks01 = new ks0(this, paramAttributeSet, paramInt);
    this.i = ks01;
    ColorStateList colorStateList2 = super.getCardBackgroundColor();
    ws0 ws03 = ks01.c;
    ws03.o(colorStateList2);
    int i = super.getContentPaddingLeft();
    int j = super.getContentPaddingTop();
    paramInt = super.getContentPaddingRight();
    int k = super.getContentPaddingBottom();
    ks01.b.set(i, j, paramInt, k);
    ks01.l();
    MaterialCardView materialCardView = ks01.a;
    colorStateList2 = wf2.u(materialCardView.getContext(), typedArray, 11);
    ks01.n = colorStateList2;
    if (colorStateList2 == null)
      ks01.n = ColorStateList.valueOf(-1); 
    ks01.h = typedArray.getDimensionPixelSize(12, 0);
    boolean bool = typedArray.getBoolean(0, false);
    ks01.s = bool;
    materialCardView.setLongClickable(bool);
    ks01.l = wf2.u(materialCardView.getContext(), typedArray, 6);
    ks01.g(wf2.y(materialCardView.getContext(), typedArray, 2));
    ks01.f = typedArray.getDimensionPixelSize(5, 0);
    ks01.e = typedArray.getDimensionPixelSize(4, 0);
    ks01.g = typedArray.getInteger(3, 8388661);
    colorStateList2 = wf2.u(materialCardView.getContext(), typedArray, 7);
    ks01.k = colorStateList2;
    if (colorStateList2 == null)
      ks01.k = ColorStateList.valueOf(m92.x((View)materialCardView, 2130968900)); 
    ColorStateList colorStateList3 = wf2.u(materialCardView.getContext(), typedArray, 1);
    colorStateList2 = colorStateList3;
    if (colorStateList3 == null)
      colorStateList2 = ColorStateList.valueOf(0); 
    ws0 ws02 = ks01.d;
    ws02.o(colorStateList2);
    RippleDrawable rippleDrawable = ks01.o;
    if (rippleDrawable != null)
      rippleDrawable.setColor(ks01.k); 
    ws03.n(materialCardView.getCardElevation());
    float f = ks01.h;
    ColorStateList colorStateList1 = ks01.n;
    ws02.u(f);
    ws02.t(colorStateList1);
    materialCardView.setBackgroundInternal((Drawable)ks01.d((Drawable)ws03));
    ws0 ws01 = ws02;
    if (ks01.j())
      layerDrawable = ks01.c(); 
    ks01.i = (Drawable)layerDrawable;
    materialCardView.setForeground((Drawable)ks01.d((Drawable)layerDrawable));
    typedArray.recycle();
  }
  
  private RectF getBoundsAsRectF() {
    RectF rectF = new RectF();
    rectF.set(this.i.c.getBounds());
    return rectF;
  }
  
  public final void b() {
    if (Build.VERSION.SDK_INT > 26) {
      ks0 ks01 = this.i;
      RippleDrawable rippleDrawable = ks01.o;
      if (rippleDrawable != null) {
        Rect rect = rippleDrawable.getBounds();
        int i = rect.bottom;
        ks01.o.setBounds(rect.left, rect.top, rect.right, i - 1);
        ks01.o.setBounds(rect.left, rect.top, rect.right, i);
      } 
    } 
  }
  
  public ColorStateList getCardBackgroundColor() {
    return this.i.c.c.d;
  }
  
  public ColorStateList getCardForegroundColor() {
    return this.i.d.c.d;
  }
  
  public float getCardViewRadius() {
    return super.getRadius();
  }
  
  public Drawable getCheckedIcon() {
    return this.i.j;
  }
  
  public int getCheckedIconGravity() {
    return this.i.g;
  }
  
  public int getCheckedIconMargin() {
    return this.i.e;
  }
  
  public int getCheckedIconSize() {
    return this.i.f;
  }
  
  public ColorStateList getCheckedIconTint() {
    return this.i.l;
  }
  
  public int getContentPaddingBottom() {
    return this.i.b.bottom;
  }
  
  public int getContentPaddingLeft() {
    return this.i.b.left;
  }
  
  public int getContentPaddingRight() {
    return this.i.b.right;
  }
  
  public int getContentPaddingTop() {
    return this.i.b.top;
  }
  
  public float getProgress() {
    return this.i.c.c.j;
  }
  
  public float getRadius() {
    return this.i.c.i();
  }
  
  public ColorStateList getRippleColor() {
    return this.i.k;
  }
  
  public vl1 getShapeAppearanceModel() {
    return this.i.m;
  }
  
  @Deprecated
  public int getStrokeColor() {
    ColorStateList colorStateList = this.i.n;
    return (colorStateList == null) ? -1 : colorStateList.getDefaultColor();
  }
  
  public ColorStateList getStrokeColorStateList() {
    return this.i.n;
  }
  
  public int getStrokeWidth() {
    return this.i.h;
  }
  
  public final boolean isChecked() {
    return this.k;
  }
  
  public final void onAttachedToWindow() {
    super.onAttachedToWindow();
    ks0 ks01 = this.i;
    ks01.k();
    zo2.S((View)this, ks01.c);
  }
  
  public final int[] onCreateDrawableState(int paramInt) {
    int[] arrayOfInt = super.onCreateDrawableState(paramInt + 3);
    ks0 ks01 = this.i;
    if (ks01 != null && ks01.s)
      View.mergeDrawableStates(arrayOfInt, m); 
    if (this.k)
      View.mergeDrawableStates(arrayOfInt, n); 
    if (this.l)
      View.mergeDrawableStates(arrayOfInt, o); 
    return arrayOfInt;
  }
  
  public final void onInitializeAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent) {
    super.onInitializeAccessibilityEvent(paramAccessibilityEvent);
    paramAccessibilityEvent.setClassName("androidx.cardview.widget.CardView");
    paramAccessibilityEvent.setChecked(this.k);
  }
  
  public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo paramAccessibilityNodeInfo) {
    boolean bool;
    super.onInitializeAccessibilityNodeInfo(paramAccessibilityNodeInfo);
    paramAccessibilityNodeInfo.setClassName("androidx.cardview.widget.CardView");
    ks0 ks01 = this.i;
    if (ks01 != null && ks01.s) {
      bool = true;
    } else {
      bool = false;
    } 
    paramAccessibilityNodeInfo.setCheckable(bool);
    paramAccessibilityNodeInfo.setClickable(isClickable());
    paramAccessibilityNodeInfo.setChecked(this.k);
  }
  
  public final void onMeasure(int paramInt1, int paramInt2) {
    super.onMeasure(paramInt1, paramInt2);
    paramInt1 = getMeasuredWidth();
    paramInt2 = getMeasuredHeight();
    this.i.e(paramInt1, paramInt2);
  }
  
  public void setBackground(Drawable paramDrawable) {
    setBackgroundDrawable(paramDrawable);
  }
  
  public void setBackgroundDrawable(Drawable paramDrawable) {
    if (this.j) {
      ks0 ks01 = this.i;
      if (!ks01.r) {
        Log.i("MaterialCardView", "Setting a custom background is not supported.");
        ks01.r = true;
      } 
      super.setBackgroundDrawable(paramDrawable);
    } 
  }
  
  public void setBackgroundInternal(Drawable paramDrawable) {
    super.setBackgroundDrawable(paramDrawable);
  }
  
  public void setCardBackgroundColor(int paramInt) {
    ColorStateList colorStateList = ColorStateList.valueOf(paramInt);
    this.i.c.o(colorStateList);
  }
  
  public void setCardBackgroundColor(ColorStateList paramColorStateList) {
    this.i.c.o(paramColorStateList);
  }
  
  public void setCardElevation(float paramFloat) {
    super.setCardElevation(paramFloat);
    ks0 ks01 = this.i;
    ks01.c.n(ks01.a.getCardElevation());
  }
  
  public void setCardForegroundColor(ColorStateList paramColorStateList) {
    ws0 ws0 = this.i.d;
    ColorStateList colorStateList = paramColorStateList;
    if (paramColorStateList == null)
      colorStateList = ColorStateList.valueOf(0); 
    ws0.o(colorStateList);
  }
  
  public void setCheckable(boolean paramBoolean) {
    this.i.s = paramBoolean;
  }
  
  public void setChecked(boolean paramBoolean) {
    if (this.k != paramBoolean)
      toggle(); 
  }
  
  public void setCheckedIcon(Drawable paramDrawable) {
    this.i.g(paramDrawable);
  }
  
  public void setCheckedIconGravity(int paramInt) {
    ks0 ks01 = this.i;
    if (ks01.g != paramInt) {
      ks01.g = paramInt;
      MaterialCardView materialCardView = ks01.a;
      ks01.e(materialCardView.getMeasuredWidth(), materialCardView.getMeasuredHeight());
    } 
  }
  
  public void setCheckedIconMargin(int paramInt) {
    this.i.e = paramInt;
  }
  
  public void setCheckedIconMarginResource(int paramInt) {
    if (paramInt != -1) {
      paramInt = getResources().getDimensionPixelSize(paramInt);
      this.i.e = paramInt;
    } 
  }
  
  public void setCheckedIconResource(int paramInt) {
    Drawable drawable = ws2.I(getContext(), paramInt);
    this.i.g(drawable);
  }
  
  public void setCheckedIconSize(int paramInt) {
    this.i.f = paramInt;
  }
  
  public void setCheckedIconSizeResource(int paramInt) {
    if (paramInt != 0) {
      paramInt = getResources().getDimensionPixelSize(paramInt);
      this.i.f = paramInt;
    } 
  }
  
  public void setCheckedIconTint(ColorStateList paramColorStateList) {
    ks0 ks01 = this.i;
    ks01.l = paramColorStateList;
    Drawable drawable = ks01.j;
    if (drawable != null)
      drawable.setTintList(paramColorStateList); 
  }
  
  public void setClickable(boolean paramBoolean) {
    super.setClickable(paramBoolean);
    ks0 ks01 = this.i;
    if (ks01 != null)
      ks01.k(); 
  }
  
  public void setDragged(boolean paramBoolean) {
    if (this.l != paramBoolean) {
      this.l = paramBoolean;
      refreshDrawableState();
      b();
      invalidate();
    } 
  }
  
  public void setMaxCardElevation(float paramFloat) {
    super.setMaxCardElevation(paramFloat);
    this.i.m();
  }
  
  public void setOnCheckedChangeListener(is0 paramis0) {}
  
  public void setPreventCornerOverlap(boolean paramBoolean) {
    super.setPreventCornerOverlap(paramBoolean);
    ks0 ks01 = this.i;
    ks01.m();
    ks01.l();
  }
  
  public void setProgress(float paramFloat) {
    ks0 ks01 = this.i;
    ks01.c.p(paramFloat);
    ws0 ws02 = ks01.d;
    if (ws02 != null)
      ws02.p(paramFloat); 
    ws0 ws01 = ks01.q;
    if (ws01 != null)
      ws01.p(paramFloat); 
  }
  
  public void setRadius(float paramFloat) {
    super.setRadius(paramFloat);
    ks0 ks01 = this.i;
    ul1 ul1 = ks01.m.f();
    ul1.e = (ls)new k(paramFloat);
    ul1.f = (ls)new k(paramFloat);
    ul1.g = (ls)new k(paramFloat);
    ul1.h = (ls)new k(paramFloat);
    ks01.h(ul1.a());
    ks01.i.invalidateSelf();
    if (ks01.i() || (ks01.a.getPreventCornerOverlap() && !ks01.c.l()))
      ks01.l(); 
    if (ks01.i())
      ks01.m(); 
  }
  
  public void setRippleColor(ColorStateList paramColorStateList) {
    ks0 ks01 = this.i;
    ks01.k = paramColorStateList;
    RippleDrawable rippleDrawable = ks01.o;
    if (rippleDrawable != null)
      rippleDrawable.setColor(paramColorStateList); 
  }
  
  public void setRippleColorResource(int paramInt) {
    ColorStateList colorStateList = n21.y(getContext(), paramInt);
    ks0 ks01 = this.i;
    ks01.k = colorStateList;
    RippleDrawable rippleDrawable = ks01.o;
    if (rippleDrawable != null)
      rippleDrawable.setColor(colorStateList); 
  }
  
  public void setShapeAppearanceModel(vl1 paramvl1) {
    setClipToOutline(paramvl1.e(getBoundsAsRectF()));
    this.i.h(paramvl1);
  }
  
  public void setStrokeColor(int paramInt) {
    setStrokeColor(ColorStateList.valueOf(paramInt));
  }
  
  public void setStrokeColor(ColorStateList paramColorStateList) {
    ks0 ks01 = this.i;
    if (ks01.n != paramColorStateList) {
      ks01.n = paramColorStateList;
      ws0 ws0 = ks01.d;
      ws0.u(ks01.h);
      ws0.t(paramColorStateList);
    } 
    invalidate();
  }
  
  public void setStrokeWidth(int paramInt) {
    ks0 ks01 = this.i;
    if (paramInt != ks01.h) {
      ks01.h = paramInt;
      ws0 ws0 = ks01.d;
      float f = paramInt;
      ColorStateList colorStateList = ks01.n;
      ws0.u(f);
      ws0.t(colorStateList);
    } 
    invalidate();
  }
  
  public void setUseCompatPadding(boolean paramBoolean) {
    super.setUseCompatPadding(paramBoolean);
    ks0 ks01 = this.i;
    ks01.m();
    ks01.l();
  }
  
  public final void toggle() {
    ks0 ks01 = this.i;
    if (ks01 != null && ks01.s && isEnabled()) {
      this.k ^= 0x1;
      refreshDrawableState();
      b();
      ks01.f(this.k, true);
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\com\google\android\material\card\MaterialCardView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
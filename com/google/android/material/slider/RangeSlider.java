package com.google.android.material.slider;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import g92;
import java.util.ArrayList;
import java.util.List;
import n21;
import nl0;
import tp;
import ud;
import ws0;
import ws2;
import xc1;
import yd;
import zb1;

public class RangeSlider extends yd {
  public float Y0;
  
  public int Z0;
  
  public RangeSlider(Context paramContext) {
    this(paramContext, null);
  }
  
  public RangeSlider(Context paramContext, AttributeSet paramAttributeSet) {
    this(paramContext, paramAttributeSet, 2130969957);
  }
  
  public RangeSlider(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(paramContext, paramAttributeSet, paramInt);
    TypedArray typedArray = g92.S(paramContext, paramAttributeSet, zb1.y, paramInt, 2131952921, new int[0]);
    if (typedArray.hasValue(1)) {
      paramInt = typedArray.getResourceId(1, 0);
      TypedArray typedArray1 = typedArray.getResources().obtainTypedArray(paramInt);
      ArrayList<Float> arrayList = new ArrayList();
      for (paramInt = 0; paramInt < typedArray1.length(); paramInt++)
        arrayList.add(Float.valueOf(typedArray1.getFloat(paramInt, -1.0F))); 
      setValues(arrayList);
    } 
    this.Y0 = typedArray.getDimension(0, 0.0F);
    typedArray.recycle();
  }
  
  public CharSequence getAccessibilityClassName() {
    return SeekBar.class.getName();
  }
  
  public int getActiveThumbIndex() {
    return this.p0;
  }
  
  public int getFocusedThumbIndex() {
    return this.q0;
  }
  
  public int getHaloRadius() {
    return this.J;
  }
  
  public ColorStateList getHaloTintList() {
    return this.z0;
  }
  
  public int getLabelBehavior() {
    return this.E;
  }
  
  public float getMinSeparation() {
    return this.Y0;
  }
  
  public float getStepSize() {
    return this.r0;
  }
  
  public float getThumbElevation() {
    return this.N0.c.n;
  }
  
  public int getThumbHeight() {
    return this.I;
  }
  
  public int getThumbRadius() {
    return this.H / 2;
  }
  
  public ColorStateList getThumbStrokeColor() {
    return this.N0.c.e;
  }
  
  public float getThumbStrokeWidth() {
    return this.N0.c.k;
  }
  
  public ColorStateList getThumbTintList() {
    return this.N0.c.d;
  }
  
  public int getThumbTrackGapSize() {
    return this.K;
  }
  
  public int getThumbWidth() {
    return this.H;
  }
  
  public int getTickActiveRadius() {
    return this.u0;
  }
  
  public ColorStateList getTickActiveTintList() {
    return this.A0;
  }
  
  public int getTickInactiveRadius() {
    return this.v0;
  }
  
  public ColorStateList getTickInactiveTintList() {
    return this.B0;
  }
  
  public ColorStateList getTickTintList() {
    if (this.B0.equals(this.A0))
      return this.A0; 
    tp.f("The inactive and active ticks are different colors. Use the getTickColorInactive() and getTickColorActive() methods instead.");
    return null;
  }
  
  public int getTickVisibilityMode() {
    return this.t0;
  }
  
  public ColorStateList getTrackActiveTintList() {
    return this.C0;
  }
  
  public int getTrackCornerSize() {
    int i = this.O;
    return (i == -1) ? (this.F / 2) : i;
  }
  
  public int getTrackHeight() {
    return this.F;
  }
  
  public ColorStateList getTrackIconActiveColor() {
    return this.V;
  }
  
  public Drawable getTrackIconActiveEnd() {
    return this.T;
  }
  
  public Drawable getTrackIconActiveStart() {
    return this.R;
  }
  
  public ColorStateList getTrackIconInactiveColor() {
    return this.d0;
  }
  
  public Drawable getTrackIconInactiveEnd() {
    return this.b0;
  }
  
  public Drawable getTrackIconInactiveStart() {
    return this.W;
  }
  
  public int getTrackIconSize() {
    return this.e0;
  }
  
  public ColorStateList getTrackInactiveTintList() {
    return this.D0;
  }
  
  public int getTrackInsideCornerSize() {
    return this.P;
  }
  
  public int getTrackSidePadding() {
    return this.G;
  }
  
  public int getTrackStopIndicatorSize() {
    return this.N;
  }
  
  public ColorStateList getTrackTintList() {
    if (this.D0.equals(this.C0))
      return this.C0; 
    tp.f("The inactive and active parts of the track are different colors. Use the getInactiveTrackColor() and getActiveTrackColor() methods instead.");
    return null;
  }
  
  public int getTrackWidth() {
    return this.w0;
  }
  
  public float getValueFrom() {
    return this.m0;
  }
  
  public float getValueTo() {
    return this.n0;
  }
  
  public List<Float> getValues() {
    return super.getValues();
  }
  
  public final void onRestoreInstanceState(Parcelable paramParcelable) {
    xc1 xc1 = (xc1)paramParcelable;
    super.onRestoreInstanceState(xc1.getSuperState());
    this.Y0 = xc1.b;
    int i = xc1.c;
    this.Z0 = i;
    setSeparationUnit(i);
  }
  
  public final Parcelable onSaveInstanceState() {
    xc1 xc1 = new xc1((ud)super.onSaveInstanceState());
    xc1.b = this.Y0;
    xc1.c = this.Z0;
    return (Parcelable)xc1;
  }
  
  public void setCustomThumbDrawable(int paramInt) {
    setCustomThumbDrawable(getResources().getDrawable(paramInt));
  }
  
  public void setCustomThumbDrawable(Drawable paramDrawable) {
    paramDrawable = paramDrawable.mutate().getConstantState().newDrawable();
    c(paramDrawable);
    this.O0 = paramDrawable;
    this.P0.clear();
    postInvalidate();
  }
  
  public void setCustomThumbDrawablesForValues(int... paramVarArgs) {
    super.setCustomThumbDrawablesForValues(paramVarArgs);
  }
  
  public void setCustomThumbDrawablesForValues(Drawable... paramVarArgs) {
    super.setCustomThumbDrawablesForValues(paramVarArgs);
  }
  
  public void setHaloRadiusResource(int paramInt) {
    setHaloRadius(getResources().getDimensionPixelSize(paramInt));
  }
  
  public void setLabelBehavior(int paramInt) {
    if (this.E != paramInt) {
      this.E = paramInt;
      P(true);
    } 
  }
  
  public void setLabelFormatter(nl0 paramnl0) {
    this.k0 = paramnl0;
  }
  
  public void setMinSeparation(float paramFloat) {
    this.Y0 = paramFloat;
    this.Z0 = 0;
    setSeparationUnit(0);
  }
  
  public void setMinSeparationValue(float paramFloat) {
    this.Y0 = paramFloat;
    this.Z0 = 1;
    setSeparationUnit(1);
  }
  
  public void setOrientation(int paramInt) {
    if (this.B == paramInt)
      return; 
    this.B = paramInt;
    P(true);
  }
  
  public void setThumbElevation(float paramFloat) {
    this.N0.n(paramFloat);
  }
  
  public void setThumbElevationResource(int paramInt) {
    setThumbElevation(getResources().getDimension(paramInt));
  }
  
  public void setThumbHeightResource(int paramInt) {
    setThumbHeight(getResources().getDimensionPixelSize(paramInt));
  }
  
  public void setThumbRadius(int paramInt) {
    paramInt *= 2;
    setThumbWidth(paramInt);
    setThumbHeight(paramInt);
  }
  
  public void setThumbRadiusResource(int paramInt) {
    setThumbRadius(getResources().getDimensionPixelSize(paramInt));
  }
  
  public void setThumbStrokeColor(ColorStateList paramColorStateList) {
    this.N0.t(paramColorStateList);
    postInvalidate();
  }
  
  public void setThumbStrokeColorResource(int paramInt) {
    if (paramInt != 0)
      setThumbStrokeColor(n21.y(getContext(), paramInt)); 
  }
  
  public void setThumbStrokeWidth(float paramFloat) {
    this.N0.u(paramFloat);
    postInvalidate();
  }
  
  public void setThumbStrokeWidthResource(int paramInt) {
    if (paramInt != 0)
      setThumbStrokeWidth(getResources().getDimension(paramInt)); 
  }
  
  public void setThumbTintList(ColorStateList paramColorStateList) {
    ws0 ws0 = this.N0;
    if (paramColorStateList.equals(ws0.c.d))
      return; 
    ws0.o(paramColorStateList);
    invalidate();
  }
  
  public void setThumbTrackGapSize(int paramInt) {
    if (this.K == paramInt)
      return; 
    this.K = paramInt;
    invalidate();
  }
  
  public void setThumbWidthResource(int paramInt) {
    setThumbWidth(getResources().getDimensionPixelSize(paramInt));
  }
  
  public void setTickActiveRadius(int paramInt) {
    if (this.u0 != paramInt) {
      this.u0 = paramInt;
      float f = (paramInt * 2);
      this.h.setStrokeWidth(f);
      P(false);
    } 
  }
  
  public void setTickActiveTintList(ColorStateList paramColorStateList) {
    if (paramColorStateList.equals(this.A0))
      return; 
    this.A0 = paramColorStateList;
    this.h.setColor(p(paramColorStateList));
    invalidate();
  }
  
  public void setTickInactiveRadius(int paramInt) {
    if (this.v0 != paramInt) {
      this.v0 = paramInt;
      float f = (paramInt * 2);
      this.g.setStrokeWidth(f);
      P(false);
    } 
  }
  
  public void setTickInactiveTintList(ColorStateList paramColorStateList) {
    if (paramColorStateList.equals(this.B0))
      return; 
    this.B0 = paramColorStateList;
    this.g.setColor(p(paramColorStateList));
    invalidate();
  }
  
  public void setTickTintList(ColorStateList paramColorStateList) {
    setTickInactiveTintList(paramColorStateList);
    setTickActiveTintList(paramColorStateList);
  }
  
  public void setTickVisibilityMode(int paramInt) {
    if (this.t0 != paramInt) {
      this.t0 = paramInt;
      postInvalidate();
    } 
  }
  
  @Deprecated
  public void setTickVisible(boolean paramBoolean) {
    byte b;
    if (paramBoolean) {
      b = 0;
    } else {
      b = 2;
    } 
    setTickVisibilityMode(b);
  }
  
  public void setTrackActiveTintList(ColorStateList paramColorStateList) {
    if (paramColorStateList.equals(this.C0))
      return; 
    this.C0 = paramColorStateList;
    this.c.setColor(p(paramColorStateList));
    invalidate();
  }
  
  public void setTrackCornerSize(int paramInt) {
    if (this.O == paramInt)
      return; 
    this.O = paramInt;
    invalidate();
  }
  
  public void setTrackHeight(int paramInt) {
    if (this.F != paramInt) {
      this.F = paramInt;
      this.b.setStrokeWidth(paramInt);
      float f = this.F;
      this.c.setStrokeWidth(f);
      P(false);
    } 
  }
  
  public void setTrackIconActiveColor(ColorStateList paramColorStateList) {
    if (paramColorStateList == this.V)
      return; 
    this.V = paramColorStateList;
    M();
    L();
    invalidate();
  }
  
  public void setTrackIconActiveEnd(int paramInt) {
    Drawable drawable;
    if (paramInt != 0) {
      drawable = ws2.I(getContext(), paramInt);
    } else {
      drawable = null;
    } 
    setTrackIconActiveEnd(drawable);
  }
  
  public void setTrackIconActiveEnd(Drawable paramDrawable) {
    if (paramDrawable == this.T)
      return; 
    this.T = paramDrawable;
    this.U = false;
    L();
    invalidate();
  }
  
  public void setTrackIconActiveStart(int paramInt) {
    Drawable drawable;
    if (paramInt != 0) {
      drawable = ws2.I(getContext(), paramInt);
    } else {
      drawable = null;
    } 
    setTrackIconActiveStart(drawable);
  }
  
  public void setTrackIconActiveStart(Drawable paramDrawable) {
    if (paramDrawable == this.R)
      return; 
    this.R = paramDrawable;
    this.S = false;
    M();
    invalidate();
  }
  
  public void setTrackIconInactiveColor(ColorStateList paramColorStateList) {
    if (paramColorStateList == this.d0)
      return; 
    this.d0 = paramColorStateList;
    O();
    N();
    invalidate();
  }
  
  public void setTrackIconInactiveEnd(int paramInt) {
    Drawable drawable;
    if (paramInt != 0) {
      drawable = ws2.I(getContext(), paramInt);
    } else {
      drawable = null;
    } 
    setTrackIconInactiveEnd(drawable);
  }
  
  public void setTrackIconInactiveEnd(Drawable paramDrawable) {
    if (paramDrawable == this.b0)
      return; 
    this.b0 = paramDrawable;
    this.c0 = false;
    N();
    invalidate();
  }
  
  public void setTrackIconInactiveStart(int paramInt) {
    Drawable drawable;
    if (paramInt != 0) {
      drawable = ws2.I(getContext(), paramInt);
    } else {
      drawable = null;
    } 
    setTrackIconInactiveStart(drawable);
  }
  
  public void setTrackIconInactiveStart(Drawable paramDrawable) {
    if (paramDrawable == this.W)
      return; 
    this.W = paramDrawable;
    this.a0 = false;
    O();
    invalidate();
  }
  
  public void setTrackIconSize(int paramInt) {
    if (this.e0 == paramInt)
      return; 
    this.e0 = paramInt;
    invalidate();
  }
  
  public void setTrackInactiveTintList(ColorStateList paramColorStateList) {
    if (paramColorStateList.equals(this.D0))
      return; 
    this.D0 = paramColorStateList;
    this.b.setColor(p(paramColorStateList));
    invalidate();
  }
  
  public void setTrackInsideCornerSize(int paramInt) {
    if (this.P == paramInt)
      return; 
    this.P = paramInt;
    invalidate();
  }
  
  public void setTrackStopIndicatorSize(int paramInt) {
    if (this.N == paramInt)
      return; 
    this.N = paramInt;
    this.i.setStrokeWidth(paramInt);
    invalidate();
  }
  
  public void setTrackTintList(ColorStateList paramColorStateList) {
    setTrackInactiveTintList(paramColorStateList);
    setTrackActiveTintList(paramColorStateList);
  }
  
  public void setValueFrom(float paramFloat) {
    this.m0 = paramFloat;
    this.y0 = true;
    postInvalidate();
  }
  
  public void setValueTo(float paramFloat) {
    this.n0 = paramFloat;
    this.y0 = true;
    postInvalidate();
  }
  
  public void setValues(List<Float> paramList) {
    super.setValues(paramList);
  }
  
  public void setValues(Float... paramVarArgs) {
    super.setValues(paramVarArgs);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\com\google\android\material\slider\RangeSlider.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
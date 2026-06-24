package com.google.android.material.slider;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import g92;
import j30;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import k;
import l0;
import ls;
import n21;
import nl0;
import tp;
import vl1;
import wd;
import ws0;
import xd;
import yc1;
import z51;
import zb1;
import zo2;

public class RangeSlider2 extends xd {
  public float j0;
  
  public int k0;
  
  public RangeSlider2(Context paramContext) {
    this(paramContext, null);
  }
  
  public RangeSlider2(Context paramContext, AttributeSet paramAttributeSet) {
    this(paramContext, paramAttributeSet, 2130969957);
  }
  
  public RangeSlider2(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
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
    this.j0 = typedArray.getDimension(0, 0.0F);
    typedArray.recycle();
  }
  
  public CharSequence getAccessibilityClassName() {
    return SeekBar.class.getName();
  }
  
  public int getActiveThumbIndex() {
    return this.M;
  }
  
  public int getFocusedThumbIndex() {
    return this.N;
  }
  
  public int getHaloRadius() {
    return this.D;
  }
  
  public ColorStateList getHaloTintList() {
    return this.W;
  }
  
  public int getLabelBehavior() {
    return this.z;
  }
  
  public float getMinSeparation() {
    return this.j0;
  }
  
  public float getStepSize() {
    return this.O;
  }
  
  public float getThumbElevation() {
    return this.e0.c.n;
  }
  
  public int getThumbRadius() {
    return this.C;
  }
  
  public ColorStateList getThumbStrokeColor() {
    return this.e0.c.e;
  }
  
  public float getThumbStrokeWidth() {
    return this.e0.c.k;
  }
  
  public ColorStateList getThumbTintList() {
    return this.e0.c.d;
  }
  
  public int getTickActiveRadius() {
    return this.R;
  }
  
  public ColorStateList getTickActiveTintList() {
    return this.a0;
  }
  
  public int getTickInactiveRadius() {
    return this.S;
  }
  
  public ColorStateList getTickInactiveTintList() {
    return this.b0;
  }
  
  public ColorStateList getTickTintList() {
    if (this.b0.equals(this.a0))
      return this.a0; 
    tp.f("The inactive and active ticks are different colors. Use the getTickColorInactive() and getTickColorActive() methods instead.");
    return null;
  }
  
  public ColorStateList getTrackActiveTintList() {
    return this.c0;
  }
  
  public int getTrackHeight() {
    return this.A;
  }
  
  public ColorStateList getTrackInactiveTintList() {
    return this.d0;
  }
  
  public int getTrackSidePadding() {
    return this.B;
  }
  
  public ColorStateList getTrackTintList() {
    if (this.d0.equals(this.c0))
      return this.c0; 
    tp.f("The inactive and active parts of the track are different colors. Use the getInactiveTrackColor() and getActiveTrackColor() methods instead.");
    return null;
  }
  
  public int getTrackWidth() {
    return this.T;
  }
  
  public float getValueFrom() {
    return this.J;
  }
  
  public float getValueTo() {
    return this.K;
  }
  
  public List<Float> getValues() {
    return new ArrayList<Float>(this.L);
  }
  
  public final void onRestoreInstanceState(Parcelable paramParcelable) {
    yc1 yc1 = (yc1)paramParcelable;
    super.onRestoreInstanceState(yc1.getSuperState());
    this.j0 = yc1.b;
    int i = yc1.c;
    this.k0 = i;
    setSeparationUnit(i);
  }
  
  public final Parcelable onSaveInstanceState() {
    yc1 yc1 = new yc1((wd)super.onSaveInstanceState());
    yc1.b = this.j0;
    yc1.c = this.k0;
    return (Parcelable)yc1;
  }
  
  public void setCustomThumbDrawable(int paramInt) {
    setCustomThumbDrawable(getResources().getDrawable(paramInt));
  }
  
  public void setCustomThumbDrawable(Drawable paramDrawable) {
    paramDrawable = paramDrawable.mutate().getConstantState().newDrawable();
    a(paramDrawable);
    this.f0 = paramDrawable;
    this.g0.clear();
    postInvalidate();
  }
  
  public void setCustomThumbDrawablesForValues(int... paramVarArgs) {
    Drawable[] arrayOfDrawable = new Drawable[paramVarArgs.length];
    for (byte b = 0; b < paramVarArgs.length; b++)
      arrayOfDrawable[b] = getResources().getDrawable(paramVarArgs[b]); 
    setCustomThumbDrawablesForValues(arrayOfDrawable);
  }
  
  public void setCustomThumbDrawablesForValues(Drawable... paramVarArgs) {
    this.f0 = null;
    this.g0 = new ArrayList();
    int i = paramVarArgs.length;
    for (byte b = 0; b < i; b++) {
      Drawable drawable = paramVarArgs[b];
      List<Drawable> list = this.g0;
      drawable = drawable.mutate().getConstantState().newDrawable();
      a(drawable);
      list.add(drawable);
    } 
    postInvalidate();
  }
  
  public void setFocusedThumbIndex(int paramInt) {
    if (paramInt >= 0 && paramInt < this.L.size()) {
      this.N = paramInt;
      this.i.o(paramInt);
      postInvalidate();
      return;
    } 
    l0.l("index out of range");
  }
  
  public void setHaloRadius(int paramInt) {
    if (paramInt == this.D)
      return; 
    this.D = paramInt;
    Drawable drawable = getBackground();
    if (getBackground() instanceof RippleDrawable && drawable instanceof RippleDrawable) {
      ((RippleDrawable)drawable).setRadius(this.D);
      return;
    } 
    postInvalidate();
  }
  
  public void setHaloRadiusResource(int paramInt) {
    setHaloRadius(getResources().getDimensionPixelSize(paramInt));
  }
  
  public void setHaloTintList(ColorStateList paramColorStateList) {
    if (paramColorStateList.equals(this.W))
      return; 
    this.W = paramColorStateList;
    Drawable drawable = getBackground();
    if (getBackground() instanceof RippleDrawable && drawable instanceof RippleDrawable) {
      ((RippleDrawable)drawable).setColor(paramColorStateList);
      return;
    } 
    int i = g(paramColorStateList);
    Paint paint = this.f;
    paint.setColor(i);
    paint.setAlpha(63);
    invalidate();
  }
  
  public void setLabelBehavior(int paramInt) {
    if (this.z != paramInt) {
      this.z = paramInt;
      requestLayout();
    } 
  }
  
  public void setLabelFormatter(nl0 paramnl0) {
    this.H = paramnl0;
  }
  
  public void setMinSeparation(float paramFloat) {
    this.j0 = paramFloat;
    this.k0 = 0;
    setSeparationUnit(0);
  }
  
  public void setMinSeparationValue(float paramFloat) {
    this.j0 = paramFloat;
    this.k0 = 1;
    setSeparationUnit(1);
  }
  
  public void setStepSize(float paramFloat) {
    if (paramFloat >= 0.0F) {
      if (this.O != paramFloat) {
        this.O = paramFloat;
        this.V = true;
        postInvalidate();
      } 
      return;
    } 
    float f1 = this.J;
    float f2 = this.K;
    StringBuilder stringBuilder = new StringBuilder("The stepSize(");
    stringBuilder.append(paramFloat);
    stringBuilder.append(") must be 0, or a factor of the valueFrom(");
    stringBuilder.append(f1);
    stringBuilder.append(")-valueTo(");
    stringBuilder.append(f2);
    stringBuilder.append(") range");
    throw new IllegalArgumentException(stringBuilder.toString());
  }
  
  public void setThumbElevation(float paramFloat) {
    this.e0.n(paramFloat);
  }
  
  public void setThumbElevationResource(int paramInt) {
    setThumbElevation(getResources().getDimension(paramInt));
  }
  
  public void setThumbRadius(int paramInt) {
    if (paramInt == this.C)
      return; 
    this.C = paramInt;
    Object object2 = new Object();
    Object object5 = new Object();
    Object object4 = new Object();
    Object object3 = new Object();
    float f = this.C;
    z51 z51 = zo2.g(0);
    k k1 = new k(f);
    k k4 = new k(f);
    k k2 = new k(f);
    k k3 = new k(f);
    Object object1 = new Object();
    ((vl1)object1).a = z51;
    ((vl1)object1).b = z51;
    ((vl1)object1).c = z51;
    ((vl1)object1).d = z51;
    ((vl1)object1).e = (ls)k1;
    ((vl1)object1).f = (ls)k4;
    ((vl1)object1).g = (ls)k2;
    ((vl1)object1).h = (ls)k3;
    ((vl1)object1).i = (j30)object2;
    ((vl1)object1).j = (j30)object5;
    ((vl1)object1).k = (j30)object4;
    ((vl1)object1).l = (j30)object3;
    object2 = this.e0;
    object2.setShapeAppearanceModel((vl1)object1);
    paramInt = this.C * 2;
    object2.setBounds(0, 0, paramInt, paramInt);
    object1 = this.f0;
    if (object1 != null)
      a((Drawable)object1); 
    object1 = this.g0.iterator();
    while (object1.hasNext())
      a(object1.next()); 
    w();
  }
  
  public void setThumbRadiusResource(int paramInt) {
    setThumbRadius(getResources().getDimensionPixelSize(paramInt));
  }
  
  public void setThumbStrokeColor(ColorStateList paramColorStateList) {
    this.e0.t(paramColorStateList);
    postInvalidate();
  }
  
  public void setThumbStrokeColorResource(int paramInt) {
    if (paramInt != 0)
      setThumbStrokeColor(n21.y(getContext(), paramInt)); 
  }
  
  public void setThumbStrokeWidth(float paramFloat) {
    this.e0.u(paramFloat);
    postInvalidate();
  }
  
  public void setThumbStrokeWidthResource(int paramInt) {
    if (paramInt != 0)
      setThumbStrokeWidth(getResources().getDimension(paramInt)); 
  }
  
  public void setThumbTintList(ColorStateList paramColorStateList) {
    ws0 ws0 = this.e0;
    if (paramColorStateList.equals(ws0.c.d))
      return; 
    ws0.o(paramColorStateList);
    invalidate();
  }
  
  public void setTickActiveRadius(int paramInt) {
    if (this.R != paramInt) {
      this.R = paramInt;
      float f = (paramInt * 2);
      this.h.setStrokeWidth(f);
      w();
    } 
  }
  
  public void setTickActiveTintList(ColorStateList paramColorStateList) {
    if (paramColorStateList.equals(this.a0))
      return; 
    this.a0 = paramColorStateList;
    this.h.setColor(g(paramColorStateList));
    invalidate();
  }
  
  public void setTickInactiveRadius(int paramInt) {
    if (this.S != paramInt) {
      this.S = paramInt;
      float f = (paramInt * 2);
      this.g.setStrokeWidth(f);
      w();
    } 
  }
  
  public void setTickInactiveTintList(ColorStateList paramColorStateList) {
    if (paramColorStateList.equals(this.b0))
      return; 
    this.b0 = paramColorStateList;
    this.g.setColor(g(paramColorStateList));
    invalidate();
  }
  
  public void setTickTintList(ColorStateList paramColorStateList) {
    setTickInactiveTintList(paramColorStateList);
    setTickActiveTintList(paramColorStateList);
  }
  
  public void setTickVisible(boolean paramBoolean) {
    if (this.Q != paramBoolean) {
      this.Q = paramBoolean;
      postInvalidate();
    } 
  }
  
  public void setTrackActiveTintList(ColorStateList paramColorStateList) {
    if (paramColorStateList.equals(this.c0))
      return; 
    this.c0 = paramColorStateList;
    this.c.setColor(g(paramColorStateList));
    invalidate();
  }
  
  public void setTrackHeight(int paramInt) {
    if (this.A != paramInt) {
      this.A = paramInt;
      this.b.setStrokeWidth(paramInt);
      float f = this.A;
      this.c.setStrokeWidth(f);
      w();
    } 
  }
  
  public void setTrackInactiveTintList(ColorStateList paramColorStateList) {
    if (paramColorStateList.equals(this.d0))
      return; 
    this.d0 = paramColorStateList;
    this.b.setColor(g(paramColorStateList));
    invalidate();
  }
  
  public void setTrackTintList(ColorStateList paramColorStateList) {
    setTrackInactiveTintList(paramColorStateList);
    setTrackActiveTintList(paramColorStateList);
  }
  
  public void setValueFrom(float paramFloat) {
    this.J = paramFloat;
    this.V = true;
    postInvalidate();
  }
  
  public void setValueTo(float paramFloat) {
    this.K = paramFloat;
    this.V = true;
    postInvalidate();
  }
  
  public void setValues(List<Float> paramList) {
    r(new ArrayList<Float>(paramList));
  }
  
  public void setValues(Float... paramVarArgs) {
    ArrayList<? super Float> arrayList = new ArrayList();
    Collections.addAll(arrayList, paramVarArgs);
    r(arrayList);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\com\google\android\material\slider\RangeSlider2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
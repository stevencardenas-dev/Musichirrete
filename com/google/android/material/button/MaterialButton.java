package com.google.android.material.button;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatButton;
import bh0;
import cs0;
import ds0;
import f;
import fs0;
import g92;
import gm1;
import gs0;
import j;
import java.util.Iterator;
import java.util.LinkedHashSet;
import k;
import ky;
import l0;
import lo1;
import ls;
import mo1;
import mp1;
import n21;
import op1;
import p72;
import qv;
import tp;
import ul1;
import vl1;
import wf2;
import ws0;
import ws2;
import x41;
import yg1;
import zb1;
import zo2;

public class MaterialButton extends AppCompatButton implements Checkable, gm1 {
  public static final int[] H = new int[] { 16842911 };
  
  public static final int[] I = new int[] { 16842912 };
  
  public static final ky J = new ky(1);
  
  public boolean A;
  
  public int B;
  
  public op1 C;
  
  public int D;
  
  public float E;
  
  public float F;
  
  public lo1 G;
  
  public final gs0 f;
  
  public final LinkedHashSet g;
  
  public cs0 h;
  
  public PorterDuff.Mode i;
  
  public ColorStateList j;
  
  public Drawable k;
  
  public String l;
  
  public int m;
  
  public int n;
  
  public int o;
  
  public int p;
  
  public boolean q;
  
  public boolean r;
  
  public int s;
  
  public int t;
  
  public float u;
  
  public int v;
  
  public int w;
  
  public LinearLayout.LayoutParams x;
  
  public boolean y;
  
  public int z;
  
  public MaterialButton(Context paramContext) {
    this(paramContext, null);
  }
  
  public MaterialButton(Context paramContext, AttributeSet paramAttributeSet) {
    this(paramContext, paramAttributeSet, 2130969550);
  }
  
  public MaterialButton(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(qv.m0(paramInt, 2131952851, paramContext, paramAttributeSet, new int[] { 2130969586 }), paramAttributeSet, paramInt);
    vl1 vl1;
    this.g = new LinkedHashSet();
    boolean bool = false;
    this.q = false;
    this.r = false;
    this.t = -1;
    this.u = -1.0F;
    this.v = -1;
    this.w = -1;
    this.B = -1;
    paramContext = getContext();
    TypedArray typedArray = g92.S(paramContext, paramAttributeSet, zb1.n, paramInt, 2131952851, new int[0]);
    this.p = typedArray.getDimensionPixelSize(13, 0);
    int i = typedArray.getInt(16, -1);
    PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
    this.i = n21.N(i, mode);
    this.j = wf2.u(getContext(), typedArray, 15);
    this.k = wf2.y(getContext(), typedArray, 11);
    this.s = typedArray.getInteger(12, 1);
    this.m = typedArray.getDimensionPixelSize(14, 0);
    mp1 mp1 = mp1.b(paramContext, typedArray, 19);
    if (mp1 != null) {
      vl1 = mp1.c();
    } else {
      vl1 = vl1.b((Context)vl1, paramAttributeSet, paramInt, 2131952851).a();
    } 
    boolean bool1 = typedArray.getBoolean(17, false);
    gs0 gs01 = new gs0(this, vl1);
    this.f = gs01;
    gs01.f = typedArray.getDimensionPixelOffset(2, 0);
    gs01.g = typedArray.getDimensionPixelOffset(3, 0);
    gs01.h = typedArray.getDimensionPixelOffset(4, 0);
    gs01.i = typedArray.getDimensionPixelOffset(5, 0);
    if (typedArray.hasValue(9)) {
      paramInt = typedArray.getDimensionPixelSize(9, -1);
      gs01.j = paramInt;
      vl1 vl11 = gs01.b;
      float f = paramInt;
      ul1 ul1 = vl11.f();
      ul1.e = (ls)new k(f);
      ul1.f = (ls)new k(f);
      ul1.g = (ls)new k(f);
      ul1.h = (ls)new k(f);
      gs01.b = ul1.a();
      gs01.c = null;
      gs01.d();
      gs01.s = true;
    } 
    gs01.k = typedArray.getDimensionPixelSize(22, 0);
    gs01.l = n21.N(typedArray.getInt(8, -1), mode);
    gs01.m = wf2.u(getContext(), typedArray, 7);
    gs01.n = wf2.u(getContext(), typedArray, 21);
    gs01.o = wf2.u(getContext(), typedArray, 18);
    gs01.t = typedArray.getBoolean(6, false);
    gs01.w = typedArray.getDimensionPixelSize(10, 0);
    gs01.u = typedArray.getBoolean(23, true);
    paramInt = getPaddingStart();
    i = getPaddingTop();
    int k = getPaddingEnd();
    int j = getPaddingBottom();
    if (typedArray.hasValue(0)) {
      gs01.r = true;
      setSupportBackgroundTintList(gs01.m);
      setSupportBackgroundTintMode(gs01.l);
    } else {
      gs01.c();
    } 
    setPaddingRelative(paramInt + gs01.f, i + gs01.h, k + gs01.g, j + gs01.i);
    setCheckedInternal(typedArray.getBoolean(1, false));
    if (mp1 != null) {
      gs01.d = d();
      if (gs01.c != null)
        gs01.d(); 
      gs01.c = mp1;
      gs01.d();
    } 
    setOpticalCenterEnabled(bool1);
    typedArray.recycle();
    setCompoundDrawablePadding(this.p);
    if (this.k != null)
      bool = true; 
    h(bool);
  }
  
  private Layout.Alignment getActualTextAlignment() {
    int i = getTextAlignment();
    return (i != 1) ? ((i != 6 && i != 3) ? ((i != 4) ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER) : Layout.Alignment.ALIGN_OPPOSITE) : getGravityTextAlignment();
  }
  
  private float getDisplayedWidthIncrease() {
    return this.E;
  }
  
  private Layout.Alignment getGravityTextAlignment() {
    int i = getGravity() & 0x800007;
    return (i != 1) ? ((i != 5 && i != 8388613) ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE) : Layout.Alignment.ALIGN_CENTER;
  }
  
  private int getOpticalCenterShift() {
    if (this.y && this.A) {
      ws0 ws0 = this.f.a(false);
      if (ws0 != null)
        return (int)(ws0.g() * 0.11F); 
    } 
    return 0;
  }
  
  private int getTextHeight() {
    if (getLineCount() > 1)
      return getLayout().getHeight(); 
    TextPaint textPaint = getPaint();
    String str2 = getText().toString();
    String str1 = str2;
    if (getTransformationMethod() != null)
      str1 = getTransformationMethod().getTransformation(str2, (View)this).toString(); 
    Rect rect = new Rect();
    textPaint.getTextBounds(str1, 0, str1.length(), rect);
    return Math.min(rect.height(), getLayout().getHeight());
  }
  
  private int getTextLayoutWidth() {
    int i = getLineCount();
    float f = 0.0F;
    for (byte b = 0; b < i; b++)
      f = Math.max(f, getLayout().getLineWidth(b)); 
    return (int)Math.ceil(f);
  }
  
  private void setCheckedInternal(boolean paramBoolean) {
    gs0 gs01 = this.f;
    if (gs01 != null && gs01.t && this.q != paramBoolean) {
      this.q = paramBoolean;
      refreshDrawableState();
      if (getParent() instanceof MaterialButtonToggleGroup) {
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup)getParent();
        paramBoolean = this.q;
        if (!materialButtonToggleGroup.n)
          materialButtonToggleGroup.g(getId(), paramBoolean); 
      } 
      if (!this.r) {
        this.r = true;
        Iterator iterator = this.g.iterator();
        if (!iterator.hasNext()) {
          this.r = false;
          return;
        } 
        throw x41.g(iterator);
      } 
    } 
  }
  
  private void setDisplayedWidthIncrease(float paramFloat) {
    if (this.E != paramFloat) {
      this.E = paramFloat;
      j();
      invalidate();
      if (getParent() instanceof fs0) {
        fs0 fs0 = (fs0)getParent();
        int j = (int)this.E;
        int i = fs0.indexOfChild((View)this);
        if (i >= 0) {
          MaterialButton materialButton1;
          MaterialButton materialButton2;
          MaterialButton materialButton3;
          int k = i - 1;
          while (true) {
            materialButton3 = null;
            if (k >= 0) {
              if (fs0.c(k)) {
                MaterialButton materialButton = (MaterialButton)fs0.getChildAt(k);
                break;
              } 
              k--;
              continue;
            } 
            materialButton1 = null;
            break;
          } 
          int m = fs0.getChildCount();
          k = i;
          while (true) {
            i = k + 1;
            materialButton2 = materialButton3;
            if (i < m) {
              k = i;
              if (fs0.c(i)) {
                materialButton2 = (MaterialButton)fs0.getChildAt(i);
                break;
              } 
              continue;
            } 
            break;
          } 
          if (materialButton1 != null || materialButton2 != null) {
            if (materialButton1 == null)
              materialButton2.setDisplayedWidthDecrease(j); 
            if (materialButton2 == null)
              materialButton1.setDisplayedWidthDecrease(j); 
            if (materialButton1 != null && materialButton2 != null) {
              materialButton1.setDisplayedWidthDecrease(j / 2);
              materialButton2.setDisplayedWidthDecrease((j + 1) / 2);
            } 
          } 
        } 
      } 
    } 
  }
  
  public final mo1 d() {
    Context context = getContext();
    TypedValue typedValue = g92.Y(context, 2130969721);
    int[] arrayOfInt = zb1.u;
    if (typedValue == null) {
      typedArray = context.obtainStyledAttributes(null, arrayOfInt, 0, 2131951956);
    } else {
      typedArray = context.obtainStyledAttributes(((TypedValue)typedArray).resourceId, arrayOfInt);
    } 
    mo1 mo1 = new mo1();
    try {
      float f = typedArray.getFloat(1, Float.MIN_VALUE);
      if (f != Float.MIN_VALUE) {
        float f1 = typedArray.getFloat(0, Float.MIN_VALUE);
        if (f1 != Float.MIN_VALUE) {
          mo1.b(f);
          mo1.a(f1);
          typedArray.recycle();
          return mo1;
        } 
        IllegalArgumentException illegalArgumentException1 = new IllegalArgumentException();
        this("A MaterialSpring style must have a damping value.");
        throw illegalArgumentException1;
      } 
    } finally {}
    IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
    this("A MaterialSpring style must have stiffness value.");
    TypedArray typedArray;
    throw illegalArgumentException;
  }
  
  public final boolean e() {
    gs0 gs01 = this.f;
    return (gs01 != null && !gs01.r);
  }
  
  public final void f(boolean paramBoolean) {
    // Byte code:
    //   0: aload_0
    //   1: getfield C : Lop1;
    //   4: ifnonnull -> 10
    //   7: goto -> 293
    //   10: aload_0
    //   11: getfield G : Llo1;
    //   14: ifnonnull -> 45
    //   17: new lo1
    //   20: dup
    //   21: aload_0
    //   22: getstatic com/google/android/material/button/MaterialButton.J : Lky;
    //   25: invokespecial <init> : (Ljava/lang/Object;Lqv;)V
    //   28: astore #8
    //   30: aload_0
    //   31: aload #8
    //   33: putfield G : Llo1;
    //   36: aload #8
    //   38: aload_0
    //   39: invokevirtual d : ()Lmo1;
    //   42: putfield m : Lmo1;
    //   45: aload_0
    //   46: getfield A : Z
    //   49: ifeq -> 293
    //   52: aload_0
    //   53: getfield D : I
    //   56: istore #7
    //   58: aload_0
    //   59: getfield C : Lop1;
    //   62: astore #8
    //   64: aload_0
    //   65: invokevirtual getDrawableState : ()[I
    //   68: astore #9
    //   70: aload #8
    //   72: getfield c : [[I
    //   75: astore #10
    //   77: iconst_0
    //   78: istore #5
    //   80: iconst_0
    //   81: istore_3
    //   82: aload #8
    //   84: getfield a : I
    //   87: istore #4
    //   89: iconst_m1
    //   90: istore #6
    //   92: iload_3
    //   93: iload #4
    //   95: if_icmpge -> 119
    //   98: aload #10
    //   100: iload_3
    //   101: aaload
    //   102: aload #9
    //   104: invokestatic stateSetMatches : ([I[I)Z
    //   107: ifeq -> 113
    //   110: goto -> 121
    //   113: iinc #3, 1
    //   116: goto -> 82
    //   119: iconst_m1
    //   120: istore_3
    //   121: iload_3
    //   122: istore #4
    //   124: iload_3
    //   125: ifge -> 184
    //   128: getstatic android/util/StateSet.WILD_CARD : [I
    //   131: astore #10
    //   133: aload #8
    //   135: getfield c : [[I
    //   138: astore #9
    //   140: iconst_0
    //   141: istore #4
    //   143: iload #6
    //   145: istore_3
    //   146: iload #4
    //   148: aload #8
    //   150: getfield a : I
    //   153: if_icmpge -> 181
    //   156: aload #9
    //   158: iload #4
    //   160: aaload
    //   161: aload #10
    //   163: invokestatic stateSetMatches : ([I[I)Z
    //   166: ifeq -> 175
    //   169: iload #4
    //   171: istore_3
    //   172: goto -> 181
    //   175: iinc #4, 1
    //   178: goto -> 143
    //   181: iload_3
    //   182: istore #4
    //   184: iload #4
    //   186: ifge -> 199
    //   189: aload #8
    //   191: getfield b : Lbh0;
    //   194: astore #8
    //   196: goto -> 209
    //   199: aload #8
    //   201: getfield d : [Lbh0;
    //   204: iload #4
    //   206: aaload
    //   207: astore #8
    //   209: aload #8
    //   211: getfield c : Ljava/lang/Object;
    //   214: checkcast np1
    //   217: astore #8
    //   219: aload_0
    //   220: invokevirtual getWidth : ()I
    //   223: istore_3
    //   224: aload #8
    //   226: getfield b : F
    //   229: fstore_2
    //   230: aload #8
    //   232: getfield a : I
    //   235: istore #4
    //   237: iload #4
    //   239: iconst_1
    //   240: if_icmpne -> 254
    //   243: fload_2
    //   244: iload_3
    //   245: i2f
    //   246: fmul
    //   247: fstore_2
    //   248: fload_2
    //   249: f2i
    //   250: istore_3
    //   251: goto -> 266
    //   254: iload #5
    //   256: istore_3
    //   257: iload #4
    //   259: iconst_2
    //   260: if_icmpne -> 266
    //   263: goto -> 248
    //   266: iload #7
    //   268: iload_3
    //   269: invokestatic min : (II)I
    //   272: istore_3
    //   273: aload_0
    //   274: getfield G : Llo1;
    //   277: iload_3
    //   278: i2f
    //   279: invokevirtual a : (F)V
    //   282: iload_1
    //   283: ifeq -> 293
    //   286: aload_0
    //   287: getfield G : Llo1;
    //   290: invokevirtual d : ()V
    //   293: return
  }
  
  public final void g() {
    int i = this.s;
    if (i == 1 || i == 2) {
      setCompoundDrawablesRelative(this.k, null, null, null);
      return;
    } 
    if (i == 3 || i == 4) {
      setCompoundDrawablesRelative(null, null, this.k, null);
      return;
    } 
    if (i == 16 || i == 32) {
      setCompoundDrawablesRelative(null, this.k, null, null);
      return;
    } 
  }
  
  public String getA11yClassName() {
    Class<Button> clazz;
    if (!TextUtils.isEmpty(this.l))
      return this.l; 
    gs0 gs01 = this.f;
    if (gs01 != null && gs01.t) {
      Class<CompoundButton> clazz1 = CompoundButton.class;
    } else {
      clazz = Button.class;
    } 
    return clazz.getName();
  }
  
  public int getAllowedWidthDecrease() {
    return this.B;
  }
  
  public ColorStateList getBackgroundTintList() {
    return getSupportBackgroundTintList();
  }
  
  public PorterDuff.Mode getBackgroundTintMode() {
    return getSupportBackgroundTintMode();
  }
  
  public int getCornerRadius() {
    return e() ? this.f.j : 0;
  }
  
  public mo1 getCornerSpringForce() {
    return this.f.d;
  }
  
  public Drawable getIcon() {
    return this.k;
  }
  
  public int getIconGravity() {
    return this.s;
  }
  
  public int getIconPadding() {
    return this.p;
  }
  
  public int getIconSize() {
    return this.m;
  }
  
  public ColorStateList getIconTint() {
    return this.j;
  }
  
  public PorterDuff.Mode getIconTintMode() {
    return this.i;
  }
  
  public int getInsetBottom() {
    return this.f.i;
  }
  
  public int getInsetTop() {
    return this.f.h;
  }
  
  public ColorStateList getRippleColor() {
    return e() ? this.f.o : null;
  }
  
  public vl1 getShapeAppearanceModel() {
    if (e())
      return this.f.b; 
    tp.f("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    return null;
  }
  
  public mp1 getStateListShapeAppearanceModel() {
    if (e())
      return this.f.c; 
    tp.f("Attempted to get StateListShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    return null;
  }
  
  public ColorStateList getStrokeColor() {
    return e() ? this.f.n : null;
  }
  
  public int getStrokeWidth() {
    return e() ? this.f.k : 0;
  }
  
  public ColorStateList getSupportBackgroundTintList() {
    return e() ? this.f.m : super.getSupportBackgroundTintList();
  }
  
  public PorterDuff.Mode getSupportBackgroundTintMode() {
    return e() ? this.f.l : super.getSupportBackgroundTintMode();
  }
  
  public final void h(boolean paramBoolean) {
    Drawable drawable1 = this.k;
    if (drawable1 != null) {
      drawable1 = drawable1.mutate();
      this.k = drawable1;
      drawable1.setTintList(this.j);
      PorterDuff.Mode mode = this.i;
      if (mode != null)
        this.k.setTintMode(mode); 
      int j = this.m;
      if (j == 0)
        j = this.k.getIntrinsicWidth(); 
      int k = this.m;
      if (k == 0)
        k = this.k.getIntrinsicHeight(); 
      Drawable drawable = this.k;
      int n = this.n;
      int m = this.o;
      drawable.setBounds(n, m, j + n, k + m);
      this.k.setVisible(true, paramBoolean);
    } 
    if (paramBoolean) {
      g();
      return;
    } 
    Drawable[] arrayOfDrawable = getCompoundDrawablesRelative();
    Drawable drawable2 = arrayOfDrawable[0];
    drawable1 = arrayOfDrawable[1];
    Drawable drawable3 = arrayOfDrawable[2];
    int i = this.s;
    if (((i != 1 && i != 2) || drawable2 == this.k) && ((i != 3 && i != 4) || drawable3 == this.k))
      if (i == 16 || i == 32) {
        if (drawable1 == this.k)
          return; 
      } else {
        return;
      }  
    g();
  }
  
  public final void i(int paramInt1, int paramInt2) {
    if (this.k != null && getLayout() != null) {
      int j = this.s;
      int i = 1;
      if (j == 1 || j == 2 || j == 3 || j == 4) {
        this.o = 0;
        Layout.Alignment alignment = getActualTextAlignment();
        paramInt2 = this.s;
        if (paramInt2 == 1 || paramInt2 == 3 || (paramInt2 == 2 && alignment == Layout.Alignment.ALIGN_NORMAL) || (paramInt2 == 4 && alignment == Layout.Alignment.ALIGN_OPPOSITE)) {
          this.n = 0;
          h(false);
          return;
        } 
        j = this.m;
        paramInt2 = j;
        if (j == 0)
          paramInt2 = this.k.getIntrinsicWidth(); 
        paramInt2 = paramInt1 - getTextLayoutWidth() - getPaddingEnd() - paramInt2 - this.p - getPaddingStart();
        paramInt1 = paramInt2;
        if (alignment == Layout.Alignment.ALIGN_CENTER)
          paramInt1 = paramInt2 / 2; 
        if (getLayoutDirection() == 1) {
          paramInt2 = 1;
        } else {
          paramInt2 = 0;
        } 
        if (this.s != 4)
          i = 0; 
        j = paramInt1;
        if (paramInt2 != i)
          j = -paramInt1; 
        if (this.n != j) {
          this.n = j;
          h(false);
          return;
        } 
        return;
      } 
      if (j == 16 || j == 32) {
        this.n = 0;
        if (j == 16) {
          this.o = 0;
          h(false);
          return;
        } 
        i = this.m;
        paramInt1 = i;
        if (i == 0)
          paramInt1 = this.k.getIntrinsicHeight(); 
        paramInt1 = Math.max(0, (paramInt2 - getTextHeight() - getPaddingTop() - paramInt1 - this.p - getPaddingBottom()) / 2);
        if (this.o != paramInt1) {
          this.o = paramInt1;
          h(false);
          return;
        } 
        return;
      } 
      return;
    } 
  }
  
  public final boolean isChecked() {
    return this.q;
  }
  
  public final void j() {
    int j = (int)(this.E - this.F);
    int i = j / 2 + this.z;
    (getLayoutParams()).width = (int)(this.u + j);
    setPaddingRelative(this.v + i, getPaddingTop(), this.w + j - i, getPaddingBottom());
  }
  
  public final void onAttachedToWindow() {
    super.onAttachedToWindow();
    if (e())
      zo2.S((View)this, this.f.a(false)); 
  }
  
  public final int[] onCreateDrawableState(int paramInt) {
    int[] arrayOfInt = super.onCreateDrawableState(paramInt + 2);
    gs0 gs01 = this.f;
    if (gs01 != null && gs01.t)
      View.mergeDrawableStates(arrayOfInt, H); 
    if (this.q)
      View.mergeDrawableStates(arrayOfInt, I); 
    return arrayOfInt;
  }
  
  public final void onInitializeAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent) {
    super.onInitializeAccessibilityEvent(paramAccessibilityEvent);
    paramAccessibilityEvent.setClassName(getA11yClassName());
    paramAccessibilityEvent.setChecked(this.q);
  }
  
  public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo paramAccessibilityNodeInfo) {
    boolean bool;
    super.onInitializeAccessibilityNodeInfo(paramAccessibilityNodeInfo);
    paramAccessibilityNodeInfo.setClassName(getA11yClassName());
    gs0 gs01 = this.f;
    if (gs01 != null && gs01.t) {
      bool = true;
    } else {
      bool = false;
    } 
    paramAccessibilityNodeInfo.setCheckable(bool);
    paramAccessibilityNodeInfo.setChecked(this.q);
    paramAccessibilityNodeInfo.setClickable(isClickable());
  }
  
  public final void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    i(getMeasuredWidth(), getMeasuredHeight());
    paramInt1 = (getResources().getConfiguration()).orientation;
    if (this.t != paramInt1) {
      this.t = paramInt1;
      this.u = -1.0F;
    } 
    if (this.u == -1.0F) {
      this.u = getMeasuredWidth();
      if (this.x == null && getParent() instanceof fs0 && ((fs0)getParent()).getButtonSizeChange() != null) {
        this.x = (LinearLayout.LayoutParams)getLayoutParams();
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.x);
        layoutParams.width = (int)this.u;
        setLayoutParams((ViewGroup.LayoutParams)layoutParams);
      } 
    } 
    paramInt1 = this.B;
    boolean bool = false;
    if (paramInt1 == -1) {
      if (this.k == null) {
        paramInt1 = 0;
      } else {
        paramInt3 = getIconPadding();
        paramInt2 = this.m;
        paramInt1 = paramInt2;
        if (paramInt2 == 0)
          paramInt1 = this.k.getIntrinsicWidth(); 
        paramInt1 = paramInt3 + paramInt1;
      } 
      this.B = getMeasuredWidth() - getTextLayoutWidth() - paramInt1;
    } 
    if (this.v == -1)
      this.v = getPaddingStart(); 
    if (this.w == -1)
      this.w = getPaddingEnd(); 
    paramBoolean = bool;
    if (getParent() instanceof fs0) {
      paramBoolean = bool;
      if (((fs0)getParent()).getOrientation() == 0)
        paramBoolean = true; 
    } 
    this.A = paramBoolean;
  }
  
  public final void onRestoreInstanceState(Parcelable paramParcelable) {
    if (!(paramParcelable instanceof ds0)) {
      super.onRestoreInstanceState(paramParcelable);
      return;
    } 
    ds0 ds0 = (ds0)paramParcelable;
    super.onRestoreInstanceState(((j)ds0).b);
    setChecked(ds0.e);
  }
  
  public final Parcelable onSaveInstanceState() {
    j j = new j(super.onSaveInstanceState());
    ((ds0)j).e = this.q;
    return (Parcelable)j;
  }
  
  public final void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3) {
    super.onTextChanged(paramCharSequence, paramInt1, paramInt2, paramInt3);
    i(getMeasuredWidth(), getMeasuredHeight());
  }
  
  public final boolean performClick() {
    if (isEnabled() && this.f.u)
      toggle(); 
    return super.performClick();
  }
  
  public final void refreshDrawableState() {
    super.refreshDrawableState();
    if (this.k != null) {
      int[] arrayOfInt = getDrawableState();
      if (this.k.setState(arrayOfInt))
        invalidate(); 
    } 
  }
  
  public void setA11yClassName(String paramString) {
    this.l = paramString;
  }
  
  public void setBackground(Drawable paramDrawable) {
    setBackgroundDrawable(paramDrawable);
  }
  
  public void setBackgroundColor(int paramInt) {
    if (e()) {
      gs0 gs01 = this.f;
      if (gs01.a(false) != null)
        gs01.a(false).setTint(paramInt); 
      return;
    } 
    super.setBackgroundColor(paramInt);
  }
  
  public void setBackgroundDrawable(Drawable paramDrawable) {
    if (e()) {
      if (paramDrawable != getBackground()) {
        Log.w("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
        gs0 gs01 = this.f;
        gs01.r = true;
        MaterialButton materialButton = gs01.a;
        materialButton.setSupportBackgroundTintList(gs01.m);
        materialButton.setSupportBackgroundTintMode(gs01.l);
        super.setBackgroundDrawable(paramDrawable);
        return;
      } 
      getBackground().setState(paramDrawable.getState());
      return;
    } 
    super.setBackgroundDrawable(paramDrawable);
  }
  
  public void setBackgroundResource(int paramInt) {
    Drawable drawable;
    if (paramInt != 0) {
      drawable = ws2.I(getContext(), paramInt);
    } else {
      drawable = null;
    } 
    setBackgroundDrawable(drawable);
  }
  
  public void setBackgroundTintList(ColorStateList paramColorStateList) {
    setSupportBackgroundTintList(paramColorStateList);
  }
  
  public void setBackgroundTintMode(PorterDuff.Mode paramMode) {
    setSupportBackgroundTintMode(paramMode);
  }
  
  public void setCheckable(boolean paramBoolean) {
    if (e())
      this.f.t = paramBoolean; 
  }
  
  public void setChecked(boolean paramBoolean) {
    setCheckedInternal(paramBoolean);
  }
  
  public void setCornerRadius(int paramInt) {
    if (e()) {
      gs0 gs01 = this.f;
      if (!gs01.s || gs01.j != paramInt) {
        gs01.j = paramInt;
        gs01.s = true;
        vl1 vl1 = gs01.b;
        float f = paramInt;
        ul1 ul1 = vl1.f();
        ul1.e = (ls)new k(f);
        ul1.f = (ls)new k(f);
        ul1.g = (ls)new k(f);
        ul1.h = (ls)new k(f);
        gs01.b = ul1.a();
        gs01.c = null;
        gs01.d();
      } 
    } 
  }
  
  public void setCornerRadiusResource(int paramInt) {
    if (e())
      setCornerRadius(getResources().getDimensionPixelSize(paramInt)); 
  }
  
  public void setCornerSpringForce(mo1 parammo1) {
    gs0 gs01 = this.f;
    gs01.d = parammo1;
    if (gs01.c != null)
      gs01.d(); 
  }
  
  public void setDisplayedWidthDecrease(int paramInt) {
    this.F = Math.min(paramInt, this.B);
    j();
    invalidate();
  }
  
  public void setElevation(float paramFloat) {
    super.setElevation(paramFloat);
    if (e())
      this.f.a(false).n(paramFloat); 
  }
  
  public void setIcon(Drawable paramDrawable) {
    if (this.k != paramDrawable) {
      this.k = paramDrawable;
      h(true);
      i(getMeasuredWidth(), getMeasuredHeight());
    } 
  }
  
  public void setIconGravity(int paramInt) {
    if (this.s != paramInt) {
      this.s = paramInt;
      i(getMeasuredWidth(), getMeasuredHeight());
    } 
  }
  
  public void setIconPadding(int paramInt) {
    if (this.p != paramInt) {
      this.p = paramInt;
      setCompoundDrawablePadding(paramInt);
    } 
  }
  
  public void setIconResource(int paramInt) {
    Drawable drawable;
    if (paramInt != 0) {
      drawable = ws2.I(getContext(), paramInt);
    } else {
      drawable = null;
    } 
    setIcon(drawable);
  }
  
  public void setIconSize(int paramInt) {
    if (paramInt >= 0) {
      if (this.m != paramInt) {
        this.m = paramInt;
        h(true);
      } 
      return;
    } 
    l0.l("iconSize cannot be less than 0");
  }
  
  public void setIconTint(ColorStateList paramColorStateList) {
    if (this.j != paramColorStateList) {
      this.j = paramColorStateList;
      h(false);
    } 
  }
  
  public void setIconTintMode(PorterDuff.Mode paramMode) {
    if (this.i != paramMode) {
      this.i = paramMode;
      h(false);
    } 
  }
  
  public void setIconTintResource(int paramInt) {
    setIconTint(n21.y(getContext(), paramInt));
  }
  
  public void setInsetBottom(int paramInt) {
    gs0 gs01 = this.f;
    gs01.b(gs01.h, paramInt);
  }
  
  public void setInsetTop(int paramInt) {
    gs0 gs01 = this.f;
    gs01.b(paramInt, gs01.i);
  }
  
  public void setInternalBackground(Drawable paramDrawable) {
    super.setBackgroundDrawable(paramDrawable);
  }
  
  public void setOnPressedChangeListenerInternal(cs0 paramcs0) {
    this.h = paramcs0;
  }
  
  public void setOpticalCenterEnabled(boolean paramBoolean) {
    if (this.y != paramBoolean) {
      ws0 ws0;
      this.y = paramBoolean;
      gs0 gs01 = this.f;
      if (paramBoolean) {
        f f = new f(20, this);
        gs01.e = f;
        ws0 = gs01.a(false);
        if (ws0 != null)
          ws0.G = f; 
      } else {
        ((gs0)ws0).e = null;
        ws0 ws01 = ws0.a(false);
        if (ws01 != null)
          ws01.G = null; 
      } 
      post((Runnable)new p72(1, this));
    } 
  }
  
  public void setPressed(boolean paramBoolean) {
    cs0 cs01 = this.h;
    if (cs01 != null)
      ((MaterialButtonToggleGroup)((bh0)cs01).c).invalidate(); 
    super.setPressed(paramBoolean);
    f(false);
  }
  
  public void setRippleColor(ColorStateList paramColorStateList) {
    if (e()) {
      gs0 gs01 = this.f;
      MaterialButton materialButton = gs01.a;
      if (gs01.o != paramColorStateList) {
        gs01.o = paramColorStateList;
        if (materialButton.getBackground() instanceof RippleDrawable)
          ((RippleDrawable)materialButton.getBackground()).setColor(yg1.c(paramColorStateList)); 
      } 
    } 
  }
  
  public void setRippleColorResource(int paramInt) {
    if (e())
      setRippleColor(n21.y(getContext(), paramInt)); 
  }
  
  public void setShapeAppearanceModel(vl1 paramvl1) {
    if (e()) {
      gs0 gs01 = this.f;
      gs01.b = paramvl1;
      gs01.c = null;
      gs01.d();
      return;
    } 
    tp.f("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
  }
  
  public void setShouldDrawSurfaceColorStroke(boolean paramBoolean) {
    if (e()) {
      gs0 gs01 = this.f;
      gs01.q = paramBoolean;
      gs01.e();
    } 
  }
  
  public void setSizeChange(op1 paramop1) {
    if (this.C != paramop1) {
      this.C = paramop1;
      f(true);
    } 
  }
  
  public void setStateListShapeAppearanceModel(mp1 parammp1) {
    if (e()) {
      gs0 gs01 = this.f;
      if (gs01.d == null && parammp1.d()) {
        gs01.d = d();
        if (gs01.c != null)
          gs01.d(); 
      } 
      gs01.c = parammp1;
      gs01.d();
      return;
    } 
    tp.f("Attempted to set StateListShapeAppearanceModel on a MaterialButton which has an overwritten background.");
  }
  
  public void setStrokeColor(ColorStateList paramColorStateList) {
    if (e()) {
      gs0 gs01 = this.f;
      if (gs01.n != paramColorStateList) {
        gs01.n = paramColorStateList;
        gs01.e();
      } 
    } 
  }
  
  public void setStrokeColorResource(int paramInt) {
    if (e())
      setStrokeColor(n21.y(getContext(), paramInt)); 
  }
  
  public void setStrokeWidth(int paramInt) {
    if (e()) {
      gs0 gs01 = this.f;
      if (gs01.k != paramInt) {
        gs01.k = paramInt;
        gs01.e();
      } 
    } 
  }
  
  public void setStrokeWidthResource(int paramInt) {
    if (e())
      setStrokeWidth(getResources().getDimensionPixelSize(paramInt)); 
  }
  
  public void setSupportBackgroundTintList(ColorStateList paramColorStateList) {
    if (e()) {
      gs0 gs01 = this.f;
      if (gs01.m != paramColorStateList) {
        gs01.m = paramColorStateList;
        if (gs01.a(false) != null)
          gs01.a(false).setTintList(gs01.m); 
      } 
      return;
    } 
    super.setSupportBackgroundTintList(paramColorStateList);
  }
  
  public void setSupportBackgroundTintMode(PorterDuff.Mode paramMode) {
    if (e()) {
      gs0 gs01 = this.f;
      if (gs01.l != paramMode) {
        gs01.l = paramMode;
        if (gs01.a(false) != null && gs01.l != null)
          gs01.a(false).setTintMode(gs01.l); 
      } 
      return;
    } 
    super.setSupportBackgroundTintMode(paramMode);
  }
  
  public void setTextAlignment(int paramInt) {
    super.setTextAlignment(paramInt);
    i(getMeasuredWidth(), getMeasuredHeight());
  }
  
  public void setToggleCheckedStateOnClick(boolean paramBoolean) {
    this.f.u = paramBoolean;
  }
  
  public void setWidth(int paramInt) {
    this.u = -1.0F;
    super.setWidth(paramInt);
  }
  
  public void setWidthChangeMax(int paramInt) {
    if (this.D != paramInt) {
      this.D = paramInt;
      f(true);
    } 
  }
  
  public final void toggle() {
    setChecked(this.q ^ true);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\com\google\android\material\button\MaterialButton.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
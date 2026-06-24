package com.google.android.material.checkbox;

import a5;
import android.animation.Animator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable2;
import android.graphics.drawable.AnimatedStateListDrawable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.autofill.AutofillManager;
import android.widget.CompoundButton;
import androidx.appcompat.widget.AppCompatCheckBox;
import b5;
import g92;
import j1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import lg1;
import ls0;
import m92;
import md;
import n12;
import n21;
import qv;
import wf2;
import ws2;
import x4;
import x41;
import z4;
import zb1;
import zv0;

public class MaterialCheckBox extends AppCompatCheckBox {
  public static final int[] A = new int[] { 2130970004 };
  
  public static final int[] B = new int[] { 2130970003 };
  
  public static final int[][] C;
  
  public static final int D = Resources.getSystem().getIdentifier("btn_check_material_anim", "drawable", "android");
  
  public final LinkedHashSet g = new LinkedHashSet();
  
  public final LinkedHashSet h = new LinkedHashSet();
  
  public ColorStateList i;
  
  public boolean j;
  
  public boolean k;
  
  public boolean l;
  
  public CharSequence m;
  
  public Drawable n;
  
  public Drawable o;
  
  public boolean p;
  
  public ColorStateList q;
  
  public ColorStateList r;
  
  public PorterDuff.Mode s;
  
  public int t;
  
  public int[] u;
  
  public boolean v;
  
  public CharSequence w;
  
  public CompoundButton.OnCheckedChangeListener x;
  
  public final b5 y;
  
  public final md z;
  
  public MaterialCheckBox(Context paramContext) {
    this(paramContext, null);
  }
  
  public MaterialCheckBox(Context paramContext, AttributeSet paramAttributeSet) {
    this(paramContext, paramAttributeSet, 2130968821);
  }
  
  public MaterialCheckBox(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(qv.n0(paramContext, paramAttributeSet, paramInt, 2131952875), paramAttributeSet, paramInt);
    Context context2 = getContext();
    b5 b51 = new b5(context2);
    Resources resources = context2.getResources();
    Resources.Theme theme = context2.getTheme();
    ThreadLocal threadLocal = lg1.a;
    Drawable drawable = resources.getDrawable(2131231538, theme);
    ((n12)b51).b = drawable;
    drawable.setCallback((Drawable.Callback)b51.h);
    new a5(((n12)b51).b.getConstantState());
    this.y = b51;
    this.z = new md((View)this, 2);
    Context context1 = getContext();
    this.n = getButtonDrawable();
    this.q = getSuperButtonTintList();
    setSupportButtonTintList(null);
    g92.m(context1, paramAttributeSet, paramInt, 2131952875);
    int[] arrayOfInt = zb1.r;
    g92.o(context1, paramAttributeSet, arrayOfInt, paramInt, 2131952875, new int[0]);
    TypedArray typedArray = context1.obtainStyledAttributes(paramAttributeSet, arrayOfInt, paramInt, 2131952875);
    zv0 zv0 = new zv0(context1, typedArray);
    this.o = zv0.o(2);
    if (this.n != null && g92.a0(context1, 2130969357, false)) {
      paramInt = typedArray.getResourceId(0, 0);
      int i = typedArray.getResourceId(1, 0);
      if (paramInt == D && i == 0) {
        super.setButtonDrawable(null);
        this.n = ws2.I(context1, 2131231537);
        this.p = true;
        if (this.o == null)
          this.o = ws2.I(context1, 2131231539); 
      } 
    } 
    this.r = wf2.t(context1, zv0, 3);
    this.s = n21.N(typedArray.getInt(4, -1), PorterDuff.Mode.SRC_IN);
    this.j = typedArray.getBoolean(10, false);
    this.k = typedArray.getBoolean(6, true);
    this.l = typedArray.getBoolean(9, false);
    this.m = typedArray.getText(8);
    if (typedArray.hasValue(7))
      setCheckedState(typedArray.getInt(7, 0)); 
    zv0.z();
    a();
  }
  
  private String getButtonStateDescription() {
    int i = this.t;
    return (i == 1) ? getResources().getString(2131886896) : ((i == 0) ? getResources().getString(2131886898) : getResources().getString(2131886897));
  }
  
  private ColorStateList getMaterialThemeColorsTintList() {
    if (this.i == null) {
      int m = m92.x((View)this, 2130968899);
      int k = m92.x((View)this, 2130968903);
      int i = m92.x((View)this, 2130968945);
      int j = m92.x((View)this, 2130968921);
      k = m92.L(1.0F, i, k);
      int i1 = m92.L(1.0F, i, m);
      m = m92.L(0.54F, i, j);
      int n = m92.L(0.38F, i, j);
      i = m92.L(0.38F, i, j);
      this.i = new ColorStateList(C, new int[] { k, i1, m, n, i });
    } 
    return this.i;
  }
  
  private ColorStateList getSuperButtonTintList() {
    ColorStateList colorStateList = this.q;
    return (colorStateList != null) ? colorStateList : ((super.getButtonTintList() != null) ? super.getButtonTintList() : getSupportButtonTintList());
  }
  
  public final void a() {
    LayerDrawable layerDrawable;
    Drawable drawable2 = this.n;
    ColorStateList colorStateList = this.q;
    PorterDuff.Mode mode = getButtonTintMode();
    if (drawable2 == null) {
      drawable1 = null;
    } else {
      drawable1 = drawable2;
      if (colorStateList != null) {
        drawable2 = drawable2.mutate();
        drawable1 = drawable2;
        if (mode != null) {
          drawable2.setTintMode(mode);
          drawable1 = drawable2;
        } 
      } 
    } 
    this.n = drawable1;
    drawable2 = this.o;
    colorStateList = this.r;
    mode = this.s;
    if (drawable2 == null) {
      drawable1 = null;
    } else {
      drawable1 = drawable2;
      if (colorStateList != null) {
        drawable2 = drawable2.mutate();
        drawable1 = drawable2;
        if (mode != null) {
          drawable2.setTintMode(mode);
          drawable1 = drawable2;
        } 
      } 
    } 
    this.o = drawable1;
    if (this.p) {
      b5 b51 = this.y;
      if (b51 != null) {
        AnimatedVectorDrawable animatedVectorDrawable;
        z4 z4 = b51.c;
        Drawable drawable4 = ((n12)b51).b;
        md md1 = this.z;
        if (drawable4 != null) {
          AnimatedVectorDrawable animatedVectorDrawable1 = (AnimatedVectorDrawable)drawable4;
          if (md1.a == null)
            md1.a = new x4(md1); 
          animatedVectorDrawable1.unregisterAnimationCallback((Animatable2.AnimationCallback)md1.a);
        } 
        ArrayList arrayList = b51.g;
        if (arrayList != null && md1 != null) {
          arrayList.remove(md1);
          if (b51.g.size() == 0) {
            j1 j1 = b51.f;
            if (j1 != null) {
              z4.b.removeListener((Animator.AnimatorListener)j1);
              b51.f = null;
            } 
          } 
        } 
        Drawable drawable3 = ((n12)b51).b;
        if (drawable3 != null) {
          animatedVectorDrawable = (AnimatedVectorDrawable)drawable3;
          if (md1.a == null)
            md1.a = new x4(md1); 
          animatedVectorDrawable.registerAnimationCallback((Animatable2.AnimationCallback)md1.a);
        } else if (md1 != null) {
          if (b51.g == null)
            b51.g = new ArrayList(); 
          if (!b51.g.contains(md1)) {
            b51.g.add(md1);
            if (b51.f == null)
              b51.f = new j1(1, b51); 
            ((z4)animatedVectorDrawable).b.addListener((Animator.AnimatorListener)b51.f);
          } 
        } 
      } 
      drawable2 = this.n;
      if (drawable2 instanceof AnimatedStateListDrawable && b51 != null) {
        ((AnimatedStateListDrawable)drawable2).addTransition(2131296574, 2131297914, (Drawable)b51, false);
        ((AnimatedStateListDrawable)this.n).addTransition(2131296825, 2131297914, (Drawable)b51, false);
      } 
    } 
    Drawable drawable1 = this.n;
    if (drawable1 != null) {
      ColorStateList colorStateList1 = this.q;
      if (colorStateList1 != null)
        drawable1.setTintList(colorStateList1); 
    } 
    drawable1 = this.o;
    if (drawable1 != null) {
      ColorStateList colorStateList1 = this.r;
      if (colorStateList1 != null)
        drawable1.setTintList(colorStateList1); 
    } 
    drawable1 = this.n;
    drawable2 = this.o;
    if (drawable1 == null) {
      drawable1 = drawable2;
    } else if (drawable2 != null) {
      int i = drawable2.getIntrinsicWidth();
      if (i == -1)
        i = drawable1.getIntrinsicWidth(); 
      int j = drawable2.getIntrinsicHeight();
      if (j == -1)
        j = drawable1.getIntrinsicHeight(); 
      if (i > drawable1.getIntrinsicWidth() || j > drawable1.getIntrinsicHeight()) {
        float f = i / j;
        if (f >= drawable1.getIntrinsicWidth() / drawable1.getIntrinsicHeight()) {
          i = drawable1.getIntrinsicWidth();
          j = (int)(i / f);
        } else {
          j = drawable1.getIntrinsicHeight();
          i = (int)(f * j);
        } 
      } 
      layerDrawable = new LayerDrawable(new Drawable[] { drawable1, drawable2 });
      layerDrawable.setLayerSize(1, i, j);
      layerDrawable.setLayerGravity(1, 17);
    } 
    super.setButtonDrawable((Drawable)layerDrawable);
    refreshDrawableState();
  }
  
  public Drawable getButtonDrawable() {
    return this.n;
  }
  
  public Drawable getButtonIconDrawable() {
    return this.o;
  }
  
  public ColorStateList getButtonIconTintList() {
    return this.r;
  }
  
  public PorterDuff.Mode getButtonIconTintMode() {
    return this.s;
  }
  
  public ColorStateList getButtonTintList() {
    return this.q;
  }
  
  public int getCheckedState() {
    return this.t;
  }
  
  public CharSequence getErrorAccessibilityLabel() {
    return this.m;
  }
  
  public final boolean isChecked() {
    return (this.t == 1);
  }
  
  public final void onAttachedToWindow() {
    super.onAttachedToWindow();
    if (this.j && this.q == null && this.r == null)
      setUseMaterialThemeColors(true); 
  }
  
  public final int[] onCreateDrawableState(int paramInt) {
    int[] arrayOfInt1;
    int[] arrayOfInt2 = super.onCreateDrawableState(paramInt + 2);
    if (getCheckedState() == 2)
      View.mergeDrawableStates(arrayOfInt2, A); 
    if (this.l)
      View.mergeDrawableStates(arrayOfInt2, B); 
    paramInt = 0;
    while (true) {
      if (paramInt < arrayOfInt2.length) {
        int i = arrayOfInt2[paramInt];
        if (i == 16842912) {
          int[] arrayOfInt = arrayOfInt2;
          break;
        } 
        if (i == 0) {
          int[] arrayOfInt = (int[])arrayOfInt2.clone();
          arrayOfInt[paramInt] = 16842912;
          break;
        } 
        paramInt++;
        continue;
      } 
      arrayOfInt1 = Arrays.copyOf(arrayOfInt2, arrayOfInt2.length + 1);
      arrayOfInt1[arrayOfInt2.length] = 16842912;
      break;
    } 
    this.u = arrayOfInt1;
    return arrayOfInt2;
  }
  
  public final void onDraw(Canvas paramCanvas) {
    Rect rect;
    if (this.k && TextUtils.isEmpty(getText())) {
      Drawable drawable = getButtonDrawable();
      if (drawable != null) {
        int j = getLayoutDirection();
        int i = 1;
        if (j == 1)
          i = -1; 
        i = (getWidth() - drawable.getIntrinsicWidth()) / 2 * i;
        j = paramCanvas.save();
        paramCanvas.translate(i, 0.0F);
        super.onDraw(paramCanvas);
        paramCanvas.restoreToCount(j);
        if (getBackground() != null) {
          rect = drawable.getBounds();
          getBackground().setHotspotBounds(rect.left + i, rect.top, rect.right + i, rect.bottom);
        } 
        return;
      } 
    } 
    super.onDraw((Canvas)rect);
  }
  
  public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo paramAccessibilityNodeInfo) {
    super.onInitializeAccessibilityNodeInfo(paramAccessibilityNodeInfo);
    if (paramAccessibilityNodeInfo != null && this.l) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append(paramAccessibilityNodeInfo.getText());
      stringBuilder.append(", ");
      stringBuilder.append(this.m);
      paramAccessibilityNodeInfo.setText(stringBuilder.toString());
    } 
  }
  
  public final void onRestoreInstanceState(Parcelable paramParcelable) {
    if (!(paramParcelable instanceof ls0)) {
      super.onRestoreInstanceState(paramParcelable);
      return;
    } 
    ls0 ls0 = (ls0)paramParcelable;
    super.onRestoreInstanceState(ls0.getSuperState());
    setCheckedState(ls0.b);
  }
  
  public final Parcelable onSaveInstanceState() {
    View.BaseSavedState baseSavedState = new View.BaseSavedState(super.onSaveInstanceState());
    ((ls0)baseSavedState).b = getCheckedState();
    return (Parcelable)baseSavedState;
  }
  
  public void setButtonDrawable(int paramInt) {
    setButtonDrawable(ws2.I(getContext(), paramInt));
  }
  
  public void setButtonDrawable(Drawable paramDrawable) {
    this.n = paramDrawable;
    this.p = false;
    a();
  }
  
  public void setButtonIconDrawable(Drawable paramDrawable) {
    this.o = paramDrawable;
    a();
  }
  
  public void setButtonIconDrawableResource(int paramInt) {
    setButtonIconDrawable(ws2.I(getContext(), paramInt));
  }
  
  public void setButtonIconTintList(ColorStateList paramColorStateList) {
    if (this.r == paramColorStateList)
      return; 
    this.r = paramColorStateList;
    a();
  }
  
  public void setButtonIconTintMode(PorterDuff.Mode paramMode) {
    if (this.s == paramMode)
      return; 
    this.s = paramMode;
    a();
  }
  
  public void setButtonTintList(ColorStateList paramColorStateList) {
    if (this.q == paramColorStateList)
      return; 
    this.q = paramColorStateList;
    a();
  }
  
  public void setButtonTintMode(PorterDuff.Mode paramMode) {
    setSupportButtonTintMode(paramMode);
    a();
  }
  
  public void setCenterIfNoTextEnabled(boolean paramBoolean) {
    this.k = paramBoolean;
  }
  
  public void setChecked(boolean paramBoolean) {
    setCheckedState(paramBoolean);
  }
  
  public void setCheckedState(int paramInt) {
    if (this.t != paramInt) {
      boolean bool;
      this.t = paramInt;
      if (paramInt == 1) {
        bool = true;
      } else {
        bool = false;
      } 
      super.setChecked(bool);
      refreshDrawableState();
      paramInt = Build.VERSION.SDK_INT;
      if (paramInt >= 30 && this.w == null)
        super.setStateDescription(getButtonStateDescription()); 
      if (!this.v) {
        this.v = true;
        LinkedHashSet linkedHashSet = this.h;
        if (linkedHashSet != null) {
          Iterator iterator = linkedHashSet.iterator();
          if (iterator.hasNext())
            throw x41.g(iterator); 
        } 
        if (this.t != 2) {
          CompoundButton.OnCheckedChangeListener onCheckedChangeListener = this.x;
          if (onCheckedChangeListener != null)
            onCheckedChangeListener.onCheckedChanged((CompoundButton)this, isChecked()); 
        } 
        if (paramInt >= 26) {
          AutofillManager autofillManager = (AutofillManager)getContext().getSystemService(AutofillManager.class);
          if (autofillManager != null)
            autofillManager.notifyValueChanged((View)this); 
        } 
        this.v = false;
      } 
    } 
  }
  
  public void setErrorAccessibilityLabel(CharSequence paramCharSequence) {
    this.m = paramCharSequence;
  }
  
  public void setErrorAccessibilityLabelResource(int paramInt) {
    CharSequence charSequence;
    if (paramInt != 0) {
      charSequence = getResources().getText(paramInt);
    } else {
      charSequence = null;
    } 
    setErrorAccessibilityLabel(charSequence);
  }
  
  public void setErrorShown(boolean paramBoolean) {
    if (this.l != paramBoolean) {
      this.l = paramBoolean;
      refreshDrawableState();
      Iterator iterator = this.g.iterator();
      if (iterator.hasNext())
        throw x41.g(iterator); 
    } 
  }
  
  public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener paramOnCheckedChangeListener) {
    this.x = paramOnCheckedChangeListener;
  }
  
  public void setStateDescription(CharSequence paramCharSequence) {
    this.w = paramCharSequence;
    if (paramCharSequence == null) {
      if (Build.VERSION.SDK_INT >= 30 && paramCharSequence == null)
        super.setStateDescription(getButtonStateDescription()); 
      return;
    } 
    super.setStateDescription(paramCharSequence);
  }
  
  public void setUseMaterialThemeColors(boolean paramBoolean) {
    this.j = paramBoolean;
    if (paramBoolean) {
      setButtonTintList(getMaterialThemeColorsTintList());
      return;
    } 
    setButtonTintList(null);
  }
  
  public final void toggle() {
    setChecked(isChecked() ^ true);
  }
  
  static {
    int[] arrayOfInt1 = { 16842910, 16842912 };
    int[] arrayOfInt2 = { -16842910, 16842912 };
    C = new int[][] { { 16842910, 2130970003 }, arrayOfInt1, { 16842910, -16842912 }, arrayOfInt2, { -16842910, -16842912 } };
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\com\google\android\material\checkbox\MaterialCheckBox.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
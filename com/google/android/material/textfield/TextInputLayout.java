package com.google.android.material.textfield;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.Editable;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.animation.LinearInterpolator;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import au1;
import bu1;
import com.google.android.material.internal.CheckableImageButton;
import cu1;
import ds1;
import du1;
import ep1;
import g5;
import g92;
import h11;
import hm;
import j;
import j30;
import java.util.Iterator;
import java.util.LinkedHashSet;
import jn;
import jy;
import k;
import k0;
import k91;
import kw1;
import l0;
import l10;
import l40;
import l70;
import ls;
import m92;
import n21;
import n40;
import ow1;
import pp1;
import qp1;
import qv;
import rt;
import tt;
import ul1;
import us0;
import v22;
import vd;
import vl1;
import wf2;
import wh0;
import ws0;
import ws2;
import x41;
import xh0;
import xt0;
import y6;
import yi1;
import z51;
import zb1;
import zo2;
import zv0;

public class TextInputLayout extends LinearLayout implements ViewTreeObserver.OnGlobalLayoutListener {
  public static final int[][] F0 = new int[][] { { 16842919 }, {} };
  
  public l70 A;
  
  public boolean A0;
  
  public ColorStateList B;
  
  public ValueAnimator B0;
  
  public ColorStateList C;
  
  public boolean C0;
  
  public ColorStateList D;
  
  public boolean D0;
  
  public ColorStateList E;
  
  public boolean E0;
  
  public boolean F;
  
  public CharSequence G;
  
  public boolean H;
  
  public ws0 I;
  
  public ws0 J;
  
  public StateListDrawable K;
  
  public boolean L;
  
  public ws0 M;
  
  public ws0 N;
  
  public vl1 O;
  
  public boolean P;
  
  public final int Q;
  
  public int R;
  
  public int S;
  
  public int T;
  
  public int U;
  
  public int V;
  
  public int W;
  
  public int a0;
  
  public final FrameLayout b;
  
  public final Rect b0 = new Rect();
  
  public final ep1 c;
  
  public final Rect c0 = new Rect();
  
  public final RectF d0 = new RectF();
  
  public final n40 e;
  
  public Typeface e0;
  
  public final int f;
  
  public ColorDrawable f0;
  
  public EditText g;
  
  public int g0;
  
  public CharSequence h;
  
  public final LinkedHashSet h0 = new LinkedHashSet();
  
  public int i = -1;
  
  public ColorDrawable i0;
  
  public int j = -1;
  
  public int j0;
  
  public int k = -1;
  
  public Drawable k0;
  
  public int l = -1;
  
  public ColorStateList l0;
  
  public final xh0 m = new xh0(this);
  
  public ColorStateList m0;
  
  public boolean n;
  
  public int n0;
  
  public int o;
  
  public int o0;
  
  public boolean p;
  
  public int p0;
  
  public cu1 q = (cu1)new k91(12);
  
  public ColorStateList q0;
  
  public AppCompatTextView r;
  
  public int r0;
  
  public int s;
  
  public int s0;
  
  public int t;
  
  public int t0;
  
  public CharSequence u;
  
  public int u0;
  
  public boolean v;
  
  public int v0;
  
  public AppCompatTextView w;
  
  public int w0;
  
  public ColorStateList x;
  
  public boolean x0;
  
  public int y;
  
  public final hm y0;
  
  public l70 z;
  
  public boolean z0;
  
  public TextInputLayout(Context paramContext) {
    this(paramContext, null);
  }
  
  public TextInputLayout(Context paramContext, AttributeSet paramAttributeSet) {
    this(paramContext, paramAttributeSet, 2130970155);
  }
  
  public TextInputLayout(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(qv.n0(paramContext, paramAttributeSet, paramInt, 2131952629), paramAttributeSet, paramInt);
    hm hm1 = new hm((ViewGroup)this);
    this.y0 = hm1;
    this.E0 = false;
    Context context = getContext();
    setOrientation(1);
    setWillNotDraw(false);
    setAddStatesFromChildren(true);
    FrameLayout frameLayout = new FrameLayout(context);
    this.b = frameLayout;
    frameLayout.setAddStatesFromChildren(true);
    LinearInterpolator linearInterpolator = g5.a;
    hm1.X = (TimeInterpolator)linearInterpolator;
    hm1.l(false);
    hm1.W = (TimeInterpolator)linearInterpolator;
    hm1.l(false);
    hm1.s(8388659);
    g92.m(context, paramAttributeSet, paramInt, 2131952629);
    int[] arrayOfInt = zb1.J;
    g92.o(context, paramAttributeSet, arrayOfInt, paramInt, 2131952629, new int[] { 22, 20, 40, 45, 50 });
    TypedArray typedArray = context.obtainStyledAttributes(paramAttributeSet, arrayOfInt, paramInt, 2131952629);
    zv0 zv0 = new zv0(context, typedArray);
    ep1 ep11 = new ep1(this, zv0);
    this.c = ep11;
    this.F = typedArray.getBoolean(48, true);
    setHint(typedArray.getText(4));
    this.A0 = typedArray.getBoolean(47, true);
    this.z0 = typedArray.getBoolean(42, true);
    if (typedArray.hasValue(6)) {
      setMinEms(typedArray.getInt(6, -1));
    } else if (typedArray.hasValue(3)) {
      setMinWidth(typedArray.getDimensionPixelSize(3, -1));
    } 
    if (typedArray.hasValue(5)) {
      setMaxEms(typedArray.getInt(5, -1));
    } else if (typedArray.hasValue(2)) {
      setMaxWidth(typedArray.getDimensionPixelSize(2, -1));
    } 
    this.O = vl1.b(context, paramAttributeSet, paramInt, 2131952629).a();
    this.Q = context.getResources().getDimensionPixelOffset(2131166304);
    this.S = typedArray.getDimensionPixelOffset(9, 0);
    this.f = getResources().getDimensionPixelSize(2131165884);
    this.U = typedArray.getDimensionPixelSize(16, context.getResources().getDimensionPixelSize(2131166305));
    this.V = typedArray.getDimensionPixelSize(17, context.getResources().getDimensionPixelSize(2131166306));
    this.T = this.U;
    float f4 = typedArray.getDimension(13, -1.0F);
    float f2 = typedArray.getDimension(12, -1.0F);
    float f3 = typedArray.getDimension(10, -1.0F);
    float f1 = typedArray.getDimension(11, -1.0F);
    ul1 ul1 = this.O.f();
    if (f4 >= 0.0F)
      ul1.e = (ls)new k(f4); 
    if (f2 >= 0.0F)
      ul1.f = (ls)new k(f2); 
    if (f3 >= 0.0F)
      ul1.g = (ls)new k(f3); 
    if (f1 >= 0.0F)
      ul1.h = (ls)new k(f1); 
    this.O = ul1.a();
    ColorStateList colorStateList = wf2.t(context, zv0, 7);
    if (colorStateList != null) {
      paramInt = colorStateList.getDefaultColor();
      this.r0 = paramInt;
      this.a0 = paramInt;
      if (colorStateList.isStateful()) {
        this.s0 = colorStateList.getColorForState(new int[] { -16842910 }, -1);
        this.t0 = colorStateList.getColorForState(new int[] { 16842908, 16842910 }, -1);
        this.u0 = colorStateList.getColorForState(new int[] { 16843623, 16842910 }, -1);
      } else {
        this.t0 = this.r0;
        colorStateList = n21.y(context, 2131100692);
        this.s0 = colorStateList.getColorForState(new int[] { -16842910 }, -1);
        this.u0 = colorStateList.getColorForState(new int[] { 16843623 }, -1);
      } 
    } else {
      this.a0 = 0;
      this.r0 = 0;
      this.s0 = 0;
      this.t0 = 0;
      this.u0 = 0;
    } 
    if (typedArray.hasValue(1)) {
      colorStateList = zv0.n(1);
      this.m0 = colorStateList;
      this.l0 = colorStateList;
    } 
    colorStateList = wf2.t(context, zv0, 14);
    this.p0 = typedArray.getColor(14, 0);
    this.n0 = context.getColor(2131100719);
    this.v0 = context.getColor(2131100720);
    this.o0 = context.getColor(2131100723);
    if (colorStateList != null)
      setBoxStrokeColorStateList(colorStateList); 
    if (typedArray.hasValue(15))
      setBoxStrokeErrorColor(wf2.t(context, zv0, 15)); 
    if (typedArray.getResourceId(50, -1) != -1)
      setHintTextAppearance(typedArray.getResourceId(50, 0)); 
    this.D = zv0.n(24);
    this.E = zv0.n(25);
    int j = typedArray.getResourceId(40, 0);
    CharSequence charSequence2 = typedArray.getText(35);
    int i = typedArray.getInt(34, 1);
    boolean bool1 = typedArray.getBoolean(36, false);
    int k = typedArray.getResourceId(45, 0);
    boolean bool4 = typedArray.getBoolean(44, false);
    CharSequence charSequence1 = typedArray.getText(43);
    paramInt = typedArray.getResourceId(58, 0);
    CharSequence charSequence3 = typedArray.getText(57);
    boolean bool3 = typedArray.getBoolean(18, false);
    setCounterMaxLength(typedArray.getInt(19, -1));
    this.t = typedArray.getResourceId(22, 0);
    this.s = typedArray.getResourceId(20, 0);
    setBoxBackgroundMode(typedArray.getInt(8, 0));
    setErrorContentDescription(charSequence2);
    setErrorAccessibilityLiveRegion(i);
    setCounterOverflowTextAppearance(this.s);
    setHelperTextTextAppearance(k);
    setErrorTextAppearance(j);
    setCounterTextAppearance(this.t);
    setPlaceholderText(charSequence3);
    setPlaceholderTextAppearance(paramInt);
    if (typedArray.hasValue(41))
      setErrorTextColor(zv0.n(41)); 
    if (typedArray.hasValue(46))
      setHelperTextColor(zv0.n(46)); 
    if (typedArray.hasValue(51))
      setHintTextColor(zv0.n(51)); 
    if (typedArray.hasValue(23))
      setCounterTextColor(zv0.n(23)); 
    if (typedArray.hasValue(21))
      setCounterOverflowTextColor(zv0.n(21)); 
    if (typedArray.hasValue(59))
      setPlaceholderTextColor(zv0.n(59)); 
    n40 n401 = new n40(this, zv0);
    this.e = n401;
    boolean bool2 = typedArray.getBoolean(0, true);
    setHintMaxLines(typedArray.getInt(49, 1));
    zv0.z();
    setImportantForAccessibility(2);
    if (Build.VERSION.SDK_INT >= 26)
      setImportantForAutofill(1); 
    frameLayout.addView((View)ep11);
    frameLayout.addView((View)n401);
    addView((View)frameLayout);
    setEnabled(bool2);
    setHelperTextEnabled(bool4);
    setErrorEnabled(bool1);
    setCounterEnabled(bool3);
    setHelperText(charSequence1);
  }
  
  private Drawable getEditTextBoxBackground() {
    ColorStateList colorStateList;
    EditText editText = this.g;
    if (!(editText instanceof AutoCompleteTextView) || editText.getInputType() != 0)
      return (Drawable)this.I; 
    int j = m92.x((View)this.g, 2130968900);
    int i = this.R;
    int[][] arrayOfInt = F0;
    if (i == 2) {
      ws0 ws02;
      Context context = getContext();
      ws0 ws01 = this.I;
      TypedValue typedValue = g92.Y(context, 2130968945);
      if (typedValue != null) {
        i = typedValue.resourceId;
        if (i != 0) {
          i = context.getColor(i);
        } else {
          i = typedValue.data;
        } 
        ws02 = new ws0(ws01.c.a);
        j = m92.L(0.1F, j, i);
        ws02.o(new ColorStateList(arrayOfInt, new int[] { j, 0 }));
        ws02.setTint(i);
        colorStateList = new ColorStateList(arrayOfInt, new int[] { j, i });
        ws0 ws03 = new ws0(ws01.c.a);
        ws03.setTint(-1);
        return (Drawable)new LayerDrawable(new Drawable[] { (Drawable)new RippleDrawable(colorStateList, (Drawable)ws02, (Drawable)ws03), (Drawable)ws01 });
      } 
      throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", new Object[] { "TextInputLayout", ws02.getResources().getResourceName(2130968945) }));
    } 
    if (i == 1) {
      ws0 ws01 = this.I;
      i = this.a0;
      return (Drawable)new RippleDrawable(new ColorStateList((int[][])colorStateList, new int[] { m92.L(0.1F, j, i), i }), (Drawable)ws01, (Drawable)ws01);
    } 
    return null;
  }
  
  private Drawable getOrCreateFilledDropDownMenuBackground() {
    if (this.K == null) {
      StateListDrawable stateListDrawable = new StateListDrawable();
      this.K = stateListDrawable;
      Drawable drawable = getOrCreateOutlinedDropDownMenuBackground();
      stateListDrawable.addState(new int[] { 16842922 }, drawable);
      stateListDrawable = this.K;
      ws0 ws01 = h(false);
      stateListDrawable.addState(new int[0], (Drawable)ws01);
    } 
    return (Drawable)this.K;
  }
  
  private Drawable getOrCreateOutlinedDropDownMenuBackground() {
    if (this.J == null)
      this.J = h(true); 
    return (Drawable)this.J;
  }
  
  public static void m(ViewGroup paramViewGroup, boolean paramBoolean) {
    int i = paramViewGroup.getChildCount();
    for (byte b = 0; b < i; b++) {
      View view = paramViewGroup.getChildAt(b);
      view.setEnabled(paramBoolean);
      if (view instanceof ViewGroup)
        m((ViewGroup)view, paramBoolean); 
    } 
  }
  
  private void setEditText(EditText paramEditText) {
    if (this.g == null) {
      if (getEndIconMode() != 3 && !(paramEditText instanceof TextInputEditText))
        Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead."); 
      this.g = paramEditText;
      int i = this.i;
      if (i != -1) {
        setMinEms(i);
      } else {
        setMinWidth(this.k);
      } 
      i = this.j;
      if (i != -1) {
        setMaxEms(i);
      } else {
        setMaxWidth(this.l);
      } 
      this.L = false;
      k();
      setTextInputAccessibilityDelegate(new bu1(this));
      Typeface typeface = this.g.getTypeface();
      hm hm1 = this.y0;
      boolean bool2 = hm1.t(typeface);
      boolean bool1 = hm1.z(typeface);
      if (bool2 || bool1)
        hm1.l(false); 
      hm1.y(this.g.getTextSize());
      float f = this.g.getLetterSpacing();
      if (hm1.h0 != f) {
        hm1.h0 = f;
        hm1.l(false);
      } 
      i = this.g.getGravity();
      hm1.s(i & 0xFFFFFF8F | 0x30);
      hm1.x(i);
      this.w0 = paramEditText.getMinimumHeight();
      this.g.addTextChangedListener((TextWatcher)new au1(this, paramEditText));
      if (this.l0 == null)
        this.l0 = this.g.getHintTextColors(); 
      if (this.F) {
        if (TextUtils.isEmpty(this.G)) {
          CharSequence charSequence = this.g.getHint();
          this.h = charSequence;
          setHint(charSequence);
          this.g.setHint(null);
        } 
        this.H = true;
      } 
      if (Build.VERSION.SDK_INT >= 29)
        r(); 
      if (this.r != null)
        p(this.g.getText()); 
      t();
      this.m.b();
      this.c.bringToFront();
      n40 n401 = this.e;
      n401.bringToFront();
      Iterator<l40> iterator = this.h0.iterator();
      while (iterator.hasNext())
        ((l40)iterator.next()).a(this); 
      n401.l();
      if (!isEnabled())
        paramEditText.setEnabled(false); 
      w(false, true);
      return;
    } 
    l0.l("We already have an EditText, can only have one");
  }
  
  private void setHintInternal(CharSequence paramCharSequence) {
    if (!TextUtils.equals(paramCharSequence, this.G)) {
      this.G = paramCharSequence;
      this.y0.B(paramCharSequence);
      if (!this.x0)
        l(); 
    } 
  }
  
  private void setPlaceholderTextEnabled(boolean paramBoolean) {
    if (this.v == paramBoolean)
      return; 
    AppCompatTextView appCompatTextView = this.w;
    if (paramBoolean) {
      if (appCompatTextView != null) {
        this.b.addView((View)appCompatTextView);
        this.w.setVisibility(0);
      } 
    } else {
      if (appCompatTextView != null)
        appCompatTextView.setVisibility(8); 
      this.w = null;
    } 
    this.v = paramBoolean;
  }
  
  public final void a() {
    if (this.g != null && this.R == 1)
      if (getHintMaxLines() == 1) {
        if ((getContext().getResources().getConfiguration()).fontScale >= 2.0F) {
          EditText editText = this.g;
          editText.setPaddingRelative(editText.getPaddingStart(), getResources().getDimensionPixelSize(2131166047), this.g.getPaddingEnd(), getResources().getDimensionPixelSize(2131166046));
          return;
        } 
        if (wf2.I(getContext())) {
          EditText editText = this.g;
          editText.setPaddingRelative(editText.getPaddingStart(), getResources().getDimensionPixelSize(2131166045), this.g.getPaddingEnd(), getResources().getDimensionPixelSize(2131166044));
          return;
        } 
      } else {
        EditText editText = this.g;
        editText.setPaddingRelative(editText.getPaddingStart(), (int)(this.y0.g() + this.f), this.g.getPaddingEnd(), getResources().getDimensionPixelSize(2131166044));
      }  
  }
  
  public final void addView(View paramView, int paramInt, ViewGroup.LayoutParams paramLayoutParams) {
    if (paramView instanceof EditText) {
      FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(paramLayoutParams);
      layoutParams.gravity = layoutParams.gravity & 0xFFFFFF8F | 0x10;
      FrameLayout frameLayout = this.b;
      frameLayout.addView(paramView, (ViewGroup.LayoutParams)layoutParams);
      frameLayout.setLayoutParams(paramLayoutParams);
      v();
      setEditText((EditText)paramView);
      return;
    } 
    super.addView(paramView, paramInt, paramLayoutParams);
  }
  
  public final void b(float paramFloat) {
    hm hm1 = this.y0;
    if (hm1.b == paramFloat)
      return; 
    if (this.B0 == null) {
      ValueAnimator valueAnimator = new ValueAnimator();
      this.B0 = valueAnimator;
      valueAnimator.setInterpolator(zo2.Q(getContext(), 2130969699, (TimeInterpolator)g5.b));
      this.B0.setDuration(zo2.P(getContext(), 2130969689, 167));
      this.B0.addUpdateListener((ValueAnimator.AnimatorUpdateListener)new vd(7, this));
    } 
    this.B0.setFloatValues(new float[] { hm1.b, paramFloat });
    this.B0.start();
  }
  
  public final void c() {
    ws0 ws01 = this.I;
    if (ws01 == null)
      return; 
    vl1 vl11 = ws01.c.a;
    vl1 vl12 = this.O;
    if (vl11 != vl12)
      ws01.setShapeAppearanceModel(vl12); 
    if (this.R == 2) {
      int j = this.T;
      if (j > -1) {
        int k = this.W;
        if (k != 0) {
          ws0 ws02 = this.I;
          ws02.u(j);
          ws02.t(ColorStateList.valueOf(k));
        } 
      } 
    } 
    int i = this.a0;
    if (this.R == 1) {
      i = m92.w(getContext(), 2130968945, 0);
      i = jn.g(this.a0, i);
    } 
    this.a0 = i;
    this.I.o(ColorStateList.valueOf(i));
    ws01 = this.M;
    if (ws01 != null && this.N != null) {
      if (this.T > -1 && this.W != 0) {
        ColorStateList colorStateList;
        if (this.g.isFocused()) {
          colorStateList = ColorStateList.valueOf(this.n0);
        } else {
          colorStateList = ColorStateList.valueOf(this.W);
        } 
        ws01.o(colorStateList);
        this.N.o(ColorStateList.valueOf(this.W));
      } 
      invalidate();
    } 
    u();
  }
  
  public final Rect d(Rect paramRect) {
    if (this.g != null) {
      boolean bool;
      if (getLayoutDirection() == 1) {
        bool = true;
      } else {
        bool = false;
      } 
      int i = paramRect.bottom;
      Rect rect = this.c0;
      rect.bottom = i;
      i = this.R;
      if (i != 1) {
        int j = paramRect.left;
        if (i != 2) {
          rect.left = i(j, bool);
          rect.top = getPaddingTop();
          rect.right = j(paramRect.right, bool);
          return rect;
        } 
        rect.left = this.g.getPaddingLeft() + j;
        paramRect.top -= e();
        paramRect.right -= this.g.getPaddingRight();
        return rect;
      } 
      rect.left = i(paramRect.left, bool);
      paramRect.top += this.S;
      rect.right = j(paramRect.right, bool);
      return rect;
    } 
    throw new IllegalStateException();
  }
  
  public final void dispatchProvideAutofillStructure(ViewStructure paramViewStructure, int paramInt) {
    EditText editText = this.g;
    if (editText == null) {
      super.dispatchProvideAutofillStructure(paramViewStructure, paramInt);
      return;
    } 
    CharSequence charSequence = this.h;
    byte b = 0;
    if (charSequence != null) {
      boolean bool = this.H;
      this.H = false;
      CharSequence charSequence1 = editText.getHint();
      this.g.setHint(this.h);
      try {
        super.dispatchProvideAutofillStructure(paramViewStructure, paramInt);
        return;
      } finally {
        this.g.setHint(charSequence1);
        this.H = bool;
      } 
    } 
    paramViewStructure.setAutofillId(getAutofillId());
    onProvideAutofillStructure(paramViewStructure, paramInt);
    onProvideAutofillVirtualStructure(paramViewStructure, paramInt);
    FrameLayout frameLayout = this.b;
    paramViewStructure.setChildCount(frameLayout.getChildCount());
    while (b < frameLayout.getChildCount()) {
      View view = frameLayout.getChildAt(b);
      ViewStructure viewStructure = paramViewStructure.newChild(b);
      view.dispatchProvideAutofillStructure(viewStructure, paramInt);
      if (view == this.g)
        viewStructure.setHint(getHint()); 
      b++;
    } 
  }
  
  public final void dispatchRestoreInstanceState(SparseArray paramSparseArray) {
    this.D0 = true;
    super.dispatchRestoreInstanceState(paramSparseArray);
    this.D0 = false;
  }
  
  public final void draw(Canvas paramCanvas) {
    super.draw(paramCanvas);
    boolean bool = this.F;
    hm hm1 = this.y0;
    if (bool)
      hm1.f(paramCanvas); 
    if (this.N != null) {
      ws0 ws01 = this.M;
      if (ws01 != null) {
        ws01.draw(paramCanvas);
        if (this.g.isFocused()) {
          Rect rect2 = this.N.getBounds();
          Rect rect1 = this.M.getBounds();
          float f = hm1.b;
          int i = rect1.centerX();
          rect2.left = g5.c(f, i, rect1.left);
          rect2.right = g5.c(f, i, rect1.right);
          this.N.draw(paramCanvas);
        } 
      } 
    } 
  }
  
  public final void drawableStateChanged() {
    // Byte code:
    //   0: aload_0
    //   1: getfield C0 : Z
    //   4: ifeq -> 8
    //   7: return
    //   8: iconst_1
    //   9: istore_2
    //   10: aload_0
    //   11: iconst_1
    //   12: putfield C0 : Z
    //   15: aload_0
    //   16: invokespecial drawableStateChanged : ()V
    //   19: aload_0
    //   20: invokevirtual getDrawableState : ()[I
    //   23: astore #4
    //   25: aload_0
    //   26: getfield y0 : Lhm;
    //   29: astore_3
    //   30: aload_3
    //   31: ifnull -> 88
    //   34: aload_3
    //   35: aload #4
    //   37: putfield S : [I
    //   40: aload_3
    //   41: getfield p : Landroid/content/res/ColorStateList;
    //   44: astore #4
    //   46: aload #4
    //   48: ifnull -> 59
    //   51: aload #4
    //   53: invokevirtual isStateful : ()Z
    //   56: ifne -> 78
    //   59: aload_3
    //   60: getfield o : Landroid/content/res/ColorStateList;
    //   63: astore #4
    //   65: aload #4
    //   67: ifnull -> 88
    //   70: aload #4
    //   72: invokevirtual isStateful : ()Z
    //   75: ifeq -> 88
    //   78: aload_3
    //   79: iconst_0
    //   80: invokevirtual l : (Z)V
    //   83: iconst_1
    //   84: istore_1
    //   85: goto -> 90
    //   88: iconst_0
    //   89: istore_1
    //   90: aload_0
    //   91: getfield g : Landroid/widget/EditText;
    //   94: ifnull -> 122
    //   97: aload_0
    //   98: invokevirtual isLaidOut : ()Z
    //   101: ifeq -> 114
    //   104: aload_0
    //   105: invokevirtual isEnabled : ()Z
    //   108: ifeq -> 114
    //   111: goto -> 116
    //   114: iconst_0
    //   115: istore_2
    //   116: aload_0
    //   117: iload_2
    //   118: iconst_0
    //   119: invokevirtual w : (ZZ)V
    //   122: aload_0
    //   123: invokevirtual t : ()V
    //   126: aload_0
    //   127: invokevirtual z : ()V
    //   130: iload_1
    //   131: ifeq -> 138
    //   134: aload_0
    //   135: invokevirtual invalidate : ()V
    //   138: aload_0
    //   139: iconst_0
    //   140: putfield C0 : Z
    //   143: return
  }
  
  public final int e() {
    if (this.F) {
      int i = this.R;
      hm hm1 = this.y0;
      if (i != 0) {
        if (i == 2) {
          if (getHintMaxLines() == 1)
            return (int)(hm1.g() / 2.0F); 
          float f = hm1.g();
          TextPaint textPaint = hm1.V;
          textPaint.setTextSize(hm1.n);
          textPaint.setTypeface(hm1.x);
          textPaint.setLetterSpacing(hm1.g0);
          return Math.max(0, (int)(f - -textPaint.ascent() / 2.0F));
        } 
        return 0;
      } 
      return (int)hm1.g();
    } 
    return 0;
  }
  
  public final l70 f() {
    l70 l701 = new l70();
    ((kw1)l701).e = zo2.P(getContext(), 2130969691, 87);
    ((kw1)l701).f = zo2.Q(getContext(), 2130969701, (TimeInterpolator)g5.a);
    return l701;
  }
  
  public final boolean g() {
    return (this.F && !TextUtils.isEmpty(this.G) && this.I instanceof tt);
  }
  
  public int getBaseline() {
    EditText editText = this.g;
    if (editText != null) {
      int i = editText.getBaseline();
      int j = getPaddingTop();
      return e() + j + i;
    } 
    return super.getBaseline();
  }
  
  public ws0 getBoxBackground() {
    int i = this.R;
    if (i == 1 || i == 2)
      return this.I; 
    throw new IllegalStateException();
  }
  
  public int getBoxBackgroundColor() {
    return this.a0;
  }
  
  public int getBoxBackgroundMode() {
    return this.R;
  }
  
  public int getBoxCollapsedPaddingTop() {
    return this.S;
  }
  
  public float getBoxCornerRadiusBottomEnd() {
    int i = getLayoutDirection();
    vl1 vl11 = this.O;
    RectF rectF = this.d0;
    return (i == 1) ? vl11.h.a(rectF) : vl11.g.a(rectF);
  }
  
  public float getBoxCornerRadiusBottomStart() {
    int i = getLayoutDirection();
    vl1 vl11 = this.O;
    RectF rectF = this.d0;
    return (i == 1) ? vl11.g.a(rectF) : vl11.h.a(rectF);
  }
  
  public float getBoxCornerRadiusTopEnd() {
    int i = getLayoutDirection();
    vl1 vl11 = this.O;
    RectF rectF = this.d0;
    return (i == 1) ? vl11.e.a(rectF) : vl11.f.a(rectF);
  }
  
  public float getBoxCornerRadiusTopStart() {
    int i = getLayoutDirection();
    vl1 vl11 = this.O;
    RectF rectF = this.d0;
    return (i == 1) ? vl11.f.a(rectF) : vl11.e.a(rectF);
  }
  
  public int getBoxStrokeColor() {
    return this.p0;
  }
  
  public ColorStateList getBoxStrokeErrorColor() {
    return this.q0;
  }
  
  public int getBoxStrokeWidth() {
    return this.U;
  }
  
  public int getBoxStrokeWidthFocused() {
    return this.V;
  }
  
  public int getCounterMaxLength() {
    return this.o;
  }
  
  public CharSequence getCounterOverflowDescription() {
    if (this.n && this.p) {
      AppCompatTextView appCompatTextView = this.r;
      if (appCompatTextView != null)
        return appCompatTextView.getContentDescription(); 
    } 
    return null;
  }
  
  public ColorStateList getCounterOverflowTextColor() {
    return this.C;
  }
  
  public ColorStateList getCounterTextColor() {
    return this.B;
  }
  
  public ColorStateList getCursorColor() {
    return this.D;
  }
  
  public ColorStateList getCursorErrorColor() {
    return this.E;
  }
  
  public ColorStateList getDefaultHintTextColor() {
    return this.l0;
  }
  
  public EditText getEditText() {
    return this.g;
  }
  
  public CharSequence getEndIconContentDescription() {
    return this.e.i.getContentDescription();
  }
  
  public Drawable getEndIconDrawable() {
    return this.e.i.getDrawable();
  }
  
  public int getEndIconMinSize() {
    return this.e.o;
  }
  
  public int getEndIconMode() {
    return this.e.k;
  }
  
  public ImageView.ScaleType getEndIconScaleType() {
    return this.e.p;
  }
  
  public CheckableImageButton getEndIconView() {
    return this.e.i;
  }
  
  public CharSequence getError() {
    xh0 xh01 = this.m;
    return xh01.q ? xh01.p : null;
  }
  
  public int getErrorAccessibilityLiveRegion() {
    return this.m.t;
  }
  
  public CharSequence getErrorContentDescription() {
    return this.m.s;
  }
  
  public int getErrorCurrentTextColors() {
    AppCompatTextView appCompatTextView = this.m.r;
    return (appCompatTextView != null) ? appCompatTextView.getCurrentTextColor() : -1;
  }
  
  public Drawable getErrorIconDrawable() {
    return this.e.e.getDrawable();
  }
  
  public CharSequence getHelperText() {
    xh0 xh01 = this.m;
    return xh01.x ? xh01.w : null;
  }
  
  public int getHelperTextCurrentTextColor() {
    AppCompatTextView appCompatTextView = this.m.y;
    return (appCompatTextView != null) ? appCompatTextView.getCurrentTextColor() : -1;
  }
  
  public CharSequence getHint() {
    return this.F ? this.G : null;
  }
  
  public final float getHintCollapsedTextHeight() {
    return this.y0.g();
  }
  
  public final int getHintCurrentCollapsedTextColor() {
    hm hm1 = this.y0;
    return hm1.h(hm1.p);
  }
  
  public int getHintMaxLines() {
    return this.y0.o0;
  }
  
  public ColorStateList getHintTextColor() {
    return this.m0;
  }
  
  public cu1 getLengthCounter() {
    return this.q;
  }
  
  public int getMaxEms() {
    return this.j;
  }
  
  public int getMaxWidth() {
    return this.l;
  }
  
  public int getMinEms() {
    return this.i;
  }
  
  public int getMinWidth() {
    return this.k;
  }
  
  @Deprecated
  public CharSequence getPasswordVisibilityToggleContentDescription() {
    return this.e.i.getContentDescription();
  }
  
  @Deprecated
  public Drawable getPasswordVisibilityToggleDrawable() {
    return this.e.i.getDrawable();
  }
  
  public CharSequence getPlaceholderText() {
    return this.v ? this.u : null;
  }
  
  public int getPlaceholderTextAppearance() {
    return this.y;
  }
  
  public ColorStateList getPlaceholderTextColor() {
    return this.x;
  }
  
  public CharSequence getPrefixText() {
    return this.c.e;
  }
  
  public ColorStateList getPrefixTextColor() {
    return this.c.c.getTextColors();
  }
  
  public TextView getPrefixTextView() {
    return (TextView)this.c.c;
  }
  
  public vl1 getShapeAppearanceModel() {
    return this.O;
  }
  
  public CharSequence getStartIconContentDescription() {
    return this.c.f.getContentDescription();
  }
  
  public Drawable getStartIconDrawable() {
    return this.c.f.getDrawable();
  }
  
  public int getStartIconMinSize() {
    return this.c.i;
  }
  
  public ImageView.ScaleType getStartIconScaleType() {
    return this.c.j;
  }
  
  public CharSequence getSuffixText() {
    return this.e.r;
  }
  
  public ColorStateList getSuffixTextColor() {
    return this.e.s.getTextColors();
  }
  
  public TextView getSuffixTextView() {
    return (TextView)this.e.s;
  }
  
  public Typeface getTypeface() {
    return this.e0;
  }
  
  public final ws0 h(boolean paramBoolean) {
    float f1;
    float f2;
    float f3 = getResources().getDimensionPixelOffset(2131166278);
    if (paramBoolean) {
      f1 = f3;
    } else {
      f1 = 0.0F;
    } 
    EditText editText = this.g;
    if (editText instanceof MaterialAutoCompleteTextView) {
      f2 = ((MaterialAutoCompleteTextView)editText).getPopupElevation();
    } else {
      f2 = getResources().getDimensionPixelOffset(2131165702);
    } 
    int i = getResources().getDimensionPixelOffset(2131166215);
    Object object7 = new Object();
    Object object8 = new Object();
    Object object1 = new Object();
    Object object10 = new Object();
    Object object4 = new Object();
    Object object6 = new Object();
    Object object5 = new Object();
    Object object9 = new Object();
    k k3 = new k(f1);
    k k1 = new k(f1);
    k k4 = new k(f3);
    k k2 = new k(f3);
    Object object3 = new Object();
    ((vl1)object3).a = (z51)object7;
    ((vl1)object3).b = (z51)object8;
    ((vl1)object3).c = (z51)object1;
    ((vl1)object3).d = (z51)object10;
    ((vl1)object3).e = (ls)k3;
    ((vl1)object3).f = (ls)k1;
    ((vl1)object3).g = (ls)k2;
    ((vl1)object3).h = (ls)k4;
    ((vl1)object3).i = (j30)object4;
    ((vl1)object3).j = (j30)object6;
    ((vl1)object3).k = (j30)object5;
    ((vl1)object3).l = (j30)object9;
    object1 = this.g;
    if (object1 instanceof MaterialAutoCompleteTextView) {
      object1 = ((MaterialAutoCompleteTextView)object1).getDropDownBackgroundTintList();
    } else {
      object1 = null;
    } 
    object4 = getContext();
    Object object2 = object1;
    if (object1 == null) {
      object1 = ws0.H;
      object1 = ws0.class.getSimpleName();
      object2 = g92.Y((Context)object4, 2130968945);
      if (object2 != null) {
        int j = ((TypedValue)object2).resourceId;
        if (j != 0) {
          j = object4.getColor(j);
        } else {
          j = ((TypedValue)object2).data;
        } 
        object2 = ColorStateList.valueOf(j);
      } else {
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", new Object[] { object1, object4.getResources().getResourceName(2130968945) }));
      } 
    } 
    object1 = new ws0();
    object1.k((Context)object4);
    object1.o((ColorStateList)object2);
    object1.n(f2);
    object1.setShapeAppearanceModel((vl1)object3);
    object2 = ((ws0)object1).c;
    if (((us0)object2).h == null)
      ((us0)object2).h = new Rect(); 
    ((ws0)object1).c.h.set(0, i, 0, i);
    object1.invalidateSelf();
    return (ws0)object1;
  }
  
  public final int i(int paramInt, boolean paramBoolean) {
    if (!paramBoolean && getPrefixText() != null) {
      int j = this.c.a();
      return j + paramInt;
    } 
    if (paramBoolean && getSuffixText() != null) {
      int j = this.e.b();
      return j + paramInt;
    } 
    int i = this.g.getCompoundPaddingLeft();
    return i + paramInt;
  }
  
  public final int j(int paramInt, boolean paramBoolean) {
    if (!paramBoolean && getSuffixText() != null) {
      int j = this.e.b();
      return paramInt - j;
    } 
    if (paramBoolean && getPrefixText() != null) {
      int j = this.c.a();
      return paramInt - j;
    } 
    int i = this.g.getCompoundPaddingRight();
    return paramInt - i;
  }
  
  public final void k() {
    int i = this.R;
    if (i != 0) {
      if (i != 1) {
        if (i == 2) {
          if (this.F && !(this.I instanceof tt)) {
            vl1 vl11 = this.O;
            i = tt.K;
            if (vl11 == null)
              vl11 = new vl1(); 
            rt rt = new rt(vl11, new RectF());
            ws0 ws01 = new ws0((us0)rt);
            ((tt)ws01).J = rt;
            this.I = ws01;
          } else {
            this.I = new ws0(this.O);
          } 
          this.M = null;
          this.N = null;
        } else {
          l0.l(x41.m(new StringBuilder(), this.R, " is illegal; only @BoxBackgroundMode constants are supported."));
          return;
        } 
      } else {
        this.I = new ws0(this.O);
        this.M = new ws0();
        this.N = new ws0();
      } 
    } else {
      this.I = null;
      this.M = null;
      this.N = null;
    } 
    u();
    z();
    if (this.R == 1)
      if ((getContext().getResources().getConfiguration()).fontScale >= 2.0F) {
        this.S = getResources().getDimensionPixelSize(2131166049);
      } else if (wf2.I(getContext())) {
        this.S = getResources().getDimensionPixelSize(2131166048);
      }  
    a();
    if (this.R != 0)
      v(); 
    EditText editText = this.g;
    if (editText instanceof AutoCompleteTextView) {
      AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView)editText;
      if (autoCompleteTextView.getDropDownBackground() == null) {
        i = this.R;
        if (i == 2) {
          autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateOutlinedDropDownMenuBackground());
          return;
        } 
        if (i == 1)
          autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateFilledDropDownMenuBackground()); 
      } 
    } 
  }
  
  public final void l() {
    float f1;
    float f2;
    if (!g())
      return; 
    int i = this.g.getWidth();
    int j = this.g.getGravity();
    hm hm1 = this.y0;
    boolean bool = hm1.c(hm1.H);
    hm1.J = bool;
    Rect rect = hm1.h;
    if (j == 17 || (j & 0x7) == 1) {
      f1 = i / 2.0F;
      f2 = hm1.k0 / 2.0F;
    } else {
      int k;
      if ((j & 0x800005) == 8388613 || (j & 0x5) == 5) {
        if (bool) {
          k = rect.left;
        } else {
          float f = rect.right;
          f2 = hm1.k0;
          f -= f2;
        } 
      } else {
        float f;
        if (bool) {
          f = rect.right;
          f2 = hm1.k0;
        } else {
          k = rect.left;
          f = k;
        } 
        f -= f2;
      } 
      f1 = k;
    } 
    f1 -= f2;
  }
  
  public final void n(AppCompatTextView paramAppCompatTextView, int paramInt) {
    try {
      paramAppCompatTextView.setTextAppearance(paramInt);
      paramInt = paramAppCompatTextView.getTextColors().getDefaultColor();
      if (paramInt != -65281)
        return; 
    } catch (Exception exception) {}
    paramAppCompatTextView.setTextAppearance(2131952141);
    paramAppCompatTextView.setTextColor(getContext().getColor(2131099808));
  }
  
  public final boolean o() {
    xh0 xh01 = this.m;
    return (xh01.o == 1 && xh01.r != null && !TextUtils.isEmpty(xh01.p));
  }
  
  public final void onConfigurationChanged(Configuration paramConfiguration) {
    super.onConfigurationChanged(paramConfiguration);
    this.y0.k(paramConfiguration);
  }
  
  public final void onGlobalLayout() {
    n40 n401 = this.e;
    n401.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    boolean bool = false;
    this.E0 = false;
    if (this.g != null) {
      int i = Math.max(n401.getMeasuredHeight(), this.c.getMeasuredHeight());
      if (this.g.getMeasuredHeight() < i) {
        this.g.setMinimumHeight(i);
        bool = true;
      } 
    } 
    boolean bool1 = s();
    if (bool || bool1) {
      this.g.post((Runnable)new xt0(21, this));
      return;
    } 
  }
  
  public final void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    EditText editText = this.g;
    if (editText != null) {
      Rect rect = this.b0;
      jy.a((ViewGroup)this, (View)editText, rect);
      ws0 ws01 = this.M;
      if (ws01 != null) {
        paramInt1 = rect.bottom;
        paramInt2 = this.U;
        ws01.setBounds(rect.left, paramInt1 - paramInt2, rect.right, paramInt1);
      } 
      ws01 = this.N;
      if (ws01 != null) {
        paramInt2 = rect.bottom;
        paramInt1 = this.V;
        ws01.setBounds(rect.left, paramInt2 - paramInt1, rect.right, paramInt2);
      } 
      if (this.F) {
        float f = this.g.getTextSize();
        hm hm1 = this.y0;
        hm1.y(f);
        TextPaint textPaint = hm1.V;
        paramInt1 = this.g.getGravity();
        hm1.s(paramInt1 & 0xFFFFFF8F | 0x30);
        hm1.x(paramInt1);
        Rect rect1 = d(rect);
        hm1.o(rect1.left, rect1.top, rect1.right, rect1.bottom);
        if (this.g != null) {
          if (getHintMaxLines() == 1) {
            textPaint.setTextSize(hm1.m);
            textPaint.setTypeface(hm1.A);
            textPaint.setLetterSpacing(hm1.h0);
            f = -textPaint.ascent();
          } else {
            f = hm1.i() * hm1.q;
          } 
          paramInt2 = rect.left;
          paramInt1 = this.g.getCompoundPaddingLeft();
          rect1 = this.c0;
          rect1.left = paramInt1 + paramInt2;
          if (this.R == 1 && this.g.getMinLines() <= 1) {
            paramInt1 = (int)(rect.centerY() - f / 2.0F);
          } else {
            if (this.R != 0 || getHintMaxLines() == 1) {
              paramInt1 = 0;
            } else {
              textPaint.setTextSize(hm1.m);
              textPaint.setTypeface(hm1.A);
              textPaint.setLetterSpacing(hm1.h0);
              paramInt1 = (int)(-textPaint.ascent() / 2.0F);
            } 
            paramInt2 = rect.top;
            paramInt1 = this.g.getCompoundPaddingTop() + paramInt2 - paramInt1;
          } 
          rect1.top = paramInt1;
          rect.right -= this.g.getCompoundPaddingRight();
          if (this.R == 1 && this.g.getMinLines() <= 1) {
            paramInt1 = (int)(rect1.top + f);
          } else {
            paramInt1 = rect.bottom - this.g.getCompoundPaddingBottom();
          } 
          rect1.bottom = paramInt1;
          hm1.u(true, rect1.left, rect1.top, rect1.right, paramInt1);
          hm1.l(false);
          if (g() && !this.x0) {
            l();
            return;
          } 
        } else {
          throw new IllegalStateException();
        } 
      } 
    } 
  }
  
  public final void onMeasure(int paramInt1, int paramInt2) {
    super.onMeasure(paramInt1, paramInt2);
    boolean bool = this.E0;
    n40 n401 = this.e;
    if (!bool) {
      n401.getViewTreeObserver().addOnGlobalLayoutListener(this);
      this.E0 = true;
    } 
    if (this.w != null) {
      EditText editText = this.g;
      if (editText != null) {
        paramInt1 = editText.getGravity();
        this.w.setGravity(paramInt1);
        this.w.setPadding(this.g.getCompoundPaddingLeft(), this.g.getCompoundPaddingTop(), this.g.getCompoundPaddingRight(), this.g.getCompoundPaddingBottom());
      } 
    } 
    n401.l();
    if (getHintMaxLines() != 1) {
      paramInt1 = this.g.getMeasuredWidth() - this.g.getCompoundPaddingLeft() - this.g.getCompoundPaddingRight();
      hm hm1 = this.y0;
      TextPaint textPaint = hm1.V;
      textPaint.setTextSize(hm1.n);
      textPaint.setTypeface(hm1.x);
      textPaint.setLetterSpacing(hm1.g0);
      paramInt2 = hm1.p0;
      CharSequence charSequence = hm1.H;
      float f = paramInt1;
      hm1.t0 = hm1.e(paramInt2, textPaint, charSequence, hm1.n / hm1.m * f, hm1.J).getHeight();
      textPaint.setTextSize(hm1.m);
      textPaint.setTypeface(hm1.A);
      textPaint.setLetterSpacing(hm1.h0);
      hm1.u0 = hm1.e(hm1.o0, textPaint, hm1.H, f, hm1.J).getHeight();
      EditText editText = this.g;
      Rect rect = this.b0;
      jy.a((ViewGroup)this, (View)editText, rect);
      rect = d(rect);
      hm1.o(rect.left, rect.top, rect.right, rect.bottom);
      v();
      a();
      if (this.g != null) {
        paramInt2 = hm1.u0;
        if (paramInt2 != -1) {
          f = paramInt2;
        } else {
          TextPaint textPaint1 = hm1.V;
          textPaint1.setTextSize(hm1.m);
          textPaint1.setTypeface(hm1.A);
          textPaint1.setLetterSpacing(hm1.h0);
          f = -textPaint1.ascent();
        } 
        CharSequence charSequence1 = this.u;
        float f1 = 0.0F;
        float f2 = 0.0F;
        if (charSequence1 != null) {
          TextPaint textPaint1 = new TextPaint(129);
          textPaint1.set(this.w.getPaint());
          textPaint1.setTextSize(this.w.getTextSize());
          textPaint1.setTypeface(this.w.getTypeface());
          textPaint1.setLetterSpacing(this.w.getLetterSpacing());
          pp1 pp1 = new pp1(this.u, textPaint1, paramInt1);
          if (getLayoutDirection() == 1) {
            bool = true;
          } else {
            bool = false;
          } 
          pp1.k = bool;
          pp1.j = true;
          f1 = this.w.getLineSpacingExtra();
          float f3 = this.w.getLineSpacingMultiplier();
          pp1.g = f1;
          pp1.h = f3;
          pp1.m = (qp1)new ds1(3, this);
          StaticLayout staticLayout = pp1.a();
          f1 = f2;
          if (this.R == 1)
            f1 = hm1.g() + this.S + this.f; 
          f1 += staticLayout.getHeight();
        } 
        f = Math.max(f, f1);
        if (this.g.getMeasuredHeight() < f)
          this.g.setMinimumHeight(Math.round(f)); 
      } 
    } 
  }
  
  public final void onRestoreInstanceState(Parcelable paramParcelable) {
    if (!(paramParcelable instanceof du1)) {
      super.onRestoreInstanceState(paramParcelable);
      return;
    } 
    du1 du1 = (du1)paramParcelable;
    super.onRestoreInstanceState(((j)du1).b);
    setError(du1.e);
    if (du1.f)
      post((Runnable)new yi1(5, this)); 
    requestLayout();
  }
  
  public final void onRtlPropertiesChanged(int paramInt) {
    super.onRtlPropertiesChanged(paramInt);
    boolean bool = true;
    if (paramInt != 1)
      bool = false; 
    if (bool != this.P) {
      ls ls = this.O.e;
      RectF rectF = this.d0;
      float f3 = ls.a(rectF);
      float f4 = this.O.f.a(rectF);
      float f1 = this.O.h.a(rectF);
      float f2 = this.O.g.a(rectF);
      vl1 vl11 = this.O;
      z51 z513 = vl11.a;
      z51 z511 = vl11.b;
      z51 z512 = vl11.d;
      z51 z514 = vl11.c;
      Object object2 = new Object();
      Object object5 = new Object();
      Object object4 = new Object();
      Object object3 = new Object();
      k k1 = new k(f4);
      k k2 = new k(f3);
      k k3 = new k(f2);
      k k4 = new k(f1);
      Object object1 = new Object();
      ((vl1)object1).a = z511;
      ((vl1)object1).b = z513;
      ((vl1)object1).c = z512;
      ((vl1)object1).d = z514;
      ((vl1)object1).e = (ls)k1;
      ((vl1)object1).f = (ls)k2;
      ((vl1)object1).g = (ls)k4;
      ((vl1)object1).h = (ls)k3;
      ((vl1)object1).i = (j30)object2;
      ((vl1)object1).j = (j30)object5;
      ((vl1)object1).k = (j30)object4;
      ((vl1)object1).l = (j30)object3;
      this.P = bool;
      setShapeAppearanceModel((vl1)object1);
    } 
  }
  
  public final Parcelable onSaveInstanceState() {
    boolean bool;
    j j = new j(super.onSaveInstanceState());
    if (o())
      ((du1)j).e = getError(); 
    n40 n401 = this.e;
    if (n401.k != 0 && n401.i.f) {
      bool = true;
    } else {
      bool = false;
    } 
    ((du1)j).f = bool;
    return (Parcelable)j;
  }
  
  public final void p(Editable paramEditable) {
    // Byte code:
    //   0: aload_0
    //   1: getfield q : Lcu1;
    //   4: checkcast k91
    //   7: invokevirtual getClass : ()Ljava/lang/Class;
    //   10: pop
    //   11: aload_1
    //   12: ifnull -> 25
    //   15: aload_1
    //   16: invokeinterface length : ()I
    //   21: istore_3
    //   22: goto -> 27
    //   25: iconst_0
    //   26: istore_3
    //   27: aload_0
    //   28: getfield p : Z
    //   31: istore #7
    //   33: aload_0
    //   34: getfield o : I
    //   37: istore #4
    //   39: aconst_null
    //   40: astore #10
    //   42: iload #4
    //   44: iconst_m1
    //   45: if_icmpne -> 75
    //   48: aload_0
    //   49: getfield r : Landroidx/appcompat/widget/AppCompatTextView;
    //   52: iload_3
    //   53: invokestatic valueOf : (I)Ljava/lang/String;
    //   56: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   59: aload_0
    //   60: getfield r : Landroidx/appcompat/widget/AppCompatTextView;
    //   63: aconst_null
    //   64: invokevirtual setContentDescription : (Ljava/lang/CharSequence;)V
    //   67: aload_0
    //   68: iconst_0
    //   69: putfield p : Z
    //   72: goto -> 553
    //   75: iload_3
    //   76: iload #4
    //   78: if_icmple -> 87
    //   81: iconst_1
    //   82: istore #6
    //   84: goto -> 90
    //   87: iconst_0
    //   88: istore #6
    //   90: aload_0
    //   91: iload #6
    //   93: putfield p : Z
    //   96: aload_0
    //   97: invokevirtual getContext : ()Landroid/content/Context;
    //   100: astore_1
    //   101: aload_0
    //   102: getfield r : Landroidx/appcompat/widget/AppCompatTextView;
    //   105: astore #11
    //   107: aload_0
    //   108: getfield o : I
    //   111: istore #5
    //   113: aload_0
    //   114: getfield p : Z
    //   117: ifeq -> 128
    //   120: ldc_w 2131886351
    //   123: istore #4
    //   125: goto -> 133
    //   128: ldc_w 2131886350
    //   131: istore #4
    //   133: aload #11
    //   135: aload_1
    //   136: iload #4
    //   138: iconst_2
    //   139: anewarray java/lang/Object
    //   142: dup
    //   143: iconst_0
    //   144: iload_3
    //   145: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   148: aastore
    //   149: dup
    //   150: iconst_1
    //   151: iload #5
    //   153: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   156: aastore
    //   157: invokevirtual getString : (I[Ljava/lang/Object;)Ljava/lang/String;
    //   160: invokevirtual setContentDescription : (Ljava/lang/CharSequence;)V
    //   163: iload #7
    //   165: aload_0
    //   166: getfield p : Z
    //   169: if_icmpeq -> 176
    //   172: aload_0
    //   173: invokevirtual q : ()V
    //   176: getstatic cf.b : Ljava/lang/String;
    //   179: astore_1
    //   180: invokestatic getDefault : ()Ljava/util/Locale;
    //   183: invokestatic getLayoutDirectionFromLocale : (Ljava/util/Locale;)I
    //   186: iconst_1
    //   187: if_icmpne -> 197
    //   190: getstatic cf.e : Lcf;
    //   193: astore_1
    //   194: goto -> 201
    //   197: getstatic cf.d : Lcf;
    //   200: astore_1
    //   201: aload_0
    //   202: getfield r : Landroidx/appcompat/widget/AppCompatTextView;
    //   205: astore #12
    //   207: aload_0
    //   208: invokevirtual getContext : ()Landroid/content/Context;
    //   211: ldc_w 2131886352
    //   214: iconst_2
    //   215: anewarray java/lang/Object
    //   218: dup
    //   219: iconst_0
    //   220: iload_3
    //   221: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   224: aastore
    //   225: dup
    //   226: iconst_1
    //   227: aload_0
    //   228: getfield o : I
    //   231: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   234: aastore
    //   235: invokevirtual getString : (I[Ljava/lang/Object;)Ljava/lang/String;
    //   238: astore #13
    //   240: aload_1
    //   241: invokevirtual getClass : ()Ljava/lang/Class;
    //   244: pop
    //   245: getstatic wt1.c : Lsb;
    //   248: astore #14
    //   250: aload #13
    //   252: ifnonnull -> 261
    //   255: aload #10
    //   257: astore_1
    //   258: goto -> 547
    //   261: getstatic cf.c : Ljava/lang/String;
    //   264: astore #10
    //   266: getstatic cf.b : Ljava/lang/String;
    //   269: astore #11
    //   271: aload_1
    //   272: getfield a : Z
    //   275: istore #6
    //   277: aload #14
    //   279: aload #13
    //   281: aload #13
    //   283: invokevirtual length : ()I
    //   286: invokevirtual c : (Ljava/lang/CharSequence;I)Z
    //   289: istore #8
    //   291: new android/text/SpannableStringBuilder
    //   294: dup
    //   295: invokespecial <init> : ()V
    //   298: astore #14
    //   300: iload #8
    //   302: ifeq -> 312
    //   305: getstatic wt1.b : Lsb;
    //   308: astore_1
    //   309: goto -> 316
    //   312: getstatic wt1.a : Lsb;
    //   315: astore_1
    //   316: aload_1
    //   317: aload #13
    //   319: aload #13
    //   321: invokevirtual length : ()I
    //   324: invokevirtual c : (Ljava/lang/CharSequence;I)Z
    //   327: istore #9
    //   329: iload #6
    //   331: ifne -> 354
    //   334: iload #9
    //   336: ifne -> 348
    //   339: aload #13
    //   341: invokestatic a : (Ljava/lang/String;)I
    //   344: iconst_1
    //   345: if_icmpne -> 354
    //   348: aload #11
    //   350: astore_1
    //   351: goto -> 383
    //   354: iload #6
    //   356: ifeq -> 379
    //   359: iload #9
    //   361: ifeq -> 373
    //   364: aload #13
    //   366: invokestatic a : (Ljava/lang/String;)I
    //   369: iconst_m1
    //   370: if_icmpne -> 379
    //   373: aload #10
    //   375: astore_1
    //   376: goto -> 383
    //   379: ldc_w ''
    //   382: astore_1
    //   383: aload #14
    //   385: aload_1
    //   386: invokevirtual append : (Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;
    //   389: pop
    //   390: iload #8
    //   392: iload #6
    //   394: if_icmpeq -> 440
    //   397: iload #8
    //   399: ifeq -> 409
    //   402: sipush #8235
    //   405: istore_2
    //   406: goto -> 413
    //   409: sipush #8234
    //   412: istore_2
    //   413: aload #14
    //   415: iload_2
    //   416: invokevirtual append : (C)Landroid/text/SpannableStringBuilder;
    //   419: pop
    //   420: aload #14
    //   422: aload #13
    //   424: invokevirtual append : (Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;
    //   427: pop
    //   428: aload #14
    //   430: sipush #8236
    //   433: invokevirtual append : (C)Landroid/text/SpannableStringBuilder;
    //   436: pop
    //   437: goto -> 448
    //   440: aload #14
    //   442: aload #13
    //   444: invokevirtual append : (Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;
    //   447: pop
    //   448: iload #8
    //   450: ifeq -> 460
    //   453: getstatic wt1.b : Lsb;
    //   456: astore_1
    //   457: goto -> 464
    //   460: getstatic wt1.a : Lsb;
    //   463: astore_1
    //   464: aload_1
    //   465: aload #13
    //   467: aload #13
    //   469: invokevirtual length : ()I
    //   472: invokevirtual c : (Ljava/lang/CharSequence;I)Z
    //   475: istore #8
    //   477: iload #6
    //   479: ifne -> 502
    //   482: iload #8
    //   484: ifne -> 496
    //   487: aload #13
    //   489: invokestatic b : (Ljava/lang/String;)I
    //   492: iconst_1
    //   493: if_icmpne -> 502
    //   496: aload #11
    //   498: astore_1
    //   499: goto -> 534
    //   502: iload #6
    //   504: ifeq -> 530
    //   507: aload #10
    //   509: astore_1
    //   510: iload #8
    //   512: ifeq -> 534
    //   515: aload #13
    //   517: invokestatic b : (Ljava/lang/String;)I
    //   520: iconst_m1
    //   521: if_icmpne -> 530
    //   524: aload #10
    //   526: astore_1
    //   527: goto -> 534
    //   530: ldc_w ''
    //   533: astore_1
    //   534: aload #14
    //   536: aload_1
    //   537: invokevirtual append : (Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;
    //   540: pop
    //   541: aload #14
    //   543: invokevirtual toString : ()Ljava/lang/String;
    //   546: astore_1
    //   547: aload #12
    //   549: aload_1
    //   550: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   553: aload_0
    //   554: getfield g : Landroid/widget/EditText;
    //   557: ifnull -> 583
    //   560: iload #7
    //   562: aload_0
    //   563: getfield p : Z
    //   566: if_icmpeq -> 583
    //   569: aload_0
    //   570: iconst_0
    //   571: iconst_0
    //   572: invokevirtual w : (ZZ)V
    //   575: aload_0
    //   576: invokevirtual z : ()V
    //   579: aload_0
    //   580: invokevirtual t : ()V
    //   583: return
  }
  
  public final void q() {
    AppCompatTextView appCompatTextView = this.r;
    if (appCompatTextView != null) {
      int i;
      if (this.p) {
        i = this.s;
      } else {
        i = this.t;
      } 
      n(appCompatTextView, i);
      if (!this.p) {
        ColorStateList colorStateList = this.B;
        if (colorStateList != null)
          this.r.setTextColor(colorStateList); 
      } 
      if (this.p) {
        ColorStateList colorStateList = this.C;
        if (colorStateList != null)
          this.r.setTextColor(colorStateList); 
      } 
    } 
  }
  
  public final void r() {
    // Byte code:
    //   0: aload_0
    //   1: getfield D : Landroid/content/res/ColorStateList;
    //   4: astore_2
    //   5: aload_2
    //   6: ifnull -> 12
    //   9: goto -> 66
    //   12: aload_0
    //   13: invokevirtual getContext : ()Landroid/content/Context;
    //   16: astore_3
    //   17: aload_3
    //   18: ldc_w 2130968899
    //   21: invokestatic Y : (Landroid/content/Context;I)Landroid/util/TypedValue;
    //   24: astore_2
    //   25: aload_2
    //   26: ifnonnull -> 34
    //   29: aconst_null
    //   30: astore_2
    //   31: goto -> 66
    //   34: aload_2
    //   35: getfield resourceId : I
    //   38: istore_1
    //   39: iload_1
    //   40: ifeq -> 52
    //   43: aload_3
    //   44: iload_1
    //   45: invokestatic y : (Landroid/content/Context;I)Landroid/content/res/ColorStateList;
    //   48: astore_2
    //   49: goto -> 66
    //   52: aload_2
    //   53: getfield data : I
    //   56: istore_1
    //   57: iload_1
    //   58: ifeq -> 29
    //   61: iload_1
    //   62: invokestatic valueOf : (I)Landroid/content/res/ColorStateList;
    //   65: astore_2
    //   66: aload_0
    //   67: getfield g : Landroid/widget/EditText;
    //   70: astore_3
    //   71: aload_3
    //   72: ifnull -> 144
    //   75: aload_3
    //   76: invokevirtual getTextCursorDrawable : ()Landroid/graphics/drawable/Drawable;
    //   79: ifnonnull -> 85
    //   82: goto -> 144
    //   85: aload_0
    //   86: getfield g : Landroid/widget/EditText;
    //   89: invokevirtual getTextCursorDrawable : ()Landroid/graphics/drawable/Drawable;
    //   92: invokevirtual mutate : ()Landroid/graphics/drawable/Drawable;
    //   95: astore #5
    //   97: aload_0
    //   98: invokevirtual o : ()Z
    //   101: ifne -> 122
    //   104: aload_2
    //   105: astore_3
    //   106: aload_0
    //   107: getfield r : Landroidx/appcompat/widget/AppCompatTextView;
    //   110: ifnull -> 138
    //   113: aload_2
    //   114: astore_3
    //   115: aload_0
    //   116: getfield p : Z
    //   119: ifeq -> 138
    //   122: aload_0
    //   123: getfield E : Landroid/content/res/ColorStateList;
    //   126: astore #4
    //   128: aload_2
    //   129: astore_3
    //   130: aload #4
    //   132: ifnull -> 138
    //   135: aload #4
    //   137: astore_3
    //   138: aload #5
    //   140: aload_3
    //   141: invokevirtual setTintList : (Landroid/content/res/ColorStateList;)V
    //   144: return
  }
  
  public final boolean s() {
    // Byte code:
    //   0: aload_0
    //   1: getfield g : Landroid/widget/EditText;
    //   4: ifnonnull -> 9
    //   7: iconst_0
    //   8: ireturn
    //   9: aload_0
    //   10: invokevirtual getStartIconDrawable : ()Landroid/graphics/drawable/Drawable;
    //   13: astore #5
    //   15: aconst_null
    //   16: astore #6
    //   18: iconst_1
    //   19: istore #4
    //   21: aload #5
    //   23: ifnonnull -> 43
    //   26: aload_0
    //   27: invokevirtual getPrefixText : ()Ljava/lang/CharSequence;
    //   30: ifnull -> 167
    //   33: aload_0
    //   34: invokevirtual getPrefixTextView : ()Landroid/widget/TextView;
    //   37: invokevirtual getVisibility : ()I
    //   40: ifne -> 167
    //   43: aload_0
    //   44: getfield c : Lep1;
    //   47: astore #5
    //   49: aload #5
    //   51: invokevirtual getMeasuredWidth : ()I
    //   54: ifle -> 167
    //   57: aload #5
    //   59: invokevirtual getMeasuredWidth : ()I
    //   62: aload_0
    //   63: getfield g : Landroid/widget/EditText;
    //   66: invokevirtual getPaddingLeft : ()I
    //   69: isub
    //   70: istore_1
    //   71: aload_0
    //   72: getfield f0 : Landroid/graphics/drawable/ColorDrawable;
    //   75: ifnull -> 86
    //   78: aload_0
    //   79: getfield g0 : I
    //   82: iload_1
    //   83: if_icmpeq -> 115
    //   86: new android/graphics/drawable/ColorDrawable
    //   89: dup
    //   90: invokespecial <init> : ()V
    //   93: astore #5
    //   95: aload_0
    //   96: aload #5
    //   98: putfield f0 : Landroid/graphics/drawable/ColorDrawable;
    //   101: aload_0
    //   102: iload_1
    //   103: putfield g0 : I
    //   106: aload #5
    //   108: iconst_0
    //   109: iconst_0
    //   110: iload_1
    //   111: iconst_1
    //   112: invokevirtual setBounds : (IIII)V
    //   115: aload_0
    //   116: getfield g : Landroid/widget/EditText;
    //   119: invokevirtual getCompoundDrawablesRelative : ()[Landroid/graphics/drawable/Drawable;
    //   122: astore #7
    //   124: aload #7
    //   126: iconst_0
    //   127: aaload
    //   128: astore #8
    //   130: aload_0
    //   131: getfield f0 : Landroid/graphics/drawable/ColorDrawable;
    //   134: astore #5
    //   136: aload #8
    //   138: aload #5
    //   140: if_acmpeq -> 213
    //   143: aload_0
    //   144: getfield g : Landroid/widget/EditText;
    //   147: aload #5
    //   149: aload #7
    //   151: iconst_1
    //   152: aaload
    //   153: aload #7
    //   155: iconst_2
    //   156: aaload
    //   157: aload #7
    //   159: iconst_3
    //   160: aaload
    //   161: invokevirtual setCompoundDrawablesRelative : (Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V
    //   164: goto -> 208
    //   167: aload_0
    //   168: getfield f0 : Landroid/graphics/drawable/ColorDrawable;
    //   171: ifnull -> 213
    //   174: aload_0
    //   175: getfield g : Landroid/widget/EditText;
    //   178: invokevirtual getCompoundDrawablesRelative : ()[Landroid/graphics/drawable/Drawable;
    //   181: astore #5
    //   183: aload_0
    //   184: getfield g : Landroid/widget/EditText;
    //   187: aconst_null
    //   188: aload #5
    //   190: iconst_1
    //   191: aaload
    //   192: aload #5
    //   194: iconst_2
    //   195: aaload
    //   196: aload #5
    //   198: iconst_3
    //   199: aaload
    //   200: invokevirtual setCompoundDrawablesRelative : (Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V
    //   203: aload_0
    //   204: aconst_null
    //   205: putfield f0 : Landroid/graphics/drawable/ColorDrawable;
    //   208: iconst_1
    //   209: istore_3
    //   210: goto -> 215
    //   213: iconst_0
    //   214: istore_3
    //   215: aload_0
    //   216: getfield e : Ln40;
    //   219: astore #7
    //   221: aload #7
    //   223: invokevirtual d : ()Z
    //   226: ifne -> 253
    //   229: aload #7
    //   231: getfield k : I
    //   234: ifeq -> 245
    //   237: aload #7
    //   239: invokevirtual c : ()Z
    //   242: ifne -> 253
    //   245: aload #7
    //   247: getfield r : Ljava/lang/CharSequence;
    //   250: ifnull -> 505
    //   253: aload #7
    //   255: invokevirtual getMeasuredWidth : ()I
    //   258: ifle -> 505
    //   261: aload #7
    //   263: getfield s : Landroidx/appcompat/widget/AppCompatTextView;
    //   266: invokevirtual getMeasuredWidth : ()I
    //   269: aload_0
    //   270: getfield g : Landroid/widget/EditText;
    //   273: invokevirtual getPaddingRight : ()I
    //   276: isub
    //   277: istore_2
    //   278: aload #7
    //   280: invokevirtual d : ()Z
    //   283: ifeq -> 296
    //   286: aload #7
    //   288: getfield e : Lcom/google/android/material/internal/CheckableImageButton;
    //   291: astore #5
    //   293: goto -> 327
    //   296: aload #6
    //   298: astore #5
    //   300: aload #7
    //   302: getfield k : I
    //   305: ifeq -> 327
    //   308: aload #6
    //   310: astore #5
    //   312: aload #7
    //   314: invokevirtual c : ()Z
    //   317: ifeq -> 327
    //   320: aload #7
    //   322: getfield i : Lcom/google/android/material/internal/CheckableImageButton;
    //   325: astore #5
    //   327: iload_2
    //   328: istore_1
    //   329: aload #5
    //   331: ifnull -> 356
    //   334: aload #5
    //   336: invokevirtual getMeasuredWidth : ()I
    //   339: istore_1
    //   340: aload #5
    //   342: invokevirtual getLayoutParams : ()Landroid/view/ViewGroup$LayoutParams;
    //   345: checkcast android/view/ViewGroup$MarginLayoutParams
    //   348: invokevirtual getMarginStart : ()I
    //   351: iload_1
    //   352: iload_2
    //   353: iadd
    //   354: iadd
    //   355: istore_1
    //   356: aload_0
    //   357: getfield g : Landroid/widget/EditText;
    //   360: invokevirtual getCompoundDrawablesRelative : ()[Landroid/graphics/drawable/Drawable;
    //   363: astore #5
    //   365: aload_0
    //   366: getfield i0 : Landroid/graphics/drawable/ColorDrawable;
    //   369: astore #6
    //   371: aload #6
    //   373: ifnull -> 423
    //   376: aload_0
    //   377: getfield j0 : I
    //   380: iload_1
    //   381: if_icmpeq -> 423
    //   384: aload_0
    //   385: iload_1
    //   386: putfield j0 : I
    //   389: aload #6
    //   391: iconst_0
    //   392: iconst_0
    //   393: iload_1
    //   394: iconst_1
    //   395: invokevirtual setBounds : (IIII)V
    //   398: aload_0
    //   399: getfield g : Landroid/widget/EditText;
    //   402: aload #5
    //   404: iconst_0
    //   405: aaload
    //   406: aload #5
    //   408: iconst_1
    //   409: aaload
    //   410: aload_0
    //   411: getfield i0 : Landroid/graphics/drawable/ColorDrawable;
    //   414: aload #5
    //   416: iconst_3
    //   417: aaload
    //   418: invokevirtual setCompoundDrawablesRelative : (Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V
    //   421: iconst_1
    //   422: ireturn
    //   423: aload #6
    //   425: ifnonnull -> 457
    //   428: new android/graphics/drawable/ColorDrawable
    //   431: dup
    //   432: invokespecial <init> : ()V
    //   435: astore #6
    //   437: aload_0
    //   438: aload #6
    //   440: putfield i0 : Landroid/graphics/drawable/ColorDrawable;
    //   443: aload_0
    //   444: iload_1
    //   445: putfield j0 : I
    //   448: aload #6
    //   450: iconst_0
    //   451: iconst_0
    //   452: iload_1
    //   453: iconst_1
    //   454: invokevirtual setBounds : (IIII)V
    //   457: aload #5
    //   459: iconst_2
    //   460: aaload
    //   461: astore #6
    //   463: aload_0
    //   464: getfield i0 : Landroid/graphics/drawable/ColorDrawable;
    //   467: astore #7
    //   469: aload #6
    //   471: aload #7
    //   473: if_acmpeq -> 568
    //   476: aload_0
    //   477: aload #6
    //   479: putfield k0 : Landroid/graphics/drawable/Drawable;
    //   482: aload_0
    //   483: getfield g : Landroid/widget/EditText;
    //   486: aload #5
    //   488: iconst_0
    //   489: aaload
    //   490: aload #5
    //   492: iconst_1
    //   493: aaload
    //   494: aload #7
    //   496: aload #5
    //   498: iconst_3
    //   499: aaload
    //   500: invokevirtual setCompoundDrawablesRelative : (Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V
    //   503: iconst_1
    //   504: ireturn
    //   505: aload_0
    //   506: getfield i0 : Landroid/graphics/drawable/ColorDrawable;
    //   509: ifnull -> 568
    //   512: aload_0
    //   513: getfield g : Landroid/widget/EditText;
    //   516: invokevirtual getCompoundDrawablesRelative : ()[Landroid/graphics/drawable/Drawable;
    //   519: astore #5
    //   521: aload #5
    //   523: iconst_2
    //   524: aaload
    //   525: aload_0
    //   526: getfield i0 : Landroid/graphics/drawable/ColorDrawable;
    //   529: if_acmpne -> 561
    //   532: aload_0
    //   533: getfield g : Landroid/widget/EditText;
    //   536: aload #5
    //   538: iconst_0
    //   539: aaload
    //   540: aload #5
    //   542: iconst_1
    //   543: aaload
    //   544: aload_0
    //   545: getfield k0 : Landroid/graphics/drawable/Drawable;
    //   548: aload #5
    //   550: iconst_3
    //   551: aaload
    //   552: invokevirtual setCompoundDrawablesRelative : (Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V
    //   555: iload #4
    //   557: istore_3
    //   558: goto -> 561
    //   561: aload_0
    //   562: aconst_null
    //   563: putfield i0 : Landroid/graphics/drawable/ColorDrawable;
    //   566: iload_3
    //   567: ireturn
    //   568: iload_3
    //   569: ireturn
  }
  
  public void setBoxBackgroundColor(int paramInt) {
    if (this.a0 != paramInt) {
      this.a0 = paramInt;
      this.r0 = paramInt;
      this.t0 = paramInt;
      this.u0 = paramInt;
      c();
    } 
  }
  
  public void setBoxBackgroundColorResource(int paramInt) {
    setBoxBackgroundColor(getContext().getColor(paramInt));
  }
  
  public void setBoxBackgroundColorStateList(ColorStateList paramColorStateList) {
    int i = paramColorStateList.getDefaultColor();
    this.r0 = i;
    this.a0 = i;
    this.s0 = paramColorStateList.getColorForState(new int[] { -16842910 }, -1);
    this.t0 = paramColorStateList.getColorForState(new int[] { 16842908, 16842910 }, -1);
    this.u0 = paramColorStateList.getColorForState(new int[] { 16843623, 16842910 }, -1);
    c();
  }
  
  public void setBoxBackgroundMode(int paramInt) {
    if (paramInt != this.R) {
      this.R = paramInt;
      if (this.g != null)
        k(); 
    } 
  }
  
  public void setBoxCollapsedPaddingTop(int paramInt) {
    this.S = paramInt;
  }
  
  public void setBoxCornerFamily(int paramInt) {
    ul1 ul1 = this.O.f();
    ls ls = this.O.e;
    ul1.a = zo2.g(paramInt);
    ul1.e = ls;
    ls = this.O.f;
    ul1.b = zo2.g(paramInt);
    ul1.f = ls;
    ls = this.O.h;
    ul1.d = zo2.g(paramInt);
    ul1.h = ls;
    ls = this.O.g;
    ul1.c = zo2.g(paramInt);
    ul1.g = ls;
    this.O = ul1.a();
    c();
  }
  
  public void setBoxStrokeColor(int paramInt) {
    if (this.p0 != paramInt) {
      this.p0 = paramInt;
      z();
    } 
  }
  
  public void setBoxStrokeColorStateList(ColorStateList paramColorStateList) {
    if (paramColorStateList.isStateful()) {
      this.n0 = paramColorStateList.getDefaultColor();
      this.v0 = paramColorStateList.getColorForState(new int[] { -16842910 }, -1);
      this.o0 = paramColorStateList.getColorForState(new int[] { 16843623, 16842910 }, -1);
      this.p0 = paramColorStateList.getColorForState(new int[] { 16842908, 16842910 }, -1);
    } else if (this.p0 != paramColorStateList.getDefaultColor()) {
      this.p0 = paramColorStateList.getDefaultColor();
    } 
    z();
  }
  
  public void setBoxStrokeErrorColor(ColorStateList paramColorStateList) {
    if (this.q0 != paramColorStateList) {
      this.q0 = paramColorStateList;
      z();
    } 
  }
  
  public void setBoxStrokeWidth(int paramInt) {
    this.U = paramInt;
    z();
  }
  
  public void setBoxStrokeWidthFocused(int paramInt) {
    this.V = paramInt;
    z();
  }
  
  public void setBoxStrokeWidthFocusedResource(int paramInt) {
    setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(paramInt));
  }
  
  public void setBoxStrokeWidthResource(int paramInt) {
    setBoxStrokeWidth(getResources().getDimensionPixelSize(paramInt));
  }
  
  public void setCounterEnabled(boolean paramBoolean) {
    if (this.n != paramBoolean) {
      EditText editText;
      Editable editable = null;
      xh0 xh01 = this.m;
      if (paramBoolean) {
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
        this.r = appCompatTextView;
        appCompatTextView.setId(2131297630);
        Typeface typeface = this.e0;
        if (typeface != null)
          this.r.setTypeface(typeface); 
        this.r.setMaxLines(1);
        xh01.a(this.r, 2);
        ((ViewGroup.MarginLayoutParams)this.r.getLayoutParams()).setMarginStart(getResources().getDimensionPixelOffset(2131166307));
        q();
        if (this.r != null) {
          editText = this.g;
          if (editText != null)
            editable = editText.getText(); 
          p(editable);
        } 
      } else {
        editText.g(this.r, 2);
        this.r = null;
      } 
      this.n = paramBoolean;
    } 
  }
  
  public void setCounterMaxLength(int paramInt) {
    if (this.o != paramInt) {
      if (paramInt > 0) {
        this.o = paramInt;
      } else {
        this.o = -1;
      } 
      if (this.n && this.r != null) {
        Editable editable;
        EditText editText = this.g;
        if (editText == null) {
          editText = null;
        } else {
          editable = editText.getText();
        } 
        p(editable);
      } 
    } 
  }
  
  public void setCounterOverflowTextAppearance(int paramInt) {
    if (this.s != paramInt) {
      this.s = paramInt;
      q();
    } 
  }
  
  public void setCounterOverflowTextColor(ColorStateList paramColorStateList) {
    if (this.C != paramColorStateList) {
      this.C = paramColorStateList;
      q();
    } 
  }
  
  public void setCounterTextAppearance(int paramInt) {
    if (this.t != paramInt) {
      this.t = paramInt;
      q();
    } 
  }
  
  public void setCounterTextColor(ColorStateList paramColorStateList) {
    if (this.B != paramColorStateList) {
      this.B = paramColorStateList;
      q();
    } 
  }
  
  public void setCursorColor(ColorStateList paramColorStateList) {
    if (this.D != paramColorStateList) {
      this.D = paramColorStateList;
      r();
    } 
  }
  
  public void setCursorErrorColor(ColorStateList paramColorStateList) {
    if (this.E != paramColorStateList) {
      this.E = paramColorStateList;
      if (o() || (this.r != null && this.p)) {
        r();
        return;
      } 
      return;
    } 
  }
  
  public void setDefaultHintTextColor(ColorStateList paramColorStateList) {
    this.l0 = paramColorStateList;
    this.m0 = paramColorStateList;
    if (this.g != null)
      w(false, false); 
  }
  
  public void setEnabled(boolean paramBoolean) {
    m((ViewGroup)this, paramBoolean);
    super.setEnabled(paramBoolean);
  }
  
  public void setEndIconActivated(boolean paramBoolean) {
    this.e.i.setActivated(paramBoolean);
  }
  
  public void setEndIconCheckable(boolean paramBoolean) {
    this.e.i.setCheckable(paramBoolean);
  }
  
  public void setEndIconContentDescription(int paramInt) {
    CharSequence charSequence;
    n40 n401 = this.e;
    if (paramInt != 0) {
      charSequence = n401.getResources().getText(paramInt);
    } else {
      charSequence = null;
    } 
    CheckableImageButton checkableImageButton = n401.i;
    if (checkableImageButton.getContentDescription() != charSequence)
      checkableImageButton.setContentDescription(charSequence); 
  }
  
  public void setEndIconContentDescription(CharSequence paramCharSequence) {
    CheckableImageButton checkableImageButton = this.e.i;
    if (checkableImageButton.getContentDescription() != paramCharSequence)
      checkableImageButton.setContentDescription(paramCharSequence); 
  }
  
  public void setEndIconDrawable(int paramInt) {
    Drawable drawable;
    n40 n401 = this.e;
    if (paramInt != 0) {
      drawable = ws2.I(n401.getContext(), paramInt);
    } else {
      drawable = null;
    } 
    TextInputLayout textInputLayout = n401.b;
    CheckableImageButton checkableImageButton = n401.i;
    checkableImageButton.setImageDrawable(drawable);
    if (drawable != null) {
      n21.c(textInputLayout, checkableImageButton, n401.m, n401.n);
      n21.O(textInputLayout, checkableImageButton, n401.m);
    } 
  }
  
  public void setEndIconDrawable(Drawable paramDrawable) {
    n40 n401 = this.e;
    TextInputLayout textInputLayout = n401.b;
    CheckableImageButton checkableImageButton = n401.i;
    checkableImageButton.setImageDrawable(paramDrawable);
    if (paramDrawable != null) {
      n21.c(textInputLayout, checkableImageButton, n401.m, n401.n);
      n21.O(textInputLayout, checkableImageButton, n401.m);
    } 
  }
  
  public void setEndIconMinSize(int paramInt) {
    n40 n401 = this.e;
    if (paramInt >= 0) {
      if (paramInt != n401.o) {
        n401.o = paramInt;
        CheckableImageButton checkableImageButton = n401.i;
        checkableImageButton.setMinimumWidth(paramInt);
        checkableImageButton.setMinimumHeight(paramInt);
        checkableImageButton = n401.e;
        checkableImageButton.setMinimumWidth(paramInt);
        checkableImageButton.setMinimumHeight(paramInt);
      } 
      return;
    } 
    n401.getClass();
    l0.l("endIconSize cannot be less than 0");
  }
  
  public void setEndIconMode(int paramInt) {
    this.e.f(paramInt);
  }
  
  public void setEndIconOnClickListener(View.OnClickListener paramOnClickListener) {
    n40 n401 = this.e;
    CheckableImageButton checkableImageButton = n401.i;
    View.OnLongClickListener onLongClickListener = n401.q;
    checkableImageButton.setOnClickListener(paramOnClickListener);
    n21.R(checkableImageButton, onLongClickListener);
  }
  
  public void setEndIconOnLongClickListener(View.OnLongClickListener paramOnLongClickListener) {
    n40 n401 = this.e;
    n401.q = paramOnLongClickListener;
    CheckableImageButton checkableImageButton = n401.i;
    checkableImageButton.setOnLongClickListener(paramOnLongClickListener);
    n21.R(checkableImageButton, paramOnLongClickListener);
  }
  
  public void setEndIconScaleType(ImageView.ScaleType paramScaleType) {
    n40 n401 = this.e;
    n401.p = paramScaleType;
    n401.i.setScaleType(paramScaleType);
    n401.e.setScaleType(paramScaleType);
  }
  
  public void setEndIconTintList(ColorStateList paramColorStateList) {
    n40 n401 = this.e;
    if (n401.m != paramColorStateList) {
      n401.m = paramColorStateList;
      n21.c(n401.b, n401.i, paramColorStateList, n401.n);
    } 
  }
  
  public void setEndIconTintMode(PorterDuff.Mode paramMode) {
    n40 n401 = this.e;
    if (n401.n != paramMode) {
      n401.n = paramMode;
      n21.c(n401.b, n401.i, n401.m, paramMode);
    } 
  }
  
  public void setEndIconVisible(boolean paramBoolean) {
    this.e.g(paramBoolean);
  }
  
  public void setError(CharSequence paramCharSequence) {
    xh0 xh01 = this.m;
    if (!xh01.q) {
      if (TextUtils.isEmpty(paramCharSequence))
        return; 
      setErrorEnabled(true);
    } 
    if (!TextUtils.isEmpty(paramCharSequence)) {
      xh01.c();
      xh01.p = paramCharSequence;
      xh01.r.setText(paramCharSequence);
      int i = xh01.n;
      if (i != 1)
        xh01.o = 1; 
      xh01.i(i, xh01.o, xh01.h(xh01.r, paramCharSequence));
      return;
    } 
    xh01.f();
  }
  
  public void setErrorAccessibilityLiveRegion(int paramInt) {
    xh0 xh01 = this.m;
    xh01.t = paramInt;
    AppCompatTextView appCompatTextView = xh01.r;
    if (appCompatTextView != null)
      appCompatTextView.setAccessibilityLiveRegion(paramInt); 
  }
  
  public void setErrorContentDescription(CharSequence paramCharSequence) {
    xh0 xh01 = this.m;
    xh01.s = paramCharSequence;
    AppCompatTextView appCompatTextView = xh01.r;
    if (appCompatTextView != null)
      appCompatTextView.setContentDescription(paramCharSequence); 
  }
  
  public void setErrorEnabled(boolean paramBoolean) {
    AppCompatTextView appCompatTextView;
    xh0 xh01 = this.m;
    TextInputLayout textInputLayout = xh01.h;
    if (xh01.q == paramBoolean)
      return; 
    xh01.c();
    if (paramBoolean) {
      AppCompatTextView appCompatTextView2 = new AppCompatTextView(xh01.g);
      xh01.r = appCompatTextView2;
      appCompatTextView2.setId(2131297631);
      xh01.r.setTextAlignment(5);
      Typeface typeface = xh01.B;
      if (typeface != null)
        xh01.r.setTypeface(typeface); 
      int i = xh01.u;
      xh01.u = i;
      AppCompatTextView appCompatTextView1 = xh01.r;
      if (appCompatTextView1 != null)
        xh01.h.n(appCompatTextView1, i); 
      ColorStateList colorStateList = xh01.v;
      xh01.v = colorStateList;
      appCompatTextView1 = xh01.r;
      if (appCompatTextView1 != null && colorStateList != null)
        appCompatTextView1.setTextColor(colorStateList); 
      CharSequence charSequence = xh01.s;
      xh01.s = charSequence;
      AppCompatTextView appCompatTextView3 = xh01.r;
      if (appCompatTextView3 != null)
        appCompatTextView3.setContentDescription(charSequence); 
      i = xh01.t;
      xh01.t = i;
      appCompatTextView = xh01.r;
      if (appCompatTextView != null)
        appCompatTextView.setAccessibilityLiveRegion(i); 
      xh01.r.setVisibility(4);
      xh01.a(xh01.r, 0);
    } else {
      xh01.f();
      xh01.g(xh01.r, 0);
      xh01.r = null;
      appCompatTextView.t();
      appCompatTextView.z();
    } 
    xh01.q = paramBoolean;
  }
  
  public void setErrorIconDrawable(int paramInt) {
    Drawable drawable;
    n40 n401 = this.e;
    if (paramInt != 0) {
      drawable = ws2.I(n401.getContext(), paramInt);
    } else {
      drawable = null;
    } 
    n401.h(drawable);
    n21.O(n401.b, n401.e, n401.f);
  }
  
  public void setErrorIconDrawable(Drawable paramDrawable) {
    this.e.h(paramDrawable);
  }
  
  public void setErrorIconOnClickListener(View.OnClickListener paramOnClickListener) {
    n40 n401 = this.e;
    CheckableImageButton checkableImageButton = n401.e;
    View.OnLongClickListener onLongClickListener = n401.h;
    checkableImageButton.setOnClickListener(paramOnClickListener);
    n21.R(checkableImageButton, onLongClickListener);
  }
  
  public void setErrorIconOnLongClickListener(View.OnLongClickListener paramOnLongClickListener) {
    n40 n401 = this.e;
    n401.h = paramOnLongClickListener;
    CheckableImageButton checkableImageButton = n401.e;
    checkableImageButton.setOnLongClickListener(paramOnLongClickListener);
    n21.R(checkableImageButton, paramOnLongClickListener);
  }
  
  public void setErrorIconTintList(ColorStateList paramColorStateList) {
    n40 n401 = this.e;
    if (n401.f != paramColorStateList) {
      n401.f = paramColorStateList;
      n21.c(n401.b, n401.e, paramColorStateList, n401.g);
    } 
  }
  
  public void setErrorIconTintMode(PorterDuff.Mode paramMode) {
    n40 n401 = this.e;
    if (n401.g != paramMode) {
      n401.g = paramMode;
      n21.c(n401.b, n401.e, n401.f, paramMode);
    } 
  }
  
  public void setErrorTextAppearance(int paramInt) {
    xh0 xh01 = this.m;
    xh01.u = paramInt;
    AppCompatTextView appCompatTextView = xh01.r;
    if (appCompatTextView != null)
      xh01.h.n(appCompatTextView, paramInt); 
  }
  
  public void setErrorTextColor(ColorStateList paramColorStateList) {
    xh0 xh01 = this.m;
    xh01.v = paramColorStateList;
    AppCompatTextView appCompatTextView = xh01.r;
    if (appCompatTextView != null && paramColorStateList != null)
      appCompatTextView.setTextColor(paramColorStateList); 
  }
  
  public void setExpandedHintEnabled(boolean paramBoolean) {
    if (this.z0 != paramBoolean) {
      this.z0 = paramBoolean;
      w(false, false);
    } 
  }
  
  public void setHelperText(CharSequence paramCharSequence) {
    boolean bool = TextUtils.isEmpty(paramCharSequence);
    xh0 xh01 = this.m;
    if (bool) {
      if (xh01.x)
        setHelperTextEnabled(false); 
      return;
    } 
    if (!xh01.x)
      setHelperTextEnabled(true); 
    xh01.c();
    xh01.w = paramCharSequence;
    xh01.y.setText(paramCharSequence);
    int i = xh01.n;
    if (i != 2)
      xh01.o = 2; 
    xh01.i(i, xh01.o, xh01.h(xh01.y, paramCharSequence));
  }
  
  public void setHelperTextColor(ColorStateList paramColorStateList) {
    xh0 xh01 = this.m;
    xh01.A = paramColorStateList;
    AppCompatTextView appCompatTextView = xh01.y;
    if (appCompatTextView != null && paramColorStateList != null)
      appCompatTextView.setTextColor(paramColorStateList); 
  }
  
  public void setHelperTextEnabled(boolean paramBoolean) {
    AppCompatTextView appCompatTextView;
    xh0 xh01 = this.m;
    TextInputLayout textInputLayout = xh01.h;
    if (xh01.x == paramBoolean)
      return; 
    xh01.c();
    if (paramBoolean) {
      AppCompatTextView appCompatTextView1 = new AppCompatTextView(xh01.g);
      xh01.y = appCompatTextView1;
      appCompatTextView1.setId(2131297632);
      xh01.y.setTextAlignment(5);
      Typeface typeface = xh01.B;
      if (typeface != null)
        xh01.y.setTypeface(typeface); 
      xh01.y.setVisibility(4);
      xh01.y.setAccessibilityLiveRegion(1);
      int i = xh01.z;
      xh01.z = i;
      appCompatTextView = xh01.y;
      if (appCompatTextView != null)
        appCompatTextView.setTextAppearance(i); 
      ColorStateList colorStateList = xh01.A;
      xh01.A = colorStateList;
      appCompatTextView = xh01.y;
      if (appCompatTextView != null && colorStateList != null)
        appCompatTextView.setTextColor(colorStateList); 
      xh01.a(xh01.y, 1);
      xh01.y.setAccessibilityDelegate((View.AccessibilityDelegate)new wh0(xh01));
    } else {
      xh01.c();
      int i = xh01.n;
      if (i == 2)
        xh01.o = 0; 
      xh01.i(i, xh01.o, xh01.h(xh01.y, ""));
      xh01.g(xh01.y, 1);
      xh01.y = null;
      appCompatTextView.t();
      appCompatTextView.z();
    } 
    xh01.x = paramBoolean;
  }
  
  public void setHelperTextTextAppearance(int paramInt) {
    xh0 xh01 = this.m;
    xh01.z = paramInt;
    AppCompatTextView appCompatTextView = xh01.y;
    if (appCompatTextView != null)
      appCompatTextView.setTextAppearance(paramInt); 
  }
  
  public void setHint(int paramInt) {
    CharSequence charSequence;
    if (paramInt != 0) {
      charSequence = getResources().getText(paramInt);
    } else {
      charSequence = null;
    } 
    setHint(charSequence);
  }
  
  public void setHint(CharSequence paramCharSequence) {
    if (this.F) {
      setHintInternal(paramCharSequence);
      sendAccessibilityEvent(2048);
    } 
  }
  
  public void setHintAnimationEnabled(boolean paramBoolean) {
    this.A0 = paramBoolean;
  }
  
  public void setHintEnabled(boolean paramBoolean) {
    if (paramBoolean != this.F) {
      this.F = paramBoolean;
      if (!paramBoolean) {
        this.H = false;
        if (!TextUtils.isEmpty(this.G) && TextUtils.isEmpty(this.g.getHint()))
          this.g.setHint(this.G); 
        setHintInternal(null);
      } else {
        CharSequence charSequence = this.g.getHint();
        if (!TextUtils.isEmpty(charSequence)) {
          if (TextUtils.isEmpty(this.G))
            setHint(charSequence); 
          this.g.setHint(null);
        } 
        this.H = true;
      } 
      if (this.g != null)
        v(); 
    } 
  }
  
  public void setHintMaxLines(int paramInt) {
    hm hm1 = this.y0;
    if (paramInt != hm1.p0) {
      hm1.p0 = paramInt;
      hm1.l(false);
    } 
    hm1.v(paramInt);
    requestLayout();
  }
  
  public void setHintTextAppearance(int paramInt) {
    hm hm1 = this.y0;
    hm1.q(paramInt);
    this.m0 = hm1.p;
    if (this.g != null) {
      w(false, false);
      v();
    } 
  }
  
  public void setHintTextColor(ColorStateList paramColorStateList) {
    if (this.m0 != paramColorStateList) {
      if (this.l0 == null)
        this.y0.r(paramColorStateList); 
      this.m0 = paramColorStateList;
      if (this.g != null)
        w(false, false); 
    } 
  }
  
  public void setLengthCounter(cu1 paramcu1) {
    this.q = paramcu1;
  }
  
  public void setMaxEms(int paramInt) {
    this.j = paramInt;
    EditText editText = this.g;
    if (editText != null && paramInt != -1)
      editText.setMaxEms(paramInt); 
  }
  
  public void setMaxWidth(int paramInt) {
    this.l = paramInt;
    EditText editText = this.g;
    if (editText != null && paramInt != -1)
      editText.setMaxWidth(paramInt); 
  }
  
  public void setMaxWidthResource(int paramInt) {
    setMaxWidth(getContext().getResources().getDimensionPixelSize(paramInt));
  }
  
  public void setMinEms(int paramInt) {
    this.i = paramInt;
    EditText editText = this.g;
    if (editText != null && paramInt != -1)
      editText.setMinEms(paramInt); 
  }
  
  public void setMinWidth(int paramInt) {
    this.k = paramInt;
    EditText editText = this.g;
    if (editText != null && paramInt != -1)
      editText.setMinWidth(paramInt); 
  }
  
  public void setMinWidthResource(int paramInt) {
    setMinWidth(getContext().getResources().getDimensionPixelSize(paramInt));
  }
  
  @Deprecated
  public void setPasswordVisibilityToggleContentDescription(int paramInt) {
    CharSequence charSequence;
    n40 n401 = this.e;
    if (paramInt != 0) {
      charSequence = n401.getResources().getText(paramInt);
    } else {
      charSequence = null;
    } 
    n401.i.setContentDescription(charSequence);
  }
  
  @Deprecated
  public void setPasswordVisibilityToggleContentDescription(CharSequence paramCharSequence) {
    this.e.i.setContentDescription(paramCharSequence);
  }
  
  @Deprecated
  public void setPasswordVisibilityToggleDrawable(int paramInt) {
    Drawable drawable;
    n40 n401 = this.e;
    if (paramInt != 0) {
      drawable = ws2.I(n401.getContext(), paramInt);
    } else {
      drawable = null;
    } 
    n401.i.setImageDrawable(drawable);
  }
  
  @Deprecated
  public void setPasswordVisibilityToggleDrawable(Drawable paramDrawable) {
    this.e.i.setImageDrawable(paramDrawable);
  }
  
  @Deprecated
  public void setPasswordVisibilityToggleEnabled(boolean paramBoolean) {
    n40 n401 = this.e;
    if (paramBoolean && n401.k != 1) {
      n401.f(1);
      return;
    } 
    if (!paramBoolean) {
      n401.f(0);
      return;
    } 
    n401.getClass();
  }
  
  @Deprecated
  public void setPasswordVisibilityToggleTintList(ColorStateList paramColorStateList) {
    n40 n401 = this.e;
    n401.m = paramColorStateList;
    n21.c(n401.b, n401.i, paramColorStateList, n401.n);
  }
  
  @Deprecated
  public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode paramMode) {
    n40 n401 = this.e;
    n401.n = paramMode;
    n21.c(n401.b, n401.i, n401.m, paramMode);
  }
  
  public void setPlaceholderText(CharSequence paramCharSequence) {
    Editable editable;
    if (this.w == null) {
      AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
      this.w = appCompatTextView;
      appCompatTextView.setId(2131297633);
      this.w.setImportantForAccessibility(1);
      this.w.setAccessibilityLiveRegion(1);
      l70 l701 = f();
      this.z = l701;
      ((kw1)l701).c = 67L;
      this.A = f();
      setPlaceholderTextAppearance(this.y);
      setPlaceholderTextColor(this.x);
      v22.n((View)this.w, (k0)new h11(1));
    } 
    if (TextUtils.isEmpty(paramCharSequence)) {
      setPlaceholderTextEnabled(false);
    } else {
      if (!this.v)
        setPlaceholderTextEnabled(true); 
      this.u = paramCharSequence;
    } 
    EditText editText = this.g;
    if (editText == null) {
      editText = null;
    } else {
      editable = editText.getText();
    } 
    x(editable);
  }
  
  public void setPlaceholderTextAppearance(int paramInt) {
    this.y = paramInt;
    AppCompatTextView appCompatTextView = this.w;
    if (appCompatTextView != null)
      appCompatTextView.setTextAppearance(paramInt); 
  }
  
  public void setPlaceholderTextColor(ColorStateList paramColorStateList) {
    if (this.x != paramColorStateList) {
      this.x = paramColorStateList;
      AppCompatTextView appCompatTextView = this.w;
      if (appCompatTextView != null && paramColorStateList != null)
        appCompatTextView.setTextColor(paramColorStateList); 
    } 
  }
  
  public void setPrefixText(CharSequence paramCharSequence) {
    CharSequence charSequence;
    ep1 ep11 = this.c;
    ep11.getClass();
    if (TextUtils.isEmpty(paramCharSequence)) {
      charSequence = null;
    } else {
      charSequence = paramCharSequence;
    } 
    ep11.e = charSequence;
    ep11.c.setText(paramCharSequence);
    ep11.e();
  }
  
  public void setPrefixTextAppearance(int paramInt) {
    this.c.c.setTextAppearance(paramInt);
  }
  
  public void setPrefixTextColor(ColorStateList paramColorStateList) {
    this.c.c.setTextColor(paramColorStateList);
  }
  
  public void setShapeAppearanceModel(vl1 paramvl1) {
    ws0 ws01 = this.I;
    if (ws01 != null && ws01.c.a != paramvl1) {
      this.O = paramvl1;
      c();
    } 
  }
  
  public void setStartIconCheckable(boolean paramBoolean) {
    this.c.f.setCheckable(paramBoolean);
  }
  
  public void setStartIconContentDescription(int paramInt) {
    CharSequence charSequence;
    if (paramInt != 0) {
      charSequence = getResources().getText(paramInt);
    } else {
      charSequence = null;
    } 
    setStartIconContentDescription(charSequence);
  }
  
  public void setStartIconContentDescription(CharSequence paramCharSequence) {
    CheckableImageButton checkableImageButton = this.c.f;
    if (checkableImageButton.getContentDescription() != paramCharSequence)
      checkableImageButton.setContentDescription(paramCharSequence); 
  }
  
  public void setStartIconDrawable(int paramInt) {
    Drawable drawable;
    if (paramInt != 0) {
      drawable = ws2.I(getContext(), paramInt);
    } else {
      drawable = null;
    } 
    setStartIconDrawable(drawable);
  }
  
  public void setStartIconDrawable(Drawable paramDrawable) {
    this.c.b(paramDrawable);
  }
  
  public void setStartIconMinSize(int paramInt) {
    CheckableImageButton checkableImageButton;
    ep1 ep11 = this.c;
    if (paramInt >= 0) {
      if (paramInt != ep11.i) {
        ep11.i = paramInt;
        checkableImageButton = ep11.f;
        checkableImageButton.setMinimumWidth(paramInt);
        checkableImageButton.setMinimumHeight(paramInt);
      } 
      return;
    } 
    checkableImageButton.getClass();
    l0.l("startIconSize cannot be less than 0");
  }
  
  public void setStartIconOnClickListener(View.OnClickListener paramOnClickListener) {
    ep1 ep11 = this.c;
    CheckableImageButton checkableImageButton = ep11.f;
    View.OnLongClickListener onLongClickListener = ep11.k;
    checkableImageButton.setOnClickListener(paramOnClickListener);
    n21.R(checkableImageButton, onLongClickListener);
  }
  
  public void setStartIconOnLongClickListener(View.OnLongClickListener paramOnLongClickListener) {
    ep1 ep11 = this.c;
    ep11.k = paramOnLongClickListener;
    CheckableImageButton checkableImageButton = ep11.f;
    checkableImageButton.setOnLongClickListener(paramOnLongClickListener);
    n21.R(checkableImageButton, paramOnLongClickListener);
  }
  
  public void setStartIconScaleType(ImageView.ScaleType paramScaleType) {
    ep1 ep11 = this.c;
    ep11.j = paramScaleType;
    ep11.f.setScaleType(paramScaleType);
  }
  
  public void setStartIconTintList(ColorStateList paramColorStateList) {
    ep1 ep11 = this.c;
    if (ep11.g != paramColorStateList) {
      ep11.g = paramColorStateList;
      n21.c(ep11.b, ep11.f, paramColorStateList, ep11.h);
    } 
  }
  
  public void setStartIconTintMode(PorterDuff.Mode paramMode) {
    ep1 ep11 = this.c;
    if (ep11.h != paramMode) {
      ep11.h = paramMode;
      n21.c(ep11.b, ep11.f, ep11.g, paramMode);
    } 
  }
  
  public void setStartIconVisible(boolean paramBoolean) {
    this.c.c(paramBoolean);
  }
  
  public void setSuffixText(CharSequence paramCharSequence) {
    CharSequence charSequence;
    n40 n401 = this.e;
    n401.getClass();
    if (TextUtils.isEmpty(paramCharSequence)) {
      charSequence = null;
    } else {
      charSequence = paramCharSequence;
    } 
    n401.r = charSequence;
    n401.s.setText(paramCharSequence);
    n401.m();
  }
  
  public void setSuffixTextAppearance(int paramInt) {
    this.e.s.setTextAppearance(paramInt);
  }
  
  public void setSuffixTextColor(ColorStateList paramColorStateList) {
    this.e.s.setTextColor(paramColorStateList);
  }
  
  public void setTextInputAccessibilityDelegate(bu1 parambu1) {
    EditText editText = this.g;
    if (editText != null)
      v22.n((View)editText, (k0)parambu1); 
  }
  
  public void setTypeface(Typeface paramTypeface) {
    if (paramTypeface != this.e0) {
      this.e0 = paramTypeface;
      hm hm1 = this.y0;
      boolean bool2 = hm1.t(paramTypeface);
      boolean bool1 = hm1.z(paramTypeface);
      if (bool2 || bool1)
        hm1.l(false); 
      xh0 xh01 = this.m;
      if (paramTypeface != xh01.B) {
        xh01.B = paramTypeface;
        AppCompatTextView appCompatTextView1 = xh01.r;
        if (appCompatTextView1 != null)
          appCompatTextView1.setTypeface(paramTypeface); 
        appCompatTextView1 = xh01.y;
        if (appCompatTextView1 != null)
          appCompatTextView1.setTypeface(paramTypeface); 
      } 
      AppCompatTextView appCompatTextView = this.r;
      if (appCompatTextView != null)
        appCompatTextView.setTypeface(paramTypeface); 
    } 
  }
  
  public final void t() {
    EditText editText = this.g;
    if (editText != null && this.R == 0) {
      Drawable drawable = editText.getBackground();
      if (drawable != null) {
        int[] arrayOfInt = l10.a;
        Drawable drawable1 = drawable.mutate();
        if (o()) {
          drawable1.setColorFilter((ColorFilter)y6.c(getErrorCurrentTextColors(), PorterDuff.Mode.SRC_IN));
          return;
        } 
        if (this.p) {
          AppCompatTextView appCompatTextView = this.r;
          if (appCompatTextView != null) {
            drawable1.setColorFilter((ColorFilter)y6.c(appCompatTextView.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
            return;
          } 
        } 
        drawable1.clearColorFilter();
        this.g.refreshDrawableState();
      } 
    } 
  }
  
  public final void u() {
    EditText editText = this.g;
    if (editText != null && this.I != null && (this.L || editText.getBackground() == null) && this.R != 0) {
      Drawable drawable = getEditTextBoxBackground();
      this.g.setBackground(drawable);
      this.L = true;
    } 
  }
  
  public final void v() {
    if (this.R != 1) {
      FrameLayout frameLayout = this.b;
      LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams)frameLayout.getLayoutParams();
      int i = e();
      if (i != layoutParams.topMargin) {
        layoutParams.topMargin = i;
        frameLayout.requestLayout();
      } 
    } 
  }
  
  public final void w(boolean paramBoolean1, boolean paramBoolean2) {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual isEnabled : ()Z
    //   4: istore #7
    //   6: aload_0
    //   7: getfield g : Landroid/widget/EditText;
    //   10: astore #8
    //   12: aload #8
    //   14: ifnull -> 33
    //   17: aload #8
    //   19: invokevirtual getText : ()Landroid/text/Editable;
    //   22: invokestatic isEmpty : (Ljava/lang/CharSequence;)Z
    //   25: ifne -> 33
    //   28: iconst_1
    //   29: istore_3
    //   30: goto -> 35
    //   33: iconst_0
    //   34: istore_3
    //   35: aload_0
    //   36: getfield g : Landroid/widget/EditText;
    //   39: astore #8
    //   41: aload #8
    //   43: ifnull -> 60
    //   46: aload #8
    //   48: invokevirtual hasFocus : ()Z
    //   51: ifeq -> 60
    //   54: iconst_1
    //   55: istore #4
    //   57: goto -> 63
    //   60: iconst_0
    //   61: istore #4
    //   63: aload_0
    //   64: getfield l0 : Landroid/content/res/ColorStateList;
    //   67: astore #8
    //   69: aload_0
    //   70: getfield y0 : Lhm;
    //   73: astore #10
    //   75: aload #8
    //   77: ifnull -> 87
    //   80: aload #10
    //   82: aload #8
    //   84: invokevirtual n : (Landroid/content/res/ColorStateList;)V
    //   87: aconst_null
    //   88: astore #9
    //   90: iload #7
    //   92: ifne -> 147
    //   95: aload_0
    //   96: getfield l0 : Landroid/content/res/ColorStateList;
    //   99: astore #8
    //   101: aload_0
    //   102: getfield v0 : I
    //   105: istore #6
    //   107: iload #6
    //   109: istore #5
    //   111: aload #8
    //   113: ifnull -> 134
    //   116: aload #8
    //   118: iconst_1
    //   119: newarray int
    //   121: dup
    //   122: iconst_0
    //   123: ldc_w -16842910
    //   126: iastore
    //   127: iload #6
    //   129: invokevirtual getColorForState : ([II)I
    //   132: istore #5
    //   134: aload #10
    //   136: iload #5
    //   138: invokestatic valueOf : (I)Landroid/content/res/ColorStateList;
    //   141: invokevirtual n : (Landroid/content/res/ColorStateList;)V
    //   144: goto -> 245
    //   147: aload_0
    //   148: invokevirtual o : ()Z
    //   151: ifeq -> 191
    //   154: aload_0
    //   155: getfield m : Lxh0;
    //   158: getfield r : Landroidx/appcompat/widget/AppCompatTextView;
    //   161: astore #8
    //   163: aload #8
    //   165: ifnull -> 178
    //   168: aload #8
    //   170: invokevirtual getTextColors : ()Landroid/content/res/ColorStateList;
    //   173: astore #8
    //   175: goto -> 181
    //   178: aconst_null
    //   179: astore #8
    //   181: aload #10
    //   183: aload #8
    //   185: invokevirtual n : (Landroid/content/res/ColorStateList;)V
    //   188: goto -> 245
    //   191: aload_0
    //   192: getfield p : Z
    //   195: ifeq -> 222
    //   198: aload_0
    //   199: getfield r : Landroidx/appcompat/widget/AppCompatTextView;
    //   202: astore #8
    //   204: aload #8
    //   206: ifnull -> 222
    //   209: aload #10
    //   211: aload #8
    //   213: invokevirtual getTextColors : ()Landroid/content/res/ColorStateList;
    //   216: invokevirtual n : (Landroid/content/res/ColorStateList;)V
    //   219: goto -> 245
    //   222: iload #4
    //   224: ifeq -> 245
    //   227: aload_0
    //   228: getfield m0 : Landroid/content/res/ColorStateList;
    //   231: astore #8
    //   233: aload #8
    //   235: ifnull -> 245
    //   238: aload #10
    //   240: aload #8
    //   242: invokevirtual r : (Landroid/content/res/ColorStateList;)V
    //   245: aload_0
    //   246: getfield e : Ln40;
    //   249: astore #11
    //   251: aload_0
    //   252: getfield c : Lep1;
    //   255: astore #12
    //   257: iload_3
    //   258: ifne -> 463
    //   261: aload_0
    //   262: getfield z0 : Z
    //   265: ifeq -> 463
    //   268: aload_0
    //   269: invokevirtual isEnabled : ()Z
    //   272: ifeq -> 283
    //   275: iload #4
    //   277: ifeq -> 283
    //   280: goto -> 463
    //   283: iload_2
    //   284: ifne -> 294
    //   287: aload_0
    //   288: getfield x0 : Z
    //   291: ifne -> 477
    //   294: aload_0
    //   295: getfield B0 : Landroid/animation/ValueAnimator;
    //   298: astore #8
    //   300: aload #8
    //   302: ifnull -> 320
    //   305: aload #8
    //   307: invokevirtual isRunning : ()Z
    //   310: ifeq -> 320
    //   313: aload_0
    //   314: getfield B0 : Landroid/animation/ValueAnimator;
    //   317: invokevirtual cancel : ()V
    //   320: iload_1
    //   321: ifeq -> 339
    //   324: aload_0
    //   325: getfield A0 : Z
    //   328: ifeq -> 339
    //   331: aload_0
    //   332: fconst_0
    //   333: invokevirtual b : (F)V
    //   336: goto -> 345
    //   339: aload #10
    //   341: fconst_0
    //   342: invokevirtual A : (F)V
    //   345: aload_0
    //   346: invokevirtual g : ()Z
    //   349: ifeq -> 392
    //   352: aload_0
    //   353: getfield I : Lws0;
    //   356: checkcast tt
    //   359: getfield J : Lrt;
    //   362: getfield s : Landroid/graphics/RectF;
    //   365: invokevirtual isEmpty : ()Z
    //   368: ifne -> 392
    //   371: aload_0
    //   372: invokevirtual g : ()Z
    //   375: ifeq -> 392
    //   378: aload_0
    //   379: getfield I : Lws0;
    //   382: checkcast tt
    //   385: fconst_0
    //   386: fconst_0
    //   387: fconst_0
    //   388: fconst_0
    //   389: invokevirtual z : (FFFF)V
    //   392: aload_0
    //   393: iconst_1
    //   394: putfield x0 : Z
    //   397: aload_0
    //   398: getfield w : Landroidx/appcompat/widget/AppCompatTextView;
    //   401: astore #8
    //   403: aload #8
    //   405: ifnull -> 440
    //   408: aload_0
    //   409: getfield v : Z
    //   412: ifeq -> 440
    //   415: aload #8
    //   417: aconst_null
    //   418: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   421: aload_0
    //   422: getfield b : Landroid/widget/FrameLayout;
    //   425: aload_0
    //   426: getfield A : Ll70;
    //   429: invokestatic a : (Landroid/widget/FrameLayout;Lkw1;)V
    //   432: aload_0
    //   433: getfield w : Landroidx/appcompat/widget/AppCompatTextView;
    //   436: iconst_4
    //   437: invokevirtual setVisibility : (I)V
    //   440: aload #12
    //   442: iconst_1
    //   443: putfield l : Z
    //   446: aload #12
    //   448: invokevirtual e : ()V
    //   451: aload #11
    //   453: iconst_1
    //   454: putfield t : Z
    //   457: aload #11
    //   459: invokevirtual m : ()V
    //   462: return
    //   463: iload_2
    //   464: ifne -> 478
    //   467: aload_0
    //   468: getfield x0 : Z
    //   471: ifeq -> 477
    //   474: goto -> 478
    //   477: return
    //   478: aload_0
    //   479: getfield B0 : Landroid/animation/ValueAnimator;
    //   482: astore #8
    //   484: aload #8
    //   486: ifnull -> 504
    //   489: aload #8
    //   491: invokevirtual isRunning : ()Z
    //   494: ifeq -> 504
    //   497: aload_0
    //   498: getfield B0 : Landroid/animation/ValueAnimator;
    //   501: invokevirtual cancel : ()V
    //   504: iload_1
    //   505: ifeq -> 523
    //   508: aload_0
    //   509: getfield A0 : Z
    //   512: ifeq -> 523
    //   515: aload_0
    //   516: fconst_1
    //   517: invokevirtual b : (F)V
    //   520: goto -> 529
    //   523: aload #10
    //   525: fconst_1
    //   526: invokevirtual A : (F)V
    //   529: aload_0
    //   530: iconst_0
    //   531: putfield x0 : Z
    //   534: aload_0
    //   535: invokevirtual g : ()Z
    //   538: ifeq -> 545
    //   541: aload_0
    //   542: invokevirtual l : ()V
    //   545: aload_0
    //   546: getfield g : Landroid/widget/EditText;
    //   549: astore #8
    //   551: aload #8
    //   553: ifnonnull -> 563
    //   556: aload #9
    //   558: astore #8
    //   560: goto -> 570
    //   563: aload #8
    //   565: invokevirtual getText : ()Landroid/text/Editable;
    //   568: astore #8
    //   570: aload_0
    //   571: aload #8
    //   573: invokevirtual x : (Landroid/text/Editable;)V
    //   576: aload #12
    //   578: iconst_0
    //   579: putfield l : Z
    //   582: aload #12
    //   584: invokevirtual e : ()V
    //   587: aload #11
    //   589: iconst_0
    //   590: putfield t : Z
    //   593: aload #11
    //   595: invokevirtual m : ()V
    //   598: return
  }
  
  public final void x(Editable paramEditable) {
    boolean bool;
    ((k91)this.q).getClass();
    if (paramEditable != null) {
      bool = paramEditable.length();
    } else {
      bool = false;
    } 
    FrameLayout frameLayout = this.b;
    if (!bool && !this.x0) {
      if (this.w != null && this.v && !TextUtils.isEmpty(this.u)) {
        this.w.setText(this.u);
        ow1.a(frameLayout, (kw1)this.z);
        this.w.setVisibility(0);
        this.w.bringToFront();
        return;
      } 
    } else {
      AppCompatTextView appCompatTextView = this.w;
      if (appCompatTextView != null && this.v) {
        appCompatTextView.setText(null);
        ow1.a(frameLayout, (kw1)this.A);
        this.w.setVisibility(4);
      } 
    } 
  }
  
  public final void y(boolean paramBoolean1, boolean paramBoolean2) {
    int i = this.q0.getDefaultColor();
    int j = this.q0.getColorForState(new int[] { 16843623, 16842910 }, i);
    int k = this.q0.getColorForState(new int[] { 16843518, 16842910 }, i);
    if (paramBoolean1) {
      this.W = k;
      return;
    } 
    if (paramBoolean2) {
      this.W = j;
      return;
    } 
    this.W = i;
  }
  
  public final void z() {
    // Byte code:
    //   0: aload_0
    //   1: getfield I : Lws0;
    //   4: ifnull -> 559
    //   7: aload_0
    //   8: getfield R : I
    //   11: ifne -> 17
    //   14: goto -> 559
    //   17: aload_0
    //   18: invokevirtual isFocused : ()Z
    //   21: istore_2
    //   22: iconst_0
    //   23: istore #4
    //   25: iload_2
    //   26: ifne -> 56
    //   29: aload_0
    //   30: getfield g : Landroid/widget/EditText;
    //   33: astore #5
    //   35: aload #5
    //   37: ifnull -> 51
    //   40: aload #5
    //   42: invokevirtual hasFocus : ()Z
    //   45: ifeq -> 51
    //   48: goto -> 56
    //   51: iconst_0
    //   52: istore_2
    //   53: goto -> 58
    //   56: iconst_1
    //   57: istore_2
    //   58: aload_0
    //   59: invokevirtual isHovered : ()Z
    //   62: ifne -> 90
    //   65: aload_0
    //   66: getfield g : Landroid/widget/EditText;
    //   69: astore #5
    //   71: iload #4
    //   73: istore_3
    //   74: aload #5
    //   76: ifnull -> 92
    //   79: iload #4
    //   81: istore_3
    //   82: aload #5
    //   84: invokevirtual isHovered : ()Z
    //   87: ifeq -> 92
    //   90: iconst_1
    //   91: istore_3
    //   92: aload_0
    //   93: invokevirtual isEnabled : ()Z
    //   96: ifne -> 110
    //   99: aload_0
    //   100: aload_0
    //   101: getfield v0 : I
    //   104: putfield W : I
    //   107: goto -> 228
    //   110: aload_0
    //   111: invokevirtual o : ()Z
    //   114: ifeq -> 144
    //   117: aload_0
    //   118: getfield q0 : Landroid/content/res/ColorStateList;
    //   121: ifnull -> 133
    //   124: aload_0
    //   125: iload_2
    //   126: iload_3
    //   127: invokevirtual y : (ZZ)V
    //   130: goto -> 228
    //   133: aload_0
    //   134: aload_0
    //   135: invokevirtual getErrorCurrentTextColors : ()I
    //   138: putfield W : I
    //   141: goto -> 228
    //   144: aload_0
    //   145: getfield p : Z
    //   148: ifeq -> 190
    //   151: aload_0
    //   152: getfield r : Landroidx/appcompat/widget/AppCompatTextView;
    //   155: astore #5
    //   157: aload #5
    //   159: ifnull -> 190
    //   162: aload_0
    //   163: getfield q0 : Landroid/content/res/ColorStateList;
    //   166: ifnull -> 178
    //   169: aload_0
    //   170: iload_2
    //   171: iload_3
    //   172: invokevirtual y : (ZZ)V
    //   175: goto -> 228
    //   178: aload_0
    //   179: aload #5
    //   181: invokevirtual getCurrentTextColor : ()I
    //   184: putfield W : I
    //   187: goto -> 228
    //   190: iload_2
    //   191: ifeq -> 205
    //   194: aload_0
    //   195: aload_0
    //   196: getfield p0 : I
    //   199: putfield W : I
    //   202: goto -> 228
    //   205: iload_3
    //   206: ifeq -> 220
    //   209: aload_0
    //   210: aload_0
    //   211: getfield o0 : I
    //   214: putfield W : I
    //   217: goto -> 228
    //   220: aload_0
    //   221: aload_0
    //   222: getfield n0 : I
    //   225: putfield W : I
    //   228: getstatic android/os/Build$VERSION.SDK_INT : I
    //   231: bipush #29
    //   233: if_icmplt -> 240
    //   236: aload_0
    //   237: invokevirtual r : ()V
    //   240: aload_0
    //   241: getfield e : Ln40;
    //   244: astore #8
    //   246: aload #8
    //   248: getfield b : Lcom/google/android/material/textfield/TextInputLayout;
    //   251: astore #6
    //   253: aload #8
    //   255: getfield i : Lcom/google/android/material/internal/CheckableImageButton;
    //   258: astore #5
    //   260: aload #8
    //   262: getfield b : Lcom/google/android/material/textfield/TextInputLayout;
    //   265: astore #7
    //   267: aload #8
    //   269: invokevirtual k : ()V
    //   272: aload #7
    //   274: aload #8
    //   276: getfield e : Lcom/google/android/material/internal/CheckableImageButton;
    //   279: aload #8
    //   281: getfield f : Landroid/content/res/ColorStateList;
    //   284: invokestatic O : (Lcom/google/android/material/textfield/TextInputLayout;Lcom/google/android/material/internal/CheckableImageButton;Landroid/content/res/ColorStateList;)V
    //   287: aload #7
    //   289: aload #5
    //   291: aload #8
    //   293: getfield m : Landroid/content/res/ColorStateList;
    //   296: invokestatic O : (Lcom/google/android/material/textfield/TextInputLayout;Lcom/google/android/material/internal/CheckableImageButton;Landroid/content/res/ColorStateList;)V
    //   299: aload #8
    //   301: invokevirtual a : ()Lo40;
    //   304: instanceof c20
    //   307: ifeq -> 373
    //   310: aload #6
    //   312: invokevirtual o : ()Z
    //   315: ifeq -> 356
    //   318: aload #5
    //   320: invokevirtual getDrawable : ()Landroid/graphics/drawable/Drawable;
    //   323: ifnull -> 356
    //   326: aload #5
    //   328: invokevirtual getDrawable : ()Landroid/graphics/drawable/Drawable;
    //   331: invokevirtual mutate : ()Landroid/graphics/drawable/Drawable;
    //   334: astore #7
    //   336: aload #7
    //   338: aload #6
    //   340: invokevirtual getErrorCurrentTextColors : ()I
    //   343: invokevirtual setTint : (I)V
    //   346: aload #5
    //   348: aload #7
    //   350: invokevirtual setImageDrawable : (Landroid/graphics/drawable/Drawable;)V
    //   353: goto -> 373
    //   356: aload #6
    //   358: aload #5
    //   360: aload #8
    //   362: getfield m : Landroid/content/res/ColorStateList;
    //   365: aload #8
    //   367: getfield n : Landroid/graphics/PorterDuff$Mode;
    //   370: invokestatic c : (Lcom/google/android/material/textfield/TextInputLayout;Lcom/google/android/material/internal/CheckableImageButton;Landroid/content/res/ColorStateList;Landroid/graphics/PorterDuff$Mode;)V
    //   373: aload_0
    //   374: getfield c : Lep1;
    //   377: astore #5
    //   379: aload #5
    //   381: getfield b : Lcom/google/android/material/textfield/TextInputLayout;
    //   384: aload #5
    //   386: getfield f : Lcom/google/android/material/internal/CheckableImageButton;
    //   389: aload #5
    //   391: getfield g : Landroid/content/res/ColorStateList;
    //   394: invokestatic O : (Lcom/google/android/material/textfield/TextInputLayout;Lcom/google/android/material/internal/CheckableImageButton;Landroid/content/res/ColorStateList;)V
    //   397: aload_0
    //   398: getfield R : I
    //   401: iconst_2
    //   402: if_icmpne -> 487
    //   405: aload_0
    //   406: getfield T : I
    //   409: istore_1
    //   410: iload_2
    //   411: ifeq -> 432
    //   414: aload_0
    //   415: invokevirtual isEnabled : ()Z
    //   418: ifeq -> 432
    //   421: aload_0
    //   422: aload_0
    //   423: getfield V : I
    //   426: putfield T : I
    //   429: goto -> 440
    //   432: aload_0
    //   433: aload_0
    //   434: getfield U : I
    //   437: putfield T : I
    //   440: aload_0
    //   441: getfield T : I
    //   444: iload_1
    //   445: if_icmpeq -> 487
    //   448: aload_0
    //   449: invokevirtual g : ()Z
    //   452: ifeq -> 487
    //   455: aload_0
    //   456: getfield x0 : Z
    //   459: ifne -> 487
    //   462: aload_0
    //   463: invokevirtual g : ()Z
    //   466: ifeq -> 483
    //   469: aload_0
    //   470: getfield I : Lws0;
    //   473: checkcast tt
    //   476: fconst_0
    //   477: fconst_0
    //   478: fconst_0
    //   479: fconst_0
    //   480: invokevirtual z : (FFFF)V
    //   483: aload_0
    //   484: invokevirtual l : ()V
    //   487: aload_0
    //   488: getfield R : I
    //   491: iconst_1
    //   492: if_icmpne -> 555
    //   495: aload_0
    //   496: invokevirtual isEnabled : ()Z
    //   499: ifne -> 513
    //   502: aload_0
    //   503: aload_0
    //   504: getfield s0 : I
    //   507: putfield a0 : I
    //   510: goto -> 555
    //   513: iload_3
    //   514: ifeq -> 532
    //   517: iload_2
    //   518: ifne -> 532
    //   521: aload_0
    //   522: aload_0
    //   523: getfield u0 : I
    //   526: putfield a0 : I
    //   529: goto -> 555
    //   532: iload_2
    //   533: ifeq -> 547
    //   536: aload_0
    //   537: aload_0
    //   538: getfield t0 : I
    //   541: putfield a0 : I
    //   544: goto -> 555
    //   547: aload_0
    //   548: aload_0
    //   549: getfield r0 : I
    //   552: putfield a0 : I
    //   555: aload_0
    //   556: invokevirtual c : ()V
    //   559: return
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\com\google\android\material\textfield\TextInputLayout.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
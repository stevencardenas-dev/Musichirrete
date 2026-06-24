package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import bx0;
import d42;
import g;
import hx0;
import i1;
import jx0;
import nc1;
import r1;
import rw0;
import tp;
import u1;
import u32;
import v22;
import w32;
import y1;

public class ActionBarContextView extends ViewGroup {
  public final g b;
  
  public final Context c;
  
  public ActionMenuView e;
  
  public u1 f;
  
  public int g;
  
  public u32 h;
  
  public boolean i;
  
  public boolean j;
  
  public CharSequence k;
  
  public CharSequence l;
  
  public View m;
  
  public View n;
  
  public View o;
  
  public LinearLayout p;
  
  public TextView q;
  
  public TextView r;
  
  public final int s;
  
  public final int t;
  
  public boolean u;
  
  public final int v;
  
  public ActionBarContextView(Context paramContext) {
    this(paramContext, null);
  }
  
  public ActionBarContextView(Context paramContext, AttributeSet paramAttributeSet) {
    this(paramContext, paramAttributeSet, 2130968606);
  }
  
  public ActionBarContextView(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: aload_2
    //   3: iload_3
    //   4: invokespecial <init> : (Landroid/content/Context;Landroid/util/AttributeSet;I)V
    //   7: aload_0
    //   8: new g
    //   11: dup
    //   12: aload_0
    //   13: invokespecial <init> : (Landroidx/appcompat/widget/ActionBarContextView;)V
    //   16: putfield b : Lg;
    //   19: new android/util/TypedValue
    //   22: dup
    //   23: invokespecial <init> : ()V
    //   26: astore #4
    //   28: aload_1
    //   29: invokevirtual getTheme : ()Landroid/content/res/Resources$Theme;
    //   32: ldc 2130968580
    //   34: aload #4
    //   36: iconst_1
    //   37: invokevirtual resolveAttribute : (ILandroid/util/TypedValue;Z)Z
    //   40: ifeq -> 71
    //   43: aload #4
    //   45: getfield resourceId : I
    //   48: ifeq -> 71
    //   51: aload_0
    //   52: new android/view/ContextThemeWrapper
    //   55: dup
    //   56: aload_1
    //   57: aload #4
    //   59: getfield resourceId : I
    //   62: invokespecial <init> : (Landroid/content/Context;I)V
    //   65: putfield c : Landroid/content/Context;
    //   68: goto -> 76
    //   71: aload_0
    //   72: aload_1
    //   73: putfield c : Landroid/content/Context;
    //   76: aload_1
    //   77: aload_2
    //   78: getstatic nc1.d : [I
    //   81: iload_3
    //   82: iconst_0
    //   83: invokevirtual obtainStyledAttributes : (Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;
    //   86: astore_2
    //   87: aload_2
    //   88: iconst_0
    //   89: invokevirtual hasValue : (I)Z
    //   92: ifeq -> 115
    //   95: aload_2
    //   96: iconst_0
    //   97: iconst_0
    //   98: invokevirtual getResourceId : (II)I
    //   101: istore_3
    //   102: iload_3
    //   103: ifeq -> 115
    //   106: aload_1
    //   107: iload_3
    //   108: invokestatic I : (Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;
    //   111: astore_1
    //   112: goto -> 121
    //   115: aload_2
    //   116: iconst_0
    //   117: invokevirtual getDrawable : (I)Landroid/graphics/drawable/Drawable;
    //   120: astore_1
    //   121: aload_0
    //   122: aload_1
    //   123: invokevirtual setBackground : (Landroid/graphics/drawable/Drawable;)V
    //   126: aload_0
    //   127: aload_2
    //   128: iconst_5
    //   129: iconst_0
    //   130: invokevirtual getResourceId : (II)I
    //   133: putfield s : I
    //   136: aload_0
    //   137: aload_2
    //   138: iconst_4
    //   139: iconst_0
    //   140: invokevirtual getResourceId : (II)I
    //   143: putfield t : I
    //   146: aload_0
    //   147: aload_2
    //   148: iconst_3
    //   149: iconst_0
    //   150: invokevirtual getLayoutDimension : (II)I
    //   153: putfield g : I
    //   156: aload_0
    //   157: aload_2
    //   158: iconst_2
    //   159: ldc 2131492869
    //   161: invokevirtual getResourceId : (II)I
    //   164: putfield v : I
    //   167: aload_2
    //   168: invokevirtual recycle : ()V
    //   171: return
  }
  
  public static int f(View paramView, int paramInt1, int paramInt2) {
    paramView.measure(View.MeasureSpec.makeMeasureSpec(paramInt1, -2147483648), paramInt2);
    return Math.max(0, paramInt1 - paramView.getMeasuredWidth());
  }
  
  public static int g(int paramInt1, int paramInt2, int paramInt3, View paramView, boolean paramBoolean) {
    int j = paramView.getMeasuredWidth();
    int i = paramView.getMeasuredHeight();
    paramInt2 = (paramInt3 - i) / 2 + paramInt2;
    if (paramBoolean) {
      paramView.layout(paramInt1 - j, paramInt2, paramInt1, i + paramInt2);
    } else {
      paramView.layout(paramInt1, paramInt2, paramInt1 + j, i + paramInt2);
    } 
    return paramBoolean ? -j : j;
  }
  
  public final void c(y1 paramy1) {
    View view = this.m;
    if (view == null) {
      view = LayoutInflater.from(getContext()).inflate(this.v, this, false);
      this.m = view;
      addView(view);
    } else if (view.getParent() == null) {
      addView(this.m);
    } 
    view = this.m.findViewById(2131296326);
    this.n = view;
    view.setOnClickListener((View.OnClickListener)new i1(0, paramy1));
    rw0 rw0 = paramy1.d();
    u1 u11 = this.f;
    if (u11 != null) {
      u11.d();
      r1 r1 = u11.v;
      if (r1 != null && r1.b())
        ((bx0)r1).i.dismiss(); 
    } 
    u11 = new u1(getContext());
    this.f = u11;
    u11.n = true;
    u11.o = true;
    ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
    rw0.b((hx0)this.f, this.c);
    u1 u12 = this.f;
    jx0 jx01 = u12.j;
    if (jx01 == null) {
      jx0 jx0 = (jx0)u12.f.inflate(u12.h, this, false);
      u12.j = jx0;
      jx0.initialize(u12.e);
      u12.g();
    } 
    jx0 jx02 = u12.j;
    if (jx01 != jx02)
      ((ActionMenuView)jx02).setPresenter(u12); 
    jx01 = jx02;
    this.e = (ActionMenuView)jx01;
    jx01.setBackground(null);
    addView((View)this.e, layoutParams);
  }
  
  public final void d() {
    // Byte code:
    //   0: aload_0
    //   1: getfield p : Landroid/widget/LinearLayout;
    //   4: ifnonnull -> 117
    //   7: aload_0
    //   8: invokevirtual getContext : ()Landroid/content/Context;
    //   11: invokestatic from : (Landroid/content/Context;)Landroid/view/LayoutInflater;
    //   14: ldc_w 2131492864
    //   17: aload_0
    //   18: invokevirtual inflate : (ILandroid/view/ViewGroup;)Landroid/view/View;
    //   21: pop
    //   22: aload_0
    //   23: aload_0
    //   24: invokevirtual getChildCount : ()I
    //   27: iconst_1
    //   28: isub
    //   29: invokevirtual getChildAt : (I)Landroid/view/View;
    //   32: checkcast android/widget/LinearLayout
    //   35: astore #5
    //   37: aload_0
    //   38: aload #5
    //   40: putfield p : Landroid/widget/LinearLayout;
    //   43: aload_0
    //   44: aload #5
    //   46: ldc_w 2131296317
    //   49: invokevirtual findViewById : (I)Landroid/view/View;
    //   52: checkcast android/widget/TextView
    //   55: putfield q : Landroid/widget/TextView;
    //   58: aload_0
    //   59: aload_0
    //   60: getfield p : Landroid/widget/LinearLayout;
    //   63: ldc_w 2131296316
    //   66: invokevirtual findViewById : (I)Landroid/view/View;
    //   69: checkcast android/widget/TextView
    //   72: putfield r : Landroid/widget/TextView;
    //   75: aload_0
    //   76: getfield s : I
    //   79: istore_1
    //   80: iload_1
    //   81: ifeq -> 96
    //   84: aload_0
    //   85: getfield q : Landroid/widget/TextView;
    //   88: aload_0
    //   89: invokevirtual getContext : ()Landroid/content/Context;
    //   92: iload_1
    //   93: invokevirtual setTextAppearance : (Landroid/content/Context;I)V
    //   96: aload_0
    //   97: getfield t : I
    //   100: istore_1
    //   101: iload_1
    //   102: ifeq -> 117
    //   105: aload_0
    //   106: getfield r : Landroid/widget/TextView;
    //   109: aload_0
    //   110: invokevirtual getContext : ()Landroid/content/Context;
    //   113: iload_1
    //   114: invokevirtual setTextAppearance : (Landroid/content/Context;I)V
    //   117: aload_0
    //   118: getfield q : Landroid/widget/TextView;
    //   121: aload_0
    //   122: getfield k : Ljava/lang/CharSequence;
    //   125: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   128: aload_0
    //   129: getfield r : Landroid/widget/TextView;
    //   132: aload_0
    //   133: getfield l : Ljava/lang/CharSequence;
    //   136: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   139: aload_0
    //   140: getfield k : Ljava/lang/CharSequence;
    //   143: invokestatic isEmpty : (Ljava/lang/CharSequence;)Z
    //   146: istore_3
    //   147: aload_0
    //   148: getfield l : Ljava/lang/CharSequence;
    //   151: invokestatic isEmpty : (Ljava/lang/CharSequence;)Z
    //   154: istore #4
    //   156: aload_0
    //   157: getfield r : Landroid/widget/TextView;
    //   160: astore #5
    //   162: bipush #8
    //   164: istore_2
    //   165: iload #4
    //   167: ifne -> 175
    //   170: iconst_0
    //   171: istore_1
    //   172: goto -> 178
    //   175: bipush #8
    //   177: istore_1
    //   178: aload #5
    //   180: iload_1
    //   181: invokevirtual setVisibility : (I)V
    //   184: aload_0
    //   185: getfield p : Landroid/widget/LinearLayout;
    //   188: astore #5
    //   190: iload_3
    //   191: ifeq -> 201
    //   194: iload_2
    //   195: istore_1
    //   196: iload #4
    //   198: ifne -> 203
    //   201: iconst_0
    //   202: istore_1
    //   203: aload #5
    //   205: iload_1
    //   206: invokevirtual setVisibility : (I)V
    //   209: aload_0
    //   210: getfield p : Landroid/widget/LinearLayout;
    //   213: invokevirtual getParent : ()Landroid/view/ViewParent;
    //   216: ifnonnull -> 227
    //   219: aload_0
    //   220: aload_0
    //   221: getfield p : Landroid/widget/LinearLayout;
    //   224: invokevirtual addView : (Landroid/view/View;)V
    //   227: return
  }
  
  public final void e() {
    removeAllViews();
    this.o = null;
    this.e = null;
    this.f = null;
    View view = this.n;
    if (view != null)
      view.setOnClickListener(null); 
  }
  
  public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
    return (ViewGroup.LayoutParams)new ViewGroup.MarginLayoutParams(-1, -2);
  }
  
  public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet paramAttributeSet) {
    return (ViewGroup.LayoutParams)new ViewGroup.MarginLayoutParams(getContext(), paramAttributeSet);
  }
  
  public int getAnimatedVisibility() {
    return (this.h != null) ? this.b.b : getVisibility();
  }
  
  public int getContentHeight() {
    return this.g;
  }
  
  public CharSequence getSubtitle() {
    return this.l;
  }
  
  public CharSequence getTitle() {
    return this.k;
  }
  
  public final void h(int paramInt) {
    if (paramInt != getVisibility()) {
      u32 u321 = this.h;
      if (u321 != null)
        u321.b(); 
      super.setVisibility(paramInt);
    } 
  }
  
  public final u32 i(int paramInt, long paramLong) {
    u32 u321 = this.h;
    if (u321 != null)
      u321.b(); 
    g g1 = this.b;
    if (paramInt == 0) {
      if (getVisibility() != 0)
        setAlpha(0.0F); 
      u32 u323 = v22.a((View)this);
      u323.a(1.0F);
      u323.c(paramLong);
      ((ActionBarContextView)g1.c).h = u323;
      g1.b = paramInt;
      u323.d((w32)g1);
      return u323;
    } 
    u32 u322 = v22.a((View)this);
    u322.a(0.0F);
    u322.c(paramLong);
    ((ActionBarContextView)g1.c).h = u322;
    g1.b = paramInt;
    u322.d((w32)g1);
    return u322;
  }
  
  public final void onConfigurationChanged(Configuration paramConfiguration) {
    super.onConfigurationChanged(paramConfiguration);
    TypedArray typedArray = getContext().obtainStyledAttributes(null, nc1.a, 2130968583, 0);
    setContentHeight(typedArray.getLayoutDimension(13, 0));
    typedArray.recycle();
    u1 u11 = this.f;
    if (u11 != null) {
      Configuration configuration = u11.c.getResources().getConfiguration();
      int i = configuration.screenWidthDp;
      int j = configuration.screenHeightDp;
      if (configuration.smallestScreenWidthDp > 600 || i > 600 || (i > 960 && j > 720) || (i > 720 && j > 960)) {
        i = 5;
      } else if (i >= 500 || (i > 640 && j > 480) || (i > 480 && j > 640)) {
        i = 4;
      } else if (i >= 360) {
        i = 3;
      } else {
        i = 2;
      } 
      u11.r = i;
      rw0 rw0 = u11.e;
      if (rw0 != null)
        rw0.p(true); 
    } 
  }
  
  public final void onDetachedFromWindow() {
    super.onDetachedFromWindow();
    u1 u11 = this.f;
    if (u11 != null) {
      u11.d();
      r1 r1 = this.f.v;
      if (r1 != null && r1.b())
        ((bx0)r1).i.dismiss(); 
    } 
  }
  
  public final boolean onHoverEvent(MotionEvent paramMotionEvent) {
    int i = paramMotionEvent.getActionMasked();
    if (i == 9)
      this.j = false; 
    if (!this.j) {
      boolean bool = super.onHoverEvent(paramMotionEvent);
      if (i == 9 && !bool)
        this.j = true; 
    } 
    if (i == 10 || i == 3) {
      this.j = false;
      return true;
    } 
    return true;
  }
  
  public final void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    int i;
    paramBoolean = d42.a;
    if (getLayoutDirection() == 1) {
      paramBoolean = true;
    } else {
      paramBoolean = false;
    } 
    if (paramBoolean) {
      i = paramInt3 - paramInt1 - getPaddingRight();
    } else {
      i = getPaddingLeft();
    } 
    int j = getPaddingTop();
    int k = paramInt4 - paramInt2 - getPaddingTop() - getPaddingBottom();
    View view2 = this.m;
    paramInt2 = i;
    if (view2 != null) {
      paramInt2 = i;
      if (view2.getVisibility() != 8) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams)this.m.getLayoutParams();
        if (paramBoolean) {
          paramInt4 = marginLayoutParams.rightMargin;
        } else {
          paramInt4 = marginLayoutParams.leftMargin;
        } 
        if (paramBoolean) {
          paramInt2 = marginLayoutParams.leftMargin;
        } else {
          paramInt2 = marginLayoutParams.rightMargin;
        } 
        if (paramBoolean) {
          paramInt4 = i - paramInt4;
        } else {
          paramInt4 = i + paramInt4;
        } 
        paramInt4 = g(paramInt4, j, k, this.m, paramBoolean) + paramInt4;
        if (paramBoolean) {
          paramInt2 = paramInt4 - paramInt2;
        } else {
          paramInt2 = paramInt4 + paramInt2;
        } 
      } 
    } 
    LinearLayout linearLayout = this.p;
    paramInt4 = paramInt2;
    if (linearLayout != null) {
      paramInt4 = paramInt2;
      if (this.o == null) {
        paramInt4 = paramInt2;
        if (linearLayout.getVisibility() != 8)
          paramInt4 = paramInt2 + g(paramInt2, j, k, (View)this.p, paramBoolean); 
      } 
    } 
    View view1 = this.o;
    if (view1 != null)
      g(paramInt4, j, k, view1, paramBoolean); 
    if (paramBoolean) {
      paramInt1 = getPaddingLeft();
    } else {
      paramInt1 = paramInt3 - paramInt1 - getPaddingRight();
    } 
    ActionMenuView actionMenuView = this.e;
    if (actionMenuView != null)
      g(paramInt1, j, k, (View)actionMenuView, paramBoolean ^ true); 
  }
  
  public final void onMeasure(int paramInt1, int paramInt2) {
    int i = View.MeasureSpec.getMode(paramInt1);
    int j = 1073741824;
    if (i == 1073741824) {
      if (View.MeasureSpec.getMode(paramInt2) != 0) {
        int n = View.MeasureSpec.getSize(paramInt1);
        i = this.g;
        if (i <= 0)
          i = View.MeasureSpec.getSize(paramInt2); 
        paramInt1 = getPaddingTop();
        int i1 = getPaddingBottom() + paramInt1;
        paramInt1 = n - getPaddingLeft() - getPaddingRight();
        int m = i - i1;
        int k = View.MeasureSpec.makeMeasureSpec(m, -2147483648);
        View view2 = this.m;
        paramInt2 = paramInt1;
        if (view2 != null) {
          paramInt1 = f(view2, paramInt1, k);
          ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams)this.m.getLayoutParams();
          paramInt2 = paramInt1 - marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
        } 
        ActionMenuView actionMenuView = this.e;
        paramInt1 = paramInt2;
        if (actionMenuView != null) {
          paramInt1 = paramInt2;
          if (actionMenuView.getParent() == this)
            paramInt1 = f((View)this.e, paramInt2, k); 
        } 
        LinearLayout linearLayout = this.p;
        boolean bool = false;
        paramInt2 = paramInt1;
        if (linearLayout != null) {
          paramInt2 = paramInt1;
          if (this.o == null)
            if (this.u) {
              paramInt2 = View.MeasureSpec.makeMeasureSpec(0, 0);
              this.p.measure(paramInt2, k);
              int i2 = this.p.getMeasuredWidth();
              if (i2 <= paramInt1) {
                k = 1;
              } else {
                k = 0;
              } 
              paramInt2 = paramInt1;
              if (k != 0)
                paramInt2 = paramInt1 - i2; 
              linearLayout = this.p;
              if (k != 0) {
                paramInt1 = 0;
              } else {
                paramInt1 = 8;
              } 
              linearLayout.setVisibility(paramInt1);
            } else {
              paramInt2 = f((View)linearLayout, paramInt1, k);
            }  
        } 
        View view1 = this.o;
        if (view1 != null) {
          ViewGroup.LayoutParams layoutParams = view1.getLayoutParams();
          int i2 = layoutParams.width;
          if (i2 != -2) {
            paramInt1 = 1073741824;
          } else {
            paramInt1 = Integer.MIN_VALUE;
          } 
          k = paramInt2;
          if (i2 >= 0)
            k = Math.min(i2, paramInt2); 
          i2 = layoutParams.height;
          if (i2 != -2) {
            paramInt2 = j;
          } else {
            paramInt2 = Integer.MIN_VALUE;
          } 
          j = m;
          if (i2 >= 0)
            j = Math.min(i2, m); 
          this.o.measure(View.MeasureSpec.makeMeasureSpec(k, paramInt1), View.MeasureSpec.makeMeasureSpec(j, paramInt2));
        } 
        if (this.g <= 0) {
          j = getChildCount();
          paramInt2 = 0;
          paramInt1 = bool;
          while (paramInt1 < j) {
            k = getChildAt(paramInt1).getMeasuredHeight() + i1;
            i = paramInt2;
            if (k > paramInt2)
              i = k; 
            paramInt1++;
            paramInt2 = i;
          } 
          setMeasuredDimension(n, paramInt2);
          return;
        } 
        setMeasuredDimension(n, i);
        return;
      } 
      tp.f(getClass().getSimpleName().concat(" can only be used with android:layout_height=\"wrap_content\""));
      return;
    } 
    tp.f(getClass().getSimpleName().concat(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)"));
  }
  
  public final boolean onTouchEvent(MotionEvent paramMotionEvent) {
    int i = paramMotionEvent.getActionMasked();
    if (i == 0)
      this.i = false; 
    if (!this.i) {
      boolean bool = super.onTouchEvent(paramMotionEvent);
      if (i == 0 && !bool)
        this.i = true; 
    } 
    if (i == 1 || i == 3) {
      this.i = false;
      return true;
    } 
    return true;
  }
  
  public void setContentHeight(int paramInt) {
    this.g = paramInt;
  }
  
  public void setCustomView(View paramView) {
    View view = this.o;
    if (view != null)
      removeView(view); 
    this.o = paramView;
    if (paramView != null) {
      LinearLayout linearLayout = this.p;
      if (linearLayout != null) {
        removeView((View)linearLayout);
        this.p = null;
      } 
    } 
    if (paramView != null)
      addView(paramView); 
    requestLayout();
  }
  
  public void setSubtitle(CharSequence paramCharSequence) {
    this.l = paramCharSequence;
    d();
  }
  
  public void setTitle(CharSequence paramCharSequence) {
    this.k = paramCharSequence;
    d();
    v22.o((View)this, paramCharSequence);
  }
  
  public void setTitleOptional(boolean paramBoolean) {
    if (paramBoolean != this.u)
      requestLayout(); 
    this.u = paramBoolean;
  }
  
  public final boolean shouldDelayChildPressedState() {
    return false;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\androidx\appcompat\widget\ActionBarContextView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
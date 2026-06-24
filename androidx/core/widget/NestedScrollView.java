package androidx.core.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import bh0;
import h11;
import i11;
import j11;
import java.util.WeakHashMap;
import k0;
import k11;
import kj1;
import l11;
import m11;
import o11;
import p11;
import pz;
import qz;
import tp;
import v22;
import wf2;
import y20;

public class NestedScrollView extends FrameLayout implements o11, l11 {
  public static final float E = (float)(Math.log(0.78D) / Math.log(0.9D));
  
  public static final h11 F = new h11(0);
  
  public static final int[] G = new int[] { 16843130 };
  
  public final p11 A;
  
  public final m11 B;
  
  public float C;
  
  public final pz D;
  
  public final float b;
  
  public long c;
  
  public final Rect e;
  
  public final OverScroller f;
  
  public final EdgeEffect g;
  
  public final EdgeEffect h;
  
  public kj1 i;
  
  public int j;
  
  public boolean k;
  
  public boolean l;
  
  public View m;
  
  public boolean n;
  
  public VelocityTracker o;
  
  public boolean p;
  
  public boolean q;
  
  public final int r;
  
  public final int s;
  
  public final int t;
  
  public int u;
  
  public final int[] v;
  
  public final int[] w;
  
  public int x;
  
  public int y;
  
  public k11 z;
  
  public NestedScrollView(Context paramContext) {
    this(paramContext, null);
  }
  
  public NestedScrollView(Context paramContext, AttributeSet paramAttributeSet) {
    this(paramContext, paramAttributeSet, 2130969759);
  }
  
  public NestedScrollView(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(paramContext, paramAttributeSet, paramInt);
    EdgeEffect edgeEffect;
    this.e = new Rect();
    this.k = true;
    this.l = false;
    this.m = null;
    this.n = false;
    this.q = true;
    this.u = -1;
    this.v = new int[2];
    this.w = new int[2];
    bh0 bh0 = new bh0(16, this);
    this.D = new pz(getContext(), (qz)bh0);
    int i = Build.VERSION.SDK_INT;
    if (i >= 31) {
      edgeEffect = y20.a(paramContext, paramAttributeSet);
    } else {
      edgeEffect = new EdgeEffect(paramContext);
    } 
    this.g = edgeEffect;
    if (i >= 31) {
      edgeEffect = y20.a(paramContext, paramAttributeSet);
    } else {
      edgeEffect = new EdgeEffect(paramContext);
    } 
    this.h = edgeEffect;
    this.b = (paramContext.getResources().getDisplayMetrics()).density * 160.0F * 386.0878F * 0.84F;
    this.f = new OverScroller(getContext());
    setFocusable(true);
    setDescendantFocusability(262144);
    setWillNotDraw(false);
    ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
    this.r = viewConfiguration.getScaledTouchSlop();
    this.s = viewConfiguration.getScaledMinimumFlingVelocity();
    this.t = viewConfiguration.getScaledMaximumFlingVelocity();
    TypedArray typedArray = paramContext.obtainStyledAttributes(paramAttributeSet, G, paramInt, 0);
    setFillViewport(typedArray.getBoolean(0, false));
    typedArray.recycle();
    this.A = (p11)new Object();
    this.B = new m11((ViewGroup)this);
    setNestedScrollingEnabled(true);
    v22.n((View)this, (k0)F);
  }
  
  private kj1 getScrollFeedbackProvider() {
    if (this.i == null)
      this.i = new kj1(this); 
    return this.i;
  }
  
  public static boolean l(View paramView, NestedScrollView paramNestedScrollView) {
    if (paramView != paramNestedScrollView) {
      ViewParent viewParent = paramView.getParent();
      if (!(viewParent instanceof ViewGroup) || !l((View)viewParent, paramNestedScrollView))
        return false; 
    } 
    return true;
  }
  
  public final void a(View paramView1, View paramView2, int paramInt1, int paramInt2) {
    p11 p111 = this.A;
    if (paramInt2 == 1) {
      p111.b = paramInt1;
    } else {
      p111.a = paramInt1;
    } 
    this.B.g(2, paramInt2);
  }
  
  public final void addView(View paramView) {
    if (getChildCount() <= 0) {
      super.addView(paramView);
      return;
    } 
    tp.f("ScrollView can host only one direct child");
  }
  
  public final void addView(View paramView, int paramInt) {
    if (getChildCount() <= 0) {
      super.addView(paramView, paramInt);
      return;
    } 
    tp.f("ScrollView can host only one direct child");
  }
  
  public final void addView(View paramView, int paramInt, ViewGroup.LayoutParams paramLayoutParams) {
    if (getChildCount() <= 0) {
      super.addView(paramView, paramInt, paramLayoutParams);
      return;
    } 
    tp.f("ScrollView can host only one direct child");
  }
  
  public final void addView(View paramView, ViewGroup.LayoutParams paramLayoutParams) {
    if (getChildCount() <= 0) {
      super.addView(paramView, paramLayoutParams);
      return;
    } 
    tp.f("ScrollView can host only one direct child");
  }
  
  public final void b(View paramView, int paramInt) {
    p11 p111 = this.A;
    if (paramInt == 1) {
      p111.b = 0;
    } else {
      p111.a = 0;
    } 
    w(paramInt);
  }
  
  public final void c(View paramView, int paramInt1, int paramInt2, int[] paramArrayOfint, int paramInt3) {
    this.B.c(paramInt1, paramInt2, paramInt3, paramArrayOfint, null);
  }
  
  public final int computeHorizontalScrollExtent() {
    return super.computeHorizontalScrollExtent();
  }
  
  public final int computeHorizontalScrollOffset() {
    return super.computeHorizontalScrollOffset();
  }
  
  public final int computeHorizontalScrollRange() {
    return super.computeHorizontalScrollRange();
  }
  
  public final void computeScroll() {
    // Byte code:
    //   0: aload_0
    //   1: getfield f : Landroid/widget/OverScroller;
    //   4: astore #10
    //   6: aload #10
    //   8: invokevirtual isFinished : ()Z
    //   11: ifeq -> 15
    //   14: return
    //   15: aload #10
    //   17: invokevirtual computeScrollOffset : ()Z
    //   20: pop
    //   21: aload #10
    //   23: invokevirtual getCurrY : ()I
    //   26: istore #6
    //   28: iload #6
    //   30: aload_0
    //   31: getfield y : I
    //   34: isub
    //   35: istore #4
    //   37: aload_0
    //   38: invokevirtual getHeight : ()I
    //   41: istore #5
    //   43: aload_0
    //   44: getfield g : Landroid/widget/EdgeEffect;
    //   47: astore #9
    //   49: aload_0
    //   50: getfield h : Landroid/widget/EdgeEffect;
    //   53: astore #8
    //   55: iload #4
    //   57: ifle -> 134
    //   60: aload #9
    //   62: invokestatic x : (Landroid/widget/EdgeEffect;)F
    //   65: fconst_0
    //   66: fcmpl
    //   67: ifeq -> 134
    //   70: iload #4
    //   72: ineg
    //   73: i2f
    //   74: ldc_w 4.0
    //   77: fmul
    //   78: iload #5
    //   80: i2f
    //   81: fdiv
    //   82: fstore_1
    //   83: iload #5
    //   85: ineg
    //   86: i2f
    //   87: ldc_w 4.0
    //   90: fdiv
    //   91: fstore_2
    //   92: aload #9
    //   94: fload_1
    //   95: ldc_w 0.5
    //   98: invokestatic K : (Landroid/widget/EdgeEffect;FF)F
    //   101: fload_2
    //   102: fmul
    //   103: invokestatic round : (F)I
    //   106: istore #5
    //   108: iload #5
    //   110: istore_3
    //   111: iload #5
    //   113: iload #4
    //   115: if_icmpeq -> 126
    //   118: aload #9
    //   120: invokevirtual finish : ()V
    //   123: iload #5
    //   125: istore_3
    //   126: iload #4
    //   128: iload_3
    //   129: isub
    //   130: istore_3
    //   131: goto -> 214
    //   134: iload #4
    //   136: istore_3
    //   137: iload #4
    //   139: ifge -> 131
    //   142: iload #4
    //   144: istore_3
    //   145: aload #8
    //   147: invokestatic x : (Landroid/widget/EdgeEffect;)F
    //   150: fconst_0
    //   151: fcmpl
    //   152: ifeq -> 131
    //   155: iload #4
    //   157: i2f
    //   158: fstore_2
    //   159: iload #5
    //   161: i2f
    //   162: fstore_1
    //   163: fload_2
    //   164: ldc_w 4.0
    //   167: fmul
    //   168: fload_1
    //   169: fdiv
    //   170: fstore_2
    //   171: fload_1
    //   172: ldc_w 4.0
    //   175: fdiv
    //   176: fstore_1
    //   177: aload #8
    //   179: fload_2
    //   180: ldc_w 0.5
    //   183: invokestatic K : (Landroid/widget/EdgeEffect;FF)F
    //   186: fload_1
    //   187: fmul
    //   188: invokestatic round : (F)I
    //   191: istore #5
    //   193: iload #5
    //   195: istore_3
    //   196: iload #5
    //   198: iload #4
    //   200: if_icmpeq -> 126
    //   203: aload #8
    //   205: invokevirtual finish : ()V
    //   208: iload #5
    //   210: istore_3
    //   211: goto -> 126
    //   214: aload_0
    //   215: iload #6
    //   217: putfield y : I
    //   220: aload_0
    //   221: getfield w : [I
    //   224: astore #7
    //   226: aload #7
    //   228: iconst_1
    //   229: iconst_0
    //   230: iastore
    //   231: aload_0
    //   232: getfield B : Lm11;
    //   235: iconst_0
    //   236: iload_3
    //   237: iconst_1
    //   238: aload #7
    //   240: aconst_null
    //   241: invokevirtual c : (III[I[I)Z
    //   244: pop
    //   245: iload_3
    //   246: aload #7
    //   248: iconst_1
    //   249: iaload
    //   250: isub
    //   251: istore #4
    //   253: aload_0
    //   254: invokevirtual getScrollRange : ()I
    //   257: istore #5
    //   259: getstatic android/os/Build$VERSION.SDK_INT : I
    //   262: bipush #35
    //   264: if_icmplt -> 279
    //   267: aload_0
    //   268: aload #10
    //   270: invokevirtual getCurrVelocity : ()F
    //   273: invokestatic abs : (F)F
    //   276: invokestatic b : (Landroidx/core/widget/NestedScrollView;F)V
    //   279: iload #4
    //   281: istore_3
    //   282: iload #4
    //   284: ifeq -> 352
    //   287: aload_0
    //   288: invokevirtual getScrollY : ()I
    //   291: istore_3
    //   292: aload_0
    //   293: iload #4
    //   295: aload_0
    //   296: invokevirtual getScrollX : ()I
    //   299: iload_3
    //   300: iload #5
    //   302: invokevirtual p : (IIII)Z
    //   305: pop
    //   306: aload_0
    //   307: invokevirtual getScrollY : ()I
    //   310: iload_3
    //   311: isub
    //   312: istore_3
    //   313: iload #4
    //   315: iload_3
    //   316: isub
    //   317: istore #4
    //   319: aload #7
    //   321: iconst_1
    //   322: iconst_0
    //   323: iastore
    //   324: aload_0
    //   325: getfield B : Lm11;
    //   328: iconst_0
    //   329: iload_3
    //   330: iconst_0
    //   331: iload #4
    //   333: aload_0
    //   334: getfield v : [I
    //   337: iconst_1
    //   338: aload #7
    //   340: invokevirtual d : (IIII[II[I)Z
    //   343: pop
    //   344: iload #4
    //   346: aload #7
    //   348: iconst_1
    //   349: iaload
    //   350: isub
    //   351: istore_3
    //   352: iload_3
    //   353: ifeq -> 433
    //   356: aload_0
    //   357: invokevirtual getOverScrollMode : ()I
    //   360: istore #4
    //   362: iload #4
    //   364: ifeq -> 378
    //   367: iload #4
    //   369: iconst_1
    //   370: if_icmpne -> 423
    //   373: iload #5
    //   375: ifle -> 423
    //   378: iload_3
    //   379: ifge -> 404
    //   382: aload #9
    //   384: invokevirtual isFinished : ()Z
    //   387: ifeq -> 423
    //   390: aload #9
    //   392: aload #10
    //   394: invokevirtual getCurrVelocity : ()F
    //   397: f2i
    //   398: invokevirtual onAbsorb : (I)V
    //   401: goto -> 423
    //   404: aload #8
    //   406: invokevirtual isFinished : ()Z
    //   409: ifeq -> 423
    //   412: aload #8
    //   414: aload #10
    //   416: invokevirtual getCurrVelocity : ()F
    //   419: f2i
    //   420: invokevirtual onAbsorb : (I)V
    //   423: aload #10
    //   425: invokevirtual abortAnimation : ()V
    //   428: aload_0
    //   429: iconst_1
    //   430: invokevirtual w : (I)V
    //   433: aload #10
    //   435: invokevirtual isFinished : ()Z
    //   438: ifne -> 446
    //   441: aload_0
    //   442: invokevirtual postInvalidateOnAnimation : ()V
    //   445: return
    //   446: aload_0
    //   447: iconst_1
    //   448: invokevirtual w : (I)V
    //   451: return
  }
  
  public final int computeVerticalScrollExtent() {
    return super.computeVerticalScrollExtent();
  }
  
  public final int computeVerticalScrollOffset() {
    return Math.max(0, super.computeVerticalScrollOffset());
  }
  
  public final int computeVerticalScrollRange() {
    int i = getChildCount();
    int j = getHeight() - getPaddingBottom() - getPaddingTop();
    if (i == 0)
      return j; 
    View view = getChildAt(0);
    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams)view.getLayoutParams();
    i = view.getBottom() + layoutParams.bottomMargin;
    int k = getScrollY();
    j = Math.max(0, i - j);
    return (k < 0) ? (i - k) : ((k > j) ? (k - j + i) : i);
  }
  
  public final void d(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int[] paramArrayOfint) {
    n(paramInt4, paramInt5, paramArrayOfint);
  }
  
  public final boolean dispatchKeyEvent(KeyEvent paramKeyEvent) {
    return (super.dispatchKeyEvent(paramKeyEvent) || i(paramKeyEvent));
  }
  
  public final boolean dispatchNestedFling(float paramFloat1, float paramFloat2, boolean paramBoolean) {
    return this.B.a(paramFloat1, paramFloat2, paramBoolean);
  }
  
  public final boolean dispatchNestedPreFling(float paramFloat1, float paramFloat2) {
    return this.B.b(paramFloat1, paramFloat2);
  }
  
  public final boolean dispatchNestedPreScroll(int paramInt1, int paramInt2, int[] paramArrayOfint1, int[] paramArrayOfint2) {
    return this.B.c(paramInt1, paramInt2, 0, paramArrayOfint1, paramArrayOfint2);
  }
  
  public final boolean dispatchNestedScroll(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int[] paramArrayOfint) {
    return this.B.d(paramInt1, paramInt2, paramInt3, paramInt4, paramArrayOfint, 0, null);
  }
  
  public final void draw(Canvas paramCanvas) {
    super.draw(paramCanvas);
    int i = getScrollY();
    EdgeEffect edgeEffect = this.g;
    boolean bool = edgeEffect.isFinished();
    byte b = 0;
    if (!bool) {
      boolean bool1;
      int n = paramCanvas.save();
      int j = getWidth();
      int m = getHeight();
      int k = Math.min(0, i);
      if (getClipToPadding()) {
        bool1 = getPaddingLeft();
        j -= getPaddingRight() + bool1;
        bool1 = getPaddingLeft();
        int i1 = getPaddingTop();
        m -= getPaddingBottom() + i1;
        k += getPaddingTop();
      } else {
        bool1 = false;
      } 
      paramCanvas.translate(bool1, k);
      edgeEffect.setSize(j, m);
      if (edgeEffect.draw(paramCanvas))
        postInvalidateOnAnimation(); 
      paramCanvas.restoreToCount(n);
    } 
    edgeEffect = this.h;
    if (!edgeEffect.isFinished()) {
      int i2 = paramCanvas.save();
      int m = getWidth();
      int i1 = getHeight();
      i = Math.max(getScrollRange(), i) + i1;
      int k = b;
      int j = m;
      if (getClipToPadding()) {
        j = getPaddingLeft();
        j = m - getPaddingRight() + j;
        k = getPaddingLeft();
      } 
      int n = i;
      m = i1;
      if (getClipToPadding()) {
        m = getPaddingTop();
        m = i1 - getPaddingBottom() + m;
        n = i - getPaddingBottom();
      } 
      paramCanvas.translate((k - j), n);
      paramCanvas.rotate(180.0F, j, 0.0F);
      edgeEffect.setSize(j, m);
      if (edgeEffect.draw(paramCanvas))
        postInvalidateOnAnimation(); 
      paramCanvas.restoreToCount(i2);
    } 
  }
  
  public final void e(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    n(paramInt4, paramInt5, null);
  }
  
  public final boolean f(View paramView1, View paramView2, int paramInt1, int paramInt2) {
    return ((paramInt1 & 0x2) != 0);
  }
  
  public final boolean g(int paramInt) {
    View view2 = findFocus();
    View view1 = view2;
    if (view2 == this)
      view1 = null; 
    View view3 = FocusFinder.getInstance().findNextFocus((ViewGroup)this, view1, paramInt);
    int i = getMaxScrollAmount();
    if (view3 != null && m(view3, i, getHeight())) {
      Rect rect = this.e;
      view3.getDrawingRect(rect);
      offsetDescendantRectToMyCoords(view3, rect);
      s(h(rect), -1, null, 0, 1, true);
      view3.requestFocus(paramInt);
    } else {
      int j;
      if (paramInt == 33 && getScrollY() < i) {
        j = getScrollY();
      } else {
        j = i;
        if (paramInt == 130) {
          j = i;
          if (getChildCount() > 0) {
            view3 = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams)view3.getLayoutParams();
            int m = view3.getBottom();
            j = layoutParams.bottomMargin;
            int k = getScrollY();
            j = Math.min(m + j - getHeight() + k - getPaddingBottom(), i);
          } 
        } 
      } 
      if (j == 0)
        return false; 
      if (paramInt != 130)
        j = -j; 
      s(j, -1, null, 0, 1, true);
    } 
    if (view1 != null && view1.isFocused() && !m(view1, 0, getHeight())) {
      paramInt = getDescendantFocusability();
      setDescendantFocusability(131072);
      requestFocus();
      setDescendantFocusability(paramInt);
    } 
    return true;
  }
  
  public float getBottomFadingEdgeStrength() {
    if (getChildCount() == 0)
      return 0.0F; 
    View view = getChildAt(0);
    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams)view.getLayoutParams();
    int i = getVerticalFadingEdgeLength();
    int j = getHeight();
    int k = getPaddingBottom();
    j = view.getBottom() + layoutParams.bottomMargin - getScrollY() - j - k;
    return (j < i) ? (j / i) : 1.0F;
  }
  
  public int getMaxScrollAmount() {
    return (int)(getHeight() * 0.5F);
  }
  
  public int getNestedScrollAxes() {
    p11 p111 = this.A;
    int i = p111.a;
    return p111.b | i;
  }
  
  public int getScrollRange() {
    if (getChildCount() > 0) {
      View view = getChildAt(0);
      FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams)view.getLayoutParams();
      return Math.max(0, view.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin - getHeight() - getPaddingTop() - getPaddingBottom());
    } 
    return 0;
  }
  
  public float getTopFadingEdgeStrength() {
    if (getChildCount() == 0)
      return 0.0F; 
    int i = getVerticalFadingEdgeLength();
    int j = getScrollY();
    return (j < i) ? (j / i) : 1.0F;
  }
  
  public float getVerticalScrollFactorCompat() {
    if (this.C == 0.0F) {
      TypedValue typedValue = new TypedValue();
      Context context = getContext();
      if (context.getTheme().resolveAttribute(16842829, typedValue, true)) {
        this.C = typedValue.getDimension(context.getResources().getDisplayMetrics());
      } else {
        tp.f("Expected theme to define listPreferredItemHeight.");
        return 0.0F;
      } 
    } 
    return this.C;
  }
  
  public final int h(Rect paramRect) {
    if (getChildCount() == 0)
      return 0; 
    int m = getHeight();
    int j = getScrollY();
    int k = j + m;
    int n = getVerticalFadingEdgeLength();
    int i = j;
    if (paramRect.top > 0)
      i = j + n; 
    View view = getChildAt(0);
    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams)view.getLayoutParams();
    if (paramRect.bottom < view.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin) {
      j = k - n;
    } else {
      j = k;
    } 
    n = paramRect.bottom;
    if (n > j && paramRect.top > i) {
      if (paramRect.height() > m) {
        i = paramRect.top - i;
      } else {
        i = paramRect.bottom - j;
      } 
      return Math.min(i, view.getBottom() + layoutParams.bottomMargin - k);
    } 
    if (paramRect.top < i && n < j) {
      if (paramRect.height() > m) {
        i = 0 - j - paramRect.bottom;
      } else {
        i = 0 - i - paramRect.top;
      } 
      return Math.max(i, -getScrollY());
    } 
    return 0;
  }
  
  public final boolean hasNestedScrollingParent() {
    return this.B.f(0);
  }
  
  public final boolean i(KeyEvent paramKeyEvent) {
    this.e.setEmpty();
    int i = getChildCount();
    char c = '';
    if (i > 0) {
      View view = getChildAt(0);
      FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams)view.getLayoutParams();
      if (view.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin > getHeight() - getPaddingTop() - getPaddingBottom()) {
        if (paramKeyEvent.getAction() == 0) {
          i = paramKeyEvent.getKeyCode();
          if (i != 19) {
            if (i != 20) {
              if (i != 62) {
                if (i != 92) {
                  if (i != 93) {
                    if (i != 122) {
                      if (i == 123) {
                        q(130);
                        return false;
                      } 
                    } else {
                      q(33);
                      return false;
                    } 
                  } else {
                    return k(130);
                  } 
                } else {
                  return k(33);
                } 
              } else {
                if (paramKeyEvent.isShiftPressed())
                  c = '!'; 
                q(c);
                return false;
              } 
            } else {
              return paramKeyEvent.isAltPressed() ? k(130) : g(130);
            } 
          } else {
            return paramKeyEvent.isAltPressed() ? k(33) : g(33);
          } 
        } 
        return false;
      } 
    } 
    if (isFocused() && paramKeyEvent.getKeyCode() != 4) {
      View view2 = findFocus();
      View view1 = view2;
      if (view2 == this)
        view1 = null; 
      view1 = FocusFinder.getInstance().findNextFocus((ViewGroup)this, view1, 130);
      if (view1 != null && view1 != this && view1.requestFocus(130))
        return true; 
    } 
    return false;
  }
  
  public final boolean isNestedScrollingEnabled() {
    return this.B.d;
  }
  
  public final void j(int paramInt) {
    if (getChildCount() > 0) {
      int j = getScrollX();
      int i = getScrollY();
      this.f.fling(j, i, 0, paramInt, 0, 0, -2147483648, 2147483647, 0, 0);
      this.B.g(2, 1);
      this.y = getScrollY();
      postInvalidateOnAnimation();
      if (Build.VERSION.SDK_INT >= 35)
        i11.b(this, Math.abs(this.f.getCurrVelocity())); 
    } 
  }
  
  public final boolean k(int paramInt) {
    int i;
    if (paramInt == 130) {
      i = 1;
    } else {
      i = 0;
    } 
    int j = getHeight();
    Rect rect = this.e;
    rect.top = 0;
    rect.bottom = j;
    if (i) {
      i = getChildCount();
      if (i > 0) {
        View view = getChildAt(i - 1);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams)view.getLayoutParams();
        int k = view.getBottom();
        i = layoutParams.bottomMargin;
        i = getPaddingBottom() + k + i;
        rect.bottom = i;
        rect.top = i - j;
      } 
    } 
    return r(paramInt, rect.top, rect.bottom);
  }
  
  public final boolean m(View paramView, int paramInt1, int paramInt2) {
    Rect rect = this.e;
    paramView.getDrawingRect(rect);
    offsetDescendantRectToMyCoords(paramView, rect);
    return (rect.bottom + paramInt1 >= getScrollY() && rect.top - paramInt1 <= getScrollY() + paramInt2);
  }
  
  public final void measureChild(View paramView, int paramInt1, int paramInt2) {
    ViewGroup.LayoutParams layoutParams = paramView.getLayoutParams();
    paramInt2 = getPaddingLeft();
    paramView.measure(ViewGroup.getChildMeasureSpec(paramInt1, getPaddingRight() + paramInt2, layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
  }
  
  public final void measureChildWithMargins(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams)paramView.getLayoutParams();
    paramInt3 = getPaddingLeft();
    paramView.measure(ViewGroup.getChildMeasureSpec(paramInt1, getPaddingRight() + paramInt3 + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + paramInt2, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
  }
  
  public final void n(int paramInt1, int paramInt2, int[] paramArrayOfint) {
    int i = getScrollY();
    scrollBy(0, paramInt1);
    i = getScrollY() - i;
    if (paramArrayOfint != null)
      paramArrayOfint[1] = paramArrayOfint[1] + i; 
    this.B.d(0, i, 0, paramInt1 - i, null, paramInt2, paramArrayOfint);
  }
  
  public final void o(MotionEvent paramMotionEvent) {
    int i = paramMotionEvent.getActionIndex();
    if (paramMotionEvent.getPointerId(i) == this.u) {
      if (i == 0) {
        i = 1;
      } else {
        i = 0;
      } 
      this.j = (int)paramMotionEvent.getY(i);
      this.u = paramMotionEvent.getPointerId(i);
      VelocityTracker velocityTracker = this.o;
      if (velocityTracker != null)
        velocityTracker.clear(); 
    } 
  }
  
  public final void onAttachedToWindow() {
    super.onAttachedToWindow();
    this.l = false;
  }
  
  public final boolean onGenericMotionEvent(MotionEvent paramMotionEvent) {
    if (paramMotionEvent.getAction() == 8 && !this.n) {
      float f;
      boolean bool1;
      boolean bool2;
      if (wf2.J(paramMotionEvent, 2)) {
        f = paramMotionEvent.getAxisValue(9);
        bool2 = (int)paramMotionEvent.getX();
        bool1 = true;
      } else if (wf2.J(paramMotionEvent, 4194304)) {
        f = paramMotionEvent.getAxisValue(26);
        bool2 = getWidth() / 2;
        bool1 = true;
      } else {
        bool1 = false;
        bool2 = false;
        f = 0.0F;
      } 
      if (f != 0.0F) {
        int i = (int)(getVerticalScrollFactorCompat() * f);
        boolean bool = wf2.J(paramMotionEvent, 8194);
        s(-i, bool1, paramMotionEvent, bool2, 1, bool);
        if (bool1)
          this.D.a(paramMotionEvent, bool1); 
        return true;
      } 
    } 
    return false;
  }
  
  public final boolean onInterceptTouchEvent(MotionEvent paramMotionEvent) {
    VelocityTracker velocityTracker;
    int i = paramMotionEvent.getAction();
    boolean bool1 = true;
    boolean bool2 = true;
    if (i == 2 && this.n)
      return true; 
    i &= 0xFF;
    if (i != 0) {
      if (i != 1)
        if (i != 2) {
          if (i != 3) {
            if (i == 6)
              o(paramMotionEvent); 
            return this.n;
          } 
        } else {
          i = this.u;
          if (i != -1) {
            StringBuilder stringBuilder;
            int m = paramMotionEvent.findPointerIndex(i);
            if (m == -1) {
              stringBuilder = new StringBuilder("Invalid pointerId=");
              stringBuilder.append(i);
              stringBuilder.append(" in onInterceptTouchEvent");
              Log.e("NestedScrollView", stringBuilder.toString());
            } else {
              i = (int)stringBuilder.getY(m);
              if (Math.abs(i - this.j) > this.r && (0x2 & getNestedScrollAxes()) == 0) {
                this.n = true;
                this.j = i;
                if (this.o == null)
                  this.o = VelocityTracker.obtain(); 
                this.o.addMovement((MotionEvent)stringBuilder);
                this.x = 0;
                ViewParent viewParent = getParent();
                if (viewParent != null)
                  viewParent.requestDisallowInterceptTouchEvent(true); 
              } 
            } 
          } 
          return this.n;
        }  
      this.n = false;
      this.u = -1;
      velocityTracker = this.o;
      if (velocityTracker != null) {
        velocityTracker.recycle();
        this.o = null;
      } 
      int j = getScrollX();
      int k = getScrollY();
      i = getScrollRange();
      if (this.f.springBack(j, k, 0, 0, 0, i))
        postInvalidateOnAnimation(); 
      w(0);
    } else {
      i = (int)velocityTracker.getY();
      int j = (int)velocityTracker.getX();
      int k = getChildCount();
      OverScroller overScroller = this.f;
      if (k > 0) {
        k = getScrollY();
        View view = getChildAt(0);
        if (i >= view.getTop() - k && i < view.getBottom() - k && j >= view.getLeft() && j < view.getRight()) {
          this.j = i;
          this.u = velocityTracker.getPointerId(0);
          VelocityTracker velocityTracker1 = this.o;
          if (velocityTracker1 == null) {
            this.o = VelocityTracker.obtain();
          } else {
            velocityTracker1.clear();
          } 
          this.o.addMovement((MotionEvent)velocityTracker);
          overScroller.computeScrollOffset();
          boolean bool3 = bool2;
          if (!v((MotionEvent)velocityTracker))
            if (!overScroller.isFinished()) {
              bool3 = bool2;
            } else {
              bool3 = false;
            }  
          this.n = bool3;
          this.B.g(2, 0);
          return this.n;
        } 
      } 
      boolean bool = bool1;
      if (!v((MotionEvent)velocityTracker))
        if (!overScroller.isFinished()) {
          bool = bool1;
        } else {
          bool = false;
        }  
      this.n = bool;
      velocityTracker = this.o;
      if (velocityTracker != null) {
        velocityTracker.recycle();
        this.o = null;
      } 
    } 
    return this.n;
  }
  
  public final void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    boolean bool = false;
    this.k = false;
    View view = this.m;
    if (view != null && l(view, this)) {
      View view1 = this.m;
      Rect rect = this.e;
      view1.getDrawingRect(rect);
      offsetDescendantRectToMyCoords(view1, rect);
      paramInt1 = h(rect);
      if (paramInt1 != 0)
        scrollBy(0, paramInt1); 
    } 
    this.m = null;
    if (!this.l) {
      if (this.z != null) {
        scrollTo(getScrollX(), this.z.b);
        this.z = null;
      } 
      if (getChildCount() > 0) {
        View view1 = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams)view1.getLayoutParams();
        paramInt3 = view1.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
      } else {
        paramInt3 = 0;
      } 
      paramInt4 = paramInt4 - paramInt2 - getPaddingTop() - getPaddingBottom();
      paramInt2 = getScrollY();
      paramInt1 = bool;
      if (paramInt4 < paramInt3)
        if (paramInt2 < 0) {
          paramInt1 = bool;
        } else if (paramInt4 + paramInt2 > paramInt3) {
          paramInt1 = paramInt3 - paramInt4;
        } else {
          paramInt1 = paramInt2;
        }  
      if (paramInt1 != paramInt2)
        scrollTo(getScrollX(), paramInt1); 
    } 
    scrollTo(getScrollX(), getScrollY());
    this.l = true;
  }
  
  public final void onMeasure(int paramInt1, int paramInt2) {
    super.onMeasure(paramInt1, paramInt2);
    if (this.p && View.MeasureSpec.getMode(paramInt2) != 0 && getChildCount() > 0) {
      View view = getChildAt(0);
      FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams)view.getLayoutParams();
      int i = view.getMeasuredHeight();
      paramInt2 = getMeasuredHeight() - getPaddingTop() - getPaddingBottom() - layoutParams.topMargin - layoutParams.bottomMargin;
      if (i < paramInt2) {
        i = getPaddingLeft();
        view.measure(ViewGroup.getChildMeasureSpec(paramInt1, getPaddingRight() + i + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(paramInt2, 1073741824));
      } 
    } 
  }
  
  public final boolean onNestedFling(View paramView, float paramFloat1, float paramFloat2, boolean paramBoolean) {
    if (!paramBoolean) {
      dispatchNestedFling(0.0F, paramFloat2, true);
      j((int)paramFloat2);
      return true;
    } 
    return false;
  }
  
  public final boolean onNestedPreFling(View paramView, float paramFloat1, float paramFloat2) {
    return this.B.b(paramFloat1, paramFloat2);
  }
  
  public final void onNestedPreScroll(View paramView, int paramInt1, int paramInt2, int[] paramArrayOfint) {
    this.B.c(paramInt1, paramInt2, 0, paramArrayOfint, null);
  }
  
  public final void onNestedScroll(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    n(paramInt4, 0, null);
  }
  
  public final void onNestedScrollAccepted(View paramView1, View paramView2, int paramInt) {
    a(paramView1, paramView2, paramInt, 0);
  }
  
  public final void onOverScrolled(int paramInt1, int paramInt2, boolean paramBoolean1, boolean paramBoolean2) {
    super.scrollTo(paramInt1, paramInt2);
  }
  
  public final boolean onRequestFocusInDescendants(int paramInt, Rect paramRect) {
    int i;
    View view;
    if (paramInt == 2) {
      i = 130;
    } else {
      i = paramInt;
      if (paramInt == 1)
        i = 33; 
    } 
    if (paramRect == null) {
      view = FocusFinder.getInstance().findNextFocus((ViewGroup)this, null, i);
    } else {
      view = FocusFinder.getInstance().findNextFocusFromRect((ViewGroup)this, paramRect, i);
    } 
    return (view == null || !m(view, 0, getHeight())) ? false : view.requestFocus(i, paramRect);
  }
  
  public final void onRestoreInstanceState(Parcelable paramParcelable) {
    if (!(paramParcelable instanceof k11)) {
      super.onRestoreInstanceState(paramParcelable);
      return;
    } 
    k11 k111 = (k11)paramParcelable;
    super.onRestoreInstanceState(k111.getSuperState());
    this.z = k111;
    requestLayout();
  }
  
  public final Parcelable onSaveInstanceState() {
    View.BaseSavedState baseSavedState = new View.BaseSavedState(super.onSaveInstanceState());
    ((k11)baseSavedState).b = getScrollY();
    return (Parcelable)baseSavedState;
  }
  
  public final void onScrollChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    super.onScrollChanged(paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public final void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    View view = findFocus();
    if (view != null && this != view && m(view, 0, paramInt4)) {
      Rect rect = this.e;
      view.getDrawingRect(rect);
      offsetDescendantRectToMyCoords(view, rect);
      paramInt1 = h(rect);
      if (paramInt1 != 0) {
        if (this.q) {
          u(0, paramInt1, false);
          return;
        } 
        scrollBy(0, paramInt1);
      } 
    } 
  }
  
  public final boolean onStartNestedScroll(View paramView1, View paramView2, int paramInt) {
    return f(paramView1, paramView2, paramInt, 0);
  }
  
  public final void onStopNestedScroll(View paramView) {
    b(paramView, 0);
  }
  
  public final boolean onTouchEvent(MotionEvent paramMotionEvent) {
    if (this.o == null)
      this.o = VelocityTracker.obtain(); 
    int i = paramMotionEvent.getActionMasked();
    if (i == 0)
      this.x = 0; 
    MotionEvent motionEvent = MotionEvent.obtain(paramMotionEvent);
    float f2 = this.x;
    float f1 = 0.0F;
    motionEvent.offsetLocation(0.0F, f2);
    m11 m111 = this.B;
    if (i != 0) {
      ViewParent viewParent;
      EdgeEffect edgeEffect1 = this.g;
      EdgeEffect edgeEffect2 = this.h;
      if (i != 1) {
        if (i != 2) {
          if (i != 3) {
            if (i != 5) {
              if (i == 6) {
                o(paramMotionEvent);
                this.j = (int)paramMotionEvent.getY(paramMotionEvent.findPointerIndex(this.u));
              } 
            } else {
              i = paramMotionEvent.getActionIndex();
              this.j = (int)paramMotionEvent.getY(i);
              this.u = paramMotionEvent.getPointerId(i);
            } 
          } else {
            if (this.n && getChildCount() > 0) {
              int k = getScrollX();
              i = getScrollY();
              int j = getScrollRange();
              if (this.f.springBack(k, i, 0, 0, 0, j))
                postInvalidateOnAnimation(); 
            } 
            this.u = -1;
            this.n = false;
            velocityTracker = this.o;
            if (velocityTracker != null) {
              velocityTracker.recycle();
              this.o = null;
            } 
            w(0);
            edgeEffect1.onRelease();
            edgeEffect2.onRelease();
          } 
        } else {
          StringBuilder stringBuilder;
          int j = velocityTracker.findPointerIndex(this.u);
          if (j == -1) {
            stringBuilder = new StringBuilder("Invalid pointerId=");
            stringBuilder.append(this.u);
            stringBuilder.append(" in onTouchEvent");
            Log.e("NestedScrollView", stringBuilder.toString());
          } else {
            int m = (int)stringBuilder.getY(j);
            i = this.j - m;
            f2 = stringBuilder.getX(j) / getWidth();
            float f = i / getHeight();
            if (wf2.x(edgeEffect1) != 0.0F) {
              f2 = -wf2.K(edgeEffect1, -f, f2);
              f1 = f2;
              if (wf2.x(edgeEffect1) == 0.0F) {
                edgeEffect1.onRelease();
                f1 = f2;
              } 
            } else if (wf2.x(edgeEffect2) != 0.0F) {
              f2 = wf2.K(edgeEffect2, f, 1.0F - f2);
              f1 = f2;
              if (wf2.x(edgeEffect2) == 0.0F) {
                edgeEffect2.onRelease();
                f1 = f2;
              } 
            } 
            int k = Math.round(f1 * getHeight());
            if (k != 0)
              invalidate(); 
            k = i - k;
            i = k;
            if (!this.n) {
              int n = Math.abs(k);
              int i1 = this.r;
              i = k;
              if (n > i1) {
                viewParent = getParent();
                if (viewParent != null)
                  viewParent.requestDisallowInterceptTouchEvent(true); 
                this.n = true;
                if (k > 0) {
                  i = k - i1;
                } else {
                  i = k + i1;
                } 
              } 
            } 
            if (this.n) {
              i = s(i, 1, (MotionEvent)stringBuilder, (int)stringBuilder.getX(j), 0, false);
              this.j = m - i;
              this.x += i;
            } 
          } 
        } 
      } else {
        velocityTracker = this.o;
        velocityTracker.computeCurrentVelocity(1000, this.t);
        i = (int)velocityTracker.getYVelocity(this.u);
        if (Math.abs(i) >= this.s) {
          if (wf2.x((EdgeEffect)viewParent) != 0.0F) {
            if (t((EdgeEffect)viewParent, i)) {
              viewParent.onAbsorb(i);
            } else {
              j(-i);
            } 
          } else if (wf2.x(edgeEffect2) != 0.0F) {
            i = -i;
            if (t(edgeEffect2, i)) {
              edgeEffect2.onAbsorb(i);
            } else {
              j(i);
            } 
          } else {
            i = -i;
            f1 = i;
            if (!m111.b(0.0F, f1)) {
              dispatchNestedFling(0.0F, f1, true);
              j(i);
            } 
          } 
        } else {
          i = getScrollX();
          int j = getScrollY();
          int k = getScrollRange();
          if (this.f.springBack(i, j, 0, 0, 0, k))
            postInvalidateOnAnimation(); 
        } 
        this.u = -1;
        this.n = false;
        velocityTracker = this.o;
        if (velocityTracker != null) {
          velocityTracker.recycle();
          this.o = null;
        } 
        w(0);
        viewParent.onRelease();
        edgeEffect2.onRelease();
      } 
    } else {
      if (getChildCount() == 0)
        return false; 
      if (this.n) {
        ViewParent viewParent = getParent();
        if (viewParent != null)
          viewParent.requestDisallowInterceptTouchEvent(true); 
      } 
      OverScroller overScroller = this.f;
      if (!overScroller.isFinished()) {
        overScroller.abortAnimation();
        w(1);
      } 
      int j = (int)velocityTracker.getY();
      i = velocityTracker.getPointerId(0);
      this.j = j;
      this.u = i;
      m111.g(2, 0);
    } 
    VelocityTracker velocityTracker = this.o;
    if (velocityTracker != null)
      velocityTracker.addMovement(motionEvent); 
    motionEvent.recycle();
    return true;
  }
  
  public final boolean p(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual getOverScrollMode : ()I
    //   4: pop
    //   5: aload_0
    //   6: invokespecial computeHorizontalScrollRange : ()I
    //   9: pop
    //   10: aload_0
    //   11: invokespecial computeHorizontalScrollExtent : ()I
    //   14: pop
    //   15: aload_0
    //   16: invokevirtual computeVerticalScrollRange : ()I
    //   19: pop
    //   20: aload_0
    //   21: invokespecial computeVerticalScrollExtent : ()I
    //   24: pop
    //   25: iload_3
    //   26: iload_1
    //   27: iadd
    //   28: istore_1
    //   29: iload_2
    //   30: ifle -> 40
    //   33: iconst_0
    //   34: istore_3
    //   35: iconst_1
    //   36: istore_2
    //   37: goto -> 51
    //   40: iload_2
    //   41: ifge -> 47
    //   44: goto -> 33
    //   47: iload_2
    //   48: istore_3
    //   49: iconst_0
    //   50: istore_2
    //   51: iload_1
    //   52: iload #4
    //   54: if_icmple -> 72
    //   57: iload #4
    //   59: istore_1
    //   60: iconst_1
    //   61: istore #5
    //   63: iload_1
    //   64: istore #4
    //   66: iload #5
    //   68: istore_1
    //   69: goto -> 86
    //   72: iload_1
    //   73: ifge -> 81
    //   76: iconst_0
    //   77: istore_1
    //   78: goto -> 60
    //   81: iload_1
    //   82: istore #4
    //   84: iconst_0
    //   85: istore_1
    //   86: iload_1
    //   87: ifeq -> 123
    //   90: aload_0
    //   91: getfield B : Lm11;
    //   94: iconst_1
    //   95: invokevirtual f : (I)Z
    //   98: ifne -> 123
    //   101: aload_0
    //   102: invokevirtual getScrollRange : ()I
    //   105: istore #5
    //   107: aload_0
    //   108: getfield f : Landroid/widget/OverScroller;
    //   111: iload_3
    //   112: iload #4
    //   114: iconst_0
    //   115: iconst_0
    //   116: iconst_0
    //   117: iload #5
    //   119: invokevirtual springBack : (IIIIII)Z
    //   122: pop
    //   123: aload_0
    //   124: iload_3
    //   125: iload #4
    //   127: invokespecial scrollTo : (II)V
    //   130: iload_2
    //   131: ifne -> 143
    //   134: iload_1
    //   135: ifeq -> 141
    //   138: goto -> 143
    //   141: iconst_0
    //   142: ireturn
    //   143: iconst_1
    //   144: ireturn
  }
  
  public final void q(int paramInt) {
    if (paramInt == 130) {
      i = 1;
    } else {
      i = 0;
    } 
    int j = getHeight();
    Rect rect = this.e;
    if (i) {
      rect.top = getScrollY() + j;
      i = getChildCount();
      if (i > 0) {
        View view = getChildAt(i - 1);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams)view.getLayoutParams();
        i = view.getBottom();
        int k = layoutParams.bottomMargin;
        i = getPaddingBottom() + i + k;
        if (rect.top + j > i)
          rect.top = i - j; 
      } 
    } else {
      i = getScrollY() - j;
      rect.top = i;
      if (i < 0)
        rect.top = 0; 
    } 
    int i = rect.top;
    j += i;
    rect.bottom = j;
    r(paramInt, i, j);
  }
  
  public final boolean r(int paramInt1, int paramInt2, int paramInt3) {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual getHeight : ()I
    //   4: istore #4
    //   6: aload_0
    //   7: invokevirtual getScrollY : ()I
    //   10: istore #10
    //   12: iload #4
    //   14: iload #10
    //   16: iadd
    //   17: istore #11
    //   19: iload_1
    //   20: bipush #33
    //   22: if_icmpne -> 31
    //   25: iconst_1
    //   26: istore #6
    //   28: goto -> 34
    //   31: iconst_0
    //   32: istore #6
    //   34: aload_0
    //   35: iconst_2
    //   36: invokevirtual getFocusables : (I)Ljava/util/ArrayList;
    //   39: astore #18
    //   41: aload #18
    //   43: invokeinterface size : ()I
    //   48: istore #12
    //   50: aconst_null
    //   51: astore #16
    //   53: iconst_0
    //   54: istore #7
    //   56: iconst_0
    //   57: istore #8
    //   59: iload #7
    //   61: iload #12
    //   63: if_icmpge -> 282
    //   66: aload #18
    //   68: iload #7
    //   70: invokeinterface get : (I)Ljava/lang/Object;
    //   75: checkcast android/view/View
    //   78: astore #17
    //   80: aload #17
    //   82: invokevirtual getTop : ()I
    //   85: istore #13
    //   87: aload #17
    //   89: invokevirtual getBottom : ()I
    //   92: istore #9
    //   94: aload #16
    //   96: astore #15
    //   98: iload #8
    //   100: istore #5
    //   102: iload_2
    //   103: iload #9
    //   105: if_icmpge -> 268
    //   108: aload #16
    //   110: astore #15
    //   112: iload #8
    //   114: istore #5
    //   116: iload #13
    //   118: iload_3
    //   119: if_icmpge -> 268
    //   122: iload_2
    //   123: iload #13
    //   125: if_icmpge -> 140
    //   128: iload #9
    //   130: iload_3
    //   131: if_icmpge -> 140
    //   134: iconst_1
    //   135: istore #4
    //   137: goto -> 143
    //   140: iconst_0
    //   141: istore #4
    //   143: aload #16
    //   145: ifnonnull -> 159
    //   148: aload #17
    //   150: astore #15
    //   152: iload #4
    //   154: istore #5
    //   156: goto -> 268
    //   159: iload #6
    //   161: ifeq -> 174
    //   164: iload #13
    //   166: aload #16
    //   168: invokevirtual getTop : ()I
    //   171: if_icmplt -> 189
    //   174: iload #6
    //   176: ifne -> 195
    //   179: iload #9
    //   181: aload #16
    //   183: invokevirtual getBottom : ()I
    //   186: if_icmple -> 195
    //   189: iconst_1
    //   190: istore #9
    //   192: goto -> 198
    //   195: iconst_0
    //   196: istore #9
    //   198: iload #8
    //   200: ifeq -> 232
    //   203: aload #16
    //   205: astore #15
    //   207: iload #8
    //   209: istore #5
    //   211: iload #4
    //   213: ifeq -> 268
    //   216: aload #16
    //   218: astore #15
    //   220: iload #8
    //   222: istore #5
    //   224: iload #9
    //   226: ifeq -> 268
    //   229: goto -> 260
    //   232: iload #4
    //   234: ifeq -> 247
    //   237: aload #17
    //   239: astore #15
    //   241: iconst_1
    //   242: istore #5
    //   244: goto -> 268
    //   247: aload #16
    //   249: astore #15
    //   251: iload #8
    //   253: istore #5
    //   255: iload #9
    //   257: ifeq -> 268
    //   260: aload #17
    //   262: astore #15
    //   264: iload #8
    //   266: istore #5
    //   268: iinc #7, 1
    //   271: aload #15
    //   273: astore #16
    //   275: iload #5
    //   277: istore #8
    //   279: goto -> 59
    //   282: aload #16
    //   284: ifnonnull -> 293
    //   287: aload_0
    //   288: astore #15
    //   290: goto -> 297
    //   293: aload #16
    //   295: astore #15
    //   297: iload_2
    //   298: iload #10
    //   300: if_icmplt -> 315
    //   303: iload_3
    //   304: iload #11
    //   306: if_icmpgt -> 315
    //   309: iconst_0
    //   310: istore #14
    //   312: goto -> 350
    //   315: iload #6
    //   317: ifeq -> 328
    //   320: iload_2
    //   321: iload #10
    //   323: isub
    //   324: istore_2
    //   325: goto -> 336
    //   328: iload_3
    //   329: iload #11
    //   331: isub
    //   332: istore_2
    //   333: goto -> 325
    //   336: aload_0
    //   337: iload_2
    //   338: iconst_m1
    //   339: aconst_null
    //   340: iconst_0
    //   341: iconst_1
    //   342: iconst_1
    //   343: invokevirtual s : (IILandroid/view/MotionEvent;IIZ)I
    //   346: pop
    //   347: iconst_1
    //   348: istore #14
    //   350: aload #15
    //   352: aload_0
    //   353: invokevirtual findFocus : ()Landroid/view/View;
    //   356: if_acmpeq -> 366
    //   359: aload #15
    //   361: iload_1
    //   362: invokevirtual requestFocus : (I)Z
    //   365: pop
    //   366: iload #14
    //   368: ireturn
  }
  
  public final void requestChildFocus(View paramView1, View paramView2) {
    if (!this.k) {
      Rect rect = this.e;
      paramView2.getDrawingRect(rect);
      offsetDescendantRectToMyCoords(paramView2, rect);
      int i = h(rect);
      if (i != 0)
        scrollBy(0, i); 
    } else {
      this.m = paramView2;
    } 
    super.requestChildFocus(paramView1, paramView2);
  }
  
  public final boolean requestChildRectangleOnScreen(View paramView, Rect paramRect, boolean paramBoolean) {
    boolean bool;
    paramRect.offset(paramView.getLeft() - paramView.getScrollX(), paramView.getTop() - paramView.getScrollY());
    int i = h(paramRect);
    if (i != 0) {
      bool = true;
    } else {
      bool = false;
    } 
    if (bool) {
      if (paramBoolean) {
        scrollBy(0, i);
        return bool;
      } 
      u(0, i, false);
    } 
    return bool;
  }
  
  public final void requestDisallowInterceptTouchEvent(boolean paramBoolean) {
    if (paramBoolean) {
      VelocityTracker velocityTracker = this.o;
      if (velocityTracker != null) {
        velocityTracker.recycle();
        this.o = null;
      } 
    } 
    super.requestDisallowInterceptTouchEvent(paramBoolean);
  }
  
  public final void requestLayout() {
    this.k = true;
    super.requestLayout();
  }
  
  public final int s(int paramInt1, int paramInt2, MotionEvent paramMotionEvent, int paramInt3, int paramInt4, boolean paramBoolean) {
    byte b;
    int i;
    boolean bool;
    m11 m111 = this.B;
    if (paramInt4 == 1)
      m111.g(2, paramInt4); 
    int[] arrayOfInt1 = this.v;
    boolean bool1 = this.B.c(0, paramInt1, paramInt4, this.w, arrayOfInt1);
    arrayOfInt1 = this.v;
    int[] arrayOfInt2 = this.w;
    if (bool1) {
      i = arrayOfInt2[1];
      b = arrayOfInt1[1];
      i = paramInt1 - i;
    } else {
      b = 0;
      i = paramInt1;
    } 
    int k = getScrollY();
    int j = getScrollRange();
    paramInt1 = getOverScrollMode();
    if ((paramInt1 == 0 || (paramInt1 == 1 && getScrollRange() > 0)) && !paramBoolean) {
      bool = true;
    } else {
      bool = false;
    } 
    if (p(i, 0, k, j) && !m111.f(paramInt4)) {
      paramInt1 = 1;
    } else {
      paramInt1 = 0;
    } 
    int m = getScrollY() - k;
    if (paramMotionEvent != null && m != 0) {
      kj1 kj11 = getScrollFeedbackProvider();
      int i1 = paramMotionEvent.getDeviceId();
      int n = paramMotionEvent.getSource();
      kj11.a.onScrollProgress(i1, n, paramInt2, m);
    } 
    arrayOfInt2[1] = 0;
    this.B.d(0, m, 0, i - m, this.v, paramInt4, arrayOfInt2);
    m = arrayOfInt1[1];
    i -= arrayOfInt2[1];
    k += i;
    EdgeEffect edgeEffect2 = this.h;
    EdgeEffect edgeEffect1 = this.g;
    if (k < 0) {
      if (bool) {
        wf2.K(edgeEffect1, -i / getHeight(), paramInt3 / getWidth());
        if (paramMotionEvent != null) {
          kj1 kj11 = getScrollFeedbackProvider();
          i = paramMotionEvent.getDeviceId();
          paramInt3 = paramMotionEvent.getSource();
          kj11.a.h(i, true, paramInt3, paramInt2);
        } 
        if (!edgeEffect2.isFinished())
          edgeEffect2.onRelease(); 
      } 
    } else if (k > j && bool) {
      wf2.K(edgeEffect2, i / getHeight(), 1.0F - paramInt3 / getWidth());
      if (paramMotionEvent != null) {
        kj1 kj11 = getScrollFeedbackProvider();
        i = paramMotionEvent.getDeviceId();
        paramInt3 = paramMotionEvent.getSource();
        kj11.a.h(i, false, paramInt3, paramInt2);
      } 
      if (!edgeEffect1.isFinished())
        edgeEffect1.onRelease(); 
    } 
    if (!edgeEffect1.isFinished() || !edgeEffect2.isFinished()) {
      postInvalidateOnAnimation();
      paramInt1 = 0;
    } 
    if (paramInt1 != 0 && paramInt4 == 0) {
      VelocityTracker velocityTracker = this.o;
      if (velocityTracker != null)
        velocityTracker.clear(); 
    } 
    if (paramInt4 == 1) {
      w(paramInt4);
      edgeEffect1.onRelease();
      edgeEffect2.onRelease();
    } 
    return b + m;
  }
  
  public final void scrollTo(int paramInt1, int paramInt2) {
    if (getChildCount() > 0) {
      int i;
      View view = getChildAt(0);
      FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams)view.getLayoutParams();
      int n = getWidth() - getPaddingLeft() - getPaddingRight();
      int m = view.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
      int k = getHeight() - getPaddingTop() - getPaddingBottom();
      int j = view.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
      if (n >= m || paramInt1 < 0) {
        i = 0;
      } else {
        i = paramInt1;
        if (n + paramInt1 > m)
          i = m - n; 
      } 
      if (k >= j || paramInt2 < 0) {
        paramInt1 = 0;
      } else {
        paramInt1 = paramInt2;
        if (k + paramInt2 > j)
          paramInt1 = j - k; 
      } 
      if (i != getScrollX() || paramInt1 != getScrollY())
        super.scrollTo(i, paramInt1); 
    } 
  }
  
  public void setFillViewport(boolean paramBoolean) {
    if (paramBoolean != this.p) {
      this.p = paramBoolean;
      requestLayout();
    } 
  }
  
  public void setNestedScrollingEnabled(boolean paramBoolean) {
    m11 m111 = this.B;
    if (m111.d) {
      ViewGroup viewGroup = m111.c;
      WeakHashMap weakHashMap = v22.a;
      viewGroup.stopNestedScroll();
    } 
    m111.d = paramBoolean;
  }
  
  public void setOnScrollChangeListener(j11 paramj11) {}
  
  public void setSmoothScrollingEnabled(boolean paramBoolean) {
    this.q = paramBoolean;
  }
  
  public final boolean shouldDelayChildPressedState() {
    return true;
  }
  
  public final boolean startNestedScroll(int paramInt) {
    return this.B.g(paramInt, 0);
  }
  
  public final void stopNestedScroll() {
    w(0);
  }
  
  public final boolean t(EdgeEffect paramEdgeEffect, int paramInt) {
    if (paramInt > 0)
      return true; 
    float f4 = wf2.x(paramEdgeEffect);
    float f3 = getHeight();
    float f2 = Math.abs(-paramInt);
    float f1 = this.b * 0.015F;
    double d1 = Math.log((f2 * 0.35F / f1));
    double d3 = E;
    double d2 = f1;
    return ((float)(Math.exp(d3 / (d3 - 1.0D) * d1) * d2) < f4 * f3);
  }
  
  public final void u(int paramInt1, int paramInt2, boolean paramBoolean) {
    if (getChildCount() == 0)
      return; 
    if (AnimationUtils.currentAnimationTimeMillis() - this.c > 250L) {
      View view = getChildAt(0);
      FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams)view.getLayoutParams();
      int m = view.getHeight();
      int k = layoutParams.topMargin;
      int j = layoutParams.bottomMargin;
      int i = getHeight();
      int n = getPaddingTop();
      int i1 = getPaddingBottom();
      paramInt1 = getScrollY();
      paramInt2 = Math.max(0, Math.min(paramInt2 + paramInt1, Math.max(0, m + k + j - i - n - i1)));
      i = getScrollX();
      this.f.startScroll(i, paramInt1, 0, paramInt2 - paramInt1, 250);
      if (paramBoolean) {
        this.B.g(2, 1);
      } else {
        w(1);
      } 
      this.y = getScrollY();
      postInvalidateOnAnimation();
    } else {
      OverScroller overScroller = this.f;
      if (!overScroller.isFinished()) {
        overScroller.abortAnimation();
        w(1);
      } 
      scrollBy(paramInt1, paramInt2);
    } 
    this.c = AnimationUtils.currentAnimationTimeMillis();
  }
  
  public final boolean v(MotionEvent paramMotionEvent) {
    boolean bool;
    EdgeEffect edgeEffect = this.g;
    if (wf2.x(edgeEffect) != 0.0F) {
      wf2.K(edgeEffect, 0.0F, paramMotionEvent.getX() / getWidth());
      bool = true;
    } else {
      bool = false;
    } 
    edgeEffect = this.h;
    if (wf2.x(edgeEffect) != 0.0F) {
      wf2.K(edgeEffect, 0.0F, 1.0F - paramMotionEvent.getX() / getWidth());
      return true;
    } 
    return bool;
  }
  
  public final void w(int paramInt) {
    this.B.h(paramInt);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\androidx\core\widget\NestedScrollView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
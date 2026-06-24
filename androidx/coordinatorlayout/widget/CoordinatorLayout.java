package androidx.coordinatorlayout.widget;

import a91;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import d32;
import es;
import fs;
import gc1;
import gh1;
import gs;
import hs;
import ij;
import is;
import j;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.WeakHashMap;
import js;
import ks;
import m22;
import n11;
import n2;
import o11;
import org.jaudiotagger.audio.dsf.qdA.GMDx;
import p11;
import s31;
import tp;
import v22;
import x62;
import z81;
import zm1;

public class CoordinatorLayout extends ViewGroup implements n11, o11 {
  public static final String v;
  
  public static final Class[] w;
  
  public static final ThreadLocal x;
  
  public static final ij y = new ij(5);
  
  public static final a91 z;
  
  public final ArrayList b;
  
  public final n2 c;
  
  public final ArrayList e;
  
  public final ArrayList f;
  
  public final int[] g;
  
  public final int[] h;
  
  public boolean i;
  
  public boolean j;
  
  public final int[] k;
  
  public View l;
  
  public View m;
  
  public js n;
  
  public boolean o;
  
  public x62 p;
  
  public boolean q;
  
  public Drawable r;
  
  public ViewGroup.OnHierarchyChangeListener s;
  
  public gh1 t;
  
  public final p11 u;
  
  static {
    w = new Class[] { Context.class, AttributeSet.class };
    x = new ThreadLocal();
    z = new a91(12);
  }
  
  public CoordinatorLayout(Context paramContext) {
    this(paramContext, null);
  }
  
  public CoordinatorLayout(Context paramContext, AttributeSet paramAttributeSet) {
    this(paramContext, paramAttributeSet, 2130969009);
  }
  
  public CoordinatorLayout(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(paramContext, paramAttributeSet, paramInt);
    TypedArray typedArray;
    this.b = new ArrayList();
    this.c = new n2(2);
    this.e = new ArrayList();
    this.f = new ArrayList();
    this.g = new int[2];
    this.h = new int[2];
    this.u = (p11)new Object();
    boolean bool = false;
    int[] arrayOfInt = gc1.a;
    if (paramInt == 0) {
      typedArray = paramContext.obtainStyledAttributes(paramAttributeSet, arrayOfInt, 0, 2131952966);
    } else {
      typedArray = paramContext.obtainStyledAttributes(paramAttributeSet, arrayOfInt, paramInt, 0);
    } 
    if (Build.VERSION.SDK_INT >= 29)
      if (paramInt == 0) {
        saveAttributeDataForStyleable(paramContext, arrayOfInt, paramAttributeSet, typedArray, 0, 2131952966);
      } else {
        saveAttributeDataForStyleable(paramContext, arrayOfInt, paramAttributeSet, typedArray, paramInt, 0);
      }  
    paramInt = typedArray.getResourceId(0, 0);
    if (paramInt != 0) {
      Resources resources = paramContext.getResources();
      int[] arrayOfInt1 = resources.getIntArray(paramInt);
      this.k = arrayOfInt1;
      float f = (resources.getDisplayMetrics()).density;
      int i = arrayOfInt1.length;
      for (paramInt = bool; paramInt < i; paramInt++) {
        int[] arrayOfInt2 = this.k;
        arrayOfInt2[paramInt] = (int)(arrayOfInt2[paramInt] * f);
      } 
    } 
    this.r = typedArray.getDrawable(1);
    typedArray.recycle();
    y();
    super.setOnHierarchyChangeListener((ViewGroup.OnHierarchyChangeListener)new hs(this));
    WeakHashMap weakHashMap = v22.a;
    if (getImportantForAccessibility() == 0)
      setImportantForAccessibility(1); 
  }
  
  public static Rect g() {
    Rect rect2 = (Rect)z.b();
    Rect rect1 = rect2;
    if (rect2 == null)
      rect1 = new Rect(); 
    return rect1;
  }
  
  public static void m(int paramInt1, Rect paramRect1, Rect paramRect2, is paramis, int paramInt2, int paramInt3) {
    int j = paramis.c;
    int i = j;
    if (j == 0)
      i = 17; 
    int k = Gravity.getAbsoluteGravity(i, paramInt1);
    j = paramis.d;
    i = j;
    if ((j & 0x7) == 0)
      i = j | 0x800003; 
    j = i;
    if ((i & 0x70) == 0)
      j = i | 0x30; 
    paramInt1 = Gravity.getAbsoluteGravity(j, paramInt1);
    int m = k & 0x7;
    k &= 0x70;
    j = paramInt1 & 0x7;
    i = paramInt1 & 0x70;
    if (j != 1) {
      if (j != 5) {
        paramInt1 = paramRect1.left;
      } else {
        paramInt1 = paramRect1.right;
      } 
    } else {
      paramInt1 = paramRect1.left + paramRect1.width() / 2;
    } 
    if (i != 16) {
      if (i != 80) {
        i = paramRect1.top;
      } else {
        i = paramRect1.bottom;
      } 
    } else {
      i = paramRect1.top + paramRect1.height() / 2;
    } 
    if (m != 1) {
      j = paramInt1;
      if (m != 5)
        j = paramInt1 - paramInt2; 
    } else {
      j = paramInt1 - paramInt2 / 2;
    } 
    if (k != 16) {
      paramInt1 = i;
      if (k != 80)
        paramInt1 = i - paramInt3; 
    } else {
      paramInt1 = i - paramInt3 / 2;
    } 
    paramRect2.set(j, paramInt1, paramInt2 + j, paramInt3 + paramInt1);
  }
  
  public static is o(View paramView) {
    is is = (is)paramView.getLayoutParams();
    if (!is.b) {
      gs gs;
      if (paramView instanceof es) {
        fs = ((es)paramView).getBehavior();
        if (fs == null)
          Log.e("CoordinatorLayout", "Attached behavior class is null"); 
        is.b(fs);
        is.b = true;
        return is;
      } 
      Class<?> clazz = fs.getClass();
      fs fs = null;
      while (clazz != null) {
        gs gs1 = clazz.<gs>getAnnotation(gs.class);
        gs = gs1;
        if (gs1 == null) {
          clazz = clazz.getSuperclass();
          gs = gs1;
        } 
      } 
      if (gs != null)
        try {
          is.b(gs.value().getDeclaredConstructor(null).newInstance(null));
        } catch (Exception exception) {
          StringBuilder stringBuilder = new StringBuilder("Default behavior class ");
          stringBuilder.append(gs.value().getName());
          stringBuilder.append(" could not be instantiated. Did you forget a default constructor?");
          Log.e("CoordinatorLayout", stringBuilder.toString(), exception);
        }  
      is.b = true;
    } 
    return is;
  }
  
  public static void w(View paramView, int paramInt) {
    is is = (is)paramView.getLayoutParams();
    int i = is.i;
    if (i != paramInt) {
      WeakHashMap weakHashMap = v22.a;
      paramView.offsetLeftAndRight(paramInt - i);
      is.i = paramInt;
    } 
  }
  
  public static void x(View paramView, int paramInt) {
    is is = (is)paramView.getLayoutParams();
    int i = is.j;
    if (i != paramInt) {
      WeakHashMap weakHashMap = v22.a;
      paramView.offsetTopAndBottom(paramInt - i);
      is.j = paramInt;
    } 
  }
  
  public final void a(View paramView1, View paramView2, int paramInt1, int paramInt2) {
    p11 p111 = this.u;
    if (paramInt2 == 1) {
      p111.b = paramInt1;
    } else {
      p111.a = paramInt1;
    } 
    this.m = paramView2;
    paramInt2 = getChildCount();
    for (paramInt1 = 0; paramInt1 < paramInt2; paramInt1++)
      ((is)getChildAt(paramInt1).getLayoutParams()).getClass(); 
  }
  
  public final void b(View paramView, int paramInt) {
    p11 p111 = this.u;
    if (paramInt == 1) {
      p111.b = 0;
    } else {
      p111.a = 0;
    } 
    int i = getChildCount();
    for (byte b = 0; b < i; b++) {
      View view = getChildAt(b);
      is is = (is)view.getLayoutParams();
      if (is.a(paramInt)) {
        fs fs = is.a;
        if (fs != null)
          fs.u(this, view, paramView, paramInt); 
        if (paramInt != 0) {
          if (paramInt == 1)
            is.n = false; 
        } else {
          is.m = false;
        } 
        is.o = false;
      } 
    } 
    this.m = null;
  }
  
  public final void c(View paramView, int paramInt1, int paramInt2, int[] paramArrayOfint, int paramInt3) {
    int m = getChildCount();
    boolean bool = false;
    byte b = 0;
    int i = b;
    int j = i;
    int k = i;
    while (b < m) {
      int n;
      View view = getChildAt(b);
      if (view.getVisibility() == 8) {
        n = k;
        i = j;
      } else {
        is is = (is)view.getLayoutParams();
        if (!is.a(paramInt3)) {
          n = k;
          i = j;
        } else {
          fs fs = is.a;
          n = k;
          i = j;
          if (fs != null) {
            int[] arrayOfInt = this.g;
            arrayOfInt[0] = 0;
            arrayOfInt[1] = 0;
            fs.o(this, view, paramView, paramInt1, paramInt2, arrayOfInt, paramInt3);
            if (paramInt1 > 0) {
              i = Math.max(k, arrayOfInt[0]);
            } else {
              i = Math.min(k, arrayOfInt[0]);
            } 
            n = i;
            if (paramInt2 > 0) {
              i = Math.max(j, arrayOfInt[1]);
            } else {
              i = Math.min(j, arrayOfInt[1]);
            } 
            bool = true;
          } 
        } 
      } 
      b++;
      k = n;
      j = i;
    } 
    paramArrayOfint[0] = k;
    paramArrayOfint[1] = j;
    if (bool)
      q(1); 
  }
  
  public final boolean checkLayoutParams(ViewGroup.LayoutParams paramLayoutParams) {
    return (paramLayoutParams instanceof is && super.checkLayoutParams(paramLayoutParams));
  }
  
  public final void d(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int[] paramArrayOfint) {
    int m = getChildCount();
    byte b = 0;
    int k = 0;
    paramInt1 = k;
    int j = paramInt1;
    int i;
    for (i = paramInt1; b < m; i = n) {
      int n;
      paramView = getChildAt(b);
      if (paramView.getVisibility() == 8) {
        paramInt1 = k;
        n = i;
      } else {
        is is = (is)paramView.getLayoutParams();
        if (!is.a(paramInt5)) {
          paramInt1 = k;
          n = i;
        } else {
          fs fs = is.a;
          paramInt1 = k;
          n = i;
          if (fs != null) {
            int[] arrayOfInt = this.g;
            arrayOfInt[0] = 0;
            arrayOfInt[1] = 0;
            fs.p(this, paramView, paramInt2, paramInt3, paramInt4, arrayOfInt);
            if (paramInt3 > 0) {
              paramInt1 = Math.max(k, arrayOfInt[0]);
            } else {
              paramInt1 = Math.min(k, arrayOfInt[0]);
            } 
            if (paramInt4 > 0) {
              i = Math.max(i, arrayOfInt[1]);
            } else {
              i = Math.min(i, arrayOfInt[1]);
            } 
            j = 1;
            n = i;
          } 
        } 
      } 
      b++;
      k = paramInt1;
    } 
    paramArrayOfint[0] = paramArrayOfint[0] + k;
    paramArrayOfint[1] = paramArrayOfint[1] + i;
    if (j != 0)
      q(1); 
  }
  
  public final boolean drawChild(Canvas paramCanvas, View paramView, long paramLong) {
    fs fs = ((is)paramView.getLayoutParams()).a;
    if (fs != null)
      fs.getClass(); 
    return super.drawChild(paramCanvas, paramView, paramLong);
  }
  
  public final void drawableStateChanged() {
    boolean bool;
    super.drawableStateChanged();
    int[] arrayOfInt = getDrawableState();
    Drawable drawable = this.r;
    if (drawable != null && drawable.isStateful()) {
      bool = drawable.setState(arrayOfInt);
    } else {
      bool = false;
    } 
    if (bool)
      invalidate(); 
  }
  
  public final void e(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    d(paramView, paramInt1, paramInt2, paramInt3, paramInt4, 0, this.h);
  }
  
  public final boolean f(View paramView1, View paramView2, int paramInt1, int paramInt2) {
    int i = getChildCount();
    byte b = 0;
    boolean bool = false;
    paramView2 = paramView1;
    CoordinatorLayout coordinatorLayout = this;
    while (b < i) {
      View view = coordinatorLayout.getChildAt(b);
      if (view.getVisibility() != 8) {
        is is = (is)view.getLayoutParams();
        fs fs = is.a;
        if (fs != null) {
          boolean bool1 = fs.t(coordinatorLayout, view, paramView2, paramInt1, paramInt2);
          bool |= bool1;
          if (paramInt2 != 0) {
            if (paramInt2 == 1)
              is.n = bool1; 
          } else {
            is.m = bool1;
          } 
        } else if (paramInt2 != 0) {
          if (paramInt2 == 1)
            is.n = false; 
        } else {
          is.m = false;
        } 
      } 
      b++;
    } 
    return bool;
  }
  
  public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
    return (ViewGroup.LayoutParams)new is();
  }
  
  public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet paramAttributeSet) {
    return (ViewGroup.LayoutParams)new is(getContext(), paramAttributeSet);
  }
  
  public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams paramLayoutParams) {
    return (ViewGroup.LayoutParams)((paramLayoutParams instanceof is) ? new is((is)paramLayoutParams) : ((paramLayoutParams instanceof ViewGroup.MarginLayoutParams) ? new is((ViewGroup.MarginLayoutParams)paramLayoutParams) : new is(paramLayoutParams)));
  }
  
  public final List<View> getDependencySortedChildren() {
    u();
    return Collections.unmodifiableList(this.b);
  }
  
  public final x62 getLastWindowInsets() {
    return this.p;
  }
  
  public int getNestedScrollAxes() {
    p11 p111 = this.u;
    int i = p111.a;
    return p111.b | i;
  }
  
  public Drawable getStatusBarBackground() {
    return this.r;
  }
  
  public int getSuggestedMinimumHeight() {
    int j = super.getSuggestedMinimumHeight();
    int i = getPaddingTop();
    return Math.max(j, getPaddingBottom() + i);
  }
  
  public int getSuggestedMinimumWidth() {
    int j = super.getSuggestedMinimumWidth();
    int i = getPaddingLeft();
    return Math.max(j, getPaddingRight() + i);
  }
  
  public final void h(is paramis, Rect paramRect, int paramInt1, int paramInt2) {
    int j = getWidth();
    int i = getHeight();
    j = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams)paramis).leftMargin, Math.min(paramRect.left, j - getPaddingRight() - paramInt1 - ((ViewGroup.MarginLayoutParams)paramis).rightMargin));
    i = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams)paramis).topMargin, Math.min(paramRect.top, i - getPaddingBottom() - paramInt2 - ((ViewGroup.MarginLayoutParams)paramis).bottomMargin));
    paramRect.set(j, i, paramInt1 + j, paramInt2 + i);
  }
  
  public final void i(View paramView) {
    List<View> list = (List)((zm1)this.c.e).get(paramView);
    if (list != null && !list.isEmpty())
      for (byte b = 0; b < list.size(); b++) {
        View view = list.get(b);
        fs fs = ((is)view.getLayoutParams()).a;
        if (fs != null)
          fs.h(this, view, paramView); 
      }  
  }
  
  public final void j(View paramView, Rect paramRect, boolean paramBoolean) {
    if (paramView.isLayoutRequested() || paramView.getVisibility() == 8) {
      paramRect.setEmpty();
      return;
    } 
    if (paramBoolean) {
      l(paramView, paramRect);
      return;
    } 
    paramRect.set(paramView.getLeft(), paramView.getTop(), paramView.getRight(), paramView.getBottom());
  }
  
  public final ArrayList k(View paramView) {
    zm1 zm1 = (zm1)this.c.e;
    int i = zm1.e;
    ArrayList<Object> arrayList2 = null;
    byte b = 0;
    while (b < i) {
      ArrayList arrayList3 = (ArrayList)zm1.i(b);
      ArrayList<Object> arrayList = arrayList2;
      if (arrayList3 != null) {
        arrayList = arrayList2;
        if (arrayList3.contains(paramView)) {
          arrayList = arrayList2;
          if (arrayList2 == null)
            arrayList = new ArrayList(); 
          arrayList.add(zm1.f(b));
        } 
      } 
      b++;
      arrayList2 = arrayList;
    } 
    ArrayList<Object> arrayList1 = this.f;
    arrayList1.clear();
    if (arrayList2 != null)
      arrayList1.addAll(arrayList2); 
    return arrayList1;
  }
  
  public final void l(View paramView, Rect paramRect) {
    ThreadLocal threadLocal = d32.a;
    paramRect.set(0, 0, paramView.getWidth(), paramView.getHeight());
    ThreadLocal<Matrix> threadLocal1 = d32.a;
    Matrix matrix = threadLocal1.get();
    if (matrix == null) {
      matrix = new Matrix();
      threadLocal1.set(matrix);
    } else {
      matrix.reset();
    } 
    d32.a(this, paramView, matrix);
    ThreadLocal<RectF> threadLocal2 = d32.b;
    RectF rectF2 = threadLocal2.get();
    RectF rectF1 = rectF2;
    if (rectF2 == null) {
      rectF1 = new RectF();
      threadLocal2.set(rectF1);
    } 
    rectF1.set(paramRect);
    matrix.mapRect(rectF1);
    paramRect.set((int)(rectF1.left + 0.5F), (int)(rectF1.top + 0.5F), (int)(rectF1.right + 0.5F), (int)(rectF1.bottom + 0.5F));
  }
  
  public final int n(int paramInt) {
    StringBuilder stringBuilder;
    int[] arrayOfInt = this.k;
    if (arrayOfInt == null) {
      stringBuilder = new StringBuilder("No keylines defined for ");
      stringBuilder.append(this);
      stringBuilder.append(GMDx.UcqY);
      stringBuilder.append(paramInt);
      Log.e("CoordinatorLayout", stringBuilder.toString());
      return 0;
    } 
    if (paramInt < 0 || paramInt >= stringBuilder.length) {
      stringBuilder = new StringBuilder("Keyline index ");
      stringBuilder.append(paramInt);
      stringBuilder.append(" out of range for ");
      stringBuilder.append(this);
      Log.e("CoordinatorLayout", stringBuilder.toString());
      return 0;
    } 
    return stringBuilder[paramInt];
  }
  
  public final void onAttachedToWindow() {
    super.onAttachedToWindow();
    v(false);
    if (this.o) {
      if (this.n == null)
        this.n = new js(this, 0); 
      getViewTreeObserver().addOnPreDrawListener((ViewTreeObserver.OnPreDrawListener)this.n);
    } 
    if (this.p == null) {
      WeakHashMap weakHashMap = v22.a;
      if (getFitsSystemWindows())
        requestApplyInsets(); 
    } 
    this.j = true;
  }
  
  public final void onDetachedFromWindow() {
    super.onDetachedFromWindow();
    v(false);
    if (this.o && this.n != null)
      getViewTreeObserver().removeOnPreDrawListener((ViewTreeObserver.OnPreDrawListener)this.n); 
    View view = this.m;
    if (view != null)
      b(view, 0); 
    this.j = false;
  }
  
  public final void onDraw(Canvas paramCanvas) {
    super.onDraw(paramCanvas);
    if (this.q && this.r != null) {
      boolean bool;
      x62 x621 = this.p;
      if (x621 != null) {
        bool = x621.d();
      } else {
        bool = false;
      } 
      if (bool) {
        this.r.setBounds(0, 0, getWidth(), bool);
        this.r.draw(paramCanvas);
      } 
    } 
  }
  
  public final boolean onInterceptTouchEvent(MotionEvent paramMotionEvent) {
    int i = paramMotionEvent.getActionMasked();
    if (i == 0)
      v(true); 
    boolean bool = t(paramMotionEvent, 0);
    if (i == 1 || i == 3) {
      v(true);
      return bool;
    } 
    return bool;
  }
  
  public final void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    WeakHashMap weakHashMap = v22.a;
    paramInt2 = getLayoutDirection();
    ArrayList<View> arrayList = this.b;
    paramInt3 = arrayList.size();
    for (paramInt1 = 0; paramInt1 < paramInt3; paramInt1++) {
      View view = arrayList.get(paramInt1);
      if (view.getVisibility() != 8) {
        fs fs = ((is)view.getLayoutParams()).a;
        if (fs == null || !fs.l(this, view, paramInt2))
          r(view, paramInt2); 
      } 
    } 
  }
  
  public final void onMeasure(int paramInt1, int paramInt2) {
    // Byte code:
    //   0: aload_0
    //   1: astore #29
    //   3: aload #29
    //   5: invokevirtual u : ()V
    //   8: aload #29
    //   10: invokevirtual getChildCount : ()I
    //   13: istore #5
    //   15: iconst_0
    //   16: istore_3
    //   17: iload_3
    //   18: iload #5
    //   20: if_icmpge -> 106
    //   23: aload #29
    //   25: iload_3
    //   26: invokevirtual getChildAt : (I)Landroid/view/View;
    //   29: astore #28
    //   31: aload #29
    //   33: getfield c : Ln2;
    //   36: getfield e : Ljava/lang/Object;
    //   39: checkcast zm1
    //   42: astore #30
    //   44: aload #30
    //   46: getfield e : I
    //   49: istore #6
    //   51: iconst_0
    //   52: istore #4
    //   54: iload #4
    //   56: iload #6
    //   58: if_icmpge -> 100
    //   61: aload #30
    //   63: iload #4
    //   65: invokevirtual i : (I)Ljava/lang/Object;
    //   68: checkcast java/util/ArrayList
    //   71: astore #31
    //   73: aload #31
    //   75: ifnull -> 94
    //   78: aload #31
    //   80: aload #28
    //   82: invokevirtual contains : (Ljava/lang/Object;)Z
    //   85: ifeq -> 94
    //   88: iconst_1
    //   89: istore #26
    //   91: goto -> 109
    //   94: iinc #4, 1
    //   97: goto -> 54
    //   100: iinc #3, 1
    //   103: goto -> 17
    //   106: iconst_0
    //   107: istore #26
    //   109: iload #26
    //   111: aload #29
    //   113: getfield o : Z
    //   116: if_icmpeq -> 213
    //   119: aload #29
    //   121: getfield j : Z
    //   124: istore #27
    //   126: iload #26
    //   128: ifeq -> 181
    //   131: iload #27
    //   133: ifeq -> 172
    //   136: aload #29
    //   138: getfield n : Ljs;
    //   141: ifnonnull -> 159
    //   144: aload #29
    //   146: new js
    //   149: dup
    //   150: aload #29
    //   152: iconst_0
    //   153: invokespecial <init> : (Landroid/view/ViewGroup;I)V
    //   156: putfield n : Ljs;
    //   159: aload #29
    //   161: invokevirtual getViewTreeObserver : ()Landroid/view/ViewTreeObserver;
    //   164: aload #29
    //   166: getfield n : Ljs;
    //   169: invokevirtual addOnPreDrawListener : (Landroid/view/ViewTreeObserver$OnPreDrawListener;)V
    //   172: aload #29
    //   174: iconst_1
    //   175: putfield o : Z
    //   178: goto -> 213
    //   181: iload #27
    //   183: ifeq -> 207
    //   186: aload #29
    //   188: getfield n : Ljs;
    //   191: ifnull -> 207
    //   194: aload #29
    //   196: invokevirtual getViewTreeObserver : ()Landroid/view/ViewTreeObserver;
    //   199: aload #29
    //   201: getfield n : Ljs;
    //   204: invokevirtual removeOnPreDrawListener : (Landroid/view/ViewTreeObserver$OnPreDrawListener;)V
    //   207: aload #29
    //   209: iconst_0
    //   210: putfield o : Z
    //   213: aload #29
    //   215: invokevirtual getPaddingLeft : ()I
    //   218: istore #15
    //   220: aload #29
    //   222: invokevirtual getPaddingTop : ()I
    //   225: istore #18
    //   227: aload #29
    //   229: invokevirtual getPaddingRight : ()I
    //   232: istore #16
    //   234: aload #29
    //   236: invokevirtual getPaddingBottom : ()I
    //   239: istore #19
    //   241: getstatic v22.a : Ljava/util/WeakHashMap;
    //   244: astore #28
    //   246: aload #29
    //   248: invokevirtual getLayoutDirection : ()I
    //   251: istore #20
    //   253: iload #20
    //   255: iconst_1
    //   256: if_icmpne -> 265
    //   259: iconst_1
    //   260: istore #7
    //   262: goto -> 268
    //   265: iconst_0
    //   266: istore #7
    //   268: iload_1
    //   269: invokestatic getMode : (I)I
    //   272: istore #21
    //   274: iload_1
    //   275: invokestatic getSize : (I)I
    //   278: istore #22
    //   280: iload_2
    //   281: invokestatic getMode : (I)I
    //   284: istore #23
    //   286: iload_2
    //   287: invokestatic getSize : (I)I
    //   290: istore #24
    //   292: aload #29
    //   294: invokevirtual getSuggestedMinimumWidth : ()I
    //   297: istore #5
    //   299: aload #29
    //   301: invokevirtual getSuggestedMinimumHeight : ()I
    //   304: istore #10
    //   306: aload #29
    //   308: getfield p : Lx62;
    //   311: ifnull -> 328
    //   314: aload #29
    //   316: invokevirtual getFitsSystemWindows : ()Z
    //   319: ifeq -> 328
    //   322: iconst_1
    //   323: istore #8
    //   325: goto -> 331
    //   328: iconst_0
    //   329: istore #8
    //   331: aload #29
    //   333: getfield b : Ljava/util/ArrayList;
    //   336: astore #28
    //   338: aload #28
    //   340: invokevirtual size : ()I
    //   343: istore_3
    //   344: iconst_0
    //   345: istore #9
    //   347: iconst_0
    //   348: istore #12
    //   350: iload #16
    //   352: istore #6
    //   354: iload #15
    //   356: istore #4
    //   358: iload #4
    //   360: istore #11
    //   362: iload #9
    //   364: iload_3
    //   365: if_icmpge -> 785
    //   368: aload #28
    //   370: iload #9
    //   372: invokevirtual get : (I)Ljava/lang/Object;
    //   375: checkcast android/view/View
    //   378: astore #30
    //   380: aload #30
    //   382: invokevirtual getVisibility : ()I
    //   385: bipush #8
    //   387: if_icmpne -> 396
    //   390: iload_3
    //   391: istore #4
    //   393: goto -> 775
    //   396: aload #30
    //   398: invokevirtual getLayoutParams : ()Landroid/view/ViewGroup$LayoutParams;
    //   401: checkcast is
    //   404: astore #31
    //   406: aload #31
    //   408: getfield e : I
    //   411: istore #4
    //   413: iload #4
    //   415: iflt -> 547
    //   418: iload #21
    //   420: ifeq -> 547
    //   423: aload #29
    //   425: iload #4
    //   427: invokevirtual n : (I)I
    //   430: istore #14
    //   432: aload #31
    //   434: getfield c : I
    //   437: istore #13
    //   439: iload #13
    //   441: istore #4
    //   443: iload #13
    //   445: ifne -> 453
    //   448: ldc_w 8388661
    //   451: istore #4
    //   453: iload #4
    //   455: iload #20
    //   457: invokestatic getAbsoluteGravity : (II)I
    //   460: bipush #7
    //   462: iand
    //   463: istore #4
    //   465: iload #4
    //   467: iconst_3
    //   468: if_icmpne -> 476
    //   471: iload #7
    //   473: ifeq -> 487
    //   476: iload #4
    //   478: iconst_5
    //   479: if_icmpne -> 508
    //   482: iload #7
    //   484: ifeq -> 508
    //   487: iconst_0
    //   488: iload #22
    //   490: iload #6
    //   492: isub
    //   493: iload #14
    //   495: isub
    //   496: invokestatic max : (II)I
    //   499: istore #4
    //   501: iload #4
    //   503: istore #13
    //   505: goto -> 553
    //   508: iload #4
    //   510: iconst_5
    //   511: if_icmpne -> 519
    //   514: iload #7
    //   516: ifeq -> 530
    //   519: iload #4
    //   521: iconst_3
    //   522: if_icmpne -> 544
    //   525: iload #7
    //   527: ifeq -> 544
    //   530: iconst_0
    //   531: iload #14
    //   533: iload #11
    //   535: isub
    //   536: invokestatic max : (II)I
    //   539: istore #4
    //   541: goto -> 501
    //   544: goto -> 550
    //   547: goto -> 544
    //   550: iconst_0
    //   551: istore #13
    //   553: iload #8
    //   555: ifeq -> 639
    //   558: aload #30
    //   560: invokevirtual getFitsSystemWindows : ()Z
    //   563: ifne -> 639
    //   566: aload #29
    //   568: getfield p : Lx62;
    //   571: invokevirtual b : ()I
    //   574: istore #4
    //   576: aload #29
    //   578: getfield p : Lx62;
    //   581: invokevirtual c : ()I
    //   584: istore #25
    //   586: aload #29
    //   588: getfield p : Lx62;
    //   591: invokevirtual d : ()I
    //   594: istore #17
    //   596: aload #29
    //   598: getfield p : Lx62;
    //   601: invokevirtual a : ()I
    //   604: istore #14
    //   606: iload #22
    //   608: iload #25
    //   610: iload #4
    //   612: iadd
    //   613: isub
    //   614: iload #21
    //   616: invokestatic makeMeasureSpec : (II)I
    //   619: istore #4
    //   621: iload #24
    //   623: iload #14
    //   625: iload #17
    //   627: iadd
    //   628: isub
    //   629: iload #23
    //   631: invokestatic makeMeasureSpec : (II)I
    //   634: istore #14
    //   636: goto -> 645
    //   639: iload_1
    //   640: istore #4
    //   642: iload_2
    //   643: istore #14
    //   645: iload_3
    //   646: istore #17
    //   648: aload #31
    //   650: getfield a : Lfs;
    //   653: astore #29
    //   655: aload #29
    //   657: ifnull -> 687
    //   660: aload #29
    //   662: aload_0
    //   663: aload #30
    //   665: iload #4
    //   667: iload #13
    //   669: iload #14
    //   671: invokevirtual m : (Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;III)Z
    //   674: istore #26
    //   676: iload #26
    //   678: ifne -> 684
    //   681: goto -> 687
    //   684: goto -> 700
    //   687: aload_0
    //   688: aload #30
    //   690: iload #4
    //   692: iload #13
    //   694: iload #14
    //   696: iconst_0
    //   697: invokevirtual measureChildWithMargins : (Landroid/view/View;IIII)V
    //   700: aload_0
    //   701: astore #29
    //   703: iload #5
    //   705: aload #30
    //   707: invokevirtual getMeasuredWidth : ()I
    //   710: iload #15
    //   712: iload #16
    //   714: iadd
    //   715: iadd
    //   716: aload #31
    //   718: getfield leftMargin : I
    //   721: iadd
    //   722: aload #31
    //   724: getfield rightMargin : I
    //   727: iadd
    //   728: invokestatic max : (II)I
    //   731: istore #5
    //   733: iload #10
    //   735: aload #30
    //   737: invokevirtual getMeasuredHeight : ()I
    //   740: iload #18
    //   742: iload #19
    //   744: iadd
    //   745: iadd
    //   746: aload #31
    //   748: getfield topMargin : I
    //   751: iadd
    //   752: aload #31
    //   754: getfield bottomMargin : I
    //   757: iadd
    //   758: invokestatic max : (II)I
    //   761: istore #10
    //   763: iload #12
    //   765: aload #30
    //   767: invokevirtual getMeasuredState : ()I
    //   770: invokestatic combineMeasuredStates : (II)I
    //   773: istore #12
    //   775: iinc #9, 1
    //   778: iload #11
    //   780: istore #4
    //   782: goto -> 358
    //   785: aload #29
    //   787: iload #5
    //   789: iload_1
    //   790: ldc_w -16777216
    //   793: iload #12
    //   795: iand
    //   796: invokestatic resolveSizeAndState : (III)I
    //   799: iload #10
    //   801: iload_2
    //   802: iload #12
    //   804: bipush #16
    //   806: ishl
    //   807: invokestatic resolveSizeAndState : (III)I
    //   810: invokevirtual setMeasuredDimension : (II)V
    //   813: return
  }
  
  public final boolean onNestedFling(View paramView, float paramFloat1, float paramFloat2, boolean paramBoolean) {
    int i = getChildCount();
    for (byte b = 0; b < i; b++) {
      paramView = getChildAt(b);
      if (paramView.getVisibility() != 8) {
        is is = (is)paramView.getLayoutParams();
        if (is.a(0))
          fs fs = is.a; 
      } 
    } 
    return false;
  }
  
  public final boolean onNestedPreFling(View paramView, float paramFloat1, float paramFloat2) {
    int i = getChildCount();
    byte b = 0;
    boolean bool;
    for (bool = false; b < i; bool = bool1) {
      boolean bool1;
      View view = getChildAt(b);
      if (view.getVisibility() == 8) {
        bool1 = bool;
      } else {
        is is = (is)view.getLayoutParams();
        if (!is.a(0)) {
          bool1 = bool;
        } else {
          fs fs = is.a;
          bool1 = bool;
          if (fs != null)
            bool1 = bool | fs.n(paramView); 
        } 
      } 
      b++;
    } 
    return bool;
  }
  
  public final void onNestedPreScroll(View paramView, int paramInt1, int paramInt2, int[] paramArrayOfint) {
    c(paramView, paramInt1, paramInt2, paramArrayOfint, 0);
  }
  
  public final void onNestedScroll(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    e(paramView, paramInt1, paramInt2, paramInt3, paramInt4, 0);
  }
  
  public final void onNestedScrollAccepted(View paramView1, View paramView2, int paramInt) {
    a(paramView1, paramView2, paramInt, 0);
  }
  
  public final void onRestoreInstanceState(Parcelable paramParcelable) {
    if (!(paramParcelable instanceof ks)) {
      super.onRestoreInstanceState(paramParcelable);
      return;
    } 
    ks ks = (ks)paramParcelable;
    super.onRestoreInstanceState(((j)ks).b);
    SparseArray sparseArray = ks.e;
    int i = getChildCount();
    for (byte b = 0; b < i; b++) {
      View view = getChildAt(b);
      int j = view.getId();
      fs fs = (o(view)).a;
      if (j != -1 && fs != null) {
        Parcelable parcelable = (Parcelable)sparseArray.get(j);
        if (parcelable != null)
          fs.r(this, view, parcelable); 
      } 
    } 
  }
  
  public final Parcelable onSaveInstanceState() {
    j j = new j(super.onSaveInstanceState());
    SparseArray sparseArray = new SparseArray();
    int i = getChildCount();
    for (byte b = 0; b < i; b++) {
      View view = getChildAt(b);
      int k = view.getId();
      fs fs = ((is)view.getLayoutParams()).a;
      if (k != -1 && fs != null) {
        Parcelable parcelable = fs.s(this, view);
        if (parcelable != null)
          sparseArray.append(k, parcelable); 
      } 
    } 
    ((ks)j).e = sparseArray;
    return (Parcelable)j;
  }
  
  public final boolean onStartNestedScroll(View paramView1, View paramView2, int paramInt) {
    return f(paramView1, paramView2, paramInt, 0);
  }
  
  public final void onStopNestedScroll(View paramView) {
    b(paramView, 0);
  }
  
  public final boolean onTouchEvent(MotionEvent paramMotionEvent) {
    // Byte code:
    //   0: aload_1
    //   1: invokevirtual getActionMasked : ()I
    //   4: istore_2
    //   5: aload_0
    //   6: getfield l : Landroid/view/View;
    //   9: ifnonnull -> 42
    //   12: aload_0
    //   13: aload_1
    //   14: iconst_1
    //   15: invokevirtual t : (Landroid/view/MotionEvent;I)Z
    //   18: istore_3
    //   19: iload_3
    //   20: istore #4
    //   22: iload_3
    //   23: ifeq -> 29
    //   26: goto -> 44
    //   29: iconst_0
    //   30: istore #5
    //   32: iload #4
    //   34: istore_3
    //   35: iload #5
    //   37: istore #4
    //   39: goto -> 80
    //   42: iconst_0
    //   43: istore_3
    //   44: aload_0
    //   45: getfield l : Landroid/view/View;
    //   48: invokevirtual getLayoutParams : ()Landroid/view/ViewGroup$LayoutParams;
    //   51: checkcast is
    //   54: getfield a : Lfs;
    //   57: astore #8
    //   59: iload_3
    //   60: istore #4
    //   62: aload #8
    //   64: ifnull -> 29
    //   67: aload #8
    //   69: aload_0
    //   70: aload_0
    //   71: getfield l : Landroid/view/View;
    //   74: aload_1
    //   75: invokevirtual v : (Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/MotionEvent;)Z
    //   78: istore #4
    //   80: aload_0
    //   81: getfield l : Landroid/view/View;
    //   84: astore #9
    //   86: aconst_null
    //   87: astore #8
    //   89: aload #9
    //   91: ifnonnull -> 110
    //   94: iload #4
    //   96: aload_0
    //   97: aload_1
    //   98: invokespecial onTouchEvent : (Landroid/view/MotionEvent;)Z
    //   101: ior
    //   102: istore #5
    //   104: aload #8
    //   106: astore_1
    //   107: goto -> 148
    //   110: iload #4
    //   112: istore #5
    //   114: aload #8
    //   116: astore_1
    //   117: iload_3
    //   118: ifeq -> 148
    //   121: invokestatic uptimeMillis : ()J
    //   124: lstore #6
    //   126: lload #6
    //   128: lload #6
    //   130: iconst_3
    //   131: fconst_0
    //   132: fconst_0
    //   133: iconst_0
    //   134: invokestatic obtain : (JJIFFI)Landroid/view/MotionEvent;
    //   137: astore_1
    //   138: aload_0
    //   139: aload_1
    //   140: invokespecial onTouchEvent : (Landroid/view/MotionEvent;)Z
    //   143: pop
    //   144: iload #4
    //   146: istore #5
    //   148: aload_1
    //   149: ifnull -> 156
    //   152: aload_1
    //   153: invokevirtual recycle : ()V
    //   156: iload_2
    //   157: iconst_1
    //   158: if_icmpeq -> 172
    //   161: iload_2
    //   162: iconst_3
    //   163: if_icmpne -> 169
    //   166: goto -> 172
    //   169: iload #5
    //   171: ireturn
    //   172: aload_0
    //   173: iconst_0
    //   174: invokevirtual v : (Z)V
    //   177: iload #5
    //   179: ireturn
  }
  
  public final boolean p(View paramView, int paramInt1, int paramInt2) {
    a91 a911 = z;
    Rect rect = g();
    l(paramView, rect);
    try {
      return rect.contains(paramInt1, paramInt2);
    } finally {
      rect.setEmpty();
      a911.a(rect);
    } 
  }
  
  public final void q(int paramInt) {
    // Byte code:
    //   0: getstatic v22.a : Ljava/util/WeakHashMap;
    //   3: astore #11
    //   5: aload_0
    //   6: invokevirtual getLayoutDirection : ()I
    //   9: istore #5
    //   11: aload_0
    //   12: getfield b : Ljava/util/ArrayList;
    //   15: astore #12
    //   17: aload #12
    //   19: invokevirtual size : ()I
    //   22: istore_2
    //   23: invokestatic g : ()Landroid/graphics/Rect;
    //   26: astore #17
    //   28: invokestatic g : ()Landroid/graphics/Rect;
    //   31: astore #16
    //   33: invokestatic g : ()Landroid/graphics/Rect;
    //   36: astore #11
    //   38: iconst_0
    //   39: istore_3
    //   40: getstatic androidx/coordinatorlayout/widget/CoordinatorLayout.z : La91;
    //   43: astore #15
    //   45: iload_3
    //   46: iload_2
    //   47: if_icmpge -> 1402
    //   50: aload #12
    //   52: iload_3
    //   53: invokevirtual get : (I)Ljava/lang/Object;
    //   56: checkcast android/view/View
    //   59: astore #14
    //   61: aload #14
    //   63: invokevirtual getLayoutParams : ()Landroid/view/ViewGroup$LayoutParams;
    //   66: checkcast is
    //   69: astore #13
    //   71: iload_1
    //   72: ifne -> 107
    //   75: aload #14
    //   77: invokevirtual getVisibility : ()I
    //   80: bipush #8
    //   82: if_icmpne -> 107
    //   85: aload #12
    //   87: astore #13
    //   89: aload #11
    //   91: astore #12
    //   93: iload_3
    //   94: istore #7
    //   96: aload #13
    //   98: astore #11
    //   100: iload #5
    //   102: istore #4
    //   104: goto -> 1378
    //   107: iconst_0
    //   108: istore #6
    //   110: iload_3
    //   111: istore #4
    //   113: iload #5
    //   115: istore_3
    //   116: iload #6
    //   118: iload #4
    //   120: if_icmpge -> 415
    //   123: aload #12
    //   125: iload #6
    //   127: invokevirtual get : (I)Ljava/lang/Object;
    //   130: checkcast android/view/View
    //   133: astore #18
    //   135: aload #13
    //   137: getfield l : Landroid/view/View;
    //   140: aload #18
    //   142: if_acmpne -> 409
    //   145: aload #14
    //   147: invokevirtual getLayoutParams : ()Landroid/view/ViewGroup$LayoutParams;
    //   150: checkcast is
    //   153: astore #19
    //   155: aload #19
    //   157: getfield k : Landroid/view/View;
    //   160: ifnull -> 409
    //   163: invokestatic g : ()Landroid/graphics/Rect;
    //   166: astore #21
    //   168: invokestatic g : ()Landroid/graphics/Rect;
    //   171: astore #20
    //   173: invokestatic g : ()Landroid/graphics/Rect;
    //   176: astore #18
    //   178: aload_0
    //   179: aload #19
    //   181: getfield k : Landroid/view/View;
    //   184: aload #21
    //   186: invokevirtual l : (Landroid/view/View;Landroid/graphics/Rect;)V
    //   189: aload_0
    //   190: aload #14
    //   192: aload #20
    //   194: iconst_0
    //   195: invokevirtual j : (Landroid/view/View;Landroid/graphics/Rect;Z)V
    //   198: aload #14
    //   200: invokevirtual getMeasuredWidth : ()I
    //   203: istore #7
    //   205: aload #14
    //   207: invokevirtual getMeasuredHeight : ()I
    //   210: istore #8
    //   212: iload_3
    //   213: aload #21
    //   215: aload #18
    //   217: aload #19
    //   219: iload #7
    //   221: iload #8
    //   223: invokestatic m : (ILandroid/graphics/Rect;Landroid/graphics/Rect;Lis;II)V
    //   226: aload #18
    //   228: getfield left : I
    //   231: aload #20
    //   233: getfield left : I
    //   236: if_icmpne -> 261
    //   239: aload #18
    //   241: getfield top : I
    //   244: aload #20
    //   246: getfield top : I
    //   249: if_icmpeq -> 255
    //   252: goto -> 261
    //   255: iconst_0
    //   256: istore #5
    //   258: goto -> 264
    //   261: iconst_1
    //   262: istore #5
    //   264: aload_0
    //   265: aload #19
    //   267: aload #18
    //   269: iload #7
    //   271: iload #8
    //   273: invokevirtual h : (Lis;Landroid/graphics/Rect;II)V
    //   276: aload #18
    //   278: getfield left : I
    //   281: aload #20
    //   283: getfield left : I
    //   286: isub
    //   287: istore #8
    //   289: aload #18
    //   291: getfield top : I
    //   294: aload #20
    //   296: getfield top : I
    //   299: isub
    //   300: istore #7
    //   302: iload #8
    //   304: ifeq -> 319
    //   307: getstatic v22.a : Ljava/util/WeakHashMap;
    //   310: astore #22
    //   312: aload #14
    //   314: iload #8
    //   316: invokevirtual offsetLeftAndRight : (I)V
    //   319: iload #7
    //   321: ifeq -> 336
    //   324: getstatic v22.a : Ljava/util/WeakHashMap;
    //   327: astore #22
    //   329: aload #14
    //   331: iload #7
    //   333: invokevirtual offsetTopAndBottom : (I)V
    //   336: iload #5
    //   338: ifeq -> 367
    //   341: aload #19
    //   343: getfield a : Lfs;
    //   346: astore #22
    //   348: aload #22
    //   350: ifnull -> 367
    //   353: aload #22
    //   355: aload_0
    //   356: aload #14
    //   358: aload #19
    //   360: getfield k : Landroid/view/View;
    //   363: invokevirtual h : (Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/View;)Z
    //   366: pop
    //   367: aload #21
    //   369: invokevirtual setEmpty : ()V
    //   372: aload #15
    //   374: aload #21
    //   376: invokevirtual a : (Ljava/lang/Object;)Z
    //   379: pop
    //   380: aload #20
    //   382: invokevirtual setEmpty : ()V
    //   385: aload #15
    //   387: aload #20
    //   389: invokevirtual a : (Ljava/lang/Object;)Z
    //   392: pop
    //   393: aload #18
    //   395: invokevirtual setEmpty : ()V
    //   398: aload #15
    //   400: aload #18
    //   402: invokevirtual a : (Ljava/lang/Object;)Z
    //   405: pop
    //   406: goto -> 409
    //   409: iinc #6, 1
    //   412: goto -> 116
    //   415: iload #4
    //   417: istore #5
    //   419: aload_0
    //   420: aload #14
    //   422: aload #16
    //   424: iconst_1
    //   425: invokevirtual j : (Landroid/view/View;Landroid/graphics/Rect;Z)V
    //   428: aload #13
    //   430: getfield g : I
    //   433: ifeq -> 589
    //   436: aload #16
    //   438: invokevirtual isEmpty : ()Z
    //   441: ifne -> 589
    //   444: aload #13
    //   446: getfield g : I
    //   449: iload_3
    //   450: invokestatic getAbsoluteGravity : (II)I
    //   453: istore #4
    //   455: iload #4
    //   457: bipush #112
    //   459: iand
    //   460: istore #6
    //   462: iload #6
    //   464: bipush #48
    //   466: if_icmpeq -> 505
    //   469: iload #6
    //   471: bipush #80
    //   473: if_icmpeq -> 479
    //   476: goto -> 523
    //   479: aload #17
    //   481: aload #17
    //   483: getfield bottom : I
    //   486: aload_0
    //   487: invokevirtual getHeight : ()I
    //   490: aload #16
    //   492: getfield top : I
    //   495: isub
    //   496: invokestatic max : (II)I
    //   499: putfield bottom : I
    //   502: goto -> 523
    //   505: aload #17
    //   507: aload #17
    //   509: getfield top : I
    //   512: aload #16
    //   514: getfield bottom : I
    //   517: invokestatic max : (II)I
    //   520: putfield top : I
    //   523: iload #4
    //   525: bipush #7
    //   527: iand
    //   528: istore #4
    //   530: iload #4
    //   532: iconst_3
    //   533: if_icmpeq -> 571
    //   536: iload #4
    //   538: iconst_5
    //   539: if_icmpeq -> 545
    //   542: goto -> 589
    //   545: aload #17
    //   547: aload #17
    //   549: getfield right : I
    //   552: aload_0
    //   553: invokevirtual getWidth : ()I
    //   556: aload #16
    //   558: getfield left : I
    //   561: isub
    //   562: invokestatic max : (II)I
    //   565: putfield right : I
    //   568: goto -> 589
    //   571: aload #17
    //   573: aload #17
    //   575: getfield left : I
    //   578: aload #16
    //   580: getfield right : I
    //   583: invokestatic max : (II)I
    //   586: putfield left : I
    //   589: aload #13
    //   591: getfield h : I
    //   594: ifeq -> 1134
    //   597: aload #14
    //   599: invokevirtual getVisibility : ()I
    //   602: ifne -> 1134
    //   605: getstatic v22.a : Ljava/util/WeakHashMap;
    //   608: astore #13
    //   610: aload #14
    //   612: invokevirtual isLaidOut : ()Z
    //   615: ifne -> 621
    //   618: goto -> 1134
    //   621: aload #14
    //   623: invokevirtual getWidth : ()I
    //   626: ifle -> 1134
    //   629: aload #14
    //   631: invokevirtual getHeight : ()I
    //   634: ifgt -> 640
    //   637: goto -> 1134
    //   640: aload #14
    //   642: invokevirtual getLayoutParams : ()Landroid/view/ViewGroup$LayoutParams;
    //   645: checkcast is
    //   648: astore #18
    //   650: aload #18
    //   652: getfield a : Lfs;
    //   655: astore #19
    //   657: invokestatic g : ()Landroid/graphics/Rect;
    //   660: astore #20
    //   662: invokestatic g : ()Landroid/graphics/Rect;
    //   665: astore #13
    //   667: aload #13
    //   669: aload #14
    //   671: invokevirtual getLeft : ()I
    //   674: aload #14
    //   676: invokevirtual getTop : ()I
    //   679: aload #14
    //   681: invokevirtual getRight : ()I
    //   684: aload #14
    //   686: invokevirtual getBottom : ()I
    //   689: invokevirtual set : (IIII)V
    //   692: aload #19
    //   694: ifnull -> 786
    //   697: aload #19
    //   699: aload #14
    //   701: aload #20
    //   703: invokevirtual e : (Landroid/view/View;Landroid/graphics/Rect;)Z
    //   706: ifeq -> 786
    //   709: aload #13
    //   711: aload #20
    //   713: invokevirtual contains : (Landroid/graphics/Rect;)Z
    //   716: ifeq -> 722
    //   719: goto -> 793
    //   722: aload #20
    //   724: invokevirtual toShortString : ()Ljava/lang/String;
    //   727: astore #11
    //   729: aload #13
    //   731: invokevirtual toShortString : ()Ljava/lang/String;
    //   734: astore #12
    //   736: new java/lang/StringBuilder
    //   739: dup
    //   740: ldc_w 'Rect should be within the child's bounds. Rect:'
    //   743: invokespecial <init> : (Ljava/lang/String;)V
    //   746: astore #13
    //   748: aload #13
    //   750: aload #11
    //   752: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   755: pop
    //   756: aload #13
    //   758: ldc_w ' | Bounds:'
    //   761: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   764: pop
    //   765: aload #13
    //   767: aload #12
    //   769: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   772: pop
    //   773: new java/lang/IllegalArgumentException
    //   776: dup
    //   777: aload #13
    //   779: invokevirtual toString : ()Ljava/lang/String;
    //   782: invokespecial <init> : (Ljava/lang/String;)V
    //   785: athrow
    //   786: aload #20
    //   788: aload #13
    //   790: invokevirtual set : (Landroid/graphics/Rect;)V
    //   793: aload #13
    //   795: invokevirtual setEmpty : ()V
    //   798: aload #15
    //   800: aload #13
    //   802: invokevirtual a : (Ljava/lang/Object;)Z
    //   805: pop
    //   806: aload #20
    //   808: invokevirtual isEmpty : ()Z
    //   811: ifeq -> 830
    //   814: aload #20
    //   816: invokevirtual setEmpty : ()V
    //   819: aload #15
    //   821: aload #20
    //   823: invokevirtual a : (Ljava/lang/Object;)Z
    //   826: pop
    //   827: goto -> 1134
    //   830: aload #18
    //   832: getfield h : I
    //   835: iload_3
    //   836: invokestatic getAbsoluteGravity : (II)I
    //   839: istore #7
    //   841: iload #7
    //   843: bipush #48
    //   845: iand
    //   846: bipush #48
    //   848: if_icmpne -> 900
    //   851: aload #20
    //   853: getfield top : I
    //   856: aload #18
    //   858: getfield topMargin : I
    //   861: isub
    //   862: aload #18
    //   864: getfield j : I
    //   867: isub
    //   868: istore #6
    //   870: aload #17
    //   872: getfield top : I
    //   875: istore #4
    //   877: iload #6
    //   879: iload #4
    //   881: if_icmpge -> 900
    //   884: aload #14
    //   886: iload #4
    //   888: iload #6
    //   890: isub
    //   891: invokestatic x : (Landroid/view/View;I)V
    //   894: iconst_1
    //   895: istore #4
    //   897: goto -> 903
    //   900: iconst_0
    //   901: istore #4
    //   903: iload #4
    //   905: istore #6
    //   907: iload #7
    //   909: bipush #80
    //   911: iand
    //   912: bipush #80
    //   914: if_icmpne -> 972
    //   917: aload_0
    //   918: invokevirtual getHeight : ()I
    //   921: aload #20
    //   923: getfield bottom : I
    //   926: isub
    //   927: aload #18
    //   929: getfield bottomMargin : I
    //   932: isub
    //   933: aload #18
    //   935: getfield j : I
    //   938: iadd
    //   939: istore #8
    //   941: aload #17
    //   943: getfield bottom : I
    //   946: istore #9
    //   948: iload #4
    //   950: istore #6
    //   952: iload #8
    //   954: iload #9
    //   956: if_icmpge -> 972
    //   959: aload #14
    //   961: iload #8
    //   963: iload #9
    //   965: isub
    //   966: invokestatic x : (Landroid/view/View;I)V
    //   969: iconst_1
    //   970: istore #6
    //   972: iload #6
    //   974: ifne -> 983
    //   977: aload #14
    //   979: iconst_0
    //   980: invokestatic x : (Landroid/view/View;I)V
    //   983: iload #7
    //   985: iconst_3
    //   986: iand
    //   987: iconst_3
    //   988: if_icmpne -> 1040
    //   991: aload #20
    //   993: getfield left : I
    //   996: aload #18
    //   998: getfield leftMargin : I
    //   1001: isub
    //   1002: aload #18
    //   1004: getfield i : I
    //   1007: isub
    //   1008: istore #4
    //   1010: aload #17
    //   1012: getfield left : I
    //   1015: istore #6
    //   1017: iload #4
    //   1019: iload #6
    //   1021: if_icmpge -> 1040
    //   1024: aload #14
    //   1026: iload #6
    //   1028: iload #4
    //   1030: isub
    //   1031: invokestatic w : (Landroid/view/View;I)V
    //   1034: iconst_1
    //   1035: istore #4
    //   1037: goto -> 1043
    //   1040: iconst_0
    //   1041: istore #4
    //   1043: iload #4
    //   1045: istore #6
    //   1047: iload #7
    //   1049: iconst_5
    //   1050: iand
    //   1051: iconst_5
    //   1052: if_icmpne -> 1110
    //   1055: aload_0
    //   1056: invokevirtual getWidth : ()I
    //   1059: aload #20
    //   1061: getfield right : I
    //   1064: isub
    //   1065: aload #18
    //   1067: getfield rightMargin : I
    //   1070: isub
    //   1071: aload #18
    //   1073: getfield i : I
    //   1076: iadd
    //   1077: istore #7
    //   1079: aload #17
    //   1081: getfield right : I
    //   1084: istore #8
    //   1086: iload #4
    //   1088: istore #6
    //   1090: iload #7
    //   1092: iload #8
    //   1094: if_icmpge -> 1110
    //   1097: aload #14
    //   1099: iload #7
    //   1101: iload #8
    //   1103: isub
    //   1104: invokestatic w : (Landroid/view/View;I)V
    //   1107: iconst_1
    //   1108: istore #6
    //   1110: iload #6
    //   1112: ifne -> 1121
    //   1115: aload #14
    //   1117: iconst_0
    //   1118: invokestatic w : (Landroid/view/View;I)V
    //   1121: aload #20
    //   1123: invokevirtual setEmpty : ()V
    //   1126: aload #15
    //   1128: aload #20
    //   1130: invokevirtual a : (Ljava/lang/Object;)Z
    //   1133: pop
    //   1134: iload_1
    //   1135: iconst_2
    //   1136: if_icmpeq -> 1210
    //   1139: aload #14
    //   1141: invokevirtual getLayoutParams : ()Landroid/view/ViewGroup$LayoutParams;
    //   1144: checkcast is
    //   1147: getfield p : Landroid/graphics/Rect;
    //   1150: astore #15
    //   1152: aload #11
    //   1154: astore #13
    //   1156: aload #13
    //   1158: aload #15
    //   1160: invokevirtual set : (Landroid/graphics/Rect;)V
    //   1163: aload #13
    //   1165: aload #16
    //   1167: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1170: ifeq -> 1191
    //   1173: aload #12
    //   1175: astore #11
    //   1177: iload_3
    //   1178: istore #4
    //   1180: aload #13
    //   1182: astore #12
    //   1184: iload #5
    //   1186: istore #7
    //   1188: goto -> 104
    //   1191: aload #14
    //   1193: invokevirtual getLayoutParams : ()Landroid/view/ViewGroup$LayoutParams;
    //   1196: checkcast is
    //   1199: getfield p : Landroid/graphics/Rect;
    //   1202: aload #16
    //   1204: invokevirtual set : (Landroid/graphics/Rect;)V
    //   1207: goto -> 1210
    //   1210: aload #11
    //   1212: astore #15
    //   1214: iload #5
    //   1216: iconst_1
    //   1217: iadd
    //   1218: istore #8
    //   1220: iload_2
    //   1221: istore #6
    //   1223: aload #12
    //   1225: astore #13
    //   1227: iload_3
    //   1228: istore #4
    //   1230: aload #15
    //   1232: astore #12
    //   1234: iload #6
    //   1236: istore_2
    //   1237: aload #13
    //   1239: astore #11
    //   1241: iload #5
    //   1243: istore #7
    //   1245: iload #8
    //   1247: iload #6
    //   1249: if_icmpge -> 104
    //   1252: aload #13
    //   1254: iload #8
    //   1256: invokevirtual get : (I)Ljava/lang/Object;
    //   1259: checkcast android/view/View
    //   1262: astore #12
    //   1264: aload #12
    //   1266: invokevirtual getLayoutParams : ()Landroid/view/ViewGroup$LayoutParams;
    //   1269: checkcast is
    //   1272: astore #18
    //   1274: aload #18
    //   1276: getfield a : Lfs;
    //   1279: astore #11
    //   1281: aload #11
    //   1283: ifnull -> 1368
    //   1286: aload #11
    //   1288: aload #12
    //   1290: aload #14
    //   1292: invokevirtual f : (Landroid/view/View;Landroid/view/View;)Z
    //   1295: ifeq -> 1368
    //   1298: iload_1
    //   1299: ifne -> 1319
    //   1302: aload #18
    //   1304: getfield o : Z
    //   1307: ifeq -> 1319
    //   1310: aload #18
    //   1312: iconst_0
    //   1313: putfield o : Z
    //   1316: goto -> 1368
    //   1319: iload_1
    //   1320: iconst_2
    //   1321: if_icmpeq -> 1339
    //   1324: aload #11
    //   1326: aload_0
    //   1327: aload #12
    //   1329: aload #14
    //   1331: invokevirtual h : (Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/View;)Z
    //   1334: istore #10
    //   1336: goto -> 1353
    //   1339: aload #11
    //   1341: aload_0
    //   1342: aload #14
    //   1344: invokevirtual i : (Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;)V
    //   1347: iconst_1
    //   1348: istore #10
    //   1350: goto -> 1336
    //   1353: iload_1
    //   1354: iconst_1
    //   1355: if_icmpne -> 1368
    //   1358: aload #18
    //   1360: iload #10
    //   1362: putfield o : Z
    //   1365: goto -> 1368
    //   1368: iinc #8, 1
    //   1371: aload #13
    //   1373: astore #12
    //   1375: goto -> 1223
    //   1378: iload #7
    //   1380: iconst_1
    //   1381: iadd
    //   1382: istore_3
    //   1383: aload #12
    //   1385: astore #13
    //   1387: aload #11
    //   1389: astore #12
    //   1391: iload #4
    //   1393: istore #5
    //   1395: aload #13
    //   1397: astore #11
    //   1399: goto -> 40
    //   1402: aload #17
    //   1404: invokevirtual setEmpty : ()V
    //   1407: aload #15
    //   1409: aload #17
    //   1411: invokevirtual a : (Ljava/lang/Object;)Z
    //   1414: pop
    //   1415: aload #16
    //   1417: invokevirtual setEmpty : ()V
    //   1420: aload #15
    //   1422: aload #16
    //   1424: invokevirtual a : (Ljava/lang/Object;)Z
    //   1427: pop
    //   1428: aload #11
    //   1430: invokevirtual setEmpty : ()V
    //   1433: aload #15
    //   1435: aload #11
    //   1437: invokevirtual a : (Ljava/lang/Object;)Z
    //   1440: pop
    //   1441: return
  }
  
  public final void r(View paramView, int paramInt) {
    is is = (is)paramView.getLayoutParams();
    View view = is.k;
    if (view != null || is.f == -1) {
      is is1;
      Rect rect1;
      a91 a911 = z;
      if (view != null) {
        Rect rect = g();
        rect1 = g();
        try {
          l(view, rect);
          is is3 = (is)paramView.getLayoutParams();
          int m = paramView.getMeasuredWidth();
          int n = paramView.getMeasuredHeight();
          m(paramInt, rect, rect1, is3, m, n);
          h(is3, rect1, m, n);
          paramView.layout(rect1.left, rect1.top, rect1.right, rect1.bottom);
          return;
        } finally {
          rect.setEmpty();
          a911.a(rect);
          rect1.setEmpty();
          a911.a(rect1);
        } 
      } 
      int k = ((is)rect1).e;
      if (k >= 0) {
        is1 = (is)paramView.getLayoutParams();
        int n = is1.c;
        int m = n;
        if (n == 0)
          m = 8388661; 
        m = Gravity.getAbsoluteGravity(m, paramInt);
        int i5 = m & 0x7;
        int i4 = m & 0x70;
        int i3 = getWidth();
        int i2 = getHeight();
        int i1 = paramView.getMeasuredWidth();
        n = paramView.getMeasuredHeight();
        m = k;
        if (paramInt == 1)
          m = i3 - k; 
        paramInt = n(m) - i1;
        if (i5 != 1) {
          if (i5 == 5)
            paramInt += i1; 
        } else {
          paramInt += i1 / 2;
        } 
        if (i4 != 16) {
          if (i4 != 80) {
            m = 0;
          } else {
            m = n;
          } 
        } else {
          m = n / 2;
        } 
        paramInt = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams)is1).leftMargin, Math.min(paramInt, i3 - getPaddingRight() - i1 - ((ViewGroup.MarginLayoutParams)is1).rightMargin));
        m = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams)is1).topMargin, Math.min(m, i2 - getPaddingBottom() - n - ((ViewGroup.MarginLayoutParams)is1).bottomMargin));
        paramView.layout(paramInt, m, i1 + paramInt, n + m);
        return;
      } 
      is is2 = (is)paramView.getLayoutParams();
      Rect rect2 = g();
      rect2.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams)is2).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams)is2).topMargin, getWidth() - getPaddingRight() - ((ViewGroup.MarginLayoutParams)is2).rightMargin, getHeight() - getPaddingBottom() - ((ViewGroup.MarginLayoutParams)is2).bottomMargin);
      if (this.p != null) {
        WeakHashMap weakHashMap = v22.a;
        if (getFitsSystemWindows() && !paramView.getFitsSystemWindows()) {
          int m = rect2.left;
          rect2.left = this.p.b() + m;
          m = rect2.top;
          rect2.top = this.p.d() + m;
          rect2.right -= this.p.c();
          rect2.bottom -= this.p.a();
        } 
      } 
      Rect rect3 = g();
      int j = is2.c;
      int i = j;
      if ((j & 0x7) == 0)
        i = j | 0x800003; 
      j = i;
      if ((i & 0x70) == 0)
        j = i | 0x30; 
      Gravity.apply(j, paramView.getMeasuredWidth(), paramView.getMeasuredHeight(), rect2, rect3, paramInt);
      paramView.layout(rect3.left, rect3.top, rect3.right, rect3.bottom);
      rect2.setEmpty();
      is1.a(rect2);
      rect3.setEmpty();
      is1.a(rect3);
      return;
    } 
    tp.f("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
  }
  
  public final boolean requestChildRectangleOnScreen(View paramView, Rect paramRect, boolean paramBoolean) {
    fs fs = ((is)paramView.getLayoutParams()).a;
    return (fs != null && fs.q(this, paramView, paramRect, paramBoolean)) ? true : super.requestChildRectangleOnScreen(paramView, paramRect, paramBoolean);
  }
  
  public final void requestDisallowInterceptTouchEvent(boolean paramBoolean) {
    super.requestDisallowInterceptTouchEvent(paramBoolean);
    if (paramBoolean && !this.i) {
      v(false);
      this.i = true;
    } 
  }
  
  public final void s(int paramInt1, int paramInt2, int paramInt3, View paramView) {
    measureChildWithMargins(paramView, paramInt1, paramInt2, paramInt3, 0);
  }
  
  public void setFitsSystemWindows(boolean paramBoolean) {
    super.setFitsSystemWindows(paramBoolean);
    y();
  }
  
  public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener paramOnHierarchyChangeListener) {
    this.s = paramOnHierarchyChangeListener;
  }
  
  public void setStatusBarBackground(Drawable paramDrawable) {
    Drawable drawable = this.r;
    if (drawable != paramDrawable) {
      Drawable drawable1 = null;
      if (drawable != null)
        drawable.setCallback(null); 
      if (paramDrawable != null)
        drawable1 = paramDrawable.mutate(); 
      this.r = drawable1;
      if (drawable1 != null) {
        boolean bool;
        if (drawable1.isStateful())
          this.r.setState(getDrawableState()); 
        paramDrawable = this.r;
        WeakHashMap weakHashMap1 = v22.a;
        paramDrawable.setLayoutDirection(getLayoutDirection());
        paramDrawable = this.r;
        if (getVisibility() == 0) {
          bool = true;
        } else {
          bool = false;
        } 
        paramDrawable.setVisible(bool, false);
        this.r.setCallback((Drawable.Callback)this);
      } 
      WeakHashMap weakHashMap = v22.a;
      postInvalidateOnAnimation();
    } 
  }
  
  public void setStatusBarBackgroundColor(int paramInt) {
    setStatusBarBackground((Drawable)new ColorDrawable(paramInt));
  }
  
  public void setStatusBarBackgroundResource(int paramInt) {
    Drawable drawable;
    if (paramInt != 0) {
      drawable = getContext().getDrawable(paramInt);
    } else {
      drawable = null;
    } 
    setStatusBarBackground(drawable);
  }
  
  public void setVisibility(int paramInt) {
    boolean bool;
    super.setVisibility(paramInt);
    if (paramInt == 0) {
      bool = true;
    } else {
      bool = false;
    } 
    Drawable drawable = this.r;
    if (drawable != null && drawable.isVisible() != bool)
      this.r.setVisible(bool, false); 
  }
  
  public final boolean t(MotionEvent paramMotionEvent, int paramInt) {
    int k = paramMotionEvent.getActionMasked();
    ArrayList<View> arrayList = this.e;
    arrayList.clear();
    boolean bool = isChildrenDrawingOrderEnabled();
    int m = getChildCount();
    int i;
    for (i = m - 1; i >= 0; i--) {
      int n;
      if (bool) {
        n = getChildDrawingOrder(m, i);
      } else {
        n = i;
      } 
      arrayList.add(getChildAt(n));
    } 
    ij ij1 = y;
    if (ij1 != null)
      Collections.sort(arrayList, (Comparator<? super View>)ij1); 
    int j = arrayList.size();
    i = 0;
    ij1 = null;
    bool = false;
    while (i < j) {
      boolean bool1;
      ij ij2;
      View view = arrayList.get(i);
      fs fs = ((is)view.getLayoutParams()).a;
      if (bool && k != 0) {
        bool1 = bool;
        ij2 = ij1;
        if (fs != null) {
          MotionEvent motionEvent;
          ij2 = ij1;
          if (ij1 == null) {
            long l = SystemClock.uptimeMillis();
            motionEvent = MotionEvent.obtain(l, l, 3, 0.0F, 0.0F, 0);
          } 
          if (paramInt != 0) {
            if (paramInt != 1) {
              bool1 = bool;
            } else {
              fs.v(this, view, motionEvent);
              bool1 = bool;
            } 
          } else {
            fs.k(this, view, motionEvent);
            bool1 = bool;
          } 
        } 
      } else {
        bool1 = bool;
        ij2 = ij1;
        if (!bool) {
          bool1 = bool;
          ij2 = ij1;
          if (fs != null) {
            if (paramInt != 0) {
              if (paramInt == 1)
                bool = fs.v(this, view, paramMotionEvent); 
            } else {
              bool = fs.k(this, view, paramMotionEvent);
            } 
            bool1 = bool;
            ij2 = ij1;
            if (bool) {
              this.l = view;
              ij2 = ij1;
              bool1 = bool;
            } 
          } 
        } 
      } 
      i++;
      bool = bool1;
      ij1 = ij2;
    } 
    arrayList.clear();
    return bool;
  }
  
  public final void u() {
    ArrayList<?> arrayList1 = this.b;
    arrayList1.clear();
    n2 n21 = this.c;
    zm1 zm11 = (zm1)n21.e;
    z81 z81 = (z81)n21.c;
    zm1 zm12 = (zm1)n21.e;
    int i = zm11.e;
    boolean bool = false;
    byte b;
    for (b = 0; b < i; b++) {
      ArrayList arrayList2 = (ArrayList)zm11.i(b);
      if (arrayList2 != null) {
        arrayList2.clear();
        z81.a(arrayList2);
      } 
    } 
    zm11.clear();
    int j = getChildCount();
    label102: for (b = 0; b < j; b++) {
      View view = getChildAt(b);
      is is = o(view);
      i = is.f;
      if (i == -1) {
        is.l = null;
        is.k = null;
      } else {
        View view1 = is.k;
        if (view1 == null || view1.getId() != i) {
          View view2 = findViewById(i);
          is.k = view2;
          if (view2 != null) {
            if (view2 == this) {
              if (isInEditMode()) {
                is.l = null;
                is.k = null;
              } else {
                tp.f("View can not be anchored to the the parent CoordinatorLayout");
                return;
              } 
            } else {
              ViewParent viewParent = view2.getParent();
              while (true) {
                if (viewParent != this && viewParent != null) {
                  if (viewParent == view) {
                    if (isInEditMode()) {
                      is.l = null;
                      is.k = null;
                      break;
                    } 
                    tp.f("Anchor must not be a descendant of the anchored view");
                    return;
                  } 
                  if (viewParent instanceof View)
                    view2 = (View)viewParent; 
                  viewParent = viewParent.getParent();
                  continue;
                } 
                is.l = view2;
                break;
              } 
            } 
          } else if (isInEditMode()) {
            is.l = null;
            is.k = null;
          } else {
            String str = getResources().getResourceName(i);
            StringBuilder stringBuilder = new StringBuilder("Could not find CoordinatorLayout descendant view with id ");
            stringBuilder.append(str);
            stringBuilder.append(" to anchor view ");
            stringBuilder.append(view);
            throw new IllegalStateException(stringBuilder.toString());
          } 
        } else {
          View view2 = is.k;
          for (ViewParent viewParent = view2.getParent(); viewParent != this; viewParent = viewParent.getParent()) {
            if (viewParent == null || viewParent == view) {
              is.l = null;
              is.k = null;
              continue label102;
            } 
            if (viewParent instanceof View)
              view2 = (View)viewParent; 
          } 
          is.l = view2;
        } 
      } 
      if (!zm12.containsKey(view))
        zm12.put(view, null); 
      i = 0;
      while (true)
        i++; 
      continue;
    } 
    ArrayList arrayList = (ArrayList)n21.f;
    arrayList.clear();
    HashSet hashSet = (HashSet)n21.g;
    hashSet.clear();
    i = zm12.e;
    for (b = bool; b < i; b++)
      n21.o(zm12.f(b), arrayList, hashSet); 
    arrayList1.addAll(arrayList);
    Collections.reverse(arrayList1);
  }
  
  public final void v(boolean paramBoolean) {
    int i = getChildCount();
    byte b;
    for (b = 0; b < i; b++) {
      View view = getChildAt(b);
      fs fs = ((is)view.getLayoutParams()).a;
      if (fs != null) {
        long l = SystemClock.uptimeMillis();
        MotionEvent motionEvent = MotionEvent.obtain(l, l, 3, 0.0F, 0.0F, 0);
        if (paramBoolean) {
          fs.k(this, view, motionEvent);
        } else {
          fs.v(this, view, motionEvent);
        } 
        motionEvent.recycle();
      } 
    } 
    for (b = 0; b < i; b++)
      ((is)getChildAt(b).getLayoutParams()).getClass(); 
    this.l = null;
    this.i = false;
  }
  
  public final boolean verifyDrawable(Drawable paramDrawable) {
    return (super.verifyDrawable(paramDrawable) || paramDrawable == this.r);
  }
  
  public final void y() {
    WeakHashMap weakHashMap = v22.a;
    if (getFitsSystemWindows()) {
      if (this.t == null)
        this.t = new gh1(19, this); 
      m22.c((View)this, (s31)this.t);
      setSystemUiVisibility(1280);
      return;
    } 
    m22.c((View)this, null);
  }
  
  static {
    Package package_ = CoordinatorLayout.class.getPackage();
    if (package_ != null) {
      String str = package_.getName();
    } else {
      package_ = null;
    } 
    v = (String)package_;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\androidx\coordinatorlayout\widget\CoordinatorLayout.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
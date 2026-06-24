package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import e62;
import f62;
import fi0;
import fv1;
import g62;
import gx0;
import h62;
import hx0;
import i62;
import j1;
import j62;
import java.util.WeakHashMap;
import k1;
import k62;
import l1;
import m1;
import m22;
import mv1;
import n1;
import n11;
import o11;
import p11;
import rw0;
import sv;
import t52;
import tp;
import u1;
import u62;
import v22;
import v32;
import ws2;
import x62;

public class ActionBarOverlayLayout extends ViewGroup implements n11, o11 {
  public static final int[] E = new int[] { 2130968581, 16842841 };
  
  public static final x62 F;
  
  public static final Rect G = new Rect();
  
  public final k1 A;
  
  public final k1 B;
  
  public final p11 C;
  
  public final n1 D;
  
  public int b;
  
  public int c = 0;
  
  public ContentFrameLayout e;
  
  public ActionBarContainer f;
  
  public sv g;
  
  public Drawable h;
  
  public boolean i;
  
  public boolean j;
  
  public boolean k;
  
  public boolean l;
  
  public int m;
  
  public int n;
  
  public final Rect o = new Rect();
  
  public final Rect p = new Rect();
  
  public final Rect q = new Rect();
  
  public final Rect r = new Rect();
  
  public x62 s;
  
  public x62 t;
  
  public x62 u;
  
  public x62 v;
  
  public l1 w;
  
  public OverScroller x;
  
  public ViewPropertyAnimator y;
  
  public final j1 z;
  
  public ActionBarOverlayLayout(Context paramContext) {
    this(paramContext, null);
  }
  
  public ActionBarOverlayLayout(Context paramContext, AttributeSet paramAttributeSet) {
    super(paramContext, paramAttributeSet);
    new Rect();
    new Rect();
    new Rect();
    new Rect();
    x62 x621 = x62.b;
    this.s = x621;
    this.t = x621;
    this.u = x621;
    this.v = x621;
    this.z = new j1(0, this);
    this.A = new k1(this, 0);
    this.B = new k1(this, 1);
    i(paramContext);
    this.C = (p11)new Object();
    View view = new View(paramContext);
    view.setWillNotDraw(true);
    this.D = (n1)view;
    addView(view);
  }
  
  public static boolean g(View paramView, Rect paramRect, boolean paramBoolean) {
    boolean bool;
    m1 m1 = (m1)paramView.getLayoutParams();
    int i = ((ViewGroup.MarginLayoutParams)m1).leftMargin;
    int j = paramRect.left;
    if (i != j) {
      ((ViewGroup.MarginLayoutParams)m1).leftMargin = j;
      bool = true;
    } else {
      bool = false;
    } 
    j = ((ViewGroup.MarginLayoutParams)m1).topMargin;
    i = paramRect.top;
    if (j != i) {
      ((ViewGroup.MarginLayoutParams)m1).topMargin = i;
      bool = true;
    } 
    j = ((ViewGroup.MarginLayoutParams)m1).rightMargin;
    i = paramRect.right;
    if (j != i) {
      ((ViewGroup.MarginLayoutParams)m1).rightMargin = i;
      bool = true;
    } 
    if (paramBoolean) {
      j = ((ViewGroup.MarginLayoutParams)m1).bottomMargin;
      i = paramRect.bottom;
      if (j != i) {
        ((ViewGroup.MarginLayoutParams)m1).bottomMargin = i;
        return true;
      } 
    } 
    return bool;
  }
  
  public final void a(View paramView1, View paramView2, int paramInt1, int paramInt2) {
    if (paramInt2 == 0)
      onNestedScrollAccepted(paramView1, paramView2, paramInt1); 
  }
  
  public final void b(View paramView, int paramInt) {
    if (paramInt == 0)
      onStopNestedScroll(paramView); 
  }
  
  public final void c(View paramView, int paramInt1, int paramInt2, int[] paramArrayOfint, int paramInt3) {}
  
  public final boolean checkLayoutParams(ViewGroup.LayoutParams paramLayoutParams) {
    return paramLayoutParams instanceof m1;
  }
  
  public final void d(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int[] paramArrayOfint) {
    e(paramView, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
  }
  
  public final void draw(Canvas paramCanvas) {
    super.draw(paramCanvas);
    if (this.h != null) {
      byte b;
      if (this.f.getVisibility() == 0) {
        float f = this.f.getBottom();
        b = (int)(this.f.getTranslationY() + f + 0.5F);
      } else {
        b = 0;
      } 
      this.h.setBounds(0, b, getWidth(), this.h.getIntrinsicHeight() + b);
      this.h.draw(paramCanvas);
    } 
  }
  
  public final void e(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    if (paramInt5 == 0)
      onNestedScroll(paramView, paramInt1, paramInt2, paramInt3, paramInt4); 
  }
  
  public final boolean f(View paramView1, View paramView2, int paramInt1, int paramInt2) {
    return (paramInt2 == 0 && onStartNestedScroll(paramView1, paramView2, paramInt1));
  }
  
  public final boolean fitSystemWindows(Rect paramRect) {
    return super.fitSystemWindows(paramRect);
  }
  
  public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
    return (ViewGroup.LayoutParams)new ViewGroup.MarginLayoutParams(-1, -1);
  }
  
  public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet paramAttributeSet) {
    return (ViewGroup.LayoutParams)new ViewGroup.MarginLayoutParams(getContext(), paramAttributeSet);
  }
  
  public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams paramLayoutParams) {
    return (ViewGroup.LayoutParams)new ViewGroup.MarginLayoutParams(paramLayoutParams);
  }
  
  public int getActionBarHideOffset() {
    ActionBarContainer actionBarContainer = this.f;
    return (actionBarContainer != null) ? -((int)actionBarContainer.getTranslationY()) : 0;
  }
  
  public int getNestedScrollAxes() {
    p11 p111 = this.C;
    int i = p111.a;
    return p111.b | i;
  }
  
  public CharSequence getTitle() {
    k();
    return ((mv1)this.g).a.getTitle();
  }
  
  public final void h() {
    removeCallbacks((Runnable)this.A);
    removeCallbacks((Runnable)this.B);
    ViewPropertyAnimator viewPropertyAnimator = this.y;
    if (viewPropertyAnimator != null)
      viewPropertyAnimator.cancel(); 
  }
  
  public final void i(Context paramContext) {
    TypedArray typedArray = getContext().getTheme().obtainStyledAttributes(E);
    boolean bool = false;
    this.b = typedArray.getDimensionPixelSize(0, 0);
    Drawable drawable = typedArray.getDrawable(1);
    this.h = drawable;
    if (drawable == null)
      bool = true; 
    setWillNotDraw(bool);
    typedArray.recycle();
    this.x = new OverScroller(paramContext);
  }
  
  public final void j(int paramInt) {
    k();
    if (paramInt != 2) {
      if (paramInt != 5) {
        if (paramInt != 109)
          return; 
        setOverlayMode(true);
        return;
      } 
      ((mv1)this.g).getClass();
      Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
      return;
    } 
    ((mv1)this.g).getClass();
    Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
  }
  
  public final void k() {
    if (this.e == null) {
      sv sv1;
      this.e = (ContentFrameLayout)findViewById(2131296312);
      this.f = (ActionBarContainer)findViewById(2131296313);
      View view = findViewById(2131296311);
      if (view instanceof sv) {
        sv1 = (sv)view;
      } else if (sv1 instanceof Toolbar) {
        sv1 = ((Toolbar)sv1).getWrapper();
      } else {
        tp.f("Can't make a decor toolbar out of ".concat(sv1.getClass().getSimpleName()));
        return;
      } 
      this.g = sv1;
      return;
    } 
  }
  
  public final void l(Menu paramMenu, gx0 paramgx0) {
    k();
    mv1 mv1 = (mv1)this.g;
    Toolbar toolbar = mv1.a;
    if (mv1.m == null)
      mv1.m = new u1(toolbar.getContext()); 
    u1 u1 = mv1.m;
    u1.g = paramgx0;
    rw0 rw0 = (rw0)paramMenu;
    if (rw0 != null || toolbar.b != null) {
      toolbar.f();
      rw0 rw01 = toolbar.b.b;
      if (rw01 != rw0) {
        if (rw01 != null) {
          rw01.r((hx0)toolbar.N);
          rw01.r((hx0)toolbar.O);
        } 
        if (toolbar.O == null)
          toolbar.O = new fv1(toolbar); 
        u1.s = true;
        Context context = toolbar.l;
        if (rw0 != null) {
          rw0.b((hx0)u1, context);
          rw0.b((hx0)toolbar.O, toolbar.l);
        } else {
          u1.i(context, null);
          toolbar.O.i(toolbar.l, null);
          u1.g();
          toolbar.O.g();
        } 
        toolbar.b.setPopupTheme(toolbar.m);
        toolbar.b.setPresenter(u1);
        toolbar.N = u1;
        toolbar.v();
        return;
      } 
    } 
  }
  
  public final WindowInsets onApplyWindowInsets(WindowInsets paramWindowInsets) {
    k();
    x62 x621 = x62.h((View)this, paramWindowInsets);
    Rect rect2 = new Rect(x621.b(), x621.d(), x621.c(), x621.a());
    boolean bool1 = g((View)this.f, rect2, false);
    WeakHashMap weakHashMap = v22.a;
    Rect rect1 = this.o;
    m22.b((View)this, x621, rect1);
    int k = rect1.left;
    int j = rect1.top;
    int i = rect1.right;
    int m = rect1.bottom;
    u62 u62 = x621.a;
    x62 x622 = u62.q(k, j, i, m);
    this.s = x622;
    boolean bool2 = this.t.equals(x622);
    boolean bool = true;
    if (!bool2) {
      this.t = this.s;
      bool1 = true;
    } 
    Rect rect3 = this.p;
    if (!rect3.equals(rect1)) {
      rect3.set(rect1);
      bool1 = bool;
    } 
    if (bool1)
      requestLayout(); 
    return ((u62.a()).a.c()).a.b().g();
  }
  
  public final void onConfigurationChanged(Configuration paramConfiguration) {
    super.onConfigurationChanged(paramConfiguration);
    i(getContext());
    WeakHashMap weakHashMap = v22.a;
    requestApplyInsets();
  }
  
  public final void onDetachedFromWindow() {
    super.onDetachedFromWindow();
    h();
  }
  
  public final void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    paramInt4 = getChildCount();
    paramInt3 = getPaddingLeft();
    paramInt2 = getPaddingTop();
    for (paramInt1 = 0; paramInt1 < paramInt4; paramInt1++) {
      View view = getChildAt(paramInt1);
      if (view.getVisibility() != 8) {
        m1 m1 = (m1)view.getLayoutParams();
        int m = view.getMeasuredWidth();
        int i = view.getMeasuredHeight();
        int j = ((ViewGroup.MarginLayoutParams)m1).leftMargin + paramInt3;
        int k = ((ViewGroup.MarginLayoutParams)m1).topMargin + paramInt2;
        view.layout(j, k, m + j, i + k);
      } 
    } 
  }
  
  public final void onMeasure(int paramInt1, int paramInt2) {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual k : ()V
    //   4: aload_0
    //   5: aload_0
    //   6: getfield f : Landroidx/appcompat/widget/ActionBarContainer;
    //   9: iload_1
    //   10: iconst_0
    //   11: iload_2
    //   12: iconst_0
    //   13: invokevirtual measureChildWithMargins : (Landroid/view/View;IIII)V
    //   16: aload_0
    //   17: getfield f : Landroidx/appcompat/widget/ActionBarContainer;
    //   20: invokevirtual getLayoutParams : ()Landroid/view/ViewGroup$LayoutParams;
    //   23: checkcast m1
    //   26: astore #9
    //   28: iconst_0
    //   29: aload_0
    //   30: getfield f : Landroidx/appcompat/widget/ActionBarContainer;
    //   33: invokevirtual getMeasuredWidth : ()I
    //   36: aload #9
    //   38: getfield leftMargin : I
    //   41: iadd
    //   42: aload #9
    //   44: getfield rightMargin : I
    //   47: iadd
    //   48: invokestatic max : (II)I
    //   51: istore #8
    //   53: iconst_0
    //   54: aload_0
    //   55: getfield f : Landroidx/appcompat/widget/ActionBarContainer;
    //   58: invokevirtual getMeasuredHeight : ()I
    //   61: aload #9
    //   63: getfield topMargin : I
    //   66: iadd
    //   67: aload #9
    //   69: getfield bottomMargin : I
    //   72: iadd
    //   73: invokestatic max : (II)I
    //   76: istore #7
    //   78: iconst_0
    //   79: aload_0
    //   80: getfield f : Landroidx/appcompat/widget/ActionBarContainer;
    //   83: invokevirtual getMeasuredState : ()I
    //   86: invokestatic combineMeasuredStates : (II)I
    //   89: istore #6
    //   91: getstatic v22.a : Ljava/util/WeakHashMap;
    //   94: astore #9
    //   96: aload_0
    //   97: invokevirtual getWindowSystemUiVisibility : ()I
    //   100: sipush #256
    //   103: iand
    //   104: ifeq -> 113
    //   107: iconst_1
    //   108: istore #4
    //   110: goto -> 116
    //   113: iconst_0
    //   114: istore #4
    //   116: iload #4
    //   118: ifeq -> 161
    //   121: aload_0
    //   122: getfield b : I
    //   125: istore #5
    //   127: iload #5
    //   129: istore_3
    //   130: aload_0
    //   131: getfield j : Z
    //   134: ifeq -> 186
    //   137: iload #5
    //   139: istore_3
    //   140: aload_0
    //   141: getfield f : Landroidx/appcompat/widget/ActionBarContainer;
    //   144: invokevirtual getTabContainer : ()Landroid/view/View;
    //   147: ifnull -> 186
    //   150: iload #5
    //   152: aload_0
    //   153: getfield b : I
    //   156: iadd
    //   157: istore_3
    //   158: goto -> 186
    //   161: aload_0
    //   162: getfield f : Landroidx/appcompat/widget/ActionBarContainer;
    //   165: invokevirtual getVisibility : ()I
    //   168: bipush #8
    //   170: if_icmpeq -> 184
    //   173: aload_0
    //   174: getfield f : Landroidx/appcompat/widget/ActionBarContainer;
    //   177: invokevirtual getMeasuredHeight : ()I
    //   180: istore_3
    //   181: goto -> 186
    //   184: iconst_0
    //   185: istore_3
    //   186: aload_0
    //   187: getfield o : Landroid/graphics/Rect;
    //   190: astore #9
    //   192: aload_0
    //   193: getfield q : Landroid/graphics/Rect;
    //   196: astore #10
    //   198: aload #10
    //   200: aload #9
    //   202: invokevirtual set : (Landroid/graphics/Rect;)V
    //   205: aload_0
    //   206: aload_0
    //   207: getfield s : Lx62;
    //   210: putfield u : Lx62;
    //   213: aload_0
    //   214: getfield i : Z
    //   217: ifne -> 306
    //   220: iload #4
    //   222: ifne -> 306
    //   225: aload_0
    //   226: getfield D : Ln1;
    //   229: astore #11
    //   231: getstatic androidx/appcompat/widget/ActionBarOverlayLayout.F : Lx62;
    //   234: astore #12
    //   236: aload_0
    //   237: getfield r : Landroid/graphics/Rect;
    //   240: astore #9
    //   242: aload #11
    //   244: aload #12
    //   246: aload #9
    //   248: invokestatic b : (Landroid/view/View;Lx62;Landroid/graphics/Rect;)Lx62;
    //   251: pop
    //   252: aload #9
    //   254: getstatic androidx/appcompat/widget/ActionBarOverlayLayout.G : Landroid/graphics/Rect;
    //   257: invokevirtual equals : (Ljava/lang/Object;)Z
    //   260: ifne -> 306
    //   263: aload #10
    //   265: aload #10
    //   267: getfield top : I
    //   270: iload_3
    //   271: iadd
    //   272: putfield top : I
    //   275: aload #10
    //   277: aload #10
    //   279: getfield bottom : I
    //   282: putfield bottom : I
    //   285: aload_0
    //   286: aload_0
    //   287: getfield u : Lx62;
    //   290: getfield a : Lu62;
    //   293: iconst_0
    //   294: iload_3
    //   295: iconst_0
    //   296: iconst_0
    //   297: invokevirtual q : (IIII)Lx62;
    //   300: putfield u : Lx62;
    //   303: goto -> 498
    //   306: aload_0
    //   307: getfield u : Lx62;
    //   310: invokevirtual b : ()I
    //   313: aload_0
    //   314: getfield u : Lx62;
    //   317: invokevirtual d : ()I
    //   320: iload_3
    //   321: iadd
    //   322: aload_0
    //   323: getfield u : Lx62;
    //   326: invokevirtual c : ()I
    //   329: aload_0
    //   330: getfield u : Lx62;
    //   333: invokevirtual a : ()I
    //   336: invokestatic c : (IIII)Lfi0;
    //   339: astore #11
    //   341: aload_0
    //   342: getfield u : Lx62;
    //   345: astore #9
    //   347: getstatic android/os/Build$VERSION.SDK_INT : I
    //   350: istore_3
    //   351: iload_3
    //   352: bipush #36
    //   354: if_icmplt -> 371
    //   357: new k62
    //   360: dup
    //   361: aload #9
    //   363: invokespecial <init> : (Lx62;)V
    //   366: astore #9
    //   368: goto -> 482
    //   371: iload_3
    //   372: bipush #35
    //   374: if_icmplt -> 391
    //   377: new j62
    //   380: dup
    //   381: aload #9
    //   383: invokespecial <init> : (Lx62;)V
    //   386: astore #9
    //   388: goto -> 482
    //   391: iload_3
    //   392: bipush #34
    //   394: if_icmplt -> 411
    //   397: new i62
    //   400: dup
    //   401: aload #9
    //   403: invokespecial <init> : (Lx62;)V
    //   406: astore #9
    //   408: goto -> 482
    //   411: iload_3
    //   412: bipush #31
    //   414: if_icmplt -> 431
    //   417: new h62
    //   420: dup
    //   421: aload #9
    //   423: invokespecial <init> : (Lx62;)V
    //   426: astore #9
    //   428: goto -> 482
    //   431: iload_3
    //   432: bipush #30
    //   434: if_icmplt -> 451
    //   437: new g62
    //   440: dup
    //   441: aload #9
    //   443: invokespecial <init> : (Lx62;)V
    //   446: astore #9
    //   448: goto -> 482
    //   451: iload_3
    //   452: bipush #29
    //   454: if_icmplt -> 471
    //   457: new f62
    //   460: dup
    //   461: aload #9
    //   463: invokespecial <init> : (Lx62;)V
    //   466: astore #9
    //   468: goto -> 482
    //   471: new e62
    //   474: dup
    //   475: aload #9
    //   477: invokespecial <init> : (Lx62;)V
    //   480: astore #9
    //   482: aload #9
    //   484: aload #11
    //   486: invokevirtual h : (Lfi0;)V
    //   489: aload_0
    //   490: aload #9
    //   492: invokevirtual b : ()Lx62;
    //   495: putfield u : Lx62;
    //   498: aload_0
    //   499: getfield e : Landroidx/appcompat/widget/ContentFrameLayout;
    //   502: aload #10
    //   504: iconst_1
    //   505: invokestatic g : (Landroid/view/View;Landroid/graphics/Rect;Z)Z
    //   508: pop
    //   509: aload_0
    //   510: getfield v : Lx62;
    //   513: aload_0
    //   514: getfield u : Lx62;
    //   517: invokevirtual equals : (Ljava/lang/Object;)Z
    //   520: ifne -> 545
    //   523: aload_0
    //   524: getfield u : Lx62;
    //   527: astore #9
    //   529: aload_0
    //   530: aload #9
    //   532: putfield v : Lx62;
    //   535: aload_0
    //   536: getfield e : Landroidx/appcompat/widget/ContentFrameLayout;
    //   539: aload #9
    //   541: invokestatic b : (Landroid/view/View;Lx62;)Lx62;
    //   544: pop
    //   545: aload_0
    //   546: aload_0
    //   547: getfield e : Landroidx/appcompat/widget/ContentFrameLayout;
    //   550: iload_1
    //   551: iconst_0
    //   552: iload_2
    //   553: iconst_0
    //   554: invokevirtual measureChildWithMargins : (Landroid/view/View;IIII)V
    //   557: aload_0
    //   558: getfield e : Landroidx/appcompat/widget/ContentFrameLayout;
    //   561: invokevirtual getLayoutParams : ()Landroid/view/ViewGroup$LayoutParams;
    //   564: checkcast m1
    //   567: astore #9
    //   569: iload #8
    //   571: aload_0
    //   572: getfield e : Landroidx/appcompat/widget/ContentFrameLayout;
    //   575: invokevirtual getMeasuredWidth : ()I
    //   578: aload #9
    //   580: getfield leftMargin : I
    //   583: iadd
    //   584: aload #9
    //   586: getfield rightMargin : I
    //   589: iadd
    //   590: invokestatic max : (II)I
    //   593: istore_3
    //   594: iload #7
    //   596: aload_0
    //   597: getfield e : Landroidx/appcompat/widget/ContentFrameLayout;
    //   600: invokevirtual getMeasuredHeight : ()I
    //   603: aload #9
    //   605: getfield topMargin : I
    //   608: iadd
    //   609: aload #9
    //   611: getfield bottomMargin : I
    //   614: iadd
    //   615: invokestatic max : (II)I
    //   618: istore #4
    //   620: iload #6
    //   622: aload_0
    //   623: getfield e : Landroidx/appcompat/widget/ContentFrameLayout;
    //   626: invokevirtual getMeasuredState : ()I
    //   629: invokestatic combineMeasuredStates : (II)I
    //   632: istore #5
    //   634: aload_0
    //   635: invokevirtual getPaddingLeft : ()I
    //   638: istore #7
    //   640: aload_0
    //   641: invokevirtual getPaddingRight : ()I
    //   644: istore #6
    //   646: aload_0
    //   647: invokevirtual getPaddingTop : ()I
    //   650: istore #8
    //   652: aload_0
    //   653: invokevirtual getPaddingBottom : ()I
    //   656: iload #8
    //   658: iadd
    //   659: iload #4
    //   661: iadd
    //   662: aload_0
    //   663: invokevirtual getSuggestedMinimumHeight : ()I
    //   666: invokestatic max : (II)I
    //   669: istore #4
    //   671: aload_0
    //   672: iload #6
    //   674: iload #7
    //   676: iadd
    //   677: iload_3
    //   678: iadd
    //   679: aload_0
    //   680: invokevirtual getSuggestedMinimumWidth : ()I
    //   683: invokestatic max : (II)I
    //   686: iload_1
    //   687: iload #5
    //   689: invokestatic resolveSizeAndState : (III)I
    //   692: iload #4
    //   694: iload_2
    //   695: iload #5
    //   697: bipush #16
    //   699: ishl
    //   700: invokestatic resolveSizeAndState : (III)I
    //   703: invokevirtual setMeasuredDimension : (II)V
    //   706: return
  }
  
  public final boolean onNestedFling(View paramView, float paramFloat1, float paramFloat2, boolean paramBoolean) {
    if (!this.k || !paramBoolean)
      return false; 
    this.x.fling(0, 0, 0, (int)paramFloat2, 0, 0, -2147483648, 2147483647);
    if (this.x.getFinalY() > this.f.getHeight()) {
      h();
      this.B.run();
    } else {
      h();
      this.A.run();
    } 
    this.l = true;
    return true;
  }
  
  public final boolean onNestedPreFling(View paramView, float paramFloat1, float paramFloat2) {
    return false;
  }
  
  public final void onNestedPreScroll(View paramView, int paramInt1, int paramInt2, int[] paramArrayOfint) {}
  
  public final void onNestedScroll(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    paramInt1 = this.m + paramInt2;
    this.m = paramInt1;
    setActionBarHideOffset(paramInt1);
  }
  
  public final void onNestedScrollAccepted(View paramView1, View paramView2, int paramInt) {
    this.C.a = paramInt;
    this.m = getActionBarHideOffset();
    h();
    l1 l11 = this.w;
    if (l11 != null) {
      t52 t52 = (t52)l11;
      v32 v32 = t52.G;
      if (v32 != null) {
        v32.b();
        t52.G = null;
      } 
    } 
  }
  
  public final boolean onStartNestedScroll(View paramView1, View paramView2, int paramInt) {
    return ((paramInt & 0x2) == 0 || this.f.getVisibility() != 0) ? false : this.k;
  }
  
  public final void onStopNestedScroll(View paramView) {
    if (this.k && !this.l)
      if (this.m <= this.f.getHeight()) {
        h();
        postDelayed((Runnable)this.A, 600L);
      } else {
        h();
        postDelayed((Runnable)this.B, 600L);
      }  
  }
  
  public final void onWindowSystemUiVisibilityChanged(int paramInt) {
    boolean bool1;
    boolean bool2;
    super.onWindowSystemUiVisibilityChanged(paramInt);
    k();
    int i = this.n;
    this.n = paramInt;
    if ((paramInt & 0x4) == 0) {
      bool1 = true;
    } else {
      bool1 = false;
    } 
    if ((paramInt & 0x100) != 0) {
      bool2 = true;
    } else {
      bool2 = false;
    } 
    l1 l11 = this.w;
    if (l11 != null) {
      t52 t52 = (t52)l11;
      t52.C = bool2 ^ true;
      if (bool1 || !bool2) {
        if (t52.D) {
          t52.D = false;
          t52.H0(true);
        } 
      } else if (!t52.D) {
        t52.D = true;
        t52.H0(true);
      } 
    } 
    if (((i ^ paramInt) & 0x100) != 0 && this.w != null) {
      WeakHashMap weakHashMap = v22.a;
      requestApplyInsets();
    } 
  }
  
  public final void onWindowVisibilityChanged(int paramInt) {
    super.onWindowVisibilityChanged(paramInt);
    this.c = paramInt;
    l1 l11 = this.w;
    if (l11 != null)
      ((t52)l11).B = paramInt; 
  }
  
  public void setActionBarHideOffset(int paramInt) {
    h();
    paramInt = Math.max(0, Math.min(paramInt, this.f.getHeight()));
    this.f.setTranslationY(-paramInt);
  }
  
  public void setActionBarVisibilityCallback(l1 paraml1) {
    this.w = paraml1;
    if (getWindowToken() != null) {
      paraml1 = this.w;
      int i = this.c;
      ((t52)paraml1).B = i;
      i = this.n;
      if (i != 0) {
        onWindowSystemUiVisibilityChanged(i);
        WeakHashMap weakHashMap = v22.a;
        requestApplyInsets();
      } 
    } 
  }
  
  public void setHasNonEmbeddedTabs(boolean paramBoolean) {
    this.j = paramBoolean;
  }
  
  public void setHideOnContentScrollEnabled(boolean paramBoolean) {
    if (paramBoolean != this.k) {
      this.k = paramBoolean;
      if (!paramBoolean) {
        h();
        setActionBarHideOffset(0);
      } 
    } 
  }
  
  public void setIcon(int paramInt) {
    Drawable drawable;
    k();
    mv1 mv1 = (mv1)this.g;
    if (paramInt != 0) {
      drawable = ws2.I(mv1.a.getContext(), paramInt);
    } else {
      drawable = null;
    } 
    mv1.d = drawable;
    mv1.c();
  }
  
  public void setIcon(Drawable paramDrawable) {
    k();
    mv1 mv1 = (mv1)this.g;
    mv1.d = paramDrawable;
    mv1.c();
  }
  
  public void setLogo(int paramInt) {
    Drawable drawable;
    k();
    mv1 mv1 = (mv1)this.g;
    if (paramInt != 0) {
      drawable = ws2.I(mv1.a.getContext(), paramInt);
    } else {
      drawable = null;
    } 
    mv1.e = drawable;
    mv1.c();
  }
  
  public void setOverlayMode(boolean paramBoolean) {
    this.i = paramBoolean;
  }
  
  public void setShowingForActionMode(boolean paramBoolean) {}
  
  public void setUiOptions(int paramInt) {}
  
  public void setWindowCallback(Window.Callback paramCallback) {
    k();
    ((mv1)this.g).k = paramCallback;
  }
  
  public void setWindowTitle(CharSequence paramCharSequence) {
    k();
    mv1 mv1 = (mv1)this.g;
    if (!mv1.g) {
      Toolbar toolbar = mv1.a;
      mv1.h = paramCharSequence;
      if ((mv1.b & 0x8) != 0) {
        toolbar.setTitle(paramCharSequence);
        if (mv1.g)
          v22.o(toolbar.getRootView(), paramCharSequence); 
      } 
    } 
  }
  
  public final boolean shouldDelayChildPressedState() {
    return false;
  }
  
  static {
    e62 e62;
  }
  
  static {
    int i = Build.VERSION.SDK_INT;
    if (i >= 36) {
      k62 k62 = new k62();
    } else if (i >= 35) {
      j62 j62 = new j62();
    } else if (i >= 34) {
      i62 i62 = new i62();
    } else if (i >= 31) {
      h62 h62 = new h62();
    } else if (i >= 30) {
      g62 g62 = new g62();
    } else if (i >= 29) {
      f62 f62 = new f62();
    } else {
      e62 = new e62();
    } 
    e62.h(fi0.c(0, 1, 0, 1));
    F = e62.b();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\androidx\appcompat\widget\ActionBarOverlayLayout.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
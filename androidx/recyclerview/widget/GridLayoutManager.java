package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import de1;
import fn0;
import g7;
import ga1;
import gn0;
import hn0;
import id1;
import il;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.WeakHashMap;
import l0;
import m0;
import s0;
import sd1;
import t0;
import tp;
import v22;
import ve0;
import x41;
import yd1;

public class GridLayoutManager extends LinearLayoutManager {
  public static final Set R = Collections.unmodifiableSet(new HashSet(Arrays.asList((Object[])new Integer[] { Integer.valueOf(17), Integer.valueOf(66), Integer.valueOf(33), Integer.valueOf(130) })));
  
  public boolean G = false;
  
  public int H = -1;
  
  public int[] I;
  
  public View[] J;
  
  public final SparseIntArray K = new SparseIntArray();
  
  public final SparseIntArray L = new SparseIntArray();
  
  public final g7 M = new g7(23);
  
  public final Rect N = new Rect();
  
  public int O = -1;
  
  public int P = -1;
  
  public int Q = -1;
  
  public GridLayoutManager(int paramInt) {
    super(1);
    F1(paramInt);
  }
  
  public GridLayoutManager(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2) {
    super(paramContext, paramAttributeSet, paramInt1, paramInt2);
    F1((a.S(paramContext, paramAttributeSet, paramInt1, paramInt2)).b);
  }
  
  public final int A1(int paramInt1, int paramInt2) {
    if (this.r == 1 && h1()) {
      int[] arrayOfInt1 = this.I;
      int i = this.H;
      return arrayOfInt1[i - paramInt1] - arrayOfInt1[i - paramInt1 - paramInt2];
    } 
    int[] arrayOfInt = this.I;
    return arrayOfInt[paramInt2 + paramInt1] - arrayOfInt[paramInt1];
  }
  
  public final int B1(int paramInt, yd1 paramyd1, de1 paramde1) {
    boolean bool = paramde1.g;
    g7 g71 = this.M;
    if (!bool) {
      int j = this.H;
      g71.getClass();
      return g7.x(paramInt, j);
    } 
    int i = paramyd1.b(paramInt);
    if (i == -1) {
      StringBuilder stringBuilder = new StringBuilder("Cannot find span size for pre layout position. ");
      stringBuilder.append(paramInt);
      Log.w("GridLayoutManager", stringBuilder.toString());
      return 0;
    } 
    paramInt = this.H;
    g71.getClass();
    return g7.x(i, paramInt);
  }
  
  public final sd1 C() {
    return (sd1)((this.r == 0) ? new ve0(-2, -1) : new ve0(-1, -2));
  }
  
  public final int C1(int paramInt, yd1 paramyd1, de1 paramde1) {
    boolean bool = paramde1.g;
    g7 g71 = this.M;
    if (!bool) {
      int j = this.H;
      g71.getClass();
      return paramInt % j;
    } 
    int i = this.L.get(paramInt, -1);
    if (i != -1)
      return i; 
    i = paramyd1.b(paramInt);
    if (i == -1) {
      StringBuilder stringBuilder = new StringBuilder("Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:");
      stringBuilder.append(paramInt);
      Log.w("GridLayoutManager", stringBuilder.toString());
      return 0;
    } 
    paramInt = this.H;
    g71.getClass();
    return i % paramInt;
  }
  
  public final sd1 D(Context paramContext, AttributeSet paramAttributeSet) {
    sd1 sd1 = new sd1(paramContext, paramAttributeSet);
    ((ve0)sd1).g = -1;
    ((ve0)sd1).h = 0;
    return sd1;
  }
  
  public final int D0(int paramInt, yd1 paramyd1, de1 paramde1) {
    G1();
    v1();
    return super.D0(paramInt, paramyd1, paramde1);
  }
  
  public final int D1(int paramInt, yd1 paramyd1, de1 paramde1) {
    boolean bool = paramde1.g;
    g7 g71 = this.M;
    if (!bool) {
      g71.getClass();
      return 1;
    } 
    int i = this.K.get(paramInt, -1);
    if (i != -1)
      return i; 
    if (paramyd1.b(paramInt) == -1) {
      StringBuilder stringBuilder = new StringBuilder("Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:");
      stringBuilder.append(paramInt);
      Log.w("GridLayoutManager", stringBuilder.toString());
      return 1;
    } 
    g71.getClass();
    return 1;
  }
  
  public final sd1 E(ViewGroup.LayoutParams paramLayoutParams) {
    if (paramLayoutParams instanceof ViewGroup.MarginLayoutParams) {
      sd1 = new sd1((ViewGroup.MarginLayoutParams)paramLayoutParams);
      ((ve0)sd1).g = -1;
      ((ve0)sd1).h = 0;
      return sd1;
    } 
    sd1 sd1 = new sd1((ViewGroup.LayoutParams)sd1);
    ((ve0)sd1).g = -1;
    ((ve0)sd1).h = 0;
    return sd1;
  }
  
  public final void E1(View paramView, int paramInt, boolean paramBoolean) {
    ve0 ve0 = (ve0)paramView.getLayoutParams();
    Rect rect = ((sd1)ve0).c;
    int j = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams)ve0).topMargin + ((ViewGroup.MarginLayoutParams)ve0).bottomMargin;
    int i = rect.left + rect.right + ((ViewGroup.MarginLayoutParams)ve0).leftMargin + ((ViewGroup.MarginLayoutParams)ve0).rightMargin;
    int k = A1(ve0.g, ve0.h);
    if (this.r == 1) {
      i = a.H(false, k, paramInt, i, ((ViewGroup.MarginLayoutParams)ve0).width);
      paramInt = a.H(true, this.t.n(), this.o, j, ((ViewGroup.MarginLayoutParams)ve0).height);
    } else {
      paramInt = a.H(false, k, paramInt, j, ((ViewGroup.MarginLayoutParams)ve0).height);
      i = a.H(true, this.t.n(), this.n, i, ((ViewGroup.MarginLayoutParams)ve0).width);
    } 
    sd1 sd1 = (sd1)paramView.getLayoutParams();
    if (paramBoolean) {
      paramBoolean = N0(paramView, i, paramInt, sd1);
    } else {
      paramBoolean = L0(paramView, i, paramInt, sd1);
    } 
    if (paramBoolean)
      paramView.measure(i, paramInt); 
  }
  
  public final int F0(int paramInt, yd1 paramyd1, de1 paramde1) {
    G1();
    v1();
    return super.F0(paramInt, paramyd1, paramde1);
  }
  
  public final void F1(int paramInt) {
    if (paramInt == this.H)
      return; 
    this.G = true;
    if (paramInt >= 1) {
      this.H = paramInt;
      this.M.z();
      C0();
      return;
    } 
    l0.l(ga1.i("Span count should be at least 1. Provided ", paramInt));
  }
  
  public final void G1() {
    int i;
    int j;
    if (this.r == 1) {
      i = this.p - getPaddingRight();
      j = getPaddingLeft();
    } else {
      i = this.q - getPaddingBottom();
      j = getPaddingTop();
    } 
    u1(i - j);
  }
  
  public final int I(yd1 paramyd1, de1 paramde1) {
    return (this.r == 1) ? Math.min(this.H, Q()) : ((paramde1.b() < 1) ? 0 : (B1(paramde1.b() - 1, paramyd1, paramde1) + 1));
  }
  
  public final void I0(Rect paramRect, int paramInt1, int paramInt2) {
    int[] arrayOfInt;
    if (this.I == null)
      super.I0(paramRect, paramInt1, paramInt2); 
    int i = getPaddingLeft();
    i = getPaddingRight() + i;
    int j = getPaddingTop();
    j = getPaddingBottom() + j;
    if (this.r == 1) {
      int k = paramRect.height();
      RecyclerView recyclerView = this.c;
      WeakHashMap weakHashMap = v22.a;
      paramInt2 = a.r(paramInt2, k + j, recyclerView.getMinimumHeight());
      arrayOfInt = this.I;
      i = a.r(paramInt1, arrayOfInt[arrayOfInt.length - 1] + i, this.c.getMinimumWidth());
      paramInt1 = paramInt2;
      paramInt2 = i;
    } else {
      int k = arrayOfInt.width();
      RecyclerView recyclerView = this.c;
      WeakHashMap weakHashMap = v22.a;
      paramInt1 = a.r(paramInt1, k + i, recyclerView.getMinimumWidth());
      int[] arrayOfInt1 = this.I;
      i = a.r(paramInt2, arrayOfInt1[arrayOfInt1.length - 1] + j, this.c.getMinimumHeight());
      paramInt2 = paramInt1;
      paramInt1 = i;
    } 
    RecyclerView.f(this.c, paramInt2, paramInt1);
  }
  
  public final boolean Q0() {
    return (this.B == null && !this.G);
  }
  
  public final void R0(de1 paramde1, hn0 paramhn0, il paramil) {
    int i = this.H;
    byte b = 0;
    while (b < this.H) {
      int j = paramhn0.d;
      if (j >= 0 && j < paramde1.b() && i > 0) {
        paramil.b(paramhn0.d, Math.max(0, paramhn0.g));
        this.M.getClass();
        i--;
        paramhn0.d += paramhn0.e;
        b++;
      } 
    } 
  }
  
  public final int T(yd1 paramyd1, de1 paramde1) {
    return (this.r == 0) ? Math.min(this.H, Q()) : ((paramde1.b() < 1) ? 0 : (B1(paramde1.b() - 1, paramyd1, paramde1) + 1));
  }
  
  public final View c1(yd1 paramyd1, de1 paramde1, boolean paramBoolean1, boolean paramBoolean2) {
    int i;
    int j = G();
    byte b = 1;
    if (paramBoolean2) {
      i = G() - 1;
      j = -1;
      b = -1;
    } else {
      i = 0;
    } 
    int k = paramde1.b();
    W0();
    int m = this.t.m();
    int n = this.t.i();
    View view2 = null;
    View view1;
    for (view1 = null; i != j; view1 = view4) {
      View view5 = F(i);
      int i1 = a.R(view5);
      View view3 = view2;
      View view4 = view1;
      if (i1 >= 0) {
        view3 = view2;
        view4 = view1;
        if (i1 < k)
          if (C1(i1, paramyd1, paramde1) != 0) {
            view3 = view2;
            view4 = view1;
          } else if (((sd1)view5.getLayoutParams()).b.j()) {
            view3 = view2;
            view4 = view1;
            if (view1 == null) {
              view4 = view5;
              view3 = view2;
            } 
          } else if (this.t.g(view5) >= n || this.t.d(view5) < m) {
            view3 = view2;
            view4 = view1;
            if (view2 == null) {
              view3 = view5;
              view4 = view1;
            } 
          } else {
            return view5;
          }  
      } 
      i += b;
      view2 = view3;
    } 
    return (view2 != null) ? view2 : view1;
  }
  
  public final View f0(View paramView, int paramInt, yd1 paramyd1, de1 paramde1) {
    // Byte code:
    //   0: aload_0
    //   1: getfield c : Landroidx/recyclerview/widget/RecyclerView;
    //   4: astore #19
    //   6: aload #19
    //   8: ifnonnull -> 14
    //   11: goto -> 52
    //   14: aload #19
    //   16: aload_1
    //   17: invokevirtual E : (Landroid/view/View;)Landroid/view/View;
    //   20: astore #20
    //   22: aload #20
    //   24: ifnonnull -> 30
    //   27: goto -> 52
    //   30: aload #20
    //   32: astore #19
    //   34: aload_0
    //   35: getfield b : Ltk;
    //   38: getfield e : Ljava/lang/Object;
    //   41: checkcast java/util/ArrayList
    //   44: aload #20
    //   46: invokevirtual contains : (Ljava/lang/Object;)Z
    //   49: ifeq -> 55
    //   52: aconst_null
    //   53: astore #19
    //   55: aload #19
    //   57: ifnonnull -> 63
    //   60: goto -> 102
    //   63: aload #19
    //   65: invokevirtual getLayoutParams : ()Landroid/view/ViewGroup$LayoutParams;
    //   68: checkcast ve0
    //   71: astore #20
    //   73: aload #20
    //   75: getfield g : I
    //   78: istore #14
    //   80: aload #20
    //   82: getfield h : I
    //   85: iload #14
    //   87: iadd
    //   88: istore #13
    //   90: aload_0
    //   91: aload_1
    //   92: iload_2
    //   93: aload_3
    //   94: aload #4
    //   96: invokespecial f0 : (Landroid/view/View;ILyd1;Lde1;)Landroid/view/View;
    //   99: ifnonnull -> 104
    //   102: aconst_null
    //   103: areturn
    //   104: aload_0
    //   105: iload_2
    //   106: invokevirtual V0 : (I)I
    //   109: iconst_1
    //   110: if_icmpne -> 119
    //   113: iconst_1
    //   114: istore #18
    //   116: goto -> 122
    //   119: iconst_0
    //   120: istore #18
    //   122: iload #18
    //   124: aload_0
    //   125: getfield w : Z
    //   128: if_icmpeq -> 147
    //   131: aload_0
    //   132: invokevirtual G : ()I
    //   135: iconst_1
    //   136: isub
    //   137: istore #5
    //   139: iconst_m1
    //   140: istore_2
    //   141: iconst_m1
    //   142: istore #6
    //   144: goto -> 158
    //   147: aload_0
    //   148: invokevirtual G : ()I
    //   151: istore_2
    //   152: iconst_1
    //   153: istore #6
    //   155: iconst_0
    //   156: istore #5
    //   158: aload_0
    //   159: getfield r : I
    //   162: iconst_1
    //   163: if_icmpne -> 179
    //   166: aload_0
    //   167: invokevirtual h1 : ()Z
    //   170: ifeq -> 179
    //   173: iconst_1
    //   174: istore #7
    //   176: goto -> 182
    //   179: iconst_0
    //   180: istore #7
    //   182: aload_0
    //   183: iload #5
    //   185: aload_3
    //   186: aload #4
    //   188: invokevirtual B1 : (ILyd1;Lde1;)I
    //   191: istore #15
    //   193: aconst_null
    //   194: astore #20
    //   196: iconst_m1
    //   197: istore #10
    //   199: iconst_m1
    //   200: istore #9
    //   202: iconst_0
    //   203: istore #12
    //   205: iconst_0
    //   206: istore #11
    //   208: aconst_null
    //   209: astore_1
    //   210: iload #5
    //   212: istore #8
    //   214: iload_2
    //   215: istore #5
    //   217: iload #12
    //   219: istore_2
    //   220: iload #8
    //   222: iload #5
    //   224: if_icmpeq -> 590
    //   227: aload_0
    //   228: iload #8
    //   230: aload_3
    //   231: aload #4
    //   233: invokevirtual B1 : (ILyd1;Lde1;)I
    //   236: istore #12
    //   238: aload_0
    //   239: iload #8
    //   241: invokevirtual F : (I)Landroid/view/View;
    //   244: astore #21
    //   246: aload #21
    //   248: aload #19
    //   250: if_acmpne -> 256
    //   253: goto -> 590
    //   256: aload #21
    //   258: invokevirtual hasFocusable : ()Z
    //   261: ifeq -> 282
    //   264: iload #12
    //   266: iload #15
    //   268: if_icmpeq -> 282
    //   271: aload #20
    //   273: ifnull -> 279
    //   276: goto -> 590
    //   279: goto -> 580
    //   282: aload #21
    //   284: invokevirtual getLayoutParams : ()Landroid/view/ViewGroup$LayoutParams;
    //   287: checkcast ve0
    //   290: astore #22
    //   292: aload #22
    //   294: getfield g : I
    //   297: istore #16
    //   299: aload #22
    //   301: getfield h : I
    //   304: iload #16
    //   306: iadd
    //   307: istore #17
    //   309: aload #21
    //   311: invokevirtual hasFocusable : ()Z
    //   314: ifeq -> 334
    //   317: iload #16
    //   319: iload #14
    //   321: if_icmpne -> 334
    //   324: iload #17
    //   326: iload #13
    //   328: if_icmpne -> 334
    //   331: aload #21
    //   333: areturn
    //   334: aload #21
    //   336: invokevirtual hasFocusable : ()Z
    //   339: ifeq -> 347
    //   342: aload #20
    //   344: ifnull -> 359
    //   347: aload #21
    //   349: invokevirtual hasFocusable : ()Z
    //   352: ifne -> 362
    //   355: aload_1
    //   356: ifnonnull -> 362
    //   359: goto -> 507
    //   362: iload #16
    //   364: iload #14
    //   366: invokestatic max : (II)I
    //   369: istore #12
    //   371: iload #17
    //   373: iload #13
    //   375: invokestatic min : (II)I
    //   378: iload #12
    //   380: isub
    //   381: istore #12
    //   383: aload #21
    //   385: invokevirtual hasFocusable : ()Z
    //   388: ifeq -> 435
    //   391: iload #12
    //   393: iload_2
    //   394: if_icmple -> 400
    //   397: goto -> 507
    //   400: iload #12
    //   402: iload_2
    //   403: if_icmpne -> 432
    //   406: iload #16
    //   408: iload #9
    //   410: if_icmple -> 419
    //   413: iconst_1
    //   414: istore #12
    //   416: goto -> 422
    //   419: iconst_0
    //   420: istore #12
    //   422: iload #7
    //   424: iload #12
    //   426: if_icmpne -> 432
    //   429: goto -> 397
    //   432: goto -> 580
    //   435: aload #20
    //   437: ifnonnull -> 432
    //   440: aload_0
    //   441: getfield e : Lj01;
    //   444: aload #21
    //   446: invokevirtual o : (Landroid/view/View;)Z
    //   449: ifeq -> 467
    //   452: aload_0
    //   453: getfield f : Lj01;
    //   456: aload #21
    //   458: invokevirtual o : (Landroid/view/View;)Z
    //   461: ifeq -> 467
    //   464: goto -> 580
    //   467: iload #12
    //   469: iload #11
    //   471: if_icmple -> 477
    //   474: goto -> 507
    //   477: iload #12
    //   479: iload #11
    //   481: if_icmpne -> 580
    //   484: iload #16
    //   486: iload #10
    //   488: if_icmple -> 497
    //   491: iconst_1
    //   492: istore #12
    //   494: goto -> 500
    //   497: iconst_0
    //   498: istore #12
    //   500: iload #7
    //   502: iload #12
    //   504: if_icmpne -> 580
    //   507: aload #21
    //   509: invokevirtual hasFocusable : ()Z
    //   512: istore #18
    //   514: aload #22
    //   516: getfield g : I
    //   519: istore #12
    //   521: iload #18
    //   523: ifeq -> 553
    //   526: iload #17
    //   528: iload #13
    //   530: invokestatic min : (II)I
    //   533: iload #16
    //   535: iload #14
    //   537: invokestatic max : (II)I
    //   540: isub
    //   541: istore_2
    //   542: aload #21
    //   544: astore #20
    //   546: iload #12
    //   548: istore #9
    //   550: goto -> 580
    //   553: iload #17
    //   555: iload #13
    //   557: invokestatic min : (II)I
    //   560: iload #16
    //   562: iload #14
    //   564: invokestatic max : (II)I
    //   567: isub
    //   568: istore #11
    //   570: iload #12
    //   572: istore #10
    //   574: aload #21
    //   576: astore_1
    //   577: goto -> 580
    //   580: iload #8
    //   582: iload #6
    //   584: iadd
    //   585: istore #8
    //   587: goto -> 220
    //   590: aload #20
    //   592: ifnull -> 598
    //   595: aload #20
    //   597: areturn
    //   598: aload_1
    //   599: areturn
  }
  
  public final void h0(yd1 paramyd1, de1 paramde1, t0 paramt0) {
    super.h0(paramyd1, paramde1, paramt0);
    paramt0.i("android.widget.GridView");
    id1 id1 = this.c.o;
    if (id1 != null && id1.c() > 1)
      paramt0.b(m0.o); 
  }
  
  public final void i0(yd1 paramyd1, de1 paramde1, View paramView, t0 paramt0) {
    ViewGroup.LayoutParams layoutParams = paramView.getLayoutParams();
    if (!(layoutParams instanceof ve0)) {
      j0(paramView, paramt0);
      return;
    } 
    ve0 ve0 = (ve0)layoutParams;
    int i = B1(((sd1)ve0).b.d(), paramyd1, paramde1);
    int j = this.r;
    int k = ve0.g;
    int m = ve0.h;
    if (j == 0) {
      paramt0.j(s0.a(false, k, m, i, 1));
      return;
    } 
    paramt0.j(s0.a(false, i, 1, k, m));
  }
  
  public final void i1(yd1 paramyd1, de1 paramde1, hn0 paramhn0, gn0 paramgn0) {
    StringBuilder stringBuilder;
    int i3 = this.t.l();
    if (i3 != 1073741824) {
      j = 1;
    } else {
      j = 0;
    } 
    if (G() > 0) {
      k = this.I[this.H];
    } else {
      k = 0;
    } 
    if (j)
      G1(); 
    if (paramhn0.e == 1) {
      m = 1;
    } else {
      m = 0;
    } 
    int i = this.H;
    if (!m)
      i = C1(paramhn0.d, paramyd1, paramde1) + D1(paramhn0.d, paramyd1, paramde1); 
    byte b = 0;
    while (b < this.H) {
      n = paramhn0.d;
      if (n >= 0 && n < paramde1.b() && i > 0) {
        n = paramhn0.d;
        i1 = D1(n, paramyd1, paramde1);
        if (i1 <= this.H) {
          i -= i1;
          if (i < 0)
            break; 
          View view = paramhn0.b(paramyd1);
          if (view == null)
            break; 
          this.J[b] = view;
          b++;
          continue;
        } 
        stringBuilder = new StringBuilder("Item at position ");
        stringBuilder.append(n);
        stringBuilder.append(" requires ");
        stringBuilder.append(i1);
        stringBuilder.append(" spans but GridLayoutManager has only ");
        l0.l(x41.m(stringBuilder, this.H, " spans."));
        return;
      } 
    } 
    if (b == 0) {
      paramgn0.b = true;
      return;
    } 
    if (m) {
      n = 1;
      i1 = b;
      i = 0;
    } else {
      i = b - 1;
      i1 = -1;
      n = -1;
    } 
    int i2 = 0;
    while (i != i1) {
      View view = this.J[i];
      ve0 ve0 = (ve0)view.getLayoutParams();
      int i4 = D1(a.R(view), (yd1)stringBuilder, paramde1);
      ve0.h = i4;
      ve0.g = i2;
      i2 += i4;
      i += n;
    } 
    float f = 0.0F;
    int i1 = 0;
    for (i = 0; i1 < b; i = n) {
      View view = this.J[i1];
      if (paramhn0.k == null) {
        if (m) {
          l(view, -1, false);
        } else {
          l(view, 0, false);
        } 
      } else if (m) {
        l(view, -1, true);
      } else {
        l(view, 0, true);
      } 
      n(view, this.N);
      E1(view, i3, false);
      i2 = this.t.e(view);
      n = i;
      if (i2 > i)
        n = i2; 
      ve0 ve0 = (ve0)view.getLayoutParams();
      float f2 = this.t.f(view) * 1.0F / ve0.h;
      float f1 = f;
      if (f2 > f)
        f1 = f2; 
      i1++;
      f = f1;
    } 
    int m = i;
    if (j) {
      u1(Math.max(Math.round(f * this.H), k));
      i = 0;
      j = 0;
      while (true) {
        m = i;
        if (j < b) {
          View view = this.J[j];
          E1(view, 1073741824, true);
          m = this.t.e(view);
          k = i;
          if (m > i)
            k = m; 
          j++;
          i = k;
          continue;
        } 
        break;
      } 
    } 
    for (i = 0; i < b; i++) {
      View view = this.J[i];
      if (this.t.e(view) != m) {
        ve0 ve0 = (ve0)view.getLayoutParams();
        Rect rect = ((sd1)ve0).c;
        k = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams)ve0).topMargin + ((ViewGroup.MarginLayoutParams)ve0).bottomMargin;
        j = rect.left + rect.right + ((ViewGroup.MarginLayoutParams)ve0).leftMargin + ((ViewGroup.MarginLayoutParams)ve0).rightMargin;
        n = A1(ve0.g, ve0.h);
        if (this.r == 1) {
          j = a.H(false, n, 1073741824, j, ((ViewGroup.MarginLayoutParams)ve0).width);
          k = View.MeasureSpec.makeMeasureSpec(m - k, 1073741824);
        } else {
          j = View.MeasureSpec.makeMeasureSpec(m - j, 1073741824);
          k = a.H(false, n, 1073741824, k, ((ViewGroup.MarginLayoutParams)ve0).height);
        } 
        if (N0(view, j, k, (sd1)view.getLayoutParams()))
          view.measure(j, k); 
      } 
    } 
    paramgn0.a = m;
    i = this.r;
    int j = paramhn0.f;
    int k = paramhn0.b;
    if (i == 1) {
      if (j == -1) {
        m = k - m;
        i = 0;
        j = 0;
      } else {
        j = 0;
        n = k;
        k += m;
        i = 0;
        m = n;
      } 
    } else {
      if (j == -1) {
        i = k - m;
        j = k;
      } else {
        j = k + m;
        i = k;
      } 
      m = 0;
      k = 0;
    } 
    i1 = 0;
    int n = k;
    k = i1;
    while (true) {
      ve0 ve0;
      View[] arrayOfView = this.J;
      if (k < b) {
        View view = arrayOfView[k];
        ve0 = (ve0)view.getLayoutParams();
        if (this.r == 1) {
          if (h1()) {
            i = getPaddingLeft() + this.I[this.H - ve0.g];
            i1 = this.t.f(view);
            j = i;
            i -= i1;
          } else {
            i = getPaddingLeft() + this.I[ve0.g];
            j = this.t.f(view) + i;
          } 
        } else {
          m = getPaddingTop() + this.I[ve0.g];
          n = this.t.f(view) + m;
        } 
        a.Y(view, i, m, j, n);
        if (((sd1)ve0).b.j() || ((sd1)ve0).b.m())
          paramgn0.c = true; 
        boolean bool = paramgn0.d;
        paramgn0.d = view.hasFocusable() | bool;
        k++;
        continue;
      } 
      Arrays.fill((Object[])ve0, (Object)null);
      return;
    } 
  }
  
  public final void j1(yd1 paramyd1, de1 paramde1, fn0 paramfn0, int paramInt) {
    G1();
    if (paramde1.b() > 0 && !paramde1.g) {
      int i;
      if (paramInt == 1) {
        i = 1;
      } else {
        i = 0;
      } 
      paramInt = C1(paramfn0.b, paramyd1, paramde1);
      if (i) {
        while (paramInt > 0) {
          paramInt = paramfn0.b;
          if (paramInt > 0) {
            paramfn0.b = --paramInt;
            paramInt = C1(paramInt, paramyd1, paramde1);
          } 
        } 
      } else {
        int j = paramde1.b();
        i = paramfn0.b;
        while (i < j - 1) {
          int m = i + 1;
          int k = C1(m, paramyd1, paramde1);
          if (k > paramInt) {
            i = m;
            paramInt = k;
          } 
        } 
        paramfn0.b = i;
      } 
    } 
    v1();
  }
  
  public final void k0(int paramInt1, int paramInt2) {
    g7 g71 = this.M;
    g71.z();
    ((SparseIntArray)g71.e).clear();
  }
  
  public final void l0() {
    g7 g71 = this.M;
    g71.z();
    ((SparseIntArray)g71.e).clear();
  }
  
  public final void m0(int paramInt1, int paramInt2) {
    g7 g71 = this.M;
    g71.z();
    ((SparseIntArray)g71.e).clear();
  }
  
  public final void n0(int paramInt1, int paramInt2) {
    g7 g71 = this.M;
    g71.z();
    ((SparseIntArray)g71.e).clear();
  }
  
  public final void p0(RecyclerView paramRecyclerView, int paramInt1, int paramInt2) {
    g7 g71 = this.M;
    g71.z();
    ((SparseIntArray)g71.e).clear();
  }
  
  public final boolean q(sd1 paramsd1) {
    return paramsd1 instanceof ve0;
  }
  
  public void q0(yd1 paramyd1, de1 paramde1) {
    boolean bool = paramde1.g;
    SparseIntArray sparseIntArray1 = this.L;
    SparseIntArray sparseIntArray2 = this.K;
    if (bool) {
      int i = G();
      for (byte b = 0; b < i; b++) {
        ve0 ve0 = (ve0)F(b).getLayoutParams();
        int j = ((sd1)ve0).b.d();
        sparseIntArray2.put(j, ve0.h);
        sparseIntArray1.put(j, ve0.g);
      } 
    } 
    super.q0(paramyd1, paramde1);
    sparseIntArray2.clear();
    sparseIntArray1.clear();
  }
  
  public final void q1(boolean paramBoolean) {
    if (!paramBoolean) {
      super.q1(false);
      return;
    } 
    tp.j("GridLayoutManager does not support stack from end. Consider using reverse layout");
  }
  
  public final void r0(de1 paramde1) {
    super.r0(paramde1);
    this.G = false;
    int i = this.O;
    if (i != -1) {
      View view = B(i);
      if (view != null) {
        view.sendAccessibilityEvent(67108864);
        this.O = -1;
      } 
    } 
  }
  
  public final void u1(int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: getfield I : [I
    //   4: astore #9
    //   6: aload_0
    //   7: getfield H : I
    //   10: istore #6
    //   12: iconst_1
    //   13: istore_3
    //   14: aload #9
    //   16: ifnull -> 45
    //   19: aload #9
    //   21: arraylength
    //   22: iload #6
    //   24: iconst_1
    //   25: iadd
    //   26: if_icmpne -> 45
    //   29: aload #9
    //   31: astore #8
    //   33: aload #9
    //   35: aload #9
    //   37: arraylength
    //   38: iconst_1
    //   39: isub
    //   40: iaload
    //   41: iload_1
    //   42: if_icmpeq -> 53
    //   45: iload #6
    //   47: iconst_1
    //   48: iadd
    //   49: newarray int
    //   51: astore #8
    //   53: iconst_0
    //   54: istore #4
    //   56: aload #8
    //   58: iconst_0
    //   59: iconst_0
    //   60: iastore
    //   61: iload_1
    //   62: iload #6
    //   64: idiv
    //   65: istore #5
    //   67: iload_1
    //   68: iload #6
    //   70: irem
    //   71: istore #7
    //   73: iconst_0
    //   74: istore_2
    //   75: iload #4
    //   77: istore_1
    //   78: iload_3
    //   79: iload #6
    //   81: if_icmpgt -> 136
    //   84: iload_1
    //   85: iload #7
    //   87: iadd
    //   88: istore_1
    //   89: iload_1
    //   90: ifle -> 116
    //   93: iload #6
    //   95: iload_1
    //   96: isub
    //   97: iload #7
    //   99: if_icmpge -> 116
    //   102: iload #5
    //   104: iconst_1
    //   105: iadd
    //   106: istore #4
    //   108: iload_1
    //   109: iload #6
    //   111: isub
    //   112: istore_1
    //   113: goto -> 120
    //   116: iload #5
    //   118: istore #4
    //   120: iload_2
    //   121: iload #4
    //   123: iadd
    //   124: istore_2
    //   125: aload #8
    //   127: iload_3
    //   128: iload_2
    //   129: iastore
    //   130: iinc #3, 1
    //   133: goto -> 78
    //   136: aload_0
    //   137: aload #8
    //   139: putfield I : [I
    //   142: return
  }
  
  public final int v(de1 paramde1) {
    return T0(paramde1);
  }
  
  public final boolean v0(int paramInt, Bundle paramBundle) {
    // Byte code:
    //   0: iload_1
    //   1: getstatic m0.o : Lm0;
    //   4: invokevirtual a : ()I
    //   7: if_icmpne -> 1167
    //   10: iload_1
    //   11: iconst_m1
    //   12: if_icmpeq -> 1167
    //   15: iconst_0
    //   16: istore_1
    //   17: iload_1
    //   18: aload_0
    //   19: invokevirtual G : ()I
    //   22: if_icmpge -> 62
    //   25: aload_0
    //   26: iload_1
    //   27: invokevirtual F : (I)Landroid/view/View;
    //   30: astore #9
    //   32: aload #9
    //   34: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   37: pop
    //   38: aload #9
    //   40: invokevirtual isAccessibilityFocused : ()Z
    //   43: ifeq -> 56
    //   46: aload_0
    //   47: iload_1
    //   48: invokevirtual F : (I)Landroid/view/View;
    //   51: astore #9
    //   53: goto -> 65
    //   56: iinc #1, 1
    //   59: goto -> 17
    //   62: aconst_null
    //   63: astore #9
    //   65: aload #9
    //   67: ifnonnull -> 73
    //   70: goto -> 1334
    //   73: aload_2
    //   74: ifnonnull -> 80
    //   77: goto -> 1334
    //   80: aload_2
    //   81: getstatic com/google/android/gms/dynamite/descriptors/com/google/android/gms/flags/Ou/tlzLOCPTHRhep.aEI : Ljava/lang/String;
    //   84: iconst_m1
    //   85: invokevirtual getInt : (Ljava/lang/String;I)I
    //   88: istore #6
    //   90: getstatic androidx/recyclerview/widget/GridLayoutManager.R : Ljava/util/Set;
    //   93: iload #6
    //   95: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   98: invokeinterface contains : (Ljava/lang/Object;)Z
    //   103: ifne -> 109
    //   106: goto -> 1334
    //   109: aload_0
    //   110: getfield c : Landroidx/recyclerview/widget/RecyclerView;
    //   113: aload #9
    //   115: invokevirtual N : (Landroid/view/View;)Lhe1;
    //   118: astore_2
    //   119: aload_2
    //   120: ifnonnull -> 126
    //   123: goto -> 1334
    //   126: aload_2
    //   127: invokevirtual b : ()I
    //   130: istore #7
    //   132: aload_0
    //   133: iload #7
    //   135: invokevirtual x1 : (I)I
    //   138: istore #5
    //   140: aload_0
    //   141: iload #7
    //   143: invokevirtual w1 : (I)I
    //   146: istore #4
    //   148: iload #5
    //   150: iflt -> 1334
    //   153: iload #4
    //   155: ifge -> 161
    //   158: goto -> 1334
    //   161: aload_0
    //   162: iload #7
    //   164: invokevirtual y1 : (I)Ljava/util/HashSet;
    //   167: aload_0
    //   168: getfield P : I
    //   171: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   174: invokevirtual contains : (Ljava/lang/Object;)Z
    //   177: ifeq -> 205
    //   180: aload_0
    //   181: aload_0
    //   182: iload #7
    //   184: invokevirtual w1 : (I)I
    //   187: iload #7
    //   189: invokevirtual z1 : (II)Ljava/util/HashSet;
    //   192: aload_0
    //   193: getfield Q : I
    //   196: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   199: invokevirtual contains : (Ljava/lang/Object;)Z
    //   202: ifne -> 217
    //   205: aload_0
    //   206: iload #5
    //   208: putfield P : I
    //   211: aload_0
    //   212: iload #4
    //   214: putfield Q : I
    //   217: aload_0
    //   218: getfield P : I
    //   221: istore_1
    //   222: iload_1
    //   223: istore_3
    //   224: iload_1
    //   225: iconst_m1
    //   226: if_icmpne -> 232
    //   229: iload #5
    //   231: istore_3
    //   232: aload_0
    //   233: getfield Q : I
    //   236: istore_1
    //   237: iload_1
    //   238: iconst_m1
    //   239: if_icmpne -> 245
    //   242: goto -> 248
    //   245: iload_1
    //   246: istore #4
    //   248: iload #6
    //   250: bipush #17
    //   252: if_icmpeq -> 646
    //   255: iload #6
    //   257: bipush #33
    //   259: if_icmpeq -> 526
    //   262: iload #6
    //   264: bipush #66
    //   266: if_icmpeq -> 407
    //   269: iload #6
    //   271: sipush #130
    //   274: if_icmpeq -> 280
    //   277: goto -> 1334
    //   280: iload #7
    //   282: iconst_1
    //   283: iadd
    //   284: istore_1
    //   285: iload_1
    //   286: aload_0
    //   287: invokevirtual Q : ()I
    //   290: if_icmpge -> 402
    //   293: aload_0
    //   294: iload_1
    //   295: invokevirtual x1 : (I)I
    //   298: istore #8
    //   300: aload_0
    //   301: iload_1
    //   302: invokevirtual w1 : (I)I
    //   305: istore #7
    //   307: iload #8
    //   309: iflt -> 402
    //   312: iload #7
    //   314: ifge -> 320
    //   317: goto -> 402
    //   320: aload_0
    //   321: getfield r : I
    //   324: iconst_1
    //   325: if_icmpne -> 371
    //   328: iload #8
    //   330: iload_3
    //   331: if_icmple -> 396
    //   334: iload #7
    //   336: iload #4
    //   338: if_icmpeq -> 362
    //   341: aload_0
    //   342: aload_0
    //   343: iload_1
    //   344: invokevirtual w1 : (I)I
    //   347: iload_1
    //   348: invokevirtual z1 : (II)Ljava/util/HashSet;
    //   351: iload #4
    //   353: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   356: invokevirtual contains : (Ljava/lang/Object;)Z
    //   359: ifeq -> 396
    //   362: aload_0
    //   363: iload #8
    //   365: putfield P : I
    //   368: goto -> 761
    //   371: iload #8
    //   373: iload_3
    //   374: if_icmple -> 396
    //   377: iload #7
    //   379: iload #4
    //   381: if_icmpne -> 396
    //   384: aload_0
    //   385: aload_0
    //   386: iload_1
    //   387: invokevirtual x1 : (I)I
    //   390: putfield P : I
    //   393: goto -> 761
    //   396: iinc #1, 1
    //   399: goto -> 285
    //   402: iconst_m1
    //   403: istore_1
    //   404: goto -> 761
    //   407: iload #7
    //   409: iconst_1
    //   410: iadd
    //   411: istore_1
    //   412: iload_1
    //   413: aload_0
    //   414: invokevirtual Q : ()I
    //   417: if_icmpge -> 402
    //   420: aload_0
    //   421: iload_1
    //   422: invokevirtual x1 : (I)I
    //   425: istore #7
    //   427: aload_0
    //   428: iload_1
    //   429: invokevirtual w1 : (I)I
    //   432: istore #8
    //   434: iload #7
    //   436: iflt -> 402
    //   439: iload #8
    //   441: ifge -> 447
    //   444: goto -> 402
    //   447: aload_0
    //   448: getfield r : I
    //   451: iconst_1
    //   452: if_icmpne -> 489
    //   455: iload #7
    //   457: iload_3
    //   458: if_icmpne -> 468
    //   461: iload #8
    //   463: iload #4
    //   465: if_icmpgt -> 474
    //   468: iload #7
    //   470: iload_3
    //   471: if_icmple -> 520
    //   474: aload_0
    //   475: iload #7
    //   477: putfield P : I
    //   480: aload_0
    //   481: iload #8
    //   483: putfield Q : I
    //   486: goto -> 761
    //   489: iload #8
    //   491: iload #4
    //   493: if_icmple -> 520
    //   496: aload_0
    //   497: iload_1
    //   498: invokevirtual y1 : (I)Ljava/util/HashSet;
    //   501: iload_3
    //   502: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   505: invokevirtual contains : (Ljava/lang/Object;)Z
    //   508: ifeq -> 520
    //   511: aload_0
    //   512: iload #8
    //   514: putfield Q : I
    //   517: goto -> 761
    //   520: iinc #1, 1
    //   523: goto -> 412
    //   526: iload #7
    //   528: iconst_1
    //   529: isub
    //   530: istore_1
    //   531: iload_1
    //   532: iflt -> 402
    //   535: aload_0
    //   536: iload_1
    //   537: invokevirtual x1 : (I)I
    //   540: istore #8
    //   542: aload_0
    //   543: iload_1
    //   544: invokevirtual w1 : (I)I
    //   547: istore #7
    //   549: iload #8
    //   551: iflt -> 402
    //   554: iload #7
    //   556: ifge -> 562
    //   559: goto -> 402
    //   562: aload_0
    //   563: getfield r : I
    //   566: iconst_1
    //   567: if_icmpne -> 606
    //   570: iload #8
    //   572: iload_3
    //   573: if_icmpge -> 640
    //   576: aload_0
    //   577: aload_0
    //   578: iload_1
    //   579: invokevirtual w1 : (I)I
    //   582: iload_1
    //   583: invokevirtual z1 : (II)Ljava/util/HashSet;
    //   586: iload #4
    //   588: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   591: invokevirtual contains : (Ljava/lang/Object;)Z
    //   594: ifeq -> 640
    //   597: aload_0
    //   598: iload #8
    //   600: putfield P : I
    //   603: goto -> 761
    //   606: iload #8
    //   608: iload_3
    //   609: if_icmpge -> 640
    //   612: iload #7
    //   614: iload #4
    //   616: if_icmpne -> 640
    //   619: aload_0
    //   620: aload_0
    //   621: iload_1
    //   622: invokevirtual y1 : (I)Ljava/util/HashSet;
    //   625: invokestatic max : (Ljava/util/Collection;)Ljava/lang/Object;
    //   628: checkcast java/lang/Integer
    //   631: invokevirtual intValue : ()I
    //   634: putfield P : I
    //   637: goto -> 761
    //   640: iinc #1, -1
    //   643: goto -> 531
    //   646: iload #7
    //   648: iconst_1
    //   649: isub
    //   650: istore_1
    //   651: iload_1
    //   652: iflt -> 402
    //   655: aload_0
    //   656: iload_1
    //   657: invokevirtual x1 : (I)I
    //   660: istore #8
    //   662: aload_0
    //   663: iload_1
    //   664: invokevirtual w1 : (I)I
    //   667: istore #7
    //   669: iload #8
    //   671: iflt -> 402
    //   674: iload #7
    //   676: ifge -> 682
    //   679: goto -> 402
    //   682: aload_0
    //   683: getfield r : I
    //   686: iconst_1
    //   687: if_icmpne -> 724
    //   690: iload #8
    //   692: iload_3
    //   693: if_icmpne -> 703
    //   696: iload #7
    //   698: iload #4
    //   700: if_icmplt -> 709
    //   703: iload #8
    //   705: iload_3
    //   706: if_icmpge -> 755
    //   709: aload_0
    //   710: iload #8
    //   712: putfield P : I
    //   715: aload_0
    //   716: iload #7
    //   718: putfield Q : I
    //   721: goto -> 761
    //   724: aload_0
    //   725: iload_1
    //   726: invokevirtual y1 : (I)Ljava/util/HashSet;
    //   729: iload_3
    //   730: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   733: invokevirtual contains : (Ljava/lang/Object;)Z
    //   736: ifeq -> 755
    //   739: iload #7
    //   741: iload #4
    //   743: if_icmpge -> 755
    //   746: aload_0
    //   747: iload #7
    //   749: putfield Q : I
    //   752: goto -> 761
    //   755: iinc #1, -1
    //   758: goto -> 651
    //   761: iload_1
    //   762: istore_3
    //   763: iload_1
    //   764: iconst_m1
    //   765: if_icmpne -> 1150
    //   768: aload_0
    //   769: getfield r : I
    //   772: istore #4
    //   774: iload_1
    //   775: istore_3
    //   776: iload #4
    //   778: ifne -> 1150
    //   781: iload #6
    //   783: bipush #17
    //   785: if_icmpne -> 966
    //   788: iload #5
    //   790: ifge -> 798
    //   793: iconst_m1
    //   794: istore_3
    //   795: goto -> 1150
    //   798: iload #4
    //   800: iconst_1
    //   801: if_icmpne -> 807
    //   804: goto -> 793
    //   807: new java/util/TreeMap
    //   810: dup
    //   811: invokestatic reverseOrder : ()Ljava/util/Comparator;
    //   814: invokespecial <init> : (Ljava/util/Comparator;)V
    //   817: astore_2
    //   818: iconst_0
    //   819: istore_1
    //   820: iload_1
    //   821: aload_0
    //   822: invokevirtual Q : ()I
    //   825: if_icmpge -> 891
    //   828: aload_0
    //   829: iload_1
    //   830: invokevirtual y1 : (I)Ljava/util/HashSet;
    //   833: invokevirtual iterator : ()Ljava/util/Iterator;
    //   836: astore #9
    //   838: aload #9
    //   840: invokeinterface hasNext : ()Z
    //   845: ifeq -> 885
    //   848: aload #9
    //   850: invokeinterface next : ()Ljava/lang/Object;
    //   855: checkcast java/lang/Integer
    //   858: astore #10
    //   860: aload #10
    //   862: invokevirtual intValue : ()I
    //   865: ifge -> 871
    //   868: goto -> 793
    //   871: aload_2
    //   872: aload #10
    //   874: iload_1
    //   875: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   878: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   881: pop
    //   882: goto -> 838
    //   885: iinc #1, 1
    //   888: goto -> 820
    //   891: aload_2
    //   892: invokevirtual keySet : ()Ljava/util/Set;
    //   895: invokeinterface iterator : ()Ljava/util/Iterator;
    //   900: astore #9
    //   902: aload #9
    //   904: invokeinterface hasNext : ()Z
    //   909: ifeq -> 793
    //   912: aload #9
    //   914: invokeinterface next : ()Ljava/lang/Object;
    //   919: checkcast java/lang/Integer
    //   922: astore #10
    //   924: aload #10
    //   926: invokevirtual intValue : ()I
    //   929: istore_1
    //   930: iload_1
    //   931: iload #5
    //   933: if_icmpge -> 902
    //   936: aload_2
    //   937: aload #10
    //   939: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   942: checkcast java/lang/Integer
    //   945: invokevirtual intValue : ()I
    //   948: istore_3
    //   949: aload_0
    //   950: iload_1
    //   951: putfield P : I
    //   954: aload_0
    //   955: aload_0
    //   956: iload_3
    //   957: invokevirtual w1 : (I)I
    //   960: putfield Q : I
    //   963: goto -> 1150
    //   966: iload_1
    //   967: istore_3
    //   968: iload #6
    //   970: bipush #66
    //   972: if_icmpne -> 1150
    //   975: iload #5
    //   977: ifge -> 983
    //   980: goto -> 793
    //   983: iload #4
    //   985: iconst_1
    //   986: if_icmpne -> 992
    //   989: goto -> 793
    //   992: new java/util/TreeMap
    //   995: dup
    //   996: invokespecial <init> : ()V
    //   999: astore_2
    //   1000: iconst_0
    //   1001: istore_1
    //   1002: iload_1
    //   1003: aload_0
    //   1004: invokevirtual Q : ()I
    //   1007: if_icmpge -> 1082
    //   1010: aload_0
    //   1011: iload_1
    //   1012: invokevirtual y1 : (I)Ljava/util/HashSet;
    //   1015: invokevirtual iterator : ()Ljava/util/Iterator;
    //   1018: astore #10
    //   1020: aload #10
    //   1022: invokeinterface hasNext : ()Z
    //   1027: ifeq -> 1076
    //   1030: aload #10
    //   1032: invokeinterface next : ()Ljava/lang/Object;
    //   1037: checkcast java/lang/Integer
    //   1040: astore #9
    //   1042: aload #9
    //   1044: invokevirtual intValue : ()I
    //   1047: ifge -> 1053
    //   1050: goto -> 793
    //   1053: aload_2
    //   1054: aload #9
    //   1056: invokevirtual containsKey : (Ljava/lang/Object;)Z
    //   1059: ifne -> 1020
    //   1062: aload_2
    //   1063: aload #9
    //   1065: iload_1
    //   1066: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1069: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   1072: pop
    //   1073: goto -> 1020
    //   1076: iinc #1, 1
    //   1079: goto -> 1002
    //   1082: aload_2
    //   1083: invokevirtual keySet : ()Ljava/util/Set;
    //   1086: invokeinterface iterator : ()Ljava/util/Iterator;
    //   1091: astore #10
    //   1093: aload #10
    //   1095: invokeinterface hasNext : ()Z
    //   1100: ifeq -> 793
    //   1103: aload #10
    //   1105: invokeinterface next : ()Ljava/lang/Object;
    //   1110: checkcast java/lang/Integer
    //   1113: astore #9
    //   1115: aload #9
    //   1117: invokevirtual intValue : ()I
    //   1120: istore_1
    //   1121: iload_1
    //   1122: iload #5
    //   1124: if_icmple -> 1093
    //   1127: aload_2
    //   1128: aload #9
    //   1130: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1133: checkcast java/lang/Integer
    //   1136: invokevirtual intValue : ()I
    //   1139: istore_3
    //   1140: aload_0
    //   1141: iload_1
    //   1142: putfield P : I
    //   1145: aload_0
    //   1146: iconst_0
    //   1147: putfield Q : I
    //   1150: iload_3
    //   1151: iconst_m1
    //   1152: if_icmpeq -> 1334
    //   1155: aload_0
    //   1156: iload_3
    //   1157: invokevirtual E0 : (I)V
    //   1160: aload_0
    //   1161: iload_3
    //   1162: putfield O : I
    //   1165: iconst_1
    //   1166: ireturn
    //   1167: iload_1
    //   1168: ldc_w 16908343
    //   1171: if_icmpne -> 1336
    //   1174: aload_2
    //   1175: ifnull -> 1336
    //   1178: aload_2
    //   1179: ldc_w 'android.view.accessibility.action.ARGUMENT_ROW_INT'
    //   1182: iconst_m1
    //   1183: invokevirtual getInt : (Ljava/lang/String;I)I
    //   1186: istore #4
    //   1188: aload_2
    //   1189: ldc_w 'android.view.accessibility.action.ARGUMENT_COLUMN_INT'
    //   1192: iconst_m1
    //   1193: invokevirtual getInt : (Ljava/lang/String;I)I
    //   1196: istore #5
    //   1198: iload #4
    //   1200: iconst_m1
    //   1201: if_icmpeq -> 1334
    //   1204: iload #5
    //   1206: iconst_m1
    //   1207: if_icmpne -> 1213
    //   1210: goto -> 1334
    //   1213: aload_0
    //   1214: getfield c : Landroidx/recyclerview/widget/RecyclerView;
    //   1217: getfield o : Lid1;
    //   1220: invokevirtual c : ()I
    //   1223: istore_3
    //   1224: iconst_0
    //   1225: istore_1
    //   1226: iload_1
    //   1227: iload_3
    //   1228: if_icmpge -> 1319
    //   1231: aload_0
    //   1232: getfield c : Landroidx/recyclerview/widget/RecyclerView;
    //   1235: astore_2
    //   1236: aload_0
    //   1237: iload_1
    //   1238: aload_2
    //   1239: getfield e : Lyd1;
    //   1242: aload_2
    //   1243: getfield j0 : Lde1;
    //   1246: invokevirtual C1 : (ILyd1;Lde1;)I
    //   1249: istore #6
    //   1251: aload_0
    //   1252: getfield c : Landroidx/recyclerview/widget/RecyclerView;
    //   1255: astore_2
    //   1256: aload_0
    //   1257: iload_1
    //   1258: aload_2
    //   1259: getfield e : Lyd1;
    //   1262: aload_2
    //   1263: getfield j0 : Lde1;
    //   1266: invokevirtual B1 : (ILyd1;Lde1;)I
    //   1269: istore #7
    //   1271: aload_0
    //   1272: getfield r : I
    //   1275: iconst_1
    //   1276: if_icmpne -> 1296
    //   1279: iload #6
    //   1281: iload #5
    //   1283: if_icmpne -> 1313
    //   1286: iload #7
    //   1288: iload #4
    //   1290: if_icmpne -> 1313
    //   1293: goto -> 1321
    //   1296: iload #6
    //   1298: iload #4
    //   1300: if_icmpne -> 1313
    //   1303: iload #7
    //   1305: iload #5
    //   1307: if_icmpne -> 1313
    //   1310: goto -> 1321
    //   1313: iinc #1, 1
    //   1316: goto -> 1226
    //   1319: iconst_m1
    //   1320: istore_1
    //   1321: iload_1
    //   1322: iconst_m1
    //   1323: if_icmple -> 1334
    //   1326: aload_0
    //   1327: iload_1
    //   1328: iconst_0
    //   1329: invokevirtual o1 : (II)V
    //   1332: iconst_1
    //   1333: ireturn
    //   1334: iconst_0
    //   1335: ireturn
    //   1336: aload_0
    //   1337: iload_1
    //   1338: aload_2
    //   1339: invokespecial v0 : (ILandroid/os/Bundle;)Z
    //   1342: ireturn
  }
  
  public final void v1() {
    View[] arrayOfView = this.J;
    if (arrayOfView == null || arrayOfView.length != this.H) {
      this.J = new View[this.H];
      return;
    } 
  }
  
  public final int w(de1 paramde1) {
    return U0(paramde1);
  }
  
  public final int w1(int paramInt) {
    int i = this.r;
    RecyclerView recyclerView = this.c;
    return (i == 0) ? B1(paramInt, recyclerView.e, recyclerView.j0) : C1(paramInt, recyclerView.e, recyclerView.j0);
  }
  
  public final int x1(int paramInt) {
    int i = this.r;
    RecyclerView recyclerView = this.c;
    return (i == 1) ? B1(paramInt, recyclerView.e, recyclerView.j0) : C1(paramInt, recyclerView.e, recyclerView.j0);
  }
  
  public final int y(de1 paramde1) {
    return T0(paramde1);
  }
  
  public final HashSet y1(int paramInt) {
    return z1(x1(paramInt), paramInt);
  }
  
  public final int z(de1 paramde1) {
    return U0(paramde1);
  }
  
  public final HashSet z1(int paramInt1, int paramInt2) {
    HashSet<Integer> hashSet = new HashSet();
    RecyclerView recyclerView = this.c;
    int i = D1(paramInt2, recyclerView.e, recyclerView.j0);
    for (paramInt2 = paramInt1; paramInt2 < paramInt1 + i; paramInt2++)
      hashSet.add(Integer.valueOf(paramInt2)); 
    return hashSet;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\androidx\recyclerview\widget\GridLayoutManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
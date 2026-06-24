package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import ce1;
import dd1;
import de1;
import f51;
import il;
import in.krosbits.android.widgets.swipetoloadlayout.vZ.LHyji;
import j01;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.WeakHashMap;
import kn0;
import l0;
import rd1;
import s0;
import sd1;
import t0;
import tl0;
import v22;
import vp0;
import wo1;
import xo1;
import yd1;
import yi1;
import zo1;

public class StaggeredGridLayoutManager extends a implements ce1 {
  public final BitSet A;
  
  public int B = -1;
  
  public int C = Integer.MIN_VALUE;
  
  public final j01 D;
  
  public final int E;
  
  public boolean F;
  
  public boolean G;
  
  public zo1 H;
  
  public final Rect I;
  
  public final wo1 J;
  
  public final boolean K;
  
  public int[] L;
  
  public final yi1 M;
  
  public final int r = -1;
  
  public final vp0[] s;
  
  public final f51 t;
  
  public final f51 u;
  
  public final int v;
  
  public int w;
  
  public final tl0 x;
  
  public boolean y = false;
  
  public boolean z = false;
  
  public StaggeredGridLayoutManager(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2) {
    j01 j011 = new j01(10, false);
    this.D = j011;
    this.E = 2;
    this.I = new Rect();
    this.J = new wo1(this);
    this.K = true;
    this.M = new yi1(3, this);
    rd1 rd1 = a.S(paramContext, paramAttributeSet, paramInt1, paramInt2);
    paramInt1 = rd1.a;
    if (paramInt1 == 0 || paramInt1 == 1) {
      m(null);
      if (paramInt1 != this.v) {
        this.v = paramInt1;
        f51 f511 = this.t;
        this.t = this.u;
        this.u = f511;
        C0();
      } 
      paramInt1 = rd1.b;
      m(null);
      if (paramInt1 != this.r) {
        j011.d();
        C0();
        this.r = paramInt1;
        this.A = new BitSet(this.r);
        this.s = new vp0[this.r];
        for (paramInt1 = 0; paramInt1 < this.r; paramInt1++)
          this.s[paramInt1] = new vp0(this, paramInt1); 
        C0();
      } 
      boolean bool = rd1.c;
      m(null);
      zo1 zo11 = this.H;
      if (zo11 != null && zo11.j != bool)
        zo11.j = bool; 
      this.y = bool;
      C0();
      Object object = new Object();
      ((tl0)object).a = true;
      ((tl0)object).f = 0;
      ((tl0)object).g = 0;
      this.x = (tl0)object;
      this.t = f51.b(this, this.v);
      this.u = f51.b(this, 1 - this.v);
      return;
    } 
    l0.l(LHyji.JBqTLyVL);
    throw null;
  }
  
  public static int r1(int paramInt1, int paramInt2, int paramInt3) {
    if (paramInt2 != 0 || paramInt3 != 0) {
      int i = View.MeasureSpec.getMode(paramInt1);
      if (i == Integer.MIN_VALUE || i == 1073741824)
        return View.MeasureSpec.makeMeasureSpec(Math.max(0, View.MeasureSpec.getSize(paramInt1) - paramInt2 - paramInt3), i); 
    } 
    return paramInt1;
  }
  
  public final sd1 C() {
    return (this.v == 0) ? new sd1(-2, -1) : new sd1(-1, -2);
  }
  
  public final sd1 D(Context paramContext, AttributeSet paramAttributeSet) {
    return new sd1(paramContext, paramAttributeSet);
  }
  
  public final int D0(int paramInt, yd1 paramyd1, de1 paramde1) {
    return n1(paramInt, paramyd1, paramde1);
  }
  
  public final sd1 E(ViewGroup.LayoutParams paramLayoutParams) {
    return (paramLayoutParams instanceof ViewGroup.MarginLayoutParams) ? new sd1((ViewGroup.MarginLayoutParams)paramLayoutParams) : new sd1(paramLayoutParams);
  }
  
  public final void E0(int paramInt) {
    zo1 zo11 = this.H;
    if (zo11 != null && zo11.b != paramInt) {
      zo11.f = null;
      zo11.e = 0;
      zo11.b = -1;
      zo11.c = -1;
    } 
    this.B = paramInt;
    this.C = Integer.MIN_VALUE;
    C0();
  }
  
  public final int F0(int paramInt, yd1 paramyd1, de1 paramde1) {
    return n1(paramInt, paramyd1, paramde1);
  }
  
  public final int I(yd1 paramyd1, de1 paramde1) {
    return (this.v == 1) ? Math.min(this.r, paramde1.b()) : -1;
  }
  
  public final void I0(Rect paramRect, int paramInt1, int paramInt2) {
    WeakHashMap weakHashMap;
    int i = getPaddingLeft();
    i = getPaddingRight() + i;
    int j = getPaddingTop();
    int k = getPaddingBottom() + j;
    int m = this.v;
    j = this.r;
    if (m == 1) {
      m = paramRect.height();
      RecyclerView recyclerView = this.c;
      weakHashMap = v22.a;
      paramInt2 = a.r(paramInt2, m + k, recyclerView.getMinimumHeight());
      i = a.r(paramInt1, this.w * j + i, this.c.getMinimumWidth());
      paramInt1 = paramInt2;
      paramInt2 = i;
    } else {
      m = weakHashMap.width();
      RecyclerView recyclerView = this.c;
      weakHashMap = v22.a;
      paramInt1 = a.r(paramInt1, m + i, recyclerView.getMinimumWidth());
      i = a.r(paramInt2, this.w * j + k, this.c.getMinimumHeight());
      paramInt2 = paramInt1;
      paramInt1 = i;
    } 
    RecyclerView.f(this.c, paramInt2, paramInt1);
  }
  
  public final void O0(RecyclerView paramRecyclerView, int paramInt) {
    kn0 kn0 = new kn0(paramRecyclerView.getContext());
    kn0.a = paramInt;
    P0(kn0);
  }
  
  public final boolean Q0() {
    return (this.H == null);
  }
  
  public final boolean R0() {
    if (G() != 0 && this.E != 0 && this.i) {
      int i;
      if (this.z) {
        i = Z0();
        Y0();
      } else {
        i = Y0();
        Z0();
      } 
      if (i == 0 && d1() != null) {
        this.D.d();
        this.h = true;
        C0();
        return true;
      } 
    } 
    return false;
  }
  
  public final int S0(de1 paramde1) {
    if (G() == 0)
      return 0; 
    int i = this.K ^ true;
    View view2 = V0(i);
    View view1 = U0(i);
    boolean bool1 = this.K;
    boolean bool2 = this.z;
    return dd1.j(paramde1, this.t, view2, view1, this, bool1, bool2);
  }
  
  public final int T(yd1 paramyd1, de1 paramde1) {
    return (this.v == 0) ? Math.min(this.r, paramde1.b()) : -1;
  }
  
  public final int T0(yd1 paramyd1, tl0 paramtl0, de1 paramde1) {
    int i;
    BitSet bitSet = this.A;
    int k = this.r;
    bitSet.set(0, k, true);
    tl0 tl01 = this.x;
    if (tl01.i) {
      if (paramtl0.e == 1) {
        i = Integer.MAX_VALUE;
      } else {
        i = Integer.MIN_VALUE;
      } 
    } else if (paramtl0.e == 1) {
      i = paramtl0.g + paramtl0.b;
    } else {
      i = paramtl0.f - paramtl0.b;
    } 
    int m = paramtl0.e;
    int j = 0;
    while (true) {
      int n;
      vp0[] arrayOfVp0 = this.s;
      if (j < k) {
        if (!((ArrayList)(arrayOfVp0[j]).f).isEmpty())
          q1(arrayOfVp0[j], m, i); 
        j++;
        continue;
      } 
      boolean bool = this.z;
      f51 f511 = this.t;
      if (bool) {
        n = f511.i();
      } else {
        n = f511.m();
      } 
      j = 0;
      while (true) {
        m = paramtl0.c;
        if (m >= 0 && m < paramde1.b() && (tl01.i || !bitSet.isEmpty())) {
          int i1;
          View view = paramyd1.d(paramtl0.c);
          paramtl0.c += paramtl0.d;
          xo1 xo1 = (xo1)view.getLayoutParams();
          int i2 = ((sd1)xo1).b.d();
          j01 j011 = this.D;
          int[] arrayOfInt = (int[])j011.c;
          if (arrayOfInt == null || i2 >= arrayOfInt.length) {
            j = -1;
          } else {
            j = arrayOfInt[i2];
          } 
          if (j == -1) {
            int i3;
            vp0 vp01;
            if (h1(paramtl0.e)) {
              j = k - 1;
              m = -1;
              i3 = -1;
            } else {
              i3 = 1;
              j = 0;
              m = k;
            } 
            int i4 = paramtl0.e;
            arrayOfInt = null;
            int[] arrayOfInt1 = null;
            if (i4 == 1) {
              int i7 = f511.m();
              int i6 = Integer.MAX_VALUE;
              arrayOfInt = arrayOfInt1;
              while (j != m) {
                vp0 vp03 = arrayOfVp0[j];
                int i8 = vp03.g(i7);
                i4 = i6;
                if (i8 < i6) {
                  i4 = i8;
                  vp01 = vp03;
                } 
                j += i3;
                i6 = i4;
              } 
              vp0 vp02 = vp01;
              continue;
            } 
            BitSet bitSet1 = bitSet;
            int i5 = f511.i();
            i1 = Integer.MIN_VALUE;
            while (true) {
              vp0 vp02;
              vp0 vp03 = vp01;
              bitSet = bitSet1;
              if (j != m) {
                vp02 = arrayOfVp0[j];
                int i7 = vp02.i(i5);
                i4 = i1;
                if (i7 > i1) {
                  i4 = i7;
                  vp01 = vp02;
                } 
                j += i3;
                i1 = i4;
                continue;
              } 
              vp01 = vp03;
              j011.i(i2);
              ((int[])j011.c)[i2] = vp01.e;
              xo1.g = vp01;
              if (paramtl0.e == 1) {
                l(view, -1, false);
              } else {
                l(view, 0, false);
              } 
              int i6 = this.v;
              if (i6 == 1) {
                i4 = a.H(false, this.w, this.n, 0, ((ViewGroup.MarginLayoutParams)xo1).width);
                m = this.q;
                j = this.o;
                i3 = getPaddingTop();
                f1(view, i4, a.H(true, m, j, getPaddingBottom() + i3, ((ViewGroup.MarginLayoutParams)xo1).height));
              } else {
                m = this.p;
                i3 = this.n;
                j = getPaddingLeft();
                f1(view, a.H(true, m, i3, getPaddingRight() + j, ((ViewGroup.MarginLayoutParams)xo1).width), a.H(false, this.w, this.o, 0, ((ViewGroup.MarginLayoutParams)xo1).height));
              } 
              if (paramtl0.e == 1) {
                j = vp01.g(n);
                m = f511.e(view) + j;
              } else {
                m = vp01.i(n);
                j = m - f511.e(view);
              } 
              i3 = paramtl0.e;
              vp03 = xo1.g;
              if (i3 == 1) {
                vp03.getClass();
                xo1 xo11 = (xo1)view.getLayoutParams();
                xo11.g = vp03;
                ArrayList<View> arrayList = (ArrayList)vp03.f;
                arrayList.add(view);
                vp03.c = Integer.MIN_VALUE;
                if (arrayList.size() == 1)
                  vp03.b = Integer.MIN_VALUE; 
                if (((sd1)xo11).b.j() || ((sd1)xo11).b.m()) {
                  i3 = vp03.d;
                  vp03.d = ((StaggeredGridLayoutManager)vp03.g).t.e(view) + i3;
                } 
              } else {
                vp03.getClass();
                xo1 xo11 = (xo1)view.getLayoutParams();
                xo11.g = vp03;
                ArrayList<View> arrayList = (ArrayList)vp03.f;
                arrayList.add(0, view);
                vp03.b = Integer.MIN_VALUE;
                if (arrayList.size() == 1)
                  vp03.c = Integer.MIN_VALUE; 
                if (((sd1)xo11).b.j() || ((sd1)xo11).b.m()) {
                  i3 = vp03.d;
                  vp03.d = ((StaggeredGridLayoutManager)vp03.g).t.e(view) + i3;
                } 
              } 
              bool = e1();
              f51 f512 = this.u;
              if (bool && i6 == 1) {
                i4 = f512.i() - (k - 1 - vp01.e) * this.w;
                i3 = i4 - f512.e(view);
              } else {
                i4 = vp01.e * this.w + f512.m();
                i1 = f512.e(view);
                i3 = i4;
                i4 = i1 + i4;
              } 
              i1 = 1;
              if (i6 == 1) {
                a.Y(view, i3, j, i4, m);
              } else {
                a.Y(view, j, i3, m, i4);
              } 
              q1(vp01, tl01.e, i);
              j1(paramyd1, tl01);
              if (tl01.h && view.hasFocusable())
                vp02.set(vp01.e, false); 
              break;
            } 
          } else {
            vp0 vp01 = arrayOfVp0[j];
            continue;
          } 
          j = i1;
          continue;
        } 
        break;
      } 
      if (j == 0)
        j1(paramyd1, tl01); 
      if (tl01.e == -1) {
        i = b1(f511.m());
        i = f511.m() - i;
      } else {
        i = a1(f511.i()) - f511.i();
      } 
      return (i > 0) ? Math.min(paramtl0.b, i) : 0;
    } 
  }
  
  public final View U0(boolean paramBoolean) {
    f51 f511 = this.t;
    int j = f511.m();
    int k = f511.i();
    int i = G() - 1;
    View view;
    for (view = null; i >= 0; view = view1) {
      View view2 = F(i);
      int m = f511.g(view2);
      int n = f511.d(view2);
      View view1 = view;
      if (n > j)
        if (m >= k) {
          view1 = view;
        } else {
          if (n <= k || !paramBoolean)
            return view2; 
          view1 = view;
          if (view == null)
            view1 = view2; 
        }  
      i--;
    } 
    return view;
  }
  
  public final boolean V() {
    return (this.E != 0);
  }
  
  public final View V0(boolean paramBoolean) {
    f51 f511 = this.t;
    int j = f511.m();
    int i = f511.i();
    int k = G();
    View view = null;
    byte b = 0;
    while (b < k) {
      View view2 = F(b);
      int m = f511.g(view2);
      View view1 = view;
      if (f511.d(view2) > j)
        if (m >= i) {
          view1 = view;
        } else {
          if (m >= j || !paramBoolean)
            return view2; 
          view1 = view;
          if (view == null)
            view1 = view2; 
        }  
      b++;
      view = view1;
    } 
    return view;
  }
  
  public final boolean W() {
    return this.y;
  }
  
  public final void W0(yd1 paramyd1, de1 paramde1, boolean paramBoolean) {
    int i = a1(-2147483648);
    if (i != Integer.MIN_VALUE) {
      i = this.t.i() - i;
      if (i > 0) {
        i -= -n1(-i, paramyd1, paramde1);
        if (paramBoolean && i > 0)
          this.t.r(i); 
      } 
    } 
  }
  
  public final void X0(yd1 paramyd1, de1 paramde1, boolean paramBoolean) {
    int i = b1(2147483647);
    if (i != Integer.MAX_VALUE) {
      i -= this.t.m();
      if (i > 0) {
        i -= n1(i, paramyd1, paramde1);
        if (paramBoolean && i > 0)
          this.t.r(-i); 
      } 
    } 
  }
  
  public final int Y0() {
    return (G() == 0) ? 0 : a.R(F(0));
  }
  
  public final int Z0() {
    int i = G();
    return (i == 0) ? 0 : a.R(F(i - 1));
  }
  
  public final void a0(int paramInt) {
    super.a0(paramInt);
    for (byte b = 0; b < this.r; b++) {
      vp0 vp01 = this.s[b];
      int i = vp01.b;
      if (i != Integer.MIN_VALUE)
        vp01.b = i + paramInt; 
      i = vp01.c;
      if (i != Integer.MIN_VALUE)
        vp01.c = i + paramInt; 
    } 
  }
  
  public final int a1(int paramInt) {
    int i = this.s[0].g(paramInt);
    byte b = 1;
    while (b < this.r) {
      int k = this.s[b].g(paramInt);
      int j = i;
      if (k > i)
        j = k; 
      b++;
      i = j;
    } 
    return i;
  }
  
  public final void b0(int paramInt) {
    super.b0(paramInt);
    for (byte b = 0; b < this.r; b++) {
      vp0 vp01 = this.s[b];
      int i = vp01.b;
      if (i != Integer.MIN_VALUE)
        vp01.b = i + paramInt; 
      i = vp01.c;
      if (i != Integer.MIN_VALUE)
        vp01.c = i + paramInt; 
    } 
  }
  
  public final int b1(int paramInt) {
    int i = this.s[0].i(paramInt);
    byte b = 1;
    while (b < this.r) {
      int k = this.s[b].i(paramInt);
      int j = i;
      if (k < i)
        j = k; 
      b++;
      i = j;
    } 
    return i;
  }
  
  public final void c0() {
    this.D.d();
    for (byte b = 0; b < this.r; b++)
      this.s[b].b(); 
  }
  
  public final void c1(int paramInt1, int paramInt2, int paramInt3) {
    // Byte code:
    //   0: aload_0
    //   1: getfield z : Z
    //   4: ifeq -> 16
    //   7: aload_0
    //   8: invokevirtual Z0 : ()I
    //   11: istore #5
    //   13: goto -> 22
    //   16: aload_0
    //   17: invokevirtual Y0 : ()I
    //   20: istore #5
    //   22: iload_3
    //   23: bipush #8
    //   25: if_icmpne -> 59
    //   28: iload_1
    //   29: iload_2
    //   30: if_icmpge -> 48
    //   33: iload_2
    //   34: iconst_1
    //   35: iadd
    //   36: istore #4
    //   38: iload_1
    //   39: istore #6
    //   41: iload #4
    //   43: istore #7
    //   45: goto -> 67
    //   48: iload_1
    //   49: iconst_1
    //   50: iadd
    //   51: istore #7
    //   53: iload_2
    //   54: istore #6
    //   56: goto -> 67
    //   59: iload_1
    //   60: iload_2
    //   61: iadd
    //   62: istore #4
    //   64: goto -> 38
    //   67: aload_0
    //   68: getfield D : Lj01;
    //   71: astore #10
    //   73: aload #10
    //   75: getfield c : Ljava/lang/Object;
    //   78: checkcast [I
    //   81: astore #9
    //   83: aload #9
    //   85: ifnonnull -> 91
    //   88: goto -> 383
    //   91: iload #6
    //   93: aload #9
    //   95: arraylength
    //   96: if_icmplt -> 102
    //   99: goto -> 383
    //   102: aload #10
    //   104: getfield e : Ljava/lang/Object;
    //   107: checkcast java/util/ArrayList
    //   110: astore #9
    //   112: aload #9
    //   114: ifnonnull -> 123
    //   117: iconst_m1
    //   118: istore #4
    //   120: goto -> 314
    //   123: aload #9
    //   125: invokeinterface size : ()I
    //   130: iconst_1
    //   131: isub
    //   132: istore #4
    //   134: iload #4
    //   136: iflt -> 178
    //   139: aload #10
    //   141: getfield e : Ljava/lang/Object;
    //   144: checkcast java/util/ArrayList
    //   147: iload #4
    //   149: invokeinterface get : (I)Ljava/lang/Object;
    //   154: checkcast yo1
    //   157: astore #9
    //   159: aload #9
    //   161: getfield b : I
    //   164: iload #6
    //   166: if_icmpne -> 172
    //   169: goto -> 181
    //   172: iinc #4, -1
    //   175: goto -> 134
    //   178: aconst_null
    //   179: astore #9
    //   181: aload #9
    //   183: ifnull -> 202
    //   186: aload #10
    //   188: getfield e : Ljava/lang/Object;
    //   191: checkcast java/util/ArrayList
    //   194: aload #9
    //   196: invokeinterface remove : (Ljava/lang/Object;)Z
    //   201: pop
    //   202: aload #10
    //   204: getfield e : Ljava/lang/Object;
    //   207: checkcast java/util/ArrayList
    //   210: invokeinterface size : ()I
    //   215: istore #8
    //   217: iconst_0
    //   218: istore #4
    //   220: iload #4
    //   222: iload #8
    //   224: if_icmpge -> 262
    //   227: aload #10
    //   229: getfield e : Ljava/lang/Object;
    //   232: checkcast java/util/ArrayList
    //   235: iload #4
    //   237: invokeinterface get : (I)Ljava/lang/Object;
    //   242: checkcast yo1
    //   245: getfield b : I
    //   248: iload #6
    //   250: if_icmplt -> 256
    //   253: goto -> 265
    //   256: iinc #4, 1
    //   259: goto -> 220
    //   262: iconst_m1
    //   263: istore #4
    //   265: iload #4
    //   267: iconst_m1
    //   268: if_icmpeq -> 117
    //   271: aload #10
    //   273: getfield e : Ljava/lang/Object;
    //   276: checkcast java/util/ArrayList
    //   279: iload #4
    //   281: invokeinterface get : (I)Ljava/lang/Object;
    //   286: checkcast yo1
    //   289: astore #9
    //   291: aload #10
    //   293: getfield e : Ljava/lang/Object;
    //   296: checkcast java/util/ArrayList
    //   299: iload #4
    //   301: invokeinterface remove : (I)Ljava/lang/Object;
    //   306: pop
    //   307: aload #9
    //   309: getfield b : I
    //   312: istore #4
    //   314: aload #10
    //   316: getfield c : Ljava/lang/Object;
    //   319: checkcast [I
    //   322: astore #9
    //   324: iload #4
    //   326: iconst_m1
    //   327: if_icmpne -> 355
    //   330: aload #9
    //   332: iload #6
    //   334: aload #9
    //   336: arraylength
    //   337: iconst_m1
    //   338: invokestatic fill : ([IIII)V
    //   341: aload #10
    //   343: getfield c : Ljava/lang/Object;
    //   346: checkcast [I
    //   349: arraylength
    //   350: istore #4
    //   352: goto -> 383
    //   355: iload #4
    //   357: iconst_1
    //   358: iadd
    //   359: aload #9
    //   361: arraylength
    //   362: invokestatic min : (II)I
    //   365: istore #4
    //   367: aload #10
    //   369: getfield c : Ljava/lang/Object;
    //   372: checkcast [I
    //   375: iload #6
    //   377: iload #4
    //   379: iconst_m1
    //   380: invokestatic fill : ([IIII)V
    //   383: iload_3
    //   384: iconst_1
    //   385: if_icmpeq -> 429
    //   388: iload_3
    //   389: iconst_2
    //   390: if_icmpeq -> 419
    //   393: iload_3
    //   394: bipush #8
    //   396: if_icmpeq -> 402
    //   399: goto -> 436
    //   402: aload #10
    //   404: iload_1
    //   405: iconst_1
    //   406: invokevirtual r : (II)V
    //   409: aload #10
    //   411: iload_2
    //   412: iconst_1
    //   413: invokevirtual p : (II)V
    //   416: goto -> 436
    //   419: aload #10
    //   421: iload_1
    //   422: iload_2
    //   423: invokevirtual r : (II)V
    //   426: goto -> 436
    //   429: aload #10
    //   431: iload_1
    //   432: iload_2
    //   433: invokevirtual p : (II)V
    //   436: iload #7
    //   438: iload #5
    //   440: if_icmpgt -> 446
    //   443: goto -> 476
    //   446: aload_0
    //   447: getfield z : Z
    //   450: ifeq -> 461
    //   453: aload_0
    //   454: invokevirtual Y0 : ()I
    //   457: istore_1
    //   458: goto -> 466
    //   461: aload_0
    //   462: invokevirtual Z0 : ()I
    //   465: istore_1
    //   466: iload #6
    //   468: iload_1
    //   469: if_icmpgt -> 476
    //   472: aload_0
    //   473: invokevirtual C0 : ()V
    //   476: return
  }
  
  public final View d1() {
    int k = G();
    int i = k - 1;
    int j = this.r;
    BitSet bitSet = new BitSet(j);
    bitSet.set(0, j, true);
    j = this.v;
    byte b = -1;
    if (j == 1 && e1()) {
      j = 1;
    } else {
      j = -1;
    } 
    if (this.z) {
      k = -1;
    } else {
      i = 0;
    } 
    int m = i;
    if (i < k) {
      b = 1;
      m = i;
    } 
    while (true) {
      while (true)
        break; 
      if (i != SYNTHETIC_LOCAL_VARIABLE_6)
        return (View)SYNTHETIC_LOCAL_VARIABLE_9; 
    } 
    return null;
  }
  
  public final PointF e(int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual G : ()I
    //   4: istore_3
    //   5: iconst_m1
    //   6: istore_2
    //   7: iload_3
    //   8: ifne -> 25
    //   11: iload_2
    //   12: istore_1
    //   13: aload_0
    //   14: getfield z : Z
    //   17: ifeq -> 53
    //   20: iconst_1
    //   21: istore_1
    //   22: goto -> 53
    //   25: iload_1
    //   26: aload_0
    //   27: invokevirtual Y0 : ()I
    //   30: if_icmpge -> 39
    //   33: iconst_1
    //   34: istore #4
    //   36: goto -> 42
    //   39: iconst_0
    //   40: istore #4
    //   42: iload #4
    //   44: aload_0
    //   45: getfield z : Z
    //   48: if_icmpeq -> 20
    //   51: iload_2
    //   52: istore_1
    //   53: new android/graphics/PointF
    //   56: dup
    //   57: invokespecial <init> : ()V
    //   60: astore #5
    //   62: iload_1
    //   63: ifne -> 68
    //   66: aconst_null
    //   67: areturn
    //   68: aload_0
    //   69: getfield v : I
    //   72: ifne -> 91
    //   75: aload #5
    //   77: iload_1
    //   78: i2f
    //   79: putfield x : F
    //   82: aload #5
    //   84: fconst_0
    //   85: putfield y : F
    //   88: aload #5
    //   90: areturn
    //   91: aload #5
    //   93: fconst_0
    //   94: putfield x : F
    //   97: aload #5
    //   99: iload_1
    //   100: i2f
    //   101: putfield y : F
    //   104: aload #5
    //   106: areturn
  }
  
  public final void e0(RecyclerView paramRecyclerView) {
    RecyclerView recyclerView = this.c;
    if (recyclerView != null)
      recyclerView.removeCallbacks((Runnable)this.M); 
    for (byte b = 0; b < this.r; b++)
      this.s[b].b(); 
    paramRecyclerView.requestLayout();
  }
  
  public final boolean e1() {
    return (this.c.getLayoutDirection() == 1);
  }
  
  public final View f0(View paramView, int paramInt, yd1 paramyd1, de1 paramde1) {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual G : ()I
    //   4: ifne -> 10
    //   7: goto -> 684
    //   10: aload_0
    //   11: getfield c : Landroidx/recyclerview/widget/RecyclerView;
    //   14: astore #10
    //   16: aload #10
    //   18: ifnonnull -> 24
    //   21: goto -> 61
    //   24: aload #10
    //   26: aload_1
    //   27: invokevirtual E : (Landroid/view/View;)Landroid/view/View;
    //   30: astore #10
    //   32: aload #10
    //   34: ifnonnull -> 40
    //   37: goto -> 61
    //   40: aload #10
    //   42: astore_1
    //   43: aload_0
    //   44: getfield b : Ltk;
    //   47: getfield e : Ljava/lang/Object;
    //   50: checkcast java/util/ArrayList
    //   53: aload #10
    //   55: invokevirtual contains : (Ljava/lang/Object;)Z
    //   58: ifeq -> 63
    //   61: aconst_null
    //   62: astore_1
    //   63: aload_1
    //   64: ifnonnull -> 70
    //   67: goto -> 684
    //   70: aload_0
    //   71: invokevirtual m1 : ()V
    //   74: aload_0
    //   75: getfield v : I
    //   78: istore #5
    //   80: iload_2
    //   81: iconst_1
    //   82: if_icmpeq -> 178
    //   85: iload_2
    //   86: iconst_2
    //   87: if_icmpeq -> 159
    //   90: iload_2
    //   91: bipush #17
    //   93: if_icmpeq -> 151
    //   96: iload_2
    //   97: bipush #33
    //   99: if_icmpeq -> 140
    //   102: iload_2
    //   103: bipush #66
    //   105: if_icmpeq -> 132
    //   108: iload_2
    //   109: sipush #130
    //   112: if_icmpeq -> 121
    //   115: ldc -2147483648
    //   117: istore_2
    //   118: goto -> 197
    //   121: iload #5
    //   123: iconst_1
    //   124: if_icmpne -> 115
    //   127: iconst_1
    //   128: istore_2
    //   129: goto -> 197
    //   132: iload #5
    //   134: ifne -> 115
    //   137: goto -> 127
    //   140: iload #5
    //   142: iconst_1
    //   143: if_icmpne -> 115
    //   146: iconst_m1
    //   147: istore_2
    //   148: goto -> 197
    //   151: iload #5
    //   153: ifne -> 115
    //   156: goto -> 146
    //   159: iload #5
    //   161: iconst_1
    //   162: if_icmpne -> 168
    //   165: goto -> 127
    //   168: aload_0
    //   169: invokevirtual e1 : ()Z
    //   172: ifeq -> 127
    //   175: goto -> 146
    //   178: iload #5
    //   180: iconst_1
    //   181: if_icmpne -> 187
    //   184: goto -> 156
    //   187: aload_0
    //   188: invokevirtual e1 : ()Z
    //   191: ifeq -> 146
    //   194: goto -> 127
    //   197: iload_2
    //   198: ldc -2147483648
    //   200: if_icmpne -> 206
    //   203: goto -> 684
    //   206: aload_1
    //   207: invokevirtual getLayoutParams : ()Landroid/view/ViewGroup$LayoutParams;
    //   210: checkcast xo1
    //   213: astore #10
    //   215: aload #10
    //   217: invokevirtual getClass : ()Ljava/lang/Class;
    //   220: pop
    //   221: aload #10
    //   223: getfield g : Lvp0;
    //   226: astore #10
    //   228: iload_2
    //   229: iconst_1
    //   230: if_icmpne -> 242
    //   233: aload_0
    //   234: invokevirtual Z0 : ()I
    //   237: istore #5
    //   239: goto -> 248
    //   242: aload_0
    //   243: invokevirtual Y0 : ()I
    //   246: istore #5
    //   248: aload_0
    //   249: iload #5
    //   251: aload #4
    //   253: invokevirtual p1 : (ILde1;)V
    //   256: aload_0
    //   257: iload_2
    //   258: invokevirtual o1 : (I)V
    //   261: aload_0
    //   262: getfield x : Ltl0;
    //   265: astore #11
    //   267: aload #11
    //   269: aload #11
    //   271: getfield d : I
    //   274: iload #5
    //   276: iadd
    //   277: putfield c : I
    //   280: aload #11
    //   282: aload_0
    //   283: getfield t : Lf51;
    //   286: invokevirtual n : ()I
    //   289: i2f
    //   290: ldc_w 0.33333334
    //   293: fmul
    //   294: f2i
    //   295: putfield b : I
    //   298: aload #11
    //   300: iconst_1
    //   301: putfield h : Z
    //   304: iconst_0
    //   305: istore #7
    //   307: aload #11
    //   309: iconst_0
    //   310: putfield a : Z
    //   313: aload_0
    //   314: aload_3
    //   315: aload #11
    //   317: aload #4
    //   319: invokevirtual T0 : (Lyd1;Ltl0;Lde1;)I
    //   322: pop
    //   323: aload_0
    //   324: aload_0
    //   325: getfield z : Z
    //   328: putfield F : Z
    //   331: aload #10
    //   333: iload #5
    //   335: iload_2
    //   336: invokevirtual h : (II)Landroid/view/View;
    //   339: astore_3
    //   340: aload_3
    //   341: ifnull -> 351
    //   344: aload_3
    //   345: aload_1
    //   346: if_acmpeq -> 351
    //   349: aload_3
    //   350: areturn
    //   351: aload_0
    //   352: iload_2
    //   353: invokevirtual h1 : (I)Z
    //   356: istore #9
    //   358: aload_0
    //   359: getfield s : [Lvp0;
    //   362: astore_3
    //   363: aload_0
    //   364: getfield r : I
    //   367: istore #8
    //   369: iload #9
    //   371: ifeq -> 417
    //   374: iload #8
    //   376: iconst_1
    //   377: isub
    //   378: istore #6
    //   380: iload #6
    //   382: iflt -> 459
    //   385: aload_3
    //   386: iload #6
    //   388: aaload
    //   389: iload #5
    //   391: iload_2
    //   392: invokevirtual h : (II)Landroid/view/View;
    //   395: astore #4
    //   397: aload #4
    //   399: ifnull -> 411
    //   402: aload #4
    //   404: aload_1
    //   405: if_acmpeq -> 411
    //   408: aload #4
    //   410: areturn
    //   411: iinc #6, -1
    //   414: goto -> 380
    //   417: iconst_0
    //   418: istore #6
    //   420: iload #6
    //   422: iload #8
    //   424: if_icmpge -> 459
    //   427: aload_3
    //   428: iload #6
    //   430: aaload
    //   431: iload #5
    //   433: iload_2
    //   434: invokevirtual h : (II)Landroid/view/View;
    //   437: astore #4
    //   439: aload #4
    //   441: ifnull -> 453
    //   444: aload #4
    //   446: aload_1
    //   447: if_acmpeq -> 453
    //   450: aload #4
    //   452: areturn
    //   453: iinc #6, 1
    //   456: goto -> 420
    //   459: aload_0
    //   460: getfield y : Z
    //   463: istore #9
    //   465: iload_2
    //   466: iconst_m1
    //   467: if_icmpne -> 476
    //   470: iconst_1
    //   471: istore #5
    //   473: goto -> 479
    //   476: iconst_0
    //   477: istore #5
    //   479: iload #9
    //   481: iconst_1
    //   482: ixor
    //   483: iload #5
    //   485: if_icmpne -> 494
    //   488: iconst_1
    //   489: istore #5
    //   491: goto -> 497
    //   494: iconst_0
    //   495: istore #5
    //   497: iload #5
    //   499: ifeq -> 512
    //   502: aload #10
    //   504: invokevirtual c : ()I
    //   507: istore #6
    //   509: goto -> 519
    //   512: aload #10
    //   514: invokevirtual d : ()I
    //   517: istore #6
    //   519: aload_0
    //   520: iload #6
    //   522: invokevirtual B : (I)Landroid/view/View;
    //   525: astore #4
    //   527: aload #4
    //   529: ifnull -> 541
    //   532: aload #4
    //   534: aload_1
    //   535: if_acmpeq -> 541
    //   538: aload #4
    //   540: areturn
    //   541: iload #7
    //   543: istore #6
    //   545: aload_0
    //   546: iload_2
    //   547: invokevirtual h1 : (I)Z
    //   550: ifeq -> 626
    //   553: iload #8
    //   555: iconst_1
    //   556: isub
    //   557: istore_2
    //   558: iload_2
    //   559: iflt -> 684
    //   562: iload_2
    //   563: aload #10
    //   565: getfield e : I
    //   568: if_icmpne -> 574
    //   571: goto -> 620
    //   574: iload #5
    //   576: ifeq -> 590
    //   579: aload_3
    //   580: iload_2
    //   581: aaload
    //   582: invokevirtual c : ()I
    //   585: istore #6
    //   587: goto -> 598
    //   590: aload_3
    //   591: iload_2
    //   592: aaload
    //   593: invokevirtual d : ()I
    //   596: istore #6
    //   598: aload_0
    //   599: iload #6
    //   601: invokevirtual B : (I)Landroid/view/View;
    //   604: astore #4
    //   606: aload #4
    //   608: ifnull -> 620
    //   611: aload #4
    //   613: aload_1
    //   614: if_acmpeq -> 620
    //   617: aload #4
    //   619: areturn
    //   620: iinc #2, -1
    //   623: goto -> 558
    //   626: iload #6
    //   628: iload #8
    //   630: if_icmpge -> 684
    //   633: iload #5
    //   635: ifeq -> 649
    //   638: aload_3
    //   639: iload #6
    //   641: aaload
    //   642: invokevirtual c : ()I
    //   645: istore_2
    //   646: goto -> 657
    //   649: aload_3
    //   650: iload #6
    //   652: aaload
    //   653: invokevirtual d : ()I
    //   656: istore_2
    //   657: aload_0
    //   658: iload_2
    //   659: invokevirtual B : (I)Landroid/view/View;
    //   662: astore #4
    //   664: aload #4
    //   666: ifnull -> 678
    //   669: aload #4
    //   671: aload_1
    //   672: if_acmpeq -> 678
    //   675: aload #4
    //   677: areturn
    //   678: iinc #6, 1
    //   681: goto -> 626
    //   684: aconst_null
    //   685: areturn
  }
  
  public final void f1(View paramView, int paramInt1, int paramInt2) {
    Rect rect = this.I;
    n(paramView, rect);
    xo1 xo1 = (xo1)paramView.getLayoutParams();
    paramInt1 = r1(paramInt1, ((ViewGroup.MarginLayoutParams)xo1).leftMargin + rect.left, ((ViewGroup.MarginLayoutParams)xo1).rightMargin + rect.right);
    paramInt2 = r1(paramInt2, ((ViewGroup.MarginLayoutParams)xo1).topMargin + rect.top, ((ViewGroup.MarginLayoutParams)xo1).bottomMargin + rect.bottom);
    if (L0(paramView, paramInt1, paramInt2, (sd1)xo1))
      paramView.measure(paramInt1, paramInt2); 
  }
  
  public final void g0(AccessibilityEvent paramAccessibilityEvent) {
    super.g0(paramAccessibilityEvent);
    if (G() > 0) {
      View view2 = V0(false);
      View view1 = U0(false);
      if (view2 != null && view1 != null) {
        int i = a.R(view2);
        int j = a.R(view1);
        if (i < j) {
          paramAccessibilityEvent.setFromIndex(i);
          paramAccessibilityEvent.setToIndex(j);
          return;
        } 
        paramAccessibilityEvent.setFromIndex(j);
        paramAccessibilityEvent.setToIndex(i);
      } 
    } 
  }
  
  public final void g1(yd1 paramyd1, de1 paramde1, boolean paramBoolean) {
    // Byte code:
    //   0: aload_0
    //   1: getfield H : Lzo1;
    //   4: astore #15
    //   6: aload_0
    //   7: getfield J : Lwo1;
    //   10: astore #14
    //   12: aload #15
    //   14: ifnonnull -> 25
    //   17: aload_0
    //   18: getfield B : I
    //   21: iconst_m1
    //   22: if_icmpeq -> 43
    //   25: aload_2
    //   26: invokevirtual b : ()I
    //   29: ifne -> 43
    //   32: aload_0
    //   33: aload_1
    //   34: invokevirtual x0 : (Lyd1;)V
    //   37: aload #14
    //   39: invokevirtual a : ()V
    //   42: return
    //   43: aload #14
    //   45: getfield e : Z
    //   48: istore #13
    //   50: aload #14
    //   52: getfield g : Landroidx/recyclerview/widget/StaggeredGridLayoutManager;
    //   55: astore #16
    //   57: iload #13
    //   59: ifeq -> 86
    //   62: aload_0
    //   63: getfield B : I
    //   66: iconst_m1
    //   67: if_icmpne -> 86
    //   70: aload_0
    //   71: getfield H : Lzo1;
    //   74: ifnull -> 80
    //   77: goto -> 86
    //   80: iconst_0
    //   81: istore #7
    //   83: goto -> 89
    //   86: iconst_1
    //   87: istore #7
    //   89: aload_0
    //   90: getfield s : [Lvp0;
    //   93: astore #15
    //   95: aload_0
    //   96: getfield r : I
    //   99: istore #10
    //   101: aload_0
    //   102: getfield D : Lj01;
    //   105: astore #17
    //   107: iload #7
    //   109: ifeq -> 1130
    //   112: aload #14
    //   114: invokevirtual a : ()V
    //   117: aload_0
    //   118: getfield H : Lzo1;
    //   121: astore #19
    //   123: aload_0
    //   124: getfield t : Lf51;
    //   127: astore #18
    //   129: aload #19
    //   131: ifnull -> 448
    //   134: aload #19
    //   136: getfield e : I
    //   139: istore #6
    //   141: iload #6
    //   143: ifle -> 300
    //   146: iload #6
    //   148: iload #10
    //   150: if_icmpne -> 260
    //   153: iconst_0
    //   154: istore #6
    //   156: iload #6
    //   158: iload #10
    //   160: if_icmpge -> 300
    //   163: aload #15
    //   165: iload #6
    //   167: aaload
    //   168: invokevirtual b : ()V
    //   171: aload_0
    //   172: getfield H : Lzo1;
    //   175: astore #19
    //   177: aload #19
    //   179: getfield f : [I
    //   182: iload #6
    //   184: iaload
    //   185: istore #9
    //   187: iload #9
    //   189: istore #8
    //   191: iload #9
    //   193: ldc -2147483648
    //   195: if_icmpeq -> 233
    //   198: aload #19
    //   200: getfield k : Z
    //   203: ifeq -> 223
    //   206: aload #18
    //   208: invokevirtual i : ()I
    //   211: istore #8
    //   213: iload #9
    //   215: iload #8
    //   217: iadd
    //   218: istore #8
    //   220: goto -> 233
    //   223: aload #18
    //   225: invokevirtual m : ()I
    //   228: istore #8
    //   230: goto -> 213
    //   233: aload #15
    //   235: iload #6
    //   237: aaload
    //   238: astore #19
    //   240: aload #19
    //   242: iload #8
    //   244: putfield b : I
    //   247: aload #19
    //   249: iload #8
    //   251: putfield c : I
    //   254: iinc #6, 1
    //   257: goto -> 156
    //   260: aload #19
    //   262: aconst_null
    //   263: putfield f : [I
    //   266: aload #19
    //   268: iconst_0
    //   269: putfield e : I
    //   272: aload #19
    //   274: iconst_0
    //   275: putfield g : I
    //   278: aload #19
    //   280: aconst_null
    //   281: putfield h : [I
    //   284: aload #19
    //   286: aconst_null
    //   287: putfield i : Ljava/util/ArrayList;
    //   290: aload #19
    //   292: aload #19
    //   294: getfield c : I
    //   297: putfield b : I
    //   300: aload_0
    //   301: getfield H : Lzo1;
    //   304: astore #19
    //   306: aload_0
    //   307: aload #19
    //   309: getfield l : Z
    //   312: putfield G : Z
    //   315: aload #19
    //   317: getfield j : Z
    //   320: istore #13
    //   322: aload_0
    //   323: aconst_null
    //   324: invokevirtual m : (Ljava/lang/String;)V
    //   327: aload_0
    //   328: getfield H : Lzo1;
    //   331: astore #19
    //   333: aload #19
    //   335: ifnull -> 355
    //   338: aload #19
    //   340: getfield j : Z
    //   343: iload #13
    //   345: if_icmpeq -> 355
    //   348: aload #19
    //   350: iload #13
    //   352: putfield j : Z
    //   355: aload_0
    //   356: iload #13
    //   358: putfield y : Z
    //   361: aload_0
    //   362: invokevirtual C0 : ()V
    //   365: aload_0
    //   366: invokevirtual m1 : ()V
    //   369: aload_0
    //   370: getfield H : Lzo1;
    //   373: astore #19
    //   375: aload #19
    //   377: getfield b : I
    //   380: istore #6
    //   382: iload #6
    //   384: iconst_m1
    //   385: if_icmpeq -> 407
    //   388: aload_0
    //   389: iload #6
    //   391: putfield B : I
    //   394: aload #14
    //   396: aload #19
    //   398: getfield k : Z
    //   401: putfield c : Z
    //   404: goto -> 416
    //   407: aload #14
    //   409: aload_0
    //   410: getfield z : Z
    //   413: putfield c : Z
    //   416: aload #19
    //   418: getfield g : I
    //   421: iconst_1
    //   422: if_icmple -> 461
    //   425: aload #17
    //   427: aload #19
    //   429: getfield h : [I
    //   432: putfield c : Ljava/lang/Object;
    //   435: aload #17
    //   437: aload #19
    //   439: getfield i : Ljava/util/ArrayList;
    //   442: putfield e : Ljava/lang/Object;
    //   445: goto -> 461
    //   448: aload_0
    //   449: invokevirtual m1 : ()V
    //   452: aload #14
    //   454: aload_0
    //   455: getfield z : Z
    //   458: putfield c : Z
    //   461: aload_2
    //   462: getfield g : Z
    //   465: ifne -> 981
    //   468: aload_0
    //   469: getfield B : I
    //   472: istore #6
    //   474: iload #6
    //   476: iconst_m1
    //   477: if_icmpne -> 483
    //   480: goto -> 981
    //   483: iload #6
    //   485: iflt -> 970
    //   488: iload #6
    //   490: aload_2
    //   491: invokevirtual b : ()I
    //   494: if_icmplt -> 500
    //   497: goto -> 970
    //   500: aload_0
    //   501: getfield H : Lzo1;
    //   504: astore #19
    //   506: aload #19
    //   508: ifnull -> 551
    //   511: aload #19
    //   513: getfield b : I
    //   516: iconst_m1
    //   517: if_icmpeq -> 551
    //   520: aload #19
    //   522: getfield e : I
    //   525: iconst_1
    //   526: if_icmpge -> 532
    //   529: goto -> 551
    //   532: aload #14
    //   534: ldc -2147483648
    //   536: putfield b : I
    //   539: aload #14
    //   541: aload_0
    //   542: getfield B : I
    //   545: putfield a : I
    //   548: goto -> 1124
    //   551: aload_0
    //   552: aload_0
    //   553: getfield B : I
    //   556: invokevirtual B : (I)Landroid/view/View;
    //   559: astore #19
    //   561: aload #19
    //   563: ifnull -> 785
    //   566: aload_0
    //   567: getfield z : Z
    //   570: ifeq -> 582
    //   573: aload_0
    //   574: invokevirtual Z0 : ()I
    //   577: istore #6
    //   579: goto -> 588
    //   582: aload_0
    //   583: invokevirtual Y0 : ()I
    //   586: istore #6
    //   588: aload #14
    //   590: iload #6
    //   592: putfield a : I
    //   595: aload_0
    //   596: getfield C : I
    //   599: ldc -2147483648
    //   601: if_icmpeq -> 664
    //   604: aload #14
    //   606: getfield c : Z
    //   609: ifeq -> 638
    //   612: aload #14
    //   614: aload #18
    //   616: invokevirtual i : ()I
    //   619: aload_0
    //   620: getfield C : I
    //   623: isub
    //   624: aload #18
    //   626: aload #19
    //   628: invokevirtual d : (Landroid/view/View;)I
    //   631: isub
    //   632: putfield b : I
    //   635: goto -> 548
    //   638: aload #14
    //   640: aload #18
    //   642: invokevirtual m : ()I
    //   645: aload_0
    //   646: getfield C : I
    //   649: iadd
    //   650: aload #18
    //   652: aload #19
    //   654: invokevirtual g : (Landroid/view/View;)I
    //   657: isub
    //   658: putfield b : I
    //   661: goto -> 548
    //   664: aload #18
    //   666: aload #19
    //   668: invokevirtual e : (Landroid/view/View;)I
    //   671: aload #18
    //   673: invokevirtual n : ()I
    //   676: if_icmple -> 714
    //   679: aload #14
    //   681: getfield c : Z
    //   684: ifeq -> 697
    //   687: aload #18
    //   689: invokevirtual i : ()I
    //   692: istore #6
    //   694: goto -> 704
    //   697: aload #18
    //   699: invokevirtual m : ()I
    //   702: istore #6
    //   704: aload #14
    //   706: iload #6
    //   708: putfield b : I
    //   711: goto -> 548
    //   714: aload #18
    //   716: aload #19
    //   718: invokevirtual g : (Landroid/view/View;)I
    //   721: aload #18
    //   723: invokevirtual m : ()I
    //   726: isub
    //   727: istore #6
    //   729: iload #6
    //   731: ifge -> 745
    //   734: aload #14
    //   736: iload #6
    //   738: ineg
    //   739: putfield b : I
    //   742: goto -> 548
    //   745: aload #18
    //   747: invokevirtual i : ()I
    //   750: aload #18
    //   752: aload #19
    //   754: invokevirtual d : (Landroid/view/View;)I
    //   757: isub
    //   758: istore #6
    //   760: iload #6
    //   762: ifge -> 775
    //   765: aload #14
    //   767: iload #6
    //   769: putfield b : I
    //   772: goto -> 548
    //   775: aload #14
    //   777: ldc -2147483648
    //   779: putfield b : I
    //   782: goto -> 548
    //   785: aload_0
    //   786: getfield B : I
    //   789: istore #6
    //   791: aload #14
    //   793: iload #6
    //   795: putfield a : I
    //   798: aload_0
    //   799: getfield C : I
    //   802: istore #8
    //   804: iload #8
    //   806: ldc -2147483648
    //   808: if_icmpne -> 910
    //   811: aload_0
    //   812: invokevirtual G : ()I
    //   815: ifne -> 828
    //   818: aload_0
    //   819: getfield z : Z
    //   822: ifeq -> 855
    //   825: goto -> 861
    //   828: iload #6
    //   830: aload_0
    //   831: invokevirtual Y0 : ()I
    //   834: if_icmpge -> 843
    //   837: iconst_1
    //   838: istore #13
    //   840: goto -> 846
    //   843: iconst_0
    //   844: istore #13
    //   846: iload #13
    //   848: aload_0
    //   849: getfield z : Z
    //   852: if_icmpeq -> 861
    //   855: iconst_0
    //   856: istore #13
    //   858: goto -> 864
    //   861: iconst_1
    //   862: istore #13
    //   864: aload #14
    //   866: iload #13
    //   868: putfield c : Z
    //   871: aload #16
    //   873: getfield t : Lf51;
    //   876: astore #18
    //   878: iload #13
    //   880: ifeq -> 893
    //   883: aload #18
    //   885: invokevirtual i : ()I
    //   888: istore #6
    //   890: goto -> 900
    //   893: aload #18
    //   895: invokevirtual m : ()I
    //   898: istore #6
    //   900: aload #14
    //   902: iload #6
    //   904: putfield b : I
    //   907: goto -> 961
    //   910: aload #14
    //   912: getfield c : Z
    //   915: istore #13
    //   917: aload #16
    //   919: getfield t : Lf51;
    //   922: astore #18
    //   924: iload #13
    //   926: ifeq -> 945
    //   929: aload #14
    //   931: aload #18
    //   933: invokevirtual i : ()I
    //   936: iload #8
    //   938: isub
    //   939: putfield b : I
    //   942: goto -> 907
    //   945: aload #14
    //   947: aload #18
    //   949: invokevirtual m : ()I
    //   952: iload #8
    //   954: iadd
    //   955: putfield b : I
    //   958: goto -> 907
    //   961: aload #14
    //   963: iconst_1
    //   964: putfield d : Z
    //   967: goto -> 1124
    //   970: aload_0
    //   971: iconst_m1
    //   972: putfield B : I
    //   975: aload_0
    //   976: ldc -2147483648
    //   978: putfield C : I
    //   981: aload_0
    //   982: getfield F : Z
    //   985: ifeq -> 1049
    //   988: aload_2
    //   989: invokevirtual b : ()I
    //   992: istore #9
    //   994: aload_0
    //   995: invokevirtual G : ()I
    //   998: iconst_1
    //   999: isub
    //   1000: istore #6
    //   1002: iload #6
    //   1004: iflt -> 1043
    //   1007: aload_0
    //   1008: iload #6
    //   1010: invokevirtual F : (I)Landroid/view/View;
    //   1013: invokestatic R : (Landroid/view/View;)I
    //   1016: istore #8
    //   1018: iload #8
    //   1020: iflt -> 1037
    //   1023: iload #8
    //   1025: iload #9
    //   1027: if_icmpge -> 1037
    //   1030: iload #8
    //   1032: istore #6
    //   1034: goto -> 1107
    //   1037: iinc #6, -1
    //   1040: goto -> 1002
    //   1043: iconst_0
    //   1044: istore #6
    //   1046: goto -> 1107
    //   1049: aload_2
    //   1050: invokevirtual b : ()I
    //   1053: istore #11
    //   1055: aload_0
    //   1056: invokevirtual G : ()I
    //   1059: istore #9
    //   1061: iconst_0
    //   1062: istore #6
    //   1064: iload #6
    //   1066: iload #9
    //   1068: if_icmpge -> 1043
    //   1071: aload_0
    //   1072: iload #6
    //   1074: invokevirtual F : (I)Landroid/view/View;
    //   1077: invokestatic R : (Landroid/view/View;)I
    //   1080: istore #8
    //   1082: iload #8
    //   1084: iflt -> 1101
    //   1087: iload #8
    //   1089: iload #11
    //   1091: if_icmpge -> 1101
    //   1094: iload #8
    //   1096: istore #6
    //   1098: goto -> 1107
    //   1101: iinc #6, 1
    //   1104: goto -> 1064
    //   1107: aload #14
    //   1109: iload #6
    //   1111: putfield a : I
    //   1114: aload #14
    //   1116: ldc -2147483648
    //   1118: putfield b : I
    //   1121: goto -> 548
    //   1124: aload #14
    //   1126: iconst_1
    //   1127: putfield e : Z
    //   1130: aload_0
    //   1131: getfield H : Lzo1;
    //   1134: ifnonnull -> 1171
    //   1137: aload_0
    //   1138: getfield B : I
    //   1141: iconst_m1
    //   1142: if_icmpne -> 1171
    //   1145: aload #14
    //   1147: getfield c : Z
    //   1150: aload_0
    //   1151: getfield F : Z
    //   1154: if_icmpne -> 1174
    //   1157: aload_0
    //   1158: invokevirtual e1 : ()Z
    //   1161: aload_0
    //   1162: getfield G : Z
    //   1165: if_icmpeq -> 1171
    //   1168: goto -> 1174
    //   1171: goto -> 1185
    //   1174: aload #17
    //   1176: invokevirtual d : ()V
    //   1179: aload #14
    //   1181: iconst_1
    //   1182: putfield d : Z
    //   1185: aload_0
    //   1186: invokevirtual G : ()I
    //   1189: ifle -> 1577
    //   1192: aload_0
    //   1193: getfield H : Lzo1;
    //   1196: astore #17
    //   1198: aload #17
    //   1200: ifnull -> 1212
    //   1203: aload #17
    //   1205: getfield e : I
    //   1208: iconst_1
    //   1209: if_icmpge -> 1577
    //   1212: aload #14
    //   1214: getfield d : Z
    //   1217: ifeq -> 1279
    //   1220: iconst_0
    //   1221: istore #6
    //   1223: iload #6
    //   1225: iload #10
    //   1227: if_icmpge -> 1577
    //   1230: aload #15
    //   1232: iload #6
    //   1234: aaload
    //   1235: invokevirtual b : ()V
    //   1238: aload #14
    //   1240: getfield b : I
    //   1243: istore #7
    //   1245: iload #7
    //   1247: ldc -2147483648
    //   1249: if_icmpeq -> 1273
    //   1252: aload #15
    //   1254: iload #6
    //   1256: aaload
    //   1257: astore #16
    //   1259: aload #16
    //   1261: iload #7
    //   1263: putfield b : I
    //   1266: aload #16
    //   1268: iload #7
    //   1270: putfield c : I
    //   1273: iinc #6, 1
    //   1276: goto -> 1223
    //   1279: iload #7
    //   1281: ifne -> 1347
    //   1284: aload #14
    //   1286: getfield f : [I
    //   1289: ifnonnull -> 1295
    //   1292: goto -> 1347
    //   1295: iconst_0
    //   1296: istore #6
    //   1298: iload #6
    //   1300: iload #10
    //   1302: if_icmpge -> 1577
    //   1305: aload #15
    //   1307: iload #6
    //   1309: aaload
    //   1310: astore #16
    //   1312: aload #16
    //   1314: invokevirtual b : ()V
    //   1317: aload #14
    //   1319: getfield f : [I
    //   1322: iload #6
    //   1324: iaload
    //   1325: istore #7
    //   1327: aload #16
    //   1329: iload #7
    //   1331: putfield b : I
    //   1334: aload #16
    //   1336: iload #7
    //   1338: putfield c : I
    //   1341: iinc #6, 1
    //   1344: goto -> 1298
    //   1347: iconst_0
    //   1348: istore #7
    //   1350: iload #7
    //   1352: iload #10
    //   1354: if_icmpge -> 1505
    //   1357: aload #15
    //   1359: iload #7
    //   1361: aaload
    //   1362: astore #17
    //   1364: aload_0
    //   1365: getfield z : Z
    //   1368: istore #13
    //   1370: aload #14
    //   1372: getfield b : I
    //   1375: istore #9
    //   1377: aload #17
    //   1379: getfield g : Ljava/lang/Object;
    //   1382: checkcast androidx/recyclerview/widget/StaggeredGridLayoutManager
    //   1385: astore #18
    //   1387: iload #13
    //   1389: ifeq -> 1404
    //   1392: aload #17
    //   1394: ldc -2147483648
    //   1396: invokevirtual g : (I)I
    //   1399: istore #6
    //   1401: goto -> 1413
    //   1404: aload #17
    //   1406: ldc -2147483648
    //   1408: invokevirtual i : (I)I
    //   1411: istore #6
    //   1413: aload #17
    //   1415: invokevirtual b : ()V
    //   1418: iload #6
    //   1420: ldc -2147483648
    //   1422: if_icmpne -> 1428
    //   1425: goto -> 1499
    //   1428: iload #13
    //   1430: ifeq -> 1446
    //   1433: iload #6
    //   1435: aload #18
    //   1437: getfield t : Lf51;
    //   1440: invokevirtual i : ()I
    //   1443: if_icmplt -> 1499
    //   1446: iload #13
    //   1448: ifne -> 1467
    //   1451: iload #6
    //   1453: aload #18
    //   1455: getfield t : Lf51;
    //   1458: invokevirtual m : ()I
    //   1461: if_icmple -> 1467
    //   1464: goto -> 1499
    //   1467: iload #6
    //   1469: istore #8
    //   1471: iload #9
    //   1473: ldc -2147483648
    //   1475: if_icmpeq -> 1485
    //   1478: iload #6
    //   1480: iload #9
    //   1482: iadd
    //   1483: istore #8
    //   1485: aload #17
    //   1487: iload #8
    //   1489: putfield c : I
    //   1492: aload #17
    //   1494: iload #8
    //   1496: putfield b : I
    //   1499: iinc #7, 1
    //   1502: goto -> 1350
    //   1505: aload #15
    //   1507: arraylength
    //   1508: istore #7
    //   1510: aload #14
    //   1512: getfield f : [I
    //   1515: astore #17
    //   1517: aload #17
    //   1519: ifnull -> 1530
    //   1522: aload #17
    //   1524: arraylength
    //   1525: iload #7
    //   1527: if_icmpge -> 1543
    //   1530: aload #14
    //   1532: aload #16
    //   1534: getfield s : [Lvp0;
    //   1537: arraylength
    //   1538: newarray int
    //   1540: putfield f : [I
    //   1543: iconst_0
    //   1544: istore #6
    //   1546: iload #6
    //   1548: iload #7
    //   1550: if_icmpge -> 1577
    //   1553: aload #14
    //   1555: getfield f : [I
    //   1558: iload #6
    //   1560: aload #15
    //   1562: iload #6
    //   1564: aaload
    //   1565: ldc -2147483648
    //   1567: invokevirtual i : (I)I
    //   1570: iastore
    //   1571: iinc #6, 1
    //   1574: goto -> 1546
    //   1577: aload_0
    //   1578: aload_1
    //   1579: invokevirtual A : (Lyd1;)V
    //   1582: aload_0
    //   1583: getfield x : Ltl0;
    //   1586: astore #16
    //   1588: aload #16
    //   1590: iconst_0
    //   1591: putfield a : Z
    //   1594: aload_0
    //   1595: getfield u : Lf51;
    //   1598: astore #15
    //   1600: aload #15
    //   1602: invokevirtual n : ()I
    //   1605: istore #6
    //   1607: aload_0
    //   1608: iload #6
    //   1610: iload #10
    //   1612: idiv
    //   1613: putfield w : I
    //   1616: iload #6
    //   1618: aload #15
    //   1620: invokevirtual k : ()I
    //   1623: invokestatic makeMeasureSpec : (II)I
    //   1626: pop
    //   1627: aload_0
    //   1628: aload #14
    //   1630: getfield a : I
    //   1633: aload_2
    //   1634: invokevirtual p1 : (ILde1;)V
    //   1637: aload #14
    //   1639: getfield c : Z
    //   1642: ifeq -> 1692
    //   1645: aload_0
    //   1646: iconst_m1
    //   1647: invokevirtual o1 : (I)V
    //   1650: aload_0
    //   1651: aload_1
    //   1652: aload #16
    //   1654: aload_2
    //   1655: invokevirtual T0 : (Lyd1;Ltl0;Lde1;)I
    //   1658: pop
    //   1659: aload_0
    //   1660: iconst_1
    //   1661: invokevirtual o1 : (I)V
    //   1664: aload #16
    //   1666: aload #14
    //   1668: getfield a : I
    //   1671: aload #16
    //   1673: getfield d : I
    //   1676: iadd
    //   1677: putfield c : I
    //   1680: aload_0
    //   1681: aload_1
    //   1682: aload #16
    //   1684: aload_2
    //   1685: invokevirtual T0 : (Lyd1;Ltl0;Lde1;)I
    //   1688: pop
    //   1689: goto -> 1736
    //   1692: aload_0
    //   1693: iconst_1
    //   1694: invokevirtual o1 : (I)V
    //   1697: aload_0
    //   1698: aload_1
    //   1699: aload #16
    //   1701: aload_2
    //   1702: invokevirtual T0 : (Lyd1;Ltl0;Lde1;)I
    //   1705: pop
    //   1706: aload_0
    //   1707: iconst_m1
    //   1708: invokevirtual o1 : (I)V
    //   1711: aload #16
    //   1713: aload #14
    //   1715: getfield a : I
    //   1718: aload #16
    //   1720: getfield d : I
    //   1723: iadd
    //   1724: putfield c : I
    //   1727: aload_0
    //   1728: aload_1
    //   1729: aload #16
    //   1731: aload_2
    //   1732: invokevirtual T0 : (Lyd1;Ltl0;Lde1;)I
    //   1735: pop
    //   1736: aload #15
    //   1738: invokevirtual k : ()I
    //   1741: ldc 1073741824
    //   1743: if_icmpne -> 1749
    //   1746: goto -> 2054
    //   1749: aload_0
    //   1750: invokevirtual G : ()I
    //   1753: istore #8
    //   1755: fconst_0
    //   1756: fstore #4
    //   1758: iconst_0
    //   1759: istore #6
    //   1761: iload #6
    //   1763: iload #8
    //   1765: if_icmpge -> 1824
    //   1768: aload_0
    //   1769: iload #6
    //   1771: invokevirtual F : (I)Landroid/view/View;
    //   1774: astore #16
    //   1776: aload #15
    //   1778: aload #16
    //   1780: invokevirtual e : (Landroid/view/View;)I
    //   1783: i2f
    //   1784: fstore #5
    //   1786: fload #5
    //   1788: fload #4
    //   1790: fcmpg
    //   1791: ifge -> 1797
    //   1794: goto -> 1818
    //   1797: aload #16
    //   1799: invokevirtual getLayoutParams : ()Landroid/view/ViewGroup$LayoutParams;
    //   1802: checkcast xo1
    //   1805: invokevirtual getClass : ()Ljava/lang/Class;
    //   1808: pop
    //   1809: fload #4
    //   1811: fload #5
    //   1813: invokestatic max : (FF)F
    //   1816: fstore #4
    //   1818: iinc #6, 1
    //   1821: goto -> 1761
    //   1824: aload_0
    //   1825: getfield w : I
    //   1828: istore #9
    //   1830: fload #4
    //   1832: iload #10
    //   1834: i2f
    //   1835: fmul
    //   1836: invokestatic round : (F)I
    //   1839: istore #7
    //   1841: iload #7
    //   1843: istore #6
    //   1845: aload #15
    //   1847: invokevirtual k : ()I
    //   1850: ldc -2147483648
    //   1852: if_icmpne -> 1867
    //   1855: iload #7
    //   1857: aload #15
    //   1859: invokevirtual n : ()I
    //   1862: invokestatic min : (II)I
    //   1865: istore #6
    //   1867: aload_0
    //   1868: iload #6
    //   1870: iload #10
    //   1872: idiv
    //   1873: putfield w : I
    //   1876: iload #6
    //   1878: aload #15
    //   1880: invokevirtual k : ()I
    //   1883: invokestatic makeMeasureSpec : (II)I
    //   1886: pop
    //   1887: aload_0
    //   1888: getfield w : I
    //   1891: iload #9
    //   1893: if_icmpne -> 1899
    //   1896: goto -> 2054
    //   1899: iconst_0
    //   1900: istore #6
    //   1902: iload #6
    //   1904: iload #8
    //   1906: if_icmpge -> 2054
    //   1909: aload_0
    //   1910: iload #6
    //   1912: invokevirtual F : (I)Landroid/view/View;
    //   1915: astore #15
    //   1917: aload #15
    //   1919: invokevirtual getLayoutParams : ()Landroid/view/ViewGroup$LayoutParams;
    //   1922: checkcast xo1
    //   1925: astore #16
    //   1927: aload #16
    //   1929: invokevirtual getClass : ()Ljava/lang/Class;
    //   1932: pop
    //   1933: aload_0
    //   1934: invokevirtual e1 : ()Z
    //   1937: istore #13
    //   1939: aload_0
    //   1940: getfield v : I
    //   1943: istore #7
    //   1945: iload #13
    //   1947: ifeq -> 1993
    //   1950: iload #7
    //   1952: iconst_1
    //   1953: if_icmpne -> 1993
    //   1956: iload #10
    //   1958: iconst_1
    //   1959: isub
    //   1960: aload #16
    //   1962: getfield g : Lvp0;
    //   1965: getfield e : I
    //   1968: isub
    //   1969: ineg
    //   1970: istore #7
    //   1972: aload #15
    //   1974: aload_0
    //   1975: getfield w : I
    //   1978: iload #7
    //   1980: imul
    //   1981: iload #7
    //   1983: iload #9
    //   1985: imul
    //   1986: isub
    //   1987: invokevirtual offsetLeftAndRight : (I)V
    //   1990: goto -> 2048
    //   1993: aload #16
    //   1995: getfield g : Lvp0;
    //   1998: getfield e : I
    //   2001: istore #12
    //   2003: aload_0
    //   2004: getfield w : I
    //   2007: iload #12
    //   2009: imul
    //   2010: istore #11
    //   2012: iload #12
    //   2014: iload #9
    //   2016: imul
    //   2017: istore #12
    //   2019: iload #7
    //   2021: iconst_1
    //   2022: if_icmpne -> 2038
    //   2025: aload #15
    //   2027: iload #11
    //   2029: iload #12
    //   2031: isub
    //   2032: invokevirtual offsetLeftAndRight : (I)V
    //   2035: goto -> 2048
    //   2038: aload #15
    //   2040: iload #11
    //   2042: iload #12
    //   2044: isub
    //   2045: invokevirtual offsetTopAndBottom : (I)V
    //   2048: iinc #6, 1
    //   2051: goto -> 1902
    //   2054: aload_0
    //   2055: invokevirtual G : ()I
    //   2058: ifle -> 2102
    //   2061: aload_0
    //   2062: getfield z : Z
    //   2065: ifeq -> 2085
    //   2068: aload_0
    //   2069: aload_1
    //   2070: aload_2
    //   2071: iconst_1
    //   2072: invokevirtual W0 : (Lyd1;Lde1;Z)V
    //   2075: aload_0
    //   2076: aload_1
    //   2077: aload_2
    //   2078: iconst_0
    //   2079: invokevirtual X0 : (Lyd1;Lde1;Z)V
    //   2082: goto -> 2102
    //   2085: aload_0
    //   2086: aload_1
    //   2087: aload_2
    //   2088: iconst_1
    //   2089: invokevirtual X0 : (Lyd1;Lde1;Z)V
    //   2092: aload_0
    //   2093: aload_1
    //   2094: aload_2
    //   2095: iconst_0
    //   2096: invokevirtual W0 : (Lyd1;Lde1;Z)V
    //   2099: goto -> 2102
    //   2102: iload_3
    //   2103: ifeq -> 2168
    //   2106: aload_2
    //   2107: getfield g : Z
    //   2110: ifne -> 2168
    //   2113: aload_0
    //   2114: getfield E : I
    //   2117: ifeq -> 2168
    //   2120: aload_0
    //   2121: invokevirtual G : ()I
    //   2124: ifle -> 2168
    //   2127: aload_0
    //   2128: invokevirtual d1 : ()Landroid/view/View;
    //   2131: ifnull -> 2168
    //   2134: aload_0
    //   2135: getfield c : Landroidx/recyclerview/widget/RecyclerView;
    //   2138: astore #15
    //   2140: aload #15
    //   2142: ifnull -> 2155
    //   2145: aload #15
    //   2147: aload_0
    //   2148: getfield M : Lyi1;
    //   2151: invokevirtual removeCallbacks : (Ljava/lang/Runnable;)Z
    //   2154: pop
    //   2155: aload_0
    //   2156: invokevirtual R0 : ()Z
    //   2159: ifeq -> 2168
    //   2162: iconst_1
    //   2163: istore #6
    //   2165: goto -> 2171
    //   2168: iconst_0
    //   2169: istore #6
    //   2171: aload_2
    //   2172: getfield g : Z
    //   2175: ifeq -> 2183
    //   2178: aload #14
    //   2180: invokevirtual a : ()V
    //   2183: aload_0
    //   2184: aload #14
    //   2186: getfield c : Z
    //   2189: putfield F : Z
    //   2192: aload_0
    //   2193: aload_0
    //   2194: invokevirtual e1 : ()Z
    //   2197: putfield G : Z
    //   2200: iload #6
    //   2202: ifeq -> 2217
    //   2205: aload #14
    //   2207: invokevirtual a : ()V
    //   2210: aload_0
    //   2211: aload_1
    //   2212: aload_2
    //   2213: iconst_0
    //   2214: invokevirtual g1 : (Lyd1;Lde1;Z)V
    //   2217: return
  }
  
  public final void h0(yd1 paramyd1, de1 paramde1, t0 paramt0) {
    super.h0(paramyd1, paramde1, paramt0);
    paramt0.i("androidx.recyclerview.widget.StaggeredGridLayoutManager");
  }
  
  public final boolean h1(int paramInt) {
    boolean bool;
    if (this.v == 0) {
      if (paramInt == -1) {
        bool = true;
      } else {
        bool = false;
      } 
      return (bool != this.z);
    } 
    if (paramInt == -1) {
      bool = true;
    } else {
      bool = false;
    } 
    if (bool == this.z) {
      bool = true;
    } else {
      bool = false;
    } 
    return (bool == e1());
  }
  
  public final void i0(yd1 paramyd1, de1 paramde1, View paramView, t0 paramt0) {
    int i;
    ViewGroup.LayoutParams layoutParams = paramView.getLayoutParams();
    if (!(layoutParams instanceof xo1)) {
      j0(paramView, paramt0);
      return;
    } 
    vp0 vp01 = ((xo1)layoutParams).g;
    if (this.v == 0) {
      if (vp01 == null) {
        i = -1;
      } else {
        i = vp01.e;
      } 
      paramt0.j(s0.a(false, i, 1, -1, -1));
      return;
    } 
    if (vp01 == null) {
      i = -1;
    } else {
      i = vp01.e;
    } 
    paramt0.j(s0.a(false, -1, -1, i, 1));
  }
  
  public final void i1(int paramInt, de1 paramde1) {
    int i;
    byte b;
    if (paramInt > 0) {
      i = Z0();
      b = 1;
    } else {
      i = Y0();
      b = -1;
    } 
    tl0 tl01 = this.x;
    tl01.a = true;
    p1(i, paramde1);
    o1(b);
    tl01.c = i + tl01.d;
    tl01.b = Math.abs(paramInt);
  }
  
  public final void j1(yd1 paramyd1, tl0 paramtl0) {
    if (paramtl0.a && !paramtl0.i) {
      int i = paramtl0.b;
      int k = paramtl0.e;
      if (i == 0) {
        if (k == -1) {
          k1(paramtl0.g, paramyd1);
          return;
        } 
        l1(paramtl0.f, paramyd1);
        return;
      } 
      int m = this.r;
      vp0[] arrayOfVp0 = this.s;
      i = 1;
      int j = 1;
      if (k == -1) {
        int i1 = paramtl0.f;
        k = arrayOfVp0[0].i(i1);
        i = j;
        while (i < m) {
          int i2 = arrayOfVp0[i].i(i1);
          j = k;
          if (i2 > k)
            j = i2; 
          i++;
          k = j;
        } 
        j = i1 - k;
        i = paramtl0.g;
        if (j >= 0)
          i -= Math.min(j, paramtl0.b); 
        k1(i, paramyd1);
        return;
      } 
      int n = paramtl0.g;
      for (k = arrayOfVp0[0].g(n); i < m; k = j) {
        int i1 = arrayOfVp0[i].g(n);
        j = k;
        if (i1 < k)
          j = i1; 
        i++;
      } 
      j = k - paramtl0.g;
      i = paramtl0.f;
      if (j >= 0)
        i += Math.min(j, paramtl0.b); 
      l1(i, paramyd1);
    } 
  }
  
  public final void k0(int paramInt1, int paramInt2) {
    c1(paramInt1, paramInt2, 1);
  }
  
  public final void k1(int paramInt, yd1 paramyd1) {
    int i = G() - 1;
    while (i >= 0) {
      View view = F(i);
      f51 f511 = this.t;
      if (f511.g(view) >= paramInt && f511.q(view) >= paramInt) {
        xo1 xo11 = (xo1)view.getLayoutParams();
        xo11.getClass();
        if (((ArrayList)xo11.g.f).size() == 1)
          break; 
        vp0 vp01 = xo11.g;
        ArrayList<View> arrayList = (ArrayList)vp01.f;
        int j = arrayList.size();
        View view1 = arrayList.remove(j - 1);
        xo1 xo12 = (xo1)view1.getLayoutParams();
        xo12.g = null;
        if (((sd1)xo12).b.j() || ((sd1)xo12).b.m())
          vp01.d -= ((StaggeredGridLayoutManager)vp01.g).t.e(view1); 
        if (j == 1)
          vp01.b = Integer.MIN_VALUE; 
        vp01.c = Integer.MIN_VALUE;
        z0(view, paramyd1);
        i--;
      } 
    } 
  }
  
  public final void l0() {
    this.D.d();
    C0();
  }
  
  public final void l1(int paramInt, yd1 paramyd1) {
    while (G() > 0) {
      View view = F(0);
      f51 f511 = this.t;
      if (f511.d(view) <= paramInt && f511.p(view) <= paramInt) {
        xo1 xo11 = (xo1)view.getLayoutParams();
        xo11.getClass();
        if (((ArrayList)xo11.g.f).size() == 1)
          break; 
        vp0 vp01 = xo11.g;
        ArrayList<View> arrayList = (ArrayList)vp01.f;
        View view1 = arrayList.remove(0);
        xo1 xo12 = (xo1)view1.getLayoutParams();
        xo12.g = null;
        if (arrayList.size() == 0)
          vp01.c = Integer.MIN_VALUE; 
        if (((sd1)xo12).b.j() || ((sd1)xo12).b.m())
          vp01.d -= ((StaggeredGridLayoutManager)vp01.g).t.e(view1); 
        vp01.b = Integer.MIN_VALUE;
        z0(view, paramyd1);
      } 
    } 
  }
  
  public final void m(String paramString) {
    if (this.H == null)
      super.m(paramString); 
  }
  
  public final void m0(int paramInt1, int paramInt2) {
    c1(paramInt1, paramInt2, 8);
  }
  
  public final void m1() {
    if (this.v == 1 || !e1()) {
      this.z = this.y;
      return;
    } 
    this.z = this.y ^ true;
  }
  
  public final void n0(int paramInt1, int paramInt2) {
    c1(paramInt1, paramInt2, 2);
  }
  
  public final int n1(int paramInt, yd1 paramyd1, de1 paramde1) {
    if (G() == 0 || paramInt == 0)
      return 0; 
    i1(paramInt, paramde1);
    tl0 tl01 = this.x;
    int i = T0(paramyd1, tl01, paramde1);
    if (tl01.b >= i)
      if (paramInt < 0) {
        paramInt = -i;
      } else {
        paramInt = i;
      }  
    this.t.r(-paramInt);
    this.F = this.z;
    tl01.b = 0;
    j1(paramyd1, tl01);
    return paramInt;
  }
  
  public final boolean o() {
    return (this.v == 0);
  }
  
  public final void o1(int paramInt) {
    boolean bool1;
    tl0 tl01 = this.x;
    tl01.e = paramInt;
    boolean bool2 = this.z;
    boolean bool = true;
    if (paramInt == -1) {
      bool1 = true;
    } else {
      bool1 = false;
    } 
    if (bool2 == bool1) {
      paramInt = bool;
    } else {
      paramInt = -1;
    } 
    tl01.d = paramInt;
  }
  
  public final boolean p() {
    return (this.v == 1);
  }
  
  public final void p0(RecyclerView paramRecyclerView, int paramInt1, int paramInt2) {
    c1(paramInt1, paramInt2, 4);
  }
  
  public final void p1(int paramInt, de1 paramde1) {
    // Byte code:
    //   0: aload_0
    //   1: getfield x : Ltl0;
    //   4: astore #7
    //   6: iconst_0
    //   7: istore #5
    //   9: aload #7
    //   11: iconst_0
    //   12: putfield b : I
    //   15: aload #7
    //   17: iload_1
    //   18: putfield c : I
    //   21: aload_0
    //   22: getfield g : Lkn0;
    //   25: astore #9
    //   27: aload_0
    //   28: getfield t : Lf51;
    //   31: astore #8
    //   33: aload #9
    //   35: ifnull -> 105
    //   38: aload #9
    //   40: getfield e : Z
    //   43: ifeq -> 105
    //   46: aload_2
    //   47: getfield a : I
    //   50: istore_3
    //   51: iload_3
    //   52: iconst_m1
    //   53: if_icmpeq -> 105
    //   56: aload_0
    //   57: getfield z : Z
    //   60: istore #6
    //   62: iload_3
    //   63: iload_1
    //   64: if_icmpge -> 73
    //   67: iconst_1
    //   68: istore #4
    //   70: goto -> 76
    //   73: iconst_0
    //   74: istore #4
    //   76: iload #6
    //   78: iload #4
    //   80: if_icmpne -> 94
    //   83: aload #8
    //   85: invokevirtual n : ()I
    //   88: istore_1
    //   89: iconst_0
    //   90: istore_3
    //   91: goto -> 109
    //   94: aload #8
    //   96: invokevirtual n : ()I
    //   99: istore_3
    //   100: iconst_0
    //   101: istore_1
    //   102: goto -> 109
    //   105: iconst_0
    //   106: istore_1
    //   107: iconst_0
    //   108: istore_3
    //   109: aload_0
    //   110: getfield c : Landroidx/recyclerview/widget/RecyclerView;
    //   113: astore_2
    //   114: aload_2
    //   115: ifnull -> 152
    //   118: aload_2
    //   119: getfield j : Z
    //   122: ifeq -> 152
    //   125: aload #7
    //   127: aload #8
    //   129: invokevirtual m : ()I
    //   132: iload_3
    //   133: isub
    //   134: putfield f : I
    //   137: aload #7
    //   139: aload #8
    //   141: invokevirtual i : ()I
    //   144: iload_1
    //   145: iadd
    //   146: putfield g : I
    //   149: goto -> 171
    //   152: aload #7
    //   154: aload #8
    //   156: invokevirtual h : ()I
    //   159: iload_1
    //   160: iadd
    //   161: putfield g : I
    //   164: aload #7
    //   166: iload_3
    //   167: ineg
    //   168: putfield f : I
    //   171: aload #7
    //   173: iconst_0
    //   174: putfield h : Z
    //   177: aload #7
    //   179: iconst_1
    //   180: putfield a : Z
    //   183: iload #5
    //   185: istore #4
    //   187: aload #8
    //   189: invokevirtual k : ()I
    //   192: ifne -> 210
    //   195: iload #5
    //   197: istore #4
    //   199: aload #8
    //   201: invokevirtual h : ()I
    //   204: ifne -> 210
    //   207: iconst_1
    //   208: istore #4
    //   210: aload #7
    //   212: iload #4
    //   214: putfield i : Z
    //   217: return
  }
  
  public final boolean q(sd1 paramsd1) {
    return paramsd1 instanceof xo1;
  }
  
  public final void q0(yd1 paramyd1, de1 paramde1) {
    g1(paramyd1, paramde1, true);
  }
  
  public final void q1(vp0 paramvp0, int paramInt1, int paramInt2) {
    int i = paramvp0.d;
    int j = paramvp0.e;
    BitSet bitSet = this.A;
    if (paramInt1 == -1) {
      paramInt1 = paramvp0.b;
      if (paramInt1 == Integer.MIN_VALUE) {
        View view = ((ArrayList<View>)paramvp0.f).get(0);
        xo1 xo1 = (xo1)view.getLayoutParams();
        paramvp0.b = ((StaggeredGridLayoutManager)paramvp0.g).t.g(view);
        xo1.getClass();
        paramInt1 = paramvp0.b;
      } 
      if (paramInt1 + i <= paramInt2) {
        bitSet.set(j, false);
        return;
      } 
    } else {
      paramInt1 = paramvp0.c;
      if (paramInt1 == Integer.MIN_VALUE) {
        paramvp0.a();
        paramInt1 = paramvp0.c;
      } 
      if (paramInt1 - i >= paramInt2)
        bitSet.set(j, false); 
    } 
  }
  
  public final void r0(de1 paramde1) {
    this.B = -1;
    this.C = Integer.MIN_VALUE;
    this.H = null;
    this.J.a();
  }
  
  public final void s(int paramInt1, int paramInt2, de1 paramde1, il paramil) {
    if (this.v != 0)
      paramInt1 = paramInt2; 
    if (G() != 0 && paramInt1 != 0) {
      i1(paramInt1, paramde1);
      int[] arrayOfInt = this.L;
      int i = this.r;
      if (arrayOfInt == null || arrayOfInt.length < i)
        this.L = new int[i]; 
      boolean bool = false;
      paramInt2 = 0;
      paramInt1 = 0;
      while (true) {
        tl0 tl01 = this.x;
        if (paramInt2 < i) {
          int k;
          int j = tl01.d;
          vp0[] arrayOfVp0 = this.s;
          if (j == -1) {
            j = tl01.f;
            k = j - arrayOfVp0[paramInt2].i(j);
          } else {
            k = arrayOfVp0[paramInt2].g(tl01.g) - tl01.g;
          } 
          j = paramInt1;
          if (k >= 0) {
            this.L[paramInt1] = k;
            j = paramInt1 + 1;
          } 
          paramInt2++;
          paramInt1 = j;
          continue;
        } 
        Arrays.sort(this.L, 0, paramInt1);
        paramInt2 = bool;
        while (paramInt2 < paramInt1) {
          int j = tl01.c;
          if (j >= 0 && j < paramde1.b()) {
            paramil.b(tl01.c, this.L[paramInt2]);
            tl01.c += tl01.d;
            paramInt2++;
          } 
        } 
        break;
      } 
    } 
  }
  
  public final void s0(Parcelable paramParcelable) {
    if (paramParcelable instanceof zo1) {
      zo1 zo11 = (zo1)paramParcelable;
      this.H = zo11;
      if (this.B != -1) {
        zo11.b = -1;
        zo11.c = -1;
        zo11.f = null;
        zo11.e = 0;
        zo11.g = 0;
        zo11.h = null;
        zo11.i = null;
      } 
      C0();
    } 
  }
  
  public final Parcelable t0() {
    // Byte code:
    //   0: aload_0
    //   1: getfield H : Lzo1;
    //   4: astore #7
    //   6: aload #7
    //   8: ifnull -> 123
    //   11: new java/lang/Object
    //   14: dup
    //   15: invokespecial <init> : ()V
    //   18: astore #6
    //   20: aload #6
    //   22: aload #7
    //   24: getfield e : I
    //   27: putfield e : I
    //   30: aload #6
    //   32: aload #7
    //   34: getfield b : I
    //   37: putfield b : I
    //   40: aload #6
    //   42: aload #7
    //   44: getfield c : I
    //   47: putfield c : I
    //   50: aload #6
    //   52: aload #7
    //   54: getfield f : [I
    //   57: putfield f : [I
    //   60: aload #6
    //   62: aload #7
    //   64: getfield g : I
    //   67: putfield g : I
    //   70: aload #6
    //   72: aload #7
    //   74: getfield h : [I
    //   77: putfield h : [I
    //   80: aload #6
    //   82: aload #7
    //   84: getfield j : Z
    //   87: putfield j : Z
    //   90: aload #6
    //   92: aload #7
    //   94: getfield k : Z
    //   97: putfield k : Z
    //   100: aload #6
    //   102: aload #7
    //   104: getfield l : Z
    //   107: putfield l : Z
    //   110: aload #6
    //   112: aload #7
    //   114: getfield i : Ljava/util/ArrayList;
    //   117: putfield i : Ljava/util/ArrayList;
    //   120: aload #6
    //   122: areturn
    //   123: new java/lang/Object
    //   126: dup
    //   127: invokespecial <init> : ()V
    //   130: astore #7
    //   132: aload #7
    //   134: aload_0
    //   135: getfield y : Z
    //   138: putfield j : Z
    //   141: aload #7
    //   143: aload_0
    //   144: getfield F : Z
    //   147: putfield k : Z
    //   150: aload #7
    //   152: aload_0
    //   153: getfield G : Z
    //   156: putfield l : Z
    //   159: iconst_0
    //   160: istore_2
    //   161: aload_0
    //   162: getfield D : Lj01;
    //   165: astore #6
    //   167: aload #6
    //   169: ifnull -> 218
    //   172: aload #6
    //   174: getfield c : Ljava/lang/Object;
    //   177: checkcast [I
    //   180: astore #8
    //   182: aload #8
    //   184: ifnull -> 218
    //   187: aload #7
    //   189: aload #8
    //   191: putfield h : [I
    //   194: aload #7
    //   196: aload #8
    //   198: arraylength
    //   199: putfield g : I
    //   202: aload #7
    //   204: aload #6
    //   206: getfield e : Ljava/lang/Object;
    //   209: checkcast java/util/ArrayList
    //   212: putfield i : Ljava/util/ArrayList;
    //   215: goto -> 224
    //   218: aload #7
    //   220: iconst_0
    //   221: putfield g : I
    //   224: aload_0
    //   225: invokevirtual G : ()I
    //   228: istore_1
    //   229: iconst_m1
    //   230: istore_3
    //   231: iload_1
    //   232: ifle -> 433
    //   235: aload_0
    //   236: getfield F : Z
    //   239: ifeq -> 250
    //   242: aload_0
    //   243: invokevirtual Z0 : ()I
    //   246: istore_1
    //   247: goto -> 255
    //   250: aload_0
    //   251: invokevirtual Y0 : ()I
    //   254: istore_1
    //   255: aload #7
    //   257: iload_1
    //   258: putfield b : I
    //   261: aload_0
    //   262: getfield z : Z
    //   265: ifeq -> 278
    //   268: aload_0
    //   269: iconst_1
    //   270: invokevirtual U0 : (Z)Landroid/view/View;
    //   273: astore #6
    //   275: goto -> 285
    //   278: aload_0
    //   279: iconst_1
    //   280: invokevirtual V0 : (Z)Landroid/view/View;
    //   283: astore #6
    //   285: aload #6
    //   287: ifnonnull -> 295
    //   290: iload_3
    //   291: istore_1
    //   292: goto -> 301
    //   295: aload #6
    //   297: invokestatic R : (Landroid/view/View;)I
    //   300: istore_1
    //   301: aload #7
    //   303: iload_1
    //   304: putfield c : I
    //   307: aload_0
    //   308: getfield r : I
    //   311: istore #4
    //   313: aload #7
    //   315: iload #4
    //   317: putfield e : I
    //   320: aload #7
    //   322: iload #4
    //   324: newarray int
    //   326: putfield f : [I
    //   329: iload_2
    //   330: iload #4
    //   332: if_icmpge -> 430
    //   335: aload_0
    //   336: getfield F : Z
    //   339: istore #5
    //   341: aload_0
    //   342: getfield t : Lf51;
    //   345: astore #8
    //   347: aload_0
    //   348: getfield s : [Lvp0;
    //   351: astore #6
    //   353: iload #5
    //   355: ifeq -> 389
    //   358: aload #6
    //   360: iload_2
    //   361: aaload
    //   362: ldc -2147483648
    //   364: invokevirtual g : (I)I
    //   367: istore_3
    //   368: iload_3
    //   369: istore_1
    //   370: iload_3
    //   371: ldc -2147483648
    //   373: if_icmpeq -> 416
    //   376: aload #8
    //   378: invokevirtual i : ()I
    //   381: istore_1
    //   382: iload_3
    //   383: iload_1
    //   384: isub
    //   385: istore_1
    //   386: goto -> 416
    //   389: aload #6
    //   391: iload_2
    //   392: aaload
    //   393: ldc -2147483648
    //   395: invokevirtual i : (I)I
    //   398: istore_3
    //   399: iload_3
    //   400: istore_1
    //   401: iload_3
    //   402: ldc -2147483648
    //   404: if_icmpeq -> 416
    //   407: aload #8
    //   409: invokevirtual m : ()I
    //   412: istore_1
    //   413: goto -> 382
    //   416: aload #7
    //   418: getfield f : [I
    //   421: iload_2
    //   422: iload_1
    //   423: iastore
    //   424: iinc #2, 1
    //   427: goto -> 329
    //   430: aload #7
    //   432: areturn
    //   433: aload #7
    //   435: iconst_m1
    //   436: putfield b : I
    //   439: aload #7
    //   441: iconst_m1
    //   442: putfield c : I
    //   445: aload #7
    //   447: iconst_0
    //   448: putfield e : I
    //   451: aload #7
    //   453: areturn
  }
  
  public final int u(de1 paramde1) {
    if (G() == 0)
      return 0; 
    int i = this.K ^ true;
    View view1 = V0(i);
    View view2 = U0(i);
    boolean bool = this.K;
    return dd1.i(paramde1, this.t, view1, view2, this, bool);
  }
  
  public final void u0(int paramInt) {
    if (paramInt == 0)
      R0(); 
  }
  
  public final int v(de1 paramde1) {
    return S0(paramde1);
  }
  
  public final int w(de1 paramde1) {
    if (G() == 0)
      return 0; 
    int i = this.K ^ true;
    View view2 = V0(i);
    View view1 = U0(i);
    boolean bool = this.K;
    return dd1.k(paramde1, this.t, view2, view1, this, bool);
  }
  
  public final int x(de1 paramde1) {
    if (G() == 0)
      return 0; 
    int i = this.K ^ true;
    View view2 = V0(i);
    View view1 = U0(i);
    boolean bool = this.K;
    return dd1.i(paramde1, this.t, view2, view1, this, bool);
  }
  
  public final int y(de1 paramde1) {
    return S0(paramde1);
  }
  
  public final int z(de1 paramde1) {
    if (G() == 0)
      return 0; 
    int i = this.K ^ true;
    View view2 = V0(i);
    View view1 = U0(i);
    boolean bool = this.K;
    return dd1.k(paramde1, this.t, view2, view1, this, bool);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\androidx\recyclerview\widget\StaggeredGridLayoutManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
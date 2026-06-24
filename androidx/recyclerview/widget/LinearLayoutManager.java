package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import ce1;
import dd1;
import de1;
import f51;
import fn0;
import ga1;
import gn0;
import hn0;
import id1;
import il;
import in0;
import java.util.List;
import kn0;
import l0;
import m0;
import rd1;
import sd1;
import t0;
import yd1;

public class LinearLayoutManager extends a implements ce1 {
  public int A = Integer.MIN_VALUE;
  
  public in0 B = null;
  
  public final fn0 C = new fn0();
  
  public final gn0 D = (gn0)new Object();
  
  public final int E = 2;
  
  public final int[] F = new int[2];
  
  public int r = 1;
  
  public hn0 s;
  
  public f51 t;
  
  public boolean u;
  
  public final boolean v = false;
  
  public boolean w = false;
  
  public boolean x = false;
  
  public final boolean y = true;
  
  public int z = -1;
  
  public LinearLayoutManager(int paramInt) {
    p1(paramInt);
    m(null);
    if (!this.v)
      return; 
    this.v = false;
    C0();
  }
  
  public LinearLayoutManager(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2) {
    rd1 rd1 = a.S(paramContext, paramAttributeSet, paramInt1, paramInt2);
    p1(rd1.a);
    boolean bool = rd1.c;
    m(null);
    if (bool != this.v) {
      this.v = bool;
      C0();
    } 
    q1(rd1.d);
  }
  
  public final View B(int paramInt) {
    int j = G();
    if (j == 0)
      return null; 
    int i = paramInt - a.R(F(0));
    if (i >= 0 && i < j) {
      View view = F(i);
      if (a.R(view) == paramInt)
        return view; 
    } 
    return super.B(paramInt);
  }
  
  public sd1 C() {
    return new sd1(-2, -2);
  }
  
  public int D0(int paramInt, yd1 paramyd1, de1 paramde1) {
    return (this.r == 1) ? 0 : n1(paramInt, paramyd1, paramde1);
  }
  
  public final void E0(int paramInt) {
    this.z = paramInt;
    this.A = Integer.MIN_VALUE;
    in0 in01 = this.B;
    if (in01 != null)
      in01.b = -1; 
    C0();
  }
  
  public int F0(int paramInt, yd1 paramyd1, de1 paramde1) {
    return (this.r == 0) ? 0 : n1(paramInt, paramyd1, paramde1);
  }
  
  public final boolean M0() {
    if (this.o != 1073741824 && this.n != 1073741824) {
      int i = G();
      for (byte b = 0; b < i; b++) {
        ViewGroup.LayoutParams layoutParams = F(b).getLayoutParams();
        if (layoutParams.width < 0 && layoutParams.height < 0)
          return true; 
      } 
    } 
    return false;
  }
  
  public void O0(RecyclerView paramRecyclerView, int paramInt) {
    kn0 kn0 = new kn0(paramRecyclerView.getContext());
    kn0.a = paramInt;
    P0(kn0);
  }
  
  public boolean Q0() {
    return (this.B == null && this.u == this.x);
  }
  
  public void R0(de1 paramde1, hn0 paramhn0, il paramil) {
    int i = paramhn0.d;
    if (i >= 0 && i < paramde1.b())
      paramil.b(i, Math.max(0, paramhn0.g)); 
  }
  
  public final int S0(de1 paramde1) {
    if (G() == 0)
      return 0; 
    W0();
    f51 f511 = this.t;
    int i = this.y ^ true;
    return dd1.i(paramde1, f511, Z0(i), Y0(i), this, this.y);
  }
  
  public final int T0(de1 paramde1) {
    if (G() == 0)
      return 0; 
    W0();
    f51 f511 = this.t;
    int i = this.y ^ true;
    return dd1.j(paramde1, f511, Z0(i), Y0(i), this, this.y, this.w);
  }
  
  public final int U0(de1 paramde1) {
    if (G() == 0)
      return 0; 
    W0();
    f51 f511 = this.t;
    int i = this.y ^ true;
    return dd1.k(paramde1, f511, Z0(i), Y0(i), this, this.y);
  }
  
  public final boolean V() {
    return true;
  }
  
  public final int V0(int paramInt) {
    return (paramInt != 1) ? ((paramInt != 2) ? ((paramInt != 17) ? ((paramInt != 33) ? ((paramInt != 66) ? ((paramInt != 130) ? Integer.MIN_VALUE : ((this.r == 1) ? 1 : Integer.MIN_VALUE)) : ((this.r == 0) ? 1 : Integer.MIN_VALUE)) : ((this.r == 1) ? -1 : Integer.MIN_VALUE)) : ((this.r == 0) ? -1 : Integer.MIN_VALUE)) : ((this.r == 1) ? 1 : (h1() ? -1 : 1))) : ((this.r == 1) ? -1 : (h1() ? 1 : -1));
  }
  
  public final boolean W() {
    return this.v;
  }
  
  public final void W0() {
    if (this.s == null) {
      Object object = new Object();
      ((hn0)object).a = true;
      ((hn0)object).h = 0;
      ((hn0)object).i = 0;
      ((hn0)object).k = null;
      this.s = (hn0)object;
    } 
  }
  
  public final int X0(yd1 paramyd1, hn0 paramhn0, de1 paramde1, boolean paramBoolean) {
    int k = paramhn0.c;
    int i = paramhn0.g;
    if (i != Integer.MIN_VALUE) {
      if (k < 0)
        paramhn0.g = i + k; 
      k1(paramyd1, paramhn0);
    } 
    int j = paramhn0.c + paramhn0.h;
    while (true) {
      while (true)
        break; 
      if (paramBoolean) {
        j = i;
        if (((gn0)SYNTHETIC_LOCAL_VARIABLE_9).d)
          break; 
      } 
    } 
    return k - paramhn0.c;
  }
  
  public final View Y0(boolean paramBoolean) {
    return this.w ? b1(0, G(), paramBoolean, true) : b1(G() - 1, -1, paramBoolean, true);
  }
  
  public final View Z0(boolean paramBoolean) {
    return this.w ? b1(G() - 1, -1, paramBoolean, true) : b1(0, G(), paramBoolean, true);
  }
  
  public final View a1(int paramInt1, int paramInt2) {
    W0();
    if (paramInt2 > paramInt1 || paramInt2 < paramInt1) {
      char c1;
      char c2;
      if (this.t.g(F(paramInt1)) < this.t.m()) {
        c1 = '䄄';
        c2 = '䀄';
      } else {
        c1 = '၁';
        c2 = 'ခ';
      } 
      return (this.r == 0) ? this.e.j(paramInt1, paramInt2, c1, c2) : this.f.j(paramInt1, paramInt2, c1, c2);
    } 
    return F(paramInt1);
  }
  
  public final View b1(int paramInt1, int paramInt2, boolean paramBoolean1, boolean paramBoolean2) {
    char c1;
    W0();
    char c2 = 'ŀ';
    if (paramBoolean1) {
      c1 = '怃';
    } else {
      c1 = 'ŀ';
    } 
    if (!paramBoolean2)
      c2 = Character.MIN_VALUE; 
    return (this.r == 0) ? this.e.j(paramInt1, paramInt2, c1, c2) : this.f.j(paramInt1, paramInt2, c1, c2);
  }
  
  public View c1(yd1 paramyd1, de1 paramde1, boolean paramBoolean1, boolean paramBoolean2) {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual W0 : ()V
    //   4: aload_0
    //   5: invokevirtual G : ()I
    //   8: istore #7
    //   10: iload #4
    //   12: ifeq -> 32
    //   15: aload_0
    //   16: invokevirtual G : ()I
    //   19: iconst_1
    //   20: isub
    //   21: istore #5
    //   23: iconst_m1
    //   24: istore #7
    //   26: iconst_m1
    //   27: istore #6
    //   29: goto -> 38
    //   32: iconst_0
    //   33: istore #5
    //   35: iconst_1
    //   36: istore #6
    //   38: aload_2
    //   39: invokevirtual b : ()I
    //   42: istore #10
    //   44: aload_0
    //   45: getfield t : Lf51;
    //   48: invokevirtual m : ()I
    //   51: istore #11
    //   53: aload_0
    //   54: getfield t : Lf51;
    //   57: invokevirtual i : ()I
    //   60: istore #12
    //   62: aconst_null
    //   63: astore #15
    //   65: aconst_null
    //   66: astore #14
    //   68: aconst_null
    //   69: astore_2
    //   70: iload #5
    //   72: iload #7
    //   74: if_icmpeq -> 346
    //   77: aload_0
    //   78: iload #5
    //   80: invokevirtual F : (I)Landroid/view/View;
    //   83: astore_1
    //   84: aload_1
    //   85: invokestatic R : (Landroid/view/View;)I
    //   88: istore #8
    //   90: aload_0
    //   91: getfield t : Lf51;
    //   94: aload_1
    //   95: invokevirtual g : (Landroid/view/View;)I
    //   98: istore #13
    //   100: aload_0
    //   101: getfield t : Lf51;
    //   104: aload_1
    //   105: invokevirtual d : (Landroid/view/View;)I
    //   108: istore #9
    //   110: aload #15
    //   112: astore #16
    //   114: aload #14
    //   116: astore #17
    //   118: aload_2
    //   119: astore #18
    //   121: iload #8
    //   123: iflt -> 325
    //   126: aload #15
    //   128: astore #16
    //   130: aload #14
    //   132: astore #17
    //   134: aload_2
    //   135: astore #18
    //   137: iload #8
    //   139: iload #10
    //   141: if_icmpge -> 325
    //   144: aload_1
    //   145: invokevirtual getLayoutParams : ()Landroid/view/ViewGroup$LayoutParams;
    //   148: checkcast sd1
    //   151: getfield b : Lhe1;
    //   154: invokevirtual j : ()Z
    //   157: ifeq -> 189
    //   160: aload #15
    //   162: astore #16
    //   164: aload #14
    //   166: astore #17
    //   168: aload_2
    //   169: astore #18
    //   171: aload_2
    //   172: ifnonnull -> 325
    //   175: aload #15
    //   177: astore #16
    //   179: aload #14
    //   181: astore #17
    //   183: aload_1
    //   184: astore #18
    //   186: goto -> 325
    //   189: iload #9
    //   191: iload #11
    //   193: if_icmpgt -> 209
    //   196: iload #13
    //   198: iload #11
    //   200: if_icmpge -> 209
    //   203: iconst_1
    //   204: istore #8
    //   206: goto -> 212
    //   209: iconst_0
    //   210: istore #8
    //   212: iload #13
    //   214: iload #12
    //   216: if_icmplt -> 232
    //   219: iload #9
    //   221: iload #12
    //   223: if_icmple -> 232
    //   226: iconst_1
    //   227: istore #9
    //   229: goto -> 235
    //   232: iconst_0
    //   233: istore #9
    //   235: iload #8
    //   237: ifne -> 250
    //   240: iload #9
    //   242: ifeq -> 248
    //   245: goto -> 250
    //   248: aload_1
    //   249: areturn
    //   250: iload_3
    //   251: ifeq -> 281
    //   254: iload #9
    //   256: ifeq -> 262
    //   259: goto -> 286
    //   262: aload #15
    //   264: astore #16
    //   266: aload #14
    //   268: astore #17
    //   270: aload_2
    //   271: astore #18
    //   273: aload #15
    //   275: ifnonnull -> 325
    //   278: goto -> 315
    //   281: iload #8
    //   283: ifeq -> 299
    //   286: aload #15
    //   288: astore #16
    //   290: aload_1
    //   291: astore #17
    //   293: aload_2
    //   294: astore #18
    //   296: goto -> 325
    //   299: aload #15
    //   301: astore #16
    //   303: aload #14
    //   305: astore #17
    //   307: aload_2
    //   308: astore #18
    //   310: aload #15
    //   312: ifnonnull -> 325
    //   315: aload_2
    //   316: astore #18
    //   318: aload #14
    //   320: astore #17
    //   322: aload_1
    //   323: astore #16
    //   325: iload #5
    //   327: iload #6
    //   329: iadd
    //   330: istore #5
    //   332: aload #16
    //   334: astore #15
    //   336: aload #17
    //   338: astore #14
    //   340: aload #18
    //   342: astore_2
    //   343: goto -> 70
    //   346: aload #15
    //   348: ifnull -> 354
    //   351: aload #15
    //   353: areturn
    //   354: aload #14
    //   356: ifnull -> 362
    //   359: aload #14
    //   361: areturn
    //   362: aload_2
    //   363: areturn
  }
  
  public final int d1(int paramInt, yd1 paramyd1, de1 paramde1, boolean paramBoolean) {
    int i = this.t.i() - paramInt;
    if (i > 0) {
      i = -n1(-i, paramyd1, paramde1);
      if (paramBoolean) {
        paramInt = this.t.i() - paramInt + i;
        if (paramInt > 0) {
          this.t.r(paramInt);
          return paramInt + i;
        } 
      } 
      return i;
    } 
    return 0;
  }
  
  public PointF e(int paramInt) {
    if (G() == 0)
      return null; 
    boolean bool1 = false;
    int i = a.R(F(0));
    boolean bool = true;
    if (paramInt < i)
      bool1 = true; 
    paramInt = bool;
    if (bool1 != this.w)
      paramInt = -1; 
    return (this.r == 0) ? new PointF(paramInt, 0.0F) : new PointF(0.0F, paramInt);
  }
  
  public final void e0(RecyclerView paramRecyclerView) {}
  
  public final int e1(int paramInt, yd1 paramyd1, de1 paramde1, boolean paramBoolean) {
    int i = paramInt - this.t.m();
    if (i > 0) {
      int j = -n1(i, paramyd1, paramde1);
      i = j;
      if (paramBoolean) {
        paramInt = paramInt + j - this.t.m();
        i = j;
        if (paramInt > 0) {
          this.t.r(-paramInt);
          i = j - paramInt;
        } 
      } 
      return i;
    } 
    return 0;
  }
  
  public View f0(View paramView, int paramInt, yd1 paramyd1, de1 paramde1) {
    m1();
    if (G() != 0) {
      paramInt = V0(paramInt);
      if (paramInt != Integer.MIN_VALUE) {
        View view1;
        View view2;
        W0();
        r1(paramInt, (int)(this.t.n() * 0.33333334F), false, paramde1);
        hn0 hn01 = this.s;
        hn01.g = Integer.MIN_VALUE;
        hn01.a = false;
        X0(paramyd1, hn01, paramde1, true);
        boolean bool = this.w;
        if (paramInt == -1) {
          if (bool) {
            view1 = a1(G() - 1, -1);
          } else {
            view1 = a1(0, G());
          } 
        } else if (bool) {
          view1 = a1(0, G());
        } else {
          view1 = a1(G() - 1, -1);
        } 
        if (paramInt == -1) {
          view2 = g1();
        } else {
          view2 = f1();
        } 
        return view2.hasFocusable() ? ((view1 == null) ? null : view2) : view1;
      } 
    } 
    return null;
  }
  
  public final View f1() {
    int i;
    if (this.w) {
      i = 0;
    } else {
      i = G() - 1;
    } 
    return F(i);
  }
  
  public final void g0(AccessibilityEvent paramAccessibilityEvent) {
    super.g0(paramAccessibilityEvent);
    if (G() > 0) {
      int i;
      View view = b1(0, G(), false, true);
      byte b = -1;
      if (view == null) {
        i = -1;
      } else {
        i = a.R(view);
      } 
      paramAccessibilityEvent.setFromIndex(i);
      view = b1(G() - 1, -1, false, true);
      if (view == null) {
        i = b;
      } else {
        i = a.R(view);
      } 
      paramAccessibilityEvent.setToIndex(i);
    } 
  }
  
  public final View g1() {
    boolean bool;
    if (this.w) {
      bool = G() - 1;
    } else {
      bool = false;
    } 
    return F(bool);
  }
  
  public void h0(yd1 paramyd1, de1 paramde1, t0 paramt0) {
    super.h0(paramyd1, paramde1, paramt0);
    id1 id1 = this.c.o;
    if (id1 != null && id1.c() > 0)
      paramt0.b(m0.k); 
  }
  
  public final boolean h1() {
    return (this.c.getLayoutDirection() == 1);
  }
  
  public void i1(yd1 paramyd1, de1 paramde1, hn0 paramhn0, gn0 paramgn0) {
    int j;
    int k;
    int m;
    View view = paramhn0.b(paramyd1);
    if (view == null) {
      paramgn0.b = true;
      return;
    } 
    sd1 sd1 = (sd1)view.getLayoutParams();
    List list = paramhn0.k;
    boolean bool = this.w;
    int i = paramhn0.f;
    if (list == null) {
      boolean bool1;
      if (i == -1) {
        bool1 = true;
      } else {
        bool1 = false;
      } 
      if (bool == bool1) {
        l(view, -1, false);
      } else {
        l(view, 0, false);
      } 
    } else {
      boolean bool1;
      if (i == -1) {
        bool1 = true;
      } else {
        bool1 = false;
      } 
      if (bool == bool1) {
        l(view, -1, true);
      } else {
        l(view, 0, true);
      } 
    } 
    Z(view);
    paramgn0.a = this.t.e(view);
    if (this.r == 1) {
      if (h1()) {
        k = this.p - getPaddingRight();
        j = k - this.t.f(view);
      } else {
        j = getPaddingLeft();
        k = this.t.f(view) + j;
      } 
      i = paramhn0.f;
      int n = paramhn0.b;
      m = paramgn0.a;
      if (i == -1) {
        i = n;
        n -= m;
        m = j;
        j = n;
      } else {
        i = m + n;
        m = j;
        j = n;
      } 
    } else {
      j = getPaddingTop();
      m = this.t.f(view) + j;
      k = paramhn0.f;
      i = paramhn0.b;
      int n = paramgn0.a;
      if (k == -1) {
        k = i;
        n = i - n;
        i = m;
        m = n;
      } else {
        k = m;
        m = i;
        n = i + n;
        i = k;
        k = n;
      } 
    } 
    a.Y(view, m, j, k, i);
    if (sd1.b.j() || sd1.b.m())
      paramgn0.c = true; 
    paramgn0.d = view.hasFocusable();
  }
  
  public void j1(yd1 paramyd1, de1 paramde1, fn0 paramfn0, int paramInt) {}
  
  public final void k1(yd1 paramyd1, hn0 paramhn0) {
    if (paramhn0.a && !paramhn0.l) {
      int i = paramhn0.g;
      int j = paramhn0.i;
      if (paramhn0.f == -1) {
        int k = G();
        if (i >= 0) {
          j = this.t.h() - i + j;
          if (this.w) {
            for (i = 0; i < k; i++) {
              View view = F(i);
              if (this.t.g(view) < j || this.t.q(view) < j) {
                l1(paramyd1, 0, i);
                return;
              } 
            } 
          } else {
            for (i = --k; i >= 0; i--) {
              View view = F(i);
              if (this.t.g(view) < j || this.t.q(view) < j) {
                l1(paramyd1, k, i);
                return;
              } 
            } 
          } 
        } 
      } else if (i >= 0) {
        j = i - j;
        int k = G();
        if (this.w) {
          for (i = --k; i >= 0; i--) {
            View view = F(i);
            if (this.t.d(view) > j || this.t.p(view) > j) {
              l1(paramyd1, k, i);
              return;
            } 
          } 
        } else {
          for (i = 0; i < k; i++) {
            View view = F(i);
            if (this.t.d(view) > j || this.t.p(view) > j) {
              l1(paramyd1, 0, i);
              break;
            } 
          } 
        } 
      } 
    } 
  }
  
  public final void l1(yd1 paramyd1, int paramInt1, int paramInt2) {
    if (paramInt1 != paramInt2) {
      int i = paramInt1;
      if (paramInt2 > paramInt1) {
        while (--paramInt2 >= paramInt1) {
          A0(paramInt2, paramyd1);
          paramInt2--;
        } 
      } else {
        while (i > paramInt2) {
          A0(i, paramyd1);
          i--;
        } 
      } 
    } 
  }
  
  public final void m(String paramString) {
    if (this.B == null)
      super.m(paramString); 
  }
  
  public final void m1() {
    if (this.r == 1 || !h1()) {
      this.w = this.v;
      return;
    } 
    this.w = this.v ^ true;
  }
  
  public final int n1(int paramInt, yd1 paramyd1, de1 paramde1) {
    if (G() != 0 && paramInt != 0) {
      byte b;
      W0();
      this.s.a = true;
      if (paramInt > 0) {
        b = 1;
      } else {
        b = -1;
      } 
      int i = Math.abs(paramInt);
      r1(b, i, true, paramde1);
      hn0 hn01 = this.s;
      int j = hn01.g;
      j = X0(paramyd1, hn01, paramde1, false) + j;
      if (j >= 0) {
        if (i > j)
          paramInt = b * j; 
        this.t.r(-paramInt);
        this.s.j = paramInt;
        return paramInt;
      } 
    } 
    return 0;
  }
  
  public final boolean o() {
    return (this.r == 0);
  }
  
  public final void o1(int paramInt1, int paramInt2) {
    this.z = paramInt1;
    this.A = paramInt2;
    in0 in01 = this.B;
    if (in01 != null)
      in01.b = -1; 
    C0();
  }
  
  public final boolean p() {
    return (this.r == 1);
  }
  
  public final void p1(int paramInt) {
    if (paramInt == 0 || paramInt == 1) {
      m(null);
      if (paramInt != this.r || this.t == null) {
        f51 f511 = f51.b(this, paramInt);
        this.t = f511;
        this.C.a = f511;
        this.r = paramInt;
        C0();
        return;
      } 
      return;
    } 
    l0.l(ga1.i("invalid orientation:", paramInt));
  }
  
  public void q0(yd1 paramyd1, de1 paramde1) {
    // Byte code:
    //   0: aload_0
    //   1: getfield B : Lin0;
    //   4: astore #12
    //   6: iconst_m1
    //   7: istore #5
    //   9: aload #12
    //   11: ifnonnull -> 22
    //   14: aload_0
    //   15: getfield z : I
    //   18: iconst_m1
    //   19: if_icmpeq -> 35
    //   22: aload_2
    //   23: invokevirtual b : ()I
    //   26: ifne -> 35
    //   29: aload_0
    //   30: aload_1
    //   31: invokevirtual x0 : (Lyd1;)V
    //   34: return
    //   35: aload_0
    //   36: getfield B : Lin0;
    //   39: astore #12
    //   41: aload #12
    //   43: ifnull -> 61
    //   46: aload #12
    //   48: getfield b : I
    //   51: istore_3
    //   52: iload_3
    //   53: iflt -> 61
    //   56: aload_0
    //   57: iload_3
    //   58: putfield z : I
    //   61: aload_0
    //   62: invokevirtual W0 : ()V
    //   65: aload_0
    //   66: getfield s : Lhn0;
    //   69: iconst_0
    //   70: putfield a : Z
    //   73: aload_0
    //   74: invokevirtual m1 : ()V
    //   77: aload_0
    //   78: getfield c : Landroidx/recyclerview/widget/RecyclerView;
    //   81: astore #12
    //   83: aload #12
    //   85: ifnonnull -> 91
    //   88: goto -> 125
    //   91: aload #12
    //   93: invokevirtual getFocusedChild : ()Landroid/view/View;
    //   96: astore #13
    //   98: aload #13
    //   100: ifnull -> 125
    //   103: aload #13
    //   105: astore #12
    //   107: aload_0
    //   108: getfield b : Ltk;
    //   111: getfield e : Ljava/lang/Object;
    //   114: checkcast java/util/ArrayList
    //   117: aload #13
    //   119: invokevirtual contains : (Ljava/lang/Object;)Z
    //   122: ifeq -> 128
    //   125: aconst_null
    //   126: astore #12
    //   128: aload_0
    //   129: getfield C : Lfn0;
    //   132: astore #14
    //   134: aload #14
    //   136: getfield e : Z
    //   139: ifeq -> 218
    //   142: aload_0
    //   143: getfield z : I
    //   146: iconst_m1
    //   147: if_icmpne -> 218
    //   150: aload_0
    //   151: getfield B : Lin0;
    //   154: ifnull -> 160
    //   157: goto -> 218
    //   160: aload #12
    //   162: ifnull -> 1107
    //   165: aload_0
    //   166: getfield t : Lf51;
    //   169: aload #12
    //   171: invokevirtual g : (Landroid/view/View;)I
    //   174: aload_0
    //   175: getfield t : Lf51;
    //   178: invokevirtual i : ()I
    //   181: if_icmpge -> 203
    //   184: aload_0
    //   185: getfield t : Lf51;
    //   188: aload #12
    //   190: invokevirtual d : (Landroid/view/View;)I
    //   193: aload_0
    //   194: getfield t : Lf51;
    //   197: invokevirtual m : ()I
    //   200: if_icmpgt -> 1107
    //   203: aload #14
    //   205: aload #12
    //   207: aload #12
    //   209: invokestatic R : (Landroid/view/View;)I
    //   212: invokevirtual b : (Landroid/view/View;I)V
    //   215: goto -> 1107
    //   218: aload #14
    //   220: invokevirtual c : ()V
    //   223: aload #14
    //   225: aload_0
    //   226: getfield w : Z
    //   229: aload_0
    //   230: getfield x : Z
    //   233: ixor
    //   234: putfield d : Z
    //   237: aload_2
    //   238: getfield g : Z
    //   241: ifne -> 700
    //   244: aload_0
    //   245: getfield z : I
    //   248: istore_3
    //   249: iload_3
    //   250: iconst_m1
    //   251: if_icmpne -> 257
    //   254: goto -> 700
    //   257: iload_3
    //   258: iflt -> 689
    //   261: iload_3
    //   262: aload_2
    //   263: invokevirtual b : ()I
    //   266: if_icmplt -> 272
    //   269: goto -> 689
    //   272: aload_0
    //   273: getfield z : I
    //   276: istore_3
    //   277: aload #14
    //   279: iload_3
    //   280: putfield b : I
    //   283: aload_0
    //   284: getfield B : Lin0;
    //   287: astore #12
    //   289: aload #12
    //   291: ifnull -> 369
    //   294: aload #12
    //   296: getfield b : I
    //   299: iflt -> 369
    //   302: aload #12
    //   304: getfield e : Z
    //   307: istore #10
    //   309: aload #14
    //   311: iload #10
    //   313: putfield d : Z
    //   316: aload_0
    //   317: getfield t : Lf51;
    //   320: astore #12
    //   322: iload #10
    //   324: ifeq -> 348
    //   327: aload #14
    //   329: aload #12
    //   331: invokevirtual i : ()I
    //   334: aload_0
    //   335: getfield B : Lin0;
    //   338: getfield c : I
    //   341: isub
    //   342: putfield c : I
    //   345: goto -> 1101
    //   348: aload #14
    //   350: aload #12
    //   352: invokevirtual m : ()I
    //   355: aload_0
    //   356: getfield B : Lin0;
    //   359: getfield c : I
    //   362: iadd
    //   363: putfield c : I
    //   366: goto -> 1101
    //   369: aload_0
    //   370: getfield A : I
    //   373: ldc -2147483648
    //   375: if_icmpne -> 629
    //   378: aload_0
    //   379: iload_3
    //   380: invokevirtual B : (I)Landroid/view/View;
    //   383: astore #12
    //   385: aload #12
    //   387: ifnull -> 563
    //   390: aload_0
    //   391: getfield t : Lf51;
    //   394: aload #12
    //   396: invokevirtual e : (Landroid/view/View;)I
    //   399: aload_0
    //   400: getfield t : Lf51;
    //   403: invokevirtual n : ()I
    //   406: if_icmple -> 417
    //   409: aload #14
    //   411: invokevirtual a : ()V
    //   414: goto -> 1101
    //   417: aload_0
    //   418: getfield t : Lf51;
    //   421: aload #12
    //   423: invokevirtual g : (Landroid/view/View;)I
    //   426: istore #4
    //   428: aload_0
    //   429: getfield t : Lf51;
    //   432: invokevirtual m : ()I
    //   435: istore_3
    //   436: aload_0
    //   437: getfield t : Lf51;
    //   440: astore #13
    //   442: iload #4
    //   444: iload_3
    //   445: isub
    //   446: ifge -> 468
    //   449: aload #14
    //   451: aload #13
    //   453: invokevirtual m : ()I
    //   456: putfield c : I
    //   459: aload #14
    //   461: iconst_0
    //   462: putfield d : Z
    //   465: goto -> 1101
    //   468: aload #13
    //   470: invokevirtual i : ()I
    //   473: aload_0
    //   474: getfield t : Lf51;
    //   477: aload #12
    //   479: invokevirtual d : (Landroid/view/View;)I
    //   482: isub
    //   483: ifge -> 507
    //   486: aload #14
    //   488: aload_0
    //   489: getfield t : Lf51;
    //   492: invokevirtual i : ()I
    //   495: putfield c : I
    //   498: aload #14
    //   500: iconst_1
    //   501: putfield d : Z
    //   504: goto -> 1101
    //   507: aload #14
    //   509: getfield d : Z
    //   512: istore #10
    //   514: aload_0
    //   515: getfield t : Lf51;
    //   518: astore #13
    //   520: iload #10
    //   522: ifeq -> 546
    //   525: aload #13
    //   527: aload #12
    //   529: invokevirtual d : (Landroid/view/View;)I
    //   532: istore_3
    //   533: aload_0
    //   534: getfield t : Lf51;
    //   537: invokevirtual o : ()I
    //   540: iload_3
    //   541: iadd
    //   542: istore_3
    //   543: goto -> 554
    //   546: aload #13
    //   548: aload #12
    //   550: invokevirtual g : (Landroid/view/View;)I
    //   553: istore_3
    //   554: aload #14
    //   556: iload_3
    //   557: putfield c : I
    //   560: goto -> 1101
    //   563: aload_0
    //   564: invokevirtual G : ()I
    //   567: ifle -> 621
    //   570: aload_0
    //   571: iconst_0
    //   572: invokevirtual F : (I)Landroid/view/View;
    //   575: invokestatic R : (Landroid/view/View;)I
    //   578: istore_3
    //   579: aload_0
    //   580: getfield z : I
    //   583: iload_3
    //   584: if_icmpge -> 593
    //   587: iconst_1
    //   588: istore #10
    //   590: goto -> 596
    //   593: iconst_0
    //   594: istore #10
    //   596: iload #10
    //   598: aload_0
    //   599: getfield w : Z
    //   602: if_icmpne -> 611
    //   605: iconst_1
    //   606: istore #10
    //   608: goto -> 614
    //   611: iconst_0
    //   612: istore #10
    //   614: aload #14
    //   616: iload #10
    //   618: putfield d : Z
    //   621: aload #14
    //   623: invokevirtual a : ()V
    //   626: goto -> 1101
    //   629: aload_0
    //   630: getfield w : Z
    //   633: istore #10
    //   635: aload #14
    //   637: iload #10
    //   639: putfield d : Z
    //   642: aload_0
    //   643: getfield t : Lf51;
    //   646: astore #12
    //   648: iload #10
    //   650: ifeq -> 671
    //   653: aload #14
    //   655: aload #12
    //   657: invokevirtual i : ()I
    //   660: aload_0
    //   661: getfield A : I
    //   664: isub
    //   665: putfield c : I
    //   668: goto -> 1101
    //   671: aload #14
    //   673: aload #12
    //   675: invokevirtual m : ()I
    //   678: aload_0
    //   679: getfield A : I
    //   682: iadd
    //   683: putfield c : I
    //   686: goto -> 1101
    //   689: aload_0
    //   690: iconst_m1
    //   691: putfield z : I
    //   694: aload_0
    //   695: ldc -2147483648
    //   697: putfield A : I
    //   700: aload_0
    //   701: invokevirtual G : ()I
    //   704: ifne -> 710
    //   707: goto -> 1071
    //   710: aload_0
    //   711: getfield c : Landroidx/recyclerview/widget/RecyclerView;
    //   714: astore #12
    //   716: aload #12
    //   718: ifnonnull -> 724
    //   721: goto -> 758
    //   724: aload #12
    //   726: invokevirtual getFocusedChild : ()Landroid/view/View;
    //   729: astore #13
    //   731: aload #13
    //   733: ifnull -> 758
    //   736: aload #13
    //   738: astore #12
    //   740: aload_0
    //   741: getfield b : Ltk;
    //   744: getfield e : Ljava/lang/Object;
    //   747: checkcast java/util/ArrayList
    //   750: aload #13
    //   752: invokevirtual contains : (Ljava/lang/Object;)Z
    //   755: ifeq -> 761
    //   758: aconst_null
    //   759: astore #12
    //   761: aload #12
    //   763: ifnull -> 828
    //   766: aload #12
    //   768: invokevirtual getLayoutParams : ()Landroid/view/ViewGroup$LayoutParams;
    //   771: checkcast sd1
    //   774: astore #13
    //   776: aload #13
    //   778: getfield b : Lhe1;
    //   781: invokevirtual j : ()Z
    //   784: ifne -> 828
    //   787: aload #13
    //   789: getfield b : Lhe1;
    //   792: invokevirtual d : ()I
    //   795: iflt -> 828
    //   798: aload #13
    //   800: getfield b : Lhe1;
    //   803: invokevirtual d : ()I
    //   806: aload_2
    //   807: invokevirtual b : ()I
    //   810: if_icmpge -> 828
    //   813: aload #14
    //   815: aload #12
    //   817: aload #12
    //   819: invokestatic R : (Landroid/view/View;)I
    //   822: invokevirtual b : (Landroid/view/View;I)V
    //   825: goto -> 1101
    //   828: aload_0
    //   829: getfield u : Z
    //   832: istore #10
    //   834: aload_0
    //   835: getfield x : Z
    //   838: istore #11
    //   840: iload #10
    //   842: iload #11
    //   844: if_icmpeq -> 850
    //   847: goto -> 1071
    //   850: aload_0
    //   851: aload_1
    //   852: aload_2
    //   853: aload #14
    //   855: getfield d : Z
    //   858: iload #11
    //   860: invokevirtual c1 : (Lyd1;Lde1;ZZ)Landroid/view/View;
    //   863: astore #13
    //   865: aload #13
    //   867: ifnull -> 1071
    //   870: aload #13
    //   872: invokestatic R : (Landroid/view/View;)I
    //   875: istore #4
    //   877: aload #14
    //   879: getfield d : Z
    //   882: istore #10
    //   884: aload #14
    //   886: getfield a : Lf51;
    //   889: astore #12
    //   891: iload #10
    //   893: ifeq -> 922
    //   896: aload #12
    //   898: aload #13
    //   900: invokevirtual d : (Landroid/view/View;)I
    //   903: istore_3
    //   904: aload #14
    //   906: aload #14
    //   908: getfield a : Lf51;
    //   911: invokevirtual o : ()I
    //   914: iload_3
    //   915: iadd
    //   916: putfield c : I
    //   919: goto -> 934
    //   922: aload #14
    //   924: aload #12
    //   926: aload #13
    //   928: invokevirtual g : (Landroid/view/View;)I
    //   931: putfield c : I
    //   934: aload #14
    //   936: iload #4
    //   938: putfield b : I
    //   941: aload_2
    //   942: getfield g : Z
    //   945: ifne -> 1101
    //   948: aload_0
    //   949: invokevirtual Q0 : ()Z
    //   952: ifeq -> 1101
    //   955: aload_0
    //   956: getfield t : Lf51;
    //   959: aload #13
    //   961: invokevirtual g : (Landroid/view/View;)I
    //   964: istore #8
    //   966: aload_0
    //   967: getfield t : Lf51;
    //   970: aload #13
    //   972: invokevirtual d : (Landroid/view/View;)I
    //   975: istore #4
    //   977: aload_0
    //   978: getfield t : Lf51;
    //   981: invokevirtual m : ()I
    //   984: istore #7
    //   986: aload_0
    //   987: getfield t : Lf51;
    //   990: invokevirtual i : ()I
    //   993: istore #6
    //   995: iload #4
    //   997: iload #7
    //   999: if_icmpgt -> 1014
    //   1002: iload #8
    //   1004: iload #7
    //   1006: if_icmpge -> 1014
    //   1009: iconst_1
    //   1010: istore_3
    //   1011: goto -> 1016
    //   1014: iconst_0
    //   1015: istore_3
    //   1016: iload #8
    //   1018: iload #6
    //   1020: if_icmplt -> 1036
    //   1023: iload #4
    //   1025: iload #6
    //   1027: if_icmple -> 1036
    //   1030: iconst_1
    //   1031: istore #4
    //   1033: goto -> 1039
    //   1036: iconst_0
    //   1037: istore #4
    //   1039: iload_3
    //   1040: ifne -> 1048
    //   1043: iload #4
    //   1045: ifeq -> 1101
    //   1048: iload #7
    //   1050: istore_3
    //   1051: aload #14
    //   1053: getfield d : Z
    //   1056: ifeq -> 1062
    //   1059: iload #6
    //   1061: istore_3
    //   1062: aload #14
    //   1064: iload_3
    //   1065: putfield c : I
    //   1068: goto -> 1101
    //   1071: aload #14
    //   1073: invokevirtual a : ()V
    //   1076: aload_0
    //   1077: getfield x : Z
    //   1080: ifeq -> 1093
    //   1083: aload_2
    //   1084: invokevirtual b : ()I
    //   1087: iconst_1
    //   1088: isub
    //   1089: istore_3
    //   1090: goto -> 1095
    //   1093: iconst_0
    //   1094: istore_3
    //   1095: aload #14
    //   1097: iload_3
    //   1098: putfield b : I
    //   1101: aload #14
    //   1103: iconst_1
    //   1104: putfield e : Z
    //   1107: aload_0
    //   1108: getfield s : Lhn0;
    //   1111: astore #12
    //   1113: aload #12
    //   1115: getfield j : I
    //   1118: iflt -> 1126
    //   1121: iconst_1
    //   1122: istore_3
    //   1123: goto -> 1128
    //   1126: iconst_m1
    //   1127: istore_3
    //   1128: aload #12
    //   1130: iload_3
    //   1131: putfield f : I
    //   1134: aload_0
    //   1135: getfield F : [I
    //   1138: astore #12
    //   1140: aload #12
    //   1142: iconst_0
    //   1143: iconst_0
    //   1144: iastore
    //   1145: aload #12
    //   1147: iconst_1
    //   1148: iconst_0
    //   1149: iastore
    //   1150: aload_2
    //   1151: getfield a : I
    //   1154: iconst_m1
    //   1155: if_icmpeq -> 1169
    //   1158: aload_0
    //   1159: getfield t : Lf51;
    //   1162: invokevirtual n : ()I
    //   1165: istore_3
    //   1166: goto -> 1171
    //   1169: iconst_0
    //   1170: istore_3
    //   1171: aload_0
    //   1172: getfield s : Lhn0;
    //   1175: getfield f : I
    //   1178: iconst_m1
    //   1179: if_icmpne -> 1188
    //   1182: iconst_0
    //   1183: istore #4
    //   1185: goto -> 1197
    //   1188: iconst_0
    //   1189: istore #6
    //   1191: iload_3
    //   1192: istore #4
    //   1194: iload #6
    //   1196: istore_3
    //   1197: aload #12
    //   1199: iconst_0
    //   1200: iload_3
    //   1201: iastore
    //   1202: aload #12
    //   1204: iconst_1
    //   1205: iload #4
    //   1207: iastore
    //   1208: iconst_0
    //   1209: iload_3
    //   1210: invokestatic max : (II)I
    //   1213: istore_3
    //   1214: aload_0
    //   1215: getfield t : Lf51;
    //   1218: invokevirtual m : ()I
    //   1221: iload_3
    //   1222: iadd
    //   1223: istore #6
    //   1225: iconst_0
    //   1226: aload #12
    //   1228: iconst_1
    //   1229: iaload
    //   1230: invokestatic max : (II)I
    //   1233: istore_3
    //   1234: aload_0
    //   1235: getfield t : Lf51;
    //   1238: invokevirtual j : ()I
    //   1241: iload_3
    //   1242: iadd
    //   1243: istore #7
    //   1245: iload #7
    //   1247: istore #4
    //   1249: iload #6
    //   1251: istore_3
    //   1252: aload_2
    //   1253: getfield g : Z
    //   1256: ifeq -> 1411
    //   1259: aload_0
    //   1260: getfield z : I
    //   1263: istore #8
    //   1265: iload #7
    //   1267: istore #4
    //   1269: iload #6
    //   1271: istore_3
    //   1272: iload #8
    //   1274: iconst_m1
    //   1275: if_icmpeq -> 1411
    //   1278: iload #7
    //   1280: istore #4
    //   1282: iload #6
    //   1284: istore_3
    //   1285: aload_0
    //   1286: getfield A : I
    //   1289: ldc -2147483648
    //   1291: if_icmpeq -> 1411
    //   1294: aload_0
    //   1295: iload #8
    //   1297: invokevirtual B : (I)Landroid/view/View;
    //   1300: astore #13
    //   1302: iload #7
    //   1304: istore #4
    //   1306: iload #6
    //   1308: istore_3
    //   1309: aload #13
    //   1311: ifnull -> 1411
    //   1314: aload_0
    //   1315: getfield w : Z
    //   1318: istore #10
    //   1320: aload_0
    //   1321: getfield t : Lf51;
    //   1324: astore #12
    //   1326: iload #10
    //   1328: ifeq -> 1361
    //   1331: aload #12
    //   1333: invokevirtual i : ()I
    //   1336: aload_0
    //   1337: getfield t : Lf51;
    //   1340: aload #13
    //   1342: invokevirtual d : (Landroid/view/View;)I
    //   1345: isub
    //   1346: istore #4
    //   1348: aload_0
    //   1349: getfield A : I
    //   1352: istore_3
    //   1353: iload #4
    //   1355: iload_3
    //   1356: isub
    //   1357: istore_3
    //   1358: goto -> 1386
    //   1361: aload #12
    //   1363: aload #13
    //   1365: invokevirtual g : (Landroid/view/View;)I
    //   1368: aload_0
    //   1369: getfield t : Lf51;
    //   1372: invokevirtual m : ()I
    //   1375: isub
    //   1376: istore_3
    //   1377: aload_0
    //   1378: getfield A : I
    //   1381: istore #4
    //   1383: goto -> 1353
    //   1386: iload_3
    //   1387: ifle -> 1402
    //   1390: iload #6
    //   1392: iload_3
    //   1393: iadd
    //   1394: istore_3
    //   1395: iload #7
    //   1397: istore #4
    //   1399: goto -> 1411
    //   1402: iload #7
    //   1404: iload_3
    //   1405: isub
    //   1406: istore #4
    //   1408: iload #6
    //   1410: istore_3
    //   1411: aload #14
    //   1413: getfield d : Z
    //   1416: istore #11
    //   1418: aload_0
    //   1419: getfield w : Z
    //   1422: istore #10
    //   1424: iload #11
    //   1426: ifeq -> 1440
    //   1429: iload #10
    //   1431: ifeq -> 1445
    //   1434: iconst_1
    //   1435: istore #5
    //   1437: goto -> 1445
    //   1440: iload #10
    //   1442: ifeq -> 1434
    //   1445: aload_0
    //   1446: aload_1
    //   1447: aload_2
    //   1448: aload #14
    //   1450: iload #5
    //   1452: invokevirtual j1 : (Lyd1;Lde1;Lfn0;I)V
    //   1455: aload_0
    //   1456: aload_1
    //   1457: invokevirtual A : (Lyd1;)V
    //   1460: aload_0
    //   1461: getfield s : Lhn0;
    //   1464: astore #12
    //   1466: aload_0
    //   1467: getfield t : Lf51;
    //   1470: invokevirtual k : ()I
    //   1473: ifne -> 1492
    //   1476: aload_0
    //   1477: getfield t : Lf51;
    //   1480: invokevirtual h : ()I
    //   1483: ifne -> 1492
    //   1486: iconst_1
    //   1487: istore #10
    //   1489: goto -> 1495
    //   1492: iconst_0
    //   1493: istore #10
    //   1495: aload #12
    //   1497: iload #10
    //   1499: putfield l : Z
    //   1502: aload_0
    //   1503: getfield s : Lhn0;
    //   1506: invokevirtual getClass : ()Ljava/lang/Class;
    //   1509: pop
    //   1510: aload_0
    //   1511: getfield s : Lhn0;
    //   1514: iconst_0
    //   1515: putfield i : I
    //   1518: aload #14
    //   1520: getfield d : Z
    //   1523: istore #10
    //   1525: aload #14
    //   1527: getfield b : I
    //   1530: istore #5
    //   1532: iload #10
    //   1534: ifeq -> 1741
    //   1537: aload_0
    //   1538: iload #5
    //   1540: aload #14
    //   1542: getfield c : I
    //   1545: invokevirtual t1 : (II)V
    //   1548: aload_0
    //   1549: getfield s : Lhn0;
    //   1552: astore #12
    //   1554: aload #12
    //   1556: iload_3
    //   1557: putfield h : I
    //   1560: aload_0
    //   1561: aload_1
    //   1562: aload #12
    //   1564: aload_2
    //   1565: iconst_0
    //   1566: invokevirtual X0 : (Lyd1;Lhn0;Lde1;Z)I
    //   1569: pop
    //   1570: aload_0
    //   1571: getfield s : Lhn0;
    //   1574: astore #12
    //   1576: aload #12
    //   1578: getfield b : I
    //   1581: istore #5
    //   1583: aload #12
    //   1585: getfield d : I
    //   1588: istore #7
    //   1590: aload #12
    //   1592: getfield c : I
    //   1595: istore #6
    //   1597: iload #4
    //   1599: istore_3
    //   1600: iload #6
    //   1602: ifle -> 1611
    //   1605: iload #4
    //   1607: iload #6
    //   1609: iadd
    //   1610: istore_3
    //   1611: aload_0
    //   1612: aload #14
    //   1614: getfield b : I
    //   1617: aload #14
    //   1619: getfield c : I
    //   1622: invokevirtual s1 : (II)V
    //   1625: aload_0
    //   1626: getfield s : Lhn0;
    //   1629: astore #12
    //   1631: aload #12
    //   1633: iload_3
    //   1634: putfield h : I
    //   1637: aload #12
    //   1639: aload #12
    //   1641: getfield d : I
    //   1644: aload #12
    //   1646: getfield e : I
    //   1649: iadd
    //   1650: putfield d : I
    //   1653: aload_0
    //   1654: aload_1
    //   1655: aload #12
    //   1657: aload_2
    //   1658: iconst_0
    //   1659: invokevirtual X0 : (Lyd1;Lhn0;Lde1;Z)I
    //   1662: pop
    //   1663: aload_0
    //   1664: getfield s : Lhn0;
    //   1667: astore #12
    //   1669: aload #12
    //   1671: getfield b : I
    //   1674: istore #6
    //   1676: aload #12
    //   1678: getfield c : I
    //   1681: istore #8
    //   1683: iload #5
    //   1685: istore_3
    //   1686: iload #6
    //   1688: istore #4
    //   1690: iload #8
    //   1692: ifle -> 1937
    //   1695: aload_0
    //   1696: iload #7
    //   1698: iload #5
    //   1700: invokevirtual t1 : (II)V
    //   1703: aload_0
    //   1704: getfield s : Lhn0;
    //   1707: astore #12
    //   1709: aload #12
    //   1711: iload #8
    //   1713: putfield h : I
    //   1716: aload_0
    //   1717: aload_1
    //   1718: aload #12
    //   1720: aload_2
    //   1721: iconst_0
    //   1722: invokevirtual X0 : (Lyd1;Lhn0;Lde1;Z)I
    //   1725: pop
    //   1726: aload_0
    //   1727: getfield s : Lhn0;
    //   1730: getfield b : I
    //   1733: istore_3
    //   1734: iload #6
    //   1736: istore #4
    //   1738: goto -> 1937
    //   1741: aload_0
    //   1742: iload #5
    //   1744: aload #14
    //   1746: getfield c : I
    //   1749: invokevirtual s1 : (II)V
    //   1752: aload_0
    //   1753: getfield s : Lhn0;
    //   1756: astore #12
    //   1758: aload #12
    //   1760: iload #4
    //   1762: putfield h : I
    //   1765: aload_0
    //   1766: aload_1
    //   1767: aload #12
    //   1769: aload_2
    //   1770: iconst_0
    //   1771: invokevirtual X0 : (Lyd1;Lhn0;Lde1;Z)I
    //   1774: pop
    //   1775: aload_0
    //   1776: getfield s : Lhn0;
    //   1779: astore #12
    //   1781: aload #12
    //   1783: getfield b : I
    //   1786: istore #5
    //   1788: aload #12
    //   1790: getfield d : I
    //   1793: istore #6
    //   1795: aload #12
    //   1797: getfield c : I
    //   1800: istore #7
    //   1802: iload_3
    //   1803: istore #4
    //   1805: iload #7
    //   1807: ifle -> 1816
    //   1810: iload_3
    //   1811: iload #7
    //   1813: iadd
    //   1814: istore #4
    //   1816: aload_0
    //   1817: aload #14
    //   1819: getfield b : I
    //   1822: aload #14
    //   1824: getfield c : I
    //   1827: invokevirtual t1 : (II)V
    //   1830: aload_0
    //   1831: getfield s : Lhn0;
    //   1834: astore #12
    //   1836: aload #12
    //   1838: iload #4
    //   1840: putfield h : I
    //   1843: aload #12
    //   1845: aload #12
    //   1847: getfield d : I
    //   1850: aload #12
    //   1852: getfield e : I
    //   1855: iadd
    //   1856: putfield d : I
    //   1859: aload_0
    //   1860: aload_1
    //   1861: aload #12
    //   1863: aload_2
    //   1864: iconst_0
    //   1865: invokevirtual X0 : (Lyd1;Lhn0;Lde1;Z)I
    //   1868: pop
    //   1869: aload_0
    //   1870: getfield s : Lhn0;
    //   1873: astore #12
    //   1875: aload #12
    //   1877: getfield b : I
    //   1880: istore_3
    //   1881: aload #12
    //   1883: getfield c : I
    //   1886: istore #7
    //   1888: iload #5
    //   1890: istore #4
    //   1892: iload #7
    //   1894: ifle -> 1937
    //   1897: aload_0
    //   1898: iload #6
    //   1900: iload #5
    //   1902: invokevirtual s1 : (II)V
    //   1905: aload_0
    //   1906: getfield s : Lhn0;
    //   1909: astore #12
    //   1911: aload #12
    //   1913: iload #7
    //   1915: putfield h : I
    //   1918: aload_0
    //   1919: aload_1
    //   1920: aload #12
    //   1922: aload_2
    //   1923: iconst_0
    //   1924: invokevirtual X0 : (Lyd1;Lhn0;Lde1;Z)I
    //   1927: pop
    //   1928: aload_0
    //   1929: getfield s : Lhn0;
    //   1932: getfield b : I
    //   1935: istore #4
    //   1937: iload_3
    //   1938: istore #5
    //   1940: iload #4
    //   1942: istore #6
    //   1944: aload_0
    //   1945: invokevirtual G : ()I
    //   1948: ifle -> 2048
    //   1951: aload_0
    //   1952: getfield w : Z
    //   1955: aload_0
    //   1956: getfield x : Z
    //   1959: ixor
    //   1960: ifeq -> 2012
    //   1963: aload_0
    //   1964: iload #4
    //   1966: aload_1
    //   1967: aload_2
    //   1968: iconst_1
    //   1969: invokevirtual d1 : (ILyd1;Lde1;Z)I
    //   1972: istore #6
    //   1974: iload_3
    //   1975: iload #6
    //   1977: iadd
    //   1978: istore #5
    //   1980: iload #4
    //   1982: iload #6
    //   1984: iadd
    //   1985: istore #4
    //   1987: aload_0
    //   1988: iload #5
    //   1990: aload_1
    //   1991: aload_2
    //   1992: iconst_0
    //   1993: invokevirtual e1 : (ILyd1;Lde1;Z)I
    //   1996: istore_3
    //   1997: iload #5
    //   1999: iload_3
    //   2000: iadd
    //   2001: istore #5
    //   2003: iload #4
    //   2005: iload_3
    //   2006: iadd
    //   2007: istore #6
    //   2009: goto -> 2048
    //   2012: aload_0
    //   2013: iload_3
    //   2014: aload_1
    //   2015: aload_2
    //   2016: iconst_1
    //   2017: invokevirtual e1 : (ILyd1;Lde1;Z)I
    //   2020: istore #6
    //   2022: iload_3
    //   2023: iload #6
    //   2025: iadd
    //   2026: istore #5
    //   2028: iload #4
    //   2030: iload #6
    //   2032: iadd
    //   2033: istore #4
    //   2035: aload_0
    //   2036: iload #4
    //   2038: aload_1
    //   2039: aload_2
    //   2040: iconst_0
    //   2041: invokevirtual d1 : (ILyd1;Lde1;Z)I
    //   2044: istore_3
    //   2045: goto -> 1997
    //   2048: aload_2
    //   2049: getfield k : Z
    //   2052: ifeq -> 2358
    //   2055: aload_0
    //   2056: invokevirtual G : ()I
    //   2059: ifeq -> 2358
    //   2062: aload_2
    //   2063: getfield g : Z
    //   2066: ifne -> 2358
    //   2069: aload_0
    //   2070: invokevirtual Q0 : ()Z
    //   2073: ifne -> 2079
    //   2076: goto -> 2358
    //   2079: aload_1
    //   2080: getfield d : Ljava/util/List;
    //   2083: astore #13
    //   2085: aload #13
    //   2087: invokeinterface size : ()I
    //   2092: istore #8
    //   2094: aload_0
    //   2095: iconst_0
    //   2096: invokevirtual F : (I)Landroid/view/View;
    //   2099: invokestatic R : (Landroid/view/View;)I
    //   2102: istore #9
    //   2104: iconst_0
    //   2105: istore_3
    //   2106: iconst_0
    //   2107: istore #7
    //   2109: iload #7
    //   2111: istore #4
    //   2113: iload_3
    //   2114: iload #8
    //   2116: if_icmpge -> 2225
    //   2119: aload #13
    //   2121: iload_3
    //   2122: invokeinterface get : (I)Ljava/lang/Object;
    //   2127: checkcast he1
    //   2130: astore #15
    //   2132: aload #15
    //   2134: invokevirtual j : ()Z
    //   2137: istore #10
    //   2139: aload #15
    //   2141: getfield b : Landroid/view/View;
    //   2144: astore #12
    //   2146: iload #10
    //   2148: ifeq -> 2154
    //   2151: goto -> 2219
    //   2154: aload #15
    //   2156: invokevirtual d : ()I
    //   2159: iload #9
    //   2161: if_icmpge -> 2170
    //   2164: iconst_1
    //   2165: istore #10
    //   2167: goto -> 2173
    //   2170: iconst_0
    //   2171: istore #10
    //   2173: aload_0
    //   2174: getfield w : Z
    //   2177: istore #11
    //   2179: aload_0
    //   2180: getfield t : Lf51;
    //   2183: astore #15
    //   2185: iload #10
    //   2187: iload #11
    //   2189: if_icmpeq -> 2207
    //   2192: iload #7
    //   2194: aload #15
    //   2196: aload #12
    //   2198: invokevirtual e : (Landroid/view/View;)I
    //   2201: iadd
    //   2202: istore #7
    //   2204: goto -> 2219
    //   2207: iload #4
    //   2209: aload #15
    //   2211: aload #12
    //   2213: invokevirtual e : (Landroid/view/View;)I
    //   2216: iadd
    //   2217: istore #4
    //   2219: iinc #3, 1
    //   2222: goto -> 2113
    //   2225: aload_0
    //   2226: getfield s : Lhn0;
    //   2229: aload #13
    //   2231: putfield k : Ljava/util/List;
    //   2234: iload #7
    //   2236: ifle -> 2292
    //   2239: aload_0
    //   2240: aload_0
    //   2241: invokevirtual g1 : ()Landroid/view/View;
    //   2244: invokestatic R : (Landroid/view/View;)I
    //   2247: iload #5
    //   2249: invokevirtual t1 : (II)V
    //   2252: aload_0
    //   2253: getfield s : Lhn0;
    //   2256: astore #12
    //   2258: aload #12
    //   2260: iload #7
    //   2262: putfield h : I
    //   2265: aload #12
    //   2267: iconst_0
    //   2268: putfield c : I
    //   2271: aload #12
    //   2273: aconst_null
    //   2274: invokevirtual a : (Landroid/view/View;)V
    //   2277: aload_0
    //   2278: aload_1
    //   2279: aload_0
    //   2280: getfield s : Lhn0;
    //   2283: aload_2
    //   2284: iconst_0
    //   2285: invokevirtual X0 : (Lyd1;Lhn0;Lde1;Z)I
    //   2288: pop
    //   2289: goto -> 2292
    //   2292: iload #4
    //   2294: ifle -> 2350
    //   2297: aload_0
    //   2298: aload_0
    //   2299: invokevirtual f1 : ()Landroid/view/View;
    //   2302: invokestatic R : (Landroid/view/View;)I
    //   2305: iload #6
    //   2307: invokevirtual s1 : (II)V
    //   2310: aload_0
    //   2311: getfield s : Lhn0;
    //   2314: astore #12
    //   2316: aload #12
    //   2318: iload #4
    //   2320: putfield h : I
    //   2323: aload #12
    //   2325: iconst_0
    //   2326: putfield c : I
    //   2329: aload #12
    //   2331: aconst_null
    //   2332: invokevirtual a : (Landroid/view/View;)V
    //   2335: aload_0
    //   2336: aload_1
    //   2337: aload_0
    //   2338: getfield s : Lhn0;
    //   2341: aload_2
    //   2342: iconst_0
    //   2343: invokevirtual X0 : (Lyd1;Lhn0;Lde1;Z)I
    //   2346: pop
    //   2347: goto -> 2350
    //   2350: aload_0
    //   2351: getfield s : Lhn0;
    //   2354: aconst_null
    //   2355: putfield k : Ljava/util/List;
    //   2358: aload_2
    //   2359: getfield g : Z
    //   2362: ifne -> 2381
    //   2365: aload_0
    //   2366: getfield t : Lf51;
    //   2369: astore_1
    //   2370: aload_1
    //   2371: aload_1
    //   2372: invokevirtual n : ()I
    //   2375: putfield a : I
    //   2378: goto -> 2386
    //   2381: aload #14
    //   2383: invokevirtual c : ()V
    //   2386: aload_0
    //   2387: aload_0
    //   2388: getfield x : Z
    //   2391: putfield u : Z
    //   2394: return
  }
  
  public void q1(boolean paramBoolean) {
    m(null);
    if (this.x == paramBoolean)
      return; 
    this.x = paramBoolean;
    C0();
  }
  
  public void r0(de1 paramde1) {
    this.B = null;
    this.z = -1;
    this.A = Integer.MIN_VALUE;
    this.C.c();
  }
  
  public final void r1(int paramInt1, int paramInt2, boolean paramBoolean, de1 paramde1) {
    boolean bool4;
    hn0 hn02 = this.s;
    int i = this.t.k();
    boolean bool3 = false;
    boolean bool1 = true;
    boolean bool2 = true;
    if (i == 0 && this.t.h() == 0) {
      bool4 = true;
    } else {
      bool4 = false;
    } 
    hn02.l = bool4;
    this.s.f = paramInt1;
    int[] arrayOfInt = this.F;
    arrayOfInt[0] = 0;
    arrayOfInt[1] = 0;
    if (paramde1.a != -1) {
      i = this.t.n();
    } else {
      i = 0;
    } 
    if (this.s.f == -1) {
      k = 0;
      j = i;
    } else {
      j = 0;
      k = i;
    } 
    arrayOfInt[0] = j;
    arrayOfInt[1] = k;
    int j = Math.max(0, j);
    i = Math.max(0, arrayOfInt[1]);
    int k = bool3;
    if (paramInt1 == 1)
      k = 1; 
    hn0 hn01 = this.s;
    if (k != 0) {
      paramInt1 = i;
    } else {
      paramInt1 = j;
    } 
    hn01.h = paramInt1;
    if (k != 0)
      i = j; 
    hn01.i = i;
    if (k != 0) {
      hn01.h = this.t.j() + paramInt1;
      View view = f1();
      hn0 hn03 = this.s;
      paramInt1 = bool2;
      if (this.w)
        paramInt1 = -1; 
      hn03.e = paramInt1;
      paramInt1 = a.R(view);
      hn01 = this.s;
      hn03.d = paramInt1 + hn01.e;
      hn01.b = this.t.d(view);
      paramInt1 = this.t.d(view) - this.t.i();
    } else {
      View view = g1();
      hn0 hn03 = this.s;
      paramInt1 = hn03.h;
      hn03.h = this.t.m() + paramInt1;
      hn03 = this.s;
      if (this.w) {
        paramInt1 = bool1;
      } else {
        paramInt1 = -1;
      } 
      hn03.e = paramInt1;
      paramInt1 = a.R(view);
      hn0 hn04 = this.s;
      hn03.d = paramInt1 + hn04.e;
      hn04.b = this.t.g(view);
      paramInt1 = -this.t.g(view) + this.t.m();
    } 
    hn01 = this.s;
    hn01.c = paramInt2;
    if (paramBoolean)
      hn01.c = paramInt2 - paramInt1; 
    hn01.g = paramInt1;
  }
  
  public final void s(int paramInt1, int paramInt2, de1 paramde1, il paramil) {
    if (this.r != 0)
      paramInt1 = paramInt2; 
    if (G() != 0 && paramInt1 != 0) {
      W0();
      if (paramInt1 > 0) {
        paramInt2 = 1;
      } else {
        paramInt2 = -1;
      } 
      r1(paramInt2, Math.abs(paramInt1), true, paramde1);
      R0(paramde1, this.s, paramil);
    } 
  }
  
  public void s0(Parcelable paramParcelable) {
    if (paramParcelable instanceof in0) {
      in0 in01 = (in0)paramParcelable;
      this.B = in01;
      if (this.z != -1)
        in01.b = -1; 
      C0();
    } 
  }
  
  public final void s1(int paramInt1, int paramInt2) {
    boolean bool;
    this.s.c = this.t.i() - paramInt2;
    hn0 hn01 = this.s;
    if (this.w) {
      bool = true;
    } else {
      bool = true;
    } 
    hn01.e = bool;
    hn01.d = paramInt1;
    hn01.f = 1;
    hn01.b = paramInt2;
    hn01.g = Integer.MIN_VALUE;
  }
  
  public final void t(int paramInt, il paramil) {
    // Byte code:
    //   0: aload_0
    //   1: getfield B : Lin0;
    //   4: astore #9
    //   6: iconst_m1
    //   7: istore #4
    //   9: aload #9
    //   11: ifnull -> 34
    //   14: aload #9
    //   16: getfield b : I
    //   19: istore_3
    //   20: iload_3
    //   21: iflt -> 34
    //   24: aload #9
    //   26: getfield e : Z
    //   29: istore #7
    //   31: goto -> 85
    //   34: aload_0
    //   35: invokevirtual m1 : ()V
    //   38: aload_0
    //   39: getfield w : Z
    //   42: istore #8
    //   44: aload_0
    //   45: getfield z : I
    //   48: istore #5
    //   50: iload #8
    //   52: istore #7
    //   54: iload #5
    //   56: istore_3
    //   57: iload #5
    //   59: iconst_m1
    //   60: if_icmpne -> 85
    //   63: iload #8
    //   65: ifeq -> 79
    //   68: iload_1
    //   69: iconst_1
    //   70: isub
    //   71: istore_3
    //   72: iload #8
    //   74: istore #7
    //   76: goto -> 85
    //   79: iconst_0
    //   80: istore_3
    //   81: iload #8
    //   83: istore #7
    //   85: iload #7
    //   87: ifeq -> 93
    //   90: goto -> 96
    //   93: iconst_1
    //   94: istore #4
    //   96: iconst_0
    //   97: istore #6
    //   99: iload_3
    //   100: istore #5
    //   102: iload #6
    //   104: istore_3
    //   105: iload_3
    //   106: aload_0
    //   107: getfield E : I
    //   110: if_icmpge -> 144
    //   113: iload #5
    //   115: iflt -> 144
    //   118: iload #5
    //   120: iload_1
    //   121: if_icmpge -> 144
    //   124: aload_2
    //   125: iload #5
    //   127: iconst_0
    //   128: invokevirtual b : (II)V
    //   131: iload #5
    //   133: iload #4
    //   135: iadd
    //   136: istore #5
    //   138: iinc #3, 1
    //   141: goto -> 105
    //   144: return
  }
  
  public final Parcelable t0() {
    in0 in01 = this.B;
    if (in01 != null) {
      Object object1 = new Object();
      ((in0)object1).b = in01.b;
      ((in0)object1).c = in01.c;
      ((in0)object1).e = in01.e;
      return (Parcelable)object1;
    } 
    Object object = new Object();
    if (G() > 0) {
      W0();
      int i = this.u ^ this.w;
      ((in0)object).e = i;
      if (i != 0) {
        View view1 = f1();
        ((in0)object).c = this.t.i() - this.t.d(view1);
        ((in0)object).b = a.R(view1);
        return (Parcelable)object;
      } 
      View view = g1();
      ((in0)object).b = a.R(view);
      ((in0)object).c = this.t.g(view) - this.t.m();
      return (Parcelable)object;
    } 
    ((in0)object).b = -1;
    return (Parcelable)object;
  }
  
  public final void t1(int paramInt1, int paramInt2) {
    this.s.c = paramInt2 - this.t.m();
    hn0 hn01 = this.s;
    hn01.d = paramInt1;
    if (this.w) {
      paramInt1 = 1;
    } else {
      paramInt1 = -1;
    } 
    hn01.e = paramInt1;
    hn01.f = -1;
    hn01.b = paramInt2;
    hn01.g = Integer.MIN_VALUE;
  }
  
  public final int u(de1 paramde1) {
    return S0(paramde1);
  }
  
  public int v(de1 paramde1) {
    return T0(paramde1);
  }
  
  public boolean v0(int paramInt, Bundle paramBundle) {
    if (super.v0(paramInt, paramBundle))
      return true; 
    if (paramInt == 16908343 && paramBundle != null) {
      RecyclerView recyclerView;
      if (this.r == 1) {
        paramInt = paramBundle.getInt("android.view.accessibility.action.ARGUMENT_ROW_INT", -1);
        if (paramInt < 0)
          return false; 
        recyclerView = this.c;
        paramInt = Math.min(paramInt, T(recyclerView.e, recyclerView.j0) - 1);
      } else {
        paramInt = recyclerView.getInt("android.view.accessibility.action.ARGUMENT_COLUMN_INT", -1);
        if (paramInt < 0)
          return false; 
        recyclerView = this.c;
        paramInt = Math.min(paramInt, I(recyclerView.e, recyclerView.j0) - 1);
      } 
      if (paramInt >= 0) {
        o1(paramInt, 0);
        return true;
      } 
    } 
    return false;
  }
  
  public int w(de1 paramde1) {
    return U0(paramde1);
  }
  
  public final int x(de1 paramde1) {
    return S0(paramde1);
  }
  
  public int y(de1 paramde1) {
    return T0(paramde1);
  }
  
  public int z(de1 paramde1) {
    return U0(paramde1);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\androidx\recyclerview\widget\LinearLayoutManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
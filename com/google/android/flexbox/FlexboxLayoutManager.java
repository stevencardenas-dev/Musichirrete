package com.google.android.flexbox;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.a;
import ce1;
import cn;
import de1;
import e51;
import f51;
import f80;
import h80;
import i80;
import in.krosbits.musicolet.MostPlayedActivity;
import java.util.ArrayList;
import java.util.List;
import kn0;
import l80;
import m60;
import m80;
import n80;
import o80;
import rd1;
import sd1;
import yd1;

public class FlexboxLayoutManager extends a implements f80, ce1 {
  public static final Rect Q = new Rect();
  
  public yd1 A;
  
  public de1 B;
  
  public n80 C;
  
  public final l80 D = new l80(this);
  
  public f51 E;
  
  public f51 F;
  
  public o80 G;
  
  public int H = -1;
  
  public int I = Integer.MIN_VALUE;
  
  public int J = Integer.MIN_VALUE;
  
  public int K = Integer.MIN_VALUE;
  
  public final SparseArray L = new SparseArray();
  
  public final Context M;
  
  public View N;
  
  public int O = -1;
  
  public final i80 P = (i80)new Object();
  
  public int r;
  
  public int s;
  
  public int t;
  
  public int u;
  
  public final int v = -1;
  
  public boolean w;
  
  public boolean x;
  
  public List y = new ArrayList();
  
  public final cn z = new cn(this);
  
  public FlexboxLayoutManager(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2) {
    rd1 rd1 = a.S(paramContext, paramAttributeSet, paramInt1, paramInt2);
    paramInt1 = rd1.a;
    if (paramInt1 != 0) {
      if (paramInt1 == 1)
        if (rd1.c) {
          i1(3);
        } else {
          i1(2);
        }  
    } else if (rd1.c) {
      i1(1);
    } else {
      i1(0);
    } 
    j1(1);
    h1(4);
    this.M = paramContext;
  }
  
  public FlexboxLayoutManager(MostPlayedActivity paramMostPlayedActivity) {
    i1(0);
    j1(1);
    h1(4);
    this.M = (Context)paramMostPlayedActivity;
  }
  
  public static boolean X(int paramInt1, int paramInt2, int paramInt3) {
    int i = View.MeasureSpec.getMode(paramInt2);
    paramInt2 = View.MeasureSpec.getSize(paramInt2);
    return (paramInt3 > 0 && paramInt1 != paramInt3) ? false : ((i != Integer.MIN_VALUE) ? ((i != 0) ? ((i != 1073741824) ? false : ((paramInt2 == paramInt1))) : true) : ((paramInt2 >= paramInt1)));
  }
  
  public final sd1 C() {
    sd1 sd1 = new sd1(-2, -2);
    ((m80)sd1).g = 0.0F;
    ((m80)sd1).h = 1.0F;
    ((m80)sd1).i = -1;
    ((m80)sd1).j = -1.0F;
    ((m80)sd1).m = 16777215;
    ((m80)sd1).n = 16777215;
    return sd1;
  }
  
  public final sd1 D(Context paramContext, AttributeSet paramAttributeSet) {
    sd1 sd1 = new sd1(paramContext, paramAttributeSet);
    ((m80)sd1).g = 0.0F;
    ((m80)sd1).h = 1.0F;
    ((m80)sd1).i = -1;
    ((m80)sd1).j = -1.0F;
    ((m80)sd1).m = 16777215;
    ((m80)sd1).n = 16777215;
    return sd1;
  }
  
  public final int D0(int paramInt, yd1 paramyd1, de1 paramde1) {
    if (!j() || this.s == 0) {
      paramInt = e1(paramInt, paramyd1, paramde1);
      this.L.clear();
      return paramInt;
    } 
    paramInt = f1(paramInt);
    l80 l801 = this.D;
    l801.d += paramInt;
    this.F.r(-paramInt);
    return paramInt;
  }
  
  public final void E0(int paramInt) {
    this.H = paramInt;
    this.I = Integer.MIN_VALUE;
    o80 o801 = this.G;
    if (o801 != null)
      o801.b = -1; 
    C0();
  }
  
  public final int F0(int paramInt, yd1 paramyd1, de1 paramde1) {
    if (j() || (this.s == 0 && !j())) {
      paramInt = e1(paramInt, paramyd1, paramde1);
      this.L.clear();
      return paramInt;
    } 
    paramInt = f1(paramInt);
    l80 l801 = this.D;
    l801.d += paramInt;
    this.F.r(-paramInt);
    return paramInt;
  }
  
  public final void O0(RecyclerView paramRecyclerView, int paramInt) {
    kn0 kn0 = new kn0(paramRecyclerView.getContext());
    kn0.a = paramInt;
    P0(kn0);
  }
  
  public final int R0(de1 paramde1) {
    if (G() != 0) {
      int i = paramde1.b();
      U0();
      View view1 = W0(i);
      View view2 = Y0(i);
      if (paramde1.b() != 0 && view1 != null && view2 != null) {
        i = this.E.d(view2);
        int j = this.E.g(view1);
        return Math.min(this.E.n(), i - j);
      } 
    } 
    return 0;
  }
  
  public final int S0(de1 paramde1) {
    if (G() != 0) {
      int i = paramde1.b();
      View view1 = W0(i);
      View view2 = Y0(i);
      if (paramde1.b() != 0 && view1 != null && view2 != null) {
        int k = a.R(view1);
        int j = a.R(view2);
        i = Math.abs(this.E.d(view2) - this.E.g(view1));
        int[] arrayOfInt = (int[])this.z.c;
        k = arrayOfInt[k];
        if (k != 0 && k != -1) {
          j = arrayOfInt[j];
          float f = i / (j - k + 1);
          return Math.round(k * f + (this.E.m() - this.E.g(view1)));
        } 
      } 
    } 
    return 0;
  }
  
  public final int T0(de1 paramde1) {
    if (G() != 0) {
      int i = paramde1.b();
      View view2 = W0(i);
      View view1 = Y0(i);
      if (paramde1.b() != 0 && view2 != null && view1 != null) {
        View view = a1(0, G());
        int j = -1;
        if (view == null) {
          i = -1;
        } else {
          i = a.R(view);
        } 
        view = a1(G() - 1, -1);
        if (view != null)
          j = a.R(view); 
        return (int)(Math.abs(this.E.d(view1) - this.E.g(view2)) / (j - i + 1) * paramde1.b());
      } 
    } 
    return 0;
  }
  
  public final void U0() {
    if (this.E != null)
      return; 
    boolean bool = j();
    int i = this.s;
    if (bool) {
      if (i == 0) {
        this.E = (f51)new e51(this, 0);
        this.F = (f51)new e51(this, 1);
        return;
      } 
      this.E = (f51)new e51(this, 1);
      this.F = (f51)new e51(this, 0);
      return;
    } 
    if (i == 0) {
      this.E = (f51)new e51(this, 1);
      this.F = (f51)new e51(this, 0);
      return;
    } 
    this.E = (f51)new e51(this, 0);
    this.F = (f51)new e51(this, 1);
  }
  
  public final boolean V() {
    return true;
  }
  
  public final int V0(yd1 paramyd1, de1 paramde1, n80 paramn80) {
    int j = paramn80.f;
    if (j != Integer.MIN_VALUE) {
      int n = paramn80.a;
      if (n < 0)
        paramn80.f = j + n; 
      g1(paramyd1, paramn80);
    } 
    j = paramn80.a;
    boolean bool = j();
    int k = j;
    int m = 0;
    while (k > 0 || this.C.b) {
      List list = this.y;
      int n = paramn80.d;
      if (n >= 0 && n < paramde1.b()) {
        n = paramn80.c;
        if (n >= 0 && n < list.size()) {
          m80 m80;
          h80 h80 = this.y.get(paramn80.c);
          paramn80.d = h80.o;
          boolean bool1 = j();
          l80 l801 = this.D;
          Rect rect = Q;
          cn cn1 = this.z;
          if (bool1) {
            float f2;
            float f3;
            int i5 = getPaddingLeft();
            int i3 = getPaddingRight();
            int i4 = this.p;
            n = paramn80.e;
            int i1 = n;
            if (paramn80.h == -1)
              i1 = n - h80.g; 
            int i2 = paramn80.d;
            n = this.t;
            if (n != 0) {
              if (n != 1) {
                if (n != 2) {
                  if (n != 3) {
                    if (n != 4) {
                      if (n == 5) {
                        n = h80.h;
                        if (n != 0) {
                          f1 = (i4 - h80.e) / (n + 1);
                        } else {
                          f1 = 0.0F;
                        } 
                        f3 = i5 + f1;
                        f2 = (i4 - i3) - f1;
                      } else {
                        m60.j("Invalid justifyContent is set: ", this.t);
                        return 0;
                      } 
                    } else {
                      n = h80.h;
                      if (n != 0) {
                        f1 = (i4 - h80.e) / n;
                      } else {
                        f1 = 0.0F;
                      } 
                      f3 = i5;
                      f2 = f1 / 2.0F;
                      f3 += f2;
                      f2 = (i4 - i3) - f2;
                    } 
                  } else {
                    f3 = i5;
                    n = h80.h;
                    if (n != 1) {
                      f1 = (n - 1);
                    } else {
                      f1 = 1.0F;
                    } 
                    f1 = (i4 - h80.e) / f1;
                    f2 = (i4 - i3);
                  } 
                } else {
                  f1 = i5;
                  f3 = (i4 - h80.e) / 2.0F;
                  f2 = (i4 - i3) - f3;
                  f3 = f1 + f3;
                  f1 = 0.0F;
                } 
              } else {
                n = h80.e;
                f3 = (i4 - n + i3);
                f2 = (n - i5);
                f1 = 0.0F;
              } 
            } else {
              f3 = i5;
              f2 = (i4 - i3);
              f1 = 0.0F;
            } 
            float f4 = l801.d;
            f3 -= f4;
            f2 -= f4;
            f4 = Math.max(f1, 0.0F);
            i4 = h80.h;
            i3 = i2;
            n = 0;
            float f1 = f3;
            while (i3 < i2 + i4) {
              View view = b(i3);
              if (view != null) {
                if (paramn80.h == 1) {
                  n(view, rect);
                  l(view, -1, false);
                } else {
                  n(view, rect);
                  l(view, n, false);
                  n++;
                } 
                long l = ((long[])cn1.f)[i3];
                int i6 = (int)l;
                i5 = (int)(l >> 32L);
                m80 = (m80)view.getLayoutParams();
                if (k1(view, i6, i5, m80))
                  view.measure(i6, i5); 
                f1 += (((ViewGroup.MarginLayoutParams)m80).leftMargin + ((sd1)view.getLayoutParams()).c.left);
                f2 -= (((ViewGroup.MarginLayoutParams)m80).rightMargin + ((sd1)view.getLayoutParams()).c.right);
                i5 = i1 + ((sd1)view.getLayoutParams()).c.top;
                bool1 = this.w;
                cn cn2 = this.z;
                if (bool1) {
                  cn2.p(view, h80, Math.round(f2) - view.getMeasuredWidth(), i5, Math.round(f2), view.getMeasuredHeight() + i5);
                } else {
                  int i7 = Math.round(f1);
                  i6 = Math.round(f1);
                  cn2.p(view, h80, i7, i5, view.getMeasuredWidth() + i6, view.getMeasuredHeight() + i5);
                } 
                f3 = (view.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams)m80).rightMargin + ((sd1)view.getLayoutParams()).c.right);
                f2 -= (view.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams)m80).leftMargin + ((sd1)view.getLayoutParams()).c.left) + f4;
                f1 = f3 + f4 + f1;
              } 
              i3++;
            } 
            n = this.C.h;
            paramn80.c += n;
            n = h80.g;
          } else {
            float f2;
            int i1;
            int i2;
            bool1 = bool;
            int i6 = getPaddingTop();
            int i3 = getPaddingBottom();
            int i5 = this.q;
            n = paramn80.e;
            if (paramn80.h == -1) {
              i1 = h80.g;
              i2 = n + i1;
              i1 = n - i1;
            } else {
              i2 = n;
              i1 = n;
            } 
            int i4 = paramn80.d;
            n = this.t;
            if (n != 0) {
              if (n != 1) {
                if (n != 2) {
                  if (n != 3) {
                    if (n != 4) {
                      if (n == 5) {
                        n = h80.h;
                        if (n != 0) {
                          f1 = (i5 - h80.e) / (n + 1);
                        } else {
                          f1 = 0.0F;
                        } 
                        f2 = i6 + f1;
                        f3 = (i5 - i3) - f1;
                      } else {
                        m60.j("Invalid justifyContent is set: ", this.t);
                        return 0;
                      } 
                    } else {
                      n = h80.h;
                      if (n != 0) {
                        f1 = (i5 - h80.e) / n;
                      } else {
                        f1 = 0.0F;
                      } 
                      f2 = i6;
                      f3 = f1 / 2.0F;
                      f2 += f3;
                      f3 = (i5 - i3) - f3;
                    } 
                  } else {
                    f2 = i6;
                    n = h80.h;
                    if (n != 1) {
                      f1 = (n - 1);
                    } else {
                      f1 = 1.0F;
                    } 
                    f1 = (i5 - h80.e) / f1;
                    f3 = (i5 - i3);
                  } 
                } else {
                  f2 = i6;
                  f1 = (i5 - h80.e) / 2.0F;
                  f3 = (i5 - i3) - f1;
                  f2 += f1;
                  f1 = 0.0F;
                } 
              } else {
                n = h80.e;
                f2 = (i5 - n + i3);
                f3 = (n - i6);
                f1 = 0.0F;
              } 
            } else {
              f2 = i6;
              f3 = (i5 - i3);
              f1 = 0.0F;
            } 
            bool = true;
            float f4 = ((l80)m80).d;
            f2 -= f4;
            f4 = f3 - f4;
            float f3 = Math.max(f1, 0.0F);
            i5 = h80.h;
            i3 = i4;
            n = 0;
            float f1 = f4;
            while (i3 < i4 + i5) {
              View view = b(i3);
              if (view != null) {
                long[] arrayOfLong = (long[])cn1.f;
                long l = arrayOfLong[i3];
                i6 = (int)l;
                int i7 = (int)(l >> 32L);
                m80 m801 = (m80)view.getLayoutParams();
                if (k1(view, i6, i7, m801))
                  view.measure(i6, i7); 
                f2 += (((ViewGroup.MarginLayoutParams)m801).topMargin + ((sd1)view.getLayoutParams()).c.top);
                f1 -= (((ViewGroup.MarginLayoutParams)m801).rightMargin + ((sd1)view.getLayoutParams()).c.bottom);
                if (paramn80.h == 1) {
                  n(view, rect);
                  l(view, -1, false);
                } else {
                  n(view, rect);
                  l(view, n, false);
                  n++;
                } 
                i6 = i1 + ((sd1)view.getLayoutParams()).c.left;
                i7 = i2 - ((sd1)view.getLayoutParams()).c.right;
                bool = this.w;
                boolean bool2 = this.x;
                cn cn2 = this.z;
                if (bool) {
                  if (bool2) {
                    cn2.q(view, h80, bool, i7 - view.getMeasuredWidth(), Math.round(f1) - view.getMeasuredHeight(), i7, Math.round(f1));
                  } else {
                    i6 = view.getMeasuredWidth();
                    int i8 = Math.round(f2);
                    int i9 = Math.round(f2);
                    cn2.q(view, h80, bool, i7 - i6, i8, i7, view.getMeasuredHeight() + i9);
                  } 
                } else if (bool2) {
                  cn2.q(view, h80, bool, i6, Math.round(f1) - view.getMeasuredHeight(), view.getMeasuredWidth() + i6, Math.round(f1));
                } else {
                  int i9 = Math.round(f2);
                  i7 = view.getMeasuredWidth();
                  int i8 = Math.round(f2);
                  cn2.q(view, h80, bool, i6, i9, i7 + i6, view.getMeasuredHeight() + i8);
                } 
                bool = true;
                f2 = (view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams)m801).topMargin + ((sd1)view.getLayoutParams()).c.bottom) + f3 + f2;
                f1 -= (view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams)m801).bottomMargin + ((sd1)view.getLayoutParams()).c.top) + f3;
              } 
              i3++;
            } 
            n = this.C.h;
            paramn80.c += n;
            n = h80.g;
            bool = bool1;
          } 
          m += n;
          if (!bool && this.w) {
            int i1 = h80.g;
            n = paramn80.h;
            paramn80.e -= i1 * n;
          } else {
            int i1 = h80.g;
            n = paramn80.h;
            paramn80.e += i1 * n;
          } 
          k -= h80.g;
        } 
      } 
    } 
    int i = paramn80.a - m;
    paramn80.a = i;
    k = paramn80.f;
    if (k != Integer.MIN_VALUE) {
      k += m;
      paramn80.f = k;
      if (i < 0)
        paramn80.f = k + i; 
      g1(paramyd1, paramn80);
    } 
    return j - paramn80.a;
  }
  
  public final View W0(int paramInt) {
    View view = b1(0, G(), paramInt);
    if (view != null) {
      paramInt = a.R(view);
      paramInt = ((int[])this.z.c)[paramInt];
      if (paramInt != -1)
        return X0(view, this.y.get(paramInt)); 
    } 
    return null;
  }
  
  public final View X0(View paramView, h80 paramh80) {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual j : ()Z
    //   4: istore #5
    //   6: aload_2
    //   7: getfield h : I
    //   10: istore #4
    //   12: iconst_1
    //   13: istore_3
    //   14: aload_1
    //   15: astore_2
    //   16: iload_3
    //   17: iload #4
    //   19: if_icmpge -> 121
    //   22: aload_0
    //   23: iload_3
    //   24: invokevirtual F : (I)Landroid/view/View;
    //   27: astore #6
    //   29: aload_2
    //   30: astore_1
    //   31: aload #6
    //   33: ifnull -> 113
    //   36: aload #6
    //   38: invokevirtual getVisibility : ()I
    //   41: bipush #8
    //   43: if_icmpne -> 51
    //   46: aload_2
    //   47: astore_1
    //   48: goto -> 113
    //   51: aload_0
    //   52: getfield w : Z
    //   55: ifeq -> 88
    //   58: iload #5
    //   60: ifne -> 88
    //   63: aload_2
    //   64: astore_1
    //   65: aload_0
    //   66: getfield E : Lf51;
    //   69: aload_2
    //   70: invokevirtual d : (Landroid/view/View;)I
    //   73: aload_0
    //   74: getfield E : Lf51;
    //   77: aload #6
    //   79: invokevirtual d : (Landroid/view/View;)I
    //   82: if_icmpge -> 113
    //   85: goto -> 110
    //   88: aload_2
    //   89: astore_1
    //   90: aload_0
    //   91: getfield E : Lf51;
    //   94: aload_2
    //   95: invokevirtual g : (Landroid/view/View;)I
    //   98: aload_0
    //   99: getfield E : Lf51;
    //   102: aload #6
    //   104: invokevirtual g : (Landroid/view/View;)I
    //   107: if_icmple -> 113
    //   110: aload #6
    //   112: astore_1
    //   113: iinc #3, 1
    //   116: aload_1
    //   117: astore_2
    //   118: goto -> 16
    //   121: aload_2
    //   122: areturn
  }
  
  public final View Y0(int paramInt) {
    View view = b1(G() - 1, -1, paramInt);
    if (view == null)
      return null; 
    paramInt = a.R(view);
    paramInt = ((int[])this.z.c)[paramInt];
    return Z0(view, this.y.get(paramInt));
  }
  
  public final View Z0(View paramView, h80 paramh80) {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual j : ()Z
    //   4: istore #6
    //   6: aload_0
    //   7: invokevirtual G : ()I
    //   10: iconst_2
    //   11: isub
    //   12: istore_3
    //   13: aload_0
    //   14: invokevirtual G : ()I
    //   17: istore #4
    //   19: aload_2
    //   20: getfield h : I
    //   23: istore #5
    //   25: aload_1
    //   26: astore_2
    //   27: iload_3
    //   28: iload #4
    //   30: iload #5
    //   32: isub
    //   33: iconst_1
    //   34: isub
    //   35: if_icmple -> 137
    //   38: aload_0
    //   39: iload_3
    //   40: invokevirtual F : (I)Landroid/view/View;
    //   43: astore #7
    //   45: aload_2
    //   46: astore_1
    //   47: aload #7
    //   49: ifnull -> 129
    //   52: aload #7
    //   54: invokevirtual getVisibility : ()I
    //   57: bipush #8
    //   59: if_icmpne -> 67
    //   62: aload_2
    //   63: astore_1
    //   64: goto -> 129
    //   67: aload_0
    //   68: getfield w : Z
    //   71: ifeq -> 104
    //   74: iload #6
    //   76: ifne -> 104
    //   79: aload_2
    //   80: astore_1
    //   81: aload_0
    //   82: getfield E : Lf51;
    //   85: aload_2
    //   86: invokevirtual g : (Landroid/view/View;)I
    //   89: aload_0
    //   90: getfield E : Lf51;
    //   93: aload #7
    //   95: invokevirtual g : (Landroid/view/View;)I
    //   98: if_icmple -> 129
    //   101: goto -> 126
    //   104: aload_2
    //   105: astore_1
    //   106: aload_0
    //   107: getfield E : Lf51;
    //   110: aload_2
    //   111: invokevirtual d : (Landroid/view/View;)I
    //   114: aload_0
    //   115: getfield E : Lf51;
    //   118: aload #7
    //   120: invokevirtual d : (Landroid/view/View;)I
    //   123: if_icmpge -> 129
    //   126: aload #7
    //   128: astore_1
    //   129: iinc #3, -1
    //   132: aload_1
    //   133: astore_2
    //   134: goto -> 27
    //   137: aload_2
    //   138: areturn
  }
  
  public final void a(View paramView, int paramInt1, int paramInt2, h80 paramh80) {
    n(paramView, Q);
    if (j()) {
      paramInt1 = ((sd1)paramView.getLayoutParams()).c.left + ((sd1)paramView.getLayoutParams()).c.right;
      paramh80.e += paramInt1;
      paramh80.f += paramInt1;
      return;
    } 
    paramInt1 = ((sd1)paramView.getLayoutParams()).c.top + ((sd1)paramView.getLayoutParams()).c.bottom;
    paramh80.e += paramInt1;
    paramh80.f += paramInt1;
  }
  
  public final View a1(int paramInt1, int paramInt2) {
    byte b;
    if (paramInt2 > paramInt1) {
      b = 1;
    } else {
      b = -1;
    } 
    while (paramInt1 != paramInt2) {
      View view = F(paramInt1);
      int i8 = getPaddingLeft();
      int m = getPaddingTop();
      int i5 = this.p;
      int i4 = getPaddingRight();
      int i3 = this.q;
      int i2 = getPaddingBottom();
      sd1 sd1 = (sd1)view.getLayoutParams();
      int i = a.L(view);
      int i6 = ((ViewGroup.MarginLayoutParams)sd1).leftMargin;
      sd1 = (sd1)view.getLayoutParams();
      int i1 = a.P(view);
      int n = ((ViewGroup.MarginLayoutParams)sd1).topMargin;
      sd1 = (sd1)view.getLayoutParams();
      int i9 = a.O(view);
      int i7 = ((ViewGroup.MarginLayoutParams)sd1).rightMargin;
      sd1 = (sd1)view.getLayoutParams();
      int k = a.J(view);
      int j = ((ViewGroup.MarginLayoutParams)sd1).bottomMargin;
      boolean bool = false;
      if (i - i6 >= i5 - i4 || i9 + i7 >= i8) {
        i = 1;
      } else {
        i = 0;
      } 
      if (i1 - n >= i3 - i2 || k + j >= m)
        bool = true; 
      if (i != 0 && bool)
        return view; 
      paramInt1 += b;
    } 
    return null;
  }
  
  public final View b(int paramInt) {
    View view = (View)this.L.get(paramInt);
    return (view != null) ? view : this.A.d(paramInt);
  }
  
  public final View b1(int paramInt1, int paramInt2, int paramInt3) {
    U0();
    n80 n801 = this.C;
    byte b = 1;
    if (n801 == null) {
      Object object = new Object();
      ((n80)object).h = 1;
      this.C = (n80)object;
    } 
    int j = this.E.m();
    int i = this.E.i();
    if (paramInt2 <= paramInt1)
      b = -1; 
    View view = null;
    for (n801 = null; paramInt1 != paramInt2; n801 = n802) {
      View view1;
      n80 n802;
      View view2 = F(paramInt1);
      if (view2 == null) {
        view1 = view;
        n802 = n801;
      } else {
        int k = a.R(view2);
        view1 = view;
        n802 = n801;
        if (k >= 0) {
          view1 = view;
          n802 = n801;
          if (k < paramInt3)
            if (((sd1)view2.getLayoutParams()).b.j()) {
              view1 = view;
              n802 = n801;
              if (n801 == null) {
                View view3 = view2;
                view1 = view;
              } 
            } else if (this.E.g(view2) < j || this.E.d(view2) > i) {
              view1 = view;
              n802 = n801;
              if (view == null) {
                view1 = view2;
                n802 = n801;
              } 
            } else {
              return view2;
            }  
        } 
      } 
      paramInt1 += b;
      view = view1;
    } 
    return (View)((view != null) ? view : n801);
  }
  
  public final int c(View paramView, int paramInt1, int paramInt2) {
    if (j()) {
      paramInt2 = ((sd1)paramView.getLayoutParams()).c.left;
      paramInt1 = ((sd1)paramView.getLayoutParams()).c.right;
      return paramInt2 + paramInt1;
    } 
    paramInt2 = ((sd1)paramView.getLayoutParams()).c.top;
    paramInt1 = ((sd1)paramView.getLayoutParams()).c.bottom;
    return paramInt2 + paramInt1;
  }
  
  public final void c0() {
    w0();
  }
  
  public final int c1(int paramInt, yd1 paramyd1, de1 paramde1, boolean paramBoolean) {
    int i;
    if (!j() && this.w) {
      i = paramInt - this.E.m();
      if (i > 0) {
        i = e1(i, paramyd1, paramde1);
      } else {
        return 0;
      } 
    } else {
      i = this.E.i() - paramInt;
      if (i > 0) {
        i = -e1(-i, paramyd1, paramde1);
      } else {
        return 0;
      } 
    } 
    if (paramBoolean) {
      paramInt = this.E.i() - paramInt + i;
      if (paramInt > 0) {
        this.E.r(paramInt);
        return paramInt + i;
      } 
    } 
    return i;
  }
  
  public final int d(int paramInt1, int paramInt2, int paramInt3) {
    int i = this.q;
    paramInt1 = this.o;
    return a.H(p(), i, paramInt1, paramInt2, paramInt3);
  }
  
  public final void d0(RecyclerView paramRecyclerView) {
    this.N = (View)paramRecyclerView.getParent();
  }
  
  public final int d1(int paramInt, yd1 paramyd1, de1 paramde1, boolean paramBoolean) {
    int i;
    if (!j() && this.w) {
      i = this.E.i() - paramInt;
      if (i > 0) {
        i = e1(-i, paramyd1, paramde1);
      } else {
        return 0;
      } 
    } else {
      i = paramInt - this.E.m();
      if (i > 0) {
        i = -e1(i, paramyd1, paramde1);
      } else {
        return 0;
      } 
    } 
    int j = i;
    if (paramBoolean) {
      paramInt = paramInt + i - this.E.m();
      j = i;
      if (paramInt > 0) {
        this.E.r(-paramInt);
        j = i - paramInt;
      } 
    } 
    return j;
  }
  
  public final PointF e(int paramInt) {
    if (G() != 0) {
      View view = F(0);
      if (view != null) {
        if (paramInt < a.R(view)) {
          paramInt = -1;
        } else {
          paramInt = 1;
        } 
        return j() ? new PointF(0.0F, paramInt) : new PointF(paramInt, 0.0F);
      } 
    } 
    return null;
  }
  
  public final void e0(RecyclerView paramRecyclerView) {}
  
  public final int e1(int paramInt, yd1 paramyd1, de1 paramde1) {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual G : ()I
    //   4: ifeq -> 1000
    //   7: iload_1
    //   8: ifne -> 14
    //   11: goto -> 1000
    //   14: aload_0
    //   15: invokevirtual U0 : ()V
    //   18: aload_0
    //   19: getfield C : Ln80;
    //   22: iconst_1
    //   23: putfield i : Z
    //   26: aload_0
    //   27: invokevirtual j : ()Z
    //   30: ifne -> 46
    //   33: aload_0
    //   34: getfield w : Z
    //   37: ifeq -> 46
    //   40: iconst_1
    //   41: istore #4
    //   43: goto -> 49
    //   46: iconst_0
    //   47: istore #4
    //   49: iload #4
    //   51: ifeq -> 70
    //   54: iload_1
    //   55: ifge -> 64
    //   58: iconst_1
    //   59: istore #5
    //   61: goto -> 77
    //   64: iconst_m1
    //   65: istore #5
    //   67: goto -> 77
    //   70: iload_1
    //   71: ifle -> 64
    //   74: goto -> 58
    //   77: iload_1
    //   78: invokestatic abs : (I)I
    //   81: istore #9
    //   83: aload_0
    //   84: getfield C : Ln80;
    //   87: iload #5
    //   89: putfield h : I
    //   92: aload_0
    //   93: invokevirtual j : ()Z
    //   96: istore #12
    //   98: aload_0
    //   99: getfield p : I
    //   102: aload_0
    //   103: getfield n : I
    //   106: invokestatic makeMeasureSpec : (II)I
    //   109: istore #7
    //   111: aload_0
    //   112: getfield q : I
    //   115: aload_0
    //   116: getfield o : I
    //   119: invokestatic makeMeasureSpec : (II)I
    //   122: istore #8
    //   124: iload #12
    //   126: ifne -> 142
    //   129: aload_0
    //   130: getfield w : Z
    //   133: ifeq -> 142
    //   136: iconst_1
    //   137: istore #6
    //   139: goto -> 145
    //   142: iconst_0
    //   143: istore #6
    //   145: aload_0
    //   146: getfield z : Lcn;
    //   149: astore #13
    //   151: iload #5
    //   153: iconst_1
    //   154: if_icmpne -> 590
    //   157: aload_0
    //   158: aload_0
    //   159: invokevirtual G : ()I
    //   162: iconst_1
    //   163: isub
    //   164: invokevirtual F : (I)Landroid/view/View;
    //   167: astore #14
    //   169: aload #14
    //   171: ifnonnull -> 177
    //   174: goto -> 909
    //   177: aload_0
    //   178: getfield C : Ln80;
    //   181: aload_0
    //   182: getfield E : Lf51;
    //   185: aload #14
    //   187: invokevirtual d : (Landroid/view/View;)I
    //   190: putfield e : I
    //   193: aload #14
    //   195: invokestatic R : (Landroid/view/View;)I
    //   198: istore #11
    //   200: aload #13
    //   202: getfield c : Ljava/lang/Object;
    //   205: checkcast [I
    //   208: iload #11
    //   210: iaload
    //   211: istore #10
    //   213: aload_0
    //   214: aload #14
    //   216: aload_0
    //   217: getfield y : Ljava/util/List;
    //   220: iload #10
    //   222: invokeinterface get : (I)Ljava/lang/Object;
    //   227: checkcast h80
    //   230: invokevirtual Z0 : (Landroid/view/View;Lh80;)Landroid/view/View;
    //   233: astore #14
    //   235: aload_0
    //   236: getfield C : Ln80;
    //   239: astore #15
    //   241: aload #15
    //   243: invokevirtual getClass : ()Ljava/lang/Class;
    //   246: pop
    //   247: iload #11
    //   249: iconst_1
    //   250: iadd
    //   251: istore #10
    //   253: aload #15
    //   255: iload #10
    //   257: putfield d : I
    //   260: aload #13
    //   262: getfield c : Ljava/lang/Object;
    //   265: checkcast [I
    //   268: astore #16
    //   270: aload #16
    //   272: arraylength
    //   273: iload #10
    //   275: if_icmpgt -> 287
    //   278: aload #15
    //   280: iconst_m1
    //   281: putfield c : I
    //   284: goto -> 297
    //   287: aload #15
    //   289: aload #16
    //   291: iload #10
    //   293: iaload
    //   294: putfield c : I
    //   297: aload_0
    //   298: getfield E : Lf51;
    //   301: astore #16
    //   303: iload #6
    //   305: ifeq -> 376
    //   308: aload #15
    //   310: aload #16
    //   312: aload #14
    //   314: invokevirtual g : (Landroid/view/View;)I
    //   317: putfield e : I
    //   320: aload_0
    //   321: getfield C : Ln80;
    //   324: astore #15
    //   326: aload_0
    //   327: getfield E : Lf51;
    //   330: aload #14
    //   332: invokevirtual g : (Landroid/view/View;)I
    //   335: ineg
    //   336: istore #6
    //   338: aload #15
    //   340: aload_0
    //   341: getfield E : Lf51;
    //   344: invokevirtual m : ()I
    //   347: iload #6
    //   349: iadd
    //   350: putfield f : I
    //   353: aload_0
    //   354: getfield C : Ln80;
    //   357: astore #14
    //   359: aload #14
    //   361: aload #14
    //   363: getfield f : I
    //   366: iconst_0
    //   367: invokestatic max : (II)I
    //   370: putfield f : I
    //   373: goto -> 412
    //   376: aload #15
    //   378: aload #16
    //   380: aload #14
    //   382: invokevirtual d : (Landroid/view/View;)I
    //   385: putfield e : I
    //   388: aload_0
    //   389: getfield C : Ln80;
    //   392: aload_0
    //   393: getfield E : Lf51;
    //   396: aload #14
    //   398: invokevirtual d : (Landroid/view/View;)I
    //   401: aload_0
    //   402: getfield E : Lf51;
    //   405: invokevirtual i : ()I
    //   408: isub
    //   409: putfield f : I
    //   412: aload_0
    //   413: getfield C : Ln80;
    //   416: getfield c : I
    //   419: istore #6
    //   421: iload #6
    //   423: iconst_m1
    //   424: if_icmpeq -> 443
    //   427: iload #6
    //   429: aload_0
    //   430: getfield y : Ljava/util/List;
    //   433: invokeinterface size : ()I
    //   438: iconst_1
    //   439: isub
    //   440: if_icmple -> 890
    //   443: aload_0
    //   444: getfield C : Ln80;
    //   447: getfield d : I
    //   450: aload_0
    //   451: getfield B : Lde1;
    //   454: invokevirtual b : ()I
    //   457: if_icmpgt -> 890
    //   460: aload_0
    //   461: getfield C : Ln80;
    //   464: astore #16
    //   466: iload #9
    //   468: aload #16
    //   470: getfield f : I
    //   473: isub
    //   474: istore #6
    //   476: aload_0
    //   477: getfield P : Li80;
    //   480: astore #15
    //   482: aload #15
    //   484: aconst_null
    //   485: putfield b : Ljava/util/List;
    //   488: aload #15
    //   490: iconst_0
    //   491: putfield a : I
    //   494: iload #6
    //   496: ifle -> 890
    //   499: aload_0
    //   500: getfield z : Lcn;
    //   503: astore #14
    //   505: iload #12
    //   507: ifeq -> 536
    //   510: aload #14
    //   512: aload #15
    //   514: iload #7
    //   516: iload #8
    //   518: iload #6
    //   520: aload #16
    //   522: getfield d : I
    //   525: iconst_m1
    //   526: aload_0
    //   527: getfield y : Ljava/util/List;
    //   530: invokevirtual b : (Li80;IIIIILjava/util/List;)V
    //   533: goto -> 559
    //   536: aload #14
    //   538: aload #15
    //   540: iload #8
    //   542: iload #7
    //   544: iload #6
    //   546: aload #16
    //   548: getfield d : I
    //   551: iconst_m1
    //   552: aload_0
    //   553: getfield y : Ljava/util/List;
    //   556: invokevirtual b : (Li80;IIIIILjava/util/List;)V
    //   559: aload #13
    //   561: iload #7
    //   563: iload #8
    //   565: aload_0
    //   566: getfield C : Ln80;
    //   569: getfield d : I
    //   572: invokevirtual h : (III)V
    //   575: aload #13
    //   577: aload_0
    //   578: getfield C : Ln80;
    //   581: getfield d : I
    //   584: invokevirtual B : (I)V
    //   587: goto -> 890
    //   590: aload_0
    //   591: iconst_0
    //   592: invokevirtual F : (I)Landroid/view/View;
    //   595: astore #14
    //   597: aload #14
    //   599: ifnonnull -> 605
    //   602: goto -> 909
    //   605: aload_0
    //   606: getfield C : Ln80;
    //   609: aload_0
    //   610: getfield E : Lf51;
    //   613: aload #14
    //   615: invokevirtual g : (Landroid/view/View;)I
    //   618: putfield e : I
    //   621: aload #14
    //   623: invokestatic R : (Landroid/view/View;)I
    //   626: istore #10
    //   628: aload #13
    //   630: getfield c : Ljava/lang/Object;
    //   633: checkcast [I
    //   636: iload #10
    //   638: iaload
    //   639: istore #7
    //   641: aload_0
    //   642: aload #14
    //   644: aload_0
    //   645: getfield y : Ljava/util/List;
    //   648: iload #7
    //   650: invokeinterface get : (I)Ljava/lang/Object;
    //   655: checkcast h80
    //   658: invokevirtual X0 : (Landroid/view/View;Lh80;)Landroid/view/View;
    //   661: astore #14
    //   663: aload_0
    //   664: getfield C : Ln80;
    //   667: astore #15
    //   669: aload #15
    //   671: invokevirtual getClass : ()Ljava/lang/Class;
    //   674: pop
    //   675: aload #13
    //   677: getfield c : Ljava/lang/Object;
    //   680: checkcast [I
    //   683: iload #10
    //   685: iaload
    //   686: istore #8
    //   688: iload #8
    //   690: istore #7
    //   692: iload #8
    //   694: iconst_m1
    //   695: if_icmpne -> 701
    //   698: iconst_0
    //   699: istore #7
    //   701: iload #7
    //   703: ifle -> 742
    //   706: aload_0
    //   707: getfield y : Ljava/util/List;
    //   710: iload #7
    //   712: iconst_1
    //   713: isub
    //   714: invokeinterface get : (I)Ljava/lang/Object;
    //   719: checkcast h80
    //   722: astore #13
    //   724: aload_0
    //   725: getfield C : Ln80;
    //   728: iload #10
    //   730: aload #13
    //   732: getfield h : I
    //   735: isub
    //   736: putfield d : I
    //   739: goto -> 748
    //   742: aload #15
    //   744: iconst_m1
    //   745: putfield d : I
    //   748: aload_0
    //   749: getfield C : Ln80;
    //   752: astore #13
    //   754: iload #7
    //   756: ifle -> 765
    //   759: iinc #7, -1
    //   762: goto -> 768
    //   765: iconst_0
    //   766: istore #7
    //   768: aload #13
    //   770: iload #7
    //   772: putfield c : I
    //   775: aload_0
    //   776: getfield E : Lf51;
    //   779: astore #15
    //   781: iload #6
    //   783: ifeq -> 845
    //   786: aload #13
    //   788: aload #15
    //   790: aload #14
    //   792: invokevirtual d : (Landroid/view/View;)I
    //   795: putfield e : I
    //   798: aload_0
    //   799: getfield C : Ln80;
    //   802: aload_0
    //   803: getfield E : Lf51;
    //   806: aload #14
    //   808: invokevirtual d : (Landroid/view/View;)I
    //   811: aload_0
    //   812: getfield E : Lf51;
    //   815: invokevirtual i : ()I
    //   818: isub
    //   819: putfield f : I
    //   822: aload_0
    //   823: getfield C : Ln80;
    //   826: astore #13
    //   828: aload #13
    //   830: aload #13
    //   832: getfield f : I
    //   835: iconst_0
    //   836: invokestatic max : (II)I
    //   839: putfield f : I
    //   842: goto -> 890
    //   845: aload #13
    //   847: aload #15
    //   849: aload #14
    //   851: invokevirtual g : (Landroid/view/View;)I
    //   854: putfield e : I
    //   857: aload_0
    //   858: getfield C : Ln80;
    //   861: astore #13
    //   863: aload_0
    //   864: getfield E : Lf51;
    //   867: aload #14
    //   869: invokevirtual g : (Landroid/view/View;)I
    //   872: ineg
    //   873: istore #6
    //   875: aload #13
    //   877: aload_0
    //   878: getfield E : Lf51;
    //   881: invokevirtual m : ()I
    //   884: iload #6
    //   886: iadd
    //   887: putfield f : I
    //   890: aload_0
    //   891: getfield C : Ln80;
    //   894: astore #13
    //   896: aload #13
    //   898: iload #9
    //   900: aload #13
    //   902: getfield f : I
    //   905: isub
    //   906: putfield a : I
    //   909: aload_0
    //   910: getfield C : Ln80;
    //   913: astore #13
    //   915: aload #13
    //   917: getfield f : I
    //   920: istore #6
    //   922: aload_0
    //   923: aload_2
    //   924: aload_3
    //   925: aload #13
    //   927: invokevirtual V0 : (Lyd1;Lde1;Ln80;)I
    //   930: iload #6
    //   932: iadd
    //   933: istore #6
    //   935: iload #6
    //   937: ifge -> 943
    //   940: goto -> 1000
    //   943: iload #4
    //   945: ifeq -> 968
    //   948: iload #9
    //   950: iload #6
    //   952: if_icmple -> 965
    //   955: iload #5
    //   957: ineg
    //   958: iload #6
    //   960: imul
    //   961: istore_1
    //   962: goto -> 981
    //   965: goto -> 981
    //   968: iload #9
    //   970: iload #6
    //   972: if_icmple -> 965
    //   975: iload #5
    //   977: iload #6
    //   979: imul
    //   980: istore_1
    //   981: aload_0
    //   982: getfield E : Lf51;
    //   985: iload_1
    //   986: ineg
    //   987: invokevirtual r : (I)V
    //   990: aload_0
    //   991: getfield C : Ln80;
    //   994: iload_1
    //   995: putfield g : I
    //   998: iload_1
    //   999: ireturn
    //   1000: iconst_0
    //   1001: ireturn
  }
  
  public final void f(h80 paramh80) {}
  
  public final int f1(int paramInt) {
    int i;
    int j;
    if (G() == 0 || paramInt == 0)
      return 0; 
    U0();
    boolean bool = j();
    View view = this.N;
    if (bool) {
      i = view.getWidth();
    } else {
      i = view.getHeight();
    } 
    if (bool) {
      j = this.p;
    } else {
      j = this.q;
    } 
    int k = this.c.getLayoutDirection();
    l80 l801 = this.D;
    if (k == 1) {
      k = Math.abs(paramInt);
      if (paramInt < 0)
        return -Math.min(j + l801.d - i, k); 
      i = l801.d;
      if (i + paramInt > 0)
        return -i; 
    } else {
      if (paramInt > 0)
        return Math.min(j - l801.d - i, paramInt); 
      i = l801.d;
      if (i + paramInt < 0)
        return -i; 
    } 
    return paramInt;
  }
  
  public final View g(int paramInt) {
    return b(paramInt);
  }
  
  public final void g1(yd1 paramyd1, n80 paramn80) {
    // Byte code:
    //   0: aload_2
    //   1: getfield i : Z
    //   4: ifne -> 10
    //   7: goto -> 600
    //   10: aload_2
    //   11: getfield h : I
    //   14: istore_3
    //   15: aload_2
    //   16: getfield f : I
    //   19: istore #5
    //   21: aload_0
    //   22: getfield z : Lcn;
    //   25: astore #10
    //   27: iconst_m1
    //   28: istore #4
    //   30: iload_3
    //   31: iconst_m1
    //   32: if_icmpne -> 331
    //   35: iload #5
    //   37: ifge -> 43
    //   40: goto -> 600
    //   43: aload_0
    //   44: invokevirtual G : ()I
    //   47: istore #4
    //   49: iload #4
    //   51: ifne -> 57
    //   54: goto -> 600
    //   57: iload #4
    //   59: iconst_1
    //   60: isub
    //   61: istore #5
    //   63: aload_0
    //   64: iload #5
    //   66: invokevirtual F : (I)Landroid/view/View;
    //   69: astore #11
    //   71: aload #11
    //   73: ifnonnull -> 79
    //   76: goto -> 600
    //   79: aload #10
    //   81: getfield c : Ljava/lang/Object;
    //   84: checkcast [I
    //   87: aload #11
    //   89: invokestatic R : (Landroid/view/View;)I
    //   92: iaload
    //   93: istore #6
    //   95: iload #6
    //   97: iconst_m1
    //   98: if_icmpne -> 104
    //   101: goto -> 600
    //   104: aload_0
    //   105: getfield y : Ljava/util/List;
    //   108: iload #6
    //   110: invokeinterface get : (I)Ljava/lang/Object;
    //   115: checkcast h80
    //   118: astore #11
    //   120: iload #5
    //   122: istore_3
    //   123: iload #4
    //   125: istore #7
    //   127: iload #5
    //   129: istore #8
    //   131: iload_3
    //   132: iflt -> 311
    //   135: aload_0
    //   136: iload_3
    //   137: invokevirtual F : (I)Landroid/view/View;
    //   140: astore #12
    //   142: aload #12
    //   144: ifnonnull -> 158
    //   147: iload #6
    //   149: istore #7
    //   151: aload #11
    //   153: astore #10
    //   155: goto -> 297
    //   158: aload_2
    //   159: getfield f : I
    //   162: istore #9
    //   164: aload_0
    //   165: invokevirtual j : ()Z
    //   168: ifne -> 203
    //   171: aload_0
    //   172: getfield w : Z
    //   175: ifeq -> 203
    //   178: iload #4
    //   180: istore #7
    //   182: iload #5
    //   184: istore #8
    //   186: aload_0
    //   187: getfield E : Lf51;
    //   190: aload #12
    //   192: invokevirtual d : (Landroid/view/View;)I
    //   195: iload #9
    //   197: if_icmpgt -> 311
    //   200: goto -> 233
    //   203: iload #4
    //   205: istore #7
    //   207: iload #5
    //   209: istore #8
    //   211: aload_0
    //   212: getfield E : Lf51;
    //   215: aload #12
    //   217: invokevirtual g : (Landroid/view/View;)I
    //   220: aload_0
    //   221: getfield E : Lf51;
    //   224: invokevirtual h : ()I
    //   227: iload #9
    //   229: isub
    //   230: if_icmplt -> 311
    //   233: iload #6
    //   235: istore #7
    //   237: aload #11
    //   239: astore #10
    //   241: aload #11
    //   243: getfield o : I
    //   246: aload #12
    //   248: invokestatic R : (Landroid/view/View;)I
    //   251: if_icmpne -> 297
    //   254: iload #6
    //   256: ifgt -> 269
    //   259: iload_3
    //   260: istore #7
    //   262: iload #5
    //   264: istore #8
    //   266: goto -> 311
    //   269: iload #6
    //   271: aload_2
    //   272: getfield h : I
    //   275: iadd
    //   276: istore #7
    //   278: aload_0
    //   279: getfield y : Ljava/util/List;
    //   282: iload #7
    //   284: invokeinterface get : (I)Ljava/lang/Object;
    //   289: checkcast h80
    //   292: astore #10
    //   294: iload_3
    //   295: istore #4
    //   297: iinc #3, -1
    //   300: iload #7
    //   302: istore #6
    //   304: aload #10
    //   306: astore #11
    //   308: goto -> 123
    //   311: iload #8
    //   313: iload #7
    //   315: if_icmplt -> 600
    //   318: aload_0
    //   319: iload #8
    //   321: aload_1
    //   322: invokevirtual A0 : (ILyd1;)V
    //   325: iinc #8, -1
    //   328: goto -> 311
    //   331: iload #5
    //   333: ifge -> 339
    //   336: goto -> 600
    //   339: aload_0
    //   340: invokevirtual G : ()I
    //   343: istore #7
    //   345: iload #7
    //   347: ifne -> 353
    //   350: goto -> 600
    //   353: iconst_0
    //   354: istore_3
    //   355: aload_0
    //   356: iconst_0
    //   357: invokevirtual F : (I)Landroid/view/View;
    //   360: astore #11
    //   362: aload #11
    //   364: ifnonnull -> 370
    //   367: goto -> 600
    //   370: aload #10
    //   372: getfield c : Ljava/lang/Object;
    //   375: checkcast [I
    //   378: aload #11
    //   380: invokestatic R : (Landroid/view/View;)I
    //   383: iaload
    //   384: istore #5
    //   386: iload #5
    //   388: iconst_m1
    //   389: if_icmpne -> 395
    //   392: goto -> 600
    //   395: aload_0
    //   396: getfield y : Ljava/util/List;
    //   399: iload #5
    //   401: invokeinterface get : (I)Ljava/lang/Object;
    //   406: checkcast h80
    //   409: astore #10
    //   411: iload_3
    //   412: iload #7
    //   414: if_icmpge -> 581
    //   417: aload_0
    //   418: iload_3
    //   419: invokevirtual F : (I)Landroid/view/View;
    //   422: astore #12
    //   424: aload #12
    //   426: ifnonnull -> 440
    //   429: iload #5
    //   431: istore #6
    //   433: aload #10
    //   435: astore #11
    //   437: goto -> 567
    //   440: aload_2
    //   441: getfield f : I
    //   444: istore #6
    //   446: aload_0
    //   447: invokevirtual j : ()Z
    //   450: ifne -> 485
    //   453: aload_0
    //   454: getfield w : Z
    //   457: ifeq -> 485
    //   460: aload_0
    //   461: getfield E : Lf51;
    //   464: invokevirtual h : ()I
    //   467: aload_0
    //   468: getfield E : Lf51;
    //   471: aload #12
    //   473: invokevirtual g : (Landroid/view/View;)I
    //   476: isub
    //   477: iload #6
    //   479: if_icmpgt -> 581
    //   482: goto -> 499
    //   485: aload_0
    //   486: getfield E : Lf51;
    //   489: aload #12
    //   491: invokevirtual d : (Landroid/view/View;)I
    //   494: iload #6
    //   496: if_icmpgt -> 581
    //   499: iload #5
    //   501: istore #6
    //   503: aload #10
    //   505: astore #11
    //   507: aload #10
    //   509: getfield p : I
    //   512: aload #12
    //   514: invokestatic R : (Landroid/view/View;)I
    //   517: if_icmpne -> 567
    //   520: iload #5
    //   522: aload_0
    //   523: getfield y : Ljava/util/List;
    //   526: invokeinterface size : ()I
    //   531: iconst_1
    //   532: isub
    //   533: if_icmplt -> 539
    //   536: goto -> 584
    //   539: iload #5
    //   541: aload_2
    //   542: getfield h : I
    //   545: iadd
    //   546: istore #6
    //   548: aload_0
    //   549: getfield y : Ljava/util/List;
    //   552: iload #6
    //   554: invokeinterface get : (I)Ljava/lang/Object;
    //   559: checkcast h80
    //   562: astore #11
    //   564: iload_3
    //   565: istore #4
    //   567: iinc #3, 1
    //   570: iload #6
    //   572: istore #5
    //   574: aload #11
    //   576: astore #10
    //   578: goto -> 411
    //   581: iload #4
    //   583: istore_3
    //   584: iload_3
    //   585: iflt -> 600
    //   588: aload_0
    //   589: iload_3
    //   590: aload_1
    //   591: invokevirtual A0 : (ILyd1;)V
    //   594: iinc #3, -1
    //   597: goto -> 584
    //   600: return
  }
  
  public final int getAlignContent() {
    return 5;
  }
  
  public final int getAlignItems() {
    return this.u;
  }
  
  public final int getFlexDirection() {
    return this.r;
  }
  
  public final int getFlexItemCount() {
    return this.B.b();
  }
  
  public final List getFlexLinesInternal() {
    return this.y;
  }
  
  public final int getFlexWrap() {
    return this.s;
  }
  
  public final int getLargestMainSize() {
    int i = this.y.size();
    byte b = 0;
    if (i == 0)
      return 0; 
    int j = this.y.size();
    i = Integer.MIN_VALUE;
    while (b < j) {
      i = Math.max(i, ((h80)this.y.get(b)).e);
      b++;
    } 
    return i;
  }
  
  public final int getMaxLine() {
    return this.v;
  }
  
  public final int getSumOfCrossSize() {
    int j = this.y.size();
    byte b = 0;
    int i = 0;
    while (b < j) {
      i += ((h80)this.y.get(b)).g;
      b++;
    } 
    return i;
  }
  
  public final void h(View paramView, int paramInt) {
    this.L.put(paramInt, paramView);
  }
  
  public final void h1(int paramInt) {
    int i = this.u;
    if (i != paramInt) {
      if (i == 4 || paramInt == 4) {
        w0();
        this.y.clear();
        l80 l801 = this.D;
        l80.b(l801);
        l801.d = 0;
      } 
      this.u = paramInt;
      C0();
    } 
  }
  
  public final int i(int paramInt1, int paramInt2, int paramInt3) {
    paramInt1 = this.p;
    int i = this.n;
    return a.H(o(), paramInt1, i, paramInt2, paramInt3);
  }
  
  public final void i1(int paramInt) {
    if (this.r != paramInt) {
      w0();
      this.r = paramInt;
      this.E = null;
      this.F = null;
      this.y.clear();
      l80 l801 = this.D;
      l80.b(l801);
      l801.d = 0;
      C0();
    } 
  }
  
  public final boolean j() {
    int i = this.r;
    return (i == 0 || i == 1);
  }
  
  public final void j1(int paramInt) {
    paramInt = this.s;
    if (paramInt != 1) {
      if (paramInt == 0) {
        w0();
        this.y.clear();
        l80 l801 = this.D;
        l80.b(l801);
        l801.d = 0;
      } 
      this.s = 1;
      this.E = null;
      this.F = null;
      C0();
    } 
  }
  
  public final int k(View paramView) {
    if (j()) {
      int k = ((sd1)paramView.getLayoutParams()).c.top;
      int m = ((sd1)paramView.getLayoutParams()).c.bottom;
      return k + m;
    } 
    int i = ((sd1)paramView.getLayoutParams()).c.left;
    int j = ((sd1)paramView.getLayoutParams()).c.right;
    return i + j;
  }
  
  public final void k0(int paramInt1, int paramInt2) {
    l1(paramInt1);
  }
  
  public final boolean k1(View paramView, int paramInt1, int paramInt2, m80 paramm80) {
    return (paramView.isLayoutRequested() || !this.j || !X(paramView.getWidth(), paramInt1, ((ViewGroup.MarginLayoutParams)paramm80).width) || !X(paramView.getHeight(), paramInt2, ((ViewGroup.MarginLayoutParams)paramm80).height));
  }
  
  public final void l1(int paramInt) {
    int j = G();
    int i = -1;
    View view = a1(j - 1, -1);
    if (view != null)
      i = a.R(view); 
    if (paramInt < i) {
      i = G();
      cn cn1 = this.z;
      cn1.j(i);
      cn1.k(i);
      cn1.i(i);
      if (paramInt < ((int[])cn1.c).length) {
        this.O = paramInt;
        View view1 = F(0);
        if (view1 != null) {
          this.H = a.R(view1);
          if (!j() && this.w) {
            paramInt = this.E.d(view1);
            this.I = this.E.j() + paramInt;
            return;
          } 
          this.I = this.E.g(view1) - this.E.m();
          return;
        } 
      } 
    } 
  }
  
  public final void m0(int paramInt1, int paramInt2) {
    l1(Math.min(paramInt1, paramInt2));
  }
  
  public final void m1(l80 paraml80, boolean paramBoolean1, boolean paramBoolean2) {
    // Byte code:
    //   0: iconst_0
    //   1: istore #5
    //   3: iload_3
    //   4: ifeq -> 61
    //   7: aload_0
    //   8: invokevirtual j : ()Z
    //   11: ifeq -> 23
    //   14: aload_0
    //   15: getfield o : I
    //   18: istore #4
    //   20: goto -> 29
    //   23: aload_0
    //   24: getfield n : I
    //   27: istore #4
    //   29: aload_0
    //   30: getfield C : Ln80;
    //   33: astore #6
    //   35: iload #4
    //   37: ifeq -> 50
    //   40: iload #5
    //   42: istore_3
    //   43: iload #4
    //   45: ldc -2147483648
    //   47: if_icmpne -> 52
    //   50: iconst_1
    //   51: istore_3
    //   52: aload #6
    //   54: iload_3
    //   55: putfield b : Z
    //   58: goto -> 69
    //   61: aload_0
    //   62: getfield C : Ln80;
    //   65: iconst_0
    //   66: putfield b : Z
    //   69: aload_0
    //   70: invokevirtual j : ()Z
    //   73: ifne -> 102
    //   76: aload_0
    //   77: getfield w : Z
    //   80: ifeq -> 102
    //   83: aload_0
    //   84: getfield C : Ln80;
    //   87: aload_1
    //   88: getfield c : I
    //   91: aload_0
    //   92: invokevirtual getPaddingRight : ()I
    //   95: isub
    //   96: putfield a : I
    //   99: goto -> 121
    //   102: aload_0
    //   103: getfield C : Ln80;
    //   106: aload_0
    //   107: getfield E : Lf51;
    //   110: invokevirtual i : ()I
    //   113: aload_1
    //   114: getfield c : I
    //   117: isub
    //   118: putfield a : I
    //   121: aload_0
    //   122: getfield C : Ln80;
    //   125: astore #6
    //   127: aload #6
    //   129: aload_1
    //   130: getfield a : I
    //   133: putfield d : I
    //   136: aload #6
    //   138: iconst_1
    //   139: putfield h : I
    //   142: aload #6
    //   144: aload_1
    //   145: getfield c : I
    //   148: putfield e : I
    //   151: aload #6
    //   153: ldc -2147483648
    //   155: putfield f : I
    //   158: aload #6
    //   160: aload_1
    //   161: getfield b : I
    //   164: putfield c : I
    //   167: iload_2
    //   168: ifeq -> 262
    //   171: aload_0
    //   172: getfield y : Ljava/util/List;
    //   175: invokeinterface size : ()I
    //   180: iconst_1
    //   181: if_icmple -> 262
    //   184: aload_1
    //   185: getfield b : I
    //   188: istore #4
    //   190: iload #4
    //   192: iflt -> 262
    //   195: iload #4
    //   197: aload_0
    //   198: getfield y : Ljava/util/List;
    //   201: invokeinterface size : ()I
    //   206: iconst_1
    //   207: isub
    //   208: if_icmpge -> 262
    //   211: aload_0
    //   212: getfield y : Ljava/util/List;
    //   215: aload_1
    //   216: getfield b : I
    //   219: invokeinterface get : (I)Ljava/lang/Object;
    //   224: checkcast h80
    //   227: astore #6
    //   229: aload_0
    //   230: getfield C : Ln80;
    //   233: astore_1
    //   234: aload_1
    //   235: aload_1
    //   236: getfield c : I
    //   239: iconst_1
    //   240: iadd
    //   241: putfield c : I
    //   244: aload #6
    //   246: getfield h : I
    //   249: istore #4
    //   251: aload_1
    //   252: aload_1
    //   253: getfield d : I
    //   256: iload #4
    //   258: iadd
    //   259: putfield d : I
    //   262: return
  }
  
  public final void n0(int paramInt1, int paramInt2) {
    l1(paramInt1);
  }
  
  public final void n1(l80 paraml80, boolean paramBoolean1, boolean paramBoolean2) {
    // Byte code:
    //   0: iconst_0
    //   1: istore #6
    //   3: iload_3
    //   4: ifeq -> 61
    //   7: aload_0
    //   8: invokevirtual j : ()Z
    //   11: ifeq -> 23
    //   14: aload_0
    //   15: getfield o : I
    //   18: istore #4
    //   20: goto -> 29
    //   23: aload_0
    //   24: getfield n : I
    //   27: istore #4
    //   29: aload_0
    //   30: getfield C : Ln80;
    //   33: astore #7
    //   35: iload #4
    //   37: ifeq -> 50
    //   40: iload #6
    //   42: istore_3
    //   43: iload #4
    //   45: ldc -2147483648
    //   47: if_icmpne -> 52
    //   50: iconst_1
    //   51: istore_3
    //   52: aload #7
    //   54: iload_3
    //   55: putfield b : Z
    //   58: goto -> 69
    //   61: aload_0
    //   62: getfield C : Ln80;
    //   65: iconst_0
    //   66: putfield b : Z
    //   69: aload_0
    //   70: invokevirtual j : ()Z
    //   73: ifne -> 113
    //   76: aload_0
    //   77: getfield w : Z
    //   80: ifeq -> 113
    //   83: aload_0
    //   84: getfield C : Ln80;
    //   87: aload_0
    //   88: getfield N : Landroid/view/View;
    //   91: invokevirtual getWidth : ()I
    //   94: aload_1
    //   95: getfield c : I
    //   98: isub
    //   99: aload_0
    //   100: getfield E : Lf51;
    //   103: invokevirtual m : ()I
    //   106: isub
    //   107: putfield a : I
    //   110: goto -> 132
    //   113: aload_0
    //   114: getfield C : Ln80;
    //   117: aload_1
    //   118: getfield c : I
    //   121: aload_0
    //   122: getfield E : Lf51;
    //   125: invokevirtual m : ()I
    //   128: isub
    //   129: putfield a : I
    //   132: aload_0
    //   133: getfield C : Ln80;
    //   136: astore #7
    //   138: aload #7
    //   140: aload_1
    //   141: getfield a : I
    //   144: putfield d : I
    //   147: aload #7
    //   149: iconst_m1
    //   150: putfield h : I
    //   153: aload #7
    //   155: aload_1
    //   156: getfield c : I
    //   159: putfield e : I
    //   162: aload #7
    //   164: ldc -2147483648
    //   166: putfield f : I
    //   169: aload_1
    //   170: getfield b : I
    //   173: istore #4
    //   175: aload #7
    //   177: iload #4
    //   179: putfield c : I
    //   182: iload_2
    //   183: ifeq -> 267
    //   186: iload #4
    //   188: ifle -> 267
    //   191: aload_0
    //   192: getfield y : Ljava/util/List;
    //   195: invokeinterface size : ()I
    //   200: istore #4
    //   202: aload_1
    //   203: getfield b : I
    //   206: istore #5
    //   208: iload #4
    //   210: iload #5
    //   212: if_icmple -> 267
    //   215: aload_0
    //   216: getfield y : Ljava/util/List;
    //   219: iload #5
    //   221: invokeinterface get : (I)Ljava/lang/Object;
    //   226: checkcast h80
    //   229: astore_1
    //   230: aload_0
    //   231: getfield C : Ln80;
    //   234: astore #7
    //   236: aload #7
    //   238: aload #7
    //   240: getfield c : I
    //   243: iconst_1
    //   244: isub
    //   245: putfield c : I
    //   248: aload_1
    //   249: getfield h : I
    //   252: istore #4
    //   254: aload #7
    //   256: aload #7
    //   258: getfield d : I
    //   261: iload #4
    //   263: isub
    //   264: putfield d : I
    //   267: return
  }
  
  public final boolean o() {
    if (this.s == 0)
      return j(); 
    if (j()) {
      byte b;
      int i = this.p;
      View view = this.N;
      if (view != null) {
        b = view.getWidth();
      } else {
        b = 0;
      } 
      if (i <= b)
        return false; 
    } 
    return true;
  }
  
  public final void o0(int paramInt) {
    l1(paramInt);
  }
  
  public final boolean p() {
    if (this.s == 0)
      return j() ^ true; 
    if (!j()) {
      byte b;
      int i = this.q;
      View view = this.N;
      if (view != null) {
        b = view.getHeight();
      } else {
        b = 0;
      } 
      if (i <= b)
        return false; 
    } 
    return true;
  }
  
  public final void p0(RecyclerView paramRecyclerView, int paramInt1, int paramInt2) {
    l1(paramInt1);
    l1(paramInt1);
  }
  
  public final boolean q(sd1 paramsd1) {
    return paramsd1 instanceof m80;
  }
  
  public final void q0(yd1 paramyd1, de1 paramde1) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: putfield A : Lyd1;
    //   5: aload_0
    //   6: aload_2
    //   7: putfield B : Lde1;
    //   10: aload_2
    //   11: invokevirtual b : ()I
    //   14: istore #6
    //   16: iload #6
    //   18: ifne -> 31
    //   21: aload_2
    //   22: getfield g : Z
    //   25: ifeq -> 31
    //   28: goto -> 1999
    //   31: aload_0
    //   32: getfield c : Landroidx/recyclerview/widget/RecyclerView;
    //   35: invokevirtual getLayoutDirection : ()I
    //   38: istore #4
    //   40: aload_0
    //   41: getfield r : I
    //   44: istore_3
    //   45: iload_3
    //   46: ifeq -> 214
    //   49: iload_3
    //   50: iconst_1
    //   51: if_icmpeq -> 167
    //   54: iload_3
    //   55: iconst_2
    //   56: if_icmpeq -> 122
    //   59: iload_3
    //   60: iconst_3
    //   61: if_icmpeq -> 77
    //   64: aload_0
    //   65: iconst_0
    //   66: putfield w : Z
    //   69: aload_0
    //   70: iconst_0
    //   71: putfield x : Z
    //   74: goto -> 258
    //   77: iload #4
    //   79: iconst_1
    //   80: if_icmpne -> 89
    //   83: iconst_1
    //   84: istore #10
    //   86: goto -> 92
    //   89: iconst_0
    //   90: istore #10
    //   92: aload_0
    //   93: iload #10
    //   95: putfield w : Z
    //   98: aload_0
    //   99: getfield s : I
    //   102: iconst_2
    //   103: if_icmpne -> 114
    //   106: aload_0
    //   107: iload #10
    //   109: iconst_1
    //   110: ixor
    //   111: putfield w : Z
    //   114: aload_0
    //   115: iconst_1
    //   116: putfield x : Z
    //   119: goto -> 258
    //   122: iload #4
    //   124: iconst_1
    //   125: if_icmpne -> 134
    //   128: iconst_1
    //   129: istore #10
    //   131: goto -> 137
    //   134: iconst_0
    //   135: istore #10
    //   137: aload_0
    //   138: iload #10
    //   140: putfield w : Z
    //   143: aload_0
    //   144: getfield s : I
    //   147: iconst_2
    //   148: if_icmpne -> 159
    //   151: aload_0
    //   152: iload #10
    //   154: iconst_1
    //   155: ixor
    //   156: putfield w : Z
    //   159: aload_0
    //   160: iconst_0
    //   161: putfield x : Z
    //   164: goto -> 258
    //   167: iload #4
    //   169: iconst_1
    //   170: if_icmpeq -> 179
    //   173: iconst_1
    //   174: istore #10
    //   176: goto -> 182
    //   179: iconst_0
    //   180: istore #10
    //   182: aload_0
    //   183: iload #10
    //   185: putfield w : Z
    //   188: aload_0
    //   189: getfield s : I
    //   192: iconst_2
    //   193: if_icmpne -> 202
    //   196: iconst_1
    //   197: istore #10
    //   199: goto -> 205
    //   202: iconst_0
    //   203: istore #10
    //   205: aload_0
    //   206: iload #10
    //   208: putfield x : Z
    //   211: goto -> 258
    //   214: iload #4
    //   216: iconst_1
    //   217: if_icmpne -> 226
    //   220: iconst_1
    //   221: istore #10
    //   223: goto -> 229
    //   226: iconst_0
    //   227: istore #10
    //   229: aload_0
    //   230: iload #10
    //   232: putfield w : Z
    //   235: aload_0
    //   236: getfield s : I
    //   239: iconst_2
    //   240: if_icmpne -> 249
    //   243: iconst_1
    //   244: istore #10
    //   246: goto -> 252
    //   249: iconst_0
    //   250: istore #10
    //   252: aload_0
    //   253: iload #10
    //   255: putfield x : Z
    //   258: aload_0
    //   259: invokevirtual U0 : ()V
    //   262: aload_0
    //   263: getfield C : Ln80;
    //   266: ifnonnull -> 290
    //   269: new java/lang/Object
    //   272: dup
    //   273: invokespecial <init> : ()V
    //   276: astore #11
    //   278: aload #11
    //   280: iconst_1
    //   281: putfield h : I
    //   284: aload_0
    //   285: aload #11
    //   287: putfield C : Ln80;
    //   290: aload_0
    //   291: getfield z : Lcn;
    //   294: astore #14
    //   296: aload #14
    //   298: iload #6
    //   300: invokevirtual j : (I)V
    //   303: aload #14
    //   305: iload #6
    //   307: invokevirtual k : (I)V
    //   310: aload #14
    //   312: iload #6
    //   314: invokevirtual i : (I)V
    //   317: aload_0
    //   318: getfield C : Ln80;
    //   321: iconst_0
    //   322: putfield i : Z
    //   325: aload_0
    //   326: getfield G : Lo80;
    //   329: astore #11
    //   331: aload #11
    //   333: ifnull -> 357
    //   336: aload #11
    //   338: getfield b : I
    //   341: istore_3
    //   342: iload_3
    //   343: iflt -> 357
    //   346: iload_3
    //   347: iload #6
    //   349: if_icmpge -> 357
    //   352: aload_0
    //   353: iload_3
    //   354: putfield H : I
    //   357: aload_0
    //   358: getfield D : Ll80;
    //   361: astore #13
    //   363: aload #13
    //   365: getfield f : Z
    //   368: ifeq -> 384
    //   371: aload_0
    //   372: getfield H : I
    //   375: iconst_m1
    //   376: if_icmpne -> 384
    //   379: aload #11
    //   381: ifnull -> 1158
    //   384: aload #13
    //   386: invokestatic b : (Ll80;)V
    //   389: aload_0
    //   390: getfield G : Lo80;
    //   393: astore #12
    //   395: aload_2
    //   396: getfield g : Z
    //   399: ifne -> 841
    //   402: aload_0
    //   403: getfield H : I
    //   406: istore_3
    //   407: iload_3
    //   408: iconst_m1
    //   409: if_icmpne -> 415
    //   412: goto -> 841
    //   415: iload_3
    //   416: iflt -> 830
    //   419: iload_3
    //   420: aload_2
    //   421: invokevirtual b : ()I
    //   424: if_icmplt -> 430
    //   427: goto -> 830
    //   430: aload_0
    //   431: getfield H : I
    //   434: istore_3
    //   435: aload #13
    //   437: iload_3
    //   438: putfield a : I
    //   441: aload #13
    //   443: aload #14
    //   445: getfield c : Ljava/lang/Object;
    //   448: checkcast [I
    //   451: iload_3
    //   452: iaload
    //   453: putfield b : I
    //   456: aload_0
    //   457: getfield G : Lo80;
    //   460: astore #11
    //   462: aload #11
    //   464: ifnull -> 522
    //   467: aload_2
    //   468: invokevirtual b : ()I
    //   471: istore #4
    //   473: aload #11
    //   475: getfield b : I
    //   478: istore_3
    //   479: iload_3
    //   480: iflt -> 522
    //   483: iload_3
    //   484: iload #4
    //   486: if_icmpge -> 522
    //   489: aload #13
    //   491: aload_0
    //   492: getfield E : Lf51;
    //   495: invokevirtual m : ()I
    //   498: aload #12
    //   500: getfield c : I
    //   503: iadd
    //   504: putfield c : I
    //   507: aload #13
    //   509: iconst_1
    //   510: putfield g : Z
    //   513: aload #13
    //   515: iconst_m1
    //   516: putfield b : I
    //   519: goto -> 1152
    //   522: aload_0
    //   523: getfield I : I
    //   526: ldc -2147483648
    //   528: if_icmpne -> 776
    //   531: aload_0
    //   532: aload_0
    //   533: getfield H : I
    //   536: invokevirtual B : (I)Landroid/view/View;
    //   539: astore #11
    //   541: aload #11
    //   543: ifnull -> 719
    //   546: aload_0
    //   547: getfield E : Lf51;
    //   550: aload #11
    //   552: invokevirtual e : (Landroid/view/View;)I
    //   555: aload_0
    //   556: getfield E : Lf51;
    //   559: invokevirtual n : ()I
    //   562: if_icmple -> 573
    //   565: aload #13
    //   567: invokestatic a : (Ll80;)V
    //   570: goto -> 1152
    //   573: aload_0
    //   574: getfield E : Lf51;
    //   577: aload #11
    //   579: invokevirtual g : (Landroid/view/View;)I
    //   582: istore_3
    //   583: aload_0
    //   584: getfield E : Lf51;
    //   587: invokevirtual m : ()I
    //   590: istore #4
    //   592: aload_0
    //   593: getfield E : Lf51;
    //   596: astore #12
    //   598: iload_3
    //   599: iload #4
    //   601: isub
    //   602: ifge -> 624
    //   605: aload #13
    //   607: aload #12
    //   609: invokevirtual m : ()I
    //   612: putfield c : I
    //   615: aload #13
    //   617: iconst_0
    //   618: putfield e : Z
    //   621: goto -> 1152
    //   624: aload #12
    //   626: invokevirtual i : ()I
    //   629: aload_0
    //   630: getfield E : Lf51;
    //   633: aload #11
    //   635: invokevirtual d : (Landroid/view/View;)I
    //   638: isub
    //   639: ifge -> 663
    //   642: aload #13
    //   644: aload_0
    //   645: getfield E : Lf51;
    //   648: invokevirtual i : ()I
    //   651: putfield c : I
    //   654: aload #13
    //   656: iconst_1
    //   657: putfield e : Z
    //   660: goto -> 1152
    //   663: aload #13
    //   665: getfield e : Z
    //   668: istore #10
    //   670: aload_0
    //   671: getfield E : Lf51;
    //   674: astore #12
    //   676: iload #10
    //   678: ifeq -> 702
    //   681: aload #12
    //   683: aload #11
    //   685: invokevirtual d : (Landroid/view/View;)I
    //   688: istore_3
    //   689: aload_0
    //   690: getfield E : Lf51;
    //   693: invokevirtual o : ()I
    //   696: iload_3
    //   697: iadd
    //   698: istore_3
    //   699: goto -> 710
    //   702: aload #12
    //   704: aload #11
    //   706: invokevirtual g : (Landroid/view/View;)I
    //   709: istore_3
    //   710: aload #13
    //   712: iload_3
    //   713: putfield c : I
    //   716: goto -> 1152
    //   719: aload_0
    //   720: invokevirtual G : ()I
    //   723: ifle -> 768
    //   726: aload_0
    //   727: iconst_0
    //   728: invokevirtual F : (I)Landroid/view/View;
    //   731: astore #11
    //   733: aload #11
    //   735: ifnull -> 768
    //   738: aload #11
    //   740: invokestatic R : (Landroid/view/View;)I
    //   743: istore_3
    //   744: aload_0
    //   745: getfield H : I
    //   748: iload_3
    //   749: if_icmpge -> 758
    //   752: iconst_1
    //   753: istore #10
    //   755: goto -> 761
    //   758: iconst_0
    //   759: istore #10
    //   761: aload #13
    //   763: iload #10
    //   765: putfield e : Z
    //   768: aload #13
    //   770: invokestatic a : (Ll80;)V
    //   773: goto -> 1152
    //   776: aload_0
    //   777: invokevirtual j : ()Z
    //   780: ifne -> 810
    //   783: aload_0
    //   784: getfield w : Z
    //   787: ifeq -> 810
    //   790: aload #13
    //   792: aload_0
    //   793: getfield I : I
    //   796: aload_0
    //   797: getfield E : Lf51;
    //   800: invokevirtual j : ()I
    //   803: isub
    //   804: putfield c : I
    //   807: goto -> 1152
    //   810: aload #13
    //   812: aload_0
    //   813: getfield E : Lf51;
    //   816: invokevirtual m : ()I
    //   819: aload_0
    //   820: getfield I : I
    //   823: iadd
    //   824: putfield c : I
    //   827: goto -> 1152
    //   830: aload_0
    //   831: iconst_m1
    //   832: putfield H : I
    //   835: aload_0
    //   836: ldc -2147483648
    //   838: putfield I : I
    //   841: aload_0
    //   842: invokevirtual G : ()I
    //   845: ifne -> 851
    //   848: goto -> 1135
    //   851: aload #13
    //   853: getfield e : Z
    //   856: ifeq -> 872
    //   859: aload_0
    //   860: aload_2
    //   861: invokevirtual b : ()I
    //   864: invokevirtual Y0 : (I)Landroid/view/View;
    //   867: astore #11
    //   869: goto -> 882
    //   872: aload_0
    //   873: aload_2
    //   874: invokevirtual b : ()I
    //   877: invokevirtual W0 : (I)Landroid/view/View;
    //   880: astore #11
    //   882: aload #11
    //   884: ifnull -> 1135
    //   887: aload #13
    //   889: getfield h : Lcom/google/android/flexbox/FlexboxLayoutManager;
    //   892: astore #15
    //   894: aload #15
    //   896: getfield s : I
    //   899: ifne -> 912
    //   902: aload #15
    //   904: getfield F : Lf51;
    //   907: astore #12
    //   909: goto -> 919
    //   912: aload #15
    //   914: getfield E : Lf51;
    //   917: astore #12
    //   919: aload #15
    //   921: invokevirtual j : ()Z
    //   924: ifne -> 981
    //   927: aload #15
    //   929: getfield w : Z
    //   932: ifeq -> 981
    //   935: aload #13
    //   937: getfield e : Z
    //   940: ifeq -> 966
    //   943: aload #12
    //   945: aload #11
    //   947: invokevirtual g : (Landroid/view/View;)I
    //   950: istore_3
    //   951: aload #13
    //   953: aload #12
    //   955: invokevirtual o : ()I
    //   958: iload_3
    //   959: iadd
    //   960: putfield c : I
    //   963: goto -> 1024
    //   966: aload #13
    //   968: aload #12
    //   970: aload #11
    //   972: invokevirtual d : (Landroid/view/View;)I
    //   975: putfield c : I
    //   978: goto -> 1024
    //   981: aload #13
    //   983: getfield e : Z
    //   986: ifeq -> 1012
    //   989: aload #12
    //   991: aload #11
    //   993: invokevirtual d : (Landroid/view/View;)I
    //   996: istore_3
    //   997: aload #13
    //   999: aload #12
    //   1001: invokevirtual o : ()I
    //   1004: iload_3
    //   1005: iadd
    //   1006: putfield c : I
    //   1009: goto -> 1024
    //   1012: aload #13
    //   1014: aload #12
    //   1016: aload #11
    //   1018: invokevirtual g : (Landroid/view/View;)I
    //   1021: putfield c : I
    //   1024: aload #11
    //   1026: invokestatic R : (Landroid/view/View;)I
    //   1029: istore_3
    //   1030: aload #13
    //   1032: iload_3
    //   1033: putfield a : I
    //   1036: aload #13
    //   1038: iconst_0
    //   1039: putfield g : Z
    //   1042: aload #15
    //   1044: getfield z : Lcn;
    //   1047: getfield c : Ljava/lang/Object;
    //   1050: checkcast [I
    //   1053: astore #11
    //   1055: iload_3
    //   1056: iconst_m1
    //   1057: if_icmpeq -> 1063
    //   1060: goto -> 1065
    //   1063: iconst_0
    //   1064: istore_3
    //   1065: aload #11
    //   1067: iload_3
    //   1068: iaload
    //   1069: istore_3
    //   1070: iload_3
    //   1071: iconst_m1
    //   1072: if_icmpeq -> 1078
    //   1075: goto -> 1080
    //   1078: iconst_0
    //   1079: istore_3
    //   1080: aload #13
    //   1082: iload_3
    //   1083: putfield b : I
    //   1086: aload #15
    //   1088: getfield y : Ljava/util/List;
    //   1091: invokeinterface size : ()I
    //   1096: istore #4
    //   1098: aload #13
    //   1100: getfield b : I
    //   1103: istore_3
    //   1104: iload #4
    //   1106: iload_3
    //   1107: if_icmple -> 1152
    //   1110: aload #13
    //   1112: aload #15
    //   1114: getfield y : Ljava/util/List;
    //   1117: iload_3
    //   1118: invokeinterface get : (I)Ljava/lang/Object;
    //   1123: checkcast h80
    //   1126: getfield o : I
    //   1129: putfield a : I
    //   1132: goto -> 1152
    //   1135: aload #13
    //   1137: invokestatic a : (Ll80;)V
    //   1140: aload #13
    //   1142: iconst_0
    //   1143: putfield a : I
    //   1146: aload #13
    //   1148: iconst_0
    //   1149: putfield b : I
    //   1152: aload #13
    //   1154: iconst_1
    //   1155: putfield f : Z
    //   1158: aload_0
    //   1159: aload_1
    //   1160: invokevirtual A : (Lyd1;)V
    //   1163: aload #13
    //   1165: getfield e : Z
    //   1168: ifeq -> 1182
    //   1171: aload_0
    //   1172: aload #13
    //   1174: iconst_0
    //   1175: iconst_1
    //   1176: invokevirtual n1 : (Ll80;ZZ)V
    //   1179: goto -> 1190
    //   1182: aload_0
    //   1183: aload #13
    //   1185: iconst_0
    //   1186: iconst_1
    //   1187: invokevirtual m1 : (Ll80;ZZ)V
    //   1190: aload_0
    //   1191: getfield p : I
    //   1194: aload_0
    //   1195: getfield n : I
    //   1198: invokestatic makeMeasureSpec : (II)I
    //   1201: istore #7
    //   1203: aload_0
    //   1204: getfield q : I
    //   1207: aload_0
    //   1208: getfield o : I
    //   1211: invokestatic makeMeasureSpec : (II)I
    //   1214: istore #8
    //   1216: aload_0
    //   1217: getfield p : I
    //   1220: istore #9
    //   1222: aload_0
    //   1223: getfield q : I
    //   1226: istore #5
    //   1228: aload_0
    //   1229: invokevirtual j : ()Z
    //   1232: istore #10
    //   1234: aload_0
    //   1235: getfield M : Landroid/content/Context;
    //   1238: astore #11
    //   1240: iload #10
    //   1242: ifeq -> 1309
    //   1245: aload_0
    //   1246: getfield J : I
    //   1249: istore_3
    //   1250: iload_3
    //   1251: ldc -2147483648
    //   1253: if_icmpeq -> 1268
    //   1256: iload_3
    //   1257: iload #9
    //   1259: if_icmpeq -> 1268
    //   1262: iconst_1
    //   1263: istore #4
    //   1265: goto -> 1271
    //   1268: iconst_0
    //   1269: istore #4
    //   1271: aload_0
    //   1272: getfield C : Ln80;
    //   1275: astore #12
    //   1277: aload #12
    //   1279: getfield b : Z
    //   1282: ifeq -> 1300
    //   1285: aload #11
    //   1287: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   1290: invokevirtual getDisplayMetrics : ()Landroid/util/DisplayMetrics;
    //   1293: getfield heightPixels : I
    //   1296: istore_3
    //   1297: goto -> 1306
    //   1300: aload #12
    //   1302: getfield a : I
    //   1305: istore_3
    //   1306: goto -> 1373
    //   1309: aload_0
    //   1310: getfield K : I
    //   1313: istore_3
    //   1314: iload_3
    //   1315: ldc -2147483648
    //   1317: if_icmpeq -> 1332
    //   1320: iload_3
    //   1321: iload #5
    //   1323: if_icmpeq -> 1332
    //   1326: iconst_1
    //   1327: istore #4
    //   1329: goto -> 1335
    //   1332: iconst_0
    //   1333: istore #4
    //   1335: aload_0
    //   1336: getfield C : Ln80;
    //   1339: astore #12
    //   1341: aload #12
    //   1343: getfield b : Z
    //   1346: ifeq -> 1364
    //   1349: aload #11
    //   1351: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   1354: invokevirtual getDisplayMetrics : ()Landroid/util/DisplayMetrics;
    //   1357: getfield widthPixels : I
    //   1360: istore_3
    //   1361: goto -> 1306
    //   1364: aload #12
    //   1366: getfield a : I
    //   1369: istore_3
    //   1370: goto -> 1306
    //   1373: aload_0
    //   1374: iload #9
    //   1376: putfield J : I
    //   1379: aload_0
    //   1380: iload #5
    //   1382: putfield K : I
    //   1385: aload_0
    //   1386: getfield O : I
    //   1389: istore #9
    //   1391: aload_0
    //   1392: getfield P : Li80;
    //   1395: astore #11
    //   1397: iload #9
    //   1399: iconst_m1
    //   1400: if_icmpne -> 1576
    //   1403: aload_0
    //   1404: getfield H : I
    //   1407: iconst_m1
    //   1408: if_icmpne -> 1416
    //   1411: iload #4
    //   1413: ifeq -> 1576
    //   1416: aload #13
    //   1418: getfield e : Z
    //   1421: ifeq -> 1427
    //   1424: goto -> 1845
    //   1427: aload_0
    //   1428: getfield y : Ljava/util/List;
    //   1431: invokeinterface clear : ()V
    //   1436: aload #11
    //   1438: aconst_null
    //   1439: putfield b : Ljava/util/List;
    //   1442: aload #11
    //   1444: iconst_0
    //   1445: putfield a : I
    //   1448: aload_0
    //   1449: invokevirtual j : ()Z
    //   1452: istore #10
    //   1454: aload #13
    //   1456: getfield a : I
    //   1459: istore #4
    //   1461: aload_0
    //   1462: getfield z : Lcn;
    //   1465: astore #15
    //   1467: aload_0
    //   1468: getfield P : Li80;
    //   1471: astore #12
    //   1473: iload #10
    //   1475: ifeq -> 1500
    //   1478: aload #15
    //   1480: aload #12
    //   1482: iload #7
    //   1484: iload #8
    //   1486: iload_3
    //   1487: iconst_0
    //   1488: iload #4
    //   1490: aload_0
    //   1491: getfield y : Ljava/util/List;
    //   1494: invokevirtual b : (Li80;IIIIILjava/util/List;)V
    //   1497: goto -> 1519
    //   1500: aload #15
    //   1502: aload #12
    //   1504: iload #8
    //   1506: iload #7
    //   1508: iload_3
    //   1509: iconst_0
    //   1510: iload #4
    //   1512: aload_0
    //   1513: getfield y : Ljava/util/List;
    //   1516: invokevirtual b : (Li80;IIIIILjava/util/List;)V
    //   1519: aload_0
    //   1520: aload #11
    //   1522: getfield b : Ljava/util/List;
    //   1525: putfield y : Ljava/util/List;
    //   1528: aload #14
    //   1530: iload #7
    //   1532: iload #8
    //   1534: iconst_0
    //   1535: invokevirtual h : (III)V
    //   1538: aload #14
    //   1540: iconst_0
    //   1541: invokevirtual B : (I)V
    //   1544: aload #14
    //   1546: getfield c : Ljava/lang/Object;
    //   1549: checkcast [I
    //   1552: aload #13
    //   1554: getfield a : I
    //   1557: iaload
    //   1558: istore_3
    //   1559: aload #13
    //   1561: iload_3
    //   1562: putfield b : I
    //   1565: aload_0
    //   1566: getfield C : Ln80;
    //   1569: iload_3
    //   1570: putfield c : I
    //   1573: goto -> 1845
    //   1576: aload #13
    //   1578: getfield a : I
    //   1581: istore #5
    //   1583: iload #5
    //   1585: istore #4
    //   1587: iload #9
    //   1589: iconst_m1
    //   1590: if_icmpeq -> 1602
    //   1593: iload #9
    //   1595: iload #5
    //   1597: invokestatic min : (II)I
    //   1600: istore #4
    //   1602: aload #11
    //   1604: aconst_null
    //   1605: putfield b : Ljava/util/List;
    //   1608: aload #11
    //   1610: iconst_0
    //   1611: putfield a : I
    //   1614: aload_0
    //   1615: invokevirtual j : ()Z
    //   1618: istore #10
    //   1620: aload_0
    //   1621: getfield y : Ljava/util/List;
    //   1624: astore #12
    //   1626: iload #10
    //   1628: ifeq -> 1726
    //   1631: aload #12
    //   1633: invokeinterface size : ()I
    //   1638: ifle -> 1690
    //   1641: aload #14
    //   1643: iload #4
    //   1645: aload_0
    //   1646: getfield y : Ljava/util/List;
    //   1649: invokevirtual d : (ILjava/util/List;)V
    //   1652: aload #13
    //   1654: getfield a : I
    //   1657: istore #5
    //   1659: aload_0
    //   1660: getfield y : Ljava/util/List;
    //   1663: astore #12
    //   1665: aload_0
    //   1666: getfield z : Lcn;
    //   1669: aload_0
    //   1670: getfield P : Li80;
    //   1673: iload #7
    //   1675: iload #8
    //   1677: iload_3
    //   1678: iload #4
    //   1680: iload #5
    //   1682: aload #12
    //   1684: invokevirtual b : (Li80;IIIIILjava/util/List;)V
    //   1687: goto -> 1818
    //   1690: aload #14
    //   1692: iload #6
    //   1694: invokevirtual i : (I)V
    //   1697: aload_0
    //   1698: getfield y : Ljava/util/List;
    //   1701: astore #12
    //   1703: aload_0
    //   1704: getfield z : Lcn;
    //   1707: aload_0
    //   1708: getfield P : Li80;
    //   1711: iload #7
    //   1713: iload #8
    //   1715: iload_3
    //   1716: iconst_0
    //   1717: iconst_m1
    //   1718: aload #12
    //   1720: invokevirtual b : (Li80;IIIIILjava/util/List;)V
    //   1723: goto -> 1818
    //   1726: aload #12
    //   1728: invokeinterface size : ()I
    //   1733: ifle -> 1785
    //   1736: aload #14
    //   1738: iload #4
    //   1740: aload_0
    //   1741: getfield y : Ljava/util/List;
    //   1744: invokevirtual d : (ILjava/util/List;)V
    //   1747: aload #13
    //   1749: getfield a : I
    //   1752: istore #5
    //   1754: aload_0
    //   1755: getfield y : Ljava/util/List;
    //   1758: astore #12
    //   1760: aload_0
    //   1761: getfield z : Lcn;
    //   1764: aload_0
    //   1765: getfield P : Li80;
    //   1768: iload #8
    //   1770: iload #7
    //   1772: iload_3
    //   1773: iload #4
    //   1775: iload #5
    //   1777: aload #12
    //   1779: invokevirtual b : (Li80;IIIIILjava/util/List;)V
    //   1782: goto -> 1818
    //   1785: aload #14
    //   1787: iload #6
    //   1789: invokevirtual i : (I)V
    //   1792: aload_0
    //   1793: getfield y : Ljava/util/List;
    //   1796: astore #12
    //   1798: aload_0
    //   1799: getfield z : Lcn;
    //   1802: aload_0
    //   1803: getfield P : Li80;
    //   1806: iload #8
    //   1808: iload #7
    //   1810: iload_3
    //   1811: iconst_0
    //   1812: iconst_m1
    //   1813: aload #12
    //   1815: invokevirtual b : (Li80;IIIIILjava/util/List;)V
    //   1818: aload_0
    //   1819: aload #11
    //   1821: getfield b : Ljava/util/List;
    //   1824: putfield y : Ljava/util/List;
    //   1827: aload #14
    //   1829: iload #7
    //   1831: iload #8
    //   1833: iload #4
    //   1835: invokevirtual h : (III)V
    //   1838: aload #14
    //   1840: iload #4
    //   1842: invokevirtual B : (I)V
    //   1845: aload_0
    //   1846: aload_1
    //   1847: aload_2
    //   1848: aload_0
    //   1849: getfield C : Ln80;
    //   1852: invokevirtual V0 : (Lyd1;Lde1;Ln80;)I
    //   1855: pop
    //   1856: aload #13
    //   1858: getfield e : Z
    //   1861: istore #10
    //   1863: aload_0
    //   1864: getfield C : Ln80;
    //   1867: astore #11
    //   1869: iload #10
    //   1871: ifeq -> 1911
    //   1874: aload #11
    //   1876: getfield e : I
    //   1879: istore #4
    //   1881: aload_0
    //   1882: aload #13
    //   1884: iconst_1
    //   1885: iconst_0
    //   1886: invokevirtual m1 : (Ll80;ZZ)V
    //   1889: aload_0
    //   1890: aload_1
    //   1891: aload_2
    //   1892: aload_0
    //   1893: getfield C : Ln80;
    //   1896: invokevirtual V0 : (Lyd1;Lde1;Ln80;)I
    //   1899: pop
    //   1900: aload_0
    //   1901: getfield C : Ln80;
    //   1904: getfield e : I
    //   1907: istore_3
    //   1908: goto -> 1945
    //   1911: aload #11
    //   1913: getfield e : I
    //   1916: istore_3
    //   1917: aload_0
    //   1918: aload #13
    //   1920: iconst_1
    //   1921: iconst_0
    //   1922: invokevirtual n1 : (Ll80;ZZ)V
    //   1925: aload_0
    //   1926: aload_1
    //   1927: aload_2
    //   1928: aload_0
    //   1929: getfield C : Ln80;
    //   1932: invokevirtual V0 : (Lyd1;Lde1;Ln80;)I
    //   1935: pop
    //   1936: aload_0
    //   1937: getfield C : Ln80;
    //   1940: getfield e : I
    //   1943: istore #4
    //   1945: aload_0
    //   1946: invokevirtual G : ()I
    //   1949: ifle -> 1999
    //   1952: aload #13
    //   1954: getfield e : Z
    //   1957: ifeq -> 1980
    //   1960: aload_0
    //   1961: aload_0
    //   1962: iload_3
    //   1963: aload_1
    //   1964: aload_2
    //   1965: iconst_1
    //   1966: invokevirtual c1 : (ILyd1;Lde1;Z)I
    //   1969: iload #4
    //   1971: iadd
    //   1972: aload_1
    //   1973: aload_2
    //   1974: iconst_0
    //   1975: invokevirtual d1 : (ILyd1;Lde1;Z)I
    //   1978: pop
    //   1979: return
    //   1980: aload_0
    //   1981: aload_0
    //   1982: iload #4
    //   1984: aload_1
    //   1985: aload_2
    //   1986: iconst_1
    //   1987: invokevirtual d1 : (ILyd1;Lde1;Z)I
    //   1990: iload_3
    //   1991: iadd
    //   1992: aload_1
    //   1993: aload_2
    //   1994: iconst_0
    //   1995: invokevirtual c1 : (ILyd1;Lde1;Z)I
    //   1998: pop
    //   1999: return
  }
  
  public final void r0(de1 paramde1) {
    this.G = null;
    this.H = -1;
    this.I = Integer.MIN_VALUE;
    this.O = -1;
    l80.b(this.D);
    this.L.clear();
  }
  
  public final void s0(Parcelable paramParcelable) {
    if (paramParcelable instanceof o80) {
      this.G = (o80)paramParcelable;
      C0();
    } 
  }
  
  public final void setFlexLines(List paramList) {
    this.y = paramList;
  }
  
  public final Parcelable t0() {
    o80 o801 = this.G;
    if (o801 != null) {
      Object object1 = new Object();
      ((o80)object1).b = o801.b;
      ((o80)object1).c = o801.c;
      return (Parcelable)object1;
    } 
    Object object = new Object();
    if (G() > 0) {
      View view = F(0);
      ((o80)object).b = a.R(view);
      ((o80)object).c = this.E.g(view) - this.E.m();
      return (Parcelable)object;
    } 
    ((o80)object).b = -1;
    return (Parcelable)object;
  }
  
  public final int u(de1 paramde1) {
    return R0(paramde1);
  }
  
  public final int v(de1 paramde1) {
    return S0(paramde1);
  }
  
  public final int w(de1 paramde1) {
    return T0(paramde1);
  }
  
  public final int x(de1 paramde1) {
    return R0(paramde1);
  }
  
  public final int y(de1 paramde1) {
    return S0(paramde1);
  }
  
  public final int z(de1 paramde1) {
    return T0(paramde1);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\com\google\android\flexbox\FlexboxLayoutManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
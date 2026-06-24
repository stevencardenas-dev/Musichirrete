package com.google.android.material.carousel;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.a;
import ce1;
import de1;
import ga1;
import gj0;
import kn0;
import l0;
import l20;
import ri;
import sd1;
import si;
import ti;
import ui;
import yd1;
import zb1;

public class CarouselLayoutManager extends a implements ce1 {
  public final l20 r;
  
  public gj0 s;
  
  public final View.OnLayoutChangeListener t;
  
  public CarouselLayoutManager() {
    new ti();
    this.t = (View.OnLayoutChangeListener)new ri(0, this);
    this.r = l201;
    C0();
    U0(0);
  }
  
  public CarouselLayoutManager(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2) {
    new ti();
    this.t = (View.OnLayoutChangeListener)new ri(0, this);
    this.r = new l20();
    C0();
    if (paramAttributeSet != null) {
      TypedArray typedArray = paramContext.obtainStyledAttributes(paramAttributeSet, zb1.f);
      typedArray.getInt(0, 0);
      C0();
      U0(typedArray.getInt(0, 0));
      typedArray.recycle();
    } 
  }
  
  public final boolean B0(RecyclerView paramRecyclerView, View paramView, Rect paramRect, boolean paramBoolean1, boolean paramBoolean2) {
    return false;
  }
  
  public final sd1 C() {
    return new sd1(-2, -2);
  }
  
  public final int D0(int paramInt, yd1 paramyd1, de1 paramde1) {
    if (!S0() || G() == 0 || paramInt == 0)
      return 0; 
    Z(paramyd1.d(0));
    throw null;
  }
  
  public final void E0(int paramInt) {}
  
  public final int F0(int paramInt, yd1 paramyd1, de1 paramde1) {
    if (!p() || G() == 0 || paramInt == 0)
      return 0; 
    Z(paramyd1.d(0));
    throw null;
  }
  
  public final void K(View paramView, Rect paramRect) {
    super.K(paramView, paramRect);
    paramRect.centerY();
    if (S0())
      paramRect.centerX(); 
    throw null;
  }
  
  public final void O0(RecyclerView paramRecyclerView, int paramInt) {
    si si = new si(this, paramRecyclerView.getContext());
    ((kn0)si).a = paramInt;
    P0((kn0)si);
  }
  
  public final float R0(float paramFloat1, float paramFloat2) {
    return T0() ? (paramFloat1 - paramFloat2) : (paramFloat1 + paramFloat2);
  }
  
  public final boolean S0() {
    return (this.s.a == 0);
  }
  
  public final boolean T0() {
    return (S0() && this.c.getLayoutDirection() == 1);
  }
  
  public final void U0(int paramInt) {
    if (paramInt == 0 || paramInt == 1) {
      m(null);
      gj0 gj01 = this.s;
      if (gj01 == null || paramInt != gj01.a) {
        ui ui;
        if (paramInt != 0) {
          if (paramInt == 1) {
            ui = new ui(this, 0);
          } else {
            l0.l("invalid orientation");
            return;
          } 
        } else {
          ui = new ui(this, 1);
        } 
        this.s = (gj0)ui;
        C0();
        return;
      } 
      return;
    } 
    l0.l(ga1.i("invalid orientation:", paramInt));
  }
  
  public final boolean V() {
    return true;
  }
  
  public final void Z(View paramView) {
    throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
  }
  
  public final void d0(RecyclerView paramRecyclerView) {
    Context context = paramRecyclerView.getContext();
    l20 l201 = this.r;
    float f = l201.a;
    if (f <= 0.0F)
      f = context.getResources().getDimension(2131165496); 
    l201.a = f;
    f = l201.b;
    if (f <= 0.0F)
      f = context.getResources().getDimension(2131165495); 
    l201.b = f;
    C0();
    paramRecyclerView.addOnLayoutChangeListener(this.t);
  }
  
  public final PointF e(int paramInt) {
    return null;
  }
  
  public final void e0(RecyclerView paramRecyclerView) {
    paramRecyclerView.removeOnLayoutChangeListener(this.t);
  }
  
  public final View f0(View paramView, int paramInt, yd1 paramyd1, de1 paramde1) {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual G : ()I
    //   4: ifne -> 10
    //   7: goto -> 240
    //   10: aload_0
    //   11: getfield s : Lgj0;
    //   14: getfield a : I
    //   17: istore #5
    //   19: iload_2
    //   20: iconst_1
    //   21: if_icmpeq -> 109
    //   24: iload_2
    //   25: iconst_2
    //   26: if_icmpeq -> 92
    //   29: iload_2
    //   30: bipush #17
    //   32: if_icmpeq -> 123
    //   35: iload_2
    //   36: bipush #33
    //   38: if_icmpeq -> 114
    //   41: iload_2
    //   42: bipush #66
    //   44: if_icmpeq -> 97
    //   47: iload_2
    //   48: sipush #130
    //   51: if_icmpeq -> 86
    //   54: new java/lang/StringBuilder
    //   57: dup
    //   58: ldc 'Unknown focus request:'
    //   60: invokespecial <init> : (Ljava/lang/String;)V
    //   63: astore_3
    //   64: aload_3
    //   65: iload_2
    //   66: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   69: pop
    //   70: ldc 'CarouselLayoutManager'
    //   72: aload_3
    //   73: invokevirtual toString : ()Ljava/lang/String;
    //   76: invokestatic d : (Ljava/lang/String;Ljava/lang/String;)I
    //   79: pop
    //   80: ldc -2147483648
    //   82: istore_2
    //   83: goto -> 138
    //   86: iload #5
    //   88: iconst_1
    //   89: if_icmpne -> 80
    //   92: iconst_1
    //   93: istore_2
    //   94: goto -> 138
    //   97: iload #5
    //   99: ifne -> 80
    //   102: aload_0
    //   103: invokevirtual T0 : ()Z
    //   106: ifeq -> 92
    //   109: iconst_m1
    //   110: istore_2
    //   111: goto -> 138
    //   114: iload #5
    //   116: iconst_1
    //   117: if_icmpne -> 80
    //   120: goto -> 109
    //   123: iload #5
    //   125: ifne -> 80
    //   128: aload_0
    //   129: invokevirtual T0 : ()Z
    //   132: ifeq -> 109
    //   135: goto -> 92
    //   138: iload_2
    //   139: ldc -2147483648
    //   141: if_icmpne -> 147
    //   144: goto -> 240
    //   147: iconst_0
    //   148: istore #5
    //   150: iconst_0
    //   151: istore #6
    //   153: iload_2
    //   154: iconst_m1
    //   155: if_icmpne -> 227
    //   158: aload_1
    //   159: invokestatic R : (Landroid/view/View;)I
    //   162: ifne -> 168
    //   165: goto -> 240
    //   168: aload_0
    //   169: iconst_0
    //   170: invokevirtual F : (I)Landroid/view/View;
    //   173: invokestatic R : (Landroid/view/View;)I
    //   176: iconst_1
    //   177: isub
    //   178: istore_2
    //   179: iload_2
    //   180: iflt -> 204
    //   183: iload_2
    //   184: aload_0
    //   185: invokevirtual Q : ()I
    //   188: if_icmplt -> 194
    //   191: goto -> 204
    //   194: aload_0
    //   195: getfield s : Lgj0;
    //   198: invokevirtual h : ()I
    //   201: pop
    //   202: aconst_null
    //   203: athrow
    //   204: iload #6
    //   206: istore_2
    //   207: aload_0
    //   208: invokevirtual T0 : ()Z
    //   211: ifeq -> 221
    //   214: aload_0
    //   215: invokevirtual G : ()I
    //   218: iconst_1
    //   219: isub
    //   220: istore_2
    //   221: aload_0
    //   222: iload_2
    //   223: invokevirtual F : (I)Landroid/view/View;
    //   226: areturn
    //   227: aload_1
    //   228: invokestatic R : (Landroid/view/View;)I
    //   231: aload_0
    //   232: invokevirtual Q : ()I
    //   235: iconst_1
    //   236: isub
    //   237: if_icmpne -> 242
    //   240: aconst_null
    //   241: areturn
    //   242: aload_0
    //   243: aload_0
    //   244: invokevirtual G : ()I
    //   247: iconst_1
    //   248: isub
    //   249: invokevirtual F : (I)Landroid/view/View;
    //   252: invokestatic R : (Landroid/view/View;)I
    //   255: iconst_1
    //   256: iadd
    //   257: istore_2
    //   258: iload_2
    //   259: iflt -> 283
    //   262: iload_2
    //   263: aload_0
    //   264: invokevirtual Q : ()I
    //   267: if_icmplt -> 273
    //   270: goto -> 283
    //   273: aload_0
    //   274: getfield s : Lgj0;
    //   277: invokevirtual h : ()I
    //   280: pop
    //   281: aconst_null
    //   282: athrow
    //   283: aload_0
    //   284: invokevirtual T0 : ()Z
    //   287: ifeq -> 296
    //   290: iload #5
    //   292: istore_2
    //   293: goto -> 303
    //   296: aload_0
    //   297: invokevirtual G : ()I
    //   300: iconst_1
    //   301: isub
    //   302: istore_2
    //   303: aload_0
    //   304: iload_2
    //   305: invokevirtual F : (I)Landroid/view/View;
    //   308: areturn
  }
  
  public final void g0(AccessibilityEvent paramAccessibilityEvent) {
    super.g0(paramAccessibilityEvent);
    if (G() > 0) {
      paramAccessibilityEvent.setFromIndex(a.R(F(0)));
      paramAccessibilityEvent.setToIndex(a.R(F(G() - 1)));
    } 
  }
  
  public final void k0(int paramInt1, int paramInt2) {
    Q();
  }
  
  public final void l0() {
    Q();
  }
  
  public final void n0(int paramInt1, int paramInt2) {
    Q();
  }
  
  public final boolean o() {
    return S0();
  }
  
  public final boolean p() {
    return S0() ^ true;
  }
  
  public final void q0(yd1 paramyd1, de1 paramde1) {
    if (paramde1.b() > 0) {
      int i;
      if (S0()) {
        i = this.p;
      } else {
        i = this.q;
      } 
      if (i > 0.0F) {
        T0();
        Z(paramyd1.d(0));
        throw null;
      } 
    } 
    x0(paramyd1);
  }
  
  public final void r0(de1 paramde1) {
    if (G() == 0)
      return; 
    a.R(F(0));
  }
  
  public final int u(de1 paramde1) {
    G();
    return 0;
  }
  
  public final int v(de1 paramde1) {
    return 0;
  }
  
  public final int w(de1 paramde1) {
    return 0;
  }
  
  public final int x(de1 paramde1) {
    G();
    return 0;
  }
  
  public final int y(de1 paramde1) {
    return 0;
  }
  
  public final int z(de1 paramde1) {
    return 0;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\com\google\android\material\carousel\CarouselLayoutManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
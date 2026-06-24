package com.google.android.material.bottomsheet;

import ah;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.AbsSavedState;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import bs0;
import com.google.android.gms.common.internal.Qg.jHxlGgUTadw;
import d1;
import fs;
import g5;
import ga1;
import gi0;
import hd;
import is;
import j0;
import j01;
import j1;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.WeakHashMap;
import k0;
import kb;
import l0;
import m0;
import m22;
import mi2;
import o70;
import q20;
import qv;
import s31;
import sb;
import v22;
import vl1;
import wr0;
import ws0;
import x41;
import x7;
import xg;
import xr0;
import y22;
import yg;
import zg;

public class BottomSheetBehavior<V extends View> extends fs implements xr0 {
  public final ah A = new ah(this);
  
  public final ValueAnimator B;
  
  public final int C;
  
  public int D;
  
  public int E;
  
  public final float F = 0.5F;
  
  public int G;
  
  public final float H = -1.0F;
  
  public boolean I;
  
  public boolean J;
  
  public final boolean K = true;
  
  public final boolean L = true;
  
  public boolean M;
  
  public int N = 4;
  
  public y22 O;
  
  public boolean P;
  
  public int Q;
  
  public boolean R;
  
  public final float S = 0.1F;
  
  public int T;
  
  public int U;
  
  public int V;
  
  public WeakReference W;
  
  public WeakReference X;
  
  public final ArrayList Y = new ArrayList();
  
  public VelocityTracker Z;
  
  public final int a = 0;
  
  public bs0 a0;
  
  public boolean b = true;
  
  public int b0;
  
  public final float c;
  
  public int c0 = -1;
  
  public final int d;
  
  public boolean d0;
  
  public int e;
  
  public HashMap e0;
  
  public boolean f;
  
  public final SparseIntArray f0 = new SparseIntArray();
  
  public int g;
  
  public final xg g0 = new xg(this, 0);
  
  public final int h;
  
  public final ws0 i;
  
  public final ColorStateList j;
  
  public final int k = -1;
  
  public final int l = -1;
  
  public int m;
  
  public final boolean n;
  
  public final boolean o;
  
  public final boolean p;
  
  public final boolean q;
  
  public final boolean r;
  
  public final boolean s;
  
  public final boolean t;
  
  public final boolean u;
  
  public int v;
  
  public int w;
  
  public final boolean x;
  
  public final vl1 y;
  
  public boolean z;
  
  public BottomSheetBehavior() {}
  
  public BottomSheetBehavior(Context paramContext, AttributeSet paramAttributeSet) {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial <init> : ()V
    //   4: aload_0
    //   5: iconst_0
    //   6: putfield a : I
    //   9: aload_0
    //   10: iconst_1
    //   11: putfield b : Z
    //   14: aload_0
    //   15: iconst_m1
    //   16: putfield k : I
    //   19: aload_0
    //   20: iconst_m1
    //   21: putfield l : I
    //   24: aload_0
    //   25: new ah
    //   28: dup
    //   29: aload_0
    //   30: invokespecial <init> : (Lcom/google/android/material/bottomsheet/BottomSheetBehavior;)V
    //   33: putfield A : Lah;
    //   36: aload_0
    //   37: ldc 0.5
    //   39: putfield F : F
    //   42: aload_0
    //   43: ldc -1.0
    //   45: putfield H : F
    //   48: aload_0
    //   49: iconst_1
    //   50: putfield K : Z
    //   53: aload_0
    //   54: iconst_1
    //   55: putfield L : Z
    //   58: aload_0
    //   59: iconst_4
    //   60: putfield N : I
    //   63: aload_0
    //   64: ldc 0.1
    //   66: putfield S : F
    //   69: aload_0
    //   70: new java/util/ArrayList
    //   73: dup
    //   74: invokespecial <init> : ()V
    //   77: putfield Y : Ljava/util/ArrayList;
    //   80: aload_0
    //   81: iconst_m1
    //   82: putfield c0 : I
    //   85: aload_0
    //   86: new android/util/SparseIntArray
    //   89: dup
    //   90: invokespecial <init> : ()V
    //   93: putfield f0 : Landroid/util/SparseIntArray;
    //   96: aload_0
    //   97: new xg
    //   100: dup
    //   101: aload_0
    //   102: iconst_0
    //   103: invokespecial <init> : (Lfs;I)V
    //   106: putfield g0 : Lxg;
    //   109: aload_0
    //   110: aload_1
    //   111: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   114: ldc 2131166244
    //   116: invokevirtual getDimensionPixelSize : (I)I
    //   119: putfield h : I
    //   122: aload_1
    //   123: aload_2
    //   124: getstatic zb1.e : [I
    //   127: invokevirtual obtainStyledAttributes : (Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;
    //   130: astore #7
    //   132: iconst_3
    //   133: istore #4
    //   135: aload #7
    //   137: iconst_3
    //   138: invokevirtual hasValue : (I)Z
    //   141: ifeq -> 155
    //   144: aload_0
    //   145: aload_1
    //   146: aload #7
    //   148: iconst_3
    //   149: invokestatic u : (Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/content/res/ColorStateList;
    //   152: putfield j : Landroid/content/res/ColorStateList;
    //   155: aload #7
    //   157: bipush #22
    //   159: invokevirtual hasValue : (I)Z
    //   162: ifeq -> 181
    //   165: aload_0
    //   166: aload_1
    //   167: aload_2
    //   168: ldc 2130968719
    //   170: ldc 2131952621
    //   172: invokestatic b : (Landroid/content/Context;Landroid/util/AttributeSet;II)Lul1;
    //   175: invokevirtual a : ()Lvl1;
    //   178: putfield y : Lvl1;
    //   181: aload_0
    //   182: getfield y : Lvl1;
    //   185: astore_2
    //   186: aload_2
    //   187: ifnonnull -> 193
    //   190: goto -> 263
    //   193: new ws0
    //   196: dup
    //   197: aload_2
    //   198: invokespecial <init> : (Lvl1;)V
    //   201: astore_2
    //   202: aload_0
    //   203: aload_2
    //   204: putfield i : Lws0;
    //   207: aload_2
    //   208: aload_1
    //   209: invokevirtual k : (Landroid/content/Context;)V
    //   212: aload_0
    //   213: getfield j : Landroid/content/res/ColorStateList;
    //   216: astore_2
    //   217: aload_2
    //   218: ifnull -> 232
    //   221: aload_0
    //   222: getfield i : Lws0;
    //   225: aload_2
    //   226: invokevirtual o : (Landroid/content/res/ColorStateList;)V
    //   229: goto -> 263
    //   232: new android/util/TypedValue
    //   235: dup
    //   236: invokespecial <init> : ()V
    //   239: astore_2
    //   240: aload_1
    //   241: invokevirtual getTheme : ()Landroid/content/res/Resources$Theme;
    //   244: ldc 16842801
    //   246: aload_2
    //   247: iconst_1
    //   248: invokevirtual resolveAttribute : (ILandroid/util/TypedValue;Z)Z
    //   251: pop
    //   252: aload_0
    //   253: getfield i : Lws0;
    //   256: aload_2
    //   257: getfield data : I
    //   260: invokevirtual setTint : (I)V
    //   263: iconst_2
    //   264: newarray float
    //   266: dup
    //   267: iconst_0
    //   268: aload_0
    //   269: invokevirtual x : ()F
    //   272: fastore
    //   273: dup
    //   274: iconst_1
    //   275: fconst_1
    //   276: fastore
    //   277: invokestatic ofFloat : ([F)Landroid/animation/ValueAnimator;
    //   280: astore_2
    //   281: aload_0
    //   282: aload_2
    //   283: putfield B : Landroid/animation/ValueAnimator;
    //   286: aload_2
    //   287: ldc2_w 500
    //   290: invokevirtual setDuration : (J)Landroid/animation/ValueAnimator;
    //   293: pop
    //   294: aload_0
    //   295: getfield B : Landroid/animation/ValueAnimator;
    //   298: new vd
    //   301: dup
    //   302: iconst_1
    //   303: aload_0
    //   304: invokespecial <init> : (ILjava/lang/Object;)V
    //   307: invokevirtual addUpdateListener : (Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V
    //   310: aload_0
    //   311: aload #7
    //   313: iconst_2
    //   314: ldc -1.0
    //   316: invokevirtual getDimension : (IF)F
    //   319: putfield H : F
    //   322: aload #7
    //   324: iconst_0
    //   325: invokevirtual hasValue : (I)Z
    //   328: ifeq -> 342
    //   331: aload_0
    //   332: aload #7
    //   334: iconst_0
    //   335: iconst_m1
    //   336: invokevirtual getDimensionPixelSize : (II)I
    //   339: putfield k : I
    //   342: aload #7
    //   344: iconst_1
    //   345: invokevirtual hasValue : (I)Z
    //   348: ifeq -> 362
    //   351: aload_0
    //   352: aload #7
    //   354: iconst_1
    //   355: iconst_m1
    //   356: invokevirtual getDimensionPixelSize : (II)I
    //   359: putfield l : I
    //   362: aload #7
    //   364: bipush #10
    //   366: invokevirtual peekValue : (I)Landroid/util/TypedValue;
    //   369: astore_2
    //   370: aload_2
    //   371: ifnull -> 395
    //   374: aload_2
    //   375: getfield data : I
    //   378: istore #5
    //   380: iload #5
    //   382: iconst_m1
    //   383: if_icmpne -> 395
    //   386: aload_0
    //   387: iload #5
    //   389: invokevirtual H : (I)V
    //   392: goto -> 407
    //   395: aload_0
    //   396: aload #7
    //   398: bipush #10
    //   400: iconst_m1
    //   401: invokevirtual getDimensionPixelSize : (II)I
    //   404: invokevirtual H : (I)V
    //   407: aload_0
    //   408: aload #7
    //   410: bipush #9
    //   412: iconst_0
    //   413: invokevirtual getBoolean : (IZ)Z
    //   416: invokevirtual G : (Z)V
    //   419: aload_0
    //   420: aload #7
    //   422: bipush #14
    //   424: iconst_0
    //   425: invokevirtual getBoolean : (IZ)Z
    //   428: putfield n : Z
    //   431: aload #7
    //   433: bipush #7
    //   435: iconst_1
    //   436: invokevirtual getBoolean : (IZ)Z
    //   439: istore #6
    //   441: aload_0
    //   442: getfield b : Z
    //   445: iload #6
    //   447: if_icmpne -> 453
    //   450: goto -> 514
    //   453: aload_0
    //   454: iload #6
    //   456: putfield b : Z
    //   459: aload_0
    //   460: getfield W : Ljava/lang/ref/WeakReference;
    //   463: ifnull -> 470
    //   466: aload_0
    //   467: invokevirtual w : ()V
    //   470: aload_0
    //   471: getfield b : Z
    //   474: ifeq -> 489
    //   477: aload_0
    //   478: getfield N : I
    //   481: bipush #6
    //   483: if_icmpne -> 489
    //   486: goto -> 495
    //   489: aload_0
    //   490: getfield N : I
    //   493: istore #4
    //   495: aload_0
    //   496: iload #4
    //   498: invokevirtual J : (I)V
    //   501: aload_0
    //   502: aload_0
    //   503: getfield N : I
    //   506: iconst_1
    //   507: invokevirtual N : (IZ)V
    //   510: aload_0
    //   511: invokevirtual M : ()V
    //   514: aload_0
    //   515: aload #7
    //   517: bipush #13
    //   519: iconst_0
    //   520: invokevirtual getBoolean : (IZ)Z
    //   523: putfield J : Z
    //   526: aload_0
    //   527: aload #7
    //   529: iconst_4
    //   530: iconst_1
    //   531: invokevirtual getBoolean : (IZ)Z
    //   534: putfield K : Z
    //   537: aload_0
    //   538: aload #7
    //   540: iconst_5
    //   541: iconst_1
    //   542: invokevirtual getBoolean : (IZ)Z
    //   545: putfield L : Z
    //   548: aload_0
    //   549: aload #7
    //   551: bipush #11
    //   553: iconst_0
    //   554: invokevirtual getInt : (II)I
    //   557: putfield a : I
    //   560: aload #7
    //   562: bipush #8
    //   564: ldc 0.5
    //   566: invokevirtual getFloat : (IF)F
    //   569: fstore_3
    //   570: fload_3
    //   571: fconst_0
    //   572: fcmpg
    //   573: ifle -> 832
    //   576: fload_3
    //   577: fconst_1
    //   578: fcmpl
    //   579: ifge -> 832
    //   582: aload_0
    //   583: fload_3
    //   584: putfield F : F
    //   587: aload_0
    //   588: getfield W : Ljava/lang/ref/WeakReference;
    //   591: ifnull -> 608
    //   594: aload_0
    //   595: fconst_1
    //   596: fload_3
    //   597: fsub
    //   598: aload_0
    //   599: getfield V : I
    //   602: i2f
    //   603: fmul
    //   604: f2i
    //   605: putfield E : I
    //   608: aload #7
    //   610: bipush #6
    //   612: invokevirtual peekValue : (I)Landroid/util/TypedValue;
    //   615: astore_2
    //   616: aload_2
    //   617: ifnull -> 666
    //   620: aload_2
    //   621: getfield type : I
    //   624: bipush #16
    //   626: if_icmpne -> 666
    //   629: aload_2
    //   630: getfield data : I
    //   633: istore #4
    //   635: iload #4
    //   637: iflt -> 658
    //   640: aload_0
    //   641: iload #4
    //   643: putfield C : I
    //   646: aload_0
    //   647: aload_0
    //   648: getfield N : I
    //   651: iconst_1
    //   652: invokevirtual N : (IZ)V
    //   655: goto -> 696
    //   658: ldc_w 'offset must be greater than or equal to 0'
    //   661: invokestatic l : (Ljava/lang/String;)V
    //   664: aconst_null
    //   665: athrow
    //   666: aload #7
    //   668: bipush #6
    //   670: iconst_0
    //   671: invokevirtual getDimensionPixelOffset : (II)I
    //   674: istore #4
    //   676: iload #4
    //   678: iflt -> 824
    //   681: aload_0
    //   682: iload #4
    //   684: putfield C : I
    //   687: aload_0
    //   688: aload_0
    //   689: getfield N : I
    //   692: iconst_1
    //   693: invokevirtual N : (IZ)V
    //   696: aload_0
    //   697: aload #7
    //   699: bipush #12
    //   701: sipush #500
    //   704: invokevirtual getInt : (II)I
    //   707: putfield d : I
    //   710: aload_0
    //   711: aload #7
    //   713: bipush #18
    //   715: iconst_0
    //   716: invokevirtual getBoolean : (IZ)Z
    //   719: putfield o : Z
    //   722: aload_0
    //   723: aload #7
    //   725: bipush #19
    //   727: iconst_0
    //   728: invokevirtual getBoolean : (IZ)Z
    //   731: putfield p : Z
    //   734: aload_0
    //   735: aload #7
    //   737: bipush #20
    //   739: iconst_0
    //   740: invokevirtual getBoolean : (IZ)Z
    //   743: putfield q : Z
    //   746: aload_0
    //   747: aload #7
    //   749: bipush #21
    //   751: iconst_1
    //   752: invokevirtual getBoolean : (IZ)Z
    //   755: putfield r : Z
    //   758: aload_0
    //   759: aload #7
    //   761: bipush #15
    //   763: iconst_0
    //   764: invokevirtual getBoolean : (IZ)Z
    //   767: putfield s : Z
    //   770: aload_0
    //   771: aload #7
    //   773: bipush #16
    //   775: iconst_0
    //   776: invokevirtual getBoolean : (IZ)Z
    //   779: putfield t : Z
    //   782: aload_0
    //   783: aload #7
    //   785: bipush #17
    //   787: iconst_0
    //   788: invokevirtual getBoolean : (IZ)Z
    //   791: putfield u : Z
    //   794: aload_0
    //   795: aload #7
    //   797: bipush #24
    //   799: iconst_1
    //   800: invokevirtual getBoolean : (IZ)Z
    //   803: putfield x : Z
    //   806: aload #7
    //   808: invokevirtual recycle : ()V
    //   811: aload_0
    //   812: aload_1
    //   813: invokestatic get : (Landroid/content/Context;)Landroid/view/ViewConfiguration;
    //   816: invokevirtual getScaledMaximumFlingVelocity : ()I
    //   819: i2f
    //   820: putfield c : F
    //   823: return
    //   824: ldc_w 'offset must be greater than or equal to 0'
    //   827: invokestatic l : (Ljava/lang/String;)V
    //   830: aconst_null
    //   831: athrow
    //   832: ldc_w 'ratio must be a float value between 0 and 1'
    //   835: invokestatic l : (Ljava/lang/String;)V
    //   838: aconst_null
    //   839: athrow
  }
  
  public static View A(View paramView) {
    if (paramView.getVisibility() == 0) {
      if (paramView.isNestedScrollingEnabled())
        return paramView; 
      if (paramView instanceof ViewGroup) {
        ViewGroup viewGroup = (ViewGroup)paramView;
        int i = viewGroup.getChildCount();
        for (byte b = 0; b < i; b++) {
          View view = A(viewGroup.getChildAt(b));
          if (view != null)
            return view; 
        } 
      } 
    } 
    return null;
  }
  
  public static BottomSheetBehavior B(View paramView) {
    ViewGroup.LayoutParams layoutParams = paramView.getLayoutParams();
    if (layoutParams instanceof is) {
      fs fs1 = ((is)layoutParams).a;
      if (fs1 instanceof BottomSheetBehavior)
        return (BottomSheetBehavior)fs1; 
      l0.l("The view is not associated with BottomSheetBehavior");
      return null;
    } 
    l0.l("The view is not a child of CoordinatorLayout");
    return null;
  }
  
  public static int C(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    paramInt2 = ViewGroup.getChildMeasureSpec(paramInt1, paramInt2, paramInt4);
    if (paramInt3 == -1)
      return paramInt2; 
    paramInt1 = View.MeasureSpec.getMode(paramInt2);
    paramInt2 = View.MeasureSpec.getSize(paramInt2);
    if (paramInt1 != 1073741824) {
      if (paramInt2 != 0)
        paramInt3 = Math.min(paramInt2, paramInt3); 
      return View.MeasureSpec.makeMeasureSpec(paramInt3, -2147483648);
    } 
    return View.MeasureSpec.makeMeasureSpec(Math.min(paramInt2, paramInt3), 1073741824);
  }
  
  public final int D() {
    int i;
    if (this.b)
      return this.D; 
    if (this.r) {
      i = 0;
    } else {
      i = this.w;
    } 
    return Math.max(this.C, i);
  }
  
  public final int E(int paramInt) {
    if (paramInt != 3) {
      if (paramInt != 4) {
        if (paramInt != 5) {
          if (paramInt == 6)
            return this.E; 
          l0.l(ga1.i("Invalid state to get top offset: ", paramInt));
          return 0;
        } 
        return this.V;
      } 
      return this.G;
    } 
    return D();
  }
  
  public final boolean F() {
    WeakReference weakReference = this.W;
    if (weakReference != null && weakReference.get() != null) {
      int[] arrayOfInt = new int[2];
      ((View)this.W.get()).getLocationOnScreen(arrayOfInt);
      if (arrayOfInt[1] == 0)
        return true; 
    } 
    return false;
  }
  
  public final void G(boolean paramBoolean) {
    if (this.I != paramBoolean) {
      this.I = paramBoolean;
      if (!paramBoolean && this.N == 5)
        I(4); 
      M();
    } 
  }
  
  public final void H(int paramInt) {
    boolean bool = this.f;
    if (paramInt == -1) {
      if (!bool) {
        this.f = true;
      } else {
        return;
      } 
    } else if (bool || this.e != paramInt) {
      this.f = false;
      this.e = Math.max(0, paramInt);
    } else {
      return;
    } 
    P();
  }
  
  public final void I(int paramInt) {
    int i;
    if (paramInt == 1 || paramInt == 2) {
      String str;
      StringBuilder stringBuilder = new StringBuilder("STATE_");
      if (paramInt == 1) {
        str = "DRAGGING";
      } else {
        str = "SETTLING";
      } 
      throw new IllegalArgumentException(x41.n(stringBuilder, str, " should not be set externally."));
    } 
    if (!this.I && paramInt == 5) {
      StringBuilder stringBuilder = new StringBuilder("Cannot set state: ");
      stringBuilder.append(paramInt);
      Log.w("BottomSheetBehavior", stringBuilder.toString());
      return;
    } 
    if (paramInt == 6 && this.b && E(paramInt) <= this.D) {
      i = 3;
    } else {
      i = paramInt;
    } 
    WeakReference weakReference = this.W;
    if (weakReference == null || weakReference.get() == null) {
      J(paramInt);
      return;
    } 
    View view = this.W.get();
    x7 x7 = new x7(this, view, i);
    ViewParent viewParent = view.getParent();
    if (viewParent != null && viewParent.isLayoutRequested() && view.isAttachedToWindow()) {
      view.post((Runnable)x7);
      return;
    } 
    x7.run();
  }
  
  public final void J(int paramInt) {
    if (this.N != paramInt) {
      this.N = paramInt;
      if (paramInt != 4 && paramInt != 3 && paramInt != 6)
        boolean bool = this.I; 
      WeakReference<View> weakReference = this.W;
      if (weakReference != null) {
        View view = weakReference.get();
        if (view != null) {
          byte b = 0;
          if (paramInt == 3) {
            O(true);
          } else if (paramInt == 6 || paramInt == 5 || paramInt == 4) {
            O(false);
          } 
          N(paramInt, true);
          while (true) {
            ArrayList<yg> arrayList = this.Y;
            if (b < arrayList.size()) {
              ((yg)arrayList.get(b)).c(view, paramInt);
              b++;
              continue;
            } 
            M();
            return;
          } 
        } 
      } 
    } 
  }
  
  public final boolean K(View paramView, float paramFloat) {
    if (this.J)
      return true; 
    if (paramView.getTop() < this.G)
      return false; 
    int i = y();
    float f = paramView.getTop();
    return (Math.abs(paramFloat * this.S + f - this.G) / i > 0.5F);
  }
  
  public final void L(View paramView, int paramInt, boolean paramBoolean) {
    int i = E(paramInt);
    y22 y221 = this.O;
    if (y221 != null)
      if (paramBoolean) {
        if (y221.n(paramView.getLeft(), i)) {
          J(2);
          N(paramInt, true);
          this.A.c(paramInt);
          return;
        } 
      } else {
        int j = paramView.getLeft();
        y221.r = paramView;
        y221.c = -1;
        paramBoolean = y221.h(j, i, 0, 0);
        if (!paramBoolean && y221.a == 0 && y221.r != null)
          y221.r = null; 
        if (paramBoolean) {
          J(2);
          N(paramInt, true);
          this.A.c(paramInt);
          return;
        } 
      }  
    J(paramInt);
  }
  
  public final void M() {
    WeakReference<View> weakReference = this.W;
    if (weakReference != null) {
      View view = weakReference.get();
      if (view != null) {
        v22.k(view, 524288);
        v22.h(view, 0);
        v22.k(view, 262144);
        v22.h(view, 0);
        v22.k(view, 1048576);
        v22.h(view, 0);
        SparseIntArray sparseIntArray = this.f0;
        int i = sparseIntArray.get(0, -1);
        if (i != -1) {
          v22.k(view, i);
          v22.h(view, 0);
          sparseIntArray.delete(0);
        } 
        boolean bool = this.b;
        byte b = 6;
        if (!bool && this.N != 6) {
          String str = view.getResources().getString(2131886259);
          mi2 mi2 = new mi2(6, 2, this);
          ArrayList<m0> arrayList = v22.f(view);
          for (i = 0; i < arrayList.size(); i++) {
            if (TextUtils.equals(str, ((AccessibilityNodeInfo.AccessibilityAction)((m0)arrayList.get(i)).a).getLabel())) {
              i = ((m0)arrayList.get(i)).a();
              break label70;
            } 
          } 
          byte b1 = 0;
          i = -1;
          label70: while (true) {
            int[] arrayOfInt = v22.d;
            if (b1 < 32 && i == -1) {
              int k = arrayOfInt[b1];
              byte b2 = 0;
              int j = 1;
              while (b2 < arrayList.size()) {
                byte b3;
                if (((m0)arrayList.get(b2)).a() != k) {
                  b3 = 1;
                } else {
                  b3 = 0;
                } 
                j &= b3;
                b2++;
              } 
              if (j != 0)
                i = k; 
              b1++;
              continue;
            } 
            break;
          } 
          if (i != -1) {
            k0 k01;
            m0 m0 = new m0(null, i, str, (d1)mi2, null);
            View.AccessibilityDelegate accessibilityDelegate = v22.d(view);
            if (accessibilityDelegate == null) {
              accessibilityDelegate = null;
            } else if (accessibilityDelegate instanceof j0) {
              k01 = ((j0)accessibilityDelegate).a;
            } else {
              k01 = new k0((View.AccessibilityDelegate)k01);
            } 
            k0 k02 = k01;
            if (k01 == null)
              k02 = new k0(); 
            v22.n(view, k02);
            v22.k(view, m0.a());
            v22.f(view).add(m0);
            v22.h(view, 0);
          } 
          sparseIntArray.put(0, i);
        } 
        if (this.I && this.N != 5)
          v22.l(view, m0.j, (d1)new mi2(5, 2, this)); 
        i = this.N;
        if (i != 3) {
          if (i != 4) {
            if (i == 6) {
              v22.l(view, m0.i, (d1)new mi2(4, 2, this));
              v22.l(view, m0.h, (d1)new mi2(3, 2, this));
              return;
            } 
          } else {
            if (this.b)
              b = 3; 
            v22.l(view, m0.h, (d1)new mi2(b, 2, this));
            return;
          } 
        } else {
          if (this.b)
            b = 4; 
          v22.l(view, m0.i, (d1)new mi2(b, 2, this));
        } 
      } 
    } 
  }
  
  public final void N(int paramInt, boolean paramBoolean) {
    if (paramInt != 2) {
      boolean bool;
      if (this.N == 3 && (this.x || F())) {
        bool = true;
      } else {
        bool = false;
      } 
      if (this.z != bool) {
        ws0 ws01 = this.i;
        if (ws01 != null) {
          this.z = bool;
          ValueAnimator valueAnimator = this.B;
          float f = 1.0F;
          if (paramBoolean && valueAnimator != null) {
            if (valueAnimator.isRunning()) {
              valueAnimator.reverse();
              return;
            } 
            float f1 = ws01.c.j;
            if (bool)
              f = x(); 
            valueAnimator.setFloatValues(new float[] { f1, f });
            valueAnimator.start();
            return;
          } 
          if (valueAnimator != null && valueAnimator.isRunning())
            valueAnimator.cancel(); 
          if (this.z)
            f = x(); 
          ws01.p(f);
        } 
      } 
    } 
  }
  
  public final void O(boolean paramBoolean) {
    WeakReference<View> weakReference = this.W;
    if (weakReference != null) {
      ViewParent viewParent = ((View)weakReference.get()).getParent();
      if (viewParent instanceof CoordinatorLayout) {
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout)viewParent;
        int i = coordinatorLayout.getChildCount();
        if (paramBoolean)
          if (this.e0 == null) {
            this.e0 = new HashMap<Object, Object>(i);
          } else {
            return;
          }  
        for (byte b = 0; b < i; b++) {
          View view = coordinatorLayout.getChildAt(b);
          if (view != this.W.get() && paramBoolean)
            this.e0.put(view, Integer.valueOf(view.getImportantForAccessibility())); 
        } 
        if (!paramBoolean)
          this.e0 = null; 
      } 
    } 
  }
  
  public final void P() {
    if (this.W != null) {
      w();
      if (this.N == 4) {
        View view = this.W.get();
        if (view != null)
          view.requestLayout(); 
      } 
    } 
  }
  
  public final void a() {
    bs0 bs01 = this.a0;
    if (bs01 == null)
      return; 
    int j = ((wr0)bs01).d;
    int i = ((wr0)bs01).c;
    kb kb = ((wr0)bs01).f;
    ((wr0)bs01).f = null;
    byte b = 4;
    if (kb != null) {
      float f = kb.c;
      if (Build.VERSION.SDK_INT >= 34) {
        if (this.I) {
          j1 j1 = new j1(4, this);
          View view = ((wr0)bs01).b;
          float f1 = view.getHeight();
          float f2 = view.getScaleY();
          ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(view, View.TRANSLATION_Y, new float[] { f2 * f1 });
          objectAnimator.setInterpolator((TimeInterpolator)new o70(1));
          objectAnimator.setDuration(g5.c(f, i, j));
          objectAnimator.addListener((Animator.AnimatorListener)new j1(10, bs01));
          objectAnimator.addListener((Animator.AnimatorListener)j1);
          objectAnimator.start();
          return;
        } 
        AnimatorSet animatorSet = bs01.a();
        animatorSet.setDuration(g5.c(f, i, j));
        animatorSet.start();
        I(4);
        return;
      } 
    } 
    if (this.I)
      b = 5; 
    I(b);
  }
  
  public final void b(kb paramkb) {
    bs0 bs01 = this.a0;
    if (bs01 != null) {
      if (((wr0)bs01).f == null)
        Log.w("MaterialBackHelper", "Must call startBackProgress() before updateBackProgress()"); 
      kb kb1 = ((wr0)bs01).f;
      ((wr0)bs01).f = paramkb;
      if (kb1 != null) {
        bs01.b(paramkb.c);
        return;
      } 
    } 
  }
  
  public final void c(kb paramkb) {
    bs0 bs01 = this.a0;
    if (bs01 == null)
      return; 
    ((wr0)bs01).f = paramkb;
  }
  
  public final void d() {
    bs0 bs01 = this.a0;
    if (bs01 != null) {
      if (((wr0)bs01).f == null)
        Log.w(jHxlGgUTadw.vegLMAsfby, "Must call startBackProgress() and updateBackProgress() before cancelBackProgress()"); 
      kb kb = ((wr0)bs01).f;
      ((wr0)bs01).f = null;
      if (kb != null) {
        AnimatorSet animatorSet = bs01.a();
        animatorSet.setDuration(((wr0)bs01).e);
        animatorSet.start();
        return;
      } 
    } 
  }
  
  public final void g(is paramis) {
    this.W = null;
    this.O = null;
    this.a0 = null;
  }
  
  public final void j() {
    this.W = null;
    this.O = null;
    this.a0 = null;
  }
  
  public final boolean k(CoordinatorLayout paramCoordinatorLayout, View paramView, MotionEvent paramMotionEvent) {
    if (!paramView.isShown() || !this.K) {
      this.P = true;
      return false;
    } 
    int i = paramMotionEvent.getActionMasked();
    View view = null;
    if (i == 0) {
      this.b0 = -1;
      this.c0 = -1;
      VelocityTracker velocityTracker = this.Z;
      if (velocityTracker != null) {
        velocityTracker.recycle();
        this.Z = null;
      } 
    } 
    if (this.Z == null)
      this.Z = VelocityTracker.obtain(); 
    this.Z.addMovement(paramMotionEvent);
    if (i != 0) {
      if (i == 1 || i == 3) {
        this.d0 = false;
        this.b0 = -1;
        if (this.P) {
          this.P = false;
          return false;
        } 
      } 
    } else {
      boolean bool;
      int k = (int)paramMotionEvent.getX();
      int j = (int)paramMotionEvent.getY();
      this.c0 = j;
      if (this.N != 2) {
        WeakReference<View> weakReference1 = this.X;
        if (weakReference1 != null) {
          View view1 = weakReference1.get();
        } else {
          weakReference1 = null;
        } 
        if (weakReference1 != null && paramCoordinatorLayout.p((View)weakReference1, k, j)) {
          this.b0 = paramMotionEvent.getPointerId(paramMotionEvent.getActionIndex());
          this.d0 = true;
        } 
      } 
      if (this.b0 == -1 && !paramCoordinatorLayout.p(paramView, k, this.c0)) {
        bool = true;
      } else {
        bool = false;
      } 
      this.P = bool;
    } 
    if (!this.P) {
      y22 y221 = this.O;
      if (y221 != null && y221.o(paramMotionEvent))
        return true; 
    } 
    WeakReference<View> weakReference = this.X;
    paramView = view;
    if (weakReference != null)
      paramView = weakReference.get(); 
    if (i == 2 && paramView != null && !this.P && this.N != 1 && !paramCoordinatorLayout.p(paramView, (int)paramMotionEvent.getX(), (int)paramMotionEvent.getY()) && this.O != null) {
      i = this.c0;
      if (i != -1 && Math.abs(i - paramMotionEvent.getY()) > this.O.b)
        return true; 
    } 
    return false;
  }
  
  public final boolean l(CoordinatorLayout paramCoordinatorLayout, View paramView, int paramInt) {
    if (paramCoordinatorLayout.getFitsSystemWindows() && !paramView.getFitsSystemWindows())
      paramView.setFitsSystemWindows(true); 
    WeakReference weakReference = this.W;
    boolean bool = false;
    if (weakReference == null) {
      boolean bool1;
      this.g = paramCoordinatorLayout.getResources().getDimensionPixelSize(2131165355);
      if (Build.VERSION.SDK_INT >= 29 && !this.n && !this.f) {
        bool1 = true;
      } else {
        bool1 = false;
      } 
      if (this.o || this.p || this.q || this.s || this.t || this.u || bool1) {
        sb sb = new sb(this, bool1);
        int n = paramView.getPaddingStart();
        paramView.getPaddingTop();
        int i1 = paramView.getPaddingEnd();
        int m = paramView.getPaddingBottom();
        Object object = new Object();
        ((q20)object).a = n;
        ((q20)object).b = i1;
        ((q20)object).c = m;
        object = new j01(sb, object, 15, false);
        WeakHashMap weakHashMap = v22.a;
        m22.c(paramView, (s31)object);
        if (paramView.isAttachedToWindow()) {
          paramView.requestApplyInsets();
        } else {
          paramView.addOnAttachStateChangeListener((View.OnAttachStateChangeListener)new Object());
        } 
      } 
      v22.p(paramView, (hd)new gi0(paramView));
      this.W = new WeakReference<View>(paramView);
      this.a0 = new bs0(paramView);
      ws0 ws01 = this.i;
      if (ws01 != null) {
        paramView.setBackground((Drawable)ws01);
        float f2 = this.H;
        float f1 = f2;
        if (f2 == -1.0F)
          f1 = paramView.getElevation(); 
        ws01.n(f1);
      } else {
        ColorStateList colorStateList = this.j;
        if (colorStateList != null)
          paramView.setBackgroundTintList(colorStateList); 
      } 
      M();
      if (paramView.getImportantForAccessibility() == 0)
        paramView.setImportantForAccessibility(1); 
    } 
    if (this.O == null)
      this.O = new y22(paramCoordinatorLayout.getContext(), paramCoordinatorLayout, (qv)this.g0); 
    int i = paramView.getTop();
    paramCoordinatorLayout.r(paramView, paramInt);
    this.U = paramCoordinatorLayout.getWidth();
    this.V = paramCoordinatorLayout.getHeight();
    int k = paramView.getHeight();
    this.T = k;
    paramInt = this.V;
    int j = this.w;
    if (paramInt - k < j) {
      boolean bool1 = this.r;
      k = this.l;
      if (bool1) {
        if (k != -1)
          paramInt = Math.min(paramInt, k); 
        this.T = paramInt;
      } else {
        paramInt -= j;
        if (k != -1)
          paramInt = Math.min(paramInt, k); 
        this.T = paramInt;
      } 
    } 
    this.D = Math.max(0, this.V - this.T);
    float f = this.V;
    this.E = (int)((1.0F - this.F) * f);
    w();
    paramInt = this.N;
    if (paramInt == 3) {
      paramInt = D();
      WeakHashMap weakHashMap = v22.a;
      paramView.offsetTopAndBottom(paramInt);
    } else if (paramInt == 6) {
      paramInt = this.E;
      WeakHashMap weakHashMap = v22.a;
      paramView.offsetTopAndBottom(paramInt);
    } else if (this.I && paramInt == 5) {
      paramInt = this.V;
      WeakHashMap weakHashMap = v22.a;
      paramView.offsetTopAndBottom(paramInt);
    } else if (paramInt == 4) {
      paramInt = this.G;
      WeakHashMap weakHashMap = v22.a;
      paramView.offsetTopAndBottom(paramInt);
    } else if (paramInt == 1 || paramInt == 2) {
      paramInt = paramView.getTop();
      WeakHashMap weakHashMap = v22.a;
      paramView.offsetTopAndBottom(i - paramInt);
    } 
    N(this.N, false);
    this.X = new WeakReference<View>(A(paramView));
    paramInt = bool;
    while (true) {
      ArrayList<yg> arrayList = this.Y;
      if (paramInt < arrayList.size()) {
        ((yg)arrayList.get(paramInt)).a(paramView);
        paramInt++;
        continue;
      } 
      return true;
    } 
  }
  
  public final boolean m(CoordinatorLayout paramCoordinatorLayout, View paramView, int paramInt1, int paramInt2, int paramInt3) {
    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams)paramView.getLayoutParams();
    int i = paramCoordinatorLayout.getPaddingLeft();
    paramInt2 = C(paramInt1, paramCoordinatorLayout.getPaddingRight() + i + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + paramInt2, this.k, marginLayoutParams.width);
    paramInt1 = paramCoordinatorLayout.getPaddingTop();
    paramView.measure(paramInt2, C(paramInt3, paramCoordinatorLayout.getPaddingBottom() + paramInt1 + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, this.l, marginLayoutParams.height));
    return true;
  }
  
  public final boolean n(View paramView) {
    WeakReference<View> weakReference = this.X;
    return !(weakReference == null || paramView != weakReference.get() || this.N == 3 || this.M);
  }
  
  public final void o(CoordinatorLayout paramCoordinatorLayout, View paramView1, View paramView2, int paramInt1, int paramInt2, int[] paramArrayOfint, int paramInt3) {
    if (paramInt3 != 1) {
      WeakReference<View> weakReference = this.X;
      if (weakReference != null) {
        View view = weakReference.get();
      } else {
        weakReference = null;
      } 
      if (paramView2 == weakReference) {
        WeakHashMap weakHashMap;
        int i = paramView1.getTop();
        paramInt3 = i - paramInt2;
        boolean bool1 = this.K;
        boolean bool2 = this.L;
        if (paramInt2 > 0) {
          if (!this.R && !bool2 && paramView2 == weakReference && paramView2.canScrollVertically(1)) {
            this.M = true;
            return;
          } 
          if (paramInt3 < D()) {
            paramInt1 = i - D();
            paramArrayOfint[1] = paramInt1;
            paramInt1 = -paramInt1;
            weakHashMap = v22.a;
            paramView1.offsetTopAndBottom(paramInt1);
            J(3);
          } else {
            if (!bool1)
              return; 
            paramArrayOfint[1] = paramInt2;
            paramInt1 = -paramInt2;
            weakHashMap = v22.a;
            paramView1.offsetTopAndBottom(paramInt1);
            J(1);
          } 
        } else if (paramInt2 < 0) {
          boolean bool = paramView2.canScrollVertically(-1);
          if (!this.R && !bool2 && paramView2 == weakHashMap && bool) {
            this.M = true;
            return;
          } 
          if (!bool) {
            paramInt1 = this.G;
            if (paramInt3 <= paramInt1 || this.I) {
              if (!bool1)
                return; 
              paramArrayOfint[1] = paramInt2;
              paramInt1 = -paramInt2;
              weakHashMap = v22.a;
              paramView1.offsetTopAndBottom(paramInt1);
              J(1);
            } else {
              paramInt1 = i - paramInt1;
              paramArrayOfint[1] = paramInt1;
              paramInt1 = -paramInt1;
              weakHashMap = v22.a;
              paramView1.offsetTopAndBottom(paramInt1);
              J(4);
            } 
          } 
        } 
        z(paramView1.getTop());
        this.Q = paramInt2;
        this.R = true;
        this.M = false;
        return;
      } 
    } 
  }
  
  public final void p(CoordinatorLayout paramCoordinatorLayout, View paramView, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfint) {}
  
  public final void r(CoordinatorLayout paramCoordinatorLayout, View paramView, Parcelable paramParcelable) {
    zg zg = (zg)paramParcelable;
    int i = this.a;
    if (i != 0) {
      if (i == -1 || (i & 0x1) == 1)
        this.e = zg.f; 
      if (i == -1 || (i & 0x2) == 2)
        this.b = zg.g; 
      if (i == -1 || (i & 0x4) == 4)
        this.I = zg.h; 
      if (i == -1 || (i & 0x8) == 8)
        this.J = zg.i; 
    } 
    i = zg.e;
    if (i == 1 || i == 2) {
      this.N = 4;
      return;
    } 
    this.N = i;
  }
  
  public final Parcelable s(CoordinatorLayout paramCoordinatorLayout, View paramView) {
    AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
    return (Parcelable)new zg(this);
  }
  
  public final boolean t(CoordinatorLayout paramCoordinatorLayout, View paramView1, View paramView2, int paramInt1, int paramInt2) {
    this.Q = 0;
    this.R = false;
    return ((paramInt1 & 0x2) != 0);
  }
  
  public final void u(CoordinatorLayout paramCoordinatorLayout, View paramView1, View paramView2, int paramInt) {
    // Byte code:
    //   0: aload_2
    //   1: invokevirtual getTop : ()I
    //   4: istore #7
    //   6: aload_0
    //   7: invokevirtual D : ()I
    //   10: istore #6
    //   12: iconst_3
    //   13: istore #4
    //   15: iload #7
    //   17: iload #6
    //   19: if_icmpne -> 28
    //   22: aload_0
    //   23: iconst_3
    //   24: invokevirtual J : (I)V
    //   27: return
    //   28: aload_0
    //   29: getfield X : Ljava/lang/ref/WeakReference;
    //   32: astore_1
    //   33: aload_1
    //   34: ifnull -> 308
    //   37: aload_3
    //   38: aload_1
    //   39: invokevirtual get : ()Ljava/lang/Object;
    //   42: if_acmpne -> 308
    //   45: aload_0
    //   46: getfield R : Z
    //   49: ifne -> 55
    //   52: goto -> 308
    //   55: aload_0
    //   56: getfield Q : I
    //   59: ifle -> 86
    //   62: aload_0
    //   63: getfield b : Z
    //   66: ifeq -> 72
    //   69: goto -> 295
    //   72: aload_2
    //   73: invokevirtual getTop : ()I
    //   76: aload_0
    //   77: getfield E : I
    //   80: if_icmple -> 295
    //   83: goto -> 291
    //   86: aload_0
    //   87: getfield I : Z
    //   90: ifeq -> 148
    //   93: aload_0
    //   94: getfield Z : Landroid/view/VelocityTracker;
    //   97: astore_1
    //   98: aload_1
    //   99: ifnonnull -> 108
    //   102: fconst_0
    //   103: fstore #5
    //   105: goto -> 132
    //   108: aload_1
    //   109: sipush #1000
    //   112: aload_0
    //   113: getfield c : F
    //   116: invokevirtual computeCurrentVelocity : (IF)V
    //   119: aload_0
    //   120: getfield Z : Landroid/view/VelocityTracker;
    //   123: aload_0
    //   124: getfield b0 : I
    //   127: invokevirtual getYVelocity : (I)F
    //   130: fstore #5
    //   132: aload_0
    //   133: aload_2
    //   134: fload #5
    //   136: invokevirtual K : (Landroid/view/View;F)Z
    //   139: ifeq -> 148
    //   142: iconst_5
    //   143: istore #4
    //   145: goto -> 295
    //   148: aload_0
    //   149: getfield Q : I
    //   152: ifne -> 249
    //   155: aload_2
    //   156: invokevirtual getTop : ()I
    //   159: istore #6
    //   161: aload_0
    //   162: getfield b : Z
    //   165: ifeq -> 194
    //   168: iload #6
    //   170: aload_0
    //   171: getfield D : I
    //   174: isub
    //   175: invokestatic abs : (I)I
    //   178: iload #6
    //   180: aload_0
    //   181: getfield G : I
    //   184: isub
    //   185: invokestatic abs : (I)I
    //   188: if_icmpge -> 256
    //   191: goto -> 295
    //   194: aload_0
    //   195: getfield E : I
    //   198: istore #7
    //   200: iload #6
    //   202: iload #7
    //   204: if_icmpge -> 225
    //   207: iload #6
    //   209: iload #6
    //   211: aload_0
    //   212: getfield G : I
    //   215: isub
    //   216: invokestatic abs : (I)I
    //   219: if_icmpge -> 291
    //   222: goto -> 295
    //   225: iload #6
    //   227: iload #7
    //   229: isub
    //   230: invokestatic abs : (I)I
    //   233: iload #6
    //   235: aload_0
    //   236: getfield G : I
    //   239: isub
    //   240: invokestatic abs : (I)I
    //   243: if_icmpge -> 256
    //   246: goto -> 291
    //   249: aload_0
    //   250: getfield b : Z
    //   253: ifeq -> 262
    //   256: iconst_4
    //   257: istore #4
    //   259: goto -> 295
    //   262: aload_2
    //   263: invokevirtual getTop : ()I
    //   266: istore #4
    //   268: iload #4
    //   270: aload_0
    //   271: getfield E : I
    //   274: isub
    //   275: invokestatic abs : (I)I
    //   278: iload #4
    //   280: aload_0
    //   281: getfield G : I
    //   284: isub
    //   285: invokestatic abs : (I)I
    //   288: if_icmpge -> 256
    //   291: bipush #6
    //   293: istore #4
    //   295: aload_0
    //   296: aload_2
    //   297: iload #4
    //   299: iconst_0
    //   300: invokevirtual L : (Landroid/view/View;IZ)V
    //   303: aload_0
    //   304: iconst_0
    //   305: putfield R : Z
    //   308: return
  }
  
  public final boolean v(CoordinatorLayout paramCoordinatorLayout, View paramView, MotionEvent paramMotionEvent) {
    if (!paramView.isShown())
      return false; 
    int i = paramMotionEvent.getActionMasked();
    int j = this.N;
    if (j == 1 && i == 0)
      return true; 
    y22 y221 = this.O;
    boolean bool = this.K;
    if (y221 != null && (bool || j == 1))
      y221.i(paramMotionEvent); 
    if (i == 0) {
      this.b0 = -1;
      this.c0 = -1;
      VelocityTracker velocityTracker = this.Z;
      if (velocityTracker != null) {
        velocityTracker.recycle();
        this.Z = null;
      } 
    } 
    if (this.Z == null)
      this.Z = VelocityTracker.obtain(); 
    this.Z.addMovement(paramMotionEvent);
    if (this.O != null && (bool || this.N == 1) && i == 2 && !this.P) {
      float f = Math.abs(this.c0 - paramMotionEvent.getY());
      y221 = this.O;
      if (f > y221.b)
        y221.b(paramView, paramMotionEvent.getPointerId(paramMotionEvent.getActionIndex())); 
    } 
    return this.P ^ true;
  }
  
  public final void w() {
    int i = y();
    boolean bool = this.b;
    int j = this.V;
    if (bool) {
      this.G = Math.max(j - i, this.D);
      return;
    } 
    this.G = j - i;
  }
  
  public final float x() {
    // Byte code:
    //   0: fconst_0
    //   1: fstore #4
    //   3: aload_0
    //   4: getfield i : Lws0;
    //   7: astore #6
    //   9: aload #6
    //   11: ifnull -> 215
    //   14: aload_0
    //   15: getfield W : Ljava/lang/ref/WeakReference;
    //   18: astore #7
    //   20: aload #7
    //   22: ifnull -> 215
    //   25: aload #7
    //   27: invokevirtual get : ()Ljava/lang/Object;
    //   30: ifnull -> 215
    //   33: getstatic android/os/Build$VERSION.SDK_INT : I
    //   36: bipush #31
    //   38: if_icmplt -> 215
    //   41: aload_0
    //   42: getfield W : Ljava/lang/ref/WeakReference;
    //   45: invokevirtual get : ()Ljava/lang/Object;
    //   48: checkcast android/view/View
    //   51: astore #7
    //   53: aload_0
    //   54: invokevirtual F : ()Z
    //   57: ifeq -> 215
    //   60: aload #7
    //   62: invokevirtual getRootWindowInsets : ()Landroid/view/WindowInsets;
    //   65: astore #7
    //   67: aload #7
    //   69: ifnull -> 215
    //   72: aload #6
    //   74: invokevirtual i : ()F
    //   77: fstore_1
    //   78: aload #7
    //   80: iconst_0
    //   81: invokevirtual getRoundedCorner : (I)Landroid/view/RoundedCorner;
    //   84: astore #8
    //   86: aload #8
    //   88: ifnull -> 117
    //   91: aload #8
    //   93: invokevirtual getRadius : ()I
    //   96: i2f
    //   97: fstore_2
    //   98: fload_2
    //   99: fconst_0
    //   100: fcmpl
    //   101: ifle -> 117
    //   104: fload_1
    //   105: fconst_0
    //   106: fcmpl
    //   107: ifle -> 117
    //   110: fload_2
    //   111: fload_1
    //   112: fdiv
    //   113: fstore_1
    //   114: goto -> 119
    //   117: fconst_0
    //   118: fstore_1
    //   119: aload #6
    //   121: getfield E : [F
    //   124: astore #8
    //   126: aload #8
    //   128: ifnull -> 139
    //   131: aload #8
    //   133: iconst_0
    //   134: faload
    //   135: fstore_3
    //   136: goto -> 161
    //   139: aload #6
    //   141: getfield c : Lus0;
    //   144: getfield a : Lvl1;
    //   147: getfield f : Lls;
    //   150: aload #6
    //   152: invokevirtual f : ()Landroid/graphics/RectF;
    //   155: invokeinterface a : (Landroid/graphics/RectF;)F
    //   160: fstore_3
    //   161: aload #7
    //   163: iconst_1
    //   164: invokevirtual getRoundedCorner : (I)Landroid/view/RoundedCorner;
    //   167: astore #6
    //   169: fload #4
    //   171: fstore_2
    //   172: aload #6
    //   174: ifnull -> 209
    //   177: aload #6
    //   179: invokevirtual getRadius : ()I
    //   182: i2f
    //   183: fstore #5
    //   185: fload #4
    //   187: fstore_2
    //   188: fload #5
    //   190: fconst_0
    //   191: fcmpl
    //   192: ifle -> 209
    //   195: fload #4
    //   197: fstore_2
    //   198: fload_3
    //   199: fconst_0
    //   200: fcmpl
    //   201: ifle -> 209
    //   204: fload #5
    //   206: fload_3
    //   207: fdiv
    //   208: fstore_2
    //   209: fload_1
    //   210: fload_2
    //   211: invokestatic max : (FF)F
    //   214: freturn
    //   215: fconst_0
    //   216: freturn
  }
  
  public final int y() {
    if (this.f) {
      int k = Math.min(Math.max(this.g, this.V - this.U * 9 / 16), this.T);
      int m = this.v;
      return k + m;
    } 
    if (!this.n && !this.o) {
      int k = this.m;
      if (k > 0)
        return Math.max(this.e, k + this.h); 
    } 
    int i = this.e;
    int j = this.v;
    return i + j;
  }
  
  public final void z(int paramInt) {
    View view = this.W.get();
    if (view != null) {
      ArrayList<yg> arrayList = this.Y;
      if (!arrayList.isEmpty()) {
        int i = this.G;
        if (paramInt <= i && i != D())
          D(); 
        for (paramInt = 0; paramInt < arrayList.size(); paramInt++)
          ((yg)arrayList.get(paramInt)).b(view); 
      } 
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\com\google\android\material\bottomsheet\BottomSheetBehavior.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
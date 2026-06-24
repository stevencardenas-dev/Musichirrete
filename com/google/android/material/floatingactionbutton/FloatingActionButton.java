package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import b70;
import com.google.android.material.appbar.AppBarLayout;
import d7;
import es;
import fs;
import fy0;
import g;
import gh1;
import gm1;
import i70;
import is;
import j;
import java.util.ArrayList;
import java.util.WeakHashMap;
import jy;
import l0;
import p42;
import r80;
import u80;
import ug;
import v22;
import v80;
import vl1;
import ws0;
import y6;
import yg1;
import z60;
import zb1;
import zo2;

public class FloatingActionButton extends p42 implements z60, gm1, es {
  public ColorStateList c;
  
  public PorterDuff.Mode e;
  
  public ColorStateList f;
  
  public PorterDuff.Mode g;
  
  public ColorStateList h;
  
  public int i;
  
  public int j;
  
  public int k;
  
  public int l;
  
  public boolean m;
  
  public final Rect n;
  
  public final Rect o;
  
  public final d7 p;
  
  public final g q;
  
  public v80 r;
  
  public FloatingActionButton(Context paramContext) {
    this(paramContext, null);
  }
  
  public FloatingActionButton(Context paramContext, AttributeSet paramAttributeSet) {
    this(paramContext, paramAttributeSet, 2130969219);
  }
  
  public FloatingActionButton(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: aload_2
    //   3: iload_3
    //   4: ldc 2131952623
    //   6: invokestatic n0 : (Landroid/content/Context;Landroid/util/AttributeSet;II)Landroid/content/Context;
    //   9: aload_2
    //   10: iload_3
    //   11: invokespecial <init> : (Landroid/content/Context;Landroid/util/AttributeSet;I)V
    //   14: aload_0
    //   15: aload_0
    //   16: invokevirtual getVisibility : ()I
    //   19: putfield b : I
    //   22: aload_0
    //   23: new android/graphics/Rect
    //   26: dup
    //   27: invokespecial <init> : ()V
    //   30: putfield n : Landroid/graphics/Rect;
    //   33: aload_0
    //   34: new android/graphics/Rect
    //   37: dup
    //   38: invokespecial <init> : ()V
    //   41: putfield o : Landroid/graphics/Rect;
    //   44: aload_0
    //   45: invokevirtual getContext : ()Landroid/content/Context;
    //   48: astore #16
    //   50: aload #16
    //   52: aload_2
    //   53: getstatic zb1.j : [I
    //   56: iload_3
    //   57: ldc 2131952623
    //   59: iconst_0
    //   60: newarray int
    //   62: invokestatic S : (Landroid/content/Context;Landroid/util/AttributeSet;[III[I)Landroid/content/res/TypedArray;
    //   65: astore #15
    //   67: aload_0
    //   68: aload #16
    //   70: aload #15
    //   72: iconst_1
    //   73: invokestatic u : (Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/content/res/ColorStateList;
    //   76: putfield c : Landroid/content/res/ColorStateList;
    //   79: aload_0
    //   80: aload #15
    //   82: iconst_2
    //   83: iconst_m1
    //   84: invokevirtual getInt : (II)I
    //   87: aconst_null
    //   88: invokestatic N : (ILandroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuff$Mode;
    //   91: putfield e : Landroid/graphics/PorterDuff$Mode;
    //   94: aload_0
    //   95: aload #16
    //   97: aload #15
    //   99: bipush #12
    //   101: invokestatic u : (Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/content/res/ColorStateList;
    //   104: putfield h : Landroid/content/res/ColorStateList;
    //   107: aload_0
    //   108: aload #15
    //   110: bipush #7
    //   112: iconst_m1
    //   113: invokevirtual getInt : (II)I
    //   116: putfield i : I
    //   119: aload_0
    //   120: aload #15
    //   122: bipush #6
    //   124: iconst_0
    //   125: invokevirtual getDimensionPixelSize : (II)I
    //   128: putfield j : I
    //   131: aload #15
    //   133: iconst_3
    //   134: iconst_0
    //   135: invokevirtual getDimensionPixelSize : (II)I
    //   138: istore #8
    //   140: aload #15
    //   142: iconst_4
    //   143: fconst_0
    //   144: invokevirtual getDimension : (IF)F
    //   147: fstore #6
    //   149: aload #15
    //   151: bipush #9
    //   153: fconst_0
    //   154: invokevirtual getDimension : (IF)F
    //   157: fstore #7
    //   159: aload #15
    //   161: bipush #11
    //   163: fconst_0
    //   164: invokevirtual getDimension : (IF)F
    //   167: fstore #5
    //   169: aload_0
    //   170: aload #15
    //   172: bipush #16
    //   174: iconst_0
    //   175: invokevirtual getBoolean : (IZ)Z
    //   178: putfield m : Z
    //   181: aload_0
    //   182: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   185: ldc 2131166233
    //   187: invokevirtual getDimensionPixelSize : (I)I
    //   190: istore #9
    //   192: aload_0
    //   193: aload #15
    //   195: bipush #10
    //   197: iconst_0
    //   198: invokevirtual getDimensionPixelSize : (II)I
    //   201: invokevirtual setMaxImageSize : (I)V
    //   204: aload #15
    //   206: bipush #15
    //   208: invokevirtual hasValue : (I)Z
    //   211: ifeq -> 240
    //   214: aload #15
    //   216: bipush #15
    //   218: iconst_0
    //   219: invokevirtual getResourceId : (II)I
    //   222: istore #10
    //   224: iload #10
    //   226: ifeq -> 240
    //   229: aload #16
    //   231: iload #10
    //   233: invokestatic a : (Landroid/content/Context;I)Lfy0;
    //   236: astore_1
    //   237: goto -> 242
    //   240: aconst_null
    //   241: astore_1
    //   242: aload #15
    //   244: bipush #8
    //   246: invokevirtual hasValue : (I)Z
    //   249: ifeq -> 279
    //   252: aload #15
    //   254: bipush #8
    //   256: iconst_0
    //   257: invokevirtual getResourceId : (II)I
    //   260: istore #10
    //   262: iload #10
    //   264: ifeq -> 279
    //   267: aload #16
    //   269: iload #10
    //   271: invokestatic a : (Landroid/content/Context;I)Lfy0;
    //   274: astore #14
    //   276: goto -> 282
    //   279: aconst_null
    //   280: astore #14
    //   282: aload #16
    //   284: aload_2
    //   285: getstatic zb1.t : [I
    //   288: iload_3
    //   289: ldc 2131952623
    //   291: invokevirtual obtainStyledAttributes : (Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;
    //   294: astore #17
    //   296: aload #17
    //   298: iconst_0
    //   299: iconst_0
    //   300: invokevirtual getResourceId : (II)I
    //   303: istore #11
    //   305: aload #17
    //   307: iconst_1
    //   308: iconst_0
    //   309: invokevirtual getResourceId : (II)I
    //   312: istore #10
    //   314: aload #17
    //   316: invokevirtual recycle : ()V
    //   319: aload #16
    //   321: iload #11
    //   323: iload #10
    //   325: getstatic vl1.m : Lhf1;
    //   328: invokestatic a : (Landroid/content/Context;IILls;)Lul1;
    //   331: invokevirtual a : ()Lvl1;
    //   334: astore #16
    //   336: aload #15
    //   338: iconst_5
    //   339: iconst_0
    //   340: invokevirtual getBoolean : (IZ)Z
    //   343: istore #13
    //   345: aload_0
    //   346: aload #15
    //   348: iconst_0
    //   349: iconst_1
    //   350: invokevirtual getBoolean : (IZ)Z
    //   353: invokevirtual setEnabled : (Z)V
    //   356: aload #15
    //   358: invokevirtual recycle : ()V
    //   361: new d7
    //   364: dup
    //   365: aload_0
    //   366: invokespecial <init> : (Landroid/widget/ImageView;)V
    //   369: astore #15
    //   371: aload_0
    //   372: aload #15
    //   374: putfield p : Ld7;
    //   377: aload #15
    //   379: aload_2
    //   380: iload_3
    //   381: invokevirtual e : (Landroid/util/AttributeSet;I)V
    //   384: aload_0
    //   385: new g
    //   388: dup
    //   389: aload_0
    //   390: invokespecial <init> : (Lcom/google/android/material/floatingactionbutton/FloatingActionButton;)V
    //   393: putfield q : Lg;
    //   396: aload_0
    //   397: invokespecial getImpl : ()Lv80;
    //   400: aload #16
    //   402: invokevirtual g : (Lvl1;)V
    //   405: aload_0
    //   406: invokespecial getImpl : ()Lv80;
    //   409: astore #15
    //   411: aload_0
    //   412: getfield c : Landroid/content/res/ColorStateList;
    //   415: astore_2
    //   416: aload_0
    //   417: getfield e : Landroid/graphics/PorterDuff$Mode;
    //   420: astore #17
    //   422: aload_0
    //   423: getfield h : Landroid/content/res/ColorStateList;
    //   426: astore #16
    //   428: aload #15
    //   430: getfield s : Lcom/google/android/material/floatingactionbutton/FloatingActionButton;
    //   433: astore #18
    //   435: aload #15
    //   437: getfield a : Lvl1;
    //   440: astore #19
    //   442: aload #19
    //   444: invokevirtual getClass : ()Ljava/lang/Class;
    //   447: pop
    //   448: new ws0
    //   451: dup
    //   452: aload #19
    //   454: invokespecial <init> : (Lvl1;)V
    //   457: astore #19
    //   459: aload #15
    //   461: aload #19
    //   463: putfield b : Lu80;
    //   466: aload #19
    //   468: aload_2
    //   469: invokevirtual setTintList : (Landroid/content/res/ColorStateList;)V
    //   472: aload #17
    //   474: ifnull -> 487
    //   477: aload #15
    //   479: getfield b : Lu80;
    //   482: aload #17
    //   484: invokevirtual setTintMode : (Landroid/graphics/PorterDuff$Mode;)V
    //   487: aload #15
    //   489: getfield b : Lu80;
    //   492: aload #18
    //   494: invokevirtual getContext : ()Landroid/content/Context;
    //   497: invokevirtual k : (Landroid/content/Context;)V
    //   500: iload #8
    //   502: ifle -> 741
    //   505: aload #18
    //   507: invokevirtual getContext : ()Landroid/content/Context;
    //   510: astore #17
    //   512: aload #15
    //   514: getfield a : Lvl1;
    //   517: astore #18
    //   519: aload #18
    //   521: invokevirtual getClass : ()Ljava/lang/Class;
    //   524: pop
    //   525: new ug
    //   528: dup
    //   529: aload #18
    //   531: invokespecial <init> : (Lvl1;)V
    //   534: astore #18
    //   536: aload #17
    //   538: ldc 2131099815
    //   540: invokevirtual getColor : (I)I
    //   543: istore #11
    //   545: aload #17
    //   547: ldc 2131099814
    //   549: invokevirtual getColor : (I)I
    //   552: istore_3
    //   553: aload #17
    //   555: ldc 2131099812
    //   557: invokevirtual getColor : (I)I
    //   560: istore #10
    //   562: aload #17
    //   564: ldc 2131099813
    //   566: invokevirtual getColor : (I)I
    //   569: istore #12
    //   571: aload #18
    //   573: iload #11
    //   575: putfield i : I
    //   578: aload #18
    //   580: iload_3
    //   581: putfield j : I
    //   584: aload #18
    //   586: iload #10
    //   588: putfield k : I
    //   591: aload #18
    //   593: iload #12
    //   595: putfield l : I
    //   598: iload #8
    //   600: i2f
    //   601: fstore #4
    //   603: aload #18
    //   605: getfield h : F
    //   608: fload #4
    //   610: fcmpl
    //   611: ifeq -> 646
    //   614: aload #18
    //   616: fload #4
    //   618: putfield h : F
    //   621: aload #18
    //   623: getfield b : Landroid/graphics/Paint;
    //   626: fload #4
    //   628: ldc_w 1.3333
    //   631: fmul
    //   632: invokevirtual setStrokeWidth : (F)V
    //   635: aload #18
    //   637: iconst_1
    //   638: putfield n : Z
    //   641: aload #18
    //   643: invokevirtual invalidateSelf : ()V
    //   646: aload_2
    //   647: ifnull -> 669
    //   650: aload #18
    //   652: aload_2
    //   653: aload #18
    //   655: invokevirtual getState : ()[I
    //   658: aload #18
    //   660: getfield m : I
    //   663: invokevirtual getColorForState : ([II)I
    //   666: putfield m : I
    //   669: aload #18
    //   671: aload_2
    //   672: putfield p : Landroid/content/res/ColorStateList;
    //   675: aload #18
    //   677: iconst_1
    //   678: putfield n : Z
    //   681: aload #18
    //   683: invokevirtual invalidateSelf : ()V
    //   686: aload #15
    //   688: aload #18
    //   690: putfield d : Lug;
    //   693: aload #15
    //   695: getfield d : Lug;
    //   698: astore_2
    //   699: aload_2
    //   700: invokevirtual getClass : ()Ljava/lang/Class;
    //   703: pop
    //   704: aload #15
    //   706: getfield b : Lu80;
    //   709: astore #17
    //   711: aload #17
    //   713: invokevirtual getClass : ()Ljava/lang/Class;
    //   716: pop
    //   717: new android/graphics/drawable/LayerDrawable
    //   720: dup
    //   721: iconst_2
    //   722: anewarray android/graphics/drawable/Drawable
    //   725: dup
    //   726: iconst_0
    //   727: aload_2
    //   728: aastore
    //   729: dup
    //   730: iconst_1
    //   731: aload #17
    //   733: aastore
    //   734: invokespecial <init> : ([Landroid/graphics/drawable/Drawable;)V
    //   737: astore_2
    //   738: goto -> 753
    //   741: aload #15
    //   743: aconst_null
    //   744: putfield d : Lug;
    //   747: aload #15
    //   749: getfield b : Lu80;
    //   752: astore_2
    //   753: new android/graphics/drawable/RippleDrawable
    //   756: dup
    //   757: aload #16
    //   759: invokestatic c : (Landroid/content/res/ColorStateList;)Landroid/content/res/ColorStateList;
    //   762: aload_2
    //   763: aconst_null
    //   764: invokespecial <init> : (Landroid/content/res/ColorStateList;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V
    //   767: astore_2
    //   768: aload #15
    //   770: aload_2
    //   771: putfield c : Landroid/graphics/drawable/RippleDrawable;
    //   774: aload #15
    //   776: aload_2
    //   777: putfield e : Landroid/graphics/drawable/RippleDrawable;
    //   780: aload_0
    //   781: invokespecial getImpl : ()Lv80;
    //   784: iload #9
    //   786: putfield k : I
    //   789: aload_0
    //   790: invokespecial getImpl : ()Lv80;
    //   793: astore_2
    //   794: aload_2
    //   795: getfield h : F
    //   798: fload #6
    //   800: fcmpl
    //   801: ifeq -> 824
    //   804: aload_2
    //   805: fload #6
    //   807: putfield h : F
    //   810: aload_2
    //   811: fload #6
    //   813: aload_2
    //   814: getfield i : F
    //   817: aload_2
    //   818: getfield j : F
    //   821: invokevirtual e : (FFF)V
    //   824: aload_0
    //   825: invokespecial getImpl : ()Lv80;
    //   828: astore_2
    //   829: aload_2
    //   830: getfield i : F
    //   833: fload #7
    //   835: fcmpl
    //   836: ifeq -> 859
    //   839: aload_2
    //   840: fload #7
    //   842: putfield i : F
    //   845: aload_2
    //   846: aload_2
    //   847: getfield h : F
    //   850: fload #7
    //   852: aload_2
    //   853: getfield j : F
    //   856: invokevirtual e : (FFF)V
    //   859: aload_0
    //   860: invokespecial getImpl : ()Lv80;
    //   863: astore_2
    //   864: aload_2
    //   865: getfield j : F
    //   868: fload #5
    //   870: fcmpl
    //   871: ifeq -> 894
    //   874: aload_2
    //   875: fload #5
    //   877: putfield j : F
    //   880: aload_2
    //   881: aload_2
    //   882: getfield h : F
    //   885: aload_2
    //   886: getfield i : F
    //   889: fload #5
    //   891: invokevirtual e : (FFF)V
    //   894: aload_0
    //   895: invokespecial getImpl : ()Lv80;
    //   898: aload_1
    //   899: putfield n : Lfy0;
    //   902: aload_0
    //   903: invokespecial getImpl : ()Lv80;
    //   906: aload #14
    //   908: putfield o : Lfy0;
    //   911: aload_0
    //   912: invokespecial getImpl : ()Lv80;
    //   915: iload #13
    //   917: putfield f : Z
    //   920: aload_0
    //   921: getstatic android/widget/ImageView$ScaleType.MATRIX : Landroid/widget/ImageView$ScaleType;
    //   924: invokevirtual setScaleType : (Landroid/widget/ImageView$ScaleType;)V
    //   927: return
  }
  
  private v80 getImpl() {
    if (this.r == null)
      this.r = new v80(this, new gh1(25, this)); 
    return this.r;
  }
  
  public final int c(int paramInt) {
    int i = this.j;
    if (i != 0)
      return i; 
    Resources resources = getResources();
    return (paramInt != -1) ? ((paramInt != 1) ? resources.getDimensionPixelSize(2131165360) : resources.getDimensionPixelSize(2131165359)) : ((Math.max((resources.getConfiguration()).screenWidthDp, (resources.getConfiguration()).screenHeightDp) < 470) ? c(1) : c(0));
  }
  
  public final void d(boolean paramBoolean) {
    AnimatorSet animatorSet;
    v80 v801 = getImpl();
    FloatingActionButton floatingActionButton1 = v801.s;
    int j = floatingActionButton1.getVisibility();
    int i = v801.r;
    if ((j == 0) ? (i == 1) : (i != 2))
      return; 
    Animator animator = v801.m;
    if (animator != null)
      animator.cancel(); 
    FloatingActionButton floatingActionButton2 = v801.s;
    if (floatingActionButton2.isLaidOut() && !floatingActionButton2.isInEditMode()) {
      fy0 fy0 = v801.o;
      if (fy0 != null) {
        animatorSet = v801.b(fy0, 0.0F, 0.0F, 0.0F);
      } else {
        animatorSet = v801.c(0.0F, 0.4F, 0.4F, v80.B, v80.C);
      } 
      animatorSet.addListener((Animator.AnimatorListener)new r80(v801, paramBoolean));
      animatorSet.start();
      return;
    } 
    if (paramBoolean) {
      i = 8;
    } else {
      i = 4;
    } 
    animatorSet.a(i, paramBoolean);
  }
  
  public final void drawableStateChanged() {
    super.drawableStateChanged();
  }
  
  public final void e() {
    Drawable drawable = getDrawable();
    if (drawable == null)
      return; 
    ColorStateList colorStateList = this.f;
    if (colorStateList == null) {
      drawable.clearColorFilter();
      return;
    } 
    int i = colorStateList.getColorForState(getDrawableState(), 0);
    PorterDuff.Mode mode2 = this.g;
    PorterDuff.Mode mode1 = mode2;
    if (mode2 == null)
      mode1 = PorterDuff.Mode.SRC_IN; 
    drawable.mutate().setColorFilter((ColorFilter)y6.c(i, mode1));
  }
  
  public final void f(boolean paramBoolean) {
    AnimatorSet animatorSet;
    v80 v801 = getImpl();
    FloatingActionButton floatingActionButton2 = v801.s;
    Matrix matrix = v801.x;
    FloatingActionButton floatingActionButton1 = v801.s;
    int i = floatingActionButton2.getVisibility();
    int j = v801.r;
    boolean bool = true;
    if ((i != 0) ? (j == 2) : (j != 1))
      return; 
    Animator animator = v801.m;
    if (animator != null)
      animator.cancel(); 
    if (v801.n != null)
      bool = false; 
    if (floatingActionButton1.isLaidOut() && !floatingActionButton1.isInEditMode()) {
      if (floatingActionButton2.getVisibility() != 0) {
        float f2 = 0.0F;
        floatingActionButton2.setAlpha(0.0F);
        if (bool) {
          f1 = 0.4F;
        } else {
          f1 = 0.0F;
        } 
        floatingActionButton2.setScaleY(f1);
        if (bool) {
          f1 = 0.4F;
        } else {
          f1 = 0.0F;
        } 
        floatingActionButton2.setScaleX(f1);
        float f1 = f2;
        if (bool)
          f1 = 0.4F; 
        v801.p = f1;
        v801.a(f1, matrix);
        floatingActionButton1.setImageMatrix(matrix);
      } 
      fy0 fy0 = v801.n;
      if (fy0 != null) {
        animatorSet = v801.b(fy0, 1.0F, 1.0F, 1.0F);
      } else {
        animatorSet = v801.c(1.0F, 1.0F, 1.0F, v80.z, v80.A);
      } 
      animatorSet.addListener((Animator.AnimatorListener)new i70(v801, paramBoolean));
      animatorSet.start();
      return;
    } 
    floatingActionButton2.a(0, paramBoolean);
    floatingActionButton2.setAlpha(1.0F);
    floatingActionButton2.setScaleY(1.0F);
    floatingActionButton2.setScaleX(1.0F);
    v801.p = 1.0F;
    v801.a(1.0F, matrix);
    animatorSet.setImageMatrix(matrix);
  }
  
  public CharSequence getAccessibilityClassName() {
    return "com.google.android.material.floatingactionbutton.FloatingActionButton";
  }
  
  public ColorStateList getBackgroundTintList() {
    return this.c;
  }
  
  public PorterDuff.Mode getBackgroundTintMode() {
    return this.e;
  }
  
  public fs getBehavior() {
    return new Behavior();
  }
  
  public float getCompatElevation() {
    return (getImpl()).s.getElevation();
  }
  
  public float getCompatHoveredFocusedTranslationZ() {
    return (getImpl()).i;
  }
  
  public float getCompatPressedTranslationZ() {
    return (getImpl()).j;
  }
  
  public Drawable getContentBackground() {
    return (Drawable)(getImpl()).e;
  }
  
  public int getCustomSize() {
    return this.j;
  }
  
  public int getExpandedComponentIdHint() {
    return this.q.b;
  }
  
  public fy0 getHideMotionSpec() {
    return (getImpl()).o;
  }
  
  @Deprecated
  public int getRippleColor() {
    ColorStateList colorStateList = this.h;
    return (colorStateList != null) ? colorStateList.getDefaultColor() : 0;
  }
  
  public ColorStateList getRippleColorStateList() {
    return this.h;
  }
  
  public vl1 getShapeAppearanceModel() {
    vl1 vl1 = (getImpl()).a;
    vl1.getClass();
    return vl1;
  }
  
  public fy0 getShowMotionSpec() {
    return (getImpl()).n;
  }
  
  public int getSize() {
    return this.i;
  }
  
  public int getSizeDimension() {
    return c(this.i);
  }
  
  public ColorStateList getSupportBackgroundTintList() {
    return getBackgroundTintList();
  }
  
  public PorterDuff.Mode getSupportBackgroundTintMode() {
    return getBackgroundTintMode();
  }
  
  public ColorStateList getSupportImageTintList() {
    return this.f;
  }
  
  public PorterDuff.Mode getSupportImageTintMode() {
    return this.g;
  }
  
  public boolean getUseCompatPadding() {
    return this.m;
  }
  
  public final void onAttachedToWindow() {
    super.onAttachedToWindow();
    v80 v801 = getImpl();
    u80 u80 = v801.b;
    if (u80 != null)
      zo2.S((View)v801.s, (ws0)u80); 
  }
  
  public final void onDetachedFromWindow() {
    super.onDetachedFromWindow();
    (getImpl()).s.getViewTreeObserver();
  }
  
  public final void onMeasure(int paramInt1, int paramInt2) {
    int i = getSizeDimension();
    this.k = (i - this.l) / 2;
    getImpl().h();
    paramInt1 = Math.min(View.resolveSize(i, paramInt1), View.resolveSize(i, paramInt2));
    Rect rect = this.n;
    setMeasuredDimension(rect.left + paramInt1 + rect.right, paramInt1 + rect.top + rect.bottom);
  }
  
  public final void onRestoreInstanceState(Parcelable paramParcelable) {
    if (!(paramParcelable instanceof b70)) {
      super.onRestoreInstanceState(paramParcelable);
      return;
    } 
    b70 b70 = (b70)paramParcelable;
    super.onRestoreInstanceState(((j)b70).b);
    Bundle bundle = (Bundle)b70.e.get("expandableWidgetHelper");
    bundle.getClass();
    g g1 = this.q;
    g1.getClass();
    g1.a = bundle.getBoolean("expanded", false);
    g1.b = bundle.getInt("expandedComponentIdHint", 0);
    if (g1.a) {
      FloatingActionButton floatingActionButton = (FloatingActionButton)g1.c;
      ViewParent viewParent = floatingActionButton.getParent();
      if (viewParent instanceof CoordinatorLayout)
        ((CoordinatorLayout)viewParent).i((View)floatingActionButton); 
    } 
  }
  
  public final Parcelable onSaveInstanceState() {
    Bundle bundle1;
    Parcelable parcelable2 = super.onSaveInstanceState();
    Parcelable parcelable1 = parcelable2;
    if (parcelable2 == null)
      bundle1 = new Bundle(); 
    b70 b70 = new b70((Parcelable)bundle1);
    g g1 = this.q;
    g1.getClass();
    Bundle bundle2 = new Bundle();
    bundle2.putBoolean("expanded", g1.a);
    bundle2.putInt("expandedComponentIdHint", g1.b);
    b70.e.put("expandableWidgetHelper", bundle2);
    return (Parcelable)b70;
  }
  
  public final boolean onTouchEvent(MotionEvent paramMotionEvent) {
    if (paramMotionEvent.getAction() == 0) {
      int i = getMeasuredWidth();
      int j = getMeasuredHeight();
      Rect rect1 = this.o;
      rect1.set(0, 0, i, j);
      i = rect1.left;
      Rect rect2 = this.n;
      rect1.left = i + rect2.left;
      rect1.top += rect2.top;
      rect1.right -= rect2.right;
      rect1.bottom -= rect2.bottom;
      v80 v801 = this.r;
      if (v801.f) {
        i = Math.max((v801.k - v801.s.getSizeDimension()) / 2, 0);
      } else {
        i = 0;
      } 
      i = -i;
      rect1.inset(i, i);
      if (!rect1.contains((int)paramMotionEvent.getX(), (int)paramMotionEvent.getY()))
        return false; 
    } 
    return super.onTouchEvent(paramMotionEvent);
  }
  
  public void setBackgroundColor(int paramInt) {
    Log.i("FloatingActionButton", "Setting a custom background is not supported.");
  }
  
  public void setBackgroundDrawable(Drawable paramDrawable) {
    Log.i("FloatingActionButton", "Setting a custom background is not supported.");
  }
  
  public void setBackgroundResource(int paramInt) {
    Log.i("FloatingActionButton", "Setting a custom background is not supported.");
  }
  
  public void setBackgroundTintList(ColorStateList paramColorStateList) {
    if (this.c != paramColorStateList) {
      this.c = paramColorStateList;
      v80 v801 = getImpl();
      u80 u80 = v801.b;
      if (u80 != null)
        u80.setTintList(paramColorStateList); 
      ug ug = v801.d;
      if (ug != null) {
        if (paramColorStateList != null)
          ug.m = paramColorStateList.getColorForState(ug.getState(), ug.m); 
        ug.p = paramColorStateList;
        ug.n = true;
        ug.invalidateSelf();
      } 
    } 
  }
  
  public void setBackgroundTintMode(PorterDuff.Mode paramMode) {
    if (this.e != paramMode) {
      this.e = paramMode;
      u80 u80 = (getImpl()).b;
      if (u80 != null)
        u80.setTintMode(paramMode); 
    } 
  }
  
  public void setCompatElevation(float paramFloat) {
    v80 v801 = getImpl();
    if (v801.h != paramFloat) {
      v801.h = paramFloat;
      v801.e(paramFloat, v801.i, v801.j);
    } 
  }
  
  public void setCompatElevationResource(int paramInt) {
    setCompatElevation(getResources().getDimension(paramInt));
  }
  
  public void setCompatHoveredFocusedTranslationZ(float paramFloat) {
    v80 v801 = getImpl();
    if (v801.i != paramFloat) {
      v801.i = paramFloat;
      v801.e(v801.h, paramFloat, v801.j);
    } 
  }
  
  public void setCompatHoveredFocusedTranslationZResource(int paramInt) {
    setCompatHoveredFocusedTranslationZ(getResources().getDimension(paramInt));
  }
  
  public void setCompatPressedTranslationZ(float paramFloat) {
    v80 v801 = getImpl();
    if (v801.j != paramFloat) {
      v801.j = paramFloat;
      v801.e(v801.h, v801.i, paramFloat);
    } 
  }
  
  public void setCompatPressedTranslationZResource(int paramInt) {
    setCompatPressedTranslationZ(getResources().getDimension(paramInt));
  }
  
  public void setCustomSize(int paramInt) {
    if (paramInt >= 0) {
      if (paramInt != this.j) {
        this.j = paramInt;
        requestLayout();
      } 
      return;
    } 
    l0.l("Custom size must be non-negative");
  }
  
  public void setElevation(float paramFloat) {
    super.setElevation(paramFloat);
    u80 u80 = (getImpl()).b;
    if (u80 != null)
      u80.n(paramFloat); 
  }
  
  public void setEnsureMinTouchTargetSize(boolean paramBoolean) {
    if (paramBoolean != (getImpl()).f) {
      (getImpl()).f = paramBoolean;
      requestLayout();
    } 
  }
  
  public void setExpandedComponentIdHint(int paramInt) {
    this.q.b = paramInt;
  }
  
  public void setHideMotionSpec(fy0 paramfy0) {
    (getImpl()).o = paramfy0;
  }
  
  public void setHideMotionSpecResource(int paramInt) {
    setHideMotionSpec(fy0.a(getContext(), paramInt));
  }
  
  public void setImageDrawable(Drawable paramDrawable) {
    if (getDrawable() != paramDrawable) {
      super.setImageDrawable(paramDrawable);
      v80 v801 = getImpl();
      float f = v801.p;
      v801.p = f;
      Matrix matrix = v801.x;
      v801.a(f, matrix);
      v801.s.setImageMatrix(matrix);
      if (this.f != null)
        e(); 
    } 
  }
  
  public void setImageResource(int paramInt) {
    this.p.j(paramInt);
    e();
  }
  
  public void setMaxImageSize(int paramInt) {
    this.l = paramInt;
    v80 v801 = getImpl();
    if (v801.q != paramInt) {
      v801.q = paramInt;
      float f = v801.p;
      v801.p = f;
      Matrix matrix = v801.x;
      v801.a(f, matrix);
      v801.s.setImageMatrix(matrix);
    } 
  }
  
  public void setRippleColor(int paramInt) {
    setRippleColor(ColorStateList.valueOf(paramInt));
  }
  
  public void setRippleColor(ColorStateList paramColorStateList) {
    if (this.h != paramColorStateList) {
      this.h = paramColorStateList;
      v80 v801 = getImpl();
      paramColorStateList = this.h;
      RippleDrawable rippleDrawable = v801.c;
      if (rippleDrawable != null) {
        rippleDrawable.setColor(yg1.c(paramColorStateList));
        return;
      } 
      if (rippleDrawable != null)
        rippleDrawable.setTintList(yg1.c(paramColorStateList)); 
    } 
  }
  
  public void setScaleX(float paramFloat) {
    super.setScaleX(paramFloat);
    getImpl().getClass();
  }
  
  public void setScaleY(float paramFloat) {
    super.setScaleY(paramFloat);
    getImpl().getClass();
  }
  
  public void setShadowPaddingEnabled(boolean paramBoolean) {
    v80 v801 = getImpl();
    v801.g = paramBoolean;
    v801.h();
  }
  
  public void setShapeAppearanceModel(vl1 paramvl1) {
    getImpl().g(paramvl1);
  }
  
  public void setShowMotionSpec(fy0 paramfy0) {
    (getImpl()).n = paramfy0;
  }
  
  public void setShowMotionSpecResource(int paramInt) {
    setShowMotionSpec(fy0.a(getContext(), paramInt));
  }
  
  public void setSize(int paramInt) {
    this.j = 0;
    if (paramInt != this.i) {
      this.i = paramInt;
      requestLayout();
    } 
  }
  
  public void setSupportBackgroundTintList(ColorStateList paramColorStateList) {
    setBackgroundTintList(paramColorStateList);
  }
  
  public void setSupportBackgroundTintMode(PorterDuff.Mode paramMode) {
    setBackgroundTintMode(paramMode);
  }
  
  public void setSupportImageTintList(ColorStateList paramColorStateList) {
    if (this.f != paramColorStateList) {
      this.f = paramColorStateList;
      e();
    } 
  }
  
  public void setSupportImageTintMode(PorterDuff.Mode paramMode) {
    if (this.g != paramMode) {
      this.g = paramMode;
      e();
    } 
  }
  
  public void setTranslationX(float paramFloat) {
    super.setTranslationX(paramFloat);
    getImpl().f();
  }
  
  public void setTranslationY(float paramFloat) {
    super.setTranslationY(paramFloat);
    getImpl().f();
  }
  
  public void setTranslationZ(float paramFloat) {
    super.setTranslationZ(paramFloat);
    getImpl().f();
  }
  
  public void setUseCompatPadding(boolean paramBoolean) {
    if (this.m != paramBoolean) {
      this.m = paramBoolean;
      getImpl().h();
    } 
  }
  
  public void setVisibility(int paramInt) {
    super.setVisibility(paramInt);
  }
  
  public static class BaseBehavior<T extends FloatingActionButton> extends fs {
    public Rect a;
    
    public final boolean b;
    
    public BaseBehavior() {
      this.b = true;
    }
    
    public BaseBehavior(Context param1Context, AttributeSet param1AttributeSet) {
      TypedArray typedArray = param1Context.obtainStyledAttributes(param1AttributeSet, zb1.k);
      this.b = typedArray.getBoolean(0, true);
      typedArray.recycle();
    }
    
    public final boolean e(View param1View, Rect param1Rect) {
      FloatingActionButton floatingActionButton = (FloatingActionButton)param1View;
      Rect rect = floatingActionButton.n;
      param1Rect.set(floatingActionButton.getLeft() + rect.left, floatingActionButton.getTop() + rect.top, floatingActionButton.getRight() - rect.right, floatingActionButton.getBottom() - rect.bottom);
      return true;
    }
    
    public final void g(is param1is) {
      if (param1is.h == 0)
        param1is.h = 80; 
    }
    
    public final boolean h(CoordinatorLayout param1CoordinatorLayout, View param1View1, View param1View2) {
      FloatingActionButton floatingActionButton = (FloatingActionButton)param1View1;
      if (param1View2 instanceof AppBarLayout) {
        w(param1CoordinatorLayout, (AppBarLayout)param1View2, floatingActionButton);
      } else {
        boolean bool;
        ViewGroup.LayoutParams layoutParams = param1View2.getLayoutParams();
        if (layoutParams instanceof is) {
          bool = ((is)layoutParams).a instanceof com.google.android.material.bottomsheet.BottomSheetBehavior;
        } else {
          bool = false;
        } 
        if (bool)
          x(param1View2, floatingActionButton); 
      } 
      return false;
    }
    
    public final boolean l(CoordinatorLayout param1CoordinatorLayout, View param1View, int param1Int) {
      FloatingActionButton floatingActionButton = (FloatingActionButton)param1View;
      ArrayList<View> arrayList = param1CoordinatorLayout.k((View)floatingActionButton);
      int j = arrayList.size();
      boolean bool = false;
      int i;
      for (i = 0; i < j; i++) {
        View view = arrayList.get(i);
        if (view instanceof AppBarLayout) {
          if (w(param1CoordinatorLayout, (AppBarLayout)view, floatingActionButton))
            break; 
        } else {
          boolean bool1;
          ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
          if (layoutParams instanceof is) {
            bool1 = ((is)layoutParams).a instanceof com.google.android.material.bottomsheet.BottomSheetBehavior;
          } else {
            bool1 = false;
          } 
          if (bool1 && x(view, floatingActionButton))
            break; 
        } 
      } 
      param1CoordinatorLayout.r((View)floatingActionButton, param1Int);
      Rect rect = floatingActionButton.n;
      if (rect.centerX() > 0 && rect.centerY() > 0) {
        is is = (is)floatingActionButton.getLayoutParams();
        if (floatingActionButton.getRight() >= param1CoordinatorLayout.getWidth() - ((ViewGroup.MarginLayoutParams)is).rightMargin) {
          param1Int = rect.right;
        } else if (floatingActionButton.getLeft() <= ((ViewGroup.MarginLayoutParams)is).leftMargin) {
          param1Int = -rect.left;
        } else {
          param1Int = 0;
        } 
        if (floatingActionButton.getBottom() >= param1CoordinatorLayout.getHeight() - ((ViewGroup.MarginLayoutParams)is).bottomMargin) {
          i = rect.bottom;
        } else {
          i = bool;
          if (floatingActionButton.getTop() <= ((ViewGroup.MarginLayoutParams)is).topMargin)
            i = -rect.top; 
        } 
        if (i != 0) {
          WeakHashMap weakHashMap = v22.a;
          floatingActionButton.offsetTopAndBottom(i);
        } 
        if (param1Int != 0) {
          WeakHashMap weakHashMap = v22.a;
          floatingActionButton.offsetLeftAndRight(param1Int);
        } 
      } 
      return true;
    }
    
    public final boolean w(CoordinatorLayout param1CoordinatorLayout, AppBarLayout param1AppBarLayout, FloatingActionButton param1FloatingActionButton) {
      is is = (is)param1FloatingActionButton.getLayoutParams();
      if (!this.b || is.f != param1AppBarLayout.getId() || param1FloatingActionButton.getUserSetVisibility() != 0)
        return false; 
      if (this.a == null)
        this.a = new Rect(); 
      Rect rect = this.a;
      jy.a((ViewGroup)param1CoordinatorLayout, (View)param1AppBarLayout, rect);
      if (rect.bottom <= param1AppBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
        param1FloatingActionButton.d(false);
      } else {
        param1FloatingActionButton.f(false);
      } 
      return true;
    }
    
    public final boolean x(View param1View, FloatingActionButton param1FloatingActionButton) {
      is is = (is)param1FloatingActionButton.getLayoutParams();
      if (!this.b || is.f != param1View.getId() || param1FloatingActionButton.getUserSetVisibility() != 0)
        return false; 
      is = (is)param1FloatingActionButton.getLayoutParams();
      if (param1View.getTop() < param1FloatingActionButton.getHeight() / 2 + ((ViewGroup.MarginLayoutParams)is).topMargin) {
        param1FloatingActionButton.d(false);
      } else {
        param1FloatingActionButton.f(false);
      } 
      return true;
    }
  }
  
  public static class Behavior extends BaseBehavior<FloatingActionButton> {
    public Behavior() {}
    
    public Behavior(Context param1Context, AttributeSet param1AttributeSet) {
      super(param1Context, param1AttributeSet);
    }
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\com\google\android\material\floatingactionbutton\FloatingActionButton.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
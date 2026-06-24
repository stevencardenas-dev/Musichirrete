package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import bx0;
import d42;
import dn0;
import en0;
import gh1;
import gx0;
import hx0;
import jx0;
import pw0;
import qw0;
import r1;
import rw0;
import sb;
import t1;
import u1;
import uw0;
import v1;
import w1;
import x1;

public class ActionMenuView extends en0 implements qw0, jx0 {
  public rw0 b;
  
  public Context c;
  
  public int e;
  
  public boolean f;
  
  public u1 g;
  
  public sb h;
  
  public pw0 i;
  
  public boolean j;
  
  public int k;
  
  public final int l;
  
  public final int m;
  
  public x1 n;
  
  public ActionMenuView(Context paramContext) {
    this(paramContext, null);
  }
  
  public ActionMenuView(Context paramContext, AttributeSet paramAttributeSet) {
    super(paramContext, paramAttributeSet, 0);
    setBaselineAligned(false);
    float f = (paramContext.getResources().getDisplayMetrics()).density;
    this.l = (int)(56.0F * f);
    this.m = (int)(f * 4.0F);
    this.c = paramContext;
    this.e = 0;
  }
  
  public static w1 b() {
    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
    ((w1)layoutParams).a = false;
    layoutParams.gravity = 16;
    return (w1)layoutParams;
  }
  
  public static w1 c(ViewGroup.LayoutParams paramLayoutParams) {
    if (paramLayoutParams != null) {
      LinearLayout.LayoutParams layoutParams;
      if (paramLayoutParams instanceof w1) {
        w1 w1 = (w1)paramLayoutParams;
        layoutParams = new LinearLayout.LayoutParams((ViewGroup.LayoutParams)w1);
        ((w1)layoutParams).a = w1.a;
      } else {
        layoutParams = new LinearLayout.LayoutParams((ViewGroup.LayoutParams)layoutParams);
      } 
      if (layoutParams.gravity <= 0)
        layoutParams.gravity = 16; 
      return (w1)layoutParams;
    } 
    return b();
  }
  
  public final boolean a(uw0 paramuw0) {
    return this.b.q((MenuItem)paramuw0, null, 0);
  }
  
  public final boolean checkLayoutParams(ViewGroup.LayoutParams paramLayoutParams) {
    return paramLayoutParams instanceof w1;
  }
  
  public final boolean d(int paramInt) {
    boolean bool2 = false;
    if (paramInt == 0)
      return false; 
    View view1 = getChildAt(paramInt - 1);
    View view2 = getChildAt(paramInt);
    boolean bool1 = bool2;
    if (paramInt < getChildCount()) {
      bool1 = bool2;
      if (view1 instanceof v1)
        bool1 = ((v1)view1).a(); 
    } 
    return (paramInt > 0 && view2 instanceof v1) ? (((v1)view2).b() | bool1) : bool1;
  }
  
  public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent) {
    return false;
  }
  
  public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet paramAttributeSet) {
    return (ViewGroup.LayoutParams)new LinearLayout.LayoutParams(getContext(), paramAttributeSet);
  }
  
  public final dn0 generateLayoutParams(AttributeSet paramAttributeSet) {
    return (dn0)new LinearLayout.LayoutParams(getContext(), paramAttributeSet);
  }
  
  public Menu getMenu() {
    if (this.b == null) {
      Context context = getContext();
      rw0 rw01 = new rw0(context);
      this.b = rw01;
      rw01.e = (pw0)new gh1(5, this);
      u1 u11 = new u1(context);
      this.g = u11;
      u11.n = true;
      u11.o = true;
      Object object = this.h;
      if (object == null)
        object = new Object(); 
      u11.g = (gx0)object;
      this.b.b((hx0)u11, this.c);
      object = this.g;
      ((u1)object).j = this;
      this.b = ((u1)object).e;
    } 
    return (Menu)this.b;
  }
  
  public Drawable getOverflowIcon() {
    getMenu();
    u1 u11 = this.g;
    t1 t1 = u11.k;
    return (t1 != null) ? t1.getDrawable() : (u11.m ? u11.l : null);
  }
  
  public int getPopupTheme() {
    return this.e;
  }
  
  public int getWindowAnimations() {
    return 0;
  }
  
  public final void initialize(rw0 paramrw0) {
    this.b = paramrw0;
  }
  
  public final void onConfigurationChanged(Configuration paramConfiguration) {
    super.onConfigurationChanged(paramConfiguration);
    u1 u11 = this.g;
    if (u11 != null) {
      u11.g();
      if (this.g.h()) {
        this.g.d();
        this.g.l();
      } 
    } 
  }
  
  public final void onDetachedFromWindow() {
    super.onDetachedFromWindow();
    u1 u11 = this.g;
    if (u11 != null) {
      u11.d();
      r1 r1 = u11.v;
      if (r1 != null && r1.b())
        ((bx0)r1).i.dismiss(); 
    } 
  }
  
  public final void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    if (!this.j) {
      super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
      return;
    } 
    int k = getChildCount();
    int j = (paramInt4 - paramInt2) / 2;
    int n = getDividerWidth();
    int m = paramInt3 - paramInt1;
    paramInt1 = m - getPaddingRight() - getPaddingLeft();
    paramBoolean = d42.a;
    if (getLayoutDirection() == 1) {
      paramInt2 = 1;
    } else {
      paramInt2 = 0;
    } 
    paramInt3 = 0;
    int i = 0;
    paramInt4 = 0;
    while (paramInt3 < k) {
      View view = getChildAt(paramInt3);
      if (view.getVisibility() != 8) {
        w1 w1 = (w1)view.getLayoutParams();
        if (w1.a) {
          int i2;
          int i1 = view.getMeasuredWidth();
          i = i1;
          if (d(paramInt3))
            i = i1 + n; 
          int i3 = view.getMeasuredHeight();
          if (paramInt2 != 0) {
            i2 = getPaddingLeft() + ((LinearLayout.LayoutParams)w1).leftMargin;
            i1 = i2 + i;
          } else {
            i1 = getWidth() - getPaddingRight() - ((LinearLayout.LayoutParams)w1).rightMargin;
            i2 = i1 - i;
          } 
          int i4 = j - i3 / 2;
          view.layout(i2, i4, i1, i3 + i4);
          paramInt1 -= i;
          i = 1;
        } else {
          paramInt1 -= view.getMeasuredWidth() + ((LinearLayout.LayoutParams)w1).leftMargin + ((LinearLayout.LayoutParams)w1).rightMargin;
          d(paramInt3);
          paramInt4++;
        } 
      } 
      paramInt3++;
    } 
    if (k == 1 && i == 0) {
      View view = getChildAt(0);
      paramInt1 = view.getMeasuredWidth();
      paramInt2 = view.getMeasuredHeight();
      paramInt3 = m / 2 - paramInt1 / 2;
      paramInt4 = j - paramInt2 / 2;
      view.layout(paramInt3, paramInt4, paramInt1 + paramInt3, paramInt2 + paramInt4);
      return;
    } 
    paramInt3 = paramInt4 - (i ^ 0x1);
    if (paramInt3 > 0) {
      paramInt1 /= paramInt3;
    } else {
      paramInt1 = 0;
    } 
    paramInt4 = Math.max(0, paramInt1);
    if (paramInt2 != 0) {
      paramInt2 = getWidth() - getPaddingRight();
      paramInt1 = 0;
      while (paramInt1 < k) {
        View view = getChildAt(paramInt1);
        w1 w1 = (w1)view.getLayoutParams();
        paramInt3 = paramInt2;
        if (view.getVisibility() != 8)
          if (w1.a) {
            paramInt3 = paramInt2;
          } else {
            paramInt2 -= ((LinearLayout.LayoutParams)w1).rightMargin;
            int i1 = view.getMeasuredWidth();
            paramInt3 = view.getMeasuredHeight();
            i = j - paramInt3 / 2;
            view.layout(paramInt2 - i1, i, paramInt2, paramInt3 + i);
            paramInt3 = paramInt2 - i1 + ((LinearLayout.LayoutParams)w1).leftMargin + paramInt4;
          }  
        paramInt1++;
        paramInt2 = paramInt3;
      } 
    } else {
      paramInt2 = getPaddingLeft();
      paramInt1 = 0;
      while (paramInt1 < k) {
        View view = getChildAt(paramInt1);
        w1 w1 = (w1)view.getLayoutParams();
        paramInt3 = paramInt2;
        if (view.getVisibility() != 8)
          if (w1.a) {
            paramInt3 = paramInt2;
          } else {
            int i1 = paramInt2 + ((LinearLayout.LayoutParams)w1).leftMargin;
            paramInt2 = view.getMeasuredWidth();
            paramInt3 = view.getMeasuredHeight();
            i = j - paramInt3 / 2;
            view.layout(i1, i, i1 + paramInt2, paramInt3 + i);
            paramInt3 = paramInt2 + ((LinearLayout.LayoutParams)w1).rightMargin + paramInt4 + i1;
          }  
        paramInt1++;
        paramInt2 = paramInt3;
      } 
    } 
  }
  
  public final void onMeasure(int paramInt1, int paramInt2) {
    // Byte code:
    //   0: aload_0
    //   1: getfield j : Z
    //   4: istore #34
    //   6: iload_1
    //   7: invokestatic getMode : (I)I
    //   10: ldc_w 1073741824
    //   13: if_icmpne -> 22
    //   16: iconst_1
    //   17: istore #33
    //   19: goto -> 25
    //   22: iconst_0
    //   23: istore #33
    //   25: aload_0
    //   26: iload #33
    //   28: putfield j : Z
    //   31: iload #34
    //   33: iload #33
    //   35: if_icmpeq -> 43
    //   38: aload_0
    //   39: iconst_0
    //   40: putfield k : I
    //   43: iload_1
    //   44: invokestatic getSize : (I)I
    //   47: istore #6
    //   49: aload_0
    //   50: getfield j : Z
    //   53: ifeq -> 88
    //   56: aload_0
    //   57: getfield b : Lrw0;
    //   60: astore #35
    //   62: aload #35
    //   64: ifnull -> 88
    //   67: iload #6
    //   69: aload_0
    //   70: getfield k : I
    //   73: if_icmpeq -> 88
    //   76: aload_0
    //   77: iload #6
    //   79: putfield k : I
    //   82: aload #35
    //   84: iconst_1
    //   85: invokevirtual p : (Z)V
    //   88: aload_0
    //   89: invokevirtual getChildCount : ()I
    //   92: istore #7
    //   94: aload_0
    //   95: getfield j : Z
    //   98: ifeq -> 1631
    //   101: iload #7
    //   103: ifle -> 1631
    //   106: iload_2
    //   107: invokestatic getMode : (I)I
    //   110: istore #21
    //   112: iload_1
    //   113: invokestatic getSize : (I)I
    //   116: istore #7
    //   118: iload_2
    //   119: invokestatic getSize : (I)I
    //   122: istore #8
    //   124: aload_0
    //   125: invokevirtual getPaddingLeft : ()I
    //   128: istore #6
    //   130: aload_0
    //   131: invokevirtual getPaddingRight : ()I
    //   134: istore_1
    //   135: aload_0
    //   136: invokevirtual getPaddingTop : ()I
    //   139: istore #9
    //   141: aload_0
    //   142: invokevirtual getPaddingBottom : ()I
    //   145: iload #9
    //   147: iadd
    //   148: istore #14
    //   150: iload_2
    //   151: iload #14
    //   153: bipush #-2
    //   155: invokestatic getChildMeasureSpec : (III)I
    //   158: istore #22
    //   160: iload #7
    //   162: iload_1
    //   163: iload #6
    //   165: iadd
    //   166: isub
    //   167: istore #23
    //   169: aload_0
    //   170: getfield l : I
    //   173: istore_1
    //   174: iload #23
    //   176: iload_1
    //   177: idiv
    //   178: istore #15
    //   180: iload #15
    //   182: ifne -> 193
    //   185: aload_0
    //   186: iload #23
    //   188: iconst_0
    //   189: invokevirtual setMeasuredDimension : (II)V
    //   192: return
    //   193: iload #23
    //   195: iload_1
    //   196: irem
    //   197: iload #15
    //   199: idiv
    //   200: iload_1
    //   201: iadd
    //   202: istore #11
    //   204: aload_0
    //   205: invokevirtual getChildCount : ()I
    //   208: istore #24
    //   210: iconst_0
    //   211: istore #9
    //   213: iconst_0
    //   214: istore #10
    //   216: iload #10
    //   218: istore_2
    //   219: iload_2
    //   220: istore #6
    //   222: iload #6
    //   224: istore_1
    //   225: iload_1
    //   226: istore #7
    //   228: lconst_0
    //   229: lstore #25
    //   231: iload #6
    //   233: istore #13
    //   235: iload_2
    //   236: istore #12
    //   238: iload #15
    //   240: istore_2
    //   241: iload #8
    //   243: istore #6
    //   245: iload #9
    //   247: istore #8
    //   249: aload_0
    //   250: getfield m : I
    //   253: istore #20
    //   255: iload #13
    //   257: iload #24
    //   259: if_icmpge -> 780
    //   262: aload_0
    //   263: iload #13
    //   265: invokevirtual getChildAt : (I)Landroid/view/View;
    //   268: astore #36
    //   270: aload #36
    //   272: invokevirtual getVisibility : ()I
    //   275: bipush #8
    //   277: if_icmpne -> 294
    //   280: iload #10
    //   282: istore #16
    //   284: iload_1
    //   285: istore #15
    //   287: lload #25
    //   289: lstore #27
    //   291: goto -> 763
    //   294: aload #36
    //   296: instanceof androidx/appcompat/view/menu/ActionMenuItemView
    //   299: istore #34
    //   301: iload #10
    //   303: iconst_1
    //   304: iadd
    //   305: istore #17
    //   307: iload #34
    //   309: ifeq -> 323
    //   312: aload #36
    //   314: iload #20
    //   316: iconst_0
    //   317: iload #20
    //   319: iconst_0
    //   320: invokevirtual setPadding : (IIII)V
    //   323: aload #36
    //   325: invokevirtual getLayoutParams : ()Landroid/view/ViewGroup$LayoutParams;
    //   328: checkcast w1
    //   331: astore #37
    //   333: aload #37
    //   335: iconst_0
    //   336: putfield f : Z
    //   339: aload #37
    //   341: iconst_0
    //   342: putfield c : I
    //   345: aload #37
    //   347: iconst_0
    //   348: putfield b : I
    //   351: aload #37
    //   353: iconst_0
    //   354: putfield d : Z
    //   357: aload #37
    //   359: iconst_0
    //   360: putfield leftMargin : I
    //   363: aload #37
    //   365: iconst_0
    //   366: putfield rightMargin : I
    //   369: iload #34
    //   371: ifeq -> 394
    //   374: aload #36
    //   376: checkcast androidx/appcompat/view/menu/ActionMenuItemView
    //   379: invokevirtual getText : ()Ljava/lang/CharSequence;
    //   382: invokestatic isEmpty : (Ljava/lang/CharSequence;)Z
    //   385: ifne -> 394
    //   388: iconst_1
    //   389: istore #33
    //   391: goto -> 397
    //   394: iconst_0
    //   395: istore #33
    //   397: aload #37
    //   399: iload #33
    //   401: putfield e : Z
    //   404: aload #37
    //   406: getfield a : Z
    //   409: ifeq -> 418
    //   412: iconst_1
    //   413: istore #9
    //   415: goto -> 421
    //   418: iload_2
    //   419: istore #9
    //   421: aload #36
    //   423: invokevirtual getLayoutParams : ()Landroid/view/ViewGroup$LayoutParams;
    //   426: checkcast w1
    //   429: astore #38
    //   431: iload #22
    //   433: invokestatic getSize : (I)I
    //   436: istore #10
    //   438: iload #10
    //   440: iload #14
    //   442: isub
    //   443: iload #22
    //   445: invokestatic getMode : (I)I
    //   448: invokestatic makeMeasureSpec : (II)I
    //   451: istore #16
    //   453: iload #34
    //   455: ifeq -> 468
    //   458: aload #36
    //   460: checkcast androidx/appcompat/view/menu/ActionMenuItemView
    //   463: astore #35
    //   465: goto -> 471
    //   468: aconst_null
    //   469: astore #35
    //   471: aload #35
    //   473: ifnull -> 493
    //   476: aload #35
    //   478: invokevirtual getText : ()Ljava/lang/CharSequence;
    //   481: invokestatic isEmpty : (Ljava/lang/CharSequence;)Z
    //   484: ifne -> 493
    //   487: iconst_1
    //   488: istore #15
    //   490: goto -> 496
    //   493: iconst_0
    //   494: istore #15
    //   496: iload #9
    //   498: ifle -> 587
    //   501: iload #15
    //   503: ifeq -> 512
    //   506: iload #9
    //   508: iconst_2
    //   509: if_icmplt -> 587
    //   512: aload #36
    //   514: iload #11
    //   516: iload #9
    //   518: imul
    //   519: ldc_w -2147483648
    //   522: invokestatic makeMeasureSpec : (II)I
    //   525: iload #16
    //   527: invokevirtual measure : (II)V
    //   530: aload #36
    //   532: invokevirtual getMeasuredWidth : ()I
    //   535: istore #18
    //   537: iload #18
    //   539: iload #11
    //   541: idiv
    //   542: istore #9
    //   544: iload #9
    //   546: istore #10
    //   548: iload #18
    //   550: iload #11
    //   552: irem
    //   553: ifeq -> 562
    //   556: iload #9
    //   558: iconst_1
    //   559: iadd
    //   560: istore #10
    //   562: iload #10
    //   564: istore #9
    //   566: iload #15
    //   568: ifeq -> 590
    //   571: iload #10
    //   573: istore #9
    //   575: iload #10
    //   577: iconst_2
    //   578: if_icmpge -> 590
    //   581: iconst_2
    //   582: istore #9
    //   584: goto -> 590
    //   587: iconst_0
    //   588: istore #9
    //   590: aload #38
    //   592: getfield a : Z
    //   595: ifne -> 609
    //   598: iload #15
    //   600: ifeq -> 609
    //   603: iconst_1
    //   604: istore #33
    //   606: goto -> 612
    //   609: iconst_0
    //   610: istore #33
    //   612: aload #38
    //   614: iload #33
    //   616: putfield d : Z
    //   619: aload #38
    //   621: iload #9
    //   623: putfield b : I
    //   626: aload #36
    //   628: iload #9
    //   630: iload #11
    //   632: imul
    //   633: ldc_w 1073741824
    //   636: invokestatic makeMeasureSpec : (II)I
    //   639: iload #16
    //   641: invokevirtual measure : (II)V
    //   644: iload #12
    //   646: iload #9
    //   648: invokestatic max : (II)I
    //   651: istore #18
    //   653: iload #7
    //   655: istore #10
    //   657: aload #37
    //   659: getfield d : Z
    //   662: ifeq -> 671
    //   665: iload #7
    //   667: iconst_1
    //   668: iadd
    //   669: istore #10
    //   671: aload #37
    //   673: getfield a : Z
    //   676: ifeq -> 681
    //   679: iconst_1
    //   680: istore_1
    //   681: iload_2
    //   682: iload #9
    //   684: isub
    //   685: istore #19
    //   687: iload #8
    //   689: aload #36
    //   691: invokevirtual getMeasuredHeight : ()I
    //   694: invokestatic max : (II)I
    //   697: istore #20
    //   699: iload #20
    //   701: istore #8
    //   703: iload #19
    //   705: istore_2
    //   706: iload #17
    //   708: istore #16
    //   710: iload #18
    //   712: istore #12
    //   714: iload_1
    //   715: istore #15
    //   717: iload #10
    //   719: istore #7
    //   721: lload #25
    //   723: lstore #27
    //   725: iload #9
    //   727: iconst_1
    //   728: if_icmpne -> 763
    //   731: lload #25
    //   733: iconst_1
    //   734: iload #13
    //   736: ishl
    //   737: i2l
    //   738: lor
    //   739: lstore #27
    //   741: iload #10
    //   743: istore #7
    //   745: iload_1
    //   746: istore #15
    //   748: iload #18
    //   750: istore #12
    //   752: iload #17
    //   754: istore #16
    //   756: iload #19
    //   758: istore_2
    //   759: iload #20
    //   761: istore #8
    //   763: iinc #13, 1
    //   766: iload #16
    //   768: istore #10
    //   770: iload #15
    //   772: istore_1
    //   773: lload #27
    //   775: lstore #25
    //   777: goto -> 249
    //   780: iload_1
    //   781: ifeq -> 796
    //   784: iload #10
    //   786: iconst_2
    //   787: if_icmpne -> 796
    //   790: iconst_1
    //   791: istore #9
    //   793: goto -> 799
    //   796: iconst_0
    //   797: istore #9
    //   799: iconst_0
    //   800: istore #15
    //   802: iload_1
    //   803: istore #14
    //   805: iload_2
    //   806: istore #13
    //   808: iload #15
    //   810: istore_1
    //   811: iload #8
    //   813: istore_2
    //   814: iload #7
    //   816: ifle -> 1151
    //   819: iload #13
    //   821: ifle -> 1151
    //   824: ldc_w 2147483647
    //   827: istore #15
    //   829: lconst_0
    //   830: lstore #29
    //   832: iconst_0
    //   833: istore #17
    //   835: iconst_0
    //   836: istore #16
    //   838: iload #9
    //   840: istore #8
    //   842: iload #16
    //   844: iload #24
    //   846: if_icmpge -> 972
    //   849: aload_0
    //   850: iload #16
    //   852: invokevirtual getChildAt : (I)Landroid/view/View;
    //   855: invokevirtual getLayoutParams : ()Landroid/view/ViewGroup$LayoutParams;
    //   858: checkcast w1
    //   861: astore #35
    //   863: aload #35
    //   865: getfield d : Z
    //   868: ifne -> 886
    //   871: iload #15
    //   873: istore #18
    //   875: iload #17
    //   877: istore #9
    //   879: lload #29
    //   881: lstore #27
    //   883: goto -> 954
    //   886: aload #35
    //   888: getfield b : I
    //   891: istore #19
    //   893: iload #19
    //   895: iload #15
    //   897: if_icmpge -> 916
    //   900: lconst_1
    //   901: iload #16
    //   903: lshl
    //   904: lstore #27
    //   906: iload #19
    //   908: istore #18
    //   910: iconst_1
    //   911: istore #9
    //   913: goto -> 954
    //   916: iload #15
    //   918: istore #18
    //   920: iload #17
    //   922: istore #9
    //   924: lload #29
    //   926: lstore #27
    //   928: iload #19
    //   930: iload #15
    //   932: if_icmpne -> 954
    //   935: lload #29
    //   937: lconst_1
    //   938: iload #16
    //   940: lshl
    //   941: lor
    //   942: lstore #27
    //   944: iload #17
    //   946: iconst_1
    //   947: iadd
    //   948: istore #9
    //   950: iload #15
    //   952: istore #18
    //   954: iinc #16, 1
    //   957: iload #18
    //   959: istore #15
    //   961: iload #9
    //   963: istore #17
    //   965: lload #27
    //   967: lstore #29
    //   969: goto -> 842
    //   972: lload #25
    //   974: lload #29
    //   976: lor
    //   977: lstore #25
    //   979: iload #17
    //   981: iload #13
    //   983: if_icmple -> 989
    //   986: goto -> 1154
    //   989: iconst_0
    //   990: istore_1
    //   991: iload_1
    //   992: iload #24
    //   994: if_icmpge -> 1142
    //   997: aload_0
    //   998: iload_1
    //   999: invokevirtual getChildAt : (I)Landroid/view/View;
    //   1002: astore #35
    //   1004: aload #35
    //   1006: invokevirtual getLayoutParams : ()Landroid/view/ViewGroup$LayoutParams;
    //   1009: checkcast w1
    //   1012: astore #36
    //   1014: iconst_1
    //   1015: iload_1
    //   1016: ishl
    //   1017: i2l
    //   1018: lstore #31
    //   1020: lload #29
    //   1022: lload #31
    //   1024: land
    //   1025: lconst_0
    //   1026: lcmp
    //   1027: ifne -> 1064
    //   1030: iload #13
    //   1032: istore #9
    //   1034: lload #25
    //   1036: lstore #27
    //   1038: aload #36
    //   1040: getfield b : I
    //   1043: iload #15
    //   1045: iconst_1
    //   1046: iadd
    //   1047: if_icmpne -> 1128
    //   1050: lload #25
    //   1052: lload #31
    //   1054: lor
    //   1055: lstore #27
    //   1057: iload #13
    //   1059: istore #9
    //   1061: goto -> 1128
    //   1064: iload #8
    //   1066: ifeq -> 1100
    //   1069: aload #36
    //   1071: getfield e : Z
    //   1074: ifeq -> 1100
    //   1077: iload #13
    //   1079: iconst_1
    //   1080: if_icmpne -> 1100
    //   1083: aload #35
    //   1085: iload #20
    //   1087: iload #11
    //   1089: iadd
    //   1090: iconst_0
    //   1091: iload #20
    //   1093: iconst_0
    //   1094: invokevirtual setPadding : (IIII)V
    //   1097: goto -> 1100
    //   1100: aload #36
    //   1102: aload #36
    //   1104: getfield b : I
    //   1107: iconst_1
    //   1108: iadd
    //   1109: putfield b : I
    //   1112: aload #36
    //   1114: iconst_1
    //   1115: putfield f : Z
    //   1118: iload #13
    //   1120: iconst_1
    //   1121: isub
    //   1122: istore #9
    //   1124: lload #25
    //   1126: lstore #27
    //   1128: iinc #1, 1
    //   1131: iload #9
    //   1133: istore #13
    //   1135: lload #27
    //   1137: lstore #25
    //   1139: goto -> 991
    //   1142: iconst_1
    //   1143: istore_1
    //   1144: iload #8
    //   1146: istore #9
    //   1148: goto -> 814
    //   1151: goto -> 986
    //   1154: iload #14
    //   1156: ifne -> 1171
    //   1159: iload #10
    //   1161: iconst_1
    //   1162: if_icmpne -> 1171
    //   1165: iconst_1
    //   1166: istore #8
    //   1168: goto -> 1174
    //   1171: iconst_0
    //   1172: istore #8
    //   1174: iload_1
    //   1175: istore #7
    //   1177: iload #13
    //   1179: ifle -> 1533
    //   1182: iload_1
    //   1183: istore #7
    //   1185: lload #25
    //   1187: lconst_0
    //   1188: lcmp
    //   1189: ifeq -> 1533
    //   1192: iload #13
    //   1194: iload #10
    //   1196: iconst_1
    //   1197: isub
    //   1198: if_icmplt -> 1215
    //   1201: iload #8
    //   1203: ifne -> 1215
    //   1206: iload_1
    //   1207: istore #7
    //   1209: iload #12
    //   1211: iconst_1
    //   1212: if_icmple -> 1533
    //   1215: lload #25
    //   1217: invokestatic bitCount : (J)I
    //   1220: i2f
    //   1221: fstore #5
    //   1223: fload #5
    //   1225: fstore_3
    //   1226: iload #8
    //   1228: ifne -> 1323
    //   1231: fload #5
    //   1233: fstore #4
    //   1235: lload #25
    //   1237: lconst_1
    //   1238: land
    //   1239: lconst_0
    //   1240: lcmp
    //   1241: ifeq -> 1273
    //   1244: fload #5
    //   1246: fstore #4
    //   1248: aload_0
    //   1249: iconst_0
    //   1250: invokevirtual getChildAt : (I)Landroid/view/View;
    //   1253: invokevirtual getLayoutParams : ()Landroid/view/ViewGroup$LayoutParams;
    //   1256: checkcast w1
    //   1259: getfield e : Z
    //   1262: ifne -> 1273
    //   1265: fload #5
    //   1267: ldc_w 0.5
    //   1270: fsub
    //   1271: fstore #4
    //   1273: iload #24
    //   1275: iconst_1
    //   1276: isub
    //   1277: istore #7
    //   1279: fload #4
    //   1281: fstore_3
    //   1282: lload #25
    //   1284: iconst_1
    //   1285: iload #7
    //   1287: ishl
    //   1288: i2l
    //   1289: land
    //   1290: lconst_0
    //   1291: lcmp
    //   1292: ifeq -> 1323
    //   1295: fload #4
    //   1297: fstore_3
    //   1298: aload_0
    //   1299: iload #7
    //   1301: invokevirtual getChildAt : (I)Landroid/view/View;
    //   1304: invokevirtual getLayoutParams : ()Landroid/view/ViewGroup$LayoutParams;
    //   1307: checkcast w1
    //   1310: getfield e : Z
    //   1313: ifne -> 1323
    //   1316: fload #4
    //   1318: ldc_w 0.5
    //   1321: fsub
    //   1322: fstore_3
    //   1323: fload_3
    //   1324: fconst_0
    //   1325: fcmpl
    //   1326: ifle -> 1343
    //   1329: iload #13
    //   1331: iload #11
    //   1333: imul
    //   1334: i2f
    //   1335: fload_3
    //   1336: fdiv
    //   1337: f2i
    //   1338: istore #8
    //   1340: goto -> 1346
    //   1343: iconst_0
    //   1344: istore #8
    //   1346: iconst_0
    //   1347: istore #9
    //   1349: iload #9
    //   1351: iload #24
    //   1353: if_icmpge -> 1530
    //   1356: lload #25
    //   1358: iconst_1
    //   1359: iload #9
    //   1361: ishl
    //   1362: i2l
    //   1363: land
    //   1364: lconst_0
    //   1365: lcmp
    //   1366: ifne -> 1375
    //   1369: iload_1
    //   1370: istore #7
    //   1372: goto -> 1521
    //   1375: aload_0
    //   1376: iload #9
    //   1378: invokevirtual getChildAt : (I)Landroid/view/View;
    //   1381: astore #36
    //   1383: aload #36
    //   1385: invokevirtual getLayoutParams : ()Landroid/view/ViewGroup$LayoutParams;
    //   1388: checkcast w1
    //   1391: astore #35
    //   1393: aload #36
    //   1395: instanceof androidx/appcompat/view/menu/ActionMenuItemView
    //   1398: ifeq -> 1446
    //   1401: aload #35
    //   1403: iload #8
    //   1405: putfield c : I
    //   1408: aload #35
    //   1410: iconst_1
    //   1411: putfield f : Z
    //   1414: iload #9
    //   1416: ifne -> 1440
    //   1419: aload #35
    //   1421: getfield e : Z
    //   1424: ifne -> 1440
    //   1427: aload #35
    //   1429: iload #8
    //   1431: ineg
    //   1432: iconst_2
    //   1433: idiv
    //   1434: putfield leftMargin : I
    //   1437: goto -> 1440
    //   1440: iconst_1
    //   1441: istore #7
    //   1443: goto -> 1521
    //   1446: aload #35
    //   1448: getfield a : Z
    //   1451: ifeq -> 1483
    //   1454: aload #35
    //   1456: iload #8
    //   1458: putfield c : I
    //   1461: aload #35
    //   1463: iconst_1
    //   1464: putfield f : Z
    //   1467: aload #35
    //   1469: iload #8
    //   1471: ineg
    //   1472: iconst_2
    //   1473: idiv
    //   1474: putfield rightMargin : I
    //   1477: iconst_1
    //   1478: istore #7
    //   1480: goto -> 1521
    //   1483: iload #9
    //   1485: ifeq -> 1497
    //   1488: aload #35
    //   1490: iload #8
    //   1492: iconst_2
    //   1493: idiv
    //   1494: putfield leftMargin : I
    //   1497: iload_1
    //   1498: istore #7
    //   1500: iload #9
    //   1502: iload #24
    //   1504: iconst_1
    //   1505: isub
    //   1506: if_icmpeq -> 1521
    //   1509: aload #35
    //   1511: iload #8
    //   1513: iconst_2
    //   1514: idiv
    //   1515: putfield rightMargin : I
    //   1518: iload_1
    //   1519: istore #7
    //   1521: iinc #9, 1
    //   1524: iload #7
    //   1526: istore_1
    //   1527: goto -> 1349
    //   1530: iload_1
    //   1531: istore #7
    //   1533: iload #7
    //   1535: ifeq -> 1607
    //   1538: iconst_0
    //   1539: istore_1
    //   1540: iload_1
    //   1541: iload #24
    //   1543: if_icmpge -> 1607
    //   1546: aload_0
    //   1547: iload_1
    //   1548: invokevirtual getChildAt : (I)Landroid/view/View;
    //   1551: astore #36
    //   1553: aload #36
    //   1555: invokevirtual getLayoutParams : ()Landroid/view/ViewGroup$LayoutParams;
    //   1558: checkcast w1
    //   1561: astore #35
    //   1563: aload #35
    //   1565: getfield f : Z
    //   1568: ifne -> 1574
    //   1571: goto -> 1601
    //   1574: aload #36
    //   1576: aload #35
    //   1578: getfield b : I
    //   1581: iload #11
    //   1583: imul
    //   1584: aload #35
    //   1586: getfield c : I
    //   1589: iadd
    //   1590: ldc_w 1073741824
    //   1593: invokestatic makeMeasureSpec : (II)I
    //   1596: iload #22
    //   1598: invokevirtual measure : (II)V
    //   1601: iinc #1, 1
    //   1604: goto -> 1540
    //   1607: iload #21
    //   1609: ldc_w 1073741824
    //   1612: if_icmpeq -> 1620
    //   1615: iload_2
    //   1616: istore_1
    //   1617: goto -> 1623
    //   1620: iload #6
    //   1622: istore_1
    //   1623: aload_0
    //   1624: iload #23
    //   1626: iload_1
    //   1627: invokevirtual setMeasuredDimension : (II)V
    //   1630: return
    //   1631: iconst_0
    //   1632: istore #6
    //   1634: iload #6
    //   1636: iload #7
    //   1638: if_icmpge -> 1673
    //   1641: aload_0
    //   1642: iload #6
    //   1644: invokevirtual getChildAt : (I)Landroid/view/View;
    //   1647: invokevirtual getLayoutParams : ()Landroid/view/ViewGroup$LayoutParams;
    //   1650: checkcast w1
    //   1653: astore #35
    //   1655: aload #35
    //   1657: iconst_0
    //   1658: putfield rightMargin : I
    //   1661: aload #35
    //   1663: iconst_0
    //   1664: putfield leftMargin : I
    //   1667: iinc #6, 1
    //   1670: goto -> 1634
    //   1673: aload_0
    //   1674: iload_1
    //   1675: iload_2
    //   1676: invokespecial onMeasure : (II)V
    //   1679: return
  }
  
  public void setExpandedActionViewsExclusive(boolean paramBoolean) {
    this.g.s = paramBoolean;
  }
  
  public void setOnMenuItemClickListener(x1 paramx1) {
    this.n = paramx1;
  }
  
  public void setOverflowIcon(Drawable paramDrawable) {
    getMenu();
    u1 u11 = this.g;
    t1 t1 = u11.k;
    if (t1 != null) {
      t1.setImageDrawable(paramDrawable);
      return;
    } 
    u11.m = true;
    u11.l = paramDrawable;
  }
  
  public void setOverflowReserved(boolean paramBoolean) {
    this.f = paramBoolean;
  }
  
  public void setPopupTheme(int paramInt) {
    if (this.e != paramInt) {
      this.e = paramInt;
      if (paramInt == 0) {
        this.c = getContext();
        return;
      } 
      this.c = (Context)new ContextThemeWrapper(getContext(), paramInt);
    } 
  }
  
  public void setPresenter(u1 paramu1) {
    this.g = paramu1;
    paramu1.j = this;
    this.b = paramu1.e;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\androidx\appcompat\widget\ActionMenuView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
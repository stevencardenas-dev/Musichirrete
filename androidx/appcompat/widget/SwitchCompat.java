package androidx.appcompat.widget;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.IBinder;
import android.text.InputFilter;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.Property;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import android.widget.TextView;
import b7;
import d42;
import f4;
import i22;
import java.util.WeakHashMap;
import l10;
import v22;
import wf2;
import ws2;
import xj;

public class SwitchCompat extends CompoundButton {
  public static final xj S = new xj(Float.class, "thumbPos", 8);
  
  public static final int[] T = new int[] { 16842912 };
  
  public final int A;
  
  public float B;
  
  public int C;
  
  public int D;
  
  public int E;
  
  public int F;
  
  public int G;
  
  public int H;
  
  public int I;
  
  public boolean J;
  
  public final TextPaint K;
  
  public final ColorStateList L;
  
  public StaticLayout M;
  
  public StaticLayout N;
  
  public final f4 O;
  
  public ObjectAnimator P;
  
  public b7 Q;
  
  public final Rect R;
  
  public Drawable b;
  
  public ColorStateList c;
  
  public PorterDuff.Mode e;
  
  public boolean f;
  
  public boolean g;
  
  public Drawable h;
  
  public ColorStateList i;
  
  public PorterDuff.Mode j;
  
  public boolean k;
  
  public boolean l;
  
  public int m;
  
  public int n;
  
  public int o;
  
  public boolean p;
  
  public CharSequence q;
  
  public CharSequence r;
  
  public CharSequence s;
  
  public CharSequence t;
  
  public boolean u;
  
  public int v;
  
  public final int w;
  
  public float x;
  
  public float y;
  
  public final VelocityTracker z;
  
  public SwitchCompat(Context paramContext) {
    this(paramContext, null);
  }
  
  public SwitchCompat(Context paramContext, AttributeSet paramAttributeSet) {
    this(paramContext, paramAttributeSet, 2130970046);
  }
  
  public SwitchCompat(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: aload_2
    //   3: iload_3
    //   4: invokespecial <init> : (Landroid/content/Context;Landroid/util/AttributeSet;I)V
    //   7: aload_0
    //   8: aconst_null
    //   9: putfield c : Landroid/content/res/ColorStateList;
    //   12: aload_0
    //   13: aconst_null
    //   14: putfield e : Landroid/graphics/PorterDuff$Mode;
    //   17: aload_0
    //   18: iconst_0
    //   19: putfield f : Z
    //   22: aload_0
    //   23: iconst_0
    //   24: putfield g : Z
    //   27: aload_0
    //   28: aconst_null
    //   29: putfield i : Landroid/content/res/ColorStateList;
    //   32: aload_0
    //   33: aconst_null
    //   34: putfield j : Landroid/graphics/PorterDuff$Mode;
    //   37: aload_0
    //   38: iconst_0
    //   39: putfield k : Z
    //   42: aload_0
    //   43: iconst_0
    //   44: putfield l : Z
    //   47: aload_0
    //   48: invokestatic obtain : ()Landroid/view/VelocityTracker;
    //   51: putfield z : Landroid/view/VelocityTracker;
    //   54: iconst_1
    //   55: istore #7
    //   57: aload_0
    //   58: iconst_1
    //   59: putfield J : Z
    //   62: aload_0
    //   63: new android/graphics/Rect
    //   66: dup
    //   67: invokespecial <init> : ()V
    //   70: putfield R : Landroid/graphics/Rect;
    //   73: aload_0
    //   74: invokevirtual getContext : ()Landroid/content/Context;
    //   77: aload_0
    //   78: invokestatic a : (Landroid/content/Context;Landroid/view/View;)V
    //   81: new android/text/TextPaint
    //   84: dup
    //   85: iconst_1
    //   86: invokespecial <init> : (I)V
    //   89: astore #10
    //   91: aload_0
    //   92: aload #10
    //   94: putfield K : Landroid/text/TextPaint;
    //   97: aload #10
    //   99: aload_0
    //   100: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   103: invokevirtual getDisplayMetrics : ()Landroid/util/DisplayMetrics;
    //   106: getfield density : F
    //   109: putfield density : F
    //   112: getstatic nc1.w : [I
    //   115: astore #11
    //   117: iload_3
    //   118: iconst_0
    //   119: aload_1
    //   120: aload_2
    //   121: aload #11
    //   123: invokestatic y : (IILandroid/content/Context;Landroid/util/AttributeSet;[I)Lzv0;
    //   126: astore #9
    //   128: aload #9
    //   130: getfield e : Ljava/lang/Object;
    //   133: checkcast android/content/res/TypedArray
    //   136: astore #8
    //   138: aload_0
    //   139: aload_1
    //   140: aload #11
    //   142: aload_2
    //   143: aload #8
    //   145: iload_3
    //   146: invokestatic m : (Landroid/view/View;Landroid/content/Context;[ILandroid/util/AttributeSet;Landroid/content/res/TypedArray;I)V
    //   149: aload #9
    //   151: iconst_2
    //   152: invokevirtual o : (I)Landroid/graphics/drawable/Drawable;
    //   155: astore #11
    //   157: aload_0
    //   158: aload #11
    //   160: putfield b : Landroid/graphics/drawable/Drawable;
    //   163: aload #11
    //   165: ifnull -> 174
    //   168: aload #11
    //   170: aload_0
    //   171: invokevirtual setCallback : (Landroid/graphics/drawable/Drawable$Callback;)V
    //   174: aload #9
    //   176: bipush #11
    //   178: invokevirtual o : (I)Landroid/graphics/drawable/Drawable;
    //   181: astore #11
    //   183: aload_0
    //   184: aload #11
    //   186: putfield h : Landroid/graphics/drawable/Drawable;
    //   189: aload #11
    //   191: ifnull -> 200
    //   194: aload #11
    //   196: aload_0
    //   197: invokevirtual setCallback : (Landroid/graphics/drawable/Drawable$Callback;)V
    //   200: aload_0
    //   201: aload #8
    //   203: iconst_0
    //   204: invokevirtual getText : (I)Ljava/lang/CharSequence;
    //   207: invokespecial setTextOnInternal : (Ljava/lang/CharSequence;)V
    //   210: aload_0
    //   211: aload #8
    //   213: iconst_1
    //   214: invokevirtual getText : (I)Ljava/lang/CharSequence;
    //   217: invokespecial setTextOffInternal : (Ljava/lang/CharSequence;)V
    //   220: aload_0
    //   221: aload #8
    //   223: iconst_3
    //   224: iconst_1
    //   225: invokevirtual getBoolean : (IZ)Z
    //   228: putfield u : Z
    //   231: aload_0
    //   232: aload #8
    //   234: bipush #8
    //   236: iconst_0
    //   237: invokevirtual getDimensionPixelSize : (II)I
    //   240: putfield m : I
    //   243: aload_0
    //   244: aload #8
    //   246: iconst_5
    //   247: iconst_0
    //   248: invokevirtual getDimensionPixelSize : (II)I
    //   251: putfield n : I
    //   254: aload_0
    //   255: aload #8
    //   257: bipush #6
    //   259: iconst_0
    //   260: invokevirtual getDimensionPixelSize : (II)I
    //   263: putfield o : I
    //   266: aload_0
    //   267: aload #8
    //   269: iconst_4
    //   270: iconst_0
    //   271: invokevirtual getBoolean : (IZ)Z
    //   274: putfield p : Z
    //   277: aload #9
    //   279: bipush #9
    //   281: invokevirtual n : (I)Landroid/content/res/ColorStateList;
    //   284: astore #11
    //   286: aload #11
    //   288: ifnull -> 302
    //   291: aload_0
    //   292: aload #11
    //   294: putfield c : Landroid/content/res/ColorStateList;
    //   297: aload_0
    //   298: iconst_1
    //   299: putfield f : Z
    //   302: aload #8
    //   304: bipush #10
    //   306: iconst_m1
    //   307: invokevirtual getInt : (II)I
    //   310: aconst_null
    //   311: invokestatic c : (ILandroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuff$Mode;
    //   314: astore #11
    //   316: aload_0
    //   317: getfield e : Landroid/graphics/PorterDuff$Mode;
    //   320: aload #11
    //   322: if_acmpeq -> 336
    //   325: aload_0
    //   326: aload #11
    //   328: putfield e : Landroid/graphics/PorterDuff$Mode;
    //   331: aload_0
    //   332: iconst_1
    //   333: putfield g : Z
    //   336: aload_0
    //   337: getfield f : Z
    //   340: ifne -> 350
    //   343: aload_0
    //   344: getfield g : Z
    //   347: ifeq -> 354
    //   350: aload_0
    //   351: invokevirtual a : ()V
    //   354: aload #9
    //   356: bipush #12
    //   358: invokevirtual n : (I)Landroid/content/res/ColorStateList;
    //   361: astore #11
    //   363: aload #11
    //   365: ifnull -> 379
    //   368: aload_0
    //   369: aload #11
    //   371: putfield i : Landroid/content/res/ColorStateList;
    //   374: aload_0
    //   375: iconst_1
    //   376: putfield k : Z
    //   379: aload #8
    //   381: bipush #13
    //   383: iconst_m1
    //   384: invokevirtual getInt : (II)I
    //   387: aconst_null
    //   388: invokestatic c : (ILandroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuff$Mode;
    //   391: astore #11
    //   393: aload_0
    //   394: getfield j : Landroid/graphics/PorterDuff$Mode;
    //   397: aload #11
    //   399: if_acmpeq -> 413
    //   402: aload_0
    //   403: aload #11
    //   405: putfield j : Landroid/graphics/PorterDuff$Mode;
    //   408: aload_0
    //   409: iconst_1
    //   410: putfield l : Z
    //   413: aload_0
    //   414: getfield k : Z
    //   417: ifne -> 427
    //   420: aload_0
    //   421: getfield l : Z
    //   424: ifeq -> 431
    //   427: aload_0
    //   428: invokevirtual b : ()V
    //   431: aload #8
    //   433: bipush #7
    //   435: iconst_0
    //   436: invokevirtual getResourceId : (II)I
    //   439: istore #5
    //   441: iload #5
    //   443: ifeq -> 832
    //   446: aload_1
    //   447: iload #5
    //   449: getstatic nc1.x : [I
    //   452: invokevirtual obtainStyledAttributes : (I[I)Landroid/content/res/TypedArray;
    //   455: astore #11
    //   457: aload #11
    //   459: iconst_3
    //   460: invokevirtual hasValue : (I)Z
    //   463: ifeq -> 496
    //   466: aload #11
    //   468: iconst_3
    //   469: iconst_0
    //   470: invokevirtual getResourceId : (II)I
    //   473: istore #5
    //   475: iload #5
    //   477: ifeq -> 496
    //   480: aload_1
    //   481: iload #5
    //   483: invokestatic y : (Landroid/content/Context;I)Landroid/content/res/ColorStateList;
    //   486: astore #8
    //   488: aload #8
    //   490: ifnull -> 496
    //   493: goto -> 504
    //   496: aload #11
    //   498: iconst_3
    //   499: invokevirtual getColorStateList : (I)Landroid/content/res/ColorStateList;
    //   502: astore #8
    //   504: aload #8
    //   506: ifnull -> 518
    //   509: aload_0
    //   510: aload #8
    //   512: putfield L : Landroid/content/res/ColorStateList;
    //   515: goto -> 526
    //   518: aload_0
    //   519: aload_0
    //   520: invokevirtual getTextColors : ()Landroid/content/res/ColorStateList;
    //   523: putfield L : Landroid/content/res/ColorStateList;
    //   526: aload #11
    //   528: iconst_0
    //   529: iconst_0
    //   530: invokevirtual getDimensionPixelSize : (II)I
    //   533: istore #5
    //   535: iload #5
    //   537: ifeq -> 567
    //   540: iload #5
    //   542: i2f
    //   543: fstore #4
    //   545: fload #4
    //   547: aload #10
    //   549: invokevirtual getTextSize : ()F
    //   552: fcmpl
    //   553: ifeq -> 567
    //   556: aload #10
    //   558: fload #4
    //   560: invokevirtual setTextSize : (F)V
    //   563: aload_0
    //   564: invokevirtual requestLayout : ()V
    //   567: aload #11
    //   569: iconst_1
    //   570: iconst_m1
    //   571: invokevirtual getInt : (II)I
    //   574: istore #5
    //   576: aload #11
    //   578: iconst_2
    //   579: iconst_m1
    //   580: invokevirtual getInt : (II)I
    //   583: istore #6
    //   585: iload #5
    //   587: iconst_1
    //   588: if_icmpeq -> 625
    //   591: iload #5
    //   593: iconst_2
    //   594: if_icmpeq -> 617
    //   597: iload #5
    //   599: iconst_3
    //   600: if_icmpeq -> 609
    //   603: aconst_null
    //   604: astore #8
    //   606: goto -> 630
    //   609: getstatic android/graphics/Typeface.MONOSPACE : Landroid/graphics/Typeface;
    //   612: astore #8
    //   614: goto -> 630
    //   617: getstatic android/graphics/Typeface.SERIF : Landroid/graphics/Typeface;
    //   620: astore #8
    //   622: goto -> 630
    //   625: getstatic android/graphics/Typeface.SANS_SERIF : Landroid/graphics/Typeface;
    //   628: astore #8
    //   630: fconst_0
    //   631: fstore #4
    //   633: iload #6
    //   635: ifle -> 737
    //   638: aload #8
    //   640: ifnonnull -> 653
    //   643: iload #6
    //   645: invokestatic defaultFromStyle : (I)Landroid/graphics/Typeface;
    //   648: astore #8
    //   650: goto -> 662
    //   653: aload #8
    //   655: iload #6
    //   657: invokestatic create : (Landroid/graphics/Typeface;I)Landroid/graphics/Typeface;
    //   660: astore #8
    //   662: aload_0
    //   663: aload #8
    //   665: invokevirtual setSwitchTypeface : (Landroid/graphics/Typeface;)V
    //   668: aload #8
    //   670: ifnull -> 683
    //   673: aload #8
    //   675: invokevirtual getStyle : ()I
    //   678: istore #5
    //   680: goto -> 686
    //   683: iconst_0
    //   684: istore #5
    //   686: iload #5
    //   688: iconst_m1
    //   689: ixor
    //   690: iload #6
    //   692: iand
    //   693: istore #5
    //   695: iload #5
    //   697: iconst_1
    //   698: iand
    //   699: ifeq -> 705
    //   702: goto -> 708
    //   705: iconst_0
    //   706: istore #7
    //   708: aload #10
    //   710: iload #7
    //   712: invokevirtual setFakeBoldText : (Z)V
    //   715: iconst_2
    //   716: iload #5
    //   718: iand
    //   719: ifeq -> 727
    //   722: ldc_w -0.25
    //   725: fstore #4
    //   727: aload #10
    //   729: fload #4
    //   731: invokevirtual setTextSkewX : (F)V
    //   734: goto -> 755
    //   737: aload #10
    //   739: iconst_0
    //   740: invokevirtual setFakeBoldText : (Z)V
    //   743: aload #10
    //   745: fconst_0
    //   746: invokevirtual setTextSkewX : (F)V
    //   749: aload_0
    //   750: aload #8
    //   752: invokevirtual setSwitchTypeface : (Landroid/graphics/Typeface;)V
    //   755: aload #11
    //   757: bipush #14
    //   759: iconst_0
    //   760: invokevirtual getBoolean : (IZ)Z
    //   763: ifeq -> 806
    //   766: aload_0
    //   767: invokevirtual getContext : ()Landroid/content/Context;
    //   770: astore #10
    //   772: new java/lang/Object
    //   775: dup
    //   776: invokespecial <init> : ()V
    //   779: astore #8
    //   781: aload #8
    //   783: aload #10
    //   785: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   788: invokevirtual getConfiguration : ()Landroid/content/res/Configuration;
    //   791: getfield locale : Ljava/util/Locale;
    //   794: putfield b : Ljava/util/Locale;
    //   797: aload_0
    //   798: aload #8
    //   800: putfield O : Lf4;
    //   803: goto -> 811
    //   806: aload_0
    //   807: aconst_null
    //   808: putfield O : Lf4;
    //   811: aload_0
    //   812: aload_0
    //   813: getfield q : Ljava/lang/CharSequence;
    //   816: invokespecial setTextOnInternal : (Ljava/lang/CharSequence;)V
    //   819: aload_0
    //   820: aload_0
    //   821: getfield s : Ljava/lang/CharSequence;
    //   824: invokespecial setTextOffInternal : (Ljava/lang/CharSequence;)V
    //   827: aload #11
    //   829: invokevirtual recycle : ()V
    //   832: new b8
    //   835: dup
    //   836: aload_0
    //   837: invokespecial <init> : (Landroid/widget/TextView;)V
    //   840: aload_2
    //   841: iload_3
    //   842: invokevirtual f : (Landroid/util/AttributeSet;I)V
    //   845: aload #9
    //   847: invokevirtual z : ()V
    //   850: aload_1
    //   851: invokestatic get : (Landroid/content/Context;)Landroid/view/ViewConfiguration;
    //   854: astore_1
    //   855: aload_0
    //   856: aload_1
    //   857: invokevirtual getScaledTouchSlop : ()I
    //   860: putfield w : I
    //   863: aload_0
    //   864: aload_1
    //   865: invokevirtual getScaledMinimumFlingVelocity : ()I
    //   868: putfield A : I
    //   871: aload_0
    //   872: invokespecial getEmojiTextViewHelper : ()Lb7;
    //   875: aload_2
    //   876: iload_3
    //   877: invokevirtual b : (Landroid/util/AttributeSet;I)V
    //   880: aload_0
    //   881: invokevirtual refreshDrawableState : ()V
    //   884: aload_0
    //   885: aload_0
    //   886: invokevirtual isChecked : ()Z
    //   889: invokevirtual setChecked : (Z)V
    //   892: return
  }
  
  private b7 getEmojiTextViewHelper() {
    if (this.Q == null)
      this.Q = new b7((TextView)this); 
    return this.Q;
  }
  
  private boolean getTargetCheckedState() {
    return (this.B > 0.5F);
  }
  
  private int getThumbOffset() {
    boolean bool = d42.a;
    int i = getLayoutDirection();
    float f2 = this.B;
    float f1 = f2;
    if (i == 1)
      f1 = 1.0F - f2; 
    return (int)(f1 * getThumbScrollRange() + 0.5F);
  }
  
  private int getThumbScrollRange() {
    Drawable drawable = this.h;
    if (drawable != null) {
      Rect rect1;
      Rect rect2 = this.R;
      drawable.getPadding(rect2);
      drawable = this.b;
      if (drawable != null) {
        rect1 = l10.b(drawable);
      } else {
        rect1 = l10.c;
      } 
      return this.C - this.E - rect2.left - rect2.right - rect1.left - rect1.right;
    } 
    return 0;
  }
  
  private void setTextOffInternal(CharSequence paramCharSequence) {
    this.s = paramCharSequence;
    TransformationMethod transformationMethod = ((ws2)(getEmojiTextViewHelper()).b.c).t0((TransformationMethod)this.O);
    CharSequence charSequence = paramCharSequence;
    if (transformationMethod != null)
      charSequence = transformationMethod.getTransformation(paramCharSequence, (View)this); 
    this.t = charSequence;
    this.N = null;
    if (this.u)
      ((ws2)this.Q.b.c).T(); 
  }
  
  private void setTextOnInternal(CharSequence paramCharSequence) {
    this.q = paramCharSequence;
    TransformationMethod transformationMethod = ((ws2)(getEmojiTextViewHelper()).b.c).t0((TransformationMethod)this.O);
    CharSequence charSequence = paramCharSequence;
    if (transformationMethod != null)
      charSequence = transformationMethod.getTransformation(paramCharSequence, (View)this); 
    this.r = charSequence;
    this.M = null;
    if (this.u)
      ((ws2)this.Q.b.c).T(); 
  }
  
  public final void a() {
    Drawable drawable = this.b;
    if (drawable != null && (this.f || this.g)) {
      drawable = drawable.mutate();
      this.b = drawable;
      if (this.f)
        drawable.setTintList(this.c); 
      if (this.g)
        this.b.setTintMode(this.e); 
      if (this.b.isStateful())
        this.b.setState(getDrawableState()); 
    } 
  }
  
  public final void b() {
    Drawable drawable = this.h;
    if (drawable != null && (this.k || this.l)) {
      drawable = drawable.mutate();
      this.h = drawable;
      if (this.k)
        drawable.setTintList(this.i); 
      if (this.l)
        this.h.setTintMode(this.j); 
      if (this.h.isStateful())
        this.h.setState(getDrawableState()); 
    } 
  }
  
  public final void draw(Canvas paramCanvas) {
    // Byte code:
    //   0: aload_0
    //   1: getfield F : I
    //   4: istore #6
    //   6: aload_0
    //   7: getfield G : I
    //   10: istore #8
    //   12: aload_0
    //   13: getfield H : I
    //   16: istore #7
    //   18: aload_0
    //   19: getfield I : I
    //   22: istore #9
    //   24: aload_0
    //   25: invokespecial getThumbOffset : ()I
    //   28: iload #6
    //   30: iadd
    //   31: istore_3
    //   32: aload_0
    //   33: getfield b : Landroid/graphics/drawable/Drawable;
    //   36: astore #13
    //   38: aload #13
    //   40: ifnull -> 53
    //   43: aload #13
    //   45: invokestatic b : (Landroid/graphics/drawable/Drawable;)Landroid/graphics/Rect;
    //   48: astore #13
    //   50: goto -> 58
    //   53: getstatic l10.c : Landroid/graphics/Rect;
    //   56: astore #13
    //   58: aload_0
    //   59: getfield h : Landroid/graphics/drawable/Drawable;
    //   62: astore #15
    //   64: aload_0
    //   65: getfield R : Landroid/graphics/Rect;
    //   68: astore #14
    //   70: iload_3
    //   71: istore_2
    //   72: aload #15
    //   74: ifnull -> 280
    //   77: aload #15
    //   79: aload #14
    //   81: invokevirtual getPadding : (Landroid/graphics/Rect;)Z
    //   84: pop
    //   85: aload #14
    //   87: getfield left : I
    //   90: istore #4
    //   92: iload_3
    //   93: iload #4
    //   95: iadd
    //   96: istore #10
    //   98: aload #13
    //   100: ifnull -> 257
    //   103: aload #13
    //   105: getfield left : I
    //   108: istore_3
    //   109: iload #6
    //   111: istore_2
    //   112: iload_3
    //   113: iload #4
    //   115: if_icmple -> 126
    //   118: iload #6
    //   120: iload_3
    //   121: iload #4
    //   123: isub
    //   124: iadd
    //   125: istore_2
    //   126: aload #13
    //   128: getfield top : I
    //   131: istore_3
    //   132: aload #14
    //   134: getfield top : I
    //   137: istore #4
    //   139: iload_3
    //   140: iload #4
    //   142: if_icmple -> 156
    //   145: iload_3
    //   146: iload #4
    //   148: isub
    //   149: iload #8
    //   151: iadd
    //   152: istore_3
    //   153: goto -> 159
    //   156: iload #8
    //   158: istore_3
    //   159: aload #13
    //   161: getfield right : I
    //   164: istore #5
    //   166: aload #14
    //   168: getfield right : I
    //   171: istore #6
    //   173: iload #7
    //   175: istore #4
    //   177: iload #5
    //   179: iload #6
    //   181: if_icmple -> 194
    //   184: iload #7
    //   186: iload #5
    //   188: iload #6
    //   190: isub
    //   191: isub
    //   192: istore #4
    //   194: aload #13
    //   196: getfield bottom : I
    //   199: istore #11
    //   201: aload #14
    //   203: getfield bottom : I
    //   206: istore #12
    //   208: iload_2
    //   209: istore #6
    //   211: iload #4
    //   213: istore #7
    //   215: iload_3
    //   216: istore #5
    //   218: iload #11
    //   220: iload #12
    //   222: if_icmple -> 238
    //   225: iload #9
    //   227: iload #11
    //   229: iload #12
    //   231: isub
    //   232: isub
    //   233: istore #6
    //   235: goto -> 264
    //   238: iload #9
    //   240: istore_3
    //   241: iload #6
    //   243: istore_2
    //   244: iload #7
    //   246: istore #4
    //   248: iload_3
    //   249: istore #6
    //   251: iload #5
    //   253: istore_3
    //   254: goto -> 264
    //   257: iload #8
    //   259: istore #5
    //   261: goto -> 238
    //   264: aload_0
    //   265: getfield h : Landroid/graphics/drawable/Drawable;
    //   268: iload_2
    //   269: iload_3
    //   270: iload #4
    //   272: iload #6
    //   274: invokevirtual setBounds : (IIII)V
    //   277: iload #10
    //   279: istore_2
    //   280: aload_0
    //   281: getfield b : Landroid/graphics/drawable/Drawable;
    //   284: astore #13
    //   286: aload #13
    //   288: ifnull -> 355
    //   291: aload #13
    //   293: aload #14
    //   295: invokevirtual getPadding : (Landroid/graphics/Rect;)Z
    //   298: pop
    //   299: iload_2
    //   300: aload #14
    //   302: getfield left : I
    //   305: isub
    //   306: istore_3
    //   307: iload_2
    //   308: aload_0
    //   309: getfield E : I
    //   312: iadd
    //   313: aload #14
    //   315: getfield right : I
    //   318: iadd
    //   319: istore_2
    //   320: aload_0
    //   321: getfield b : Landroid/graphics/drawable/Drawable;
    //   324: iload_3
    //   325: iload #8
    //   327: iload_2
    //   328: iload #9
    //   330: invokevirtual setBounds : (IIII)V
    //   333: aload_0
    //   334: invokevirtual getBackground : ()Landroid/graphics/drawable/Drawable;
    //   337: astore #13
    //   339: aload #13
    //   341: ifnull -> 355
    //   344: aload #13
    //   346: iload_3
    //   347: iload #8
    //   349: iload_2
    //   350: iload #9
    //   352: invokevirtual setHotspotBounds : (IIII)V
    //   355: aload_0
    //   356: aload_1
    //   357: invokespecial draw : (Landroid/graphics/Canvas;)V
    //   360: return
  }
  
  public final void drawableHotspotChanged(float paramFloat1, float paramFloat2) {
    super.drawableHotspotChanged(paramFloat1, paramFloat2);
    Drawable drawable = this.b;
    if (drawable != null)
      drawable.setHotspot(paramFloat1, paramFloat2); 
    drawable = this.h;
    if (drawable != null)
      drawable.setHotspot(paramFloat1, paramFloat2); 
  }
  
  public final void drawableStateChanged() {
    boolean bool1;
    super.drawableStateChanged();
    int[] arrayOfInt = getDrawableState();
    Drawable drawable = this.b;
    if (drawable != null && drawable.isStateful()) {
      bool1 = drawable.setState(arrayOfInt);
    } else {
      bool1 = false;
    } 
    drawable = this.h;
    boolean bool2 = bool1;
    if (drawable != null) {
      bool2 = bool1;
      if (drawable.isStateful())
        bool2 = bool1 | drawable.setState(arrayOfInt); 
    } 
    if (bool2)
      invalidate(); 
  }
  
  public int getCompoundPaddingLeft() {
    boolean bool = d42.a;
    if (getLayoutDirection() == 1) {
      int j = super.getCompoundPaddingLeft() + this.C;
      int i = j;
      if (!TextUtils.isEmpty(getText()))
        i = j + this.o; 
      return i;
    } 
    return super.getCompoundPaddingLeft();
  }
  
  public int getCompoundPaddingRight() {
    boolean bool = d42.a;
    if (getLayoutDirection() == 1)
      return super.getCompoundPaddingRight(); 
    int j = super.getCompoundPaddingRight() + this.C;
    int i = j;
    if (!TextUtils.isEmpty(getText()))
      i = j + this.o; 
    return i;
  }
  
  public ActionMode.Callback getCustomSelectionActionModeCallback() {
    return wf2.l0(super.getCustomSelectionActionModeCallback());
  }
  
  public boolean getShowText() {
    return this.u;
  }
  
  public boolean getSplitTrack() {
    return this.p;
  }
  
  public int getSwitchMinWidth() {
    return this.n;
  }
  
  public int getSwitchPadding() {
    return this.o;
  }
  
  public CharSequence getTextOff() {
    return this.s;
  }
  
  public CharSequence getTextOn() {
    return this.q;
  }
  
  public Drawable getThumbDrawable() {
    return this.b;
  }
  
  public final float getThumbPosition() {
    return this.B;
  }
  
  public int getThumbTextPadding() {
    return this.m;
  }
  
  public ColorStateList getThumbTintList() {
    return this.c;
  }
  
  public PorterDuff.Mode getThumbTintMode() {
    return this.e;
  }
  
  public Drawable getTrackDrawable() {
    return this.h;
  }
  
  public ColorStateList getTrackTintList() {
    return this.i;
  }
  
  public PorterDuff.Mode getTrackTintMode() {
    return this.j;
  }
  
  public final void jumpDrawablesToCurrentState() {
    super.jumpDrawablesToCurrentState();
    Drawable drawable = this.b;
    if (drawable != null)
      drawable.jumpToCurrentState(); 
    drawable = this.h;
    if (drawable != null)
      drawable.jumpToCurrentState(); 
    ObjectAnimator objectAnimator = this.P;
    if (objectAnimator != null && objectAnimator.isStarted()) {
      this.P.end();
      this.P = null;
    } 
  }
  
  public final int[] onCreateDrawableState(int paramInt) {
    int[] arrayOfInt = super.onCreateDrawableState(paramInt + 1);
    if (isChecked())
      View.mergeDrawableStates(arrayOfInt, T); 
    return arrayOfInt;
  }
  
  public final void onDraw(Canvas paramCanvas) {
    StaticLayout staticLayout;
    super.onDraw(paramCanvas);
    Drawable drawable1 = this.h;
    Rect rect = this.R;
    if (drawable1 != null) {
      drawable1.getPadding(rect);
    } else {
      rect.setEmpty();
    } 
    int n = this.G;
    int k = this.I;
    int m = rect.top;
    int j = rect.bottom;
    Drawable drawable2 = this.b;
    if (drawable1 != null)
      if (this.p && drawable2 != null) {
        Rect rect1 = l10.b(drawable2);
        drawable2.copyBounds(rect);
        rect.left += rect1.left;
        rect.right -= rect1.right;
        int i1 = paramCanvas.save();
        paramCanvas.clipRect(rect, Region.Op.DIFFERENCE);
        drawable1.draw(paramCanvas);
        paramCanvas.restoreToCount(i1);
      } else {
        drawable1.draw(paramCanvas);
      }  
    int i = paramCanvas.save();
    if (drawable2 != null)
      drawable2.draw(paramCanvas); 
    if (getTargetCheckedState()) {
      staticLayout = this.M;
    } else {
      staticLayout = this.N;
    } 
    if (staticLayout != null) {
      int[] arrayOfInt = getDrawableState();
      TextPaint textPaint = this.K;
      ColorStateList colorStateList = this.L;
      if (colorStateList != null)
        textPaint.setColor(colorStateList.getColorForState(arrayOfInt, 0)); 
      textPaint.drawableState = arrayOfInt;
      if (drawable2 != null) {
        Rect rect1 = drawable2.getBounds();
        i1 = rect1.left + rect1.right;
      } else {
        i1 = getWidth();
      } 
      int i2 = i1 / 2;
      int i1 = staticLayout.getWidth() / 2;
      j = (n + m + k - j) / 2;
      k = staticLayout.getHeight() / 2;
      paramCanvas.translate((i2 - i1), (j - k));
      staticLayout.draw(paramCanvas);
    } 
    paramCanvas.restoreToCount(i);
  }
  
  public final void onInitializeAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent) {
    super.onInitializeAccessibilityEvent(paramAccessibilityEvent);
    paramAccessibilityEvent.setClassName("android.widget.Switch");
  }
  
  public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo paramAccessibilityNodeInfo) {
    super.onInitializeAccessibilityNodeInfo(paramAccessibilityNodeInfo);
    paramAccessibilityNodeInfo.setClassName("android.widget.Switch");
    if (Build.VERSION.SDK_INT < 30) {
      CharSequence charSequence;
      if (isChecked()) {
        charSequence = this.q;
      } else {
        charSequence = this.s;
      } 
      if (!TextUtils.isEmpty(charSequence)) {
        CharSequence charSequence1 = paramAccessibilityNodeInfo.getText();
        if (TextUtils.isEmpty(charSequence1)) {
          paramAccessibilityNodeInfo.setText(charSequence);
          return;
        } 
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(charSequence1);
        stringBuilder.append(' ');
        stringBuilder.append(charSequence);
        paramAccessibilityNodeInfo.setText(stringBuilder);
      } 
    } 
  }
  
  public final void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    Drawable drawable = this.b;
    paramInt2 = 0;
    if (drawable != null) {
      Drawable drawable1 = this.h;
      Rect rect1 = this.R;
      if (drawable1 != null) {
        drawable1.getPadding(rect1);
      } else {
        rect1.setEmpty();
      } 
      Rect rect2 = l10.b(this.b);
      paramInt1 = Math.max(0, rect2.left - rect1.left);
      paramInt2 = Math.max(0, rect2.right - rect1.right);
    } else {
      paramInt1 = 0;
    } 
    paramBoolean = d42.a;
    if (getLayoutDirection() == 1) {
      paramInt3 = getPaddingLeft() + paramInt1;
      paramInt4 = this.C + paramInt3 - paramInt1 - paramInt2;
    } else {
      paramInt4 = getWidth() - getPaddingRight() - paramInt2;
      paramInt3 = paramInt4 - this.C + paramInt1 + paramInt2;
    } 
    paramInt1 = getGravity() & 0x70;
    if (paramInt1 != 16) {
      if (paramInt1 != 80) {
        paramInt1 = getPaddingTop();
        paramInt2 = this.D + paramInt1;
      } else {
        paramInt2 = getHeight() - getPaddingBottom();
        paramInt1 = paramInt2 - this.D;
      } 
    } else {
      paramInt1 = getPaddingTop();
      paramInt1 = (getHeight() + paramInt1 - getPaddingBottom()) / 2;
      paramInt2 = this.D;
      paramInt1 -= paramInt2 / 2;
      paramInt2 += paramInt1;
    } 
    this.F = paramInt3;
    this.G = paramInt1;
    this.I = paramInt2;
    this.H = paramInt4;
  }
  
  public final void onMeasure(int paramInt1, int paramInt2) {
    int j;
    boolean bool = this.u;
    int m = 0;
    if (bool) {
      StaticLayout staticLayout = this.M;
      TextPaint textPaint = this.K;
      if (staticLayout == null) {
        CharSequence charSequence = this.r;
        if (charSequence != null) {
          i = (int)Math.ceil(Layout.getDesiredWidth(charSequence, textPaint));
        } else {
          i = 0;
        } 
        this.M = new StaticLayout(charSequence, textPaint, i, Layout.Alignment.ALIGN_NORMAL, 1.0F, 0.0F, true);
      } 
      if (this.N == null) {
        CharSequence charSequence = this.t;
        if (charSequence != null) {
          i = (int)Math.ceil(Layout.getDesiredWidth(charSequence, textPaint));
        } else {
          i = 0;
        } 
        this.N = new StaticLayout(charSequence, textPaint, i, Layout.Alignment.ALIGN_NORMAL, 1.0F, 0.0F, true);
      } 
    } 
    Drawable drawable2 = this.b;
    Rect rect = this.R;
    if (drawable2 != null) {
      drawable2.getPadding(rect);
      j = this.b.getIntrinsicWidth() - rect.left - rect.right;
      i = this.b.getIntrinsicHeight();
    } else {
      j = 0;
      i = 0;
    } 
    if (this.u) {
      k = Math.max(this.M.getWidth(), this.N.getWidth());
      k = this.m * 2 + k;
    } else {
      k = 0;
    } 
    this.E = Math.max(k, j);
    drawable2 = this.h;
    if (drawable2 != null) {
      drawable2.getPadding(rect);
      j = this.h.getIntrinsicHeight();
    } else {
      rect.setEmpty();
      j = m;
    } 
    int i1 = rect.left;
    int n = rect.right;
    Drawable drawable1 = this.b;
    m = i1;
    int k = n;
    if (drawable1 != null) {
      Rect rect1 = l10.b(drawable1);
      m = Math.max(i1, rect1.left);
      k = Math.max(n, rect1.right);
    } 
    bool = this.J;
    i1 = this.n;
    n = i1;
    if (bool)
      n = Math.max(i1, this.E * 2 + m + k); 
    int i = Math.max(j, i);
    this.C = n;
    this.D = i;
    super.onMeasure(paramInt1, paramInt2);
    if (getMeasuredHeight() < i)
      setMeasuredDimension(getMeasuredWidthAndState(), i); 
  }
  
  public final void onPopulateAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent) {
    CharSequence charSequence;
    super.onPopulateAccessibilityEvent(paramAccessibilityEvent);
    if (isChecked()) {
      charSequence = this.q;
    } else {
      charSequence = this.s;
    } 
    if (charSequence != null)
      paramAccessibilityEvent.getText().add(charSequence); 
  }
  
  public final boolean onTouchEvent(MotionEvent paramMotionEvent) {
    VelocityTracker velocityTracker = this.z;
    velocityTracker.addMovement(paramMotionEvent);
    int j = paramMotionEvent.getActionMasked();
    int i = this.w;
    if (j != 0) {
      MotionEvent motionEvent;
      float f = 0.0F;
      if (j != 1)
        if (j != 2) {
          if (j != 3)
            return super.onTouchEvent(paramMotionEvent); 
        } else {
          j = this.v;
          if (j != 1) {
            if (j == 2) {
              float f3 = paramMotionEvent.getX();
              i = getThumbScrollRange();
              float f1 = f3 - this.x;
              if (i != 0) {
                f1 /= i;
              } else if (f1 > 0.0F) {
                f1 = 1.0F;
              } else {
                f1 = -1.0F;
              } 
              boolean bool = d42.a;
              float f2 = f1;
              if (getLayoutDirection() == 1)
                f2 = -f1; 
              float f5 = this.B;
              f1 = f2 + f5;
              if (f1 < 0.0F) {
                f1 = f;
              } else if (f1 > 1.0F) {
                f1 = 1.0F;
              } 
              if (f1 != f5) {
                this.x = f3;
                setThumbPosition(f1);
              } 
              return true;
            } 
          } else {
            float f3 = paramMotionEvent.getX();
            float f1 = paramMotionEvent.getY();
            float f2 = Math.abs(f3 - this.x);
            f = i;
            if (f2 > f || Math.abs(f1 - this.y) > f) {
              this.v = 2;
              getParent().requestDisallowInterceptTouchEvent(true);
              this.x = f3;
              this.y = f1;
              return true;
            } 
          } 
          return super.onTouchEvent(paramMotionEvent);
        }  
      if (this.v == 2) {
        boolean bool1;
        this.v = 0;
        if (paramMotionEvent.getAction() == 1 && isEnabled()) {
          i = 1;
        } else {
          i = 0;
        } 
        boolean bool2 = isChecked();
        if (i != 0) {
          velocityTracker.computeCurrentVelocity(1000);
          float f1 = velocityTracker.getXVelocity();
          if (Math.abs(f1) > this.A) {
            bool1 = d42.a;
            if ((getLayoutDirection() == 1) ? (f1 < 0.0F) : (f1 > 0.0F)) {
              bool1 = true;
            } else {
              bool1 = false;
            } 
          } else {
            bool1 = getTargetCheckedState();
          } 
        } else {
          bool1 = bool2;
        } 
        if (bool1 != bool2)
          playSoundEffect(0); 
        setChecked(bool1);
        motionEvent = MotionEvent.obtain(paramMotionEvent);
        motionEvent.setAction(3);
        super.onTouchEvent(motionEvent);
        motionEvent.recycle();
        super.onTouchEvent(paramMotionEvent);
        return true;
      } 
      this.v = 0;
      motionEvent.clear();
    } else {
      float f2 = paramMotionEvent.getX();
      float f1 = paramMotionEvent.getY();
      if (isEnabled() && this.b != null) {
        int k = getThumbOffset();
        Drawable drawable = this.b;
        Rect rect = this.R;
        drawable.getPadding(rect);
        j = this.G;
        int m = this.F + k - i;
        int i1 = this.E;
        int i2 = rect.left;
        k = rect.right;
        int n = this.I;
        if (f2 > m && f2 < (i1 + m + i2 + k + i) && f1 > (j - i) && f1 < (n + i)) {
          this.v = 1;
          this.x = f2;
          this.y = f1;
        } 
      } 
    } 
    return super.onTouchEvent(paramMotionEvent);
  }
  
  public void setAllCaps(boolean paramBoolean) {
    super.setAllCaps(paramBoolean);
    getEmojiTextViewHelper().c(paramBoolean);
  }
  
  public void setChecked(boolean paramBoolean) {
    super.setChecked(paramBoolean);
    paramBoolean = isChecked();
    if (paramBoolean) {
      if (Build.VERSION.SDK_INT >= 30) {
        CharSequence charSequence2 = this.q;
        CharSequence charSequence1 = charSequence2;
        if (charSequence2 == null)
          charSequence1 = getResources().getString(2131886094); 
        WeakHashMap weakHashMap = v22.a;
        (new i22(2131297582, CharSequence.class, 64, 30, 2)).e((View)this, charSequence1);
      } 
    } else if (Build.VERSION.SDK_INT >= 30) {
      CharSequence charSequence2 = this.s;
      CharSequence charSequence1 = charSequence2;
      if (charSequence2 == null)
        charSequence1 = getResources().getString(2131886093); 
      WeakHashMap weakHashMap = v22.a;
      (new i22(2131297582, CharSequence.class, 64, 30, 2)).e((View)this, charSequence1);
    } 
    IBinder iBinder = getWindowToken();
    float f2 = 0.0F;
    float f1 = 0.0F;
    if (iBinder != null && isLaidOut()) {
      if (paramBoolean)
        f1 = 1.0F; 
      ObjectAnimator objectAnimator1 = ObjectAnimator.ofFloat(this, (Property)S, new float[] { f1 });
      this.P = objectAnimator1;
      objectAnimator1.setDuration(250L);
      this.P.setAutoCancel(true);
      this.P.start();
      return;
    } 
    ObjectAnimator objectAnimator = this.P;
    if (objectAnimator != null)
      objectAnimator.cancel(); 
    f1 = f2;
    if (paramBoolean)
      f1 = 1.0F; 
    setThumbPosition(f1);
  }
  
  public void setCustomSelectionActionModeCallback(ActionMode.Callback paramCallback) {
    super.setCustomSelectionActionModeCallback(wf2.p0(paramCallback, (TextView)this));
  }
  
  public void setEmojiCompatEnabled(boolean paramBoolean) {
    getEmojiTextViewHelper().d(paramBoolean);
    setTextOnInternal(this.q);
    setTextOffInternal(this.s);
    requestLayout();
  }
  
  public final void setEnforceSwitchWidth(boolean paramBoolean) {
    this.J = paramBoolean;
    invalidate();
  }
  
  public void setFilters(InputFilter[] paramArrayOfInputFilter) {
    super.setFilters(getEmojiTextViewHelper().a(paramArrayOfInputFilter));
  }
  
  public void setShowText(boolean paramBoolean) {
    if (this.u != paramBoolean) {
      this.u = paramBoolean;
      requestLayout();
      if (paramBoolean)
        ((ws2)this.Q.b.c).T(); 
    } 
  }
  
  public void setSplitTrack(boolean paramBoolean) {
    this.p = paramBoolean;
    invalidate();
  }
  
  public void setSwitchMinWidth(int paramInt) {
    this.n = paramInt;
    requestLayout();
  }
  
  public void setSwitchPadding(int paramInt) {
    this.o = paramInt;
    requestLayout();
  }
  
  public void setSwitchTypeface(Typeface paramTypeface) {
    TextPaint textPaint = this.K;
    if ((textPaint.getTypeface() != null && !textPaint.getTypeface().equals(paramTypeface)) || (textPaint.getTypeface() == null && paramTypeface != null)) {
      textPaint.setTypeface(paramTypeface);
      requestLayout();
      invalidate();
    } 
  }
  
  public void setTextOff(CharSequence paramCharSequence) {
    setTextOffInternal(paramCharSequence);
    requestLayout();
    if (!isChecked() && Build.VERSION.SDK_INT >= 30) {
      CharSequence charSequence = this.s;
      paramCharSequence = charSequence;
      if (charSequence == null)
        paramCharSequence = getResources().getString(2131886093); 
      WeakHashMap weakHashMap = v22.a;
      (new i22(2131297582, CharSequence.class, 64, 30, 2)).e((View)this, paramCharSequence);
    } 
  }
  
  public void setTextOn(CharSequence paramCharSequence) {
    setTextOnInternal(paramCharSequence);
    requestLayout();
    if (isChecked() && Build.VERSION.SDK_INT >= 30) {
      CharSequence charSequence = this.q;
      paramCharSequence = charSequence;
      if (charSequence == null)
        paramCharSequence = getResources().getString(2131886094); 
      WeakHashMap weakHashMap = v22.a;
      (new i22(2131297582, CharSequence.class, 64, 30, 2)).e((View)this, paramCharSequence);
    } 
  }
  
  public void setThumbDrawable(Drawable paramDrawable) {
    Drawable drawable = this.b;
    if (drawable != null)
      drawable.setCallback(null); 
    this.b = paramDrawable;
    if (paramDrawable != null)
      paramDrawable.setCallback((Drawable.Callback)this); 
    requestLayout();
  }
  
  public void setThumbPosition(float paramFloat) {
    this.B = paramFloat;
    invalidate();
  }
  
  public void setThumbResource(int paramInt) {
    setThumbDrawable(ws2.I(getContext(), paramInt));
  }
  
  public void setThumbTextPadding(int paramInt) {
    this.m = paramInt;
    requestLayout();
  }
  
  public void setThumbTintList(ColorStateList paramColorStateList) {
    this.c = paramColorStateList;
    this.f = true;
    a();
  }
  
  public void setThumbTintMode(PorterDuff.Mode paramMode) {
    this.e = paramMode;
    this.g = true;
    a();
  }
  
  public void setTrackDrawable(Drawable paramDrawable) {
    Drawable drawable = this.h;
    if (drawable != null)
      drawable.setCallback(null); 
    this.h = paramDrawable;
    if (paramDrawable != null)
      paramDrawable.setCallback((Drawable.Callback)this); 
    requestLayout();
  }
  
  public void setTrackResource(int paramInt) {
    setTrackDrawable(ws2.I(getContext(), paramInt));
  }
  
  public void setTrackTintList(ColorStateList paramColorStateList) {
    this.i = paramColorStateList;
    this.k = true;
    b();
  }
  
  public void setTrackTintMode(PorterDuff.Mode paramMode) {
    this.j = paramMode;
    this.l = true;
    b();
  }
  
  public final void toggle() {
    setChecked(isChecked() ^ true);
  }
  
  public final boolean verifyDrawable(Drawable paramDrawable) {
    return (super.verifyDrawable(paramDrawable) || paramDrawable == this.b || paramDrawable == this.h);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\androidx\appcompat\widget\SwitchCompat.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
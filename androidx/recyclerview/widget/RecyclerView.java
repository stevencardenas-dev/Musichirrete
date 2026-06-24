package androidx.recyclerview.widget;

import ae1;
import android.animation.LayoutTransition;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import android.window.ldG.XUaAMlaMSa;
import be1;
import com.google.android.material.tabs.xm.VDgS;
import de1;
import e32;
import ee1;
import fe1;
import fj0;
import ga1;
import ge1;
import hd1;
import he1;
import id1;
import ij0;
import il;
import j;
import j01;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;
import je1;
import k0;
import kn0;
import l0;
import l11;
import m11;
import m60;
import md1;
import nd1;
import od1;
import p11;
import pd1;
import pz;
import r3.IKWi.AyxAR;
import rd0;
import sd1;
import sk;
import sp0;
import td1;
import tk;
import tp;
import u2;
import ud1;
import ui0;
import v2;
import v22;
import vd1;
import wd1;
import wf2;
import x41;
import x81;
import xd1;
import xy;
import yd1;
import zd1;
import zm1;

public class RecyclerView extends ViewGroup implements l11 {
  public static boolean E0;
  
  public static boolean F0;
  
  public static final int[] G0 = new int[] { 16843830 };
  
  public static final float H0 = (float)(Math.log(0.78D) / Math.log(0.9D));
  
  public static final boolean I0 = true;
  
  public static final boolean J0 = true;
  
  public static final Class[] K0;
  
  public static final fj0 L0 = new fj0(2);
  
  public static final ee1 M0 = (ee1)new Object();
  
  public boolean A;
  
  public int A0;
  
  public int B;
  
  public final boolean B0;
  
  public boolean C;
  
  public final xy C0;
  
  public final AccessibilityManager D;
  
  public final pz D0;
  
  public ArrayList E;
  
  public boolean F;
  
  public boolean G;
  
  public int H;
  
  public int I;
  
  public nd1 J;
  
  public EdgeEffect K;
  
  public EdgeEffect L;
  
  public EdgeEffect M;
  
  public EdgeEffect N;
  
  public od1 O;
  
  public int P;
  
  public int Q;
  
  public VelocityTracker R;
  
  public int S;
  
  public int T;
  
  public int U;
  
  public int V;
  
  public int W;
  
  public td1 a0;
  
  public final float b;
  
  public final int b0;
  
  public final ae1 c;
  
  public final int c0;
  
  public final float d0;
  
  public final yd1 e;
  
  public final float e0;
  
  public be1 f;
  
  public boolean f0;
  
  public final v2 g;
  
  public final ge1 g0;
  
  public final tk h;
  
  public rd0 h0;
  
  public final j01 i;
  
  public final il i0;
  
  public boolean j;
  
  public final de1 j0;
  
  public final hd1 k;
  
  public vd1 k0;
  
  public final Rect l;
  
  public ArrayList l0;
  
  public final Rect m;
  
  public boolean m0;
  
  public final RectF n;
  
  public boolean n0;
  
  public id1 o;
  
  public final xy o0;
  
  public a p;
  
  public boolean p0;
  
  public final ArrayList q;
  
  public je1 q0;
  
  public final ArrayList r;
  
  public final int[] r0;
  
  public final ArrayList s;
  
  public m11 s0;
  
  public ud1 t;
  
  public final int[] t0;
  
  public boolean u;
  
  public final int[] u0;
  
  public boolean v;
  
  public final int[] v0;
  
  public boolean w;
  
  public final ArrayList w0;
  
  public int x;
  
  public final hd1 x0;
  
  public boolean y;
  
  public boolean y0;
  
  public boolean z;
  
  public int z0;
  
  public RecyclerView(Context paramContext) {
    this(paramContext, null);
  }
  
  public RecyclerView(Context paramContext, AttributeSet paramAttributeSet) {
    this(paramContext, paramAttributeSet, 2130969858);
  }
  
  public RecyclerView(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: aload_2
    //   3: iload_3
    //   4: invokespecial <init> : (Landroid/content/Context;Landroid/util/AttributeSet;I)V
    //   7: aload_0
    //   8: new ae1
    //   11: dup
    //   12: aload_0
    //   13: invokespecial <init> : (Landroidx/recyclerview/widget/RecyclerView;)V
    //   16: putfield c : Lae1;
    //   19: aload_0
    //   20: new yd1
    //   23: dup
    //   24: aload_0
    //   25: invokespecial <init> : (Landroidx/recyclerview/widget/RecyclerView;)V
    //   28: putfield e : Lyd1;
    //   31: aload_0
    //   32: new j01
    //   35: dup
    //   36: bipush #13
    //   38: invokespecial <init> : (I)V
    //   41: putfield i : Lj01;
    //   44: aload_0
    //   45: new hd1
    //   48: dup
    //   49: aload_0
    //   50: iconst_0
    //   51: invokespecial <init> : (Landroidx/recyclerview/widget/RecyclerView;I)V
    //   54: putfield k : Lhd1;
    //   57: aload_0
    //   58: new android/graphics/Rect
    //   61: dup
    //   62: invokespecial <init> : ()V
    //   65: putfield l : Landroid/graphics/Rect;
    //   68: aload_0
    //   69: new android/graphics/Rect
    //   72: dup
    //   73: invokespecial <init> : ()V
    //   76: putfield m : Landroid/graphics/Rect;
    //   79: aload_0
    //   80: new android/graphics/RectF
    //   83: dup
    //   84: invokespecial <init> : ()V
    //   87: putfield n : Landroid/graphics/RectF;
    //   90: aload_0
    //   91: new java/util/ArrayList
    //   94: dup
    //   95: invokespecial <init> : ()V
    //   98: putfield q : Ljava/util/ArrayList;
    //   101: aload_0
    //   102: new java/util/ArrayList
    //   105: dup
    //   106: invokespecial <init> : ()V
    //   109: putfield r : Ljava/util/ArrayList;
    //   112: aload_0
    //   113: new java/util/ArrayList
    //   116: dup
    //   117: invokespecial <init> : ()V
    //   120: putfield s : Ljava/util/ArrayList;
    //   123: aload_0
    //   124: iconst_0
    //   125: putfield x : I
    //   128: aload_0
    //   129: iconst_0
    //   130: putfield F : Z
    //   133: aload_0
    //   134: iconst_0
    //   135: putfield G : Z
    //   138: aload_0
    //   139: iconst_0
    //   140: putfield H : I
    //   143: aload_0
    //   144: iconst_0
    //   145: putfield I : I
    //   148: aload_0
    //   149: getstatic androidx/recyclerview/widget/RecyclerView.M0 : Lee1;
    //   152: putfield J : Lnd1;
    //   155: new java/lang/Object
    //   158: dup
    //   159: invokespecial <init> : ()V
    //   162: astore #8
    //   164: aload #8
    //   166: aconst_null
    //   167: putfield a : Lxy;
    //   170: aload #8
    //   172: new java/util/ArrayList
    //   175: dup
    //   176: invokespecial <init> : ()V
    //   179: putfield b : Ljava/util/ArrayList;
    //   182: aload #8
    //   184: ldc2_w 120
    //   187: putfield c : J
    //   190: aload #8
    //   192: ldc2_w 120
    //   195: putfield d : J
    //   198: aload #8
    //   200: ldc2_w 250
    //   203: putfield e : J
    //   206: aload #8
    //   208: ldc2_w 250
    //   211: putfield f : J
    //   214: aload #8
    //   216: iconst_1
    //   217: putfield g : Z
    //   220: aload #8
    //   222: new java/util/ArrayList
    //   225: dup
    //   226: invokespecial <init> : ()V
    //   229: putfield h : Ljava/util/ArrayList;
    //   232: aload #8
    //   234: new java/util/ArrayList
    //   237: dup
    //   238: invokespecial <init> : ()V
    //   241: putfield i : Ljava/util/ArrayList;
    //   244: aload #8
    //   246: new java/util/ArrayList
    //   249: dup
    //   250: invokespecial <init> : ()V
    //   253: putfield j : Ljava/util/ArrayList;
    //   256: aload #8
    //   258: new java/util/ArrayList
    //   261: dup
    //   262: invokespecial <init> : ()V
    //   265: putfield k : Ljava/util/ArrayList;
    //   268: aload #8
    //   270: new java/util/ArrayList
    //   273: dup
    //   274: invokespecial <init> : ()V
    //   277: putfield l : Ljava/util/ArrayList;
    //   280: aload #8
    //   282: new java/util/ArrayList
    //   285: dup
    //   286: invokespecial <init> : ()V
    //   289: putfield m : Ljava/util/ArrayList;
    //   292: aload #8
    //   294: new java/util/ArrayList
    //   297: dup
    //   298: invokespecial <init> : ()V
    //   301: putfield n : Ljava/util/ArrayList;
    //   304: aload #8
    //   306: new java/util/ArrayList
    //   309: dup
    //   310: invokespecial <init> : ()V
    //   313: putfield o : Ljava/util/ArrayList;
    //   316: aload #8
    //   318: new java/util/ArrayList
    //   321: dup
    //   322: invokespecial <init> : ()V
    //   325: putfield p : Ljava/util/ArrayList;
    //   328: aload #8
    //   330: new java/util/ArrayList
    //   333: dup
    //   334: invokespecial <init> : ()V
    //   337: putfield q : Ljava/util/ArrayList;
    //   340: aload #8
    //   342: new java/util/ArrayList
    //   345: dup
    //   346: invokespecial <init> : ()V
    //   349: putfield r : Ljava/util/ArrayList;
    //   352: aload_0
    //   353: aload #8
    //   355: putfield O : Lod1;
    //   358: aload_0
    //   359: iconst_0
    //   360: putfield P : I
    //   363: aload_0
    //   364: iconst_m1
    //   365: putfield Q : I
    //   368: aload_0
    //   369: ldc_w 1.4E-45
    //   372: putfield d0 : F
    //   375: aload_0
    //   376: ldc_w 1.4E-45
    //   379: putfield e0 : F
    //   382: aload_0
    //   383: iconst_1
    //   384: putfield f0 : Z
    //   387: aload_0
    //   388: new ge1
    //   391: dup
    //   392: aload_0
    //   393: invokespecial <init> : (Landroidx/recyclerview/widget/RecyclerView;)V
    //   396: putfield g0 : Lge1;
    //   399: getstatic androidx/recyclerview/widget/RecyclerView.J0 : Z
    //   402: ifeq -> 417
    //   405: new java/lang/Object
    //   408: dup
    //   409: invokespecial <init> : ()V
    //   412: astore #8
    //   414: goto -> 420
    //   417: aconst_null
    //   418: astore #8
    //   420: aload_0
    //   421: aload #8
    //   423: putfield i0 : Lil;
    //   426: new java/lang/Object
    //   429: dup
    //   430: invokespecial <init> : ()V
    //   433: astore #8
    //   435: aload #8
    //   437: iconst_m1
    //   438: putfield a : I
    //   441: aload #8
    //   443: iconst_0
    //   444: putfield b : I
    //   447: aload #8
    //   449: iconst_0
    //   450: putfield c : I
    //   453: aload #8
    //   455: iconst_1
    //   456: putfield d : I
    //   459: aload #8
    //   461: iconst_0
    //   462: putfield e : I
    //   465: aload #8
    //   467: iconst_0
    //   468: putfield f : Z
    //   471: aload #8
    //   473: iconst_0
    //   474: putfield g : Z
    //   477: aload #8
    //   479: iconst_0
    //   480: putfield h : Z
    //   483: aload #8
    //   485: iconst_0
    //   486: putfield i : Z
    //   489: aload #8
    //   491: iconst_0
    //   492: putfield j : Z
    //   495: aload #8
    //   497: iconst_0
    //   498: putfield k : Z
    //   501: aload_0
    //   502: aload #8
    //   504: putfield j0 : Lde1;
    //   507: aload_0
    //   508: iconst_0
    //   509: putfield m0 : Z
    //   512: aload_0
    //   513: iconst_0
    //   514: putfield n0 : Z
    //   517: new xy
    //   520: dup
    //   521: aload_0
    //   522: invokespecial <init> : (Landroidx/recyclerview/widget/RecyclerView;)V
    //   525: astore #8
    //   527: aload_0
    //   528: aload #8
    //   530: putfield o0 : Lxy;
    //   533: aload_0
    //   534: iconst_0
    //   535: putfield p0 : Z
    //   538: aload_0
    //   539: iconst_2
    //   540: newarray int
    //   542: putfield r0 : [I
    //   545: aload_0
    //   546: iconst_2
    //   547: newarray int
    //   549: putfield t0 : [I
    //   552: aload_0
    //   553: iconst_2
    //   554: newarray int
    //   556: putfield u0 : [I
    //   559: aload_0
    //   560: iconst_2
    //   561: newarray int
    //   563: putfield v0 : [I
    //   566: aload_0
    //   567: new java/util/ArrayList
    //   570: dup
    //   571: invokespecial <init> : ()V
    //   574: putfield w0 : Ljava/util/ArrayList;
    //   577: aload_0
    //   578: new hd1
    //   581: dup
    //   582: aload_0
    //   583: iconst_1
    //   584: invokespecial <init> : (Landroidx/recyclerview/widget/RecyclerView;I)V
    //   587: putfield x0 : Lhd1;
    //   590: aload_0
    //   591: iconst_0
    //   592: putfield z0 : I
    //   595: aload_0
    //   596: iconst_0
    //   597: putfield A0 : I
    //   600: aload_0
    //   601: new xy
    //   604: dup
    //   605: aload_0
    //   606: invokespecial <init> : (Landroidx/recyclerview/widget/RecyclerView;)V
    //   609: putfield C0 : Lxy;
    //   612: new xy
    //   615: dup
    //   616: aload_0
    //   617: invokespecial <init> : (Landroidx/recyclerview/widget/RecyclerView;)V
    //   620: astore #9
    //   622: aload_0
    //   623: new pz
    //   626: dup
    //   627: aload_0
    //   628: invokevirtual getContext : ()Landroid/content/Context;
    //   631: aload #9
    //   633: invokespecial <init> : (Landroid/content/Context;Lqz;)V
    //   636: putfield D0 : Lpz;
    //   639: aload_0
    //   640: iconst_1
    //   641: invokevirtual setScrollContainer : (Z)V
    //   644: aload_0
    //   645: iconst_1
    //   646: invokevirtual setFocusableInTouchMode : (Z)V
    //   649: aload_1
    //   650: invokestatic get : (Landroid/content/Context;)Landroid/view/ViewConfiguration;
    //   653: astore #10
    //   655: aload_0
    //   656: aload #10
    //   658: invokevirtual getScaledTouchSlop : ()I
    //   661: putfield W : I
    //   664: getstatic android/os/Build$VERSION.SDK_INT : I
    //   667: istore #6
    //   669: iload #6
    //   671: bipush #26
    //   673: if_icmplt -> 691
    //   676: getstatic w22.a : Ljava/lang/reflect/Method;
    //   679: astore #9
    //   681: aload #10
    //   683: invokestatic g : (Landroid/view/ViewConfiguration;)F
    //   686: fstore #4
    //   688: goto -> 699
    //   691: aload #10
    //   693: aload_1
    //   694: invokestatic a : (Landroid/view/ViewConfiguration;Landroid/content/Context;)F
    //   697: fstore #4
    //   699: aload_0
    //   700: fload #4
    //   702: putfield d0 : F
    //   705: iload #6
    //   707: bipush #26
    //   709: if_icmplt -> 722
    //   712: aload #10
    //   714: invokestatic h : (Landroid/view/ViewConfiguration;)F
    //   717: fstore #4
    //   719: goto -> 730
    //   722: aload #10
    //   724: aload_1
    //   725: invokestatic a : (Landroid/view/ViewConfiguration;Landroid/content/Context;)F
    //   728: fstore #4
    //   730: aload_0
    //   731: fload #4
    //   733: putfield e0 : F
    //   736: aload_0
    //   737: aload #10
    //   739: invokevirtual getScaledMinimumFlingVelocity : ()I
    //   742: putfield b0 : I
    //   745: aload_0
    //   746: aload #10
    //   748: invokevirtual getScaledMaximumFlingVelocity : ()I
    //   751: putfield c0 : I
    //   754: aload_0
    //   755: aload_1
    //   756: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   759: invokevirtual getDisplayMetrics : ()Landroid/util/DisplayMetrics;
    //   762: getfield density : F
    //   765: ldc_w 160.0
    //   768: fmul
    //   769: ldc_w 386.0878
    //   772: fmul
    //   773: ldc_w 0.84
    //   776: fmul
    //   777: putfield b : F
    //   780: aload_0
    //   781: invokevirtual getOverScrollMode : ()I
    //   784: iconst_2
    //   785: if_icmpne -> 794
    //   788: iconst_1
    //   789: istore #7
    //   791: goto -> 797
    //   794: iconst_0
    //   795: istore #7
    //   797: aload_0
    //   798: iload #7
    //   800: invokevirtual setWillNotDraw : (Z)V
    //   803: aload_0
    //   804: getfield O : Lod1;
    //   807: aload #8
    //   809: putfield a : Lxy;
    //   812: aload_0
    //   813: new v2
    //   816: dup
    //   817: new xy
    //   820: dup
    //   821: aload_0
    //   822: invokespecial <init> : (Landroidx/recyclerview/widget/RecyclerView;)V
    //   825: invokespecial <init> : (Lxy;)V
    //   828: putfield g : Lv2;
    //   831: aload_0
    //   832: new tk
    //   835: dup
    //   836: new xy
    //   839: dup
    //   840: aload_0
    //   841: invokespecial <init> : (Landroidx/recyclerview/widget/RecyclerView;)V
    //   844: invokespecial <init> : (Lxy;)V
    //   847: putfield h : Ltk;
    //   850: getstatic v22.a : Ljava/util/WeakHashMap;
    //   853: astore #8
    //   855: iload #6
    //   857: bipush #26
    //   859: if_icmplt -> 871
    //   862: aload_0
    //   863: invokestatic a : (Landroid/view/View;)I
    //   866: istore #5
    //   868: goto -> 874
    //   871: iconst_0
    //   872: istore #5
    //   874: iload #5
    //   876: ifne -> 892
    //   879: iload #6
    //   881: bipush #26
    //   883: if_icmplt -> 892
    //   886: aload_0
    //   887: bipush #8
    //   889: invokestatic b : (Landroid/view/View;I)V
    //   892: aload_0
    //   893: invokevirtual getImportantForAccessibility : ()I
    //   896: ifne -> 904
    //   899: aload_0
    //   900: iconst_1
    //   901: invokevirtual setImportantForAccessibility : (I)V
    //   904: aload_0
    //   905: aload_0
    //   906: invokevirtual getContext : ()Landroid/content/Context;
    //   909: ldc_w 'accessibility'
    //   912: invokevirtual getSystemService : (Ljava/lang/String;)Ljava/lang/Object;
    //   915: checkcast android/view/accessibility/AccessibilityManager
    //   918: putfield D : Landroid/view/accessibility/AccessibilityManager;
    //   921: aload_0
    //   922: new je1
    //   925: dup
    //   926: aload_0
    //   927: invokespecial <init> : (Landroidx/recyclerview/widget/RecyclerView;)V
    //   930: invokevirtual setAccessibilityDelegateCompat : (Lje1;)V
    //   933: getstatic kc1.a : [I
    //   936: astore #9
    //   938: aload_1
    //   939: aload_2
    //   940: aload #9
    //   942: iload_3
    //   943: iconst_0
    //   944: invokevirtual obtainStyledAttributes : (Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;
    //   947: astore #8
    //   949: aload_0
    //   950: aload_1
    //   951: aload #9
    //   953: aload_2
    //   954: aload #8
    //   956: iload_3
    //   957: invokestatic m : (Landroid/view/View;Landroid/content/Context;[ILandroid/util/AttributeSet;Landroid/content/res/TypedArray;I)V
    //   960: aload #8
    //   962: bipush #8
    //   964: invokevirtual getString : (I)Ljava/lang/String;
    //   967: astore #11
    //   969: aload #8
    //   971: iconst_2
    //   972: iconst_m1
    //   973: invokevirtual getInt : (II)I
    //   976: iconst_m1
    //   977: if_icmpne -> 987
    //   980: aload_0
    //   981: ldc_w 262144
    //   984: invokevirtual setDescendantFocusability : (I)V
    //   987: aload_0
    //   988: aload #8
    //   990: iconst_1
    //   991: iconst_1
    //   992: invokevirtual getBoolean : (IZ)Z
    //   995: putfield j : Z
    //   998: aload #8
    //   1000: iconst_3
    //   1001: iconst_0
    //   1002: invokevirtual getBoolean : (IZ)Z
    //   1005: ifeq -> 1136
    //   1008: aload #8
    //   1010: bipush #6
    //   1012: invokevirtual getDrawable : (I)Landroid/graphics/drawable/Drawable;
    //   1015: checkcast android/graphics/drawable/StateListDrawable
    //   1018: astore #10
    //   1020: aload #8
    //   1022: bipush #7
    //   1024: invokevirtual getDrawable : (I)Landroid/graphics/drawable/Drawable;
    //   1027: astore #13
    //   1029: aload #8
    //   1031: iconst_4
    //   1032: invokevirtual getDrawable : (I)Landroid/graphics/drawable/Drawable;
    //   1035: checkcast android/graphics/drawable/StateListDrawable
    //   1038: astore #12
    //   1040: aload #8
    //   1042: iconst_5
    //   1043: invokevirtual getDrawable : (I)Landroid/graphics/drawable/Drawable;
    //   1046: astore #14
    //   1048: aload #10
    //   1050: ifnull -> 1121
    //   1053: aload #13
    //   1055: ifnull -> 1121
    //   1058: aload #12
    //   1060: ifnull -> 1121
    //   1063: aload #14
    //   1065: ifnull -> 1121
    //   1068: aload_0
    //   1069: invokevirtual getContext : ()Landroid/content/Context;
    //   1072: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   1075: astore #9
    //   1077: new r70
    //   1080: dup
    //   1081: aload_0
    //   1082: aload #10
    //   1084: aload #13
    //   1086: aload #12
    //   1088: aload #14
    //   1090: aload #9
    //   1092: ldc_w 2131165393
    //   1095: invokevirtual getDimensionPixelSize : (I)I
    //   1098: aload #9
    //   1100: ldc_w 2131165395
    //   1103: invokevirtual getDimensionPixelSize : (I)I
    //   1106: aload #9
    //   1108: ldc_w 2131165394
    //   1111: invokevirtual getDimensionPixelOffset : (I)I
    //   1114: invokespecial <init> : (Landroidx/recyclerview/widget/RecyclerView;Landroid/graphics/drawable/StateListDrawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/StateListDrawable;Landroid/graphics/drawable/Drawable;III)V
    //   1117: pop
    //   1118: goto -> 1136
    //   1121: ldc_w 'Trying to set fast scroller without both required drawables.'
    //   1124: aload_0
    //   1125: invokevirtual B : ()Ljava/lang/String;
    //   1128: invokevirtual concat : (Ljava/lang/String;)Ljava/lang/String;
    //   1131: invokestatic l : (Ljava/lang/String;)V
    //   1134: aconst_null
    //   1135: athrow
    //   1136: aload #8
    //   1138: invokevirtual recycle : ()V
    //   1141: aload_0
    //   1142: aload_1
    //   1143: invokevirtual getPackageManager : ()Landroid/content/pm/PackageManager;
    //   1146: ldc_w 'android.hardware.rotaryencoder.lowres'
    //   1149: invokevirtual hasSystemFeature : (Ljava/lang/String;)Z
    //   1152: putfield B0 : Z
    //   1155: aload #11
    //   1157: ifnull -> 1598
    //   1160: aload #11
    //   1162: invokevirtual trim : ()Ljava/lang/String;
    //   1165: astore #8
    //   1167: aload #8
    //   1169: invokevirtual isEmpty : ()Z
    //   1172: ifne -> 1598
    //   1175: aload #8
    //   1177: iconst_0
    //   1178: invokevirtual charAt : (I)C
    //   1181: bipush #46
    //   1183: if_icmpne -> 1223
    //   1186: new java/lang/StringBuilder
    //   1189: dup
    //   1190: invokespecial <init> : ()V
    //   1193: astore #9
    //   1195: aload #9
    //   1197: aload_1
    //   1198: invokevirtual getPackageName : ()Ljava/lang/String;
    //   1201: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1204: pop
    //   1205: aload #9
    //   1207: aload #8
    //   1209: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1212: pop
    //   1213: aload #9
    //   1215: invokevirtual toString : ()Ljava/lang/String;
    //   1218: astore #8
    //   1220: goto -> 1286
    //   1223: aload #8
    //   1225: ldc_w '.'
    //   1228: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   1231: ifeq -> 1237
    //   1234: goto -> 1220
    //   1237: new java/lang/StringBuilder
    //   1240: dup
    //   1241: invokespecial <init> : ()V
    //   1244: astore #9
    //   1246: aload #9
    //   1248: ldc androidx/recyclerview/widget/RecyclerView
    //   1250: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1253: invokevirtual getName : ()Ljava/lang/String;
    //   1256: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1259: pop
    //   1260: aload #9
    //   1262: bipush #46
    //   1264: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1267: pop
    //   1268: aload #9
    //   1270: aload #8
    //   1272: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1275: pop
    //   1276: aload #9
    //   1278: invokevirtual toString : ()Ljava/lang/String;
    //   1281: astore #8
    //   1283: goto -> 1220
    //   1286: aload_0
    //   1287: invokevirtual isInEditMode : ()Z
    //   1290: ifeq -> 1325
    //   1293: aload_0
    //   1294: invokevirtual getClass : ()Ljava/lang/Class;
    //   1297: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   1300: astore #9
    //   1302: goto -> 1331
    //   1305: astore_1
    //   1306: goto -> 1513
    //   1309: astore_1
    //   1310: goto -> 1530
    //   1313: astore_1
    //   1314: goto -> 1547
    //   1317: astore_1
    //   1318: goto -> 1564
    //   1321: astore_1
    //   1322: goto -> 1581
    //   1325: aload_1
    //   1326: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   1329: astore #9
    //   1331: aload #8
    //   1333: iconst_0
    //   1334: aload #9
    //   1336: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   1339: ldc_w androidx/recyclerview/widget/a
    //   1342: invokevirtual asSubclass : (Ljava/lang/Class;)Ljava/lang/Class;
    //   1345: astore #11
    //   1347: aload #11
    //   1349: getstatic androidx/recyclerview/widget/RecyclerView.K0 : [Ljava/lang/Class;
    //   1352: invokevirtual getConstructor : ([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
    //   1355: astore #9
    //   1357: iconst_4
    //   1358: anewarray java/lang/Object
    //   1361: astore #10
    //   1363: aload #10
    //   1365: iconst_0
    //   1366: aload_1
    //   1367: aastore
    //   1368: aload #10
    //   1370: iconst_1
    //   1371: aload_2
    //   1372: aastore
    //   1373: aload #10
    //   1375: iconst_2
    //   1376: iload_3
    //   1377: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1380: aastore
    //   1381: aload #10
    //   1383: iconst_3
    //   1384: iconst_0
    //   1385: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1388: aastore
    //   1389: goto -> 1408
    //   1392: astore #10
    //   1394: aload #11
    //   1396: aconst_null
    //   1397: invokevirtual getConstructor : ([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
    //   1400: astore #9
    //   1402: aconst_null
    //   1403: astore #10
    //   1405: goto -> 1389
    //   1408: aload #9
    //   1410: iconst_1
    //   1411: invokevirtual setAccessible : (Z)V
    //   1414: aload_0
    //   1415: aload #9
    //   1417: aload #10
    //   1419: invokevirtual newInstance : ([Ljava/lang/Object;)Ljava/lang/Object;
    //   1422: checkcast androidx/recyclerview/widget/a
    //   1425: invokevirtual setLayoutManager : (Landroidx/recyclerview/widget/a;)V
    //   1428: goto -> 1598
    //   1431: astore_1
    //   1432: goto -> 1530
    //   1435: astore_1
    //   1436: goto -> 1547
    //   1439: astore_1
    //   1440: goto -> 1564
    //   1443: astore_1
    //   1444: goto -> 1581
    //   1447: astore_1
    //   1448: aload_1
    //   1449: aload #10
    //   1451: invokevirtual initCause : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1454: pop
    //   1455: new java/lang/IllegalStateException
    //   1458: astore #10
    //   1460: new java/lang/StringBuilder
    //   1463: astore #9
    //   1465: aload #9
    //   1467: invokespecial <init> : ()V
    //   1470: aload #9
    //   1472: aload_2
    //   1473: invokeinterface getPositionDescription : ()Ljava/lang/String;
    //   1478: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1481: pop
    //   1482: aload #9
    //   1484: ldc_w ': Error creating LayoutManager '
    //   1487: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1490: pop
    //   1491: aload #9
    //   1493: aload #8
    //   1495: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1498: pop
    //   1499: aload #10
    //   1501: aload #9
    //   1503: invokevirtual toString : ()Ljava/lang/String;
    //   1506: aload_1
    //   1507: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Throwable;)V
    //   1510: aload #10
    //   1512: athrow
    //   1513: aload_2
    //   1514: invokeinterface getPositionDescription : ()Ljava/lang/String;
    //   1519: ldc_w ': Class is not a LayoutManager '
    //   1522: aload #8
    //   1524: aload_1
    //   1525: invokestatic f : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Throwable;)V
    //   1528: aconst_null
    //   1529: athrow
    //   1530: aload_2
    //   1531: invokeinterface getPositionDescription : ()Ljava/lang/String;
    //   1536: ldc_w ': Cannot access non-public constructor '
    //   1539: aload #8
    //   1541: aload_1
    //   1542: invokestatic f : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Throwable;)V
    //   1545: aconst_null
    //   1546: athrow
    //   1547: aload_2
    //   1548: invokeinterface getPositionDescription : ()Ljava/lang/String;
    //   1553: ldc_w ': Could not instantiate the LayoutManager: '
    //   1556: aload #8
    //   1558: aload_1
    //   1559: invokestatic f : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Throwable;)V
    //   1562: aconst_null
    //   1563: athrow
    //   1564: aload_2
    //   1565: invokeinterface getPositionDescription : ()Ljava/lang/String;
    //   1570: ldc_w ': Could not instantiate the LayoutManager: '
    //   1573: aload #8
    //   1575: aload_1
    //   1576: invokestatic f : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Throwable;)V
    //   1579: aconst_null
    //   1580: athrow
    //   1581: aload_2
    //   1582: invokeinterface getPositionDescription : ()Ljava/lang/String;
    //   1587: ldc_w ': Unable to find LayoutManager '
    //   1590: aload #8
    //   1592: aload_1
    //   1593: invokestatic f : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Throwable;)V
    //   1596: aconst_null
    //   1597: athrow
    //   1598: getstatic androidx/recyclerview/widget/RecyclerView.G0 : [I
    //   1601: astore #8
    //   1603: aload_1
    //   1604: aload_2
    //   1605: aload #8
    //   1607: iload_3
    //   1608: iconst_0
    //   1609: invokevirtual obtainStyledAttributes : (Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;
    //   1612: astore #9
    //   1614: aload_0
    //   1615: aload_1
    //   1616: aload #8
    //   1618: aload_2
    //   1619: aload #9
    //   1621: iload_3
    //   1622: invokestatic m : (Landroid/view/View;Landroid/content/Context;[ILandroid/util/AttributeSet;Landroid/content/res/TypedArray;I)V
    //   1625: aload #9
    //   1627: iconst_0
    //   1628: iconst_1
    //   1629: invokevirtual getBoolean : (IZ)Z
    //   1632: istore #7
    //   1634: aload #9
    //   1636: invokevirtual recycle : ()V
    //   1639: aload_0
    //   1640: iload #7
    //   1642: invokevirtual setNestedScrollingEnabled : (Z)V
    //   1645: aload_0
    //   1646: ldc_w 2131296829
    //   1649: getstatic java/lang/Boolean.TRUE : Ljava/lang/Boolean;
    //   1652: invokevirtual setTag : (ILjava/lang/Object;)V
    //   1655: return
    // Exception table:
    //   from	to	target	type
    //   1286	1302	1321	java/lang/ClassNotFoundException
    //   1286	1302	1317	java/lang/reflect/InvocationTargetException
    //   1286	1302	1313	java/lang/InstantiationException
    //   1286	1302	1309	java/lang/IllegalAccessException
    //   1286	1302	1305	java/lang/ClassCastException
    //   1325	1331	1443	java/lang/ClassNotFoundException
    //   1325	1331	1439	java/lang/reflect/InvocationTargetException
    //   1325	1331	1435	java/lang/InstantiationException
    //   1325	1331	1431	java/lang/IllegalAccessException
    //   1325	1331	1305	java/lang/ClassCastException
    //   1331	1347	1443	java/lang/ClassNotFoundException
    //   1331	1347	1439	java/lang/reflect/InvocationTargetException
    //   1331	1347	1435	java/lang/InstantiationException
    //   1331	1347	1431	java/lang/IllegalAccessException
    //   1331	1347	1305	java/lang/ClassCastException
    //   1347	1363	1392	java/lang/NoSuchMethodException
    //   1347	1363	1321	java/lang/ClassNotFoundException
    //   1347	1363	1317	java/lang/reflect/InvocationTargetException
    //   1347	1363	1313	java/lang/InstantiationException
    //   1347	1363	1309	java/lang/IllegalAccessException
    //   1347	1363	1305	java/lang/ClassCastException
    //   1373	1389	1392	java/lang/NoSuchMethodException
    //   1373	1389	1321	java/lang/ClassNotFoundException
    //   1373	1389	1317	java/lang/reflect/InvocationTargetException
    //   1373	1389	1313	java/lang/InstantiationException
    //   1373	1389	1309	java/lang/IllegalAccessException
    //   1373	1389	1305	java/lang/ClassCastException
    //   1394	1402	1447	java/lang/NoSuchMethodException
    //   1394	1402	1443	java/lang/ClassNotFoundException
    //   1394	1402	1439	java/lang/reflect/InvocationTargetException
    //   1394	1402	1435	java/lang/InstantiationException
    //   1394	1402	1431	java/lang/IllegalAccessException
    //   1394	1402	1305	java/lang/ClassCastException
    //   1408	1428	1443	java/lang/ClassNotFoundException
    //   1408	1428	1439	java/lang/reflect/InvocationTargetException
    //   1408	1428	1435	java/lang/InstantiationException
    //   1408	1428	1431	java/lang/IllegalAccessException
    //   1408	1428	1305	java/lang/ClassCastException
    //   1448	1513	1443	java/lang/ClassNotFoundException
    //   1448	1513	1439	java/lang/reflect/InvocationTargetException
    //   1448	1513	1435	java/lang/InstantiationException
    //   1448	1513	1431	java/lang/IllegalAccessException
    //   1448	1513	1305	java/lang/ClassCastException
  }
  
  public static RecyclerView H(View paramView) {
    if (!(paramView instanceof ViewGroup))
      return null; 
    if (paramView instanceof RecyclerView)
      return (RecyclerView)paramView; 
    ViewGroup viewGroup = (ViewGroup)paramView;
    int i = viewGroup.getChildCount();
    for (byte b = 0; b < i; b++) {
      RecyclerView recyclerView = H(viewGroup.getChildAt(b));
      if (recyclerView != null)
        return recyclerView; 
    } 
    return null;
  }
  
  public static int M(View paramView) {
    he1 he1 = O(paramView);
    return (he1 != null) ? he1.b() : -1;
  }
  
  public static he1 O(View paramView) {
    return (paramView == null) ? null : ((sd1)paramView.getLayoutParams()).b;
  }
  
  private m11 getScrollingChildHelper() {
    if (this.s0 == null)
      this.s0 = new m11(this); 
    return this.s0;
  }
  
  public static void k(he1 paramhe1) {
    WeakReference<View> weakReference = paramhe1.c;
    if (weakReference != null) {
      View view = weakReference.get();
      while (true) {
        if (view != null) {
          if (view == paramhe1.b)
            break; 
          ViewParent viewParent = view.getParent();
          if (viewParent instanceof View) {
            View view1 = (View)viewParent;
            continue;
          } 
          viewParent = null;
          continue;
        } 
        paramhe1.c = null;
        break;
      } 
    } 
  }
  
  public static int n(int paramInt1, EdgeEffect paramEdgeEffect1, EdgeEffect paramEdgeEffect2, int paramInt2) {
    if (paramInt1 > 0 && paramEdgeEffect1 != null && wf2.x(paramEdgeEffect1) != 0.0F) {
      float f1 = -paramInt1 * 4.0F / paramInt2;
      float f2 = -paramInt2 / 4.0F;
      paramInt2 = Math.round(wf2.K(paramEdgeEffect1, f1, 0.5F) * f2);
      if (paramInt2 != paramInt1)
        paramEdgeEffect1.finish(); 
      return paramInt1 - paramInt2;
    } 
    int i = paramInt1;
    if (paramInt1 < 0) {
      i = paramInt1;
      if (paramEdgeEffect2 != null) {
        i = paramInt1;
        if (wf2.x(paramEdgeEffect2) != 0.0F) {
          float f1 = paramInt1;
          float f2 = paramInt2;
          f1 = f1 * 4.0F / f2;
          f2 /= 4.0F;
          paramInt2 = Math.round(wf2.K(paramEdgeEffect2, f1, 0.5F) * f2);
          if (paramInt2 != paramInt1)
            paramEdgeEffect2.finish(); 
          i = paramInt1 - paramInt2;
        } 
      } 
    } 
    return i;
  }
  
  public static void setDebugAssertionsEnabled(boolean paramBoolean) {
    E0 = paramBoolean;
  }
  
  public static void setVerboseLoggingEnabled(boolean paramBoolean) {
    F0 = paramBoolean;
  }
  
  public final void A() {
    if (this.L != null)
      return; 
    ((ee1)this.J).getClass();
    EdgeEffect edgeEffect = new EdgeEffect(getContext());
    this.L = edgeEffect;
    if (this.j) {
      edgeEffect.setSize(getMeasuredWidth() - getPaddingLeft() - getPaddingRight(), getMeasuredHeight() - getPaddingTop() - getPaddingBottom());
      return;
    } 
    edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
  }
  
  public final String B() {
    StringBuilder stringBuilder = new StringBuilder(" ");
    stringBuilder.append(toString());
    stringBuilder.append(", adapter:");
    stringBuilder.append(this.o);
    stringBuilder.append(", layout:");
    stringBuilder.append(this.p);
    stringBuilder.append(", context:");
    stringBuilder.append(getContext());
    return stringBuilder.toString();
  }
  
  public final void C(de1 paramde1) {
    if (getScrollState() == 2) {
      OverScroller overScroller = this.g0.e;
      overScroller.getFinalX();
      overScroller.getCurrX();
      paramde1.getClass();
      overScroller.getFinalY();
      overScroller.getCurrY();
      return;
    } 
    paramde1.getClass();
  }
  
  public final View D(float paramFloat1, float paramFloat2) {
    tk tk1 = this.h;
    for (int i = tk1.e() - 1; i >= 0; i--) {
      View view = tk1.d(i);
      float f1 = view.getTranslationX();
      float f2 = view.getTranslationY();
      if (paramFloat1 >= view.getLeft() + f1 && paramFloat1 <= view.getRight() + f1 && paramFloat2 >= view.getTop() + f2 && paramFloat2 <= view.getBottom() + f2)
        return view; 
    } 
    return null;
  }
  
  public final View E(View paramView) {
    ViewParent viewParent2 = paramView.getParent();
    View view = paramView;
    ViewParent viewParent1;
    for (viewParent1 = viewParent2; viewParent1 != null && viewParent1 != this && viewParent1 instanceof View; viewParent1 = view.getParent())
      view = (View)viewParent1; 
    return (viewParent1 == this) ? view : null;
  }
  
  public final boolean F(MotionEvent paramMotionEvent) {
    int i = paramMotionEvent.getAction();
    ArrayList<ud1> arrayList = this.s;
    int j = arrayList.size();
    for (byte b = 0; b < j; b++) {
      ud1 ud11 = arrayList.get(b);
      if (ud11.b(paramMotionEvent) && i != 3) {
        this.t = ud11;
        return true;
      } 
    } 
    return false;
  }
  
  public final void G(int[] paramArrayOfint) {
    tk tk1 = this.h;
    int k = tk1.e();
    if (k == 0) {
      paramArrayOfint[0] = -1;
      paramArrayOfint[1] = -1;
      return;
    } 
    int i = Integer.MAX_VALUE;
    int j = Integer.MIN_VALUE;
    byte b = 0;
    while (b < k) {
      int m;
      he1 he1 = O(tk1.d(b));
      if (he1.q()) {
        m = j;
      } else {
        int i1 = he1.d();
        int n = i;
        if (i1 < i)
          n = i1; 
        i = n;
        m = j;
        if (i1 > j) {
          m = i1;
          i = n;
        } 
      } 
      b++;
      j = m;
    } 
    paramArrayOfint[0] = i;
    paramArrayOfint[1] = j;
  }
  
  public final he1 I(int paramInt) {
    he1 he1;
    boolean bool = this.F;
    View view = null;
    if (bool)
      return null; 
    tk tk1 = this.h;
    int i = tk1.h();
    byte b = 0;
    while (b < i) {
      he1 he11;
      he1 he12 = O(tk1.g(b));
      View view1 = view;
      if (he12 != null) {
        view1 = view;
        if (!he12.j()) {
          view1 = view;
          if (K(he12) == paramInt) {
            view1 = he12.b;
            if (((ArrayList)tk1.e).contains(view1)) {
              he11 = he12;
            } else {
              return he12;
            } 
          } 
        } 
      } 
      b++;
      he1 = he11;
    } 
    return he1;
  }
  
  public final boolean J(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    // Byte code:
    //   0: aload_0
    //   1: getfield p : Landroidx/recyclerview/widget/a;
    //   4: astore #16
    //   6: aload #16
    //   8: ifnonnull -> 23
    //   11: getstatic com/google/android/gms/common/api/internal/jEVH/KjdXPYm.VCf : Ljava/lang/String;
    //   14: ldc_w 'Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.'
    //   17: invokestatic e : (Ljava/lang/String;Ljava/lang/String;)I
    //   20: pop
    //   21: iconst_0
    //   22: ireturn
    //   23: aload_0
    //   24: getfield z : Z
    //   27: ifeq -> 33
    //   30: goto -> 1144
    //   33: aload #16
    //   35: invokevirtual o : ()Z
    //   38: istore #14
    //   40: aload_0
    //   41: getfield p : Landroidx/recyclerview/widget/a;
    //   44: invokevirtual p : ()Z
    //   47: istore #15
    //   49: iload #14
    //   51: ifeq -> 71
    //   54: iload_1
    //   55: invokestatic abs : (I)I
    //   58: iload_3
    //   59: if_icmpge -> 65
    //   62: goto -> 71
    //   65: iload_1
    //   66: istore #7
    //   68: goto -> 74
    //   71: iconst_0
    //   72: istore #7
    //   74: iload #15
    //   76: ifeq -> 95
    //   79: iload_2
    //   80: invokestatic abs : (I)I
    //   83: iload_3
    //   84: if_icmpge -> 90
    //   87: goto -> 95
    //   90: iload_2
    //   91: istore_1
    //   92: goto -> 97
    //   95: iconst_0
    //   96: istore_1
    //   97: iload #7
    //   99: ifne -> 109
    //   102: iload_1
    //   103: ifne -> 109
    //   106: goto -> 30
    //   109: iload #7
    //   111: ifeq -> 231
    //   114: aload_0
    //   115: getfield K : Landroid/widget/EdgeEffect;
    //   118: astore #16
    //   120: aload #16
    //   122: ifnull -> 178
    //   125: aload #16
    //   127: invokestatic x : (Landroid/widget/EdgeEffect;)F
    //   130: fconst_0
    //   131: fcmpl
    //   132: ifeq -> 178
    //   135: aload_0
    //   136: getfield K : Landroid/widget/EdgeEffect;
    //   139: astore #16
    //   141: iload #7
    //   143: ineg
    //   144: istore_3
    //   145: iload #7
    //   147: istore_2
    //   148: aload_0
    //   149: aload #16
    //   151: iload_3
    //   152: aload_0
    //   153: invokevirtual getWidth : ()I
    //   156: invokevirtual l0 : (Landroid/widget/EdgeEffect;II)Z
    //   159: ifeq -> 172
    //   162: aload_0
    //   163: getfield K : Landroid/widget/EdgeEffect;
    //   166: iload_3
    //   167: invokevirtual onAbsorb : (I)V
    //   170: iconst_0
    //   171: istore_2
    //   172: iconst_0
    //   173: istore #7
    //   175: goto -> 233
    //   178: aload_0
    //   179: getfield M : Landroid/widget/EdgeEffect;
    //   182: astore #16
    //   184: aload #16
    //   186: ifnull -> 231
    //   189: aload #16
    //   191: invokestatic x : (Landroid/widget/EdgeEffect;)F
    //   194: fconst_0
    //   195: fcmpl
    //   196: ifeq -> 231
    //   199: iload #7
    //   201: istore_2
    //   202: aload_0
    //   203: aload_0
    //   204: getfield M : Landroid/widget/EdgeEffect;
    //   207: iload #7
    //   209: aload_0
    //   210: invokevirtual getWidth : ()I
    //   213: invokevirtual l0 : (Landroid/widget/EdgeEffect;II)Z
    //   216: ifeq -> 172
    //   219: aload_0
    //   220: getfield M : Landroid/widget/EdgeEffect;
    //   223: iload #7
    //   225: invokevirtual onAbsorb : (I)V
    //   228: goto -> 170
    //   231: iconst_0
    //   232: istore_2
    //   233: iload_1
    //   234: ifeq -> 357
    //   237: aload_0
    //   238: getfield L : Landroid/widget/EdgeEffect;
    //   241: astore #16
    //   243: aload #16
    //   245: ifnull -> 307
    //   248: aload #16
    //   250: invokestatic x : (Landroid/widget/EdgeEffect;)F
    //   253: fconst_0
    //   254: fcmpl
    //   255: ifeq -> 307
    //   258: aload_0
    //   259: getfield L : Landroid/widget/EdgeEffect;
    //   262: astore #16
    //   264: iload_1
    //   265: ineg
    //   266: istore #8
    //   268: iload_1
    //   269: istore_3
    //   270: aload_0
    //   271: aload #16
    //   273: iload #8
    //   275: aload_0
    //   276: invokevirtual getHeight : ()I
    //   279: invokevirtual l0 : (Landroid/widget/EdgeEffect;II)Z
    //   282: ifeq -> 296
    //   285: aload_0
    //   286: getfield L : Landroid/widget/EdgeEffect;
    //   289: iload #8
    //   291: invokevirtual onAbsorb : (I)V
    //   294: iconst_0
    //   295: istore_3
    //   296: iconst_0
    //   297: istore #8
    //   299: iload_3
    //   300: istore_1
    //   301: iload #8
    //   303: istore_3
    //   304: goto -> 365
    //   307: aload_0
    //   308: getfield N : Landroid/widget/EdgeEffect;
    //   311: astore #16
    //   313: aload #16
    //   315: ifnull -> 357
    //   318: aload #16
    //   320: invokestatic x : (Landroid/widget/EdgeEffect;)F
    //   323: fconst_0
    //   324: fcmpl
    //   325: ifeq -> 357
    //   328: iload_1
    //   329: istore_3
    //   330: aload_0
    //   331: aload_0
    //   332: getfield N : Landroid/widget/EdgeEffect;
    //   335: iload_1
    //   336: aload_0
    //   337: invokevirtual getHeight : ()I
    //   340: invokevirtual l0 : (Landroid/widget/EdgeEffect;II)Z
    //   343: ifeq -> 296
    //   346: aload_0
    //   347: getfield N : Landroid/widget/EdgeEffect;
    //   350: iload_1
    //   351: invokevirtual onAbsorb : (I)V
    //   354: goto -> 294
    //   357: iconst_0
    //   358: istore #8
    //   360: iload_1
    //   361: istore_3
    //   362: iload #8
    //   364: istore_1
    //   365: aload_0
    //   366: getfield g0 : Lge1;
    //   369: astore #23
    //   371: iload_2
    //   372: ifne -> 385
    //   375: iload_1
    //   376: istore #9
    //   378: iload_2
    //   379: istore #8
    //   381: iload_1
    //   382: ifeq -> 430
    //   385: iload #4
    //   387: ineg
    //   388: istore #9
    //   390: iload #9
    //   392: iload_2
    //   393: iload #4
    //   395: invokestatic min : (II)I
    //   398: invokestatic max : (II)I
    //   401: istore #8
    //   403: iload #9
    //   405: iload_1
    //   406: iload #4
    //   408: invokestatic min : (II)I
    //   411: invokestatic max : (II)I
    //   414: istore #9
    //   416: aload_0
    //   417: iconst_1
    //   418: invokevirtual p0 : (I)V
    //   421: aload #23
    //   423: iload #8
    //   425: iload #9
    //   427: invokevirtual a : (II)V
    //   430: iload #7
    //   432: ifne -> 451
    //   435: iload_3
    //   436: ifne -> 451
    //   439: iload #8
    //   441: ifne -> 449
    //   444: iload #9
    //   446: ifeq -> 30
    //   449: iconst_1
    //   450: ireturn
    //   451: iload #7
    //   453: i2f
    //   454: fstore #5
    //   456: iload_3
    //   457: i2f
    //   458: fstore #6
    //   460: aload_0
    //   461: fload #5
    //   463: fload #6
    //   465: invokevirtual dispatchNestedPreFling : (FF)Z
    //   468: ifne -> 30
    //   471: iload #14
    //   473: ifne -> 490
    //   476: iload #15
    //   478: ifeq -> 484
    //   481: goto -> 490
    //   484: iconst_0
    //   485: istore #14
    //   487: goto -> 493
    //   490: iconst_1
    //   491: istore #14
    //   493: aload_0
    //   494: fload #5
    //   496: fload #6
    //   498: iload #14
    //   500: invokevirtual dispatchNestedFling : (FFZ)Z
    //   503: pop
    //   504: aload_0
    //   505: getfield a0 : Ltd1;
    //   508: astore #16
    //   510: aload #16
    //   512: ifnull -> 1098
    //   515: aload #16
    //   517: checkcast r51
    //   520: astore #16
    //   522: aload #16
    //   524: getfield a : Landroidx/recyclerview/widget/RecyclerView;
    //   527: invokevirtual getLayoutManager : ()Landroidx/recyclerview/widget/a;
    //   530: astore #24
    //   532: aload #24
    //   534: ifnonnull -> 540
    //   537: goto -> 1098
    //   540: aload #16
    //   542: getfield a : Landroidx/recyclerview/widget/RecyclerView;
    //   545: invokevirtual getAdapter : ()Lid1;
    //   548: ifnonnull -> 554
    //   551: goto -> 1098
    //   554: aload #16
    //   556: getfield a : Landroidx/recyclerview/widget/RecyclerView;
    //   559: invokevirtual getMinFlingVelocity : ()I
    //   562: istore_1
    //   563: iload_3
    //   564: invokestatic abs : (I)I
    //   567: iload_1
    //   568: if_icmpgt -> 580
    //   571: iload #7
    //   573: invokestatic abs : (I)I
    //   576: iload_1
    //   577: if_icmple -> 1098
    //   580: aload #24
    //   582: instanceof ce1
    //   585: istore #15
    //   587: iload #15
    //   589: ifne -> 595
    //   592: goto -> 1098
    //   595: aconst_null
    //   596: astore #18
    //   598: iload #15
    //   600: ifne -> 609
    //   603: aconst_null
    //   604: astore #20
    //   606: goto -> 628
    //   609: new q51
    //   612: dup
    //   613: aload #16
    //   615: aload #16
    //   617: getfield a : Landroidx/recyclerview/widget/RecyclerView;
    //   620: invokevirtual getContext : ()Landroid/content/Context;
    //   623: invokespecial <init> : (Lr51;Landroid/content/Context;)V
    //   626: astore #20
    //   628: aload #20
    //   630: ifnonnull -> 636
    //   633: goto -> 1098
    //   636: aload #24
    //   638: invokevirtual Q : ()I
    //   641: istore #13
    //   643: iload #13
    //   645: ifne -> 657
    //   648: iload #14
    //   650: istore #15
    //   652: iconst_m1
    //   653: istore_1
    //   654: goto -> 1075
    //   657: aload #24
    //   659: invokevirtual p : ()Z
    //   662: ifeq -> 677
    //   665: aload #16
    //   667: aload #24
    //   669: invokevirtual e : (Landroidx/recyclerview/widget/a;)Lf51;
    //   672: astore #17
    //   674: goto -> 700
    //   677: aload #24
    //   679: invokevirtual o : ()Z
    //   682: ifeq -> 697
    //   685: aload #16
    //   687: aload #24
    //   689: invokevirtual d : (Landroidx/recyclerview/widget/a;)Lf51;
    //   692: astore #17
    //   694: goto -> 700
    //   697: aconst_null
    //   698: astore #17
    //   700: aload #17
    //   702: ifnonnull -> 708
    //   705: goto -> 648
    //   708: aload #24
    //   710: invokevirtual G : ()I
    //   713: istore #10
    //   715: iconst_0
    //   716: istore #8
    //   718: ldc_w -2147483648
    //   721: istore_1
    //   722: ldc_w 2147483647
    //   725: istore #9
    //   727: aconst_null
    //   728: astore #16
    //   730: iload #8
    //   732: iload #10
    //   734: if_icmpge -> 869
    //   737: aload #24
    //   739: iload #8
    //   741: invokevirtual F : (I)Landroid/view/View;
    //   744: astore #21
    //   746: aload #21
    //   748: ifnonnull -> 762
    //   751: iload #9
    //   753: istore #11
    //   755: aload #18
    //   757: astore #22
    //   759: goto -> 855
    //   762: aload #21
    //   764: aload #17
    //   766: invokestatic b : (Landroid/view/View;Lf51;)I
    //   769: istore #12
    //   771: iload_1
    //   772: istore_2
    //   773: aload #16
    //   775: astore #19
    //   777: iload #12
    //   779: ifgt -> 801
    //   782: iload_1
    //   783: istore_2
    //   784: aload #16
    //   786: astore #19
    //   788: iload #12
    //   790: iload_1
    //   791: if_icmple -> 801
    //   794: aload #21
    //   796: astore #19
    //   798: iload #12
    //   800: istore_2
    //   801: iload_2
    //   802: istore_1
    //   803: iload #9
    //   805: istore #11
    //   807: aload #18
    //   809: astore #22
    //   811: aload #19
    //   813: astore #16
    //   815: iload #12
    //   817: iflt -> 855
    //   820: iload_2
    //   821: istore_1
    //   822: iload #9
    //   824: istore #11
    //   826: aload #18
    //   828: astore #22
    //   830: aload #19
    //   832: astore #16
    //   834: iload #12
    //   836: iload #9
    //   838: if_icmpge -> 855
    //   841: iload #12
    //   843: istore #11
    //   845: aload #19
    //   847: astore #16
    //   849: aload #21
    //   851: astore #22
    //   853: iload_2
    //   854: istore_1
    //   855: iinc #8, 1
    //   858: iload #11
    //   860: istore #9
    //   862: aload #22
    //   864: astore #18
    //   866: goto -> 730
    //   869: aload #24
    //   871: invokevirtual o : ()Z
    //   874: ifeq -> 892
    //   877: iload #7
    //   879: ifle -> 887
    //   882: iconst_1
    //   883: istore_1
    //   884: goto -> 899
    //   887: iconst_0
    //   888: istore_1
    //   889: goto -> 899
    //   892: iload_3
    //   893: ifle -> 887
    //   896: goto -> 882
    //   899: iload_1
    //   900: ifeq -> 921
    //   903: aload #18
    //   905: ifnull -> 921
    //   908: aload #18
    //   910: invokestatic R : (Landroid/view/View;)I
    //   913: istore_1
    //   914: iload #14
    //   916: istore #15
    //   918: goto -> 654
    //   921: iload_1
    //   922: ifne -> 943
    //   925: aload #16
    //   927: ifnull -> 943
    //   930: aload #16
    //   932: invokestatic R : (Landroid/view/View;)I
    //   935: istore_1
    //   936: iload #14
    //   938: istore #15
    //   940: goto -> 654
    //   943: iload_1
    //   944: ifeq -> 951
    //   947: aload #16
    //   949: astore #18
    //   951: aload #18
    //   953: ifnonnull -> 963
    //   956: iload #14
    //   958: istore #15
    //   960: goto -> 652
    //   963: aload #18
    //   965: invokestatic R : (Landroid/view/View;)I
    //   968: istore #8
    //   970: aload #24
    //   972: invokevirtual Q : ()I
    //   975: istore_2
    //   976: iload #15
    //   978: ifeq -> 1024
    //   981: aload #24
    //   983: checkcast ce1
    //   986: iload_2
    //   987: iconst_1
    //   988: isub
    //   989: invokeinterface e : (I)Landroid/graphics/PointF;
    //   994: astore #16
    //   996: aload #16
    //   998: ifnull -> 1024
    //   1001: aload #16
    //   1003: getfield x : F
    //   1006: fconst_0
    //   1007: fcmpg
    //   1008: iflt -> 1029
    //   1011: aload #16
    //   1013: getfield y : F
    //   1016: fconst_0
    //   1017: fcmpg
    //   1018: ifge -> 1024
    //   1021: goto -> 1029
    //   1024: iconst_0
    //   1025: istore_2
    //   1026: goto -> 1031
    //   1029: iconst_1
    //   1030: istore_2
    //   1031: iload_2
    //   1032: iload_1
    //   1033: if_icmpne -> 1041
    //   1036: iconst_m1
    //   1037: istore_1
    //   1038: goto -> 1043
    //   1041: iconst_1
    //   1042: istore_1
    //   1043: iload_1
    //   1044: iload #8
    //   1046: iadd
    //   1047: istore_2
    //   1048: iload #14
    //   1050: istore #15
    //   1052: iload_2
    //   1053: iflt -> 652
    //   1056: iload_2
    //   1057: istore_1
    //   1058: iload #14
    //   1060: istore #15
    //   1062: iload_2
    //   1063: iload #13
    //   1065: if_icmplt -> 654
    //   1068: iload #14
    //   1070: istore #15
    //   1072: goto -> 652
    //   1075: iload_1
    //   1076: iconst_m1
    //   1077: if_icmpne -> 1083
    //   1080: goto -> 1102
    //   1083: aload #20
    //   1085: iload_1
    //   1086: putfield a : I
    //   1089: aload #24
    //   1091: aload #20
    //   1093: invokevirtual P0 : (Lkn0;)V
    //   1096: iconst_1
    //   1097: ireturn
    //   1098: iload #14
    //   1100: istore #15
    //   1102: iload #15
    //   1104: ifeq -> 1144
    //   1107: aload_0
    //   1108: iconst_1
    //   1109: invokevirtual p0 : (I)V
    //   1112: iload #4
    //   1114: ineg
    //   1115: istore_1
    //   1116: aload #23
    //   1118: iload_1
    //   1119: iload #7
    //   1121: iload #4
    //   1123: invokestatic min : (II)I
    //   1126: invokestatic max : (II)I
    //   1129: iload_1
    //   1130: iload_3
    //   1131: iload #4
    //   1133: invokestatic min : (II)I
    //   1136: invokestatic max : (II)I
    //   1139: invokevirtual a : (II)V
    //   1142: iconst_1
    //   1143: ireturn
    //   1144: iconst_0
    //   1145: ireturn
  }
  
  public final int K(he1 paramhe1) {
    if ((paramhe1.l & 0x20C) != 0)
      return -1; 
    if (!paramhe1.g())
      return -1; 
    int i = paramhe1.e;
    ArrayList<u2> arrayList = (ArrayList)this.g.c;
    int j = arrayList.size();
    byte b = 0;
    while (b < j) {
      u2 u2 = arrayList.get(b);
      int k = u2.a;
      if (k != 1) {
        if (k != 2) {
          if (k != 8) {
            k = i;
          } else {
            k = u2.b;
            if (k == i) {
              k = u2.d;
            } else {
              int m = i;
              if (k < i)
                m = i - 1; 
              k = m;
              if (u2.d <= m)
                k = m + 1; 
            } 
          } 
        } else {
          int m = u2.b;
          k = i;
          if (m <= i) {
            k = u2.d;
            if (m + k > i)
              return -1; 
            k = i - k;
          } 
        } 
      } else {
        k = i;
        if (u2.b <= i)
          k = i + u2.d; 
      } 
      b++;
      i = k;
    } 
    return i;
  }
  
  public final long L(he1 paramhe1) {
    return this.o.b ? paramhe1.g : paramhe1.e;
  }
  
  public final he1 N(View paramView) {
    ViewParent viewParent = paramView.getParent();
    if (viewParent == null || viewParent == this)
      return O(paramView); 
    tp.h("View ", paramView, " is not a direct child of ", this);
    return null;
  }
  
  public final Rect P(View paramView) {
    sd1 sd1 = (sd1)paramView.getLayoutParams();
    boolean bool = sd1.e;
    Rect rect = sd1.c;
    if (bool) {
      de1 de11 = this.j0;
      if (!de11.g || (!sd1.b.m() && !sd1.b.h())) {
        rect.set(0, 0, 0, 0);
        ArrayList<pd1> arrayList = this.r;
        int i = arrayList.size();
        for (byte b = 0; b < i; b++) {
          Rect rect1 = this.l;
          rect1.set(0, 0, 0, 0);
          ((pd1)arrayList.get(b)).d(rect1, paramView, this, de11);
          rect.left += rect1.left;
          rect.top += rect1.top;
          rect.right += rect1.right;
          rect.bottom += rect1.bottom;
        } 
        sd1.e = false;
        return rect;
      } 
    } 
    return rect;
  }
  
  public final boolean Q() {
    return (!this.w || this.F || this.g.j());
  }
  
  public final boolean R() {
    return (this.H > 0);
  }
  
  public final void S(int paramInt) {
    if (this.p == null)
      return; 
    setScrollState(2);
    this.p.E0(paramInt);
    awakenScrollBars();
  }
  
  public final void T() {
    tk tk1 = this.h;
    int i = tk1.h();
    boolean bool = false;
    byte b;
    for (b = 0; b < i; b++)
      ((sd1)tk1.g(b).getLayoutParams()).e = true; 
    ArrayList arrayList = this.e.c;
    i = arrayList.size();
    for (b = bool; b < i; b++) {
      sd1 sd1 = (sd1)((he1)arrayList.get(b)).b.getLayoutParams();
      if (sd1 != null)
        sd1.e = true; 
    } 
  }
  
  public final void U(int paramInt1, int paramInt2, boolean paramBoolean) {
    int j = paramInt1 + paramInt2;
    tk tk1 = this.h;
    int k = tk1.h();
    int i;
    for (i = 0; i < k; i++) {
      he1 he1 = O(tk1.g(i));
      if (he1 != null && !he1.q()) {
        int m = he1.e;
        de1 de11 = this.j0;
        if (m >= j) {
          if (F0) {
            StringBuilder stringBuilder = new StringBuilder("offsetPositionRecordsForRemove attached child ");
            stringBuilder.append(i);
            stringBuilder.append(" holder ");
            stringBuilder.append(he1);
            stringBuilder.append(" now at position ");
            stringBuilder.append(he1.e - paramInt2);
            Log.d("RecyclerView", stringBuilder.toString());
          } 
          he1.n(-paramInt2, paramBoolean);
          de11.f = true;
        } else if (m >= paramInt1) {
          if (F0) {
            StringBuilder stringBuilder = new StringBuilder("offsetPositionRecordsForRemove attached child ");
            stringBuilder.append(i);
            stringBuilder.append(" holder ");
            stringBuilder.append(he1);
            stringBuilder.append(" now REMOVED");
            Log.d("RecyclerView", stringBuilder.toString());
          } 
          m = -paramInt2;
          he1.a(8);
          he1.n(m, paramBoolean);
          he1.e = paramInt1 - 1;
          de11.f = true;
        } 
      } 
    } 
    yd1 yd11 = this.e;
    ArrayList<he1> arrayList = yd11.c;
    for (i = arrayList.size() - 1; i >= 0; i--) {
      he1 he1 = arrayList.get(i);
      if (he1 != null) {
        k = he1.e;
        if (k >= j) {
          if (F0) {
            StringBuilder stringBuilder = new StringBuilder("offsetPositionRecordsForRemove cached ");
            stringBuilder.append(i);
            stringBuilder.append(" holder ");
            stringBuilder.append(he1);
            stringBuilder.append(" now at position ");
            stringBuilder.append(he1.e - paramInt2);
            Log.d("RecyclerView", stringBuilder.toString());
          } 
          he1.n(-paramInt2, paramBoolean);
        } else if (k >= paramInt1) {
          he1.a(8);
          yd11.h(i);
        } 
      } 
    } 
    requestLayout();
  }
  
  public final void V() {
    this.H++;
  }
  
  public final void W(boolean paramBoolean) {
    int i = this.H - 1;
    this.H = i;
    if (i < 1) {
      if (!E0 || i >= 0) {
        this.H = 0;
        if (paramBoolean) {
          i = this.B;
          this.B = 0;
          if (i != 0) {
            AccessibilityManager accessibilityManager = this.D;
            if (accessibilityManager != null && accessibilityManager.isEnabled()) {
              AccessibilityEvent accessibilityEvent = AccessibilityEvent.obtain();
              accessibilityEvent.setEventType(2048);
              accessibilityEvent.setContentChangeTypes(i);
              sendAccessibilityEventUnchecked(accessibilityEvent);
            } 
          } 
          ArrayList<he1> arrayList = this.w0;
          for (i = arrayList.size() - 1; i >= 0; i--) {
            he1 he1 = arrayList.get(i);
            if (he1.b.getParent() == this && !he1.q()) {
              int j = he1.s;
              if (j != -1) {
                he1.b.setImportantForAccessibility(j);
                he1.s = -1;
              } 
            } 
          } 
          arrayList.clear();
        } 
        return;
      } 
      tp.f("layout or scroll counter cannot go below zero.Some calls are not matching".concat(B()));
      return;
    } 
  }
  
  public final void X(MotionEvent paramMotionEvent) {
    int i = paramMotionEvent.getActionIndex();
    if (paramMotionEvent.getPointerId(i) == this.Q) {
      if (i == 0) {
        i = 1;
      } else {
        i = 0;
      } 
      this.Q = paramMotionEvent.getPointerId(i);
      int j = (int)(paramMotionEvent.getX(i) + 0.5F);
      this.U = j;
      this.S = j;
      i = (int)(paramMotionEvent.getY(i) + 0.5F);
      this.V = i;
      this.T = i;
    } 
  }
  
  public void Y(int paramInt) {}
  
  public final void Z() {
    if (!this.p0 && this.u) {
      WeakHashMap weakHashMap = v22.a;
      postOnAnimation((Runnable)this.x0);
      this.p0 = true;
    } 
  }
  
  public final void a0() {
    // Byte code:
    //   0: aload_0
    //   1: getfield F : Z
    //   4: istore_2
    //   5: aload_0
    //   6: getfield g : Lv2;
    //   9: astore #5
    //   11: iconst_0
    //   12: istore #4
    //   14: iload_2
    //   15: ifeq -> 64
    //   18: aload #5
    //   20: aload #5
    //   22: getfield c : Ljava/lang/Object;
    //   25: checkcast java/util/ArrayList
    //   28: invokevirtual q : (Ljava/util/ArrayList;)V
    //   31: aload #5
    //   33: aload #5
    //   35: getfield d : Ljava/lang/Object;
    //   38: checkcast java/util/ArrayList
    //   41: invokevirtual q : (Ljava/util/ArrayList;)V
    //   44: aload #5
    //   46: iconst_0
    //   47: putfield a : I
    //   50: aload_0
    //   51: getfield G : Z
    //   54: ifeq -> 64
    //   57: aload_0
    //   58: getfield p : Landroidx/recyclerview/widget/a;
    //   61: invokevirtual l0 : ()V
    //   64: aload_0
    //   65: getfield O : Lod1;
    //   68: ifnull -> 86
    //   71: aload_0
    //   72: getfield p : Landroidx/recyclerview/widget/a;
    //   75: invokevirtual Q0 : ()Z
    //   78: ifeq -> 86
    //   81: iconst_1
    //   82: istore_1
    //   83: goto -> 88
    //   86: iconst_0
    //   87: istore_1
    //   88: iload_1
    //   89: ifeq -> 100
    //   92: aload #5
    //   94: invokevirtual p : ()V
    //   97: goto -> 105
    //   100: aload #5
    //   102: invokevirtual d : ()V
    //   105: aload_0
    //   106: getfield m0 : Z
    //   109: ifne -> 127
    //   112: aload_0
    //   113: getfield n0 : Z
    //   116: ifeq -> 122
    //   119: goto -> 127
    //   122: iconst_0
    //   123: istore_1
    //   124: goto -> 129
    //   127: iconst_1
    //   128: istore_1
    //   129: aload_0
    //   130: getfield w : Z
    //   133: ifeq -> 185
    //   136: aload_0
    //   137: getfield O : Lod1;
    //   140: ifnull -> 185
    //   143: aload_0
    //   144: getfield F : Z
    //   147: istore_2
    //   148: iload_2
    //   149: ifne -> 166
    //   152: iload_1
    //   153: ifne -> 166
    //   156: aload_0
    //   157: getfield p : Landroidx/recyclerview/widget/a;
    //   160: getfield h : Z
    //   163: ifeq -> 185
    //   166: iload_2
    //   167: ifeq -> 180
    //   170: aload_0
    //   171: getfield o : Lid1;
    //   174: getfield b : Z
    //   177: ifeq -> 185
    //   180: iconst_1
    //   181: istore_2
    //   182: goto -> 187
    //   185: iconst_0
    //   186: istore_2
    //   187: aload_0
    //   188: getfield j0 : Lde1;
    //   191: astore #5
    //   193: aload #5
    //   195: iload_2
    //   196: putfield j : Z
    //   199: iload #4
    //   201: istore_3
    //   202: iload_2
    //   203: ifeq -> 248
    //   206: iload #4
    //   208: istore_3
    //   209: iload_1
    //   210: ifeq -> 248
    //   213: iload #4
    //   215: istore_3
    //   216: aload_0
    //   217: getfield F : Z
    //   220: ifne -> 248
    //   223: iload #4
    //   225: istore_3
    //   226: aload_0
    //   227: getfield O : Lod1;
    //   230: ifnull -> 248
    //   233: iload #4
    //   235: istore_3
    //   236: aload_0
    //   237: getfield p : Landroidx/recyclerview/widget/a;
    //   240: invokevirtual Q0 : ()Z
    //   243: ifeq -> 248
    //   246: iconst_1
    //   247: istore_3
    //   248: aload #5
    //   250: iload_3
    //   251: putfield k : Z
    //   254: return
  }
  
  public final void addFocusables(ArrayList paramArrayList, int paramInt1, int paramInt2) {
    a a1 = this.p;
    if (a1 != null)
      a1.getClass(); 
    super.addFocusables(paramArrayList, paramInt1, paramInt2);
  }
  
  public final void b0(boolean paramBoolean) {
    this.G = paramBoolean | this.G;
    this.F = true;
    tk tk1 = this.h;
    int i = tk1.h();
    boolean bool = false;
    byte b;
    for (b = 0; b < i; b++) {
      he1 he1 = O(tk1.g(b));
      if (he1 != null && !he1.q())
        he1.a(6); 
    } 
    T();
    yd1 yd11 = this.e;
    ArrayList<he1> arrayList = yd11.c;
    i = arrayList.size();
    for (b = bool; b < i; b++) {
      he1 he1 = arrayList.get(b);
      if (he1 != null) {
        he1.a(6);
        he1.a(1024);
      } 
    } 
    id1 id11 = yd11.h.o;
    if (id11 == null || !id11.b) {
      yd11.g();
      return;
    } 
  }
  
  public final void c0(he1 paramhe1, p11 paramp11) {
    paramhe1.l &= 0xFFFFDFFF;
    boolean bool = this.j0.h;
    j01 j011 = this.i;
    if (bool && paramhe1.m() && !paramhe1.j() && !paramhe1.q()) {
      long l = L(paramhe1);
      ((sp0)j011.e).d(l, paramhe1);
    } 
    zm1 zm1 = (zm1)j011.c;
    e32 e322 = (e32)zm1.get(paramhe1);
    e32 e321 = e322;
    if (e322 == null) {
      e321 = e32.a();
      zm1.put(paramhe1, e321);
    } 
    e321.b = paramp11;
    e321.a |= 0x4;
  }
  
  public final boolean checkLayoutParams(ViewGroup.LayoutParams paramLayoutParams) {
    return (paramLayoutParams instanceof sd1 && this.p.q((sd1)paramLayoutParams));
  }
  
  public final int computeHorizontalScrollExtent() {
    a a1 = this.p;
    return (a1 != null && a1.o()) ? this.p.u(this.j0) : 0;
  }
  
  public final int computeHorizontalScrollOffset() {
    a a1 = this.p;
    return (a1 != null && a1.o()) ? this.p.v(this.j0) : 0;
  }
  
  public final int computeHorizontalScrollRange() {
    a a1 = this.p;
    return (a1 != null && a1.o()) ? this.p.w(this.j0) : 0;
  }
  
  public final int computeVerticalScrollExtent() {
    a a1 = this.p;
    return (a1 != null && a1.p()) ? this.p.x(this.j0) : 0;
  }
  
  public final int computeVerticalScrollOffset() {
    a a1 = this.p;
    return (a1 != null && a1.p()) ? this.p.y(this.j0) : 0;
  }
  
  public final int computeVerticalScrollRange() {
    a a1 = this.p;
    return (a1 != null && a1.p()) ? this.p.z(this.j0) : 0;
  }
  
  public final void d0() {
    EdgeEffect edgeEffect = this.K;
    if (edgeEffect != null) {
      edgeEffect.onRelease();
      bool2 = this.K.isFinished();
    } else {
      bool2 = false;
    } 
    edgeEffect = this.L;
    boolean bool1 = bool2;
    if (edgeEffect != null) {
      edgeEffect.onRelease();
      bool1 = bool2 | this.L.isFinished();
    } 
    edgeEffect = this.M;
    boolean bool2 = bool1;
    if (edgeEffect != null) {
      edgeEffect.onRelease();
      bool2 = bool1 | this.M.isFinished();
    } 
    edgeEffect = this.N;
    bool1 = bool2;
    if (edgeEffect != null) {
      edgeEffect.onRelease();
      bool1 = bool2 | this.N.isFinished();
    } 
    if (bool1)
      postInvalidateOnAnimation(); 
  }
  
  public final boolean dispatchKeyEvent(KeyEvent paramKeyEvent) {
    if (super.dispatchKeyEvent(paramKeyEvent))
      return true; 
    a a1 = getLayoutManager();
    int j = 0;
    int i = 0;
    if (a1 != null)
      if (a1.p()) {
        j = paramKeyEvent.getKeyCode();
        if (j != 92 && j != 93) {
          if (j == 122 || j == 123) {
            boolean bool = a1.W();
            if (j == 122) {
              if (bool)
                i = getAdapter().c(); 
            } else if (!bool) {
              i = getAdapter().c();
            } 
            n0(i);
            return true;
          } 
        } else {
          i = getMeasuredHeight();
          if (j == 93) {
            m0(0, i, false);
            return true;
          } 
          m0(0, -i, false);
          return true;
        } 
      } else if (a1.o()) {
        i = paramKeyEvent.getKeyCode();
        if (i != 92 && i != 93) {
          if (i == 122 || i == 123) {
            boolean bool = a1.W();
            if (i == 122) {
              i = j;
              if (bool)
                i = getAdapter().c(); 
            } else if (bool) {
              i = j;
            } else {
              i = getAdapter().c();
            } 
            n0(i);
            return true;
          } 
        } else {
          j = getMeasuredWidth();
          if (i == 93) {
            m0(j, 0, false);
            return true;
          } 
          m0(-j, 0, false);
          return true;
        } 
      }  
    return false;
  }
  
  public final boolean dispatchNestedFling(float paramFloat1, float paramFloat2, boolean paramBoolean) {
    return getScrollingChildHelper().a(paramFloat1, paramFloat2, paramBoolean);
  }
  
  public final boolean dispatchNestedPreFling(float paramFloat1, float paramFloat2) {
    return getScrollingChildHelper().b(paramFloat1, paramFloat2);
  }
  
  public final boolean dispatchNestedPreScroll(int paramInt1, int paramInt2, int[] paramArrayOfint1, int[] paramArrayOfint2) {
    return getScrollingChildHelper().c(paramInt1, paramInt2, 0, paramArrayOfint1, paramArrayOfint2);
  }
  
  public final boolean dispatchNestedScroll(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int[] paramArrayOfint) {
    return getScrollingChildHelper().d(paramInt1, paramInt2, paramInt3, paramInt4, paramArrayOfint, 0, null);
  }
  
  public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent) {
    onPopulateAccessibilityEvent(paramAccessibilityEvent);
    return true;
  }
  
  public final void dispatchRestoreInstanceState(SparseArray paramSparseArray) {
    dispatchThawSelfOnly(paramSparseArray);
  }
  
  public final void dispatchSaveInstanceState(SparseArray paramSparseArray) {
    dispatchFreezeSelfOnly(paramSparseArray);
  }
  
  public final void draw(Canvas paramCanvas) {
    super.draw(paramCanvas);
    ArrayList<pd1> arrayList = this.r;
    int j = arrayList.size();
    boolean bool1 = false;
    int i;
    for (i = 0; i < j; i++)
      ((pd1)arrayList.get(i)).f(paramCanvas, this); 
    EdgeEffect edgeEffect = this.K;
    boolean bool2 = true;
    if (edgeEffect != null && !edgeEffect.isFinished()) {
      int k = paramCanvas.save();
      if (this.j) {
        i = getPaddingBottom();
      } else {
        i = 0;
      } 
      paramCanvas.rotate(270.0F);
      paramCanvas.translate((-getHeight() + i), 0.0F);
      edgeEffect = this.K;
      if (edgeEffect != null && edgeEffect.draw(paramCanvas)) {
        j = 1;
      } else {
        j = 0;
      } 
      paramCanvas.restoreToCount(k);
    } else {
      j = 0;
    } 
    edgeEffect = this.L;
    i = j;
    if (edgeEffect != null) {
      i = j;
      if (!edgeEffect.isFinished()) {
        int k = paramCanvas.save();
        if (this.j)
          paramCanvas.translate(getPaddingLeft(), getPaddingTop()); 
        edgeEffect = this.L;
        if (edgeEffect != null && edgeEffect.draw(paramCanvas)) {
          i = 1;
        } else {
          i = 0;
        } 
        i = j | i;
        paramCanvas.restoreToCount(k);
      } 
    } 
    edgeEffect = this.M;
    j = i;
    if (edgeEffect != null) {
      j = i;
      if (!edgeEffect.isFinished()) {
        int k = paramCanvas.save();
        int m = getWidth();
        if (this.j) {
          j = getPaddingTop();
        } else {
          j = 0;
        } 
        paramCanvas.rotate(90.0F);
        paramCanvas.translate(j, -m);
        edgeEffect = this.M;
        if (edgeEffect != null && edgeEffect.draw(paramCanvas)) {
          j = 1;
        } else {
          j = 0;
        } 
        j = i | j;
        paramCanvas.restoreToCount(k);
      } 
    } 
    edgeEffect = this.N;
    i = j;
    if (edgeEffect != null) {
      i = j;
      if (!edgeEffect.isFinished()) {
        int k = paramCanvas.save();
        paramCanvas.rotate(180.0F);
        if (this.j) {
          i = -getWidth();
          float f = (getPaddingRight() + i);
          i = -getHeight();
          paramCanvas.translate(f, (getPaddingBottom() + i));
        } else {
          paramCanvas.translate(-getWidth(), -getHeight());
        } 
        edgeEffect = this.N;
        i = bool1;
        if (edgeEffect != null) {
          i = bool1;
          if (edgeEffect.draw(paramCanvas))
            i = 1; 
        } 
        i = j | i;
        paramCanvas.restoreToCount(k);
      } 
    } 
    if (i == 0 && this.O != null && arrayList.size() > 0 && this.O.f())
      i = bool2; 
    if (i != 0)
      postInvalidateOnAnimation(); 
  }
  
  public final boolean drawChild(Canvas paramCanvas, View paramView, long paramLong) {
    return super.drawChild(paramCanvas, paramView, paramLong);
  }
  
  public final int e0(int paramInt, float paramFloat) {
    float f3 = paramFloat / getHeight();
    float f4 = paramInt / getWidth();
    EdgeEffect edgeEffect = this.K;
    float f1 = 0.0F;
    float f2 = 0.0F;
    paramFloat = 0.0F;
    if (edgeEffect != null && wf2.x(edgeEffect) != 0.0F) {
      boolean bool = canScrollHorizontally(-1);
      edgeEffect = this.K;
      if (bool) {
        edgeEffect.onRelease();
      } else {
        paramFloat = -wf2.K(edgeEffect, -f4, 1.0F - f3);
        if (wf2.x(this.K) == 0.0F)
          this.K.onRelease(); 
      } 
      invalidate();
    } else {
      edgeEffect = this.M;
      paramFloat = f2;
      if (edgeEffect != null) {
        paramFloat = f2;
        if (wf2.x(edgeEffect) != 0.0F) {
          boolean bool = canScrollHorizontally(1);
          edgeEffect = this.M;
          if (bool) {
            edgeEffect.onRelease();
            paramFloat = f1;
          } else {
            paramFloat = wf2.K(edgeEffect, f4, f3);
            if (wf2.x(this.M) == 0.0F)
              this.M.onRelease(); 
          } 
          invalidate();
        } 
      } 
    } 
    return Math.round(paramFloat * getWidth());
  }
  
  public final int f0(int paramInt, float paramFloat) {
    float f3 = paramFloat / getWidth();
    float f4 = paramInt / getHeight();
    EdgeEffect edgeEffect = this.L;
    float f2 = 0.0F;
    float f1 = 0.0F;
    paramFloat = 0.0F;
    if (edgeEffect != null && wf2.x(edgeEffect) != 0.0F) {
      boolean bool = canScrollVertically(-1);
      edgeEffect = this.L;
      if (bool) {
        edgeEffect.onRelease();
      } else {
        paramFloat = -wf2.K(edgeEffect, -f4, f3);
        if (wf2.x(this.L) == 0.0F)
          this.L.onRelease(); 
      } 
      invalidate();
    } else {
      edgeEffect = this.N;
      paramFloat = f1;
      if (edgeEffect != null) {
        paramFloat = f1;
        if (wf2.x(edgeEffect) != 0.0F) {
          boolean bool = canScrollVertically(1);
          edgeEffect = this.N;
          if (bool) {
            edgeEffect.onRelease();
            paramFloat = f2;
          } else {
            paramFloat = wf2.K(edgeEffect, f4, 1.0F - f3);
            if (wf2.x(this.N) == 0.0F)
              this.N.onRelease(); 
          } 
          invalidate();
        } 
      } 
    } 
    return Math.round(paramFloat * getHeight());
  }
  
  public final View focusSearch(View paramView, int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: getfield p : Landroidx/recyclerview/widget/a;
    //   4: invokevirtual getClass : ()Ljava/lang/Class;
    //   7: pop
    //   8: aload_0
    //   9: getfield o : Lid1;
    //   12: ifnull -> 41
    //   15: aload_0
    //   16: getfield p : Landroidx/recyclerview/widget/a;
    //   19: ifnull -> 41
    //   22: aload_0
    //   23: invokevirtual R : ()Z
    //   26: ifne -> 41
    //   29: aload_0
    //   30: getfield z : Z
    //   33: ifne -> 41
    //   36: iconst_1
    //   37: istore_3
    //   38: goto -> 43
    //   41: iconst_0
    //   42: istore_3
    //   43: invokestatic getInstance : ()Landroid/view/FocusFinder;
    //   46: astore #9
    //   48: aload_0
    //   49: getfield j0 : Lde1;
    //   52: astore #10
    //   54: aload_0
    //   55: getfield e : Lyd1;
    //   58: astore #11
    //   60: iload_3
    //   61: ifeq -> 264
    //   64: iload_2
    //   65: iconst_2
    //   66: if_icmpeq -> 74
    //   69: iload_2
    //   70: iconst_1
    //   71: if_icmpne -> 264
    //   74: aload_0
    //   75: getfield p : Landroidx/recyclerview/widget/a;
    //   78: invokevirtual p : ()Z
    //   81: ifeq -> 115
    //   84: iload_2
    //   85: iconst_2
    //   86: if_icmpne -> 96
    //   89: sipush #130
    //   92: istore_3
    //   93: goto -> 99
    //   96: bipush #33
    //   98: istore_3
    //   99: aload #9
    //   101: aload_0
    //   102: aload_1
    //   103: iload_3
    //   104: invokevirtual findNextFocus : (Landroid/view/ViewGroup;Landroid/view/View;I)Landroid/view/View;
    //   107: ifnonnull -> 115
    //   110: iconst_1
    //   111: istore_3
    //   112: goto -> 117
    //   115: iconst_0
    //   116: istore_3
    //   117: iload_3
    //   118: istore #4
    //   120: iload_3
    //   121: ifne -> 208
    //   124: iload_3
    //   125: istore #4
    //   127: aload_0
    //   128: getfield p : Landroidx/recyclerview/widget/a;
    //   131: invokevirtual o : ()Z
    //   134: ifeq -> 208
    //   137: aload_0
    //   138: getfield p : Landroidx/recyclerview/widget/a;
    //   141: getfield c : Landroidx/recyclerview/widget/RecyclerView;
    //   144: invokevirtual getLayoutDirection : ()I
    //   147: iconst_1
    //   148: if_icmpne -> 156
    //   151: iconst_1
    //   152: istore_3
    //   153: goto -> 158
    //   156: iconst_0
    //   157: istore_3
    //   158: iload_2
    //   159: iconst_2
    //   160: if_icmpne -> 169
    //   163: iconst_1
    //   164: istore #4
    //   166: goto -> 172
    //   169: iconst_0
    //   170: istore #4
    //   172: iload_3
    //   173: iload #4
    //   175: ixor
    //   176: ifeq -> 185
    //   179: bipush #66
    //   181: istore_3
    //   182: goto -> 188
    //   185: bipush #17
    //   187: istore_3
    //   188: aload #9
    //   190: aload_0
    //   191: aload_1
    //   192: iload_3
    //   193: invokevirtual findNextFocus : (Landroid/view/ViewGroup;Landroid/view/View;I)Landroid/view/View;
    //   196: ifnonnull -> 205
    //   199: iconst_1
    //   200: istore #4
    //   202: goto -> 208
    //   205: iconst_0
    //   206: istore #4
    //   208: iload #4
    //   210: ifeq -> 251
    //   213: aload_0
    //   214: invokevirtual o : ()V
    //   217: aload_0
    //   218: aload_1
    //   219: invokevirtual E : (Landroid/view/View;)Landroid/view/View;
    //   222: ifnonnull -> 228
    //   225: goto -> 295
    //   228: aload_0
    //   229: invokevirtual o0 : ()V
    //   232: aload_0
    //   233: getfield p : Landroidx/recyclerview/widget/a;
    //   236: aload_1
    //   237: iload_2
    //   238: aload #11
    //   240: aload #10
    //   242: invokevirtual f0 : (Landroid/view/View;ILyd1;Lde1;)Landroid/view/View;
    //   245: pop
    //   246: aload_0
    //   247: iconst_0
    //   248: invokevirtual q0 : (Z)V
    //   251: aload #9
    //   253: aload_0
    //   254: aload_1
    //   255: iload_2
    //   256: invokevirtual findNextFocus : (Landroid/view/ViewGroup;Landroid/view/View;I)Landroid/view/View;
    //   259: astore #9
    //   261: goto -> 324
    //   264: aload #9
    //   266: aload_0
    //   267: aload_1
    //   268: iload_2
    //   269: invokevirtual findNextFocus : (Landroid/view/ViewGroup;Landroid/view/View;I)Landroid/view/View;
    //   272: astore #9
    //   274: aload #9
    //   276: ifnonnull -> 324
    //   279: iload_3
    //   280: ifeq -> 324
    //   283: aload_0
    //   284: invokevirtual o : ()V
    //   287: aload_0
    //   288: aload_1
    //   289: invokevirtual E : (Landroid/view/View;)Landroid/view/View;
    //   292: ifnonnull -> 297
    //   295: aconst_null
    //   296: areturn
    //   297: aload_0
    //   298: invokevirtual o0 : ()V
    //   301: aload_0
    //   302: getfield p : Landroidx/recyclerview/widget/a;
    //   305: aload_1
    //   306: iload_2
    //   307: aload #11
    //   309: aload #10
    //   311: invokevirtual f0 : (Landroid/view/View;ILyd1;Lde1;)Landroid/view/View;
    //   314: astore #9
    //   316: aload_0
    //   317: iconst_0
    //   318: invokevirtual q0 : (Z)V
    //   321: goto -> 324
    //   324: aload #9
    //   326: ifnull -> 360
    //   329: aload #9
    //   331: invokevirtual hasFocusable : ()Z
    //   334: ifne -> 360
    //   337: aload_0
    //   338: invokevirtual getFocusedChild : ()Landroid/view/View;
    //   341: ifnonnull -> 351
    //   344: aload_0
    //   345: aload_1
    //   346: iload_2
    //   347: invokespecial focusSearch : (Landroid/view/View;I)Landroid/view/View;
    //   350: areturn
    //   351: aload_0
    //   352: aload #9
    //   354: aconst_null
    //   355: invokevirtual h0 : (Landroid/view/View;Landroid/view/View;)V
    //   358: aload_1
    //   359: areturn
    //   360: aload #9
    //   362: ifnull -> 832
    //   365: aload #9
    //   367: aload_0
    //   368: if_acmpeq -> 832
    //   371: aload #9
    //   373: aload_1
    //   374: if_acmpne -> 380
    //   377: goto -> 832
    //   380: aload_0
    //   381: aload #9
    //   383: invokevirtual E : (Landroid/view/View;)Landroid/view/View;
    //   386: ifnonnull -> 392
    //   389: goto -> 832
    //   392: aload_1
    //   393: ifnonnull -> 399
    //   396: goto -> 829
    //   399: aload_0
    //   400: aload_1
    //   401: invokevirtual E : (Landroid/view/View;)Landroid/view/View;
    //   404: ifnonnull -> 410
    //   407: goto -> 829
    //   410: aload_1
    //   411: invokevirtual getWidth : ()I
    //   414: istore #4
    //   416: aload_1
    //   417: invokevirtual getHeight : ()I
    //   420: istore_3
    //   421: aload_0
    //   422: getfield l : Landroid/graphics/Rect;
    //   425: astore #11
    //   427: aload #11
    //   429: iconst_0
    //   430: iconst_0
    //   431: iload #4
    //   433: iload_3
    //   434: invokevirtual set : (IIII)V
    //   437: aload #9
    //   439: invokevirtual getWidth : ()I
    //   442: istore #4
    //   444: aload #9
    //   446: invokevirtual getHeight : ()I
    //   449: istore_3
    //   450: aload_0
    //   451: getfield m : Landroid/graphics/Rect;
    //   454: astore #10
    //   456: aload #10
    //   458: iconst_0
    //   459: iconst_0
    //   460: iload #4
    //   462: iload_3
    //   463: invokevirtual set : (IIII)V
    //   466: aload_0
    //   467: aload_1
    //   468: aload #11
    //   470: invokevirtual offsetDescendantRectToMyCoords : (Landroid/view/View;Landroid/graphics/Rect;)V
    //   473: aload_0
    //   474: aload #9
    //   476: aload #10
    //   478: invokevirtual offsetDescendantRectToMyCoords : (Landroid/view/View;Landroid/graphics/Rect;)V
    //   481: aload_0
    //   482: getfield p : Landroidx/recyclerview/widget/a;
    //   485: getfield c : Landroidx/recyclerview/widget/RecyclerView;
    //   488: invokevirtual getLayoutDirection : ()I
    //   491: iconst_1
    //   492: if_icmpne -> 501
    //   495: iconst_m1
    //   496: istore #5
    //   498: goto -> 504
    //   501: iconst_1
    //   502: istore #5
    //   504: aload #11
    //   506: getfield left : I
    //   509: istore #6
    //   511: aload #10
    //   513: getfield left : I
    //   516: istore_3
    //   517: iload #6
    //   519: iload_3
    //   520: if_icmplt -> 532
    //   523: aload #11
    //   525: getfield right : I
    //   528: iload_3
    //   529: if_icmpgt -> 550
    //   532: aload #11
    //   534: getfield right : I
    //   537: aload #10
    //   539: getfield right : I
    //   542: if_icmpge -> 550
    //   545: iconst_1
    //   546: istore_3
    //   547: goto -> 591
    //   550: aload #11
    //   552: getfield right : I
    //   555: istore #4
    //   557: aload #10
    //   559: getfield right : I
    //   562: istore #7
    //   564: iload #4
    //   566: iload #7
    //   568: if_icmpgt -> 578
    //   571: iload #6
    //   573: iload #7
    //   575: if_icmplt -> 589
    //   578: iload #6
    //   580: iload_3
    //   581: if_icmple -> 589
    //   584: iconst_m1
    //   585: istore_3
    //   586: goto -> 591
    //   589: iconst_0
    //   590: istore_3
    //   591: aload #11
    //   593: getfield top : I
    //   596: istore #6
    //   598: aload #10
    //   600: getfield top : I
    //   603: istore #8
    //   605: iload #6
    //   607: iload #8
    //   609: if_icmplt -> 622
    //   612: aload #11
    //   614: getfield bottom : I
    //   617: iload #8
    //   619: if_icmpgt -> 641
    //   622: aload #11
    //   624: getfield bottom : I
    //   627: aload #10
    //   629: getfield bottom : I
    //   632: if_icmpge -> 641
    //   635: iconst_1
    //   636: istore #4
    //   638: goto -> 685
    //   641: aload #11
    //   643: getfield bottom : I
    //   646: istore #7
    //   648: aload #10
    //   650: getfield bottom : I
    //   653: istore #4
    //   655: iload #7
    //   657: iload #4
    //   659: if_icmpgt -> 669
    //   662: iload #6
    //   664: iload #4
    //   666: if_icmplt -> 682
    //   669: iload #6
    //   671: iload #8
    //   673: if_icmple -> 682
    //   676: iconst_m1
    //   677: istore #4
    //   679: goto -> 685
    //   682: iconst_0
    //   683: istore #4
    //   685: iload_2
    //   686: iconst_1
    //   687: if_icmpeq -> 812
    //   690: iload_2
    //   691: iconst_2
    //   692: if_icmpeq -> 792
    //   695: iload_2
    //   696: bipush #17
    //   698: if_icmpeq -> 785
    //   701: iload_2
    //   702: bipush #33
    //   704: if_icmpeq -> 777
    //   707: iload_2
    //   708: bipush #66
    //   710: if_icmpeq -> 770
    //   713: iload_2
    //   714: sipush #130
    //   717: if_icmpne -> 728
    //   720: iload #4
    //   722: ifle -> 832
    //   725: goto -> 829
    //   728: aload_0
    //   729: invokevirtual B : ()Ljava/lang/String;
    //   732: astore #9
    //   734: new java/lang/StringBuilder
    //   737: dup
    //   738: ldc_w 'Invalid direction: '
    //   741: invokespecial <init> : (Ljava/lang/String;)V
    //   744: astore_1
    //   745: aload_1
    //   746: iload_2
    //   747: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   750: pop
    //   751: aload_1
    //   752: aload #9
    //   754: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   757: pop
    //   758: new java/lang/IllegalArgumentException
    //   761: dup
    //   762: aload_1
    //   763: invokevirtual toString : ()Ljava/lang/String;
    //   766: invokespecial <init> : (Ljava/lang/String;)V
    //   769: athrow
    //   770: iload_3
    //   771: ifle -> 832
    //   774: goto -> 829
    //   777: iload #4
    //   779: ifge -> 832
    //   782: goto -> 829
    //   785: iload_3
    //   786: ifge -> 832
    //   789: goto -> 829
    //   792: iload #4
    //   794: ifgt -> 829
    //   797: iload #4
    //   799: ifne -> 832
    //   802: iload_3
    //   803: iload #5
    //   805: imul
    //   806: ifle -> 832
    //   809: goto -> 829
    //   812: iload #4
    //   814: iflt -> 829
    //   817: iload #4
    //   819: ifne -> 832
    //   822: iload_3
    //   823: iload #5
    //   825: imul
    //   826: ifge -> 832
    //   829: aload #9
    //   831: areturn
    //   832: aload_0
    //   833: aload_1
    //   834: iload_2
    //   835: invokespecial focusSearch : (Landroid/view/View;I)Landroid/view/View;
    //   838: areturn
  }
  
  public final void g(he1 paramhe1) {
    View view = paramhe1.b;
    if (view.getParent() == this) {
      i = 1;
    } else {
      i = 0;
    } 
    this.e.m(N(view));
    boolean bool = paramhe1.l();
    tk tk1 = this.h;
    if (bool) {
      tk1.b(view, -1, view.getLayoutParams(), true);
      return;
    } 
    if (!i) {
      tk1.a(view, -1, true);
      return;
    } 
    int i = ((xy)tk1.c).b.indexOfChild(view);
    if (i >= 0) {
      ((sk)tk1.d).i(i);
      tk1.i(view);
      return;
    } 
    m60.k("view is not a child, cannot hide ", view);
  }
  
  public final void g0(pd1 parampd1) {
    a a1 = this.p;
    if (a1 != null)
      a1.m("Cannot remove item decoration during a scroll  or layout"); 
    ArrayList arrayList = this.r;
    arrayList.remove(parampd1);
    if (arrayList.isEmpty()) {
      boolean bool;
      if (getOverScrollMode() == 2) {
        bool = true;
      } else {
        bool = false;
      } 
      setWillNotDraw(bool);
    } 
    T();
    requestLayout();
  }
  
  public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
    a a1 = this.p;
    if (a1 != null)
      return (ViewGroup.LayoutParams)a1.C(); 
    tp.f("RecyclerView has no LayoutManager".concat(B()));
    return null;
  }
  
  public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet paramAttributeSet) {
    a a1 = this.p;
    if (a1 != null)
      return (ViewGroup.LayoutParams)a1.D(getContext(), paramAttributeSet); 
    tp.f("RecyclerView has no LayoutManager".concat(B()));
    return null;
  }
  
  public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams paramLayoutParams) {
    a a1 = this.p;
    if (a1 != null)
      return (ViewGroup.LayoutParams)a1.E(paramLayoutParams); 
    tp.f("RecyclerView has no LayoutManager".concat(B()));
    return null;
  }
  
  public CharSequence getAccessibilityClassName() {
    return "androidx.recyclerview.widget.RecyclerView";
  }
  
  public id1 getAdapter() {
    return this.o;
  }
  
  public int getBaseline() {
    a a1 = this.p;
    if (a1 != null) {
      a1.getClass();
      return -1;
    } 
    return super.getBaseline();
  }
  
  public final int getChildDrawingOrder(int paramInt1, int paramInt2) {
    return super.getChildDrawingOrder(paramInt1, paramInt2);
  }
  
  public boolean getClipToPadding() {
    return this.j;
  }
  
  public je1 getCompatAccessibilityDelegate() {
    return this.q0;
  }
  
  public nd1 getEdgeEffectFactory() {
    return this.J;
  }
  
  public od1 getItemAnimator() {
    return this.O;
  }
  
  public int getItemDecorationCount() {
    return this.r.size();
  }
  
  public a getLayoutManager() {
    return this.p;
  }
  
  public int getMaxFlingVelocity() {
    return this.c0;
  }
  
  public int getMinFlingVelocity() {
    return this.b0;
  }
  
  public long getNanoTime() {
    return J0 ? System.nanoTime() : 0L;
  }
  
  public td1 getOnFlingListener() {
    return this.a0;
  }
  
  public boolean getPreserveFocusAfterLayout() {
    return this.f0;
  }
  
  public xd1 getRecycledViewPool() {
    return this.e.c();
  }
  
  public int getScrollState() {
    return this.P;
  }
  
  public final void h(pd1 parampd1) {
    a a1 = this.p;
    if (a1 != null)
      a1.m("Cannot add item decoration during a scroll  or layout"); 
    ArrayList<pd1> arrayList = this.r;
    if (arrayList.isEmpty())
      setWillNotDraw(false); 
    arrayList.add(parampd1);
    T();
    requestLayout();
  }
  
  public final void h0(View paramView1, View paramView2) {
    boolean bool;
    View view;
    if (paramView2 != null) {
      view = paramView2;
    } else {
      view = paramView1;
    } 
    int j = view.getWidth();
    int i = view.getHeight();
    Rect rect = this.l;
    rect.set(0, 0, j, i);
    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
    if (layoutParams instanceof sd1) {
      sd1 sd1 = (sd1)layoutParams;
      if (!sd1.e) {
        Rect rect1 = sd1.c;
        rect.left -= rect1.left;
        rect.right += rect1.right;
        rect.top -= rect1.top;
        rect.bottom += rect1.bottom;
      } 
    } 
    if (paramView2 != null) {
      offsetDescendantRectToMyCoords(paramView2, rect);
      offsetRectIntoDescendantCoords(paramView1, rect);
    } 
    a a1 = this.p;
    boolean bool1 = this.w;
    if (paramView2 == null) {
      bool = true;
    } else {
      bool = false;
    } 
    a1.B0(this, paramView1, this.l, bool1 ^ true, bool);
  }
  
  public final boolean hasNestedScrollingParent() {
    return getScrollingChildHelper().f(0);
  }
  
  public final void i(vd1 paramvd1) {
    if (this.l0 == null)
      this.l0 = new ArrayList(); 
    this.l0.add(paramvd1);
  }
  
  public final boolean i0(int paramInt1, int paramInt2, int paramInt3, MotionEvent paramMotionEvent) {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual o : ()V
    //   4: aload_0
    //   5: getfield o : Lid1;
    //   8: astore #19
    //   10: aload_0
    //   11: getfield v0 : [I
    //   14: astore #18
    //   16: aload #19
    //   18: ifnull -> 66
    //   21: aload #18
    //   23: iconst_0
    //   24: iconst_0
    //   25: iastore
    //   26: aload #18
    //   28: iconst_1
    //   29: iconst_0
    //   30: iastore
    //   31: aload_0
    //   32: iload_1
    //   33: iload_2
    //   34: aload #18
    //   36: invokevirtual j0 : (II[I)V
    //   39: aload #18
    //   41: iconst_0
    //   42: iaload
    //   43: istore #10
    //   45: aload #18
    //   47: iconst_1
    //   48: iaload
    //   49: istore #9
    //   51: iload_1
    //   52: iload #10
    //   54: isub
    //   55: istore #11
    //   57: iload_2
    //   58: iload #9
    //   60: isub
    //   61: istore #12
    //   63: goto -> 92
    //   66: iconst_0
    //   67: istore #13
    //   69: iconst_0
    //   70: istore #10
    //   72: iload #10
    //   74: istore #9
    //   76: iload #9
    //   78: istore #12
    //   80: iload #9
    //   82: istore #11
    //   84: iload #10
    //   86: istore #9
    //   88: iload #13
    //   90: istore #10
    //   92: aload_0
    //   93: getfield r : Ljava/util/ArrayList;
    //   96: invokevirtual isEmpty : ()Z
    //   99: ifne -> 106
    //   102: aload_0
    //   103: invokevirtual invalidate : ()V
    //   106: aload #18
    //   108: iconst_0
    //   109: iconst_0
    //   110: iastore
    //   111: aload #18
    //   113: iconst_1
    //   114: iconst_0
    //   115: iastore
    //   116: aload_0
    //   117: iload #10
    //   119: iload #9
    //   121: iload #11
    //   123: iload #12
    //   125: aload_0
    //   126: getfield t0 : [I
    //   129: iload_3
    //   130: aload #18
    //   132: invokevirtual v : (IIII[II[I)V
    //   135: aload #18
    //   137: iconst_0
    //   138: iaload
    //   139: istore #14
    //   141: aload #18
    //   143: iconst_1
    //   144: iaload
    //   145: istore_3
    //   146: iload #14
    //   148: ifne -> 164
    //   151: iload_3
    //   152: ifeq -> 158
    //   155: goto -> 164
    //   158: iconst_0
    //   159: istore #13
    //   161: goto -> 167
    //   164: iconst_1
    //   165: istore #13
    //   167: aload_0
    //   168: getfield U : I
    //   171: istore #16
    //   173: aload_0
    //   174: getfield t0 : [I
    //   177: astore #18
    //   179: aload #18
    //   181: iconst_0
    //   182: iaload
    //   183: istore #15
    //   185: aload_0
    //   186: iload #16
    //   188: iload #15
    //   190: isub
    //   191: putfield U : I
    //   194: aload_0
    //   195: getfield V : I
    //   198: istore #17
    //   200: aload #18
    //   202: iconst_1
    //   203: iaload
    //   204: istore #16
    //   206: aload_0
    //   207: iload #17
    //   209: iload #16
    //   211: isub
    //   212: putfield V : I
    //   215: aload_0
    //   216: getfield u0 : [I
    //   219: astore #18
    //   221: aload #18
    //   223: iconst_0
    //   224: aload #18
    //   226: iconst_0
    //   227: iaload
    //   228: iload #15
    //   230: iadd
    //   231: iastore
    //   232: aload #18
    //   234: iconst_1
    //   235: aload #18
    //   237: iconst_1
    //   238: iaload
    //   239: iload #16
    //   241: iadd
    //   242: iastore
    //   243: aload_0
    //   244: invokevirtual getOverScrollMode : ()I
    //   247: iconst_2
    //   248: if_icmpeq -> 517
    //   251: aload #4
    //   253: ifnull -> 508
    //   256: aload #4
    //   258: sipush #8194
    //   261: invokestatic J : (Landroid/view/MotionEvent;I)Z
    //   264: ifne -> 508
    //   267: aload #4
    //   269: invokevirtual getX : ()F
    //   272: fstore #5
    //   274: iload #11
    //   276: iload #14
    //   278: isub
    //   279: i2f
    //   280: fstore #8
    //   282: aload #4
    //   284: invokevirtual getY : ()F
    //   287: fstore #7
    //   289: iload #12
    //   291: iload_3
    //   292: isub
    //   293: i2f
    //   294: fstore #6
    //   296: fload #8
    //   298: fconst_0
    //   299: fcmpg
    //   300: ifge -> 339
    //   303: aload_0
    //   304: invokevirtual y : ()V
    //   307: aload_0
    //   308: getfield K : Landroid/widget/EdgeEffect;
    //   311: fload #8
    //   313: fneg
    //   314: aload_0
    //   315: invokevirtual getWidth : ()I
    //   318: i2f
    //   319: fdiv
    //   320: fconst_1
    //   321: fload #7
    //   323: aload_0
    //   324: invokevirtual getHeight : ()I
    //   327: i2f
    //   328: fdiv
    //   329: fsub
    //   330: invokestatic K : (Landroid/widget/EdgeEffect;FF)F
    //   333: pop
    //   334: iconst_1
    //   335: istore_3
    //   336: goto -> 379
    //   339: fload #8
    //   341: fconst_0
    //   342: fcmpl
    //   343: ifle -> 377
    //   346: aload_0
    //   347: invokevirtual z : ()V
    //   350: aload_0
    //   351: getfield M : Landroid/widget/EdgeEffect;
    //   354: fload #8
    //   356: aload_0
    //   357: invokevirtual getWidth : ()I
    //   360: i2f
    //   361: fdiv
    //   362: fload #7
    //   364: aload_0
    //   365: invokevirtual getHeight : ()I
    //   368: i2f
    //   369: fdiv
    //   370: invokestatic K : (Landroid/widget/EdgeEffect;FF)F
    //   373: pop
    //   374: goto -> 334
    //   377: iconst_0
    //   378: istore_3
    //   379: fload #6
    //   381: fconst_0
    //   382: fcmpg
    //   383: ifge -> 420
    //   386: aload_0
    //   387: invokevirtual A : ()V
    //   390: aload_0
    //   391: getfield L : Landroid/widget/EdgeEffect;
    //   394: fload #6
    //   396: fneg
    //   397: aload_0
    //   398: invokevirtual getHeight : ()I
    //   401: i2f
    //   402: fdiv
    //   403: fload #5
    //   405: aload_0
    //   406: invokevirtual getWidth : ()I
    //   409: i2f
    //   410: fdiv
    //   411: invokestatic K : (Landroid/widget/EdgeEffect;FF)F
    //   414: pop
    //   415: iconst_1
    //   416: istore_3
    //   417: goto -> 460
    //   420: fload #6
    //   422: fconst_0
    //   423: fcmpl
    //   424: ifle -> 460
    //   427: aload_0
    //   428: invokevirtual x : ()V
    //   431: aload_0
    //   432: getfield N : Landroid/widget/EdgeEffect;
    //   435: fload #6
    //   437: aload_0
    //   438: invokevirtual getHeight : ()I
    //   441: i2f
    //   442: fdiv
    //   443: fconst_1
    //   444: fload #5
    //   446: aload_0
    //   447: invokevirtual getWidth : ()I
    //   450: i2f
    //   451: fdiv
    //   452: fsub
    //   453: invokestatic K : (Landroid/widget/EdgeEffect;FF)F
    //   456: pop
    //   457: goto -> 415
    //   460: iload_3
    //   461: ifne -> 478
    //   464: fload #8
    //   466: fconst_0
    //   467: fcmpl
    //   468: ifne -> 478
    //   471: fload #6
    //   473: fconst_0
    //   474: fcmpl
    //   475: ifeq -> 482
    //   478: aload_0
    //   479: invokevirtual postInvalidateOnAnimation : ()V
    //   482: getstatic android/os/Build$VERSION.SDK_INT : I
    //   485: bipush #31
    //   487: if_icmplt -> 508
    //   490: aload #4
    //   492: ldc_w 4194304
    //   495: invokestatic J : (Landroid/view/MotionEvent;I)Z
    //   498: ifeq -> 508
    //   501: aload_0
    //   502: invokevirtual d0 : ()V
    //   505: goto -> 508
    //   508: aload_0
    //   509: iload_1
    //   510: iload_2
    //   511: invokevirtual m : (II)V
    //   514: goto -> 517
    //   517: iload #10
    //   519: ifne -> 527
    //   522: iload #9
    //   524: ifeq -> 535
    //   527: aload_0
    //   528: iload #10
    //   530: iload #9
    //   532: invokevirtual w : (II)V
    //   535: aload_0
    //   536: invokevirtual awakenScrollBars : ()Z
    //   539: ifne -> 546
    //   542: aload_0
    //   543: invokevirtual invalidate : ()V
    //   546: iload #13
    //   548: ifne -> 566
    //   551: iload #10
    //   553: ifne -> 566
    //   556: iload #9
    //   558: ifeq -> 564
    //   561: goto -> 566
    //   564: iconst_0
    //   565: ireturn
    //   566: iconst_1
    //   567: ireturn
  }
  
  public final boolean isAttachedToWindow() {
    return this.u;
  }
  
  public final boolean isLayoutSuppressed() {
    return this.z;
  }
  
  public final boolean isNestedScrollingEnabled() {
    return (getScrollingChildHelper()).d;
  }
  
  public final void j(String paramString) {
    if (R()) {
      if (paramString == null) {
        tp.f("Cannot call this method while RecyclerView is computing a layout or scrolling".concat(B()));
        return;
      } 
      tp.f(paramString);
      return;
    } 
    if (this.I > 0)
      Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException(B())); 
  }
  
  public final void j0(int paramInt1, int paramInt2, int[] paramArrayOfint) {
    o0();
    V();
    Trace.beginSection("RV Scroll");
    de1 de11 = this.j0;
    C(de11);
    yd1 yd11 = this.e;
    if (paramInt1 != 0) {
      paramInt1 = this.p.D0(paramInt1, yd11, de11);
    } else {
      paramInt1 = 0;
    } 
    if (paramInt2 != 0) {
      paramInt2 = this.p.F0(paramInt2, yd11, de11);
    } else {
      paramInt2 = 0;
    } 
    Trace.endSection();
    tk tk1 = this.h;
    int i = tk1.e();
    for (byte b = 0; b < i; b++) {
      View view = tk1.d(b);
      he1 he1 = N(view);
      if (he1 != null) {
        he1 = he1.k;
        if (he1 != null) {
          View view1 = he1.b;
          int j = view.getLeft();
          int k = view.getTop();
          if (j != view1.getLeft() || k != view1.getTop())
            view1.layout(j, k, view1.getWidth() + j, view1.getHeight() + k); 
        } 
      } 
    } 
    W(true);
    q0(false);
    if (paramArrayOfint != null) {
      paramArrayOfint[0] = paramInt1;
      paramArrayOfint[1] = paramInt2;
    } 
  }
  
  public final void k0(int paramInt) {
    if (this.z)
      return; 
    s0();
    a a1 = this.p;
    if (a1 == null) {
      Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
      return;
    } 
    a1.E0(paramInt);
    awakenScrollBars();
  }
  
  public final void l() {
    tk tk1 = this.h;
    int i = tk1.h();
    boolean bool = false;
    byte b;
    for (b = 0; b < i; b++) {
      he1 he1 = O(tk1.g(b));
      if (!he1.q()) {
        he1.f = -1;
        he1.i = -1;
      } 
    } 
    yd1 yd11 = this.e;
    ArrayList<he1> arrayList1 = yd11.a;
    ArrayList<he1> arrayList2 = yd11.c;
    i = arrayList2.size();
    for (b = 0; b < i; b++) {
      he1 he1 = arrayList2.get(b);
      he1.f = -1;
      he1.i = -1;
    } 
    i = arrayList1.size();
    for (b = 0; b < i; b++) {
      he1 he1 = arrayList1.get(b);
      he1.f = -1;
      he1.i = -1;
    } 
    arrayList1 = yd11.b;
    if (arrayList1 != null) {
      i = arrayList1.size();
      for (b = bool; b < i; b++) {
        he1 he1 = yd11.b.get(b);
        he1.f = -1;
        he1.i = -1;
      } 
    } 
  }
  
  public final boolean l0(EdgeEffect paramEdgeEffect, int paramInt1, int paramInt2) {
    if (paramInt1 <= 0) {
      float f3 = wf2.x(paramEdgeEffect);
      float f1 = paramInt2;
      float f2 = Math.abs(-paramInt1);
      float f4 = this.b * 0.015F;
      double d3 = Math.log((f2 * 0.35F / f4));
      double d2 = H0;
      double d1 = f4;
      if ((float)(Math.exp(d2 / (d2 - 1.0D) * d3) * d1) >= f3 * f1)
        return false; 
    } 
    return true;
  }
  
  public final void m(int paramInt1, int paramInt2) {
    EdgeEffect edgeEffect = this.K;
    if (edgeEffect != null && !edgeEffect.isFinished() && paramInt1 > 0) {
      this.K.onRelease();
      bool2 = this.K.isFinished();
    } else {
      bool2 = false;
    } 
    edgeEffect = this.M;
    boolean bool1 = bool2;
    if (edgeEffect != null) {
      bool1 = bool2;
      if (!edgeEffect.isFinished()) {
        bool1 = bool2;
        if (paramInt1 < 0) {
          this.M.onRelease();
          bool1 = bool2 | this.M.isFinished();
        } 
      } 
    } 
    edgeEffect = this.L;
    boolean bool2 = bool1;
    if (edgeEffect != null) {
      bool2 = bool1;
      if (!edgeEffect.isFinished()) {
        bool2 = bool1;
        if (paramInt2 > 0) {
          this.L.onRelease();
          bool2 = bool1 | this.L.isFinished();
        } 
      } 
    } 
    edgeEffect = this.N;
    bool1 = bool2;
    if (edgeEffect != null) {
      bool1 = bool2;
      if (!edgeEffect.isFinished()) {
        bool1 = bool2;
        if (paramInt2 < 0) {
          this.N.onRelease();
          bool1 = bool2 | this.N.isFinished();
        } 
      } 
    } 
    if (bool1)
      postInvalidateOnAnimation(); 
  }
  
  public final void m0(int paramInt1, int paramInt2, boolean paramBoolean) {
    a a1 = this.p;
    if (a1 == null) {
      Log.e("RecyclerView", VDgS.FgJnRSCfwPmX);
      return;
    } 
    if (!this.z) {
      boolean bool = a1.o();
      int j = 0;
      int i = paramInt1;
      if (!bool)
        i = 0; 
      if (!this.p.p())
        paramInt2 = 0; 
      if (i != 0 || paramInt2 != 0) {
        if (paramBoolean) {
          paramInt1 = j;
          if (i != 0)
            paramInt1 = 1; 
          j = paramInt1;
          if (paramInt2 != 0)
            j = paramInt1 | 0x2; 
          getScrollingChildHelper().g(j, 1);
        } 
        this.g0.c(i, paramInt2, -2147483648, null);
        return;
      } 
    } 
  }
  
  public final void n0(int paramInt) {
    if (this.z)
      return; 
    a a1 = this.p;
    if (a1 == null) {
      Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
      return;
    } 
    a1.O0(this, paramInt);
  }
  
  public final void o() {
    if (!this.w || this.F) {
      Trace.beginSection("RV FullInvalidate");
      r();
      Trace.endSection();
      return;
    } 
    v2 v21 = this.g;
    if (v21.j()) {
      int i = v21.a;
      if ((i & 0x4) == 0 || (i & 0xB) != 0) {
        if (v21.j()) {
          Trace.beginSection("RV FullInvalidate");
          r();
          Trace.endSection();
        } 
        return;
      } 
      Trace.beginSection("RV PartialInvalidate");
      o0();
      V();
      v21.p();
      if (!this.y) {
        tk tk1 = this.h;
        int j = tk1.e();
        i = 0;
        while (true) {
          if (i < j) {
            he1 he1 = O(tk1.d(i));
            if (he1 != null && !he1.q() && he1.m()) {
              r();
              break;
            } 
            i++;
            continue;
          } 
          v21.c();
          break;
        } 
      } 
      q0(true);
      W(true);
      Trace.endSection();
      return;
    } 
  }
  
  public final void o0() {
    int i = this.x + 1;
    this.x = i;
    if (i == 1 && !this.z)
      this.y = false; 
  }
  
  public final void onAttachedToWindow() {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial onAttachedToWindow : ()V
    //   4: aload_0
    //   5: iconst_0
    //   6: putfield H : I
    //   9: aload_0
    //   10: iconst_1
    //   11: putfield u : Z
    //   14: aload_0
    //   15: getfield w : Z
    //   18: ifeq -> 33
    //   21: aload_0
    //   22: invokevirtual isLayoutRequested : ()Z
    //   25: ifne -> 33
    //   28: iconst_1
    //   29: istore_2
    //   30: goto -> 35
    //   33: iconst_0
    //   34: istore_2
    //   35: aload_0
    //   36: iload_2
    //   37: putfield w : Z
    //   40: aload_0
    //   41: getfield e : Lyd1;
    //   44: invokevirtual e : ()V
    //   47: aload_0
    //   48: getfield p : Landroidx/recyclerview/widget/a;
    //   51: astore_3
    //   52: aload_3
    //   53: ifnull -> 66
    //   56: aload_3
    //   57: iconst_1
    //   58: putfield i : Z
    //   61: aload_3
    //   62: aload_0
    //   63: invokevirtual d0 : (Landroidx/recyclerview/widget/RecyclerView;)V
    //   66: aload_0
    //   67: iconst_0
    //   68: putfield p0 : Z
    //   71: getstatic androidx/recyclerview/widget/RecyclerView.J0 : Z
    //   74: ifeq -> 217
    //   77: getstatic rd0.g : Ljava/lang/ThreadLocal;
    //   80: astore_3
    //   81: aload_3
    //   82: invokevirtual get : ()Ljava/lang/Object;
    //   85: checkcast rd0
    //   88: astore #4
    //   90: aload_0
    //   91: aload #4
    //   93: putfield h0 : Lrd0;
    //   96: aload #4
    //   98: ifnonnull -> 179
    //   101: aload_0
    //   102: new rd0
    //   105: dup
    //   106: invokespecial <init> : ()V
    //   109: putfield h0 : Lrd0;
    //   112: getstatic v22.a : Ljava/util/WeakHashMap;
    //   115: astore #4
    //   117: aload_0
    //   118: invokevirtual getDisplay : ()Landroid/view/Display;
    //   121: astore #4
    //   123: aload_0
    //   124: invokevirtual isInEditMode : ()Z
    //   127: ifne -> 152
    //   130: aload #4
    //   132: ifnull -> 152
    //   135: aload #4
    //   137: invokevirtual getRefreshRate : ()F
    //   140: fstore_1
    //   141: fload_1
    //   142: ldc_w 30.0
    //   145: fcmpl
    //   146: iflt -> 152
    //   149: goto -> 156
    //   152: ldc_w 60.0
    //   155: fstore_1
    //   156: aload_0
    //   157: getfield h0 : Lrd0;
    //   160: astore #4
    //   162: aload #4
    //   164: ldc_w 1.0E9
    //   167: fload_1
    //   168: fdiv
    //   169: f2l
    //   170: putfield e : J
    //   173: aload_3
    //   174: aload #4
    //   176: invokevirtual set : (Ljava/lang/Object;)V
    //   179: aload_0
    //   180: getfield h0 : Lrd0;
    //   183: getfield b : Ljava/util/ArrayList;
    //   186: astore_3
    //   187: getstatic androidx/recyclerview/widget/RecyclerView.E0 : Z
    //   190: ifeq -> 211
    //   193: aload_3
    //   194: aload_0
    //   195: invokevirtual contains : (Ljava/lang/Object;)Z
    //   198: ifne -> 204
    //   201: goto -> 211
    //   204: ldc_w 'RecyclerView already present in worker list!'
    //   207: invokestatic f : (Ljava/lang/String;)V
    //   210: return
    //   211: aload_3
    //   212: aload_0
    //   213: invokevirtual add : (Ljava/lang/Object;)Z
    //   216: pop
    //   217: return
  }
  
  public void onDetachedFromWindow() {
    super.onDetachedFromWindow();
    od1 od11 = this.O;
    if (od11 != null)
      od11.e(); 
    s0();
    int j = 0;
    this.u = false;
    a a1 = this.p;
    if (a1 != null) {
      a1.i = false;
      a1.e0(this);
    } 
    this.w0.clear();
    removeCallbacks((Runnable)this.x0);
    this.i.getClass();
    while (e32.d.b() != null);
    yd1 yd11 = this.e;
    ArrayList arrayList = yd11.c;
    int i;
    for (i = 0; i < arrayList.size(); i++)
      ui0.e(((he1)arrayList.get(i)).b); 
    yd11.f(yd11.h.o, false);
    i = j;
    while (i < getChildCount()) {
      View view = getChildAt(i);
      if (view != null) {
        x81 x812 = (x81)view.getTag(2131297308);
        x81 x811 = x812;
        if (x812 == null) {
          x811 = new x81();
          view.setTag(2131297308, x811);
        } 
        ArrayList<E> arrayList1 = x811.a;
        arrayList1.getClass();
        j = arrayList1.size() - 1;
        if (-1 >= j) {
          i++;
          continue;
        } 
        arrayList1.get(j).getClass();
        tp.b();
        return;
      } 
      throw new IndexOutOfBoundsException();
    } 
    if (J0) {
      rd0 rd01 = this.h0;
      if (rd01 != null) {
        boolean bool = rd01.b.remove(this);
        if (!E0 || bool) {
          this.h0 = null;
          return;
        } 
        tp.f("RecyclerView removal failed!");
        return;
      } 
    } 
  }
  
  public final void onDraw(Canvas paramCanvas) {
    super.onDraw(paramCanvas);
    ArrayList<pd1> arrayList = this.r;
    int i = arrayList.size();
    for (byte b = 0; b < i; b++)
      ((pd1)arrayList.get(b)).e(paramCanvas, this); 
  }
  
  public final boolean onGenericMotionEvent(MotionEvent paramMotionEvent) {
    if (this.p != null && !this.z && paramMotionEvent.getAction() == 8) {
      float f1;
      boolean bool;
      int i = paramMotionEvent.getSource();
      float f2 = 0.0F;
      float f4 = 0.0F;
      float f3 = 0.0F;
      if ((i & 0x2) != 0) {
        if (this.p.p()) {
          f1 = -paramMotionEvent.getAxisValue(9);
        } else {
          f1 = 0.0F;
        } 
        f2 = f3;
        if (this.p.o())
          f2 = paramMotionEvent.getAxisValue(10); 
        f3 = f2;
        i = 0;
        bool = false;
        f2 = f1;
        f1 = f3;
      } else if ((paramMotionEvent.getSource() & 0x400000) != 0) {
        f1 = paramMotionEvent.getAxisValue(26);
        if (this.p.p()) {
          f2 = -f1;
          f1 = 0.0F;
        } else if (!this.p.o()) {
          f1 = 0.0F;
        } 
        bool = this.B0;
        i = 26;
      } else {
        f1 = 0.0F;
        i = 0;
        bool = false;
        f2 = f4;
      } 
      int j = (int)(f2 * this.e0);
      int k = (int)(f1 * this.d0);
      if (bool) {
        OverScroller overScroller = this.g0.e;
        int m = overScroller.getFinalY();
        int n = overScroller.getCurrY();
        m0(overScroller.getFinalX() - overScroller.getCurrX() + k, m - n + j, true);
      } else {
        a a1 = this.p;
        if (a1 == null) {
          Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (!this.z) {
          boolean bool1;
          boolean bool2;
          boolean bool3;
          int[] arrayOfInt = this.v0;
          arrayOfInt[0] = 0;
          arrayOfInt[1] = 0;
          boolean bool4 = a1.o();
          boolean bool5 = this.p.p();
          if (bool5) {
            int i1 = bool4 | 0x2;
          } else {
            bool1 = bool4;
          } 
          f2 = paramMotionEvent.getY();
          f1 = paramMotionEvent.getX();
          int n = k - e0(k, f2);
          k = j - f0(j, f1);
          getScrollingChildHelper().g(bool1, 1);
          if (bool4) {
            bool2 = n;
          } else {
            bool2 = false;
          } 
          if (bool5) {
            bool3 = k;
          } else {
            bool3 = false;
          } 
          j = n;
          int m = k;
          if (u(bool2, bool3, 1, this.v0, this.t0)) {
            j = n - arrayOfInt[0];
            m = k - arrayOfInt[1];
          } 
          if (bool4) {
            k = j;
          } else {
            k = 0;
          } 
          if (bool5) {
            n = m;
          } else {
            n = 0;
          } 
          i0(k, n, 1, paramMotionEvent);
          rd0 rd01 = this.h0;
          if (rd01 != null && (j != 0 || m != 0))
            rd01.a(this, j, m); 
          r0(1);
        } 
      } 
      if (i != 0 && !bool)
        this.D0.a(paramMotionEvent, i); 
    } 
    return false;
  }
  
  public final boolean onInterceptTouchEvent(MotionEvent paramMotionEvent) {
    if (!this.z) {
      VelocityTracker velocityTracker;
      this.t = null;
      if (F(paramMotionEvent)) {
        velocityTracker = this.R;
        if (velocityTracker != null)
          velocityTracker.clear(); 
        r0(0);
        d0();
        setScrollState(0);
        return true;
      } 
      a a1 = this.p;
      if (a1 != null) {
        StringBuilder stringBuilder;
        boolean bool2 = a1.o();
        boolean bool1 = this.p.p();
        if (this.R == null)
          this.R = VelocityTracker.obtain(); 
        this.R.addMovement((MotionEvent)velocityTracker);
        int j = velocityTracker.getActionMasked();
        int i = velocityTracker.getActionIndex();
        if (j != 0) {
          if (j != 1) {
            if (j != 2) {
              if (j != 3) {
                if (j != 5) {
                  if (j == 6)
                    X((MotionEvent)velocityTracker); 
                } else {
                  this.Q = velocityTracker.getPointerId(i);
                  j = (int)(velocityTracker.getX(i) + 0.5F);
                  this.U = j;
                  this.S = j;
                  i = (int)(velocityTracker.getY(i) + 0.5F);
                  this.V = i;
                  this.T = i;
                } 
              } else {
                velocityTracker = this.R;
                if (velocityTracker != null)
                  velocityTracker.clear(); 
                r0(0);
                d0();
                setScrollState(0);
              } 
            } else {
              j = velocityTracker.findPointerIndex(this.Q);
              if (j < 0) {
                stringBuilder = new StringBuilder("Error processing scroll; pointer index for id ");
                stringBuilder.append(this.Q);
                stringBuilder.append(" not found. Did any MotionEvents get skipped?");
                Log.e("RecyclerView", stringBuilder.toString());
                return false;
              } 
              i = (int)(stringBuilder.getX(j) + 0.5F);
              int k = (int)(stringBuilder.getY(j) + 0.5F);
              if (this.P != 1) {
                j = this.S;
                int m = this.T;
                if (bool2 && Math.abs(i - j) > this.W) {
                  this.U = i;
                  i = 1;
                } else {
                  i = 0;
                } 
                j = i;
                if (bool1) {
                  j = i;
                  if (Math.abs(k - m) > this.W) {
                    this.V = k;
                    j = 1;
                  } 
                } 
                if (j != 0)
                  setScrollState(1); 
              } 
            } 
          } else {
            this.R.clear();
            r0(0);
          } 
        } else {
          if (this.A)
            this.A = false; 
          this.Q = stringBuilder.getPointerId(0);
          i = (int)(stringBuilder.getX() + 0.5F);
          this.U = i;
          this.S = i;
          i = (int)(stringBuilder.getY() + 0.5F);
          this.V = i;
          this.T = i;
          EdgeEffect edgeEffect = this.K;
          if (edgeEffect != null && wf2.x(edgeEffect) != 0.0F && !canScrollHorizontally(-1)) {
            wf2.K(this.K, 0.0F, 1.0F - stringBuilder.getY() / getHeight());
            i = 1;
          } else {
            i = 0;
          } 
          edgeEffect = this.M;
          j = i;
          if (edgeEffect != null) {
            j = i;
            if (wf2.x(edgeEffect) != 0.0F) {
              j = i;
              if (!canScrollHorizontally(1)) {
                wf2.K(this.M, 0.0F, stringBuilder.getY() / getHeight());
                j = 1;
              } 
            } 
          } 
          edgeEffect = this.L;
          i = j;
          if (edgeEffect != null) {
            i = j;
            if (wf2.x(edgeEffect) != 0.0F) {
              i = j;
              if (!canScrollVertically(-1)) {
                wf2.K(this.L, 0.0F, stringBuilder.getX() / getWidth());
                i = 1;
              } 
            } 
          } 
          edgeEffect = this.N;
          j = i;
          if (edgeEffect != null) {
            j = i;
            if (wf2.x(edgeEffect) != 0.0F) {
              j = i;
              if (!canScrollVertically(1)) {
                wf2.K(this.N, 0.0F, 1.0F - stringBuilder.getX() / getWidth());
                j = 1;
              } 
            } 
          } 
          if (j != 0 || this.P == 2) {
            getParent().requestDisallowInterceptTouchEvent(true);
            setScrollState(1);
            r0(1);
          } 
          int[] arrayOfInt = this.u0;
          arrayOfInt[1] = 0;
          arrayOfInt[0] = 0;
          p0(0);
        } 
        if (this.P == 1)
          return true; 
      } 
    } 
    return false;
  }
  
  public final void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    Trace.beginSection("RV OnLayout");
    r();
    Trace.endSection();
    this.w = true;
  }
  
  public final void onMeasure(int paramInt1, int paramInt2) {
    a a1 = this.p;
    if (a1 == null) {
      p(paramInt1, paramInt2);
      return;
    } 
    boolean bool = a1.V();
    boolean bool1 = false;
    de1 de11 = this.j0;
    if (bool) {
      int i = View.MeasureSpec.getMode(paramInt1);
      int j = View.MeasureSpec.getMode(paramInt2);
      this.p.c.p(paramInt1, paramInt2);
      bool = bool1;
      if (i == 1073741824) {
        bool = bool1;
        if (j == 1073741824)
          bool = true; 
      } 
      this.y0 = bool;
      if (!bool && this.o != null) {
        if (de11.d == 1)
          s(); 
        this.p.H0(paramInt1, paramInt2);
        de11.i = true;
        t();
        this.p.J0(paramInt1, paramInt2);
        if (this.p.M0()) {
          this.p.H0(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
          de11.i = true;
          t();
          this.p.J0(paramInt1, paramInt2);
        } 
        this.z0 = getMeasuredWidth();
        this.A0 = getMeasuredHeight();
      } 
      return;
    } 
    if (this.v) {
      this.p.c.p(paramInt1, paramInt2);
      return;
    } 
    if (this.C) {
      o0();
      V();
      a0();
      W(true);
      if (de11.k) {
        de11.g = true;
      } else {
        this.g.d();
        de11.g = false;
      } 
      this.C = false;
      q0(false);
    } else if (de11.k) {
      setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
      return;
    } 
    id1 id11 = this.o;
    if (id11 != null) {
      de11.e = id11.c();
    } else {
      de11.e = 0;
    } 
    o0();
    this.p.c.p(paramInt1, paramInt2);
    q0(false);
    de11.g = false;
  }
  
  public final boolean onRequestFocusInDescendants(int paramInt, Rect paramRect) {
    return R() ? false : super.onRequestFocusInDescendants(paramInt, paramRect);
  }
  
  public final void onRestoreInstanceState(Parcelable paramParcelable) {
    if (!(paramParcelable instanceof be1)) {
      super.onRestoreInstanceState(paramParcelable);
      return;
    } 
    be1 be11 = (be1)paramParcelable;
    this.f = be11;
    super.onRestoreInstanceState(((j)be11).b);
    requestLayout();
  }
  
  public final Parcelable onSaveInstanceState() {
    j j = new j(super.onSaveInstanceState());
    be1 be11 = this.f;
    if (be11 != null) {
      ((be1)j).e = be11.e;
      return (Parcelable)j;
    } 
    a a1 = this.p;
    if (a1 != null) {
      ((be1)j).e = a1.t0();
      return (Parcelable)j;
    } 
    ((be1)j).e = null;
    return (Parcelable)j;
  }
  
  public final void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    if (paramInt1 != paramInt3 || paramInt2 != paramInt4) {
      this.N = null;
      this.L = null;
      this.M = null;
      this.K = null;
      return;
    } 
  }
  
  public final boolean onTouchEvent(MotionEvent paramMotionEvent) {
    // Byte code:
    //   0: aload_0
    //   1: getfield z : Z
    //   4: ifne -> 1132
    //   7: aload_0
    //   8: getfield A : Z
    //   11: ifeq -> 17
    //   14: goto -> 1132
    //   17: aload_0
    //   18: getfield t : Lud1;
    //   21: astore #15
    //   23: aload #15
    //   25: ifnonnull -> 51
    //   28: aload_1
    //   29: invokevirtual getAction : ()I
    //   32: ifne -> 41
    //   35: iconst_0
    //   36: istore #12
    //   38: goto -> 85
    //   41: aload_0
    //   42: aload_1
    //   43: invokevirtual F : (Landroid/view/MotionEvent;)Z
    //   46: istore #12
    //   48: goto -> 85
    //   51: aload #15
    //   53: aload_1
    //   54: invokeinterface a : (Landroid/view/MotionEvent;)V
    //   59: aload_1
    //   60: invokevirtual getAction : ()I
    //   63: istore #4
    //   65: iload #4
    //   67: iconst_3
    //   68: if_icmpeq -> 77
    //   71: iload #4
    //   73: iconst_1
    //   74: if_icmpne -> 82
    //   77: aload_0
    //   78: aconst_null
    //   79: putfield t : Lud1;
    //   82: iconst_1
    //   83: istore #12
    //   85: iload #12
    //   87: ifeq -> 119
    //   90: aload_0
    //   91: getfield R : Landroid/view/VelocityTracker;
    //   94: astore_1
    //   95: aload_1
    //   96: ifnull -> 103
    //   99: aload_1
    //   100: invokevirtual clear : ()V
    //   103: aload_0
    //   104: iconst_0
    //   105: invokevirtual r0 : (I)V
    //   108: aload_0
    //   109: invokevirtual d0 : ()V
    //   112: aload_0
    //   113: iconst_0
    //   114: invokevirtual setScrollState : (I)V
    //   117: iconst_1
    //   118: ireturn
    //   119: aload_0
    //   120: getfield p : Landroidx/recyclerview/widget/a;
    //   123: astore #15
    //   125: aload #15
    //   127: ifnonnull -> 133
    //   130: goto -> 1132
    //   133: aload #15
    //   135: invokevirtual o : ()Z
    //   138: istore #12
    //   140: aload_0
    //   141: getfield p : Landroidx/recyclerview/widget/a;
    //   144: invokevirtual p : ()Z
    //   147: istore #13
    //   149: aload_0
    //   150: getfield R : Landroid/view/VelocityTracker;
    //   153: ifnonnull -> 163
    //   156: aload_0
    //   157: invokestatic obtain : ()Landroid/view/VelocityTracker;
    //   160: putfield R : Landroid/view/VelocityTracker;
    //   163: aload_1
    //   164: invokevirtual getActionMasked : ()I
    //   167: istore #5
    //   169: aload_1
    //   170: invokevirtual getActionIndex : ()I
    //   173: istore #4
    //   175: aload_0
    //   176: getfield u0 : [I
    //   179: astore #17
    //   181: iload #5
    //   183: ifne -> 196
    //   186: aload #17
    //   188: iconst_1
    //   189: iconst_0
    //   190: iastore
    //   191: aload #17
    //   193: iconst_0
    //   194: iconst_0
    //   195: iastore
    //   196: aload_1
    //   197: invokestatic obtain : (Landroid/view/MotionEvent;)Landroid/view/MotionEvent;
    //   200: astore #15
    //   202: aload #15
    //   204: aload #17
    //   206: iconst_0
    //   207: iaload
    //   208: i2f
    //   209: aload #17
    //   211: iconst_1
    //   212: iaload
    //   213: i2f
    //   214: invokevirtual offsetLocation : (FF)V
    //   217: iload #5
    //   219: ifeq -> 1056
    //   222: iload #5
    //   224: iconst_1
    //   225: if_icmpeq -> 921
    //   228: iload #5
    //   230: iconst_2
    //   231: if_icmpeq -> 357
    //   234: iload #5
    //   236: iconst_3
    //   237: if_icmpeq -> 327
    //   240: iload #5
    //   242: iconst_5
    //   243: if_icmpeq -> 264
    //   246: iload #5
    //   248: bipush #6
    //   250: if_icmpeq -> 256
    //   253: goto -> 1116
    //   256: aload_0
    //   257: aload_1
    //   258: invokevirtual X : (Landroid/view/MotionEvent;)V
    //   261: goto -> 1116
    //   264: aload_0
    //   265: aload_1
    //   266: iload #4
    //   268: invokevirtual getPointerId : (I)I
    //   271: putfield Q : I
    //   274: aload_1
    //   275: iload #4
    //   277: invokevirtual getX : (I)F
    //   280: ldc_w 0.5
    //   283: fadd
    //   284: f2i
    //   285: istore #5
    //   287: aload_0
    //   288: iload #5
    //   290: putfield U : I
    //   293: aload_0
    //   294: iload #5
    //   296: putfield S : I
    //   299: aload_1
    //   300: iload #4
    //   302: invokevirtual getY : (I)F
    //   305: ldc_w 0.5
    //   308: fadd
    //   309: f2i
    //   310: istore #4
    //   312: aload_0
    //   313: iload #4
    //   315: putfield V : I
    //   318: aload_0
    //   319: iload #4
    //   321: putfield T : I
    //   324: goto -> 1116
    //   327: aload_0
    //   328: getfield R : Landroid/view/VelocityTracker;
    //   331: astore_1
    //   332: aload_1
    //   333: ifnull -> 340
    //   336: aload_1
    //   337: invokevirtual clear : ()V
    //   340: aload_0
    //   341: iconst_0
    //   342: invokevirtual r0 : (I)V
    //   345: aload_0
    //   346: invokevirtual d0 : ()V
    //   349: aload_0
    //   350: iconst_0
    //   351: invokevirtual setScrollState : (I)V
    //   354: goto -> 1116
    //   357: aload_1
    //   358: aload_0
    //   359: getfield Q : I
    //   362: invokevirtual findPointerIndex : (I)I
    //   365: istore #4
    //   367: iload #4
    //   369: ifge -> 413
    //   372: new java/lang/StringBuilder
    //   375: dup
    //   376: ldc_w 'Error processing scroll; pointer index for id '
    //   379: invokespecial <init> : (Ljava/lang/String;)V
    //   382: astore_1
    //   383: aload_1
    //   384: aload_0
    //   385: getfield Q : I
    //   388: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   391: pop
    //   392: aload_1
    //   393: getstatic org/jaudiotagger/tag/mp4/bKj/fXMDNeMWaILNVh.mMki : Ljava/lang/String;
    //   396: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   399: pop
    //   400: ldc_w 'RecyclerView'
    //   403: aload_1
    //   404: invokevirtual toString : ()Ljava/lang/String;
    //   407: invokestatic e : (Ljava/lang/String;Ljava/lang/String;)I
    //   410: pop
    //   411: iconst_0
    //   412: ireturn
    //   413: aload_1
    //   414: iload #4
    //   416: invokevirtual getX : (I)F
    //   419: ldc_w 0.5
    //   422: fadd
    //   423: f2i
    //   424: istore #10
    //   426: aload_1
    //   427: iload #4
    //   429: invokevirtual getY : (I)F
    //   432: ldc_w 0.5
    //   435: fadd
    //   436: f2i
    //   437: istore #11
    //   439: aload_0
    //   440: getfield U : I
    //   443: iload #10
    //   445: isub
    //   446: istore #4
    //   448: aload_0
    //   449: getfield V : I
    //   452: iload #11
    //   454: isub
    //   455: istore #7
    //   457: iload #4
    //   459: istore #9
    //   461: iload #7
    //   463: istore #5
    //   465: aload_0
    //   466: getfield P : I
    //   469: iconst_1
    //   470: if_icmpeq -> 635
    //   473: iload #4
    //   475: istore #6
    //   477: iload #12
    //   479: ifeq -> 533
    //   482: aload_0
    //   483: getfield W : I
    //   486: istore #5
    //   488: iload #4
    //   490: ifle -> 507
    //   493: iconst_0
    //   494: iload #4
    //   496: iload #5
    //   498: isub
    //   499: invokestatic max : (II)I
    //   502: istore #4
    //   504: goto -> 518
    //   507: iconst_0
    //   508: iload #4
    //   510: iload #5
    //   512: iadd
    //   513: invokestatic min : (II)I
    //   516: istore #4
    //   518: iload #4
    //   520: istore #6
    //   522: iload #4
    //   524: ifeq -> 533
    //   527: iconst_1
    //   528: istore #5
    //   530: goto -> 540
    //   533: iconst_0
    //   534: istore #5
    //   536: iload #6
    //   538: istore #4
    //   540: iload #7
    //   542: istore #6
    //   544: iload #5
    //   546: istore #8
    //   548: iload #13
    //   550: ifeq -> 609
    //   553: aload_0
    //   554: getfield W : I
    //   557: istore #6
    //   559: iload #7
    //   561: ifle -> 578
    //   564: iconst_0
    //   565: iload #7
    //   567: iload #6
    //   569: isub
    //   570: invokestatic max : (II)I
    //   573: istore #7
    //   575: goto -> 589
    //   578: iconst_0
    //   579: iload #7
    //   581: iload #6
    //   583: iadd
    //   584: invokestatic min : (II)I
    //   587: istore #7
    //   589: iload #7
    //   591: istore #6
    //   593: iload #5
    //   595: istore #8
    //   597: iload #7
    //   599: ifeq -> 609
    //   602: iconst_1
    //   603: istore #8
    //   605: iload #7
    //   607: istore #6
    //   609: iload #4
    //   611: istore #9
    //   613: iload #6
    //   615: istore #5
    //   617: iload #8
    //   619: ifeq -> 635
    //   622: aload_0
    //   623: iconst_1
    //   624: invokevirtual setScrollState : (I)V
    //   627: iload #6
    //   629: istore #5
    //   631: iload #4
    //   633: istore #9
    //   635: aload_0
    //   636: getfield P : I
    //   639: iconst_1
    //   640: if_icmpne -> 1116
    //   643: aload_0
    //   644: getfield v0 : [I
    //   647: astore #16
    //   649: aload #16
    //   651: iconst_0
    //   652: iconst_0
    //   653: iastore
    //   654: aload #16
    //   656: iconst_1
    //   657: iconst_0
    //   658: iastore
    //   659: iload #9
    //   661: aload_0
    //   662: iload #9
    //   664: aload_1
    //   665: invokevirtual getY : ()F
    //   668: invokevirtual e0 : (IF)I
    //   671: isub
    //   672: istore #6
    //   674: iload #5
    //   676: aload_0
    //   677: iload #5
    //   679: aload_1
    //   680: invokevirtual getX : ()F
    //   683: invokevirtual f0 : (IF)I
    //   686: isub
    //   687: istore #7
    //   689: iload #12
    //   691: ifeq -> 701
    //   694: iload #6
    //   696: istore #4
    //   698: goto -> 704
    //   701: iconst_0
    //   702: istore #4
    //   704: iload #13
    //   706: ifeq -> 716
    //   709: iload #7
    //   711: istore #5
    //   713: goto -> 719
    //   716: iconst_0
    //   717: istore #5
    //   719: aload_0
    //   720: getfield t0 : [I
    //   723: astore #18
    //   725: aload_0
    //   726: iload #4
    //   728: iload #5
    //   730: iconst_0
    //   731: aload_0
    //   732: getfield v0 : [I
    //   735: aload #18
    //   737: invokevirtual u : (III[I[I)Z
    //   740: istore #14
    //   742: aload_0
    //   743: getfield t0 : [I
    //   746: astore #18
    //   748: iload #6
    //   750: istore #5
    //   752: iload #7
    //   754: istore #4
    //   756: iload #14
    //   758: ifeq -> 815
    //   761: iload #6
    //   763: aload #16
    //   765: iconst_0
    //   766: iaload
    //   767: isub
    //   768: istore #5
    //   770: iload #7
    //   772: aload #16
    //   774: iconst_1
    //   775: iaload
    //   776: isub
    //   777: istore #4
    //   779: aload #17
    //   781: iconst_0
    //   782: aload #17
    //   784: iconst_0
    //   785: iaload
    //   786: aload #18
    //   788: iconst_0
    //   789: iaload
    //   790: iadd
    //   791: iastore
    //   792: aload #17
    //   794: iconst_1
    //   795: aload #17
    //   797: iconst_1
    //   798: iaload
    //   799: aload #18
    //   801: iconst_1
    //   802: iaload
    //   803: iadd
    //   804: iastore
    //   805: aload_0
    //   806: invokevirtual getParent : ()Landroid/view/ViewParent;
    //   809: iconst_1
    //   810: invokeinterface requestDisallowInterceptTouchEvent : (Z)V
    //   815: aload_0
    //   816: iload #10
    //   818: aload #18
    //   820: iconst_0
    //   821: iaload
    //   822: isub
    //   823: putfield U : I
    //   826: aload_0
    //   827: iload #11
    //   829: aload #18
    //   831: iconst_1
    //   832: iaload
    //   833: isub
    //   834: putfield V : I
    //   837: iload #12
    //   839: ifeq -> 849
    //   842: iload #5
    //   844: istore #6
    //   846: goto -> 852
    //   849: iconst_0
    //   850: istore #6
    //   852: iload #13
    //   854: ifeq -> 864
    //   857: iload #4
    //   859: istore #7
    //   861: goto -> 867
    //   864: iconst_0
    //   865: istore #7
    //   867: aload_0
    //   868: iload #6
    //   870: iload #7
    //   872: iconst_0
    //   873: aload_1
    //   874: invokevirtual i0 : (IIILandroid/view/MotionEvent;)Z
    //   877: ifeq -> 890
    //   880: aload_0
    //   881: invokevirtual getParent : ()Landroid/view/ViewParent;
    //   884: iconst_1
    //   885: invokeinterface requestDisallowInterceptTouchEvent : (Z)V
    //   890: aload_0
    //   891: getfield h0 : Lrd0;
    //   894: astore_1
    //   895: aload_1
    //   896: ifnull -> 1116
    //   899: iload #5
    //   901: ifne -> 909
    //   904: iload #4
    //   906: ifeq -> 1116
    //   909: aload_1
    //   910: aload_0
    //   911: iload #5
    //   913: iload #4
    //   915: invokevirtual a : (Landroidx/recyclerview/widget/RecyclerView;II)V
    //   918: goto -> 1116
    //   921: aload_0
    //   922: getfield R : Landroid/view/VelocityTracker;
    //   925: aload #15
    //   927: invokevirtual addMovement : (Landroid/view/MotionEvent;)V
    //   930: aload_0
    //   931: getfield R : Landroid/view/VelocityTracker;
    //   934: astore_1
    //   935: aload_0
    //   936: getfield c0 : I
    //   939: istore #4
    //   941: aload_1
    //   942: sipush #1000
    //   945: iload #4
    //   947: i2f
    //   948: invokevirtual computeCurrentVelocity : (IF)V
    //   951: iload #12
    //   953: ifeq -> 972
    //   956: aload_0
    //   957: getfield R : Landroid/view/VelocityTracker;
    //   960: aload_0
    //   961: getfield Q : I
    //   964: invokevirtual getXVelocity : (I)F
    //   967: fneg
    //   968: fstore_2
    //   969: goto -> 974
    //   972: fconst_0
    //   973: fstore_2
    //   974: iload #13
    //   976: ifeq -> 995
    //   979: aload_0
    //   980: getfield R : Landroid/view/VelocityTracker;
    //   983: aload_0
    //   984: getfield Q : I
    //   987: invokevirtual getYVelocity : (I)F
    //   990: fneg
    //   991: fstore_3
    //   992: goto -> 997
    //   995: fconst_0
    //   996: fstore_3
    //   997: fload_2
    //   998: fconst_0
    //   999: fcmpl
    //   1000: ifne -> 1009
    //   1003: fload_3
    //   1004: fconst_0
    //   1005: fcmpl
    //   1006: ifeq -> 1026
    //   1009: aload_0
    //   1010: fload_2
    //   1011: f2i
    //   1012: fload_3
    //   1013: f2i
    //   1014: aload_0
    //   1015: getfield b0 : I
    //   1018: iload #4
    //   1020: invokevirtual J : (IIII)Z
    //   1023: ifne -> 1031
    //   1026: aload_0
    //   1027: iconst_0
    //   1028: invokevirtual setScrollState : (I)V
    //   1031: aload_0
    //   1032: getfield R : Landroid/view/VelocityTracker;
    //   1035: astore_1
    //   1036: aload_1
    //   1037: ifnull -> 1044
    //   1040: aload_1
    //   1041: invokevirtual clear : ()V
    //   1044: aload_0
    //   1045: iconst_0
    //   1046: invokevirtual r0 : (I)V
    //   1049: aload_0
    //   1050: invokevirtual d0 : ()V
    //   1053: goto -> 1125
    //   1056: aload_0
    //   1057: aload_1
    //   1058: iconst_0
    //   1059: invokevirtual getPointerId : (I)I
    //   1062: putfield Q : I
    //   1065: aload_1
    //   1066: invokevirtual getX : ()F
    //   1069: ldc_w 0.5
    //   1072: fadd
    //   1073: f2i
    //   1074: istore #4
    //   1076: aload_0
    //   1077: iload #4
    //   1079: putfield U : I
    //   1082: aload_0
    //   1083: iload #4
    //   1085: putfield S : I
    //   1088: aload_1
    //   1089: invokevirtual getY : ()F
    //   1092: ldc_w 0.5
    //   1095: fadd
    //   1096: f2i
    //   1097: istore #4
    //   1099: aload_0
    //   1100: iload #4
    //   1102: putfield V : I
    //   1105: aload_0
    //   1106: iload #4
    //   1108: putfield T : I
    //   1111: aload_0
    //   1112: iconst_0
    //   1113: invokevirtual p0 : (I)V
    //   1116: aload_0
    //   1117: getfield R : Landroid/view/VelocityTracker;
    //   1120: aload #15
    //   1122: invokevirtual addMovement : (Landroid/view/MotionEvent;)V
    //   1125: aload #15
    //   1127: invokevirtual recycle : ()V
    //   1130: iconst_1
    //   1131: ireturn
    //   1132: iconst_0
    //   1133: ireturn
  }
  
  public final void p(int paramInt1, int paramInt2) {
    int j = getPaddingLeft();
    int i = getPaddingRight();
    WeakHashMap weakHashMap = v22.a;
    i = a.r(paramInt1, i + j, getMinimumWidth());
    paramInt1 = getPaddingTop();
    setMeasuredDimension(i, a.r(paramInt2, getPaddingBottom() + paramInt1, getMinimumHeight()));
  }
  
  public final void p0(int paramInt) {
    int i;
    boolean bool2 = this.p.o();
    boolean bool1 = bool2;
    if (this.p.p())
      i = bool2 | 0x2; 
    getScrollingChildHelper().g(i, paramInt);
  }
  
  public final void q(View paramView) {
    O(paramView);
    ArrayList arrayList = this.E;
    if (arrayList != null)
      for (int i = arrayList.size() - 1; i >= 0; i--) {
        ij0 ij0 = this.E.get(i);
        if (paramView == ij0.w)
          ij0.w = null; 
        he1 he1 = ij0.r.N(paramView);
        if (he1 != null) {
          he1 he11 = ij0.c;
          if (he11 != null && he1 == he11) {
            ij0.p(null, 0);
          } else {
            ij0.k(he1, false);
            if (ij0.a.remove(he1.b))
              ij0.m.a(ij0.r, he1); 
          } 
        } 
      }  
  }
  
  public final void q0(boolean paramBoolean) {
    if (this.x < 1)
      if (!E0) {
        this.x = 1;
      } else {
        tp.f("stopInterceptRequestLayout was called more times than startInterceptRequestLayout.".concat(B()));
        return;
      }  
    if (!paramBoolean && !this.z)
      this.y = false; 
    if (this.x == 1) {
      if (paramBoolean && this.y && !this.z && this.p != null && this.o != null)
        r(); 
      if (!this.z)
        this.y = false; 
    } 
    this.x--;
  }
  
  public final void r() {
    // Byte code:
    //   0: aload_0
    //   1: getfield o : Lid1;
    //   4: astore #8
    //   6: getstatic com/google/android/material/textview/pJx/ybWnIKHovcRr.JZbw : Ljava/lang/String;
    //   9: astore #11
    //   11: aload #8
    //   13: ifnonnull -> 26
    //   16: aload #11
    //   18: ldc_w 'No adapter attached; skipping layout'
    //   21: invokestatic w : (Ljava/lang/String;Ljava/lang/String;)I
    //   24: pop
    //   25: return
    //   26: aload_0
    //   27: getfield p : Landroidx/recyclerview/widget/a;
    //   30: ifnonnull -> 43
    //   33: aload #11
    //   35: ldc_w 'No layout manager attached; skipping layout'
    //   38: invokestatic e : (Ljava/lang/String;Ljava/lang/String;)I
    //   41: pop
    //   42: return
    //   43: aload_0
    //   44: getfield j0 : Lde1;
    //   47: astore #12
    //   49: aload #12
    //   51: iconst_0
    //   52: putfield i : Z
    //   55: aload_0
    //   56: getfield y0 : Z
    //   59: istore #7
    //   61: iconst_1
    //   62: istore_3
    //   63: iload #7
    //   65: ifeq -> 95
    //   68: aload_0
    //   69: getfield z0 : I
    //   72: aload_0
    //   73: invokevirtual getWidth : ()I
    //   76: if_icmpne -> 90
    //   79: aload_0
    //   80: getfield A0 : I
    //   83: aload_0
    //   84: invokevirtual getHeight : ()I
    //   87: if_icmpeq -> 95
    //   90: iconst_1
    //   91: istore_1
    //   92: goto -> 97
    //   95: iconst_0
    //   96: istore_1
    //   97: aload_0
    //   98: iconst_0
    //   99: putfield z0 : I
    //   102: aload_0
    //   103: iconst_0
    //   104: putfield A0 : I
    //   107: aload_0
    //   108: iconst_0
    //   109: putfield y0 : Z
    //   112: aload #12
    //   114: getfield d : I
    //   117: iconst_1
    //   118: if_icmpne -> 140
    //   121: aload_0
    //   122: invokevirtual s : ()V
    //   125: aload_0
    //   126: getfield p : Landroidx/recyclerview/widget/a;
    //   129: aload_0
    //   130: invokevirtual G0 : (Landroidx/recyclerview/widget/RecyclerView;)V
    //   133: aload_0
    //   134: invokevirtual t : ()V
    //   137: goto -> 235
    //   140: aload_0
    //   141: getfield g : Lv2;
    //   144: astore #8
    //   146: aload #8
    //   148: getfield d : Ljava/lang/Object;
    //   151: checkcast java/util/ArrayList
    //   154: invokevirtual isEmpty : ()Z
    //   157: ifne -> 177
    //   160: aload #8
    //   162: getfield c : Ljava/lang/Object;
    //   165: checkcast java/util/ArrayList
    //   168: invokevirtual isEmpty : ()Z
    //   171: ifne -> 177
    //   174: goto -> 223
    //   177: iload_1
    //   178: ifne -> 223
    //   181: aload_0
    //   182: getfield p : Landroidx/recyclerview/widget/a;
    //   185: getfield p : I
    //   188: aload_0
    //   189: invokevirtual getWidth : ()I
    //   192: if_icmpne -> 223
    //   195: aload_0
    //   196: getfield p : Landroidx/recyclerview/widget/a;
    //   199: getfield q : I
    //   202: aload_0
    //   203: invokevirtual getHeight : ()I
    //   206: if_icmpeq -> 212
    //   209: goto -> 223
    //   212: aload_0
    //   213: getfield p : Landroidx/recyclerview/widget/a;
    //   216: aload_0
    //   217: invokevirtual G0 : (Landroidx/recyclerview/widget/RecyclerView;)V
    //   220: goto -> 235
    //   223: aload_0
    //   224: getfield p : Landroidx/recyclerview/widget/a;
    //   227: aload_0
    //   228: invokevirtual G0 : (Landroidx/recyclerview/widget/RecyclerView;)V
    //   231: aload_0
    //   232: invokevirtual t : ()V
    //   235: aload #12
    //   237: iconst_4
    //   238: invokevirtual a : (I)V
    //   241: aload_0
    //   242: invokevirtual o0 : ()V
    //   245: aload_0
    //   246: invokevirtual V : ()V
    //   249: aload #12
    //   251: iconst_1
    //   252: putfield d : I
    //   255: aload #12
    //   257: getfield j : Z
    //   260: istore #7
    //   262: aload_0
    //   263: getfield h : Ltk;
    //   266: astore #13
    //   268: aload_0
    //   269: getfield e : Lyd1;
    //   272: astore #10
    //   274: aload_0
    //   275: getfield i : Lj01;
    //   278: astore #9
    //   280: iload #7
    //   282: ifeq -> 1341
    //   285: aload #13
    //   287: invokevirtual e : ()I
    //   290: iconst_1
    //   291: isub
    //   292: istore_2
    //   293: iload_3
    //   294: istore_1
    //   295: iload_2
    //   296: iflt -> 887
    //   299: aload #13
    //   301: iload_2
    //   302: invokevirtual d : (I)Landroid/view/View;
    //   305: invokestatic O : (Landroid/view/View;)Lhe1;
    //   308: astore #8
    //   310: aload #8
    //   312: invokevirtual q : ()Z
    //   315: ifeq -> 321
    //   318: goto -> 881
    //   321: aload_0
    //   322: aload #8
    //   324: invokevirtual L : (Lhe1;)J
    //   327: lstore #5
    //   329: aload_0
    //   330: getfield O : Lod1;
    //   333: invokevirtual getClass : ()Ljava/lang/Class;
    //   336: pop
    //   337: new java/lang/Object
    //   340: dup
    //   341: invokespecial <init> : ()V
    //   344: astore #15
    //   346: aload #15
    //   348: aload #8
    //   350: invokevirtual a : (Lhe1;)V
    //   353: aload #9
    //   355: getfield e : Ljava/lang/Object;
    //   358: checkcast sp0
    //   361: astore #14
    //   363: aload #9
    //   365: getfield c : Ljava/lang/Object;
    //   368: checkcast zm1
    //   371: astore #16
    //   373: aload #14
    //   375: lload #5
    //   377: invokevirtual b : (J)Ljava/lang/Object;
    //   380: checkcast he1
    //   383: astore #14
    //   385: aload #14
    //   387: ifnull -> 872
    //   390: aload #14
    //   392: invokevirtual q : ()Z
    //   395: ifne -> 872
    //   398: aload #16
    //   400: aload #14
    //   402: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   405: checkcast e32
    //   408: astore #17
    //   410: aload #17
    //   412: ifnull -> 430
    //   415: aload #17
    //   417: getfield a : I
    //   420: iconst_1
    //   421: iand
    //   422: ifeq -> 430
    //   425: iload_1
    //   426: istore_3
    //   427: goto -> 432
    //   430: iconst_0
    //   431: istore_3
    //   432: aload #16
    //   434: aload #8
    //   436: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   439: checkcast e32
    //   442: astore #16
    //   444: aload #16
    //   446: ifnull -> 465
    //   449: aload #16
    //   451: getfield a : I
    //   454: iconst_1
    //   455: iand
    //   456: ifeq -> 465
    //   459: iload_1
    //   460: istore #4
    //   462: goto -> 468
    //   465: iconst_0
    //   466: istore #4
    //   468: iload_3
    //   469: ifeq -> 491
    //   472: aload #14
    //   474: aload #8
    //   476: if_acmpne -> 491
    //   479: aload #9
    //   481: aload #8
    //   483: aload #15
    //   485: invokevirtual a : (Lhe1;Lp11;)V
    //   488: goto -> 881
    //   491: aload #9
    //   493: aload #14
    //   495: iconst_4
    //   496: invokevirtual v : (Lhe1;I)Lp11;
    //   499: astore #16
    //   501: aload #9
    //   503: aload #8
    //   505: aload #15
    //   507: invokevirtual a : (Lhe1;Lp11;)V
    //   510: aload #9
    //   512: aload #8
    //   514: bipush #8
    //   516: invokevirtual v : (Lhe1;I)Lp11;
    //   519: astore #15
    //   521: aload #16
    //   523: ifnonnull -> 780
    //   526: aload #13
    //   528: invokevirtual e : ()I
    //   531: istore #4
    //   533: iconst_0
    //   534: istore_3
    //   535: iload_3
    //   536: iload #4
    //   538: if_icmpge -> 719
    //   541: aload #13
    //   543: iload_3
    //   544: invokevirtual d : (I)Landroid/view/View;
    //   547: invokestatic O : (Landroid/view/View;)Lhe1;
    //   550: astore #15
    //   552: aload #15
    //   554: aload #8
    //   556: if_acmpne -> 562
    //   559: goto -> 713
    //   562: aload_0
    //   563: aload #15
    //   565: invokevirtual L : (Lhe1;)J
    //   568: lload #5
    //   570: lcmp
    //   571: ifne -> 713
    //   574: aload_0
    //   575: getfield o : Lid1;
    //   578: astore #9
    //   580: aload #9
    //   582: ifnull -> 653
    //   585: aload #9
    //   587: getfield b : Z
    //   590: ifeq -> 653
    //   593: new java/lang/StringBuilder
    //   596: dup
    //   597: ldc_w 'Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\\n ViewHolder 1:'
    //   600: invokespecial <init> : (Ljava/lang/String;)V
    //   603: astore #9
    //   605: aload #9
    //   607: aload #15
    //   609: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   612: pop
    //   613: aload #9
    //   615: ldc_w ' \\n View Holder 2:'
    //   618: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   621: pop
    //   622: aload #9
    //   624: aload #8
    //   626: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   629: pop
    //   630: aload #9
    //   632: aload_0
    //   633: invokevirtual B : ()Ljava/lang/String;
    //   636: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   639: pop
    //   640: new java/lang/IllegalStateException
    //   643: dup
    //   644: aload #9
    //   646: invokevirtual toString : ()Ljava/lang/String;
    //   649: invokespecial <init> : (Ljava/lang/String;)V
    //   652: athrow
    //   653: new java/lang/StringBuilder
    //   656: dup
    //   657: getstatic org/jaudiotagger/audio/exceptions/yb/zLtYiJUm.ujGvDlzpsGTp : Ljava/lang/String;
    //   660: invokespecial <init> : (Ljava/lang/String;)V
    //   663: astore #9
    //   665: aload #9
    //   667: aload #15
    //   669: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   672: pop
    //   673: aload #9
    //   675: ldc_w ' \\n View Holder 2:'
    //   678: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   681: pop
    //   682: aload #9
    //   684: aload #8
    //   686: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   689: pop
    //   690: aload #9
    //   692: aload_0
    //   693: invokevirtual B : ()Ljava/lang/String;
    //   696: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   699: pop
    //   700: new java/lang/IllegalStateException
    //   703: dup
    //   704: aload #9
    //   706: invokevirtual toString : ()Ljava/lang/String;
    //   709: invokespecial <init> : (Ljava/lang/String;)V
    //   712: athrow
    //   713: iinc #3, 1
    //   716: goto -> 535
    //   719: new java/lang/StringBuilder
    //   722: dup
    //   723: ldc_w 'Problem while matching changed view holders with the newones. The pre-layout information for the change holder '
    //   726: invokespecial <init> : (Ljava/lang/String;)V
    //   729: astore #15
    //   731: aload #15
    //   733: aload #14
    //   735: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   738: pop
    //   739: aload #15
    //   741: ldc_w ' cannot be found but it is necessary for '
    //   744: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   747: pop
    //   748: aload #15
    //   750: aload #8
    //   752: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   755: pop
    //   756: aload #15
    //   758: aload_0
    //   759: invokevirtual B : ()Ljava/lang/String;
    //   762: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   765: pop
    //   766: aload #11
    //   768: aload #15
    //   770: invokevirtual toString : ()Ljava/lang/String;
    //   773: invokestatic e : (Ljava/lang/String;Ljava/lang/String;)I
    //   776: pop
    //   777: goto -> 881
    //   780: aload #14
    //   782: iconst_0
    //   783: invokevirtual p : (Z)V
    //   786: iload_3
    //   787: ifeq -> 796
    //   790: aload_0
    //   791: aload #14
    //   793: invokevirtual g : (Lhe1;)V
    //   796: aload #14
    //   798: aload #8
    //   800: if_acmpeq -> 847
    //   803: iload #4
    //   805: ifeq -> 814
    //   808: aload_0
    //   809: aload #8
    //   811: invokevirtual g : (Lhe1;)V
    //   814: aload #14
    //   816: aload #8
    //   818: putfield j : Lhe1;
    //   821: aload_0
    //   822: aload #14
    //   824: invokevirtual g : (Lhe1;)V
    //   827: aload #10
    //   829: aload #14
    //   831: invokevirtual m : (Lhe1;)V
    //   834: aload #8
    //   836: iconst_0
    //   837: invokevirtual p : (Z)V
    //   840: aload #8
    //   842: aload #14
    //   844: putfield k : Lhe1;
    //   847: aload_0
    //   848: getfield O : Lod1;
    //   851: aload #14
    //   853: aload #8
    //   855: aload #16
    //   857: aload #15
    //   859: invokevirtual a : (Lhe1;Lhe1;Lp11;Lp11;)Z
    //   862: ifeq -> 881
    //   865: aload_0
    //   866: invokevirtual Z : ()V
    //   869: goto -> 881
    //   872: aload #9
    //   874: aload #8
    //   876: aload #15
    //   878: invokevirtual a : (Lhe1;Lp11;)V
    //   881: iinc #2, -1
    //   884: goto -> 295
    //   887: aload #9
    //   889: getfield c : Ljava/lang/Object;
    //   892: checkcast zm1
    //   895: astore #8
    //   897: aload #8
    //   899: getfield e : I
    //   902: iconst_1
    //   903: isub
    //   904: istore_2
    //   905: iload_1
    //   906: istore_3
    //   907: iload_2
    //   908: iflt -> 1335
    //   911: aload #8
    //   913: iload_2
    //   914: invokevirtual f : (I)Ljava/lang/Object;
    //   917: checkcast he1
    //   920: astore #14
    //   922: aload #8
    //   924: iload_2
    //   925: invokevirtual g : (I)Ljava/lang/Object;
    //   928: checkcast e32
    //   931: astore #11
    //   933: aload #11
    //   935: getfield a : I
    //   938: istore_3
    //   939: aload_0
    //   940: getfield C0 : Lxy;
    //   943: astore #17
    //   945: iload_3
    //   946: iconst_3
    //   947: iand
    //   948: iconst_3
    //   949: if_icmpne -> 980
    //   952: aload #17
    //   954: getfield b : Landroidx/recyclerview/widget/RecyclerView;
    //   957: astore #15
    //   959: aload #15
    //   961: getfield p : Landroidx/recyclerview/widget/a;
    //   964: aload #14
    //   966: getfield b : Landroid/view/View;
    //   969: aload #15
    //   971: getfield e : Lyd1;
    //   974: invokevirtual z0 : (Landroid/view/View;Lyd1;)V
    //   977: goto -> 1302
    //   980: iload_3
    //   981: iconst_1
    //   982: iand
    //   983: ifeq -> 1043
    //   986: aload #11
    //   988: getfield b : Lp11;
    //   991: astore #15
    //   993: aload #15
    //   995: ifnonnull -> 1026
    //   998: aload #17
    //   1000: getfield b : Landroidx/recyclerview/widget/RecyclerView;
    //   1003: astore #15
    //   1005: aload #15
    //   1007: getfield p : Landroidx/recyclerview/widget/a;
    //   1010: aload #14
    //   1012: getfield b : Landroid/view/View;
    //   1015: aload #15
    //   1017: getfield e : Lyd1;
    //   1020: invokevirtual z0 : (Landroid/view/View;Lyd1;)V
    //   1023: goto -> 977
    //   1026: aload #17
    //   1028: aload #14
    //   1030: aload #15
    //   1032: aload #11
    //   1034: getfield c : Lp11;
    //   1037: invokevirtual h : (Lhe1;Lp11;Lp11;)V
    //   1040: goto -> 977
    //   1043: iload_3
    //   1044: bipush #14
    //   1046: iand
    //   1047: bipush #14
    //   1049: if_icmpne -> 1072
    //   1052: aload #17
    //   1054: aload #14
    //   1056: aload #11
    //   1058: getfield b : Lp11;
    //   1061: aload #11
    //   1063: getfield c : Lp11;
    //   1066: invokevirtual g : (Lhe1;Lp11;Lp11;)V
    //   1069: goto -> 977
    //   1072: iload_3
    //   1073: bipush #12
    //   1075: iand
    //   1076: bipush #12
    //   1078: if_icmpne -> 1253
    //   1081: aload #11
    //   1083: getfield b : Lp11;
    //   1086: astore #16
    //   1088: aload #11
    //   1090: getfield c : Lp11;
    //   1093: astore #15
    //   1095: aload #17
    //   1097: invokevirtual getClass : ()Ljava/lang/Class;
    //   1100: pop
    //   1101: aload #14
    //   1103: iconst_0
    //   1104: invokevirtual p : (Z)V
    //   1107: aload #17
    //   1109: getfield b : Landroidx/recyclerview/widget/RecyclerView;
    //   1112: astore #17
    //   1114: aload #17
    //   1116: getfield F : Z
    //   1119: istore #7
    //   1121: aload #17
    //   1123: getfield O : Lod1;
    //   1126: astore #18
    //   1128: iload #7
    //   1130: ifeq -> 1157
    //   1133: aload #18
    //   1135: aload #14
    //   1137: aload #14
    //   1139: aload #16
    //   1141: aload #15
    //   1143: invokevirtual a : (Lhe1;Lhe1;Lp11;Lp11;)Z
    //   1146: ifeq -> 977
    //   1149: aload #17
    //   1151: invokevirtual Z : ()V
    //   1154: goto -> 977
    //   1157: aload #18
    //   1159: checkcast mw
    //   1162: astore #18
    //   1164: aload #18
    //   1166: invokevirtual getClass : ()Ljava/lang/Class;
    //   1169: pop
    //   1170: aload #16
    //   1172: getfield a : I
    //   1175: istore #4
    //   1177: aload #15
    //   1179: getfield a : I
    //   1182: istore_3
    //   1183: iload #4
    //   1185: iload_3
    //   1186: if_icmpne -> 1218
    //   1189: aload #16
    //   1191: getfield b : I
    //   1194: aload #15
    //   1196: getfield b : I
    //   1199: if_icmpeq -> 1205
    //   1202: goto -> 1218
    //   1205: aload #18
    //   1207: aload #14
    //   1209: invokevirtual c : (Lhe1;)V
    //   1212: iconst_0
    //   1213: istore #7
    //   1215: goto -> 1240
    //   1218: aload #18
    //   1220: aload #14
    //   1222: iload #4
    //   1224: aload #16
    //   1226: getfield b : I
    //   1229: iload_3
    //   1230: aload #15
    //   1232: getfield b : I
    //   1235: invokevirtual g : (Lhe1;IIII)Z
    //   1238: istore #7
    //   1240: iload #7
    //   1242: ifeq -> 977
    //   1245: aload #17
    //   1247: invokevirtual Z : ()V
    //   1250: goto -> 977
    //   1253: iload_3
    //   1254: iconst_4
    //   1255: iand
    //   1256: ifeq -> 1275
    //   1259: aload #17
    //   1261: aload #14
    //   1263: aload #11
    //   1265: getfield b : Lp11;
    //   1268: aconst_null
    //   1269: invokevirtual h : (Lhe1;Lp11;Lp11;)V
    //   1272: goto -> 977
    //   1275: iload_3
    //   1276: bipush #8
    //   1278: iand
    //   1279: ifeq -> 977
    //   1282: aload #17
    //   1284: aload #14
    //   1286: aload #11
    //   1288: getfield b : Lp11;
    //   1291: aload #11
    //   1293: getfield c : Lp11;
    //   1296: invokevirtual g : (Lhe1;Lp11;Lp11;)V
    //   1299: goto -> 977
    //   1302: aload #11
    //   1304: iconst_0
    //   1305: putfield a : I
    //   1308: aload #11
    //   1310: aconst_null
    //   1311: putfield b : Lp11;
    //   1314: aload #11
    //   1316: aconst_null
    //   1317: putfield c : Lp11;
    //   1320: getstatic e32.d : Lz81;
    //   1323: aload #11
    //   1325: invokevirtual a : (Ljava/lang/Object;)Z
    //   1328: pop
    //   1329: iinc #2, -1
    //   1332: goto -> 905
    //   1335: aconst_null
    //   1336: astore #11
    //   1338: goto -> 1346
    //   1341: iconst_1
    //   1342: istore_3
    //   1343: goto -> 1335
    //   1346: aload_0
    //   1347: getfield p : Landroidx/recyclerview/widget/a;
    //   1350: aload #10
    //   1352: invokevirtual y0 : (Lyd1;)V
    //   1355: aload #12
    //   1357: aload #12
    //   1359: getfield e : I
    //   1362: putfield b : I
    //   1365: aload_0
    //   1366: iconst_0
    //   1367: putfield F : Z
    //   1370: aload_0
    //   1371: iconst_0
    //   1372: putfield G : Z
    //   1375: aload #12
    //   1377: iconst_0
    //   1378: putfield j : Z
    //   1381: aload #12
    //   1383: iconst_0
    //   1384: putfield k : Z
    //   1387: aload_0
    //   1388: getfield p : Landroidx/recyclerview/widget/a;
    //   1391: iconst_0
    //   1392: putfield h : Z
    //   1395: aload #10
    //   1397: getfield b : Ljava/util/ArrayList;
    //   1400: astore #8
    //   1402: aload #8
    //   1404: ifnull -> 1412
    //   1407: aload #8
    //   1409: invokevirtual clear : ()V
    //   1412: aload_0
    //   1413: getfield p : Landroidx/recyclerview/widget/a;
    //   1416: astore #8
    //   1418: aload #8
    //   1420: getfield m : Z
    //   1423: ifeq -> 1443
    //   1426: aload #8
    //   1428: iconst_0
    //   1429: putfield l : I
    //   1432: aload #8
    //   1434: iconst_0
    //   1435: putfield m : Z
    //   1438: aload #10
    //   1440: invokevirtual n : ()V
    //   1443: aload_0
    //   1444: getfield p : Landroidx/recyclerview/widget/a;
    //   1447: aload #12
    //   1449: invokevirtual r0 : (Lde1;)V
    //   1452: aload_0
    //   1453: iload_3
    //   1454: invokevirtual W : (Z)V
    //   1457: aload_0
    //   1458: iconst_0
    //   1459: invokevirtual q0 : (Z)V
    //   1462: aload #9
    //   1464: getfield c : Ljava/lang/Object;
    //   1467: checkcast zm1
    //   1470: invokevirtual clear : ()V
    //   1473: aload #9
    //   1475: getfield e : Ljava/lang/Object;
    //   1478: checkcast sp0
    //   1481: invokevirtual a : ()V
    //   1484: aload_0
    //   1485: getfield r0 : [I
    //   1488: astore #8
    //   1490: aload #8
    //   1492: iconst_0
    //   1493: iaload
    //   1494: istore_2
    //   1495: aload #8
    //   1497: iload_3
    //   1498: iaload
    //   1499: istore_1
    //   1500: aload_0
    //   1501: aload #8
    //   1503: invokevirtual G : ([I)V
    //   1506: aload #8
    //   1508: iconst_0
    //   1509: iaload
    //   1510: iload_2
    //   1511: if_icmpne -> 1522
    //   1514: aload #8
    //   1516: iload_3
    //   1517: iaload
    //   1518: iload_1
    //   1519: if_icmpeq -> 1528
    //   1522: aload_0
    //   1523: iconst_0
    //   1524: iconst_0
    //   1525: invokevirtual w : (II)V
    //   1528: aload_0
    //   1529: getfield f0 : Z
    //   1532: ifeq -> 2006
    //   1535: aload_0
    //   1536: getfield o : Lid1;
    //   1539: ifnull -> 2006
    //   1542: aload_0
    //   1543: invokevirtual hasFocus : ()Z
    //   1546: ifeq -> 2006
    //   1549: aload_0
    //   1550: invokevirtual getDescendantFocusability : ()I
    //   1553: ldc_w 393216
    //   1556: if_icmpeq -> 2006
    //   1559: aload_0
    //   1560: invokevirtual getDescendantFocusability : ()I
    //   1563: ldc_w 131072
    //   1566: if_icmpne -> 1579
    //   1569: aload_0
    //   1570: invokevirtual isFocused : ()Z
    //   1573: ifeq -> 1579
    //   1576: goto -> 2006
    //   1579: aload_0
    //   1580: invokevirtual isFocused : ()Z
    //   1583: ifne -> 1611
    //   1586: aload_0
    //   1587: invokevirtual getFocusedChild : ()Landroid/view/View;
    //   1590: astore #8
    //   1592: aload #13
    //   1594: getfield e : Ljava/lang/Object;
    //   1597: checkcast java/util/ArrayList
    //   1600: aload #8
    //   1602: invokevirtual contains : (Ljava/lang/Object;)Z
    //   1605: ifne -> 1611
    //   1608: goto -> 2006
    //   1611: aload #12
    //   1613: getfield m : J
    //   1616: lstore #5
    //   1618: lload #5
    //   1620: ldc2_w -1
    //   1623: lcmp
    //   1624: ifeq -> 1759
    //   1627: aload_0
    //   1628: getfield o : Lid1;
    //   1631: getfield b : Z
    //   1634: istore #7
    //   1636: iload #7
    //   1638: ifeq -> 1759
    //   1641: iload #7
    //   1643: ifne -> 1649
    //   1646: goto -> 1759
    //   1649: aload #13
    //   1651: invokevirtual h : ()I
    //   1654: istore_2
    //   1655: aconst_null
    //   1656: astore #8
    //   1658: iconst_0
    //   1659: istore_1
    //   1660: aload #8
    //   1662: astore #9
    //   1664: iload_1
    //   1665: iload_2
    //   1666: if_icmpge -> 1762
    //   1669: aload #13
    //   1671: iload_1
    //   1672: invokevirtual g : (I)Landroid/view/View;
    //   1675: invokestatic O : (Landroid/view/View;)Lhe1;
    //   1678: astore #9
    //   1680: aload #8
    //   1682: astore #10
    //   1684: aload #9
    //   1686: ifnull -> 1749
    //   1689: aload #8
    //   1691: astore #10
    //   1693: aload #9
    //   1695: invokevirtual j : ()Z
    //   1698: ifne -> 1749
    //   1701: aload #8
    //   1703: astore #10
    //   1705: aload #9
    //   1707: getfield g : J
    //   1710: lload #5
    //   1712: lcmp
    //   1713: ifne -> 1749
    //   1716: aload #9
    //   1718: getfield b : Landroid/view/View;
    //   1721: astore #8
    //   1723: aload #13
    //   1725: getfield e : Ljava/lang/Object;
    //   1728: checkcast java/util/ArrayList
    //   1731: aload #8
    //   1733: invokevirtual contains : (Ljava/lang/Object;)Z
    //   1736: ifeq -> 1746
    //   1739: aload #9
    //   1741: astore #10
    //   1743: goto -> 1749
    //   1746: goto -> 1762
    //   1749: iinc #1, 1
    //   1752: aload #10
    //   1754: astore #8
    //   1756: goto -> 1660
    //   1759: aconst_null
    //   1760: astore #9
    //   1762: aload #9
    //   1764: ifnull -> 1804
    //   1767: aload #9
    //   1769: getfield b : Landroid/view/View;
    //   1772: astore #8
    //   1774: aload #13
    //   1776: getfield e : Ljava/lang/Object;
    //   1779: checkcast java/util/ArrayList
    //   1782: aload #8
    //   1784: invokevirtual contains : (Ljava/lang/Object;)Z
    //   1787: ifne -> 1804
    //   1790: aload #8
    //   1792: invokevirtual hasFocusable : ()Z
    //   1795: ifne -> 1801
    //   1798: goto -> 1804
    //   1801: goto -> 1943
    //   1804: aload #11
    //   1806: astore #8
    //   1808: aload #13
    //   1810: invokevirtual e : ()I
    //   1813: ifle -> 1943
    //   1816: aload #12
    //   1818: getfield l : I
    //   1821: istore_1
    //   1822: iload_1
    //   1823: iconst_m1
    //   1824: if_icmpeq -> 1830
    //   1827: goto -> 1832
    //   1830: iconst_0
    //   1831: istore_1
    //   1832: aload #12
    //   1834: invokevirtual b : ()I
    //   1837: istore_3
    //   1838: iload_1
    //   1839: istore_2
    //   1840: iload_2
    //   1841: iload_3
    //   1842: if_icmpge -> 1884
    //   1845: aload_0
    //   1846: iload_2
    //   1847: invokevirtual I : (I)Lhe1;
    //   1850: astore #8
    //   1852: aload #8
    //   1854: ifnonnull -> 1860
    //   1857: goto -> 1884
    //   1860: aload #8
    //   1862: getfield b : Landroid/view/View;
    //   1865: astore #8
    //   1867: aload #8
    //   1869: invokevirtual hasFocusable : ()Z
    //   1872: ifeq -> 1878
    //   1875: goto -> 1943
    //   1878: iinc #2, 1
    //   1881: goto -> 1840
    //   1884: iload_3
    //   1885: iload_1
    //   1886: invokestatic min : (II)I
    //   1889: iconst_1
    //   1890: isub
    //   1891: istore_1
    //   1892: aload #11
    //   1894: astore #8
    //   1896: iload_1
    //   1897: iflt -> 1943
    //   1900: aload_0
    //   1901: iload_1
    //   1902: invokevirtual I : (I)Lhe1;
    //   1905: astore #8
    //   1907: aload #8
    //   1909: ifnonnull -> 1919
    //   1912: aload #11
    //   1914: astore #8
    //   1916: goto -> 1943
    //   1919: aload #8
    //   1921: getfield b : Landroid/view/View;
    //   1924: astore #8
    //   1926: aload #8
    //   1928: invokevirtual hasFocusable : ()Z
    //   1931: ifeq -> 1937
    //   1934: goto -> 1943
    //   1937: iinc #1, -1
    //   1940: goto -> 1892
    //   1943: aload #8
    //   1945: ifnull -> 2006
    //   1948: aload #12
    //   1950: getfield n : I
    //   1953: istore_1
    //   1954: aload #8
    //   1956: astore #9
    //   1958: iload_1
    //   1959: i2l
    //   1960: ldc2_w -1
    //   1963: lcmp
    //   1964: ifeq -> 2000
    //   1967: aload #8
    //   1969: iload_1
    //   1970: invokevirtual findViewById : (I)Landroid/view/View;
    //   1973: astore #10
    //   1975: aload #8
    //   1977: astore #9
    //   1979: aload #10
    //   1981: ifnull -> 2000
    //   1984: aload #8
    //   1986: astore #9
    //   1988: aload #10
    //   1990: invokevirtual isFocusable : ()Z
    //   1993: ifeq -> 2000
    //   1996: aload #10
    //   1998: astore #9
    //   2000: aload #9
    //   2002: invokevirtual requestFocus : ()Z
    //   2005: pop
    //   2006: aload #12
    //   2008: ldc2_w -1
    //   2011: putfield m : J
    //   2014: aload #12
    //   2016: iconst_m1
    //   2017: putfield l : I
    //   2020: aload #12
    //   2022: iconst_m1
    //   2023: putfield n : I
    //   2026: return
  }
  
  public final void r0(int paramInt) {
    getScrollingChildHelper().h(paramInt);
  }
  
  public final void removeDetachedView(View paramView, boolean paramBoolean) {
    StringBuilder stringBuilder;
    he1 he1 = O(paramView);
    if (he1 != null) {
      if (he1.l()) {
        he1.l &= 0xFFFFFEFF;
      } else if (!he1.q()) {
        stringBuilder = new StringBuilder("Called removeDetachedView with a view which is not flagged as tmp detached.");
        stringBuilder.append(he1);
        l0.j(stringBuilder, B());
        return;
      } 
    } else if (E0) {
      StringBuilder stringBuilder1 = new StringBuilder("No ViewHolder found for child: ");
      stringBuilder1.append(stringBuilder);
      l0.j(stringBuilder1, B());
      return;
    } 
    stringBuilder.clearAnimation();
    q((View)stringBuilder);
    super.removeDetachedView((View)stringBuilder, paramBoolean);
  }
  
  public final void requestChildFocus(View paramView1, View paramView2) {
    kn0 kn0 = this.p.g;
    if ((kn0 == null || !kn0.e) && !R() && paramView2 != null)
      h0(paramView1, paramView2); 
    super.requestChildFocus(paramView1, paramView2);
  }
  
  public final boolean requestChildRectangleOnScreen(View paramView, Rect paramRect, boolean paramBoolean) {
    return this.p.B0(this, paramView, paramRect, paramBoolean, false);
  }
  
  public final void requestDisallowInterceptTouchEvent(boolean paramBoolean) {
    ArrayList<ud1> arrayList = this.s;
    int i = arrayList.size();
    for (byte b = 0; b < i; b++)
      ((ud1)arrayList.get(b)).c(paramBoolean); 
    super.requestDisallowInterceptTouchEvent(paramBoolean);
  }
  
  public final void requestLayout() {
    if (this.x == 0 && !this.z) {
      super.requestLayout();
      return;
    } 
    this.y = true;
  }
  
  public final void s() {
    zm1 zm11;
    he1 he1;
    de1 de11 = this.j0;
    de11.a(1);
    C(de11);
    de11.i = false;
    o0();
    j01 j011 = this.i;
    zm1 zm12 = (zm1)j011.c;
    zm1 zm13 = (zm1)j011.c;
    zm12.clear();
    sp0 sp0 = (sp0)j011.e;
    sp0.a();
    V();
    a0();
    boolean bool = this.f0;
    zm12 = null;
    if (bool && hasFocus() && this.o != null) {
      View view = getFocusedChild();
    } else {
      j011 = null;
    } 
    if (j011 == null) {
      zm11 = zm12;
    } else {
      zm1 zm1;
      View view = E((View)zm11);
      if (view == null) {
        zm1 = zm12;
      } else {
        he1 = N((View)zm1);
      } 
    } 
    long l = -1L;
    if (he1 == null) {
      de11.m = -1L;
      de11.l = -1;
      de11.n = -1;
    } else {
      if (this.o.b)
        l = he1.g; 
      de11.m = l;
      if (this.F) {
        i = -1;
      } else if (he1.j()) {
        i = he1.f;
      } else {
        i = he1.b();
      } 
      de11.l = i;
      View view = he1.b;
      int i = view.getId();
      while (!view.isFocused() && view instanceof ViewGroup && view.hasFocus()) {
        View view1 = ((ViewGroup)view).getFocusedChild();
        view = view1;
        if (view1.getId() != -1) {
          i = view1.getId();
          view = view1;
        } 
      } 
      de11.n = i;
    } 
    if (de11.j && this.n0) {
      bool = true;
    } else {
      bool = false;
    } 
    de11.h = bool;
    this.n0 = false;
    this.m0 = false;
    de11.g = de11.k;
    de11.e = this.o.c();
    G(this.r0);
    bool = de11.j;
    tk tk1 = this.h;
    if (bool) {
      int i = tk1.e();
      for (byte b = 0; b < i; b++) {
        he1 he11 = O(tk1.d(b));
        if (!he11.q() && (!he11.h() || this.o.b)) {
          od1 od11 = this.O;
          od1.b(he11);
          he11.e();
          od11.getClass();
          Object object = new Object();
          object.a(he11);
          e32 e322 = (e32)zm13.get(he11);
          e32 e321 = e322;
          if (e322 == null) {
            e321 = e32.a();
            zm13.put(he11, e321);
          } 
          e321.b = (p11)object;
          e321.a |= 0x4;
          if (de11.h && he11.m() && !he11.j() && !he11.q() && !he11.h())
            sp0.d(L(he11), he11); 
        } 
      } 
    } 
    if (de11.k) {
      int i = tk1.h();
      byte b = 0;
      while (b < i) {
        he1 = O(tk1.g(b));
        if (!E0 || he1.e != -1 || he1.j()) {
          if (!he1.q() && he1.f == -1)
            he1.f = he1.e; 
          b++;
          continue;
        } 
        tp.f("view holder cannot have position -1 unless it is removed".concat(B()));
        return;
      } 
      bool = de11.f;
      de11.f = false;
      this.p.q0(this.e, de11);
      de11.f = bool;
      for (b = 0; b < tk1.e(); b++) {
        he1 he11 = O(tk1.d(b));
        if (!he11.q()) {
          e32 e32 = (e32)zm13.get(he11);
          if (e32 == null || (e32.a & 0x4) == 0) {
            od1.b(he11);
            if ((he11.l & 0x2000) != 0) {
              i = 1;
            } else {
              i = 0;
            } 
            od1 od11 = this.O;
            he11.e();
            od11.getClass();
            Object object = new Object();
            object.a(he11);
            if (i != 0) {
              c0(he11, (p11)object);
            } else {
              e32 e322 = (e32)zm13.get(he11);
              e32 e321 = e322;
              if (e322 == null) {
                e321 = e32.a();
                zm13.put(he11, e321);
              } 
              e321.a |= 0x2;
              e321.b = (p11)object;
            } 
          } 
        } 
      } 
      l();
    } else {
      l();
    } 
    W(true);
    q0(false);
    de11.d = 2;
  }
  
  public final void s0() {
    setScrollState(0);
    ge1 ge11 = this.g0;
    ge11.i.removeCallbacks((Runnable)ge11);
    ge11.e.abortAnimation();
    a a1 = this.p;
    if (a1 != null) {
      kn0 kn0 = a1.g;
      if (kn0 != null)
        kn0.i(); 
    } 
  }
  
  public final void scrollBy(int paramInt1, int paramInt2) {
    a a1 = this.p;
    if (a1 == null) {
      Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
      return;
    } 
    if (!this.z) {
      boolean bool2 = a1.o();
      boolean bool1 = this.p.p();
      if (bool2 || bool1) {
        if (!bool2)
          paramInt1 = 0; 
        if (!bool1)
          paramInt2 = 0; 
        i0(paramInt1, paramInt2, 0, null);
        return;
      } 
    } 
  }
  
  public final void scrollTo(int paramInt1, int paramInt2) {
    Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
  }
  
  public final void sendAccessibilityEventUnchecked(AccessibilityEvent paramAccessibilityEvent) {
    if (R()) {
      boolean bool1;
      boolean bool2 = false;
      if (paramAccessibilityEvent != null) {
        bool1 = paramAccessibilityEvent.getContentChangeTypes();
      } else {
        bool1 = false;
      } 
      if (!bool1)
        bool1 = bool2; 
      this.B |= bool1;
      return;
    } 
    super.sendAccessibilityEventUnchecked(paramAccessibilityEvent);
  }
  
  public void setAccessibilityDelegateCompat(je1 paramje1) {
    this.q0 = paramje1;
    v22.n((View)this, (k0)paramje1);
  }
  
  public void setAdapter(id1 paramid1) {
    setLayoutFrozen(false);
    id1 id11 = this.o;
    ae1 ae11 = this.c;
    if (id11 != null) {
      id11.a.unregisterObserver(ae11);
      this.o.getClass();
    } 
    od1 od11 = this.O;
    if (od11 != null)
      od11.e(); 
    a a2 = this.p;
    yd1 yd11 = this.e;
    if (a2 != null) {
      a2.x0(yd11);
      this.p.y0(yd11);
    } 
    yd11.a.clear();
    yd11.g();
    v2 v21 = this.g;
    v21.q((ArrayList)v21.c);
    v21.q((ArrayList)v21.d);
    v21.a = 0;
    id1 id13 = this.o;
    this.o = paramid1;
    if (paramid1 != null)
      paramid1.a.registerObserver(ae11); 
    a a1 = this.p;
    if (a1 != null)
      a1.c0(); 
    id1 id12 = this.o;
    yd11.a.clear();
    yd11.g();
    yd11.f(id13, true);
    xd1 xd1 = yd11.c();
    if (id13 != null)
      xd1.b--; 
    if (xd1.b == 0) {
      SparseArray sparseArray = xd1.a;
      for (byte b = 0; b < sparseArray.size(); b++) {
        wd1 wd1 = (wd1)sparseArray.valueAt(b);
        ArrayList<Object> arrayList = wd1.a;
        int i = arrayList.size();
        byte b1 = 0;
        while (b1 < i) {
          Object object = arrayList.get(b1);
          b1++;
          ui0.e(((he1)object).b);
        } 
        wd1.a.clear();
      } 
    } 
    if (id12 != null)
      xd1.b++; 
    yd11.e();
    this.j0.f = true;
    b0(false);
    requestLayout();
  }
  
  public void setChildDrawingOrderCallback(md1 parammd1) {
    if (parammd1 == null)
      return; 
    setChildrenDrawingOrderEnabled(false);
  }
  
  public void setClipToPadding(boolean paramBoolean) {
    if (paramBoolean != this.j) {
      this.N = null;
      this.L = null;
      this.M = null;
      this.K = null;
    } 
    this.j = paramBoolean;
    super.setClipToPadding(paramBoolean);
    if (this.w)
      requestLayout(); 
  }
  
  public void setEdgeEffectFactory(nd1 paramnd1) {
    paramnd1.getClass();
    this.J = paramnd1;
    this.N = null;
    this.L = null;
    this.M = null;
    this.K = null;
  }
  
  public void setHasFixedSize(boolean paramBoolean) {
    this.v = paramBoolean;
  }
  
  public void setItemAnimator(od1 paramod1) {
    od1 od11 = this.O;
    if (od11 != null) {
      od11.e();
      this.O.a = null;
    } 
    this.O = paramod1;
    if (paramod1 != null)
      paramod1.a = this.o0; 
  }
  
  public void setItemViewCacheSize(int paramInt) {
    yd1 yd11 = this.e;
    yd11.e = paramInt;
    yd11.n();
  }
  
  @Deprecated
  public void setLayoutFrozen(boolean paramBoolean) {
    suppressLayout(paramBoolean);
  }
  
  public void setLayoutManager(a parama) {
    if (parama == this.p)
      return; 
    s0();
    a a1 = this.p;
    boolean bool = false;
    yd1 yd11 = this.e;
    if (a1 != null) {
      od1 od11 = this.O;
      if (od11 != null)
        od11.e(); 
      this.p.x0(yd11);
      this.p.y0(yd11);
      yd11.a.clear();
      yd11.g();
      if (this.u) {
        a a2 = this.p;
        a2.i = false;
        a2.e0(this);
      } 
      this.p.K0(null);
      this.p = null;
    } else {
      yd11.a.clear();
      yd11.g();
    } 
    tk tk1 = this.h;
    ((sk)tk1.d).h();
    ArrayList<View> arrayList = (ArrayList)tk1.e;
    int i = arrayList.size() - 1;
    while (true) {
      StringBuilder stringBuilder;
      RecyclerView recyclerView = ((xy)tk1.c).b;
      if (i >= 0) {
        he1 he1 = O(arrayList.get(i));
        if (he1 != null) {
          int k = he1.r;
          if (recyclerView.R()) {
            he1.s = k;
            recyclerView.w0.add(he1);
          } else {
            he1.b.setImportantForAccessibility(k);
          } 
          he1.r = 0;
        } 
        arrayList.remove(i);
        i--;
        continue;
      } 
      int j = recyclerView.getChildCount();
      for (i = bool; i < j; i++) {
        View view = recyclerView.getChildAt(i);
        recyclerView.q(view);
        view.clearAnimation();
      } 
      recyclerView.removeAllViews();
      this.p = parama;
      if (parama != null)
        if (parama.c == null) {
          parama.K0(this);
          if (this.u) {
            parama = this.p;
            parama.i = true;
            parama.d0(this);
          } 
        } else {
          stringBuilder = new StringBuilder("LayoutManager ");
          stringBuilder.append(parama);
          String str = parama.c.B();
          stringBuilder.append(" is already attached to a RecyclerView:");
          stringBuilder.append(str);
          throw new IllegalArgumentException(stringBuilder.toString());
        }  
      stringBuilder.n();
      requestLayout();
      return;
    } 
  }
  
  @Deprecated
  public void setLayoutTransition(LayoutTransition paramLayoutTransition) {
    if (paramLayoutTransition == null) {
      super.setLayoutTransition(null);
      return;
    } 
    l0.l("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
  }
  
  public void setNestedScrollingEnabled(boolean paramBoolean) {
    m11 m111 = getScrollingChildHelper();
    if (m111.d) {
      ViewGroup viewGroup = m111.c;
      WeakHashMap weakHashMap = v22.a;
      viewGroup.stopNestedScroll();
    } 
    m111.d = paramBoolean;
  }
  
  public void setOnFlingListener(td1 paramtd1) {
    this.a0 = paramtd1;
  }
  
  @Deprecated
  public void setOnScrollListener(vd1 paramvd1) {
    this.k0 = paramvd1;
  }
  
  public void setPreserveFocusAfterLayout(boolean paramBoolean) {
    this.f0 = paramBoolean;
  }
  
  public void setRecycledViewPool(xd1 paramxd1) {
    yd1 yd11 = this.e;
    RecyclerView recyclerView = yd11.h;
    yd11.f(recyclerView.o, false);
    xd1 xd11 = yd11.g;
    if (xd11 != null)
      xd11.b--; 
    yd11.g = paramxd1;
    if (paramxd1 != null && recyclerView.getAdapter() != null) {
      paramxd1 = yd11.g;
      paramxd1.b++;
    } 
    yd11.e();
  }
  
  @Deprecated
  public void setRecyclerListener(zd1 paramzd1) {}
  
  public void setScrollState(int paramInt) {
    if (paramInt != this.P) {
      if (F0) {
        StringBuilder stringBuilder = ga1.k(paramInt, AyxAR.mBUbXJwDzdmDF, " from ");
        stringBuilder.append(this.P);
        Log.d("RecyclerView", stringBuilder.toString(), new Exception());
      } 
      this.P = paramInt;
      if (paramInt != 2) {
        ge1 ge11 = this.g0;
        ge11.i.removeCallbacks((Runnable)ge11);
        ge11.e.abortAnimation();
        a a2 = this.p;
        if (a2 != null) {
          kn0 kn0 = a2.g;
          if (kn0 != null)
            kn0.i(); 
        } 
      } 
      a a1 = this.p;
      if (a1 != null)
        a1.u0(paramInt); 
      Y(paramInt);
      vd1 vd11 = this.k0;
      if (vd11 != null)
        vd11.a(this, paramInt); 
      ArrayList arrayList = this.l0;
      if (arrayList != null)
        for (int i = arrayList.size() - 1; i >= 0; i--)
          ((vd1)this.l0.get(i)).a(this, paramInt);  
    } 
  }
  
  public void setScrollingTouchSlop(int paramInt) {
    ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
    if (paramInt != 0)
      if (paramInt != 1) {
        StringBuilder stringBuilder = new StringBuilder(XUaAMlaMSa.IuaGrh);
        stringBuilder.append(paramInt);
        stringBuilder.append("; using default value");
        Log.w("RecyclerView", stringBuilder.toString());
      } else {
        this.W = viewConfiguration.getScaledPagingTouchSlop();
        return;
      }  
    this.W = viewConfiguration.getScaledTouchSlop();
  }
  
  public void setViewCacheExtension(fe1 paramfe1) {
    this.e.getClass();
  }
  
  public final boolean startNestedScroll(int paramInt) {
    return getScrollingChildHelper().g(paramInt, 0);
  }
  
  public final void stopNestedScroll() {
    getScrollingChildHelper().h(0);
  }
  
  public final void suppressLayout(boolean paramBoolean) {
    if (paramBoolean != this.z) {
      j("Do not suppressLayout in layout or scroll");
      if (!paramBoolean) {
        this.z = false;
        if (this.y && this.p != null && this.o != null)
          requestLayout(); 
        this.y = false;
        return;
      } 
      long l = SystemClock.uptimeMillis();
      onTouchEvent(MotionEvent.obtain(l, l, 3, 0.0F, 0.0F, 0));
      this.z = true;
      this.A = true;
      s0();
    } 
  }
  
  public final void t() {
    boolean bool;
    o0();
    V();
    de1 de11 = this.j0;
    de11.a(6);
    this.g.d();
    de11.e = this.o.c();
    de11.c = 0;
    if (this.f != null) {
      id1 id11 = this.o;
      int i = x41.y(id11.c);
      if ((i != 1) ? (i != 2) : (id11.c() > 0)) {
        Parcelable parcelable = this.f.e;
        if (parcelable != null)
          this.p.s0(parcelable); 
        this.f = null;
      } 
    } 
    de11.g = false;
    this.p.q0(this.e, de11);
    de11.f = false;
    if (de11.j && this.O != null) {
      bool = true;
    } else {
      bool = false;
    } 
    de11.j = bool;
    de11.d = 4;
    W(true);
    q0(false);
  }
  
  public final boolean u(int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfint1, int[] paramArrayOfint2) {
    return getScrollingChildHelper().c(paramInt1, paramInt2, paramInt3, paramArrayOfint1, paramArrayOfint2);
  }
  
  public final void v(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int[] paramArrayOfint1, int paramInt5, int[] paramArrayOfint2) {
    getScrollingChildHelper().d(paramInt1, paramInt2, paramInt3, paramInt4, paramArrayOfint1, paramInt5, paramArrayOfint2);
  }
  
  public final void w(int paramInt1, int paramInt2) {
    this.I++;
    int i = getScrollX();
    int j = getScrollY();
    onScrollChanged(i, j, i - paramInt1, j - paramInt2);
    vd1 vd11 = this.k0;
    if (vd11 != null)
      vd11.b(this, paramInt1, paramInt2); 
    ArrayList arrayList = this.l0;
    if (arrayList != null)
      for (i = arrayList.size() - 1; i >= 0; i--)
        ((vd1)this.l0.get(i)).b(this, paramInt1, paramInt2);  
    this.I--;
  }
  
  public final void x() {
    if (this.N != null)
      return; 
    ((ee1)this.J).getClass();
    EdgeEffect edgeEffect = new EdgeEffect(getContext());
    this.N = edgeEffect;
    if (this.j) {
      edgeEffect.setSize(getMeasuredWidth() - getPaddingLeft() - getPaddingRight(), getMeasuredHeight() - getPaddingTop() - getPaddingBottom());
      return;
    } 
    edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
  }
  
  public final void y() {
    if (this.K != null)
      return; 
    ((ee1)this.J).getClass();
    EdgeEffect edgeEffect = new EdgeEffect(getContext());
    this.K = edgeEffect;
    if (this.j) {
      edgeEffect.setSize(getMeasuredHeight() - getPaddingTop() - getPaddingBottom(), getMeasuredWidth() - getPaddingLeft() - getPaddingRight());
      return;
    } 
    edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
  }
  
  public final void z() {
    if (this.M != null)
      return; 
    ((ee1)this.J).getClass();
    EdgeEffect edgeEffect = new EdgeEffect(getContext());
    this.M = edgeEffect;
    if (this.j) {
      edgeEffect.setSize(getMeasuredHeight() - getPaddingTop() - getPaddingBottom(), getMeasuredWidth() - getPaddingLeft() - getPaddingRight());
      return;
    } 
    edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
  }
  
  static {
    Class<int> clazz = int.class;
    K0 = new Class[] { Context.class, AttributeSet.class, clazz, clazz };
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\androidx\recyclerview\widget\RecyclerView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
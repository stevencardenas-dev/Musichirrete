import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.ContentFrameLayout;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.WeakHashMap;
import org.jaudiotagger.audio.opus.bsQ.uvJYmft;

public final class u6 extends g6 implements LayoutInflater.Factory2, pw0 {
  public static final zm1 j0 = new zm1(0);
  
  public static final int[] k0 = new int[] { 16842836 };
  
  public static final boolean l0 = "robolectric".equals(Build.FINGERPRINT) ^ true;
  
  public final boolean A;
  
  public boolean B;
  
  public ViewGroup C;
  
  public TextView D;
  
  public View E;
  
  public boolean F;
  
  public boolean G;
  
  public boolean H;
  
  public boolean I;
  
  public boolean J;
  
  public boolean K;
  
  public boolean L;
  
  public boolean M;
  
  public t6[] N;
  
  public t6 O;
  
  public boolean P;
  
  public boolean Q;
  
  public boolean R;
  
  public boolean S;
  
  public Configuration T;
  
  public final int U;
  
  public int V;
  
  public int W;
  
  public boolean X;
  
  public p6 Y;
  
  public p6 Z;
  
  public boolean a0;
  
  public int b0;
  
  public final h6 c0;
  
  public boolean d0;
  
  public Rect e0;
  
  public Rect f0;
  
  public m8 g0;
  
  public OnBackInvokedDispatcher h0;
  
  public OnBackInvokedCallback i0;
  
  public final Object l;
  
  public final Context m;
  
  public Window n;
  
  public o6 o;
  
  public ui0 p;
  
  public cr1 q;
  
  public CharSequence r;
  
  public ActionBarOverlayLayout s;
  
  public i6 t;
  
  public i6 u;
  
  public y1 v;
  
  public ActionBarContextView w;
  
  public PopupWindow x;
  
  public h6 y;
  
  public u32 z;
  
  public u6(Context paramContext, Window paramWindow, y5 paramy5, Object paramObject) {
    Context context = null;
    this.z = null;
    this.A = true;
    this.U = -100;
    this.c0 = new h6(this, 0);
    this.m = paramContext;
    this.l = paramObject;
    if (paramObject instanceof Dialog) {
      Context context1 = paramContext;
      while (true) {
        paramContext = context;
        if (context1 != null) {
          if (context1 instanceof x5) {
            x5 x5 = (x5)context1;
            break;
          } 
          paramContext = context;
          if (context1 instanceof ContextWrapper) {
            context1 = ((ContextWrapper)context1).getBaseContext();
            continue;
          } 
        } 
        break;
      } 
      if (paramContext != null)
        this.U = ((u6)paramContext.X()).U; 
    } 
    if (this.U == -100) {
      String str = this.l.getClass().getName();
      zm1 zm11 = j0;
      Integer integer = (Integer)zm11.get(str);
      if (integer != null) {
        this.U = integer.intValue();
        zm11.remove(this.l.getClass().getName());
      } 
    } 
    if (paramWindow != null)
      o(paramWindow); 
    y6.d();
  }
  
  public static vo0 p(Context paramContext) {
    vo0 vo01;
    if (Build.VERSION.SDK_INT >= 33)
      return null; 
    vo0 vo02 = g6.e;
    if (vo02 == null)
      return null; 
    wo0 wo0 = vo02.a;
    vo02 = l6.b(paramContext.getApplicationContext().getResources().getConfiguration());
    if (wo0.a.isEmpty()) {
      vo01 = vo0.b;
    } else {
      LinkedHashSet<Locale> linkedHashSet = new LinkedHashSet();
      byte b = 0;
      while (true) {
        int i = wo0.a.size();
        if (b < vo02.a.a.size() + i) {
          Locale locale;
          if (b < wo0.a.size()) {
            locale = wo0.a.get(b);
          } else {
            i = wo0.a.size();
            locale = vo02.a.a.get(b - i);
          } 
          if (locale != null)
            linkedHashSet.add(locale); 
          b++;
          continue;
        } 
        vo01 = new vo0(new wo0(new LocaleList(linkedHashSet.<Locale>toArray(new Locale[linkedHashSet.size()]))));
        return vo01.a.a.isEmpty() ? vo02 : vo01;
      } 
    } 
    return vo01.a.a.isEmpty() ? vo02 : vo01;
  }
  
  public static Configuration t(Context paramContext, int paramInt, vo0 paramvo0, Configuration paramConfiguration, boolean paramBoolean) {
    if (paramInt != 1) {
      if (paramInt != 2) {
        if (paramBoolean) {
          paramInt = 0;
        } else {
          paramInt = (paramContext.getApplicationContext().getResources().getConfiguration()).uiMode & 0x30;
        } 
      } else {
        paramInt = 32;
      } 
    } else {
      paramInt = 16;
    } 
    Configuration configuration = new Configuration();
    configuration.fontScale = 0.0F;
    if (paramConfiguration != null)
      configuration.setTo(paramConfiguration); 
    configuration.uiMode = paramInt | configuration.uiMode & 0xFFFFFFCF;
    if (paramvo0 != null)
      l6.d(configuration, paramvo0); 
    return configuration;
  }
  
  public final void A() {
    w();
    if (this.H && this.p == null) {
      Object object = this.l;
      if (object instanceof Activity) {
        this.p = new t52((Activity)object, this.I);
      } else if (object instanceof Dialog) {
        this.p = new t52((Dialog)object);
      } 
      object = this.p;
      if (object != null)
        object.Y(this.d0); 
    } 
  }
  
  public final void B(int paramInt) {
    this.b0 = 1 << paramInt | this.b0;
    if (!this.a0) {
      View view = this.n.getDecorView();
      WeakHashMap weakHashMap = v22.a;
      view.postOnAnimation(this.c0);
      this.a0 = true;
    } 
  }
  
  public final int C(Context paramContext, int paramInt) {
    if (paramInt != -100) {
      if (paramInt != -1)
        if (paramInt != 0) {
          if (paramInt != 1 && paramInt != 2) {
            if (paramInt == 3) {
              if (this.Z == null)
                this.Z = new p6(this, paramContext); 
              return this.Z.f();
            } 
            tp.f(uvJYmft.bSekaEU);
            return 0;
          } 
        } else {
          return (((UiModeManager)paramContext.getApplicationContext().getSystemService("uimode")).getNightMode() != 0) ? y(paramContext).f() : -1;
        }  
      return paramInt;
    } 
    return -1;
  }
  
  public final boolean D() {
    boolean bool = this.P;
    this.P = false;
    t6 t61 = z(0);
    if (t61.m) {
      if (!bool) {
        s(t61, true);
        return true;
      } 
    } else {
      y1 y11 = this.v;
      if (y11 != null) {
        y11.a();
        return true;
      } 
      A();
      ui0 ui01 = this.p;
      if (ui01 == null || !ui01.k())
        return false; 
    } 
    return true;
  }
  
  public final void E(t6 paramt6, KeyEvent paramKeyEvent) {
    // Byte code:
    //   0: aload_1
    //   1: getfield m : Z
    //   4: istore #5
    //   6: aload_1
    //   7: getfield a : I
    //   10: istore #4
    //   12: iload #5
    //   14: ifne -> 848
    //   17: aload_0
    //   18: getfield S : Z
    //   21: ifeq -> 27
    //   24: goto -> 848
    //   27: aload_0
    //   28: getfield m : Landroid/content/Context;
    //   31: astore #6
    //   33: iload #4
    //   35: ifne -> 59
    //   38: aload #6
    //   40: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   43: invokevirtual getConfiguration : ()Landroid/content/res/Configuration;
    //   46: getfield screenLayout : I
    //   49: bipush #15
    //   51: iand
    //   52: iconst_4
    //   53: if_icmpne -> 59
    //   56: goto -> 848
    //   59: aload_0
    //   60: getfield n : Landroid/view/Window;
    //   63: invokevirtual getCallback : ()Landroid/view/Window$Callback;
    //   66: astore #7
    //   68: aload #7
    //   70: ifnull -> 96
    //   73: aload #7
    //   75: iload #4
    //   77: aload_1
    //   78: getfield h : Lrw0;
    //   81: invokeinterface onMenuOpened : (ILandroid/view/Menu;)Z
    //   86: ifne -> 96
    //   89: aload_0
    //   90: aload_1
    //   91: iconst_1
    //   92: invokevirtual s : (Lt6;Z)V
    //   95: return
    //   96: aload #6
    //   98: ldc_w 'window'
    //   101: invokevirtual getSystemService : (Ljava/lang/String;)Ljava/lang/Object;
    //   104: checkcast android/view/WindowManager
    //   107: astore #7
    //   109: aload #7
    //   111: ifnonnull -> 117
    //   114: goto -> 848
    //   117: aload_0
    //   118: aload_1
    //   119: aload_2
    //   120: invokevirtual G : (Lt6;Landroid/view/KeyEvent;)Z
    //   123: ifne -> 129
    //   126: goto -> 848
    //   129: aload_1
    //   130: getfield e : Ls6;
    //   133: astore_2
    //   134: aload_2
    //   135: ifnull -> 179
    //   138: aload_1
    //   139: getfield n : Z
    //   142: ifeq -> 148
    //   145: goto -> 179
    //   148: aload_1
    //   149: getfield g : Landroid/view/View;
    //   152: astore_2
    //   153: aload_2
    //   154: ifnull -> 771
    //   157: aload_2
    //   158: invokevirtual getLayoutParams : ()Landroid/view/ViewGroup$LayoutParams;
    //   161: astore_2
    //   162: aload_2
    //   163: ifnull -> 771
    //   166: aload_2
    //   167: getfield width : I
    //   170: iconst_m1
    //   171: if_icmpne -> 771
    //   174: iconst_m1
    //   175: istore_3
    //   176: goto -> 774
    //   179: aload_2
    //   180: ifnonnull -> 395
    //   183: aload_0
    //   184: invokevirtual A : ()V
    //   187: aload_0
    //   188: getfield p : Lui0;
    //   191: astore_2
    //   192: aload_2
    //   193: ifnull -> 204
    //   196: aload_2
    //   197: invokevirtual E : ()Landroid/content/Context;
    //   200: astore_2
    //   201: goto -> 206
    //   204: aconst_null
    //   205: astore_2
    //   206: aload_2
    //   207: ifnonnull -> 216
    //   210: aload #6
    //   212: astore_2
    //   213: goto -> 216
    //   216: new android/util/TypedValue
    //   219: dup
    //   220: invokespecial <init> : ()V
    //   223: astore #8
    //   225: aload_2
    //   226: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   229: invokevirtual newTheme : ()Landroid/content/res/Resources$Theme;
    //   232: astore #6
    //   234: aload #6
    //   236: aload_2
    //   237: invokevirtual getTheme : ()Landroid/content/res/Resources$Theme;
    //   240: invokevirtual setTo : (Landroid/content/res/Resources$Theme;)V
    //   243: aload #6
    //   245: ldc_w 2130968580
    //   248: aload #8
    //   250: iconst_1
    //   251: invokevirtual resolveAttribute : (ILandroid/util/TypedValue;Z)Z
    //   254: pop
    //   255: aload #8
    //   257: getfield resourceId : I
    //   260: istore_3
    //   261: iload_3
    //   262: ifeq -> 272
    //   265: aload #6
    //   267: iload_3
    //   268: iconst_1
    //   269: invokevirtual applyStyle : (IZ)V
    //   272: aload #6
    //   274: ldc_w 2130969787
    //   277: aload #8
    //   279: iconst_1
    //   280: invokevirtual resolveAttribute : (ILandroid/util/TypedValue;Z)Z
    //   283: pop
    //   284: aload #8
    //   286: getfield resourceId : I
    //   289: istore_3
    //   290: iload_3
    //   291: ifeq -> 304
    //   294: aload #6
    //   296: iload_3
    //   297: iconst_1
    //   298: invokevirtual applyStyle : (IZ)V
    //   301: goto -> 313
    //   304: aload #6
    //   306: ldc_w 2131952309
    //   309: iconst_1
    //   310: invokevirtual applyStyle : (IZ)V
    //   313: new bs
    //   316: dup
    //   317: aload_2
    //   318: iconst_0
    //   319: invokespecial <init> : (Landroid/content/Context;I)V
    //   322: astore_2
    //   323: aload_2
    //   324: invokevirtual getTheme : ()Landroid/content/res/Resources$Theme;
    //   327: aload #6
    //   329: invokevirtual setTo : (Landroid/content/res/Resources$Theme;)V
    //   332: aload_1
    //   333: aload_2
    //   334: putfield j : Lbs;
    //   337: aload_2
    //   338: getstatic nc1.j : [I
    //   341: invokevirtual obtainStyledAttributes : ([I)Landroid/content/res/TypedArray;
    //   344: astore_2
    //   345: aload_1
    //   346: aload_2
    //   347: bipush #86
    //   349: iconst_0
    //   350: invokevirtual getResourceId : (II)I
    //   353: putfield b : I
    //   356: aload_1
    //   357: aload_2
    //   358: iconst_1
    //   359: iconst_0
    //   360: invokevirtual getResourceId : (II)I
    //   363: putfield d : I
    //   366: aload_2
    //   367: invokevirtual recycle : ()V
    //   370: aload_1
    //   371: new s6
    //   374: dup
    //   375: aload_0
    //   376: aload_1
    //   377: getfield j : Lbs;
    //   380: invokespecial <init> : (Lu6;Lbs;)V
    //   383: putfield e : Ls6;
    //   386: aload_1
    //   387: bipush #81
    //   389: putfield c : I
    //   392: goto -> 416
    //   395: aload_1
    //   396: getfield n : Z
    //   399: ifeq -> 416
    //   402: aload_2
    //   403: invokevirtual getChildCount : ()I
    //   406: ifle -> 416
    //   409: aload_1
    //   410: getfield e : Ls6;
    //   413: invokevirtual removeAllViews : ()V
    //   416: aload_1
    //   417: getfield g : Landroid/view/View;
    //   420: astore_2
    //   421: aload_2
    //   422: ifnull -> 433
    //   425: aload_1
    //   426: aload_2
    //   427: putfield f : Landroid/view/View;
    //   430: goto -> 616
    //   433: aload_1
    //   434: getfield h : Lrw0;
    //   437: ifnonnull -> 443
    //   440: goto -> 843
    //   443: aload_0
    //   444: getfield u : Li6;
    //   447: ifnonnull -> 463
    //   450: aload_0
    //   451: new i6
    //   454: dup
    //   455: aload_0
    //   456: iconst_3
    //   457: invokespecial <init> : (Lu6;I)V
    //   460: putfield u : Li6;
    //   463: aload_0
    //   464: getfield u : Li6;
    //   467: astore #6
    //   469: aload_1
    //   470: getfield i : Lwn0;
    //   473: ifnonnull -> 516
    //   476: new wn0
    //   479: dup
    //   480: aload_1
    //   481: getfield j : Lbs;
    //   484: invokespecial <init> : (Landroid/content/ContextWrapper;)V
    //   487: astore_2
    //   488: aload_1
    //   489: aload_2
    //   490: putfield i : Lwn0;
    //   493: aload_2
    //   494: aload #6
    //   496: putfield g : Lgx0;
    //   499: aload_1
    //   500: getfield h : Lrw0;
    //   503: astore #6
    //   505: aload #6
    //   507: aload_2
    //   508: aload #6
    //   510: getfield a : Landroid/content/Context;
    //   513: invokevirtual b : (Lhx0;Landroid/content/Context;)V
    //   516: aload_1
    //   517: getfield i : Lwn0;
    //   520: astore #6
    //   522: aload_1
    //   523: getfield e : Ls6;
    //   526: astore_2
    //   527: aload #6
    //   529: getfield f : Landroidx/appcompat/view/menu/ExpandedMenuView;
    //   532: ifnonnull -> 601
    //   535: aload #6
    //   537: aload #6
    //   539: getfield c : Landroid/view/LayoutInflater;
    //   542: ldc_w 2131492877
    //   545: aload_2
    //   546: iconst_0
    //   547: invokevirtual inflate : (ILandroid/view/ViewGroup;Z)Landroid/view/View;
    //   550: checkcast androidx/appcompat/view/menu/ExpandedMenuView
    //   553: putfield f : Landroidx/appcompat/view/menu/ExpandedMenuView;
    //   556: aload #6
    //   558: getfield h : Lvn0;
    //   561: ifnonnull -> 578
    //   564: aload #6
    //   566: new vn0
    //   569: dup
    //   570: aload #6
    //   572: invokespecial <init> : (Lwn0;)V
    //   575: putfield h : Lvn0;
    //   578: aload #6
    //   580: getfield f : Landroidx/appcompat/view/menu/ExpandedMenuView;
    //   583: aload #6
    //   585: getfield h : Lvn0;
    //   588: invokevirtual setAdapter : (Landroid/widget/ListAdapter;)V
    //   591: aload #6
    //   593: getfield f : Landroidx/appcompat/view/menu/ExpandedMenuView;
    //   596: aload #6
    //   598: invokevirtual setOnItemClickListener : (Landroid/widget/AdapterView$OnItemClickListener;)V
    //   601: aload #6
    //   603: getfield f : Landroidx/appcompat/view/menu/ExpandedMenuView;
    //   606: astore_2
    //   607: aload_1
    //   608: aload_2
    //   609: putfield f : Landroid/view/View;
    //   612: aload_2
    //   613: ifnull -> 843
    //   616: aload_1
    //   617: getfield f : Landroid/view/View;
    //   620: ifnonnull -> 626
    //   623: goto -> 843
    //   626: aload_1
    //   627: getfield g : Landroid/view/View;
    //   630: ifnull -> 636
    //   633: goto -> 670
    //   636: aload_1
    //   637: getfield i : Lwn0;
    //   640: astore_2
    //   641: aload_2
    //   642: getfield h : Lvn0;
    //   645: ifnonnull -> 660
    //   648: aload_2
    //   649: new vn0
    //   652: dup
    //   653: aload_2
    //   654: invokespecial <init> : (Lwn0;)V
    //   657: putfield h : Lvn0;
    //   660: aload_2
    //   661: getfield h : Lvn0;
    //   664: invokevirtual getCount : ()I
    //   667: ifle -> 843
    //   670: aload_1
    //   671: getfield f : Landroid/view/View;
    //   674: invokevirtual getLayoutParams : ()Landroid/view/ViewGroup$LayoutParams;
    //   677: astore #6
    //   679: aload #6
    //   681: astore_2
    //   682: aload #6
    //   684: ifnonnull -> 699
    //   687: new android/view/ViewGroup$LayoutParams
    //   690: dup
    //   691: bipush #-2
    //   693: bipush #-2
    //   695: invokespecial <init> : (II)V
    //   698: astore_2
    //   699: aload_1
    //   700: getfield b : I
    //   703: istore_3
    //   704: aload_1
    //   705: getfield e : Ls6;
    //   708: iload_3
    //   709: invokevirtual setBackgroundResource : (I)V
    //   712: aload_1
    //   713: getfield f : Landroid/view/View;
    //   716: invokevirtual getParent : ()Landroid/view/ViewParent;
    //   719: astore #6
    //   721: aload #6
    //   723: instanceof android/view/ViewGroup
    //   726: ifeq -> 741
    //   729: aload #6
    //   731: checkcast android/view/ViewGroup
    //   734: aload_1
    //   735: getfield f : Landroid/view/View;
    //   738: invokevirtual removeView : (Landroid/view/View;)V
    //   741: aload_1
    //   742: getfield e : Ls6;
    //   745: aload_1
    //   746: getfield f : Landroid/view/View;
    //   749: aload_2
    //   750: invokevirtual addView : (Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    //   753: aload_1
    //   754: getfield f : Landroid/view/View;
    //   757: invokevirtual hasFocus : ()Z
    //   760: ifne -> 771
    //   763: aload_1
    //   764: getfield f : Landroid/view/View;
    //   767: invokevirtual requestFocus : ()Z
    //   770: pop
    //   771: bipush #-2
    //   773: istore_3
    //   774: aload_1
    //   775: iconst_0
    //   776: putfield l : Z
    //   779: new android/view/WindowManager$LayoutParams
    //   782: dup
    //   783: iload_3
    //   784: bipush #-2
    //   786: iconst_0
    //   787: iconst_0
    //   788: sipush #1002
    //   791: ldc_w 8519680
    //   794: bipush #-3
    //   796: invokespecial <init> : (IIIIIII)V
    //   799: astore_2
    //   800: aload_2
    //   801: aload_1
    //   802: getfield c : I
    //   805: putfield gravity : I
    //   808: aload_2
    //   809: aload_1
    //   810: getfield d : I
    //   813: putfield windowAnimations : I
    //   816: aload #7
    //   818: aload_1
    //   819: getfield e : Ls6;
    //   822: aload_2
    //   823: invokeinterface addView : (Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    //   828: aload_1
    //   829: iconst_1
    //   830: putfield m : Z
    //   833: iload #4
    //   835: ifne -> 848
    //   838: aload_0
    //   839: invokevirtual I : ()V
    //   842: return
    //   843: aload_1
    //   844: iconst_1
    //   845: putfield n : Z
    //   848: return
  }
  
  public final boolean F(t6 paramt6, int paramInt, KeyEvent paramKeyEvent) {
    // Byte code:
    //   0: aload_3
    //   1: invokevirtual isSystem : ()Z
    //   4: istore #4
    //   6: iconst_0
    //   7: istore #5
    //   9: iload #4
    //   11: ifeq -> 16
    //   14: iconst_0
    //   15: ireturn
    //   16: aload_1
    //   17: getfield k : Z
    //   20: ifne -> 36
    //   23: iload #5
    //   25: istore #4
    //   27: aload_0
    //   28: aload_1
    //   29: aload_3
    //   30: invokevirtual G : (Lt6;Landroid/view/KeyEvent;)Z
    //   33: ifeq -> 58
    //   36: aload_1
    //   37: getfield h : Lrw0;
    //   40: astore_1
    //   41: iload #5
    //   43: istore #4
    //   45: aload_1
    //   46: ifnull -> 58
    //   49: aload_1
    //   50: iload_2
    //   51: aload_3
    //   52: iconst_1
    //   53: invokevirtual performShortcut : (ILandroid/view/KeyEvent;I)Z
    //   56: istore #4
    //   58: iload #4
    //   60: ireturn
  }
  
  public final boolean G(t6 paramt6, KeyEvent paramKeyEvent) {
    // Byte code:
    //   0: aload_0
    //   1: getfield S : Z
    //   4: ifeq -> 10
    //   7: goto -> 593
    //   10: aload_1
    //   11: getfield k : Z
    //   14: istore #5
    //   16: aload_1
    //   17: getfield a : I
    //   20: istore #4
    //   22: iload #5
    //   24: ifeq -> 29
    //   27: iconst_1
    //   28: ireturn
    //   29: aload_0
    //   30: getfield O : Lt6;
    //   33: astore #6
    //   35: aload #6
    //   37: ifnull -> 53
    //   40: aload #6
    //   42: aload_1
    //   43: if_acmpeq -> 53
    //   46: aload_0
    //   47: aload #6
    //   49: iconst_0
    //   50: invokevirtual s : (Lt6;Z)V
    //   53: aload_0
    //   54: getfield n : Landroid/view/Window;
    //   57: invokevirtual getCallback : ()Landroid/view/Window$Callback;
    //   60: astore #9
    //   62: aload #9
    //   64: ifnull -> 80
    //   67: aload_1
    //   68: aload #9
    //   70: iload #4
    //   72: invokeinterface onCreatePanelView : (I)Landroid/view/View;
    //   77: putfield g : Landroid/view/View;
    //   80: iload #4
    //   82: ifeq -> 100
    //   85: iload #4
    //   87: bipush #108
    //   89: if_icmpne -> 95
    //   92: goto -> 100
    //   95: iconst_0
    //   96: istore_3
    //   97: goto -> 102
    //   100: iconst_1
    //   101: istore_3
    //   102: iload_3
    //   103: ifeq -> 134
    //   106: aload_0
    //   107: getfield s : Landroidx/appcompat/widget/ActionBarOverlayLayout;
    //   110: astore #6
    //   112: aload #6
    //   114: ifnull -> 134
    //   117: aload #6
    //   119: invokevirtual k : ()V
    //   122: aload #6
    //   124: getfield g : Lsv;
    //   127: checkcast mv1
    //   130: iconst_1
    //   131: putfield l : Z
    //   134: aload_1
    //   135: getfield g : Landroid/view/View;
    //   138: ifnonnull -> 732
    //   141: iload_3
    //   142: ifeq -> 155
    //   145: aload_0
    //   146: getfield p : Lui0;
    //   149: instanceof kv1
    //   152: ifne -> 732
    //   155: aload_1
    //   156: getfield h : Lrw0;
    //   159: astore #6
    //   161: aload #6
    //   163: ifnull -> 173
    //   166: aload_1
    //   167: getfield o : Z
    //   170: ifeq -> 600
    //   173: aload #6
    //   175: ifnonnull -> 471
    //   178: aload_0
    //   179: getfield m : Landroid/content/Context;
    //   182: astore #8
    //   184: iload #4
    //   186: ifeq -> 200
    //   189: aload #8
    //   191: astore #6
    //   193: iload #4
    //   195: bipush #108
    //   197: if_icmpne -> 385
    //   200: aload #8
    //   202: astore #6
    //   204: aload_0
    //   205: getfield s : Landroidx/appcompat/widget/ActionBarOverlayLayout;
    //   208: ifnull -> 385
    //   211: new android/util/TypedValue
    //   214: dup
    //   215: invokespecial <init> : ()V
    //   218: astore #11
    //   220: aload #8
    //   222: invokevirtual getTheme : ()Landroid/content/res/Resources$Theme;
    //   225: astore #10
    //   227: aload #10
    //   229: ldc_w 2130968587
    //   232: aload #11
    //   234: iconst_1
    //   235: invokevirtual resolveAttribute : (ILandroid/util/TypedValue;Z)Z
    //   238: pop
    //   239: aload #11
    //   241: getfield resourceId : I
    //   244: ifeq -> 290
    //   247: aload #8
    //   249: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   252: invokevirtual newTheme : ()Landroid/content/res/Resources$Theme;
    //   255: astore #6
    //   257: aload #6
    //   259: aload #10
    //   261: invokevirtual setTo : (Landroid/content/res/Resources$Theme;)V
    //   264: aload #6
    //   266: aload #11
    //   268: getfield resourceId : I
    //   271: iconst_1
    //   272: invokevirtual applyStyle : (IZ)V
    //   275: aload #6
    //   277: ldc_w 2130968588
    //   280: aload #11
    //   282: iconst_1
    //   283: invokevirtual resolveAttribute : (ILandroid/util/TypedValue;Z)Z
    //   286: pop
    //   287: goto -> 305
    //   290: aload #10
    //   292: ldc_w 2130968588
    //   295: aload #11
    //   297: iconst_1
    //   298: invokevirtual resolveAttribute : (ILandroid/util/TypedValue;Z)Z
    //   301: pop
    //   302: aconst_null
    //   303: astore #6
    //   305: aload #6
    //   307: astore #7
    //   309: aload #11
    //   311: getfield resourceId : I
    //   314: ifeq -> 354
    //   317: aload #6
    //   319: astore #7
    //   321: aload #6
    //   323: ifnonnull -> 343
    //   326: aload #8
    //   328: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   331: invokevirtual newTheme : ()Landroid/content/res/Resources$Theme;
    //   334: astore #7
    //   336: aload #7
    //   338: aload #10
    //   340: invokevirtual setTo : (Landroid/content/res/Resources$Theme;)V
    //   343: aload #7
    //   345: aload #11
    //   347: getfield resourceId : I
    //   350: iconst_1
    //   351: invokevirtual applyStyle : (IZ)V
    //   354: aload #8
    //   356: astore #6
    //   358: aload #7
    //   360: ifnull -> 385
    //   363: new bs
    //   366: dup
    //   367: aload #8
    //   369: iconst_0
    //   370: invokespecial <init> : (Landroid/content/Context;I)V
    //   373: astore #6
    //   375: aload #6
    //   377: invokevirtual getTheme : ()Landroid/content/res/Resources$Theme;
    //   380: aload #7
    //   382: invokevirtual setTo : (Landroid/content/res/Resources$Theme;)V
    //   385: new rw0
    //   388: dup
    //   389: aload #6
    //   391: invokespecial <init> : (Landroid/content/Context;)V
    //   394: astore #6
    //   396: aload #6
    //   398: aload_0
    //   399: putfield e : Lpw0;
    //   402: aload_1
    //   403: getfield h : Lrw0;
    //   406: astore #7
    //   408: aload #6
    //   410: aload #7
    //   412: if_acmpne -> 418
    //   415: goto -> 461
    //   418: aload #7
    //   420: ifnull -> 432
    //   423: aload #7
    //   425: aload_1
    //   426: getfield i : Lwn0;
    //   429: invokevirtual r : (Lhx0;)V
    //   432: aload_1
    //   433: aload #6
    //   435: putfield h : Lrw0;
    //   438: aload_1
    //   439: getfield i : Lwn0;
    //   442: astore #7
    //   444: aload #7
    //   446: ifnull -> 461
    //   449: aload #6
    //   451: aload #7
    //   453: aload #6
    //   455: getfield a : Landroid/content/Context;
    //   458: invokevirtual b : (Lhx0;Landroid/content/Context;)V
    //   461: aload_1
    //   462: getfield h : Lrw0;
    //   465: ifnonnull -> 471
    //   468: goto -> 593
    //   471: iload_3
    //   472: ifeq -> 519
    //   475: aload_0
    //   476: getfield s : Landroidx/appcompat/widget/ActionBarOverlayLayout;
    //   479: astore #6
    //   481: aload #6
    //   483: ifnull -> 519
    //   486: aload_0
    //   487: getfield t : Li6;
    //   490: ifnonnull -> 506
    //   493: aload_0
    //   494: new i6
    //   497: dup
    //   498: aload_0
    //   499: iconst_2
    //   500: invokespecial <init> : (Lu6;I)V
    //   503: putfield t : Li6;
    //   506: aload #6
    //   508: aload_1
    //   509: getfield h : Lrw0;
    //   512: aload_0
    //   513: getfield t : Li6;
    //   516: invokevirtual l : (Landroid/view/Menu;Lgx0;)V
    //   519: aload_1
    //   520: getfield h : Lrw0;
    //   523: invokevirtual w : ()V
    //   526: aload #9
    //   528: iload #4
    //   530: aload_1
    //   531: getfield h : Lrw0;
    //   534: invokeinterface onCreatePanelMenu : (ILandroid/view/Menu;)Z
    //   539: ifne -> 595
    //   542: aload_1
    //   543: getfield h : Lrw0;
    //   546: astore_2
    //   547: aload_2
    //   548: ifnonnull -> 554
    //   551: goto -> 571
    //   554: aload_2
    //   555: ifnull -> 566
    //   558: aload_2
    //   559: aload_1
    //   560: getfield i : Lwn0;
    //   563: invokevirtual r : (Lhx0;)V
    //   566: aload_1
    //   567: aconst_null
    //   568: putfield h : Lrw0;
    //   571: iload_3
    //   572: ifeq -> 593
    //   575: aload_0
    //   576: getfield s : Landroidx/appcompat/widget/ActionBarOverlayLayout;
    //   579: astore_1
    //   580: aload_1
    //   581: ifnull -> 593
    //   584: aload_1
    //   585: aconst_null
    //   586: aload_0
    //   587: getfield t : Li6;
    //   590: invokevirtual l : (Landroid/view/Menu;Lgx0;)V
    //   593: iconst_0
    //   594: ireturn
    //   595: aload_1
    //   596: iconst_0
    //   597: putfield o : Z
    //   600: aload_1
    //   601: getfield h : Lrw0;
    //   604: invokevirtual w : ()V
    //   607: aload_1
    //   608: getfield p : Landroid/os/Bundle;
    //   611: astore #6
    //   613: aload #6
    //   615: ifnull -> 632
    //   618: aload_1
    //   619: getfield h : Lrw0;
    //   622: aload #6
    //   624: invokevirtual s : (Landroid/os/Bundle;)V
    //   627: aload_1
    //   628: aconst_null
    //   629: putfield p : Landroid/os/Bundle;
    //   632: aload #9
    //   634: iconst_0
    //   635: aload_1
    //   636: getfield g : Landroid/view/View;
    //   639: aload_1
    //   640: getfield h : Lrw0;
    //   643: invokeinterface onPreparePanel : (ILandroid/view/View;Landroid/view/Menu;)Z
    //   648: ifne -> 682
    //   651: iload_3
    //   652: ifeq -> 673
    //   655: aload_0
    //   656: getfield s : Landroidx/appcompat/widget/ActionBarOverlayLayout;
    //   659: astore_2
    //   660: aload_2
    //   661: ifnull -> 673
    //   664: aload_2
    //   665: aconst_null
    //   666: aload_0
    //   667: getfield t : Li6;
    //   670: invokevirtual l : (Landroid/view/Menu;Lgx0;)V
    //   673: aload_1
    //   674: getfield h : Lrw0;
    //   677: invokevirtual v : ()V
    //   680: iconst_0
    //   681: ireturn
    //   682: aload_2
    //   683: ifnull -> 694
    //   686: aload_2
    //   687: invokevirtual getDeviceId : ()I
    //   690: istore_3
    //   691: goto -> 696
    //   694: iconst_m1
    //   695: istore_3
    //   696: iload_3
    //   697: invokestatic load : (I)Landroid/view/KeyCharacterMap;
    //   700: invokevirtual getKeyboardType : ()I
    //   703: iconst_1
    //   704: if_icmpeq -> 713
    //   707: iconst_1
    //   708: istore #5
    //   710: goto -> 716
    //   713: iconst_0
    //   714: istore #5
    //   716: aload_1
    //   717: getfield h : Lrw0;
    //   720: iload #5
    //   722: invokevirtual setQwertyMode : (Z)V
    //   725: aload_1
    //   726: getfield h : Lrw0;
    //   729: invokevirtual v : ()V
    //   732: aload_1
    //   733: iconst_1
    //   734: putfield k : Z
    //   737: aload_1
    //   738: iconst_0
    //   739: putfield l : Z
    //   742: aload_0
    //   743: aload_1
    //   744: putfield O : Lt6;
    //   747: iconst_1
    //   748: ireturn
  }
  
  public final void H() {
    if (!this.B)
      return; 
    throw new AndroidRuntimeException("Window feature must be requested before adding content");
  }
  
  public final void I() {
    if (Build.VERSION.SDK_INT >= 33) {
      OnBackInvokedDispatcher onBackInvokedDispatcher = this.h0;
      boolean bool = false;
      if (onBackInvokedDispatcher != null && ((z(0)).m || this.v != null))
        bool = true; 
      if (bool && this.i0 == null) {
        this.i0 = n6.b(this.h0, this);
        return;
      } 
      if (!bool) {
        OnBackInvokedCallback onBackInvokedCallback = this.i0;
        if (onBackInvokedCallback != null) {
          n6.c(this.h0, onBackInvokedCallback);
          this.i0 = null;
        } 
      } 
    } 
  }
  
  public final void a() {
    LayoutInflater layoutInflater = LayoutInflater.from(this.m);
    if (layoutInflater.getFactory() == null) {
      layoutInflater.setFactory2(this);
      return;
    } 
    if (!(layoutInflater.getFactory2() instanceof u6))
      Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's"); 
  }
  
  public final void b() {
    if (this.p != null) {
      A();
      if (!this.p.L())
        B(0); 
    } 
  }
  
  public final boolean c(rw0 paramrw0, MenuItem paramMenuItem) {
    // Byte code:
    //   0: aload_0
    //   1: getfield n : Landroid/view/Window;
    //   4: invokevirtual getCallback : ()Landroid/view/Window$Callback;
    //   7: astore #5
    //   9: aload #5
    //   11: ifnull -> 103
    //   14: aload_0
    //   15: getfield S : Z
    //   18: ifne -> 103
    //   21: aload_1
    //   22: invokevirtual k : ()Lrw0;
    //   25: astore #6
    //   27: aload_0
    //   28: getfield N : [Lt6;
    //   31: astore #7
    //   33: aload #7
    //   35: ifnull -> 45
    //   38: aload #7
    //   40: arraylength
    //   41: istore_3
    //   42: goto -> 47
    //   45: iconst_0
    //   46: istore_3
    //   47: iconst_0
    //   48: istore #4
    //   50: iload #4
    //   52: iload_3
    //   53: if_icmpge -> 84
    //   56: aload #7
    //   58: iload #4
    //   60: aaload
    //   61: astore_1
    //   62: aload_1
    //   63: ifnull -> 78
    //   66: aload_1
    //   67: getfield h : Lrw0;
    //   70: aload #6
    //   72: if_acmpne -> 78
    //   75: goto -> 86
    //   78: iinc #4, 1
    //   81: goto -> 50
    //   84: aconst_null
    //   85: astore_1
    //   86: aload_1
    //   87: ifnull -> 103
    //   90: aload #5
    //   92: aload_1
    //   93: getfield a : I
    //   96: aload_2
    //   97: invokeinterface onMenuItemSelected : (ILandroid/view/MenuItem;)Z
    //   102: ireturn
    //   103: iconst_0
    //   104: ireturn
  }
  
  public final void e() {
    this.Q = true;
    n(false, true);
    x();
    Object object = this.l;
    if (object instanceof Activity) {
      try {
        object = object;
        try {
          object = ws2.P((Context)object, object.getComponentName());
        } catch (android.content.pm.PackageManager.NameNotFoundException nameNotFoundException) {
          object = new IllegalArgumentException();
          super((Throwable)nameNotFoundException);
          throw object;
        } 
      } catch (IllegalArgumentException illegalArgumentException) {
        illegalArgumentException = null;
      } 
      if (illegalArgumentException != null) {
        ui0 ui01 = this.p;
        if (ui01 == null) {
          this.d0 = true;
        } else {
          ui01.Y(true);
        } 
      } 
      synchronized (g6.j) {
        g6.h(this);
        d9 d9 = g6.i;
        WeakReference weakReference = new WeakReference();
        this((T)this);
        d9.add(weakReference);
      } 
    } 
    this.T = new Configuration(this.m.getResources().getConfiguration());
    this.R = true;
  }
  
  public final void f() {
    // Byte code:
    //   0: aload_0
    //   1: getfield l : Ljava/lang/Object;
    //   4: instanceof android/app/Activity
    //   7: ifeq -> 30
    //   10: getstatic g6.j : Ljava/lang/Object;
    //   13: astore_2
    //   14: aload_2
    //   15: monitorenter
    //   16: aload_0
    //   17: invokestatic h : (Lu6;)V
    //   20: aload_2
    //   21: monitorexit
    //   22: goto -> 30
    //   25: astore_1
    //   26: aload_2
    //   27: monitorexit
    //   28: aload_1
    //   29: athrow
    //   30: aload_0
    //   31: getfield a0 : Z
    //   34: ifeq -> 52
    //   37: aload_0
    //   38: getfield n : Landroid/view/Window;
    //   41: invokevirtual getDecorView : ()Landroid/view/View;
    //   44: aload_0
    //   45: getfield c0 : Lh6;
    //   48: invokevirtual removeCallbacks : (Ljava/lang/Runnable;)Z
    //   51: pop
    //   52: aload_0
    //   53: iconst_1
    //   54: putfield S : Z
    //   57: aload_0
    //   58: getfield U : I
    //   61: bipush #-100
    //   63: if_icmpeq -> 115
    //   66: aload_0
    //   67: getfield l : Ljava/lang/Object;
    //   70: astore_1
    //   71: aload_1
    //   72: instanceof android/app/Activity
    //   75: ifeq -> 115
    //   78: aload_1
    //   79: checkcast android/app/Activity
    //   82: invokevirtual isChangingConfigurations : ()Z
    //   85: ifeq -> 115
    //   88: getstatic u6.j0 : Lzm1;
    //   91: aload_0
    //   92: getfield l : Ljava/lang/Object;
    //   95: invokevirtual getClass : ()Ljava/lang/Class;
    //   98: invokevirtual getName : ()Ljava/lang/String;
    //   101: aload_0
    //   102: getfield U : I
    //   105: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   108: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   111: pop
    //   112: goto -> 132
    //   115: getstatic u6.j0 : Lzm1;
    //   118: aload_0
    //   119: getfield l : Ljava/lang/Object;
    //   122: invokevirtual getClass : ()Ljava/lang/Class;
    //   125: invokevirtual getName : ()Ljava/lang/String;
    //   128: invokevirtual remove : (Ljava/lang/Object;)Ljava/lang/Object;
    //   131: pop
    //   132: aload_0
    //   133: getfield p : Lui0;
    //   136: astore_1
    //   137: aload_1
    //   138: ifnull -> 145
    //   141: aload_1
    //   142: invokevirtual Q : ()V
    //   145: aload_0
    //   146: getfield Y : Lp6;
    //   149: astore_1
    //   150: aload_1
    //   151: ifnull -> 158
    //   154: aload_1
    //   155: invokevirtual d : ()V
    //   158: aload_0
    //   159: getfield Z : Lp6;
    //   162: astore_1
    //   163: aload_1
    //   164: ifnull -> 171
    //   167: aload_1
    //   168: invokevirtual d : ()V
    //   171: return
    // Exception table:
    //   from	to	target	type
    //   16	22	25	finally
    //   26	28	25	finally
  }
  
  public final void g(rw0 paramrw0) {
    // Byte code:
    //   0: aload_0
    //   1: getfield s : Landroidx/appcompat/widget/ActionBarOverlayLayout;
    //   4: astore_1
    //   5: aload_1
    //   6: ifnull -> 332
    //   9: aload_1
    //   10: invokevirtual k : ()V
    //   13: aload_1
    //   14: getfield g : Lsv;
    //   17: checkcast mv1
    //   20: getfield a : Landroidx/appcompat/widget/Toolbar;
    //   23: astore_1
    //   24: aload_1
    //   25: invokevirtual getVisibility : ()I
    //   28: ifne -> 332
    //   31: aload_1
    //   32: getfield b : Landroidx/appcompat/widget/ActionMenuView;
    //   35: astore_1
    //   36: aload_1
    //   37: ifnull -> 332
    //   40: aload_1
    //   41: getfield f : Z
    //   44: ifeq -> 332
    //   47: aload_0
    //   48: getfield m : Landroid/content/Context;
    //   51: invokestatic get : (Landroid/content/Context;)Landroid/view/ViewConfiguration;
    //   54: invokevirtual hasPermanentMenuKey : ()Z
    //   57: ifeq -> 110
    //   60: aload_0
    //   61: getfield s : Landroidx/appcompat/widget/ActionBarOverlayLayout;
    //   64: astore_1
    //   65: aload_1
    //   66: invokevirtual k : ()V
    //   69: aload_1
    //   70: getfield g : Lsv;
    //   73: checkcast mv1
    //   76: getfield a : Landroidx/appcompat/widget/Toolbar;
    //   79: getfield b : Landroidx/appcompat/widget/ActionMenuView;
    //   82: astore_1
    //   83: aload_1
    //   84: ifnull -> 332
    //   87: aload_1
    //   88: getfield g : Lu1;
    //   91: astore_1
    //   92: aload_1
    //   93: ifnull -> 332
    //   96: aload_1
    //   97: getfield w : Lvi2;
    //   100: ifnonnull -> 110
    //   103: aload_1
    //   104: invokevirtual h : ()Z
    //   107: ifeq -> 332
    //   110: aload_0
    //   111: getfield n : Landroid/view/Window;
    //   114: invokevirtual getCallback : ()Landroid/view/Window$Callback;
    //   117: astore_1
    //   118: aload_0
    //   119: getfield s : Landroidx/appcompat/widget/ActionBarOverlayLayout;
    //   122: astore_2
    //   123: aload_2
    //   124: invokevirtual k : ()V
    //   127: aload_2
    //   128: getfield g : Lsv;
    //   131: checkcast mv1
    //   134: getfield a : Landroidx/appcompat/widget/Toolbar;
    //   137: invokevirtual o : ()Z
    //   140: ifeq -> 208
    //   143: aload_0
    //   144: getfield s : Landroidx/appcompat/widget/ActionBarOverlayLayout;
    //   147: astore_2
    //   148: aload_2
    //   149: invokevirtual k : ()V
    //   152: aload_2
    //   153: getfield g : Lsv;
    //   156: checkcast mv1
    //   159: getfield a : Landroidx/appcompat/widget/Toolbar;
    //   162: getfield b : Landroidx/appcompat/widget/ActionMenuView;
    //   165: astore_2
    //   166: aload_2
    //   167: ifnull -> 184
    //   170: aload_2
    //   171: getfield g : Lu1;
    //   174: astore_2
    //   175: aload_2
    //   176: ifnull -> 184
    //   179: aload_2
    //   180: invokevirtual d : ()Z
    //   183: pop
    //   184: aload_0
    //   185: getfield S : Z
    //   188: ifne -> 331
    //   191: aload_1
    //   192: bipush #108
    //   194: aload_0
    //   195: iconst_0
    //   196: invokevirtual z : (I)Lt6;
    //   199: getfield h : Lrw0;
    //   202: invokeinterface onPanelClosed : (ILandroid/view/Menu;)V
    //   207: return
    //   208: aload_1
    //   209: ifnull -> 331
    //   212: aload_0
    //   213: getfield S : Z
    //   216: ifne -> 331
    //   219: aload_0
    //   220: getfield a0 : Z
    //   223: ifeq -> 258
    //   226: iconst_1
    //   227: aload_0
    //   228: getfield b0 : I
    //   231: iand
    //   232: ifeq -> 258
    //   235: aload_0
    //   236: getfield n : Landroid/view/Window;
    //   239: invokevirtual getDecorView : ()Landroid/view/View;
    //   242: astore_2
    //   243: aload_0
    //   244: getfield c0 : Lh6;
    //   247: astore_3
    //   248: aload_2
    //   249: aload_3
    //   250: invokevirtual removeCallbacks : (Ljava/lang/Runnable;)Z
    //   253: pop
    //   254: aload_3
    //   255: invokevirtual run : ()V
    //   258: aload_0
    //   259: iconst_0
    //   260: invokevirtual z : (I)Lt6;
    //   263: astore_3
    //   264: aload_3
    //   265: getfield h : Lrw0;
    //   268: astore_2
    //   269: aload_2
    //   270: ifnull -> 331
    //   273: aload_3
    //   274: getfield o : Z
    //   277: ifne -> 331
    //   280: aload_1
    //   281: iconst_0
    //   282: aload_3
    //   283: getfield g : Landroid/view/View;
    //   286: aload_2
    //   287: invokeinterface onPreparePanel : (ILandroid/view/View;Landroid/view/Menu;)Z
    //   292: ifeq -> 331
    //   295: aload_1
    //   296: bipush #108
    //   298: aload_3
    //   299: getfield h : Lrw0;
    //   302: invokeinterface onMenuOpened : (ILandroid/view/Menu;)Z
    //   307: pop
    //   308: aload_0
    //   309: getfield s : Landroidx/appcompat/widget/ActionBarOverlayLayout;
    //   312: astore_1
    //   313: aload_1
    //   314: invokevirtual k : ()V
    //   317: aload_1
    //   318: getfield g : Lsv;
    //   321: checkcast mv1
    //   324: getfield a : Landroidx/appcompat/widget/Toolbar;
    //   327: invokevirtual u : ()Z
    //   330: pop
    //   331: return
    //   332: aload_0
    //   333: iconst_0
    //   334: invokevirtual z : (I)Lt6;
    //   337: astore_1
    //   338: aload_1
    //   339: iconst_1
    //   340: putfield n : Z
    //   343: aload_0
    //   344: aload_1
    //   345: iconst_0
    //   346: invokevirtual s : (Lt6;Z)V
    //   349: aload_0
    //   350: aload_1
    //   351: aconst_null
    //   352: invokevirtual E : (Lt6;Landroid/view/KeyEvent;)V
    //   355: return
  }
  
  public final boolean i(int paramInt) {
    int i;
    if (paramInt == 8) {
      Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
      i = 108;
    } else {
      i = paramInt;
      if (paramInt == 9) {
        Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
        i = 109;
      } 
    } 
    if (this.L && i == 108)
      return false; 
    if (this.H && i == 1)
      this.H = false; 
    if (i != 1) {
      if (i != 2) {
        if (i != 5) {
          if (i != 10) {
            if (i != 108) {
              if (i != 109)
                return this.n.requestFeature(i); 
              H();
              this.I = true;
              return true;
            } 
            H();
            this.H = true;
            return true;
          } 
          H();
          this.J = true;
          return true;
        } 
        H();
        this.G = true;
        return true;
      } 
      H();
      this.F = true;
      return true;
    } 
    H();
    this.L = true;
    return true;
  }
  
  public final void j(int paramInt) {
    w();
    ViewGroup viewGroup = (ViewGroup)this.C.findViewById(16908290);
    viewGroup.removeAllViews();
    LayoutInflater.from(this.m).inflate(paramInt, viewGroup);
    this.o.a(this.n.getCallback());
  }
  
  public final void k(View paramView) {
    w();
    ViewGroup viewGroup = (ViewGroup)this.C.findViewById(16908290);
    viewGroup.removeAllViews();
    viewGroup.addView(paramView);
    this.o.a(this.n.getCallback());
  }
  
  public final void l(View paramView, ViewGroup.LayoutParams paramLayoutParams) {
    w();
    ViewGroup viewGroup = (ViewGroup)this.C.findViewById(16908290);
    viewGroup.removeAllViews();
    viewGroup.addView(paramView, paramLayoutParams);
    this.o.a(this.n.getCallback());
  }
  
  public final void m(CharSequence paramCharSequence) {
    this.r = paramCharSequence;
    ActionBarOverlayLayout actionBarOverlayLayout = this.s;
    if (actionBarOverlayLayout != null) {
      actionBarOverlayLayout.setWindowTitle(paramCharSequence);
      return;
    } 
    ui0 ui01 = this.p;
    if (ui01 != null) {
      ui01.h0(paramCharSequence);
      return;
    } 
    TextView textView = this.D;
    if (textView != null)
      textView.setText(paramCharSequence); 
  }
  
  public final boolean n(boolean paramBoolean1, boolean paramBoolean2) {
    // Byte code:
    //   0: aload_0
    //   1: getfield S : Z
    //   4: istore #9
    //   6: iconst_0
    //   7: istore #7
    //   9: iload #9
    //   11: ifeq -> 16
    //   14: iconst_0
    //   15: ireturn
    //   16: aload_0
    //   17: getfield U : I
    //   20: istore #4
    //   22: iload #4
    //   24: bipush #-100
    //   26: if_icmpeq -> 32
    //   29: goto -> 37
    //   32: getstatic g6.c : I
    //   35: istore #4
    //   37: aload_0
    //   38: getfield m : Landroid/content/Context;
    //   41: astore #14
    //   43: aload_0
    //   44: aload #14
    //   46: iload #4
    //   48: invokevirtual C : (Landroid/content/Context;I)I
    //   51: istore_3
    //   52: getstatic android/os/Build$VERSION.SDK_INT : I
    //   55: istore #5
    //   57: aconst_null
    //   58: astore #12
    //   60: iload #5
    //   62: bipush #33
    //   64: if_icmpge -> 77
    //   67: aload #14
    //   69: invokestatic p : (Landroid/content/Context;)Lvo0;
    //   72: astore #10
    //   74: goto -> 80
    //   77: aconst_null
    //   78: astore #10
    //   80: aload #10
    //   82: astore #11
    //   84: iload_2
    //   85: ifne -> 110
    //   88: aload #10
    //   90: astore #11
    //   92: aload #10
    //   94: ifnull -> 110
    //   97: aload #14
    //   99: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   102: invokevirtual getConfiguration : ()Landroid/content/res/Configuration;
    //   105: invokestatic b : (Landroid/content/res/Configuration;)Lvo0;
    //   108: astore #11
    //   110: aload #14
    //   112: iload_3
    //   113: aload #11
    //   115: aconst_null
    //   116: iconst_0
    //   117: invokestatic t : (Landroid/content/Context;ILvo0;Landroid/content/res/Configuration;Z)Landroid/content/res/Configuration;
    //   120: astore #16
    //   122: aload_0
    //   123: getfield X : Z
    //   126: istore #9
    //   128: iconst_1
    //   129: istore_2
    //   130: aload_0
    //   131: getfield l : Ljava/lang/Object;
    //   134: astore #15
    //   136: iload #9
    //   138: ifne -> 248
    //   141: aload #15
    //   143: instanceof android/app/Activity
    //   146: ifeq -> 248
    //   149: aload #14
    //   151: invokevirtual getPackageManager : ()Landroid/content/pm/PackageManager;
    //   154: astore #10
    //   156: aload #10
    //   158: ifnonnull -> 167
    //   161: iconst_0
    //   162: istore #5
    //   164: goto -> 259
    //   167: iload #5
    //   169: bipush #29
    //   171: if_icmplt -> 181
    //   174: ldc_w 269221888
    //   177: istore_3
    //   178: goto -> 185
    //   181: ldc_w 786432
    //   184: istore_3
    //   185: new android/content/ComponentName
    //   188: astore #13
    //   190: aload #13
    //   192: aload #14
    //   194: aload #15
    //   196: invokevirtual getClass : ()Ljava/lang/Class;
    //   199: invokespecial <init> : (Landroid/content/Context;Ljava/lang/Class;)V
    //   202: aload #10
    //   204: aload #13
    //   206: iload_3
    //   207: invokevirtual getActivityInfo : (Landroid/content/ComponentName;I)Landroid/content/pm/ActivityInfo;
    //   210: astore #10
    //   212: aload #10
    //   214: ifnull -> 248
    //   217: aload_0
    //   218: aload #10
    //   220: getfield configChanges : I
    //   223: putfield W : I
    //   226: goto -> 248
    //   229: astore #10
    //   231: ldc_w 'AppCompatDelegate'
    //   234: ldc_w 'Exception while getting ActivityInfo'
    //   237: aload #10
    //   239: invokestatic d : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   242: pop
    //   243: aload_0
    //   244: iconst_0
    //   245: putfield W : I
    //   248: aload_0
    //   249: iconst_1
    //   250: putfield X : Z
    //   253: aload_0
    //   254: getfield W : I
    //   257: istore #5
    //   259: aload_0
    //   260: getfield T : Landroid/content/res/Configuration;
    //   263: astore #13
    //   265: aload #13
    //   267: astore #10
    //   269: aload #13
    //   271: ifnonnull -> 284
    //   274: aload #14
    //   276: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   279: invokevirtual getConfiguration : ()Landroid/content/res/Configuration;
    //   282: astore #10
    //   284: aload #10
    //   286: getfield uiMode : I
    //   289: istore_3
    //   290: aload #16
    //   292: getfield uiMode : I
    //   295: bipush #48
    //   297: iand
    //   298: istore #8
    //   300: aload #10
    //   302: invokestatic b : (Landroid/content/res/Configuration;)Lvo0;
    //   305: astore #13
    //   307: aload #11
    //   309: ifnonnull -> 318
    //   312: aconst_null
    //   313: astore #10
    //   315: goto -> 325
    //   318: aload #16
    //   320: invokestatic b : (Landroid/content/res/Configuration;)Lvo0;
    //   323: astore #10
    //   325: iload_3
    //   326: bipush #48
    //   328: iand
    //   329: iload #8
    //   331: if_icmpeq -> 341
    //   334: sipush #512
    //   337: istore_3
    //   338: goto -> 343
    //   341: iconst_0
    //   342: istore_3
    //   343: iload_3
    //   344: istore #6
    //   346: aload #10
    //   348: ifnull -> 371
    //   351: iload_3
    //   352: istore #6
    //   354: aload #13
    //   356: aload #10
    //   358: invokevirtual equals : (Ljava/lang/Object;)Z
    //   361: ifne -> 371
    //   364: iload_3
    //   365: sipush #8196
    //   368: ior
    //   369: istore #6
    //   371: iload #5
    //   373: iconst_m1
    //   374: ixor
    //   375: iload #6
    //   377: iand
    //   378: ifeq -> 508
    //   381: iload_1
    //   382: ifeq -> 508
    //   385: aload_0
    //   386: getfield Q : Z
    //   389: ifeq -> 508
    //   392: getstatic u6.l0 : Z
    //   395: ifne -> 405
    //   398: aload_0
    //   399: getfield R : Z
    //   402: ifeq -> 508
    //   405: aload #15
    //   407: instanceof android/app/Activity
    //   410: ifeq -> 508
    //   413: aload #15
    //   415: checkcast android/app/Activity
    //   418: astore #11
    //   420: aload #11
    //   422: invokevirtual isChild : ()Z
    //   425: ifne -> 508
    //   428: getstatic android/os/Build$VERSION.SDK_INT : I
    //   431: istore_3
    //   432: iload_3
    //   433: bipush #31
    //   435: if_icmplt -> 463
    //   438: iload #6
    //   440: sipush #8192
    //   443: iand
    //   444: ifeq -> 463
    //   447: aload #11
    //   449: invokevirtual getWindow : ()Landroid/view/Window;
    //   452: invokevirtual getDecorView : ()Landroid/view/View;
    //   455: aload #16
    //   457: invokevirtual getLayoutDirection : ()I
    //   460: invokevirtual setLayoutDirection : (I)V
    //   463: iload_3
    //   464: bipush #28
    //   466: if_icmplt -> 477
    //   469: aload #11
    //   471: invokevirtual recreate : ()V
    //   474: goto -> 503
    //   477: new android/os/Handler
    //   480: dup
    //   481: aload #11
    //   483: invokevirtual getMainLooper : ()Landroid/os/Looper;
    //   486: invokespecial <init> : (Landroid/os/Looper;)V
    //   489: new a2
    //   492: dup
    //   493: aload #11
    //   495: iconst_0
    //   496: invokespecial <init> : (Landroid/app/Activity;I)V
    //   499: invokevirtual post : (Ljava/lang/Runnable;)Z
    //   502: pop
    //   503: iconst_1
    //   504: istore_1
    //   505: goto -> 510
    //   508: iconst_0
    //   509: istore_1
    //   510: iload_1
    //   511: ifne -> 1093
    //   514: iload #6
    //   516: ifeq -> 1093
    //   519: iload #7
    //   521: istore_3
    //   522: iload #6
    //   524: iload #5
    //   526: iand
    //   527: iload #6
    //   529: if_icmpne -> 534
    //   532: iconst_1
    //   533: istore_3
    //   534: aload #14
    //   536: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   539: astore #11
    //   541: new android/content/res/Configuration
    //   544: dup
    //   545: aload #11
    //   547: invokevirtual getConfiguration : ()Landroid/content/res/Configuration;
    //   550: invokespecial <init> : (Landroid/content/res/Configuration;)V
    //   553: astore #13
    //   555: aload #13
    //   557: aload #11
    //   559: invokevirtual getConfiguration : ()Landroid/content/res/Configuration;
    //   562: getfield uiMode : I
    //   565: bipush #-49
    //   567: iand
    //   568: iload #8
    //   570: ior
    //   571: putfield uiMode : I
    //   574: aload #10
    //   576: ifnull -> 586
    //   579: aload #13
    //   581: aload #10
    //   583: invokestatic d : (Landroid/content/res/Configuration;Lvo0;)V
    //   586: aload #11
    //   588: aload #13
    //   590: aconst_null
    //   591: invokevirtual updateConfiguration : (Landroid/content/res/Configuration;Landroid/util/DisplayMetrics;)V
    //   594: getstatic android/os/Build$VERSION.SDK_INT : I
    //   597: istore #5
    //   599: iload #5
    //   601: bipush #26
    //   603: if_icmpge -> 962
    //   606: iload #5
    //   608: bipush #28
    //   610: if_icmplt -> 616
    //   613: goto -> 962
    //   616: getstatic z51.K : Z
    //   619: ifne -> 664
    //   622: ldc android/content/res/Resources
    //   624: ldc_w 'mResourcesImpl'
    //   627: invokevirtual getDeclaredField : (Ljava/lang/String;)Ljava/lang/reflect/Field;
    //   630: astore #16
    //   632: aload #16
    //   634: putstatic z51.J : Ljava/lang/reflect/Field;
    //   637: aload #16
    //   639: iconst_1
    //   640: invokevirtual setAccessible : (Z)V
    //   643: goto -> 660
    //   646: astore #16
    //   648: ldc_w 'ResourcesFlusher'
    //   651: ldc_w 'Could not retrieve Resources#mResourcesImpl field'
    //   654: aload #16
    //   656: invokestatic e : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   659: pop
    //   660: iconst_1
    //   661: putstatic z51.K : Z
    //   664: getstatic z51.J : Ljava/lang/reflect/Field;
    //   667: astore #16
    //   669: aload #16
    //   671: ifnonnull -> 677
    //   674: goto -> 962
    //   677: aload #16
    //   679: aload #11
    //   681: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   684: astore #11
    //   686: goto -> 706
    //   689: astore #11
    //   691: ldc_w 'ResourcesFlusher'
    //   694: getstatic in/krosbits/utils/SgV/YbNJ.yUyk : Ljava/lang/String;
    //   697: aload #11
    //   699: invokestatic e : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   702: pop
    //   703: aconst_null
    //   704: astore #11
    //   706: aload #11
    //   708: ifnonnull -> 714
    //   711: goto -> 962
    //   714: getstatic z51.E : Z
    //   717: ifne -> 765
    //   720: aload #11
    //   722: invokevirtual getClass : ()Ljava/lang/Class;
    //   725: ldc_w 'mDrawableCache'
    //   728: invokevirtual getDeclaredField : (Ljava/lang/String;)Ljava/lang/reflect/Field;
    //   731: astore #16
    //   733: aload #16
    //   735: putstatic z51.D : Ljava/lang/reflect/Field;
    //   738: aload #16
    //   740: iconst_1
    //   741: invokevirtual setAccessible : (Z)V
    //   744: goto -> 761
    //   747: astore #16
    //   749: ldc_w 'ResourcesFlusher'
    //   752: ldc_w 'Could not retrieve ResourcesImpl#mDrawableCache field'
    //   755: aload #16
    //   757: invokestatic e : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   760: pop
    //   761: iconst_1
    //   762: putstatic z51.E : Z
    //   765: getstatic z51.D : Ljava/lang/reflect/Field;
    //   768: astore #16
    //   770: aload #16
    //   772: ifnull -> 801
    //   775: aload #16
    //   777: aload #11
    //   779: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   782: astore #11
    //   784: goto -> 804
    //   787: astore #11
    //   789: ldc_w 'ResourcesFlusher'
    //   792: ldc_w 'Could not retrieve value from ResourcesImpl#mDrawableCache'
    //   795: aload #11
    //   797: invokestatic e : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   800: pop
    //   801: aconst_null
    //   802: astore #11
    //   804: aload #11
    //   806: ifnull -> 962
    //   809: getstatic z51.G : Z
    //   812: ifne -> 845
    //   815: ldc_w 'android.content.res.ThemedResourceCache'
    //   818: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   821: putstatic z51.F : Ljava/lang/Class;
    //   824: goto -> 841
    //   827: astore #16
    //   829: ldc_w 'ResourcesFlusher'
    //   832: ldc_w 'Could not find ThemedResourceCache class'
    //   835: aload #16
    //   837: invokestatic e : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   840: pop
    //   841: iconst_1
    //   842: putstatic z51.G : Z
    //   845: getstatic z51.F : Ljava/lang/Class;
    //   848: astore #16
    //   850: aload #16
    //   852: ifnonnull -> 858
    //   855: goto -> 962
    //   858: getstatic z51.I : Z
    //   861: ifne -> 906
    //   864: aload #16
    //   866: ldc_w 'mUnthemedEntries'
    //   869: invokevirtual getDeclaredField : (Ljava/lang/String;)Ljava/lang/reflect/Field;
    //   872: astore #16
    //   874: aload #16
    //   876: putstatic z51.H : Ljava/lang/reflect/Field;
    //   879: aload #16
    //   881: iconst_1
    //   882: invokevirtual setAccessible : (Z)V
    //   885: goto -> 902
    //   888: astore #16
    //   890: ldc_w 'ResourcesFlusher'
    //   893: ldc_w 'Could not retrieve ThemedResourceCache#mUnthemedEntries field'
    //   896: aload #16
    //   898: invokestatic e : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   901: pop
    //   902: iconst_1
    //   903: putstatic z51.I : Z
    //   906: getstatic z51.H : Ljava/lang/reflect/Field;
    //   909: astore #16
    //   911: aload #16
    //   913: ifnonnull -> 919
    //   916: goto -> 962
    //   919: aload #16
    //   921: aload #11
    //   923: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   926: checkcast android/util/LongSparseArray
    //   929: astore #11
    //   931: goto -> 952
    //   934: astore #11
    //   936: ldc_w 'ResourcesFlusher'
    //   939: ldc_w 'Could not retrieve value from ThemedResourceCache#mUnthemedEntries'
    //   942: aload #11
    //   944: invokestatic e : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   947: pop
    //   948: aload #12
    //   950: astore #11
    //   952: aload #11
    //   954: ifnull -> 962
    //   957: aload #11
    //   959: invokevirtual clear : ()V
    //   962: aload_0
    //   963: getfield V : I
    //   966: istore #5
    //   968: iload #5
    //   970: ifeq -> 993
    //   973: aload #14
    //   975: iload #5
    //   977: invokevirtual setTheme : (I)V
    //   980: aload #14
    //   982: invokevirtual getTheme : ()Landroid/content/res/Resources$Theme;
    //   985: aload_0
    //   986: getfield V : I
    //   989: iconst_1
    //   990: invokevirtual applyStyle : (IZ)V
    //   993: iload_2
    //   994: istore_1
    //   995: iload_3
    //   996: ifeq -> 1093
    //   999: iload_2
    //   1000: istore_1
    //   1001: aload #15
    //   1003: instanceof android/app/Activity
    //   1006: ifeq -> 1093
    //   1009: aload #15
    //   1011: checkcast android/app/Activity
    //   1014: astore #11
    //   1016: aload #11
    //   1018: instanceof um0
    //   1021: ifeq -> 1063
    //   1024: iload_2
    //   1025: istore_1
    //   1026: aload #11
    //   1028: checkcast um0
    //   1031: invokeinterface N : ()Lwm0;
    //   1036: getfield i : Ljava/lang/Object;
    //   1039: checkcast pm0
    //   1042: getstatic pm0.e : Lpm0;
    //   1045: invokevirtual compareTo : (Ljava/lang/Enum;)I
    //   1048: iflt -> 1093
    //   1051: aload #11
    //   1053: aload #13
    //   1055: invokevirtual onConfigurationChanged : (Landroid/content/res/Configuration;)V
    //   1058: iload_2
    //   1059: istore_1
    //   1060: goto -> 1093
    //   1063: iload_2
    //   1064: istore_1
    //   1065: aload_0
    //   1066: getfield R : Z
    //   1069: ifeq -> 1093
    //   1072: iload_2
    //   1073: istore_1
    //   1074: aload_0
    //   1075: getfield S : Z
    //   1078: ifne -> 1093
    //   1081: aload #11
    //   1083: aload #13
    //   1085: invokevirtual onConfigurationChanged : (Landroid/content/res/Configuration;)V
    //   1088: iload_2
    //   1089: istore_1
    //   1090: goto -> 1093
    //   1093: aload #10
    //   1095: ifnull -> 1112
    //   1098: aload #14
    //   1100: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   1103: invokevirtual getConfiguration : ()Landroid/content/res/Configuration;
    //   1106: invokestatic b : (Landroid/content/res/Configuration;)Lvo0;
    //   1109: invokestatic c : (Lvo0;)V
    //   1112: iload #4
    //   1114: ifne -> 1129
    //   1117: aload_0
    //   1118: aload #14
    //   1120: invokevirtual y : (Landroid/content/Context;)Lr6;
    //   1123: invokevirtual l : ()V
    //   1126: goto -> 1145
    //   1129: aload_0
    //   1130: getfield Y : Lp6;
    //   1133: astore #10
    //   1135: aload #10
    //   1137: ifnull -> 1145
    //   1140: aload #10
    //   1142: invokevirtual d : ()V
    //   1145: aload_0
    //   1146: getfield Z : Lp6;
    //   1149: astore #10
    //   1151: iload #4
    //   1153: iconst_3
    //   1154: if_icmpne -> 1186
    //   1157: aload #10
    //   1159: ifnonnull -> 1176
    //   1162: aload_0
    //   1163: new p6
    //   1166: dup
    //   1167: aload_0
    //   1168: aload #14
    //   1170: invokespecial <init> : (Lu6;Landroid/content/Context;)V
    //   1173: putfield Z : Lp6;
    //   1176: aload_0
    //   1177: getfield Z : Lp6;
    //   1180: invokevirtual l : ()V
    //   1183: goto -> 1196
    //   1186: aload #10
    //   1188: ifnull -> 1196
    //   1191: aload #10
    //   1193: invokevirtual d : ()V
    //   1196: iload_1
    //   1197: ireturn
    // Exception table:
    //   from	to	target	type
    //   185	212	229	android/content/pm/PackageManager$NameNotFoundException
    //   217	226	229	android/content/pm/PackageManager$NameNotFoundException
    //   622	643	646	java/lang/NoSuchFieldException
    //   677	686	689	java/lang/IllegalAccessException
    //   720	744	747	java/lang/NoSuchFieldException
    //   775	784	787	java/lang/IllegalAccessException
    //   815	824	827	java/lang/ClassNotFoundException
    //   864	885	888	java/lang/NoSuchFieldException
    //   919	931	934	java/lang/IllegalAccessException
  }
  
  public final void o(Window paramWindow) {
    // Byte code:
    //   0: aload_0
    //   1: getfield n : Landroid/view/Window;
    //   4: ifnonnull -> 224
    //   7: aload_1
    //   8: invokevirtual getCallback : ()Landroid/view/Window$Callback;
    //   11: astore_3
    //   12: aload_3
    //   13: instanceof o6
    //   16: ifne -> 217
    //   19: new o6
    //   22: dup
    //   23: aload_0
    //   24: aload_3
    //   25: invokespecial <init> : (Lu6;Landroid/view/Window$Callback;)V
    //   28: astore_3
    //   29: aload_0
    //   30: aload_3
    //   31: putfield o : Lo6;
    //   34: aload_1
    //   35: aload_3
    //   36: invokevirtual setCallback : (Landroid/view/Window$Callback;)V
    //   39: aload_0
    //   40: getfield m : Landroid/content/Context;
    //   43: astore_3
    //   44: aload_3
    //   45: aconst_null
    //   46: getstatic u6.k0 : [I
    //   49: invokevirtual obtainStyledAttributes : (Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;
    //   52: astore #4
    //   54: aload #4
    //   56: iconst_0
    //   57: invokevirtual hasValue : (I)Z
    //   60: ifeq -> 107
    //   63: aload #4
    //   65: iconst_0
    //   66: iconst_0
    //   67: invokevirtual getResourceId : (II)I
    //   70: istore_2
    //   71: iload_2
    //   72: ifeq -> 107
    //   75: invokestatic a : ()Ly6;
    //   78: astore #5
    //   80: aload #5
    //   82: monitorenter
    //   83: aload #5
    //   85: getfield a : Lig1;
    //   88: aload_3
    //   89: iload_2
    //   90: iconst_1
    //   91: invokevirtual e : (Landroid/content/Context;IZ)Landroid/graphics/drawable/Drawable;
    //   94: astore_3
    //   95: aload #5
    //   97: monitorexit
    //   98: goto -> 109
    //   101: astore_1
    //   102: aload #5
    //   104: monitorexit
    //   105: aload_1
    //   106: athrow
    //   107: aconst_null
    //   108: astore_3
    //   109: aload_3
    //   110: ifnull -> 118
    //   113: aload_1
    //   114: aload_3
    //   115: invokevirtual setBackgroundDrawable : (Landroid/graphics/drawable/Drawable;)V
    //   118: aload #4
    //   120: invokevirtual recycle : ()V
    //   123: aload_0
    //   124: aload_1
    //   125: putfield n : Landroid/view/Window;
    //   128: getstatic android/os/Build$VERSION.SDK_INT : I
    //   131: bipush #33
    //   133: if_icmplt -> 216
    //   136: aload_0
    //   137: getfield h0 : Landroid/window/OnBackInvokedDispatcher;
    //   140: astore #4
    //   142: aload #4
    //   144: ifnonnull -> 216
    //   147: aload_0
    //   148: getfield l : Ljava/lang/Object;
    //   151: astore_1
    //   152: aload #4
    //   154: ifnull -> 177
    //   157: aload_0
    //   158: getfield i0 : Landroid/window/OnBackInvokedCallback;
    //   161: astore_3
    //   162: aload_3
    //   163: ifnull -> 177
    //   166: aload #4
    //   168: aload_3
    //   169: invokestatic c : (Ljava/lang/Object;Ljava/lang/Object;)V
    //   172: aload_0
    //   173: aconst_null
    //   174: putfield i0 : Landroid/window/OnBackInvokedCallback;
    //   177: aload_1
    //   178: instanceof android/app/Activity
    //   181: ifeq -> 207
    //   184: aload_1
    //   185: checkcast android/app/Activity
    //   188: astore_1
    //   189: aload_1
    //   190: invokevirtual getWindow : ()Landroid/view/Window;
    //   193: ifnull -> 207
    //   196: aload_0
    //   197: aload_1
    //   198: invokestatic a : (Landroid/app/Activity;)Landroid/window/OnBackInvokedDispatcher;
    //   201: putfield h0 : Landroid/window/OnBackInvokedDispatcher;
    //   204: goto -> 212
    //   207: aload_0
    //   208: aconst_null
    //   209: putfield h0 : Landroid/window/OnBackInvokedDispatcher;
    //   212: aload_0
    //   213: invokevirtual I : ()V
    //   216: return
    //   217: ldc_w 'AppCompat has already installed itself into the Window'
    //   220: invokestatic f : (Ljava/lang/String;)V
    //   223: return
    //   224: ldc_w 'AppCompat has already installed itself into the Window'
    //   227: invokestatic f : (Ljava/lang/String;)V
    //   230: return
    // Exception table:
    //   from	to	target	type
    //   83	95	101	finally
    //   102	105	101	finally
  }
  
  public final View onCreateView(View paramView, String paramString, Context paramContext, AttributeSet paramAttributeSet) {
    // Byte code:
    //   0: aload_0
    //   1: getfield g0 : Lm8;
    //   4: astore_1
    //   5: aconst_null
    //   6: astore #10
    //   8: aload_1
    //   9: ifnonnull -> 143
    //   12: getstatic nc1.j : [I
    //   15: astore_1
    //   16: aload_0
    //   17: getfield m : Landroid/content/Context;
    //   20: astore #8
    //   22: aload #8
    //   24: aload_1
    //   25: invokevirtual obtainStyledAttributes : ([I)Landroid/content/res/TypedArray;
    //   28: astore #9
    //   30: aload #9
    //   32: bipush #116
    //   34: invokevirtual getString : (I)Ljava/lang/String;
    //   37: astore_1
    //   38: aload #9
    //   40: invokevirtual recycle : ()V
    //   43: aload_1
    //   44: ifnonnull -> 61
    //   47: aload_0
    //   48: new m8
    //   51: dup
    //   52: invokespecial <init> : ()V
    //   55: putfield g0 : Lm8;
    //   58: goto -> 143
    //   61: aload_0
    //   62: aload #8
    //   64: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   67: aload_1
    //   68: invokevirtual loadClass : (Ljava/lang/String;)Ljava/lang/Class;
    //   71: aconst_null
    //   72: invokevirtual getDeclaredConstructor : ([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
    //   75: aconst_null
    //   76: invokevirtual newInstance : ([Ljava/lang/Object;)Ljava/lang/Object;
    //   79: checkcast m8
    //   82: putfield g0 : Lm8;
    //   85: goto -> 143
    //   88: astore #9
    //   90: new java/lang/StringBuilder
    //   93: dup
    //   94: ldc_w 'Failed to instantiate custom view inflater '
    //   97: invokespecial <init> : (Ljava/lang/String;)V
    //   100: astore #8
    //   102: aload #8
    //   104: aload_1
    //   105: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   108: pop
    //   109: aload #8
    //   111: ldc_w '. Falling back to default.'
    //   114: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   117: pop
    //   118: ldc_w 'AppCompatDelegate'
    //   121: aload #8
    //   123: invokevirtual toString : ()Ljava/lang/String;
    //   126: aload #9
    //   128: invokestatic i : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   131: pop
    //   132: aload_0
    //   133: new m8
    //   136: dup
    //   137: invokespecial <init> : ()V
    //   140: putfield g0 : Lm8;
    //   143: aload_0
    //   144: getfield g0 : Lm8;
    //   147: astore #11
    //   149: getstatic x12.a : I
    //   152: istore #5
    //   154: aload #11
    //   156: invokevirtual getClass : ()Ljava/lang/Class;
    //   159: pop
    //   160: aload_3
    //   161: aload #4
    //   163: getstatic nc1.z : [I
    //   166: iconst_0
    //   167: iconst_0
    //   168: invokevirtual obtainStyledAttributes : (Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;
    //   171: astore_1
    //   172: iconst_4
    //   173: istore #5
    //   175: aload_1
    //   176: iconst_4
    //   177: iconst_0
    //   178: invokevirtual getResourceId : (II)I
    //   181: istore #6
    //   183: iload #6
    //   185: ifeq -> 198
    //   188: ldc_w 'AppCompatViewInflater'
    //   191: ldc_w 'app:theme is now deprecated. Please move to using android:theme instead.'
    //   194: invokestatic i : (Ljava/lang/String;Ljava/lang/String;)I
    //   197: pop
    //   198: aload_1
    //   199: invokevirtual recycle : ()V
    //   202: iload #6
    //   204: ifeq -> 241
    //   207: aload_3
    //   208: instanceof bs
    //   211: ifeq -> 226
    //   214: aload_3
    //   215: checkcast bs
    //   218: getfield a : I
    //   221: iload #6
    //   223: if_icmpeq -> 241
    //   226: new bs
    //   229: dup
    //   230: aload_3
    //   231: iload #6
    //   233: invokespecial <init> : (Landroid/content/Context;I)V
    //   236: astore #8
    //   238: goto -> 244
    //   241: aload_3
    //   242: astore #8
    //   244: aload_2
    //   245: invokevirtual getClass : ()Ljava/lang/Class;
    //   248: pop
    //   249: aload_2
    //   250: invokevirtual hashCode : ()I
    //   253: lookupswitch default -> 376, -1946472170 -> 631, -1455429095 -> 612, -1346021293 -> 593, -938935918 -> 574, -937446323 -> 561, -658531749 -> 542, -339785223 -> 522, 776382189 -> 502, 799298502 -> 482, 1125864064 -> 462, 1413872058 -> 442, 1601505219 -> 422, 1666676343 -> 402, 2001146706 -> 382
    //   376: iconst_m1
    //   377: istore #5
    //   379: goto -> 647
    //   382: aload_2
    //   383: ldc_w 'Button'
    //   386: invokevirtual equals : (Ljava/lang/Object;)Z
    //   389: ifne -> 395
    //   392: goto -> 376
    //   395: bipush #13
    //   397: istore #5
    //   399: goto -> 647
    //   402: aload_2
    //   403: ldc_w 'EditText'
    //   406: invokevirtual equals : (Ljava/lang/Object;)Z
    //   409: ifne -> 415
    //   412: goto -> 376
    //   415: bipush #12
    //   417: istore #5
    //   419: goto -> 647
    //   422: aload_2
    //   423: ldc_w 'CheckBox'
    //   426: invokevirtual equals : (Ljava/lang/Object;)Z
    //   429: ifne -> 435
    //   432: goto -> 376
    //   435: bipush #11
    //   437: istore #5
    //   439: goto -> 647
    //   442: aload_2
    //   443: getstatic androidx/recyclerview/widget/dVrV/jLnXOLx.gWUoFGlrvk : Ljava/lang/String;
    //   446: invokevirtual equals : (Ljava/lang/Object;)Z
    //   449: ifne -> 455
    //   452: goto -> 376
    //   455: bipush #10
    //   457: istore #5
    //   459: goto -> 647
    //   462: aload_2
    //   463: ldc_w 'ImageView'
    //   466: invokevirtual equals : (Ljava/lang/Object;)Z
    //   469: ifne -> 475
    //   472: goto -> 376
    //   475: bipush #9
    //   477: istore #5
    //   479: goto -> 647
    //   482: aload_2
    //   483: ldc_w 'ToggleButton'
    //   486: invokevirtual equals : (Ljava/lang/Object;)Z
    //   489: ifne -> 495
    //   492: goto -> 376
    //   495: bipush #8
    //   497: istore #5
    //   499: goto -> 647
    //   502: aload_2
    //   503: ldc_w 'RadioButton'
    //   506: invokevirtual equals : (Ljava/lang/Object;)Z
    //   509: ifne -> 515
    //   512: goto -> 376
    //   515: bipush #7
    //   517: istore #5
    //   519: goto -> 647
    //   522: aload_2
    //   523: ldc_w 'Spinner'
    //   526: invokevirtual equals : (Ljava/lang/Object;)Z
    //   529: ifne -> 535
    //   532: goto -> 376
    //   535: bipush #6
    //   537: istore #5
    //   539: goto -> 647
    //   542: aload_2
    //   543: ldc_w 'SeekBar'
    //   546: invokevirtual equals : (Ljava/lang/Object;)Z
    //   549: ifne -> 555
    //   552: goto -> 376
    //   555: iconst_5
    //   556: istore #5
    //   558: goto -> 647
    //   561: aload_2
    //   562: ldc_w 'ImageButton'
    //   565: invokevirtual equals : (Ljava/lang/Object;)Z
    //   568: ifne -> 647
    //   571: goto -> 376
    //   574: aload_2
    //   575: ldc_w 'TextView'
    //   578: invokevirtual equals : (Ljava/lang/Object;)Z
    //   581: ifne -> 587
    //   584: goto -> 376
    //   587: iconst_3
    //   588: istore #5
    //   590: goto -> 647
    //   593: aload_2
    //   594: ldc_w 'MultiAutoCompleteTextView'
    //   597: invokevirtual equals : (Ljava/lang/Object;)Z
    //   600: ifne -> 606
    //   603: goto -> 376
    //   606: iconst_2
    //   607: istore #5
    //   609: goto -> 647
    //   612: aload_2
    //   613: ldc_w 'CheckedTextView'
    //   616: invokevirtual equals : (Ljava/lang/Object;)Z
    //   619: ifne -> 625
    //   622: goto -> 376
    //   625: iconst_1
    //   626: istore #5
    //   628: goto -> 647
    //   631: aload_2
    //   632: ldc_w 'RatingBar'
    //   635: invokevirtual equals : (Ljava/lang/Object;)Z
    //   638: ifne -> 644
    //   641: goto -> 376
    //   644: iconst_0
    //   645: istore #5
    //   647: iload #5
    //   649: tableswitch default -> 720, 0 -> 919, 1 -> 904, 2 -> 889, 3 -> 876, 4 -> 858, 5 -> 843, 6 -> 825, 7 -> 812, 8 -> 797, 9 -> 782, 10 -> 769, 11 -> 756, 12 -> 738, 13 -> 725
    //   720: aconst_null
    //   721: astore_1
    //   722: goto -> 931
    //   725: aload #11
    //   727: aload #8
    //   729: aload #4
    //   731: invokevirtual b : (Landroid/content/Context;Landroid/util/AttributeSet;)Landroidx/appcompat/widget/AppCompatButton;
    //   734: astore_1
    //   735: goto -> 931
    //   738: new a7
    //   741: dup
    //   742: aload #8
    //   744: aload #4
    //   746: ldc_w 2130969115
    //   749: invokespecial <init> : (Landroid/content/Context;Landroid/util/AttributeSet;I)V
    //   752: astore_1
    //   753: goto -> 931
    //   756: aload #11
    //   758: aload #8
    //   760: aload #4
    //   762: invokevirtual c : (Landroid/content/Context;Landroid/util/AttributeSet;)Landroidx/appcompat/widget/AppCompatCheckBox;
    //   765: astore_1
    //   766: goto -> 931
    //   769: aload #11
    //   771: aload #8
    //   773: aload #4
    //   775: invokevirtual a : (Landroid/content/Context;Landroid/util/AttributeSet;)Landroidx/appcompat/widget/AppCompatAutoCompleteTextView;
    //   778: astore_1
    //   779: goto -> 931
    //   782: new androidx/appcompat/widget/AppCompatImageView
    //   785: dup
    //   786: aload #8
    //   788: aload #4
    //   790: invokespecial <init> : (Landroid/content/Context;Landroid/util/AttributeSet;)V
    //   793: astore_1
    //   794: goto -> 931
    //   797: new k8
    //   800: dup
    //   801: aload #8
    //   803: aload #4
    //   805: invokespecial <init> : (Landroid/content/Context;Landroid/util/AttributeSet;)V
    //   808: astore_1
    //   809: goto -> 931
    //   812: aload #11
    //   814: aload #8
    //   816: aload #4
    //   818: invokevirtual d : (Landroid/content/Context;Landroid/util/AttributeSet;)Landroidx/appcompat/widget/AppCompatRadioButton;
    //   821: astore_1
    //   822: goto -> 931
    //   825: new u7
    //   828: dup
    //   829: aload #8
    //   831: aload #4
    //   833: ldc_w 2130969974
    //   836: invokespecial <init> : (Landroid/content/Context;Landroid/util/AttributeSet;I)V
    //   839: astore_1
    //   840: goto -> 931
    //   843: new androidx/appcompat/widget/AppCompatSeekBar
    //   846: dup
    //   847: aload #8
    //   849: aload #4
    //   851: invokespecial <init> : (Landroid/content/Context;Landroid/util/AttributeSet;)V
    //   854: astore_1
    //   855: goto -> 931
    //   858: new c7
    //   861: dup
    //   862: aload #8
    //   864: aload #4
    //   866: ldc_w 2130969329
    //   869: invokespecial <init> : (Landroid/content/Context;Landroid/util/AttributeSet;I)V
    //   872: astore_1
    //   873: goto -> 931
    //   876: aload #11
    //   878: aload #8
    //   880: aload #4
    //   882: invokevirtual e : (Landroid/content/Context;Landroid/util/AttributeSet;)Landroidx/appcompat/widget/AppCompatTextView;
    //   885: astore_1
    //   886: goto -> 931
    //   889: new e7
    //   892: dup
    //   893: aload #8
    //   895: aload #4
    //   897: invokespecial <init> : (Landroid/content/Context;Landroid/util/AttributeSet;)V
    //   900: astore_1
    //   901: goto -> 931
    //   904: new z5
    //   907: dup
    //   908: aload #8
    //   910: aload #4
    //   912: invokespecial <init> : (Landroid/content/Context;Landroid/util/AttributeSet;)V
    //   915: astore_1
    //   916: goto -> 931
    //   919: new h7
    //   922: dup
    //   923: aload #8
    //   925: aload #4
    //   927: invokespecial <init> : (Landroid/content/Context;Landroid/util/AttributeSet;)V
    //   930: astore_1
    //   931: aload_1
    //   932: astore #9
    //   934: aload_1
    //   935: ifnonnull -> 1110
    //   938: aload_1
    //   939: astore #9
    //   941: aload_3
    //   942: aload #8
    //   944: if_acmpeq -> 1110
    //   947: aload #11
    //   949: getfield a : [Ljava/lang/Object;
    //   952: astore_3
    //   953: aload_2
    //   954: astore_1
    //   955: aload_2
    //   956: ldc_w 'view'
    //   959: invokevirtual equals : (Ljava/lang/Object;)Z
    //   962: ifeq -> 977
    //   965: aload #4
    //   967: aconst_null
    //   968: ldc_w 'class'
    //   971: invokeinterface getAttributeValue : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   976: astore_1
    //   977: aload_3
    //   978: iconst_0
    //   979: aload #8
    //   981: aastore
    //   982: aload_3
    //   983: iconst_1
    //   984: aload #4
    //   986: aastore
    //   987: iconst_m1
    //   988: aload_1
    //   989: bipush #46
    //   991: invokevirtual indexOf : (I)I
    //   994: if_icmpne -> 1064
    //   997: iconst_0
    //   998: istore #5
    //   1000: getstatic m8.g : [Ljava/lang/String;
    //   1003: astore_2
    //   1004: iload #5
    //   1006: iconst_3
    //   1007: if_icmpge -> 1050
    //   1010: aload #11
    //   1012: aload #8
    //   1014: aload_1
    //   1015: aload_2
    //   1016: iload #5
    //   1018: aaload
    //   1019: invokevirtual f : (Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Landroid/view/View;
    //   1022: astore_2
    //   1023: aload_2
    //   1024: ifnull -> 1040
    //   1027: aload_3
    //   1028: iconst_0
    //   1029: aconst_null
    //   1030: aastore
    //   1031: aload_3
    //   1032: iconst_1
    //   1033: aconst_null
    //   1034: aastore
    //   1035: aload_2
    //   1036: astore_1
    //   1037: goto -> 1107
    //   1040: iinc #5, 1
    //   1043: goto -> 1000
    //   1046: astore_1
    //   1047: goto -> 1085
    //   1050: aload_3
    //   1051: iconst_0
    //   1052: aconst_null
    //   1053: aastore
    //   1054: aload_3
    //   1055: iconst_1
    //   1056: aconst_null
    //   1057: aastore
    //   1058: aload #10
    //   1060: astore_1
    //   1061: goto -> 1107
    //   1064: aload #11
    //   1066: aload #8
    //   1068: aload_1
    //   1069: aconst_null
    //   1070: invokevirtual f : (Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Landroid/view/View;
    //   1073: astore_1
    //   1074: aload_3
    //   1075: iconst_0
    //   1076: aconst_null
    //   1077: aastore
    //   1078: aload_3
    //   1079: iconst_1
    //   1080: aconst_null
    //   1081: aastore
    //   1082: goto -> 1107
    //   1085: aload_3
    //   1086: iconst_0
    //   1087: aconst_null
    //   1088: aastore
    //   1089: aload_3
    //   1090: iconst_1
    //   1091: aconst_null
    //   1092: aastore
    //   1093: aload_1
    //   1094: athrow
    //   1095: astore_1
    //   1096: aload_3
    //   1097: iconst_0
    //   1098: aconst_null
    //   1099: aastore
    //   1100: aload_3
    //   1101: iconst_1
    //   1102: aconst_null
    //   1103: aastore
    //   1104: aload #10
    //   1106: astore_1
    //   1107: aload_1
    //   1108: astore #9
    //   1110: aload #9
    //   1112: ifnull -> 1346
    //   1115: aload #9
    //   1117: invokevirtual getContext : ()Landroid/content/Context;
    //   1120: astore_1
    //   1121: aload_1
    //   1122: instanceof android/content/ContextWrapper
    //   1125: ifeq -> 1178
    //   1128: aload #9
    //   1130: invokevirtual hasOnClickListeners : ()Z
    //   1133: ifne -> 1139
    //   1136: goto -> 1178
    //   1139: aload_1
    //   1140: aload #4
    //   1142: getstatic m8.c : [I
    //   1145: invokevirtual obtainStyledAttributes : (Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;
    //   1148: astore_2
    //   1149: aload_2
    //   1150: iconst_0
    //   1151: invokevirtual getString : (I)Ljava/lang/String;
    //   1154: astore_1
    //   1155: aload_1
    //   1156: ifnull -> 1174
    //   1159: aload #9
    //   1161: new l8
    //   1164: dup
    //   1165: aload #9
    //   1167: aload_1
    //   1168: invokespecial <init> : (Landroid/view/View;Ljava/lang/String;)V
    //   1171: invokevirtual setOnClickListener : (Landroid/view/View$OnClickListener;)V
    //   1174: aload_2
    //   1175: invokevirtual recycle : ()V
    //   1178: getstatic android/os/Build$VERSION.SDK_INT : I
    //   1181: bipush #28
    //   1183: if_icmple -> 1189
    //   1186: goto -> 1346
    //   1189: aload #8
    //   1191: aload #4
    //   1193: getstatic m8.d : [I
    //   1196: invokevirtual obtainStyledAttributes : (Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;
    //   1199: astore_2
    //   1200: aload_2
    //   1201: iconst_0
    //   1202: invokevirtual hasValue : (I)Z
    //   1205: ifeq -> 1247
    //   1208: aload_2
    //   1209: iconst_0
    //   1210: iconst_0
    //   1211: invokevirtual getBoolean : (IZ)Z
    //   1214: istore #7
    //   1216: getstatic v22.a : Ljava/util/WeakHashMap;
    //   1219: astore_1
    //   1220: new i22
    //   1223: dup
    //   1224: ldc_w 2131297571
    //   1227: ldc_w java/lang/Boolean
    //   1230: iconst_0
    //   1231: bipush #28
    //   1233: iconst_3
    //   1234: invokespecial <init> : (ILjava/lang/Class;III)V
    //   1237: aload #9
    //   1239: iload #7
    //   1241: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   1244: invokevirtual e : (Landroid/view/View;Ljava/lang/Object;)V
    //   1247: aload_2
    //   1248: invokevirtual recycle : ()V
    //   1251: aload #8
    //   1253: aload #4
    //   1255: getstatic m8.e : [I
    //   1258: invokevirtual obtainStyledAttributes : (Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;
    //   1261: astore_1
    //   1262: aload_1
    //   1263: iconst_0
    //   1264: invokevirtual hasValue : (I)Z
    //   1267: ifeq -> 1280
    //   1270: aload #9
    //   1272: aload_1
    //   1273: iconst_0
    //   1274: invokevirtual getString : (I)Ljava/lang/String;
    //   1277: invokestatic o : (Landroid/view/View;Ljava/lang/CharSequence;)V
    //   1280: aload_1
    //   1281: invokevirtual recycle : ()V
    //   1284: aload #8
    //   1286: aload #4
    //   1288: getstatic m8.f : [I
    //   1291: invokevirtual obtainStyledAttributes : (Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;
    //   1294: astore_2
    //   1295: aload_2
    //   1296: iconst_0
    //   1297: invokevirtual hasValue : (I)Z
    //   1300: ifeq -> 1342
    //   1303: aload_2
    //   1304: iconst_0
    //   1305: iconst_0
    //   1306: invokevirtual getBoolean : (IZ)Z
    //   1309: istore #7
    //   1311: getstatic v22.a : Ljava/util/WeakHashMap;
    //   1314: astore_1
    //   1315: new i22
    //   1318: dup
    //   1319: ldc_w 2131297581
    //   1322: ldc_w java/lang/Boolean
    //   1325: iconst_0
    //   1326: bipush #28
    //   1328: iconst_0
    //   1329: invokespecial <init> : (ILjava/lang/Class;III)V
    //   1332: aload #9
    //   1334: iload #7
    //   1336: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   1339: invokevirtual e : (Landroid/view/View;Ljava/lang/Object;)V
    //   1342: aload_2
    //   1343: invokevirtual recycle : ()V
    //   1346: aload #9
    //   1348: areturn
    // Exception table:
    //   from	to	target	type
    //   61	85	88	finally
    //   987	997	1095	java/lang/Exception
    //   987	997	1046	finally
    //   1000	1004	1095	java/lang/Exception
    //   1000	1004	1046	finally
    //   1010	1023	1095	java/lang/Exception
    //   1010	1023	1046	finally
    //   1064	1074	1095	java/lang/Exception
    //   1064	1074	1046	finally
  }
  
  public final View onCreateView(String paramString, Context paramContext, AttributeSet paramAttributeSet) {
    return onCreateView(null, paramString, paramContext, paramAttributeSet);
  }
  
  public final void q(int paramInt, t6 paramt6, rw0 paramrw0) {
    t6 t61 = paramt6;
    rw0 rw01 = paramrw0;
    if (paramrw0 == null) {
      t6 t62 = paramt6;
      if (paramt6 == null) {
        t62 = paramt6;
        if (paramInt >= 0) {
          t6[] arrayOfT6 = this.N;
          t62 = paramt6;
          if (paramInt < arrayOfT6.length)
            t62 = arrayOfT6[paramInt]; 
        } 
      } 
      t61 = t62;
      rw01 = paramrw0;
      if (t62 != null) {
        rw01 = t62.h;
        t61 = t62;
      } 
    } 
    if ((t61 == null || t61.m) && !this.S) {
      o6 o61 = this.o;
      null = this.n.getCallback();
      o61.getClass();
      try {
        o61.g = true;
        null.onPanelClosed(paramInt, rw01);
        return;
      } finally {
        o61.g = false;
      } 
    } 
  }
  
  public final void r(rw0 paramrw0) {
    if (this.M)
      return; 
    this.M = true;
    ActionBarOverlayLayout actionBarOverlayLayout = this.s;
    actionBarOverlayLayout.k();
    ActionMenuView actionMenuView = ((mv1)actionBarOverlayLayout.g).a.b;
    if (actionMenuView != null) {
      u1 u1 = actionMenuView.g;
      if (u1 != null) {
        u1.d();
        r1 r1 = u1.v;
        if (r1 != null && r1.b())
          r1.i.dismiss(); 
      } 
    } 
    Window.Callback callback = this.n.getCallback();
    if (callback != null && !this.S)
      callback.onPanelClosed(108, paramrw0); 
    this.M = false;
  }
  
  public final void s(t6 paramt6, boolean paramBoolean) {
    if (paramBoolean && paramt6.a == 0) {
      ActionBarOverlayLayout actionBarOverlayLayout = this.s;
      if (actionBarOverlayLayout != null) {
        actionBarOverlayLayout.k();
        if (((mv1)actionBarOverlayLayout.g).a.o()) {
          r(paramt6.h);
          return;
        } 
      } 
    } 
    WindowManager windowManager = (WindowManager)this.m.getSystemService("window");
    if (windowManager != null && paramt6.m) {
      s6 s6 = paramt6.e;
      if (s6 != null) {
        windowManager.removeView((View)s6);
        if (paramBoolean)
          q(paramt6.a, paramt6, null); 
      } 
    } 
    paramt6.k = false;
    paramt6.l = false;
    paramt6.m = false;
    paramt6.f = null;
    paramt6.n = true;
    if (this.O == paramt6)
      this.O = null; 
    if (paramt6.a == 0)
      I(); 
  }
  
  public final boolean u(KeyEvent paramKeyEvent) {
    // Byte code:
    //   0: aload_0
    //   1: getfield l : Ljava/lang/Object;
    //   4: astore #5
    //   6: aload #5
    //   8: instanceof hl0
    //   11: istore #4
    //   13: iconst_1
    //   14: istore_3
    //   15: iload #4
    //   17: ifne -> 28
    //   20: aload #5
    //   22: instanceof w6
    //   25: ifeq -> 54
    //   28: aload_0
    //   29: getfield n : Landroid/view/Window;
    //   32: invokevirtual getDecorView : ()Landroid/view/View;
    //   35: astore #5
    //   37: aload #5
    //   39: ifnull -> 54
    //   42: aload #5
    //   44: aload_1
    //   45: invokestatic z : (Landroid/view/View;Landroid/view/KeyEvent;)Z
    //   48: ifeq -> 54
    //   51: goto -> 559
    //   54: aload_1
    //   55: invokevirtual getKeyCode : ()I
    //   58: bipush #82
    //   60: if_icmpne -> 123
    //   63: aload_0
    //   64: getfield o : Lo6;
    //   67: astore #5
    //   69: aload_0
    //   70: getfield n : Landroid/view/Window;
    //   73: invokevirtual getCallback : ()Landroid/view/Window$Callback;
    //   76: astore #6
    //   78: aload #5
    //   80: invokevirtual getClass : ()Ljava/lang/Class;
    //   83: pop
    //   84: aload #5
    //   86: iconst_1
    //   87: putfield f : Z
    //   90: aload #6
    //   92: aload_1
    //   93: invokeinterface dispatchKeyEvent : (Landroid/view/KeyEvent;)Z
    //   98: istore #4
    //   100: aload #5
    //   102: iconst_0
    //   103: putfield f : Z
    //   106: iload #4
    //   108: ifeq -> 123
    //   111: goto -> 559
    //   114: astore_1
    //   115: aload #5
    //   117: iconst_0
    //   118: putfield f : Z
    //   121: aload_1
    //   122: athrow
    //   123: aload_1
    //   124: invokevirtual getKeyCode : ()I
    //   127: istore_2
    //   128: aload_1
    //   129: invokevirtual getAction : ()I
    //   132: ifne -> 204
    //   135: iload_2
    //   136: iconst_4
    //   137: if_icmpeq -> 181
    //   140: iload_2
    //   141: bipush #82
    //   143: if_icmpeq -> 149
    //   146: goto -> 561
    //   149: aload_1
    //   150: invokevirtual getRepeatCount : ()I
    //   153: ifne -> 559
    //   156: aload_0
    //   157: iconst_0
    //   158: invokevirtual z : (I)Lt6;
    //   161: astore #5
    //   163: aload #5
    //   165: getfield m : Z
    //   168: ifne -> 559
    //   171: aload_0
    //   172: aload #5
    //   174: aload_1
    //   175: invokevirtual G : (Lt6;Landroid/view/KeyEvent;)Z
    //   178: pop
    //   179: iconst_1
    //   180: ireturn
    //   181: aload_1
    //   182: invokevirtual getFlags : ()I
    //   185: sipush #128
    //   188: iand
    //   189: ifeq -> 195
    //   192: goto -> 197
    //   195: iconst_0
    //   196: istore_3
    //   197: aload_0
    //   198: iload_3
    //   199: putfield P : Z
    //   202: iconst_0
    //   203: ireturn
    //   204: iload_2
    //   205: iconst_4
    //   206: if_icmpeq -> 552
    //   209: iload_2
    //   210: bipush #82
    //   212: if_icmpeq -> 218
    //   215: goto -> 561
    //   218: aload_0
    //   219: getfield v : Ly1;
    //   222: ifnull -> 228
    //   225: goto -> 559
    //   228: aload_0
    //   229: iconst_0
    //   230: invokevirtual z : (I)Lt6;
    //   233: astore #6
    //   235: aload_0
    //   236: getfield s : Landroidx/appcompat/widget/ActionBarOverlayLayout;
    //   239: astore #7
    //   241: aload_0
    //   242: getfield m : Landroid/content/Context;
    //   245: astore #5
    //   247: aload #7
    //   249: ifnull -> 426
    //   252: aload #7
    //   254: invokevirtual k : ()V
    //   257: aload #7
    //   259: getfield g : Lsv;
    //   262: checkcast mv1
    //   265: getfield a : Landroidx/appcompat/widget/Toolbar;
    //   268: astore #7
    //   270: aload #7
    //   272: invokevirtual getVisibility : ()I
    //   275: ifne -> 426
    //   278: aload #7
    //   280: getfield b : Landroidx/appcompat/widget/ActionMenuView;
    //   283: astore #7
    //   285: aload #7
    //   287: ifnull -> 426
    //   290: aload #7
    //   292: getfield f : Z
    //   295: ifeq -> 426
    //   298: aload #5
    //   300: invokestatic get : (Landroid/content/Context;)Landroid/view/ViewConfiguration;
    //   303: invokevirtual hasPermanentMenuKey : ()Z
    //   306: ifne -> 426
    //   309: aload_0
    //   310: getfield s : Landroidx/appcompat/widget/ActionBarOverlayLayout;
    //   313: astore #7
    //   315: aload #7
    //   317: invokevirtual k : ()V
    //   320: aload #7
    //   322: getfield g : Lsv;
    //   325: checkcast mv1
    //   328: getfield a : Landroidx/appcompat/widget/Toolbar;
    //   331: invokevirtual o : ()Z
    //   334: ifne -> 380
    //   337: aload_0
    //   338: getfield S : Z
    //   341: ifne -> 498
    //   344: aload_0
    //   345: aload #6
    //   347: aload_1
    //   348: invokevirtual G : (Lt6;Landroid/view/KeyEvent;)Z
    //   351: ifeq -> 498
    //   354: aload_0
    //   355: getfield s : Landroidx/appcompat/widget/ActionBarOverlayLayout;
    //   358: astore_1
    //   359: aload_1
    //   360: invokevirtual k : ()V
    //   363: aload_1
    //   364: getfield g : Lsv;
    //   367: checkcast mv1
    //   370: getfield a : Landroidx/appcompat/widget/Toolbar;
    //   373: invokevirtual u : ()Z
    //   376: istore_3
    //   377: goto -> 510
    //   380: aload_0
    //   381: getfield s : Landroidx/appcompat/widget/ActionBarOverlayLayout;
    //   384: astore_1
    //   385: aload_1
    //   386: invokevirtual k : ()V
    //   389: aload_1
    //   390: getfield g : Lsv;
    //   393: checkcast mv1
    //   396: getfield a : Landroidx/appcompat/widget/Toolbar;
    //   399: getfield b : Landroidx/appcompat/widget/ActionMenuView;
    //   402: astore_1
    //   403: aload_1
    //   404: ifnull -> 498
    //   407: aload_1
    //   408: getfield g : Lu1;
    //   411: astore_1
    //   412: aload_1
    //   413: ifnull -> 498
    //   416: aload_1
    //   417: invokevirtual d : ()Z
    //   420: ifeq -> 498
    //   423: goto -> 493
    //   426: aload #6
    //   428: getfield m : Z
    //   431: istore_3
    //   432: iload_3
    //   433: ifne -> 503
    //   436: aload #6
    //   438: getfield l : Z
    //   441: ifeq -> 447
    //   444: goto -> 503
    //   447: aload #6
    //   449: getfield k : Z
    //   452: ifeq -> 498
    //   455: aload #6
    //   457: getfield o : Z
    //   460: ifeq -> 480
    //   463: aload #6
    //   465: iconst_0
    //   466: putfield k : Z
    //   469: aload_0
    //   470: aload #6
    //   472: aload_1
    //   473: invokevirtual G : (Lt6;Landroid/view/KeyEvent;)Z
    //   476: istore_3
    //   477: goto -> 482
    //   480: iconst_1
    //   481: istore_3
    //   482: iload_3
    //   483: ifeq -> 498
    //   486: aload_0
    //   487: aload #6
    //   489: aload_1
    //   490: invokevirtual E : (Lt6;Landroid/view/KeyEvent;)V
    //   493: iconst_1
    //   494: istore_3
    //   495: goto -> 510
    //   498: iconst_0
    //   499: istore_3
    //   500: goto -> 510
    //   503: aload_0
    //   504: aload #6
    //   506: iconst_1
    //   507: invokevirtual s : (Lt6;Z)V
    //   510: iload_3
    //   511: ifeq -> 559
    //   514: aload #5
    //   516: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   519: ldc_w 'audio'
    //   522: invokevirtual getSystemService : (Ljava/lang/String;)Ljava/lang/Object;
    //   525: checkcast android/media/AudioManager
    //   528: astore_1
    //   529: aload_1
    //   530: ifnull -> 540
    //   533: aload_1
    //   534: iconst_0
    //   535: invokevirtual playSoundEffect : (I)V
    //   538: iconst_1
    //   539: ireturn
    //   540: ldc_w 'AppCompatDelegate'
    //   543: ldc_w 'Couldn't get audio manager'
    //   546: invokestatic w : (Ljava/lang/String;Ljava/lang/String;)I
    //   549: pop
    //   550: iconst_1
    //   551: ireturn
    //   552: aload_0
    //   553: invokevirtual D : ()Z
    //   556: ifeq -> 561
    //   559: iconst_1
    //   560: ireturn
    //   561: iconst_0
    //   562: ireturn
    // Exception table:
    //   from	to	target	type
    //   84	100	114	finally
  }
  
  public final void v(int paramInt) {
    t6 t61 = z(paramInt);
    if (t61.h != null) {
      Bundle bundle = new Bundle();
      t61.h.t(bundle);
      if (bundle.size() > 0)
        t61.p = bundle; 
      t61.h.w();
      t61.h.clear();
    } 
    t61.o = true;
    t61.n = true;
    if ((paramInt == 108 || paramInt == 0) && this.s != null) {
      t61 = z(0);
      t61.k = false;
      G(t61, null);
    } 
  }
  
  public final void w() {
    if (!this.B) {
      Object object;
      Context context = this.m;
      int[] arrayOfInt = nc1.j;
      TypedArray typedArray = context.obtainStyledAttributes(arrayOfInt);
      if (typedArray.hasValue(117)) {
        ViewGroup viewGroup;
        if (typedArray.getBoolean(126, false)) {
          i(1);
        } else if (typedArray.getBoolean(117, false)) {
          i(108);
        } 
        if (typedArray.getBoolean(118, false))
          i(109); 
        if (typedArray.getBoolean(119, false))
          i(10); 
        this.K = typedArray.getBoolean(0, false);
        typedArray.recycle();
        x();
        this.n.getDecorView();
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        if (!this.L) {
          if (this.K) {
            viewGroup = (ViewGroup)layoutInflater.inflate(2131492876, null);
            this.I = false;
            this.H = false;
          } else if (this.H) {
            Context context1;
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(2130968587, typedValue, true);
            if (typedValue.resourceId != 0) {
              bs bs = new bs(context, typedValue.resourceId);
            } else {
              context1 = context;
            } 
            ViewGroup viewGroup1 = (ViewGroup)LayoutInflater.from(context1).inflate(2131492887, null);
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout)viewGroup1.findViewById(2131296644);
            this.s = actionBarOverlayLayout;
            actionBarOverlayLayout.setWindowCallback(this.n.getCallback());
            if (this.I)
              this.s.j(109); 
            if (this.F)
              this.s.j(2); 
            viewGroup = viewGroup1;
            if (this.G) {
              this.s.j(5);
              viewGroup = viewGroup1;
            } 
          } else {
            layoutInflater = null;
          } 
        } else if (this.J) {
          viewGroup = (ViewGroup)layoutInflater.inflate(2131492886, null);
        } else {
          viewGroup = (ViewGroup)viewGroup.inflate(2131492885, null);
        } 
        if (viewGroup != null) {
          i6 i61 = new i6(this, 0);
          WeakHashMap weakHashMap = v22.a;
          m22.c((View)viewGroup, i61);
          if (this.s == null)
            this.D = (TextView)viewGroup.findViewById(2131297650); 
          boolean bool = d42.a;
          try {
            Method method = viewGroup.getClass().getMethod("makeOptionalFitsSystemWindows", null);
            if (!method.isAccessible())
              method.setAccessible(true); 
            method.invoke(viewGroup, null);
          } catch (NoSuchMethodException noSuchMethodException) {
            Log.d("ViewUtils", "Could not find method makeOptionalFitsSystemWindows. Oh well...");
          } catch (InvocationTargetException invocationTargetException) {
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", invocationTargetException);
          } catch (IllegalAccessException illegalAccessException) {
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", illegalAccessException);
          } 
          ContentFrameLayout contentFrameLayout = (ContentFrameLayout)viewGroup.findViewById(2131296312);
          ViewGroup viewGroup1 = (ViewGroup)this.n.findViewById(16908290);
          if (viewGroup1 != null) {
            while (viewGroup1.getChildCount() > 0) {
              View view1 = viewGroup1.getChildAt(0);
              viewGroup1.removeViewAt(0);
              contentFrameLayout.addView(view1);
            } 
            viewGroup1.setId(-1);
            contentFrameLayout.setId(16908290);
            if (viewGroup1 instanceof FrameLayout)
              ((FrameLayout)viewGroup1).setForeground(null); 
          } 
          this.n.setContentView((View)viewGroup);
          contentFrameLayout.setAttachListener(new i6(this, 1));
          this.C = viewGroup;
          object = this.l;
          if (object instanceof Activity) {
            object = ((Activity)object).getTitle();
          } else {
            object = this.r;
          } 
          if (!TextUtils.isEmpty((CharSequence)object)) {
            ActionBarOverlayLayout actionBarOverlayLayout = this.s;
            if (actionBarOverlayLayout != null) {
              actionBarOverlayLayout.setWindowTitle((CharSequence)object);
            } else {
              ui0 ui01 = this.p;
              if (ui01 != null) {
                ui01.h0((CharSequence)object);
              } else {
                TextView textView = this.D;
                if (textView != null)
                  textView.setText((CharSequence)object); 
              } 
            } 
          } 
          object = this.C.findViewById(16908290);
          View view = this.n.getDecorView();
          int m = view.getPaddingLeft();
          int k = view.getPaddingTop();
          int i = view.getPaddingRight();
          int j = view.getPaddingBottom();
          ((ContentFrameLayout)object).i.set(m, k, i, j);
          if (object.isLaidOut())
            object.requestLayout(); 
          TypedArray typedArray1 = context.obtainStyledAttributes(arrayOfInt);
          typedArray1.getValue(124, object.getMinWidthMajor());
          typedArray1.getValue(125, object.getMinWidthMinor());
          if (typedArray1.hasValue(122))
            typedArray1.getValue(122, object.getFixedWidthMajor()); 
          if (typedArray1.hasValue(123))
            typedArray1.getValue(123, object.getFixedWidthMinor()); 
          if (typedArray1.hasValue(120))
            typedArray1.getValue(120, object.getFixedHeightMajor()); 
          if (typedArray1.hasValue(121))
            typedArray1.getValue(121, object.getFixedHeightMinor()); 
          typedArray1.recycle();
          object.requestLayout();
          this.B = true;
          object = z(0);
          if (!this.S && ((t6)object).h == null)
            B(108); 
        } else {
          boolean bool2 = this.H;
          boolean bool3 = this.I;
          boolean bool5 = this.K;
          boolean bool4 = this.J;
          boolean bool1 = this.L;
          object = new StringBuilder("AppCompat does not support the current theme features: { windowActionBar: ");
          object.append(bool2);
          object.append(", windowActionBarOverlay: ");
          object.append(bool3);
          object.append(", android:windowIsFloating: ");
          object.append(bool5);
          object.append(", windowActionModeOverlay: ");
          object.append(bool4);
          object.append(", windowNoTitle: ");
          object.append(bool1);
          object.append(" }");
          throw new IllegalArgumentException(object.toString());
        } 
      } else {
        object.recycle();
        tp.f("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
      } 
    } 
  }
  
  public final void x() {
    if (this.n == null) {
      Object object = this.l;
      if (object instanceof Activity)
        o(((Activity)object).getWindow()); 
    } 
    if (this.n != null)
      return; 
    tp.f("We have not been given a Window");
  }
  
  public final r6 y(Context paramContext) {
    if (this.Y == null) {
      if (zv0.i == null) {
        paramContext = paramContext.getApplicationContext();
        zv0.i = new zv0(paramContext, (LocationManager)paramContext.getSystemService("location"));
      } 
      this.Y = new p6(this, zv0.i);
    } 
    return this.Y;
  }
  
  public final t6 z(int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: getfield N : [Lt6;
    //   4: astore_3
    //   5: aload_3
    //   6: ifnull -> 17
    //   9: aload_3
    //   10: astore_2
    //   11: aload_3
    //   12: arraylength
    //   13: iload_1
    //   14: if_icmpgt -> 42
    //   17: iload_1
    //   18: iconst_1
    //   19: iadd
    //   20: anewarray t6
    //   23: astore_2
    //   24: aload_3
    //   25: ifnull -> 37
    //   28: aload_3
    //   29: iconst_0
    //   30: aload_2
    //   31: iconst_0
    //   32: aload_3
    //   33: arraylength
    //   34: invokestatic arraycopy : (Ljava/lang/Object;ILjava/lang/Object;II)V
    //   37: aload_0
    //   38: aload_2
    //   39: putfield N : [Lt6;
    //   42: aload_2
    //   43: iload_1
    //   44: aaload
    //   45: astore #4
    //   47: aload #4
    //   49: astore_3
    //   50: aload #4
    //   52: ifnonnull -> 77
    //   55: new java/lang/Object
    //   58: dup
    //   59: invokespecial <init> : ()V
    //   62: astore_3
    //   63: aload_3
    //   64: iload_1
    //   65: putfield a : I
    //   68: aload_3
    //   69: iconst_0
    //   70: putfield n : Z
    //   73: aload_2
    //   74: iload_1
    //   75: aload_3
    //   76: aastore
    //   77: aload_3
    //   78: areturn
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar\\u6.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
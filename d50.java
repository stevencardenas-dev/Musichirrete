import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.Button;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import com.google.android.gms.common.api.internal.jEVH.KjdXPYm;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.slider.Slider;
import com.sdsmdg.harjot.crollerTest.Croller;
import in.krosbits.musicolet.EqualizerActivity2;
import in.krosbits.musicolet.MusicService;
import in.krosbits.musicolet.MyApplication;

public class d50 extends ua0 implements f41, View.OnTouchListener {
  public Croller a0;
  
  public Croller b0;
  
  public Croller c0;
  
  public TextView d0;
  
  public TextView e0;
  
  public TextView f0;
  
  public TextView g0;
  
  public TextView h0;
  
  public TextView i0;
  
  public TextView j0;
  
  public MaterialButtonToggleGroup k0;
  
  public MaterialButtonToggleGroup l0;
  
  public Button m0;
  
  public Button n0;
  
  public Button o0;
  
  public Slider p0;
  
  public Slider q0;
  
  public Group r0;
  
  public EqualizerActivity2 s0;
  
  public final Handler t0 = new Handler(Looper.getMainLooper());
  
  public boolean u0;
  
  public boolean v0;
  
  public static void D0(ViewGroup paramViewGroup, ViewParent paramViewParent, View paramView, Point paramPoint) {
    ViewGroup viewGroup = (ViewGroup)paramViewParent;
    int i = paramPoint.x;
    paramPoint.x = paramView.getLeft() + i;
    i = paramPoint.y;
    paramPoint.y = paramView.getTop() + i;
    if (viewGroup.equals(paramViewGroup))
      return; 
    D0(paramViewGroup, viewGroup.getParent(), (View)viewGroup, paramPoint);
  }
  
  public final void B(Croller paramCroller) {
    int i = this.s0.p0();
    if (paramCroller == this.a0) {
      short s = (short)paramCroller.getProgress();
      int j = j50.a;
      x41.u(ga1.i("EQBBS_", i), s);
      this.s0.q0();
      return;
    } 
    if (paramCroller == this.b0) {
      short s = (short)paramCroller.getProgress();
      int j = j50.a;
      x41.u(ga1.i("EQVS_", i), s);
      return;
    } 
    if (paramCroller == this.c0 && paramCroller.getProgress() != j50.d(i)) {
      int j = paramCroller.getProgress();
      x41.u(ga1.i("EQCHBL_", i), j);
      if (MusicService.D0 == i)
        try {
          if (!j50.q(i, MusicService.E0) && paramCroller.getProgress() != 100) {
            ms0 ms0 = new ms0();
            this(P());
            ms0.q(2131886218);
            ms0.d((CharSequence)Html.fromHtml(T(2131886348)));
            ms0.n(2131886639);
            return;
          } 
          return;
        } finally {
          paramCroller = null;
        }  
    } 
  }
  
  public final void E0() {
    // Byte code:
    //   0: getstatic m92.h : [I
    //   3: astore #4
    //   5: aload_0
    //   6: getfield s0 : Lin/krosbits/musicolet/EqualizerActivity2;
    //   9: astore #5
    //   11: aload #5
    //   13: ifnonnull -> 17
    //   16: return
    //   17: aload #5
    //   19: invokevirtual p0 : ()I
    //   22: istore_2
    //   23: iload_2
    //   24: getstatic in/krosbits/musicolet/MusicService.D0 : I
    //   27: if_icmpne -> 390
    //   30: iload_2
    //   31: invokestatic r : (I)Z
    //   34: ifeq -> 390
    //   37: aload_0
    //   38: getfield a0 : Lcom/sdsmdg/harjot/crollerTest/Croller;
    //   41: iconst_1
    //   42: invokevirtual setSelfEnabled : (Z)V
    //   45: aload_0
    //   46: getfield b0 : Lcom/sdsmdg/harjot/crollerTest/Croller;
    //   49: iconst_1
    //   50: invokevirtual setSelfEnabled : (Z)V
    //   53: aload_0
    //   54: getfield h0 : Landroid/widget/TextView;
    //   57: aload #4
    //   59: bipush #6
    //   61: iaload
    //   62: invokevirtual setTextColor : (I)V
    //   65: aload_0
    //   66: getfield i0 : Landroid/widget/TextView;
    //   69: aload #4
    //   71: bipush #6
    //   73: iaload
    //   74: invokevirtual setTextColor : (I)V
    //   77: aload_0
    //   78: getfield e0 : Landroid/widget/TextView;
    //   81: aload #4
    //   83: bipush #6
    //   85: iaload
    //   86: invokevirtual setTextColor : (I)V
    //   89: aload_0
    //   90: getfield d0 : Landroid/widget/TextView;
    //   93: aload #4
    //   95: bipush #6
    //   97: iaload
    //   98: invokevirtual setTextColor : (I)V
    //   101: aload_0
    //   102: getfield g0 : Landroid/widget/TextView;
    //   105: aload #4
    //   107: bipush #6
    //   109: iaload
    //   110: invokevirtual setTextColor : (I)V
    //   113: aload_0
    //   114: getfield l0 : Lcom/google/android/material/button/MaterialButtonToggleGroup;
    //   117: fconst_1
    //   118: invokevirtual setAlpha : (F)V
    //   121: aload_0
    //   122: getfield p0 : Lcom/google/android/material/slider/Slider;
    //   125: astore #6
    //   127: new android/content/res/ColorStateList
    //   130: astore #5
    //   132: iconst_0
    //   133: newarray int
    //   135: astore #7
    //   137: aload #4
    //   139: bipush #6
    //   141: iaload
    //   142: istore_3
    //   143: aload #4
    //   145: iconst_3
    //   146: iaload
    //   147: istore_1
    //   148: aload #5
    //   150: iconst_2
    //   151: anewarray [I
    //   154: dup
    //   155: iconst_0
    //   156: iconst_1
    //   157: newarray int
    //   159: dup
    //   160: iconst_0
    //   161: ldc -16842910
    //   163: iastore
    //   164: aastore
    //   165: dup
    //   166: iconst_1
    //   167: aload #7
    //   169: aastore
    //   170: iconst_2
    //   171: newarray int
    //   173: dup
    //   174: iconst_0
    //   175: iload_3
    //   176: iastore
    //   177: dup
    //   178: iconst_1
    //   179: iload_1
    //   180: iastore
    //   181: invokespecial <init> : ([[I[I)V
    //   184: aload #6
    //   186: aload #5
    //   188: invokevirtual setTrackActiveTintList : (Landroid/content/res/ColorStateList;)V
    //   191: aload_0
    //   192: getfield p0 : Lcom/google/android/material/slider/Slider;
    //   195: aload #4
    //   197: bipush #7
    //   199: iaload
    //   200: invokestatic valueOf : (I)Landroid/content/res/ColorStateList;
    //   203: invokevirtual setTrackInactiveTintList : (Landroid/content/res/ColorStateList;)V
    //   206: aload_0
    //   207: getfield p0 : Lcom/google/android/material/slider/Slider;
    //   210: astore #6
    //   212: new android/content/res/ColorStateList
    //   215: astore #7
    //   217: iconst_1
    //   218: newarray int
    //   220: dup
    //   221: iconst_0
    //   222: ldc -16842910
    //   224: iastore
    //   225: astore #5
    //   227: aload #4
    //   229: iconst_2
    //   230: iaload
    //   231: aload #4
    //   233: bipush #7
    //   235: iaload
    //   236: invokestatic g : (II)I
    //   239: istore_3
    //   240: aload #4
    //   242: iconst_3
    //   243: iaload
    //   244: istore_1
    //   245: aload #7
    //   247: iconst_2
    //   248: anewarray [I
    //   251: dup
    //   252: iconst_0
    //   253: aload #5
    //   255: aastore
    //   256: dup
    //   257: iconst_1
    //   258: iconst_0
    //   259: newarray int
    //   261: aastore
    //   262: iconst_2
    //   263: newarray int
    //   265: dup
    //   266: iconst_0
    //   267: iload_3
    //   268: iastore
    //   269: dup
    //   270: iconst_1
    //   271: iload_1
    //   272: iastore
    //   273: invokespecial <init> : ([[I[I)V
    //   276: aload #6
    //   278: aload #7
    //   280: invokevirtual setThumbTintList : (Landroid/content/res/ColorStateList;)V
    //   283: new android/content/res/ColorStateList
    //   286: astore #5
    //   288: iconst_1
    //   289: newarray int
    //   291: dup
    //   292: iconst_0
    //   293: ldc_w 16842912
    //   296: iastore
    //   297: astore #6
    //   299: aload #4
    //   301: iconst_3
    //   302: iaload
    //   303: istore_3
    //   304: aload #4
    //   306: bipush #7
    //   308: iaload
    //   309: istore_1
    //   310: aload #5
    //   312: iconst_2
    //   313: anewarray [I
    //   316: dup
    //   317: iconst_0
    //   318: aload #6
    //   320: aastore
    //   321: dup
    //   322: iconst_1
    //   323: iconst_0
    //   324: newarray int
    //   326: aastore
    //   327: iconst_2
    //   328: newarray int
    //   330: dup
    //   331: iconst_0
    //   332: iload_3
    //   333: iastore
    //   334: dup
    //   335: iconst_1
    //   336: iload_1
    //   337: iastore
    //   338: invokespecial <init> : ([[I[I)V
    //   341: iconst_0
    //   342: istore_1
    //   343: iload_1
    //   344: aload_0
    //   345: getfield l0 : Lcom/google/android/material/button/MaterialButtonToggleGroup;
    //   348: invokevirtual getChildCount : ()I
    //   351: if_icmpge -> 387
    //   354: aload_0
    //   355: getfield l0 : Lcom/google/android/material/button/MaterialButtonToggleGroup;
    //   358: iload_1
    //   359: invokevirtual getChildAt : (I)Landroid/view/View;
    //   362: checkcast com/google/android/material/button/MaterialButton
    //   365: astore #6
    //   367: aload #6
    //   369: aload #5
    //   371: invokevirtual setStrokeColor : (Landroid/content/res/ColorStateList;)V
    //   374: aload #6
    //   376: aload #5
    //   378: invokevirtual setTextColor : (Landroid/content/res/ColorStateList;)V
    //   381: iinc #1, 1
    //   384: goto -> 343
    //   387: goto -> 688
    //   390: aload_0
    //   391: getfield a0 : Lcom/sdsmdg/harjot/crollerTest/Croller;
    //   394: iconst_0
    //   395: invokevirtual setSelfEnabled : (Z)V
    //   398: aload_0
    //   399: getfield b0 : Lcom/sdsmdg/harjot/crollerTest/Croller;
    //   402: iconst_0
    //   403: invokevirtual setSelfEnabled : (Z)V
    //   406: aload_0
    //   407: getfield h0 : Landroid/widget/TextView;
    //   410: aload #4
    //   412: bipush #7
    //   414: iaload
    //   415: invokevirtual setTextColor : (I)V
    //   418: aload_0
    //   419: getfield i0 : Landroid/widget/TextView;
    //   422: aload #4
    //   424: bipush #7
    //   426: iaload
    //   427: invokevirtual setTextColor : (I)V
    //   430: aload_0
    //   431: getfield e0 : Landroid/widget/TextView;
    //   434: aload #4
    //   436: bipush #7
    //   438: iaload
    //   439: invokevirtual setTextColor : (I)V
    //   442: aload_0
    //   443: getfield d0 : Landroid/widget/TextView;
    //   446: aload #4
    //   448: bipush #7
    //   450: iaload
    //   451: invokevirtual setTextColor : (I)V
    //   454: aload_0
    //   455: getfield g0 : Landroid/widget/TextView;
    //   458: aload #4
    //   460: bipush #7
    //   462: iaload
    //   463: invokevirtual setTextColor : (I)V
    //   466: aload_0
    //   467: getfield l0 : Lcom/google/android/material/button/MaterialButtonToggleGroup;
    //   470: ldc_w 0.7
    //   473: invokevirtual setAlpha : (F)V
    //   476: aload_0
    //   477: getfield p0 : Lcom/google/android/material/slider/Slider;
    //   480: aload #4
    //   482: bipush #6
    //   484: iaload
    //   485: invokestatic valueOf : (I)Landroid/content/res/ColorStateList;
    //   488: invokevirtual setTrackActiveTintList : (Landroid/content/res/ColorStateList;)V
    //   491: aload_0
    //   492: getfield p0 : Lcom/google/android/material/slider/Slider;
    //   495: aload #4
    //   497: bipush #7
    //   499: iaload
    //   500: invokestatic valueOf : (I)Landroid/content/res/ColorStateList;
    //   503: invokevirtual setTrackInactiveTintList : (Landroid/content/res/ColorStateList;)V
    //   506: aload_0
    //   507: getfield p0 : Lcom/google/android/material/slider/Slider;
    //   510: astore #6
    //   512: new android/content/res/ColorStateList
    //   515: astore #5
    //   517: aload #4
    //   519: iconst_2
    //   520: iaload
    //   521: aload #4
    //   523: bipush #7
    //   525: iaload
    //   526: invokestatic g : (II)I
    //   529: istore_3
    //   530: aload #4
    //   532: iconst_2
    //   533: iaload
    //   534: aload #4
    //   536: bipush #6
    //   538: iaload
    //   539: invokestatic g : (II)I
    //   542: istore_1
    //   543: aload #5
    //   545: iconst_2
    //   546: anewarray [I
    //   549: dup
    //   550: iconst_0
    //   551: iconst_1
    //   552: newarray int
    //   554: dup
    //   555: iconst_0
    //   556: ldc -16842910
    //   558: iastore
    //   559: aastore
    //   560: dup
    //   561: iconst_1
    //   562: iconst_0
    //   563: newarray int
    //   565: aastore
    //   566: iconst_2
    //   567: newarray int
    //   569: dup
    //   570: iconst_0
    //   571: iload_3
    //   572: iastore
    //   573: dup
    //   574: iconst_1
    //   575: iload_1
    //   576: iastore
    //   577: invokespecial <init> : ([[I[I)V
    //   580: aload #6
    //   582: aload #5
    //   584: invokevirtual setThumbTintList : (Landroid/content/res/ColorStateList;)V
    //   587: new android/content/res/ColorStateList
    //   590: astore #6
    //   592: aload #4
    //   594: bipush #6
    //   596: iaload
    //   597: istore_3
    //   598: aload #4
    //   600: bipush #7
    //   602: iaload
    //   603: istore_1
    //   604: aload #6
    //   606: iconst_2
    //   607: anewarray [I
    //   610: dup
    //   611: iconst_0
    //   612: iconst_1
    //   613: newarray int
    //   615: dup
    //   616: iconst_0
    //   617: ldc_w 16842912
    //   620: iastore
    //   621: aastore
    //   622: dup
    //   623: iconst_1
    //   624: iconst_0
    //   625: newarray int
    //   627: aastore
    //   628: iconst_2
    //   629: newarray int
    //   631: dup
    //   632: iconst_0
    //   633: iload_3
    //   634: iastore
    //   635: dup
    //   636: iconst_1
    //   637: iload_1
    //   638: iastore
    //   639: invokespecial <init> : ([[I[I)V
    //   642: iconst_0
    //   643: istore_1
    //   644: iload_1
    //   645: aload_0
    //   646: getfield l0 : Lcom/google/android/material/button/MaterialButtonToggleGroup;
    //   649: invokevirtual getChildCount : ()I
    //   652: if_icmpge -> 688
    //   655: aload_0
    //   656: getfield l0 : Lcom/google/android/material/button/MaterialButtonToggleGroup;
    //   659: iload_1
    //   660: invokevirtual getChildAt : (I)Landroid/view/View;
    //   663: checkcast com/google/android/material/button/MaterialButton
    //   666: astore #5
    //   668: aload #5
    //   670: aload #6
    //   672: invokevirtual setStrokeColor : (Landroid/content/res/ColorStateList;)V
    //   675: aload #5
    //   677: aload #6
    //   679: invokevirtual setTextColor : (Landroid/content/res/ColorStateList;)V
    //   682: iinc #1, 1
    //   685: goto -> 644
    //   688: iload_2
    //   689: getstatic in/krosbits/musicolet/MusicService.D0 : I
    //   692: if_icmpne -> 740
    //   695: iload_2
    //   696: getstatic in/krosbits/musicolet/MusicService.E0 : Lhc;
    //   699: invokestatic q : (ILhc;)Z
    //   702: ifeq -> 740
    //   705: aload_0
    //   706: getfield c0 : Lcom/sdsmdg/harjot/crollerTest/Croller;
    //   709: iconst_1
    //   710: invokevirtual setSelfEnabled : (Z)V
    //   713: aload_0
    //   714: getfield j0 : Landroid/widget/TextView;
    //   717: aload #4
    //   719: bipush #6
    //   721: iaload
    //   722: invokevirtual setTextColor : (I)V
    //   725: aload_0
    //   726: getfield f0 : Landroid/widget/TextView;
    //   729: aload #4
    //   731: bipush #6
    //   733: iaload
    //   734: invokevirtual setTextColor : (I)V
    //   737: goto -> 772
    //   740: aload_0
    //   741: getfield c0 : Lcom/sdsmdg/harjot/crollerTest/Croller;
    //   744: iconst_0
    //   745: invokevirtual setSelfEnabled : (Z)V
    //   748: aload_0
    //   749: getfield j0 : Landroid/widget/TextView;
    //   752: aload #4
    //   754: bipush #7
    //   756: iaload
    //   757: invokevirtual setTextColor : (I)V
    //   760: aload_0
    //   761: getfield f0 : Landroid/widget/TextView;
    //   764: aload #4
    //   766: bipush #7
    //   768: iaload
    //   769: invokevirtual setTextColor : (I)V
    //   772: iload_2
    //   773: getstatic in/krosbits/musicolet/MusicService.D0 : I
    //   776: if_icmpne -> 902
    //   779: new android/content/res/ColorStateList
    //   782: astore #5
    //   784: iconst_1
    //   785: newarray int
    //   787: dup
    //   788: iconst_0
    //   789: ldc_w 16842912
    //   792: iastore
    //   793: astore #6
    //   795: iconst_0
    //   796: newarray int
    //   798: astore #7
    //   800: aload #4
    //   802: iconst_3
    //   803: iaload
    //   804: istore_1
    //   805: aload #4
    //   807: bipush #7
    //   809: iaload
    //   810: istore_2
    //   811: aload #5
    //   813: iconst_2
    //   814: anewarray [I
    //   817: dup
    //   818: iconst_0
    //   819: aload #6
    //   821: aastore
    //   822: dup
    //   823: iconst_1
    //   824: aload #7
    //   826: aastore
    //   827: iconst_2
    //   828: newarray int
    //   830: dup
    //   831: iconst_0
    //   832: iload_1
    //   833: iastore
    //   834: dup
    //   835: iconst_1
    //   836: iload_2
    //   837: iastore
    //   838: invokespecial <init> : ([[I[I)V
    //   841: iconst_0
    //   842: istore_1
    //   843: aload_0
    //   844: getfield k0 : Lcom/google/android/material/button/MaterialButtonToggleGroup;
    //   847: invokevirtual getChildCount : ()I
    //   850: istore_2
    //   851: aload_0
    //   852: getfield k0 : Lcom/google/android/material/button/MaterialButtonToggleGroup;
    //   855: astore #4
    //   857: iload_1
    //   858: iload_2
    //   859: if_icmpge -> 893
    //   862: aload #4
    //   864: iload_1
    //   865: invokevirtual getChildAt : (I)Landroid/view/View;
    //   868: checkcast com/google/android/material/button/MaterialButton
    //   871: astore #4
    //   873: aload #4
    //   875: aload #5
    //   877: invokevirtual setStrokeColor : (Landroid/content/res/ColorStateList;)V
    //   880: aload #4
    //   882: aload #5
    //   884: invokevirtual setTextColor : (Landroid/content/res/ColorStateList;)V
    //   887: iinc #1, 1
    //   890: goto -> 843
    //   893: aload #4
    //   895: fconst_1
    //   896: invokevirtual setAlpha : (F)V
    //   899: goto -> 1017
    //   902: new android/content/res/ColorStateList
    //   905: astore #5
    //   907: aload #4
    //   909: bipush #6
    //   911: iaload
    //   912: istore_1
    //   913: aload #4
    //   915: bipush #7
    //   917: iaload
    //   918: istore_2
    //   919: aload #5
    //   921: iconst_2
    //   922: anewarray [I
    //   925: dup
    //   926: iconst_0
    //   927: iconst_1
    //   928: newarray int
    //   930: dup
    //   931: iconst_0
    //   932: ldc_w 16842912
    //   935: iastore
    //   936: aastore
    //   937: dup
    //   938: iconst_1
    //   939: iconst_0
    //   940: newarray int
    //   942: aastore
    //   943: iconst_2
    //   944: newarray int
    //   946: dup
    //   947: iconst_0
    //   948: iload_1
    //   949: iastore
    //   950: dup
    //   951: iconst_1
    //   952: iload_2
    //   953: iastore
    //   954: invokespecial <init> : ([[I[I)V
    //   957: iconst_0
    //   958: istore_1
    //   959: aload_0
    //   960: getfield k0 : Lcom/google/android/material/button/MaterialButtonToggleGroup;
    //   963: invokevirtual getChildCount : ()I
    //   966: istore_2
    //   967: aload_0
    //   968: getfield k0 : Lcom/google/android/material/button/MaterialButtonToggleGroup;
    //   971: astore #4
    //   973: iload_1
    //   974: iload_2
    //   975: if_icmpge -> 1009
    //   978: aload #4
    //   980: iload_1
    //   981: invokevirtual getChildAt : (I)Landroid/view/View;
    //   984: checkcast com/google/android/material/button/MaterialButton
    //   987: astore #4
    //   989: aload #4
    //   991: aload #5
    //   993: invokevirtual setStrokeColor : (Landroid/content/res/ColorStateList;)V
    //   996: aload #4
    //   998: aload #5
    //   1000: invokevirtual setTextColor : (Landroid/content/res/ColorStateList;)V
    //   1003: iinc #1, 1
    //   1006: goto -> 959
    //   1009: aload #4
    //   1011: ldc_w 0.7
    //   1014: invokevirtual setAlpha : (F)V
    //   1017: aload_0
    //   1018: getfield s0 : Lin/krosbits/musicolet/EqualizerActivity2;
    //   1021: getfield c0 : I
    //   1024: istore_1
    //   1025: aload_0
    //   1026: getfield k0 : Lcom/google/android/material/button/MaterialButtonToggleGroup;
    //   1029: astore #4
    //   1031: iload_1
    //   1032: iconst_1
    //   1033: if_icmpne -> 1046
    //   1036: aload #4
    //   1038: bipush #8
    //   1040: invokevirtual setVisibility : (I)V
    //   1043: goto -> 1052
    //   1046: aload #4
    //   1048: iconst_0
    //   1049: invokevirtual setVisibility : (I)V
    //   1052: aload_0
    //   1053: getfield r0 : Landroidx/constraintlayout/widget/Group;
    //   1056: iconst_0
    //   1057: invokevirtual setVisibility : (I)V
    //   1060: aload_0
    //   1061: getfield s0 : Lin/krosbits/musicolet/EqualizerActivity2;
    //   1064: invokevirtual q0 : ()V
    //   1067: aload_0
    //   1068: invokevirtual H0 : ()V
    //   1071: return
    //   1072: astore #4
    //   1074: aload #4
    //   1076: invokevirtual printStackTrace : ()V
    //   1079: return
    // Exception table:
    //   from	to	target	type
    //   17	137	1072	finally
    //   148	240	1072	finally
    //   245	299	1072	finally
    //   310	341	1072	finally
    //   343	381	1072	finally
    //   390	592	1072	finally
    //   604	642	1072	finally
    //   644	682	1072	finally
    //   688	737	1072	finally
    //   740	772	1072	finally
    //   772	800	1072	finally
    //   811	841	1072	finally
    //   843	851	1072	finally
    //   862	887	1072	finally
    //   893	899	1072	finally
    //   902	907	1072	finally
    //   919	957	1072	finally
    //   959	967	1072	finally
    //   978	1003	1072	finally
    //   1009	1017	1072	finally
    //   1017	1025	1072	finally
    //   1036	1043	1072	finally
    //   1046	1052	1072	finally
    //   1052	1071	1072	finally
  }
  
  public final void F0(int paramInt) {
    int i = this.l0.getCheckedButtonId();
    if (i == 2131296399) {
      if (MusicService.D0 == this.s0.p0())
        MusicService.N0.c(-paramInt); 
      Button button = this.m0;
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append(T(2131886647));
      stringBuilder.append("\n-");
      stringBuilder.append(paramInt);
      stringBuilder.append(" dB");
      button.setText(stringBuilder.toString());
      return;
    } 
    if (i == 2131296455) {
      if (MusicService.D0 == this.s0.p0())
        MusicService.N0.c(paramInt); 
      Button button = this.o0;
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append(T(2131886254));
      stringBuilder.append("\n+");
      stringBuilder.append(paramInt);
      stringBuilder.append(" dB");
      button.setText(stringBuilder.toString());
    } 
  }
  
  public final void G0() {
    int j = this.l0.getCheckedButtonId();
    int i = this.s0.p0();
    if (j == 2131296399) {
      int k = (int)this.p0.getValue();
      j = j50.a;
      x41.u(ga1.i(KjdXPYm.SkBQTU, i), k);
    } else if (j == 2131296455) {
      j = (int)this.p0.getValue();
      int k = j50.a;
      x41.u(ga1.i("k_i_vbg_", i), j);
    } 
    this.s0.q0();
  }
  
  public final void H0() {
    int i = this.s0.p0();
    int j = j50.a;
    String str2 = ga1.i("EQBBS_", i);
    j = (short)MyApplication.o().getInt(str2, 0);
    this.a0.setProgress(j);
    TextView textView2 = this.h0;
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(j / 10);
    stringBuilder.append("%");
    textView2.setText(stringBuilder.toString());
    String str1 = ga1.i("EQVS_", i);
    j = (short)MyApplication.o().getInt(str1, 0);
    this.b0.setProgress(j);
    TextView textView1 = this.i0;
    stringBuilder = new StringBuilder();
    stringBuilder.append(j / 10);
    stringBuilder.append("%");
    textView1.setText(stringBuilder.toString());
    i = j50.d(i);
    this.c0.setProgress(i);
    J0(i);
    K0();
    boolean bool = j50.s(this.s0.p0());
    MaterialButtonToggleGroup materialButtonToggleGroup = this.k0;
    if (bool) {
      materialButtonToggleGroup.g(2131296409, true);
    } else {
      materialButtonToggleGroup.g(2131296451, true);
    } 
    L0();
  }
  
  public final void I(Croller paramCroller, int paramInt, boolean paramBoolean) {
    int i = this.s0.p0();
    if (paramBoolean) {
      TextView textView;
      if (paramCroller == this.a0) {
        textView = this.h0;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(paramInt / 10);
        stringBuilder.append("%");
        textView.setText(stringBuilder.toString());
        if (MusicService.D0 == i)
          try {
            return;
          } finally {
            textView = null;
          }  
      } else if (textView == this.b0) {
        textView = this.i0;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(paramInt / 10);
        stringBuilder.append("%");
        textView.setText(stringBuilder.toString());
        if (MusicService.D0 == i)
          try {
            return;
          } finally {
            textView = null;
          }  
      } else if (textView == this.c0) {
        J0(paramInt);
      } 
    } 
  }
  
  public final void I0(ViewGroup paramViewGroup, View paramView) {
    Point point = new Point();
    D0(paramViewGroup, paramView.getParent(), paramView, point);
    int i = (int)(P().getResources().getDimension(2131165390) * 8.0F);
    if (paramViewGroup instanceof android.widget.ScrollView) {
      paramViewGroup.scrollBy(0, point.y - paramViewGroup.getScrollY() - i);
      return;
    } 
    if (paramViewGroup instanceof android.widget.HorizontalScrollView)
      paramViewGroup.scrollBy(point.x - paramViewGroup.getScrollX() - i, 0); 
  }
  
  public final void J0(int paramInt) {
    int i = 100;
    if (paramInt >= 100)
      if (paramInt > 100) {
        i = 200 - paramInt;
        paramInt = 100;
      } else {
        paramInt = 100;
      }  
    TextView textView = this.j0;
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(T(2131886726));
    stringBuilder.append(i);
    stringBuilder.append(", ");
    stringBuilder.append(T(2131887246));
    stringBuilder.append(paramInt);
    textView.setText(stringBuilder.toString());
  }
  
  public final void K0() {
    int j;
    int n;
    int i1 = this.s0.p0();
    int i = j50.a;
    String str = ga1.i("k_i_prmd_", i1);
    i = MyApplication.o().getInt(str, 0);
    str = ga1.i("k_i_vbg_", i1);
    int k = MyApplication.o().getInt(str, 2);
    str = ga1.i("k_i_hdrmg_", i1);
    int m = MyApplication.o().getInt(str, 6);
    float f = 1.0F;
    if (i == -1) {
      this.p0.setLayoutDirection(1);
      this.p0.setScaleX(-1.0F);
      j = m;
      if (m < 1)
        j = 1; 
      i = j;
      if (j > 30)
        i = 30; 
      ag0.z0(this.p0, 1.0F, 30.0F, i);
      this.p0.setEnabled(true);
      this.l0.g(2131296399, true);
      n = k;
      j = i;
    } else if (i == 0) {
      this.p0.setLayoutDirection(0);
      this.p0.setScaleX(1.0F);
      ag0.z0(this.p0, 0.0F, 1.0F, 0.0F);
      this.p0.setEnabled(false);
      this.l0.g(2131296423, true);
      n = k;
      j = m;
    } else {
      n = k;
      j = m;
      if (i == 1) {
        this.p0.setLayoutDirection(0);
        this.p0.setScaleX(1.0F);
        j = k;
        if (k > 9)
          j = 9; 
        i = j;
        if (j < 1)
          i = 1; 
        ag0.z0(this.p0, 1.0F, 9.0F, i);
        this.p0.setEnabled(true);
        this.l0.g(2131296455, true);
        j = m;
        n = i;
      } 
    } 
    Slider slider = this.p0;
    if (i1 != MusicService.D0 || !slider.isEnabled())
      f = 0.6F; 
    slider.setAlpha(f);
    Button button = this.m0;
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(T(2131886647));
    stringBuilder.append("\n-");
    stringBuilder.append(j);
    stringBuilder.append(" dB");
    button.setText(stringBuilder.toString());
    button = this.n0;
    stringBuilder = new StringBuilder();
    stringBuilder.append(T(2131886134));
    stringBuilder.append("\n0 dB");
    button.setText(stringBuilder.toString());
    button = this.o0;
    stringBuilder = new StringBuilder();
    stringBuilder.append(T(2131886254));
    stringBuilder.append("\n+");
    stringBuilder.append(n);
    stringBuilder.append(" dB");
    button.setText(stringBuilder.toString());
  }
  
  public final void L0() {
    try {
      if (this.s0.p0() == MusicService.D0) {
        int i = MyApplication.e().getStreamMaxVolume(3);
        int j = MyApplication.e().getStreamVolume(3);
        ag0.z0(this.q0, 0.0F, i, j);
        return;
      } 
    } finally {
      Exception exception = null;
    } 
    this.q0.setEnabled(false);
  }
  
  public final void e0(Context paramContext) {
    super.e0(paramContext);
    this.s0 = (EqualizerActivity2)paramContext;
  }
  
  public final View g0(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle) {
    View view = paramLayoutInflater.inflate(2131492990, paramViewGroup, false);
    this.a0 = (Croller)view.findViewById(2131296607);
    this.d0 = (TextView)view.findViewById(2131297703);
    this.e0 = (TextView)view.findViewById(2131297903);
    this.f0 = (TextView)view.findViewById(2131297701);
    this.g0 = (TextView)view.findViewById(2131297828);
    this.b0 = (Croller)view.findViewById(2131296618);
    this.c0 = (Croller)view.findViewById(2131296606);
    this.h0 = (TextView)view.findViewById(2131297704);
    this.i0 = (TextView)view.findViewById(2131297904);
    this.j0 = (TextView)view.findViewById(2131297702);
    this.k0 = (MaterialButtonToggleGroup)view.findViewById(2131297609);
    this.m0 = (Button)view.findViewById(2131296399);
    this.n0 = (Button)view.findViewById(2131296423);
    this.o0 = (Button)view.findViewById(2131296455);
    this.p0 = (Slider)view.findViewById(2131297439);
    this.l0 = (MaterialButtonToggleGroup)view.findViewById(2131297610);
    this.q0 = (Slider)view.findViewById(2131297442);
    this.r0 = (Group)view.findViewById(2131296771);
    this.m0.setSingleLine(false);
    this.n0.setSingleLine(false);
    this.o0.setSingleLine(false);
    MaterialButton materialButton1 = (MaterialButton)view.findViewById(2131296451);
    MaterialButton materialButton2 = (MaterialButton)view.findViewById(2131296409);
    materialButton1.setSingleLine(false);
    materialButton2.setSingleLine(false);
    try {
      H0();
    } finally {
      materialButton1 = null;
    } 
    this.b0.setOnCrollerChangeListener(this);
    this.c0.setOnCrollerChangeListener(this);
    this.l0.f(new a50(this, 0));
    this.k0.f(new a50(this, 1));
    this.p0.b(new sx1(2, this));
    this.p0.a(new b50(this));
    this.q0.a((cd)new Object());
    this.p0.setOnTouchListener(this);
    this.q0.setOnTouchListener(this);
    return view;
  }
  
  public final void j0() {
    this.s0 = null;
    this.t0.removeCallbacksAndMessages(null);
    this.I = true;
  }
  
  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent) {
    boolean bool2 = paramView instanceof Slider;
    boolean bool1 = false;
    if (bool2) {
      int j = paramMotionEvent.getActionMasked();
      int i = (int)paramMotionEvent.getX();
      paramMotionEvent.getY();
      Slider slider = (Slider)paramView;
      if (j == 0) {
        int k = i - slider.getTrackSidePadding();
        float f = slider.getTrackWidth();
        i = (int)((slider.getValue() - slider.getValueFrom()) * f / (slider.getValueTo() - slider.getValueFrom()));
        j = (int)(MyApplication.p * 30.0F);
        this.v0 = false;
        if (k < i - j) {
          slider.getParent().requestDisallowInterceptTouchEvent(false);
        } else if (k > i + j) {
          slider.getParent().requestDisallowInterceptTouchEvent(false);
        } else {
          ((ViewGroup)slider.getParent()).requestDisallowInterceptTouchEvent(true);
          this.v0 = true;
          bool1 = true;
          this.u0 = false;
        } 
        bool1 = false;
      } else {
        if (j == 2) {
          if (this.u0)
            return true; 
          if (this.v0) {
            bool1 = true;
          } else {
            try {
              ViewGroup viewGroup = (ViewGroup)slider.getParent();
              this.u0 = true;
              viewGroup.requestDisallowInterceptTouchEvent(false);
              viewGroup.onTouchEvent(paramMotionEvent);
            } finally {
              slider = null;
            } 
          } 
        } else if (j == 1 || j == 3) {
          bool1 = this.v0;
          slider.getParent().requestDisallowInterceptTouchEvent(true);
          this.v0 = false;
          this.u0 = false;
        } 
        if (bool1)
          slider.onTouchEvent(paramMotionEvent); 
      } 
    } else {
      return false;
    } 
    this.u0 = false;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\d50.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import com.google.android.material.textview.pJx.ybWnIKHovcRr;
import in.krosbits.android.widgets.AdvanceSeekbar;
import in.krosbits.android.widgets.SmartImageView;
import in.krosbits.android.widgets.SmartTextView;
import in.krosbits.musicolet.EqualizerActivity2;
import in.krosbits.musicolet.MusicService;
import in.krosbits.musicolet.MyApplication;
import java.util.ArrayList;
import org.json.JSONArray;

public class z40 extends ua0 implements AdapterView.OnItemSelectedListener, f3, SeekBar.OnSeekBarChangeListener, View.OnClickListener {
  public EqualizerActivity2 a0;
  
  public Spinner b0;
  
  public SmartImageView c0;
  
  public SmartImageView d0;
  
  public AdvanceSeekbar[] e0 = new AdvanceSeekbar[0];
  
  public TextView[] f0 = new TextView[0];
  
  public TextView[] g0 = new TextView[0];
  
  public int h0;
  
  public int i0;
  
  public int j0;
  
  public int k0;
  
  public boolean l0;
  
  public View m0;
  
  public SmartTextView n0;
  
  public int o0;
  
  public y40 p0;
  
  public final short D0(int paramInt) {
    return (short)(paramInt - Math.abs(this.h0));
  }
  
  public final void E0() {
    EqualizerActivity2 equalizerActivity2 = this.a0;
    if (equalizerActivity2 == null)
      return; 
    int i = equalizerActivity2.p0();
    try {
      return;
    } finally {
      equalizerActivity2 = null;
      equalizerActivity2.printStackTrace();
    } 
  }
  
  public final void F0(boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3) {
    // Byte code:
    //   0: aload_0
    //   1: iconst_1
    //   2: putfield l0 : Z
    //   5: aload_0
    //   6: getfield a0 : Lin/krosbits/musicolet/EqualizerActivity2;
    //   9: invokevirtual p0 : ()I
    //   12: aload_0
    //   13: getfield a0 : Lin/krosbits/musicolet/EqualizerActivity2;
    //   16: getfield c0 : I
    //   19: invokestatic i : (II)I
    //   22: istore #8
    //   24: aload_0
    //   25: iload #8
    //   27: putfield o0 : I
    //   30: aload_0
    //   31: getfield n0 : Lin/krosbits/android/widgets/SmartTextView;
    //   34: astore #16
    //   36: iload #8
    //   38: ifne -> 77
    //   41: new java/lang/StringBuilder
    //   44: dup
    //   45: invokespecial <init> : ()V
    //   48: astore #15
    //   50: aload #15
    //   52: invokestatic b : ()I
    //   55: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   58: pop
    //   59: aload #15
    //   61: ldc '*'
    //   63: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   66: pop
    //   67: aload #15
    //   69: invokevirtual toString : ()Ljava/lang/String;
    //   72: astore #15
    //   74: goto -> 84
    //   77: iload #8
    //   79: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   82: astore #15
    //   84: aload #16
    //   86: aload #15
    //   88: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   91: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   94: iload_1
    //   95: ifeq -> 138
    //   98: aload_0
    //   99: getfield a0 : Lin/krosbits/musicolet/EqualizerActivity2;
    //   102: getfield c0 : I
    //   105: istore #8
    //   107: aload_0
    //   108: getfield n0 : Lin/krosbits/android/widgets/SmartTextView;
    //   111: astore #15
    //   113: iload #8
    //   115: ifne -> 127
    //   118: aload #15
    //   120: iconst_0
    //   121: invokevirtual setVisibility : (I)V
    //   124: goto -> 134
    //   127: aload #15
    //   129: bipush #8
    //   131: invokevirtual setVisibility : (I)V
    //   134: aload_0
    //   135: invokevirtual J0 : ()V
    //   138: iload_2
    //   139: ifeq -> 1771
    //   142: aload_0
    //   143: invokevirtual P : ()Landroid/content/Context;
    //   146: invokestatic from : (Landroid/content/Context;)Landroid/view/LayoutInflater;
    //   149: astore #22
    //   151: aload_0
    //   152: iconst_1
    //   153: putfield j0 : I
    //   156: aload_0
    //   157: getfield k0 : I
    //   160: istore #8
    //   162: iload #8
    //   164: bipush #50
    //   166: irem
    //   167: ifne -> 179
    //   170: aload_0
    //   171: bipush #50
    //   173: putfield j0 : I
    //   176: goto -> 208
    //   179: iload #8
    //   181: bipush #10
    //   183: irem
    //   184: ifne -> 196
    //   187: aload_0
    //   188: bipush #10
    //   190: putfield j0 : I
    //   193: goto -> 208
    //   196: iload #8
    //   198: iconst_2
    //   199: irem
    //   200: ifne -> 208
    //   203: aload_0
    //   204: iconst_2
    //   205: putfield j0 : I
    //   208: aload_0
    //   209: getfield a0 : Lin/krosbits/musicolet/EqualizerActivity2;
    //   212: invokevirtual p0 : ()I
    //   215: aload_0
    //   216: getfield a0 : Lin/krosbits/musicolet/EqualizerActivity2;
    //   219: getfield c0 : I
    //   222: invokestatic i : (II)I
    //   225: istore #10
    //   227: iload #10
    //   229: ifne -> 240
    //   232: invokestatic l : ()[I
    //   235: astore #15
    //   237: goto -> 257
    //   240: iconst_2
    //   241: newarray int
    //   243: dup
    //   244: iconst_0
    //   245: sipush #-1500
    //   248: iastore
    //   249: dup
    //   250: iconst_1
    //   251: sipush #1500
    //   254: iastore
    //   255: astore #15
    //   257: aload #15
    //   259: iconst_0
    //   260: iaload
    //   261: istore #8
    //   263: aload_0
    //   264: iload #8
    //   266: putfield h0 : I
    //   269: aload_0
    //   270: aload #15
    //   272: iconst_1
    //   273: iaload
    //   274: putfield i0 : I
    //   277: iload #8
    //   279: invokestatic abs : (I)I
    //   282: istore #8
    //   284: aload_0
    //   285: aload_0
    //   286: getfield i0 : I
    //   289: invokestatic abs : (I)I
    //   292: iload #8
    //   294: iadd
    //   295: putfield k0 : I
    //   298: iload #10
    //   300: ifne -> 311
    //   303: invokestatic b : ()I
    //   306: istore #8
    //   308: goto -> 315
    //   311: iload #10
    //   313: istore #8
    //   315: aload_0
    //   316: getfield m0 : Landroid/view/View;
    //   319: ldc 2131296965
    //   321: invokevirtual findViewById : (I)Landroid/view/View;
    //   324: checkcast android/widget/LinearLayout
    //   327: astore #16
    //   329: aload_0
    //   330: getfield m0 : Landroid/view/View;
    //   333: ldc 2131296733
    //   335: invokevirtual findViewById : (I)Landroid/view/View;
    //   338: checkcast android/widget/FrameLayout
    //   341: astore #15
    //   343: aload #15
    //   345: ifnull -> 353
    //   348: aload #15
    //   350: invokevirtual removeAllViews : ()V
    //   353: aload #16
    //   355: ifnull -> 363
    //   358: aload #16
    //   360: invokevirtual removeAllViews : ()V
    //   363: aload #16
    //   365: ifnonnull -> 571
    //   368: iload #8
    //   370: bipush #8
    //   372: if_icmplt -> 424
    //   375: aload_0
    //   376: invokevirtual P : ()Landroid/content/Context;
    //   379: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   382: invokevirtual getConfiguration : ()Landroid/content/res/Configuration;
    //   385: astore #16
    //   387: aload #16
    //   389: getfield screenWidthDp : I
    //   392: istore #9
    //   394: iload #9
    //   396: iload #8
    //   398: bipush #38
    //   400: imul
    //   401: if_icmpge -> 424
    //   404: aload #16
    //   406: getfield screenHeightDp : I
    //   409: sipush #261
    //   412: isub
    //   413: iload #9
    //   415: if_icmple -> 424
    //   418: iconst_0
    //   419: istore #9
    //   421: goto -> 427
    //   424: iconst_1
    //   425: istore #9
    //   427: new android/widget/LinearLayout
    //   430: dup
    //   431: aload_0
    //   432: invokevirtual P : ()Landroid/content/Context;
    //   435: invokespecial <init> : (Landroid/content/Context;)V
    //   438: astore #16
    //   440: iload #9
    //   442: ifeq -> 508
    //   445: new android/widget/FrameLayout$LayoutParams
    //   448: dup
    //   449: bipush #-2
    //   451: iconst_m1
    //   452: invokespecial <init> : (II)V
    //   455: astore #18
    //   457: aload #18
    //   459: bipush #17
    //   461: putfield gravity : I
    //   464: aload #22
    //   466: ldc 2131492983
    //   468: aload #15
    //   470: iconst_0
    //   471: invokevirtual inflate : (ILandroid/view/ViewGroup;Z)Landroid/view/View;
    //   474: checkcast android/widget/HorizontalScrollView
    //   477: astore #17
    //   479: aload #15
    //   481: aload #17
    //   483: aload #18
    //   485: invokevirtual addView : (Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    //   488: aload #17
    //   490: aload #16
    //   492: new android/widget/FrameLayout$LayoutParams
    //   495: dup
    //   496: bipush #-2
    //   498: iconst_m1
    //   499: invokespecial <init> : (II)V
    //   502: invokevirtual addView : (Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    //   505: goto -> 568
    //   508: new android/widget/FrameLayout$LayoutParams
    //   511: dup
    //   512: iconst_m1
    //   513: bipush #-2
    //   515: invokespecial <init> : (II)V
    //   518: astore #17
    //   520: aload #17
    //   522: bipush #17
    //   524: putfield gravity : I
    //   527: aload #22
    //   529: ldc 2131492984
    //   531: aload #15
    //   533: iconst_0
    //   534: invokevirtual inflate : (ILandroid/view/ViewGroup;Z)Landroid/view/View;
    //   537: checkcast android/widget/ScrollView
    //   540: astore #18
    //   542: aload #15
    //   544: aload #18
    //   546: aload #17
    //   548: invokevirtual addView : (Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    //   551: aload #18
    //   553: aload #16
    //   555: new android/widget/FrameLayout$LayoutParams
    //   558: dup
    //   559: iconst_m1
    //   560: bipush #-2
    //   562: invokespecial <init> : (II)V
    //   565: invokevirtual addView : (Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    //   568: goto -> 574
    //   571: iconst_1
    //   572: istore #9
    //   574: aload_0
    //   575: invokevirtual S : ()Landroid/content/res/Resources;
    //   578: ldc 2131165391
    //   580: invokevirtual getDimension : (I)F
    //   583: f2i
    //   584: istore #14
    //   586: aload_0
    //   587: invokevirtual S : ()Landroid/content/res/Resources;
    //   590: ldc 2131165390
    //   592: invokevirtual getDimension : (I)F
    //   595: fstore #7
    //   597: iload #8
    //   599: bipush #6
    //   601: if_icmple -> 611
    //   604: ldc 4.0
    //   606: fstore #6
    //   608: goto -> 628
    //   611: iload #8
    //   613: iconst_3
    //   614: if_icmple -> 624
    //   617: ldc 12.0
    //   619: fstore #6
    //   621: goto -> 628
    //   624: ldc 18.0
    //   626: fstore #6
    //   628: fload #7
    //   630: fload #6
    //   632: fmul
    //   633: f2i
    //   634: istore #12
    //   636: aload_0
    //   637: invokevirtual S : ()Landroid/content/res/Resources;
    //   640: ldc 2131165390
    //   642: invokevirtual getDimension : (I)F
    //   645: fconst_2
    //   646: fmul
    //   647: f2i
    //   648: istore #11
    //   650: aload_0
    //   651: invokevirtual S : ()Landroid/content/res/Resources;
    //   654: ldc 2131165390
    //   656: invokevirtual getDimension : (I)F
    //   659: f2i
    //   660: istore #13
    //   662: aload #15
    //   664: ifnull -> 752
    //   667: aload_0
    //   668: getfield m0 : Landroid/view/View;
    //   671: astore #15
    //   673: aload #15
    //   675: instanceof androidx/constraintlayout/widget/ConstraintLayout
    //   678: ifeq -> 752
    //   681: aload #15
    //   683: checkcast androidx/constraintlayout/widget/ConstraintLayout
    //   686: astore #17
    //   688: new pq
    //   691: dup
    //   692: invokespecial <init> : ()V
    //   695: astore #15
    //   697: aload #15
    //   699: aload #17
    //   701: invokevirtual c : (Landroidx/constraintlayout/widget/ConstraintLayout;)V
    //   704: iload #9
    //   706: ifeq -> 731
    //   709: aload #15
    //   711: ldc 2131296733
    //   713: invokevirtual g : (I)Lkq;
    //   716: getfield d : Llq;
    //   719: iload #13
    //   721: sipush #512
    //   724: imul
    //   725: putfield a0 : I
    //   728: goto -> 745
    //   731: aload #15
    //   733: ldc 2131296733
    //   735: invokevirtual g : (I)Lkq;
    //   738: getfield d : Llq;
    //   741: iconst_0
    //   742: putfield a0 : I
    //   745: aload #15
    //   747: aload #17
    //   749: invokevirtual a : (Landroidx/constraintlayout/widget/ConstraintLayout;)V
    //   752: aload_0
    //   753: iload #8
    //   755: anewarray in/krosbits/android/widgets/AdvanceSeekbar
    //   758: putfield e0 : [Lin/krosbits/android/widgets/AdvanceSeekbar;
    //   761: aload_0
    //   762: iload #8
    //   764: anewarray android/widget/TextView
    //   767: putfield f0 : [Landroid/widget/TextView;
    //   770: aload_0
    //   771: iload #8
    //   773: anewarray android/widget/TextView
    //   776: putfield g0 : [Landroid/widget/TextView;
    //   779: iload #9
    //   781: ifeq -> 805
    //   784: aload #16
    //   786: iconst_0
    //   787: invokevirtual setOrientation : (I)V
    //   790: new android/widget/LinearLayout$LayoutParams
    //   793: dup
    //   794: bipush #-2
    //   796: iconst_m1
    //   797: invokespecial <init> : (II)V
    //   800: astore #17
    //   802: goto -> 823
    //   805: aload #16
    //   807: iconst_1
    //   808: invokevirtual setOrientation : (I)V
    //   811: new android/widget/LinearLayout$LayoutParams
    //   814: dup
    //   815: iconst_m1
    //   816: bipush #-2
    //   818: invokespecial <init> : (II)V
    //   821: astore #17
    //   823: iload #9
    //   825: ifeq -> 861
    //   828: new android/widget/LinearLayout$LayoutParams
    //   831: dup
    //   832: bipush #-2
    //   834: bipush #-2
    //   836: invokespecial <init> : (II)V
    //   839: astore #18
    //   841: aload #18
    //   843: iconst_1
    //   844: putfield gravity : I
    //   847: aload #18
    //   849: iload #11
    //   851: iconst_0
    //   852: iload #11
    //   854: iconst_0
    //   855: invokevirtual setMargins : (IIII)V
    //   858: goto -> 895
    //   861: new android/widget/LinearLayout$LayoutParams
    //   864: dup
    //   865: iload #13
    //   867: bipush #48
    //   869: imul
    //   870: bipush #-2
    //   872: invokespecial <init> : (II)V
    //   875: astore #18
    //   877: aload #18
    //   879: bipush #16
    //   881: putfield gravity : I
    //   884: aload #18
    //   886: iconst_0
    //   887: iload #11
    //   889: iconst_0
    //   890: iload #11
    //   892: invokevirtual setMargins : (IIII)V
    //   895: iload #9
    //   897: ifeq -> 947
    //   900: new android/widget/LinearLayout$LayoutParams
    //   903: dup
    //   904: bipush #-2
    //   906: iconst_0
    //   907: invokespecial <init> : (II)V
    //   910: astore #19
    //   912: iload #14
    //   914: iconst_2
    //   915: idiv
    //   916: istore #13
    //   918: aload #19
    //   920: iload #13
    //   922: putfield bottomMargin : I
    //   925: aload #19
    //   927: iload #13
    //   929: putfield topMargin : I
    //   932: aload #19
    //   934: fconst_1
    //   935: putfield weight : F
    //   938: aload #19
    //   940: iconst_1
    //   941: putfield gravity : I
    //   944: goto -> 992
    //   947: new android/widget/LinearLayout$LayoutParams
    //   950: dup
    //   951: iconst_0
    //   952: bipush #-2
    //   954: invokespecial <init> : (II)V
    //   957: astore #19
    //   959: iload #14
    //   961: iconst_2
    //   962: idiv
    //   963: istore #13
    //   965: aload #19
    //   967: iload #13
    //   969: putfield rightMargin : I
    //   972: aload #19
    //   974: iload #13
    //   976: putfield leftMargin : I
    //   979: aload #19
    //   981: fconst_1
    //   982: putfield weight : F
    //   985: aload #19
    //   987: bipush #16
    //   989: putfield gravity : I
    //   992: iload #10
    //   994: ifne -> 1140
    //   997: getstatic j50.h : Lorg/json/JSONArray;
    //   1000: ifnonnull -> 1078
    //   1003: invokestatic o : ()Landroid/content/SharedPreferences;
    //   1006: ldc_w 'SEQCF'
    //   1009: aconst_null
    //   1010: invokeinterface getString : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   1015: astore #20
    //   1017: aload #20
    //   1019: astore #15
    //   1021: aload #20
    //   1023: ifnonnull -> 1053
    //   1026: invokestatic z : ()V
    //   1029: invokestatic o : ()Landroid/content/SharedPreferences;
    //   1032: ldc_w 'SEQCF'
    //   1035: ldc_w '[]'
    //   1038: invokeinterface getString : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   1043: astore #15
    //   1045: goto -> 1053
    //   1048: astore #15
    //   1050: goto -> 1073
    //   1053: new org/json/JSONArray
    //   1056: astore #20
    //   1058: aload #20
    //   1060: aload #15
    //   1062: invokespecial <init> : (Ljava/lang/String;)V
    //   1065: aload #20
    //   1067: putstatic j50.h : Lorg/json/JSONArray;
    //   1070: goto -> 1078
    //   1073: aload #15
    //   1075: invokevirtual printStackTrace : ()V
    //   1078: getstatic j50.h : Lorg/json/JSONArray;
    //   1081: invokevirtual length : ()I
    //   1084: istore #13
    //   1086: iload #13
    //   1088: newarray float
    //   1090: astore #15
    //   1092: iconst_0
    //   1093: istore #10
    //   1095: aload #15
    //   1097: astore #20
    //   1099: iload #10
    //   1101: iload #13
    //   1103: if_icmpge -> 1147
    //   1106: aload #15
    //   1108: iload #10
    //   1110: getstatic j50.h : Lorg/json/JSONArray;
    //   1113: iload #10
    //   1115: invokevirtual getInt : (I)I
    //   1118: i2f
    //   1119: ldc_w 1000.0
    //   1122: fdiv
    //   1123: fastore
    //   1124: goto -> 1134
    //   1127: astore #20
    //   1129: aload #20
    //   1131: invokevirtual printStackTrace : ()V
    //   1134: iinc #10, 1
    //   1137: goto -> 1095
    //   1140: iload #10
    //   1142: invokestatic a : (I)[F
    //   1145: astore #20
    //   1147: iconst_0
    //   1148: istore #10
    //   1150: iload #10
    //   1152: iload #8
    //   1154: if_icmpge -> 1739
    //   1157: new android/widget/LinearLayout
    //   1160: dup
    //   1161: aload_0
    //   1162: invokevirtual P : ()Landroid/content/Context;
    //   1165: invokespecial <init> : (Landroid/content/Context;)V
    //   1168: astore #23
    //   1170: iload #9
    //   1172: ifeq -> 1184
    //   1175: aload #23
    //   1177: iconst_1
    //   1178: invokevirtual setOrientation : (I)V
    //   1181: goto -> 1190
    //   1184: aload #23
    //   1186: iconst_0
    //   1187: invokevirtual setOrientation : (I)V
    //   1190: aload_0
    //   1191: getfield f0 : [Landroid/widget/TextView;
    //   1194: iload #10
    //   1196: new android/widget/TextView
    //   1199: dup
    //   1200: aload_0
    //   1201: invokevirtual P : ()Landroid/content/Context;
    //   1204: invokespecial <init> : (Landroid/content/Context;)V
    //   1207: aastore
    //   1208: iload #9
    //   1210: ifeq -> 1230
    //   1213: aload_0
    //   1214: getfield f0 : [Landroid/widget/TextView;
    //   1217: iload #10
    //   1219: aaload
    //   1220: iconst_0
    //   1221: iload #11
    //   1223: iconst_4
    //   1224: imul
    //   1225: iconst_0
    //   1226: iconst_0
    //   1227: invokevirtual setPadding : (IIII)V
    //   1230: aload_0
    //   1231: getfield f0 : [Landroid/widget/TextView;
    //   1234: iload #10
    //   1236: aaload
    //   1237: bipush #17
    //   1239: invokevirtual setGravity : (I)V
    //   1242: aload_0
    //   1243: getfield f0 : [Landroid/widget/TextView;
    //   1246: iload #10
    //   1248: aaload
    //   1249: astore #24
    //   1251: aload #20
    //   1253: iload #10
    //   1255: faload
    //   1256: f2d
    //   1257: dstore #4
    //   1259: getstatic ag0.a : Ljava/lang/String;
    //   1262: astore #15
    //   1264: dload #4
    //   1266: ldc2_w 1000.0
    //   1269: dcmpl
    //   1270: iflt -> 1314
    //   1273: dload #4
    //   1275: ldc2_w 1000.0
    //   1278: ddiv
    //   1279: dstore #4
    //   1281: dload #4
    //   1283: ldc2_w 1000.0
    //   1286: dcmpl
    //   1287: iflt -> 1306
    //   1290: dload #4
    //   1292: ldc2_w 1000.0
    //   1295: ddiv
    //   1296: dstore #4
    //   1298: getstatic androidx/work/impl/utils/qnuS/eRUgfgGAccgka.aURm : Ljava/lang/String;
    //   1301: astore #15
    //   1303: goto -> 1322
    //   1306: ldc_w ' k'
    //   1309: astore #15
    //   1311: goto -> 1303
    //   1314: ldc_w ' '
    //   1317: astore #15
    //   1319: goto -> 1303
    //   1322: getstatic java/util/Locale.ENGLISH : Ljava/util/Locale;
    //   1325: astore #25
    //   1327: dload #4
    //   1329: ldc2_w 10.0
    //   1332: dmul
    //   1333: ldc2_w 10.0
    //   1336: drem
    //   1337: dconst_0
    //   1338: dcmpl
    //   1339: ifeq -> 1350
    //   1342: ldc_w '%.1f'
    //   1345: astore #21
    //   1347: goto -> 1358
    //   1350: ldc_w '%.0f'
    //   1353: astore #21
    //   1355: goto -> 1347
    //   1358: aload #24
    //   1360: aload #25
    //   1362: aload #21
    //   1364: aload #15
    //   1366: invokevirtual concat : (Ljava/lang/String;)Ljava/lang/String;
    //   1369: iconst_1
    //   1370: anewarray java/lang/Object
    //   1373: dup
    //   1374: iconst_0
    //   1375: dload #4
    //   1377: invokestatic valueOf : (D)Ljava/lang/Double;
    //   1380: aastore
    //   1381: invokestatic format : (Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   1384: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   1387: aload_0
    //   1388: getfield f0 : [Landroid/widget/TextView;
    //   1391: iload #10
    //   1393: aaload
    //   1394: iconst_1
    //   1395: ldc 12.0
    //   1397: invokevirtual setTextSize : (IF)V
    //   1400: aload_0
    //   1401: getfield f0 : [Landroid/widget/TextView;
    //   1404: iload #10
    //   1406: aaload
    //   1407: aload_0
    //   1408: invokevirtual P : ()Landroid/content/Context;
    //   1411: ldc_w 2130969899
    //   1414: invokestatic z : (Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;
    //   1417: invokevirtual setBackground : (Landroid/graphics/drawable/Drawable;)V
    //   1420: aload_0
    //   1421: getfield f0 : [Landroid/widget/TextView;
    //   1424: iload #10
    //   1426: aaload
    //   1427: iload #10
    //   1429: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1432: invokevirtual setTag : (Ljava/lang/Object;)V
    //   1435: aload_0
    //   1436: getfield f0 : [Landroid/widget/TextView;
    //   1439: iload #10
    //   1441: aaload
    //   1442: aload_0
    //   1443: invokevirtual setOnClickListener : (Landroid/view/View$OnClickListener;)V
    //   1446: aload #23
    //   1448: aload_0
    //   1449: getfield f0 : [Landroid/widget/TextView;
    //   1452: iload #10
    //   1454: aaload
    //   1455: aload #18
    //   1457: invokevirtual addView : (Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    //   1460: aload_0
    //   1461: getfield g0 : [Landroid/widget/TextView;
    //   1464: iload #10
    //   1466: new android/widget/TextView
    //   1469: dup
    //   1470: aload_0
    //   1471: invokevirtual P : ()Landroid/content/Context;
    //   1474: invokespecial <init> : (Landroid/content/Context;)V
    //   1477: aastore
    //   1478: aload_0
    //   1479: getfield g0 : [Landroid/widget/TextView;
    //   1482: iload #10
    //   1484: aaload
    //   1485: bipush #17
    //   1487: invokevirtual setGravity : (I)V
    //   1490: aload_0
    //   1491: getfield g0 : [Landroid/widget/TextView;
    //   1494: iload #10
    //   1496: aaload
    //   1497: iconst_1
    //   1498: ldc 12.0
    //   1500: invokevirtual setTextSize : (IF)V
    //   1503: aload_0
    //   1504: getfield g0 : [Landroid/widget/TextView;
    //   1507: iload #10
    //   1509: aaload
    //   1510: aload_0
    //   1511: invokevirtual P : ()Landroid/content/Context;
    //   1514: ldc_w 2130969899
    //   1517: invokestatic z : (Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;
    //   1520: invokevirtual setBackground : (Landroid/graphics/drawable/Drawable;)V
    //   1523: aload_0
    //   1524: getfield g0 : [Landroid/widget/TextView;
    //   1527: iload #10
    //   1529: aaload
    //   1530: iload #10
    //   1532: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1535: invokevirtual setTag : (Ljava/lang/Object;)V
    //   1538: aload_0
    //   1539: getfield g0 : [Landroid/widget/TextView;
    //   1542: iload #10
    //   1544: aaload
    //   1545: aload_0
    //   1546: invokevirtual setOnClickListener : (Landroid/view/View$OnClickListener;)V
    //   1549: iload #9
    //   1551: ifeq -> 1568
    //   1554: aload #23
    //   1556: aload_0
    //   1557: getfield g0 : [Landroid/widget/TextView;
    //   1560: iload #10
    //   1562: aaload
    //   1563: aload #18
    //   1565: invokevirtual addView : (Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    //   1568: iload #9
    //   1570: ifeq -> 1589
    //   1573: aload #22
    //   1575: ldc_w 2131493067
    //   1578: aload #23
    //   1580: iconst_0
    //   1581: invokevirtual inflate : (ILandroid/view/ViewGroup;Z)Landroid/view/View;
    //   1584: astore #15
    //   1586: goto -> 1602
    //   1589: aload #22
    //   1591: ldc_w 2131493054
    //   1594: aload #23
    //   1596: iconst_0
    //   1597: invokevirtual inflate : (ILandroid/view/ViewGroup;Z)Landroid/view/View;
    //   1600: astore #15
    //   1602: aload_0
    //   1603: getfield e0 : [Lin/krosbits/android/widgets/AdvanceSeekbar;
    //   1606: iload #10
    //   1608: aload #15
    //   1610: ldc_w 2131297963
    //   1613: invokevirtual findViewById : (I)Landroid/view/View;
    //   1616: checkcast in/krosbits/android/widgets/AdvanceSeekbar
    //   1619: aastore
    //   1620: aload_0
    //   1621: getfield e0 : [Lin/krosbits/android/widgets/AdvanceSeekbar;
    //   1624: iload #10
    //   1626: aaload
    //   1627: aload_0
    //   1628: getfield k0 : I
    //   1631: invokevirtual setMax : (I)V
    //   1634: aload_0
    //   1635: getfield e0 : [Lin/krosbits/android/widgets/AdvanceSeekbar;
    //   1638: iload #10
    //   1640: aaload
    //   1641: iload #10
    //   1643: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1646: invokevirtual setTag : (Ljava/lang/Object;)V
    //   1649: aload_0
    //   1650: getfield e0 : [Lin/krosbits/android/widgets/AdvanceSeekbar;
    //   1653: iload #10
    //   1655: aaload
    //   1656: astore #21
    //   1658: aload #21
    //   1660: aload #21
    //   1662: invokevirtual getPaddingLeft : ()I
    //   1665: iload #12
    //   1667: aload_0
    //   1668: getfield e0 : [Lin/krosbits/android/widgets/AdvanceSeekbar;
    //   1671: iload #10
    //   1673: aaload
    //   1674: invokevirtual getPaddingRight : ()I
    //   1677: iload #12
    //   1679: invokevirtual setPadding : (IIII)V
    //   1682: aload_0
    //   1683: getfield e0 : [Lin/krosbits/android/widgets/AdvanceSeekbar;
    //   1686: iload #10
    //   1688: aaload
    //   1689: aload_0
    //   1690: getfield j0 : I
    //   1693: invokevirtual setProgressStepIncreaseValue : (I)V
    //   1696: aload #23
    //   1698: aload #15
    //   1700: aload #19
    //   1702: invokevirtual addView : (Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    //   1705: iload #9
    //   1707: ifne -> 1724
    //   1710: aload #23
    //   1712: aload_0
    //   1713: getfield g0 : [Landroid/widget/TextView;
    //   1716: iload #10
    //   1718: aaload
    //   1719: aload #18
    //   1721: invokevirtual addView : (Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    //   1724: aload #16
    //   1726: aload #23
    //   1728: aload #17
    //   1730: invokevirtual addView : (Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    //   1733: iinc #10, 1
    //   1736: goto -> 1150
    //   1739: iconst_0
    //   1740: istore #8
    //   1742: aload_0
    //   1743: getfield e0 : [Lin/krosbits/android/widgets/AdvanceSeekbar;
    //   1746: astore #15
    //   1748: iload #8
    //   1750: aload #15
    //   1752: arraylength
    //   1753: if_icmpge -> 1771
    //   1756: aload #15
    //   1758: iload #8
    //   1760: aaload
    //   1761: aload_0
    //   1762: invokevirtual setOnSeekBarChangeListener : (Landroid/widget/SeekBar$OnSeekBarChangeListener;)V
    //   1765: iinc #8, 1
    //   1768: goto -> 1742
    //   1771: iload_3
    //   1772: ifeq -> 2111
    //   1775: getstatic m92.h : [I
    //   1778: astore #15
    //   1780: aload_0
    //   1781: getfield a0 : Lin/krosbits/musicolet/EqualizerActivity2;
    //   1784: invokevirtual p0 : ()I
    //   1787: istore #8
    //   1789: aload #15
    //   1791: iconst_5
    //   1792: iaload
    //   1793: istore #10
    //   1795: iload #8
    //   1797: getstatic in/krosbits/musicolet/MusicService.D0 : I
    //   1800: if_icmpne -> 1914
    //   1803: iload #8
    //   1805: invokestatic r : (I)Z
    //   1808: ifeq -> 1914
    //   1811: aload_0
    //   1812: getfield n0 : Lin/krosbits/android/widgets/SmartTextView;
    //   1815: iconst_5
    //   1816: invokevirtual setCompoundDrawableColorIndex : (I)V
    //   1819: aload_0
    //   1820: getfield n0 : Lin/krosbits/android/widgets/SmartTextView;
    //   1823: iconst_5
    //   1824: invokevirtual setTextTintIndex : (I)V
    //   1827: aload_0
    //   1828: getfield c0 : Lin/krosbits/android/widgets/SmartImageView;
    //   1831: iconst_5
    //   1832: invokevirtual setColorTintIndex : (I)V
    //   1835: aload_0
    //   1836: getfield d0 : Lin/krosbits/android/widgets/SmartImageView;
    //   1839: iconst_5
    //   1840: invokevirtual setColorTintIndex : (I)V
    //   1843: iconst_0
    //   1844: istore #8
    //   1846: aload_0
    //   1847: getfield e0 : [Lin/krosbits/android/widgets/AdvanceSeekbar;
    //   1850: astore #16
    //   1852: iload #10
    //   1854: istore #9
    //   1856: iload #8
    //   1858: aload #16
    //   1860: arraylength
    //   1861: if_icmpge -> 2019
    //   1864: aload #16
    //   1866: iload #8
    //   1868: aaload
    //   1869: iconst_1
    //   1870: invokevirtual setSelfEnabled : (Z)V
    //   1873: aload_0
    //   1874: getfield f0 : [Landroid/widget/TextView;
    //   1877: iload #8
    //   1879: aaload
    //   1880: aload #15
    //   1882: bipush #6
    //   1884: iaload
    //   1885: invokevirtual setTextColor : (I)V
    //   1888: aload_0
    //   1889: getfield g0 : [Landroid/widget/TextView;
    //   1892: iload #8
    //   1894: aaload
    //   1895: aload #15
    //   1897: bipush #6
    //   1899: iaload
    //   1900: invokevirtual setTextColor : (I)V
    //   1903: iinc #8, 1
    //   1906: goto -> 1846
    //   1909: astore #15
    //   1911: goto -> 2106
    //   1914: aload_0
    //   1915: getfield n0 : Lin/krosbits/android/widgets/SmartTextView;
    //   1918: bipush #7
    //   1920: invokevirtual setCompoundDrawableColorIndex : (I)V
    //   1923: aload_0
    //   1924: getfield n0 : Lin/krosbits/android/widgets/SmartTextView;
    //   1927: bipush #7
    //   1929: invokevirtual setTextTintIndex : (I)V
    //   1932: aload_0
    //   1933: getfield c0 : Lin/krosbits/android/widgets/SmartImageView;
    //   1936: bipush #7
    //   1938: invokevirtual setColorTintIndex : (I)V
    //   1941: aload_0
    //   1942: getfield d0 : Lin/krosbits/android/widgets/SmartImageView;
    //   1945: bipush #7
    //   1947: invokevirtual setColorTintIndex : (I)V
    //   1950: iconst_0
    //   1951: istore #8
    //   1953: aload_0
    //   1954: getfield e0 : [Lin/krosbits/android/widgets/AdvanceSeekbar;
    //   1957: astore #16
    //   1959: iload #8
    //   1961: aload #16
    //   1963: arraylength
    //   1964: if_icmpge -> 2012
    //   1967: aload #16
    //   1969: iload #8
    //   1971: aaload
    //   1972: iconst_0
    //   1973: invokevirtual setSelfEnabled : (Z)V
    //   1976: aload_0
    //   1977: getfield f0 : [Landroid/widget/TextView;
    //   1980: iload #8
    //   1982: aaload
    //   1983: aload #15
    //   1985: bipush #7
    //   1987: iaload
    //   1988: invokevirtual setTextColor : (I)V
    //   1991: aload_0
    //   1992: getfield g0 : [Landroid/widget/TextView;
    //   1995: iload #8
    //   1997: aaload
    //   1998: aload #15
    //   2000: bipush #7
    //   2002: iaload
    //   2003: invokevirtual setTextColor : (I)V
    //   2006: iinc #8, 1
    //   2009: goto -> 1953
    //   2012: aload #15
    //   2014: bipush #7
    //   2016: iaload
    //   2017: istore #9
    //   2019: aload_0
    //   2020: invokevirtual P : ()Landroid/content/Context;
    //   2023: iload #9
    //   2025: iconst_0
    //   2026: invokestatic U : (Landroid/content/Context;II)Landroid/graphics/drawable/StateListDrawable;
    //   2029: astore #17
    //   2031: aload_0
    //   2032: invokevirtual P : ()Landroid/content/Context;
    //   2035: iload #9
    //   2037: iconst_0
    //   2038: invokestatic U : (Landroid/content/Context;II)Landroid/graphics/drawable/StateListDrawable;
    //   2041: astore #18
    //   2043: aload_0
    //   2044: invokevirtual P : ()Landroid/content/Context;
    //   2047: iload #9
    //   2049: iconst_0
    //   2050: invokestatic U : (Landroid/content/Context;II)Landroid/graphics/drawable/StateListDrawable;
    //   2053: astore #15
    //   2055: aload_0
    //   2056: invokevirtual P : ()Landroid/content/Context;
    //   2059: iload #9
    //   2061: iconst_0
    //   2062: invokestatic U : (Landroid/content/Context;II)Landroid/graphics/drawable/StateListDrawable;
    //   2065: astore #16
    //   2067: aload_0
    //   2068: getfield n0 : Lin/krosbits/android/widgets/SmartTextView;
    //   2071: aload #17
    //   2073: invokevirtual setBackground : (Landroid/graphics/drawable/Drawable;)V
    //   2076: aload_0
    //   2077: getfield b0 : Landroid/widget/Spinner;
    //   2080: aload #18
    //   2082: invokevirtual setBackground : (Landroid/graphics/drawable/Drawable;)V
    //   2085: aload_0
    //   2086: getfield c0 : Lin/krosbits/android/widgets/SmartImageView;
    //   2089: aload #15
    //   2091: invokevirtual setBackground : (Landroid/graphics/drawable/Drawable;)V
    //   2094: aload_0
    //   2095: getfield d0 : Lin/krosbits/android/widgets/SmartImageView;
    //   2098: aload #16
    //   2100: invokevirtual setBackground : (Landroid/graphics/drawable/Drawable;)V
    //   2103: goto -> 2111
    //   2106: aload #15
    //   2108: invokevirtual printStackTrace : ()V
    //   2111: aload_0
    //   2112: getfield o0 : I
    //   2115: invokestatic m : (I)Ljava/util/ArrayList;
    //   2118: astore #15
    //   2120: aload_0
    //   2121: getfield o0 : I
    //   2124: invokestatic o : (I)Ljava/util/ArrayList;
    //   2127: astore #16
    //   2129: aload_0
    //   2130: getfield a0 : Lin/krosbits/musicolet/EqualizerActivity2;
    //   2133: invokevirtual p0 : ()I
    //   2136: istore #10
    //   2138: iload #10
    //   2140: aload_0
    //   2141: getfield o0 : I
    //   2144: invokestatic k : (II)I
    //   2147: istore #9
    //   2149: iload #9
    //   2151: istore #8
    //   2153: iload #9
    //   2155: aload_0
    //   2156: getfield p0 : Ly40;
    //   2159: invokevirtual getCount : ()I
    //   2162: if_icmplt -> 2176
    //   2165: aload_0
    //   2166: getfield p0 : Ly40;
    //   2169: invokevirtual getCount : ()I
    //   2172: iconst_1
    //   2173: isub
    //   2174: istore #8
    //   2176: aload_0
    //   2177: getfield b0 : Landroid/widget/Spinner;
    //   2180: invokevirtual getSelectedItemPosition : ()I
    //   2183: iload #8
    //   2185: if_icmpeq -> 2197
    //   2188: aload_0
    //   2189: getfield b0 : Landroid/widget/Spinner;
    //   2192: iload #8
    //   2194: invokevirtual setSelection : (I)V
    //   2197: iload #8
    //   2199: aload #15
    //   2201: invokevirtual size : ()I
    //   2204: if_icmpge -> 2222
    //   2207: aload #15
    //   2209: iload #8
    //   2211: invokevirtual get : (I)Ljava/lang/Object;
    //   2214: checkcast ea1
    //   2217: astore #15
    //   2219: goto -> 2266
    //   2222: iload #8
    //   2224: aload #15
    //   2226: invokevirtual size : ()I
    //   2229: if_icmpne -> 2246
    //   2232: iload #10
    //   2234: aload_0
    //   2235: getfield o0 : I
    //   2238: invokestatic e : (II)Lea1;
    //   2241: astore #15
    //   2243: goto -> 2266
    //   2246: aload #16
    //   2248: iload #8
    //   2250: aload #15
    //   2252: invokevirtual size : ()I
    //   2255: isub
    //   2256: iconst_1
    //   2257: isub
    //   2258: invokevirtual get : (I)Ljava/lang/Object;
    //   2261: checkcast ea1
    //   2264: astore #15
    //   2266: iconst_0
    //   2267: istore #8
    //   2269: aload_0
    //   2270: getfield e0 : [Lin/krosbits/android/widgets/AdvanceSeekbar;
    //   2273: astore #16
    //   2275: iload #8
    //   2277: aload #16
    //   2279: arraylength
    //   2280: if_icmpge -> 2407
    //   2283: aload #16
    //   2285: iload #8
    //   2287: aaload
    //   2288: astore #16
    //   2290: iload #8
    //   2292: iflt -> 2320
    //   2295: aload #15
    //   2297: getfield b : [S
    //   2300: astore #17
    //   2302: iload #8
    //   2304: aload #17
    //   2306: arraylength
    //   2307: if_icmpge -> 2326
    //   2310: aload #17
    //   2312: iload #8
    //   2314: saload
    //   2315: istore #9
    //   2317: goto -> 2329
    //   2320: aload #15
    //   2322: invokevirtual getClass : ()Ljava/lang/Class;
    //   2325: pop
    //   2326: iconst_0
    //   2327: istore #9
    //   2329: aload #16
    //   2331: aload_0
    //   2332: getfield h0 : I
    //   2335: invokestatic abs : (I)I
    //   2338: iload #9
    //   2340: iadd
    //   2341: invokevirtual setProgressWithAnimation : (I)V
    //   2344: aload_0
    //   2345: getfield g0 : [Landroid/widget/TextView;
    //   2348: iload #8
    //   2350: aaload
    //   2351: astore #16
    //   2353: iload #8
    //   2355: iflt -> 2383
    //   2358: aload #15
    //   2360: getfield b : [S
    //   2363: astore #17
    //   2365: iload #8
    //   2367: aload #17
    //   2369: arraylength
    //   2370: if_icmpge -> 2383
    //   2373: aload #17
    //   2375: iload #8
    //   2377: saload
    //   2378: istore #9
    //   2380: goto -> 2386
    //   2383: iconst_0
    //   2384: istore #9
    //   2386: aload #16
    //   2388: iload #9
    //   2390: i2d
    //   2391: invokestatic D : (D)Ljava/lang/String;
    //   2394: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   2397: iload #8
    //   2399: iconst_1
    //   2400: iadd
    //   2401: i2s
    //   2402: istore #8
    //   2404: goto -> 2269
    //   2407: aload_0
    //   2408: getfield a0 : Lin/krosbits/musicolet/EqualizerActivity2;
    //   2411: invokevirtual q0 : ()V
    //   2414: aload_0
    //   2415: iconst_0
    //   2416: putfield l0 : Z
    //   2419: return
    //   2420: astore #15
    //   2422: goto -> 240
    // Exception table:
    //   from	to	target	type
    //   232	237	2420	java/lang/Exception
    //   1003	1017	1048	org/json/JSONException
    //   1026	1045	1048	org/json/JSONException
    //   1053	1070	1048	org/json/JSONException
    //   1106	1124	1127	org/json/JSONException
    //   1780	1789	1909	finally
    //   1795	1843	1909	finally
    //   1846	1852	1909	finally
    //   1856	1903	1909	finally
    //   1914	1950	1909	finally
    //   1953	2006	1909	finally
    //   2019	2103	1909	finally
  }
  
  public final void G0(int paramInt, short paramShort1, short paramShort2) {
    if (paramShort2 != paramShort1) {
      int j = Math.abs(this.h0) + paramShort2;
      int k = this.e0[paramInt].getMax();
      int i = j;
      if (j < 0)
        i = 0; 
      j = i;
      if (i > k)
        j = k; 
      short s = D0(j);
      if (j >= 0 && j <= k) {
        this.e0[paramInt].setProgress(j);
        I0(paramInt, s);
        onStopTrackingTouch((SeekBar)this.e0[paramInt]);
      } 
    } 
  }
  
  public final void H0(int paramInt1, Integer paramInteger, int paramInt2) {
    int i = this.a0.p0();
    int j = paramInteger.intValue();
    int k = j50.a;
    x41.u(ga1.j("EQNB_", i, paramInt1, ybWnIKHovcRr.zLFLCPDUxrN), j);
    if (this.a0.p0() == MusicService.D0) {
      if (paramInt2 == 0 || paramInteger.intValue() == 0) {
        this.a0.f0 = true;
        MusicService.P0.a0(500L);
        return;
      } 
      EqualizerActivity2.r0();
      f01.b().d(paramInteger.intValue());
      try {
        j50.x(MusicService.K0);
      } finally {
        paramInteger = null;
      } 
      E0();
      EqualizerActivity2.m0();
    } else {
      try {
        return;
      } finally {
        paramInteger = null;
      } 
    } 
  }
  
  public final void I0(int paramInt, short paramShort) {
    this.g0[paramInt].setText(ag0.D(paramShort));
    if (this.a0.p0() == MusicService.D0)
      try {
        return;
      } finally {
        Exception exception = null;
      }  
  }
  
  public final void J0() {
    int[] arrayOfInt = m92.h;
    ArrayList<Object> arrayList2 = j50.m(this.o0);
    ArrayList<ArrayList<Object>> arrayList = j50.o(this.o0);
    int i = arrayList2.size();
    ArrayList<String> arrayList1 = new ArrayList(arrayList.size() + i + 1);
    int j = arrayList2.size();
    i = 0;
    while (i < j) {
      Object object = arrayList2.get(i);
      i++;
      arrayList1.add(((ea1)object).a);
    } 
    arrayList1.add(T(2131886420));
    j = arrayList.size();
    i = 0;
    while (i < j) {
      arrayList2 = arrayList.get(i);
      i++;
      arrayList1.add(((ea1)arrayList2).a);
    } 
    i = this.a0.p0();
    if (MusicService.D0 == i && j50.r(i)) {
      i = arrayOfInt[5];
    } else {
      i = arrayOfInt[7];
    } 
    y40 y401 = new y40(P(), arrayList1, i, 0);
    this.p0 = y401;
    this.b0.setAdapter((SpinnerAdapter)y401);
  }
  
  public final void e0(Context paramContext) {
    super.e0(paramContext);
    this.a0 = (EqualizerActivity2)paramContext;
  }
  
  public final View g0(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle) {
    View view = paramLayoutInflater.inflate(2131492989, paramViewGroup, false);
    this.m0 = view;
    this.n0 = (SmartTextView)view.findViewById(2131297795);
    this.b0 = (Spinner)this.m0.findViewById(2131297512);
    this.c0 = (SmartImageView)this.m0.findViewById(2131296899);
    this.d0 = (SmartImageView)this.m0.findViewById(2131296848);
    try {
      F0(true, true, true);
      return this.m0;
    } finally {
      view = null;
      view.printStackTrace();
      ag0.O0(2131886509, 1);
      this.a0.finish();
    } 
  }
  
  public final void j0() {
    this.a0 = null;
    this.I = true;
  }
  
  public final void onClick(View paramView) {
    // Byte code:
    //   0: aload_1
    //   1: invokevirtual getId : ()I
    //   4: istore_3
    //   5: iload_3
    //   6: ldc_w 2131296899
    //   9: if_icmpne -> 92
    //   12: aload_0
    //   13: getfield b0 : Landroid/widget/Spinner;
    //   16: invokevirtual getSelectedItemPosition : ()I
    //   19: aload_0
    //   20: getfield o0 : I
    //   23: invokestatic m : (I)Ljava/util/ArrayList;
    //   26: invokevirtual size : ()I
    //   29: if_icmpne -> 989
    //   32: new ms0
    //   35: dup
    //   36: aload_0
    //   37: invokevirtual P : ()Landroid/content/Context;
    //   40: invokespecial <init> : (Landroid/content/Context;)V
    //   43: astore_1
    //   44: aload_1
    //   45: ldc_w 2131887270
    //   48: invokevirtual q : (I)V
    //   51: aload_1
    //   52: aload_0
    //   53: ldc_w 2131887119
    //   56: invokevirtual T : (I)Ljava/lang/String;
    //   59: aconst_null
    //   60: iconst_0
    //   61: new u40
    //   64: dup
    //   65: aload_0
    //   66: invokespecial <init> : (Lz40;)V
    //   69: invokevirtual g : (Ljava/lang/String;Ljava/lang/CharSequence;ZLns0;)V
    //   72: aload_1
    //   73: ldc_w 2131886278
    //   76: invokevirtual k : (I)V
    //   79: aload_1
    //   80: ldc_w 2131887265
    //   83: invokevirtual n : (I)V
    //   86: aload_1
    //   87: invokevirtual p : ()Lss0;
    //   90: pop
    //   91: return
    //   92: iload_3
    //   93: ldc_w 2131296848
    //   96: if_icmpne -> 180
    //   99: aload_0
    //   100: getfield b0 : Landroid/widget/Spinner;
    //   103: invokevirtual getSelectedItemPosition : ()I
    //   106: istore_3
    //   107: iload_3
    //   108: aload_0
    //   109: getfield o0 : I
    //   112: invokestatic m : (I)Ljava/util/ArrayList;
    //   115: invokevirtual size : ()I
    //   118: if_icmple -> 989
    //   121: new ms0
    //   124: dup
    //   125: aload_0
    //   126: invokevirtual P : ()Landroid/content/Context;
    //   129: invokespecial <init> : (Landroid/content/Context;)V
    //   132: astore_1
    //   133: aload_1
    //   134: aload_0
    //   135: getfield p0 : Ly40;
    //   138: iload_3
    //   139: invokevirtual getItem : (I)Ljava/lang/Object;
    //   142: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   145: invokevirtual d : (Ljava/lang/CharSequence;)V
    //   148: aload_1
    //   149: ldc_w 2131887160
    //   152: invokevirtual n : (I)V
    //   155: aload_1
    //   156: ldc_w 2131886278
    //   159: invokevirtual k : (I)V
    //   162: aload_1
    //   163: new u40
    //   166: dup
    //   167: aload_0
    //   168: invokespecial <init> : (Lz40;)V
    //   171: putfield A : Lrs0;
    //   174: aload_1
    //   175: invokevirtual p : ()Lss0;
    //   178: pop
    //   179: return
    //   180: iload_3
    //   181: ldc_w 2131297795
    //   184: if_icmpne -> 757
    //   187: aload_0
    //   188: invokevirtual P : ()Landroid/content/Context;
    //   191: astore #11
    //   193: iconst_0
    //   194: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   197: astore #15
    //   199: invokestatic b : ()I
    //   202: istore #8
    //   204: new java/util/ArrayList
    //   207: dup
    //   208: bipush #6
    //   210: invokespecial <init> : (I)V
    //   213: astore_1
    //   214: new java/util/ArrayList
    //   217: dup
    //   218: bipush #6
    //   220: invokespecial <init> : (I)V
    //   223: astore #10
    //   225: aload_0
    //   226: getfield a0 : Lin/krosbits/musicolet/EqualizerActivity2;
    //   229: getfield c0 : I
    //   232: istore #7
    //   234: iload #7
    //   236: ifne -> 246
    //   239: bipush #10
    //   241: istore #4
    //   243: goto -> 249
    //   246: iconst_0
    //   247: istore #4
    //   249: iconst_5
    //   250: newarray int
    //   252: astore #12
    //   254: aload #12
    //   256: iconst_0
    //   257: iconst_3
    //   258: iastore
    //   259: aload #12
    //   261: iconst_1
    //   262: iconst_5
    //   263: iastore
    //   264: aload #12
    //   266: iconst_2
    //   267: bipush #10
    //   269: iastore
    //   270: aload #12
    //   272: iconst_3
    //   273: bipush #15
    //   275: iastore
    //   276: aload #12
    //   278: iconst_4
    //   279: bipush #31
    //   281: iastore
    //   282: getstatic com/google/android/gms/cast/framework/internal/featurehighlight/aS/xveccWbRzqx.ezYJmJcEP : Ljava/lang/String;
    //   285: astore #13
    //   287: iload #7
    //   289: ifne -> 405
    //   292: iconst_0
    //   293: istore #6
    //   295: iconst_0
    //   296: istore_3
    //   297: iload_3
    //   298: iconst_5
    //   299: if_icmpge -> 523
    //   302: aload #12
    //   304: iload_3
    //   305: iaload
    //   306: istore #9
    //   308: aload_1
    //   309: iload #9
    //   311: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   314: invokevirtual add : (Ljava/lang/Object;)Z
    //   317: pop
    //   318: aload #10
    //   320: iload #9
    //   322: invokestatic valueOf : (I)Ljava/lang/String;
    //   325: invokevirtual add : (Ljava/lang/Object;)Z
    //   328: pop
    //   329: iload #6
    //   331: istore #5
    //   333: iload #6
    //   335: ifne -> 395
    //   338: iload #6
    //   340: istore #5
    //   342: iload #9
    //   344: iload #8
    //   346: if_icmplt -> 395
    //   349: aload_1
    //   350: aload #15
    //   352: invokevirtual add : (Ljava/lang/Object;)Z
    //   355: pop
    //   356: new java/lang/StringBuilder
    //   359: dup
    //   360: invokespecial <init> : ()V
    //   363: astore #14
    //   365: aload #14
    //   367: iload #8
    //   369: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   372: pop
    //   373: aload #14
    //   375: aload #13
    //   377: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   380: pop
    //   381: aload #10
    //   383: aload #14
    //   385: invokevirtual toString : ()Ljava/lang/String;
    //   388: invokevirtual add : (Ljava/lang/Object;)Z
    //   391: pop
    //   392: iconst_1
    //   393: istore #5
    //   395: iinc #3, 1
    //   398: iload #5
    //   400: istore #6
    //   402: goto -> 297
    //   405: aload_1
    //   406: aload #15
    //   408: invokevirtual add : (Ljava/lang/Object;)Z
    //   411: pop
    //   412: new java/lang/StringBuilder
    //   415: dup
    //   416: invokespecial <init> : ()V
    //   419: astore #14
    //   421: aload #14
    //   423: iload #8
    //   425: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   428: pop
    //   429: aload #14
    //   431: aload #13
    //   433: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   436: pop
    //   437: aload #10
    //   439: aload #14
    //   441: invokevirtual toString : ()Ljava/lang/String;
    //   444: invokevirtual add : (Ljava/lang/Object;)Z
    //   447: pop
    //   448: iconst_0
    //   449: istore_3
    //   450: iload_3
    //   451: iconst_5
    //   452: if_icmpge -> 523
    //   455: aload #12
    //   457: iload_3
    //   458: iaload
    //   459: istore #5
    //   461: aload_1
    //   462: iload #5
    //   464: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   467: invokevirtual add : (Ljava/lang/Object;)Z
    //   470: pop
    //   471: new java/lang/StringBuilder
    //   474: dup
    //   475: ldc_w '<strike>'
    //   478: invokespecial <init> : (Ljava/lang/String;)V
    //   481: astore #13
    //   483: aload #13
    //   485: iload #5
    //   487: invokestatic valueOf : (I)Ljava/lang/String;
    //   490: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   493: pop
    //   494: aload #13
    //   496: ldc_w '</strike>'
    //   499: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   502: pop
    //   503: aload #10
    //   505: aload #13
    //   507: invokevirtual toString : ()Ljava/lang/String;
    //   510: invokestatic fromHtml : (Ljava/lang/String;)Landroid/text/Spanned;
    //   513: invokevirtual add : (Ljava/lang/Object;)Z
    //   516: pop
    //   517: iinc #3, 1
    //   520: goto -> 450
    //   523: aload_0
    //   524: getfield a0 : Lin/krosbits/musicolet/EqualizerActivity2;
    //   527: invokevirtual p0 : ()I
    //   530: iload #7
    //   532: invokestatic i : (II)I
    //   535: istore #5
    //   537: iconst_0
    //   538: istore_3
    //   539: iload_3
    //   540: aload_1
    //   541: invokevirtual size : ()I
    //   544: if_icmpge -> 572
    //   547: aload_1
    //   548: iload_3
    //   549: invokevirtual get : (I)Ljava/lang/Object;
    //   552: checkcast java/lang/Integer
    //   555: invokevirtual intValue : ()I
    //   558: iload #5
    //   560: if_icmpne -> 566
    //   563: goto -> 574
    //   566: iinc #3, 1
    //   569: goto -> 539
    //   572: iconst_m1
    //   573: istore_3
    //   574: aload #11
    //   576: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   579: ldc_w 2131231099
    //   582: invokevirtual getDrawable : (I)Landroid/graphics/drawable/Drawable;
    //   585: astore #12
    //   587: getstatic m92.h : [I
    //   590: iconst_5
    //   591: iaload
    //   592: aload #12
    //   594: invokestatic C0 : (ILandroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;
    //   597: astore #12
    //   599: getstatic in/krosbits/musicolet/MyApplication.p : F
    //   602: ldc_w 20.0
    //   605: fmul
    //   606: f2i
    //   607: istore #6
    //   609: aload #12
    //   611: iconst_0
    //   612: iconst_0
    //   613: iload #6
    //   615: iload #6
    //   617: invokevirtual setBounds : (IIII)V
    //   620: new ms0
    //   623: dup
    //   624: aload #11
    //   626: invokespecial <init> : (Landroid/content/Context;)V
    //   629: astore #11
    //   631: aload #11
    //   633: ldc_w 2131886997
    //   636: invokevirtual q : (I)V
    //   639: aload #11
    //   641: aload #12
    //   643: putfield S : Landroid/graphics/drawable/Drawable;
    //   646: aload #11
    //   648: aload #10
    //   650: iconst_0
    //   651: anewarray java/lang/CharSequence
    //   654: invokevirtual toArray : ([Ljava/lang/Object;)[Ljava/lang/Object;
    //   657: checkcast [Ljava/lang/CharSequence;
    //   660: invokevirtual i : ([Ljava/lang/CharSequence;)V
    //   663: new java/lang/Object
    //   666: dup
    //   667: invokespecial <init> : ()V
    //   670: astore #10
    //   672: aload #10
    //   674: aload_0
    //   675: putfield e : Ljava/lang/Object;
    //   678: aload #10
    //   680: aload_1
    //   681: putfield c : Ljava/lang/Object;
    //   684: aload #10
    //   686: iload #5
    //   688: putfield b : I
    //   691: aload #11
    //   693: iload_3
    //   694: putfield M : I
    //   697: aload #11
    //   699: aconst_null
    //   700: putfield E : Los0;
    //   703: aload #11
    //   705: aload #10
    //   707: putfield F : Lqs0;
    //   710: aload #11
    //   712: aconst_null
    //   713: putfield G : Lps0;
    //   716: iload #4
    //   718: iload #5
    //   720: if_icmpeq -> 750
    //   723: aload #11
    //   725: ldc_w 2131887193
    //   728: invokevirtual l : (I)V
    //   731: aload #11
    //   733: new v40
    //   736: dup
    //   737: aload_0
    //   738: iload #7
    //   740: iload #4
    //   742: iload #5
    //   744: invokespecial <init> : (Lz40;III)V
    //   747: putfield C : Lrs0;
    //   750: aload #11
    //   752: invokevirtual p : ()Lss0;
    //   755: pop
    //   756: return
    //   757: aload_1
    //   758: instanceof android/widget/TextView
    //   761: ifeq -> 989
    //   764: aload_1
    //   765: invokevirtual getTag : ()Ljava/lang/Object;
    //   768: astore_1
    //   769: aload_1
    //   770: instanceof java/lang/Integer
    //   773: ifeq -> 989
    //   776: aload_1
    //   777: checkcast java/lang/Integer
    //   780: invokevirtual intValue : ()I
    //   783: istore_3
    //   784: aload_0
    //   785: aload_0
    //   786: getfield e0 : [Lin/krosbits/android/widgets/AdvanceSeekbar;
    //   789: iload_3
    //   790: aaload
    //   791: invokevirtual getProgress : ()I
    //   794: invokevirtual D0 : (I)S
    //   797: istore_2
    //   798: new ms0
    //   801: dup
    //   802: aload_0
    //   803: invokevirtual P : ()Landroid/content/Context;
    //   806: invokespecial <init> : (Landroid/content/Context;)V
    //   809: astore #10
    //   811: new java/lang/StringBuilder
    //   814: dup
    //   815: ldc_w '<small>'
    //   818: invokespecial <init> : (Ljava/lang/String;)V
    //   821: astore_1
    //   822: aload_1
    //   823: aload_0
    //   824: getfield f0 : [Landroid/widget/TextView;
    //   827: iload_3
    //   828: aaload
    //   829: invokevirtual getText : ()Ljava/lang/CharSequence;
    //   832: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   835: pop
    //   836: aload_1
    //   837: ldc_w 'Hz</small> → <small>? dB</small>'
    //   840: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   843: pop
    //   844: aload #10
    //   846: aload_1
    //   847: invokevirtual toString : ()Ljava/lang/String;
    //   850: invokestatic fromHtml : (Ljava/lang/String;)Landroid/text/Spanned;
    //   853: putfield f : Ljava/lang/CharSequence;
    //   856: aload #10
    //   858: ldc_w '0.0'
    //   861: getstatic java/util/Locale.ENGLISH : Ljava/util/Locale;
    //   864: ldc_w '%.1f'
    //   867: iconst_1
    //   868: anewarray java/lang/Object
    //   871: dup
    //   872: iconst_0
    //   873: iload_2
    //   874: i2f
    //   875: ldc_w 100.0
    //   878: fdiv
    //   879: invokestatic valueOf : (F)Ljava/lang/Float;
    //   882: aastore
    //   883: invokestatic format : (Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   886: iconst_1
    //   887: new w40
    //   890: dup
    //   891: aload_0
    //   892: iload_3
    //   893: iload_2
    //   894: invokespecial <init> : (Lz40;IS)V
    //   897: invokevirtual g : (Ljava/lang/String;Ljava/lang/CharSequence;ZLns0;)V
    //   900: aload #10
    //   902: sipush #12290
    //   905: putfield l0 : I
    //   908: aload #10
    //   910: ldc_w 2131887030
    //   913: invokevirtual n : (I)V
    //   916: aload #10
    //   918: ldc_w 2131887193
    //   921: invokevirtual l : (I)V
    //   924: aload #10
    //   926: ldc_w 2131886278
    //   929: invokevirtual k : (I)V
    //   932: aload #10
    //   934: new w40
    //   937: dup
    //   938: aload_0
    //   939: iload_3
    //   940: iload_2
    //   941: invokespecial <init> : (Lz40;IS)V
    //   944: putfield C : Lrs0;
    //   947: aload #10
    //   949: invokevirtual p : ()Lss0;
    //   952: getfield n : Landroid/widget/EditText;
    //   955: astore_1
    //   956: aload_1
    //   957: ifnull -> 989
    //   960: aload_1
    //   961: iconst_2
    //   962: anewarray android/text/InputFilter
    //   965: dup
    //   966: iconst_0
    //   967: new java/lang/Object
    //   970: dup
    //   971: invokespecial <init> : ()V
    //   974: aastore
    //   975: dup
    //   976: iconst_1
    //   977: new android/text/InputFilter$LengthFilter
    //   980: dup
    //   981: iconst_5
    //   982: invokespecial <init> : (I)V
    //   985: aastore
    //   986: invokevirtual setFilters : ([Landroid/text/InputFilter;)V
    //   989: return
  }
  
  public final void onItemSelected(AdapterView paramAdapterView, View paramView, int paramInt, long paramLong) {
    int i = this.a0.p0();
    int j = this.o0;
    int k = j50.a;
    x41.u(ga1.j("EQSELP_", i, j, "_"), paramInt);
    i = j50.m(this.o0).size();
    SmartImageView smartImageView = this.c0;
    if (paramInt < i) {
      smartImageView.setVisibility(8);
      this.d0.setVisibility(8);
    } else if (paramInt == i) {
      smartImageView.setVisibility(0);
      this.d0.setVisibility(8);
    } else {
      smartImageView.setVisibility(8);
      this.d0.setVisibility(0);
    } 
    try {
      return;
    } finally {
      smartImageView = null;
      smartImageView.printStackTrace();
    } 
  }
  
  public final void onNothingSelected(AdapterView paramAdapterView) {}
  
  public final void onProgressChanged(SeekBar paramSeekBar, int paramInt, boolean paramBoolean) {
    if (paramBoolean)
      I0(((Integer)paramSeekBar.getTag()).intValue(), D0(paramSeekBar.getProgress())); 
  }
  
  public final void onStartTrackingTouch(SeekBar paramSeekBar) {}
  
  public final void onStopTrackingTouch(SeekBar paramSeekBar) {
    int j = this.e0.length;
    short[] arrayOfShort = new short[j];
    int i = 0;
    while (true) {
      AdvanceSeekbar[] arrayOfAdvanceSeekbar = this.e0;
      if (i < arrayOfAdvanceSeekbar.length) {
        arrayOfShort[i] = D0(arrayOfAdvanceSeekbar[i].getProgress());
        i = (short)(i + 1);
        continue;
      } 
      int k = this.a0.p0();
      int m = this.o0;
      i = j50.a;
      JSONArray jSONArray = new JSONArray();
      for (i = 0; i < j; i++)
        jSONArray.put(arrayOfShort[i]); 
      String str = ga1.j("CEQPR_", k, m, "_");
      MyApplication.o().edit().putString(str, jSONArray.toString()).apply();
      this.l0 = true;
      this.b0.setSelection(j50.m(this.o0).size());
      this.l0 = false;
      this.a0.q0();
      return;
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\z40.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
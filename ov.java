import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatCheckBox;
import in.krosbits.android.widgets.SmartImageView;
import in.krosbits.musicolet.DbCleanActivity;

public final class ov extends he1 implements View.OnClickListener {
  public final AppCompatCheckBox w;
  
  public final SmartImageView x;
  
  public final DbCleanActivity y;
  
  public ov(DbCleanActivity paramDbCleanActivity, LinearLayout paramLinearLayout, AppCompatCheckBox paramAppCompatCheckBox, SmartImageView paramSmartImageView) {
    super((View)paramLinearLayout);
    this.w = paramAppCompatCheckBox;
    this.x = paramSmartImageView;
    int i = paramDbCleanActivity.e0;
    paramAppCompatCheckBox.setPadding(i, i, i, i);
    paramAppCompatCheckBox.setOnClickListener(this);
    paramSmartImageView.setOnClickListener(this);
  }
  
  public final void onClick(View paramView) {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual c : ()I
    //   4: istore_2
    //   5: iload_2
    //   6: iflt -> 1156
    //   9: aload_0
    //   10: getfield y : Lin/krosbits/musicolet/DbCleanActivity;
    //   13: astore #10
    //   15: iload_2
    //   16: aload #10
    //   18: getfield R : Ljava/util/ArrayList;
    //   21: invokevirtual size : ()I
    //   24: if_icmplt -> 30
    //   27: goto -> 1156
    //   30: aload_0
    //   31: getfield w : Landroidx/appcompat/widget/AppCompatCheckBox;
    //   34: astore #9
    //   36: aload_1
    //   37: aload #9
    //   39: if_acmpne -> 60
    //   42: aload #10
    //   44: getfield S : [Z
    //   47: iload_2
    //   48: aload #9
    //   50: invokevirtual isChecked : ()Z
    //   53: bastore
    //   54: aload #10
    //   56: invokevirtual n0 : ()V
    //   59: return
    //   60: aload_1
    //   61: aload_0
    //   62: getfield x : Lin/krosbits/android/widgets/SmartImageView;
    //   65: if_acmpne -> 1156
    //   68: aload #10
    //   70: getfield R : Ljava/util/ArrayList;
    //   73: iload_2
    //   74: invokevirtual get : (I)Ljava/lang/Object;
    //   77: checkcast km0
    //   80: astore #11
    //   82: new java/util/ArrayList
    //   85: dup
    //   86: invokespecial <init> : ()V
    //   89: astore #12
    //   91: getstatic in/krosbits/musicolet/MyApplication.i : Lin/krosbits/musicolet/MyApplication;
    //   94: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   97: aload #11
    //   99: getfield c : Lqn1;
    //   102: getfield f : Lwo;
    //   105: invokestatic Q0 : (Ljava/lang/Object;)Ljava/lang/String;
    //   108: aload #11
    //   110: getfield h : Ljava/lang/String;
    //   113: aconst_null
    //   114: ldc2_w -1
    //   117: invokestatic r : (Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)Lv00;
    //   120: astore #13
    //   122: iconst_0
    //   123: istore #7
    //   125: iconst_1
    //   126: istore #6
    //   128: aload #13
    //   130: ifnull -> 146
    //   133: aload #13
    //   135: invokevirtual l : ()Z
    //   138: ifeq -> 146
    //   141: iconst_1
    //   142: istore_2
    //   143: goto -> 148
    //   146: iconst_0
    //   147: istore_2
    //   148: aload #13
    //   150: ifnull -> 171
    //   153: iload_2
    //   154: ifeq -> 171
    //   157: aload #13
    //   159: invokevirtual a : ()Z
    //   162: ifeq -> 171
    //   165: iconst_1
    //   166: istore #5
    //   168: goto -> 174
    //   171: iconst_0
    //   172: istore #5
    //   174: aload #13
    //   176: ifnull -> 188
    //   179: aload #13
    //   181: invokevirtual i : ()Lu00;
    //   184: astore_1
    //   185: goto -> 190
    //   188: aconst_null
    //   189: astore_1
    //   190: aload_1
    //   191: instanceof v00
    //   194: ifeq -> 711
    //   197: aload_1
    //   198: checkcast v00
    //   201: astore_1
    //   202: aload #10
    //   204: getfield h0 : Lim0;
    //   207: aload_1
    //   208: getfield b : Ld61;
    //   211: invokevirtual toString : ()Ljava/lang/String;
    //   214: invokevirtual a : (Ljava/lang/String;)Ljava/lang/String;
    //   217: astore #9
    //   219: aload #9
    //   221: ifnull -> 292
    //   224: new java/lang/StringBuilder
    //   227: dup
    //   228: ldc '<b>• '
    //   230: invokespecial <init> : (Ljava/lang/String;)V
    //   233: astore #14
    //   235: aload #14
    //   237: aload #10
    //   239: ldc 2131886591
    //   241: invokevirtual getString : (I)Ljava/lang/String;
    //   244: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   247: pop
    //   248: aload #14
    //   250: ldc '</b><br/>'
    //   252: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   255: pop
    //   256: aload #14
    //   258: getstatic in/krosbits/musicolet/MyApplication.F : Lyp1;
    //   261: aload #9
    //   263: invokevirtual c : (Ljava/lang/String;)Lml0;
    //   266: getfield b : Ljava/lang/String;
    //   269: invokestatic a : (Ljava/lang/String;)Ljava/lang/String;
    //   272: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   275: pop
    //   276: aload #12
    //   278: aload #14
    //   280: invokevirtual toString : ()Ljava/lang/String;
    //   283: invokevirtual add : (Ljava/lang/Object;)Z
    //   286: pop
    //   287: iconst_1
    //   288: istore_2
    //   289: goto -> 294
    //   292: iconst_0
    //   293: istore_2
    //   294: getstatic in/krosbits/musicolet/MyApplication.F : Lyp1;
    //   297: aload_1
    //   298: getfield b : Ld61;
    //   301: invokevirtual toString : ()Ljava/lang/String;
    //   304: invokevirtual d : (Ljava/lang/String;)Lv00;
    //   307: astore #9
    //   309: aload #10
    //   311: getfield h0 : Lim0;
    //   314: aload_1
    //   315: invokevirtual j : (Lv00;)Z
    //   318: ifeq -> 339
    //   321: iload_2
    //   322: istore_3
    //   323: getstatic in/krosbits/musicolet/MyApplication.F : Lyp1;
    //   326: invokevirtual p : ()Z
    //   329: ifne -> 425
    //   332: iload_2
    //   333: istore_3
    //   334: aload #9
    //   336: ifnonnull -> 425
    //   339: aload_1
    //   340: instanceof ww1
    //   343: ifne -> 353
    //   346: aload_1
    //   347: instanceof cd1
    //   350: ifeq -> 355
    //   353: iconst_1
    //   354: istore_2
    //   355: new java/lang/StringBuilder
    //   358: dup
    //   359: ldc '<b>• '
    //   361: invokespecial <init> : (Ljava/lang/String;)V
    //   364: astore #14
    //   366: aload #14
    //   368: aload #10
    //   370: ldc 2131886596
    //   372: invokevirtual getString : (I)Ljava/lang/String;
    //   375: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   378: pop
    //   379: aload #14
    //   381: ldc '</b><br/>'
    //   383: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   386: pop
    //   387: aload #14
    //   389: getstatic in/krosbits/musicolet/MyApplication.F : Lyp1;
    //   392: aload_1
    //   393: getfield b : Ld61;
    //   396: invokevirtual toString : ()Ljava/lang/String;
    //   399: invokevirtual c : (Ljava/lang/String;)Lml0;
    //   402: getfield b : Ljava/lang/String;
    //   405: invokestatic a : (Ljava/lang/String;)Ljava/lang/String;
    //   408: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   411: pop
    //   412: aload #12
    //   414: aload #14
    //   416: invokevirtual toString : ()Ljava/lang/String;
    //   419: invokevirtual add : (Ljava/lang/Object;)Z
    //   422: pop
    //   423: iload_2
    //   424: istore_3
    //   425: aload #9
    //   427: ifnull -> 433
    //   430: aload #9
    //   432: astore_1
    //   433: iload_3
    //   434: istore #4
    //   436: invokestatic o : ()Landroid/content/SharedPreferences;
    //   439: ldc 'k_b_scnmfl'
    //   441: iconst_0
    //   442: invokeinterface getBoolean : (Ljava/lang/String;Z)Z
    //   447: ifne -> 575
    //   450: aload #10
    //   452: getfield h0 : Lim0;
    //   455: invokevirtual getClass : ()Ljava/lang/Class;
    //   458: pop
    //   459: aload_1
    //   460: iconst_1
    //   461: invokestatic y : (Lv00;Z)Lv00;
    //   464: astore #9
    //   466: iload_3
    //   467: istore #4
    //   469: aload #9
    //   471: ifnull -> 575
    //   474: new java/lang/StringBuilder
    //   477: dup
    //   478: ldc '<b>• '
    //   480: invokespecial <init> : (Ljava/lang/String;)V
    //   483: astore #14
    //   485: aload #14
    //   487: aload #10
    //   489: ldc 2131886587
    //   491: invokevirtual getString : (I)Ljava/lang/String;
    //   494: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   497: pop
    //   498: aload #14
    //   500: ldc '</b><br/>'
    //   502: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   505: pop
    //   506: aload #14
    //   508: getstatic in/krosbits/musicolet/MyApplication.F : Lyp1;
    //   511: aload #9
    //   513: getfield b : Ld61;
    //   516: invokevirtual toString : ()Ljava/lang/String;
    //   519: invokevirtual c : (Ljava/lang/String;)Lml0;
    //   522: getfield b : Ljava/lang/String;
    //   525: invokestatic a : (Ljava/lang/String;)Ljava/lang/String;
    //   528: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   531: pop
    //   532: aload #14
    //   534: ldc '<br/><small>&nbsp&nbsp⚙️ <a href="nmf">'
    //   536: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   539: pop
    //   540: aload #14
    //   542: aload #10
    //   544: ldc 2131887280
    //   546: invokevirtual getString : (I)Ljava/lang/String;
    //   549: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   552: pop
    //   553: aload #14
    //   555: ldc '</a></small>'
    //   557: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   560: pop
    //   561: aload #12
    //   563: aload #14
    //   565: invokevirtual toString : ()Ljava/lang/String;
    //   568: invokevirtual add : (Ljava/lang/Object;)Z
    //   571: pop
    //   572: iconst_1
    //   573: istore #4
    //   575: iload #4
    //   577: istore_2
    //   578: invokestatic o : ()Landroid/content/SharedPreferences;
    //   581: ldc 'k_b_schdfl'
    //   583: iconst_0
    //   584: invokeinterface getBoolean : (Ljava/lang/String;Z)Z
    //   589: ifne -> 713
    //   592: aload #10
    //   594: getfield h0 : Lim0;
    //   597: invokevirtual getClass : ()Ljava/lang/Class;
    //   600: pop
    //   601: aload_1
    //   602: iconst_1
    //   603: invokestatic z : (Lv00;Z)Lv00;
    //   606: astore #9
    //   608: iload #4
    //   610: istore_2
    //   611: aload #9
    //   613: ifnull -> 713
    //   616: new java/lang/StringBuilder
    //   619: dup
    //   620: ldc '<b>• '
    //   622: invokespecial <init> : (Ljava/lang/String;)V
    //   625: astore_1
    //   626: aload_1
    //   627: aload #10
    //   629: ldc 2131886595
    //   631: invokevirtual getString : (I)Ljava/lang/String;
    //   634: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   637: pop
    //   638: aload_1
    //   639: ldc '</b><br/>'
    //   641: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   644: pop
    //   645: aload_1
    //   646: getstatic in/krosbits/musicolet/MyApplication.F : Lyp1;
    //   649: aload #9
    //   651: getfield b : Ld61;
    //   654: invokevirtual toString : ()Ljava/lang/String;
    //   657: invokevirtual c : (Ljava/lang/String;)Lml0;
    //   660: getfield b : Ljava/lang/String;
    //   663: invokestatic a : (Ljava/lang/String;)Ljava/lang/String;
    //   666: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   669: pop
    //   670: aload_1
    //   671: ldc '<br/>&nbsp&nbsp⚙️ <small><a href="hdf">'
    //   673: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   676: pop
    //   677: aload_1
    //   678: aload #10
    //   680: ldc 2131887278
    //   682: invokevirtual getString : (I)Ljava/lang/String;
    //   685: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   688: pop
    //   689: aload_1
    //   690: ldc '</a></small>'
    //   692: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   695: pop
    //   696: aload #12
    //   698: aload_1
    //   699: invokevirtual toString : ()Ljava/lang/String;
    //   702: invokevirtual add : (Ljava/lang/Object;)Z
    //   705: pop
    //   706: iconst_1
    //   707: istore_2
    //   708: goto -> 713
    //   711: iconst_0
    //   712: istore_2
    //   713: aload #13
    //   715: ifnull -> 727
    //   718: aload #13
    //   720: invokevirtual h : ()Ljava/lang/String;
    //   723: astore_1
    //   724: goto -> 729
    //   727: aconst_null
    //   728: astore_1
    //   729: aload_1
    //   730: invokestatic C : (Ljava/lang/String;)Ljava/lang/String;
    //   733: astore_1
    //   734: iload_2
    //   735: istore_3
    //   736: invokestatic o : ()Landroid/content/SharedPreferences;
    //   739: ldc 'k_b_scvfl'
    //   741: iconst_0
    //   742: invokeinterface getBoolean : (Ljava/lang/String;Z)Z
    //   747: ifne -> 839
    //   750: iload_2
    //   751: istore_3
    //   752: aload #10
    //   754: getfield h0 : Lim0;
    //   757: aload_1
    //   758: invokevirtual d : (Ljava/lang/String;)I
    //   761: iconst_1
    //   762: if_icmpne -> 839
    //   765: new java/lang/StringBuilder
    //   768: dup
    //   769: ldc '<b>• '
    //   771: invokespecial <init> : (Ljava/lang/String;)V
    //   774: astore #9
    //   776: aload #9
    //   778: aload #10
    //   780: ldc 2131886976
    //   782: iconst_1
    //   783: anewarray java/lang/Object
    //   786: dup
    //   787: iconst_0
    //   788: aload_1
    //   789: aastore
    //   790: invokevirtual getString : (I[Ljava/lang/Object;)Ljava/lang/String;
    //   793: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   796: pop
    //   797: aload #9
    //   799: ldc '</b><br/><small>&nbsp&nbsp⚙️ <a href="vdo">'
    //   801: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   804: pop
    //   805: aload #9
    //   807: aload #10
    //   809: ldc 2131887286
    //   811: invokevirtual getString : (I)Ljava/lang/String;
    //   814: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   817: pop
    //   818: aload #9
    //   820: ldc '</a></small>'
    //   822: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   825: pop
    //   826: aload #12
    //   828: aload #9
    //   830: invokevirtual toString : ()Ljava/lang/String;
    //   833: invokevirtual add : (Ljava/lang/Object;)Z
    //   836: pop
    //   837: iconst_1
    //   838: istore_3
    //   839: aload_1
    //   840: invokestatic f : (Ljava/lang/String;)I
    //   843: istore #4
    //   845: invokestatic o : ()Landroid/content/SharedPreferences;
    //   848: ldc_w 'k_i_adt'
    //   851: iconst_0
    //   852: invokeinterface getInt : (Ljava/lang/String;I)I
    //   857: istore #8
    //   859: iload #8
    //   861: ifne -> 871
    //   864: sipush #2048
    //   867: istore_2
    //   868: goto -> 884
    //   871: iload #7
    //   873: istore_2
    //   874: iload #8
    //   876: iconst_1
    //   877: if_icmpne -> 884
    //   880: sipush #1024
    //   883: istore_2
    //   884: iload #4
    //   886: iload_2
    //   887: iand
    //   888: iload_2
    //   889: if_icmpeq -> 996
    //   892: new java/lang/StringBuilder
    //   895: dup
    //   896: ldc '<b>• '
    //   898: invokespecial <init> : (Ljava/lang/String;)V
    //   901: astore #9
    //   903: aload #9
    //   905: aload #10
    //   907: ldc_w 2131886540
    //   910: iconst_1
    //   911: anewarray java/lang/Object
    //   914: dup
    //   915: iconst_0
    //   916: aload_1
    //   917: aastore
    //   918: invokevirtual getString : (I[Ljava/lang/Object;)Ljava/lang/String;
    //   921: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   924: pop
    //   925: aload #9
    //   927: ldc_w '</b><br/><small>&nbsp&nbsp💡 <a href="spff">'
    //   930: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   933: pop
    //   934: aload #9
    //   936: aload #10
    //   938: ldc_w 2131887473
    //   941: invokevirtual getString : (I)Ljava/lang/String;
    //   944: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   947: pop
    //   948: aload #9
    //   950: ldc_w '</a><br/>&nbsp&nbsp⚙️ <a href="decoder">'
    //   953: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   956: pop
    //   957: aload #9
    //   959: aload #10
    //   961: ldc_w 2131886443
    //   964: invokevirtual getString : (I)Ljava/lang/String;
    //   967: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   970: pop
    //   971: aload #9
    //   973: ldc '</a></small>'
    //   975: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   978: pop
    //   979: aload #12
    //   981: aload #9
    //   983: invokevirtual toString : ()Ljava/lang/String;
    //   986: invokevirtual add : (Ljava/lang/Object;)Z
    //   989: pop
    //   990: iload #6
    //   992: istore_3
    //   993: goto -> 996
    //   996: iload_3
    //   997: ifne -> 1046
    //   1000: iload #5
    //   1002: ifne -> 1046
    //   1005: new java/lang/StringBuilder
    //   1008: dup
    //   1009: ldc '<b>• '
    //   1011: invokespecial <init> : (Ljava/lang/String;)V
    //   1014: astore_1
    //   1015: aload_1
    //   1016: aload #10
    //   1018: ldc_w 2131886466
    //   1021: invokevirtual getString : (I)Ljava/lang/String;
    //   1024: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1027: pop
    //   1028: aload_1
    //   1029: ldc_w '</b'
    //   1032: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1035: pop
    //   1036: aload #12
    //   1038: aload_1
    //   1039: invokevirtual toString : ()Ljava/lang/String;
    //   1042: invokevirtual add : (Ljava/lang/Object;)Z
    //   1045: pop
    //   1046: ldc_w '<br/><br/>'
    //   1049: aload #12
    //   1051: invokestatic join : (Ljava/lang/CharSequence;Ljava/lang/Iterable;)Ljava/lang/String;
    //   1054: astore_1
    //   1055: new ms0
    //   1058: dup
    //   1059: aload #10
    //   1061: invokespecial <init> : (Landroid/content/Context;)V
    //   1064: astore #12
    //   1066: new java/lang/StringBuilder
    //   1069: dup
    //   1070: ldc_w '<small>'
    //   1073: invokespecial <init> : (Ljava/lang/String;)V
    //   1076: astore #9
    //   1078: aload #9
    //   1080: getstatic in/krosbits/musicolet/MyApplication.F : Lyp1;
    //   1083: aload #11
    //   1085: getfield h : Ljava/lang/String;
    //   1088: invokevirtual c : (Ljava/lang/String;)Lml0;
    //   1091: getfield b : Ljava/lang/String;
    //   1094: invokestatic a : (Ljava/lang/String;)Ljava/lang/String;
    //   1097: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1100: pop
    //   1101: aload #9
    //   1103: getstatic org/jaudiotagger/audio/real/Nq/JkpGFvCVQHzgc.WngYUtmfRsvLjDI : Ljava/lang/String;
    //   1106: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1109: pop
    //   1110: aload #12
    //   1112: aload #9
    //   1114: invokevirtual toString : ()Ljava/lang/String;
    //   1117: invokestatic fromHtml : (Ljava/lang/String;)Landroid/text/Spanned;
    //   1120: putfield f : Ljava/lang/CharSequence;
    //   1123: aload #12
    //   1125: aload_1
    //   1126: invokestatic fromHtml : (Ljava/lang/String;)Landroid/text/Spanned;
    //   1129: invokevirtual d : (Ljava/lang/CharSequence;)V
    //   1132: aload #12
    //   1134: ldc_w 2131887030
    //   1137: invokevirtual n : (I)V
    //   1140: aload #12
    //   1142: aload #10
    //   1144: getfield k0 : Lqi0;
    //   1147: putfield c : Landroid/text/method/MovementMethod;
    //   1150: aload #12
    //   1152: invokevirtual p : ()Lss0;
    //   1155: pop
    //   1156: return
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\ov.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
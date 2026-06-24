import in.krosbits.audio_cutter.TrimActivity;

public final class ux1 extends pr1 implements ad0 {
  public final int g;
  
  public int h;
  
  public final TrimActivity i;
  
  public final cn j;
  
  public ux1(cn paramcn, TrimActivity paramTrimActivity, cs paramcs) {
    super(2, paramcs);
  }
  
  public ux1(TrimActivity paramTrimActivity, cn paramcn, cs paramcs) {
    super(2, paramcs);
  }
  
  public final Object g(Object paramObject1, Object paramObject2) {
    int i = this.g;
    l02 l02 = l02.a;
    paramObject1 = paramObject1;
    paramObject2 = paramObject2;
    switch (i) {
      default:
        return ((ux1)l((cs)paramObject2, paramObject1)).n(l02);
      case 0:
        break;
    } 
    ((ux1)l((cs)paramObject2, paramObject1)).n(l02);
    return ys.b;
  }
  
  public final cs l(cs paramcs, Object paramObject) {
    int i = this.g;
    cn cn1 = this.j;
    paramObject = this.i;
    switch (i) {
      default:
        return new ux1((TrimActivity)paramObject, cn1, paramcs);
      case 0:
        break;
    } 
    return new ux1(cn1, (TrimActivity)paramObject, paramcs);
  }
  
  public final Object n(Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: getfield g : I
    //   4: istore_2
    //   5: getstatic ys.b : Lys;
    //   8: astore #6
    //   10: aload_0
    //   11: getfield i : Lin/krosbits/audio_cutter/TrimActivity;
    //   14: astore #7
    //   16: aload_0
    //   17: getfield j : Lcn;
    //   20: astore #8
    //   22: iload_2
    //   23: tableswitch default -> 40, 0 -> 2305
    //   40: aload_0
    //   41: getfield h : I
    //   44: istore_2
    //   45: getstatic l02.a : Ll02;
    //   48: astore #5
    //   50: iload_2
    //   51: ifeq -> 79
    //   54: iload_2
    //   55: iconst_1
    //   56: if_icmpne -> 69
    //   59: aload_1
    //   60: invokestatic r0 : (Ljava/lang/Object;)V
    //   63: aload #5
    //   65: astore_1
    //   66: goto -> 2007
    //   69: ldc 'call to 'resume' before 'invoke' with coroutine'
    //   71: invokestatic f : (Ljava/lang/String;)V
    //   74: aconst_null
    //   75: astore_1
    //   76: goto -> 2007
    //   79: aload_1
    //   80: invokestatic r0 : (Ljava/lang/Object;)V
    //   83: getstatic in/krosbits/audio_cutter/TrimActivity.m0 : Lvx1;
    //   86: astore_1
    //   87: aload #8
    //   89: invokevirtual getValue : ()Ljava/lang/Object;
    //   92: checkcast by1
    //   95: astore_1
    //   96: aload_1
    //   97: getfield d : Led1;
    //   100: astore #10
    //   102: getstatic m92.h : [I
    //   105: astore #9
    //   107: new ms0
    //   110: dup
    //   111: aload #7
    //   113: invokespecial <init> : (Landroid/content/Context;)V
    //   116: astore #11
    //   118: aload #11
    //   120: ldc 2131887105
    //   122: invokevirtual c : (I)V
    //   125: aload #11
    //   127: iconst_0
    //   128: putfield J : Z
    //   131: aload #11
    //   133: iconst_0
    //   134: putfield K : Z
    //   137: aload #11
    //   139: bipush #100
    //   141: iconst_0
    //   142: invokevirtual o : (IZ)V
    //   145: aload #11
    //   147: ldc 2131886278
    //   149: invokevirtual k : (I)V
    //   152: aload #11
    //   154: iconst_0
    //   155: putfield P : Z
    //   158: aload #11
    //   160: new lx1
    //   163: dup
    //   164: aload_1
    //   165: iconst_2
    //   166: invokespecial <init> : (Lby1;I)V
    //   169: putfield B : Lrs0;
    //   172: aload #7
    //   174: new ss0
    //   177: dup
    //   178: aload #11
    //   180: invokespecial <init> : (Lms0;)V
    //   183: putfield V : Lss0;
    //   186: new ms0
    //   189: dup
    //   190: aload #7
    //   192: invokespecial <init> : (Landroid/content/Context;)V
    //   195: astore #11
    //   197: aload #11
    //   199: ldc 2131887105
    //   201: invokevirtual c : (I)V
    //   204: aload #11
    //   206: iconst_0
    //   207: putfield J : Z
    //   210: aload #11
    //   212: iconst_0
    //   213: putfield K : Z
    //   216: aload #11
    //   218: iconst_0
    //   219: iconst_1
    //   220: invokevirtual o : (IZ)V
    //   223: aload #11
    //   225: iconst_1
    //   226: putfield t0 : Z
    //   229: aload #11
    //   231: ldc 2131886278
    //   233: invokevirtual k : (I)V
    //   236: aload #11
    //   238: iconst_0
    //   239: putfield P : Z
    //   242: aload #11
    //   244: new lx1
    //   247: dup
    //   248: aload_1
    //   249: iconst_0
    //   250: invokespecial <init> : (Lby1;I)V
    //   253: putfield B : Lrs0;
    //   256: aload #7
    //   258: new ss0
    //   261: dup
    //   262: aload #11
    //   264: invokespecial <init> : (Lms0;)V
    //   267: putfield W : Lss0;
    //   270: new ms0
    //   273: dup
    //   274: aload #7
    //   276: invokespecial <init> : (Landroid/content/Context;)V
    //   279: astore #11
    //   281: aload #11
    //   283: getstatic com/google/android/gms/common/util/DyJ/oXrNDUqUkE.tJPSLBgjkeeM : Ljava/lang/String;
    //   286: invokevirtual d : (Ljava/lang/CharSequence;)V
    //   289: aload #11
    //   291: ldc 2131886467
    //   293: invokevirtual q : (I)V
    //   296: aload #11
    //   298: ldc 2131887030
    //   300: invokevirtual n : (I)V
    //   303: aload #11
    //   305: new ig
    //   308: dup
    //   309: aload #7
    //   311: iconst_1
    //   312: invokespecial <init> : (Lpc;I)V
    //   315: putfield X : Landroid/content/DialogInterface$OnCancelListener;
    //   318: aload #11
    //   320: new un
    //   323: dup
    //   324: bipush #10
    //   326: aload #7
    //   328: invokespecial <init> : (ILjava/lang/Object;)V
    //   331: putfield W : Landroid/content/DialogInterface$OnDismissListener;
    //   334: aload #7
    //   336: new ss0
    //   339: dup
    //   340: aload #11
    //   342: invokespecial <init> : (Lms0;)V
    //   345: putfield X : Lss0;
    //   348: aload #7
    //   350: getfield R : Lo2;
    //   353: astore #11
    //   355: aload #11
    //   357: ifnull -> 2297
    //   360: aload #11
    //   362: getfield G : Landroid/widget/TextView;
    //   365: astore #12
    //   367: aload #10
    //   369: getfield b : Lip1;
    //   372: invokevirtual f : ()Ljava/lang/Object;
    //   375: checkcast cy1
    //   378: getfield b : Z
    //   381: ifeq -> 390
    //   384: ldc 2131887349
    //   386: istore_2
    //   387: goto -> 393
    //   390: ldc 2131886219
    //   392: istore_2
    //   393: aload #7
    //   395: iload_2
    //   396: invokevirtual getString : (I)Ljava/lang/String;
    //   399: astore #11
    //   401: aload #7
    //   403: getfield S : Lkm0;
    //   406: astore #13
    //   408: aload #13
    //   410: ifnull -> 2289
    //   413: aload #13
    //   415: getfield g : Ljava/lang/String;
    //   418: astore #14
    //   420: new java/lang/StringBuilder
    //   423: dup
    //   424: invokespecial <init> : ()V
    //   427: astore #13
    //   429: aload #13
    //   431: aload #11
    //   433: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   436: pop
    //   437: aload #13
    //   439: ldc '<br/><small>'
    //   441: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   444: pop
    //   445: aload #13
    //   447: aload #14
    //   449: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   452: pop
    //   453: aload #13
    //   455: ldc '</small>'
    //   457: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   460: pop
    //   461: aload #12
    //   463: aload #13
    //   465: invokevirtual toString : ()Ljava/lang/String;
    //   468: invokestatic fromHtml : (Ljava/lang/String;)Landroid/text/Spanned;
    //   471: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   474: aload #7
    //   476: getfield R : Lo2;
    //   479: astore #11
    //   481: aload #11
    //   483: ifnull -> 2281
    //   486: aload #11
    //   488: getfield v : Lcom/google/android/material/slider/RangeSlider;
    //   491: fconst_0
    //   492: invokevirtual setValueFrom : (F)V
    //   495: aload #7
    //   497: getfield R : Lo2;
    //   500: astore #11
    //   502: aload #11
    //   504: ifnull -> 2273
    //   507: aload #11
    //   509: getfield v : Lcom/google/android/material/slider/RangeSlider;
    //   512: astore #11
    //   514: aload #7
    //   516: getfield S : Lkm0;
    //   519: astore #12
    //   521: aload #12
    //   523: ifnull -> 2265
    //   526: aload #11
    //   528: aload #12
    //   530: getfield c : Lqn1;
    //   533: getfield g : I
    //   536: i2f
    //   537: invokevirtual setValueTo : (F)V
    //   540: aload #10
    //   542: getfield b : Lip1;
    //   545: invokevirtual f : ()Ljava/lang/Object;
    //   548: checkcast cy1
    //   551: getfield b : Z
    //   554: ifeq -> 689
    //   557: aload #7
    //   559: getfield R : Lo2;
    //   562: astore #10
    //   564: aload #10
    //   566: ifnull -> 681
    //   569: aload #10
    //   571: getfield j : Lcom/google/android/material/button/MaterialButton;
    //   574: aload #7
    //   576: ldc 2131887349
    //   578: invokevirtual getString : (I)Ljava/lang/String;
    //   581: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   584: aload #7
    //   586: getfield R : Lo2;
    //   589: astore #10
    //   591: aload #10
    //   593: ifnull -> 673
    //   596: aload #10
    //   598: getfield j : Lcom/google/android/material/button/MaterialButton;
    //   601: aconst_null
    //   602: invokevirtual setIcon : (Landroid/graphics/drawable/Drawable;)V
    //   605: aload #7
    //   607: getfield R : Lo2;
    //   610: astore #10
    //   612: aload #10
    //   614: ifnull -> 665
    //   617: aload #10
    //   619: getfield j : Lcom/google/android/material/button/MaterialButton;
    //   622: astore #10
    //   624: aload #7
    //   626: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   629: ldc_w 2131165390
    //   632: invokevirtual getDimension : (I)F
    //   635: ldc_w 16.0
    //   638: fmul
    //   639: f2i
    //   640: istore_2
    //   641: aload #10
    //   643: aload #10
    //   645: invokevirtual getPaddingLeft : ()I
    //   648: aload #10
    //   650: invokevirtual getPaddingTop : ()I
    //   653: iload_2
    //   654: aload #10
    //   656: invokevirtual getPaddingBottom : ()I
    //   659: invokevirtual setPadding : (IIII)V
    //   662: goto -> 689
    //   665: ldc_w 'activityTrimBinding'
    //   668: invokestatic n0 : (Ljava/lang/String;)V
    //   671: aconst_null
    //   672: athrow
    //   673: ldc_w 'activityTrimBinding'
    //   676: invokestatic n0 : (Ljava/lang/String;)V
    //   679: aconst_null
    //   680: athrow
    //   681: ldc_w 'activityTrimBinding'
    //   684: invokestatic n0 : (Ljava/lang/String;)V
    //   687: aconst_null
    //   688: athrow
    //   689: aload #7
    //   691: getfield R : Lo2;
    //   694: astore #10
    //   696: aload #10
    //   698: ifnull -> 2257
    //   701: aload #7
    //   703: aload #10
    //   705: getfield B : Lcom/google/android/material/appbar/MaterialToolbar;
    //   708: invokevirtual g0 : (Landroidx/appcompat/widget/Toolbar;)V
    //   711: aload #7
    //   713: invokevirtual Y : ()Lui0;
    //   716: astore #10
    //   718: aload #10
    //   720: ifnull -> 729
    //   723: aload #10
    //   725: iconst_1
    //   726: invokevirtual Z : (Z)V
    //   729: aload #9
    //   731: iconst_2
    //   732: iaload
    //   733: aload #9
    //   735: bipush #8
    //   737: iaload
    //   738: invokestatic g : (II)I
    //   741: istore #4
    //   743: aload #7
    //   745: getfield R : Lo2;
    //   748: astore #11
    //   750: aload #11
    //   752: ifnull -> 2249
    //   755: aload #11
    //   757: getfield A : Lcom/google/android/material/button/MaterialButtonToggleGroup;
    //   760: astore #10
    //   762: aload #11
    //   764: getfield y : Lcom/google/android/material/button/MaterialButtonToggleGroup;
    //   767: astore #12
    //   769: iconst_0
    //   770: istore_2
    //   771: iload_2
    //   772: iconst_2
    //   773: if_icmpge -> 857
    //   776: iconst_2
    //   777: anewarray com/google/android/material/button/MaterialButtonToggleGroup
    //   780: dup
    //   781: iconst_0
    //   782: aload #10
    //   784: aastore
    //   785: dup
    //   786: iconst_1
    //   787: aload #12
    //   789: aastore
    //   790: iload_2
    //   791: aaload
    //   792: astore #11
    //   794: aload #11
    //   796: invokevirtual getClass : ()Ljava/lang/Class;
    //   799: pop
    //   800: iconst_0
    //   801: istore_3
    //   802: iload_3
    //   803: aload #11
    //   805: invokevirtual getChildCount : ()I
    //   808: if_icmpge -> 851
    //   811: aload #11
    //   813: iload_3
    //   814: invokevirtual getChildAt : (I)Landroid/view/View;
    //   817: astore #13
    //   819: aload #13
    //   821: ifnull -> 843
    //   824: aload #13
    //   826: checkcast com/google/android/material/button/MaterialButton
    //   829: iload #4
    //   831: invokestatic valueOf : (I)Landroid/content/res/ColorStateList;
    //   834: invokevirtual setStrokeColor : (Landroid/content/res/ColorStateList;)V
    //   837: iinc #3, 1
    //   840: goto -> 802
    //   843: new java/lang/IndexOutOfBoundsException
    //   846: dup
    //   847: invokespecial <init> : ()V
    //   850: athrow
    //   851: iinc #2, 1
    //   854: goto -> 771
    //   857: aload #7
    //   859: getfield R : Lo2;
    //   862: astore #11
    //   864: aload #11
    //   866: ifnull -> 2241
    //   869: aload #11
    //   871: getfield r : Lcom/google/android/material/card/MaterialCardView;
    //   874: astore #10
    //   876: aload #11
    //   878: getfield s : Lcom/google/android/material/card/MaterialCardView;
    //   881: astore #11
    //   883: iconst_0
    //   884: istore_2
    //   885: iload_2
    //   886: iconst_2
    //   887: if_icmpge -> 917
    //   890: iconst_2
    //   891: anewarray com/google/android/material/card/MaterialCardView
    //   894: dup
    //   895: iconst_0
    //   896: aload #10
    //   898: aastore
    //   899: dup
    //   900: iconst_1
    //   901: aload #11
    //   903: aastore
    //   904: iload_2
    //   905: aaload
    //   906: iload #4
    //   908: invokevirtual setStrokeColor : (I)V
    //   911: iinc #2, 1
    //   914: goto -> 885
    //   917: aload #7
    //   919: getfield R : Lo2;
    //   922: astore #10
    //   924: aload #10
    //   926: ifnull -> 2233
    //   929: aload #10
    //   931: getfield v : Lcom/google/android/material/slider/RangeSlider;
    //   934: new lx1
    //   937: dup
    //   938: aload_1
    //   939: iconst_1
    //   940: invokespecial <init> : (Lby1;I)V
    //   943: invokevirtual setLabelFormatter : (Lnl0;)V
    //   946: aload #7
    //   948: getfield R : Lo2;
    //   951: astore #10
    //   953: aload #10
    //   955: ifnull -> 2225
    //   958: aload #10
    //   960: getfield z : Lcom/google/android/material/button/MaterialButtonToggleGroup;
    //   963: astore #10
    //   965: iconst_0
    //   966: istore_2
    //   967: iload_2
    //   968: aload #10
    //   970: invokevirtual getChildCount : ()I
    //   973: if_icmpge -> 1012
    //   976: aload #10
    //   978: iload_2
    //   979: invokevirtual getChildAt : (I)Landroid/view/View;
    //   982: astore #11
    //   984: aload #11
    //   986: ifnull -> 1004
    //   989: aload #11
    //   991: checkcast com/google/android/material/button/MaterialButton
    //   994: iconst_0
    //   995: invokevirtual setSingleLine : (Z)V
    //   998: iinc #2, 1
    //   1001: goto -> 967
    //   1004: new java/lang/IndexOutOfBoundsException
    //   1007: dup
    //   1008: invokespecial <init> : ()V
    //   1011: athrow
    //   1012: aload #7
    //   1014: getfield R : Lo2;
    //   1017: astore #10
    //   1019: aload #10
    //   1021: ifnull -> 2217
    //   1024: aload #10
    //   1026: getfield v : Lcom/google/android/material/slider/RangeSlider;
    //   1029: new ox1
    //   1032: dup
    //   1033: aload_1
    //   1034: invokespecial <init> : (Lby1;)V
    //   1037: invokevirtual a : (Lcd;)V
    //   1040: aload #7
    //   1042: getfield R : Lo2;
    //   1045: astore #10
    //   1047: aload #10
    //   1049: ifnull -> 2209
    //   1052: aload #10
    //   1054: getfield w : Lcom/google/android/material/slider/Slider;
    //   1057: new px1
    //   1060: dup
    //   1061: aload_1
    //   1062: invokespecial <init> : (Lby1;)V
    //   1065: invokevirtual a : (Lcd;)V
    //   1068: aload #7
    //   1070: getfield R : Lo2;
    //   1073: astore #10
    //   1075: aload #10
    //   1077: ifnull -> 2201
    //   1080: aload #10
    //   1082: getfield v : Lcom/google/android/material/slider/RangeSlider;
    //   1085: aload #7
    //   1087: getfield T : F
    //   1090: invokevirtual setMinSeparationValue : (F)V
    //   1093: aload #7
    //   1095: getfield R : Lo2;
    //   1098: astore #10
    //   1100: aload #10
    //   1102: ifnull -> 2193
    //   1105: aload #10
    //   1107: getfield H : Lin/krosbits/audio_cutter/WaveformView;
    //   1110: new lz
    //   1113: dup
    //   1114: iconst_3
    //   1115: aload #7
    //   1117: invokespecial <init> : (ILjava/lang/Object;)V
    //   1120: invokevirtual setOnTouchListener : (Landroid/view/View$OnTouchListener;)V
    //   1123: aload #7
    //   1125: getfield R : Lo2;
    //   1128: astore #10
    //   1130: aload #10
    //   1132: ifnull -> 2185
    //   1135: aload #10
    //   1137: getfield n : Lcom/google/android/material/button/MaterialButton;
    //   1140: aload #7
    //   1142: ldc_w 2131887266
    //   1145: invokevirtual getString : (I)Ljava/lang/String;
    //   1148: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   1151: aload #7
    //   1153: getfield R : Lo2;
    //   1156: astore #10
    //   1158: aload #10
    //   1160: ifnull -> 2177
    //   1163: aload #10
    //   1165: getfield l : Lcom/google/android/material/button/MaterialButton;
    //   1168: astore #10
    //   1170: aload #7
    //   1172: ldc_w 2131887187
    //   1175: invokevirtual getString : (I)Ljava/lang/String;
    //   1178: astore #11
    //   1180: aload #7
    //   1182: getfield S : Lkm0;
    //   1185: astore #12
    //   1187: aload #12
    //   1189: ifnull -> 2169
    //   1192: aload #12
    //   1194: getfield g : Ljava/lang/String;
    //   1197: astore #12
    //   1199: new java/lang/StringBuilder
    //   1202: dup
    //   1203: invokespecial <init> : ()V
    //   1206: astore #13
    //   1208: aload #13
    //   1210: aload #11
    //   1212: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1215: pop
    //   1216: aload #13
    //   1218: ldc_w '<br/>'
    //   1221: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1224: pop
    //   1225: aload #13
    //   1227: aload #12
    //   1229: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1232: pop
    //   1233: aload #10
    //   1235: aload #13
    //   1237: invokevirtual toString : ()Ljava/lang/String;
    //   1240: invokestatic fromHtml : (Ljava/lang/String;)Landroid/text/Spanned;
    //   1243: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   1246: new mx1
    //   1249: dup
    //   1250: aload #7
    //   1252: aload_1
    //   1253: iconst_1
    //   1254: invokespecial <init> : (Lin/krosbits/audio_cutter/TrimActivity;Lby1;I)V
    //   1257: astore #10
    //   1259: aload #7
    //   1261: getfield R : Lo2;
    //   1264: astore #11
    //   1266: aload #11
    //   1268: ifnull -> 2161
    //   1271: aload #11
    //   1273: getfield o : Lcom/google/android/material/button/MaterialButton;
    //   1276: aload #10
    //   1278: invokevirtual setOnClickListener : (Landroid/view/View$OnClickListener;)V
    //   1281: aload #7
    //   1283: getfield R : Lo2;
    //   1286: astore #11
    //   1288: aload #11
    //   1290: ifnull -> 2153
    //   1293: aload #11
    //   1295: getfield b : Lcom/google/android/material/button/MaterialButton;
    //   1298: aload #10
    //   1300: invokevirtual setOnClickListener : (Landroid/view/View$OnClickListener;)V
    //   1303: new yp0
    //   1306: dup
    //   1307: iconst_3
    //   1308: invokespecial <init> : (I)V
    //   1311: astore #10
    //   1313: aload #7
    //   1315: getfield R : Lo2;
    //   1318: astore #11
    //   1320: aload #11
    //   1322: ifnull -> 2145
    //   1325: aload #11
    //   1327: getfield A : Lcom/google/android/material/button/MaterialButtonToggleGroup;
    //   1330: aload #10
    //   1332: invokevirtual f : (Lhs0;)V
    //   1335: aload #7
    //   1337: getfield R : Lo2;
    //   1340: astore #11
    //   1342: aload #11
    //   1344: ifnull -> 2137
    //   1347: aload #11
    //   1349: getfield y : Lcom/google/android/material/button/MaterialButtonToggleGroup;
    //   1352: aload #10
    //   1354: invokevirtual f : (Lhs0;)V
    //   1357: new mx1
    //   1360: dup
    //   1361: aload #7
    //   1363: aload_1
    //   1364: iconst_2
    //   1365: invokespecial <init> : (Lin/krosbits/audio_cutter/TrimActivity;Lby1;I)V
    //   1368: astore #12
    //   1370: aload #7
    //   1372: getfield R : Lo2;
    //   1375: astore #14
    //   1377: aload #14
    //   1379: ifnull -> 2129
    //   1382: aload #14
    //   1384: getfield p : Lcom/google/android/material/button/MaterialButton;
    //   1387: astore #10
    //   1389: aload #14
    //   1391: getfield q : Lcom/google/android/material/button/MaterialButton;
    //   1394: astore #11
    //   1396: aload #14
    //   1398: getfield c : Lcom/google/android/material/button/MaterialButton;
    //   1401: astore #13
    //   1403: aload #14
    //   1405: getfield d : Lcom/google/android/material/button/MaterialButton;
    //   1408: astore #14
    //   1410: iconst_0
    //   1411: istore_2
    //   1412: iload_2
    //   1413: iconst_4
    //   1414: if_icmpge -> 1454
    //   1417: iconst_4
    //   1418: anewarray com/google/android/material/button/MaterialButton
    //   1421: dup
    //   1422: iconst_0
    //   1423: aload #10
    //   1425: aastore
    //   1426: dup
    //   1427: iconst_1
    //   1428: aload #11
    //   1430: aastore
    //   1431: dup
    //   1432: iconst_2
    //   1433: aload #13
    //   1435: aastore
    //   1436: dup
    //   1437: iconst_3
    //   1438: aload #14
    //   1440: aastore
    //   1441: iload_2
    //   1442: aaload
    //   1443: aload #12
    //   1445: invokevirtual setOnClickListener : (Landroid/view/View$OnClickListener;)V
    //   1448: iinc #2, 1
    //   1451: goto -> 1412
    //   1454: aload #7
    //   1456: getfield R : Lo2;
    //   1459: astore #10
    //   1461: aload #10
    //   1463: ifnull -> 2121
    //   1466: aload #10
    //   1468: getfield z : Lcom/google/android/material/button/MaterialButtonToggleGroup;
    //   1471: new rx1
    //   1474: dup
    //   1475: aload_1
    //   1476: aload #7
    //   1478: invokespecial <init> : (Lby1;Lin/krosbits/audio_cutter/TrimActivity;)V
    //   1481: invokevirtual f : (Lhs0;)V
    //   1484: aload #7
    //   1486: getfield R : Lo2;
    //   1489: astore #10
    //   1491: aload #10
    //   1493: ifnull -> 2113
    //   1496: aload #10
    //   1498: getfield u : Lcom/google/android/material/progressindicator/LinearProgressIndicator;
    //   1501: iconst_1
    //   1502: newarray int
    //   1504: dup
    //   1505: iconst_0
    //   1506: aload #9
    //   1508: iconst_5
    //   1509: iaload
    //   1510: bipush #12
    //   1512: invokestatic i : (II)I
    //   1515: iastore
    //   1516: invokevirtual setIndicatorColor : ([I)V
    //   1519: aload #7
    //   1521: getfield R : Lo2;
    //   1524: astore #9
    //   1526: aload #9
    //   1528: ifnull -> 2105
    //   1531: aload #9
    //   1533: getfield u : Lcom/google/android/material/progressindicator/LinearProgressIndicator;
    //   1536: iconst_0
    //   1537: invokevirtual setTrackColor : (I)V
    //   1540: aload #7
    //   1542: getfield R : Lo2;
    //   1545: astore #9
    //   1547: aload #9
    //   1549: ifnull -> 2097
    //   1552: aload #9
    //   1554: getfield j : Lcom/google/android/material/button/MaterialButton;
    //   1557: new kx1
    //   1560: dup
    //   1561: aload #7
    //   1563: bipush #6
    //   1565: invokespecial <init> : (Lin/krosbits/audio_cutter/TrimActivity;I)V
    //   1568: invokevirtual setOnClickListener : (Landroid/view/View$OnClickListener;)V
    //   1571: aload #7
    //   1573: getfield R : Lo2;
    //   1576: astore #9
    //   1578: aload #9
    //   1580: ifnull -> 2089
    //   1583: aload #9
    //   1585: getfield k : Lcom/google/android/material/button/MaterialButton;
    //   1588: new kx1
    //   1591: dup
    //   1592: aload #7
    //   1594: bipush #7
    //   1596: invokespecial <init> : (Lin/krosbits/audio_cutter/TrimActivity;I)V
    //   1599: invokevirtual setOnClickListener : (Landroid/view/View$OnClickListener;)V
    //   1602: aload #7
    //   1604: getfield R : Lo2;
    //   1607: astore #9
    //   1609: aload #9
    //   1611: ifnull -> 2081
    //   1614: aload #9
    //   1616: getfield n : Lcom/google/android/material/button/MaterialButton;
    //   1619: new kx1
    //   1622: dup
    //   1623: aload #7
    //   1625: iconst_0
    //   1626: invokespecial <init> : (Lin/krosbits/audio_cutter/TrimActivity;I)V
    //   1629: invokevirtual setOnClickListener : (Landroid/view/View$OnClickListener;)V
    //   1632: aload #7
    //   1634: getfield R : Lo2;
    //   1637: astore #9
    //   1639: aload #9
    //   1641: ifnull -> 2073
    //   1644: aload #9
    //   1646: getfield l : Lcom/google/android/material/button/MaterialButton;
    //   1649: new kx1
    //   1652: dup
    //   1653: aload #7
    //   1655: iconst_1
    //   1656: invokespecial <init> : (Lin/krosbits/audio_cutter/TrimActivity;I)V
    //   1659: invokevirtual setOnClickListener : (Landroid/view/View$OnClickListener;)V
    //   1662: aload #7
    //   1664: getfield R : Lo2;
    //   1667: astore #9
    //   1669: aload #9
    //   1671: ifnull -> 2065
    //   1674: aload #9
    //   1676: getfield a : Lcom/google/android/material/button/MaterialButton;
    //   1679: new kx1
    //   1682: dup
    //   1683: aload #7
    //   1685: iconst_2
    //   1686: invokespecial <init> : (Lin/krosbits/audio_cutter/TrimActivity;I)V
    //   1689: invokevirtual setOnClickListener : (Landroid/view/View$OnClickListener;)V
    //   1692: aload #7
    //   1694: getfield R : Lo2;
    //   1697: astore #9
    //   1699: aload #9
    //   1701: ifnull -> 2057
    //   1704: aload #9
    //   1706: getfield i : Lcom/google/android/material/button/MaterialButton;
    //   1709: new kx1
    //   1712: dup
    //   1713: aload #7
    //   1715: iconst_3
    //   1716: invokespecial <init> : (Lin/krosbits/audio_cutter/TrimActivity;I)V
    //   1719: invokevirtual setOnClickListener : (Landroid/view/View$OnClickListener;)V
    //   1722: aload #7
    //   1724: getfield R : Lo2;
    //   1727: astore #9
    //   1729: aload #9
    //   1731: ifnull -> 2049
    //   1734: aload #9
    //   1736: getfield f : Lcom/google/android/material/button/MaterialButton;
    //   1739: new kx1
    //   1742: dup
    //   1743: aload #7
    //   1745: iconst_4
    //   1746: invokespecial <init> : (Lin/krosbits/audio_cutter/TrimActivity;I)V
    //   1749: invokevirtual setOnClickListener : (Landroid/view/View$OnClickListener;)V
    //   1752: aload #7
    //   1754: getfield R : Lo2;
    //   1757: astore #9
    //   1759: aload #9
    //   1761: ifnull -> 2041
    //   1764: aload #9
    //   1766: getfield m : Lcom/google/android/material/button/MaterialButton;
    //   1769: new kx1
    //   1772: dup
    //   1773: aload #7
    //   1775: iconst_5
    //   1776: invokespecial <init> : (Lin/krosbits/audio_cutter/TrimActivity;I)V
    //   1779: invokevirtual setOnClickListener : (Landroid/view/View$OnClickListener;)V
    //   1782: aload #7
    //   1784: getfield R : Lo2;
    //   1787: astore #9
    //   1789: aload #9
    //   1791: ifnull -> 2033
    //   1794: aload #9
    //   1796: getfield w : Lcom/google/android/material/slider/Slider;
    //   1799: new sx1
    //   1802: dup
    //   1803: iconst_0
    //   1804: aload #7
    //   1806: invokespecial <init> : (ILjava/lang/Object;)V
    //   1809: invokevirtual b : (Ldd;)V
    //   1812: aload #7
    //   1814: getfield R : Lo2;
    //   1817: astore #9
    //   1819: aload #9
    //   1821: ifnull -> 2025
    //   1824: aload #9
    //   1826: getfield v : Lcom/google/android/material/slider/RangeSlider;
    //   1829: new sx1
    //   1832: dup
    //   1833: iconst_1
    //   1834: aload #7
    //   1836: invokespecial <init> : (ILjava/lang/Object;)V
    //   1839: invokevirtual b : (Ldd;)V
    //   1842: aload #7
    //   1844: getfield R : Lo2;
    //   1847: astore #9
    //   1849: aload #9
    //   1851: ifnull -> 2017
    //   1854: aload #9
    //   1856: getfield C : Lcom/google/android/material/button/MaterialButton;
    //   1859: new mx1
    //   1862: dup
    //   1863: aload #7
    //   1865: aload_1
    //   1866: iconst_0
    //   1867: invokespecial <init> : (Lin/krosbits/audio_cutter/TrimActivity;Lby1;I)V
    //   1870: invokevirtual setOnClickListener : (Landroid/view/View$OnClickListener;)V
    //   1873: aload #7
    //   1875: getfield R : Lo2;
    //   1878: astore_1
    //   1879: aload_1
    //   1880: ifnull -> 2009
    //   1883: aload_1
    //   1884: getfield H : Lin/krosbits/audio_cutter/WaveformView;
    //   1887: invokevirtual getViewTreeObserver : ()Landroid/view/ViewTreeObserver;
    //   1890: astore_1
    //   1891: aload_1
    //   1892: ifnull -> 1917
    //   1895: aload_1
    //   1896: invokevirtual isAlive : ()Z
    //   1899: ifeq -> 1917
    //   1902: aload_1
    //   1903: new l7
    //   1906: dup
    //   1907: bipush #6
    //   1909: aload #7
    //   1911: invokespecial <init> : (ILjava/lang/Object;)V
    //   1914: invokevirtual addOnGlobalLayoutListener : (Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V
    //   1917: new u20
    //   1920: dup
    //   1921: aload #8
    //   1923: aload #7
    //   1925: aconst_null
    //   1926: iconst_2
    //   1927: invokespecial <init> : (Ljava/lang/Object;Ljava/lang/Object;Lcs;I)V
    //   1930: astore_1
    //   1931: aload_0
    //   1932: iconst_1
    //   1933: putfield h : I
    //   1936: aload #7
    //   1938: getfield c : Lwm0;
    //   1941: astore #7
    //   1943: aload #7
    //   1945: getfield i : Ljava/lang/Object;
    //   1948: checkcast pm0
    //   1951: getstatic pm0.b : Lpm0;
    //   1954: if_acmpne -> 1963
    //   1957: aload #5
    //   1959: astore_1
    //   1960: goto -> 1986
    //   1963: new ek
    //   1966: dup
    //   1967: aload #7
    //   1969: aload_1
    //   1970: aconst_null
    //   1971: iconst_4
    //   1972: invokespecial <init> : (Ljava/lang/Object;Ljava/lang/Object;Lcs;I)V
    //   1975: aload_0
    //   1976: invokestatic n : (Lad0;Lcs;)Ljava/lang/Object;
    //   1979: astore_1
    //   1980: aload_1
    //   1981: aload #6
    //   1983: if_acmpne -> 1957
    //   1986: aload_1
    //   1987: aload #6
    //   1989: if_acmpne -> 1995
    //   1992: goto -> 1998
    //   1995: aload #5
    //   1997: astore_1
    //   1998: aload_1
    //   1999: aload #6
    //   2001: if_acmpne -> 63
    //   2004: aload #6
    //   2006: astore_1
    //   2007: aload_1
    //   2008: areturn
    //   2009: ldc_w 'activityTrimBinding'
    //   2012: invokestatic n0 : (Ljava/lang/String;)V
    //   2015: aconst_null
    //   2016: athrow
    //   2017: ldc_w 'activityTrimBinding'
    //   2020: invokestatic n0 : (Ljava/lang/String;)V
    //   2023: aconst_null
    //   2024: athrow
    //   2025: ldc_w 'activityTrimBinding'
    //   2028: invokestatic n0 : (Ljava/lang/String;)V
    //   2031: aconst_null
    //   2032: athrow
    //   2033: ldc_w 'activityTrimBinding'
    //   2036: invokestatic n0 : (Ljava/lang/String;)V
    //   2039: aconst_null
    //   2040: athrow
    //   2041: ldc_w 'activityTrimBinding'
    //   2044: invokestatic n0 : (Ljava/lang/String;)V
    //   2047: aconst_null
    //   2048: athrow
    //   2049: ldc_w 'activityTrimBinding'
    //   2052: invokestatic n0 : (Ljava/lang/String;)V
    //   2055: aconst_null
    //   2056: athrow
    //   2057: ldc_w 'activityTrimBinding'
    //   2060: invokestatic n0 : (Ljava/lang/String;)V
    //   2063: aconst_null
    //   2064: athrow
    //   2065: ldc_w 'activityTrimBinding'
    //   2068: invokestatic n0 : (Ljava/lang/String;)V
    //   2071: aconst_null
    //   2072: athrow
    //   2073: ldc_w 'activityTrimBinding'
    //   2076: invokestatic n0 : (Ljava/lang/String;)V
    //   2079: aconst_null
    //   2080: athrow
    //   2081: ldc_w 'activityTrimBinding'
    //   2084: invokestatic n0 : (Ljava/lang/String;)V
    //   2087: aconst_null
    //   2088: athrow
    //   2089: ldc_w 'activityTrimBinding'
    //   2092: invokestatic n0 : (Ljava/lang/String;)V
    //   2095: aconst_null
    //   2096: athrow
    //   2097: ldc_w 'activityTrimBinding'
    //   2100: invokestatic n0 : (Ljava/lang/String;)V
    //   2103: aconst_null
    //   2104: athrow
    //   2105: ldc_w 'activityTrimBinding'
    //   2108: invokestatic n0 : (Ljava/lang/String;)V
    //   2111: aconst_null
    //   2112: athrow
    //   2113: ldc_w 'activityTrimBinding'
    //   2116: invokestatic n0 : (Ljava/lang/String;)V
    //   2119: aconst_null
    //   2120: athrow
    //   2121: ldc_w 'activityTrimBinding'
    //   2124: invokestatic n0 : (Ljava/lang/String;)V
    //   2127: aconst_null
    //   2128: athrow
    //   2129: ldc_w 'activityTrimBinding'
    //   2132: invokestatic n0 : (Ljava/lang/String;)V
    //   2135: aconst_null
    //   2136: athrow
    //   2137: ldc_w 'activityTrimBinding'
    //   2140: invokestatic n0 : (Ljava/lang/String;)V
    //   2143: aconst_null
    //   2144: athrow
    //   2145: ldc_w 'activityTrimBinding'
    //   2148: invokestatic n0 : (Ljava/lang/String;)V
    //   2151: aconst_null
    //   2152: athrow
    //   2153: ldc_w 'activityTrimBinding'
    //   2156: invokestatic n0 : (Ljava/lang/String;)V
    //   2159: aconst_null
    //   2160: athrow
    //   2161: ldc_w 'activityTrimBinding'
    //   2164: invokestatic n0 : (Ljava/lang/String;)V
    //   2167: aconst_null
    //   2168: athrow
    //   2169: ldc_w 'mSongInfoWrapper'
    //   2172: invokestatic n0 : (Ljava/lang/String;)V
    //   2175: aconst_null
    //   2176: athrow
    //   2177: ldc_w 'activityTrimBinding'
    //   2180: invokestatic n0 : (Ljava/lang/String;)V
    //   2183: aconst_null
    //   2184: athrow
    //   2185: ldc_w 'activityTrimBinding'
    //   2188: invokestatic n0 : (Ljava/lang/String;)V
    //   2191: aconst_null
    //   2192: athrow
    //   2193: ldc_w 'activityTrimBinding'
    //   2196: invokestatic n0 : (Ljava/lang/String;)V
    //   2199: aconst_null
    //   2200: athrow
    //   2201: ldc_w 'activityTrimBinding'
    //   2204: invokestatic n0 : (Ljava/lang/String;)V
    //   2207: aconst_null
    //   2208: athrow
    //   2209: ldc_w 'activityTrimBinding'
    //   2212: invokestatic n0 : (Ljava/lang/String;)V
    //   2215: aconst_null
    //   2216: athrow
    //   2217: ldc_w 'activityTrimBinding'
    //   2220: invokestatic n0 : (Ljava/lang/String;)V
    //   2223: aconst_null
    //   2224: athrow
    //   2225: ldc_w 'activityTrimBinding'
    //   2228: invokestatic n0 : (Ljava/lang/String;)V
    //   2231: aconst_null
    //   2232: athrow
    //   2233: ldc_w 'activityTrimBinding'
    //   2236: invokestatic n0 : (Ljava/lang/String;)V
    //   2239: aconst_null
    //   2240: athrow
    //   2241: ldc_w 'activityTrimBinding'
    //   2244: invokestatic n0 : (Ljava/lang/String;)V
    //   2247: aconst_null
    //   2248: athrow
    //   2249: ldc_w 'activityTrimBinding'
    //   2252: invokestatic n0 : (Ljava/lang/String;)V
    //   2255: aconst_null
    //   2256: athrow
    //   2257: ldc_w 'activityTrimBinding'
    //   2260: invokestatic n0 : (Ljava/lang/String;)V
    //   2263: aconst_null
    //   2264: athrow
    //   2265: ldc_w 'mSongInfoWrapper'
    //   2268: invokestatic n0 : (Ljava/lang/String;)V
    //   2271: aconst_null
    //   2272: athrow
    //   2273: ldc_w 'activityTrimBinding'
    //   2276: invokestatic n0 : (Ljava/lang/String;)V
    //   2279: aconst_null
    //   2280: athrow
    //   2281: ldc_w 'activityTrimBinding'
    //   2284: invokestatic n0 : (Ljava/lang/String;)V
    //   2287: aconst_null
    //   2288: athrow
    //   2289: ldc_w 'mSongInfoWrapper'
    //   2292: invokestatic n0 : (Ljava/lang/String;)V
    //   2295: aconst_null
    //   2296: athrow
    //   2297: ldc_w 'activityTrimBinding'
    //   2300: invokestatic n0 : (Ljava/lang/String;)V
    //   2303: aconst_null
    //   2304: athrow
    //   2305: aload_0
    //   2306: getfield h : I
    //   2309: istore_2
    //   2310: iload_2
    //   2311: ifeq -> 2342
    //   2314: iload_2
    //   2315: iconst_1
    //   2316: if_icmpeq -> 2330
    //   2319: ldc 'call to 'resume' before 'invoke' with coroutine'
    //   2321: invokestatic f : (Ljava/lang/String;)V
    //   2324: aconst_null
    //   2325: astore #6
    //   2327: goto -> 2390
    //   2330: aload_1
    //   2331: invokestatic r0 : (Ljava/lang/Object;)V
    //   2334: new java/lang/RuntimeException
    //   2337: dup
    //   2338: invokespecial <init> : ()V
    //   2341: athrow
    //   2342: aload_1
    //   2343: invokestatic r0 : (Ljava/lang/Object;)V
    //   2346: getstatic in/krosbits/audio_cutter/TrimActivity.m0 : Lvx1;
    //   2349: astore_1
    //   2350: aload #8
    //   2352: invokevirtual getValue : ()Ljava/lang/Object;
    //   2355: checkcast by1
    //   2358: getfield d : Led1;
    //   2361: astore_1
    //   2362: new zq
    //   2365: dup
    //   2366: iconst_2
    //   2367: aload #7
    //   2369: invokespecial <init> : (ILjava/lang/Object;)V
    //   2372: astore #5
    //   2374: aload_0
    //   2375: iconst_1
    //   2376: putfield h : I
    //   2379: aload_1
    //   2380: getfield b : Lip1;
    //   2383: aload #5
    //   2385: aload_0
    //   2386: invokevirtual a : (Lx80;Lcs;)Ljava/lang/Object;
    //   2389: pop
    //   2390: aload #6
    //   2392: areturn
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar\\ux1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
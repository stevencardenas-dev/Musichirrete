public final class zq implements x80 {
  public final int b;
  
  public final Object c;
  
  public final Object k(Object paramObject, cs paramcs) {
    // Byte code:
    //   0: aload_0
    //   1: getfield b : I
    //   4: istore #11
    //   6: getstatic l02.a : Ll02;
    //   9: astore #14
    //   11: aload_0
    //   12: getfield c : Ljava/lang/Object;
    //   15: astore #16
    //   17: iload #11
    //   19: tableswitch default -> 40, 0 -> 2263, 1 -> 2245
    //   40: aload_1
    //   41: checkcast cy1
    //   44: astore #15
    //   46: aload #16
    //   48: checkcast in/krosbits/audio_cutter/TrimActivity
    //   51: astore_2
    //   52: aload_2
    //   53: getfield T : F
    //   56: fstore #5
    //   58: aload_2
    //   59: getfield S : Lkm0;
    //   62: astore_1
    //   63: aload_1
    //   64: ifnull -> 2237
    //   67: aload_1
    //   68: getfield c : Lqn1;
    //   71: getfield g : I
    //   74: i2f
    //   75: fstore_3
    //   76: aload_2
    //   77: getfield R : Lo2;
    //   80: astore_1
    //   81: aload_1
    //   82: ifnull -> 2230
    //   85: aload_1
    //   86: getfield v : Lcom/google/android/material/slider/RangeSlider;
    //   89: fconst_0
    //   90: invokevirtual setValueFrom : (F)V
    //   93: aload_2
    //   94: getfield R : Lo2;
    //   97: astore_1
    //   98: aload_1
    //   99: ifnull -> 2223
    //   102: aload_1
    //   103: getfield v : Lcom/google/android/material/slider/RangeSlider;
    //   106: fload_3
    //   107: invokevirtual setValueTo : (F)V
    //   110: aload_2
    //   111: getfield R : Lo2;
    //   114: astore_1
    //   115: aload_1
    //   116: ifnull -> 2216
    //   119: aload_1
    //   120: getfield v : Lcom/google/android/material/slider/RangeSlider;
    //   123: astore_1
    //   124: aload #15
    //   126: getfield c : Ljava/util/List;
    //   129: astore #17
    //   131: aload #15
    //   133: getfield j : Lvj0;
    //   136: astore #16
    //   138: aload #15
    //   140: getfield h : Li51;
    //   143: astore #18
    //   145: aload #15
    //   147: getfield g : F
    //   150: fstore #6
    //   152: aload #15
    //   154: getfield f : F
    //   157: fstore #7
    //   159: aload #15
    //   161: getfield d : Z
    //   164: istore #12
    //   166: aload #15
    //   168: getfield e : F
    //   171: fstore #4
    //   173: aload #15
    //   175: getfield b : Z
    //   178: istore #13
    //   180: aload_1
    //   181: aload #17
    //   183: invokevirtual setValues : (Ljava/util/List;)V
    //   186: aload_2
    //   187: getfield R : Lo2;
    //   190: astore_1
    //   191: aload_1
    //   192: ifnull -> 2209
    //   195: aload_1
    //   196: getfield H : Lin/krosbits/audio_cutter/WaveformView;
    //   199: astore_1
    //   200: aload #17
    //   202: iconst_0
    //   203: invokeinterface get : (I)Ljava/lang/Object;
    //   208: checkcast java/lang/Number
    //   211: invokevirtual floatValue : ()F
    //   214: ldc 100.0
    //   216: fmul
    //   217: fload_3
    //   218: fdiv
    //   219: fstore #10
    //   221: aload #17
    //   223: iconst_1
    //   224: invokeinterface get : (I)Ljava/lang/Object;
    //   229: checkcast java/lang/Number
    //   232: invokevirtual floatValue : ()F
    //   235: ldc 100.0
    //   237: fmul
    //   238: fload_3
    //   239: fdiv
    //   240: fstore #8
    //   242: ldc 100.0
    //   244: fload #4
    //   246: fmul
    //   247: fload_3
    //   248: fdiv
    //   249: fstore #9
    //   251: aload_1
    //   252: fload #10
    //   254: putfield i : F
    //   257: aload_1
    //   258: fload #8
    //   260: putfield j : F
    //   263: aload_1
    //   264: fload #9
    //   266: putfield p : F
    //   269: aload_1
    //   270: invokevirtual b : ()V
    //   273: aload_1
    //   274: invokevirtual invalidate : ()V
    //   277: aload_2
    //   278: getfield R : Lo2;
    //   281: astore_1
    //   282: aload_1
    //   283: ifnull -> 2202
    //   286: aload_1
    //   287: getfield w : Lcom/google/android/material/slider/Slider;
    //   290: fconst_0
    //   291: invokevirtual setValueFrom : (F)V
    //   294: aload_2
    //   295: getfield R : Lo2;
    //   298: astore_1
    //   299: aload_1
    //   300: ifnull -> 2195
    //   303: aload_1
    //   304: getfield w : Lcom/google/android/material/slider/Slider;
    //   307: fload_3
    //   308: invokevirtual setValueTo : (F)V
    //   311: aload_2
    //   312: getfield R : Lo2;
    //   315: astore_1
    //   316: aload_1
    //   317: ifnull -> 2188
    //   320: aload_1
    //   321: getfield w : Lcom/google/android/material/slider/Slider;
    //   324: astore_1
    //   325: fconst_0
    //   326: fload_3
    //   327: fcmpl
    //   328: ifgt -> 2174
    //   331: fload #4
    //   333: fconst_0
    //   334: fcmpg
    //   335: ifge -> 343
    //   338: fconst_0
    //   339: fstore_3
    //   340: goto -> 356
    //   343: fload #4
    //   345: fload_3
    //   346: fcmpl
    //   347: ifle -> 353
    //   350: goto -> 356
    //   353: fload #4
    //   355: fstore_3
    //   356: aload_1
    //   357: fload_3
    //   358: invokevirtual setValue : (F)V
    //   361: aload_2
    //   362: getfield R : Lo2;
    //   365: astore_1
    //   366: aload_1
    //   367: ifnull -> 2167
    //   370: aload_1
    //   371: getfield C : Lcom/google/android/material/button/MaterialButton;
    //   374: fload #4
    //   376: f2l
    //   377: iload #12
    //   379: iconst_0
    //   380: invokestatic D : (JZZ)Ljava/lang/String;
    //   383: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   386: aload_2
    //   387: getfield R : Lo2;
    //   390: astore_1
    //   391: aload_1
    //   392: ifnull -> 2160
    //   395: aload_1
    //   396: getfield w : Lcom/google/android/material/slider/Slider;
    //   399: astore #19
    //   401: aload #17
    //   403: iconst_0
    //   404: invokeinterface get : (I)Ljava/lang/Object;
    //   409: checkcast java/lang/Number
    //   412: invokevirtual floatValue : ()F
    //   415: fstore #8
    //   417: aload #17
    //   419: iconst_1
    //   420: invokeinterface get : (I)Ljava/lang/Object;
    //   425: checkcast java/lang/Number
    //   428: invokevirtual floatValue : ()F
    //   431: fstore_3
    //   432: fload #8
    //   434: fload #4
    //   436: fcmpg
    //   437: ifgt -> 455
    //   440: fload #4
    //   442: fload_3
    //   443: fcmpg
    //   444: ifgt -> 455
    //   447: aload_2
    //   448: getfield j0 : Landroid/content/res/ColorStateList;
    //   451: astore_1
    //   452: goto -> 460
    //   455: aload_2
    //   456: getfield k0 : Landroid/content/res/ColorStateList;
    //   459: astore_1
    //   460: aload #19
    //   462: aload_1
    //   463: invokevirtual setThumbTintList : (Landroid/content/res/ColorStateList;)V
    //   466: aload_2
    //   467: getfield R : Lo2;
    //   470: astore_1
    //   471: aload_1
    //   472: ifnull -> 2153
    //   475: aload_1
    //   476: getfield F : Lcom/google/android/material/textview/MaterialTextView;
    //   479: aload #17
    //   481: iconst_0
    //   482: invokeinterface get : (I)Ljava/lang/Object;
    //   487: checkcast java/lang/Number
    //   490: invokevirtual floatValue : ()F
    //   493: f2l
    //   494: iload #12
    //   496: iconst_0
    //   497: invokestatic D : (JZZ)Ljava/lang/String;
    //   500: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   503: aload_2
    //   504: getfield R : Lo2;
    //   507: astore_1
    //   508: aload_1
    //   509: ifnull -> 2146
    //   512: aload_1
    //   513: getfield D : Lcom/google/android/material/textview/MaterialTextView;
    //   516: aload #17
    //   518: iconst_1
    //   519: invokeinterface get : (I)Ljava/lang/Object;
    //   524: checkcast java/lang/Number
    //   527: invokevirtual floatValue : ()F
    //   530: f2l
    //   531: iload #12
    //   533: iconst_0
    //   534: invokestatic D : (JZZ)Ljava/lang/String;
    //   537: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   540: aload_2
    //   541: getfield R : Lo2;
    //   544: astore_1
    //   545: aload_1
    //   546: ifnull -> 2139
    //   549: aload_1
    //   550: getfield o : Lcom/google/android/material/button/MaterialButton;
    //   553: fload #7
    //   555: invokestatic o0 : (F)Ljava/lang/String;
    //   558: ldc ' s'
    //   560: invokevirtual concat : (Ljava/lang/String;)Ljava/lang/String;
    //   563: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   566: aload_2
    //   567: getfield R : Lo2;
    //   570: astore_1
    //   571: aload_1
    //   572: ifnull -> 2132
    //   575: aload_1
    //   576: getfield b : Lcom/google/android/material/button/MaterialButton;
    //   579: fload #6
    //   581: invokestatic o0 : (F)Ljava/lang/String;
    //   584: ldc ' s'
    //   586: invokevirtual concat : (Ljava/lang/String;)Ljava/lang/String;
    //   589: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   592: aload_2
    //   593: getfield R : Lo2;
    //   596: astore_1
    //   597: aload_1
    //   598: ifnull -> 2125
    //   601: aload_1
    //   602: getfield p : Lcom/google/android/material/button/MaterialButton;
    //   605: astore_1
    //   606: aload #17
    //   608: iconst_0
    //   609: invokeinterface get : (I)Ljava/lang/Object;
    //   614: checkcast java/lang/Number
    //   617: invokevirtual floatValue : ()F
    //   620: fload #7
    //   622: fsub
    //   623: fconst_0
    //   624: fcmpl
    //   625: iflt -> 634
    //   628: iconst_1
    //   629: istore #12
    //   631: goto -> 637
    //   634: iconst_0
    //   635: istore #12
    //   637: aload_1
    //   638: iload #12
    //   640: invokevirtual setEnabled : (Z)V
    //   643: aload_2
    //   644: getfield R : Lo2;
    //   647: astore_1
    //   648: aload_1
    //   649: ifnull -> 2118
    //   652: aload_1
    //   653: getfield q : Lcom/google/android/material/button/MaterialButton;
    //   656: astore_1
    //   657: aload #17
    //   659: iconst_0
    //   660: invokeinterface get : (I)Ljava/lang/Object;
    //   665: checkcast java/lang/Number
    //   668: invokevirtual floatValue : ()F
    //   671: fload #7
    //   673: fadd
    //   674: fload #5
    //   676: fadd
    //   677: aload #17
    //   679: iconst_1
    //   680: invokeinterface get : (I)Ljava/lang/Object;
    //   685: checkcast java/lang/Number
    //   688: invokevirtual floatValue : ()F
    //   691: fcmpg
    //   692: ifgt -> 701
    //   695: iconst_1
    //   696: istore #12
    //   698: goto -> 704
    //   701: iconst_0
    //   702: istore #12
    //   704: aload_1
    //   705: iload #12
    //   707: invokevirtual setEnabled : (Z)V
    //   710: aload_2
    //   711: getfield R : Lo2;
    //   714: astore_1
    //   715: aload_1
    //   716: ifnull -> 2111
    //   719: aload_1
    //   720: getfield c : Lcom/google/android/material/button/MaterialButton;
    //   723: astore_1
    //   724: aload #17
    //   726: iconst_1
    //   727: invokeinterface get : (I)Ljava/lang/Object;
    //   732: checkcast java/lang/Number
    //   735: invokevirtual floatValue : ()F
    //   738: fload #6
    //   740: fsub
    //   741: aload #17
    //   743: iconst_0
    //   744: invokeinterface get : (I)Ljava/lang/Object;
    //   749: checkcast java/lang/Number
    //   752: invokevirtual floatValue : ()F
    //   755: fload #5
    //   757: fadd
    //   758: fcmpl
    //   759: iflt -> 768
    //   762: iconst_1
    //   763: istore #12
    //   765: goto -> 771
    //   768: iconst_0
    //   769: istore #12
    //   771: aload_1
    //   772: iload #12
    //   774: invokevirtual setEnabled : (Z)V
    //   777: aload_2
    //   778: getfield R : Lo2;
    //   781: astore_1
    //   782: aload_1
    //   783: ifnull -> 2104
    //   786: aload_1
    //   787: getfield d : Lcom/google/android/material/button/MaterialButton;
    //   790: astore_1
    //   791: aload #17
    //   793: iconst_1
    //   794: invokeinterface get : (I)Ljava/lang/Object;
    //   799: checkcast java/lang/Number
    //   802: invokevirtual floatValue : ()F
    //   805: fload #6
    //   807: fadd
    //   808: aload #15
    //   810: getfield a : Lkm0;
    //   813: getfield c : Lqn1;
    //   816: getfield g : I
    //   819: i2f
    //   820: fcmpg
    //   821: ifgt -> 830
    //   824: iconst_1
    //   825: istore #12
    //   827: goto -> 833
    //   830: iconst_0
    //   831: istore #12
    //   833: aload_1
    //   834: iload #12
    //   836: invokevirtual setEnabled : (Z)V
    //   839: aload_2
    //   840: getfield R : Lo2;
    //   843: astore_1
    //   844: iload #13
    //   846: ifeq -> 1229
    //   849: aload_1
    //   850: ifnull -> 1222
    //   853: aload_1
    //   854: getfield z : Lcom/google/android/material/button/MaterialButtonToggleGroup;
    //   857: iconst_0
    //   858: invokevirtual setEnabled : (Z)V
    //   861: aload_2
    //   862: getfield R : Lo2;
    //   865: astore_1
    //   866: aload_1
    //   867: ifnull -> 1215
    //   870: aload_1
    //   871: getfield E : Lcom/google/android/material/textview/MaterialTextView;
    //   874: bipush #8
    //   876: invokevirtual setVisibility : (I)V
    //   879: aload_2
    //   880: getfield R : Lo2;
    //   883: astore_1
    //   884: aload_1
    //   885: ifnull -> 1208
    //   888: aload_1
    //   889: getfield z : Lcom/google/android/material/button/MaterialButtonToggleGroup;
    //   892: bipush #8
    //   894: invokevirtual setVisibility : (I)V
    //   897: aload #17
    //   899: iconst_1
    //   900: invokeinterface get : (I)Ljava/lang/Object;
    //   905: checkcast java/lang/Number
    //   908: invokevirtual floatValue : ()F
    //   911: aload #17
    //   913: iconst_0
    //   914: invokeinterface get : (I)Ljava/lang/Object;
    //   919: checkcast java/lang/Number
    //   922: invokevirtual floatValue : ()F
    //   925: fsub
    //   926: ldc 60000.0
    //   928: fcmpg
    //   929: ifgt -> 938
    //   932: iconst_1
    //   933: istore #11
    //   935: goto -> 941
    //   938: iconst_0
    //   939: istore #11
    //   941: iload #11
    //   943: ifeq -> 1028
    //   946: aload_2
    //   947: getfield R : Lo2;
    //   950: astore_1
    //   951: aload_1
    //   952: ifnull -> 1021
    //   955: aload_1
    //   956: getfield j : Lcom/google/android/material/button/MaterialButton;
    //   959: invokevirtual isEnabled : ()Z
    //   962: ifne -> 1028
    //   965: aload_2
    //   966: getfield R : Lo2;
    //   969: astore_1
    //   970: aload_1
    //   971: ifnull -> 1014
    //   974: aload_1
    //   975: getfield j : Lcom/google/android/material/button/MaterialButton;
    //   978: aload_2
    //   979: ldc 2131887349
    //   981: invokevirtual getString : (I)Ljava/lang/String;
    //   984: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   987: aload_2
    //   988: getfield R : Lo2;
    //   991: astore_1
    //   992: aload_1
    //   993: ifnull -> 1007
    //   996: aload_1
    //   997: getfield j : Lcom/google/android/material/button/MaterialButton;
    //   1000: iconst_1
    //   1001: invokevirtual setEnabled : (Z)V
    //   1004: goto -> 1363
    //   1007: ldc 'activityTrimBinding'
    //   1009: invokestatic n0 : (Ljava/lang/String;)V
    //   1012: aconst_null
    //   1013: athrow
    //   1014: ldc 'activityTrimBinding'
    //   1016: invokestatic n0 : (Ljava/lang/String;)V
    //   1019: aconst_null
    //   1020: athrow
    //   1021: ldc 'activityTrimBinding'
    //   1023: invokestatic n0 : (Ljava/lang/String;)V
    //   1026: aconst_null
    //   1027: athrow
    //   1028: iload #11
    //   1030: ifne -> 1004
    //   1033: aload_2
    //   1034: getfield R : Lo2;
    //   1037: astore_1
    //   1038: aload_1
    //   1039: ifnull -> 1201
    //   1042: aload_1
    //   1043: getfield j : Lcom/google/android/material/button/MaterialButton;
    //   1046: invokevirtual isEnabled : ()Z
    //   1049: ifeq -> 1004
    //   1052: aload_2
    //   1053: getfield R : Lo2;
    //   1056: astore_1
    //   1057: aload_1
    //   1058: ifnull -> 1194
    //   1061: aload_1
    //   1062: getfield j : Lcom/google/android/material/button/MaterialButton;
    //   1065: astore #22
    //   1067: aload_2
    //   1068: ldc 2131887349
    //   1070: invokevirtual getString : (I)Ljava/lang/String;
    //   1073: astore #21
    //   1075: aload_2
    //   1076: ldc 2131886476
    //   1078: invokevirtual getString : (I)Ljava/lang/String;
    //   1081: astore #20
    //   1083: aload_2
    //   1084: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   1087: ldc 2131755058
    //   1089: bipush #60
    //   1091: iconst_1
    //   1092: anewarray java/lang/Object
    //   1095: dup
    //   1096: iconst_0
    //   1097: bipush #60
    //   1099: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1102: aastore
    //   1103: invokevirtual getQuantityString : (II[Ljava/lang/Object;)Ljava/lang/String;
    //   1106: astore_1
    //   1107: new java/lang/StringBuilder
    //   1110: dup
    //   1111: invokespecial <init> : ()V
    //   1114: astore #19
    //   1116: aload #19
    //   1118: aload #21
    //   1120: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1123: pop
    //   1124: aload #19
    //   1126: ldc_w '\\n'
    //   1129: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1132: pop
    //   1133: aload #19
    //   1135: aload #20
    //   1137: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1140: pop
    //   1141: aload #19
    //   1143: ldc_w ' ≤ '
    //   1146: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1149: pop
    //   1150: aload #19
    //   1152: aload_1
    //   1153: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1156: pop
    //   1157: aload #22
    //   1159: aload #19
    //   1161: invokevirtual toString : ()Ljava/lang/String;
    //   1164: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   1167: aload_2
    //   1168: getfield R : Lo2;
    //   1171: astore_1
    //   1172: aload_1
    //   1173: ifnull -> 1187
    //   1176: aload_1
    //   1177: getfield j : Lcom/google/android/material/button/MaterialButton;
    //   1180: iconst_0
    //   1181: invokevirtual setEnabled : (Z)V
    //   1184: goto -> 1363
    //   1187: ldc 'activityTrimBinding'
    //   1189: invokestatic n0 : (Ljava/lang/String;)V
    //   1192: aconst_null
    //   1193: athrow
    //   1194: ldc 'activityTrimBinding'
    //   1196: invokestatic n0 : (Ljava/lang/String;)V
    //   1199: aconst_null
    //   1200: athrow
    //   1201: ldc 'activityTrimBinding'
    //   1203: invokestatic n0 : (Ljava/lang/String;)V
    //   1206: aconst_null
    //   1207: athrow
    //   1208: ldc 'activityTrimBinding'
    //   1210: invokestatic n0 : (Ljava/lang/String;)V
    //   1213: aconst_null
    //   1214: athrow
    //   1215: ldc 'activityTrimBinding'
    //   1217: invokestatic n0 : (Ljava/lang/String;)V
    //   1220: aconst_null
    //   1221: athrow
    //   1222: ldc 'activityTrimBinding'
    //   1224: invokestatic n0 : (Ljava/lang/String;)V
    //   1227: aconst_null
    //   1228: athrow
    //   1229: aload_1
    //   1230: ifnull -> 2097
    //   1233: aload_1
    //   1234: getfield z : Lcom/google/android/material/button/MaterialButtonToggleGroup;
    //   1237: astore_1
    //   1238: aload #18
    //   1240: invokevirtual ordinal : ()I
    //   1243: istore #11
    //   1245: iload #11
    //   1247: ifeq -> 1332
    //   1250: iload #11
    //   1252: iconst_1
    //   1253: if_icmpeq -> 1301
    //   1256: iload #11
    //   1258: iconst_2
    //   1259: if_icmpne -> 1293
    //   1262: aload_2
    //   1263: getfield R : Lo2;
    //   1266: astore #19
    //   1268: aload #19
    //   1270: ifnull -> 1286
    //   1273: aload #19
    //   1275: getfield e : Lcom/google/android/material/button/MaterialButton;
    //   1278: invokevirtual getId : ()I
    //   1281: istore #11
    //   1283: goto -> 1356
    //   1286: ldc 'activityTrimBinding'
    //   1288: invokestatic n0 : (Ljava/lang/String;)V
    //   1291: aconst_null
    //   1292: athrow
    //   1293: new java/lang/RuntimeException
    //   1296: dup
    //   1297: invokespecial <init> : ()V
    //   1300: athrow
    //   1301: aload_2
    //   1302: getfield R : Lo2;
    //   1305: astore #19
    //   1307: aload #19
    //   1309: ifnull -> 1325
    //   1312: aload #19
    //   1314: getfield h : Lcom/google/android/material/button/MaterialButton;
    //   1317: invokevirtual getId : ()I
    //   1320: istore #11
    //   1322: goto -> 1283
    //   1325: ldc 'activityTrimBinding'
    //   1327: invokestatic n0 : (Ljava/lang/String;)V
    //   1330: aconst_null
    //   1331: athrow
    //   1332: aload_2
    //   1333: getfield R : Lo2;
    //   1336: astore #19
    //   1338: aload #19
    //   1340: ifnull -> 2090
    //   1343: aload #19
    //   1345: getfield g : Lcom/google/android/material/button/MaterialButton;
    //   1348: invokevirtual getId : ()I
    //   1351: istore #11
    //   1353: goto -> 1283
    //   1356: aload_1
    //   1357: iload #11
    //   1359: iconst_1
    //   1360: invokevirtual g : (IZ)V
    //   1363: aload #15
    //   1365: getfield q : Li51;
    //   1368: astore #19
    //   1370: aload #15
    //   1372: getfield o : Lcd1;
    //   1375: ifnull -> 1415
    //   1378: aload #15
    //   1380: getfield p : Ljava/util/List;
    //   1383: astore_1
    //   1384: aload_1
    //   1385: ifnull -> 1415
    //   1388: aload #19
    //   1390: ifnull -> 1415
    //   1393: aload_1
    //   1394: aload #17
    //   1396: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1399: ifeq -> 1415
    //   1402: aload #19
    //   1404: aload #18
    //   1406: if_acmpne -> 1415
    //   1409: iconst_1
    //   1410: istore #11
    //   1412: goto -> 1418
    //   1415: iconst_0
    //   1416: istore #11
    //   1418: aload_2
    //   1419: getfield R : Lo2;
    //   1422: astore_1
    //   1423: aload_1
    //   1424: ifnull -> 2083
    //   1427: aload_1
    //   1428: getfield j : Lcom/google/android/material/button/MaterialButton;
    //   1431: iload #11
    //   1433: iconst_1
    //   1434: ixor
    //   1435: invokestatic x0 : (Landroid/view/View;Z)V
    //   1438: aload_2
    //   1439: getfield R : Lo2;
    //   1442: astore_1
    //   1443: aload_1
    //   1444: ifnull -> 2076
    //   1447: aload_1
    //   1448: getfield k : Lcom/google/android/material/button/MaterialButton;
    //   1451: astore_1
    //   1452: iload #11
    //   1454: ifeq -> 1468
    //   1457: iload #13
    //   1459: ifne -> 1468
    //   1462: iconst_1
    //   1463: istore #12
    //   1465: goto -> 1471
    //   1468: iconst_0
    //   1469: istore #12
    //   1471: aload_1
    //   1472: iload #12
    //   1474: invokestatic x0 : (Landroid/view/View;Z)V
    //   1477: aload_2
    //   1478: getfield R : Lo2;
    //   1481: astore_1
    //   1482: aload_1
    //   1483: ifnull -> 2069
    //   1486: aload_1
    //   1487: getfield n : Lcom/google/android/material/button/MaterialButton;
    //   1490: astore_1
    //   1491: iload #11
    //   1493: ifeq -> 1507
    //   1496: iload #13
    //   1498: ifne -> 1507
    //   1501: iconst_1
    //   1502: istore #12
    //   1504: goto -> 1510
    //   1507: iconst_0
    //   1508: istore #12
    //   1510: aload_1
    //   1511: iload #12
    //   1513: invokestatic x0 : (Landroid/view/View;Z)V
    //   1516: aload_2
    //   1517: getfield R : Lo2;
    //   1520: astore_1
    //   1521: aload_1
    //   1522: ifnull -> 2062
    //   1525: aload_1
    //   1526: getfield l : Lcom/google/android/material/button/MaterialButton;
    //   1529: astore_1
    //   1530: iload #11
    //   1532: ifeq -> 1546
    //   1535: iload #13
    //   1537: ifne -> 1546
    //   1540: iconst_1
    //   1541: istore #12
    //   1543: goto -> 1549
    //   1546: iconst_0
    //   1547: istore #12
    //   1549: aload_1
    //   1550: iload #12
    //   1552: invokestatic x0 : (Landroid/view/View;Z)V
    //   1555: iload #11
    //   1557: ifeq -> 1603
    //   1560: iload #13
    //   1562: ifeq -> 1572
    //   1565: aload_2
    //   1566: invokevirtual finish : ()V
    //   1569: goto -> 2025
    //   1572: aload_2
    //   1573: getfield R : Lo2;
    //   1576: astore_1
    //   1577: aload_1
    //   1578: ifnull -> 1596
    //   1581: aload_1
    //   1582: getfield k : Lcom/google/android/material/button/MaterialButton;
    //   1585: aload #15
    //   1587: getfield r : Ljava/lang/CharSequence;
    //   1590: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   1593: goto -> 1603
    //   1596: ldc 'activityTrimBinding'
    //   1598: invokestatic n0 : (Ljava/lang/String;)V
    //   1601: aconst_null
    //   1602: athrow
    //   1603: aload #15
    //   1605: getfield u : Landroid/graphics/Bitmap;
    //   1608: astore_1
    //   1609: aload_1
    //   1610: ifnull -> 1643
    //   1613: aload_2
    //   1614: getfield R : Lo2;
    //   1617: astore #17
    //   1619: aload #17
    //   1621: ifnull -> 1636
    //   1624: aload #17
    //   1626: getfield H : Lin/krosbits/audio_cutter/WaveformView;
    //   1629: aload_1
    //   1630: invokevirtual setWaveBitmap : (Landroid/graphics/Bitmap;)V
    //   1633: goto -> 1643
    //   1636: ldc 'activityTrimBinding'
    //   1638: invokestatic n0 : (Ljava/lang/String;)V
    //   1641: aconst_null
    //   1642: athrow
    //   1643: aload_2
    //   1644: getfield R : Lo2;
    //   1647: astore_1
    //   1648: aload_1
    //   1649: ifnull -> 2055
    //   1652: aload_1
    //   1653: getfield u : Lcom/google/android/material/progressindicator/LinearProgressIndicator;
    //   1656: astore_1
    //   1657: aload #15
    //   1659: getfield l : Lvj0;
    //   1662: astore #17
    //   1664: aload #17
    //   1666: ifnull -> 1686
    //   1669: aload #17
    //   1671: invokeinterface a : ()Z
    //   1676: iconst_1
    //   1677: if_icmpne -> 1686
    //   1680: iconst_1
    //   1681: istore #12
    //   1683: goto -> 1689
    //   1686: iconst_0
    //   1687: istore #12
    //   1689: aload_1
    //   1690: iload #12
    //   1692: invokestatic x0 : (Landroid/view/View;Z)V
    //   1695: aload #16
    //   1697: ifnull -> 1712
    //   1700: aload #16
    //   1702: invokeinterface a : ()Z
    //   1707: istore #12
    //   1709: goto -> 1715
    //   1712: iconst_0
    //   1713: istore #12
    //   1715: iload #12
    //   1717: ifne -> 1826
    //   1720: aload #15
    //   1722: getfield k : Lvj0;
    //   1725: astore_1
    //   1726: aload_1
    //   1727: ifnull -> 1741
    //   1730: aload_1
    //   1731: invokeinterface a : ()Z
    //   1736: istore #12
    //   1738: goto -> 1744
    //   1741: iconst_0
    //   1742: istore #12
    //   1744: iload #12
    //   1746: ifne -> 1826
    //   1749: aload #15
    //   1751: getfield m : Lvj0;
    //   1754: astore_1
    //   1755: aload_1
    //   1756: ifnull -> 1770
    //   1759: aload_1
    //   1760: invokeinterface a : ()Z
    //   1765: istore #12
    //   1767: goto -> 1773
    //   1770: iconst_0
    //   1771: istore #12
    //   1773: iload #12
    //   1775: ifeq -> 1781
    //   1778: goto -> 1826
    //   1781: aload_2
    //   1782: getfield V : Lss0;
    //   1785: astore_1
    //   1786: aload_1
    //   1787: ifnull -> 1818
    //   1790: aload_1
    //   1791: invokevirtual dismiss : ()V
    //   1794: aload_2
    //   1795: getfield W : Lss0;
    //   1798: astore_1
    //   1799: aload_1
    //   1800: ifnull -> 1810
    //   1803: aload_1
    //   1804: invokevirtual dismiss : ()V
    //   1807: goto -> 1956
    //   1810: ldc_w 'intermediateProgressDialog'
    //   1813: invokestatic n0 : (Ljava/lang/String;)V
    //   1816: aconst_null
    //   1817: athrow
    //   1818: ldc_w 'progressDialog'
    //   1821: invokestatic n0 : (Ljava/lang/String;)V
    //   1824: aconst_null
    //   1825: athrow
    //   1826: aload #15
    //   1828: getfield n : Lin/krosbits/nativex/Cn;
    //   1831: ifnull -> 1930
    //   1834: aload #16
    //   1836: ifnull -> 1854
    //   1839: aload #16
    //   1841: checkcast dk0
    //   1844: invokevirtual N : ()Z
    //   1847: iconst_1
    //   1848: if_icmpne -> 1854
    //   1851: goto -> 1930
    //   1854: aload #15
    //   1856: getfield i : F
    //   1859: f2i
    //   1860: istore #11
    //   1862: aload_2
    //   1863: getfield V : Lss0;
    //   1866: astore_1
    //   1867: aload_1
    //   1868: ifnull -> 1922
    //   1871: aload_1
    //   1872: iload #11
    //   1874: invokevirtual m : (I)V
    //   1877: aload_2
    //   1878: getfield V : Lss0;
    //   1881: astore_1
    //   1882: aload_1
    //   1883: ifnull -> 1914
    //   1886: aload_1
    //   1887: invokevirtual show : ()V
    //   1890: aload_2
    //   1891: getfield W : Lss0;
    //   1894: astore_1
    //   1895: aload_1
    //   1896: ifnull -> 1906
    //   1899: aload_1
    //   1900: invokevirtual dismiss : ()V
    //   1903: goto -> 1956
    //   1906: ldc_w 'intermediateProgressDialog'
    //   1909: invokestatic n0 : (Ljava/lang/String;)V
    //   1912: aconst_null
    //   1913: athrow
    //   1914: ldc_w 'progressDialog'
    //   1917: invokestatic n0 : (Ljava/lang/String;)V
    //   1920: aconst_null
    //   1921: athrow
    //   1922: ldc_w 'progressDialog'
    //   1925: invokestatic n0 : (Ljava/lang/String;)V
    //   1928: aconst_null
    //   1929: athrow
    //   1930: aload_2
    //   1931: getfield W : Lss0;
    //   1934: astore_1
    //   1935: aload_1
    //   1936: ifnull -> 2047
    //   1939: aload_1
    //   1940: invokevirtual show : ()V
    //   1943: aload_2
    //   1944: getfield V : Lss0;
    //   1947: astore_1
    //   1948: aload_1
    //   1949: ifnull -> 2039
    //   1952: aload_1
    //   1953: invokevirtual dismiss : ()V
    //   1956: aload #15
    //   1958: getfield s : Ljava/lang/String;
    //   1961: astore_1
    //   1962: aload_2
    //   1963: getfield X : Lss0;
    //   1966: astore #15
    //   1968: aload_1
    //   1969: ifnull -> 2015
    //   1972: aload #15
    //   1974: ifnull -> 2007
    //   1977: aload #15
    //   1979: aload_1
    //   1980: invokevirtual k : (Ljava/lang/CharSequence;)V
    //   1983: aload_2
    //   1984: getfield X : Lss0;
    //   1987: astore_1
    //   1988: aload_1
    //   1989: ifnull -> 1999
    //   1992: aload_1
    //   1993: invokevirtual show : ()V
    //   1996: goto -> 2025
    //   1999: ldc_w 'finishDialog'
    //   2002: invokestatic n0 : (Ljava/lang/String;)V
    //   2005: aconst_null
    //   2006: athrow
    //   2007: ldc_w 'finishDialog'
    //   2010: invokestatic n0 : (Ljava/lang/String;)V
    //   2013: aconst_null
    //   2014: athrow
    //   2015: aload #15
    //   2017: ifnull -> 2031
    //   2020: aload #15
    //   2022: invokevirtual dismiss : ()V
    //   2025: aload #14
    //   2027: astore_1
    //   2028: goto -> 2186
    //   2031: ldc_w 'finishDialog'
    //   2034: invokestatic n0 : (Ljava/lang/String;)V
    //   2037: aconst_null
    //   2038: athrow
    //   2039: ldc_w 'progressDialog'
    //   2042: invokestatic n0 : (Ljava/lang/String;)V
    //   2045: aconst_null
    //   2046: athrow
    //   2047: ldc_w 'intermediateProgressDialog'
    //   2050: invokestatic n0 : (Ljava/lang/String;)V
    //   2053: aconst_null
    //   2054: athrow
    //   2055: ldc 'activityTrimBinding'
    //   2057: invokestatic n0 : (Ljava/lang/String;)V
    //   2060: aconst_null
    //   2061: athrow
    //   2062: ldc 'activityTrimBinding'
    //   2064: invokestatic n0 : (Ljava/lang/String;)V
    //   2067: aconst_null
    //   2068: athrow
    //   2069: ldc 'activityTrimBinding'
    //   2071: invokestatic n0 : (Ljava/lang/String;)V
    //   2074: aconst_null
    //   2075: athrow
    //   2076: ldc 'activityTrimBinding'
    //   2078: invokestatic n0 : (Ljava/lang/String;)V
    //   2081: aconst_null
    //   2082: athrow
    //   2083: ldc 'activityTrimBinding'
    //   2085: invokestatic n0 : (Ljava/lang/String;)V
    //   2088: aconst_null
    //   2089: athrow
    //   2090: ldc 'activityTrimBinding'
    //   2092: invokestatic n0 : (Ljava/lang/String;)V
    //   2095: aconst_null
    //   2096: athrow
    //   2097: ldc 'activityTrimBinding'
    //   2099: invokestatic n0 : (Ljava/lang/String;)V
    //   2102: aconst_null
    //   2103: athrow
    //   2104: ldc 'activityTrimBinding'
    //   2106: invokestatic n0 : (Ljava/lang/String;)V
    //   2109: aconst_null
    //   2110: athrow
    //   2111: ldc 'activityTrimBinding'
    //   2113: invokestatic n0 : (Ljava/lang/String;)V
    //   2116: aconst_null
    //   2117: athrow
    //   2118: ldc 'activityTrimBinding'
    //   2120: invokestatic n0 : (Ljava/lang/String;)V
    //   2123: aconst_null
    //   2124: athrow
    //   2125: ldc 'activityTrimBinding'
    //   2127: invokestatic n0 : (Ljava/lang/String;)V
    //   2130: aconst_null
    //   2131: athrow
    //   2132: ldc 'activityTrimBinding'
    //   2134: invokestatic n0 : (Ljava/lang/String;)V
    //   2137: aconst_null
    //   2138: athrow
    //   2139: ldc 'activityTrimBinding'
    //   2141: invokestatic n0 : (Ljava/lang/String;)V
    //   2144: aconst_null
    //   2145: athrow
    //   2146: ldc 'activityTrimBinding'
    //   2148: invokestatic n0 : (Ljava/lang/String;)V
    //   2151: aconst_null
    //   2152: athrow
    //   2153: ldc 'activityTrimBinding'
    //   2155: invokestatic n0 : (Ljava/lang/String;)V
    //   2158: aconst_null
    //   2159: athrow
    //   2160: ldc 'activityTrimBinding'
    //   2162: invokestatic n0 : (Ljava/lang/String;)V
    //   2165: aconst_null
    //   2166: athrow
    //   2167: ldc 'activityTrimBinding'
    //   2169: invokestatic n0 : (Ljava/lang/String;)V
    //   2172: aconst_null
    //   2173: athrow
    //   2174: ldc_w 'Cannot coerce value to an empty range: maximum '
    //   2177: fload_3
    //   2178: ldc_w ' is less than minimum 0.0.'
    //   2181: invokestatic i : (Ljava/lang/String;FLjava/lang/Object;)V
    //   2184: aconst_null
    //   2185: astore_1
    //   2186: aload_1
    //   2187: areturn
    //   2188: ldc 'activityTrimBinding'
    //   2190: invokestatic n0 : (Ljava/lang/String;)V
    //   2193: aconst_null
    //   2194: athrow
    //   2195: ldc 'activityTrimBinding'
    //   2197: invokestatic n0 : (Ljava/lang/String;)V
    //   2200: aconst_null
    //   2201: athrow
    //   2202: ldc 'activityTrimBinding'
    //   2204: invokestatic n0 : (Ljava/lang/String;)V
    //   2207: aconst_null
    //   2208: athrow
    //   2209: ldc 'activityTrimBinding'
    //   2211: invokestatic n0 : (Ljava/lang/String;)V
    //   2214: aconst_null
    //   2215: athrow
    //   2216: ldc 'activityTrimBinding'
    //   2218: invokestatic n0 : (Ljava/lang/String;)V
    //   2221: aconst_null
    //   2222: athrow
    //   2223: ldc 'activityTrimBinding'
    //   2225: invokestatic n0 : (Ljava/lang/String;)V
    //   2228: aconst_null
    //   2229: athrow
    //   2230: ldc 'activityTrimBinding'
    //   2232: invokestatic n0 : (Ljava/lang/String;)V
    //   2235: aconst_null
    //   2236: athrow
    //   2237: ldc_w 'mSongInfoWrapper'
    //   2240: invokestatic n0 : (Ljava/lang/String;)V
    //   2243: aconst_null
    //   2244: athrow
    //   2245: aload #16
    //   2247: checkcast me1
    //   2250: aload_1
    //   2251: putfield b : Ljava/lang/Object;
    //   2254: new d
    //   2257: dup
    //   2258: aload_0
    //   2259: invokespecial <init> : (Lzq;)V
    //   2262: athrow
    //   2263: aload_2
    //   2264: instanceof yq
    //   2267: ifeq -> 2309
    //   2270: aload_2
    //   2271: checkcast yq
    //   2274: astore #15
    //   2276: aload #15
    //   2278: getfield g : I
    //   2281: istore #11
    //   2283: iload #11
    //   2285: ldc_w -2147483648
    //   2288: iand
    //   2289: ifeq -> 2309
    //   2292: aload #15
    //   2294: iload #11
    //   2296: ldc_w -2147483648
    //   2299: iadd
    //   2300: putfield g : I
    //   2303: aload #15
    //   2305: astore_2
    //   2306: goto -> 2319
    //   2309: new yq
    //   2312: dup
    //   2313: aload_0
    //   2314: aload_2
    //   2315: invokespecial <init> : (Lzq;Lcs;)V
    //   2318: astore_2
    //   2319: aload_2
    //   2320: getfield f : Ljava/lang/Object;
    //   2323: astore #15
    //   2325: aload_2
    //   2326: getfield g : I
    //   2329: istore #11
    //   2331: iload #11
    //   2333: ifeq -> 2361
    //   2336: iload #11
    //   2338: iconst_1
    //   2339: if_icmpne -> 2350
    //   2342: aload #15
    //   2344: invokestatic r0 : (Ljava/lang/Object;)V
    //   2347: goto -> 2407
    //   2350: ldc_w 'call to 'resume' before 'invoke' with coroutine'
    //   2353: invokestatic f : (Ljava/lang/String;)V
    //   2356: aconst_null
    //   2357: astore_1
    //   2358: goto -> 2410
    //   2361: aload #15
    //   2363: invokestatic r0 : (Ljava/lang/Object;)V
    //   2366: aload #16
    //   2368: checkcast x80
    //   2371: astore #15
    //   2373: aload_1
    //   2374: instanceof kr
    //   2377: ifeq -> 2407
    //   2380: aload_2
    //   2381: iconst_1
    //   2382: putfield g : I
    //   2385: aload #15
    //   2387: aload_1
    //   2388: aload_2
    //   2389: invokeinterface k : (Ljava/lang/Object;Lcs;)Ljava/lang/Object;
    //   2394: astore_2
    //   2395: getstatic ys.b : Lys;
    //   2398: astore_1
    //   2399: aload_2
    //   2400: aload_1
    //   2401: if_acmpne -> 2407
    //   2404: goto -> 2410
    //   2407: aload #14
    //   2409: astore_1
    //   2410: aload_1
    //   2411: areturn
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\zq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
public final class vi2 implements Runnable {
  public final int b;
  
  public Object c;
  
  public final Object e;
  
  public vi2(ij0 paramij0, ej0 paramej0, int paramInt) {
    this.e = paramij0;
    this.c = paramej0;
  }
  
  private final void a() {
    // Byte code:
    //   0: aload_0
    //   1: getfield e : Ljava/lang/Object;
    //   4: checkcast in/krosbits/musicolet/FileUtilsActivity
    //   7: astore #19
    //   9: iconst_0
    //   10: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   13: astore #20
    //   15: aload_0
    //   16: getfield c : Ljava/lang/Object;
    //   19: checkcast android/content/Intent
    //   22: astore #15
    //   24: aload #15
    //   26: ifnull -> 3510
    //   29: aload #15
    //   31: invokevirtual getAction : ()Ljava/lang/String;
    //   34: astore #16
    //   36: getstatic in/krosbits/musicolet/MyApplication.H : La01;
    //   39: ifnull -> 57
    //   42: getstatic in/krosbits/musicolet/MyApplication.i : Lin/krosbits/musicolet/MyApplication;
    //   45: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   48: invokevirtual getContentResolver : ()Landroid/content/ContentResolver;
    //   51: getstatic in/krosbits/musicolet/MyApplication.H : La01;
    //   54: invokevirtual unregisterContentObserver : (Landroid/database/ContentObserver;)V
    //   57: aconst_null
    //   58: putstatic in/krosbits/musicolet/MyApplication.H : La01;
    //   61: ldc 'actmv'
    //   63: aload #16
    //   65: invokevirtual equals : (Ljava/lang/Object;)Z
    //   68: istore #9
    //   70: ldc '/'
    //   72: astore #26
    //   74: iload #9
    //   76: ifeq -> 1278
    //   79: getstatic in/krosbits/musicolet/FileUtilsActivity.U : [Lkm0;
    //   82: astore #29
    //   84: aconst_null
    //   85: putstatic in/krosbits/musicolet/FileUtilsActivity.U : [Lkm0;
    //   88: aload #15
    //   90: ldc 'extdfpt'
    //   92: invokevirtual getStringExtra : (Ljava/lang/String;)Ljava/lang/String;
    //   95: astore #21
    //   97: aload #15
    //   99: ldc 'extrsfpt'
    //   101: invokevirtual getStringExtra : (Ljava/lang/String;)Ljava/lang/String;
    //   104: astore #17
    //   106: iconst_1
    //   107: putstatic in/krosbits/musicolet/FileUtilsActivity.V : Z
    //   110: getstatic in/krosbits/musicolet/MyApplication.j : Lwn1;
    //   113: getfield c : Llm0;
    //   116: getstatic in/krosbits/musicolet/MusicService.V0 : Lwo;
    //   119: invokevirtual b : (Lwo;)Lkm0;
    //   122: astore #16
    //   124: aload #29
    //   126: arraylength
    //   127: istore #4
    //   129: new q01
    //   132: astore #30
    //   134: aload #30
    //   136: iconst_0
    //   137: invokespecial <init> : (I)V
    //   140: aload #19
    //   142: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   145: ldc 2131755021
    //   147: iload #4
    //   149: iconst_1
    //   150: anewarray java/lang/Object
    //   153: dup
    //   154: iconst_0
    //   155: iload #4
    //   157: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   160: aastore
    //   161: invokevirtual getQuantityString : (II[Ljava/lang/Object;)Ljava/lang/String;
    //   164: astore #22
    //   166: aload #19
    //   168: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   171: astore #18
    //   173: aload #16
    //   175: astore #15
    //   177: aload #19
    //   179: aload #22
    //   181: iload #4
    //   183: iconst_0
    //   184: aload #18
    //   186: ldc 2131755047
    //   188: iconst_0
    //   189: iconst_1
    //   190: anewarray java/lang/Object
    //   193: dup
    //   194: iconst_0
    //   195: aload #20
    //   197: aastore
    //   198: invokevirtual getQuantityString : (II[Ljava/lang/Object;)Ljava/lang/String;
    //   201: invokevirtual m0 : (Ljava/lang/String;IILjava/lang/String;)V
    //   204: new java/util/HashMap
    //   207: astore #24
    //   209: aload #24
    //   211: iload #4
    //   213: invokespecial <init> : (I)V
    //   216: new java/util/HashMap
    //   219: astore #25
    //   221: aload #25
    //   223: iload #4
    //   225: invokespecial <init> : (I)V
    //   228: new java/util/ArrayList
    //   231: astore #23
    //   233: aload #23
    //   235: iload #4
    //   237: invokespecial <init> : (I)V
    //   240: getstatic in/krosbits/musicolet/MyApplication.F : Lyp1;
    //   243: invokevirtual p : ()Z
    //   246: ifne -> 346
    //   249: aload #21
    //   251: ldc 'Storage'
    //   253: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   256: ifeq -> 262
    //   259: goto -> 346
    //   262: getstatic android/os/Build$VERSION.SDK_INT : I
    //   265: bipush #30
    //   267: if_icmplt -> 331
    //   270: aload #21
    //   272: ldc 'content:'
    //   274: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   277: ifeq -> 331
    //   280: aload #21
    //   282: invokestatic parse : (Ljava/lang/String;)Landroid/net/Uri;
    //   285: invokestatic isTreeUri : (Landroid/net/Uri;)Z
    //   288: ifeq -> 331
    //   291: getstatic in/krosbits/musicolet/MyApplication.i : Lin/krosbits/musicolet/MyApplication;
    //   294: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   297: aload #21
    //   299: invokestatic parse : (Ljava/lang/String;)Landroid/net/Uri;
    //   302: invokestatic t : (Landroid/content/Context;Landroid/net/Uri;)Lv00;
    //   305: astore #20
    //   307: aload #20
    //   309: getfield b : Ld61;
    //   312: invokevirtual toString : ()Ljava/lang/String;
    //   315: astore #21
    //   317: goto -> 366
    //   320: iconst_0
    //   321: istore #9
    //   323: goto -> 1246
    //   326: astore #15
    //   328: goto -> 320
    //   331: new java/lang/IllegalStateException
    //   334: astore #15
    //   336: aload #15
    //   338: ldc 'FUA:ntvtree'
    //   340: invokespecial <init> : (Ljava/lang/String;)V
    //   343: aload #15
    //   345: athrow
    //   346: getstatic in/krosbits/musicolet/MyApplication.F : Lyp1;
    //   349: aload #21
    //   351: invokevirtual d : (Ljava/lang/String;)Lv00;
    //   354: astore #18
    //   356: getstatic in/krosbits/musicolet/MyApplication.F : Lyp1;
    //   359: aload #18
    //   361: invokevirtual l : (Lv00;)Lv00;
    //   364: astore #20
    //   366: aload #17
    //   368: astore #16
    //   370: iconst_0
    //   371: istore_2
    //   372: iconst_0
    //   373: istore_1
    //   374: iconst_0
    //   375: istore #9
    //   377: iload_2
    //   378: iload #4
    //   380: if_icmpge -> 389
    //   383: getstatic in/krosbits/musicolet/FileUtilsActivity.V : Z
    //   386: ifne -> 396
    //   389: aload #15
    //   391: astore #16
    //   393: goto -> 1111
    //   396: aload #29
    //   398: iload_2
    //   399: aaload
    //   400: getfield c : Lqn1;
    //   403: getfield f : Lwo;
    //   406: astore #32
    //   408: aload #19
    //   410: aload #22
    //   412: iload #4
    //   414: iload_1
    //   415: aload #19
    //   417: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   420: ldc 2131755047
    //   422: iload_1
    //   423: iconst_1
    //   424: anewarray java/lang/Object
    //   427: dup
    //   428: iconst_0
    //   429: iload_1
    //   430: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   433: aastore
    //   434: invokevirtual getQuantityString : (II[Ljava/lang/Object;)Ljava/lang/String;
    //   437: invokevirtual m0 : (Ljava/lang/String;IILjava/lang/String;)V
    //   440: getstatic in/krosbits/musicolet/MyApplication.F : Lyp1;
    //   443: aload #29
    //   445: iload_2
    //   446: aaload
    //   447: invokevirtual d : ()Lv00;
    //   450: invokevirtual l : (Lv00;)Lv00;
    //   453: astore #31
    //   455: aload #29
    //   457: iload_2
    //   458: aaload
    //   459: getfield g : Ljava/lang/String;
    //   462: astore #28
    //   464: aload #28
    //   466: astore #27
    //   468: aload #16
    //   470: astore #17
    //   472: aload #16
    //   474: ifnull -> 588
    //   477: aload #16
    //   479: astore #18
    //   481: aload #16
    //   483: aload #26
    //   485: invokevirtual endsWith : (Ljava/lang/String;)Z
    //   488: ifne -> 544
    //   491: new java/lang/StringBuilder
    //   494: astore #17
    //   496: aload #17
    //   498: invokespecial <init> : ()V
    //   501: aload #17
    //   503: aload #16
    //   505: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   508: pop
    //   509: aload #17
    //   511: aload #26
    //   513: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   516: pop
    //   517: aload #17
    //   519: invokevirtual toString : ()Ljava/lang/String;
    //   522: astore #18
    //   524: goto -> 544
    //   527: astore #16
    //   529: aload #15
    //   531: astore #17
    //   533: aload #16
    //   535: astore #15
    //   537: aload #17
    //   539: astore #16
    //   541: goto -> 1246
    //   544: aload #28
    //   546: astore #27
    //   548: aload #18
    //   550: astore #17
    //   552: aload #29
    //   554: iload_2
    //   555: aaload
    //   556: getfield h : Ljava/lang/String;
    //   559: aload #18
    //   561: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   564: ifeq -> 588
    //   567: aload #29
    //   569: iload_2
    //   570: aaload
    //   571: getfield h : Ljava/lang/String;
    //   574: aload #18
    //   576: invokevirtual length : ()I
    //   579: invokevirtual substring : (I)Ljava/lang/String;
    //   582: astore #27
    //   584: aload #18
    //   586: astore #17
    //   588: aload #20
    //   590: aload #27
    //   592: invokevirtual A : (Ljava/lang/String;)Lv00;
    //   595: astore #18
    //   597: getstatic in/krosbits/musicolet/MyApplication.F : Lyp1;
    //   600: astore #28
    //   602: aload #18
    //   604: getfield b : Ld61;
    //   607: invokevirtual toString : ()Ljava/lang/String;
    //   610: astore #16
    //   612: aload #28
    //   614: aload #16
    //   616: invokevirtual d : (Ljava/lang/String;)Lv00;
    //   619: astore #16
    //   621: new wo
    //   624: astore #28
    //   626: aload #16
    //   628: ifnull -> 648
    //   631: aload #16
    //   633: invokevirtual j : ()Landroid/net/Uri;
    //   636: astore #16
    //   638: aload #16
    //   640: invokevirtual toString : ()Ljava/lang/String;
    //   643: astore #16
    //   645: goto -> 658
    //   648: aload #18
    //   650: invokevirtual j : ()Landroid/net/Uri;
    //   653: astore #16
    //   655: goto -> 638
    //   658: aload #28
    //   660: aload #16
    //   662: aload #30
    //   664: invokespecial <init> : (Ljava/lang/String;Lq01;)V
    //   667: aload #28
    //   669: aload #32
    //   671: invokevirtual equals : (Ljava/lang/Object;)Z
    //   674: ifeq -> 683
    //   677: iinc #1, 1
    //   680: goto -> 1096
    //   683: aload #27
    //   685: invokestatic J : (Ljava/lang/String;)Ljava/lang/String;
    //   688: astore #16
    //   690: aload #27
    //   692: invokestatic C : (Ljava/lang/String;)Ljava/lang/String;
    //   695: astore #33
    //   697: aload #28
    //   699: astore #27
    //   701: iconst_2
    //   702: istore_3
    //   703: aload #18
    //   705: invokevirtual l : ()Z
    //   708: ifeq -> 849
    //   711: new java/lang/StringBuilder
    //   714: astore #18
    //   716: aload #18
    //   718: invokespecial <init> : ()V
    //   721: aload #18
    //   723: aload #16
    //   725: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   728: pop
    //   729: aload #18
    //   731: ldc_w '('
    //   734: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   737: pop
    //   738: aload #18
    //   740: iload_3
    //   741: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   744: pop
    //   745: aload #18
    //   747: ldc_w ').'
    //   750: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   753: pop
    //   754: aload #18
    //   756: aload #33
    //   758: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   761: pop
    //   762: aload #20
    //   764: aload #18
    //   766: invokevirtual toString : ()Ljava/lang/String;
    //   769: invokevirtual A : (Ljava/lang/String;)Lv00;
    //   772: astore #27
    //   774: getstatic in/krosbits/musicolet/MyApplication.F : Lyp1;
    //   777: aload #27
    //   779: getfield b : Ld61;
    //   782: invokevirtual toString : ()Ljava/lang/String;
    //   785: invokevirtual d : (Ljava/lang/String;)Lv00;
    //   788: astore #18
    //   790: aload #18
    //   792: ifnull -> 812
    //   795: aload #18
    //   797: invokevirtual j : ()Landroid/net/Uri;
    //   800: astore #18
    //   802: aload #18
    //   804: invokevirtual toString : ()Ljava/lang/String;
    //   807: astore #18
    //   809: goto -> 822
    //   812: aload #27
    //   814: invokevirtual j : ()Landroid/net/Uri;
    //   817: astore #18
    //   819: goto -> 802
    //   822: new wo
    //   825: dup
    //   826: aload #18
    //   828: aload #30
    //   830: invokespecial <init> : (Ljava/lang/String;Lq01;)V
    //   833: astore #28
    //   835: aload #27
    //   837: astore #18
    //   839: iinc #3, 1
    //   842: aload #28
    //   844: astore #27
    //   846: goto -> 703
    //   849: new java/lang/StringBuilder
    //   852: astore #16
    //   854: aload #16
    //   856: invokespecial <init> : ()V
    //   859: aload #16
    //   861: ldc_w 'FUM:d>'
    //   864: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   867: pop
    //   868: aload #16
    //   870: aload #21
    //   872: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   875: pop
    //   876: aload #16
    //   878: ldc_w ';t>'
    //   881: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   884: pop
    //   885: aload #16
    //   887: aload #18
    //   889: invokevirtual j : ()Landroid/net/Uri;
    //   892: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   895: pop
    //   896: aload #16
    //   898: invokevirtual toString : ()Ljava/lang/String;
    //   901: invokestatic F : (Ljava/lang/String;)V
    //   904: getstatic in/krosbits/musicolet/MyApplication.i : Lin/krosbits/musicolet/MyApplication;
    //   907: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   910: pop
    //   911: aload #31
    //   913: aload #18
    //   915: invokestatic f : (Lv00;Lv00;)Z
    //   918: istore #12
    //   920: iload #12
    //   922: ifeq -> 1005
    //   925: aload #15
    //   927: ifnull -> 963
    //   930: aload #15
    //   932: getfield c : Lqn1;
    //   935: getfield f : Lwo;
    //   938: aload #32
    //   940: invokestatic equals : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   943: ifeq -> 963
    //   946: invokestatic o0 : ()Z
    //   949: istore #10
    //   951: iload #10
    //   953: istore #9
    //   955: goto -> 963
    //   958: astore #16
    //   960: goto -> 529
    //   963: iload #9
    //   965: istore #10
    //   967: getstatic in/krosbits/musicolet/MyApplication.i : Lin/krosbits/musicolet/MyApplication;
    //   970: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   973: pop
    //   974: iload #9
    //   976: istore #10
    //   978: aload #31
    //   980: invokestatic l : (Lv00;)Z
    //   983: istore #11
    //   985: iload #11
    //   987: istore #10
    //   989: goto -> 1008
    //   992: aload #15
    //   994: astore #16
    //   996: astore #15
    //   998: iload #10
    //   1000: istore #9
    //   1002: goto -> 1246
    //   1005: iconst_0
    //   1006: istore #10
    //   1008: iload #12
    //   1010: ifeq -> 1093
    //   1013: iload #10
    //   1015: ifeq -> 1093
    //   1018: iinc #1, 1
    //   1021: iload #9
    //   1023: istore #10
    //   1025: aload #24
    //   1027: aload #32
    //   1029: aload #27
    //   1031: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   1034: pop
    //   1035: iload #9
    //   1037: istore #10
    //   1039: aload #25
    //   1041: aload #32
    //   1043: aload #18
    //   1045: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   1048: pop
    //   1049: iload #9
    //   1051: istore #10
    //   1053: getstatic in/krosbits/musicolet/MyApplication.F : Lyp1;
    //   1056: aload #18
    //   1058: invokevirtual g : (Lv00;)Ljava/lang/String;
    //   1061: astore #16
    //   1063: aload #16
    //   1065: ifnull -> 1083
    //   1068: iload #9
    //   1070: istore #10
    //   1072: aload #23
    //   1074: aload #16
    //   1076: invokevirtual add : (Ljava/lang/Object;)Z
    //   1079: pop
    //   1080: goto -> 1083
    //   1083: iload #9
    //   1085: istore #10
    //   1087: invokestatic b : ()V
    //   1090: goto -> 1096
    //   1093: goto -> 1090
    //   1096: iinc #2, 1
    //   1099: aload #17
    //   1101: astore #16
    //   1103: goto -> 377
    //   1106: astore #16
    //   1108: goto -> 529
    //   1111: aload #19
    //   1113: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   1116: ldc 2131755047
    //   1118: iload_1
    //   1119: iconst_1
    //   1120: anewarray java/lang/Object
    //   1123: dup
    //   1124: iconst_0
    //   1125: iload_1
    //   1126: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1129: aastore
    //   1130: invokevirtual getQuantityString : (II[Ljava/lang/Object;)Ljava/lang/String;
    //   1133: astore #17
    //   1135: aload #19
    //   1137: aload #22
    //   1139: iload #4
    //   1141: iload_1
    //   1142: aload #17
    //   1144: invokevirtual m0 : (Ljava/lang/String;IILjava/lang/String;)V
    //   1147: aload #24
    //   1149: invokevirtual isEmpty : ()Z
    //   1152: istore #10
    //   1154: iload #10
    //   1156: ifne -> 1217
    //   1159: getstatic in/krosbits/musicolet/MyApplication.j : Lwn1;
    //   1162: aload #25
    //   1164: invokevirtual x : (Ljava/util/HashMap;)V
    //   1167: getstatic in/krosbits/musicolet/MyApplication.j : Lwn1;
    //   1170: invokevirtual o : ()V
    //   1173: invokestatic b : ()V
    //   1176: getstatic in/krosbits/musicolet/MyApplication.j : Lwn1;
    //   1179: getfield c : Llm0;
    //   1182: aload #24
    //   1184: putfield w : Ljava/util/HashMap;
    //   1187: invokestatic r : ()V
    //   1190: iconst_0
    //   1191: invokestatic q0 : (Z)V
    //   1194: getstatic in/krosbits/musicolet/MyApplication.i : Lin/krosbits/musicolet/MyApplication;
    //   1197: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   1200: aload #23
    //   1202: iconst_0
    //   1203: anewarray java/lang/String
    //   1206: invokevirtual toArray : ([Ljava/lang/Object;)[Ljava/lang/Object;
    //   1209: checkcast [Ljava/lang/String;
    //   1212: aconst_null
    //   1213: aconst_null
    //   1214: invokestatic scanFile : (Landroid/content/Context;[Ljava/lang/String;[Ljava/lang/String;Landroid/media/MediaScannerConnection$OnScanCompletedListener;)V
    //   1217: aload #19
    //   1219: aload #16
    //   1221: iload #9
    //   1223: aload #17
    //   1225: invokevirtual n0 : (Lkm0;ZLjava/lang/String;)V
    //   1228: goto -> 1271
    //   1231: astore #15
    //   1233: goto -> 1246
    //   1236: astore #15
    //   1238: goto -> 1233
    //   1241: astore #15
    //   1243: goto -> 320
    //   1246: aload #15
    //   1248: invokevirtual printStackTrace : ()V
    //   1251: aload #19
    //   1253: aload #16
    //   1255: iload #9
    //   1257: aload #19
    //   1259: ldc_w 2131886550
    //   1262: invokevirtual getString : (I)Ljava/lang/String;
    //   1265: invokevirtual n0 : (Lkm0;ZLjava/lang/String;)V
    //   1268: goto -> 1228
    //   1271: iconst_0
    //   1272: putstatic in/krosbits/musicolet/FileUtilsActivity.V : Z
    //   1275: goto -> 3507
    //   1278: ldc '/'
    //   1280: astore #23
    //   1282: ldc_w 'actcp'
    //   1285: aload #16
    //   1287: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1290: ifeq -> 2651
    //   1293: getstatic in/krosbits/musicolet/FileUtilsActivity.U : [Lkm0;
    //   1296: astore #27
    //   1298: aconst_null
    //   1299: putstatic in/krosbits/musicolet/FileUtilsActivity.U : [Lkm0;
    //   1302: aload #15
    //   1304: ldc 'extdfpt'
    //   1306: invokevirtual getStringExtra : (Ljava/lang/String;)Ljava/lang/String;
    //   1309: astore #16
    //   1311: aload #15
    //   1313: ldc 'extrsfpt'
    //   1315: invokevirtual getStringExtra : (Ljava/lang/String;)Ljava/lang/String;
    //   1318: astore #17
    //   1320: iconst_1
    //   1321: putstatic in/krosbits/musicolet/FileUtilsActivity.V : Z
    //   1324: aload #27
    //   1326: arraylength
    //   1327: istore #4
    //   1329: new q01
    //   1332: astore #28
    //   1334: aload #28
    //   1336: iconst_0
    //   1337: invokespecial <init> : (I)V
    //   1340: aload #19
    //   1342: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   1345: ldc_w 2131755012
    //   1348: iload #4
    //   1350: iconst_1
    //   1351: anewarray java/lang/Object
    //   1354: dup
    //   1355: iconst_0
    //   1356: iload #4
    //   1358: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1361: aastore
    //   1362: invokevirtual getQuantityString : (II[Ljava/lang/Object;)Ljava/lang/String;
    //   1365: astore #18
    //   1367: aload #19
    //   1369: aload #18
    //   1371: iload #4
    //   1373: iconst_0
    //   1374: aload #19
    //   1376: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   1379: ldc_w 2131755044
    //   1382: iconst_0
    //   1383: iconst_1
    //   1384: anewarray java/lang/Object
    //   1387: dup
    //   1388: iconst_0
    //   1389: aload #20
    //   1391: aastore
    //   1392: invokevirtual getQuantityString : (II[Ljava/lang/Object;)Ljava/lang/String;
    //   1395: invokevirtual m0 : (Ljava/lang/String;IILjava/lang/String;)V
    //   1398: new java/util/ArrayList
    //   1401: astore #26
    //   1403: aload #26
    //   1405: iload #4
    //   1407: invokespecial <init> : (I)V
    //   1410: new java/util/ArrayList
    //   1413: astore #21
    //   1415: aload #21
    //   1417: iload #4
    //   1419: invokespecial <init> : (I)V
    //   1422: getstatic in/krosbits/musicolet/MyApplication.F : Lyp1;
    //   1425: invokevirtual p : ()Z
    //   1428: ifne -> 1529
    //   1431: aload #16
    //   1433: ldc 'Storage'
    //   1435: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   1438: ifeq -> 1444
    //   1441: goto -> 1529
    //   1444: getstatic android/os/Build$VERSION.SDK_INT : I
    //   1447: bipush #30
    //   1449: if_icmplt -> 1514
    //   1452: aload #16
    //   1454: ldc 'content:'
    //   1456: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   1459: ifeq -> 1514
    //   1462: aload #16
    //   1464: invokestatic parse : (Ljava/lang/String;)Landroid/net/Uri;
    //   1467: invokestatic isTreeUri : (Landroid/net/Uri;)Z
    //   1470: ifeq -> 1514
    //   1473: getstatic in/krosbits/musicolet/MyApplication.i : Lin/krosbits/musicolet/MyApplication;
    //   1476: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   1479: aload #16
    //   1481: invokestatic parse : (Ljava/lang/String;)Landroid/net/Uri;
    //   1484: invokestatic t : (Landroid/content/Context;Landroid/net/Uri;)Lv00;
    //   1487: astore #15
    //   1489: aload #15
    //   1491: getfield b : Ld61;
    //   1494: invokevirtual toString : ()Ljava/lang/String;
    //   1497: astore #16
    //   1499: goto -> 1548
    //   1502: aload #19
    //   1504: astore #16
    //   1506: goto -> 2613
    //   1509: astore #15
    //   1511: goto -> 1502
    //   1514: new java/lang/IllegalStateException
    //   1517: astore #15
    //   1519: aload #15
    //   1521: ldc 'FUA:ntvtree'
    //   1523: invokespecial <init> : (Ljava/lang/String;)V
    //   1526: aload #15
    //   1528: athrow
    //   1529: getstatic in/krosbits/musicolet/MyApplication.F : Lyp1;
    //   1532: astore #15
    //   1534: aload #15
    //   1536: aload #15
    //   1538: aload #16
    //   1540: invokevirtual d : (Ljava/lang/String;)Lv00;
    //   1543: invokevirtual l : (Lv00;)Lv00;
    //   1546: astore #15
    //   1548: new im0
    //   1551: astore #29
    //   1553: aload #29
    //   1555: iconst_1
    //   1556: iconst_0
    //   1557: iconst_1
    //   1558: invokespecial <init> : (ZZZ)V
    //   1561: aload #29
    //   1563: invokevirtual o : ()V
    //   1566: iconst_0
    //   1567: istore_3
    //   1568: iconst_0
    //   1569: istore_1
    //   1570: aload #16
    //   1572: astore #20
    //   1574: aload #15
    //   1576: astore #22
    //   1578: aload #19
    //   1580: astore #15
    //   1582: aload #17
    //   1584: astore #16
    //   1586: iload_3
    //   1587: iload #4
    //   1589: if_icmpge -> 1598
    //   1592: getstatic in/krosbits/musicolet/FileUtilsActivity.V : Z
    //   1595: ifne -> 1601
    //   1598: goto -> 2488
    //   1601: aload #15
    //   1603: aload #18
    //   1605: iload #4
    //   1607: iload_1
    //   1608: aload #15
    //   1610: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   1613: ldc_w 2131755044
    //   1616: iload_1
    //   1617: iconst_1
    //   1618: anewarray java/lang/Object
    //   1621: dup
    //   1622: iconst_0
    //   1623: iload_1
    //   1624: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1627: aastore
    //   1628: invokevirtual getQuantityString : (II[Ljava/lang/Object;)Ljava/lang/String;
    //   1631: invokevirtual m0 : (Ljava/lang/String;IILjava/lang/String;)V
    //   1634: aload #27
    //   1636: iload_3
    //   1637: aaload
    //   1638: astore #17
    //   1640: aload #17
    //   1642: getfield c : Lqn1;
    //   1645: getfield f : Lwo;
    //   1648: astore #30
    //   1650: aload #17
    //   1652: invokevirtual d : ()Lv00;
    //   1655: astore #31
    //   1657: aload #27
    //   1659: iload_3
    //   1660: aaload
    //   1661: getfield g : Ljava/lang/String;
    //   1664: astore #17
    //   1666: aload #16
    //   1668: ifnull -> 1781
    //   1671: aload #16
    //   1673: aload #23
    //   1675: invokevirtual endsWith : (Ljava/lang/String;)Z
    //   1678: istore #9
    //   1680: iload #9
    //   1682: ifne -> 1738
    //   1685: new java/lang/StringBuilder
    //   1688: astore #19
    //   1690: aload #19
    //   1692: invokespecial <init> : ()V
    //   1695: aload #19
    //   1697: aload #16
    //   1699: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1702: pop
    //   1703: aload #19
    //   1705: aload #23
    //   1707: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1710: pop
    //   1711: aload #19
    //   1713: invokevirtual toString : ()Ljava/lang/String;
    //   1716: astore #16
    //   1718: goto -> 1738
    //   1721: astore #16
    //   1723: aload #15
    //   1725: astore #17
    //   1727: aload #16
    //   1729: astore #15
    //   1731: aload #17
    //   1733: astore #16
    //   1735: goto -> 2613
    //   1738: aload #27
    //   1740: iload_3
    //   1741: aaload
    //   1742: getfield h : Ljava/lang/String;
    //   1745: aload #16
    //   1747: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   1750: ifeq -> 1773
    //   1753: aload #27
    //   1755: iload_3
    //   1756: aaload
    //   1757: getfield h : Ljava/lang/String;
    //   1760: aload #16
    //   1762: invokevirtual length : ()I
    //   1765: invokevirtual substring : (I)Ljava/lang/String;
    //   1768: astore #17
    //   1770: goto -> 1781
    //   1773: goto -> 1770
    //   1776: astore #16
    //   1778: goto -> 1723
    //   1781: aload #22
    //   1783: aload #17
    //   1785: invokevirtual A : (Ljava/lang/String;)Lv00;
    //   1788: astore #25
    //   1790: getstatic in/krosbits/musicolet/MyApplication.F : Lyp1;
    //   1793: astore #19
    //   1795: aload #23
    //   1797: astore #24
    //   1799: aload #19
    //   1801: aload #25
    //   1803: getfield b : Ld61;
    //   1806: invokevirtual toString : ()Ljava/lang/String;
    //   1809: invokevirtual d : (Ljava/lang/String;)Lv00;
    //   1812: astore #19
    //   1814: aload #19
    //   1816: ifnonnull -> 1824
    //   1819: iconst_1
    //   1820: istore_2
    //   1821: goto -> 1829
    //   1824: iconst_0
    //   1825: istore_2
    //   1826: goto -> 1821
    //   1829: new wo
    //   1832: astore #23
    //   1834: aload #19
    //   1836: ifnull -> 1856
    //   1839: aload #19
    //   1841: invokevirtual j : ()Landroid/net/Uri;
    //   1844: astore #19
    //   1846: aload #19
    //   1848: invokevirtual toString : ()Ljava/lang/String;
    //   1851: astore #19
    //   1853: goto -> 1866
    //   1856: aload #25
    //   1858: invokevirtual j : ()Landroid/net/Uri;
    //   1861: astore #19
    //   1863: goto -> 1846
    //   1866: aload #23
    //   1868: aload #19
    //   1870: aload #28
    //   1872: invokespecial <init> : (Ljava/lang/String;Lq01;)V
    //   1875: aload #23
    //   1877: aload #30
    //   1879: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1882: ifeq -> 1895
    //   1885: iinc #1, 1
    //   1888: iload_1
    //   1889: istore_2
    //   1890: iload_2
    //   1891: istore_1
    //   1892: goto -> 2478
    //   1895: aload #17
    //   1897: invokestatic J : (Ljava/lang/String;)Ljava/lang/String;
    //   1900: astore #32
    //   1902: aload #17
    //   1904: invokestatic C : (Ljava/lang/String;)Ljava/lang/String;
    //   1907: astore #19
    //   1909: aload #25
    //   1911: astore #17
    //   1913: iconst_2
    //   1914: istore #5
    //   1916: iload_2
    //   1917: istore #6
    //   1919: aload #17
    //   1921: invokevirtual l : ()Z
    //   1924: ifeq -> 2081
    //   1927: new java/lang/StringBuilder
    //   1930: astore #17
    //   1932: aload #17
    //   1934: invokespecial <init> : ()V
    //   1937: aload #17
    //   1939: aload #32
    //   1941: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1944: pop
    //   1945: aload #17
    //   1947: ldc_w '('
    //   1950: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1953: pop
    //   1954: aload #17
    //   1956: iload #5
    //   1958: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   1961: pop
    //   1962: aload #17
    //   1964: ldc_w ').'
    //   1967: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1970: pop
    //   1971: aload #17
    //   1973: aload #19
    //   1975: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1978: pop
    //   1979: aload #22
    //   1981: aload #17
    //   1983: invokevirtual toString : ()Ljava/lang/String;
    //   1986: invokevirtual A : (Ljava/lang/String;)Lv00;
    //   1989: astore #23
    //   1991: getstatic in/krosbits/musicolet/MyApplication.F : Lyp1;
    //   1994: aload #23
    //   1996: getfield b : Ld61;
    //   1999: invokevirtual toString : ()Ljava/lang/String;
    //   2002: invokevirtual d : (Ljava/lang/String;)Lv00;
    //   2005: astore #17
    //   2007: aload #17
    //   2009: ifnonnull -> 2017
    //   2012: iconst_1
    //   2013: istore_2
    //   2014: goto -> 2019
    //   2017: iconst_0
    //   2018: istore_2
    //   2019: aload #17
    //   2021: ifnull -> 2041
    //   2024: aload #17
    //   2026: invokevirtual j : ()Landroid/net/Uri;
    //   2029: astore #17
    //   2031: aload #17
    //   2033: invokevirtual toString : ()Ljava/lang/String;
    //   2036: astore #17
    //   2038: goto -> 2051
    //   2041: aload #23
    //   2043: invokevirtual j : ()Landroid/net/Uri;
    //   2046: astore #17
    //   2048: goto -> 2031
    //   2051: new wo
    //   2054: dup
    //   2055: aload #17
    //   2057: aload #28
    //   2059: invokespecial <init> : (Ljava/lang/String;Lq01;)V
    //   2062: astore #25
    //   2064: aload #23
    //   2066: astore #17
    //   2068: aload #25
    //   2070: astore #23
    //   2072: iinc #5, 1
    //   2075: iload_2
    //   2076: istore #6
    //   2078: goto -> 1919
    //   2081: new java/lang/StringBuilder
    //   2084: astore #19
    //   2086: aload #19
    //   2088: invokespecial <init> : ()V
    //   2091: aload #19
    //   2093: ldc_w 'FUC:d>'
    //   2096: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2099: pop
    //   2100: aload #19
    //   2102: aload #20
    //   2104: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2107: pop
    //   2108: aload #19
    //   2110: ldc_w ';t>'
    //   2113: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2116: pop
    //   2117: aload #19
    //   2119: aload #23
    //   2121: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   2124: pop
    //   2125: aload #19
    //   2127: invokevirtual toString : ()Ljava/lang/String;
    //   2130: invokestatic F : (Ljava/lang/String;)V
    //   2133: getstatic in/krosbits/musicolet/MyApplication.i : Lin/krosbits/musicolet/MyApplication;
    //   2136: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   2139: pop
    //   2140: aload #31
    //   2142: aload #17
    //   2144: invokestatic f : (Lv00;Lv00;)Z
    //   2147: istore #9
    //   2149: iload_1
    //   2150: istore_2
    //   2151: iload #9
    //   2153: ifeq -> 2473
    //   2156: iinc #1, 1
    //   2159: iload_1
    //   2160: istore_2
    //   2161: iload #6
    //   2163: ifne -> 2473
    //   2166: getstatic in/krosbits/musicolet/MyApplication.j : Lwn1;
    //   2169: getfield c : Llm0;
    //   2172: aload #30
    //   2174: invokevirtual b : (Lwo;)Lkm0;
    //   2177: astore #30
    //   2179: invokestatic getInstance : ()Ljava/util/Calendar;
    //   2182: invokevirtual getTimeInMillis : ()J
    //   2185: lstore #13
    //   2187: aload #17
    //   2189: invokevirtual i : ()Lu00;
    //   2192: checkcast v00
    //   2195: astore #25
    //   2197: aload #30
    //   2199: getfield u : I
    //   2202: istore #6
    //   2204: aload #29
    //   2206: aload #25
    //   2208: invokevirtual j : (Lv00;)Z
    //   2211: istore #12
    //   2213: aload #25
    //   2215: ifnonnull -> 2224
    //   2218: iconst_0
    //   2219: istore #9
    //   2221: goto -> 2247
    //   2224: aload #29
    //   2226: aload #25
    //   2228: getfield b : Ld61;
    //   2231: invokevirtual toString : ()Ljava/lang/String;
    //   2234: invokevirtual a : (Ljava/lang/String;)Ljava/lang/String;
    //   2237: astore #19
    //   2239: aload #19
    //   2241: ifnull -> 2218
    //   2244: iconst_1
    //   2245: istore #9
    //   2247: aload #25
    //   2249: iconst_1
    //   2250: invokestatic y : (Lv00;Z)Lv00;
    //   2253: ifnull -> 2262
    //   2256: iconst_1
    //   2257: istore #10
    //   2259: goto -> 2265
    //   2262: iconst_0
    //   2263: istore #10
    //   2265: aload #25
    //   2267: iconst_1
    //   2268: invokestatic z : (Lv00;Z)Lv00;
    //   2271: ifnull -> 2280
    //   2274: iconst_1
    //   2275: istore #11
    //   2277: goto -> 2283
    //   2280: iconst_0
    //   2281: istore #11
    //   2283: iload #12
    //   2285: iload #9
    //   2287: iload #10
    //   2289: iload #11
    //   2291: invokestatic c : (ZZZZ)I
    //   2294: istore #7
    //   2296: new km0
    //   2299: astore #25
    //   2301: aload #30
    //   2303: getfield b : I
    //   2306: istore #5
    //   2308: new qn1
    //   2311: astore #19
    //   2313: aload #30
    //   2315: getfield c : Lqn1;
    //   2318: astore #31
    //   2320: aload #19
    //   2322: aload #23
    //   2324: aload #31
    //   2326: getfield b : Ljava/lang/String;
    //   2329: aload #31
    //   2331: getfield c : Ljava/lang/String;
    //   2334: aload #31
    //   2336: getfield e : Ljava/lang/String;
    //   2339: aload #31
    //   2341: getfield g : I
    //   2344: invokespecial <init> : (Lwo;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V
    //   2347: aload #30
    //   2349: getfield e : Ljava/lang/String;
    //   2352: astore #23
    //   2354: aload #30
    //   2356: getfield f : Ljava/lang/String;
    //   2359: astore #31
    //   2361: aload #30
    //   2363: getfield j : Ljava/lang/String;
    //   2366: astore #32
    //   2368: aload #30
    //   2370: getfield p : I
    //   2373: istore #8
    //   2375: aload #30
    //   2377: getfield q : I
    //   2380: istore_2
    //   2381: aload #20
    //   2383: invokestatic b : (Ljava/lang/String;)Ljava/lang/String;
    //   2386: astore #30
    //   2388: aload #17
    //   2390: invokevirtual h : ()Ljava/lang/String;
    //   2393: astore #33
    //   2395: aload #25
    //   2397: iload #5
    //   2399: aload #19
    //   2401: aload #23
    //   2403: aload #31
    //   2405: aload #32
    //   2407: lload #13
    //   2409: lload #13
    //   2411: lconst_0
    //   2412: lconst_0
    //   2413: iconst_0
    //   2414: iconst_0
    //   2415: iconst_0
    //   2416: iconst_0
    //   2417: iload #8
    //   2419: iload_2
    //   2420: aload #20
    //   2422: aload #30
    //   2424: aload #33
    //   2426: iload #6
    //   2428: bipush #-96
    //   2430: iand
    //   2431: iload #7
    //   2433: ior
    //   2434: invokespecial <init> : (ILqn1;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJJJIIIIIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V
    //   2437: aload #26
    //   2439: aload #25
    //   2441: invokevirtual add : (Ljava/lang/Object;)Z
    //   2444: pop
    //   2445: getstatic in/krosbits/musicolet/MyApplication.F : Lyp1;
    //   2448: aload #17
    //   2450: invokevirtual g : (Lv00;)Ljava/lang/String;
    //   2453: astore #17
    //   2455: iload_1
    //   2456: istore_2
    //   2457: aload #17
    //   2459: ifnull -> 1890
    //   2462: aload #21
    //   2464: aload #17
    //   2466: invokevirtual add : (Ljava/lang/Object;)Z
    //   2469: pop
    //   2470: goto -> 2478
    //   2473: iload_2
    //   2474: istore_1
    //   2475: goto -> 1888
    //   2478: iinc #3, 1
    //   2481: aload #24
    //   2483: astore #23
    //   2485: goto -> 1586
    //   2488: aload #15
    //   2490: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   2493: ldc_w 2131755044
    //   2496: iload_1
    //   2497: iconst_1
    //   2498: anewarray java/lang/Object
    //   2501: dup
    //   2502: iconst_0
    //   2503: iload_1
    //   2504: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   2507: aastore
    //   2508: invokevirtual getQuantityString : (II[Ljava/lang/Object;)Ljava/lang/String;
    //   2511: astore #17
    //   2513: aload #15
    //   2515: astore #16
    //   2517: aload #16
    //   2519: aload #18
    //   2521: iload #4
    //   2523: iload_1
    //   2524: aload #17
    //   2526: invokevirtual m0 : (Ljava/lang/String;IILjava/lang/String;)V
    //   2529: aload #26
    //   2531: invokevirtual isEmpty : ()Z
    //   2534: ifne -> 2590
    //   2537: getstatic in/krosbits/musicolet/MyApplication.j : Lwn1;
    //   2540: aload #26
    //   2542: invokevirtual p : (Ljava/util/ArrayList;)V
    //   2545: getstatic in/krosbits/musicolet/MyApplication.j : Lwn1;
    //   2548: invokevirtual o : ()V
    //   2551: invokestatic r : ()V
    //   2554: invokestatic b : ()V
    //   2557: aload #16
    //   2559: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   2562: aload #21
    //   2564: iconst_0
    //   2565: anewarray java/lang/String
    //   2568: invokevirtual toArray : ([Ljava/lang/Object;)[Ljava/lang/Object;
    //   2571: checkcast [Ljava/lang/String;
    //   2574: aconst_null
    //   2575: aconst_null
    //   2576: invokestatic scanFile : (Landroid/content/Context;[Ljava/lang/String;[Ljava/lang/String;Landroid/media/MediaScannerConnection$OnScanCompletedListener;)V
    //   2579: invokestatic b : ()V
    //   2582: goto -> 2590
    //   2585: astore #15
    //   2587: goto -> 2613
    //   2590: aload #16
    //   2592: getstatic in/krosbits/musicolet/MyApplication.j : Lwn1;
    //   2595: getfield c : Llm0;
    //   2598: getstatic in/krosbits/musicolet/MusicService.V0 : Lwo;
    //   2601: invokevirtual b : (Lwo;)Lkm0;
    //   2604: iconst_0
    //   2605: aload #17
    //   2607: invokevirtual n0 : (Lkm0;ZLjava/lang/String;)V
    //   2610: goto -> 2644
    //   2613: aload #15
    //   2615: invokevirtual printStackTrace : ()V
    //   2618: aload #16
    //   2620: getstatic in/krosbits/musicolet/MyApplication.j : Lwn1;
    //   2623: getfield c : Llm0;
    //   2626: getstatic in/krosbits/musicolet/MusicService.V0 : Lwo;
    //   2629: invokevirtual b : (Lwo;)Lkm0;
    //   2632: iconst_0
    //   2633: aload #16
    //   2635: ldc_w 2131886550
    //   2638: invokevirtual getString : (I)Ljava/lang/String;
    //   2641: invokevirtual n0 : (Lkm0;ZLjava/lang/String;)V
    //   2644: iconst_0
    //   2645: putstatic in/krosbits/musicolet/FileUtilsActivity.V : Z
    //   2648: goto -> 3507
    //   2651: getstatic android/support/v4/graphics/drawable/uUq/IGBYXeDFmKYajx.EddSHBctm : Ljava/lang/String;
    //   2654: aload #16
    //   2656: invokevirtual equals : (Ljava/lang/Object;)Z
    //   2659: ifeq -> 3460
    //   2662: getstatic in/krosbits/musicolet/FileUtilsActivity.U : [Lkm0;
    //   2665: astore #16
    //   2667: aconst_null
    //   2668: putstatic in/krosbits/musicolet/FileUtilsActivity.U : [Lkm0;
    //   2671: iconst_1
    //   2672: putstatic in/krosbits/musicolet/FileUtilsActivity.V : Z
    //   2675: getstatic in/krosbits/musicolet/MyApplication.j : Lwn1;
    //   2678: getfield c : Llm0;
    //   2681: getstatic in/krosbits/musicolet/MusicService.V0 : Lwo;
    //   2684: invokevirtual b : (Lwo;)Lkm0;
    //   2687: astore #17
    //   2689: new java/lang/StringBuilder
    //   2692: astore #15
    //   2694: aload #15
    //   2696: ldc_w 'FUD:'
    //   2699: invokespecial <init> : (Ljava/lang/String;)V
    //   2702: aload #15
    //   2704: aload #16
    //   2706: invokevirtual hashCode : ()I
    //   2709: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   2712: pop
    //   2713: aload #15
    //   2715: ldc_w ','
    //   2718: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2721: pop
    //   2722: aload #15
    //   2724: aload #16
    //   2726: arraylength
    //   2727: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   2730: pop
    //   2731: aload #15
    //   2733: invokevirtual toString : ()Ljava/lang/String;
    //   2736: invokestatic F : (Ljava/lang/String;)V
    //   2739: aload #16
    //   2741: arraylength
    //   2742: istore #5
    //   2744: aload #19
    //   2746: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   2749: ldc_w 2131755013
    //   2752: iload #5
    //   2754: iconst_1
    //   2755: anewarray java/lang/Object
    //   2758: dup
    //   2759: iconst_0
    //   2760: iload #5
    //   2762: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   2765: aastore
    //   2766: invokevirtual getQuantityString : (II[Ljava/lang/Object;)Ljava/lang/String;
    //   2769: astore #18
    //   2771: aload #19
    //   2773: aload #18
    //   2775: iload #5
    //   2777: iconst_0
    //   2778: aload #19
    //   2780: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   2783: ldc_w 2131755045
    //   2786: iconst_0
    //   2787: iconst_1
    //   2788: anewarray java/lang/Object
    //   2791: dup
    //   2792: iconst_0
    //   2793: aload #20
    //   2795: aastore
    //   2796: invokevirtual getQuantityString : (II[Ljava/lang/Object;)Ljava/lang/String;
    //   2799: invokevirtual m0 : (Ljava/lang/String;IILjava/lang/String;)V
    //   2802: getstatic in/krosbits/musicolet/MusicService.P0 : Lin/krosbits/musicolet/MusicService;
    //   2805: ifnonnull -> 2824
    //   2808: aload #19
    //   2810: invokevirtual finish : ()V
    //   2813: goto -> 3453
    //   2816: astore #15
    //   2818: iconst_0
    //   2819: istore #9
    //   2821: goto -> 3428
    //   2824: new java/util/HashSet
    //   2827: dup
    //   2828: iload #5
    //   2830: invokespecial <init> : (I)V
    //   2833: astore #15
    //   2835: iconst_0
    //   2836: istore_1
    //   2837: iconst_0
    //   2838: istore #11
    //   2840: iconst_0
    //   2841: istore_3
    //   2842: iconst_0
    //   2843: istore_2
    //   2844: iload_2
    //   2845: iload #5
    //   2847: if_icmpge -> 3059
    //   2850: iload #11
    //   2852: istore #9
    //   2854: getstatic in/krosbits/musicolet/FileUtilsActivity.V : Z
    //   2857: ifne -> 2863
    //   2860: goto -> 3059
    //   2863: iload #11
    //   2865: istore #9
    //   2867: aload #16
    //   2869: iload_2
    //   2870: aaload
    //   2871: getfield c : Lqn1;
    //   2874: getfield f : Lwo;
    //   2877: astore #20
    //   2879: iload #11
    //   2881: istore #10
    //   2883: aload #17
    //   2885: ifnull -> 2929
    //   2888: iload #11
    //   2890: istore #9
    //   2892: iload #11
    //   2894: istore #10
    //   2896: aload #17
    //   2898: getfield c : Lqn1;
    //   2901: getfield f : Lwo;
    //   2904: aload #20
    //   2906: invokestatic equals : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   2909: ifeq -> 2929
    //   2912: iload #11
    //   2914: istore #9
    //   2916: invokestatic o0 : ()Z
    //   2919: istore #10
    //   2921: goto -> 2929
    //   2924: astore #15
    //   2926: goto -> 3428
    //   2929: iload #10
    //   2931: istore #9
    //   2933: aload #19
    //   2935: aload #18
    //   2937: iload #5
    //   2939: iload_1
    //   2940: aload #19
    //   2942: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   2945: ldc_w 2131755045
    //   2948: iload_1
    //   2949: iconst_1
    //   2950: anewarray java/lang/Object
    //   2953: dup
    //   2954: iconst_0
    //   2955: iload_1
    //   2956: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   2959: aastore
    //   2960: invokevirtual getQuantityString : (II[Ljava/lang/Object;)Ljava/lang/String;
    //   2963: invokevirtual m0 : (Ljava/lang/String;IILjava/lang/String;)V
    //   2966: iload #10
    //   2968: istore #9
    //   2970: aload #16
    //   2972: iload_2
    //   2973: aaload
    //   2974: invokevirtual d : ()Lv00;
    //   2977: astore #21
    //   2979: iload #10
    //   2981: istore #9
    //   2983: getstatic in/krosbits/musicolet/MyApplication.F : Lyp1;
    //   2986: aload #21
    //   2988: invokevirtual l : (Lv00;)Lv00;
    //   2991: astore #21
    //   2993: iload #10
    //   2995: istore #9
    //   2997: aload #19
    //   2999: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   3002: pop
    //   3003: iload #10
    //   3005: istore #9
    //   3007: aload #21
    //   3009: invokestatic l : (Lv00;)Z
    //   3012: istore #11
    //   3014: iload #11
    //   3016: ifne -> 3021
    //   3019: iconst_1
    //   3020: istore_3
    //   3021: iload_1
    //   3022: istore #4
    //   3024: iload #11
    //   3026: ifeq -> 3046
    //   3029: iload_1
    //   3030: iconst_1
    //   3031: iadd
    //   3032: istore #4
    //   3034: iload #10
    //   3036: istore #9
    //   3038: aload #15
    //   3040: aload #20
    //   3042: invokevirtual add : (Ljava/lang/Object;)Z
    //   3045: pop
    //   3046: iinc #2, 1
    //   3049: iload #4
    //   3051: istore_1
    //   3052: iload #10
    //   3054: istore #11
    //   3056: goto -> 2844
    //   3059: iload #11
    //   3061: istore #9
    //   3063: aload #19
    //   3065: aload #18
    //   3067: iload #5
    //   3069: iload_1
    //   3070: aload #19
    //   3072: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   3075: ldc_w 2131755045
    //   3078: iload_1
    //   3079: iconst_1
    //   3080: anewarray java/lang/Object
    //   3083: dup
    //   3084: iconst_0
    //   3085: iload_1
    //   3086: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   3089: aastore
    //   3090: invokevirtual getQuantityString : (II[Ljava/lang/Object;)Ljava/lang/String;
    //   3093: invokevirtual m0 : (Ljava/lang/String;IILjava/lang/String;)V
    //   3096: iload_1
    //   3097: ifle -> 3301
    //   3100: iload #11
    //   3102: istore #9
    //   3104: getstatic in/krosbits/musicolet/MyApplication.j : Lwn1;
    //   3107: aload #15
    //   3109: aconst_null
    //   3110: invokevirtual c : (Ljava/util/HashSet;Lki;)I
    //   3113: pop
    //   3114: iload #11
    //   3116: istore #9
    //   3118: getstatic in/krosbits/musicolet/MyApplication.i : Lin/krosbits/musicolet/MyApplication;
    //   3121: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   3124: invokestatic c : (Landroid/content/Context;)Lb81;
    //   3127: aload #15
    //   3129: invokevirtual g : (Ljava/util/HashSet;)Z
    //   3132: ifeq -> 3142
    //   3135: iload #11
    //   3137: istore #9
    //   3139: invokestatic i : ()V
    //   3142: iload #11
    //   3144: istore #9
    //   3146: getstatic in/krosbits/musicolet/MyApplication.i : Lin/krosbits/musicolet/MyApplication;
    //   3149: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   3152: invokestatic g : (Landroid/content/Context;)Ljava/util/ArrayList;
    //   3155: astore #16
    //   3157: iload #11
    //   3159: istore #9
    //   3161: aload #16
    //   3163: invokevirtual size : ()I
    //   3166: istore #5
    //   3168: iconst_0
    //   3169: istore_2
    //   3170: iload_2
    //   3171: iload #5
    //   3173: if_icmpge -> 3259
    //   3176: iload #11
    //   3178: istore #9
    //   3180: aload #16
    //   3182: iload_2
    //   3183: invokevirtual get : (I)Ljava/lang/Object;
    //   3186: astore #18
    //   3188: iload_2
    //   3189: iconst_1
    //   3190: iadd
    //   3191: istore #4
    //   3193: iload #11
    //   3195: istore #9
    //   3197: aload #18
    //   3199: checkcast java/lang/String
    //   3202: astore #18
    //   3204: iload #11
    //   3206: istore #9
    //   3208: getstatic in/krosbits/musicolet/MyApplication.i : Lin/krosbits/musicolet/MyApplication;
    //   3211: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   3214: aload #18
    //   3216: invokestatic f : (Landroid/content/Context;Ljava/lang/String;)Lb81;
    //   3219: astore #18
    //   3221: iload #11
    //   3223: istore #9
    //   3225: iload #4
    //   3227: istore_2
    //   3228: aload #18
    //   3230: aload #15
    //   3232: invokevirtual g : (Ljava/util/HashSet;)Z
    //   3235: ifeq -> 3170
    //   3238: iload #11
    //   3240: istore #9
    //   3242: getstatic in/krosbits/musicolet/MyApplication.i : Lin/krosbits/musicolet/MyApplication;
    //   3245: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   3248: aload #18
    //   3250: invokestatic m : (Landroid/content/Context;Lb81;)V
    //   3253: iload #4
    //   3255: istore_2
    //   3256: goto -> 3170
    //   3259: iload #11
    //   3261: istore #9
    //   3263: getstatic in/krosbits/musicolet/MyApplication.j : Lwn1;
    //   3266: invokevirtual o : ()V
    //   3269: iload #11
    //   3271: istore #9
    //   3273: invokestatic b : ()V
    //   3276: iload #11
    //   3278: istore #9
    //   3280: invokestatic h : ()Lwk1;
    //   3283: invokevirtual a : ()V
    //   3286: iload #11
    //   3288: istore #9
    //   3290: invokestatic r : ()V
    //   3293: iload #11
    //   3295: istore #9
    //   3297: iconst_0
    //   3298: invokestatic q0 : (Z)V
    //   3301: iload #11
    //   3303: istore #9
    //   3305: aload #19
    //   3307: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   3310: ldc_w 2131755046
    //   3313: iload_1
    //   3314: iconst_1
    //   3315: anewarray java/lang/Object
    //   3318: dup
    //   3319: iconst_0
    //   3320: iload_1
    //   3321: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   3324: aastore
    //   3325: invokevirtual getQuantityString : (II[Ljava/lang/Object;)Ljava/lang/String;
    //   3328: astore #16
    //   3330: aload #16
    //   3332: astore #15
    //   3334: iload_3
    //   3335: ifeq -> 3410
    //   3338: iload #11
    //   3340: istore #9
    //   3342: new java/lang/StringBuilder
    //   3345: astore #15
    //   3347: iload #11
    //   3349: istore #9
    //   3351: aload #15
    //   3353: invokespecial <init> : ()V
    //   3356: iload #11
    //   3358: istore #9
    //   3360: aload #15
    //   3362: aload #16
    //   3364: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   3367: pop
    //   3368: iload #11
    //   3370: istore #9
    //   3372: aload #15
    //   3374: ldc_w '\\n'
    //   3377: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   3380: pop
    //   3381: iload #11
    //   3383: istore #9
    //   3385: aload #15
    //   3387: aload #19
    //   3389: ldc_w 2131886551
    //   3392: invokevirtual getString : (I)Ljava/lang/String;
    //   3395: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   3398: pop
    //   3399: iload #11
    //   3401: istore #9
    //   3403: aload #15
    //   3405: invokevirtual toString : ()Ljava/lang/String;
    //   3408: astore #15
    //   3410: iload #11
    //   3412: istore #9
    //   3414: aload #19
    //   3416: aload #17
    //   3418: iload #11
    //   3420: aload #15
    //   3422: invokevirtual n0 : (Lkm0;ZLjava/lang/String;)V
    //   3425: goto -> 2813
    //   3428: aload #15
    //   3430: invokevirtual printStackTrace : ()V
    //   3433: aload #19
    //   3435: aload #17
    //   3437: iload #9
    //   3439: aload #19
    //   3441: ldc_w 2131886550
    //   3444: invokevirtual getString : (I)Ljava/lang/String;
    //   3447: invokevirtual n0 : (Lkm0;ZLjava/lang/String;)V
    //   3450: goto -> 2813
    //   3453: iconst_0
    //   3454: putstatic in/krosbits/musicolet/FileUtilsActivity.V : Z
    //   3457: goto -> 3507
    //   3460: ldc_w 'actem'
    //   3463: aload #16
    //   3465: invokevirtual equals : (Ljava/lang/Object;)Z
    //   3468: ifeq -> 3507
    //   3471: aload #15
    //   3473: ldc_w 'extsfpt'
    //   3476: invokevirtual getStringExtra : (Ljava/lang/String;)Ljava/lang/String;
    //   3479: astore #16
    //   3481: aload #15
    //   3483: ldc 'extdfpt'
    //   3485: invokevirtual getStringExtra : (Ljava/lang/String;)Ljava/lang/String;
    //   3488: astore #15
    //   3490: iconst_1
    //   3491: putstatic in/krosbits/musicolet/FileUtilsActivity.V : Z
    //   3494: aload #19
    //   3496: aload #16
    //   3498: aload #15
    //   3500: invokestatic l0 : (Lin/krosbits/musicolet/FileUtilsActivity;Ljava/lang/String;Ljava/lang/String;)V
    //   3503: iconst_0
    //   3504: putstatic in/krosbits/musicolet/FileUtilsActivity.V : Z
    //   3507: invokestatic r : ()V
    //   3510: return
    //   3511: astore #15
    //   3513: goto -> 1217
    //   3516: astore #17
    //   3518: iload_1
    //   3519: istore_2
    //   3520: goto -> 2473
    //   3523: astore #17
    //   3525: goto -> 1888
    //   3528: astore #17
    //   3530: iload_1
    //   3531: istore_2
    //   3532: goto -> 1890
    //   3535: astore #17
    //   3537: goto -> 2478
    // Exception table:
    //   from	to	target	type
    //   124	173	1241	finally
    //   177	259	326	finally
    //   262	317	326	finally
    //   331	346	326	finally
    //   346	366	326	finally
    //   383	389	527	finally
    //   396	464	527	finally
    //   481	524	527	finally
    //   552	584	527	finally
    //   588	602	527	finally
    //   602	612	1106	finally
    //   612	626	527	finally
    //   631	638	527	finally
    //   638	645	527	finally
    //   648	655	527	finally
    //   658	677	527	finally
    //   683	697	527	finally
    //   703	790	527	finally
    //   795	802	527	finally
    //   802	809	527	finally
    //   812	819	527	finally
    //   822	835	527	finally
    //   849	904	527	finally
    //   904	911	1106	finally
    //   911	920	527	finally
    //   930	951	958	finally
    //   967	974	992	finally
    //   978	985	992	finally
    //   1025	1035	992	finally
    //   1039	1049	992	finally
    //   1053	1063	992	finally
    //   1072	1080	992	finally
    //   1087	1090	992	finally
    //   1111	1154	1236	finally
    //   1159	1194	958	finally
    //   1194	1217	3511	finally
    //   1217	1228	1231	finally
    //   1324	1441	1509	finally
    //   1444	1499	1509	finally
    //   1514	1529	1509	finally
    //   1529	1548	1509	finally
    //   1548	1566	1509	finally
    //   1592	1598	1776	finally
    //   1601	1634	1776	finally
    //   1640	1666	1776	finally
    //   1671	1680	1776	finally
    //   1685	1718	1721	finally
    //   1738	1770	1721	finally
    //   1781	1795	1721	finally
    //   1799	1814	1721	finally
    //   1829	1834	1721	finally
    //   1839	1846	1721	finally
    //   1846	1853	1721	finally
    //   1856	1863	1721	finally
    //   1866	1885	1721	finally
    //   1895	1909	1721	finally
    //   1919	2007	1721	finally
    //   2024	2031	1721	finally
    //   2031	2038	1721	finally
    //   2041	2048	1721	finally
    //   2051	2064	1721	finally
    //   2081	2149	1721	finally
    //   2166	2213	3516	finally
    //   2224	2239	3516	finally
    //   2247	2256	3523	finally
    //   2265	2274	3523	finally
    //   2283	2395	3523	finally
    //   2395	2455	3528	finally
    //   2462	2470	3535	finally
    //   2488	2513	1721	finally
    //   2517	2582	2585	finally
    //   2590	2610	2585	finally
    //   2689	2813	2816	finally
    //   2824	2835	2816	finally
    //   2854	2860	2924	finally
    //   2867	2879	2924	finally
    //   2896	2912	2924	finally
    //   2916	2921	2924	finally
    //   2933	2966	2924	finally
    //   2970	2979	2924	finally
    //   2983	2993	2924	finally
    //   2997	3003	2924	finally
    //   3007	3014	2924	finally
    //   3038	3046	2924	finally
    //   3063	3096	2924	finally
    //   3104	3114	2924	finally
    //   3118	3135	2924	finally
    //   3139	3142	2924	finally
    //   3146	3157	2924	finally
    //   3161	3168	2924	finally
    //   3180	3188	2924	finally
    //   3197	3204	2924	finally
    //   3208	3221	2924	finally
    //   3228	3238	2924	finally
    //   3242	3253	2924	finally
    //   3263	3269	2924	finally
    //   3273	3276	2924	finally
    //   3280	3286	2924	finally
    //   3290	3293	2924	finally
    //   3297	3301	2924	finally
    //   3305	3330	2924	finally
    //   3342	3347	2924	finally
    //   3351	3356	2924	finally
    //   3360	3368	2924	finally
    //   3372	3381	2924	finally
    //   3385	3399	2924	finally
    //   3403	3410	2924	finally
    //   3414	3425	2924	finally
  }
  
  private final void b() {
    ma1 ma1 = ((is1)this.e).b.f;
    String str = (String)this.c;
    Object object = ma1.k;
    /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
    try {
      q82 q82 = ma1.c(str);
      if (q82 != null) {
        y72 y72 = q82.a;
        /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
      } else {
        /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
        q82 = null;
      } 
    } finally {}
    if (str != null && !ui0.c(hr.j, ((y72)str).j))
      synchronized (((is1)this.e).e) {
        ((is1)this.e).h.put(qv.p((y72)str), str);
        is1 is1 = (is1)this.e;
        bp1 bp1 = e72.a(is1.j, (y72)str, (rs)is1.c.e, is1);
        ((is1)this.e).i.put(qv.p((y72)str), bp1);
        return;
      }  
  }
  
  public final void run() {
    // Byte code:
    //   0: aload_0
    //   1: getfield b : I
    //   4: istore #6
    //   6: iconst_0
    //   7: istore_3
    //   8: iconst_0
    //   9: istore #4
    //   11: iconst_0
    //   12: istore #5
    //   14: iconst_1
    //   15: istore #8
    //   17: iconst_1
    //   18: istore #7
    //   20: iload #6
    //   22: tableswitch default -> 152, 0 -> 2711, 1 -> 2592, 2 -> 2577, 3 -> 2559, 4 -> 2419, 5 -> 2360, 6 -> 2319, 7 -> 2242, 8 -> 2142, 9 -> 2137, 10 -> 2119, 11 -> 1969, 12 -> 1867, 13 -> 1753, 14 -> 1738, 15 -> 1720, 16 -> 1630, 17 -> 1625, 18 -> 1397, 19 -> 1080, 20 -> 1039, 21 -> 970, 22 -> 901, 23 -> 842, 24 -> 439, 25 -> 310, 26 -> 260, 27 -> 242, 28 -> 203
    //   152: aload_0
    //   153: getfield e : Ljava/lang/Object;
    //   156: checkcast jn2
    //   159: astore #11
    //   161: aload #11
    //   163: getfield c : Ljava/lang/Object;
    //   166: astore #10
    //   168: aload #10
    //   170: monitorenter
    //   171: aload #11
    //   173: getfield d : Ljava/lang/Object;
    //   176: checkcast c41
    //   179: aload_0
    //   180: getfield c : Ljava/lang/Object;
    //   183: checkcast du2
    //   186: invokeinterface q : (Ldu2;)V
    //   191: aload #10
    //   193: monitorexit
    //   194: return
    //   195: astore #11
    //   197: aload #10
    //   199: monitorexit
    //   200: aload #11
    //   202: athrow
    //   203: aload_0
    //   204: getfield c : Ljava/lang/Object;
    //   207: checkcast m70
    //   210: astore #11
    //   212: aload_0
    //   213: getfield e : Ljava/lang/Object;
    //   216: checkcast tb2
    //   219: astore #10
    //   221: aload #11
    //   223: getfield f : La42;
    //   226: aload #10
    //   228: invokevirtual v : (Ljava/lang/Object;)V
    //   231: aload #11
    //   233: getfield g : La42;
    //   236: aload #10
    //   238: invokevirtual v : (Ljava/lang/Object;)V
    //   241: return
    //   242: aload_0
    //   243: getfield c : Ljava/lang/Object;
    //   246: checkcast eh2
    //   249: aload_0
    //   250: getfield e : Ljava/lang/Object;
    //   253: checkcast cv0
    //   256: invokevirtual p0 : (Lcv0;)V
    //   259: return
    //   260: aload_0
    //   261: getfield c : Ljava/lang/Object;
    //   264: checkcast ef
    //   267: astore #12
    //   269: aload_0
    //   270: getfield e : Ljava/lang/Object;
    //   273: checkcast gf
    //   276: astore #10
    //   278: getstatic ij2.k : Lqf;
    //   281: astore #11
    //   283: aload #12
    //   285: bipush #24
    //   287: bipush #9
    //   289: aload #11
    //   291: invokevirtual A : (IILqf;)V
    //   294: getstatic ch2.c : Lyg2;
    //   297: astore #12
    //   299: aload #10
    //   301: aload #11
    //   303: getstatic th2.g : Lth2;
    //   306: invokevirtual a : (Lqf;Ljava/util/List;)V
    //   309: return
    //   310: aload_0
    //   311: getfield c : Ljava/lang/Object;
    //   314: checkcast mg2
    //   317: getfield g : Lpg2;
    //   320: astore #10
    //   322: aload_0
    //   323: getfield e : Ljava/lang/Object;
    //   326: checkcast wb2
    //   329: astore #11
    //   331: aload #10
    //   333: invokevirtual getClass : ()Ljava/lang/Class;
    //   336: pop
    //   337: aload #11
    //   339: getfield b : Ljava/lang/String;
    //   342: astore #11
    //   344: aload #11
    //   346: aload #10
    //   348: getfield u : Ljava/lang/String;
    //   351: invokestatic c : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   354: ifne -> 367
    //   357: aload #10
    //   359: aload #11
    //   361: putfield u : Ljava/lang/String;
    //   364: goto -> 370
    //   367: iconst_0
    //   368: istore #7
    //   370: getstatic pg2.G : Lrp0;
    //   373: ldc_w 'hasChanged=%b, mFirstApplicationStatusUpdate=%b'
    //   376: iconst_2
    //   377: anewarray java/lang/Object
    //   380: dup
    //   381: iconst_0
    //   382: iload #7
    //   384: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   387: aastore
    //   388: dup
    //   389: iconst_1
    //   390: aload #10
    //   392: getfield n : Z
    //   395: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   398: aastore
    //   399: invokevirtual b : (Ljava/lang/String;[Ljava/lang/Object;)V
    //   402: aload #10
    //   404: getfield D : Lfu2;
    //   407: astore #11
    //   409: aload #11
    //   411: ifnull -> 432
    //   414: iload #7
    //   416: ifne -> 427
    //   419: aload #10
    //   421: getfield n : Z
    //   424: ifeq -> 432
    //   427: aload #11
    //   429: invokevirtual d : ()V
    //   432: aload #10
    //   434: iconst_0
    //   435: putfield n : Z
    //   438: return
    //   439: aload_0
    //   440: getfield c : Ljava/lang/Object;
    //   443: checkcast mg2
    //   446: getfield g : Lpg2;
    //   449: astore #13
    //   451: aload_0
    //   452: getfield e : Ljava/lang/Object;
    //   455: checkcast cd2
    //   458: astore #10
    //   460: aload #13
    //   462: getfield D : Lfu2;
    //   465: astore #12
    //   467: aload #10
    //   469: getfield f : Lq8;
    //   472: astore #14
    //   474: aload #10
    //   476: getfield h : Loe2;
    //   479: astore #11
    //   481: aload #14
    //   483: aload #13
    //   485: getfield t : Lq8;
    //   488: invokestatic c : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   491: ifne -> 506
    //   494: aload #13
    //   496: aload #14
    //   498: putfield t : Lq8;
    //   501: aload #12
    //   503: invokevirtual c : ()V
    //   506: aload #10
    //   508: getfield b : D
    //   511: dstore_1
    //   512: dload_1
    //   513: invokestatic isNaN : (D)Z
    //   516: ifne -> 548
    //   519: dload_1
    //   520: aload #13
    //   522: getfield v : D
    //   525: dsub
    //   526: invokestatic abs : (D)D
    //   529: ldc2_w 1.0E-7
    //   532: dcmpl
    //   533: ifle -> 548
    //   536: aload #13
    //   538: dload_1
    //   539: putfield v : D
    //   542: iconst_1
    //   543: istore #7
    //   545: goto -> 551
    //   548: iconst_0
    //   549: istore #7
    //   551: aload #10
    //   553: getfield c : Z
    //   556: istore #9
    //   558: iload #9
    //   560: aload #13
    //   562: getfield w : Z
    //   565: if_icmpeq -> 578
    //   568: aload #13
    //   570: iload #9
    //   572: putfield w : Z
    //   575: iconst_1
    //   576: istore #7
    //   578: getstatic pg2.G : Lrp0;
    //   581: astore #14
    //   583: aload #14
    //   585: ldc_w 'hasVolumeChanged=%b, mFirstDeviceStatusUpdate=%b'
    //   588: iconst_2
    //   589: anewarray java/lang/Object
    //   592: dup
    //   593: iconst_0
    //   594: iload #7
    //   596: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   599: aastore
    //   600: dup
    //   601: iconst_1
    //   602: aload #13
    //   604: getfield m : Z
    //   607: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   610: aastore
    //   611: invokevirtual b : (Ljava/lang/String;[Ljava/lang/Object;)V
    //   614: aload #12
    //   616: ifnull -> 637
    //   619: iload #7
    //   621: ifne -> 632
    //   624: aload #13
    //   626: getfield m : Z
    //   629: ifeq -> 637
    //   632: aload #12
    //   634: invokevirtual f : ()V
    //   637: aload #10
    //   639: getfield i : D
    //   642: invokestatic isNaN : (D)Z
    //   645: pop
    //   646: aload #10
    //   648: getfield e : I
    //   651: istore_3
    //   652: iload_3
    //   653: aload #13
    //   655: getfield x : I
    //   658: if_icmpeq -> 673
    //   661: aload #13
    //   663: iload_3
    //   664: putfield x : I
    //   667: iconst_1
    //   668: istore #7
    //   670: goto -> 676
    //   673: iconst_0
    //   674: istore #7
    //   676: aload #14
    //   678: ldc_w 'hasActiveInputChanged=%b, mFirstDeviceStatusUpdate=%b'
    //   681: iconst_2
    //   682: anewarray java/lang/Object
    //   685: dup
    //   686: iconst_0
    //   687: iload #7
    //   689: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   692: aastore
    //   693: dup
    //   694: iconst_1
    //   695: aload #13
    //   697: getfield m : Z
    //   700: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   703: aastore
    //   704: invokevirtual b : (Ljava/lang/String;[Ljava/lang/Object;)V
    //   707: aload #12
    //   709: ifnull -> 730
    //   712: iload #7
    //   714: ifne -> 725
    //   717: aload #13
    //   719: getfield m : Z
    //   722: ifeq -> 730
    //   725: aload #12
    //   727: invokevirtual a : ()V
    //   730: aload #10
    //   732: getfield g : I
    //   735: istore_3
    //   736: iload_3
    //   737: aload #13
    //   739: getfield y : I
    //   742: if_icmpeq -> 758
    //   745: aload #13
    //   747: iload_3
    //   748: putfield y : I
    //   751: iload #8
    //   753: istore #7
    //   755: goto -> 761
    //   758: iconst_0
    //   759: istore #7
    //   761: aload #14
    //   763: ldc_w 'hasStandbyStateChanged=%b, mFirstDeviceStatusUpdate=%b'
    //   766: iconst_2
    //   767: anewarray java/lang/Object
    //   770: dup
    //   771: iconst_0
    //   772: iload #7
    //   774: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   777: aastore
    //   778: dup
    //   779: iconst_1
    //   780: aload #13
    //   782: getfield m : Z
    //   785: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   788: aastore
    //   789: invokevirtual b : (Ljava/lang/String;[Ljava/lang/Object;)V
    //   792: aload #12
    //   794: ifnull -> 815
    //   797: iload #7
    //   799: ifne -> 810
    //   802: aload #13
    //   804: getfield m : Z
    //   807: ifeq -> 815
    //   810: aload #12
    //   812: invokevirtual e : ()V
    //   815: aload #13
    //   817: getfield z : Loe2;
    //   820: aload #11
    //   822: invokestatic c : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   825: ifne -> 835
    //   828: aload #13
    //   830: aload #11
    //   832: putfield z : Loe2;
    //   835: aload #13
    //   837: iconst_0
    //   838: putfield m : Z
    //   841: return
    //   842: aload_0
    //   843: getfield c : Ljava/lang/Object;
    //   846: checkcast ef
    //   849: astore #12
    //   851: aload_0
    //   852: getfield e : Ljava/lang/Object;
    //   855: checkcast hf
    //   858: astore #10
    //   860: getstatic ij2.k : Lqf;
    //   863: astore #11
    //   865: aload #12
    //   867: bipush #24
    //   869: bipush #7
    //   871: aload #11
    //   873: invokevirtual A : (IILqf;)V
    //   876: getstatic ch2.c : Lyg2;
    //   879: astore #12
    //   881: aload #10
    //   883: aload #11
    //   885: new bh0
    //   888: dup
    //   889: bipush #22
    //   891: getstatic th2.g : Lth2;
    //   894: invokespecial <init> : (ILjava/lang/Object;)V
    //   897: invokevirtual b : (Lqf;Lbh0;)V
    //   900: return
    //   901: aload_0
    //   902: getfield c : Ljava/lang/Object;
    //   905: checkcast java/util/concurrent/Future
    //   908: astore #11
    //   910: aload #11
    //   912: invokeinterface isDone : ()Z
    //   917: ifne -> 969
    //   920: aload #11
    //   922: invokeinterface isCancelled : ()Z
    //   927: ifne -> 969
    //   930: aload_0
    //   931: getfield e : Ljava/lang/Object;
    //   934: checkcast java/lang/Runnable
    //   937: astore #10
    //   939: aload #11
    //   941: iconst_1
    //   942: invokeinterface cancel : (Z)Z
    //   947: pop
    //   948: ldc_w 'BillingClient'
    //   951: ldc_w 'Async task is taking too long, cancel it!'
    //   954: invokestatic h : (Ljava/lang/String;Ljava/lang/String;)V
    //   957: aload #10
    //   959: ifnull -> 969
    //   962: aload #10
    //   964: invokeinterface run : ()V
    //   969: return
    //   970: aload_0
    //   971: getfield c : Ljava/lang/Object;
    //   974: checkcast ef
    //   977: astore #12
    //   979: aload_0
    //   980: getfield e : Ljava/lang/Object;
    //   983: checkcast qf
    //   986: astore #11
    //   988: aload #12
    //   990: getfield f : Lsa2;
    //   993: getfield e : Ljava/lang/Object;
    //   996: checkcast lf
    //   999: astore #10
    //   1001: aload #12
    //   1003: getfield f : Lsa2;
    //   1006: astore #12
    //   1008: aload #10
    //   1010: ifnull -> 1029
    //   1013: aload #12
    //   1015: getfield e : Ljava/lang/Object;
    //   1018: checkcast lf
    //   1021: aload #11
    //   1023: invokevirtual k : (Lqf;)V
    //   1026: goto -> 1038
    //   1029: ldc_w 'BillingClient'
    //   1032: ldc_w 'No valid listener is set in BroadcastManager'
    //   1035: invokestatic h : (Ljava/lang/String;Ljava/lang/String;)V
    //   1038: return
    //   1039: aload_0
    //   1040: getfield c : Ljava/lang/Object;
    //   1043: checkcast ef
    //   1046: astore #12
    //   1048: aload_0
    //   1049: getfield e : Ljava/lang/Object;
    //   1052: checkcast hf
    //   1055: astore #10
    //   1057: getstatic ij2.k : Lqf;
    //   1060: astore #11
    //   1062: aload #12
    //   1064: bipush #24
    //   1066: iconst_3
    //   1067: aload #11
    //   1069: invokevirtual A : (IILqf;)V
    //   1072: aload #10
    //   1074: aload #11
    //   1076: invokevirtual a : (Lqf;)V
    //   1079: return
    //   1080: aload_0
    //   1081: getfield e : Ljava/lang/Object;
    //   1084: checkcast cb2
    //   1087: astore #11
    //   1089: aload_0
    //   1090: getfield c : Ljava/lang/Object;
    //   1093: checkcast nb2
    //   1096: astore #12
    //   1098: aload #11
    //   1100: invokevirtual getClass : ()Ljava/lang/Class;
    //   1103: pop
    //   1104: aload #12
    //   1106: getfield c : Lsp;
    //   1109: astore #10
    //   1111: aload #10
    //   1113: getfield c : I
    //   1116: ifne -> 1378
    //   1119: aload #12
    //   1121: getfield e : Lsb2;
    //   1124: astore #13
    //   1126: aload #13
    //   1128: invokestatic m : (Ljava/lang/Object;)V
    //   1131: aload #13
    //   1133: getfield e : Lsp;
    //   1136: astore #10
    //   1138: aload #10
    //   1140: getfield c : I
    //   1143: ifne -> 1324
    //   1146: aload #11
    //   1148: getfield l : Lsa2;
    //   1151: astore #12
    //   1153: aload #13
    //   1155: getfield c : Landroid/os/IBinder;
    //   1158: astore #13
    //   1160: aload #13
    //   1162: ifnonnull -> 1171
    //   1165: aconst_null
    //   1166: astore #10
    //   1168: goto -> 1220
    //   1171: getstatic e1.f : I
    //   1174: istore_3
    //   1175: aload #13
    //   1177: ldc_w 'com.google.android.gms.common.internal.IAccountAccessor'
    //   1180: invokeinterface queryLocalInterface : (Ljava/lang/String;)Landroid/os/IInterface;
    //   1185: astore #10
    //   1187: aload #10
    //   1189: instanceof gg0
    //   1192: ifeq -> 1205
    //   1195: aload #10
    //   1197: checkcast gg0
    //   1200: astore #10
    //   1202: goto -> 1220
    //   1205: new na2
    //   1208: dup
    //   1209: aload #13
    //   1211: ldc_w 'com.google.android.gms.common.internal.IAccountAccessor'
    //   1214: iconst_2
    //   1215: invokespecial <init> : (Landroid/os/IBinder;Ljava/lang/String;I)V
    //   1218: astore #10
    //   1220: aload #11
    //   1222: getfield i : Ljava/util/Set;
    //   1225: astore #13
    //   1227: aload #12
    //   1229: invokevirtual getClass : ()Ljava/lang/Class;
    //   1232: pop
    //   1233: aload #10
    //   1235: ifnull -> 1289
    //   1238: aload #13
    //   1240: ifnonnull -> 1246
    //   1243: goto -> 1289
    //   1246: aload #12
    //   1248: aload #10
    //   1250: putfield f : Ljava/lang/Object;
    //   1253: aload #12
    //   1255: aload #13
    //   1257: putfield g : Ljava/lang/Object;
    //   1260: aload #12
    //   1262: getfield b : Z
    //   1265: ifeq -> 1388
    //   1268: aload #12
    //   1270: getfield c : Ljava/lang/Object;
    //   1273: checkcast he0
    //   1276: checkcast yc
    //   1279: aload #10
    //   1281: aload #13
    //   1283: invokevirtual h : (Lgg0;Ljava/util/Set;)V
    //   1286: goto -> 1388
    //   1289: ldc_w 'GoogleApiManager'
    //   1292: ldc_w 'Received null response from onSignInSuccess'
    //   1295: new java/lang/Exception
    //   1298: dup
    //   1299: invokespecial <init> : ()V
    //   1302: invokestatic wtf : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   1305: pop
    //   1306: aload #12
    //   1308: new sp
    //   1311: dup
    //   1312: iconst_4
    //   1313: aconst_null
    //   1314: aconst_null
    //   1315: invokespecial <init> : (ILandroid/app/PendingIntent;Ljava/lang/String;)V
    //   1318: invokevirtual a : (Lsp;)V
    //   1321: goto -> 1388
    //   1324: aload #10
    //   1326: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   1329: astore #12
    //   1331: new java/lang/Exception
    //   1334: dup
    //   1335: invokespecial <init> : ()V
    //   1338: astore #13
    //   1340: ldc_w 'SignInCoordinator'
    //   1343: ldc_w 'Sign-in succeeded with resolve account failure: '
    //   1346: aload #12
    //   1348: invokevirtual concat : (Ljava/lang/String;)Ljava/lang/String;
    //   1351: aload #13
    //   1353: invokestatic wtf : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   1356: pop
    //   1357: aload #11
    //   1359: getfield l : Lsa2;
    //   1362: aload #10
    //   1364: invokevirtual a : (Lsp;)V
    //   1367: aload #11
    //   1369: getfield k : Lvm1;
    //   1372: invokevirtual b : ()V
    //   1375: goto -> 1396
    //   1378: aload #11
    //   1380: getfield l : Lsa2;
    //   1383: aload #10
    //   1385: invokevirtual a : (Lsp;)V
    //   1388: aload #11
    //   1390: getfield k : Lvm1;
    //   1393: invokevirtual b : ()V
    //   1396: return
    //   1397: aload_0
    //   1398: getfield c : Ljava/lang/Object;
    //   1401: checkcast sp
    //   1404: astore #13
    //   1406: aload_0
    //   1407: getfield e : Ljava/lang/Object;
    //   1410: checkcast sa2
    //   1413: astore #10
    //   1415: aload #10
    //   1417: getfield h : Ljava/lang/Object;
    //   1420: checkcast oe0
    //   1423: astore #12
    //   1425: aload #10
    //   1427: getfield c : Ljava/lang/Object;
    //   1430: checkcast he0
    //   1433: astore #11
    //   1435: aload #12
    //   1437: getfield l : Ljava/util/concurrent/ConcurrentHashMap;
    //   1440: aload #10
    //   1442: getfield e : Ljava/lang/Object;
    //   1445: checkcast m5
    //   1448: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1451: checkcast qa2
    //   1454: astore #12
    //   1456: aload #12
    //   1458: ifnonnull -> 1464
    //   1461: goto -> 1624
    //   1464: aload #13
    //   1466: getfield c : I
    //   1469: ifne -> 1616
    //   1472: aload #10
    //   1474: iconst_1
    //   1475: putfield b : Z
    //   1478: aload #11
    //   1480: invokevirtual q : ()Z
    //   1483: ifne -> 1568
    //   1486: aload #11
    //   1488: invokevirtual q : ()Z
    //   1491: ifeq -> 1504
    //   1494: aload #11
    //   1496: getfield z : Ljava/util/Set;
    //   1499: astore #10
    //   1501: goto -> 1509
    //   1504: getstatic java/util/Collections.EMPTY_SET : Ljava/util/Set;
    //   1507: astore #10
    //   1509: aload #11
    //   1511: checkcast yc
    //   1514: aconst_null
    //   1515: aload #10
    //   1517: invokevirtual h : (Lgg0;Ljava/util/Set;)V
    //   1520: goto -> 1624
    //   1523: astore #10
    //   1525: ldc_w 'GoogleApiManager'
    //   1528: ldc_w 'Failed to get service from broker. '
    //   1531: aload #10
    //   1533: invokestatic e : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   1536: pop
    //   1537: aload #11
    //   1539: checkcast yc
    //   1542: ldc_w 'Failed to get service from broker.'
    //   1545: invokevirtual c : (Ljava/lang/String;)V
    //   1548: aload #12
    //   1550: new sp
    //   1553: dup
    //   1554: bipush #10
    //   1556: aconst_null
    //   1557: aconst_null
    //   1558: invokespecial <init> : (ILandroid/app/PendingIntent;Ljava/lang/String;)V
    //   1561: aconst_null
    //   1562: invokevirtual l : (Lsp;Ljava/lang/RuntimeException;)V
    //   1565: goto -> 1624
    //   1568: aload #10
    //   1570: getfield b : Z
    //   1573: ifeq -> 1624
    //   1576: aload #10
    //   1578: getfield f : Ljava/lang/Object;
    //   1581: checkcast gg0
    //   1584: astore #12
    //   1586: aload #12
    //   1588: ifnull -> 1624
    //   1591: aload #10
    //   1593: getfield g : Ljava/lang/Object;
    //   1596: checkcast java/util/Set
    //   1599: astore #10
    //   1601: aload #11
    //   1603: checkcast yc
    //   1606: aload #12
    //   1608: aload #10
    //   1610: invokevirtual h : (Lgg0;Ljava/util/Set;)V
    //   1613: goto -> 1624
    //   1616: aload #12
    //   1618: aload #13
    //   1620: aconst_null
    //   1621: invokevirtual l : (Lsp;Ljava/lang/RuntimeException;)V
    //   1624: return
    //   1625: aload_0
    //   1626: invokespecial b : ()V
    //   1629: return
    //   1630: aload_0
    //   1631: getfield e : Ljava/lang/Object;
    //   1634: checkcast java/lang/Runnable
    //   1637: invokeinterface run : ()V
    //   1642: aload_0
    //   1643: getfield c : Ljava/lang/Object;
    //   1646: checkcast tk1
    //   1649: getfield g : Ljava/lang/Object;
    //   1652: astore #10
    //   1654: aload #10
    //   1656: monitorenter
    //   1657: aload_0
    //   1658: getfield c : Ljava/lang/Object;
    //   1661: checkcast tk1
    //   1664: invokevirtual a : ()V
    //   1667: aload #10
    //   1669: monitorexit
    //   1670: return
    //   1671: astore #11
    //   1673: aload #10
    //   1675: monitorexit
    //   1676: aload #11
    //   1678: athrow
    //   1679: astore #11
    //   1681: aload_0
    //   1682: getfield c : Ljava/lang/Object;
    //   1685: checkcast tk1
    //   1688: getfield g : Ljava/lang/Object;
    //   1691: astore #10
    //   1693: aload #10
    //   1695: monitorenter
    //   1696: aload_0
    //   1697: getfield c : Ljava/lang/Object;
    //   1700: checkcast tk1
    //   1703: invokevirtual a : ()V
    //   1706: aload #10
    //   1708: monitorexit
    //   1709: aload #11
    //   1711: athrow
    //   1712: astore #11
    //   1714: aload #10
    //   1716: monitorexit
    //   1717: aload #11
    //   1719: athrow
    //   1720: aload_0
    //   1721: getfield e : Ljava/lang/Object;
    //   1724: checkcast ni
    //   1727: aload_0
    //   1728: getfield c : Ljava/lang/Object;
    //   1731: checkcast c60
    //   1734: invokevirtual H : (Lrs;)V
    //   1737: return
    //   1738: aload_0
    //   1739: getfield c : Ljava/lang/Object;
    //   1742: checkcast aa0
    //   1745: aload_0
    //   1746: getfield e : Ljava/lang/Object;
    //   1749: invokevirtual accept : (Ljava/lang/Object;)V
    //   1752: return
    //   1753: aload_0
    //   1754: getfield c : Ljava/lang/Object;
    //   1757: checkcast java/lang/String
    //   1760: astore #11
    //   1762: aload_0
    //   1763: getfield e : Ljava/lang/Object;
    //   1766: checkcast w91
    //   1769: astore #12
    //   1771: aload #12
    //   1773: getfield c0 : Landroidx/recyclerview/widget/RecyclerView;
    //   1776: invokevirtual getAdapter : ()Lid1;
    //   1779: astore #10
    //   1781: aload #10
    //   1783: instanceof z91
    //   1786: ifne -> 1806
    //   1789: aload #10
    //   1791: ifnonnull -> 1797
    //   1794: goto -> 1866
    //   1797: ldc_w 'Adapter must implement PreferencePositionCallback'
    //   1800: invokestatic f : (Ljava/lang/String;)V
    //   1803: goto -> 1866
    //   1806: aload #10
    //   1808: checkcast z91
    //   1811: aload #11
    //   1813: invokevirtual o : (Ljava/lang/String;)I
    //   1816: istore_3
    //   1817: aload #12
    //   1819: getfield c0 : Landroidx/recyclerview/widget/RecyclerView;
    //   1822: astore #12
    //   1824: iload_3
    //   1825: iconst_m1
    //   1826: if_icmpeq -> 1838
    //   1829: aload #12
    //   1831: iload_3
    //   1832: invokevirtual k0 : (I)V
    //   1835: goto -> 1866
    //   1838: new v91
    //   1841: dup
    //   1842: aload #10
    //   1844: checkcast z91
    //   1847: aload #12
    //   1849: aload #11
    //   1851: invokespecial <init> : (Lz91;Landroidx/recyclerview/widget/RecyclerView;Ljava/lang/String;)V
    //   1854: astore #11
    //   1856: aload #10
    //   1858: getfield a : Ljd1;
    //   1861: aload #11
    //   1863: invokevirtual registerObserver : (Ljava/lang/Object;)V
    //   1866: return
    //   1867: aload_0
    //   1868: getfield e : Ljava/lang/Object;
    //   1871: checkcast ym0
    //   1874: astore #11
    //   1876: aload #11
    //   1878: getfield f : Lrs;
    //   1881: astore #10
    //   1883: iload #5
    //   1885: istore_3
    //   1886: aload_0
    //   1887: getfield c : Ljava/lang/Object;
    //   1890: checkcast java/lang/Runnable
    //   1893: invokeinterface run : ()V
    //   1898: goto -> 1911
    //   1901: astore #12
    //   1903: getstatic b40.b : Lb40;
    //   1906: aload #12
    //   1908: invokestatic G : (Los;Ljava/lang/Throwable;)V
    //   1911: aload #11
    //   1913: invokevirtual s : ()Ljava/lang/Runnable;
    //   1916: astore #12
    //   1918: aload #12
    //   1920: ifnonnull -> 1926
    //   1923: goto -> 1968
    //   1926: aload_0
    //   1927: aload #12
    //   1929: putfield c : Ljava/lang/Object;
    //   1932: iload_3
    //   1933: iconst_1
    //   1934: iadd
    //   1935: istore #4
    //   1937: iload #4
    //   1939: istore_3
    //   1940: iload #4
    //   1942: bipush #16
    //   1944: if_icmplt -> 1886
    //   1947: iload #4
    //   1949: istore_3
    //   1950: aload #10
    //   1952: aload #11
    //   1954: invokevirtual q : (Los;)Z
    //   1957: ifeq -> 1886
    //   1960: aload #10
    //   1962: aload #11
    //   1964: aload_0
    //   1965: invokevirtual m : (Los;Ljava/lang/Runnable;)V
    //   1968: return
    //   1969: aload_0
    //   1970: getfield c : Ljava/lang/Object;
    //   1973: checkcast ej0
    //   1976: astore #13
    //   1978: aload #13
    //   1980: getfield e : Lhe1;
    //   1983: astore #11
    //   1985: aload_0
    //   1986: getfield e : Ljava/lang/Object;
    //   1989: checkcast ij0
    //   1992: astore #10
    //   1994: aload #10
    //   1996: getfield r : Landroidx/recyclerview/widget/RecyclerView;
    //   1999: astore #12
    //   2001: aload #12
    //   2003: ifnull -> 2118
    //   2006: aload #12
    //   2008: getfield u : Z
    //   2011: ifeq -> 2118
    //   2014: aload #13
    //   2016: getfield k : Z
    //   2019: ifne -> 2118
    //   2022: aload #11
    //   2024: invokevirtual b : ()I
    //   2027: iconst_m1
    //   2028: if_icmpeq -> 2118
    //   2031: aload #10
    //   2033: getfield r : Landroidx/recyclerview/widget/RecyclerView;
    //   2036: invokevirtual getItemAnimator : ()Lod1;
    //   2039: astore #12
    //   2041: aload #12
    //   2043: ifnull -> 2054
    //   2046: aload #12
    //   2048: invokevirtual f : ()Z
    //   2051: ifne -> 2089
    //   2054: aload #10
    //   2056: getfield p : Ljava/util/ArrayList;
    //   2059: astore #12
    //   2061: aload #12
    //   2063: invokevirtual size : ()I
    //   2066: istore #4
    //   2068: iload_3
    //   2069: iload #4
    //   2071: if_icmpge -> 2108
    //   2074: aload #12
    //   2076: iload_3
    //   2077: invokevirtual get : (I)Ljava/lang/Object;
    //   2080: checkcast ej0
    //   2083: getfield l : Z
    //   2086: ifne -> 2102
    //   2089: aload #10
    //   2091: getfield r : Landroidx/recyclerview/widget/RecyclerView;
    //   2094: aload_0
    //   2095: invokevirtual post : (Ljava/lang/Runnable;)Z
    //   2098: pop
    //   2099: goto -> 2118
    //   2102: iinc #3, 1
    //   2105: goto -> 2068
    //   2108: aload #10
    //   2110: getfield m : Lgj0;
    //   2113: aload #11
    //   2115: invokevirtual p : (Lhe1;)V
    //   2118: return
    //   2119: aload_0
    //   2120: getfield c : Ljava/lang/Object;
    //   2123: checkcast ni
    //   2126: aload_0
    //   2127: getfield e : Ljava/lang/Object;
    //   2130: checkcast if0
    //   2133: invokevirtual H : (Lrs;)V
    //   2136: return
    //   2137: aload_0
    //   2138: invokespecial a : ()V
    //   2141: return
    //   2142: aload_0
    //   2143: getfield c : Ljava/lang/Object;
    //   2146: checkcast ss0
    //   2149: astore #10
    //   2151: aload #10
    //   2153: getfield n : Landroid/widget/EditText;
    //   2156: astore #11
    //   2158: aload #11
    //   2160: invokevirtual requestFocus : ()Z
    //   2163: pop
    //   2164: aload #11
    //   2166: invokevirtual getText : ()Landroid/text/Editable;
    //   2169: invokeinterface length : ()I
    //   2174: istore_3
    //   2175: iload_3
    //   2176: ifle -> 2203
    //   2179: iconst_2
    //   2180: aload #11
    //   2182: invokevirtual getInputType : ()I
    //   2185: iand
    //   2186: ifeq -> 2197
    //   2189: aload #11
    //   2191: invokevirtual selectAll : ()V
    //   2194: goto -> 2203
    //   2197: aload #11
    //   2199: iload_3
    //   2200: invokevirtual setSelection : (I)V
    //   2203: aload_0
    //   2204: getfield e : Ljava/lang/Object;
    //   2207: checkcast ms0
    //   2210: getfield b : Landroid/content/Context;
    //   2213: ldc_w 'input_method'
    //   2216: invokevirtual getSystemService : (Ljava/lang/String;)Ljava/lang/Object;
    //   2219: checkcast android/view/inputmethod/InputMethodManager
    //   2222: astore #11
    //   2224: aload #11
    //   2226: ifnull -> 2241
    //   2229: aload #11
    //   2231: aload #10
    //   2233: getfield n : Landroid/widget/EditText;
    //   2236: iconst_1
    //   2237: invokevirtual showSoftInput : (Landroid/view/View;I)Z
    //   2240: pop
    //   2241: return
    //   2242: invokestatic h : ()Lqp0;
    //   2245: astore #13
    //   2247: getstatic wx.e : Ljava/lang/String;
    //   2250: astore #12
    //   2252: new java/lang/StringBuilder
    //   2255: dup
    //   2256: ldc_w 'Scheduling work '
    //   2259: invokespecial <init> : (Ljava/lang/String;)V
    //   2262: astore #10
    //   2264: aload_0
    //   2265: getfield c : Ljava/lang/Object;
    //   2268: checkcast y72
    //   2271: astore #11
    //   2273: aload #10
    //   2275: aload #11
    //   2277: getfield a : Ljava/lang/String;
    //   2280: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2283: pop
    //   2284: aload #13
    //   2286: aload #12
    //   2288: aload #10
    //   2290: invokevirtual toString : ()Ljava/lang/String;
    //   2293: invokevirtual b : (Ljava/lang/String;Ljava/lang/String;)V
    //   2296: aload_0
    //   2297: getfield e : Ljava/lang/Object;
    //   2300: checkcast wx
    //   2303: getfield a : Lte0;
    //   2306: iconst_1
    //   2307: anewarray y72
    //   2310: dup
    //   2311: iconst_0
    //   2312: aload #11
    //   2314: aastore
    //   2315: invokevirtual c : ([Ly72;)V
    //   2318: return
    //   2319: aload_0
    //   2320: getfield c : Ljava/lang/Object;
    //   2323: checkcast bh0
    //   2326: astore #11
    //   2328: aload_0
    //   2329: getfield e : Ljava/lang/Object;
    //   2332: checkcast android/graphics/Typeface
    //   2335: astore #10
    //   2337: aload #11
    //   2339: getfield c : Ljava/lang/Object;
    //   2342: checkcast n21
    //   2345: astore #11
    //   2347: aload #11
    //   2349: ifnull -> 2359
    //   2352: aload #11
    //   2354: aload #10
    //   2356: invokevirtual K : (Landroid/graphics/Typeface;)V
    //   2359: return
    //   2360: new java/lang/StringBuilder
    //   2363: dup
    //   2364: ldc_w 'Transformation '
    //   2367: invokespecial <init> : (Ljava/lang/String;)V
    //   2370: astore #10
    //   2372: aload #10
    //   2374: aload_0
    //   2375: getfield c : Ljava/lang/Object;
    //   2378: checkcast cw1
    //   2381: invokeinterface b : ()Ljava/lang/String;
    //   2386: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2389: pop
    //   2390: aload #10
    //   2392: getstatic com/google/android/gms/cast/framework/internal/featurehighlight/aS/xveccWbRzqx.KHfXgU : Ljava/lang/String;
    //   2395: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2398: pop
    //   2399: new java/lang/RuntimeException
    //   2402: dup
    //   2403: aload #10
    //   2405: invokevirtual toString : ()Ljava/lang/String;
    //   2408: aload_0
    //   2409: getfield e : Ljava/lang/Object;
    //   2412: checkcast java/lang/RuntimeException
    //   2415: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Throwable;)V
    //   2418: athrow
    //   2419: aload_0
    //   2420: getfield e : Ljava/lang/Object;
    //   2423: astore #11
    //   2425: aload_0
    //   2426: getfield c : Ljava/lang/Object;
    //   2429: astore #10
    //   2431: getstatic d2.d : Ljava/lang/reflect/Method;
    //   2434: astore #12
    //   2436: aload #12
    //   2438: ifnull -> 2473
    //   2441: aload #12
    //   2443: aload #10
    //   2445: iconst_3
    //   2446: anewarray java/lang/Object
    //   2449: dup
    //   2450: iconst_0
    //   2451: aload #11
    //   2453: aastore
    //   2454: dup
    //   2455: iconst_1
    //   2456: getstatic java/lang/Boolean.FALSE : Ljava/lang/Boolean;
    //   2459: aastore
    //   2460: dup
    //   2461: iconst_2
    //   2462: ldc_w 'AppCompat recreation'
    //   2465: aastore
    //   2466: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   2469: pop
    //   2470: goto -> 2558
    //   2473: getstatic d2.e : Ljava/lang/reflect/Method;
    //   2476: aload #10
    //   2478: iconst_2
    //   2479: anewarray java/lang/Object
    //   2482: dup
    //   2483: iconst_0
    //   2484: aload #11
    //   2486: aastore
    //   2487: dup
    //   2488: iconst_1
    //   2489: getstatic java/lang/Boolean.FALSE : Ljava/lang/Boolean;
    //   2492: aastore
    //   2493: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   2496: pop
    //   2497: goto -> 2558
    //   2500: astore #10
    //   2502: ldc_w 'ActivityRecreator'
    //   2505: ldc_w 'Exception while invoking performStopActivity'
    //   2508: aload #10
    //   2510: invokestatic e : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   2513: pop
    //   2514: goto -> 2558
    //   2517: astore #10
    //   2519: aload #10
    //   2521: invokevirtual getClass : ()Ljava/lang/Class;
    //   2524: ldc_w java/lang/RuntimeException
    //   2527: if_acmpne -> 2558
    //   2530: aload #10
    //   2532: invokevirtual getMessage : ()Ljava/lang/String;
    //   2535: ifnull -> 2558
    //   2538: aload #10
    //   2540: invokevirtual getMessage : ()Ljava/lang/String;
    //   2543: ldc_w 'Unable to stop'
    //   2546: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   2549: ifne -> 2555
    //   2552: goto -> 2558
    //   2555: aload #10
    //   2557: athrow
    //   2558: return
    //   2559: aload_0
    //   2560: getfield c : Ljava/lang/Object;
    //   2563: checkcast android/app/Application
    //   2566: aload_0
    //   2567: getfield e : Ljava/lang/Object;
    //   2570: checkcast c2
    //   2573: invokevirtual unregisterActivityLifecycleCallbacks : (Landroid/app/Application$ActivityLifecycleCallbacks;)V
    //   2576: return
    //   2577: aload_0
    //   2578: getfield c : Ljava/lang/Object;
    //   2581: checkcast c2
    //   2584: aload_0
    //   2585: getfield e : Ljava/lang/Object;
    //   2588: putfield b : Ljava/lang/Object;
    //   2591: return
    //   2592: aload_0
    //   2593: getfield c : Ljava/lang/Object;
    //   2596: checkcast r1
    //   2599: astore #10
    //   2601: aload_0
    //   2602: getfield e : Ljava/lang/Object;
    //   2605: checkcast u1
    //   2608: astore #11
    //   2610: aload #11
    //   2612: getfield e : Lrw0;
    //   2615: astore #12
    //   2617: aload #12
    //   2619: ifnull -> 2643
    //   2622: aload #12
    //   2624: getfield e : Lpw0;
    //   2627: astore #13
    //   2629: aload #13
    //   2631: ifnull -> 2643
    //   2634: aload #13
    //   2636: aload #12
    //   2638: invokeinterface g : (Lrw0;)V
    //   2643: aload #11
    //   2645: getfield j : Ljx0;
    //   2648: checkcast android/view/View
    //   2651: astore #12
    //   2653: aload #12
    //   2655: ifnull -> 2704
    //   2658: aload #12
    //   2660: invokevirtual getWindowToken : ()Landroid/os/IBinder;
    //   2663: ifnull -> 2704
    //   2666: aload #10
    //   2668: invokevirtual b : ()Z
    //   2671: ifeq -> 2677
    //   2674: goto -> 2697
    //   2677: aload #10
    //   2679: getfield e : Landroid/view/View;
    //   2682: ifnonnull -> 2688
    //   2685: goto -> 2704
    //   2688: aload #10
    //   2690: iconst_0
    //   2691: iconst_0
    //   2692: iconst_0
    //   2693: iconst_0
    //   2694: invokevirtual f : (IIZZ)V
    //   2697: aload #11
    //   2699: aload #10
    //   2701: putfield u : Lr1;
    //   2704: aload #11
    //   2706: aconst_null
    //   2707: putfield w : Lvi2;
    //   2710: return
    //   2711: aload_0
    //   2712: getfield e : Ljava/lang/Object;
    //   2715: checkcast oz0
    //   2718: astore #10
    //   2720: aload_0
    //   2721: getfield c : Ljava/lang/Object;
    //   2724: checkcast hj2
    //   2727: astore #11
    //   2729: aload #11
    //   2731: instanceof li2
    //   2734: ifeq -> 2765
    //   2737: aload #11
    //   2739: checkcast li2
    //   2742: invokevirtual d : ()Ljava/lang/Throwable;
    //   2745: astore #12
    //   2747: aload #12
    //   2749: ifnonnull -> 2755
    //   2752: goto -> 2765
    //   2755: aload #10
    //   2757: aload #12
    //   2759: invokevirtual c : (Ljava/lang/Throwable;)V
    //   2762: goto -> 2987
    //   2765: aload #11
    //   2767: invokeinterface isDone : ()Z
    //   2772: istore #7
    //   2774: iload #7
    //   2776: ifeq -> 2939
    //   2779: iload #4
    //   2781: istore_3
    //   2782: aload #11
    //   2784: invokeinterface get : ()Ljava/lang/Object;
    //   2789: astore #12
    //   2791: iload_3
    //   2792: ifeq -> 2814
    //   2795: invokestatic currentThread : ()Ljava/lang/Thread;
    //   2798: invokevirtual interrupt : ()V
    //   2801: goto -> 2814
    //   2804: astore #11
    //   2806: goto -> 2967
    //   2809: astore #11
    //   2811: goto -> 2977
    //   2814: aload #12
    //   2816: checkcast java/lang/Integer
    //   2819: astore #12
    //   2821: aload #12
    //   2823: invokevirtual intValue : ()I
    //   2826: istore_3
    //   2827: aload #10
    //   2829: getfield f : Ljava/lang/Object;
    //   2832: checkcast wi2
    //   2835: astore #11
    //   2837: iload_3
    //   2838: ifle -> 2898
    //   2841: aload #10
    //   2843: getfield b : I
    //   2846: istore_3
    //   2847: aload #12
    //   2849: invokevirtual intValue : ()I
    //   2852: istore #4
    //   2854: aload #11
    //   2856: invokevirtual getClass : ()Ljava/lang/Class;
    //   2859: pop
    //   2860: ldc_w 'Billing override value was set by a license tester.'
    //   2863: iload #4
    //   2865: invokestatic a : (Ljava/lang/String;I)Lqf;
    //   2868: astore #12
    //   2870: aload #11
    //   2872: bipush #93
    //   2874: iload_3
    //   2875: aload #12
    //   2877: invokevirtual I : (IILqf;)V
    //   2880: aload #10
    //   2882: getfield c : Ljava/lang/Object;
    //   2885: checkcast nr
    //   2888: aload #12
    //   2890: invokeinterface accept : (Ljava/lang/Object;)V
    //   2895: goto -> 2987
    //   2898: aload #10
    //   2900: getfield e : Ljava/lang/Object;
    //   2903: checkcast java/lang/Runnable
    //   2906: invokeinterface run : ()V
    //   2911: goto -> 2987
    //   2914: astore #11
    //   2916: iload_3
    //   2917: ifne -> 2923
    //   2920: goto -> 2929
    //   2923: invokestatic currentThread : ()Ljava/lang/Thread;
    //   2926: invokevirtual interrupt : ()V
    //   2929: aload #11
    //   2931: athrow
    //   2932: astore #12
    //   2934: iconst_1
    //   2935: istore_3
    //   2936: goto -> 2782
    //   2939: new java/lang/IllegalStateException
    //   2942: astore #12
    //   2944: aload #12
    //   2946: ldc_w 'Future was expected to be done: %s'
    //   2949: iconst_1
    //   2950: anewarray java/lang/Object
    //   2953: dup
    //   2954: iconst_0
    //   2955: aload #11
    //   2957: aastore
    //   2958: invokestatic X : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   2961: invokespecial <init> : (Ljava/lang/String;)V
    //   2964: aload #12
    //   2966: athrow
    //   2967: aload #10
    //   2969: aload #11
    //   2971: invokevirtual c : (Ljava/lang/Throwable;)V
    //   2974: goto -> 2987
    //   2977: aload #10
    //   2979: aload #11
    //   2981: invokevirtual getCause : ()Ljava/lang/Throwable;
    //   2984: invokevirtual c : (Ljava/lang/Throwable;)V
    //   2987: return
    //   2988: astore #10
    //   2990: goto -> 2241
    // Exception table:
    //   from	to	target	type
    //   171	194	195	finally
    //   197	200	195	finally
    //   1486	1501	1523	java/lang/SecurityException
    //   1504	1509	1523	java/lang/SecurityException
    //   1509	1520	1523	java/lang/SecurityException
    //   1630	1642	1679	finally
    //   1657	1670	1671	finally
    //   1673	1676	1671	finally
    //   1696	1709	1712	finally
    //   1714	1717	1712	finally
    //   1886	1898	1901	finally
    //   2151	2175	2988	finally
    //   2179	2194	2988	finally
    //   2197	2203	2988	finally
    //   2203	2224	2988	finally
    //   2229	2241	2988	finally
    //   2431	2436	2517	java/lang/RuntimeException
    //   2431	2436	2500	finally
    //   2441	2470	2517	java/lang/RuntimeException
    //   2441	2470	2500	finally
    //   2473	2497	2517	java/lang/RuntimeException
    //   2473	2497	2500	finally
    //   2765	2774	2809	java/util/concurrent/ExecutionException
    //   2765	2774	2804	finally
    //   2782	2791	2932	java/lang/InterruptedException
    //   2782	2791	2914	finally
    //   2795	2801	2809	java/util/concurrent/ExecutionException
    //   2795	2801	2804	finally
    //   2923	2929	2809	java/util/concurrent/ExecutionException
    //   2923	2929	2804	finally
    //   2929	2932	2809	java/util/concurrent/ExecutionException
    //   2929	2932	2804	finally
    //   2939	2967	2809	java/util/concurrent/ExecutionException
    //   2939	2967	2804	finally
  }
  
  public String toString() {
    switch (this.b) {
      default:
        return super.toString();
      case 0:
        break;
    } 
    p01 p01 = new p01(vi2.class.getSimpleName());
    oz0 oz0 = (oz0)this.e;
    j01 j01 = new j01(27, false);
    ((j01)p01.f).e = j01;
    p01.f = j01;
    j01.c = oz0;
    return p01.toString();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\vi2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
import android.os.Parcel;

public final class dc2 extends y92 {
  public final int f;
  
  public final Object g;
  
  public dc2(aj2 paramaj2) {
    super("com.google.android.gms.cast.framework.media.internal.IFetchBitmapTaskProgressPublisher", 3);
  }
  
  public dc2(al1 paramal1) {
    super("com.google.android.gms.cast.framework.ISessionProxy", 3);
  }
  
  public dc2(oj paramoj) {
    super("com.google.android.gms.cast.framework.ICastConnectionController", 3);
  }
  
  public dc2(w71 paramw71) {
    super("com.google.android.gms.cast.framework.ICastStateListener", 3);
    this.g = paramw71;
  }
  
  public dc2(xf2 paramxf2) {
    super("com.google.android.gms.cast.framework.ISessionProvider", 3);
  }
  
  public final boolean o0(int paramInt, Parcel paramParcel1, Parcel paramParcel2) {
    // Byte code:
    //   0: aload_0
    //   1: getfield f : I
    //   4: istore #5
    //   6: aload_0
    //   7: getfield g : Ljava/lang/Object;
    //   10: astore #15
    //   12: iconst_1
    //   13: istore #13
    //   15: iconst_1
    //   16: istore #14
    //   18: iconst_1
    //   19: istore #10
    //   21: iconst_1
    //   22: istore #12
    //   24: iconst_1
    //   25: istore #11
    //   27: iconst_0
    //   28: istore #4
    //   30: iload #5
    //   32: tableswitch default -> 64, 0 -> 1470, 1 -> 750, 2 -> 548, 3 -> 460
    //   64: aload #15
    //   66: checkcast oj
    //   69: astore #15
    //   71: iload_1
    //   72: iconst_1
    //   73: if_icmpeq -> 351
    //   76: iload_1
    //   77: iconst_2
    //   78: if_icmpeq -> 236
    //   81: iload_1
    //   82: iconst_3
    //   83: if_icmpeq -> 145
    //   86: iload_1
    //   87: iconst_4
    //   88: if_icmpeq -> 119
    //   91: iload_1
    //   92: iconst_5
    //   93: if_icmpeq -> 102
    //   96: iconst_0
    //   97: istore #10
    //   99: goto -> 457
    //   102: aload_3
    //   103: invokevirtual writeNoException : ()V
    //   106: aload_3
    //   107: ldc 12451000
    //   109: invokevirtual writeInt : (I)V
    //   112: iload #11
    //   114: istore #10
    //   116: goto -> 457
    //   119: aload_2
    //   120: invokevirtual readInt : ()I
    //   123: istore_1
    //   124: aload_2
    //   125: invokestatic d : (Landroid/os/Parcel;)V
    //   128: aload #15
    //   130: iload_1
    //   131: invokevirtual k : (I)V
    //   134: aload_3
    //   135: invokevirtual writeNoException : ()V
    //   138: iload #11
    //   140: istore #10
    //   142: goto -> 457
    //   145: aload_2
    //   146: invokevirtual readString : ()Ljava/lang/String;
    //   149: astore #16
    //   151: aload_2
    //   152: invokestatic d : (Landroid/os/Parcel;)V
    //   155: aload #15
    //   157: getfield i : Lpg2;
    //   160: astore_2
    //   161: aload_2
    //   162: ifnull -> 225
    //   165: aload_2
    //   166: invokevirtual i : ()Z
    //   169: ifeq -> 225
    //   172: aload #15
    //   174: getfield i : Lpg2;
    //   177: astore #15
    //   179: aload #15
    //   181: invokevirtual getClass : ()Ljava/lang/Class;
    //   184: pop
    //   185: invokestatic b : ()Lah;
    //   188: astore_2
    //   189: aload_2
    //   190: new j01
    //   193: dup
    //   194: aload #15
    //   196: aload #16
    //   198: bipush #26
    //   200: iconst_0
    //   201: invokespecial <init> : (Ljava/lang/Object;Ljava/lang/Object;IZ)V
    //   204: putfield d : Ljava/lang/Object;
    //   207: aload_2
    //   208: sipush #8409
    //   211: putfield b : I
    //   214: aload #15
    //   216: iconst_1
    //   217: aload_2
    //   218: invokevirtual a : ()Lah;
    //   221: invokevirtual c : (ILah;)Ldu2;
    //   224: pop
    //   225: aload_3
    //   226: invokevirtual writeNoException : ()V
    //   229: iload #11
    //   231: istore #10
    //   233: goto -> 457
    //   236: aload_2
    //   237: invokevirtual readString : ()Ljava/lang/String;
    //   240: astore #16
    //   242: aload_2
    //   243: getstatic sl0.CREATOR : Landroid/os/Parcelable$Creator;
    //   246: invokestatic a : (Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;
    //   249: checkcast sl0
    //   252: astore #17
    //   254: aload_2
    //   255: invokestatic d : (Landroid/os/Parcel;)V
    //   258: aload #15
    //   260: getfield i : Lpg2;
    //   263: astore_2
    //   264: aload_2
    //   265: ifnull -> 340
    //   268: aload_2
    //   269: invokevirtual i : ()Z
    //   272: ifeq -> 340
    //   275: aload #15
    //   277: getfield i : Lpg2;
    //   280: astore #15
    //   282: aload #15
    //   284: invokevirtual getClass : ()Ljava/lang/Class;
    //   287: pop
    //   288: invokestatic b : ()Lah;
    //   291: astore_2
    //   292: aload_2
    //   293: new zv0
    //   296: dup
    //   297: aload #15
    //   299: aload #16
    //   301: aload #17
    //   303: bipush #17
    //   305: invokespecial <init> : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    //   308: putfield d : Ljava/lang/Object;
    //   311: aload_2
    //   312: sipush #8406
    //   315: putfield b : I
    //   318: aload #15
    //   320: iconst_1
    //   321: aload_2
    //   322: invokevirtual a : ()Lah;
    //   325: invokevirtual c : (ILah;)Ldu2;
    //   328: new gs2
    //   331: dup
    //   332: aload_0
    //   333: iconst_0
    //   334: invokespecial <init> : (Ldc2;I)V
    //   337: invokevirtual a : (Lc41;)V
    //   340: aload_3
    //   341: invokevirtual writeNoException : ()V
    //   344: iload #11
    //   346: istore #10
    //   348: goto -> 457
    //   351: aload_2
    //   352: invokevirtual readString : ()Ljava/lang/String;
    //   355: astore #17
    //   357: aload_2
    //   358: invokevirtual readString : ()Ljava/lang/String;
    //   361: astore #16
    //   363: aload_2
    //   364: invokestatic d : (Landroid/os/Parcel;)V
    //   367: aload #15
    //   369: getfield i : Lpg2;
    //   372: astore_2
    //   373: aload_2
    //   374: ifnull -> 449
    //   377: aload_2
    //   378: invokevirtual i : ()Z
    //   381: ifeq -> 449
    //   384: aload #15
    //   386: getfield i : Lpg2;
    //   389: astore_2
    //   390: aload_2
    //   391: invokevirtual getClass : ()Ljava/lang/Class;
    //   394: pop
    //   395: invokestatic b : ()Lah;
    //   398: astore #15
    //   400: aload #15
    //   402: new p01
    //   405: dup
    //   406: aload_2
    //   407: aload #17
    //   409: aload #16
    //   411: bipush #17
    //   413: invokespecial <init> : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    //   416: putfield d : Ljava/lang/Object;
    //   419: aload #15
    //   421: sipush #8407
    //   424: putfield b : I
    //   427: aload_2
    //   428: iconst_1
    //   429: aload #15
    //   431: invokevirtual a : ()Lah;
    //   434: invokevirtual c : (ILah;)Ldu2;
    //   437: new gs2
    //   440: dup
    //   441: aload_0
    //   442: iconst_1
    //   443: invokespecial <init> : (Ldc2;I)V
    //   446: invokevirtual a : (Lc41;)V
    //   449: aload_3
    //   450: invokevirtual writeNoException : ()V
    //   453: iload #11
    //   455: istore #10
    //   457: iload #10
    //   459: ireturn
    //   460: iload_1
    //   461: iconst_1
    //   462: if_icmpeq -> 493
    //   465: iload_1
    //   466: iconst_2
    //   467: if_icmpeq -> 476
    //   470: iconst_0
    //   471: istore #10
    //   473: goto -> 545
    //   476: aload_3
    //   477: invokevirtual writeNoException : ()V
    //   480: aload_3
    //   481: ldc 12451000
    //   483: invokevirtual writeInt : (I)V
    //   486: iload #13
    //   488: istore #10
    //   490: goto -> 545
    //   493: aload_2
    //   494: invokevirtual readLong : ()J
    //   497: lstore #8
    //   499: aload_2
    //   500: invokevirtual readLong : ()J
    //   503: lstore #6
    //   505: aload_2
    //   506: invokestatic d : (Landroid/os/Parcel;)V
    //   509: aload #15
    //   511: checkcast aj2
    //   514: iconst_2
    //   515: anewarray java/lang/Long
    //   518: dup
    //   519: iconst_0
    //   520: lload #8
    //   522: invokestatic valueOf : (J)Ljava/lang/Long;
    //   525: aastore
    //   526: dup
    //   527: iconst_1
    //   528: lload #6
    //   530: invokestatic valueOf : (J)Ljava/lang/Long;
    //   533: aastore
    //   534: invokestatic a : (Laj2;[Ljava/lang/Object;)V
    //   537: aload_3
    //   538: invokevirtual writeNoException : ()V
    //   541: iload #13
    //   543: istore #10
    //   545: iload #10
    //   547: ireturn
    //   548: aload #15
    //   550: checkcast xf2
    //   553: astore #17
    //   555: iload_1
    //   556: iconst_1
    //   557: if_icmpeq -> 651
    //   560: iload_1
    //   561: iconst_2
    //   562: if_icmpeq -> 620
    //   565: iload_1
    //   566: iconst_3
    //   567: if_icmpeq -> 598
    //   570: iload_1
    //   571: iconst_4
    //   572: if_icmpeq -> 581
    //   575: iconst_0
    //   576: istore #10
    //   578: goto -> 747
    //   581: aload_3
    //   582: invokevirtual writeNoException : ()V
    //   585: aload_3
    //   586: ldc 12451000
    //   588: invokevirtual writeInt : (I)V
    //   591: iload #14
    //   593: istore #10
    //   595: goto -> 747
    //   598: aload #17
    //   600: getfield b : Ljava/lang/String;
    //   603: astore_2
    //   604: aload_3
    //   605: invokevirtual writeNoException : ()V
    //   608: aload_3
    //   609: aload_2
    //   610: invokevirtual writeString : (Ljava/lang/String;)V
    //   613: iload #14
    //   615: istore #10
    //   617: goto -> 747
    //   620: aload #17
    //   622: getfield d : Lmj;
    //   625: getfield g : Z
    //   628: istore #4
    //   630: aload_3
    //   631: invokevirtual writeNoException : ()V
    //   634: getstatic mh2.a : I
    //   637: istore_1
    //   638: aload_3
    //   639: iload #4
    //   641: invokevirtual writeInt : (I)V
    //   644: iload #14
    //   646: istore #10
    //   648: goto -> 747
    //   651: aload_2
    //   652: invokevirtual readString : ()Ljava/lang/String;
    //   655: astore #15
    //   657: aload_2
    //   658: invokestatic d : (Landroid/os/Parcel;)V
    //   661: aload #17
    //   663: invokevirtual getClass : ()Ljava/lang/Class;
    //   666: pop
    //   667: aload #17
    //   669: getfield a : Landroid/content/Context;
    //   672: astore_2
    //   673: aload #17
    //   675: getfield b : Ljava/lang/String;
    //   678: astore #16
    //   680: aload #17
    //   682: getfield a : Landroid/content/Context;
    //   685: astore #18
    //   687: aload #17
    //   689: getfield d : Lmj;
    //   692: astore #19
    //   694: aload #17
    //   696: getfield e : Leh2;
    //   699: astore #17
    //   701: new oj
    //   704: dup
    //   705: aload_2
    //   706: aload #16
    //   708: aload #15
    //   710: aload #19
    //   712: aload #17
    //   714: new qr2
    //   717: dup
    //   718: aload #18
    //   720: aload #19
    //   722: aload #17
    //   724: invokespecial <init> : (Landroid/content/Context;Lmj;Leh2;)V
    //   727: invokespecial <init> : (Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lmj;Leh2;Lqr2;)V
    //   730: invokevirtual h : ()Lsg0;
    //   733: astore_2
    //   734: aload_3
    //   735: invokevirtual writeNoException : ()V
    //   738: aload_3
    //   739: aload_2
    //   740: invokestatic c : (Landroid/os/Parcel;Landroid/os/IInterface;)V
    //   743: iload #14
    //   745: istore #10
    //   747: iload #10
    //   749: ireturn
    //   750: aload #15
    //   752: checkcast al1
    //   755: astore #15
    //   757: iload_1
    //   758: tableswitch default -> 808, 1 -> 1448, 2 -> 1415, 3 -> 1382, 4 -> 1261, 5 -> 1202, 6 -> 1189, 7 -> 1146, 8 -> 1103, 9 -> 814
    //   808: iconst_0
    //   809: istore #10
    //   811: goto -> 1467
    //   814: aload_2
    //   815: getstatic android/os/Bundle.CREATOR : Landroid/os/Parcelable$Creator;
    //   818: invokestatic a : (Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;
    //   821: checkcast android/os/Bundle
    //   824: astore #16
    //   826: aload_2
    //   827: invokestatic d : (Landroid/os/Parcel;)V
    //   830: aload #15
    //   832: checkcast oj
    //   835: astore #15
    //   837: aload #15
    //   839: invokevirtual getClass : ()Ljava/lang/Class;
    //   842: pop
    //   843: aload #16
    //   845: invokestatic e : (Landroid/os/Bundle;)Lcom/google/android/gms/cast/CastDevice;
    //   848: astore #16
    //   850: aload #16
    //   852: ifnull -> 1096
    //   855: aload #16
    //   857: getfield f : Ljava/lang/String;
    //   860: astore_2
    //   861: aload #16
    //   863: aload #15
    //   865: getfield k : Lcom/google/android/gms/cast/CastDevice;
    //   868: invokevirtual equals : (Ljava/lang/Object;)Z
    //   871: ifne -> 1096
    //   874: iload #4
    //   876: istore_1
    //   877: aload_2
    //   878: invokestatic isEmpty : (Ljava/lang/CharSequence;)Z
    //   881: ifne -> 913
    //   884: aload #15
    //   886: getfield k : Lcom/google/android/gms/cast/CastDevice;
    //   889: astore #17
    //   891: aload #17
    //   893: ifnull -> 911
    //   896: iload #4
    //   898: istore_1
    //   899: aload #17
    //   901: getfield f : Ljava/lang/String;
    //   904: aload_2
    //   905: invokestatic equals : (Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z
    //   908: ifne -> 913
    //   911: iconst_1
    //   912: istore_1
    //   913: aload #15
    //   915: aload #16
    //   917: putfield k : Lcom/google/android/gms/cast/CastDevice;
    //   920: getstatic oj.m : Lrp0;
    //   923: astore #17
    //   925: iconst_1
    //   926: iload_1
    //   927: if_icmpeq -> 936
    //   930: ldc 'unchanged'
    //   932: astore_2
    //   933: goto -> 939
    //   936: ldc 'changed'
    //   938: astore_2
    //   939: aload #17
    //   941: ldc 'update to device (%s) with name %s'
    //   943: iconst_2
    //   944: anewarray java/lang/Object
    //   947: dup
    //   948: iconst_0
    //   949: aload #16
    //   951: aastore
    //   952: dup
    //   953: iconst_1
    //   954: aload_2
    //   955: aastore
    //   956: invokevirtual b : (Ljava/lang/String;[Ljava/lang/Object;)V
    //   959: iload_1
    //   960: ifeq -> 1096
    //   963: aload #15
    //   965: getfield k : Lcom/google/android/gms/cast/CastDevice;
    //   968: astore #16
    //   970: aload #16
    //   972: ifnull -> 1096
    //   975: aload #15
    //   977: getfield h : Lqr2;
    //   980: astore #17
    //   982: aload #17
    //   984: ifnull -> 1027
    //   987: getstatic qr2.v : Lrp0;
    //   990: astore_2
    //   991: aload_2
    //   992: getfield a : Ljava/lang/String;
    //   995: aload_2
    //   996: getstatic in/krosbits/utils/SgV/zpEN.zsmiZJF : Ljava/lang/String;
    //   999: iconst_1
    //   1000: anewarray java/lang/Object
    //   1003: dup
    //   1004: iconst_0
    //   1005: aload #16
    //   1007: aastore
    //   1008: invokevirtual c : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   1011: invokestatic i : (Ljava/lang/String;Ljava/lang/String;)I
    //   1014: pop
    //   1015: aload #17
    //   1017: aload #16
    //   1019: putfield o : Lcom/google/android/gms/cast/CastDevice;
    //   1022: aload #17
    //   1024: invokevirtual b : ()V
    //   1027: new java/util/HashSet
    //   1030: dup
    //   1031: aload #15
    //   1033: getfield d : Ljava/util/HashSet;
    //   1036: invokespecial <init> : (Ljava/util/Collection;)V
    //   1039: invokevirtual iterator : ()Ljava/util/Iterator;
    //   1042: astore_2
    //   1043: aload_2
    //   1044: invokeinterface hasNext : ()Z
    //   1049: ifeq -> 1068
    //   1052: aload_2
    //   1053: invokeinterface next : ()Ljava/lang/Object;
    //   1058: checkcast fu2
    //   1061: invokevirtual getClass : ()Ljava/lang/Class;
    //   1064: pop
    //   1065: goto -> 1043
    //   1068: aload #15
    //   1070: getfield l : Lmt2;
    //   1073: astore_2
    //   1074: aload_2
    //   1075: ifnull -> 1096
    //   1078: aload_2
    //   1079: getfield b : Lcn;
    //   1082: invokevirtual H : ()Lgc2;
    //   1085: astore_2
    //   1086: aload_2
    //   1087: aload_2
    //   1088: getfield u : I
    //   1091: iconst_1
    //   1092: iadd
    //   1093: putfield u : I
    //   1096: aload_3
    //   1097: invokevirtual writeNoException : ()V
    //   1100: goto -> 1467
    //   1103: aload_2
    //   1104: getstatic android/os/Bundle.CREATOR : Landroid/os/Parcelable$Creator;
    //   1107: invokestatic a : (Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;
    //   1110: checkcast android/os/Bundle
    //   1113: astore #16
    //   1115: aload_2
    //   1116: invokestatic d : (Landroid/os/Parcel;)V
    //   1119: aload #15
    //   1121: checkcast oj
    //   1124: astore_2
    //   1125: aload_2
    //   1126: invokevirtual getClass : ()Ljava/lang/Class;
    //   1129: pop
    //   1130: aload_2
    //   1131: aload #16
    //   1133: invokestatic e : (Landroid/os/Bundle;)Lcom/google/android/gms/cast/CastDevice;
    //   1136: putfield k : Lcom/google/android/gms/cast/CastDevice;
    //   1139: aload_3
    //   1140: invokevirtual writeNoException : ()V
    //   1143: goto -> 1467
    //   1146: aload_2
    //   1147: getstatic android/os/Bundle.CREATOR : Landroid/os/Parcelable$Creator;
    //   1150: invokestatic a : (Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;
    //   1153: checkcast android/os/Bundle
    //   1156: astore #16
    //   1158: aload_2
    //   1159: invokestatic d : (Landroid/os/Parcel;)V
    //   1162: aload #15
    //   1164: checkcast oj
    //   1167: astore_2
    //   1168: aload_2
    //   1169: invokevirtual getClass : ()Ljava/lang/Class;
    //   1172: pop
    //   1173: aload_2
    //   1174: aload #16
    //   1176: invokestatic e : (Landroid/os/Bundle;)Lcom/google/android/gms/cast/CastDevice;
    //   1179: putfield k : Lcom/google/android/gms/cast/CastDevice;
    //   1182: aload_3
    //   1183: invokevirtual writeNoException : ()V
    //   1186: goto -> 1467
    //   1189: aload_3
    //   1190: invokevirtual writeNoException : ()V
    //   1193: aload_3
    //   1194: ldc 12451000
    //   1196: invokevirtual writeInt : (I)V
    //   1199: goto -> 1467
    //   1202: aload #15
    //   1204: checkcast oj
    //   1207: astore_2
    //   1208: aload_2
    //   1209: invokevirtual getClass : ()Ljava/lang/Class;
    //   1212: pop
    //   1213: invokestatic j : ()V
    //   1216: aload_2
    //   1217: getfield j : Lnf1;
    //   1220: astore #15
    //   1222: aload #15
    //   1224: ifnonnull -> 1233
    //   1227: lconst_0
    //   1228: lstore #6
    //   1230: goto -> 1248
    //   1233: aload #15
    //   1235: invokevirtual f : ()J
    //   1238: aload_2
    //   1239: getfield j : Lnf1;
    //   1242: invokevirtual a : ()J
    //   1245: lsub
    //   1246: lstore #6
    //   1248: aload_3
    //   1249: invokevirtual writeNoException : ()V
    //   1252: aload_3
    //   1253: lload #6
    //   1255: invokevirtual writeLong : (J)V
    //   1258: goto -> 1467
    //   1261: getstatic mh2.a : I
    //   1264: istore_1
    //   1265: aload_2
    //   1266: invokevirtual readInt : ()I
    //   1269: ifeq -> 1277
    //   1272: iconst_1
    //   1273: istore_1
    //   1274: goto -> 1279
    //   1277: iconst_0
    //   1278: istore_1
    //   1279: aload_2
    //   1280: invokestatic d : (Landroid/os/Parcel;)V
    //   1283: aload #15
    //   1285: checkcast oj
    //   1288: astore_2
    //   1289: aload_2
    //   1290: getfield e : Lbe2;
    //   1293: astore #15
    //   1295: aload #15
    //   1297: ifnull -> 1375
    //   1300: aload #15
    //   1302: checkcast vd2
    //   1305: astore #15
    //   1307: aload #15
    //   1309: invokevirtual o : ()Landroid/os/Parcel;
    //   1312: astore #16
    //   1314: aload #16
    //   1316: iload_1
    //   1317: invokevirtual writeInt : (I)V
    //   1320: aload #16
    //   1322: iconst_0
    //   1323: invokevirtual writeInt : (I)V
    //   1326: aload #15
    //   1328: aload #16
    //   1330: bipush #6
    //   1332: invokevirtual o0 : (Landroid/os/Parcel;I)V
    //   1335: goto -> 1370
    //   1338: astore #15
    //   1340: getstatic oj.m : Lrp0;
    //   1343: aload #15
    //   1345: ldc_w 'Unable to call %s on %s.'
    //   1348: iconst_2
    //   1349: anewarray java/lang/Object
    //   1352: dup
    //   1353: iconst_0
    //   1354: ldc_w 'disconnectFromDevice'
    //   1357: aastore
    //   1358: dup
    //   1359: iconst_1
    //   1360: ldc_w be2
    //   1363: invokevirtual getSimpleName : ()Ljava/lang/String;
    //   1366: aastore
    //   1367: invokevirtual a : (Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1370: aload_2
    //   1371: iconst_0
    //   1372: invokevirtual f : (I)V
    //   1375: aload_3
    //   1376: invokevirtual writeNoException : ()V
    //   1379: goto -> 1467
    //   1382: aload_2
    //   1383: getstatic android/os/Bundle.CREATOR : Landroid/os/Parcelable$Creator;
    //   1386: invokestatic a : (Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;
    //   1389: checkcast android/os/Bundle
    //   1392: astore #16
    //   1394: aload_2
    //   1395: invokestatic d : (Landroid/os/Parcel;)V
    //   1398: aload #15
    //   1400: checkcast oj
    //   1403: aload #16
    //   1405: invokevirtual l : (Landroid/os/Bundle;)V
    //   1408: aload_3
    //   1409: invokevirtual writeNoException : ()V
    //   1412: goto -> 1467
    //   1415: aload_2
    //   1416: getstatic android/os/Bundle.CREATOR : Landroid/os/Parcelable$Creator;
    //   1419: invokestatic a : (Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;
    //   1422: checkcast android/os/Bundle
    //   1425: astore #16
    //   1427: aload_2
    //   1428: invokestatic d : (Landroid/os/Parcel;)V
    //   1431: aload #15
    //   1433: checkcast oj
    //   1436: aload #16
    //   1438: invokevirtual l : (Landroid/os/Bundle;)V
    //   1441: aload_3
    //   1442: invokevirtual writeNoException : ()V
    //   1445: goto -> 1467
    //   1448: new j31
    //   1451: dup
    //   1452: aload #15
    //   1454: invokespecial <init> : (Ljava/lang/Object;)V
    //   1457: astore_2
    //   1458: aload_3
    //   1459: invokevirtual writeNoException : ()V
    //   1462: aload_3
    //   1463: aload_2
    //   1464: invokestatic c : (Landroid/os/Parcel;Landroid/os/IInterface;)V
    //   1467: iload #10
    //   1469: ireturn
    //   1470: aload #15
    //   1472: checkcast w71
    //   1475: astore #15
    //   1477: iload_1
    //   1478: iconst_1
    //   1479: if_icmpeq -> 1544
    //   1482: iload_1
    //   1483: iconst_2
    //   1484: if_icmpeq -> 1515
    //   1487: iload_1
    //   1488: iconst_3
    //   1489: if_icmpeq -> 1498
    //   1492: iconst_0
    //   1493: istore #10
    //   1495: goto -> 1567
    //   1498: aload_3
    //   1499: invokevirtual writeNoException : ()V
    //   1502: aload_3
    //   1503: ldc 12451000
    //   1505: invokevirtual writeInt : (I)V
    //   1508: iload #12
    //   1510: istore #10
    //   1512: goto -> 1567
    //   1515: aload_2
    //   1516: invokevirtual readInt : ()I
    //   1519: istore_1
    //   1520: aload_2
    //   1521: invokestatic d : (Landroid/os/Parcel;)V
    //   1524: aload #15
    //   1526: getfield b : Lz71;
    //   1529: iload_1
    //   1530: invokevirtual c1 : (I)V
    //   1533: aload_3
    //   1534: invokevirtual writeNoException : ()V
    //   1537: iload #12
    //   1539: istore #10
    //   1541: goto -> 1567
    //   1544: new j31
    //   1547: dup
    //   1548: aload #15
    //   1550: invokespecial <init> : (Ljava/lang/Object;)V
    //   1553: astore_2
    //   1554: aload_3
    //   1555: invokevirtual writeNoException : ()V
    //   1558: aload_3
    //   1559: aload_2
    //   1560: invokestatic c : (Landroid/os/Parcel;Landroid/os/IInterface;)V
    //   1563: iload #12
    //   1565: istore #10
    //   1567: iload #10
    //   1569: ireturn
    // Exception table:
    //   from	to	target	type
    //   1300	1335	1338	android/os/RemoteException
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\dc2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
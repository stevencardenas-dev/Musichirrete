import android.content.Context;
import in.krosbits.nativex.Cn;

public final class yx1 extends pr1 implements ad0 {
  public Object g;
  
  public final Cn h;
  
  public final cy1 i;
  
  public final cd1 j;
  
  public final by1 k;
  
  public final int l;
  
  public final int m;
  
  public final Context n;
  
  public yx1(Cn paramCn, cy1 paramcy1, cd1 paramcd1, by1 paramby1, int paramInt1, int paramInt2, Context paramContext, cs paramcs) {
    super(2, paramcs);
  }
  
  public final Object g(Object paramObject1, Object paramObject2) {
    paramObject1 = paramObject1;
    paramObject2 = l((cs)paramObject2, paramObject1);
    paramObject1 = l02.a;
    paramObject2.n(paramObject1);
    return paramObject1;
  }
  
  public final cs l(cs paramcs, Object paramObject) {
    int i = this.m;
    Context context = this.n;
    paramcs = new yx1(this.h, this.i, this.j, this.k, this.l, i, context, paramcs);
    ((yx1)paramcs).g = paramObject;
    return paramcs;
  }
  
  public final Object n(Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: getfield g : Ljava/lang/Object;
    //   4: checkcast xs
    //   7: astore #9
    //   9: aload_1
    //   10: invokestatic r0 : (Ljava/lang/Object;)V
    //   13: aload_0
    //   14: getfield h : Lin/krosbits/nativex/Cn;
    //   17: invokevirtual b : ()Z
    //   20: istore #6
    //   22: aload_0
    //   23: getfield j : Lcd1;
    //   26: astore #12
    //   28: iload #6
    //   30: ifeq -> 1140
    //   33: aload #9
    //   35: invokeinterface g : ()Los;
    //   40: getstatic vs2.g : Lvs2;
    //   43: invokeinterface l : (Lns;)Lms;
    //   48: checkcast vj0
    //   51: astore_1
    //   52: aload_1
    //   53: ifnull -> 67
    //   56: aload_1
    //   57: invokeinterface a : ()Z
    //   62: istore #6
    //   64: goto -> 70
    //   67: iconst_1
    //   68: istore #6
    //   70: iload #6
    //   72: ifeq -> 1140
    //   75: aload_0
    //   76: getfield i : Lcy1;
    //   79: astore #11
    //   81: aload #11
    //   83: getfield b : Z
    //   86: istore #6
    //   88: aload_0
    //   89: getfield m : I
    //   92: istore_3
    //   93: aload_0
    //   94: getfield l : I
    //   97: istore #4
    //   99: aload_0
    //   100: getfield k : Lby1;
    //   103: astore #13
    //   105: iload #6
    //   107: ifeq -> 968
    //   110: aload #13
    //   112: getfield e : Lvx1;
    //   115: getfield d : Ljava/lang/String;
    //   118: astore #10
    //   120: iload #4
    //   122: iload_3
    //   123: isub
    //   124: i2l
    //   125: lstore #7
    //   127: getstatic ag0.a : Ljava/lang/String;
    //   130: astore_1
    //   131: invokestatic getSingleton : ()Landroid/webkit/MimeTypeMap;
    //   134: aload #12
    //   136: invokevirtual h : ()Ljava/lang/String;
    //   139: invokestatic C : (Ljava/lang/String;)Ljava/lang/String;
    //   142: invokevirtual getMimeTypeFromExtension : (Ljava/lang/String;)Ljava/lang/String;
    //   145: astore #14
    //   147: getstatic in/krosbits/musicolet/MyApplication.F : Lyp1;
    //   150: invokevirtual p : ()Z
    //   153: istore #6
    //   155: ldc '_data'
    //   157: astore_1
    //   158: iload #6
    //   160: ifeq -> 430
    //   163: invokestatic P : ()Lv00;
    //   166: astore_1
    //   167: aload_1
    //   168: aload #12
    //   170: invokevirtual h : ()Ljava/lang/String;
    //   173: invokevirtual A : (Ljava/lang/String;)Lv00;
    //   176: astore #9
    //   178: aload_1
    //   179: aconst_null
    //   180: invokevirtual D : (Lq01;)Ljava/util/ArrayList;
    //   183: astore_1
    //   184: aload_1
    //   185: invokevirtual size : ()I
    //   188: istore #5
    //   190: iconst_0
    //   191: istore_2
    //   192: iload_2
    //   193: iload #5
    //   195: if_icmpge -> 257
    //   198: aload_1
    //   199: iload_2
    //   200: invokevirtual get : (I)Ljava/lang/Object;
    //   203: astore #15
    //   205: iinc #2, 1
    //   208: aload #15
    //   210: checkcast v00
    //   213: astore #15
    //   215: aload #15
    //   217: aload #9
    //   219: invokevirtual equals : (Ljava/lang/Object;)Z
    //   222: ifne -> 254
    //   225: ldc '.nomedia'
    //   227: aload #15
    //   229: invokevirtual h : ()Ljava/lang/String;
    //   232: invokevirtual equals : (Ljava/lang/Object;)Z
    //   235: ifeq -> 241
    //   238: goto -> 254
    //   241: aload #15
    //   243: invokevirtual e : ()Z
    //   246: pop
    //   247: goto -> 254
    //   250: astore_1
    //   251: goto -> 954
    //   254: goto -> 192
    //   257: getstatic in/krosbits/musicolet/MyApplication.F : Lyp1;
    //   260: aload #9
    //   262: invokevirtual l : (Lv00;)Lv00;
    //   265: astore_1
    //   266: getstatic in/krosbits/musicolet/MyApplication.i : Lin/krosbits/musicolet/MyApplication;
    //   269: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   272: pop
    //   273: aload #12
    //   275: aload_1
    //   276: invokestatic f : (Lv00;Lv00;)Z
    //   279: ifeq -> 416
    //   282: getstatic in/krosbits/musicolet/MyApplication.i : Lin/krosbits/musicolet/MyApplication;
    //   285: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   288: invokevirtual getContentResolver : ()Landroid/content/ContentResolver;
    //   291: astore #15
    //   293: getstatic android/provider/MediaStore$Audio$Media.EXTERNAL_CONTENT_URI : Landroid/net/Uri;
    //   296: astore #17
    //   298: getstatic in/krosbits/musicolet/MyApplication.F : Lyp1;
    //   301: aload #9
    //   303: invokevirtual g : (Lv00;)Ljava/lang/String;
    //   306: astore #16
    //   308: aload #16
    //   310: ifnull -> 336
    //   313: aload #15
    //   315: aload #17
    //   317: getstatic com/android/billingclient/api/wH/DJqHMztxflt.waU : Ljava/lang/String;
    //   320: iconst_1
    //   321: anewarray java/lang/String
    //   324: dup
    //   325: iconst_0
    //   326: aload #16
    //   328: aastore
    //   329: invokevirtual delete : (Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)I
    //   332: pop
    //   333: goto -> 336
    //   336: new android/content/ContentValues
    //   339: astore_1
    //   340: aload_1
    //   341: bipush #10
    //   343: invokespecial <init> : (I)V
    //   346: aload_1
    //   347: ldc '_data'
    //   349: aload #16
    //   351: invokevirtual put : (Ljava/lang/String;Ljava/lang/String;)V
    //   354: aload_1
    //   355: ldc 'title'
    //   357: aload #10
    //   359: invokevirtual put : (Ljava/lang/String;Ljava/lang/String;)V
    //   362: aload_1
    //   363: ldc '_size'
    //   365: aload #9
    //   367: invokevirtual n : ()J
    //   370: invokestatic valueOf : (J)Ljava/lang/Long;
    //   373: invokevirtual put : (Ljava/lang/String;Ljava/lang/Long;)V
    //   376: aload_1
    //   377: ldc 'mime_type'
    //   379: aload #14
    //   381: invokevirtual put : (Ljava/lang/String;Ljava/lang/String;)V
    //   384: aload_1
    //   385: ldc 'duration'
    //   387: lload #7
    //   389: invokestatic valueOf : (J)Ljava/lang/Long;
    //   392: invokevirtual put : (Ljava/lang/String;Ljava/lang/Long;)V
    //   395: aload_1
    //   396: ldc 'is_ringtone'
    //   398: getstatic java/lang/Boolean.TRUE : Ljava/lang/Boolean;
    //   401: invokevirtual put : (Ljava/lang/String;Ljava/lang/Boolean;)V
    //   404: aload #15
    //   406: aload #17
    //   408: aload_1
    //   409: invokevirtual insert : (Landroid/net/Uri;Landroid/content/ContentValues;)Landroid/net/Uri;
    //   412: astore_1
    //   413: goto -> 922
    //   416: new java/lang/IllegalStateException
    //   419: astore_1
    //   420: aload_1
    //   421: invokespecial <init> : ()V
    //   424: aload_1
    //   425: athrow
    //   426: astore_1
    //   427: goto -> 954
    //   430: getstatic in/krosbits/musicolet/MyApplication.i : Lin/krosbits/musicolet/MyApplication;
    //   433: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   436: invokevirtual getContentResolver : ()Landroid/content/ContentResolver;
    //   439: astore #15
    //   441: new java/lang/StringBuilder
    //   444: astore #9
    //   446: aload #9
    //   448: invokespecial <init> : ()V
    //   451: aload #9
    //   453: getstatic android/os/Environment.DIRECTORY_RINGTONES : Ljava/lang/String;
    //   456: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   459: pop
    //   460: aload #9
    //   462: ldc_w '/Musicolet/'
    //   465: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   468: pop
    //   469: aload #9
    //   471: invokevirtual toString : ()Ljava/lang/String;
    //   474: astore #17
    //   476: aload #12
    //   478: invokevirtual h : ()Ljava/lang/String;
    //   481: astore #18
    //   483: getstatic android/provider/MediaStore$Audio$Media.EXTERNAL_CONTENT_URI : Landroid/net/Uri;
    //   486: astore #16
    //   488: aload #15
    //   490: aload #16
    //   492: iconst_1
    //   493: anewarray java/lang/String
    //   496: dup
    //   497: iconst_0
    //   498: ldc_w '_id'
    //   501: aastore
    //   502: ldc_w 'relative_path like ? '
    //   505: iconst_1
    //   506: anewarray java/lang/String
    //   509: dup
    //   510: iconst_0
    //   511: aload #17
    //   513: aastore
    //   514: aconst_null
    //   515: invokevirtual query : (Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   518: astore #9
    //   520: aload #9
    //   522: ifnull -> 577
    //   525: aload #9
    //   527: invokeinterface moveToNext : ()Z
    //   532: ifeq -> 567
    //   535: aload #15
    //   537: aload #16
    //   539: ldc_w '_id=?'
    //   542: iconst_1
    //   543: anewarray java/lang/String
    //   546: dup
    //   547: iconst_0
    //   548: aload #9
    //   550: iconst_0
    //   551: invokeinterface getInt : (I)I
    //   556: invokestatic valueOf : (I)Ljava/lang/String;
    //   559: aastore
    //   560: invokevirtual delete : (Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)I
    //   563: pop
    //   564: goto -> 525
    //   567: aload #9
    //   569: invokeinterface close : ()V
    //   574: goto -> 580
    //   577: ldc '_data'
    //   579: astore_1
    //   580: new android/content/ContentValues
    //   583: astore #9
    //   585: aload #9
    //   587: invokespecial <init> : ()V
    //   590: aload #9
    //   592: ldc_w 'relative_path'
    //   595: aload #17
    //   597: invokevirtual put : (Ljava/lang/String;Ljava/lang/String;)V
    //   600: aload #9
    //   602: ldc 'title'
    //   604: aload #10
    //   606: invokevirtual put : (Ljava/lang/String;Ljava/lang/String;)V
    //   609: aload #9
    //   611: ldc 'duration'
    //   613: lload #7
    //   615: invokestatic valueOf : (J)Ljava/lang/Long;
    //   618: invokevirtual put : (Ljava/lang/String;Ljava/lang/Long;)V
    //   621: aload #9
    //   623: ldc_w '_display_name'
    //   626: aload #18
    //   628: invokevirtual put : (Ljava/lang/String;Ljava/lang/String;)V
    //   631: aload #9
    //   633: ldc 'is_ringtone'
    //   635: getstatic java/lang/Boolean.TRUE : Ljava/lang/Boolean;
    //   638: invokevirtual put : (Ljava/lang/String;Ljava/lang/Boolean;)V
    //   641: aload #9
    //   643: ldc 'mime_type'
    //   645: aload #14
    //   647: invokevirtual put : (Ljava/lang/String;Ljava/lang/String;)V
    //   650: aload #15
    //   652: aload #16
    //   654: aload #9
    //   656: invokevirtual insert : (Landroid/net/Uri;Landroid/content/ContentValues;)Landroid/net/Uri;
    //   659: astore #10
    //   661: aload #15
    //   663: aload #10
    //   665: invokevirtual openOutputStream : (Landroid/net/Uri;)Ljava/io/OutputStream;
    //   668: astore #9
    //   670: aload #10
    //   672: invokevirtual getLastPathSegment : ()Ljava/lang/String;
    //   675: invokestatic parseInt : (Ljava/lang/String;)I
    //   678: istore #5
    //   680: aload #12
    //   682: invokestatic n : (Lu00;)Ljava/io/FileInputStream;
    //   685: astore #10
    //   687: ldc_w 131072
    //   690: newarray byte
    //   692: astore #14
    //   694: aload #10
    //   696: aload #14
    //   698: invokevirtual read : ([B)I
    //   701: istore_2
    //   702: iload_2
    //   703: iconst_m1
    //   704: if_icmpeq -> 726
    //   707: aload #9
    //   709: aload #14
    //   711: iconst_0
    //   712: iload_2
    //   713: invokevirtual write : ([BII)V
    //   716: goto -> 694
    //   719: astore #10
    //   721: aconst_null
    //   722: astore_1
    //   723: goto -> 914
    //   726: aload #9
    //   728: invokevirtual flush : ()V
    //   731: aload #9
    //   733: invokevirtual close : ()V
    //   736: aload #10
    //   738: invokevirtual close : ()V
    //   741: aload #16
    //   743: iload #5
    //   745: invokestatic valueOf : (I)Ljava/lang/String;
    //   748: invokestatic withAppendedPath : (Landroid/net/Uri;Ljava/lang/String;)Landroid/net/Uri;
    //   751: astore #9
    //   753: aload #15
    //   755: aload #16
    //   757: iconst_1
    //   758: anewarray java/lang/String
    //   761: dup
    //   762: iconst_0
    //   763: aload_1
    //   764: aastore
    //   765: ldc_w '_id=?'
    //   768: iconst_1
    //   769: anewarray java/lang/String
    //   772: dup
    //   773: iconst_0
    //   774: iload #5
    //   776: invokestatic valueOf : (I)Ljava/lang/String;
    //   779: aastore
    //   780: aconst_null
    //   781: invokevirtual query : (Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   784: astore #10
    //   786: aload #9
    //   788: astore_1
    //   789: aload #10
    //   791: ifnull -> 911
    //   794: aload #10
    //   796: invokeinterface moveToNext : ()Z
    //   801: ifeq -> 901
    //   804: aload #10
    //   806: iconst_0
    //   807: invokeinterface getString : (I)Ljava/lang/String;
    //   812: astore_1
    //   813: aload_1
    //   814: ifnull -> 901
    //   817: getstatic in/krosbits/musicolet/MyApplication.F : Lyp1;
    //   820: aload_1
    //   821: invokevirtual f : (Ljava/lang/String;)Ljava/lang/String;
    //   824: invokestatic c : (Ljava/lang/String;)Ljava/lang/String;
    //   827: astore #14
    //   829: invokestatic z : ()Ljava/util/ArrayList;
    //   832: astore_1
    //   833: aload_1
    //   834: aload #14
    //   836: invokevirtual contains : (Ljava/lang/Object;)Z
    //   839: ifne -> 901
    //   842: aload_1
    //   843: aload #14
    //   845: invokevirtual add : (Ljava/lang/Object;)Z
    //   848: pop
    //   849: invokestatic o : ()Landroid/content/SharedPreferences;
    //   852: invokeinterface edit : ()Landroid/content/SharedPreferences$Editor;
    //   857: astore #14
    //   859: new org/json/JSONArray
    //   862: astore #15
    //   864: aload #15
    //   866: aload_1
    //   867: invokespecial <init> : (Ljava/util/Collection;)V
    //   870: aload #14
    //   872: ldc_w 'S_PTH_SCN_J'
    //   875: aload #15
    //   877: invokevirtual toString : ()Ljava/lang/String;
    //   880: invokeinterface putString : (Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;
    //   885: invokeinterface apply : ()V
    //   890: goto -> 901
    //   893: astore #10
    //   895: aload #9
    //   897: astore_1
    //   898: goto -> 914
    //   901: aload #10
    //   903: invokeinterface close : ()V
    //   908: aload #9
    //   910: astore_1
    //   911: goto -> 922
    //   914: aload #10
    //   916: invokevirtual printStackTrace : ()V
    //   919: goto -> 911
    //   922: aload_1
    //   923: ifnull -> 968
    //   926: getstatic in/krosbits/musicolet/MyApplication.i : Lin/krosbits/musicolet/MyApplication;
    //   929: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   932: iconst_1
    //   933: aload_1
    //   934: invokestatic setActualDefaultRingtoneUri : (Landroid/content/Context;ILandroid/net/Uri;)V
    //   937: ldc_w 2131887247
    //   940: iconst_1
    //   941: invokestatic O0 : (II)V
    //   944: goto -> 968
    //   947: astore_1
    //   948: aload_1
    //   949: athrow
    //   950: astore_1
    //   951: goto -> 427
    //   954: aload_1
    //   955: invokevirtual printStackTrace : ()V
    //   958: ldc_w 2131886514
    //   961: iconst_0
    //   962: invokestatic O0 : (II)V
    //   965: goto -> 968
    //   968: iload #4
    //   970: istore_2
    //   971: aload #13
    //   973: getfield c : Lip1;
    //   976: astore #9
    //   978: aload #11
    //   980: astore_1
    //   981: aload #9
    //   983: invokevirtual f : ()Ljava/lang/Object;
    //   986: astore #18
    //   988: aload #18
    //   990: checkcast cy1
    //   993: astore #16
    //   995: aload_1
    //   996: getfield h : Li51;
    //   999: astore #10
    //   1001: aload_1
    //   1002: getfield c : Ljava/util/List;
    //   1005: astore #14
    //   1007: aload_0
    //   1008: getfield n : Landroid/content/Context;
    //   1011: ldc_w 2131887123
    //   1014: invokevirtual getString : (I)Ljava/lang/String;
    //   1017: astore #15
    //   1019: iload_2
    //   1020: iload_3
    //   1021: isub
    //   1022: i2l
    //   1023: iconst_0
    //   1024: iconst_0
    //   1025: invokestatic B : (JZI)Ljava/lang/String;
    //   1028: astore #13
    //   1030: aload #12
    //   1032: invokevirtual n : ()J
    //   1035: invokestatic b : (J)Ljava/lang/String;
    //   1038: astore #17
    //   1040: new java/lang/StringBuilder
    //   1043: dup
    //   1044: invokespecial <init> : ()V
    //   1047: astore #11
    //   1049: aload #11
    //   1051: aload #15
    //   1053: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1056: pop
    //   1057: aload #11
    //   1059: ldc_w '\\n'
    //   1062: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1065: pop
    //   1066: aload #11
    //   1068: aload #13
    //   1070: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1073: pop
    //   1074: aload #11
    //   1076: ldc_w ' | '
    //   1079: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1082: pop
    //   1083: aload #11
    //   1085: aload #17
    //   1087: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1090: pop
    //   1091: aload #9
    //   1093: aload #18
    //   1095: aload #16
    //   1097: aconst_null
    //   1098: fconst_0
    //   1099: fconst_0
    //   1100: fconst_0
    //   1101: aconst_null
    //   1102: fconst_0
    //   1103: aconst_null
    //   1104: aconst_null
    //   1105: aconst_null
    //   1106: aconst_null
    //   1107: aconst_null
    //   1108: aload #12
    //   1110: aload #14
    //   1112: aload #10
    //   1114: aload #11
    //   1116: invokevirtual toString : ()Ljava/lang/String;
    //   1119: aconst_null
    //   1120: aconst_null
    //   1121: aconst_null
    //   1122: ldc_w 1851391
    //   1125: invokestatic a : (Lcy1;Ljava/util/List;FFFLi51;FLbp1;Lbp1;Lbp1;Lbp1;Lin/krosbits/nativex/Cn;Lcd1;Ljava/util/List;Li51;Ljava/lang/String;Ljava/lang/String;Landroid/util/Size;Landroid/graphics/Bitmap;I)Lcy1;
    //   1128: invokevirtual e : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   1131: ifeq -> 1137
    //   1134: goto -> 1146
    //   1137: goto -> 981
    //   1140: aload #12
    //   1142: invokevirtual e : ()Z
    //   1145: pop
    //   1146: getstatic l02.a : Ll02;
    //   1149: areturn
    //   1150: astore_1
    //   1151: goto -> 1146
    // Exception table:
    //   from	to	target	type
    //   131	155	950	finally
    //   163	178	426	finally
    //   178	190	250	finally
    //   198	205	250	finally
    //   208	238	250	finally
    //   241	247	250	finally
    //   257	308	250	finally
    //   313	333	250	finally
    //   336	413	250	finally
    //   416	426	250	finally
    //   430	520	250	finally
    //   525	564	250	finally
    //   567	574	250	finally
    //   580	687	250	finally
    //   687	694	719	finally
    //   694	702	719	finally
    //   707	716	719	finally
    //   726	753	719	finally
    //   753	786	893	finally
    //   794	813	893	finally
    //   817	890	893	finally
    //   901	908	893	finally
    //   914	919	947	finally
    //   926	944	250	finally
    //   948	950	250	finally
    //   1140	1146	1150	finally
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\yx1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
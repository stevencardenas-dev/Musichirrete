import j$.util.DesugarTimeZone;
import java.text.ParsePosition;
import java.util.Date;
import java.util.TimeZone;

public abstract class wg0 {
  public static final TimeZone a = DesugarTimeZone.getTimeZone("UTC");
  
  public static boolean a(String paramString, int paramInt, char paramChar) {
    return (paramInt < paramString.length() && paramString.charAt(paramInt) == paramChar);
  }
  
  public static Date b(String paramString, ParsePosition paramParsePosition) {
    // Byte code:
    //   0: aload_1
    //   1: invokevirtual getIndex : ()I
    //   4: istore #5
    //   6: iload #5
    //   8: iconst_4
    //   9: iadd
    //   10: istore_3
    //   11: iload #5
    //   13: iload_3
    //   14: aload_0
    //   15: invokestatic c : (IILjava/lang/String;)I
    //   18: istore #9
    //   20: iload_3
    //   21: istore #4
    //   23: aload_0
    //   24: iload_3
    //   25: bipush #45
    //   27: invokestatic a : (Ljava/lang/String;IC)Z
    //   30: ifeq -> 39
    //   33: iload #5
    //   35: iconst_5
    //   36: iadd
    //   37: istore #4
    //   39: iload #4
    //   41: iconst_2
    //   42: iadd
    //   43: istore #5
    //   45: iload #4
    //   47: iload #5
    //   49: aload_0
    //   50: invokestatic c : (IILjava/lang/String;)I
    //   53: istore #10
    //   55: iload #5
    //   57: istore_3
    //   58: aload_0
    //   59: iload #5
    //   61: bipush #45
    //   63: invokestatic a : (Ljava/lang/String;IC)Z
    //   66: ifeq -> 74
    //   69: iload #4
    //   71: iconst_3
    //   72: iadd
    //   73: istore_3
    //   74: iload_3
    //   75: iconst_2
    //   76: iadd
    //   77: istore #7
    //   79: iload_3
    //   80: iload #7
    //   82: aload_0
    //   83: invokestatic c : (IILjava/lang/String;)I
    //   86: istore #11
    //   88: aload_0
    //   89: iload #7
    //   91: bipush #84
    //   93: invokestatic a : (Ljava/lang/String;IC)Z
    //   96: istore #13
    //   98: iload #13
    //   100: ifne -> 158
    //   103: aload_0
    //   104: invokevirtual length : ()I
    //   107: iload #7
    //   109: if_icmpgt -> 158
    //   112: new java/util/GregorianCalendar
    //   115: astore #14
    //   117: aload #14
    //   119: iload #9
    //   121: iload #10
    //   123: iconst_1
    //   124: isub
    //   125: iload #11
    //   127: invokespecial <init> : (III)V
    //   130: aload #14
    //   132: iconst_0
    //   133: invokevirtual setLenient : (Z)V
    //   136: aload_1
    //   137: iload #7
    //   139: invokevirtual setIndex : (I)V
    //   142: aload #14
    //   144: invokevirtual getTime : ()Ljava/util/Date;
    //   147: areturn
    //   148: astore #14
    //   150: goto -> 969
    //   153: astore #14
    //   155: goto -> 969
    //   158: iload #13
    //   160: ifeq -> 493
    //   163: iload_3
    //   164: iconst_5
    //   165: iadd
    //   166: istore #5
    //   168: iload_3
    //   169: iconst_3
    //   170: iadd
    //   171: iload #5
    //   173: aload_0
    //   174: invokestatic c : (IILjava/lang/String;)I
    //   177: istore #6
    //   179: iload #5
    //   181: istore #4
    //   183: aload_0
    //   184: iload #5
    //   186: bipush #58
    //   188: invokestatic a : (Ljava/lang/String;IC)Z
    //   191: ifeq -> 200
    //   194: iload_3
    //   195: bipush #6
    //   197: iadd
    //   198: istore #4
    //   200: iload #4
    //   202: iconst_2
    //   203: iadd
    //   204: istore #7
    //   206: iload #4
    //   208: iload #7
    //   210: aload_0
    //   211: invokestatic c : (IILjava/lang/String;)I
    //   214: istore #5
    //   216: iload #7
    //   218: istore_3
    //   219: aload_0
    //   220: iload #7
    //   222: bipush #58
    //   224: invokestatic a : (Ljava/lang/String;IC)Z
    //   227: ifeq -> 235
    //   230: iload #4
    //   232: iconst_3
    //   233: iadd
    //   234: istore_3
    //   235: aload_0
    //   236: invokevirtual length : ()I
    //   239: iload_3
    //   240: if_icmple -> 470
    //   243: aload_0
    //   244: iload_3
    //   245: invokevirtual charAt : (I)C
    //   248: istore #4
    //   250: iload #4
    //   252: bipush #90
    //   254: if_icmpeq -> 470
    //   257: iload #4
    //   259: bipush #43
    //   261: if_icmpeq -> 470
    //   264: iload #4
    //   266: bipush #45
    //   268: if_icmpeq -> 470
    //   271: iload_3
    //   272: iconst_2
    //   273: iadd
    //   274: istore #7
    //   276: iload_3
    //   277: iload #7
    //   279: aload_0
    //   280: invokestatic c : (IILjava/lang/String;)I
    //   283: istore #8
    //   285: iload #8
    //   287: istore #4
    //   289: iload #8
    //   291: bipush #59
    //   293: if_icmple -> 311
    //   296: iload #8
    //   298: istore #4
    //   300: iload #8
    //   302: bipush #63
    //   304: if_icmpge -> 311
    //   307: bipush #59
    //   309: istore #4
    //   311: aload_0
    //   312: iload #7
    //   314: bipush #46
    //   316: invokestatic a : (Ljava/lang/String;IC)Z
    //   319: ifeq -> 451
    //   322: iload_3
    //   323: iconst_3
    //   324: iadd
    //   325: istore #8
    //   327: iload_3
    //   328: iconst_4
    //   329: iadd
    //   330: istore #7
    //   332: iload #7
    //   334: aload_0
    //   335: invokevirtual length : ()I
    //   338: if_icmpge -> 375
    //   341: aload_0
    //   342: iload #7
    //   344: invokevirtual charAt : (I)C
    //   347: istore #12
    //   349: iload #12
    //   351: bipush #48
    //   353: if_icmplt -> 372
    //   356: iload #12
    //   358: bipush #57
    //   360: if_icmple -> 366
    //   363: goto -> 372
    //   366: iinc #7, 1
    //   369: goto -> 332
    //   372: goto -> 381
    //   375: aload_0
    //   376: invokevirtual length : ()I
    //   379: istore #7
    //   381: iload #7
    //   383: iload_3
    //   384: bipush #6
    //   386: iadd
    //   387: invokestatic min : (II)I
    //   390: istore #12
    //   392: iload #8
    //   394: iload #12
    //   396: aload_0
    //   397: invokestatic c : (IILjava/lang/String;)I
    //   400: istore_3
    //   401: iload #12
    //   403: iload #8
    //   405: isub
    //   406: istore #8
    //   408: iload #8
    //   410: iconst_1
    //   411: if_icmpeq -> 431
    //   414: iload #8
    //   416: iconst_2
    //   417: if_icmpeq -> 423
    //   420: goto -> 436
    //   423: iload_3
    //   424: bipush #10
    //   426: imul
    //   427: istore_3
    //   428: goto -> 436
    //   431: iload_3
    //   432: bipush #100
    //   434: imul
    //   435: istore_3
    //   436: iload #5
    //   438: istore #8
    //   440: iload #6
    //   442: istore #5
    //   444: iload #8
    //   446: istore #6
    //   448: goto -> 502
    //   451: iload #5
    //   453: istore_3
    //   454: iconst_0
    //   455: istore #8
    //   457: iload #6
    //   459: istore #5
    //   461: iload_3
    //   462: istore #6
    //   464: iload #8
    //   466: istore_3
    //   467: goto -> 502
    //   470: iload #6
    //   472: istore #4
    //   474: iload #5
    //   476: istore #6
    //   478: iload_3
    //   479: istore #7
    //   481: iload #4
    //   483: istore #5
    //   485: iconst_0
    //   486: istore_3
    //   487: iconst_0
    //   488: istore #4
    //   490: goto -> 502
    //   493: iconst_0
    //   494: istore #5
    //   496: iconst_0
    //   497: istore #6
    //   499: goto -> 485
    //   502: aload_0
    //   503: invokevirtual length : ()I
    //   506: iload #7
    //   508: if_icmple -> 954
    //   511: aload_0
    //   512: iload #7
    //   514: invokevirtual charAt : (I)C
    //   517: istore_2
    //   518: getstatic wg0.a : Ljava/util/TimeZone;
    //   521: astore #16
    //   523: iload_2
    //   524: bipush #90
    //   526: if_icmpne -> 539
    //   529: iinc #7, 1
    //   532: aload #16
    //   534: astore #14
    //   536: goto -> 863
    //   539: iload_2
    //   540: bipush #43
    //   542: if_icmpeq -> 605
    //   545: iload_2
    //   546: bipush #45
    //   548: if_icmpne -> 554
    //   551: goto -> 605
    //   554: new java/lang/IndexOutOfBoundsException
    //   557: astore #15
    //   559: new java/lang/StringBuilder
    //   562: astore #14
    //   564: aload #14
    //   566: invokespecial <init> : ()V
    //   569: aload #14
    //   571: ldc 'Invalid time zone indicator ''
    //   573: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   576: pop
    //   577: aload #14
    //   579: iload_2
    //   580: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   583: pop
    //   584: aload #14
    //   586: ldc '''
    //   588: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   591: pop
    //   592: aload #15
    //   594: aload #14
    //   596: invokevirtual toString : ()Ljava/lang/String;
    //   599: invokespecial <init> : (Ljava/lang/String;)V
    //   602: aload #15
    //   604: athrow
    //   605: aload_0
    //   606: iload #7
    //   608: invokevirtual substring : (I)Ljava/lang/String;
    //   611: astore #15
    //   613: aload #15
    //   615: invokevirtual length : ()I
    //   618: iconst_5
    //   619: if_icmplt -> 625
    //   622: goto -> 658
    //   625: new java/lang/StringBuilder
    //   628: astore #14
    //   630: aload #14
    //   632: invokespecial <init> : ()V
    //   635: aload #14
    //   637: aload #15
    //   639: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   642: pop
    //   643: aload #14
    //   645: ldc '00'
    //   647: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   650: pop
    //   651: aload #14
    //   653: invokevirtual toString : ()Ljava/lang/String;
    //   656: astore #15
    //   658: iload #7
    //   660: aload #15
    //   662: invokevirtual length : ()I
    //   665: iadd
    //   666: istore #8
    //   668: iload #8
    //   670: istore #7
    //   672: aload #16
    //   674: astore #14
    //   676: aload #15
    //   678: ldc '+0000'
    //   680: invokevirtual equals : (Ljava/lang/Object;)Z
    //   683: ifne -> 863
    //   686: aload #15
    //   688: ldc '+00:00'
    //   690: invokevirtual equals : (Ljava/lang/Object;)Z
    //   693: ifeq -> 707
    //   696: iload #8
    //   698: istore #7
    //   700: aload #16
    //   702: astore #14
    //   704: goto -> 863
    //   707: new java/lang/StringBuilder
    //   710: astore #14
    //   712: aload #14
    //   714: invokespecial <init> : ()V
    //   717: aload #14
    //   719: ldc 'GMT'
    //   721: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   724: pop
    //   725: aload #14
    //   727: aload #15
    //   729: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   732: pop
    //   733: aload #14
    //   735: invokevirtual toString : ()Ljava/lang/String;
    //   738: astore #16
    //   740: aload #16
    //   742: invokestatic getTimeZone : (Ljava/lang/String;)Ljava/util/TimeZone;
    //   745: astore #15
    //   747: aload #15
    //   749: invokevirtual getID : ()Ljava/lang/String;
    //   752: astore #17
    //   754: iload #8
    //   756: istore #7
    //   758: aload #15
    //   760: astore #14
    //   762: aload #17
    //   764: aload #16
    //   766: invokevirtual equals : (Ljava/lang/Object;)Z
    //   769: ifne -> 863
    //   772: aload #17
    //   774: ldc ':'
    //   776: ldc ''
    //   778: invokevirtual replace : (Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
    //   781: aload #16
    //   783: invokevirtual equals : (Ljava/lang/Object;)Z
    //   786: ifeq -> 800
    //   789: iload #8
    //   791: istore #7
    //   793: aload #15
    //   795: astore #14
    //   797: goto -> 863
    //   800: new java/lang/IndexOutOfBoundsException
    //   803: astore #17
    //   805: new java/lang/StringBuilder
    //   808: astore #14
    //   810: aload #14
    //   812: invokespecial <init> : ()V
    //   815: aload #14
    //   817: ldc 'Mismatching time zone indicator: '
    //   819: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   822: pop
    //   823: aload #14
    //   825: aload #16
    //   827: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   830: pop
    //   831: aload #14
    //   833: ldc ' given, resolves to '
    //   835: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   838: pop
    //   839: aload #14
    //   841: aload #15
    //   843: invokevirtual getID : ()Ljava/lang/String;
    //   846: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   849: pop
    //   850: aload #17
    //   852: aload #14
    //   854: invokevirtual toString : ()Ljava/lang/String;
    //   857: invokespecial <init> : (Ljava/lang/String;)V
    //   860: aload #17
    //   862: athrow
    //   863: new java/util/GregorianCalendar
    //   866: astore #15
    //   868: aload #15
    //   870: aload #14
    //   872: invokespecial <init> : (Ljava/util/TimeZone;)V
    //   875: aload #15
    //   877: iconst_0
    //   878: invokevirtual setLenient : (Z)V
    //   881: aload #15
    //   883: iconst_1
    //   884: iload #9
    //   886: invokevirtual set : (II)V
    //   889: aload #15
    //   891: iconst_2
    //   892: iload #10
    //   894: iconst_1
    //   895: isub
    //   896: invokevirtual set : (II)V
    //   899: aload #15
    //   901: iconst_5
    //   902: iload #11
    //   904: invokevirtual set : (II)V
    //   907: aload #15
    //   909: bipush #11
    //   911: iload #5
    //   913: invokevirtual set : (II)V
    //   916: aload #15
    //   918: bipush #12
    //   920: iload #6
    //   922: invokevirtual set : (II)V
    //   925: aload #15
    //   927: bipush #13
    //   929: iload #4
    //   931: invokevirtual set : (II)V
    //   934: aload #15
    //   936: bipush #14
    //   938: iload_3
    //   939: invokevirtual set : (II)V
    //   942: aload_1
    //   943: iload #7
    //   945: invokevirtual setIndex : (I)V
    //   948: aload #15
    //   950: invokevirtual getTime : ()Ljava/util/Date;
    //   953: areturn
    //   954: new java/lang/IllegalArgumentException
    //   957: astore #14
    //   959: aload #14
    //   961: ldc 'No time zone indicator'
    //   963: invokespecial <init> : (Ljava/lang/String;)V
    //   966: aload #14
    //   968: athrow
    //   969: aload_0
    //   970: ifnonnull -> 978
    //   973: aconst_null
    //   974: astore_0
    //   975: goto -> 1010
    //   978: new java/lang/StringBuilder
    //   981: dup
    //   982: ldc '"'
    //   984: invokespecial <init> : (Ljava/lang/String;)V
    //   987: astore #15
    //   989: aload #15
    //   991: aload_0
    //   992: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   995: pop
    //   996: aload #15
    //   998: bipush #34
    //   1000: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1003: pop
    //   1004: aload #15
    //   1006: invokevirtual toString : ()Ljava/lang/String;
    //   1009: astore_0
    //   1010: aload #14
    //   1012: invokevirtual getMessage : ()Ljava/lang/String;
    //   1015: astore #16
    //   1017: aload #16
    //   1019: ifnull -> 1034
    //   1022: aload #16
    //   1024: astore #15
    //   1026: aload #16
    //   1028: invokevirtual isEmpty : ()Z
    //   1031: ifeq -> 1075
    //   1034: new java/lang/StringBuilder
    //   1037: dup
    //   1038: ldc '('
    //   1040: invokespecial <init> : (Ljava/lang/String;)V
    //   1043: astore #15
    //   1045: aload #15
    //   1047: aload #14
    //   1049: invokevirtual getClass : ()Ljava/lang/Class;
    //   1052: invokevirtual getName : ()Ljava/lang/String;
    //   1055: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1058: pop
    //   1059: aload #15
    //   1061: getstatic org/jaudiotagger/audio/dff/vR/CKYHNesT.KrAJepLBEGZV : Ljava/lang/String;
    //   1064: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1067: pop
    //   1068: aload #15
    //   1070: invokevirtual toString : ()Ljava/lang/String;
    //   1073: astore #15
    //   1075: new java/lang/StringBuilder
    //   1078: dup
    //   1079: ldc 'Failed to parse date ['
    //   1081: invokespecial <init> : (Ljava/lang/String;)V
    //   1084: astore #16
    //   1086: aload #16
    //   1088: aload_0
    //   1089: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1092: pop
    //   1093: aload #16
    //   1095: ldc ']: '
    //   1097: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1100: pop
    //   1101: aload #16
    //   1103: aload #15
    //   1105: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1108: pop
    //   1109: new java/text/ParseException
    //   1112: dup
    //   1113: aload #16
    //   1115: invokevirtual toString : ()Ljava/lang/String;
    //   1118: aload_1
    //   1119: invokevirtual getIndex : ()I
    //   1122: invokespecial <init> : (Ljava/lang/String;I)V
    //   1125: astore_0
    //   1126: aload_0
    //   1127: aload #14
    //   1129: invokevirtual initCause : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1132: pop
    //   1133: aload_0
    //   1134: athrow
    // Exception table:
    //   from	to	target	type
    //   0	6	153	java/lang/IndexOutOfBoundsException
    //   0	6	148	java/lang/IllegalArgumentException
    //   11	20	153	java/lang/IndexOutOfBoundsException
    //   11	20	148	java/lang/IllegalArgumentException
    //   23	33	153	java/lang/IndexOutOfBoundsException
    //   23	33	148	java/lang/IllegalArgumentException
    //   45	55	153	java/lang/IndexOutOfBoundsException
    //   45	55	148	java/lang/IllegalArgumentException
    //   58	69	153	java/lang/IndexOutOfBoundsException
    //   58	69	148	java/lang/IllegalArgumentException
    //   79	98	153	java/lang/IndexOutOfBoundsException
    //   79	98	148	java/lang/IllegalArgumentException
    //   103	148	153	java/lang/IndexOutOfBoundsException
    //   103	148	148	java/lang/IllegalArgumentException
    //   168	179	153	java/lang/IndexOutOfBoundsException
    //   168	179	148	java/lang/IllegalArgumentException
    //   183	194	153	java/lang/IndexOutOfBoundsException
    //   183	194	148	java/lang/IllegalArgumentException
    //   206	216	153	java/lang/IndexOutOfBoundsException
    //   206	216	148	java/lang/IllegalArgumentException
    //   219	230	153	java/lang/IndexOutOfBoundsException
    //   219	230	148	java/lang/IllegalArgumentException
    //   235	250	153	java/lang/IndexOutOfBoundsException
    //   235	250	148	java/lang/IllegalArgumentException
    //   276	285	153	java/lang/IndexOutOfBoundsException
    //   276	285	148	java/lang/IllegalArgumentException
    //   311	322	153	java/lang/IndexOutOfBoundsException
    //   311	322	148	java/lang/IllegalArgumentException
    //   332	349	153	java/lang/IndexOutOfBoundsException
    //   332	349	148	java/lang/IllegalArgumentException
    //   375	381	153	java/lang/IndexOutOfBoundsException
    //   375	381	148	java/lang/IllegalArgumentException
    //   381	401	153	java/lang/IndexOutOfBoundsException
    //   381	401	148	java/lang/IllegalArgumentException
    //   502	518	153	java/lang/IndexOutOfBoundsException
    //   502	518	148	java/lang/IllegalArgumentException
    //   554	605	153	java/lang/IndexOutOfBoundsException
    //   554	605	148	java/lang/IllegalArgumentException
    //   605	622	153	java/lang/IndexOutOfBoundsException
    //   605	622	148	java/lang/IllegalArgumentException
    //   625	658	153	java/lang/IndexOutOfBoundsException
    //   625	658	148	java/lang/IllegalArgumentException
    //   658	668	153	java/lang/IndexOutOfBoundsException
    //   658	668	148	java/lang/IllegalArgumentException
    //   676	696	153	java/lang/IndexOutOfBoundsException
    //   676	696	148	java/lang/IllegalArgumentException
    //   707	754	153	java/lang/IndexOutOfBoundsException
    //   707	754	148	java/lang/IllegalArgumentException
    //   762	789	153	java/lang/IndexOutOfBoundsException
    //   762	789	148	java/lang/IllegalArgumentException
    //   800	863	153	java/lang/IndexOutOfBoundsException
    //   800	863	148	java/lang/IllegalArgumentException
    //   863	954	153	java/lang/IndexOutOfBoundsException
    //   863	954	148	java/lang/IllegalArgumentException
    //   954	969	153	java/lang/IndexOutOfBoundsException
    //   954	969	148	java/lang/IllegalArgumentException
  }
  
  public static int c(int paramInt1, int paramInt2, String paramString) {
    if (paramInt1 >= 0 && paramInt2 <= paramString.length() && paramInt1 <= paramInt2) {
      int i;
      int j;
      if (paramInt1 < paramInt2) {
        i = paramInt1 + 1;
        j = Character.digit(paramString.charAt(paramInt1), 10);
        if (j >= 0) {
          j = -j;
        } else {
          throw new NumberFormatException("Invalid number: ".concat(paramString.substring(paramInt1, paramInt2)));
        } 
      } else {
        j = 0;
        i = paramInt1;
      } 
      while (i < paramInt2) {
        int k = Character.digit(paramString.charAt(i), 10);
        if (k >= 0) {
          j = j * 10 - k;
          i++;
          continue;
        } 
        throw new NumberFormatException("Invalid number: ".concat(paramString.substring(paramInt1, paramInt2)));
      } 
      return -j;
    } 
    throw new NumberFormatException(paramString);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\wg0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
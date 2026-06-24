import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.text.PositionedGlyphs;
import android.graphics.text.TextRunShaper;
import android.os.Build;
import android.os.Trace;
import android.util.Log;
import java.lang.reflect.Method;

public abstract class sz1 {
  public static final qz1 a;
  
  public static final vp0 b = new vp0(16);
  
  public static Paint c = null;
  
  static {
    Trace.endSection();
  }
  
  public static Typeface a(Context paramContext, da0 paramda0, Resources paramResources, int paramInt1, String paramString, int paramInt2, int paramInt3, n21 paramn21, boolean paramBoolean) {
    // Byte code:
    //   0: aload_1
    //   1: instanceof ga0
    //   4: ifeq -> 1117
    //   7: aload_1
    //   8: checkcast ga0
    //   11: astore #16
    //   13: aload #16
    //   15: getfield d : Ljava/lang/String;
    //   18: astore_1
    //   19: aload_1
    //   20: invokestatic isEmpty : (Ljava/lang/CharSequence;)Z
    //   23: istore #11
    //   25: aconst_null
    //   26: astore #15
    //   28: iload #11
    //   30: ifne -> 45
    //   33: aload_1
    //   34: invokestatic c : (Ljava/lang/String;)Landroid/graphics/Typeface;
    //   37: astore_1
    //   38: aload_1
    //   39: ifnull -> 45
    //   42: goto -> 382
    //   45: aload #16
    //   47: getfield a : Ljava/util/ArrayList;
    //   50: astore #17
    //   52: aload #17
    //   54: invokevirtual size : ()I
    //   57: iconst_1
    //   58: if_icmpne -> 80
    //   61: aload #17
    //   63: iconst_0
    //   64: invokevirtual get : (I)Ljava/lang/Object;
    //   67: checkcast y90
    //   70: getfield e : Ljava/lang/String;
    //   73: invokestatic c : (Ljava/lang/String;)Landroid/graphics/Typeface;
    //   76: astore_1
    //   77: goto -> 382
    //   80: getstatic android/os/Build$VERSION.SDK_INT : I
    //   83: bipush #31
    //   85: if_icmpge -> 93
    //   88: aconst_null
    //   89: astore_1
    //   90: goto -> 382
    //   93: iconst_0
    //   94: istore #9
    //   96: iload #9
    //   98: aload #17
    //   100: invokevirtual size : ()I
    //   103: if_icmpge -> 134
    //   106: aload #17
    //   108: iload #9
    //   110: invokevirtual get : (I)Ljava/lang/Object;
    //   113: checkcast y90
    //   116: getfield e : Ljava/lang/String;
    //   119: invokestatic c : (Ljava/lang/String;)Landroid/graphics/Typeface;
    //   122: ifnonnull -> 128
    //   125: goto -> 88
    //   128: iinc #9, 1
    //   131: goto -> 96
    //   134: aconst_null
    //   135: astore_1
    //   136: iconst_0
    //   137: istore #9
    //   139: iload #9
    //   141: aload #17
    //   143: invokevirtual size : ()I
    //   146: if_icmpge -> 377
    //   149: aload #17
    //   151: iload #9
    //   153: invokevirtual get : (I)Ljava/lang/Object;
    //   156: checkcast y90
    //   159: astore #19
    //   161: iload #9
    //   163: aload #17
    //   165: invokevirtual size : ()I
    //   168: iconst_1
    //   169: isub
    //   170: if_icmpne -> 197
    //   173: aload #19
    //   175: getfield f : Ljava/lang/String;
    //   178: invokestatic isEmpty : (Ljava/lang/CharSequence;)Z
    //   181: ifeq -> 197
    //   184: aload_1
    //   185: aload #19
    //   187: getfield e : Ljava/lang/String;
    //   190: invokevirtual setSystemFallback : (Ljava/lang/String;)Landroid/graphics/Typeface$CustomFallbackBuilder;
    //   193: pop
    //   194: goto -> 377
    //   197: aload #19
    //   199: getfield e : Ljava/lang/String;
    //   202: astore #18
    //   204: aload #19
    //   206: getfield f : Ljava/lang/String;
    //   209: astore #14
    //   211: aload #18
    //   213: invokestatic c : (Ljava/lang/String;)Landroid/graphics/Typeface;
    //   216: invokestatic d : (Landroid/graphics/Typeface;)Landroid/graphics/fonts/Font;
    //   219: astore #18
    //   221: aload #18
    //   223: ifnonnull -> 266
    //   226: new java/lang/StringBuilder
    //   229: dup
    //   230: ldc 'Unable identify the primary font for '
    //   232: invokespecial <init> : (Ljava/lang/String;)V
    //   235: astore_1
    //   236: aload_1
    //   237: aload #19
    //   239: getfield e : Ljava/lang/String;
    //   242: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   245: pop
    //   246: aload_1
    //   247: ldc '. Falling back to provider font.'
    //   249: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   252: pop
    //   253: ldc 'TypefaceCompat'
    //   255: aload_1
    //   256: invokevirtual toString : ()Ljava/lang/String;
    //   259: invokestatic w : (Ljava/lang/String;Ljava/lang/String;)I
    //   262: pop
    //   263: goto -> 88
    //   266: aload #14
    //   268: invokestatic isEmpty : (Ljava/lang/CharSequence;)Z
    //   271: ifne -> 333
    //   274: new android/graphics/fonts/FontFamily$Builder
    //   277: astore #19
    //   279: new android/graphics/fonts/Font$Builder
    //   282: astore #19
    //   284: aload #18
    //   286: invokestatic a : (Landroid/graphics/fonts/Font;)Landroid/graphics/fonts/Font$Builder;
    //   289: aload #14
    //   291: invokevirtual setFontVariationSettings : (Ljava/lang/String;)Landroid/graphics/fonts/Font$Builder;
    //   294: invokevirtual build : ()Landroid/graphics/fonts/Font;
    //   297: astore #18
    //   299: new android/graphics/fonts/FontFamily$Builder
    //   302: astore #14
    //   304: aload #14
    //   306: aload #18
    //   308: invokespecial <init> : (Landroid/graphics/fonts/Font;)V
    //   311: aload #14
    //   313: invokevirtual build : ()Landroid/graphics/fonts/FontFamily;
    //   316: astore #14
    //   318: goto -> 347
    //   321: astore_1
    //   322: ldc 'TypefaceCompat'
    //   324: ldc 'Failed to clone Font instance. Fall back to provider font.'
    //   326: invokestatic e : (Ljava/lang/String;Ljava/lang/String;)I
    //   329: pop
    //   330: goto -> 88
    //   333: new android/graphics/fonts/FontFamily$Builder
    //   336: dup
    //   337: aload #18
    //   339: invokespecial <init> : (Landroid/graphics/fonts/Font;)V
    //   342: invokevirtual build : ()Landroid/graphics/fonts/FontFamily;
    //   345: astore #14
    //   347: aload_1
    //   348: ifnonnull -> 364
    //   351: new android/graphics/Typeface$CustomFallbackBuilder
    //   354: dup
    //   355: aload #14
    //   357: invokespecial <init> : (Landroid/graphics/fonts/FontFamily;)V
    //   360: astore_1
    //   361: goto -> 371
    //   364: aload_1
    //   365: aload #14
    //   367: invokevirtual addCustomFallback : (Landroid/graphics/fonts/FontFamily;)Landroid/graphics/Typeface$CustomFallbackBuilder;
    //   370: pop
    //   371: iinc #9, 1
    //   374: goto -> 139
    //   377: aload_1
    //   378: invokevirtual build : ()Landroid/graphics/Typeface;
    //   381: astore_1
    //   382: aload_1
    //   383: ifnull -> 438
    //   386: aload #7
    //   388: ifnull -> 417
    //   391: new android/os/Handler
    //   394: dup
    //   395: invokestatic getMainLooper : ()Landroid/os/Looper;
    //   398: invokespecial <init> : (Landroid/os/Looper;)V
    //   401: new e6
    //   404: dup
    //   405: bipush #18
    //   407: aload #7
    //   409: aload_1
    //   410: invokespecial <init> : (ILjava/lang/Object;Ljava/lang/Object;)V
    //   413: invokevirtual post : (Ljava/lang/Runnable;)Z
    //   416: pop
    //   417: getstatic sz1.b : Lvp0;
    //   420: aload_2
    //   421: iload_3
    //   422: aload #4
    //   424: iload #5
    //   426: iload #6
    //   428: invokestatic b : (Landroid/content/res/Resources;ILjava/lang/String;II)Ljava/lang/String;
    //   431: aload_1
    //   432: invokevirtual j : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   435: pop
    //   436: aload_1
    //   437: areturn
    //   438: iload #8
    //   440: ifeq -> 463
    //   443: aload #16
    //   445: getfield c : I
    //   448: ifne -> 457
    //   451: iconst_1
    //   452: istore #9
    //   454: goto -> 471
    //   457: iconst_0
    //   458: istore #9
    //   460: goto -> 471
    //   463: aload #7
    //   465: ifnonnull -> 457
    //   468: goto -> 451
    //   471: iload #8
    //   473: ifeq -> 486
    //   476: aload #16
    //   478: getfield b : I
    //   481: istore #10
    //   483: goto -> 489
    //   486: iconst_m1
    //   487: istore #10
    //   489: new android/os/Handler
    //   492: dup
    //   493: invokestatic getMainLooper : ()Landroid/os/Looper;
    //   496: invokespecial <init> : (Landroid/os/Looper;)V
    //   499: astore_1
    //   500: new bh0
    //   503: dup
    //   504: bipush #29
    //   506: iconst_0
    //   507: invokespecial <init> : (IB)V
    //   510: astore #14
    //   512: aload #14
    //   514: aload #7
    //   516: putfield c : Ljava/lang/Object;
    //   519: aload #16
    //   521: getfield a : Ljava/util/ArrayList;
    //   524: astore #17
    //   526: new a60
    //   529: dup
    //   530: aload_1
    //   531: iconst_1
    //   532: invokespecial <init> : (Landroid/os/Handler;I)V
    //   535: astore #18
    //   537: new g7
    //   540: dup
    //   541: bipush #12
    //   543: aload #14
    //   545: aload #18
    //   547: invokespecial <init> : (ILjava/lang/Object;Ljava/lang/Object;)V
    //   550: astore #7
    //   552: iload #9
    //   554: ifeq -> 874
    //   557: aload #17
    //   559: invokevirtual size : ()I
    //   562: iconst_1
    //   563: if_icmpgt -> 866
    //   566: aload #17
    //   568: iconst_0
    //   569: invokevirtual get : (I)Ljava/lang/Object;
    //   572: checkcast y90
    //   575: astore #16
    //   577: getstatic ca0.a : Lvp0;
    //   580: astore_1
    //   581: new java/util/ArrayList
    //   584: dup
    //   585: iconst_1
    //   586: invokespecial <init> : (I)V
    //   589: astore_1
    //   590: iconst_1
    //   591: anewarray java/lang/Object
    //   594: dup
    //   595: iconst_0
    //   596: aload #16
    //   598: aastore
    //   599: iconst_0
    //   600: aaload
    //   601: astore #17
    //   603: aload #17
    //   605: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   608: pop
    //   609: aload_1
    //   610: aload #17
    //   612: invokevirtual add : (Ljava/lang/Object;)Z
    //   615: pop
    //   616: iload #6
    //   618: aload_1
    //   619: invokestatic unmodifiableList : (Ljava/util/List;)Ljava/util/List;
    //   622: invokestatic a : (ILjava/util/List;)Ljava/lang/String;
    //   625: astore #17
    //   627: getstatic ca0.a : Lvp0;
    //   630: aload #17
    //   632: invokevirtual f : (Ljava/lang/Object;)Ljava/lang/Object;
    //   635: checkcast android/graphics/Typeface
    //   638: astore_1
    //   639: aload_1
    //   640: ifnull -> 665
    //   643: aload #18
    //   645: new vi2
    //   648: dup
    //   649: bipush #6
    //   651: aload #14
    //   653: aload_1
    //   654: invokespecial <init> : (ILjava/lang/Object;Ljava/lang/Object;)V
    //   657: invokevirtual execute : (Ljava/lang/Runnable;)V
    //   660: aload_1
    //   661: astore_0
    //   662: goto -> 1110
    //   665: iload #10
    //   667: iconst_m1
    //   668: if_icmpne -> 733
    //   671: new java/util/ArrayList
    //   674: dup
    //   675: iconst_1
    //   676: invokespecial <init> : (I)V
    //   679: astore_1
    //   680: iconst_1
    //   681: anewarray java/lang/Object
    //   684: dup
    //   685: iconst_0
    //   686: aload #16
    //   688: aastore
    //   689: iconst_0
    //   690: aaload
    //   691: astore #14
    //   693: aload #14
    //   695: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   698: pop
    //   699: aload_1
    //   700: aload #14
    //   702: invokevirtual add : (Ljava/lang/Object;)Z
    //   705: pop
    //   706: aload #17
    //   708: aload_0
    //   709: aload_1
    //   710: invokestatic unmodifiableList : (Ljava/util/List;)Ljava/util/List;
    //   713: iload #6
    //   715: invokestatic b : (Ljava/lang/String;Landroid/content/Context;Ljava/util/List;I)Lba0;
    //   718: astore_0
    //   719: aload #7
    //   721: aload_0
    //   722: invokevirtual F : (Lba0;)V
    //   725: aload_0
    //   726: getfield a : Landroid/graphics/Typeface;
    //   729: astore_0
    //   730: goto -> 1110
    //   733: new z90
    //   736: dup
    //   737: aload #17
    //   739: aload_0
    //   740: aload #16
    //   742: iload #6
    //   744: iconst_0
    //   745: invokespecial <init> : (Ljava/lang/String;Landroid/content/Context;Ljava/lang/Object;II)V
    //   748: astore_0
    //   749: getstatic ca0.b : Ljava/util/concurrent/ThreadPoolExecutor;
    //   752: aload_0
    //   753: invokeinterface submit : (Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;
    //   758: astore_0
    //   759: iload #10
    //   761: i2l
    //   762: lstore #12
    //   764: aload_0
    //   765: lload #12
    //   767: getstatic java/util/concurrent/TimeUnit.MILLISECONDS : Ljava/util/concurrent/TimeUnit;
    //   770: invokeinterface get : (JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;
    //   775: astore_0
    //   776: aload_0
    //   777: checkcast ba0
    //   780: astore_0
    //   781: aload #7
    //   783: aload_0
    //   784: invokevirtual F : (Lba0;)V
    //   787: aload_0
    //   788: getfield a : Landroid/graphics/Typeface;
    //   791: astore_0
    //   792: goto -> 1110
    //   795: astore_0
    //   796: goto -> 817
    //   799: astore_1
    //   800: goto -> 819
    //   803: astore_0
    //   804: new java/lang/InterruptedException
    //   807: astore_0
    //   808: aload_0
    //   809: ldc_w 'timeout'
    //   812: invokespecial <init> : (Ljava/lang/String;)V
    //   815: aload_0
    //   816: athrow
    //   817: aload_0
    //   818: athrow
    //   819: new java/lang/RuntimeException
    //   822: astore_0
    //   823: aload_0
    //   824: aload_1
    //   825: invokespecial <init> : (Ljava/lang/Throwable;)V
    //   828: aload_0
    //   829: athrow
    //   830: astore_0
    //   831: aload #7
    //   833: getfield e : Ljava/lang/Object;
    //   836: checkcast a60
    //   839: new sd
    //   842: dup
    //   843: bipush #-3
    //   845: iconst_2
    //   846: aload #7
    //   848: getfield c : Ljava/lang/Object;
    //   851: checkcast bh0
    //   854: invokespecial <init> : (IILjava/lang/Object;)V
    //   857: invokevirtual execute : (Ljava/lang/Runnable;)V
    //   860: aload #15
    //   862: astore_0
    //   863: goto -> 1110
    //   866: ldc_w 'Fallbacks with blocking fetches are not supported for performance reasons'
    //   869: invokestatic l : (Ljava/lang/String;)V
    //   872: aconst_null
    //   873: areturn
    //   874: iload #6
    //   876: aload #17
    //   878: invokestatic a : (ILjava/util/List;)Ljava/lang/String;
    //   881: astore #16
    //   883: getstatic ca0.a : Lvp0;
    //   886: aload #16
    //   888: invokevirtual f : (Ljava/lang/Object;)Ljava/lang/Object;
    //   891: checkcast android/graphics/Typeface
    //   894: astore_1
    //   895: aload_1
    //   896: ifnull -> 921
    //   899: aload #18
    //   901: new vi2
    //   904: dup
    //   905: bipush #6
    //   907: aload #14
    //   909: aload_1
    //   910: invokespecial <init> : (ILjava/lang/Object;Ljava/lang/Object;)V
    //   913: invokevirtual execute : (Ljava/lang/Runnable;)V
    //   916: aload_1
    //   917: astore_0
    //   918: goto -> 1110
    //   921: new aa0
    //   924: dup
    //   925: iconst_0
    //   926: aload #7
    //   928: invokespecial <init> : (ILjava/lang/Object;)V
    //   931: astore #7
    //   933: getstatic ca0.c : Ljava/lang/Object;
    //   936: astore_1
    //   937: aload_1
    //   938: monitorenter
    //   939: getstatic ca0.d : Lzm1;
    //   942: astore #14
    //   944: aload #14
    //   946: aload #16
    //   948: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   951: checkcast java/util/ArrayList
    //   954: astore #18
    //   956: aload #18
    //   958: ifnull -> 981
    //   961: aload #18
    //   963: aload #7
    //   965: invokevirtual add : (Ljava/lang/Object;)Z
    //   968: pop
    //   969: aload_1
    //   970: monitorexit
    //   971: aload #15
    //   973: astore_0
    //   974: goto -> 1110
    //   977: astore_0
    //   978: goto -> 1113
    //   981: new java/util/ArrayList
    //   984: astore #18
    //   986: aload #18
    //   988: invokespecial <init> : ()V
    //   991: aload #18
    //   993: aload #7
    //   995: invokevirtual add : (Ljava/lang/Object;)Z
    //   998: pop
    //   999: aload #14
    //   1001: aload #16
    //   1003: aload #18
    //   1005: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   1008: pop
    //   1009: aload_1
    //   1010: monitorexit
    //   1011: new z90
    //   1014: dup
    //   1015: aload #16
    //   1017: aload_0
    //   1018: aload #17
    //   1020: iload #6
    //   1022: iconst_1
    //   1023: invokespecial <init> : (Ljava/lang/String;Landroid/content/Context;Ljava/lang/Object;II)V
    //   1026: astore #7
    //   1028: getstatic ca0.b : Ljava/util/concurrent/ThreadPoolExecutor;
    //   1031: astore_1
    //   1032: new aa0
    //   1035: dup
    //   1036: iconst_1
    //   1037: aload #16
    //   1039: invokespecial <init> : (ILjava/lang/Object;)V
    //   1042: astore #14
    //   1044: invokestatic myLooper : ()Landroid/os/Looper;
    //   1047: ifnonnull -> 1064
    //   1050: new android/os/Handler
    //   1053: dup
    //   1054: invokestatic getMainLooper : ()Landroid/os/Looper;
    //   1057: invokespecial <init> : (Landroid/os/Looper;)V
    //   1060: astore_0
    //   1061: goto -> 1072
    //   1064: new android/os/Handler
    //   1067: dup
    //   1068: invokespecial <init> : ()V
    //   1071: astore_0
    //   1072: new lf0
    //   1075: dup
    //   1076: invokespecial <init> : ()V
    //   1079: astore #16
    //   1081: aload #16
    //   1083: aload #7
    //   1085: putfield c : Ljava/lang/Object;
    //   1088: aload #16
    //   1090: aload #14
    //   1092: putfield e : Ljava/lang/Object;
    //   1095: aload #16
    //   1097: aload_0
    //   1098: putfield f : Ljava/lang/Object;
    //   1101: aload_1
    //   1102: aload #16
    //   1104: invokevirtual execute : (Ljava/lang/Runnable;)V
    //   1107: aload #15
    //   1109: astore_0
    //   1110: goto -> 1183
    //   1113: aload_1
    //   1114: monitorexit
    //   1115: aload_0
    //   1116: athrow
    //   1117: getstatic sz1.a : Lqz1;
    //   1120: aload_0
    //   1121: aload_1
    //   1122: checkcast ea0
    //   1125: aload_2
    //   1126: iload #6
    //   1128: invokevirtual j : (Landroid/content/Context;Lea0;Landroid/content/res/Resources;I)Landroid/graphics/Typeface;
    //   1131: astore_1
    //   1132: aload_1
    //   1133: astore_0
    //   1134: aload #7
    //   1136: ifnull -> 1183
    //   1139: aload_1
    //   1140: ifnull -> 1174
    //   1143: new android/os/Handler
    //   1146: dup
    //   1147: invokestatic getMainLooper : ()Landroid/os/Looper;
    //   1150: invokespecial <init> : (Landroid/os/Looper;)V
    //   1153: new e6
    //   1156: dup
    //   1157: bipush #18
    //   1159: aload #7
    //   1161: aload_1
    //   1162: invokespecial <init> : (ILjava/lang/Object;Ljava/lang/Object;)V
    //   1165: invokevirtual post : (Ljava/lang/Runnable;)Z
    //   1168: pop
    //   1169: aload_1
    //   1170: astore_0
    //   1171: goto -> 1183
    //   1174: aload #7
    //   1176: bipush #-3
    //   1178: invokevirtual f : (I)V
    //   1181: aload_1
    //   1182: astore_0
    //   1183: aload_0
    //   1184: ifnull -> 1206
    //   1187: getstatic sz1.b : Lvp0;
    //   1190: aload_2
    //   1191: iload_3
    //   1192: aload #4
    //   1194: iload #5
    //   1196: iload #6
    //   1198: invokestatic b : (Landroid/content/res/Resources;ILjava/lang/String;II)Ljava/lang/String;
    //   1201: aload_0
    //   1202: invokevirtual j : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   1205: pop
    //   1206: aload_0
    //   1207: areturn
    // Exception table:
    //   from	to	target	type
    //   274	318	321	java/io/IOException
    //   749	759	830	java/lang/InterruptedException
    //   764	776	799	java/util/concurrent/ExecutionException
    //   764	776	795	java/lang/InterruptedException
    //   764	776	803	java/util/concurrent/TimeoutException
    //   776	792	830	java/lang/InterruptedException
    //   804	817	830	java/lang/InterruptedException
    //   817	819	830	java/lang/InterruptedException
    //   819	830	830	java/lang/InterruptedException
    //   939	956	977	finally
    //   961	971	977	finally
    //   981	1011	977	finally
    //   1113	1115	977	finally
  }
  
  public static String b(Resources paramResources, int paramInt1, String paramString, int paramInt2, int paramInt3) {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(paramResources.getResourcePackageName(paramInt1));
    stringBuilder.append('-');
    stringBuilder.append(paramString);
    stringBuilder.append('-');
    stringBuilder.append(paramInt2);
    stringBuilder.append('-');
    stringBuilder.append(paramInt1);
    stringBuilder.append('-');
    stringBuilder.append(paramInt3);
    return stringBuilder.toString();
  }
  
  public static Typeface c(String paramString) {
    if (paramString != null && !paramString.isEmpty()) {
      Typeface typeface2 = Typeface.create(paramString, 0);
      Typeface typeface1 = Typeface.create(Typeface.DEFAULT, 0);
      if (typeface2 != null && !typeface2.equals(typeface1))
        return typeface2; 
    } 
    return null;
  }
  
  public static Font d(Typeface paramTypeface) {
    if (c == null)
      c = new Paint(); 
    c.setTextSize(10.0F);
    c.setTypeface(paramTypeface);
    PositionedGlyphs positionedGlyphs = TextRunShaper.shapeTextRun(" ", 0, 1, 0, 1, 0.0F, 0.0F, false, c);
    return (positionedGlyphs.glyphCount() == 0) ? null : positionedGlyphs.getFont(0);
  }
  
  static {
    Trace.beginSection(ui0.p0("TypefaceCompat static init"));
    int i = Build.VERSION.SDK_INT;
    if (i >= 31) {
      a = new qz1();
    } else if (i >= 29) {
      a = new qz1();
    } else if (i >= 28) {
      a = new vz1();
    } else if (i >= 26) {
      a = new vz1();
    } else {
      Method method = uz1.m;
      if (method == null)
        Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation."); 
      if (method != null) {
        a = new qz1();
      } else {
        a = new qz1();
      } 
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\sz1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
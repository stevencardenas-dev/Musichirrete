import android.os.Looper;
import android.os.Message;

public final class uf2 extends cl {
  public final yc b;
  
  public uf2(yc paramyc, Looper paramLooper) {
    super(paramLooper, 7);
  }
  
  public final void handleMessage(Message paramMessage) {
    // Byte code:
    //   0: aload_0
    //   1: getfield b : Lyc;
    //   4: astore #6
    //   6: aload #6
    //   8: getfield x : Ljava/util/concurrent/atomic/AtomicInteger;
    //   11: invokevirtual get : ()I
    //   14: istore_2
    //   15: aload_1
    //   16: getfield arg1 : I
    //   19: istore #4
    //   21: aload_1
    //   22: getfield what : I
    //   25: istore_3
    //   26: iload_2
    //   27: iload #4
    //   29: if_icmpeq -> 120
    //   32: iload_3
    //   33: iconst_2
    //   34: if_icmpeq -> 52
    //   37: iload_3
    //   38: iconst_1
    //   39: if_icmpeq -> 52
    //   42: iload_3
    //   43: bipush #7
    //   45: if_icmpne -> 51
    //   48: goto -> 52
    //   51: return
    //   52: aload_1
    //   53: getfield obj : Ljava/lang/Object;
    //   56: checkcast ac2
    //   59: astore #5
    //   61: aload #5
    //   63: ifnull -> 956
    //   66: aload #5
    //   68: monitorenter
    //   69: aload #5
    //   71: aconst_null
    //   72: putfield a : Ljava/lang/Boolean;
    //   75: aload #5
    //   77: monitorexit
    //   78: aload #5
    //   80: getfield c : Lyc;
    //   83: astore #6
    //   85: aload #6
    //   87: getfield l : Ljava/util/ArrayList;
    //   90: astore_1
    //   91: aload_1
    //   92: monitorenter
    //   93: aload #6
    //   95: getfield l : Ljava/util/ArrayList;
    //   98: aload #5
    //   100: invokevirtual remove : (Ljava/lang/Object;)Z
    //   103: pop
    //   104: aload_1
    //   105: monitorexit
    //   106: return
    //   107: astore #5
    //   109: aload_1
    //   110: monitorexit
    //   111: aload #5
    //   113: athrow
    //   114: astore_1
    //   115: aload #5
    //   117: monitorexit
    //   118: aload_1
    //   119: athrow
    //   120: iload_3
    //   121: iconst_1
    //   122: if_icmpeq -> 144
    //   125: iload_3
    //   126: bipush #7
    //   128: if_icmpeq -> 144
    //   131: iload_3
    //   132: iconst_4
    //   133: if_icmpne -> 139
    //   136: goto -> 144
    //   139: iload_3
    //   140: iconst_5
    //   141: if_icmpne -> 152
    //   144: aload #6
    //   146: invokevirtual n : ()Z
    //   149: ifeq -> 892
    //   152: aload_1
    //   153: getfield what : I
    //   156: istore_2
    //   157: iload_2
    //   158: iconst_4
    //   159: if_icmpne -> 286
    //   162: aload #6
    //   164: new sp
    //   167: dup
    //   168: aload_1
    //   169: getfield arg2 : I
    //   172: aconst_null
    //   173: aconst_null
    //   174: invokespecial <init> : (ILandroid/app/PendingIntent;Ljava/lang/String;)V
    //   177: putfield u : Lsp;
    //   180: aload #6
    //   182: getfield v : Z
    //   185: ifeq -> 191
    //   188: goto -> 243
    //   191: aload #6
    //   193: invokevirtual j : ()Ljava/lang/String;
    //   196: invokestatic isEmpty : (Ljava/lang/CharSequence;)Z
    //   199: ifeq -> 205
    //   202: goto -> 243
    //   205: aconst_null
    //   206: invokestatic isEmpty : (Ljava/lang/CharSequence;)Z
    //   209: ifeq -> 215
    //   212: goto -> 243
    //   215: aload #6
    //   217: invokevirtual j : ()Ljava/lang/String;
    //   220: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   223: pop
    //   224: aload #6
    //   226: getfield v : Z
    //   229: ifeq -> 235
    //   232: goto -> 243
    //   235: aload #6
    //   237: iconst_3
    //   238: aconst_null
    //   239: invokevirtual t : (ILandroid/os/IInterface;)V
    //   242: return
    //   243: aload #6
    //   245: getfield u : Lsp;
    //   248: astore_1
    //   249: aload_1
    //   250: ifnull -> 256
    //   253: goto -> 268
    //   256: new sp
    //   259: dup
    //   260: bipush #8
    //   262: aconst_null
    //   263: aconst_null
    //   264: invokespecial <init> : (ILandroid/app/PendingIntent;Ljava/lang/String;)V
    //   267: astore_1
    //   268: aload #6
    //   270: getfield j : Lxc;
    //   273: aload_1
    //   274: invokeinterface d : (Lsp;)V
    //   279: aload #6
    //   281: aload_1
    //   282: invokevirtual o : (Lsp;)V
    //   285: return
    //   286: iload_2
    //   287: iconst_5
    //   288: if_icmpne -> 334
    //   291: aload #6
    //   293: getfield u : Lsp;
    //   296: astore_1
    //   297: aload_1
    //   298: ifnull -> 304
    //   301: goto -> 316
    //   304: new sp
    //   307: dup
    //   308: bipush #8
    //   310: aconst_null
    //   311: aconst_null
    //   312: invokespecial <init> : (ILandroid/app/PendingIntent;Ljava/lang/String;)V
    //   315: astore_1
    //   316: aload #6
    //   318: getfield j : Lxc;
    //   321: aload_1
    //   322: invokeinterface d : (Lsp;)V
    //   327: aload #6
    //   329: aload_1
    //   330: invokevirtual o : (Lsp;)V
    //   333: return
    //   334: iload_2
    //   335: iconst_3
    //   336: if_icmpne -> 399
    //   339: aload_1
    //   340: getfield obj : Ljava/lang/Object;
    //   343: astore #5
    //   345: aload #5
    //   347: instanceof android/app/PendingIntent
    //   350: ifeq -> 363
    //   353: aload #5
    //   355: checkcast android/app/PendingIntent
    //   358: astore #5
    //   360: goto -> 366
    //   363: aconst_null
    //   364: astore #5
    //   366: new sp
    //   369: dup
    //   370: aload_1
    //   371: getfield arg2 : I
    //   374: aload #5
    //   376: aconst_null
    //   377: invokespecial <init> : (ILandroid/app/PendingIntent;Ljava/lang/String;)V
    //   380: astore_1
    //   381: aload #6
    //   383: getfield j : Lxc;
    //   386: aload_1
    //   387: invokeinterface d : (Lsp;)V
    //   392: aload #6
    //   394: aload_1
    //   395: invokevirtual o : (Lsp;)V
    //   398: return
    //   399: iload_2
    //   400: bipush #6
    //   402: if_icmpne -> 457
    //   405: aload #6
    //   407: iconst_5
    //   408: aconst_null
    //   409: invokevirtual t : (ILandroid/os/IInterface;)V
    //   412: aload #6
    //   414: getfield o : La42;
    //   417: astore #5
    //   419: aload #5
    //   421: ifnull -> 443
    //   424: aload_1
    //   425: getfield arg2 : I
    //   428: istore_2
    //   429: aload #5
    //   431: getfield c : Ljava/lang/Object;
    //   434: checkcast me0
    //   437: iload_2
    //   438: invokeinterface m : (I)V
    //   443: invokestatic currentTimeMillis : ()J
    //   446: pop2
    //   447: aload #6
    //   449: iconst_5
    //   450: iconst_1
    //   451: aconst_null
    //   452: invokevirtual s : (IILandroid/os/IInterface;)Z
    //   455: pop
    //   456: return
    //   457: iload_2
    //   458: iconst_2
    //   459: if_icmpne -> 541
    //   462: aload #6
    //   464: invokevirtual m : ()Z
    //   467: ifeq -> 473
    //   470: goto -> 541
    //   473: aload_1
    //   474: getfield obj : Ljava/lang/Object;
    //   477: checkcast ac2
    //   480: astore #5
    //   482: aload #5
    //   484: ifnull -> 956
    //   487: aload #5
    //   489: monitorenter
    //   490: aload #5
    //   492: aconst_null
    //   493: putfield a : Ljava/lang/Boolean;
    //   496: aload #5
    //   498: monitorexit
    //   499: aload #5
    //   501: getfield c : Lyc;
    //   504: astore #6
    //   506: aload #6
    //   508: getfield l : Ljava/util/ArrayList;
    //   511: astore_1
    //   512: aload_1
    //   513: monitorenter
    //   514: aload #6
    //   516: getfield l : Ljava/util/ArrayList;
    //   519: aload #5
    //   521: invokevirtual remove : (Ljava/lang/Object;)Z
    //   524: pop
    //   525: aload_1
    //   526: monitorexit
    //   527: return
    //   528: astore #5
    //   530: aload_1
    //   531: monitorexit
    //   532: aload #5
    //   534: athrow
    //   535: astore_1
    //   536: aload #5
    //   538: monitorexit
    //   539: aload_1
    //   540: athrow
    //   541: aload_1
    //   542: getfield what : I
    //   545: istore_2
    //   546: iload_2
    //   547: iconst_2
    //   548: if_icmpeq -> 614
    //   551: iload_2
    //   552: iconst_1
    //   553: if_icmpeq -> 614
    //   556: iload_2
    //   557: bipush #7
    //   559: if_icmpne -> 565
    //   562: goto -> 614
    //   565: new java/lang/StringBuilder
    //   568: dup
    //   569: iload_2
    //   570: invokestatic valueOf : (I)Ljava/lang/String;
    //   573: invokevirtual length : ()I
    //   576: bipush #34
    //   578: iadd
    //   579: invokespecial <init> : (I)V
    //   582: astore_1
    //   583: aload_1
    //   584: ldc 'Don't know how to handle message: '
    //   586: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   589: pop
    //   590: aload_1
    //   591: iload_2
    //   592: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   595: pop
    //   596: ldc 'GmsClient'
    //   598: aload_1
    //   599: invokevirtual toString : ()Ljava/lang/String;
    //   602: new java/lang/Exception
    //   605: dup
    //   606: invokespecial <init> : ()V
    //   609: invokestatic wtf : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   612: pop
    //   613: return
    //   614: aload_1
    //   615: getfield obj : Ljava/lang/Object;
    //   618: checkcast ac2
    //   621: astore #5
    //   623: aload #5
    //   625: monitorenter
    //   626: aload #5
    //   628: getfield a : Ljava/lang/Boolean;
    //   631: astore #7
    //   633: aload #5
    //   635: getfield b : Z
    //   638: ifeq -> 712
    //   641: getstatic r3/IKWi/AyxAR.vaqVdOR : Ljava/lang/String;
    //   644: astore #8
    //   646: aload #5
    //   648: invokevirtual toString : ()Ljava/lang/String;
    //   651: astore_1
    //   652: aload_1
    //   653: invokevirtual length : ()I
    //   656: istore_2
    //   657: new java/lang/StringBuilder
    //   660: astore #6
    //   662: aload #6
    //   664: iload_2
    //   665: bipush #47
    //   667: iadd
    //   668: invokespecial <init> : (I)V
    //   671: aload #6
    //   673: ldc 'Callback proxy '
    //   675: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   678: pop
    //   679: aload #6
    //   681: aload_1
    //   682: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   685: pop
    //   686: aload #6
    //   688: ldc ' being reused. This is not safe.'
    //   690: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   693: pop
    //   694: aload #8
    //   696: aload #6
    //   698: invokevirtual toString : ()Ljava/lang/String;
    //   701: invokestatic w : (Ljava/lang/String;Ljava/lang/String;)I
    //   704: pop
    //   705: goto -> 712
    //   708: astore_1
    //   709: goto -> 887
    //   712: aload #5
    //   714: monitorexit
    //   715: aload #7
    //   717: ifnull -> 815
    //   720: aload #5
    //   722: getfield f : Lyc;
    //   725: astore_1
    //   726: aload #5
    //   728: getfield d : I
    //   731: istore_2
    //   732: iload_2
    //   733: ifne -> 769
    //   736: aload #5
    //   738: invokevirtual a : ()Z
    //   741: ifne -> 815
    //   744: aload_1
    //   745: iconst_1
    //   746: aconst_null
    //   747: invokevirtual t : (ILandroid/os/IInterface;)V
    //   750: aload #5
    //   752: new sp
    //   755: dup
    //   756: bipush #8
    //   758: aconst_null
    //   759: aconst_null
    //   760: invokespecial <init> : (ILandroid/app/PendingIntent;Ljava/lang/String;)V
    //   763: invokevirtual b : (Lsp;)V
    //   766: goto -> 815
    //   769: aload_1
    //   770: iconst_1
    //   771: aconst_null
    //   772: invokevirtual t : (ILandroid/os/IInterface;)V
    //   775: aload #5
    //   777: getfield e : Landroid/os/Bundle;
    //   780: astore_1
    //   781: aload_1
    //   782: ifnull -> 798
    //   785: aload_1
    //   786: ldc 'pendingIntent'
    //   788: invokevirtual getParcelable : (Ljava/lang/String;)Landroid/os/Parcelable;
    //   791: checkcast android/app/PendingIntent
    //   794: astore_1
    //   795: goto -> 800
    //   798: aconst_null
    //   799: astore_1
    //   800: aload #5
    //   802: new sp
    //   805: dup
    //   806: iload_2
    //   807: aload_1
    //   808: aconst_null
    //   809: invokespecial <init> : (ILandroid/app/PendingIntent;Ljava/lang/String;)V
    //   812: invokevirtual b : (Lsp;)V
    //   815: aload #5
    //   817: monitorenter
    //   818: aload #5
    //   820: iconst_1
    //   821: putfield b : Z
    //   824: aload #5
    //   826: monitorexit
    //   827: aload #5
    //   829: monitorenter
    //   830: aload #5
    //   832: aconst_null
    //   833: putfield a : Ljava/lang/Boolean;
    //   836: aload #5
    //   838: monitorexit
    //   839: aload #5
    //   841: getfield c : Lyc;
    //   844: astore #6
    //   846: aload #6
    //   848: getfield l : Ljava/util/ArrayList;
    //   851: astore_1
    //   852: aload_1
    //   853: monitorenter
    //   854: aload #6
    //   856: getfield l : Ljava/util/ArrayList;
    //   859: aload #5
    //   861: invokevirtual remove : (Ljava/lang/Object;)Z
    //   864: pop
    //   865: aload_1
    //   866: monitorexit
    //   867: return
    //   868: astore #5
    //   870: aload_1
    //   871: monitorexit
    //   872: aload #5
    //   874: athrow
    //   875: astore_1
    //   876: aload #5
    //   878: monitorexit
    //   879: aload_1
    //   880: athrow
    //   881: astore_1
    //   882: aload #5
    //   884: monitorexit
    //   885: aload_1
    //   886: athrow
    //   887: aload #5
    //   889: monitorexit
    //   890: aload_1
    //   891: athrow
    //   892: aload_1
    //   893: getfield obj : Ljava/lang/Object;
    //   896: checkcast ac2
    //   899: astore_1
    //   900: aload_1
    //   901: ifnull -> 956
    //   904: aload_1
    //   905: monitorenter
    //   906: aload_1
    //   907: aconst_null
    //   908: putfield a : Ljava/lang/Boolean;
    //   911: aload_1
    //   912: monitorexit
    //   913: aload_1
    //   914: getfield c : Lyc;
    //   917: astore #6
    //   919: aload #6
    //   921: getfield l : Ljava/util/ArrayList;
    //   924: astore #5
    //   926: aload #5
    //   928: monitorenter
    //   929: aload #6
    //   931: getfield l : Ljava/util/ArrayList;
    //   934: aload_1
    //   935: invokevirtual remove : (Ljava/lang/Object;)Z
    //   938: pop
    //   939: aload #5
    //   941: monitorexit
    //   942: return
    //   943: astore_1
    //   944: aload #5
    //   946: monitorexit
    //   947: aload_1
    //   948: athrow
    //   949: astore #5
    //   951: aload_1
    //   952: monitorexit
    //   953: aload #5
    //   955: athrow
    //   956: return
    //   957: astore_1
    //   958: goto -> 243
    // Exception table:
    //   from	to	target	type
    //   69	78	114	finally
    //   93	106	107	finally
    //   109	111	107	finally
    //   115	118	114	finally
    //   215	224	957	java/lang/ClassNotFoundException
    //   490	499	535	finally
    //   514	527	528	finally
    //   530	532	528	finally
    //   536	539	535	finally
    //   626	705	708	finally
    //   712	715	708	finally
    //   818	827	881	finally
    //   830	839	875	finally
    //   854	867	868	finally
    //   870	872	868	finally
    //   876	879	875	finally
    //   882	885	881	finally
    //   887	890	708	finally
    //   906	913	949	finally
    //   929	942	943	finally
    //   944	947	943	finally
    //   951	953	949	finally
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar\\uf2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
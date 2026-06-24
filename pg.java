public final class pg extends ki {
  public final int c;
  
  public final tg e;
  
  public final void run() {
    // Byte code:
    //   0: aload_0
    //   1: getfield c : I
    //   4: istore_1
    //   5: aload_0
    //   6: getfield e : Ltg;
    //   9: astore #5
    //   11: iload_1
    //   12: tableswitch default -> 32, 0 -> 146
    //   32: aload #5
    //   34: getfield c : Ljava/util/ArrayList;
    //   37: astore #6
    //   39: getstatic in/krosbits/musicolet/MyApplication.j : Lwn1;
    //   42: getfield e : Lbh0;
    //   45: aload #5
    //   47: getfield f : Lkm0;
    //   50: aload #5
    //   52: getfield l : Lv00;
    //   55: invokevirtual j : ()Landroid/net/Uri;
    //   58: invokevirtual toString : ()Ljava/lang/String;
    //   61: invokevirtual D : (Lkm0;Ljava/lang/String;)V
    //   64: aload #5
    //   66: getfield l : Lv00;
    //   69: invokestatic L : (Lv00;)Ljava/util/ArrayList;
    //   72: astore #4
    //   74: aload #6
    //   76: invokevirtual clear : ()V
    //   79: aload #6
    //   81: aload #4
    //   83: invokevirtual addAll : (Ljava/util/Collection;)Z
    //   86: pop
    //   87: aload #6
    //   89: invokestatic sort : (Ljava/util/List;)V
    //   92: aload #5
    //   94: iconst_1
    //   95: putfield m : Z
    //   98: aload #5
    //   100: iconst_1
    //   101: putfield s : Z
    //   104: aload #5
    //   106: getfield b : Lin/krosbits/musicolet/GhostSearchActivity;
    //   109: getfield N : Landroid/os/Handler;
    //   112: astore #6
    //   114: new gg
    //   117: astore #4
    //   119: aload #4
    //   121: aload #5
    //   123: iconst_1
    //   124: invokespecial <init> : (Ltg;I)V
    //   127: aload #6
    //   129: aload #4
    //   131: invokevirtual post : (Ljava/lang/Runnable;)Z
    //   134: pop
    //   135: goto -> 145
    //   138: astore #4
    //   140: aload #4
    //   142: invokevirtual printStackTrace : ()V
    //   145: return
    //   146: aload #5
    //   148: getfield b : Lin/krosbits/musicolet/GhostSearchActivity;
    //   151: astore #6
    //   153: aload #5
    //   155: getfield f : Lkm0;
    //   158: astore #8
    //   160: aload #5
    //   162: getfield c : Ljava/util/ArrayList;
    //   165: astore #7
    //   167: getstatic in/krosbits/musicolet/MyApplication.j : Lwn1;
    //   170: getfield e : Lbh0;
    //   173: astore #4
    //   175: aload #4
    //   177: invokevirtual getClass : ()Ljava/lang/Class;
    //   180: pop
    //   181: aload #4
    //   183: aload #8
    //   185: getfield b : I
    //   188: invokevirtual w : (I)Ljava/io/File;
    //   191: invokestatic c : (Ljava/io/File;)Lnk0;
    //   194: astore #4
    //   196: aload #4
    //   198: instanceof rk0
    //   201: ifeq -> 241
    //   204: aload #4
    //   206: checkcast rk0
    //   209: ldc 'notes'
    //   211: invokevirtual m : (Ljava/lang/String;)Lnk0;
    //   214: astore #4
    //   216: aload #4
    //   218: instanceof ik0
    //   221: ifeq -> 241
    //   224: aload #4
    //   226: invokevirtual f : ()Lik0;
    //   229: astore #4
    //   231: goto -> 250
    //   234: astore #4
    //   236: aload #4
    //   238: invokevirtual printStackTrace : ()V
    //   241: new ik0
    //   244: dup
    //   245: invokespecial <init> : ()V
    //   248: astore #4
    //   250: aload_0
    //   251: getfield b : Z
    //   254: ifne -> 680
    //   257: aload #4
    //   259: getfield b : Ljava/util/ArrayList;
    //   262: invokevirtual isEmpty : ()Z
    //   265: ifne -> 387
    //   268: aload #4
    //   270: getfield b : Ljava/util/ArrayList;
    //   273: astore #8
    //   275: aload #8
    //   277: invokevirtual size : ()I
    //   280: istore_3
    //   281: iconst_0
    //   282: istore_1
    //   283: iload_1
    //   284: iload_3
    //   285: if_icmpge -> 378
    //   288: aload #8
    //   290: iload_1
    //   291: invokevirtual get : (I)Ljava/lang/Object;
    //   294: astore #4
    //   296: iload_1
    //   297: iconst_1
    //   298: iadd
    //   299: istore_2
    //   300: aload #4
    //   302: checkcast nk0
    //   305: invokevirtual g : ()Lrk0;
    //   308: astore #9
    //   310: new yf
    //   313: astore #4
    //   315: aload #4
    //   317: aload #9
    //   319: ldc 'time'
    //   321: invokevirtual m : (Ljava/lang/String;)Lnk0;
    //   324: invokevirtual h : ()J
    //   327: aload #9
    //   329: ldc 'text'
    //   331: invokevirtual m : (Ljava/lang/String;)Lnk0;
    //   334: invokevirtual i : ()Ljava/lang/String;
    //   337: invokespecial <init> : (JLjava/lang/String;)V
    //   340: goto -> 353
    //   343: astore #4
    //   345: aload #4
    //   347: invokevirtual printStackTrace : ()V
    //   350: aconst_null
    //   351: astore #4
    //   353: iload_2
    //   354: istore_1
    //   355: aload #4
    //   357: ifnull -> 283
    //   360: aload #7
    //   362: aload #4
    //   364: invokevirtual add : (Ljava/lang/Object;)Z
    //   367: pop
    //   368: iload_2
    //   369: istore_1
    //   370: goto -> 283
    //   373: astore #4
    //   375: goto -> 693
    //   378: aload #5
    //   380: iconst_1
    //   381: putfield j : Z
    //   384: goto -> 571
    //   387: getstatic in/krosbits/musicolet/MyApplication.j : Lwn1;
    //   390: getfield e : Lbh0;
    //   393: aload #8
    //   395: invokevirtual t : (Lkm0;)Lv00;
    //   398: astore #4
    //   400: aload #5
    //   402: aload #4
    //   404: putfield l : Lv00;
    //   407: aload #4
    //   409: ifnull -> 426
    //   412: aload #7
    //   414: aload #4
    //   416: invokestatic L : (Lv00;)Ljava/util/ArrayList;
    //   419: invokevirtual addAll : (Ljava/util/Collection;)Z
    //   422: pop
    //   423: goto -> 571
    //   426: aload #8
    //   428: invokevirtual d : ()Lv00;
    //   431: astore #4
    //   433: aload #4
    //   435: ifnull -> 571
    //   438: aload #4
    //   440: invokevirtual i : ()Lu00;
    //   443: astore #4
    //   445: aload #4
    //   447: instanceof lw0
    //   450: ifne -> 571
    //   453: aload #4
    //   455: instanceof v00
    //   458: ifeq -> 571
    //   461: aload #4
    //   463: checkcast v00
    //   466: aload #5
    //   468: invokevirtual t : ()Ljava/lang/String;
    //   471: invokevirtual A : (Ljava/lang/String;)Lv00;
    //   474: astore #4
    //   476: aload #4
    //   478: ifnull -> 571
    //   481: getstatic in/krosbits/musicolet/MyApplication.F : Lyp1;
    //   484: aload #4
    //   486: invokevirtual l : (Lv00;)Lv00;
    //   489: astore #4
    //   491: aload #4
    //   493: invokevirtual l : ()Z
    //   496: ifeq -> 533
    //   499: aload #4
    //   501: invokevirtual b : ()Z
    //   504: ifeq -> 571
    //   507: aload #5
    //   509: aload #4
    //   511: putfield l : Lv00;
    //   514: aload #7
    //   516: aload #4
    //   518: invokestatic L : (Lv00;)Ljava/util/ArrayList;
    //   521: invokevirtual addAll : (Ljava/util/Collection;)Z
    //   524: pop
    //   525: goto -> 571
    //   528: astore #4
    //   530: goto -> 566
    //   533: aload #4
    //   535: invokevirtual p : ()Z
    //   538: ifeq -> 571
    //   541: aload #4
    //   543: invokevirtual b : ()Z
    //   546: ifeq -> 571
    //   549: aload #5
    //   551: aload #4
    //   553: putfield l : Lv00;
    //   556: aload #5
    //   558: aload #4
    //   560: putfield r : Lv00;
    //   563: goto -> 571
    //   566: aload #4
    //   568: invokevirtual printStackTrace : ()V
    //   571: aload_0
    //   572: getfield b : Z
    //   575: ifne -> 667
    //   578: aload #7
    //   580: invokestatic sort : (Ljava/util/List;)V
    //   583: aload #5
    //   585: iconst_1
    //   586: putfield m : Z
    //   589: aload #6
    //   591: getfield N : Landroid/os/Handler;
    //   594: astore #4
    //   596: new gg
    //   599: astore #7
    //   601: aload #7
    //   603: aload #5
    //   605: iconst_1
    //   606: invokespecial <init> : (Ltg;I)V
    //   609: aload #4
    //   611: aload #7
    //   613: invokevirtual post : (Ljava/lang/Runnable;)Z
    //   616: pop
    //   617: aload #5
    //   619: invokevirtual m : ()V
    //   622: aload #5
    //   624: getfield n : Ldy1;
    //   627: ifnull -> 714
    //   630: aload #6
    //   632: getfield N : Landroid/os/Handler;
    //   635: astore #6
    //   637: new gg
    //   640: astore #4
    //   642: aload #4
    //   644: aload #5
    //   646: iconst_3
    //   647: invokespecial <init> : (Ltg;I)V
    //   650: aload #6
    //   652: aload #4
    //   654: invokevirtual post : (Ljava/lang/Runnable;)Z
    //   657: pop
    //   658: aload #5
    //   660: aconst_null
    //   661: putfield n : Ldy1;
    //   664: goto -> 714
    //   667: new java/util/concurrent/CancellationException
    //   670: astore #4
    //   672: aload #4
    //   674: invokespecial <init> : ()V
    //   677: aload #4
    //   679: athrow
    //   680: new java/util/concurrent/CancellationException
    //   683: astore #4
    //   685: aload #4
    //   687: invokespecial <init> : ()V
    //   690: aload #4
    //   692: athrow
    //   693: aload #4
    //   695: instanceof java/util/concurrent/CancellationException
    //   698: ifne -> 706
    //   701: aload #4
    //   703: invokevirtual printStackTrace : ()V
    //   706: aload #5
    //   708: getfield e : Lss0;
    //   711: invokevirtual dismiss : ()V
    //   714: return
    // Exception table:
    //   from	to	target	type
    //   39	135	138	finally
    //   167	181	373	finally
    //   181	231	234	finally
    //   236	241	373	finally
    //   241	250	373	finally
    //   250	281	373	finally
    //   288	296	373	finally
    //   300	310	373	finally
    //   310	340	343	finally
    //   345	350	373	finally
    //   360	368	373	finally
    //   378	384	373	finally
    //   387	407	373	finally
    //   412	423	373	finally
    //   426	433	528	finally
    //   438	476	528	finally
    //   481	525	528	finally
    //   533	563	528	finally
    //   566	571	373	finally
    //   571	664	373	finally
    //   667	680	373	finally
    //   680	693	373	finally
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\pg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
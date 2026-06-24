import in.krosbits.musicolet.EPCsCSVActivity;

public final class u20 extends pr1 implements ad0 {
  public final int g;
  
  public Object h;
  
  public final Object i;
  
  public final Object j;
  
  public u20(ke1 paramke1, EPCsCSVActivity paramEPCsCSVActivity, me1 paramme1, cs paramcs) {
    super(2, paramcs);
  }
  
  public final Object g(Object paramObject1, Object paramObject2) {
    int i = this.g;
    l02 l02 = l02.a;
    paramObject1 = paramObject1;
    paramObject2 = paramObject2;
    switch (i) {
      default:
        ((u20)l((cs)paramObject2, paramObject1)).n(l02);
        return l02;
      case 2:
        ((u20)l((cs)paramObject2, paramObject1)).n(l02);
        return l02;
      case 1:
        ((u20)l((cs)paramObject2, paramObject1)).n(l02);
        return l02;
      case 0:
        break;
    } 
    ((u20)l((cs)paramObject2, paramObject1)).n(l02);
    return l02;
  }
  
  public final cs l(cs paramcs, Object paramObject) {
    int i = this.g;
    Object object1 = this.j;
    Object object2 = this.i;
    switch (i) {
      default:
        paramcs = new u20(object2, object1, paramcs, 3);
        ((u20)paramcs).h = paramObject;
        return paramcs;
      case 2:
        paramcs = new u20(object2, object1, paramcs, 2);
        ((u20)paramcs).h = paramObject;
        return paramcs;
      case 1:
        paramcs = new u20(object2, object1, paramcs, 1);
        ((u20)paramcs).h = paramObject;
        return paramcs;
      case 0:
        break;
    } 
    return new u20((ke1)this.h, (EPCsCSVActivity)object2, (me1)object1, paramcs);
  }
  
  public final Object n(Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: getfield g : I
    //   4: istore_2
    //   5: getstatic l02.a : Ll02;
    //   8: astore #6
    //   10: aload_0
    //   11: getfield i : Ljava/lang/Object;
    //   14: astore #5
    //   16: aload_0
    //   17: getfield j : Ljava/lang/Object;
    //   20: astore #4
    //   22: iload_2
    //   23: tableswitch default -> 48, 0 -> 736, 1 -> 508, 2 -> 467
    //   48: aload #4
    //   50: checkcast by1
    //   53: astore #8
    //   55: aload #8
    //   57: getfield b : Lkm0;
    //   60: astore_3
    //   61: aload #5
    //   63: checkcast vx1
    //   66: astore #7
    //   68: aload_0
    //   69: getfield h : Ljava/lang/Object;
    //   72: checkcast xs
    //   75: astore #9
    //   77: aload_1
    //   78: invokestatic r0 : (Ljava/lang/Object;)V
    //   81: aload_3
    //   82: getfield c : Lqn1;
    //   85: astore_1
    //   86: aload #7
    //   88: aload_1
    //   89: getfield b : Ljava/lang/String;
    //   92: putfield d : Ljava/lang/String;
    //   95: aload #7
    //   97: aload_1
    //   98: getfield e : Ljava/lang/String;
    //   101: putfield e : Ljava/lang/String;
    //   104: aload #7
    //   106: aload_1
    //   107: getfield c : Ljava/lang/String;
    //   110: putfield f : Ljava/lang/String;
    //   113: aload #7
    //   115: aload_3
    //   116: getfield j : Ljava/lang/String;
    //   119: putfield g : Ljava/lang/String;
    //   122: aload #7
    //   124: aload_3
    //   125: getfield f : Ljava/lang/String;
    //   128: putfield h : Ljava/lang/String;
    //   131: aload #7
    //   133: aload_3
    //   134: getfield e : Ljava/lang/String;
    //   137: putfield i : Ljava/lang/String;
    //   140: aload_3
    //   141: getfield q : I
    //   144: istore_2
    //   145: new java/lang/Integer
    //   148: astore_1
    //   149: aload_1
    //   150: iload_2
    //   151: invokespecial <init> : (I)V
    //   154: aload #7
    //   156: aload_1
    //   157: putfield j : Ljava/lang/Integer;
    //   160: aload_3
    //   161: getfield p : I
    //   164: istore_2
    //   165: new java/lang/Integer
    //   168: astore_1
    //   169: aload_1
    //   170: iload_2
    //   171: invokespecial <init> : (I)V
    //   174: aload #7
    //   176: aload_1
    //   177: putfield o : Ljava/lang/Integer;
    //   180: aload_3
    //   181: invokestatic C : (Lkm0;)Lorg/jaudiotagger/tag/Tag;
    //   184: astore_1
    //   185: aload #9
    //   187: invokestatic q : (Lxs;)V
    //   190: aload_1
    //   191: ifnull -> 278
    //   194: aload #7
    //   196: aload_1
    //   197: getstatic org/jaudiotagger/tag/FieldKey.COMMENT : Lorg/jaudiotagger/tag/FieldKey;
    //   200: invokeinterface getFirst : (Lorg/jaudiotagger/tag/FieldKey;)Ljava/lang/String;
    //   205: putfield k : Ljava/lang/String;
    //   208: aload #7
    //   210: aload_1
    //   211: getstatic org/jaudiotagger/tag/FieldKey.LYRICIST : Lorg/jaudiotagger/tag/FieldKey;
    //   214: invokeinterface getFirst : (Lorg/jaudiotagger/tag/FieldKey;)Ljava/lang/String;
    //   219: putfield m : Ljava/lang/String;
    //   222: aload #7
    //   224: aload_1
    //   225: invokestatic A : (Lorg/jaudiotagger/tag/Tag;)Ljava/lang/String;
    //   228: putfield l : Ljava/lang/String;
    //   231: aload_1
    //   232: invokeinterface getFirstArtwork : ()Lorg/jaudiotagger/tag/images/Artwork;
    //   237: astore_1
    //   238: aload_1
    //   239: ifnull -> 265
    //   242: aload_1
    //   243: invokeinterface getBinaryData : ()[B
    //   248: astore_1
    //   249: goto -> 267
    //   252: astore_3
    //   253: aconst_null
    //   254: astore_1
    //   255: goto -> 426
    //   258: astore_1
    //   259: aconst_null
    //   260: astore #4
    //   262: goto -> 447
    //   265: aconst_null
    //   266: astore_1
    //   267: aload #8
    //   269: aload #9
    //   271: aload_1
    //   272: invokestatic g : (Lby1;Lxs;[B)V
    //   275: goto -> 393
    //   278: aload_3
    //   279: invokevirtual d : ()Lv00;
    //   282: astore_1
    //   283: aload_1
    //   284: ifnull -> 295
    //   287: aload_1
    //   288: invokevirtual j : ()Landroid/net/Uri;
    //   291: astore_1
    //   292: goto -> 297
    //   295: aconst_null
    //   296: astore_1
    //   297: aload_1
    //   298: astore_3
    //   299: aload_1
    //   300: invokestatic N : (Landroid/net/Uri;)Z
    //   303: ifeq -> 311
    //   306: aload_1
    //   307: invokestatic M : (Landroid/net/Uri;)Landroid/net/Uri;
    //   310: astore_3
    //   311: aload_3
    //   312: ifnull -> 393
    //   315: new jt1
    //   318: dup
    //   319: getstatic in/krosbits/musicolet/MyApplication.i : Lin/krosbits/musicolet/MyApplication;
    //   322: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   325: aload_3
    //   326: bipush #8
    //   328: invokespecial <init> : (Landroid/content/Context;Landroid/net/Uri;I)V
    //   331: astore #5
    //   333: aload #5
    //   335: astore_3
    //   336: aload #5
    //   338: astore #4
    //   340: aload #5
    //   342: astore_1
    //   343: aload #5
    //   345: getfield c : Z
    //   348: ifeq -> 395
    //   351: aload #5
    //   353: astore_3
    //   354: aload #5
    //   356: astore #4
    //   358: aload #8
    //   360: aload #9
    //   362: aload #5
    //   364: getfield b : Lin/krosbits/nativex/FDTS;
    //   367: invokevirtual i : ()[B
    //   370: invokestatic g : (Lby1;Lxs;[B)V
    //   373: aload #5
    //   375: astore_1
    //   376: goto -> 395
    //   379: astore #4
    //   381: aload_3
    //   382: astore_1
    //   383: aload #4
    //   385: astore_3
    //   386: goto -> 426
    //   389: astore_1
    //   390: goto -> 447
    //   393: aconst_null
    //   394: astore_1
    //   395: aload_1
    //   396: astore_3
    //   397: aload_1
    //   398: astore #4
    //   400: aload #8
    //   402: getfield e : Lvx1;
    //   405: iconst_1
    //   406: putfield a : Z
    //   409: aload_1
    //   410: ifnull -> 417
    //   413: aload_1
    //   414: invokevirtual close : ()V
    //   417: aload #7
    //   419: aconst_null
    //   420: putfield c : Lbp1;
    //   423: goto -> 440
    //   426: aload_1
    //   427: astore #4
    //   429: aload_3
    //   430: invokevirtual printStackTrace : ()V
    //   433: aload_1
    //   434: ifnull -> 417
    //   437: goto -> 413
    //   440: aload #6
    //   442: areturn
    //   443: astore_1
    //   444: goto -> 449
    //   447: aload_1
    //   448: athrow
    //   449: aload #4
    //   451: ifnull -> 459
    //   454: aload #4
    //   456: invokevirtual close : ()V
    //   459: aload #7
    //   461: aconst_null
    //   462: putfield c : Lbp1;
    //   465: aload_1
    //   466: athrow
    //   467: aload_0
    //   468: getfield h : Ljava/lang/Object;
    //   471: checkcast xs
    //   474: astore_3
    //   475: aload_1
    //   476: invokestatic r0 : (Ljava/lang/Object;)V
    //   479: aload_3
    //   480: aconst_null
    //   481: aconst_null
    //   482: new ux1
    //   485: dup
    //   486: aload #5
    //   488: checkcast cn
    //   491: aload #4
    //   493: checkcast in/krosbits/audio_cutter/TrimActivity
    //   496: aconst_null
    //   497: invokespecial <init> : (Lcn;Lin/krosbits/audio_cutter/TrimActivity;Lcs;)V
    //   500: iconst_3
    //   501: invokestatic L : (Lxs;Los;Lat;Lad0;I)Lbp1;
    //   504: pop
    //   505: aload #6
    //   507: areturn
    //   508: aload_0
    //   509: getfield h : Ljava/lang/Object;
    //   512: checkcast xs
    //   515: astore_3
    //   516: aload_1
    //   517: invokestatic r0 : (Ljava/lang/Object;)V
    //   520: getstatic cq0.a : Lcs1;
    //   523: astore_1
    //   524: aload #5
    //   526: checkcast km0
    //   529: invokestatic d : (Lkm0;)Ljava/io/File;
    //   532: astore #7
    //   534: aload #7
    //   536: invokevirtual exists : ()Z
    //   539: ifne -> 555
    //   542: aload #7
    //   544: invokevirtual createNewFile : ()Z
    //   547: pop
    //   548: goto -> 555
    //   551: astore_1
    //   552: goto -> 729
    //   555: getstatic lk.a : Ljava/nio/charset/Charset;
    //   558: astore #8
    //   560: new java/io/OutputStreamWriter
    //   563: astore_1
    //   564: new java/io/FileOutputStream
    //   567: astore #5
    //   569: aload #5
    //   571: aload #7
    //   573: invokespecial <init> : (Ljava/io/File;)V
    //   576: aload_1
    //   577: aload #5
    //   579: aload #8
    //   581: invokespecial <init> : (Ljava/io/OutputStream;Ljava/nio/charset/Charset;)V
    //   584: aload #4
    //   586: checkcast aq0
    //   589: astore #4
    //   591: aload_3
    //   592: invokestatic q : (Lxs;)V
    //   595: new my
    //   598: astore #5
    //   600: aload #5
    //   602: invokespecial <init> : ()V
    //   605: new java/lang/StringBuilder
    //   608: astore #7
    //   610: aload #7
    //   612: invokespecial <init> : ()V
    //   615: new pp0
    //   618: astore #8
    //   620: aload #8
    //   622: aload #7
    //   624: invokespecial <init> : (Ljava/lang/Appendable;)V
    //   627: new cl0
    //   630: astore_3
    //   631: aload_3
    //   632: aload #8
    //   634: invokespecial <init> : (Ljava/io/Writer;)V
    //   637: aload_3
    //   638: aload #5
    //   640: getfield h : Ljava/lang/Object;
    //   643: checkcast na0
    //   646: invokevirtual q : (Lna0;)V
    //   649: aload_3
    //   650: aload #5
    //   652: getfield b : Z
    //   655: putfield k : Z
    //   658: aload_3
    //   659: iconst_2
    //   660: invokevirtual r : (I)V
    //   663: aload_3
    //   664: iconst_0
    //   665: putfield m : Z
    //   668: aload #5
    //   670: aload #4
    //   672: ldc aq0
    //   674: aload_3
    //   675: invokevirtual f : (Ljava/lang/Object;Ljava/lang/Class;Lcl0;)V
    //   678: aload_1
    //   679: aload #7
    //   681: invokevirtual toString : ()Ljava/lang/String;
    //   684: invokevirtual write : (Ljava/lang/String;)V
    //   687: aload_1
    //   688: invokevirtual flush : ()V
    //   691: aload_1
    //   692: invokevirtual close : ()V
    //   695: goto -> 733
    //   698: astore_3
    //   699: goto -> 717
    //   702: astore_3
    //   703: new pk0
    //   706: astore #4
    //   708: aload #4
    //   710: aload_3
    //   711: invokespecial <init> : (Ljava/lang/Throwable;)V
    //   714: aload #4
    //   716: athrow
    //   717: aload_3
    //   718: athrow
    //   719: astore #4
    //   721: aload_1
    //   722: aload_3
    //   723: invokestatic j : (Ljava/io/Closeable;Ljava/lang/Throwable;)V
    //   726: aload #4
    //   728: athrow
    //   729: aload_1
    //   730: invokevirtual printStackTrace : ()V
    //   733: aload #6
    //   735: areturn
    //   736: aload #4
    //   738: checkcast me1
    //   741: astore_3
    //   742: aload #5
    //   744: checkcast in/krosbits/musicolet/EPCsCSVActivity
    //   747: astore #4
    //   749: aload_1
    //   750: invokestatic r0 : (Ljava/lang/Object;)V
    //   753: aload_0
    //   754: getfield h : Ljava/lang/Object;
    //   757: checkcast ke1
    //   760: getfield b : Z
    //   763: ifeq -> 862
    //   766: aload #4
    //   768: getfield U : Lss0;
    //   771: astore_1
    //   772: aload_1
    //   773: ifnull -> 780
    //   776: aload_1
    //   777: invokevirtual dismiss : ()V
    //   780: aload_3
    //   781: getfield b : Ljava/lang/Object;
    //   784: ifnull -> 873
    //   787: new ms0
    //   790: dup
    //   791: aload #4
    //   793: invokespecial <init> : (Landroid/content/Context;)V
    //   796: astore_1
    //   797: aload_1
    //   798: ldc_w 2131887273
    //   801: invokevirtual q : (I)V
    //   804: aload_1
    //   805: getstatic in/krosbits/musicolet/MyApplication.F : Lyp1;
    //   808: aload_3
    //   809: getfield b : Ljava/lang/Object;
    //   812: checkcast v00
    //   815: getfield b : Ld61;
    //   818: invokevirtual toString : ()Ljava/lang/String;
    //   821: invokevirtual c : (Ljava/lang/String;)Lml0;
    //   824: getfield b : Ljava/lang/String;
    //   827: invokestatic a : (Ljava/lang/String;)Ljava/lang/String;
    //   830: invokevirtual d : (Ljava/lang/CharSequence;)V
    //   833: aload_1
    //   834: ldc_w 2131887030
    //   837: invokevirtual n : (I)V
    //   840: aload_1
    //   841: new un
    //   844: dup
    //   845: iconst_2
    //   846: aload #4
    //   848: invokespecial <init> : (ILjava/lang/Object;)V
    //   851: putfield W : Landroid/content/DialogInterface$OnDismissListener;
    //   854: aload_1
    //   855: invokevirtual p : ()Lss0;
    //   858: pop
    //   859: goto -> 873
    //   862: ldc_w 'EPC:ex>ns'
    //   865: invokestatic v : (Ljava/lang/String;)V
    //   868: aload #4
    //   870: invokevirtual finish : ()V
    //   873: aload #6
    //   875: areturn
    //   876: astore_1
    //   877: goto -> 417
    //   880: astore_3
    //   881: goto -> 459
    // Exception table:
    //   from	to	target	type
    //   81	190	258	java/util/concurrent/CancellationException
    //   81	190	252	finally
    //   194	238	258	java/util/concurrent/CancellationException
    //   194	238	252	finally
    //   242	249	258	java/util/concurrent/CancellationException
    //   242	249	252	finally
    //   267	275	258	java/util/concurrent/CancellationException
    //   267	275	252	finally
    //   278	283	258	java/util/concurrent/CancellationException
    //   278	283	252	finally
    //   287	292	258	java/util/concurrent/CancellationException
    //   287	292	252	finally
    //   299	311	258	java/util/concurrent/CancellationException
    //   299	311	252	finally
    //   315	333	258	java/util/concurrent/CancellationException
    //   315	333	252	finally
    //   343	351	389	java/util/concurrent/CancellationException
    //   343	351	379	finally
    //   358	373	389	java/util/concurrent/CancellationException
    //   358	373	379	finally
    //   400	409	389	java/util/concurrent/CancellationException
    //   400	409	379	finally
    //   413	417	876	finally
    //   429	433	443	finally
    //   447	449	443	finally
    //   454	459	880	finally
    //   520	548	551	finally
    //   555	591	551	finally
    //   591	615	698	finally
    //   615	678	702	java/io/IOException
    //   615	678	698	finally
    //   678	691	698	finally
    //   691	695	551	finally
    //   703	717	698	finally
    //   717	719	719	finally
    //   721	729	551	finally
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar\\u20.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
import android.content.Intent;
import android.os.AsyncTask;
import in.krosbits.musicolet.MusicActivity;
import in.krosbits.musicolet.MusicService;
import in.krosbits.musicolet.MyApplication;

public final class z2 extends AsyncTask {
  public final int a;
  
  public final Object b;
  
  public z2(Runnable paramRunnable) {
    this.b = paramRunnable;
  }
  
  public final Object doInBackground(Object... paramVarArgs) {
    // Byte code:
    //   0: aload_0
    //   1: getfield a : I
    //   4: istore_2
    //   5: aload_0
    //   6: getfield b : Ljava/lang/Object;
    //   9: astore_1
    //   10: iload_2
    //   11: tableswitch default -> 40, 0 -> 477, 1 -> 240, 2 -> 221, 3 -> 66
    //   40: aload_1
    //   41: checkcast j52
    //   44: invokevirtual d : ()V
    //   47: getstatic in/krosbits/musicolet/MyApplication.i : Lin/krosbits/musicolet/MyApplication;
    //   50: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   53: invokestatic Q0 : (Landroid/content/Context;)V
    //   56: goto -> 64
    //   59: astore_1
    //   60: aload_1
    //   61: invokevirtual printStackTrace : ()V
    //   64: aconst_null
    //   65: areturn
    //   66: aload_1
    //   67: checkcast a52
    //   70: astore_1
    //   71: aload_1
    //   72: invokestatic D0 : (La52;)Ljava/util/ArrayList;
    //   75: astore #6
    //   77: invokestatic v : ()Landroid/content/SharedPreferences;
    //   80: astore #7
    //   82: new java/util/HashSet
    //   85: astore #8
    //   87: aload #8
    //   89: invokespecial <init> : ()V
    //   92: aload #7
    //   94: ldc 'SAF_SS_SMSU'
    //   96: aload #8
    //   98: invokeinterface getStringSet : (Ljava/lang/String;Ljava/util/Set;)Ljava/util/Set;
    //   103: astore #8
    //   105: getstatic lw0.r : Landroid/net/Uri;
    //   108: astore #7
    //   110: aload #8
    //   112: aload #7
    //   114: invokevirtual toString : ()Ljava/lang/String;
    //   117: invokeinterface contains : (Ljava/lang/Object;)Z
    //   122: ifne -> 172
    //   125: new s00
    //   128: astore #9
    //   130: new ml0
    //   133: astore #8
    //   135: aload #8
    //   137: aload_1
    //   138: ldc 2131887277
    //   140: invokevirtual T : (I)Ljava/lang/String;
    //   143: invokespecial <init> : (Ljava/lang/String;)V
    //   146: aload #9
    //   148: aload #8
    //   150: aload #7
    //   152: iconst_m1
    //   153: iconst_0
    //   154: invokespecial <init> : (Lml0;Landroid/net/Uri;II)V
    //   157: aload #6
    //   159: aload #9
    //   161: invokevirtual add : (Ljava/lang/Object;)Z
    //   164: pop
    //   165: goto -> 172
    //   168: astore_1
    //   169: goto -> 215
    //   172: getstatic a52.p0 : Ljava/util/ArrayList;
    //   175: aload #6
    //   177: invokevirtual equals : (Ljava/lang/Object;)Z
    //   180: ifne -> 219
    //   183: aload #6
    //   185: putstatic a52.p0 : Ljava/util/ArrayList;
    //   188: aload_1
    //   189: invokevirtual M : ()Lx5;
    //   192: astore_1
    //   193: new xt0
    //   196: astore #6
    //   198: aload #6
    //   200: bipush #24
    //   202: aload_0
    //   203: invokespecial <init> : (ILjava/lang/Object;)V
    //   206: aload_1
    //   207: aload #6
    //   209: invokevirtual runOnUiThread : (Ljava/lang/Runnable;)V
    //   212: goto -> 219
    //   215: aload_1
    //   216: invokevirtual printStackTrace : ()V
    //   219: aconst_null
    //   220: areturn
    //   221: aload_1
    //   222: checkcast java/lang/Runnable
    //   225: invokeinterface run : ()V
    //   230: goto -> 238
    //   233: astore_1
    //   234: aload_1
    //   235: invokevirtual printStackTrace : ()V
    //   238: aconst_null
    //   239: areturn
    //   240: aload_1
    //   241: checkcast im0
    //   244: astore_1
    //   245: getstatic zi1.E : Lzi1;
    //   248: astore #6
    //   250: aload #6
    //   252: ifnull -> 284
    //   255: aload #6
    //   257: getfield y : Z
    //   260: ifne -> 284
    //   263: aload_1
    //   264: getfield K : Z
    //   267: ifeq -> 284
    //   270: aload_1
    //   271: getfield F : [Z
    //   274: iconst_0
    //   275: baload
    //   276: ifne -> 284
    //   279: iconst_1
    //   280: istore_2
    //   281: goto -> 286
    //   284: iconst_0
    //   285: istore_2
    //   286: aload_1
    //   287: getstatic in/krosbits/musicolet/MyApplication.j : Lwn1;
    //   290: invokevirtual getWritableDatabase : ()Landroid/database/sqlite/SQLiteDatabase;
    //   293: invokevirtual v : (Landroid/database/sqlite/SQLiteDatabase;)V
    //   296: iload_2
    //   297: ifeq -> 315
    //   300: aload_1
    //   301: getfield F : [Z
    //   304: iconst_0
    //   305: baload
    //   306: ifne -> 315
    //   309: ldc 2131887417
    //   311: iconst_0
    //   312: invokestatic O0 : (II)V
    //   315: aload_1
    //   316: getfield g : Z
    //   319: ifeq -> 440
    //   322: ldc2_w 1500
    //   325: invokestatic sleep : (J)V
    //   328: goto -> 440
    //   331: astore #6
    //   333: goto -> 341
    //   336: astore #6
    //   338: goto -> 380
    //   341: aload #6
    //   343: invokevirtual printStackTrace : ()V
    //   346: iload_2
    //   347: ifeq -> 365
    //   350: aload_1
    //   351: getfield F : [Z
    //   354: iconst_0
    //   355: baload
    //   356: ifne -> 365
    //   359: ldc 2131886735
    //   361: iconst_0
    //   362: invokestatic O0 : (II)V
    //   365: aload_1
    //   366: getfield g : Z
    //   369: ifeq -> 440
    //   372: goto -> 322
    //   375: astore #6
    //   377: goto -> 442
    //   380: getstatic zi1.E : Lzi1;
    //   383: ifnull -> 406
    //   386: aload_1
    //   387: getfield K : Z
    //   390: ifeq -> 406
    //   393: aload_1
    //   394: getfield N : Z
    //   397: ifeq -> 403
    //   400: goto -> 406
    //   403: aload #6
    //   405: athrow
    //   406: aload #6
    //   408: invokevirtual printStackTrace : ()V
    //   411: iload_2
    //   412: ifeq -> 430
    //   415: aload_1
    //   416: getfield F : [Z
    //   419: iconst_0
    //   420: baload
    //   421: ifne -> 430
    //   424: ldc 2131886735
    //   426: iconst_0
    //   427: invokestatic O0 : (II)V
    //   430: aload_1
    //   431: getfield g : Z
    //   434: ifeq -> 440
    //   437: goto -> 322
    //   440: aconst_null
    //   441: areturn
    //   442: iload_2
    //   443: ifeq -> 461
    //   446: aload_1
    //   447: getfield F : [Z
    //   450: iconst_0
    //   451: baload
    //   452: ifne -> 461
    //   455: ldc 2131886735
    //   457: iconst_0
    //   458: invokestatic O0 : (II)V
    //   461: aload_1
    //   462: getfield g : Z
    //   465: ifeq -> 474
    //   468: ldc2_w 1500
    //   471: invokestatic sleep : (J)V
    //   474: aload #6
    //   476: athrow
    //   477: aload_1
    //   478: checkcast c3
    //   481: astore #6
    //   483: aload #6
    //   485: getfield i : Ljava/util/ArrayList;
    //   488: astore #7
    //   490: aload #6
    //   492: getfield k : Ljava/util/ArrayList;
    //   495: iconst_0
    //   496: invokevirtual get : (I)Ljava/lang/Object;
    //   499: checkcast km0
    //   502: getfield c : Lqn1;
    //   505: getfield f : Lwo;
    //   508: astore_1
    //   509: aload #6
    //   511: new java/util/HashSet
    //   514: dup
    //   515: invokespecial <init> : ()V
    //   518: putfield s : Ljava/util/HashSet;
    //   521: iconst_0
    //   522: istore_2
    //   523: aload #6
    //   525: getfield t : Z
    //   528: ifne -> 804
    //   531: iload_2
    //   532: aload #7
    //   534: invokevirtual size : ()I
    //   537: if_icmpge -> 804
    //   540: aload #7
    //   542: iload_2
    //   543: invokevirtual get : (I)Ljava/lang/Object;
    //   546: checkcast java/lang/String
    //   549: astore #8
    //   551: getstatic c81.c : Ljava/util/HashMap;
    //   554: aload #8
    //   556: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   559: checkcast java/util/ArrayList
    //   562: astore #9
    //   564: aload #9
    //   566: ifnull -> 616
    //   569: aload #9
    //   571: invokevirtual size : ()I
    //   574: istore #4
    //   576: iconst_0
    //   577: istore_3
    //   578: iload_3
    //   579: iload #4
    //   581: if_icmpge -> 777
    //   584: aload #9
    //   586: iload_3
    //   587: invokevirtual get : (I)Ljava/lang/Object;
    //   590: astore #10
    //   592: iinc #3, 1
    //   595: aload #10
    //   597: checkcast km0
    //   600: getfield c : Lqn1;
    //   603: getfield f : Lwo;
    //   606: aload_1
    //   607: invokestatic equals : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   610: ifeq -> 578
    //   613: goto -> 740
    //   616: getstatic in/krosbits/musicolet/MyApplication.i : Lin/krosbits/musicolet/MyApplication;
    //   619: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   622: invokevirtual getFilesDir : ()Ljava/io/File;
    //   625: astore #10
    //   627: new java/lang/StringBuilder
    //   630: astore #9
    //   632: aload #9
    //   634: invokespecial <init> : ()V
    //   637: aload #9
    //   639: aload #8
    //   641: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   644: pop
    //   645: aload #9
    //   647: ldc_w '.mpl'
    //   650: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   653: pop
    //   654: aload #9
    //   656: invokevirtual toString : ()Ljava/lang/String;
    //   659: astore #11
    //   661: new java/io/File
    //   664: astore #9
    //   666: aload #9
    //   668: aload #10
    //   670: aload #11
    //   672: invokespecial <init> : (Ljava/io/File;Ljava/lang/String;)V
    //   675: aload_1
    //   676: invokevirtual toString : ()Ljava/lang/String;
    //   679: astore #10
    //   681: getstatic yk1.a : Lkm0;
    //   684: astore #11
    //   686: aload #9
    //   688: invokestatic c : (Ljava/io/File;)Lnk0;
    //   691: invokevirtual g : ()Lrk0;
    //   694: ldc_w 'S_P'
    //   697: invokevirtual m : (Ljava/lang/String;)Lnk0;
    //   700: invokevirtual f : ()Lik0;
    //   703: astore #9
    //   705: iconst_0
    //   706: istore_3
    //   707: iload_3
    //   708: aload #9
    //   710: getfield b : Ljava/util/ArrayList;
    //   713: invokevirtual size : ()I
    //   716: if_icmpge -> 777
    //   719: aload #10
    //   721: aload #9
    //   723: iload_3
    //   724: invokevirtual m : (I)Lnk0;
    //   727: invokevirtual i : ()Ljava/lang/String;
    //   730: invokevirtual equals : (Ljava/lang/Object;)Z
    //   733: istore #5
    //   735: iload #5
    //   737: ifeq -> 754
    //   740: aload #6
    //   742: getfield s : Ljava/util/HashSet;
    //   745: aload #8
    //   747: invokevirtual add : (Ljava/lang/Object;)Z
    //   750: pop
    //   751: goto -> 777
    //   754: iinc #3, 1
    //   757: goto -> 707
    //   760: astore #8
    //   762: aload #8
    //   764: invokevirtual printStackTrace : ()V
    //   767: goto -> 777
    //   770: astore #8
    //   772: aload #8
    //   774: invokevirtual printStackTrace : ()V
    //   777: aload #6
    //   779: iload_2
    //   780: putfield r : I
    //   783: aload_0
    //   784: iconst_1
    //   785: anewarray java/lang/Integer
    //   788: dup
    //   789: iconst_0
    //   790: iload_2
    //   791: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   794: aastore
    //   795: invokevirtual publishProgress : ([Ljava/lang/Object;)V
    //   798: iinc #2, 1
    //   801: goto -> 523
    //   804: aload #6
    //   806: sipush #-999
    //   809: putfield r : I
    //   812: aconst_null
    //   813: areturn
    //   814: astore_1
    //   815: goto -> 64
    //   818: astore_1
    //   819: goto -> 440
    //   822: astore_1
    //   823: goto -> 474
    // Exception table:
    //   from	to	target	type
    //   40	56	814	java/util/concurrent/CancellationException
    //   40	56	59	finally
    //   71	165	168	finally
    //   172	212	168	finally
    //   221	230	233	finally
    //   286	296	336	java/lang/OutOfMemoryError
    //   286	296	331	finally
    //   322	328	818	java/lang/InterruptedException
    //   341	346	375	finally
    //   380	400	375	finally
    //   403	406	375	finally
    //   406	411	375	finally
    //   468	474	822	java/lang/InterruptedException
    //   616	686	770	finally
    //   686	705	760	finally
    //   707	735	760	finally
    //   762	767	770	finally
  }
  
  public void onPostExecute(Object paramObject) {
    switch (this.a) {
      default:
        super.onPostExecute(paramObject);
        return;
      case 1:
        break;
    } 
    n21.F("LIBU_PO:UI");
    paramObject = this.b;
    paramObject.b();
    paramObject.x();
    MusicService.v0(MusicService.y());
    MusicService musicService = MusicService.P0;
    if (musicService != null)
      musicService.D(); 
    MusicActivity musicActivity = MusicActivity.R0;
    if (musicActivity != null) {
      musicActivity.M0();
      musicActivity.K0();
    } else if (((im0)paramObject).g) {
      MyApplication.i.getApplicationContext().startActivity((new Intent(MyApplication.i.getApplicationContext(), MusicActivity.class)).addFlags(268435456));
    } 
  }
  
  public void onProgressUpdate(Object[] paramArrayOfObject) {
    switch (this.a) {
      default:
        super.onProgressUpdate(paramArrayOfObject);
        return;
      case 0:
        break;
    } 
    Integer[] arrayOfInteger = (Integer[])paramArrayOfObject;
    if (arrayOfInteger != null && arrayOfInteger.length == 1) {
      c3 c3 = (c3)this.b;
      if (!c3.t)
        c3.m.h(arrayOfInteger[0].intValue()); 
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\z2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
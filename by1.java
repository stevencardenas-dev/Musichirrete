import android.graphics.Bitmap;
import android.os.Build;
import android.os.Environment;
import android.util.Size;
import in.krosbits.musicolet.MyApplication;
import in.krosbits.nativex.Cn;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import me.zhanghai.android.materialprogressbar.internal.pozR.kOkiWEITVb;
import org.jaudiotagger.tag.FieldKey;
import org.jaudiotagger.tag.Tag;

public final class by1 extends g32 {
  public final km0 b;
  
  public final ip1 c;
  
  public final ed1 d;
  
  public final vx1 e;
  
  public by1(km0 paramkm0, vx1 paramvx1, cy1 paramcy1) {
    this.b = paramkm0;
    ip1 ip11 = new ip1(paramcy1);
    this.c = ip11;
    this.d = new ed1(ip11);
    this.e = paramvx1;
    if (!paramvx1.a) {
      cm cm = qv.C(this);
      yw yw = e00.a;
      paramvx1.c = qv.L(cm, fw.e, null, new u20(paramvx1, this, null, 3), 2);
    } 
  }
  
  public static final Object e(by1 paramby1, Size paramSize, float paramFloat, xs paramxs, ds paramds) {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual getClass : ()Ljava/lang/Class;
    //   4: pop
    //   5: aload #4
    //   7: instanceof wx1
    //   10: ifeq -> 48
    //   13: aload #4
    //   15: checkcast wx1
    //   18: astore #9
    //   20: aload #9
    //   22: getfield l : I
    //   25: istore #5
    //   27: iload #5
    //   29: ldc -2147483648
    //   31: iand
    //   32: ifeq -> 48
    //   35: aload #9
    //   37: iload #5
    //   39: ldc -2147483648
    //   41: iadd
    //   42: putfield l : I
    //   45: goto -> 60
    //   48: new wx1
    //   51: dup
    //   52: aload_0
    //   53: aload #4
    //   55: invokespecial <init> : (Lby1;Lds;)V
    //   58: astore #9
    //   60: aload #9
    //   62: getfield j : Ljava/lang/Object;
    //   65: astore #8
    //   67: aload #9
    //   69: getfield l : I
    //   72: istore #5
    //   74: aconst_null
    //   75: astore #7
    //   77: aconst_null
    //   78: astore #4
    //   80: iload #5
    //   82: ifeq -> 171
    //   85: iload #5
    //   87: iconst_1
    //   88: if_icmpeq -> 135
    //   91: iload #5
    //   93: iconst_2
    //   94: if_icmpne -> 128
    //   97: aload #9
    //   99: getfield f : Landroid/os/ParcelFileDescriptor;
    //   102: astore_0
    //   103: aload_0
    //   104: astore #4
    //   106: aload_0
    //   107: astore #7
    //   109: aload #8
    //   111: invokestatic r0 : (Ljava/lang/Object;)V
    //   114: goto -> 506
    //   117: astore_1
    //   118: aload #4
    //   120: astore_0
    //   121: goto -> 517
    //   124: astore_0
    //   125: goto -> 541
    //   128: ldc 'call to 'resume' before 'invoke' with coroutine'
    //   130: invokestatic f : (Ljava/lang/String;)V
    //   133: aconst_null
    //   134: areturn
    //   135: aload #9
    //   137: getfield i : F
    //   140: fstore_2
    //   141: aload #9
    //   143: getfield h : Ldk0;
    //   146: astore_1
    //   147: aload #9
    //   149: getfield g : Lin/krosbits/nativex/Wv;
    //   152: astore_3
    //   153: aload #9
    //   155: getfield f : Landroid/os/ParcelFileDescriptor;
    //   158: astore_0
    //   159: aload #8
    //   161: invokestatic r0 : (Ljava/lang/Object;)V
    //   164: goto -> 277
    //   167: astore_1
    //   168: goto -> 517
    //   171: aload #8
    //   173: invokestatic r0 : (Ljava/lang/Object;)V
    //   176: aload_0
    //   177: getfield b : Lkm0;
    //   180: invokevirtual d : ()Lv00;
    //   183: ldc 'r'
    //   185: invokestatic J : (Lu00;Ljava/lang/String;)Landroid/os/ParcelFileDescriptor;
    //   188: astore #8
    //   190: aload #8
    //   192: astore #4
    //   194: aload #8
    //   196: astore #7
    //   198: new in/krosbits/nativex/Wv
    //   201: astore #10
    //   203: aload #8
    //   205: astore #4
    //   207: aload #8
    //   209: astore #7
    //   211: aload #10
    //   213: aload #8
    //   215: invokevirtual getFd : ()I
    //   218: invokespecial <init> : (I)V
    //   221: aload #8
    //   223: astore #4
    //   225: aload #8
    //   227: astore #7
    //   229: new xx1
    //   232: astore #11
    //   234: aload #8
    //   236: astore #4
    //   238: aload #8
    //   240: astore #7
    //   242: aload #11
    //   244: aload_1
    //   245: aload #10
    //   247: aload_0
    //   248: fload_2
    //   249: aconst_null
    //   250: invokespecial <init> : (Landroid/util/Size;Lin/krosbits/nativex/Wv;Lby1;FLcs;)V
    //   253: aload #8
    //   255: astore #4
    //   257: aload #8
    //   259: astore #7
    //   261: aload_3
    //   262: aconst_null
    //   263: aconst_null
    //   264: aload #11
    //   266: iconst_3
    //   267: invokestatic L : (Lxs;Los;Lat;Lad0;I)Lbp1;
    //   270: astore_1
    //   271: aload #10
    //   273: astore_3
    //   274: aload #8
    //   276: astore_0
    //   277: aload_0
    //   278: astore #4
    //   280: aload_0
    //   281: astore #7
    //   283: aload_1
    //   284: invokevirtual O : ()Z
    //   287: istore #6
    //   289: getstatic ys.b : Lys;
    //   292: astore #8
    //   294: iload #6
    //   296: ifne -> 398
    //   299: aload_0
    //   300: astore #4
    //   302: aload_0
    //   303: astore #7
    //   305: aload_1
    //   306: invokevirtual N : ()Z
    //   309: istore #6
    //   311: iload #6
    //   313: ifne -> 398
    //   316: aload_0
    //   317: astore #4
    //   319: aload #9
    //   321: aload_0
    //   322: putfield f : Landroid/os/ParcelFileDescriptor;
    //   325: aload_0
    //   326: astore #4
    //   328: aload #9
    //   330: aload_3
    //   331: putfield g : Lin/krosbits/nativex/Wv;
    //   334: aload_0
    //   335: astore #4
    //   337: aload #9
    //   339: aload_1
    //   340: putfield h : Ldk0;
    //   343: aload_0
    //   344: astore #4
    //   346: aload #9
    //   348: fload_2
    //   349: putfield i : F
    //   352: aload_0
    //   353: astore #4
    //   355: aload #9
    //   357: iconst_1
    //   358: putfield l : I
    //   361: aload_0
    //   362: astore #4
    //   364: ldc2_w 500
    //   367: aload #9
    //   369: invokestatic o : (JLds;)Ljava/lang/Object;
    //   372: astore #7
    //   374: aload #7
    //   376: aload #8
    //   378: if_acmpne -> 277
    //   381: aload #8
    //   383: astore_0
    //   384: goto -> 535
    //   387: astore_1
    //   388: aload #4
    //   390: astore_0
    //   391: goto -> 517
    //   394: astore_0
    //   395: goto -> 541
    //   398: aload_0
    //   399: astore #4
    //   401: aload_0
    //   402: astore #7
    //   404: aload_1
    //   405: invokevirtual N : ()Z
    //   408: ifeq -> 421
    //   411: aload_0
    //   412: astore #4
    //   414: aload_0
    //   415: astore #7
    //   417: aload_3
    //   418: invokevirtual a : ()V
    //   421: aload_0
    //   422: astore #4
    //   424: aload_0
    //   425: astore #7
    //   427: aload #9
    //   429: aload_0
    //   430: putfield f : Landroid/os/ParcelFileDescriptor;
    //   433: aload_0
    //   434: astore #4
    //   436: aload_0
    //   437: astore #7
    //   439: aload #9
    //   441: aconst_null
    //   442: putfield g : Lin/krosbits/nativex/Wv;
    //   445: aload_0
    //   446: astore #4
    //   448: aload_0
    //   449: astore #7
    //   451: aload #9
    //   453: aconst_null
    //   454: putfield h : Ldk0;
    //   457: aload_0
    //   458: astore #4
    //   460: aload_0
    //   461: astore #7
    //   463: aload #9
    //   465: fload_2
    //   466: putfield i : F
    //   469: aload_0
    //   470: astore #4
    //   472: aload_0
    //   473: astore #7
    //   475: aload #9
    //   477: iconst_2
    //   478: putfield l : I
    //   481: aload_0
    //   482: astore #4
    //   484: aload_0
    //   485: astore #7
    //   487: aload_1
    //   488: aload #9
    //   490: invokevirtual Q : (Lds;)Ljava/lang/Object;
    //   493: astore_1
    //   494: aload_1
    //   495: aload #8
    //   497: if_acmpne -> 506
    //   500: aload #8
    //   502: astore_0
    //   503: goto -> 535
    //   506: aload_0
    //   507: ifnull -> 531
    //   510: aload_0
    //   511: invokevirtual close : ()V
    //   514: goto -> 531
    //   517: aload_0
    //   518: astore #7
    //   520: aload_1
    //   521: invokevirtual printStackTrace : ()V
    //   524: aload_0
    //   525: ifnull -> 531
    //   528: goto -> 510
    //   531: getstatic l02.a : Ll02;
    //   534: astore_0
    //   535: aload_0
    //   536: areturn
    //   537: astore_0
    //   538: goto -> 543
    //   541: aload_0
    //   542: athrow
    //   543: aload #7
    //   545: ifnull -> 553
    //   548: aload #7
    //   550: invokevirtual close : ()V
    //   553: aload_0
    //   554: athrow
    //   555: astore #4
    //   557: goto -> 164
    //   560: astore #4
    //   562: goto -> 277
    //   565: astore_0
    //   566: goto -> 531
    //   569: astore_1
    //   570: goto -> 553
    // Exception table:
    //   from	to	target	type
    //   109	114	124	java/util/concurrent/CancellationException
    //   109	114	117	finally
    //   159	164	555	java/util/concurrent/CancellationException
    //   159	164	167	finally
    //   176	190	124	java/util/concurrent/CancellationException
    //   176	190	117	finally
    //   198	203	394	java/util/concurrent/CancellationException
    //   198	203	387	finally
    //   211	221	394	java/util/concurrent/CancellationException
    //   211	221	387	finally
    //   229	234	394	java/util/concurrent/CancellationException
    //   229	234	387	finally
    //   242	253	394	java/util/concurrent/CancellationException
    //   242	253	387	finally
    //   261	271	394	java/util/concurrent/CancellationException
    //   261	271	387	finally
    //   283	289	394	java/util/concurrent/CancellationException
    //   283	289	387	finally
    //   305	311	394	java/util/concurrent/CancellationException
    //   305	311	387	finally
    //   319	325	560	java/util/concurrent/CancellationException
    //   319	325	387	finally
    //   328	334	560	java/util/concurrent/CancellationException
    //   328	334	387	finally
    //   337	343	560	java/util/concurrent/CancellationException
    //   337	343	387	finally
    //   346	352	560	java/util/concurrent/CancellationException
    //   346	352	387	finally
    //   355	361	560	java/util/concurrent/CancellationException
    //   355	361	387	finally
    //   364	374	560	java/util/concurrent/CancellationException
    //   364	374	387	finally
    //   404	411	394	java/util/concurrent/CancellationException
    //   404	411	387	finally
    //   417	421	394	java/util/concurrent/CancellationException
    //   417	421	387	finally
    //   427	433	394	java/util/concurrent/CancellationException
    //   427	433	387	finally
    //   439	445	394	java/util/concurrent/CancellationException
    //   439	445	387	finally
    //   451	457	394	java/util/concurrent/CancellationException
    //   451	457	387	finally
    //   463	469	394	java/util/concurrent/CancellationException
    //   463	469	387	finally
    //   475	481	394	java/util/concurrent/CancellationException
    //   475	481	387	finally
    //   487	494	394	java/util/concurrent/CancellationException
    //   487	494	387	finally
    //   510	514	565	finally
    //   520	524	537	finally
    //   541	543	537	finally
    //   548	553	569	finally
  }
  
  public static final void f(by1 paramby1, cy1 paramcy1, boolean paramBoolean, xs paramxs) {
    // Byte code:
    //   0: getstatic org/jaudiotagger/audio/dsf/qdA/GMDx.XBe : Ljava/lang/String;
    //   3: astore #34
    //   5: aload_0
    //   6: getfield c : Lip1;
    //   9: astore #27
    //   11: getstatic r3/IKWi/AyxAR.MINVucK : Ljava/lang/String;
    //   14: astore #28
    //   16: aload_0
    //   17: getfield b : Lkm0;
    //   20: astore #30
    //   22: aload_1
    //   23: getfield o : Lcd1;
    //   26: astore #26
    //   28: aload_1
    //   29: getfield c : Ljava/util/List;
    //   32: astore #31
    //   34: aload_0
    //   35: getfield e : Lvx1;
    //   38: astore #29
    //   40: aload #26
    //   42: ifnull -> 2844
    //   45: aload #29
    //   47: ifnull -> 2844
    //   50: aload #26
    //   52: invokestatic readMagic : (Lu00;)Lorg/jaudiotagger/audio/AudioFile;
    //   55: astore #24
    //   57: goto -> 92
    //   60: astore #24
    //   62: aload #24
    //   64: invokevirtual printStackTrace : ()V
    //   67: goto -> 89
    //   70: astore #24
    //   72: aload #26
    //   74: invokestatic read : (Lu00;)Lorg/jaudiotagger/audio/AudioFile;
    //   77: astore #24
    //   79: goto -> 92
    //   82: astore #24
    //   84: aload #24
    //   86: invokevirtual printStackTrace : ()V
    //   89: aconst_null
    //   90: astore #24
    //   92: aload_3
    //   93: invokestatic q : (Lxs;)V
    //   96: aload #24
    //   98: ifnull -> 555
    //   101: aload #24
    //   103: invokevirtual getTagAndConvertOrCreateAndSetDefault : ()Lorg/jaudiotagger/tag/Tag;
    //   106: astore #32
    //   108: aload #32
    //   110: ifnull -> 555
    //   113: aload #24
    //   115: invokevirtual getAudioHeader : ()Lorg/jaudiotagger/audio/AudioHeader;
    //   118: invokeinterface getPreciseTrackLength : ()D
    //   123: ldc2_w 1000.0
    //   126: dmul
    //   127: d2l
    //   128: lstore #16
    //   130: getstatic org/jaudiotagger/tag/FieldKey.TITLE : Lorg/jaudiotagger/tag/FieldKey;
    //   133: astore #25
    //   135: aload #32
    //   137: aload #25
    //   139: aload #29
    //   141: getfield d : Ljava/lang/String;
    //   144: invokestatic m : (Lorg/jaudiotagger/tag/Tag;Lorg/jaudiotagger/tag/FieldKey;Ljava/lang/String;)V
    //   147: aload #32
    //   149: getstatic org/jaudiotagger/tag/FieldKey.ALBUM : Lorg/jaudiotagger/tag/FieldKey;
    //   152: aload #29
    //   154: getfield f : Ljava/lang/String;
    //   157: invokestatic m : (Lorg/jaudiotagger/tag/Tag;Lorg/jaudiotagger/tag/FieldKey;Ljava/lang/String;)V
    //   160: aload #32
    //   162: getstatic org/jaudiotagger/tag/FieldKey.ARTIST : Lorg/jaudiotagger/tag/FieldKey;
    //   165: aload #29
    //   167: getfield e : Ljava/lang/String;
    //   170: invokestatic m : (Lorg/jaudiotagger/tag/Tag;Lorg/jaudiotagger/tag/FieldKey;Ljava/lang/String;)V
    //   173: aload #32
    //   175: getstatic org/jaudiotagger/tag/FieldKey.ALBUM_ARTIST : Lorg/jaudiotagger/tag/FieldKey;
    //   178: aload #29
    //   180: getfield g : Ljava/lang/String;
    //   183: invokestatic m : (Lorg/jaudiotagger/tag/Tag;Lorg/jaudiotagger/tag/FieldKey;Ljava/lang/String;)V
    //   186: aload #32
    //   188: getstatic org/jaudiotagger/tag/FieldKey.COMPOSER : Lorg/jaudiotagger/tag/FieldKey;
    //   191: aload #29
    //   193: getfield h : Ljava/lang/String;
    //   196: invokestatic m : (Lorg/jaudiotagger/tag/Tag;Lorg/jaudiotagger/tag/FieldKey;Ljava/lang/String;)V
    //   199: aload #32
    //   201: getstatic org/jaudiotagger/tag/FieldKey.GENRE : Lorg/jaudiotagger/tag/FieldKey;
    //   204: aload #29
    //   206: getfield i : Ljava/lang/String;
    //   209: invokestatic m : (Lorg/jaudiotagger/tag/Tag;Lorg/jaudiotagger/tag/FieldKey;Ljava/lang/String;)V
    //   212: getstatic org/jaudiotagger/tag/FieldKey.DISC_NO : Lorg/jaudiotagger/tag/FieldKey;
    //   215: astore #33
    //   217: aload #29
    //   219: getfield j : Ljava/lang/Integer;
    //   222: astore #25
    //   224: aload #25
    //   226: ifnull -> 251
    //   229: aload #25
    //   231: invokevirtual intValue : ()I
    //   234: sipush #1000
    //   237: idiv
    //   238: invokestatic valueOf : (I)Ljava/lang/String;
    //   241: astore #25
    //   243: goto -> 254
    //   246: astore #24
    //   248: goto -> 562
    //   251: aconst_null
    //   252: astore #25
    //   254: aload #32
    //   256: aload #33
    //   258: aload #25
    //   260: invokestatic m : (Lorg/jaudiotagger/tag/Tag;Lorg/jaudiotagger/tag/FieldKey;Ljava/lang/String;)V
    //   263: getstatic org/jaudiotagger/tag/FieldKey.TRACK : Lorg/jaudiotagger/tag/FieldKey;
    //   266: astore #33
    //   268: aload #29
    //   270: getfield j : Ljava/lang/Integer;
    //   273: astore #25
    //   275: aload #25
    //   277: ifnull -> 297
    //   280: aload #25
    //   282: invokevirtual intValue : ()I
    //   285: sipush #1000
    //   288: irem
    //   289: invokestatic valueOf : (I)Ljava/lang/String;
    //   292: astore #25
    //   294: goto -> 300
    //   297: aconst_null
    //   298: astore #25
    //   300: aload #32
    //   302: aload #33
    //   304: aload #25
    //   306: invokestatic m : (Lorg/jaudiotagger/tag/Tag;Lorg/jaudiotagger/tag/FieldKey;Ljava/lang/String;)V
    //   309: getstatic org/jaudiotagger/tag/FieldKey.YEAR : Lorg/jaudiotagger/tag/FieldKey;
    //   312: astore #33
    //   314: aload #29
    //   316: getfield o : Ljava/lang/Integer;
    //   319: astore #25
    //   321: aload #25
    //   323: ifnull -> 339
    //   326: aload #25
    //   328: invokevirtual intValue : ()I
    //   331: invokestatic valueOf : (I)Ljava/lang/String;
    //   334: astore #25
    //   336: goto -> 342
    //   339: aconst_null
    //   340: astore #25
    //   342: aload #32
    //   344: aload #33
    //   346: aload #25
    //   348: invokestatic m : (Lorg/jaudiotagger/tag/Tag;Lorg/jaudiotagger/tag/FieldKey;Ljava/lang/String;)V
    //   351: aload #32
    //   353: getstatic org/jaudiotagger/tag/FieldKey.UNSYNC_LYRICS : Lorg/jaudiotagger/tag/FieldKey;
    //   356: aload #29
    //   358: invokevirtual e : ()Ljava/lang/String;
    //   361: invokestatic m : (Lorg/jaudiotagger/tag/Tag;Lorg/jaudiotagger/tag/FieldKey;Ljava/lang/String;)V
    //   364: aload #32
    //   366: getstatic org/jaudiotagger/tag/FieldKey.LYRICIST : Lorg/jaudiotagger/tag/FieldKey;
    //   369: aload #29
    //   371: invokevirtual d : ()Ljava/lang/String;
    //   374: invokestatic m : (Lorg/jaudiotagger/tag/Tag;Lorg/jaudiotagger/tag/FieldKey;Ljava/lang/String;)V
    //   377: aload #32
    //   379: getstatic org/jaudiotagger/tag/FieldKey.COMMENT : Lorg/jaudiotagger/tag/FieldKey;
    //   382: aload #29
    //   384: invokevirtual c : ()Ljava/lang/String;
    //   387: invokestatic m : (Lorg/jaudiotagger/tag/Tag;Lorg/jaudiotagger/tag/FieldKey;Ljava/lang/String;)V
    //   390: aload #29
    //   392: invokevirtual b : ()Ljava/io/File;
    //   395: astore #25
    //   397: aload #25
    //   399: ifnull -> 414
    //   402: aload #32
    //   404: aload #25
    //   406: invokestatic createArtworkFromFile : (Ljava/io/File;)Lorg/jaudiotagger/tag/images/Artwork;
    //   409: invokeinterface setField : (Lorg/jaudiotagger/tag/images/Artwork;)V
    //   414: aload #24
    //   416: aload #32
    //   418: invokevirtual setTag : (Lorg/jaudiotagger/tag/Tag;)V
    //   421: new java/io/File
    //   424: astore #35
    //   426: invokestatic d : ()Landroid/content/Context;
    //   429: invokevirtual getCacheDir : ()Ljava/io/File;
    //   432: astore #32
    //   434: invokestatic currentTimeMillis : ()J
    //   437: lstore #18
    //   439: aload_1
    //   440: invokevirtual b : ()Li51;
    //   443: getfield e : Ljava/lang/String;
    //   446: astore #33
    //   448: new java/lang/StringBuilder
    //   451: astore #25
    //   453: aload #25
    //   455: ldc_w 'tr_tg_'
    //   458: invokespecial <init> : (Ljava/lang/String;)V
    //   461: aload #25
    //   463: lload #18
    //   465: invokevirtual append : (J)Ljava/lang/StringBuilder;
    //   468: pop
    //   469: aload #25
    //   471: ldc_w '.'
    //   474: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   477: pop
    //   478: aload #25
    //   480: aload #33
    //   482: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   485: pop
    //   486: aload #35
    //   488: aload #32
    //   490: aload #25
    //   492: invokevirtual toString : ()Ljava/lang/String;
    //   495: invokespecial <init> : (Ljava/io/File;Ljava/lang/String;)V
    //   498: aload #35
    //   500: invokevirtual deleteOnExit : ()V
    //   503: aload #35
    //   505: invokestatic s : (Ljava/io/File;)Lcd1;
    //   508: astore #25
    //   510: aload #25
    //   512: invokevirtual p : ()Z
    //   515: pop
    //   516: aload #29
    //   518: invokevirtual a : ()Ljava/util/ArrayList;
    //   521: aload #25
    //   523: invokevirtual add : (Ljava/lang/Object;)Z
    //   526: pop
    //   527: aload_3
    //   528: invokestatic q : (Lxs;)V
    //   531: aload #24
    //   533: aload #25
    //   535: invokestatic writeAs : (Lorg/jaudiotagger/audio/AudioFile;Lu00;)V
    //   538: aload #25
    //   540: astore #26
    //   542: goto -> 602
    //   545: astore #24
    //   547: goto -> 562
    //   550: astore #24
    //   552: goto -> 562
    //   555: goto -> 570
    //   558: astore_0
    //   559: goto -> 2842
    //   562: aload #24
    //   564: invokevirtual printStackTrace : ()V
    //   567: goto -> 555
    //   570: aload #31
    //   572: iconst_1
    //   573: invokeinterface get : (I)Ljava/lang/Object;
    //   578: checkcast java/lang/Number
    //   581: invokevirtual floatValue : ()F
    //   584: aload #31
    //   586: iconst_0
    //   587: invokeinterface get : (I)Ljava/lang/Object;
    //   592: checkcast java/lang/Number
    //   595: invokevirtual floatValue : ()F
    //   598: fsub
    //   599: f2l
    //   600: lstore #16
    //   602: aload #27
    //   604: astore #25
    //   606: aload_3
    //   607: invokestatic q : (Lxs;)V
    //   610: aload #30
    //   612: invokevirtual d : ()Lv00;
    //   615: astore #33
    //   617: aload #30
    //   619: getfield c : Lqn1;
    //   622: astore #32
    //   624: aload #33
    //   626: ifnonnull -> 632
    //   629: goto -> 2851
    //   632: invokestatic currentTimeMillis : ()J
    //   635: ldc2_w 30000
    //   638: ladd
    //   639: lstore #18
    //   641: new wo
    //   644: dup
    //   645: aload #33
    //   647: invokevirtual j : ()Landroid/net/Uri;
    //   650: invokevirtual toString : ()Ljava/lang/String;
    //   653: aconst_null
    //   654: invokespecial <init> : (Ljava/lang/String;Lq01;)V
    //   657: astore #31
    //   659: aload #33
    //   661: invokevirtual h : ()Ljava/lang/String;
    //   664: invokestatic C : (Ljava/lang/String;)Ljava/lang/String;
    //   667: astore_3
    //   668: iload_2
    //   669: ifeq -> 692
    //   672: aload_3
    //   673: aload_1
    //   674: invokevirtual b : ()Li51;
    //   677: getfield e : Ljava/lang/String;
    //   680: invokestatic c : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   683: ifne -> 692
    //   686: iconst_1
    //   687: istore #4
    //   689: goto -> 695
    //   692: iconst_0
    //   693: istore #4
    //   695: iload_2
    //   696: ifeq -> 1586
    //   699: iload #4
    //   701: ifeq -> 1571
    //   704: aload #33
    //   706: instanceof lw0
    //   709: ifeq -> 1571
    //   712: getstatic android/os/Build$VERSION.SDK_INT : I
    //   715: bipush #30
    //   717: if_icmplt -> 1571
    //   720: aload #33
    //   722: checkcast lw0
    //   725: astore #27
    //   727: aload #27
    //   729: getfield g : Ljava/lang/String;
    //   732: astore_0
    //   733: aload #27
    //   735: getfield h : Ljava/lang/String;
    //   738: astore #24
    //   740: new java/lang/StringBuilder
    //   743: astore_3
    //   744: aload_3
    //   745: invokespecial <init> : ()V
    //   748: aload_3
    //   749: aload #24
    //   751: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   754: pop
    //   755: aload_3
    //   756: aload #34
    //   758: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   761: pop
    //   762: aload_3
    //   763: invokevirtual toString : ()Ljava/lang/String;
    //   766: astore_3
    //   767: aload_3
    //   768: bipush #47
    //   770: invokestatic K0 : (Ljava/lang/String;C)I
    //   773: istore #5
    //   775: aload_3
    //   776: iconst_0
    //   777: iload #5
    //   779: invokevirtual substring : (II)Ljava/lang/String;
    //   782: astore_3
    //   783: aload_3
    //   784: getstatic android/os/Environment.DIRECTORY_MUSIC : Ljava/lang/String;
    //   787: invokestatic c : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   790: istore #12
    //   792: iload #12
    //   794: ifne -> 912
    //   797: aload_3
    //   798: getstatic android/os/Environment.DIRECTORY_PODCASTS : Ljava/lang/String;
    //   801: invokestatic c : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   804: ifne -> 912
    //   807: aload_3
    //   808: getstatic android/os/Environment.DIRECTORY_AUDIOBOOKS : Ljava/lang/String;
    //   811: invokestatic c : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   814: ifne -> 912
    //   817: aload_3
    //   818: ldc_w 'Recordings'
    //   821: invokestatic c : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   824: ifne -> 912
    //   827: aload_3
    //   828: ldc_w 'Ringtones'
    //   831: invokestatic c : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   834: ifeq -> 840
    //   837: goto -> 912
    //   840: aload_3
    //   841: getstatic android/os/Environment.DIRECTORY_DOWNLOADS : Ljava/lang/String;
    //   844: invokestatic c : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   847: ifne -> 888
    //   850: aload_3
    //   851: getstatic android/os/Environment.DIRECTORY_DOCUMENTS : Ljava/lang/String;
    //   854: invokestatic c : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   857: ifeq -> 863
    //   860: goto -> 888
    //   863: aconst_null
    //   864: astore_0
    //   865: iconst_0
    //   866: istore #5
    //   868: goto -> 936
    //   871: astore_0
    //   872: aconst_null
    //   873: astore_3
    //   874: aload_0
    //   875: astore #24
    //   877: aconst_null
    //   878: astore #28
    //   880: aload_3
    //   881: astore_0
    //   882: aload #28
    //   884: astore_3
    //   885: goto -> 1496
    //   888: aload_0
    //   889: astore_3
    //   890: ldc_w 'primary'
    //   893: aload_0
    //   894: invokevirtual equals : (Ljava/lang/Object;)Z
    //   897: ifeq -> 904
    //   900: ldc_w 'external_primary'
    //   903: astore_3
    //   904: aload_3
    //   905: invokestatic getContentUri : (Ljava/lang/String;)Landroid/net/Uri;
    //   908: astore_0
    //   909: goto -> 865
    //   912: aload_0
    //   913: astore_3
    //   914: ldc_w 'primary'
    //   917: aload_0
    //   918: invokevirtual equals : (Ljava/lang/Object;)Z
    //   921: ifeq -> 928
    //   924: ldc_w 'external_primary'
    //   927: astore_3
    //   928: aload_3
    //   929: invokestatic getContentUri : (Ljava/lang/String;)Landroid/net/Uri;
    //   932: astore_0
    //   933: iconst_1
    //   934: istore #5
    //   936: aload_0
    //   937: ifnull -> 1483
    //   940: aload #30
    //   942: getfield h : Ljava/lang/String;
    //   945: astore #35
    //   947: aload #35
    //   949: invokevirtual getClass : ()Ljava/lang/Class;
    //   952: pop
    //   953: getstatic java/util/Locale.ENGLISH : Ljava/util/Locale;
    //   956: astore_3
    //   957: aload_3
    //   958: invokevirtual getClass : ()Ljava/lang/Class;
    //   961: pop
    //   962: aload #35
    //   964: aload_3
    //   965: invokevirtual toLowerCase : (Ljava/util/Locale;)Ljava/lang/String;
    //   968: astore_3
    //   969: aload_3
    //   970: invokevirtual getClass : ()Ljava/lang/Class;
    //   973: pop
    //   974: aload #33
    //   976: checkcast lw0
    //   979: invokevirtual h : ()Ljava/lang/String;
    //   982: invokestatic J : (Ljava/lang/String;)Ljava/lang/String;
    //   985: astore #36
    //   987: aload_1
    //   988: invokevirtual b : ()Li51;
    //   991: getfield e : Ljava/lang/String;
    //   994: astore #37
    //   996: new java/lang/StringBuilder
    //   999: astore #35
    //   1001: aload #35
    //   1003: invokespecial <init> : ()V
    //   1006: aload #35
    //   1008: aload #36
    //   1010: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1013: pop
    //   1014: aload #35
    //   1016: ldc_w '.'
    //   1019: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1022: pop
    //   1023: aload #35
    //   1025: aload #37
    //   1027: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1030: pop
    //   1031: aload #35
    //   1033: invokevirtual toString : ()Ljava/lang/String;
    //   1036: astore #36
    //   1038: aload_3
    //   1039: ldc_w 'audiobook'
    //   1042: invokestatic H0 : (Ljava/lang/String;Ljava/lang/String;)Z
    //   1045: ifeq -> 1068
    //   1048: iconst_0
    //   1049: istore #13
    //   1051: iconst_1
    //   1052: istore #12
    //   1054: iconst_0
    //   1055: istore #15
    //   1057: iload #12
    //   1059: istore #14
    //   1061: iload #15
    //   1063: istore #12
    //   1065: goto -> 1096
    //   1068: aload_3
    //   1069: ldc_w 'podcast'
    //   1072: invokestatic H0 : (Ljava/lang/String;Ljava/lang/String;)Z
    //   1075: ifeq -> 1087
    //   1078: iconst_1
    //   1079: istore #13
    //   1081: iconst_0
    //   1082: istore #12
    //   1084: goto -> 1054
    //   1087: iconst_0
    //   1088: istore #13
    //   1090: iconst_0
    //   1091: istore #14
    //   1093: iconst_1
    //   1094: istore #12
    //   1096: invokestatic d : ()Landroid/content/Context;
    //   1099: invokevirtual getContentResolver : ()Landroid/content/ContentResolver;
    //   1102: astore #35
    //   1104: new android/content/ContentValues
    //   1107: astore_3
    //   1108: aload_3
    //   1109: invokespecial <init> : ()V
    //   1112: aload_3
    //   1113: aload #28
    //   1115: aload #36
    //   1117: invokevirtual put : (Ljava/lang/String;Ljava/lang/String;)V
    //   1120: new java/lang/StringBuilder
    //   1123: astore #36
    //   1125: aload #36
    //   1127: invokespecial <init> : ()V
    //   1130: aload #36
    //   1132: aload #24
    //   1134: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1137: pop
    //   1138: aload #36
    //   1140: aload #34
    //   1142: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1145: pop
    //   1146: aload_3
    //   1147: ldc_w 'relative_path'
    //   1150: aload #36
    //   1152: invokevirtual toString : ()Ljava/lang/String;
    //   1155: invokevirtual put : (Ljava/lang/String;Ljava/lang/String;)V
    //   1158: getstatic java/lang/Boolean.FALSE : Ljava/lang/Boolean;
    //   1161: astore #24
    //   1163: aload_3
    //   1164: ldc_w 'is_pending'
    //   1167: aload #24
    //   1169: invokevirtual put : (Ljava/lang/String;Ljava/lang/Boolean;)V
    //   1172: aload_3
    //   1173: ldc_w 'mime_type'
    //   1176: aload_1
    //   1177: invokevirtual b : ()Li51;
    //   1180: invokevirtual a : ()Ljava/lang/String;
    //   1183: invokevirtual put : (Ljava/lang/String;Ljava/lang/String;)V
    //   1186: iload #5
    //   1188: ifeq -> 1327
    //   1191: aload_3
    //   1192: ldc_w 'is_ringtone'
    //   1195: aload #24
    //   1197: invokevirtual put : (Ljava/lang/String;Ljava/lang/Boolean;)V
    //   1200: aload_3
    //   1201: ldc_w 'is_podcast'
    //   1204: iload #13
    //   1206: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   1209: invokevirtual put : (Ljava/lang/String;Ljava/lang/Boolean;)V
    //   1212: aload_3
    //   1213: ldc_w 'is_audiobook'
    //   1216: iload #14
    //   1218: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   1221: invokevirtual put : (Ljava/lang/String;Ljava/lang/Boolean;)V
    //   1224: aload_3
    //   1225: ldc_w 'is_music'
    //   1228: iload #12
    //   1230: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   1233: invokevirtual put : (Ljava/lang/String;Ljava/lang/Boolean;)V
    //   1236: aload_3
    //   1237: ldc_w 'title'
    //   1240: aload #29
    //   1242: getfield d : Ljava/lang/String;
    //   1245: invokevirtual put : (Ljava/lang/String;Ljava/lang/String;)V
    //   1248: aload_3
    //   1249: ldc_w 'artist'
    //   1252: aload #29
    //   1254: getfield e : Ljava/lang/String;
    //   1257: invokevirtual put : (Ljava/lang/String;Ljava/lang/String;)V
    //   1260: aload_3
    //   1261: ldc_w 'album'
    //   1264: aload #29
    //   1266: getfield f : Ljava/lang/String;
    //   1269: invokevirtual put : (Ljava/lang/String;Ljava/lang/String;)V
    //   1272: aload_3
    //   1273: ldc_w 'composer'
    //   1276: aload #29
    //   1278: getfield h : Ljava/lang/String;
    //   1281: invokevirtual put : (Ljava/lang/String;Ljava/lang/String;)V
    //   1284: aload_3
    //   1285: ldc_w 'album_artist'
    //   1288: aload #29
    //   1290: getfield g : Ljava/lang/String;
    //   1293: invokevirtual put : (Ljava/lang/String;Ljava/lang/String;)V
    //   1296: aload_3
    //   1297: ldc_w 'genre'
    //   1300: aload #29
    //   1302: getfield i : Ljava/lang/String;
    //   1305: invokevirtual put : (Ljava/lang/String;Ljava/lang/String;)V
    //   1308: aload_3
    //   1309: ldc_w 'duration'
    //   1312: lload #16
    //   1314: invokestatic valueOf : (J)Ljava/lang/Long;
    //   1317: invokevirtual put : (Ljava/lang/String;Ljava/lang/Long;)V
    //   1320: goto -> 1338
    //   1323: astore_0
    //   1324: goto -> 872
    //   1327: aload_3
    //   1328: ldc_w 'media_type'
    //   1331: iconst_2
    //   1332: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1335: invokevirtual put : (Ljava/lang/String;Ljava/lang/Integer;)V
    //   1338: aload #35
    //   1340: aload_0
    //   1341: aload_3
    //   1342: invokevirtual insert : (Landroid/net/Uri;Landroid/content/ContentValues;)Landroid/net/Uri;
    //   1345: astore_0
    //   1346: aload_0
    //   1347: ifnull -> 1478
    //   1350: invokestatic d : ()Landroid/content/Context;
    //   1353: invokevirtual getContentResolver : ()Landroid/content/ContentResolver;
    //   1356: aload_0
    //   1357: iconst_3
    //   1358: anewarray java/lang/String
    //   1361: dup
    //   1362: iconst_0
    //   1363: ldc_w 'relative_path'
    //   1366: aastore
    //   1367: dup
    //   1368: iconst_1
    //   1369: aload #28
    //   1371: aastore
    //   1372: dup
    //   1373: iconst_2
    //   1374: ldc_w '_id'
    //   1377: aastore
    //   1378: aconst_null
    //   1379: aconst_null
    //   1380: aconst_null
    //   1381: invokevirtual query : (Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   1384: astore #24
    //   1386: aload #24
    //   1388: ifnull -> 1478
    //   1391: aload #24
    //   1393: invokeinterface moveToFirst : ()Z
    //   1398: ifeq -> 1461
    //   1401: aload #24
    //   1403: iconst_0
    //   1404: invokeinterface getString : (I)Ljava/lang/String;
    //   1409: astore #34
    //   1411: aload #24
    //   1413: iconst_1
    //   1414: invokeinterface getString : (I)Ljava/lang/String;
    //   1419: astore #28
    //   1421: aload #24
    //   1423: iconst_2
    //   1424: invokeinterface getLong : (I)J
    //   1429: lstore #20
    //   1431: new lw0
    //   1434: astore_3
    //   1435: aload_3
    //   1436: aload_0
    //   1437: invokestatic getVolumeName : (Landroid/net/Uri;)Ljava/lang/String;
    //   1440: aload #34
    //   1442: aload #28
    //   1444: lload #20
    //   1446: iconst_0
    //   1447: iconst_1
    //   1448: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JZI)V
    //   1451: goto -> 1463
    //   1454: astore #24
    //   1456: aload_0
    //   1457: astore_3
    //   1458: goto -> 877
    //   1461: aconst_null
    //   1462: astore_3
    //   1463: aload #24
    //   1465: invokeinterface close : ()V
    //   1470: goto -> 1504
    //   1473: astore #24
    //   1475: goto -> 1496
    //   1478: aconst_null
    //   1479: astore_3
    //   1480: goto -> 1504
    //   1483: aconst_null
    //   1484: astore_0
    //   1485: goto -> 1478
    //   1488: astore_0
    //   1489: goto -> 872
    //   1492: astore_0
    //   1493: goto -> 1489
    //   1496: aload #24
    //   1498: invokevirtual printStackTrace : ()V
    //   1501: goto -> 1470
    //   1504: aload_3
    //   1505: ifnull -> 1531
    //   1508: aload_3
    //   1509: invokevirtual l : ()Z
    //   1512: ifeq -> 1531
    //   1515: aload_3
    //   1516: astore_0
    //   1517: iconst_1
    //   1518: istore #6
    //   1520: iload #4
    //   1522: istore #5
    //   1524: iload #6
    //   1526: istore #4
    //   1528: goto -> 1556
    //   1531: aload_0
    //   1532: ifnull -> 1547
    //   1535: invokestatic d : ()Landroid/content/Context;
    //   1538: invokevirtual getContentResolver : ()Landroid/content/ContentResolver;
    //   1541: aload_0
    //   1542: aconst_null
    //   1543: invokevirtual delete : (Landroid/net/Uri;Landroid/os/Bundle;)I
    //   1546: pop
    //   1547: iconst_0
    //   1548: istore #5
    //   1550: iconst_0
    //   1551: istore #4
    //   1553: aload #27
    //   1555: astore_0
    //   1556: iload #5
    //   1558: istore #6
    //   1560: iload #4
    //   1562: istore #5
    //   1564: iload #6
    //   1566: istore #4
    //   1568: goto -> 1599
    //   1571: getstatic in/krosbits/musicolet/MyApplication.F : Lyp1;
    //   1574: aload #33
    //   1576: invokevirtual l : (Lv00;)Lv00;
    //   1579: astore_0
    //   1580: iconst_0
    //   1581: istore #5
    //   1583: goto -> 1599
    //   1586: aload_0
    //   1587: aload #29
    //   1589: aload_1
    //   1590: lload #16
    //   1592: invokevirtual i : (Lvx1;Lcy1;J)Lv00;
    //   1595: astore_0
    //   1596: goto -> 1580
    //   1599: aload_0
    //   1600: ifnull -> 2844
    //   1603: iload_2
    //   1604: ifeq -> 1655
    //   1607: getstatic in/krosbits/musicolet/MusicService.V0 : Lwo;
    //   1610: aload #32
    //   1612: getfield f : Lwo;
    //   1615: invokestatic equals : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   1618: istore #13
    //   1620: iload #13
    //   1622: istore #12
    //   1624: iload #13
    //   1626: ifeq -> 1649
    //   1629: invokestatic o0 : ()Z
    //   1632: istore #14
    //   1634: iload #13
    //   1636: istore #12
    //   1638: iload #14
    //   1640: istore #13
    //   1642: goto -> 1661
    //   1645: astore_0
    //   1646: goto -> 2835
    //   1649: iconst_0
    //   1650: istore #13
    //   1652: goto -> 1661
    //   1655: iconst_0
    //   1656: istore #12
    //   1658: goto -> 1649
    //   1661: invokestatic d : ()Landroid/content/Context;
    //   1664: pop
    //   1665: aload #26
    //   1667: aload_0
    //   1668: invokestatic f : (Lv00;Lv00;)Z
    //   1671: ifeq -> 2844
    //   1674: aload_0
    //   1675: invokevirtual i : ()Lu00;
    //   1678: astore_3
    //   1679: aload_3
    //   1680: instanceof v00
    //   1683: ifeq -> 1694
    //   1686: aload_3
    //   1687: checkcast v00
    //   1690: astore_3
    //   1691: goto -> 1696
    //   1694: aconst_null
    //   1695: astore_3
    //   1696: iload_2
    //   1697: ifeq -> 2400
    //   1700: new java/util/HashMap
    //   1703: astore #26
    //   1705: aload #26
    //   1707: invokespecial <init> : ()V
    //   1710: iload #4
    //   1712: ifeq -> 1903
    //   1715: iload #5
    //   1717: ifeq -> 1732
    //   1720: aload #33
    //   1722: invokevirtual e : ()Z
    //   1725: pop
    //   1726: iconst_1
    //   1727: istore #4
    //   1729: goto -> 1906
    //   1732: aload_0
    //   1733: invokevirtual h : ()Ljava/lang/String;
    //   1736: invokestatic J : (Ljava/lang/String;)Ljava/lang/String;
    //   1739: astore #27
    //   1741: iconst_0
    //   1742: istore #4
    //   1744: iload #4
    //   1746: ifle -> 1795
    //   1749: new java/lang/StringBuilder
    //   1752: astore #24
    //   1754: aload #24
    //   1756: invokespecial <init> : ()V
    //   1759: aload #24
    //   1761: ldc_w '('
    //   1764: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1767: pop
    //   1768: aload #24
    //   1770: iload #4
    //   1772: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   1775: pop
    //   1776: aload #24
    //   1778: ldc_w ') '
    //   1781: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1784: pop
    //   1785: aload #24
    //   1787: invokevirtual toString : ()Ljava/lang/String;
    //   1790: astore #24
    //   1792: goto -> 1800
    //   1795: ldc_w ''
    //   1798: astore #24
    //   1800: aload_1
    //   1801: invokevirtual b : ()Li51;
    //   1804: getfield e : Ljava/lang/String;
    //   1807: astore #33
    //   1809: new java/lang/StringBuilder
    //   1812: astore #28
    //   1814: aload #28
    //   1816: invokespecial <init> : ()V
    //   1819: aload #28
    //   1821: aload #24
    //   1823: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1826: pop
    //   1827: aload #28
    //   1829: aload #27
    //   1831: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1834: pop
    //   1835: aload #28
    //   1837: ldc_w '.'
    //   1840: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1843: pop
    //   1844: aload #28
    //   1846: aload #33
    //   1848: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1851: pop
    //   1852: aload #28
    //   1854: invokevirtual toString : ()Ljava/lang/String;
    //   1857: astore #28
    //   1859: aload_3
    //   1860: ifnull -> 1891
    //   1863: aload_3
    //   1864: aload #28
    //   1866: invokevirtual A : (Ljava/lang/String;)Lv00;
    //   1869: astore #24
    //   1871: aload #24
    //   1873: ifnull -> 1891
    //   1876: aload #24
    //   1878: invokevirtual f : ()Z
    //   1881: iconst_1
    //   1882: if_icmpne -> 1891
    //   1885: iinc #4, 1
    //   1888: goto -> 1744
    //   1891: aload_0
    //   1892: aload #28
    //   1894: invokevirtual o : (Ljava/lang/String;)Z
    //   1897: ifeq -> 1903
    //   1900: goto -> 1726
    //   1903: iconst_0
    //   1904: istore #4
    //   1906: new km0
    //   1909: astore_1
    //   1910: aload #30
    //   1912: getfield b : I
    //   1915: istore #11
    //   1917: new qn1
    //   1920: astore_3
    //   1921: aload_3
    //   1922: aload #32
    //   1924: getfield f : Lwo;
    //   1927: aload #29
    //   1929: getfield d : Ljava/lang/String;
    //   1932: aload #29
    //   1934: getfield f : Ljava/lang/String;
    //   1937: aload #29
    //   1939: getfield e : Ljava/lang/String;
    //   1942: lload #16
    //   1944: l2i
    //   1945: invokespecial <init> : (Lwo;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V
    //   1948: aload #29
    //   1950: getfield i : Ljava/lang/String;
    //   1953: astore #24
    //   1955: aload #29
    //   1957: getfield h : Ljava/lang/String;
    //   1960: astore #27
    //   1962: aload #29
    //   1964: getfield g : Ljava/lang/String;
    //   1967: astore #28
    //   1969: aload #30
    //   1971: getfield k : J
    //   1974: lstore #22
    //   1976: aload #30
    //   1978: invokevirtual b : ()J
    //   1981: lstore #20
    //   1983: aload #30
    //   1985: getfield n : J
    //   1988: lstore #16
    //   1990: aload #30
    //   1992: invokevirtual e : ()I
    //   1995: istore #7
    //   1997: aload #30
    //   1999: invokevirtual i : ()I
    //   2002: istore #10
    //   2004: aload #30
    //   2006: invokevirtual g : ()I
    //   2009: istore #9
    //   2011: aload #30
    //   2013: invokevirtual k : ()I
    //   2016: istore #8
    //   2018: aload #29
    //   2020: getfield o : Ljava/lang/Integer;
    //   2023: astore #32
    //   2025: aload #32
    //   2027: ifnull -> 2040
    //   2030: aload #32
    //   2032: invokevirtual intValue : ()I
    //   2035: istore #5
    //   2037: goto -> 2043
    //   2040: iconst_0
    //   2041: istore #5
    //   2043: aload #29
    //   2045: getfield j : Ljava/lang/Integer;
    //   2048: astore #29
    //   2050: aload #29
    //   2052: ifnull -> 2065
    //   2055: aload #29
    //   2057: invokevirtual intValue : ()I
    //   2060: istore #6
    //   2062: goto -> 2068
    //   2065: iconst_0
    //   2066: istore #6
    //   2068: aload_1
    //   2069: iload #11
    //   2071: aload_3
    //   2072: aload #24
    //   2074: aload #27
    //   2076: aload #28
    //   2078: lload #22
    //   2080: lload #18
    //   2082: lload #20
    //   2084: lload #16
    //   2086: iload #7
    //   2088: iload #10
    //   2090: iload #9
    //   2092: iload #8
    //   2094: iload #5
    //   2096: iload #6
    //   2098: aload #30
    //   2100: getfield h : Ljava/lang/String;
    //   2103: aload #30
    //   2105: getfield i : Ljava/lang/String;
    //   2108: aload #30
    //   2110: getfield g : Ljava/lang/String;
    //   2113: aload #30
    //   2115: getfield u : I
    //   2118: invokespecial <init> : (ILqn1;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJJJIIIIIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V
    //   2121: getstatic in/krosbits/musicolet/MyApplication.j : Lwn1;
    //   2124: astore_3
    //   2125: new java/util/HashMap
    //   2128: astore #24
    //   2130: aload #24
    //   2132: invokespecial <init> : ()V
    //   2135: aload #24
    //   2137: aload #31
    //   2139: aload_1
    //   2140: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   2143: pop
    //   2144: aload_3
    //   2145: aload #24
    //   2147: invokevirtual y : (Ljava/util/HashMap;)V
    //   2150: iload #4
    //   2152: ifeq -> 2250
    //   2155: getstatic in/krosbits/musicolet/MyApplication.j : Lwn1;
    //   2158: astore_1
    //   2159: new java/util/HashMap
    //   2162: astore_3
    //   2163: aload_3
    //   2164: invokespecial <init> : ()V
    //   2167: aload_3
    //   2168: aload #31
    //   2170: aload_0
    //   2171: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   2174: pop
    //   2175: aload_1
    //   2176: aload_3
    //   2177: invokevirtual x : (Ljava/util/HashMap;)V
    //   2180: getstatic in/krosbits/musicolet/MyApplication.F : Lyp1;
    //   2183: aload_0
    //   2184: getfield b : Ld61;
    //   2187: invokevirtual toString : ()Ljava/lang/String;
    //   2190: invokevirtual d : (Ljava/lang/String;)Lv00;
    //   2193: astore_1
    //   2194: aload_1
    //   2195: ifnull -> 2218
    //   2198: aload_1
    //   2199: invokevirtual j : ()Landroid/net/Uri;
    //   2202: astore_1
    //   2203: aload_1
    //   2204: ifnull -> 2218
    //   2207: aload_1
    //   2208: invokevirtual toString : ()Ljava/lang/String;
    //   2211: astore_3
    //   2212: aload_3
    //   2213: astore_1
    //   2214: aload_3
    //   2215: ifnonnull -> 2231
    //   2218: aload_0
    //   2219: invokevirtual j : ()Landroid/net/Uri;
    //   2222: invokevirtual toString : ()Ljava/lang/String;
    //   2225: astore_1
    //   2226: aload_1
    //   2227: invokevirtual getClass : ()Ljava/lang/Class;
    //   2230: pop
    //   2231: new wo
    //   2234: astore_3
    //   2235: aload_3
    //   2236: aload_1
    //   2237: aconst_null
    //   2238: invokespecial <init> : (Ljava/lang/String;Lq01;)V
    //   2241: aload #26
    //   2243: aload #31
    //   2245: aload_3
    //   2246: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   2249: pop
    //   2250: getstatic in/krosbits/musicolet/MyApplication.j : Lwn1;
    //   2253: invokevirtual o : ()V
    //   2256: getstatic in/krosbits/musicolet/MyApplication.j : Lwn1;
    //   2259: getfield c : Llm0;
    //   2262: aload #26
    //   2264: putfield w : Ljava/util/HashMap;
    //   2267: invokestatic r : ()V
    //   2270: iconst_0
    //   2271: invokestatic q0 : (Z)V
    //   2274: ldc_w 2131886467
    //   2277: iconst_0
    //   2278: invokestatic O0 : (II)V
    //   2281: aload #25
    //   2283: invokevirtual f : ()Ljava/lang/Object;
    //   2286: astore_1
    //   2287: aload #25
    //   2289: aload_1
    //   2290: aload_1
    //   2291: checkcast cy1
    //   2294: aconst_null
    //   2295: fconst_0
    //   2296: fconst_0
    //   2297: fconst_0
    //   2298: aconst_null
    //   2299: fconst_0
    //   2300: aconst_null
    //   2301: aconst_null
    //   2302: aconst_null
    //   2303: aconst_null
    //   2304: aconst_null
    //   2305: aconst_null
    //   2306: aconst_null
    //   2307: aconst_null
    //   2308: aconst_null
    //   2309: getstatic in/krosbits/musicolet/MyApplication.F : Lyp1;
    //   2312: aload_0
    //   2313: getfield b : Ld61;
    //   2316: invokevirtual toString : ()Ljava/lang/String;
    //   2319: invokevirtual c : (Ljava/lang/String;)Lml0;
    //   2322: getfield b : Ljava/lang/String;
    //   2325: invokestatic a : (Ljava/lang/String;)Ljava/lang/String;
    //   2328: aconst_null
    //   2329: aconst_null
    //   2330: ldc_w 1835007
    //   2333: invokestatic a : (Lcy1;Ljava/util/List;FFFLi51;FLbp1;Lbp1;Lbp1;Lbp1;Lin/krosbits/nativex/Cn;Lcd1;Ljava/util/List;Li51;Ljava/lang/String;Ljava/lang/String;Landroid/util/Size;Landroid/graphics/Bitmap;I)Lcy1;
    //   2336: invokevirtual e : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   2339: istore_2
    //   2340: iload_2
    //   2341: ifeq -> 2397
    //   2344: iload #12
    //   2346: ifeq -> 2851
    //   2349: invokestatic z : ()Lxn1;
    //   2352: iconst_0
    //   2353: invokevirtual l : (I)V
    //   2356: getstatic in/krosbits/musicolet/MusicService.P0 : Lin/krosbits/musicolet/MusicService;
    //   2359: invokevirtual j0 : ()V
    //   2362: iload #13
    //   2364: ifeq -> 2851
    //   2367: getstatic in/krosbits/musicolet/MusicService.P0 : Lin/krosbits/musicolet/MusicService;
    //   2370: astore_0
    //   2371: aload_0
    //   2372: getfield j : Z
    //   2375: ifeq -> 2851
    //   2378: aload_0
    //   2379: iconst_0
    //   2380: anewarray java/lang/Integer
    //   2383: invokevirtual X : ([Ljava/lang/Integer;)V
    //   2386: goto -> 2851
    //   2389: astore_0
    //   2390: aload_0
    //   2391: invokevirtual printStackTrace : ()V
    //   2394: goto -> 2851
    //   2397: goto -> 2281
    //   2400: new im0
    //   2403: astore #27
    //   2405: aload #27
    //   2407: iconst_1
    //   2408: iconst_0
    //   2409: iconst_0
    //   2410: invokespecial <init> : (ZZZ)V
    //   2413: aload #27
    //   2415: iconst_1
    //   2416: putfield J : Z
    //   2419: aload #27
    //   2421: invokevirtual t : ()V
    //   2424: aload_3
    //   2425: ifnull -> 2844
    //   2428: aload_3
    //   2429: invokevirtual k : ()Z
    //   2432: iconst_1
    //   2433: if_icmpne -> 2844
    //   2436: aload_0
    //   2437: getfield b : Ld61;
    //   2440: invokevirtual toString : ()Ljava/lang/String;
    //   2443: astore #26
    //   2445: aload #26
    //   2447: invokestatic c : (Ljava/lang/String;)Ljava/lang/String;
    //   2450: astore #24
    //   2452: aload #24
    //   2454: ifnonnull -> 2463
    //   2457: aconst_null
    //   2458: astore #24
    //   2460: goto -> 2474
    //   2463: new ml0
    //   2466: dup
    //   2467: aload #24
    //   2469: invokespecial <init> : (Ljava/lang/String;)V
    //   2472: astore #24
    //   2474: aload #24
    //   2476: ifnull -> 2844
    //   2479: aload #27
    //   2481: invokevirtual o : ()V
    //   2484: aload #27
    //   2486: aload_3
    //   2487: getfield b : Ld61;
    //   2490: invokevirtual toString : ()Ljava/lang/String;
    //   2493: invokevirtual a : (Ljava/lang/String;)Ljava/lang/String;
    //   2496: ifnull -> 2504
    //   2499: iconst_1
    //   2500: istore_2
    //   2501: goto -> 2509
    //   2504: iconst_0
    //   2505: istore_2
    //   2506: goto -> 2501
    //   2509: aload_3
    //   2510: iconst_1
    //   2511: invokestatic y : (Lv00;Z)Lv00;
    //   2514: ifnull -> 2523
    //   2517: iconst_1
    //   2518: istore #12
    //   2520: goto -> 2526
    //   2523: iconst_0
    //   2524: istore #12
    //   2526: aload_3
    //   2527: iconst_1
    //   2528: invokestatic z : (Lv00;Z)Lv00;
    //   2531: ifnull -> 2540
    //   2534: iconst_1
    //   2535: istore #13
    //   2537: goto -> 2543
    //   2540: iconst_0
    //   2541: istore #13
    //   2543: iconst_1
    //   2544: iload_2
    //   2545: iload #12
    //   2547: iload #13
    //   2549: invokestatic c : (ZZZZ)I
    //   2552: istore #6
    //   2554: aload_1
    //   2555: invokevirtual b : ()Li51;
    //   2558: getfield e : Ljava/lang/String;
    //   2561: invokestatic f : (Ljava/lang/String;)I
    //   2564: istore #7
    //   2566: new km0
    //   2569: astore_1
    //   2570: new qn1
    //   2573: astore_3
    //   2574: new wo
    //   2577: astore #27
    //   2579: aload #27
    //   2581: aload_0
    //   2582: invokevirtual j : ()Landroid/net/Uri;
    //   2585: invokevirtual toString : ()Ljava/lang/String;
    //   2588: aconst_null
    //   2589: invokespecial <init> : (Ljava/lang/String;Lq01;)V
    //   2592: aload_3
    //   2593: aload #27
    //   2595: aload #29
    //   2597: getfield d : Ljava/lang/String;
    //   2600: aload #29
    //   2602: getfield f : Ljava/lang/String;
    //   2605: aload #29
    //   2607: getfield e : Ljava/lang/String;
    //   2610: lload #16
    //   2612: l2i
    //   2613: invokespecial <init> : (Lwo;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V
    //   2616: aload #29
    //   2618: getfield i : Ljava/lang/String;
    //   2621: astore #27
    //   2623: aload #29
    //   2625: getfield h : Ljava/lang/String;
    //   2628: astore #30
    //   2630: aload #29
    //   2632: getfield g : Ljava/lang/String;
    //   2635: astore #28
    //   2637: aload #29
    //   2639: getfield o : Ljava/lang/Integer;
    //   2642: astore #31
    //   2644: aload #31
    //   2646: ifnull -> 2659
    //   2649: aload #31
    //   2651: invokevirtual intValue : ()I
    //   2654: istore #4
    //   2656: goto -> 2662
    //   2659: iconst_0
    //   2660: istore #4
    //   2662: aload #29
    //   2664: getfield j : Ljava/lang/Integer;
    //   2667: astore #29
    //   2669: aload #29
    //   2671: ifnull -> 2684
    //   2674: aload #29
    //   2676: invokevirtual intValue : ()I
    //   2679: istore #5
    //   2681: goto -> 2687
    //   2684: iconst_0
    //   2685: istore #5
    //   2687: aload_1
    //   2688: iconst_0
    //   2689: aload_3
    //   2690: aload #27
    //   2692: aload #30
    //   2694: aload #28
    //   2696: lload #18
    //   2698: lload #18
    //   2700: lconst_0
    //   2701: lconst_0
    //   2702: iconst_0
    //   2703: iconst_0
    //   2704: iconst_0
    //   2705: iconst_0
    //   2706: iload #4
    //   2708: iload #5
    //   2710: aload #24
    //   2712: invokevirtual e : ()Ljava/lang/String;
    //   2715: aload #24
    //   2717: getfield b : Ljava/lang/String;
    //   2720: invokestatic b : (Ljava/lang/String;)Ljava/lang/String;
    //   2723: aload #26
    //   2725: invokestatic b : (Ljava/lang/String;)Ljava/lang/String;
    //   2728: iload #6
    //   2730: iload #7
    //   2732: ior
    //   2733: invokespecial <init> : (ILqn1;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJJJIIIIIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V
    //   2736: getstatic in/krosbits/musicolet/MyApplication.j : Lwn1;
    //   2739: iconst_1
    //   2740: anewarray km0
    //   2743: dup
    //   2744: iconst_0
    //   2745: aload_1
    //   2746: aastore
    //   2747: invokestatic g0 : ([Ljava/lang/Object;)Ljava/util/ArrayList;
    //   2750: invokevirtual p : (Ljava/util/ArrayList;)V
    //   2753: getstatic in/krosbits/musicolet/MyApplication.j : Lwn1;
    //   2756: invokevirtual o : ()V
    //   2759: invokestatic r : ()V
    //   2762: ldc_w 2131886467
    //   2765: iconst_0
    //   2766: invokestatic O0 : (II)V
    //   2769: aload #25
    //   2771: invokevirtual f : ()Ljava/lang/Object;
    //   2774: astore_1
    //   2775: aload #25
    //   2777: aload_1
    //   2778: aload_1
    //   2779: checkcast cy1
    //   2782: aconst_null
    //   2783: fconst_0
    //   2784: fconst_0
    //   2785: fconst_0
    //   2786: aconst_null
    //   2787: fconst_0
    //   2788: aconst_null
    //   2789: aconst_null
    //   2790: aconst_null
    //   2791: aconst_null
    //   2792: aconst_null
    //   2793: aconst_null
    //   2794: aconst_null
    //   2795: aconst_null
    //   2796: aconst_null
    //   2797: getstatic in/krosbits/musicolet/MyApplication.F : Lyp1;
    //   2800: aload_0
    //   2801: getfield b : Ld61;
    //   2804: invokevirtual toString : ()Ljava/lang/String;
    //   2807: invokevirtual c : (Ljava/lang/String;)Lml0;
    //   2810: getfield b : Ljava/lang/String;
    //   2813: invokestatic a : (Ljava/lang/String;)Ljava/lang/String;
    //   2816: aconst_null
    //   2817: aconst_null
    //   2818: ldc_w 1835007
    //   2821: invokestatic a : (Lcy1;Ljava/util/List;FFFLi51;FLbp1;Lbp1;Lbp1;Lbp1;Lin/krosbits/nativex/Cn;Lcd1;Ljava/util/List;Li51;Ljava/lang/String;Ljava/lang/String;Landroid/util/Size;Landroid/graphics/Bitmap;I)Lcy1;
    //   2824: invokevirtual e : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   2827: istore_2
    //   2828: iload_2
    //   2829: ifeq -> 2769
    //   2832: goto -> 2851
    //   2835: aload_0
    //   2836: invokevirtual printStackTrace : ()V
    //   2839: goto -> 2844
    //   2842: aload_0
    //   2843: athrow
    //   2844: ldc_w 2131886550
    //   2847: iconst_0
    //   2848: invokestatic O0 : (II)V
    //   2851: return
    //   2852: astore_0
    //   2853: goto -> 1547
    // Exception table:
    //   from	to	target	type
    //   50	57	70	org/jaudiotagger/audio/exceptions/UnknownFileFormatException
    //   50	57	70	org/jaudiotagger/tag/TagException
    //   50	57	70	org/jaudiotagger/audio/exceptions/InvalidAudioFrameException
    //   50	57	60	finally
    //   62	67	558	java/util/concurrent/CancellationException
    //   62	67	550	finally
    //   72	79	82	finally
    //   84	89	558	java/util/concurrent/CancellationException
    //   84	89	550	finally
    //   92	96	558	java/util/concurrent/CancellationException
    //   92	96	550	finally
    //   101	108	558	java/util/concurrent/CancellationException
    //   101	108	550	finally
    //   113	135	558	java/util/concurrent/CancellationException
    //   113	135	550	finally
    //   135	224	558	java/util/concurrent/CancellationException
    //   135	224	246	finally
    //   229	243	558	java/util/concurrent/CancellationException
    //   229	243	246	finally
    //   254	275	558	java/util/concurrent/CancellationException
    //   254	275	246	finally
    //   280	294	558	java/util/concurrent/CancellationException
    //   280	294	246	finally
    //   300	321	558	java/util/concurrent/CancellationException
    //   300	321	246	finally
    //   326	336	558	java/util/concurrent/CancellationException
    //   326	336	246	finally
    //   342	397	558	java/util/concurrent/CancellationException
    //   342	397	246	finally
    //   402	414	558	java/util/concurrent/CancellationException
    //   402	414	246	finally
    //   414	439	558	java/util/concurrent/CancellationException
    //   414	439	246	finally
    //   439	538	558	java/util/concurrent/CancellationException
    //   439	538	545	finally
    //   740	767	1492	finally
    //   767	775	1488	finally
    //   775	792	871	finally
    //   797	837	871	finally
    //   840	860	871	finally
    //   890	900	871	finally
    //   904	909	871	finally
    //   914	924	871	finally
    //   928	933	871	finally
    //   940	996	871	finally
    //   996	1048	1323	finally
    //   1068	1078	1323	finally
    //   1096	1186	1323	finally
    //   1191	1320	1323	finally
    //   1327	1338	1323	finally
    //   1338	1346	1323	finally
    //   1350	1386	1454	finally
    //   1391	1451	1454	finally
    //   1463	1470	1473	finally
    //   1535	1547	2852	finally
    //   1607	1620	1645	finally
    //   1629	1634	1645	finally
    //   1661	1691	1645	finally
    //   1700	1710	1645	finally
    //   1720	1726	1645	finally
    //   1732	1741	1645	finally
    //   1749	1792	1645	finally
    //   1800	1859	1645	finally
    //   1863	1871	1645	finally
    //   1876	1885	1645	finally
    //   1891	1900	1645	finally
    //   1906	2025	1645	finally
    //   2030	2037	1645	finally
    //   2043	2050	1645	finally
    //   2055	2062	1645	finally
    //   2068	2150	1645	finally
    //   2155	2194	1645	finally
    //   2198	2203	1645	finally
    //   2207	2212	1645	finally
    //   2218	2231	1645	finally
    //   2231	2250	1645	finally
    //   2250	2281	1645	finally
    //   2281	2340	1645	finally
    //   2349	2362	2389	finally
    //   2367	2386	2389	finally
    //   2390	2394	1645	finally
    //   2400	2424	1645	finally
    //   2428	2452	1645	finally
    //   2463	2474	1645	finally
    //   2479	2499	1645	finally
    //   2509	2517	1645	finally
    //   2526	2534	1645	finally
    //   2543	2644	1645	finally
    //   2649	2656	1645	finally
    //   2662	2669	1645	finally
    //   2674	2681	1645	finally
    //   2687	2769	1645	finally
    //   2769	2828	1645	finally
  }
  
  public static final void g(by1 paramby1, xs paramxs, byte[] paramArrayOfbyte) {
    vx1 vx11 = paramby1.e;
    if (paramArrayOfbyte != null) {
      Bitmap bitmap = p3.b(paramArrayOfbyte, 0, 0);
      wf2.q(paramxs);
      if (bitmap != null) {
        File file2 = MyApplication.i.getApplicationContext().getCacheDir();
        long l = System.currentTimeMillis();
        StringBuilder stringBuilder = new StringBuilder("tr_aa_");
        stringBuilder.append(l);
        File file1 = new File(file2, stringBuilder.toString());
        file1.createNewFile();
        file1.deleteOnExit();
        cd1 cd1 = v00.s(file1);
        if (vx11 != null) {
          ArrayList<cd1> arrayList = vx11.p;
          if (arrayList != null)
            arrayList.add(cd1); 
        } 
        FileOutputStream fileOutputStream = ws2.o(cd1);
        bitmap.compress(Bitmap.CompressFormat.JPEG, 90, fileOutputStream);
        fileOutputStream.flush();
        fileOutputStream.close();
        if (vx11 != null)
          vx11.n = cd1.e; 
      } 
    } 
  }
  
  public static float j(float paramFloat1, float paramFloat2) {
    float f1 = paramFloat1 + paramFloat2;
    if (paramFloat2 == 0.0F)
      return paramFloat1; 
    float f2 = f1 % paramFloat2;
    if (f2 == 0.0F)
      return f1; 
    if (paramFloat2 > 0.0F)
      paramFloat1 = f1; 
    return paramFloat1 - f2;
  }
  
  public static void m(Tag paramTag, FieldKey paramFieldKey, String paramString) {
    if (paramString != null) {
      paramString = gq1.Q0(paramString).toString();
      if (paramString != null && paramString.length() > 0)
        paramTag.setField(paramFieldKey, new String[] { paramString }); 
    } 
  }
  
  public final void h() {
    cy1 cy1 = (cy1)this.d.b.f();
    vj0 vj02 = cy1.j;
    if (vj02 != null)
      vj02.c(null); 
    vj02 = cy1.k;
    if (vj02 != null)
      vj02.c(null); 
    Cn cn = cy1.n;
    if (cn != null)
      cn.a(); 
    vj0 vj01 = cy1.m;
    if (vj01 != null)
      vj01.c(null); 
  }
  
  public final v00 i(vx1 paramvx1, cy1 paramcy1, long paramLong) {
    try {
      String str = this.b.h;
      str.getClass();
      Locale locale = Locale.ENGLISH;
      locale.getClass();
      str = str.toLowerCase(locale);
      str.getClass();
      boolean bool = paramcy1.b;
      boolean bool1 = false;
      if (bool) {
        str = Environment.DIRECTORY_RINGTONES;
        str.getClass();
        bool = true;
        boolean bool4 = false;
      } else {
        if (gq1.H0(str, "audiobook")) {
          if (Build.VERSION.SDK_INT >= 29) {
            str = k91.d();
            str.getClass();
          } else {
            str = "Audiobooks";
          } 
          boolean bool6 = true;
          bool = false;
          boolean bool5 = false;
          boolean bool7 = bool5;
        } else {
          if (gq1.H0(str, kOkiWEITVb.NPSqfsrW)) {
            str = Environment.DIRECTORY_PODCASTS;
            str.getClass();
            boolean bool7 = true;
            bool = false;
          } else {
            str = Environment.DIRECTORY_MUSIC;
            str.getClass();
            boolean bool10 = true;
            bool = false;
            boolean bool8 = false;
            boolean bool9 = bool8;
            str = str.concat("/Audio Cutter/");
            boolean bool7 = bool1;
          } 
          boolean bool5 = false;
          boolean bool6 = false;
        } 
        str = str.concat("/Audio Cutter/");
        boolean bool4 = bool1;
      } 
    } finally {
      paramvx1 = null;
      paramvx1.printStackTrace();
    } 
  }
  
  public final void k(boolean paramBoolean) {
    ip1 ip11;
    cy1 cy1 = (cy1)this.d.b.f();
    Object object = qv.C(this);
    yw yw = e00.a;
    bp1 bp1 = qv.L((xs)object, fw.e, null, new zx1(this, cy1, paramBoolean, null), 2);
    do {
      ip11 = this.c;
      object = ip11.f();
    } while (!ip11.e(object, cy1.a((cy1)object, null, 0.0F, 0.0F, 0.0F, null, 0.0F, null, null, null, bp1, null, null, null, null, null, null, null, null, 2093055)));
  }
  
  public final void l(float paramFloat) {
    cy1 cy1;
    ip1 ip11;
    Object object;
    do {
      ip11 = this.c;
      object = ip11.f();
      cy1 cy11 = (cy1)object;
      cy1 = cy11;
      if (paramFloat < 0.0F)
        continue; 
      cy1 = cy11;
      if (paramFloat > cy11.a.c.g)
        continue; 
      cy1 = cy1.a(cy11, null, paramFloat, 0.0F, 0.0F, null, 0.0F, null, null, null, null, null, null, null, null, null, null, null, null, 2097135);
    } while (!ip11.e(object, cy1));
  }
  
  public final void n(List<Number> paramList) {
    cy1 cy1;
    ip1 ip11;
    Object object;
    do {
      ip11 = this.c;
      object = ip11.f();
      cy1 = (cy1)object;
      if (((Number)paramList.get(0)).floatValue() < 0.0F || ((Number)paramList.get(1)).floatValue() < ((Number)paramList.get(0)).floatValue() + 2000.0F || ((Number)paramList.get(1)).floatValue() > cy1.a.c.g)
        continue; 
      cy1 = cy1.a(cy1, paramList, 0.0F, 0.0F, 0.0F, null, 0.0F, null, null, null, null, null, null, null, null, null, null, null, null, 2097147);
    } while (!ip11.e(object, cy1));
  }
  
  public final void o() {
    ip1 ip11;
    cy1 cy1 = (cy1)this.d.b.f();
    Object object = qv.C(this);
    yw yw = e00.a;
    bp1 bp1 = qv.L((xs)object, fw.e, null, new nn(cy1, this, null), 2);
    do {
      ip11 = this.c;
      object = ip11.f();
    } while (!ip11.e(object, cy1.a((cy1)object, null, 0.0F, 0.0F, 0.0F, null, 0.0F, null, bp1, null, null, null, null, null, null, null, null, null, null, 2096127)));
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\by1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
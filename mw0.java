import android.content.Context;
import android.net.Uri;

public final class mw0 extends yr {
  public static final String[] d = new String[] { "orientation" };
  
  public final int c;
  
  public final boolean b(zf1 paramzf1) {
    boolean bool;
    switch (this.c) {
      default:
        return "file".equals(paramzf1.b.getScheme());
      case 0:
        break;
    } 
    Uri uri = paramzf1.b;
    if ("content".equals(uri.getScheme()) && "media".equals(uri.getAuthority())) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public final m40 e(zf1 paramzf1) {
    // Byte code:
    //   0: aload_0
    //   1: getfield c : I
    //   4: istore_3
    //   5: iconst_0
    //   6: istore_2
    //   7: aload_0
    //   8: getfield b : Ljava/lang/Object;
    //   11: astore #12
    //   13: aconst_null
    //   14: astore #13
    //   16: iload_3
    //   17: tableswitch default -> 36, 0 -> 125
    //   36: aload #12
    //   38: checkcast android/content/Context
    //   41: invokevirtual getContentResolver : ()Landroid/content/ContentResolver;
    //   44: aload_1
    //   45: getfield b : Landroid/net/Uri;
    //   48: invokevirtual openInputStream : (Landroid/net/Uri;)Ljava/io/InputStream;
    //   51: astore #12
    //   53: new android/media/ExifInterface
    //   56: dup
    //   57: aload_1
    //   58: getfield b : Landroid/net/Uri;
    //   61: invokevirtual getPath : ()Ljava/lang/String;
    //   64: invokespecial <init> : (Ljava/lang/String;)V
    //   67: getstatic com/google/android/gms/common/api/Gldr/hbrAVtEa.FLOrFyqcFp : Ljava/lang/String;
    //   70: iconst_1
    //   71: invokevirtual getAttributeInt : (Ljava/lang/String;I)I
    //   74: istore_3
    //   75: iload_3
    //   76: iconst_3
    //   77: if_icmpeq -> 108
    //   80: iload_3
    //   81: bipush #6
    //   83: if_icmpeq -> 102
    //   86: iload_3
    //   87: bipush #8
    //   89: if_icmpeq -> 95
    //   92: goto -> 112
    //   95: sipush #270
    //   98: istore_2
    //   99: goto -> 112
    //   102: bipush #90
    //   104: istore_2
    //   105: goto -> 112
    //   108: sipush #180
    //   111: istore_2
    //   112: new m40
    //   115: dup
    //   116: aconst_null
    //   117: aload #12
    //   119: iconst_2
    //   120: iload_2
    //   121: invokespecial <init> : (Landroid/graphics/Bitmap;Ljava/io/InputStream;II)V
    //   124: areturn
    //   125: aload #12
    //   127: checkcast android/content/Context
    //   130: astore #14
    //   132: aload #14
    //   134: invokevirtual getContentResolver : ()Landroid/content/ContentResolver;
    //   137: astore #16
    //   139: aload_1
    //   140: getfield b : Landroid/net/Uri;
    //   143: astore #17
    //   145: aload_1
    //   146: getfield b : Landroid/net/Uri;
    //   149: astore #15
    //   151: aload #16
    //   153: aload #17
    //   155: getstatic mw0.d : [Ljava/lang/String;
    //   158: aconst_null
    //   159: aconst_null
    //   160: aconst_null
    //   161: invokevirtual query : (Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   164: astore #12
    //   166: aload #12
    //   168: ifnull -> 208
    //   171: aload #12
    //   173: invokeinterface moveToFirst : ()Z
    //   178: ifne -> 184
    //   181: goto -> 208
    //   184: aload #12
    //   186: iconst_0
    //   187: invokeinterface getInt : (I)I
    //   192: istore #6
    //   194: aload #12
    //   196: invokeinterface close : ()V
    //   201: goto -> 264
    //   204: astore_1
    //   205: goto -> 242
    //   208: aload #12
    //   210: ifnull -> 220
    //   213: aload #12
    //   215: invokeinterface close : ()V
    //   220: iconst_0
    //   221: istore #6
    //   223: goto -> 264
    //   226: astore_1
    //   227: aload #13
    //   229: astore #12
    //   231: goto -> 242
    //   234: astore #12
    //   236: aconst_null
    //   237: astore #12
    //   239: goto -> 256
    //   242: aload #12
    //   244: ifnull -> 254
    //   247: aload #12
    //   249: invokeinterface close : ()V
    //   254: aload_1
    //   255: athrow
    //   256: aload #12
    //   258: ifnull -> 220
    //   261: goto -> 213
    //   264: aload #16
    //   266: aload #17
    //   268: invokevirtual getType : (Landroid/net/Uri;)Ljava/lang/String;
    //   271: astore #12
    //   273: aload #12
    //   275: ifnull -> 294
    //   278: aload #12
    //   280: ldc 'video/'
    //   282: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   285: ifeq -> 294
    //   288: iconst_1
    //   289: istore #7
    //   291: goto -> 297
    //   294: iconst_0
    //   295: istore #7
    //   297: aload_1
    //   298: invokevirtual a : ()Z
    //   301: ifeq -> 591
    //   304: aload_1
    //   305: getfield e : I
    //   308: istore_3
    //   309: aload_1
    //   310: getfield f : I
    //   313: istore_2
    //   314: iload_3
    //   315: bipush #96
    //   317: if_icmpgt -> 331
    //   320: iload_2
    //   321: bipush #96
    //   323: if_icmpgt -> 331
    //   326: iconst_1
    //   327: istore_3
    //   328: goto -> 352
    //   331: iload_3
    //   332: sipush #512
    //   335: if_icmpgt -> 350
    //   338: iload_2
    //   339: sipush #384
    //   342: if_icmpgt -> 350
    //   345: iconst_2
    //   346: istore_3
    //   347: goto -> 352
    //   350: iconst_3
    //   351: istore_3
    //   352: iload_3
    //   353: iconst_1
    //   354: if_icmpeq -> 379
    //   357: iload_3
    //   358: iconst_2
    //   359: if_icmpeq -> 374
    //   362: iload_3
    //   363: iconst_3
    //   364: if_icmpne -> 372
    //   367: iconst_2
    //   368: istore_2
    //   369: goto -> 381
    //   372: aconst_null
    //   373: athrow
    //   374: iconst_1
    //   375: istore_2
    //   376: goto -> 381
    //   379: iconst_3
    //   380: istore_2
    //   381: iload #7
    //   383: ifne -> 416
    //   386: iload_3
    //   387: iconst_3
    //   388: if_icmpne -> 416
    //   391: new m40
    //   394: dup
    //   395: aconst_null
    //   396: aload #14
    //   398: invokevirtual getContentResolver : ()Landroid/content/ContentResolver;
    //   401: aload #15
    //   403: invokevirtual openInputStream : (Landroid/net/Uri;)Ljava/io/InputStream;
    //   406: iconst_2
    //   407: iload #6
    //   409: invokespecial <init> : (Landroid/graphics/Bitmap;Ljava/io/InputStream;II)V
    //   412: astore_1
    //   413: goto -> 613
    //   416: aload #17
    //   418: invokestatic parseId : (Landroid/net/Uri;)J
    //   421: lstore #10
    //   423: aload_1
    //   424: invokestatic c : (Lzf1;)Landroid/graphics/BitmapFactory$Options;
    //   427: astore #12
    //   429: aload #12
    //   431: iconst_1
    //   432: putfield inJustDecodeBounds : Z
    //   435: aload_1
    //   436: getfield e : I
    //   439: istore #8
    //   441: aload_1
    //   442: getfield f : I
    //   445: istore #9
    //   447: iload_3
    //   448: iconst_1
    //   449: if_icmpeq -> 478
    //   452: iload_3
    //   453: iconst_2
    //   454: if_icmpeq -> 470
    //   457: iload_3
    //   458: iconst_3
    //   459: if_icmpne -> 468
    //   462: iconst_m1
    //   463: istore #4
    //   465: goto -> 482
    //   468: aconst_null
    //   469: athrow
    //   470: sipush #512
    //   473: istore #4
    //   475: goto -> 482
    //   478: bipush #96
    //   480: istore #4
    //   482: iload_3
    //   483: iconst_1
    //   484: if_icmpeq -> 513
    //   487: iload_3
    //   488: iconst_2
    //   489: if_icmpeq -> 505
    //   492: iload_3
    //   493: iconst_3
    //   494: if_icmpne -> 503
    //   497: iconst_m1
    //   498: istore #5
    //   500: goto -> 517
    //   503: aconst_null
    //   504: athrow
    //   505: sipush #384
    //   508: istore #5
    //   510: goto -> 517
    //   513: bipush #96
    //   515: istore #5
    //   517: iload #8
    //   519: iload #9
    //   521: iload #4
    //   523: iload #5
    //   525: aload #12
    //   527: aload_1
    //   528: invokestatic a : (IIIILandroid/graphics/BitmapFactory$Options;Lzf1;)V
    //   531: iload #7
    //   533: ifeq -> 557
    //   536: iload_3
    //   537: iconst_3
    //   538: if_icmpne -> 543
    //   541: iconst_1
    //   542: istore_2
    //   543: aload #16
    //   545: lload #10
    //   547: iload_2
    //   548: aload #12
    //   550: invokestatic getThumbnail : (Landroid/content/ContentResolver;JILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    //   553: astore_1
    //   554: goto -> 568
    //   557: aload #16
    //   559: lload #10
    //   561: iload_2
    //   562: aload #12
    //   564: invokestatic getThumbnail : (Landroid/content/ContentResolver;JILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    //   567: astore_1
    //   568: aload_1
    //   569: ifnull -> 588
    //   572: new m40
    //   575: dup
    //   576: aload_1
    //   577: aconst_null
    //   578: iconst_2
    //   579: iload #6
    //   581: invokespecial <init> : (Landroid/graphics/Bitmap;Ljava/io/InputStream;II)V
    //   584: astore_1
    //   585: goto -> 613
    //   588: goto -> 591
    //   591: new m40
    //   594: dup
    //   595: aconst_null
    //   596: aload #14
    //   598: invokevirtual getContentResolver : ()Landroid/content/ContentResolver;
    //   601: aload #15
    //   603: invokevirtual openInputStream : (Landroid/net/Uri;)Ljava/io/InputStream;
    //   606: iconst_2
    //   607: iload #6
    //   609: invokespecial <init> : (Landroid/graphics/Bitmap;Ljava/io/InputStream;II)V
    //   612: astore_1
    //   613: aload_1
    //   614: areturn
    //   615: astore #13
    //   617: goto -> 256
    // Exception table:
    //   from	to	target	type
    //   151	166	234	java/lang/RuntimeException
    //   151	166	226	finally
    //   171	181	615	java/lang/RuntimeException
    //   171	181	204	finally
    //   184	194	615	java/lang/RuntimeException
    //   184	194	204	finally
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\mw0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
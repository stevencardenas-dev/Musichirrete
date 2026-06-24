import android.content.Context;
import android.graphics.Bitmap;
import in.krosbits.musicolet.MyApplication;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class j52 {
  public static final ThreadPoolExecutor n;
  
  public static j52 o;
  
  public final boolean a;
  
  public final boolean b;
  
  public int c;
  
  public int d;
  
  public int e;
  
  public int f;
  
  public int g;
  
  public Bitmap h;
  
  public boolean i;
  
  public final km0 j;
  
  public final boolean[] k;
  
  public z2 l;
  
  public final int m;
  
  static {
    LinkedBlockingQueue<Runnable> linkedBlockingQueue = new LinkedBlockingQueue();
    n = new ThreadPoolExecutor(1, 1, 10L, TimeUnit.MILLISECONDS, linkedBlockingQueue);
  }
  
  public j52(Context paramContext, km0 paramkm0, boolean paramBoolean) {
    boolean bool = true;
    this.k = new boolean[] { false };
    this.j = paramkm0;
    this.a = false;
    this.b = true;
    this.c = MyApplication.i.getApplicationContext().getResources().getColor(2131100755);
    this.d = MyApplication.i.getApplicationContext().getResources().getColor(2131100780);
    this.e = this.c | 0xFF000000;
    this.f = 255;
    this.g = MyApplication.i.getApplicationContext().getResources().getColor(2131099836);
    this.h = null;
    int i = MyApplication.o().getInt("k_i_wdth", 1);
    this.m = i;
    if (i == 0) {
      this.a = true;
      this.c = MyApplication.i.getApplicationContext().getResources().getColor(2131100750);
      this.d = MyApplication.i.getApplicationContext().getResources().getColor(2131100775);
      this.e = this.c | 0xFF000000;
      this.f = 255;
      this.g = MyApplication.i.getApplicationContext().getResources().getColor(2131100798);
      return;
    } 
    if (i == 2) {
      this.b = false;
      if (((paramContext.getResources().getConfiguration()).uiMode & 0x30) != 32) {
        paramBoolean = bool;
      } else {
        paramBoolean = false;
      } 
      this.a = paramBoolean;
      if (paramBoolean) {
        this.c = MyApplication.i.getApplicationContext().getResources().getColor(2131100750);
        this.d = MyApplication.i.getApplicationContext().getResources().getColor(2131100775);
        this.e = this.c | 0xFF000000;
        this.f = 255;
        this.g = MyApplication.i.getApplicationContext().getResources().getColor(2131100798);
        return;
      } 
    } else if (i == 4) {
      if (paramBoolean) {
        b();
        return;
      } 
    } else if (i == 5 && paramBoolean) {
      j52 j521 = o;
      if (j521 != null) {
        this.c = j521.c;
        this.d = j521.d;
        this.e = j521.e;
        this.g = j521.g;
      } 
      b();
    } 
  }
  
  public final Bitmap a() {
    Bitmap bitmap = this.h;
    if (bitmap != null && !bitmap.isRecycled()) {
      bitmap = this.h;
      return bitmap.copy(bitmap.getConfig(), this.h.isMutable());
    } 
    return null;
  }
  
  public final void b() {
    /* monitor enter ThisExpression{ObjectType{j52}} */
    try {
      if (!this.i) {
        this.i = true;
        z2 z21 = new z2();
        this(4, this);
        this.l = z21;
        ThreadPoolExecutor threadPoolExecutor = n;
        String str = ag0.a;
        z21.executeOnExecutor(threadPoolExecutor, new Object[0]);
      } 
    } finally {
      Exception exception;
    } 
    /* monitor exit ThisExpression{ObjectType{j52}} */
  }
  
  public final void c(y51 paramy511, y51 paramy512) {
    // Byte code:
    //   0: aconst_null
    //   1: astore #15
    //   3: aload_1
    //   4: ifnonnull -> 13
    //   7: aconst_null
    //   8: astore #16
    //   10: goto -> 19
    //   13: aload_1
    //   14: getfield d : Lx51;
    //   17: astore #16
    //   19: aload #16
    //   21: ifnull -> 38
    //   24: aload_0
    //   25: aload_1
    //   26: getfield d : Lx51;
    //   29: getfield d : I
    //   32: ldc -16777216
    //   34: ior
    //   35: putfield g : I
    //   38: aload_1
    //   39: ifnull -> 197
    //   42: aload_2
    //   43: ifnull -> 197
    //   46: aload #16
    //   48: ifnull -> 197
    //   51: aload_2
    //   52: getstatic lt1.e : Llt1;
    //   55: invokevirtual g : (Llt1;)Lx51;
    //   58: astore #15
    //   60: aload_2
    //   61: getstatic lt1.h : Llt1;
    //   64: invokevirtual g : (Llt1;)Lx51;
    //   67: astore #17
    //   69: aload #15
    //   71: ifnull -> 96
    //   74: aload #15
    //   76: astore_1
    //   77: aload #15
    //   79: getfield d : I
    //   82: aload_0
    //   83: getfield g : I
    //   86: invokestatic d : (II)D
    //   89: ldc2_w 3.5
    //   92: dcmpg
    //   93: ifge -> 125
    //   96: aload_0
    //   97: getfield g : I
    //   100: invokestatic E0 : (I)Z
    //   103: ifeq -> 117
    //   106: aload_2
    //   107: getstatic lt1.d : Llt1;
    //   110: invokevirtual g : (Llt1;)Lx51;
    //   113: astore_1
    //   114: goto -> 125
    //   117: aload_2
    //   118: getstatic lt1.f : Llt1;
    //   121: invokevirtual g : (Llt1;)Lx51;
    //   124: astore_1
    //   125: aload #17
    //   127: ifnull -> 162
    //   130: aload #17
    //   132: astore #15
    //   134: aload #17
    //   136: getfield d : I
    //   139: aload_0
    //   140: getfield g : I
    //   143: invokestatic d : (II)D
    //   146: ldc2_w 3.0
    //   149: dcmpg
    //   150: ifge -> 156
    //   153: goto -> 162
    //   156: aload #15
    //   158: astore_2
    //   159: goto -> 202
    //   162: aload_0
    //   163: getfield g : I
    //   166: invokestatic E0 : (I)Z
    //   169: ifeq -> 186
    //   172: aload_2
    //   173: getstatic lt1.g : Llt1;
    //   176: invokevirtual g : (Llt1;)Lx51;
    //   179: astore_2
    //   180: aload_2
    //   181: astore #15
    //   183: goto -> 156
    //   186: aload_2
    //   187: getstatic lt1.i : Llt1;
    //   190: invokevirtual g : (Llt1;)Lx51;
    //   193: astore_2
    //   194: goto -> 180
    //   197: aconst_null
    //   198: astore_2
    //   199: aload #15
    //   201: astore_1
    //   202: aload #16
    //   204: ifnull -> 536
    //   207: aload_1
    //   208: ifnull -> 227
    //   211: aload_1
    //   212: getfield d : I
    //   215: istore #11
    //   217: iload #11
    //   219: ldc -16777216
    //   221: ior
    //   222: istore #14
    //   224: goto -> 242
    //   227: aload #16
    //   229: invokevirtual a : ()V
    //   232: aload #16
    //   234: getfield h : I
    //   237: istore #11
    //   239: goto -> 217
    //   242: aload_2
    //   243: ifnull -> 255
    //   246: aload_2
    //   247: getfield d : I
    //   250: istore #13
    //   252: goto -> 267
    //   255: aload #16
    //   257: invokevirtual a : ()V
    //   260: aload #16
    //   262: getfield g : I
    //   265: istore #13
    //   267: iload #14
    //   269: aload_0
    //   270: getfield g : I
    //   273: invokestatic d : (II)D
    //   276: dstore #9
    //   278: iload #13
    //   280: aload_0
    //   281: getfield g : I
    //   284: invokestatic d : (II)D
    //   287: dstore #5
    //   289: iload #13
    //   291: istore #12
    //   293: iload #14
    //   295: istore #11
    //   297: dload #9
    //   299: dstore #7
    //   301: dload #5
    //   303: dstore_3
    //   304: dload #9
    //   306: ldc2_w 3.5
    //   309: dcmpl
    //   310: iflt -> 382
    //   313: iload #13
    //   315: istore #12
    //   317: iload #14
    //   319: istore #11
    //   321: dload #9
    //   323: dstore #7
    //   325: dload #5
    //   327: dstore_3
    //   328: dload #5
    //   330: ldc2_w 3.0
    //   333: dcmpl
    //   334: iflt -> 382
    //   337: iload #13
    //   339: istore #12
    //   341: iload #14
    //   343: istore #11
    //   345: dload #9
    //   347: dstore #7
    //   349: dload #5
    //   351: dstore_3
    //   352: dload #5
    //   354: dload #9
    //   356: dsub
    //   357: ldc2_w 2.0
    //   360: dcmpl
    //   361: iflt -> 382
    //   364: iload #13
    //   366: ldc -16777216
    //   368: ior
    //   369: istore #11
    //   371: iload #14
    //   373: istore #12
    //   375: dload #9
    //   377: dstore_3
    //   378: dload #5
    //   380: dstore #7
    //   382: ldc2_w 2.147483647E9
    //   385: dstore #9
    //   387: dload #7
    //   389: dstore #5
    //   391: dload #7
    //   393: ldc2_w 3.5
    //   396: dcmpl
    //   397: iflt -> 405
    //   400: ldc2_w 2.147483647E9
    //   403: dstore #5
    //   405: dload_3
    //   406: dstore #7
    //   408: dload_3
    //   409: ldc2_w 3.0
    //   412: dcmpl
    //   413: iflt -> 421
    //   416: ldc2_w 2.147483647E9
    //   419: dstore #7
    //   421: dload #5
    //   423: dstore_3
    //   424: dload #5
    //   426: ldc2_w 3.5
    //   429: dcmpg
    //   430: ifge -> 452
    //   433: aload #16
    //   435: invokevirtual a : ()V
    //   438: aload #16
    //   440: getfield h : I
    //   443: ldc -16777216
    //   445: ior
    //   446: istore #11
    //   448: ldc2_w 2.147483647E9
    //   451: dstore_3
    //   452: dload #7
    //   454: ldc2_w 3.0
    //   457: dcmpg
    //   458: ifge -> 480
    //   461: aload #16
    //   463: invokevirtual a : ()V
    //   466: aload #16
    //   468: getfield g : I
    //   471: istore #12
    //   473: dload #9
    //   475: dstore #7
    //   477: goto -> 480
    //   480: iload #12
    //   482: istore #14
    //   484: iload #11
    //   486: istore #13
    //   488: dload_3
    //   489: dload #7
    //   491: dcmpg
    //   492: ifge -> 506
    //   495: iload #12
    //   497: ldc -16777216
    //   499: ior
    //   500: istore #13
    //   502: iload #11
    //   504: istore #14
    //   506: aload_0
    //   507: iload #13
    //   509: putfield c : I
    //   512: aload_0
    //   513: iload #13
    //   515: ldc -16777216
    //   517: ior
    //   518: putfield e : I
    //   521: aload_0
    //   522: iload #13
    //   524: invokestatic alpha : (I)I
    //   527: putfield f : I
    //   530: aload_0
    //   531: iload #14
    //   533: putfield d : I
    //   536: return
  }
  
  public final void d() {
    // Byte code:
    //   0: aload_0
    //   1: getfield k : [Z
    //   4: astore #17
    //   6: aconst_null
    //   7: astore #14
    //   9: aload_0
    //   10: getfield j : Lkm0;
    //   13: astore #13
    //   15: aload #13
    //   17: ifnull -> 319
    //   20: getstatic in/krosbits/musicolet/MyApplication.p : F
    //   23: ldc 120.0
    //   25: fmul
    //   26: f2i
    //   27: istore #12
    //   29: aload #17
    //   31: iconst_0
    //   32: baload
    //   33: ifne -> 311
    //   36: getstatic in/krosbits/musicolet/MyApplication.i : Lin/krosbits/musicolet/MyApplication;
    //   39: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   42: astore #15
    //   44: aload_0
    //   45: getfield a : Z
    //   48: ifeq -> 58
    //   51: ldc 2131230843
    //   53: istore #6
    //   55: goto -> 62
    //   58: ldc 2131230842
    //   60: istore #6
    //   62: aload #15
    //   64: aload #13
    //   66: iload #12
    //   68: iload #12
    //   70: iload #6
    //   72: invokestatic h : (Landroid/content/Context;Lkm0;III)Landroid/graphics/Bitmap;
    //   75: astore #15
    //   77: aload #17
    //   79: iconst_0
    //   80: baload
    //   81: ifne -> 303
    //   84: aload #15
    //   86: invokevirtual getWidth : ()I
    //   89: istore #11
    //   91: aload #15
    //   93: invokevirtual getHeight : ()I
    //   96: istore #10
    //   98: new android/graphics/Matrix
    //   101: astore #16
    //   103: aload #16
    //   105: invokespecial <init> : ()V
    //   108: iload #12
    //   110: i2f
    //   111: fstore #5
    //   113: iload #11
    //   115: i2f
    //   116: fstore #4
    //   118: fload #5
    //   120: fload #4
    //   122: fdiv
    //   123: fstore_2
    //   124: iload #10
    //   126: i2f
    //   127: fstore_3
    //   128: fload #5
    //   130: fload_3
    //   131: fdiv
    //   132: fstore_1
    //   133: fload_2
    //   134: fload_1
    //   135: fcmpl
    //   136: ifle -> 182
    //   139: fload_1
    //   140: fload_2
    //   141: fdiv
    //   142: fload_3
    //   143: fmul
    //   144: f2d
    //   145: invokestatic ceil : (D)D
    //   148: d2i
    //   149: istore #7
    //   151: iload #10
    //   153: iload #7
    //   155: isub
    //   156: iconst_2
    //   157: idiv
    //   158: istore #9
    //   160: fload #5
    //   162: iload #7
    //   164: i2f
    //   165: fdiv
    //   166: fstore_1
    //   167: iload #11
    //   169: istore #6
    //   171: iconst_0
    //   172: istore #8
    //   174: goto -> 218
    //   177: astore #13
    //   179: goto -> 285
    //   182: fload_2
    //   183: fload_1
    //   184: fdiv
    //   185: fload #4
    //   187: fmul
    //   188: f2d
    //   189: invokestatic ceil : (D)D
    //   192: d2i
    //   193: istore #6
    //   195: iload #11
    //   197: iload #6
    //   199: isub
    //   200: iconst_2
    //   201: idiv
    //   202: istore #8
    //   204: fload #5
    //   206: iload #6
    //   208: i2f
    //   209: fdiv
    //   210: fstore_2
    //   211: iload #10
    //   213: istore #7
    //   215: iconst_0
    //   216: istore #9
    //   218: iload #11
    //   220: iload #12
    //   222: if_icmpgt -> 236
    //   225: aload #15
    //   227: astore #13
    //   229: iload #10
    //   231: iload #12
    //   233: if_icmple -> 294
    //   236: aload #16
    //   238: fload_2
    //   239: fload_1
    //   240: invokevirtual preScale : (FF)Z
    //   243: pop
    //   244: aload #15
    //   246: iload #8
    //   248: iload #9
    //   250: iload #6
    //   252: iload #7
    //   254: aload #16
    //   256: iconst_1
    //   257: invokestatic createBitmap : (Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;
    //   260: astore #16
    //   262: aload #15
    //   264: astore #13
    //   266: aload #16
    //   268: aload #15
    //   270: if_acmpeq -> 294
    //   273: aload #15
    //   275: invokevirtual recycle : ()V
    //   278: aload #16
    //   280: astore #13
    //   282: goto -> 294
    //   285: aload #13
    //   287: invokevirtual printStackTrace : ()V
    //   290: aload #15
    //   292: astore #13
    //   294: aload_0
    //   295: aload #13
    //   297: putfield h : Landroid/graphics/Bitmap;
    //   300: goto -> 322
    //   303: new java/util/concurrent/CancellationException
    //   306: dup
    //   307: invokespecial <init> : ()V
    //   310: athrow
    //   311: new java/util/concurrent/CancellationException
    //   314: dup
    //   315: invokespecial <init> : ()V
    //   318: athrow
    //   319: aconst_null
    //   320: astore #13
    //   322: aload_0
    //   323: getfield m : I
    //   326: istore #6
    //   328: iload #6
    //   330: iconst_4
    //   331: if_icmpne -> 399
    //   334: aload #13
    //   336: ifnull -> 399
    //   339: aload #13
    //   341: aload #17
    //   343: invokestatic a : (Landroid/graphics/Bitmap;[Z)[Ly51;
    //   346: astore #14
    //   348: aload #14
    //   350: ifnull -> 391
    //   353: aload #14
    //   355: iconst_0
    //   356: aaload
    //   357: astore #13
    //   359: aload #14
    //   361: iconst_1
    //   362: aaload
    //   363: astore #14
    //   365: aload #17
    //   367: iconst_0
    //   368: baload
    //   369: ifne -> 383
    //   372: aload_0
    //   373: aload #13
    //   375: aload #14
    //   377: invokevirtual c : (Ly51;Ly51;)V
    //   380: goto -> 588
    //   383: new java/util/concurrent/CancellationException
    //   386: dup
    //   387: invokespecial <init> : ()V
    //   390: athrow
    //   391: new java/util/concurrent/CancellationException
    //   394: dup
    //   395: invokespecial <init> : ()V
    //   398: athrow
    //   399: iload #6
    //   401: iconst_5
    //   402: if_icmpne -> 588
    //   405: getstatic j52.o : Lj52;
    //   408: ifnonnull -> 538
    //   411: new j52
    //   414: dup
    //   415: getstatic in/krosbits/musicolet/MyApplication.i : Lin/krosbits/musicolet/MyApplication;
    //   418: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   421: aconst_null
    //   422: iconst_0
    //   423: invokespecial <init> : (Landroid/content/Context;Lkm0;Z)V
    //   426: putstatic j52.o : Lj52;
    //   429: getstatic in/krosbits/musicolet/MyApplication.i : Lin/krosbits/musicolet/MyApplication;
    //   432: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   435: invokestatic getInstance : (Landroid/content/Context;)Landroid/app/WallpaperManager;
    //   438: astore #15
    //   440: aload #15
    //   442: invokevirtual getWallpaperInfo : ()Landroid/app/WallpaperInfo;
    //   445: astore #16
    //   447: aload #14
    //   449: astore #13
    //   451: aload #16
    //   453: ifnull -> 472
    //   456: aload #16
    //   458: getstatic in/krosbits/musicolet/MyApplication.i : Lin/krosbits/musicolet/MyApplication;
    //   461: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   464: invokevirtual getPackageManager : ()Landroid/content/pm/PackageManager;
    //   467: invokevirtual loadThumbnail : (Landroid/content/pm/PackageManager;)Landroid/graphics/drawable/Drawable;
    //   470: astore #13
    //   472: aload #13
    //   474: astore #14
    //   476: aload #13
    //   478: ifnonnull -> 488
    //   481: aload #15
    //   483: invokevirtual getDrawable : ()Landroid/graphics/drawable/Drawable;
    //   486: astore #14
    //   488: aload #14
    //   490: bipush #120
    //   492: bipush #120
    //   494: invokestatic v : (Landroid/graphics/drawable/Drawable;II)Landroid/graphics/Bitmap;
    //   497: getstatic j52.o : Lj52;
    //   500: getfield k : [Z
    //   503: invokestatic a : (Landroid/graphics/Bitmap;[Z)[Ly51;
    //   506: astore #13
    //   508: aload #13
    //   510: ifnull -> 530
    //   513: getstatic j52.o : Lj52;
    //   516: aload #13
    //   518: iconst_0
    //   519: aaload
    //   520: aload #13
    //   522: iconst_1
    //   523: aaload
    //   524: invokevirtual c : (Ly51;Ly51;)V
    //   527: goto -> 538
    //   530: new java/util/concurrent/CancellationException
    //   533: dup
    //   534: invokespecial <init> : ()V
    //   537: athrow
    //   538: getstatic j52.o : Lj52;
    //   541: astore #13
    //   543: aload_0
    //   544: aload #13
    //   546: getfield c : I
    //   549: putfield c : I
    //   552: aload_0
    //   553: aload #13
    //   555: getfield d : I
    //   558: putfield d : I
    //   561: aload_0
    //   562: aload #13
    //   564: getfield e : I
    //   567: putfield e : I
    //   570: aload_0
    //   571: aload #13
    //   573: getfield g : I
    //   576: putfield g : I
    //   579: aload_0
    //   580: aload #13
    //   582: getfield f : I
    //   585: putfield f : I
    //   588: return
    // Exception table:
    //   from	to	target	type
    //   84	108	177	finally
    //   139	160	177	finally
    //   182	204	177	finally
    //   236	262	177	finally
    //   273	278	177	finally
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\j52.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
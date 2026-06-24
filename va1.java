import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;

public abstract class va1 {
  public static final hg1 a = (hg1)new Object();
  
  public static final Object b = new Object();
  
  public static fb0 c = null;
  
  public static long a(Context paramContext) {
    PackageManager packageManager = paramContext.getApplicationContext().getPackageManager();
    return (Build.VERSION.SDK_INT >= 33) ? (o0.a(packageManager, paramContext)).lastUpdateTime : (packageManager.getPackageInfo(paramContext.getPackageName(), 0)).lastUpdateTime;
  }
  
  public static fb0 b() {
    Object object = new Object();
    c = (fb0)object;
    a.k(object);
    return c;
  }
  
  public static void c(Context paramContext, boolean paramBoolean) {
    // Byte code:
    //   0: iload_1
    //   1: ifne -> 13
    //   4: getstatic va1.c : Lfb0;
    //   7: ifnull -> 13
    //   10: goto -> 501
    //   13: getstatic va1.b : Ljava/lang/Object;
    //   16: astore #14
    //   18: aload #14
    //   20: monitorenter
    //   21: iload_1
    //   22: ifne -> 39
    //   25: getstatic va1.c : Lfb0;
    //   28: ifnull -> 39
    //   31: aload #14
    //   33: monitorexit
    //   34: return
    //   35: astore_0
    //   36: goto -> 502
    //   39: iconst_0
    //   40: istore #5
    //   42: aload_0
    //   43: invokevirtual getAssets : ()Landroid/content/res/AssetManager;
    //   46: ldc 'dexopt/baseline.prof'
    //   48: invokevirtual openFd : (Ljava/lang/String;)Landroid/content/res/AssetFileDescriptor;
    //   51: astore #16
    //   53: aload #16
    //   55: invokevirtual getLength : ()J
    //   58: lstore #7
    //   60: lload #7
    //   62: lconst_0
    //   63: lcmp
    //   64: ifle -> 72
    //   67: iconst_1
    //   68: istore_2
    //   69: goto -> 74
    //   72: iconst_0
    //   73: istore_2
    //   74: aload #16
    //   76: invokevirtual close : ()V
    //   79: goto -> 113
    //   82: astore #15
    //   84: aload #16
    //   86: ifnull -> 106
    //   89: aload #16
    //   91: invokevirtual close : ()V
    //   94: goto -> 106
    //   97: astore #16
    //   99: aload #15
    //   101: aload #16
    //   103: invokevirtual addSuppressed : (Ljava/lang/Throwable;)V
    //   106: aload #15
    //   108: athrow
    //   109: astore #15
    //   111: iconst_0
    //   112: istore_2
    //   113: getstatic android/os/Build$VERSION.SDK_INT : I
    //   116: istore_3
    //   117: iload_3
    //   118: bipush #28
    //   120: if_icmplt -> 494
    //   123: iload_3
    //   124: bipush #30
    //   126: if_icmpne -> 132
    //   129: goto -> 494
    //   132: new java/io/File
    //   135: astore #15
    //   137: new java/io/File
    //   140: astore #16
    //   142: aload #16
    //   144: ldc '/data/misc/profiles/ref/'
    //   146: aload_0
    //   147: invokevirtual getPackageName : ()Ljava/lang/String;
    //   150: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;)V
    //   153: aload #15
    //   155: aload #16
    //   157: ldc 'primary.prof'
    //   159: invokespecial <init> : (Ljava/io/File;Ljava/lang/String;)V
    //   162: aload #15
    //   164: invokevirtual length : ()J
    //   167: lstore #7
    //   169: aload #15
    //   171: invokevirtual exists : ()Z
    //   174: ifeq -> 189
    //   177: lload #7
    //   179: lconst_0
    //   180: lcmp
    //   181: ifle -> 189
    //   184: iconst_1
    //   185: istore_3
    //   186: goto -> 191
    //   189: iconst_0
    //   190: istore_3
    //   191: new java/io/File
    //   194: astore #16
    //   196: new java/io/File
    //   199: astore #15
    //   201: aload #15
    //   203: ldc '/data/misc/profiles/cur/0/'
    //   205: aload_0
    //   206: invokevirtual getPackageName : ()Ljava/lang/String;
    //   209: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;)V
    //   212: aload #16
    //   214: aload #15
    //   216: ldc 'primary.prof'
    //   218: invokespecial <init> : (Ljava/io/File;Ljava/lang/String;)V
    //   221: aload #16
    //   223: invokevirtual length : ()J
    //   226: lstore #9
    //   228: aload #16
    //   230: invokevirtual exists : ()Z
    //   233: istore #13
    //   235: iload #13
    //   237: ifeq -> 253
    //   240: lload #9
    //   242: lconst_0
    //   243: lcmp
    //   244: ifle -> 253
    //   247: iconst_1
    //   248: istore #4
    //   250: goto -> 256
    //   253: iconst_0
    //   254: istore #4
    //   256: aload_0
    //   257: invokestatic a : (Landroid/content/Context;)J
    //   260: lstore #11
    //   262: new java/io/File
    //   265: astore #15
    //   267: aload #15
    //   269: aload_0
    //   270: invokevirtual getFilesDir : ()Ljava/io/File;
    //   273: ldc 'profileInstalled'
    //   275: invokespecial <init> : (Ljava/io/File;Ljava/lang/String;)V
    //   278: aload #15
    //   280: invokevirtual exists : ()Z
    //   283: istore #13
    //   285: iload #13
    //   287: ifeq -> 310
    //   290: aload #15
    //   292: invokestatic a : (Ljava/io/File;)Lua1;
    //   295: astore_0
    //   296: goto -> 312
    //   299: astore_0
    //   300: invokestatic b : ()Lfb0;
    //   303: pop
    //   304: aload #14
    //   306: monitorexit
    //   307: goto -> 501
    //   310: aconst_null
    //   311: astore_0
    //   312: aload_0
    //   313: ifnull -> 347
    //   316: aload_0
    //   317: getfield c : J
    //   320: lload #11
    //   322: lcmp
    //   323: ifne -> 347
    //   326: aload_0
    //   327: getfield b : I
    //   330: istore #6
    //   332: iload #6
    //   334: iconst_2
    //   335: if_icmpne -> 341
    //   338: goto -> 347
    //   341: iload #6
    //   343: istore_2
    //   344: goto -> 376
    //   347: iload_2
    //   348: ifne -> 357
    //   351: ldc 327680
    //   353: istore_2
    //   354: goto -> 376
    //   357: iload_3
    //   358: ifeq -> 366
    //   361: iconst_1
    //   362: istore_2
    //   363: goto -> 376
    //   366: iload #5
    //   368: istore_2
    //   369: iload #4
    //   371: ifeq -> 376
    //   374: iconst_2
    //   375: istore_2
    //   376: iload_2
    //   377: istore_3
    //   378: iload_1
    //   379: ifeq -> 398
    //   382: iload_2
    //   383: istore_3
    //   384: iload #4
    //   386: ifeq -> 398
    //   389: iload_2
    //   390: istore_3
    //   391: iload_2
    //   392: iconst_1
    //   393: if_icmpeq -> 398
    //   396: iconst_2
    //   397: istore_3
    //   398: iload_3
    //   399: istore_2
    //   400: aload_0
    //   401: ifnull -> 435
    //   404: iload_3
    //   405: istore_2
    //   406: aload_0
    //   407: getfield b : I
    //   410: iconst_2
    //   411: if_icmpne -> 435
    //   414: iload_3
    //   415: istore_2
    //   416: iload_3
    //   417: iconst_1
    //   418: if_icmpne -> 435
    //   421: iload_3
    //   422: istore_2
    //   423: lload #7
    //   425: aload_0
    //   426: getfield d : J
    //   429: lcmp
    //   430: ifge -> 435
    //   433: iconst_3
    //   434: istore_2
    //   435: new ua1
    //   438: astore #16
    //   440: aload #16
    //   442: iconst_1
    //   443: iload_2
    //   444: lload #11
    //   446: lload #9
    //   448: invokespecial <init> : (IIJJ)V
    //   451: aload_0
    //   452: ifnull -> 466
    //   455: aload_0
    //   456: aload #16
    //   458: invokevirtual equals : (Ljava/lang/Object;)Z
    //   461: istore_1
    //   462: iload_1
    //   463: ifne -> 473
    //   466: aload #16
    //   468: aload #15
    //   470: invokevirtual b : (Ljava/io/File;)V
    //   473: invokestatic b : ()Lfb0;
    //   476: pop
    //   477: aload #14
    //   479: monitorexit
    //   480: goto -> 501
    //   483: astore_0
    //   484: invokestatic b : ()Lfb0;
    //   487: pop
    //   488: aload #14
    //   490: monitorexit
    //   491: goto -> 501
    //   494: invokestatic b : ()Lfb0;
    //   497: pop
    //   498: aload #14
    //   500: monitorexit
    //   501: return
    //   502: aload #14
    //   504: monitorexit
    //   505: aload_0
    //   506: athrow
    //   507: astore_0
    //   508: goto -> 473
    // Exception table:
    //   from	to	target	type
    //   25	34	35	finally
    //   42	53	109	java/io/IOException
    //   42	53	35	finally
    //   53	60	82	finally
    //   74	79	109	java/io/IOException
    //   74	79	35	finally
    //   89	94	97	finally
    //   99	106	109	java/io/IOException
    //   99	106	35	finally
    //   106	109	109	java/io/IOException
    //   106	109	35	finally
    //   113	117	35	finally
    //   132	177	35	finally
    //   191	235	35	finally
    //   256	262	483	android/content/pm/PackageManager$NameNotFoundException
    //   256	262	35	finally
    //   262	285	35	finally
    //   290	296	299	java/io/IOException
    //   290	296	35	finally
    //   300	307	35	finally
    //   316	332	35	finally
    //   406	414	35	finally
    //   423	433	35	finally
    //   435	451	35	finally
    //   455	462	35	finally
    //   466	473	507	java/io/IOException
    //   466	473	35	finally
    //   473	480	35	finally
    //   484	491	35	finally
    //   494	501	35	finally
    //   502	505	35	finally
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\va1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
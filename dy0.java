import in.krosbits.musicolet.MostPlayedActivity;

public final class dy0 extends ki {
  public final int c;
  
  public final boolean e;
  
  public final MostPlayedActivity f;
  
  public dy0(MostPlayedActivity paramMostPlayedActivity, int paramInt, boolean paramBoolean) {}
  
  public final void run() {
    // Byte code:
    //   0: aload_0
    //   1: getfield f : Lin/krosbits/musicolet/MostPlayedActivity;
    //   4: astore #5
    //   6: getstatic in/krosbits/musicolet/MyApplication.F : Lyp1;
    //   9: invokevirtual p : ()Z
    //   12: istore_2
    //   13: aload_0
    //   14: getfield c : I
    //   17: istore_1
    //   18: iload_2
    //   19: ifne -> 85
    //   22: getstatic android/os/Build$VERSION.SDK_INT : I
    //   25: bipush #30
    //   27: if_icmpge -> 33
    //   30: goto -> 85
    //   33: aload #5
    //   35: iload_1
    //   36: invokestatic p0 : (Lin/krosbits/musicolet/MostPlayedActivity;I)Landroid/net/Uri;
    //   39: astore_3
    //   40: getstatic in/krosbits/musicolet/MyApplication.i : Lin/krosbits/musicolet/MyApplication;
    //   43: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   46: invokevirtual getContentResolver : ()Landroid/content/ContentResolver;
    //   49: aload_3
    //   50: ldc 'wt'
    //   52: invokevirtual openFileDescriptor : (Landroid/net/Uri;Ljava/lang/String;)Landroid/os/ParcelFileDescriptor;
    //   55: astore #6
    //   57: new t70
    //   60: astore #4
    //   62: aload #4
    //   64: aload #6
    //   66: invokespecial <init> : (Landroid/os/ParcelFileDescriptor;)V
    //   69: new f71
    //   72: dup
    //   73: aload_3
    //   74: invokespecial <init> : (Landroid/net/Uri;)V
    //   77: astore_3
    //   78: goto -> 110
    //   81: astore_3
    //   82: goto -> 560
    //   85: invokestatic I : ()Lv00;
    //   88: aload #5
    //   90: getfield U : [Ljava/lang/String;
    //   93: iload_1
    //   94: aaload
    //   95: invokevirtual A : (Ljava/lang/String;)Lv00;
    //   98: astore_3
    //   99: aload_3
    //   100: invokevirtual p : ()Z
    //   103: pop
    //   104: aload_3
    //   105: invokestatic o : (Lu00;)Ljava/io/FileOutputStream;
    //   108: astore #4
    //   110: new java/io/FileInputStream
    //   113: astore #7
    //   115: aload #7
    //   117: aload #5
    //   119: getfield V : [Ljava/io/File;
    //   122: iload_1
    //   123: aaload
    //   124: invokespecial <init> : (Ljava/io/File;)V
    //   127: ldc 131072
    //   129: newarray byte
    //   131: astore #6
    //   133: aload #7
    //   135: aload #6
    //   137: invokevirtual read : ([B)I
    //   140: istore_1
    //   141: iload_1
    //   142: iconst_m1
    //   143: if_icmpeq -> 158
    //   146: aload #4
    //   148: aload #6
    //   150: iconst_0
    //   151: iload_1
    //   152: invokevirtual write : ([BII)V
    //   155: goto -> 133
    //   158: aload #7
    //   160: invokevirtual close : ()V
    //   163: aload #4
    //   165: invokevirtual flush : ()V
    //   168: aload #4
    //   170: invokevirtual close : ()V
    //   173: aload_3
    //   174: invokevirtual l : ()Z
    //   177: istore_2
    //   178: iload_2
    //   179: ifeq -> 532
    //   182: aload_3
    //   183: instanceof cd1
    //   186: ifeq -> 233
    //   189: getstatic in/krosbits/musicolet/MyApplication.F : Lyp1;
    //   192: aload_3
    //   193: invokevirtual g : (Lv00;)Ljava/lang/String;
    //   196: astore #4
    //   198: aload #4
    //   200: ifnull -> 233
    //   203: getstatic in/krosbits/musicolet/MyApplication.i : Lin/krosbits/musicolet/MyApplication;
    //   206: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   209: iconst_1
    //   210: anewarray java/lang/String
    //   213: dup
    //   214: iconst_0
    //   215: aload #4
    //   217: aastore
    //   218: aconst_null
    //   219: aconst_null
    //   220: invokestatic scanFile : (Landroid/content/Context;[Ljava/lang/String;[Ljava/lang/String;Landroid/media/MediaScannerConnection$OnScanCompletedListener;)V
    //   223: goto -> 233
    //   226: astore #4
    //   228: aload #4
    //   230: invokevirtual printStackTrace : ()V
    //   233: aload_0
    //   234: getfield e : Z
    //   237: ifeq -> 502
    //   240: new android/content/Intent
    //   243: astore #6
    //   245: aload #6
    //   247: ldc 'android.intent.action.SEND'
    //   249: invokespecial <init> : (Ljava/lang/String;)V
    //   252: aload #6
    //   254: ldc 'android.intent.extra.STREAM'
    //   256: getstatic in/krosbits/musicolet/MyApplication.i : Lin/krosbits/musicolet/MyApplication;
    //   259: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   262: aload_3
    //   263: invokestatic s : (Landroid/content/Context;Lu00;)Landroid/net/Uri;
    //   266: invokevirtual putExtra : (Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;
    //   269: pop
    //   270: aload #6
    //   272: iconst_1
    //   273: invokevirtual addFlags : (I)Landroid/content/Intent;
    //   276: pop
    //   277: aload #5
    //   279: getfield h0 : Landroid/os/Bundle;
    //   282: ldc 'ltm'
    //   284: iconst_0
    //   285: invokevirtual getInt : (Ljava/lang/String;I)I
    //   288: istore_1
    //   289: iload_1
    //   290: iconst_1
    //   291: if_icmpne -> 324
    //   294: new java/lang/StringBuilder
    //   297: astore_3
    //   298: aload_3
    //   299: ldc ' '
    //   301: invokespecial <init> : (Ljava/lang/String;)V
    //   304: aload_3
    //   305: aload #5
    //   307: ldc 2131886211
    //   309: invokevirtual getString : (I)Ljava/lang/String;
    //   312: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   315: pop
    //   316: aload_3
    //   317: invokevirtual toString : ()Ljava/lang/String;
    //   320: astore_3
    //   321: goto -> 327
    //   324: ldc ''
    //   326: astore_3
    //   327: aload_3
    //   328: invokevirtual isEmpty : ()Z
    //   331: istore_2
    //   332: aload_3
    //   333: astore #4
    //   335: iload_2
    //   336: ifne -> 378
    //   339: new java/lang/StringBuilder
    //   342: astore #4
    //   344: aload #4
    //   346: invokespecial <init> : ()V
    //   349: aload #4
    //   351: ldc ' #'
    //   353: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   356: pop
    //   357: aload #4
    //   359: aload_3
    //   360: ldc '\s'
    //   362: ldc ''
    //   364: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   367: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   370: pop
    //   371: aload #4
    //   373: invokevirtual toString : ()Ljava/lang/String;
    //   376: astore #4
    //   378: aload #5
    //   380: ldc 2131886842
    //   382: invokevirtual getString : (I)Ljava/lang/String;
    //   385: ldc '\s'
    //   387: ldc ''
    //   389: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   392: astore #8
    //   394: aload #5
    //   396: getfield Y : Ljava/lang/String;
    //   399: ldc '\s'
    //   401: ldc ''
    //   403: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   406: astore #7
    //   408: new java/lang/StringBuilder
    //   411: astore_3
    //   412: aload_3
    //   413: invokespecial <init> : ()V
    //   416: aload_3
    //   417: ldc '#Musicolet #'
    //   419: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   422: pop
    //   423: aload_3
    //   424: aload #8
    //   426: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   429: pop
    //   430: aload_3
    //   431: aload #4
    //   433: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   436: pop
    //   437: aload_3
    //   438: ldc ' #'
    //   440: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   443: pop
    //   444: aload_3
    //   445: aload #7
    //   447: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   450: pop
    //   451: aload #6
    //   453: ldc 'android.intent.extra.TEXT'
    //   455: aload_3
    //   456: invokevirtual toString : ()Ljava/lang/String;
    //   459: invokevirtual putExtra : (Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    //   462: ldc 268435456
    //   464: invokevirtual addFlags : (I)Landroid/content/Intent;
    //   467: pop
    //   468: aload #6
    //   470: ldc 'image/*'
    //   472: invokevirtual setType : (Ljava/lang/String;)Landroid/content/Intent;
    //   475: pop
    //   476: aload #6
    //   478: ldc 'Share via...'
    //   480: invokestatic createChooser : (Landroid/content/Intent;Ljava/lang/CharSequence;)Landroid/content/Intent;
    //   483: ldc 268435456
    //   485: invokevirtual addFlags : (I)Landroid/content/Intent;
    //   488: astore_3
    //   489: getstatic in/krosbits/musicolet/MyApplication.i : Lin/krosbits/musicolet/MyApplication;
    //   492: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   495: aload_3
    //   496: invokevirtual startActivity : (Landroid/content/Intent;)V
    //   499: goto -> 532
    //   502: ldc 2131887274
    //   504: iconst_1
    //   505: invokestatic O0 : (II)V
    //   508: aload #5
    //   510: getfield N : Landroid/os/Handler;
    //   513: astore #4
    //   515: new xt0
    //   518: astore_3
    //   519: aload_3
    //   520: iconst_2
    //   521: aload_0
    //   522: invokespecial <init> : (ILjava/lang/Object;)V
    //   525: aload #4
    //   527: aload_3
    //   528: invokevirtual post : (Ljava/lang/Runnable;)Z
    //   531: pop
    //   532: new zx0
    //   535: astore_3
    //   536: aload_3
    //   537: aload #5
    //   539: iconst_2
    //   540: invokespecial <init> : (Lin/krosbits/musicolet/MostPlayedActivity;I)V
    //   543: aload #5
    //   545: aload_3
    //   546: invokevirtual runOnUiThread : (Ljava/lang/Runnable;)V
    //   549: goto -> 593
    //   552: astore_3
    //   553: aload_3
    //   554: invokevirtual printStackTrace : ()V
    //   557: goto -> 593
    //   560: aload_3
    //   561: invokevirtual printStackTrace : ()V
    //   564: getstatic in/krosbits/musicolet/MostPlayedActivity.k0 : Ljava/lang/Object;
    //   567: astore_3
    //   568: new zx0
    //   571: astore_3
    //   572: aload_3
    //   573: aload #5
    //   575: iconst_2
    //   576: invokespecial <init> : (Lin/krosbits/musicolet/MostPlayedActivity;I)V
    //   579: aload #5
    //   581: aload_3
    //   582: invokevirtual runOnUiThread : (Ljava/lang/Runnable;)V
    //   585: goto -> 593
    //   588: astore_3
    //   589: aload_3
    //   590: invokevirtual printStackTrace : ()V
    //   593: return
    // Exception table:
    //   from	to	target	type
    //   6	13	81	finally
    //   22	30	81	finally
    //   33	78	81	finally
    //   85	110	81	finally
    //   110	133	81	finally
    //   133	141	81	finally
    //   146	155	81	finally
    //   158	178	81	finally
    //   182	198	226	finally
    //   203	223	226	finally
    //   228	233	81	finally
    //   233	289	81	finally
    //   294	321	81	finally
    //   327	332	81	finally
    //   339	378	81	finally
    //   378	499	81	finally
    //   502	532	81	finally
    //   532	549	552	finally
    //   553	557	81	finally
    //   568	585	588	finally
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\dy0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
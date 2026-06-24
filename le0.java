import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;

public class le0 {
  public static final int a = 12451000;
  
  public static final le0 b = (le0)new Object();
  
  public Intent a(int paramInt, Context paramContext, String paramString) {
    Uri uri;
    if (paramInt != 1 && paramInt != 2) {
      if (paramInt != 3)
        return null; 
      uri = Uri.fromParts("package", "com.google.android.gms", null);
      intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
      intent.setData(uri);
      return intent;
    } 
    if (intent == null || !n21.H((Context)intent)) {
      StringBuilder stringBuilder = new StringBuilder("gcore_");
      stringBuilder.append(a);
      stringBuilder.append("-");
      if (!TextUtils.isEmpty((CharSequence)uri))
        stringBuilder.append((String)uri); 
      stringBuilder.append("-");
      if (intent != null)
        stringBuilder.append(intent.getPackageName()); 
      stringBuilder.append("-");
      if (intent != null)
        try {
          bu bu = t82.a((Context)intent);
          String str1 = intent.getPackageName();
          stringBuilder.append((bu.b.getPackageManager().getPackageInfo(str1, 0)).versionCode);
        } catch (android.content.pm.PackageManager.NameNotFoundException nameNotFoundException) {} 
      String str = stringBuilder.toString();
      Intent intent1 = new Intent("android.intent.action.VIEW");
      Uri.Builder builder = Uri.parse("market://details").buildUpon().appendQueryParameter("id", "com.google.android.gms");
      if (!TextUtils.isEmpty(str))
        builder.appendQueryParameter("pcampaignid", str); 
      intent1.setData(builder.build());
      intent1.setPackage("com.android.vending");
      intent1.addFlags(524288);
      return intent1;
    } 
    Intent intent = new Intent("com.google.android.clockwork.home.UPDATE_ANDROID_WEAR_ACTION");
    intent.setPackage("com.google.android.wearable.app");
    return intent;
  }
  
  public int b(Context paramContext, int paramInt) {
    // Byte code:
    //   0: getstatic pe0.c : I
    //   3: istore_3
    //   4: aload_1
    //   5: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   8: ldc 2131886384
    //   10: invokevirtual getString : (I)Ljava/lang/String;
    //   13: pop
    //   14: goto -> 28
    //   17: astore #8
    //   19: ldc 'GooglePlayServicesUtil'
    //   21: getstatic com/google/android/gms/auth/api/signin/cwa/RqlokDsQOju.PUxJjFtvfxc : Ljava/lang/String;
    //   24: invokestatic e : (Ljava/lang/String;Ljava/lang/String;)I
    //   27: pop
    //   28: ldc 'com.google.android.gms'
    //   30: aload_1
    //   31: invokevirtual getPackageName : ()Ljava/lang/String;
    //   34: invokevirtual equals : (Ljava/lang/Object;)Z
    //   37: istore #6
    //   39: iconst_1
    //   40: istore #7
    //   42: iload #6
    //   44: ifne -> 280
    //   47: getstatic pe0.b : Ljava/util/concurrent/atomic/AtomicBoolean;
    //   50: invokevirtual get : ()Z
    //   53: ifeq -> 59
    //   56: goto -> 280
    //   59: getstatic qz1.h : Ljava/lang/Object;
    //   62: astore #8
    //   64: aload #8
    //   66: monitorenter
    //   67: getstatic qz1.i : Z
    //   70: ifeq -> 83
    //   73: aload #8
    //   75: monitorexit
    //   76: goto -> 168
    //   79: astore_1
    //   80: goto -> 275
    //   83: iconst_1
    //   84: putstatic qz1.i : Z
    //   87: aload_1
    //   88: invokevirtual getPackageName : ()Ljava/lang/String;
    //   91: astore #10
    //   93: aload_1
    //   94: invokestatic a : (Landroid/content/Context;)Lbu;
    //   97: astore #9
    //   99: aload #9
    //   101: getfield b : Landroid/content/Context;
    //   104: invokevirtual getPackageManager : ()Landroid/content/pm/PackageManager;
    //   107: aload #10
    //   109: sipush #128
    //   112: invokevirtual getApplicationInfo : (Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;
    //   115: getfield metaData : Landroid/os/Bundle;
    //   118: astore #9
    //   120: aload #9
    //   122: ifnonnull -> 131
    //   125: aload #8
    //   127: monitorexit
    //   128: goto -> 168
    //   131: aload #9
    //   133: ldc 'com.google.app.id'
    //   135: invokevirtual getString : (Ljava/lang/String;)Ljava/lang/String;
    //   138: pop
    //   139: aload #9
    //   141: ldc 'com.google.android.gms.version'
    //   143: invokevirtual getInt : (Ljava/lang/String;)I
    //   146: putstatic qz1.j : I
    //   149: goto -> 165
    //   152: astore #9
    //   154: ldc 'MetadataValueReader'
    //   156: getstatic com/pavelsikun/seekbarpreference/lu/FgdLmmRfTxSFKI.BqZEOyNuUlSy : Ljava/lang/String;
    //   159: aload #9
    //   161: invokestatic wtf : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   164: pop
    //   165: aload #8
    //   167: monitorexit
    //   168: getstatic qz1.j : I
    //   171: istore_3
    //   172: iload_3
    //   173: ifeq -> 264
    //   176: iload_3
    //   177: ldc 12451000
    //   179: if_icmpne -> 185
    //   182: goto -> 280
    //   185: getstatic le0.a : I
    //   188: istore_2
    //   189: new java/lang/StringBuilder
    //   192: dup
    //   193: iload_2
    //   194: invokestatic valueOf : (I)Ljava/lang/String;
    //   197: invokevirtual length : ()I
    //   200: bipush #104
    //   202: iadd
    //   203: iload_3
    //   204: invokestatic valueOf : (I)Ljava/lang/String;
    //   207: invokevirtual length : ()I
    //   210: iadd
    //   211: sipush #194
    //   214: iadd
    //   215: invokespecial <init> : (I)V
    //   218: astore_1
    //   219: aload_1
    //   220: ldc 'The meta-data tag in your app's AndroidManifest.xml does not have the right value.  Expected '
    //   222: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   225: pop
    //   226: aload_1
    //   227: iload_2
    //   228: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   231: pop
    //   232: aload_1
    //   233: ldc ' but found '
    //   235: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   238: pop
    //   239: aload_1
    //   240: iload_3
    //   241: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   244: pop
    //   245: aload_1
    //   246: ldc '.  You must have the following declaration within the <application> element:     <meta-data android:name="com.google.android.gms.version" android:value="@integer/google_play_services_version" />'
    //   248: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   251: pop
    //   252: new java/lang/IllegalStateException
    //   255: dup
    //   256: aload_1
    //   257: invokevirtual toString : ()Ljava/lang/String;
    //   260: invokespecial <init> : (Ljava/lang/String;)V
    //   263: athrow
    //   264: new java/lang/IllegalStateException
    //   267: dup
    //   268: ldc_w 'A required meta-data tag in your app's AndroidManifest.xml does not exist.  You must have the following declaration within the <application> element:     <meta-data android:name="com.google.android.gms.version" android:value="@integer/google_play_services_version" />'
    //   271: invokespecial <init> : (Ljava/lang/String;)V
    //   274: athrow
    //   275: aload #8
    //   277: monitorexit
    //   278: aload_1
    //   279: athrow
    //   280: aload_1
    //   281: invokestatic H : (Landroid/content/Context;)Z
    //   284: ifne -> 348
    //   287: getstatic n21.i : Ljava/lang/Boolean;
    //   290: ifnonnull -> 334
    //   293: invokestatic S : ()Z
    //   296: ifeq -> 314
    //   299: aload_1
    //   300: invokevirtual getPackageManager : ()Landroid/content/pm/PackageManager;
    //   303: ldc_w 'android.hardware.type.embedded'
    //   306: invokevirtual hasSystemFeature : (Ljava/lang/String;)Z
    //   309: istore #6
    //   311: goto -> 326
    //   314: aload_1
    //   315: invokevirtual getPackageManager : ()Landroid/content/pm/PackageManager;
    //   318: ldc_w 'android.hardware.type.iot'
    //   321: invokevirtual hasSystemFeature : (Ljava/lang/String;)Z
    //   324: istore #6
    //   326: iload #6
    //   328: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   331: putstatic n21.i : Ljava/lang/Boolean;
    //   334: getstatic n21.i : Ljava/lang/Boolean;
    //   337: invokevirtual booleanValue : ()Z
    //   340: ifne -> 348
    //   343: iconst_1
    //   344: istore_3
    //   345: goto -> 350
    //   348: iconst_0
    //   349: istore_3
    //   350: iload_2
    //   351: iflt -> 1052
    //   354: aload_1
    //   355: invokevirtual getPackageName : ()Ljava/lang/String;
    //   358: astore #10
    //   360: aload_1
    //   361: invokevirtual getPackageManager : ()Landroid/content/pm/PackageManager;
    //   364: astore #11
    //   366: bipush #9
    //   368: istore #5
    //   370: iload_3
    //   371: ifeq -> 434
    //   374: getstatic android/os/Build$VERSION.SDK_INT : I
    //   377: bipush #28
    //   379: if_icmplt -> 390
    //   382: ldc_w 134225984
    //   385: istore #4
    //   387: goto -> 395
    //   390: sipush #8256
    //   393: istore #4
    //   395: aload #11
    //   397: ldc 'com.android.vending'
    //   399: iload #4
    //   401: invokevirtual getPackageInfo : (Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
    //   404: astore #8
    //   406: goto -> 437
    //   409: astore #8
    //   411: ldc 'GooglePlayServicesUtil'
    //   413: aload #10
    //   415: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   418: ldc_w ' requires the Google Play Store, but it is missing.'
    //   421: invokevirtual concat : (Ljava/lang/String;)Ljava/lang/String;
    //   424: invokestatic w : (Ljava/lang/String;Ljava/lang/String;)I
    //   427: pop
    //   428: iload #5
    //   430: istore_2
    //   431: goto -> 940
    //   434: aconst_null
    //   435: astore #8
    //   437: getstatic android/os/Build$VERSION.SDK_INT : I
    //   440: bipush #28
    //   442: if_icmplt -> 453
    //   445: ldc_w 134217792
    //   448: istore #4
    //   450: goto -> 457
    //   453: bipush #64
    //   455: istore #4
    //   457: aload #11
    //   459: ldc 'com.google.android.gms'
    //   461: iload #4
    //   463: invokevirtual getPackageInfo : (Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
    //   466: astore #9
    //   468: ldc_w qe0
    //   471: monitorenter
    //   472: getstatic qe0.a : Lqe0;
    //   475: ifnonnull -> 558
    //   478: getstatic mp2.a : Lbj2;
    //   481: astore #12
    //   483: ldc_w mp2
    //   486: monitorenter
    //   487: getstatic mp2.c : Landroid/content/Context;
    //   490: ifnonnull -> 511
    //   493: aload_1
    //   494: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   497: putstatic mp2.c : Landroid/content/Context;
    //   500: ldc_w mp2
    //   503: monitorexit
    //   504: goto -> 525
    //   507: astore_1
    //   508: goto -> 552
    //   511: ldc_w 'GoogleCertificates'
    //   514: ldc_w 'GoogleCertificates has been initialized already'
    //   517: invokestatic w : (Ljava/lang/String;Ljava/lang/String;)I
    //   520: pop
    //   521: ldc_w mp2
    //   524: monitorexit
    //   525: new qe0
    //   528: astore #12
    //   530: aload #12
    //   532: invokespecial <init> : ()V
    //   535: aload_1
    //   536: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   539: pop
    //   540: aload #12
    //   542: putstatic qe0.a : Lqe0;
    //   545: goto -> 558
    //   548: astore_1
    //   549: goto -> 912
    //   552: ldc_w mp2
    //   555: monitorexit
    //   556: aload_1
    //   557: athrow
    //   558: ldc_w qe0
    //   561: monitorexit
    //   562: aload #9
    //   564: invokestatic a : (Landroid/content/pm/PackageInfo;)Z
    //   567: ifne -> 593
    //   570: ldc 'GooglePlayServicesUtil'
    //   572: aload #10
    //   574: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   577: ldc_w ' requires Google Play services, but their signature is invalid.'
    //   580: invokevirtual concat : (Ljava/lang/String;)Ljava/lang/String;
    //   583: invokestatic w : (Ljava/lang/String;Ljava/lang/String;)I
    //   586: pop
    //   587: iload #5
    //   589: istore_2
    //   590: goto -> 940
    //   593: iload_3
    //   594: ifeq -> 633
    //   597: aload #8
    //   599: invokestatic m : (Ljava/lang/Object;)V
    //   602: aload #8
    //   604: invokestatic a : (Landroid/content/pm/PackageInfo;)Z
    //   607: ifne -> 633
    //   610: ldc 'GooglePlayServicesUtil'
    //   612: aload #10
    //   614: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   617: ldc_w ' requires Google Play Store, but its signature is invalid.'
    //   620: invokevirtual concat : (Ljava/lang/String;)Ljava/lang/String;
    //   623: invokestatic w : (Ljava/lang/String;Ljava/lang/String;)I
    //   626: pop
    //   627: iload #5
    //   629: istore_2
    //   630: goto -> 940
    //   633: iload_3
    //   634: ifeq -> 685
    //   637: aload #8
    //   639: ifnull -> 685
    //   642: aload #8
    //   644: getfield signatures : [Landroid/content/pm/Signature;
    //   647: iconst_0
    //   648: aaload
    //   649: aload #9
    //   651: getfield signatures : [Landroid/content/pm/Signature;
    //   654: iconst_0
    //   655: aaload
    //   656: invokevirtual equals : (Ljava/lang/Object;)Z
    //   659: ifne -> 685
    //   662: ldc 'GooglePlayServicesUtil'
    //   664: aload #10
    //   666: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   669: ldc_w ' requires Google Play Store, but its signature doesn't match that of Google Play services.'
    //   672: invokevirtual concat : (Ljava/lang/String;)Ljava/lang/String;
    //   675: invokestatic w : (Ljava/lang/String;Ljava/lang/String;)I
    //   678: pop
    //   679: iload #5
    //   681: istore_2
    //   682: goto -> 940
    //   685: aload #9
    //   687: getfield versionCode : I
    //   690: istore #5
    //   692: iconst_m1
    //   693: istore #4
    //   695: iload #5
    //   697: iconst_m1
    //   698: if_icmpne -> 706
    //   701: iconst_m1
    //   702: istore_3
    //   703: goto -> 713
    //   706: iload #5
    //   708: sipush #1000
    //   711: idiv
    //   712: istore_3
    //   713: iload_2
    //   714: iconst_m1
    //   715: if_icmpne -> 721
    //   718: goto -> 728
    //   721: iload_2
    //   722: sipush #1000
    //   725: idiv
    //   726: istore #4
    //   728: iload_3
    //   729: iload #4
    //   731: if_icmpge -> 839
    //   734: new java/lang/StringBuilder
    //   737: dup
    //   738: aload #10
    //   740: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   743: invokevirtual length : ()I
    //   746: bipush #49
    //   748: iadd
    //   749: iload_2
    //   750: invokestatic valueOf : (I)Ljava/lang/String;
    //   753: invokevirtual length : ()I
    //   756: iadd
    //   757: bipush #11
    //   759: iadd
    //   760: iload #5
    //   762: invokestatic valueOf : (I)Ljava/lang/String;
    //   765: invokevirtual length : ()I
    //   768: iadd
    //   769: invokespecial <init> : (I)V
    //   772: astore #8
    //   774: aload #8
    //   776: ldc_w 'Google Play services out of date for '
    //   779: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   782: pop
    //   783: aload #8
    //   785: aload #10
    //   787: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   790: pop
    //   791: aload #8
    //   793: ldc_w '.  Requires '
    //   796: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   799: pop
    //   800: aload #8
    //   802: iload_2
    //   803: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   806: pop
    //   807: aload #8
    //   809: ldc ' but found '
    //   811: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   814: pop
    //   815: aload #8
    //   817: iload #5
    //   819: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   822: pop
    //   823: ldc 'GooglePlayServicesUtil'
    //   825: aload #8
    //   827: invokevirtual toString : ()Ljava/lang/String;
    //   830: invokestatic w : (Ljava/lang/String;Ljava/lang/String;)I
    //   833: pop
    //   834: iconst_2
    //   835: istore_2
    //   836: goto -> 940
    //   839: aload #9
    //   841: getfield applicationInfo : Landroid/content/pm/ApplicationInfo;
    //   844: astore #9
    //   846: aload #9
    //   848: astore #8
    //   850: aload #9
    //   852: ifnonnull -> 894
    //   855: aload #11
    //   857: ldc 'com.google.android.gms'
    //   859: iconst_0
    //   860: invokevirtual getApplicationInfo : (Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;
    //   863: astore #8
    //   865: goto -> 894
    //   868: astore #8
    //   870: ldc 'GooglePlayServicesUtil'
    //   872: aload #10
    //   874: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   877: ldc_w ' requires Google Play services, but they're missing when getting application info.'
    //   880: invokevirtual concat : (Ljava/lang/String;)Ljava/lang/String;
    //   883: aload #8
    //   885: invokestatic wtf : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   888: pop
    //   889: iconst_1
    //   890: istore_2
    //   891: goto -> 940
    //   894: aload #8
    //   896: getfield enabled : Z
    //   899: ifne -> 907
    //   902: iconst_3
    //   903: istore_2
    //   904: goto -> 940
    //   907: iconst_0
    //   908: istore_2
    //   909: goto -> 940
    //   912: ldc_w qe0
    //   915: monitorexit
    //   916: aload_1
    //   917: athrow
    //   918: astore #8
    //   920: ldc 'GooglePlayServicesUtil'
    //   922: aload #10
    //   924: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   927: ldc_w ' requires Google Play services, but they are missing.'
    //   930: invokevirtual concat : (Ljava/lang/String;)Ljava/lang/String;
    //   933: invokestatic w : (Ljava/lang/String;Ljava/lang/String;)I
    //   936: pop
    //   937: goto -> 889
    //   940: iload_2
    //   941: bipush #18
    //   943: if_icmpne -> 953
    //   946: iload #7
    //   948: istore #6
    //   950: goto -> 1042
    //   953: iload_2
    //   954: iconst_1
    //   955: if_icmpne -> 1039
    //   958: aload_1
    //   959: invokevirtual getPackageManager : ()Landroid/content/pm/PackageManager;
    //   962: invokevirtual getPackageInstaller : ()Landroid/content/pm/PackageInstaller;
    //   965: invokevirtual getAllSessions : ()Ljava/util/List;
    //   968: astore #8
    //   970: aload #8
    //   972: invokeinterface iterator : ()Ljava/util/Iterator;
    //   977: astore #8
    //   979: aload #8
    //   981: invokeinterface hasNext : ()Z
    //   986: ifeq -> 1017
    //   989: ldc 'com.google.android.gms'
    //   991: aload #8
    //   993: invokeinterface next : ()Ljava/lang/Object;
    //   998: checkcast android/content/pm/PackageInstaller$SessionInfo
    //   1001: invokevirtual getAppPackageName : ()Ljava/lang/String;
    //   1004: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1007: ifeq -> 979
    //   1010: iload #7
    //   1012: istore #6
    //   1014: goto -> 1042
    //   1017: aload_1
    //   1018: invokevirtual getPackageManager : ()Landroid/content/pm/PackageManager;
    //   1021: astore_1
    //   1022: aload_1
    //   1023: ldc 'com.google.android.gms'
    //   1025: sipush #8192
    //   1028: invokevirtual getApplicationInfo : (Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;
    //   1031: getfield enabled : Z
    //   1034: istore #6
    //   1036: goto -> 1042
    //   1039: iconst_0
    //   1040: istore #6
    //   1042: iload #6
    //   1044: ifeq -> 1050
    //   1047: bipush #18
    //   1049: ireturn
    //   1050: iload_2
    //   1051: ireturn
    //   1052: invokestatic k : ()V
    //   1055: iconst_0
    //   1056: ireturn
    //   1057: astore_1
    //   1058: goto -> 1039
    // Exception table:
    //   from	to	target	type
    //   4	14	17	finally
    //   67	76	79	finally
    //   83	99	79	finally
    //   99	120	152	android/content/pm/PackageManager$NameNotFoundException
    //   99	120	79	finally
    //   125	128	79	finally
    //   131	149	152	android/content/pm/PackageManager$NameNotFoundException
    //   131	149	79	finally
    //   154	165	79	finally
    //   165	168	79	finally
    //   275	278	79	finally
    //   374	382	409	android/content/pm/PackageManager$NameNotFoundException
    //   395	406	409	android/content/pm/PackageManager$NameNotFoundException
    //   437	445	918	android/content/pm/PackageManager$NameNotFoundException
    //   457	468	918	android/content/pm/PackageManager$NameNotFoundException
    //   472	487	548	finally
    //   487	500	507	finally
    //   500	504	548	finally
    //   511	521	507	finally
    //   521	525	548	finally
    //   525	545	548	finally
    //   552	556	507	finally
    //   556	558	548	finally
    //   558	562	548	finally
    //   855	865	868	android/content/pm/PackageManager$NameNotFoundException
    //   912	916	548	finally
    //   958	970	1057	java/lang/Exception
    //   1022	1036	1057	android/content/pm/PackageManager$NameNotFoundException
  }
  
  static {
    int i = pe0.c;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\le0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
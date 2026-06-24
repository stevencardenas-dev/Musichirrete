import android.content.Context;
import android.content.IntentFilter;

public final class p6 extends r6 {
  public final int c;
  
  public final u6 d;
  
  public final Object e;
  
  public p6(u6 paramu6, Context paramContext) {
    super(paramu6);
    this.e = paramContext.getApplicationContext().getSystemService("power");
  }
  
  public p6(u6 paramu6, zv0 paramzv0) {
    super(paramu6);
    this.e = paramzv0;
  }
  
  public final IntentFilter e() {
    switch (this.c) {
      default:
        intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.TIME_SET");
        intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
        intentFilter.addAction("android.intent.action.TIME_TICK");
        return intentFilter;
      case 0:
        break;
    } 
    IntentFilter intentFilter = new IntentFilter();
    intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
    return intentFilter;
  }
  
  public final int f() {
    // Byte code:
    //   0: aload_0
    //   1: getfield c : I
    //   4: istore_2
    //   5: iconst_2
    //   6: istore_1
    //   7: aload_0
    //   8: getfield e : Ljava/lang/Object;
    //   11: astore #13
    //   13: iload_2
    //   14: tableswitch default -> 32, 0 -> 511
    //   32: aload #13
    //   34: checkcast zv0
    //   37: astore #13
    //   39: aload #13
    //   41: getfield f : Ljava/lang/Object;
    //   44: checkcast gy1
    //   47: astore #16
    //   49: aload #13
    //   51: getfield e : Ljava/lang/Object;
    //   54: checkcast android/location/LocationManager
    //   57: astore #17
    //   59: aload #16
    //   61: getfield b : J
    //   64: invokestatic currentTimeMillis : ()J
    //   67: lcmp
    //   68: ifle -> 81
    //   71: aload #16
    //   73: getfield a : Z
    //   76: istore #11
    //   78: goto -> 499
    //   81: aload #13
    //   83: getfield c : Ljava/lang/Object;
    //   86: checkcast android/content/Context
    //   89: astore #18
    //   91: aload #18
    //   93: ldc 'android.permission.ACCESS_COARSE_LOCATION'
    //   95: invokestatic h : (Landroid/content/Context;Ljava/lang/String;)I
    //   98: istore_2
    //   99: aconst_null
    //   100: astore #15
    //   102: iload_2
    //   103: ifne -> 146
    //   106: aload #17
    //   108: ldc 'network'
    //   110: invokevirtual isProviderEnabled : (Ljava/lang/String;)Z
    //   113: ifeq -> 140
    //   116: aload #17
    //   118: ldc 'network'
    //   120: invokevirtual getLastKnownLocation : (Ljava/lang/String;)Landroid/location/Location;
    //   123: astore #13
    //   125: goto -> 143
    //   128: astore #13
    //   130: ldc 'TwilightManager'
    //   132: ldc 'Failed to get last known location'
    //   134: aload #13
    //   136: invokestatic d : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   139: pop
    //   140: aconst_null
    //   141: astore #13
    //   143: goto -> 149
    //   146: aconst_null
    //   147: astore #13
    //   149: aload #15
    //   151: astore #14
    //   153: aload #18
    //   155: ldc 'android.permission.ACCESS_FINE_LOCATION'
    //   157: invokestatic h : (Landroid/content/Context;Ljava/lang/String;)I
    //   160: ifne -> 210
    //   163: getstatic com/android/billingclient/api/wH/DJqHMztxflt.etkWI : Ljava/lang/String;
    //   166: astore #18
    //   168: aload #15
    //   170: astore #14
    //   172: aload #17
    //   174: aload #18
    //   176: invokevirtual isProviderEnabled : (Ljava/lang/String;)Z
    //   179: ifeq -> 210
    //   182: aload #17
    //   184: aload #18
    //   186: invokevirtual getLastKnownLocation : (Ljava/lang/String;)Landroid/location/Location;
    //   189: astore #14
    //   191: goto -> 210
    //   194: astore #14
    //   196: ldc 'TwilightManager'
    //   198: ldc 'Failed to get last known location'
    //   200: aload #14
    //   202: invokestatic d : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   205: pop
    //   206: aload #15
    //   208: astore #14
    //   210: aload #14
    //   212: ifnull -> 245
    //   215: aload #13
    //   217: ifnull -> 245
    //   220: aload #13
    //   222: astore #15
    //   224: aload #14
    //   226: invokevirtual getTime : ()J
    //   229: aload #13
    //   231: invokevirtual getTime : ()J
    //   234: lcmp
    //   235: ifle -> 257
    //   238: aload #14
    //   240: astore #15
    //   242: goto -> 257
    //   245: aload #13
    //   247: astore #15
    //   249: aload #14
    //   251: ifnull -> 257
    //   254: goto -> 238
    //   257: iconst_0
    //   258: istore #11
    //   260: iconst_0
    //   261: istore #12
    //   263: aload #15
    //   265: ifnull -> 467
    //   268: invokestatic currentTimeMillis : ()J
    //   271: lstore #9
    //   273: getstatic fy1.d : Lfy1;
    //   276: ifnonnull -> 289
    //   279: new java/lang/Object
    //   282: dup
    //   283: invokespecial <init> : ()V
    //   286: putstatic fy1.d : Lfy1;
    //   289: getstatic fy1.d : Lfy1;
    //   292: astore #13
    //   294: aload #13
    //   296: aload #15
    //   298: invokevirtual getLatitude : ()D
    //   301: aload #15
    //   303: invokevirtual getLongitude : ()D
    //   306: lload #9
    //   308: ldc2_w 86400000
    //   311: lsub
    //   312: invokevirtual a : (DDJ)V
    //   315: aload #13
    //   317: aload #15
    //   319: invokevirtual getLatitude : ()D
    //   322: aload #15
    //   324: invokevirtual getLongitude : ()D
    //   327: lload #9
    //   329: invokevirtual a : (DDJ)V
    //   332: iload #12
    //   334: istore #11
    //   336: aload #13
    //   338: getfield a : I
    //   341: iconst_1
    //   342: if_icmpne -> 348
    //   345: iconst_1
    //   346: istore #11
    //   348: aload #13
    //   350: getfield c : J
    //   353: lstore #5
    //   355: aload #13
    //   357: getfield b : J
    //   360: lstore #7
    //   362: aload #13
    //   364: aload #15
    //   366: invokevirtual getLatitude : ()D
    //   369: aload #15
    //   371: invokevirtual getLongitude : ()D
    //   374: lload #9
    //   376: ldc2_w 86400000
    //   379: ladd
    //   380: invokevirtual a : (DDJ)V
    //   383: aload #13
    //   385: getfield c : J
    //   388: lstore_3
    //   389: lload #5
    //   391: ldc2_w -1
    //   394: lcmp
    //   395: ifeq -> 444
    //   398: lload #7
    //   400: ldc2_w -1
    //   403: lcmp
    //   404: ifne -> 410
    //   407: goto -> 444
    //   410: lload #9
    //   412: lload #7
    //   414: lcmp
    //   415: ifle -> 421
    //   418: goto -> 435
    //   421: lload #5
    //   423: lstore_3
    //   424: lload #9
    //   426: lload #5
    //   428: lcmp
    //   429: ifle -> 435
    //   432: lload #7
    //   434: lstore_3
    //   435: lload_3
    //   436: ldc2_w 60000
    //   439: ladd
    //   440: lstore_3
    //   441: goto -> 451
    //   444: lload #9
    //   446: ldc2_w 43200000
    //   449: ladd
    //   450: lstore_3
    //   451: aload #16
    //   453: iload #11
    //   455: putfield a : Z
    //   458: aload #16
    //   460: lload_3
    //   461: putfield b : J
    //   464: goto -> 499
    //   467: ldc 'TwilightManager'
    //   469: ldc 'Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.'
    //   471: invokestatic i : (Ljava/lang/String;Ljava/lang/String;)I
    //   474: pop
    //   475: invokestatic getInstance : ()Ljava/util/Calendar;
    //   478: bipush #11
    //   480: invokevirtual get : (I)I
    //   483: istore_2
    //   484: iload_2
    //   485: bipush #6
    //   487: if_icmplt -> 496
    //   490: iload_2
    //   491: bipush #22
    //   493: if_icmplt -> 499
    //   496: iconst_1
    //   497: istore #11
    //   499: iload #11
    //   501: ifeq -> 507
    //   504: goto -> 509
    //   507: iconst_1
    //   508: istore_1
    //   509: iload_1
    //   510: ireturn
    //   511: aload #13
    //   513: checkcast android/os/PowerManager
    //   516: invokestatic a : (Landroid/os/PowerManager;)Z
    //   519: ifeq -> 525
    //   522: goto -> 527
    //   525: iconst_1
    //   526: istore_1
    //   527: iload_1
    //   528: ireturn
    // Exception table:
    //   from	to	target	type
    //   106	125	128	java/lang/Exception
    //   172	191	194	java/lang/Exception
  }
  
  public final void i() {
    int i = this.c;
    u6 u61 = this.d;
    switch (i) {
      default:
        u61.n(true, true);
        return;
      case 0:
        break;
    } 
    u61.n(true, true);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\p6.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;

public final class jc2 extends BroadcastReceiver {
  public boolean a;
  
  public final boolean b;
  
  public final sa2 c;
  
  public jc2(sa2 paramsa2, boolean paramBoolean) {
    this.b = paramBoolean;
  }
  
  public final void a(Context paramContext, IntentFilter paramIntentFilter) {
    /* monitor enter ThisExpression{ObjectType{jc2}} */
    try {
      boolean bool = this.a;
      if (bool) {
        /* monitor exit ThisExpression{ObjectType{jc2}} */
        return;
      } 
      if (Build.VERSION.SDK_INT >= 33) {
        byte b;
        if (true != this.b) {
          b = 4;
        } else {
          b = 2;
        } 
        paramContext.registerReceiver(this, paramIntentFilter, b);
      } else {
        paramContext.registerReceiver(this, paramIntentFilter);
      } 
    } finally {}
    this.a = true;
    /* monitor exit ThisExpression{ObjectType{jc2}} */
  }
  
  public final void b(Context paramContext, IntentFilter paramIntentFilter) {
    /* monitor enter ThisExpression{ObjectType{jc2}} */
    try {
      jc2 jc23;
      boolean bool = this.a;
      if (bool)
        return; 
    } finally {
      jc2 jc23;
      paramIntentFilter = null;
    } 
    jc2 jc21 = this;
    jc2 jc22 = jc21;
    jc21.a = true;
    /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{jc2}, name=null} */
  }
  
  public final void c(Context paramContext) {
    /* monitor enter ThisExpression{ObjectType{jc2}} */
    try {
      if (this.a) {
        paramContext.unregisterReceiver(this);
        this.a = false;
        /* monitor exit ThisExpression{ObjectType{jc2}} */
        return;
      } 
    } finally {}
    ph2.h("BillingBroadcastManager", "Receiver is not registered.");
    /* monitor exit ThisExpression{ObjectType{jc2}} */
  }
  
  public final void d(Bundle paramBundle, qf paramqf, int paramInt, on2 paramon2, long paramLong, boolean paramBoolean) {
    try {
      yi2 yi22;
      byte[] arrayOfByte = paramBundle.getByteArray("FAILURE_LOGGING_PAYLOAD");
      sa2 sa21 = this.c;
      if (arrayOfByte != null) {
        yi22 = (yi2)sa21.f;
        return;
      } 
      yi2 yi21 = (yi2)sa21.f;
      return;
    } finally {
      paramBundle = null;
      ph2.h("BillingBroadcastManager", "Failed parsing Api failure.");
    } 
  }
  
  public final void onReceive(Context paramContext, Intent paramIntent) {
    // Byte code:
    //   0: aload_2
    //   1: invokevirtual getAction : ()Ljava/lang/String;
    //   4: astore_1
    //   5: aload_1
    //   6: invokevirtual hashCode : ()I
    //   9: istore_3
    //   10: getstatic on2.f : Lon2;
    //   13: astore #9
    //   15: getstatic on2.e : Lon2;
    //   18: astore #8
    //   20: getstatic on2.g : Lon2;
    //   23: astore #10
    //   25: iload_3
    //   26: ldc -1484087650
    //   28: if_icmpeq -> 76
    //   31: iload_3
    //   32: ldc -337612916
    //   34: if_icmpeq -> 61
    //   37: iload_3
    //   38: ldc 345207161
    //   40: if_icmpeq -> 46
    //   43: goto -> 91
    //   46: aload_1
    //   47: ldc 'com.android.vending.billing.ALTERNATIVE_BILLING'
    //   49: invokevirtual equals : (Ljava/lang/Object;)Z
    //   52: ifeq -> 91
    //   55: aload #10
    //   57: astore_1
    //   58: goto -> 95
    //   61: aload_1
    //   62: ldc 'com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED'
    //   64: invokevirtual equals : (Ljava/lang/Object;)Z
    //   67: ifeq -> 91
    //   70: aload #9
    //   72: astore_1
    //   73: goto -> 95
    //   76: aload_1
    //   77: ldc 'com.android.vending.billing.PURCHASES_UPDATED'
    //   79: invokevirtual equals : (Ljava/lang/Object;)Z
    //   82: ifeq -> 91
    //   85: aload #8
    //   87: astore_1
    //   88: goto -> 95
    //   91: getstatic on2.c : Lon2;
    //   94: astore_1
    //   95: aload_1
    //   96: aload #9
    //   98: invokevirtual equals : (Ljava/lang/Object;)Z
    //   101: ifne -> 113
    //   104: aload_1
    //   105: aload #10
    //   107: invokevirtual equals : (Ljava/lang/Object;)Z
    //   110: ifeq -> 118
    //   113: iconst_2
    //   114: istore_3
    //   115: goto -> 138
    //   118: aload_1
    //   119: aload #8
    //   121: invokevirtual equals : (Ljava/lang/Object;)Z
    //   124: ifeq -> 133
    //   127: bipush #32
    //   129: istore_3
    //   130: goto -> 138
    //   133: iconst_1
    //   134: istore_3
    //   135: goto -> 130
    //   138: aload_2
    //   139: invokevirtual getExtras : ()Landroid/os/Bundle;
    //   142: astore #12
    //   144: aload_0
    //   145: getfield c : Lsa2;
    //   148: astore #11
    //   150: aload #12
    //   152: ifnonnull -> 214
    //   155: ldc 'BillingBroadcastManager'
    //   157: ldc 'Bundle is null.'
    //   159: invokestatic h : (Ljava/lang/String;Ljava/lang/String;)V
    //   162: aload #11
    //   164: getfield f : Ljava/lang/Object;
    //   167: checkcast yi2
    //   170: astore #8
    //   172: getstatic ij2.h : Lqf;
    //   175: astore_2
    //   176: bipush #11
    //   178: iload_3
    //   179: aload_2
    //   180: aconst_null
    //   181: aload_1
    //   182: invokestatic b : (IILqf;Ljava/lang/String;Lon2;)Lcn2;
    //   185: astore_1
    //   186: aload #8
    //   188: checkcast j01
    //   191: aload_1
    //   192: invokevirtual J : (Lcn2;)V
    //   195: aload #11
    //   197: getfield e : Ljava/lang/Object;
    //   200: checkcast lf
    //   203: astore_1
    //   204: aload_1
    //   205: ifnull -> 540
    //   208: aload_1
    //   209: aload_2
    //   210: invokevirtual k : (Lqf;)V
    //   213: return
    //   214: iload_3
    //   215: iconst_2
    //   216: if_icmpne -> 363
    //   219: getstatic ph2.a : I
    //   222: istore #4
    //   224: invokestatic a : ()Lpf;
    //   227: astore #13
    //   229: aload #13
    //   231: ldc 'BillingBroadcastManager'
    //   233: aload_2
    //   234: invokevirtual getExtras : ()Landroid/os/Bundle;
    //   237: invokestatic a : (Ljava/lang/String;Landroid/os/Bundle;)I
    //   240: putfield a : I
    //   243: aload_2
    //   244: invokevirtual getExtras : ()Landroid/os/Bundle;
    //   247: astore #14
    //   249: aload #14
    //   251: ifnonnull -> 267
    //   254: ldc 'BillingBroadcastManager'
    //   256: ldc 'Unexpected null bundle received!'
    //   258: invokestatic h : (Ljava/lang/String;Ljava/lang/String;)V
    //   261: iconst_0
    //   262: istore #4
    //   264: goto -> 333
    //   267: aload #14
    //   269: ldc 'SUB_RESPONSE_CODE'
    //   271: invokevirtual get : (Ljava/lang/String;)Ljava/lang/Object;
    //   274: astore #14
    //   276: aload #14
    //   278: ifnonnull -> 291
    //   281: ldc 'BillingBroadcastManager'
    //   283: ldc 'getOnPurchasesUpdatedSubResponseCodeFromBundle() got null response code, assuming OK'
    //   285: invokestatic g : (Ljava/lang/String;Ljava/lang/String;)V
    //   288: goto -> 261
    //   291: aload #14
    //   293: instanceof java/lang/Integer
    //   296: ifeq -> 312
    //   299: aload #14
    //   301: checkcast java/lang/Integer
    //   304: invokevirtual intValue : ()I
    //   307: istore #4
    //   309: goto -> 333
    //   312: ldc 'BillingBroadcastManager'
    //   314: ldc 'Unexpected type for bundle sub response code: '
    //   316: aload #14
    //   318: invokevirtual getClass : ()Ljava/lang/Class;
    //   321: invokevirtual getName : ()Ljava/lang/String;
    //   324: invokevirtual concat : (Ljava/lang/String;)Ljava/lang/String;
    //   327: invokestatic h : (Ljava/lang/String;Ljava/lang/String;)V
    //   330: goto -> 261
    //   333: aload #13
    //   335: iload #4
    //   337: putfield b : I
    //   340: aload #13
    //   342: ldc 'BillingBroadcastManager'
    //   344: aload_2
    //   345: invokevirtual getExtras : ()Landroid/os/Bundle;
    //   348: invokestatic f : (Ljava/lang/String;Landroid/os/Bundle;)Ljava/lang/String;
    //   351: putfield c : Ljava/io/Serializable;
    //   354: aload #13
    //   356: invokevirtual a : ()Lqf;
    //   359: astore_2
    //   360: goto -> 370
    //   363: ldc 'BillingBroadcastManager'
    //   365: aload_2
    //   366: invokestatic e : (Ljava/lang/String;Landroid/content/Intent;)Lqf;
    //   369: astore_2
    //   370: aload #12
    //   372: ldc 'billingClientTransactionId'
    //   374: lconst_0
    //   375: invokevirtual getLong : (Ljava/lang/String;J)J
    //   378: lstore #6
    //   380: aload #12
    //   382: ldc 'wasServiceAutoReconnected'
    //   384: iconst_0
    //   385: invokevirtual getBoolean : (Ljava/lang/String;Z)Z
    //   388: istore #5
    //   390: aload_1
    //   391: aload #8
    //   393: invokevirtual equals : (Ljava/lang/Object;)Z
    //   396: ifne -> 408
    //   399: aload_1
    //   400: aload #9
    //   402: invokevirtual equals : (Ljava/lang/Object;)Z
    //   405: ifeq -> 411
    //   408: goto -> 541
    //   411: aload_1
    //   412: aload #10
    //   414: invokevirtual equals : (Ljava/lang/Object;)Z
    //   417: ifeq -> 540
    //   420: aload_2
    //   421: getfield a : I
    //   424: ifeq -> 465
    //   427: aload_0
    //   428: aload #12
    //   430: aload_2
    //   431: iload_3
    //   432: aload_1
    //   433: lload #6
    //   435: iload #5
    //   437: invokevirtual d : (Landroid/os/Bundle;Lqf;ILon2;JZ)V
    //   440: aload #11
    //   442: getfield e : Ljava/lang/Object;
    //   445: checkcast lf
    //   448: astore_1
    //   449: getstatic ch2.c : Lyg2;
    //   452: astore #8
    //   454: getstatic th2.g : Lth2;
    //   457: astore #8
    //   459: aload_1
    //   460: aload_2
    //   461: invokevirtual k : (Lqf;)V
    //   464: return
    //   465: aload #11
    //   467: invokevirtual getClass : ()Ljava/lang/Class;
    //   470: pop
    //   471: ldc 'BillingBroadcastManager'
    //   473: ldc 'No valid alternative billing listener is registered.'
    //   475: invokestatic h : (Ljava/lang/String;Ljava/lang/String;)V
    //   478: aload #11
    //   480: getfield f : Ljava/lang/Object;
    //   483: checkcast yi2
    //   486: astore #8
    //   488: getstatic ij2.h : Lqf;
    //   491: astore_2
    //   492: sipush #141
    //   495: iload_3
    //   496: aload_2
    //   497: aconst_null
    //   498: aload_1
    //   499: invokestatic b : (IILqf;Ljava/lang/String;Lon2;)Lcn2;
    //   502: astore_1
    //   503: aload #8
    //   505: checkcast j01
    //   508: aload_1
    //   509: lload #6
    //   511: iload #5
    //   513: invokevirtual L : (Lcn2;JZ)V
    //   516: aload #11
    //   518: getfield e : Ljava/lang/Object;
    //   521: checkcast lf
    //   524: astore_1
    //   525: getstatic ch2.c : Lyg2;
    //   528: astore #8
    //   530: getstatic th2.g : Lth2;
    //   533: astore #8
    //   535: aload_1
    //   536: aload_2
    //   537: invokevirtual k : (Lqf;)V
    //   540: return
    //   541: aload #12
    //   543: ldc 'INAPP_PURCHASE_DATA_LIST'
    //   545: invokevirtual getStringArrayList : (Ljava/lang/String;)Ljava/util/ArrayList;
    //   548: astore #10
    //   550: aload #12
    //   552: ldc_w 'INAPP_DATA_SIGNATURE_LIST'
    //   555: invokevirtual getStringArrayList : (Ljava/lang/String;)Ljava/util/ArrayList;
    //   558: astore #9
    //   560: new java/util/ArrayList
    //   563: dup
    //   564: invokespecial <init> : ()V
    //   567: astore #8
    //   569: aload #10
    //   571: ifnull -> 579
    //   574: aload #9
    //   576: ifnonnull -> 582
    //   579: goto -> 706
    //   582: aload #10
    //   584: invokeinterface size : ()I
    //   589: istore #4
    //   591: new java/lang/StringBuilder
    //   594: dup
    //   595: ldc_w 'Found purchase list of '
    //   598: invokespecial <init> : (Ljava/lang/String;)V
    //   601: astore #13
    //   603: aload #13
    //   605: iload #4
    //   607: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   610: pop
    //   611: aload #13
    //   613: ldc_w ' items'
    //   616: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   619: pop
    //   620: ldc_w 'BillingHelper'
    //   623: aload #13
    //   625: invokevirtual toString : ()Ljava/lang/String;
    //   628: invokestatic g : (Ljava/lang/String;Ljava/lang/String;)V
    //   631: iconst_0
    //   632: istore #4
    //   634: iload #4
    //   636: aload #10
    //   638: invokeinterface size : ()I
    //   643: if_icmpge -> 752
    //   646: iload #4
    //   648: aload #9
    //   650: invokeinterface size : ()I
    //   655: if_icmpge -> 752
    //   658: aload #10
    //   660: iload #4
    //   662: invokeinterface get : (I)Ljava/lang/Object;
    //   667: checkcast java/lang/String
    //   670: aload #9
    //   672: iload #4
    //   674: invokeinterface get : (I)Ljava/lang/Object;
    //   679: checkcast java/lang/String
    //   682: invokestatic j : (Ljava/lang/String;Ljava/lang/String;)Lcom/android/billingclient/api/Purchase;
    //   685: astore #13
    //   687: aload #13
    //   689: ifnull -> 700
    //   692: aload #8
    //   694: aload #13
    //   696: invokevirtual add : (Ljava/lang/Object;)Z
    //   699: pop
    //   700: iinc #4, 1
    //   703: goto -> 634
    //   706: aload #12
    //   708: ldc_w 'INAPP_PURCHASE_DATA'
    //   711: invokevirtual getString : (Ljava/lang/String;)Ljava/lang/String;
    //   714: aload #12
    //   716: ldc_w 'INAPP_DATA_SIGNATURE'
    //   719: invokevirtual getString : (Ljava/lang/String;)Ljava/lang/String;
    //   722: invokestatic j : (Ljava/lang/String;Ljava/lang/String;)Lcom/android/billingclient/api/Purchase;
    //   725: astore #9
    //   727: aload #9
    //   729: ifnonnull -> 744
    //   732: ldc_w 'BillingHelper'
    //   735: ldc_w 'Couldn't find single purchase data as well.'
    //   738: invokestatic g : (Ljava/lang/String;Ljava/lang/String;)V
    //   741: goto -> 752
    //   744: aload #8
    //   746: aload #9
    //   748: invokevirtual add : (Ljava/lang/Object;)Z
    //   751: pop
    //   752: aload_2
    //   753: getfield a : I
    //   756: ifne -> 936
    //   759: aload #11
    //   761: getfield f : Ljava/lang/Object;
    //   764: checkcast yi2
    //   767: astore #8
    //   769: iload_3
    //   770: aload_1
    //   771: invokestatic c : (ILon2;)Lkn2;
    //   774: astore #9
    //   776: aload #8
    //   778: checkcast j01
    //   781: astore #8
    //   783: aload #8
    //   785: invokevirtual getClass : ()Ljava/lang/Class;
    //   788: pop
    //   789: aload #9
    //   791: invokevirtual l : ()Luk2;
    //   794: checkcast dn2
    //   797: astore_1
    //   798: aload #9
    //   800: invokevirtual r : ()Ldo2;
    //   803: invokevirtual l : ()Luk2;
    //   806: checkcast vn2
    //   809: astore #9
    //   811: aload #9
    //   813: invokevirtual b : ()V
    //   816: aload #9
    //   818: getfield c : Lwk2;
    //   821: checkcast do2
    //   824: iload #5
    //   826: invokestatic q : (Ldo2;Z)V
    //   829: aload_1
    //   830: invokevirtual b : ()V
    //   833: aload_1
    //   834: getfield c : Lwk2;
    //   837: checkcast kn2
    //   840: aload #9
    //   842: invokevirtual a : ()Lwk2;
    //   845: checkcast do2
    //   848: invokestatic u : (Lkn2;Ldo2;)V
    //   851: aload_1
    //   852: invokevirtual a : ()Lwk2;
    //   855: checkcast kn2
    //   858: astore #9
    //   860: aload #8
    //   862: getfield c : Ljava/lang/Object;
    //   865: checkcast rn2
    //   868: astore_1
    //   869: lload #6
    //   871: lconst_0
    //   872: lcmp
    //   873: ifne -> 879
    //   876: goto -> 911
    //   879: aload_1
    //   880: invokevirtual l : ()Luk2;
    //   883: checkcast qn2
    //   886: astore_1
    //   887: aload_1
    //   888: invokevirtual b : ()V
    //   891: aload_1
    //   892: getfield c : Lwk2;
    //   895: checkcast rn2
    //   898: lload #6
    //   900: invokestatic E : (Lrn2;J)V
    //   903: aload_1
    //   904: invokevirtual a : ()Lwk2;
    //   907: checkcast rn2
    //   910: astore_1
    //   911: aload #8
    //   913: aload #9
    //   915: aload_1
    //   916: invokevirtual R : (Lkn2;Lrn2;)V
    //   919: goto -> 933
    //   922: astore_1
    //   923: ldc_w 'BillingLogger'
    //   926: ldc_w 'Unable to log.'
    //   929: aload_1
    //   930: invokestatic i : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   933: goto -> 949
    //   936: aload_0
    //   937: aload #12
    //   939: aload_2
    //   940: iload_3
    //   941: aload_1
    //   942: lload #6
    //   944: iload #5
    //   946: invokevirtual d : (Landroid/os/Bundle;Lqf;ILon2;JZ)V
    //   949: aload #11
    //   951: getfield e : Ljava/lang/Object;
    //   954: checkcast lf
    //   957: aload_2
    //   958: invokevirtual k : (Lqf;)V
    //   961: return
    // Exception table:
    //   from	to	target	type
    //   789	860	922	finally
    //   879	911	922	finally
    //   911	919	922	finally
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\jc2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
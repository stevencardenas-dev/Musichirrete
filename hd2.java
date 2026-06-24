public final class hd2 extends cg2 {
  public final int o;
  
  public final nf1 p;
  
  public hd2(nf1 paramnf1, int paramInt) {
    super(paramnf1, false);
  }
  
  public final void i() {
    // Byte code:
    //   0: aload_0
    //   1: getfield o : I
    //   4: istore_1
    //   5: aload_0
    //   6: getfield p : Lnf1;
    //   9: astore #4
    //   11: iload_1
    //   12: tableswitch default -> 52, 0 -> 523, 1 -> 509, 2 -> 420, 3 -> 331, 4 -> 242, 5 -> 153
    //   52: aload #4
    //   54: getfield c : Lte2;
    //   57: astore #6
    //   59: aload_0
    //   60: invokevirtual j : ()Lye2;
    //   63: astore #5
    //   65: aload #6
    //   67: invokevirtual getClass : ()Ljava/lang/Class;
    //   70: pop
    //   71: new org/json/JSONObject
    //   74: dup
    //   75: invokespecial <init> : ()V
    //   78: astore #4
    //   80: aload #6
    //   82: invokevirtual n : ()J
    //   85: lstore_2
    //   86: aload #4
    //   88: ldc 'requestId'
    //   90: lload_2
    //   91: invokevirtual put : (Ljava/lang/String;J)Lorg/json/JSONObject;
    //   94: pop
    //   95: aload #4
    //   97: ldc 'type'
    //   99: ldc 'GET_STATUS'
    //   101: invokevirtual put : (Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   104: pop
    //   105: aload #6
    //   107: getfield f : Lkw0;
    //   110: astore #7
    //   112: aload #7
    //   114: ifnull -> 130
    //   117: aload #4
    //   119: ldc 'mediaSessionId'
    //   121: aload #7
    //   123: getfield c : J
    //   126: invokevirtual put : (Ljava/lang/String;J)Lorg/json/JSONObject;
    //   129: pop
    //   130: aload #6
    //   132: lload_2
    //   133: aload #4
    //   135: invokevirtual toString : ()Ljava/lang/String;
    //   138: invokevirtual m : (JLjava/lang/String;)V
    //   141: aload #6
    //   143: getfield q : Ldf2;
    //   146: lload_2
    //   147: aload #5
    //   149: invokevirtual a : (JLye2;)V
    //   152: return
    //   153: aload #4
    //   155: getfield c : Lte2;
    //   158: astore #6
    //   160: aload_0
    //   161: invokevirtual j : ()Lye2;
    //   164: astore #7
    //   166: aload #6
    //   168: invokevirtual getClass : ()Ljava/lang/Class;
    //   171: pop
    //   172: new org/json/JSONObject
    //   175: dup
    //   176: invokespecial <init> : ()V
    //   179: astore #5
    //   181: aload #6
    //   183: invokevirtual n : ()J
    //   186: lstore_2
    //   187: aload #5
    //   189: ldc 'requestId'
    //   191: lload_2
    //   192: invokevirtual put : (Ljava/lang/String;J)Lorg/json/JSONObject;
    //   195: pop
    //   196: aload #5
    //   198: ldc 'type'
    //   200: ldc 'PLAY'
    //   202: invokevirtual put : (Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   205: pop
    //   206: aload #5
    //   208: ldc 'mediaSessionId'
    //   210: aload #6
    //   212: invokevirtual b : ()J
    //   215: invokevirtual put : (Ljava/lang/String;J)Lorg/json/JSONObject;
    //   218: pop
    //   219: aload #6
    //   221: lload_2
    //   222: aload #5
    //   224: invokevirtual toString : ()Ljava/lang/String;
    //   227: invokevirtual m : (JLjava/lang/String;)V
    //   230: aload #6
    //   232: getfield l : Ldf2;
    //   235: lload_2
    //   236: aload #7
    //   238: invokevirtual a : (JLye2;)V
    //   241: return
    //   242: aload #4
    //   244: getfield c : Lte2;
    //   247: astore #4
    //   249: aload_0
    //   250: invokevirtual j : ()Lye2;
    //   253: astore #7
    //   255: aload #4
    //   257: invokevirtual getClass : ()Ljava/lang/Class;
    //   260: pop
    //   261: new org/json/JSONObject
    //   264: dup
    //   265: invokespecial <init> : ()V
    //   268: astore #5
    //   270: aload #4
    //   272: invokevirtual n : ()J
    //   275: lstore_2
    //   276: aload #5
    //   278: ldc 'requestId'
    //   280: lload_2
    //   281: invokevirtual put : (Ljava/lang/String;J)Lorg/json/JSONObject;
    //   284: pop
    //   285: aload #5
    //   287: ldc 'type'
    //   289: ldc 'STOP'
    //   291: invokevirtual put : (Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   294: pop
    //   295: aload #5
    //   297: ldc 'mediaSessionId'
    //   299: aload #4
    //   301: invokevirtual b : ()J
    //   304: invokevirtual put : (Ljava/lang/String;J)Lorg/json/JSONObject;
    //   307: pop
    //   308: aload #4
    //   310: lload_2
    //   311: aload #5
    //   313: invokevirtual toString : ()Ljava/lang/String;
    //   316: invokevirtual m : (JLjava/lang/String;)V
    //   319: aload #4
    //   321: getfield m : Ldf2;
    //   324: lload_2
    //   325: aload #7
    //   327: invokevirtual a : (JLye2;)V
    //   330: return
    //   331: aload #4
    //   333: getfield c : Lte2;
    //   336: astore #4
    //   338: aload_0
    //   339: invokevirtual j : ()Lye2;
    //   342: astore #6
    //   344: aload #4
    //   346: invokevirtual getClass : ()Ljava/lang/Class;
    //   349: pop
    //   350: new org/json/JSONObject
    //   353: dup
    //   354: invokespecial <init> : ()V
    //   357: astore #5
    //   359: aload #4
    //   361: invokevirtual n : ()J
    //   364: lstore_2
    //   365: aload #5
    //   367: ldc 'requestId'
    //   369: lload_2
    //   370: invokevirtual put : (Ljava/lang/String;J)Lorg/json/JSONObject;
    //   373: pop
    //   374: aload #5
    //   376: ldc 'type'
    //   378: ldc 'PAUSE'
    //   380: invokevirtual put : (Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   383: pop
    //   384: aload #5
    //   386: ldc 'mediaSessionId'
    //   388: aload #4
    //   390: invokevirtual b : ()J
    //   393: invokevirtual put : (Ljava/lang/String;J)Lorg/json/JSONObject;
    //   396: pop
    //   397: aload #4
    //   399: lload_2
    //   400: aload #5
    //   402: invokevirtual toString : ()Ljava/lang/String;
    //   405: invokevirtual m : (JLjava/lang/String;)V
    //   408: aload #4
    //   410: getfield k : Ldf2;
    //   413: lload_2
    //   414: aload #6
    //   416: invokevirtual a : (JLye2;)V
    //   419: return
    //   420: aload #4
    //   422: getfield c : Lte2;
    //   425: astore #5
    //   427: aload_0
    //   428: invokevirtual j : ()Lye2;
    //   431: astore #4
    //   433: aload #5
    //   435: invokevirtual getClass : ()Ljava/lang/Class;
    //   438: pop
    //   439: new org/json/JSONObject
    //   442: dup
    //   443: invokespecial <init> : ()V
    //   446: astore #7
    //   448: aload #5
    //   450: invokevirtual n : ()J
    //   453: lstore_2
    //   454: aload #7
    //   456: ldc 'requestId'
    //   458: lload_2
    //   459: invokevirtual put : (Ljava/lang/String;J)Lorg/json/JSONObject;
    //   462: pop
    //   463: aload #7
    //   465: ldc 'type'
    //   467: ldc 'QUEUE_GET_ITEM_IDS'
    //   469: invokevirtual put : (Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   472: pop
    //   473: aload #7
    //   475: ldc 'mediaSessionId'
    //   477: aload #5
    //   479: invokevirtual b : ()J
    //   482: invokevirtual put : (Ljava/lang/String;J)Lorg/json/JSONObject;
    //   485: pop
    //   486: aload #5
    //   488: lload_2
    //   489: aload #7
    //   491: invokevirtual toString : ()Ljava/lang/String;
    //   494: invokevirtual m : (JLjava/lang/String;)V
    //   497: aload #5
    //   499: getfield s : Ldf2;
    //   502: lload_2
    //   503: aload #4
    //   505: invokevirtual a : (JLye2;)V
    //   508: return
    //   509: aload #4
    //   511: getfield c : Lte2;
    //   514: aload_0
    //   515: invokevirtual j : ()Lye2;
    //   518: iconst_1
    //   519: invokevirtual a : (Lye2;I)V
    //   522: return
    //   523: aload #4
    //   525: getfield c : Lte2;
    //   528: aload_0
    //   529: invokevirtual j : ()Lye2;
    //   532: iconst_m1
    //   533: invokevirtual a : (Lye2;I)V
    //   536: return
    //   537: astore #7
    //   539: goto -> 130
    //   542: astore #4
    //   544: goto -> 219
    //   547: astore #6
    //   549: goto -> 308
    //   552: astore #7
    //   554: goto -> 397
    //   557: astore #6
    //   559: goto -> 486
    // Exception table:
    //   from	to	target	type
    //   86	112	537	org/json/JSONException
    //   117	130	537	org/json/JSONException
    //   187	219	542	org/json/JSONException
    //   276	308	547	org/json/JSONException
    //   365	397	552	org/json/JSONException
    //   454	486	557	org/json/JSONException
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\hd2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
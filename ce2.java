public final class ce2 extends cg2 {
  public final int o;
  
  public final nf1 p;
  
  public final Object q;
  
  public ce2(nf1 paramnf1, int[] paramArrayOfint) {
    super(paramnf1, true);
  }
  
  public final void i() {
    // Byte code:
    //   0: aload_0
    //   1: getfield o : I
    //   4: istore_3
    //   5: iconst_0
    //   6: istore_1
    //   7: iconst_0
    //   8: istore_2
    //   9: aload_0
    //   10: getfield q : Ljava/lang/Object;
    //   13: astore #8
    //   15: aload_0
    //   16: getfield p : Lnf1;
    //   19: astore #9
    //   21: iload_3
    //   22: tableswitch default -> 44, 0 -> 604, 1 -> 191
    //   44: aload #9
    //   46: getfield c : Lte2;
    //   49: astore #9
    //   51: aload_0
    //   52: invokevirtual j : ()Lye2;
    //   55: astore #10
    //   57: aload #8
    //   59: checkcast ov0
    //   62: astore #11
    //   64: aload #9
    //   66: invokevirtual getClass : ()Ljava/lang/Class;
    //   69: pop
    //   70: new org/json/JSONObject
    //   73: dup
    //   74: invokespecial <init> : ()V
    //   77: astore #8
    //   79: aload #9
    //   81: invokevirtual n : ()J
    //   84: lstore #6
    //   86: aload #11
    //   88: getfield a : J
    //   91: lstore #4
    //   93: aload #8
    //   95: ldc 'requestId'
    //   97: lload #6
    //   99: invokevirtual put : (Ljava/lang/String;J)Lorg/json/JSONObject;
    //   102: pop
    //   103: aload #8
    //   105: ldc 'type'
    //   107: ldc 'SEEK'
    //   109: invokevirtual put : (Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   112: pop
    //   113: aload #8
    //   115: ldc 'mediaSessionId'
    //   117: aload #9
    //   119: invokevirtual b : ()J
    //   122: invokevirtual put : (Ljava/lang/String;J)Lorg/json/JSONObject;
    //   125: pop
    //   126: getstatic qj.a : Ljava/util/regex/Pattern;
    //   129: astore #11
    //   131: aload #8
    //   133: ldc 'currentTime'
    //   135: lload #4
    //   137: l2d
    //   138: ldc2_w 1000.0
    //   141: ddiv
    //   142: invokevirtual put : (Ljava/lang/String;D)Lorg/json/JSONObject;
    //   145: pop
    //   146: aload #9
    //   148: lload #6
    //   150: aload #8
    //   152: invokevirtual toString : ()Ljava/lang/String;
    //   155: invokevirtual m : (JLjava/lang/String;)V
    //   158: aload #9
    //   160: lload #4
    //   162: invokestatic valueOf : (J)Ljava/lang/Long;
    //   165: putfield g : Ljava/lang/Long;
    //   168: aload #9
    //   170: getfield n : Ldf2;
    //   173: lload #6
    //   175: new fe2
    //   178: dup
    //   179: aload #9
    //   181: aload #10
    //   183: iconst_0
    //   184: invokespecial <init> : (Lte2;Lye2;I)V
    //   187: invokevirtual a : (JLye2;)V
    //   190: return
    //   191: aload #9
    //   193: getfield c : Lte2;
    //   196: astore #10
    //   198: aload_0
    //   199: invokevirtual j : ()Lye2;
    //   202: astore #9
    //   204: aload #8
    //   206: checkcast jt0
    //   209: astore #11
    //   211: aload #10
    //   213: invokevirtual getClass : ()Ljava/lang/Class;
    //   216: pop
    //   217: aload #11
    //   219: getfield b : Lcom/google/android/gms/cast/MediaInfo;
    //   222: astore #8
    //   224: aload #11
    //   226: getfield c : Ltt0;
    //   229: astore #12
    //   231: aload #8
    //   233: ifnonnull -> 252
    //   236: aload #12
    //   238: ifnull -> 244
    //   241: goto -> 252
    //   244: ldc 'MediaInfo and MediaQueueData should not be both null'
    //   246: invokestatic l : (Ljava/lang/String;)V
    //   249: goto -> 603
    //   252: new org/json/JSONObject
    //   255: dup
    //   256: invokespecial <init> : ()V
    //   259: astore #8
    //   261: aload #11
    //   263: getfield b : Lcom/google/android/gms/cast/MediaInfo;
    //   266: astore #13
    //   268: aload #13
    //   270: ifnull -> 294
    //   273: aload #8
    //   275: ldc 'media'
    //   277: aload #13
    //   279: invokevirtual f : ()Lorg/json/JSONObject;
    //   282: invokevirtual put : (Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   285: pop
    //   286: goto -> 294
    //   289: astore #8
    //   291: goto -> 513
    //   294: aload #12
    //   296: ifnull -> 312
    //   299: aload #8
    //   301: ldc 'queueData'
    //   303: aload #12
    //   305: invokevirtual e : ()Lorg/json/JSONObject;
    //   308: invokevirtual put : (Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   311: pop
    //   312: aload #8
    //   314: ldc 'autoplay'
    //   316: aload #11
    //   318: getfield e : Ljava/lang/Boolean;
    //   321: invokevirtual putOpt : (Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   324: pop
    //   325: aload #11
    //   327: getfield f : J
    //   330: lstore #4
    //   332: lload #4
    //   334: ldc2_w -1
    //   337: lcmp
    //   338: ifeq -> 361
    //   341: getstatic qj.a : Ljava/util/regex/Pattern;
    //   344: astore #12
    //   346: aload #8
    //   348: ldc 'currentTime'
    //   350: lload #4
    //   352: l2d
    //   353: ldc2_w 1000.0
    //   356: ddiv
    //   357: invokevirtual put : (Ljava/lang/String;D)Lorg/json/JSONObject;
    //   360: pop
    //   361: aload #8
    //   363: ldc 'playbackRate'
    //   365: aload #11
    //   367: getfield g : D
    //   370: invokevirtual put : (Ljava/lang/String;D)Lorg/json/JSONObject;
    //   373: pop
    //   374: aload #8
    //   376: ldc 'credentials'
    //   378: aload #11
    //   380: getfield k : Ljava/lang/String;
    //   383: invokevirtual putOpt : (Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   386: pop
    //   387: aload #8
    //   389: ldc 'credentialsType'
    //   391: aload #11
    //   393: getfield l : Ljava/lang/String;
    //   396: invokevirtual putOpt : (Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   399: pop
    //   400: aload #8
    //   402: ldc 'atvCredentials'
    //   404: aload #11
    //   406: getfield m : Ljava/lang/String;
    //   409: invokevirtual putOpt : (Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   412: pop
    //   413: aload #8
    //   415: ldc 'atvCredentialsType'
    //   417: aload #11
    //   419: getfield n : Ljava/lang/String;
    //   422: invokevirtual putOpt : (Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   425: pop
    //   426: aload #11
    //   428: getfield h : [J
    //   431: astore #13
    //   433: aload #13
    //   435: ifnull -> 484
    //   438: new org/json/JSONArray
    //   441: astore #12
    //   443: aload #12
    //   445: invokespecial <init> : ()V
    //   448: iload_2
    //   449: istore_1
    //   450: iload_1
    //   451: aload #13
    //   453: arraylength
    //   454: if_icmpge -> 474
    //   457: aload #12
    //   459: iload_1
    //   460: aload #13
    //   462: iload_1
    //   463: laload
    //   464: invokevirtual put : (IJ)Lorg/json/JSONArray;
    //   467: pop
    //   468: iinc #1, 1
    //   471: goto -> 450
    //   474: aload #8
    //   476: ldc 'activeTrackIds'
    //   478: aload #12
    //   480: invokevirtual put : (Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   483: pop
    //   484: aload #8
    //   486: ldc 'customData'
    //   488: aload #11
    //   490: getfield j : Lorg/json/JSONObject;
    //   493: invokevirtual putOpt : (Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   496: pop
    //   497: aload #8
    //   499: ldc 'requestId'
    //   501: aload #11
    //   503: getfield o : J
    //   506: invokevirtual put : (Ljava/lang/String;J)Lorg/json/JSONObject;
    //   509: pop
    //   510: goto -> 552
    //   513: getstatic jt0.p : Lrp0;
    //   516: astore #11
    //   518: aload #11
    //   520: getfield a : Ljava/lang/String;
    //   523: aload #11
    //   525: ldc 'Error transforming MediaLoadRequestData into JSONObject'
    //   527: iconst_1
    //   528: anewarray java/lang/Object
    //   531: dup
    //   532: iconst_0
    //   533: aload #8
    //   535: aastore
    //   536: invokevirtual c : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   539: invokestatic e : (Ljava/lang/String;Ljava/lang/String;)I
    //   542: pop
    //   543: new org/json/JSONObject
    //   546: dup
    //   547: invokespecial <init> : ()V
    //   550: astore #8
    //   552: aload #10
    //   554: invokevirtual n : ()J
    //   557: lstore #4
    //   559: aload #8
    //   561: ldc 'requestId'
    //   563: lload #4
    //   565: invokevirtual put : (Ljava/lang/String;J)Lorg/json/JSONObject;
    //   568: pop
    //   569: aload #8
    //   571: ldc 'type'
    //   573: ldc 'LOAD'
    //   575: invokevirtual put : (Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   578: pop
    //   579: aload #10
    //   581: lload #4
    //   583: aload #8
    //   585: invokevirtual toString : ()Ljava/lang/String;
    //   588: invokevirtual m : (JLjava/lang/String;)V
    //   591: aload #10
    //   593: getfield j : Ldf2;
    //   596: lload #4
    //   598: aload #9
    //   600: invokevirtual a : (JLye2;)V
    //   603: return
    //   604: aload #9
    //   606: getfield c : Lte2;
    //   609: astore #10
    //   611: aload_0
    //   612: invokevirtual j : ()Lye2;
    //   615: astore #9
    //   617: aload #8
    //   619: checkcast [I
    //   622: astore #12
    //   624: aload #10
    //   626: invokevirtual getClass : ()Ljava/lang/Class;
    //   629: pop
    //   630: new org/json/JSONObject
    //   633: dup
    //   634: invokespecial <init> : ()V
    //   637: astore #8
    //   639: aload #10
    //   641: invokevirtual n : ()J
    //   644: lstore #4
    //   646: aload #8
    //   648: ldc 'requestId'
    //   650: lload #4
    //   652: invokevirtual put : (Ljava/lang/String;J)Lorg/json/JSONObject;
    //   655: pop
    //   656: aload #8
    //   658: ldc 'type'
    //   660: ldc 'QUEUE_GET_ITEMS'
    //   662: invokevirtual put : (Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   665: pop
    //   666: aload #8
    //   668: ldc 'mediaSessionId'
    //   670: aload #10
    //   672: invokevirtual b : ()J
    //   675: invokevirtual put : (Ljava/lang/String;J)Lorg/json/JSONObject;
    //   678: pop
    //   679: new org/json/JSONArray
    //   682: astore #11
    //   684: aload #11
    //   686: invokespecial <init> : ()V
    //   689: aload #12
    //   691: arraylength
    //   692: istore_2
    //   693: iload_1
    //   694: iload_2
    //   695: if_icmpge -> 714
    //   698: aload #11
    //   700: aload #12
    //   702: iload_1
    //   703: iaload
    //   704: invokevirtual put : (I)Lorg/json/JSONArray;
    //   707: pop
    //   708: iinc #1, 1
    //   711: goto -> 693
    //   714: aload #8
    //   716: ldc 'itemIds'
    //   718: aload #11
    //   720: invokevirtual put : (Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   723: pop
    //   724: aload #10
    //   726: lload #4
    //   728: aload #8
    //   730: invokevirtual toString : ()Ljava/lang/String;
    //   733: invokevirtual m : (JLjava/lang/String;)V
    //   736: aload #10
    //   738: getfield t : Ldf2;
    //   741: lload #4
    //   743: aload #9
    //   745: invokevirtual a : (JLye2;)V
    //   748: return
    //   749: astore #11
    //   751: goto -> 146
    //   754: astore #11
    //   756: goto -> 579
    //   759: astore #11
    //   761: goto -> 724
    // Exception table:
    //   from	to	target	type
    //   93	146	749	org/json/JSONException
    //   261	268	289	org/json/JSONException
    //   273	286	289	org/json/JSONException
    //   299	312	289	org/json/JSONException
    //   312	332	289	org/json/JSONException
    //   341	361	289	org/json/JSONException
    //   361	433	289	org/json/JSONException
    //   438	448	289	org/json/JSONException
    //   450	468	289	org/json/JSONException
    //   474	484	289	org/json/JSONException
    //   484	510	289	org/json/JSONException
    //   559	579	754	org/json/JSONException
    //   646	693	759	org/json/JSONException
    //   698	708	759	org/json/JSONException
    //   714	724	759	org/json/JSONException
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\ce2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
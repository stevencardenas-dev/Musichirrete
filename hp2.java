import android.text.Editable;

public final class hp2 implements gx0, ns {
  public static final hp2 b = (hp2)new Object();
  
  public static final hp2 c = (hp2)new Object();
  
  public static final hp2 e = (hp2)new Object();
  
  public static final hp2 f = (hp2)new Object();
  
  public static final hp2 g = (hp2)new Object();
  
  public static final hp2 h = (hp2)new Object();
  
  public static final hp2 i = (hp2)new Object();
  
  public static final hp2 j = (hp2)new Object();
  
  public static final hp2 k = (hp2)new Object();
  
  public static final hp2 l = (hp2)new Object();
  
  public static final hp2 m = (hp2)new Object();
  
  public static final hp2 n = (hp2)new Object();
  
  public static final hp2 o = (hp2)new Object();
  
  public static final hp2 p = (hp2)new Object();
  
  public static final hp2 q = (hp2)new Object();
  
  public static final hp2 r = (hp2)new Object();
  
  public static final hp2 s = (hp2)new Object();
  
  public static final hp2 t = (hp2)new Object();
  
  public static final hp2 u = (hp2)new Object();
  
  public static boolean b(s30 params30, Editable paramEditable, int paramInt1, int paramInt2, boolean paramBoolean) {
    // Byte code:
    //   0: aload_1
    //   1: ifnull -> 503
    //   4: iload_2
    //   5: iflt -> 503
    //   8: iload_3
    //   9: ifge -> 15
    //   12: goto -> 503
    //   15: aload_1
    //   16: invokestatic getSelectionStart : (Ljava/lang/CharSequence;)I
    //   19: istore #6
    //   21: aload_1
    //   22: invokestatic getSelectionEnd : (Ljava/lang/CharSequence;)I
    //   25: istore #8
    //   27: iload #6
    //   29: iconst_m1
    //   30: if_icmpeq -> 503
    //   33: iload #8
    //   35: iconst_m1
    //   36: if_icmpeq -> 503
    //   39: iload #6
    //   41: iload #8
    //   43: if_icmpeq -> 49
    //   46: goto -> 503
    //   49: iload #4
    //   51: ifeq -> 354
    //   54: iload_2
    //   55: iconst_0
    //   56: invokestatic max : (II)I
    //   59: istore #7
    //   61: aload_1
    //   62: invokeinterface length : ()I
    //   67: istore_2
    //   68: iload #6
    //   70: iflt -> 94
    //   73: iload_2
    //   74: iload #6
    //   76: if_icmpge -> 82
    //   79: goto -> 94
    //   82: iload #6
    //   84: istore_2
    //   85: iload #7
    //   87: istore #6
    //   89: iload #7
    //   91: ifge -> 99
    //   94: iconst_m1
    //   95: istore_2
    //   96: goto -> 192
    //   99: iconst_0
    //   100: istore #7
    //   102: iload #6
    //   104: ifne -> 110
    //   107: goto -> 192
    //   110: iinc #2, -1
    //   113: iload_2
    //   114: ifge -> 130
    //   117: iload #7
    //   119: ifeq -> 125
    //   122: goto -> 94
    //   125: iconst_0
    //   126: istore_2
    //   127: goto -> 192
    //   130: aload_1
    //   131: iload_2
    //   132: invokeinterface charAt : (I)C
    //   137: istore #5
    //   139: iload #7
    //   141: ifeq -> 161
    //   144: iload #5
    //   146: invokestatic isHighSurrogate : (C)Z
    //   149: ifne -> 155
    //   152: goto -> 94
    //   155: iinc #6, -1
    //   158: goto -> 99
    //   161: iload #5
    //   163: invokestatic isSurrogate : (C)Z
    //   166: ifne -> 175
    //   169: iinc #6, -1
    //   172: goto -> 102
    //   175: iload #5
    //   177: invokestatic isHighSurrogate : (C)Z
    //   180: ifeq -> 186
    //   183: goto -> 94
    //   186: iconst_1
    //   187: istore #7
    //   189: goto -> 102
    //   192: iload_3
    //   193: iconst_0
    //   194: invokestatic max : (II)I
    //   197: istore #7
    //   199: aload_1
    //   200: invokeinterface length : ()I
    //   205: istore #9
    //   207: iload #8
    //   209: iflt -> 234
    //   212: iload #9
    //   214: iload #8
    //   216: if_icmpge -> 222
    //   219: goto -> 234
    //   222: iload #8
    //   224: istore_3
    //   225: iload #7
    //   227: istore #6
    //   229: iload #7
    //   231: ifge -> 239
    //   234: iconst_m1
    //   235: istore_3
    //   236: goto -> 338
    //   239: iconst_0
    //   240: istore #7
    //   242: iload #6
    //   244: ifne -> 250
    //   247: goto -> 338
    //   250: iload_3
    //   251: iload #9
    //   253: if_icmplt -> 267
    //   256: iload #9
    //   258: istore_3
    //   259: iload #7
    //   261: ifeq -> 338
    //   264: goto -> 234
    //   267: aload_1
    //   268: iload_3
    //   269: invokeinterface charAt : (I)C
    //   274: istore #5
    //   276: iload #7
    //   278: ifeq -> 301
    //   281: iload #5
    //   283: invokestatic isLowSurrogate : (C)Z
    //   286: ifne -> 292
    //   289: goto -> 234
    //   292: iinc #6, -1
    //   295: iinc #3, 1
    //   298: goto -> 239
    //   301: iload #5
    //   303: invokestatic isSurrogate : (C)Z
    //   306: ifne -> 318
    //   309: iinc #6, -1
    //   312: iinc #3, 1
    //   315: goto -> 242
    //   318: iload #5
    //   320: invokestatic isLowSurrogate : (C)Z
    //   323: ifeq -> 329
    //   326: goto -> 234
    //   329: iinc #3, 1
    //   332: iconst_1
    //   333: istore #7
    //   335: goto -> 242
    //   338: iload_2
    //   339: iconst_m1
    //   340: if_icmpeq -> 503
    //   343: iload_3
    //   344: istore #6
    //   346: iload_3
    //   347: iconst_m1
    //   348: if_icmpne -> 378
    //   351: goto -> 503
    //   354: iload #6
    //   356: iload_2
    //   357: isub
    //   358: iconst_0
    //   359: invokestatic max : (II)I
    //   362: istore_2
    //   363: iload #8
    //   365: iload_3
    //   366: iadd
    //   367: aload_1
    //   368: invokeinterface length : ()I
    //   373: invokestatic min : (II)I
    //   376: istore #6
    //   378: aload_1
    //   379: iload_2
    //   380: iload #6
    //   382: ldc v30
    //   384: invokeinterface getSpans : (IILjava/lang/Class;)[Ljava/lang/Object;
    //   389: checkcast [Lv30;
    //   392: astore #11
    //   394: aload #11
    //   396: ifnull -> 503
    //   399: aload #11
    //   401: arraylength
    //   402: ifle -> 503
    //   405: aload #11
    //   407: arraylength
    //   408: istore #7
    //   410: iconst_0
    //   411: istore_3
    //   412: iload_3
    //   413: iload #7
    //   415: if_icmpge -> 464
    //   418: aload #11
    //   420: iload_3
    //   421: aaload
    //   422: astore #10
    //   424: aload_1
    //   425: aconst_null
    //   426: invokeinterface getSpanStart : (Ljava/lang/Object;)I
    //   431: istore #9
    //   433: aload_1
    //   434: aconst_null
    //   435: invokeinterface getSpanEnd : (Ljava/lang/Object;)I
    //   440: istore #8
    //   442: iload #9
    //   444: iload_2
    //   445: invokestatic min : (II)I
    //   448: istore_2
    //   449: iload #8
    //   451: iload #6
    //   453: invokestatic max : (II)I
    //   456: istore #6
    //   458: iinc #3, 1
    //   461: goto -> 412
    //   464: iload_2
    //   465: iconst_0
    //   466: invokestatic max : (II)I
    //   469: istore_2
    //   470: iload #6
    //   472: aload_1
    //   473: invokeinterface length : ()I
    //   478: invokestatic min : (II)I
    //   481: istore_3
    //   482: aload_0
    //   483: invokevirtual beginBatchEdit : ()Z
    //   486: pop
    //   487: aload_1
    //   488: iload_2
    //   489: iload_3
    //   490: invokeinterface delete : (II)Landroid/text/Editable;
    //   495: pop
    //   496: aload_0
    //   497: invokevirtual endBatchEdit : ()Z
    //   500: pop
    //   501: iconst_1
    //   502: ireturn
    //   503: iconst_0
    //   504: ireturn
  }
  
  public void a(rw0 paramrw0, boolean paramBoolean) {}
  
  public boolean k(rw0 paramrw0) {
    return false;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\hp2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
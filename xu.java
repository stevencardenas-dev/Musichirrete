import java.util.Locale;

public final class xu implements ti0, ri0 {
  public final iu b;
  
  public final int c;
  
  public final boolean e;
  
  public xu(iu paramiu, int paramInt, boolean paramBoolean) {
    this.b = paramiu;
    this.c = paramInt;
    this.e = paramBoolean;
  }
  
  public final int a(cv paramcv, CharSequence paramCharSequence, int paramInt) {
    // Byte code:
    //   0: aload_1
    //   1: getfield a : Ldd1;
    //   4: astore #10
    //   6: aload_2
    //   7: invokeinterface length : ()I
    //   12: iload_3
    //   13: isub
    //   14: istore #6
    //   16: aload_0
    //   17: getfield e : Z
    //   20: istore #9
    //   22: aload_0
    //   23: getfield b : Liu;
    //   26: astore #11
    //   28: iload #9
    //   30: ifne -> 53
    //   33: iconst_2
    //   34: iload #6
    //   36: invokestatic min : (II)I
    //   39: iconst_2
    //   40: if_icmpge -> 47
    //   43: iload_3
    //   44: iconst_m1
    //   45: ixor
    //   46: ireturn
    //   47: iload_3
    //   48: istore #6
    //   50: goto -> 188
    //   53: iconst_0
    //   54: istore #4
    //   56: iconst_0
    //   57: istore #7
    //   59: iconst_0
    //   60: istore #5
    //   62: iload #4
    //   64: iload #6
    //   66: if_icmpge -> 162
    //   69: aload_2
    //   70: iload_3
    //   71: iload #4
    //   73: iadd
    //   74: invokeinterface charAt : (I)C
    //   79: istore #8
    //   81: iload #4
    //   83: ifne -> 139
    //   86: iload #8
    //   88: bipush #45
    //   90: if_icmpeq -> 100
    //   93: iload #8
    //   95: bipush #43
    //   97: if_icmpne -> 139
    //   100: iload #8
    //   102: bipush #45
    //   104: if_icmpne -> 113
    //   107: iconst_1
    //   108: istore #5
    //   110: goto -> 116
    //   113: iconst_0
    //   114: istore #5
    //   116: iload #5
    //   118: ifeq -> 130
    //   121: iinc #4, 1
    //   124: iconst_1
    //   125: istore #7
    //   127: goto -> 62
    //   130: iinc #3, 1
    //   133: iinc #6, -1
    //   136: goto -> 124
    //   139: iload #8
    //   141: bipush #48
    //   143: if_icmplt -> 162
    //   146: iload #8
    //   148: bipush #57
    //   150: if_icmple -> 156
    //   153: goto -> 162
    //   156: iinc #4, 1
    //   159: goto -> 62
    //   162: iload #4
    //   164: ifne -> 171
    //   167: iload_3
    //   168: iconst_m1
    //   169: ixor
    //   170: ireturn
    //   171: iload #7
    //   173: ifne -> 366
    //   176: iload_3
    //   177: istore #6
    //   179: iload #4
    //   181: iconst_2
    //   182: if_icmpeq -> 188
    //   185: goto -> 366
    //   188: aload_2
    //   189: iload #6
    //   191: invokeinterface charAt : (I)C
    //   196: istore_3
    //   197: iload_3
    //   198: bipush #48
    //   200: if_icmplt -> 361
    //   203: iload_3
    //   204: bipush #57
    //   206: if_icmple -> 212
    //   209: goto -> 361
    //   212: iinc #3, -48
    //   215: aload_2
    //   216: iload #6
    //   218: iconst_1
    //   219: iadd
    //   220: invokeinterface charAt : (I)C
    //   225: istore #4
    //   227: iload #4
    //   229: bipush #48
    //   231: if_icmplt -> 356
    //   234: iload #4
    //   236: bipush #57
    //   238: if_icmple -> 244
    //   241: goto -> 356
    //   244: iload_3
    //   245: iconst_3
    //   246: ishl
    //   247: iload_3
    //   248: iconst_1
    //   249: ishl
    //   250: iadd
    //   251: iload #4
    //   253: iadd
    //   254: bipush #48
    //   256: isub
    //   257: istore #5
    //   259: aload_0
    //   260: getfield c : I
    //   263: istore_3
    //   264: iload_3
    //   265: bipush #50
    //   267: isub
    //   268: istore #7
    //   270: iload #7
    //   272: iflt -> 284
    //   275: iload #7
    //   277: bipush #100
    //   279: irem
    //   280: istore_3
    //   281: goto -> 295
    //   284: iload_3
    //   285: bipush #49
    //   287: isub
    //   288: bipush #100
    //   290: irem
    //   291: bipush #99
    //   293: iadd
    //   294: istore_3
    //   295: iload #5
    //   297: iload_3
    //   298: if_icmpge -> 308
    //   301: bipush #100
    //   303: istore #4
    //   305: goto -> 311
    //   308: iconst_0
    //   309: istore #4
    //   311: aload_1
    //   312: invokevirtual c : ()Lav;
    //   315: astore_1
    //   316: aload_1
    //   317: aload #11
    //   319: aload #10
    //   321: invokevirtual a : (Ldd1;)Lhu;
    //   324: putfield b : Lhu;
    //   327: aload_1
    //   328: iload #7
    //   330: iload #4
    //   332: iadd
    //   333: iload_3
    //   334: isub
    //   335: iload #5
    //   337: iadd
    //   338: putfield c : I
    //   341: aload_1
    //   342: aconst_null
    //   343: putfield e : Ljava/lang/String;
    //   346: aload_1
    //   347: aconst_null
    //   348: putfield f : Ljava/util/Locale;
    //   351: iload #6
    //   353: iconst_2
    //   354: iadd
    //   355: ireturn
    //   356: iload #6
    //   358: iconst_m1
    //   359: ixor
    //   360: ireturn
    //   361: iload #6
    //   363: iconst_m1
    //   364: ixor
    //   365: ireturn
    //   366: iload #4
    //   368: bipush #9
    //   370: if_icmplt -> 401
    //   373: iload #4
    //   375: iload_3
    //   376: iadd
    //   377: istore #6
    //   379: aload_2
    //   380: iload_3
    //   381: iload #6
    //   383: invokeinterface subSequence : (II)Ljava/lang/CharSequence;
    //   388: invokeinterface toString : ()Ljava/lang/String;
    //   393: invokestatic parseInt : (Ljava/lang/String;)I
    //   396: istore #4
    //   398: goto -> 506
    //   401: iload #5
    //   403: ifeq -> 414
    //   406: iload_3
    //   407: iconst_1
    //   408: iadd
    //   409: istore #6
    //   411: goto -> 417
    //   414: iload_3
    //   415: istore #6
    //   417: iload #6
    //   419: iconst_1
    //   420: iadd
    //   421: istore #8
    //   423: aload_2
    //   424: iload #6
    //   426: invokeinterface charAt : (I)C
    //   431: istore #6
    //   433: iinc #6, -48
    //   436: iload #4
    //   438: iload_3
    //   439: iadd
    //   440: istore #7
    //   442: iload #8
    //   444: istore #4
    //   446: iload #6
    //   448: istore_3
    //   449: iload #4
    //   451: iload #7
    //   453: if_icmpge -> 486
    //   456: aload_2
    //   457: iload #4
    //   459: invokeinterface charAt : (I)C
    //   464: istore #6
    //   466: iinc #4, 1
    //   469: iload #6
    //   471: iload_3
    //   472: iconst_3
    //   473: ishl
    //   474: iload_3
    //   475: iconst_1
    //   476: ishl
    //   477: iadd
    //   478: iadd
    //   479: bipush #48
    //   481: isub
    //   482: istore_3
    //   483: goto -> 449
    //   486: iload_3
    //   487: istore #4
    //   489: iload #7
    //   491: istore #6
    //   493: iload #5
    //   495: ifeq -> 506
    //   498: iload_3
    //   499: ineg
    //   500: istore #4
    //   502: iload #7
    //   504: istore #6
    //   506: aload_1
    //   507: invokevirtual c : ()Lav;
    //   510: astore_1
    //   511: aload_1
    //   512: aload #11
    //   514: aload #10
    //   516: invokevirtual a : (Ldd1;)Lhu;
    //   519: putfield b : Lhu;
    //   522: aload_1
    //   523: iload #4
    //   525: putfield c : I
    //   528: aload_1
    //   529: aconst_null
    //   530: putfield e : Ljava/lang/String;
    //   533: aload_1
    //   534: aconst_null
    //   535: putfield f : Ljava/util/Locale;
    //   538: iload #6
    //   540: ireturn
    //   541: astore_1
    //   542: iload_3
    //   543: iconst_m1
    //   544: ixor
    //   545: ireturn
    // Exception table:
    //   from	to	target	type
    //   423	433	541	java/lang/StringIndexOutOfBoundsException
  }
  
  public final int b() {
    return 2;
  }
  
  public final void c(StringBuilder paramStringBuilder, uo0 paramuo0, Locale paramLocale) {
    // Byte code:
    //   0: aload_2
    //   1: getfield c : Ldd1;
    //   4: astore_3
    //   5: aload_0
    //   6: getfield b : Liu;
    //   9: astore #6
    //   11: aload #6
    //   13: aload_3
    //   14: invokevirtual a : (Ldd1;)Lhu;
    //   17: invokevirtual t : ()Z
    //   20: ifeq -> 55
    //   23: aload_2
    //   24: aload #6
    //   26: invokevirtual c : (Liu;)I
    //   29: istore #5
    //   31: iload #5
    //   33: istore #4
    //   35: iload #5
    //   37: ifge -> 45
    //   40: iload #5
    //   42: ineg
    //   43: istore #4
    //   45: iload #4
    //   47: bipush #100
    //   49: irem
    //   50: istore #4
    //   52: goto -> 58
    //   55: iconst_m1
    //   56: istore #4
    //   58: iload #4
    //   60: ifge -> 80
    //   63: aload_1
    //   64: ldc 65533
    //   66: invokevirtual append : (C)Ljava/lang/Appendable;
    //   69: pop
    //   70: aload_1
    //   71: ldc 65533
    //   73: invokevirtual append : (C)Ljava/lang/Appendable;
    //   76: pop
    //   77: goto -> 87
    //   80: aload_1
    //   81: iload #4
    //   83: iconst_2
    //   84: invokestatic a : (Ljava/lang/Appendable;II)V
    //   87: return
    //   88: astore_2
    //   89: goto -> 55
    // Exception table:
    //   from	to	target	type
    //   23	31	88	java/lang/RuntimeException
  }
  
  public final int d() {
    return this.e ? 4 : 2;
  }
  
  public final void e(StringBuilder paramStringBuilder, long paramLong, dd1 paramdd1, int paramInt, hv paramhv, Locale paramLocale) {
    try {
      int i = this.b.a(paramdd1).b(paramLong);
      paramInt = i;
      if (i < 0)
        paramInt = -i; 
      paramInt %= 100;
    } catch (RuntimeException runtimeException) {
      paramInt = -1;
    } 
    if (paramInt < 0) {
      paramStringBuilder.append('�');
      paramStringBuilder.append('�');
    } else {
      ma0.a(paramStringBuilder, paramInt, 2);
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\xu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
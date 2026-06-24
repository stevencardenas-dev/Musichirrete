import java.util.Locale;

public final class wu implements ti0, ri0 {
  public final String b;
  
  public final String c;
  
  public final boolean e;
  
  public final int f;
  
  public final int g;
  
  public wu(String paramString1, int paramInt, String paramString2, boolean paramBoolean) {
    this.b = paramString1;
    this.c = paramString2;
    this.e = paramBoolean;
    if (paramInt >= 2) {
      this.f = 2;
      this.g = paramInt;
      return;
    } 
    l0.k();
    throw null;
  }
  
  public static int f(CharSequence paramCharSequence, int paramInt1, int paramInt2) {
    paramInt2 = Math.min(paramCharSequence.length() - paramInt1, paramInt2);
    byte b = 0;
    while (paramInt2 > 0) {
      char c = paramCharSequence.charAt(paramInt1 + b);
      if (c < '0' || c > '9')
        break; 
      b++;
      paramInt2--;
    } 
    return b;
  }
  
  public final int a(cv paramcv, CharSequence paramCharSequence, int paramInt) {
    // Byte code:
    //   0: iconst_0
    //   1: istore #7
    //   3: iconst_0
    //   4: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   7: astore #12
    //   9: aload_2
    //   10: invokeinterface length : ()I
    //   15: iload_3
    //   16: isub
    //   17: istore #4
    //   19: aload_0
    //   20: getfield c : Ljava/lang/String;
    //   23: astore #11
    //   25: aload #11
    //   27: ifnull -> 111
    //   30: aload #11
    //   32: invokevirtual length : ()I
    //   35: ifne -> 82
    //   38: iload #4
    //   40: ifle -> 69
    //   43: aload_2
    //   44: iload_3
    //   45: invokeinterface charAt : (I)C
    //   50: istore #5
    //   52: iload #5
    //   54: bipush #45
    //   56: if_icmpeq -> 111
    //   59: iload #5
    //   61: bipush #43
    //   63: if_icmpne -> 69
    //   66: goto -> 111
    //   69: aload_1
    //   70: aconst_null
    //   71: putfield i : Lbv;
    //   74: aload_1
    //   75: aload #12
    //   77: putfield e : Ljava/lang/Integer;
    //   80: iload_3
    //   81: ireturn
    //   82: aload #11
    //   84: aload_2
    //   85: iload_3
    //   86: invokestatic p : (Ljava/lang/String;Ljava/lang/CharSequence;I)Z
    //   89: ifeq -> 111
    //   92: aload_1
    //   93: aconst_null
    //   94: putfield i : Lbv;
    //   97: aload_1
    //   98: aload #12
    //   100: putfield e : Ljava/lang/Integer;
    //   103: aload #11
    //   105: invokevirtual length : ()I
    //   108: iload_3
    //   109: iadd
    //   110: ireturn
    //   111: iload #4
    //   113: iconst_1
    //   114: if_icmpgt -> 121
    //   117: iload_3
    //   118: iconst_m1
    //   119: ixor
    //   120: ireturn
    //   121: aload_2
    //   122: iload_3
    //   123: invokeinterface charAt : (I)C
    //   128: istore #5
    //   130: iload #5
    //   132: bipush #45
    //   134: if_icmpne -> 143
    //   137: iconst_1
    //   138: istore #5
    //   140: goto -> 153
    //   143: iload #5
    //   145: bipush #43
    //   147: if_icmpne -> 716
    //   150: iconst_0
    //   151: istore #5
    //   153: iload_3
    //   154: iconst_1
    //   155: iadd
    //   156: istore #8
    //   158: aload_2
    //   159: iload #8
    //   161: iconst_2
    //   162: invokestatic f : (Ljava/lang/CharSequence;II)I
    //   165: iconst_2
    //   166: if_icmpge -> 174
    //   169: iload #8
    //   171: iconst_m1
    //   172: ixor
    //   173: ireturn
    //   174: aload_2
    //   175: iload #8
    //   177: invokestatic c : (Ljava/lang/CharSequence;I)I
    //   180: istore #6
    //   182: iload #6
    //   184: bipush #23
    //   186: if_icmple -> 194
    //   189: iload #8
    //   191: iconst_m1
    //   192: ixor
    //   193: ireturn
    //   194: iload #6
    //   196: ldc 3600000
    //   198: imul
    //   199: istore #8
    //   201: iload #4
    //   203: iconst_3
    //   204: isub
    //   205: istore #9
    //   207: iload_3
    //   208: iconst_3
    //   209: iadd
    //   210: istore #6
    //   212: iload #9
    //   214: ifgt -> 227
    //   217: iload #8
    //   219: istore #4
    //   221: iload #6
    //   223: istore_3
    //   224: goto -> 686
    //   227: aload_2
    //   228: iload #6
    //   230: invokeinterface charAt : (I)C
    //   235: istore #10
    //   237: iload #10
    //   239: bipush #58
    //   241: if_icmpne -> 259
    //   244: iload #4
    //   246: iconst_4
    //   247: isub
    //   248: istore #6
    //   250: iinc #3, 4
    //   253: iconst_1
    //   254: istore #4
    //   256: goto -> 298
    //   259: iload #8
    //   261: istore #4
    //   263: iload #6
    //   265: istore_3
    //   266: iload #10
    //   268: bipush #48
    //   270: if_icmplt -> 686
    //   273: iload #8
    //   275: istore #4
    //   277: iload #6
    //   279: istore_3
    //   280: iload #10
    //   282: bipush #57
    //   284: if_icmpgt -> 686
    //   287: iload #6
    //   289: istore_3
    //   290: iload #9
    //   292: istore #6
    //   294: iload #7
    //   296: istore #4
    //   298: aload_2
    //   299: iload_3
    //   300: iconst_2
    //   301: invokestatic f : (Ljava/lang/CharSequence;II)I
    //   304: istore #7
    //   306: iload #7
    //   308: ifne -> 323
    //   311: iload #4
    //   313: ifne -> 323
    //   316: iload #8
    //   318: istore #4
    //   320: goto -> 686
    //   323: iload #7
    //   325: iconst_2
    //   326: if_icmpge -> 333
    //   329: iload_3
    //   330: iconst_m1
    //   331: ixor
    //   332: ireturn
    //   333: aload_2
    //   334: iload_3
    //   335: invokestatic c : (Ljava/lang/CharSequence;I)I
    //   338: istore #7
    //   340: iload #7
    //   342: bipush #59
    //   344: if_icmple -> 351
    //   347: iload_3
    //   348: iconst_m1
    //   349: ixor
    //   350: ireturn
    //   351: iload #8
    //   353: iload #7
    //   355: ldc 60000
    //   357: imul
    //   358: iadd
    //   359: istore #8
    //   361: iload #6
    //   363: iconst_2
    //   364: isub
    //   365: istore #9
    //   367: iload_3
    //   368: iconst_2
    //   369: iadd
    //   370: istore #7
    //   372: iload #9
    //   374: ifgt -> 380
    //   377: goto -> 398
    //   380: iload #4
    //   382: ifeq -> 417
    //   385: aload_2
    //   386: iload #7
    //   388: invokeinterface charAt : (I)C
    //   393: bipush #58
    //   395: if_icmpeq -> 408
    //   398: iload #7
    //   400: istore_3
    //   401: iload #8
    //   403: istore #4
    //   405: goto -> 686
    //   408: iinc #6, -3
    //   411: iinc #3, 3
    //   414: goto -> 424
    //   417: iload #7
    //   419: istore_3
    //   420: iload #9
    //   422: istore #6
    //   424: aload_2
    //   425: iload_3
    //   426: iconst_2
    //   427: invokestatic f : (Ljava/lang/CharSequence;II)I
    //   430: istore #7
    //   432: iload #7
    //   434: ifne -> 449
    //   437: iload #4
    //   439: ifne -> 449
    //   442: iload #8
    //   444: istore #4
    //   446: goto -> 686
    //   449: iload #7
    //   451: iconst_2
    //   452: if_icmpge -> 459
    //   455: iload_3
    //   456: iconst_m1
    //   457: ixor
    //   458: ireturn
    //   459: aload_2
    //   460: iload_3
    //   461: invokestatic c : (Ljava/lang/CharSequence;I)I
    //   464: istore #7
    //   466: iload #7
    //   468: bipush #59
    //   470: if_icmple -> 477
    //   473: iload_3
    //   474: iconst_m1
    //   475: ixor
    //   476: ireturn
    //   477: iload #8
    //   479: iload #7
    //   481: sipush #1000
    //   484: imul
    //   485: iadd
    //   486: istore #8
    //   488: iload_3
    //   489: iconst_2
    //   490: iadd
    //   491: istore #7
    //   493: iload #6
    //   495: iconst_2
    //   496: isub
    //   497: ifgt -> 503
    //   500: goto -> 534
    //   503: iload #4
    //   505: ifeq -> 550
    //   508: aload_2
    //   509: iload #7
    //   511: invokeinterface charAt : (I)C
    //   516: bipush #46
    //   518: if_icmpeq -> 544
    //   521: aload_2
    //   522: iload #7
    //   524: invokeinterface charAt : (I)C
    //   529: bipush #44
    //   531: if_icmpeq -> 544
    //   534: iload #7
    //   536: istore_3
    //   537: iload #8
    //   539: istore #4
    //   541: goto -> 686
    //   544: iinc #3, 3
    //   547: goto -> 553
    //   550: iload #7
    //   552: istore_3
    //   553: aload_2
    //   554: iload_3
    //   555: iconst_3
    //   556: invokestatic f : (Ljava/lang/CharSequence;II)I
    //   559: istore #9
    //   561: iload #9
    //   563: ifne -> 578
    //   566: iload #4
    //   568: ifne -> 578
    //   571: iload #8
    //   573: istore #4
    //   575: goto -> 686
    //   578: iload #9
    //   580: iconst_1
    //   581: if_icmpge -> 588
    //   584: iload_3
    //   585: iconst_m1
    //   586: ixor
    //   587: ireturn
    //   588: iload_3
    //   589: iconst_1
    //   590: iadd
    //   591: istore #7
    //   593: iload #8
    //   595: aload_2
    //   596: iload_3
    //   597: invokeinterface charAt : (I)C
    //   602: bipush #48
    //   604: isub
    //   605: bipush #100
    //   607: imul
    //   608: iadd
    //   609: istore #6
    //   611: iload #9
    //   613: iconst_1
    //   614: if_icmple -> 679
    //   617: iload_3
    //   618: iconst_2
    //   619: iadd
    //   620: istore #4
    //   622: iload #6
    //   624: aload_2
    //   625: iload #7
    //   627: invokeinterface charAt : (I)C
    //   632: bipush #48
    //   634: isub
    //   635: bipush #10
    //   637: imul
    //   638: iadd
    //   639: istore #6
    //   641: iload #9
    //   643: iconst_2
    //   644: if_icmple -> 669
    //   647: iinc #3, 3
    //   650: iload #6
    //   652: aload_2
    //   653: iload #4
    //   655: invokeinterface charAt : (I)C
    //   660: bipush #48
    //   662: isub
    //   663: iadd
    //   664: istore #4
    //   666: goto -> 686
    //   669: iload #4
    //   671: istore_3
    //   672: iload #6
    //   674: istore #4
    //   676: goto -> 686
    //   679: iload #7
    //   681: istore_3
    //   682: iload #6
    //   684: istore #4
    //   686: iload #4
    //   688: istore #6
    //   690: iload #5
    //   692: ifeq -> 700
    //   695: iload #4
    //   697: ineg
    //   698: istore #6
    //   700: aload_1
    //   701: aconst_null
    //   702: putfield i : Lbv;
    //   705: aload_1
    //   706: iload #6
    //   708: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   711: putfield e : Ljava/lang/Integer;
    //   714: iload_3
    //   715: ireturn
    //   716: iload_3
    //   717: iconst_m1
    //   718: ixor
    //   719: ireturn
  }
  
  public final int b() {
    int k = this.f;
    int j = k + 1 << 1;
    int i = j;
    if (this.e)
      i = j + k - 1; 
    String str = this.b;
    return (str != null && str.length() > i) ? str.length() : i;
  }
  
  public final void c(StringBuilder paramStringBuilder, uo0 paramuo0, Locale paramLocale) {}
  
  public final int d() {
    return b();
  }
  
  public final void e(StringBuilder paramStringBuilder, long paramLong, dd1 paramdd1, int paramInt, hv paramhv, Locale paramLocale) {
    if (paramhv != null) {
      if (paramInt == 0) {
        String str = this.b;
        if (str != null) {
          paramStringBuilder.append(str);
          return;
        } 
      } 
      if (paramInt >= 0) {
        paramStringBuilder.append('+');
      } else {
        paramStringBuilder.append('-');
        paramInt = -paramInt;
      } 
      int j = paramInt / 3600000;
      ma0.a(paramStringBuilder, j, 2);
      int i = this.g;
      if (i != 1) {
        int k = paramInt - j * 3600000;
        paramInt = this.f;
        if (k != 0 || paramInt > 1) {
          j = k / 60000;
          boolean bool = this.e;
          if (bool)
            paramStringBuilder.append(':'); 
          ma0.a(paramStringBuilder, j, 2);
          if (i != 2) {
            k -= j * 60000;
            if (k != 0 || paramInt > 2) {
              j = k / 1000;
              if (bool)
                paramStringBuilder.append(':'); 
              ma0.a(paramStringBuilder, j, 2);
              if (i != 3) {
                i = k - j * 1000;
                if (i != 0 || paramInt > 3) {
                  if (bool)
                    paramStringBuilder.append('.'); 
                  ma0.a(paramStringBuilder, i, 3);
                  return;
                } 
              } 
            } 
          } 
        } 
      } 
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\wu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
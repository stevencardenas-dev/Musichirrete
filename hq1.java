public abstract class hq1 extends ws2 {
  public static String A0(String paramString) {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("");
    mn0 mn0 = new mn0(paramString);
    byte b = 0;
    while (mn0.hasNext()) {
      String str = mn0.next();
      str.getClass();
      if (gq1.L0(str)) {
        paramString = str;
        if (str.length() < 4)
          paramString = "    "; 
      } else {
        paramString = "    ".concat(str);
      } 
      if (++b > 1)
        stringBuilder.append("\n"); 
      ws2.c(stringBuilder, paramString, null);
    } 
    stringBuilder.append("");
    return stringBuilder.toString();
  }
  
  public static String B0(String paramString) {
    // Byte code:
    //   0: aload_0
    //   1: invokestatic M0 : (Ljava/lang/String;)Ljava/util/List;
    //   4: astore #8
    //   6: new java/util/ArrayList
    //   9: dup
    //   10: invokespecial <init> : ()V
    //   13: astore #6
    //   15: aload #8
    //   17: invokeinterface iterator : ()Ljava/util/Iterator;
    //   22: astore #7
    //   24: aload #7
    //   26: invokeinterface hasNext : ()Z
    //   31: ifeq -> 65
    //   34: aload #7
    //   36: invokeinterface next : ()Ljava/lang/Object;
    //   41: astore #9
    //   43: aload #9
    //   45: checkcast java/lang/String
    //   48: invokestatic L0 : (Ljava/lang/String;)Z
    //   51: ifne -> 24
    //   54: aload #6
    //   56: aload #9
    //   58: invokevirtual add : (Ljava/lang/Object;)Z
    //   61: pop
    //   62: goto -> 24
    //   65: new java/util/ArrayList
    //   68: dup
    //   69: aload #6
    //   71: invokestatic k0 : (Ljava/lang/Iterable;)I
    //   74: invokespecial <init> : (I)V
    //   77: astore #7
    //   79: aload #6
    //   81: invokevirtual size : ()I
    //   84: istore #5
    //   86: iconst_0
    //   87: istore_3
    //   88: iconst_0
    //   89: istore_1
    //   90: iload_1
    //   91: iload #5
    //   93: if_icmpge -> 181
    //   96: aload #6
    //   98: iload_1
    //   99: invokevirtual get : (I)Ljava/lang/Object;
    //   102: astore #9
    //   104: iload_1
    //   105: iconst_1
    //   106: iadd
    //   107: istore #4
    //   109: aload #9
    //   111: checkcast java/lang/String
    //   114: astore #9
    //   116: aload #9
    //   118: invokevirtual length : ()I
    //   121: istore_2
    //   122: iconst_0
    //   123: istore_1
    //   124: iload_1
    //   125: iload_2
    //   126: if_icmpge -> 150
    //   129: aload #9
    //   131: iload_1
    //   132: invokevirtual charAt : (I)C
    //   135: invokestatic y : (C)Z
    //   138: ifne -> 144
    //   141: goto -> 152
    //   144: iinc #1, 1
    //   147: goto -> 124
    //   150: iconst_m1
    //   151: istore_1
    //   152: iload_1
    //   153: istore_2
    //   154: iload_1
    //   155: iconst_m1
    //   156: if_icmpne -> 165
    //   159: aload #9
    //   161: invokevirtual length : ()I
    //   164: istore_2
    //   165: aload #7
    //   167: iload_2
    //   168: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   171: invokevirtual add : (Ljava/lang/Object;)Z
    //   174: pop
    //   175: iload #4
    //   177: istore_1
    //   178: goto -> 90
    //   181: aload #7
    //   183: invokevirtual iterator : ()Ljava/util/Iterator;
    //   186: astore #9
    //   188: aload #9
    //   190: invokeinterface hasNext : ()Z
    //   195: ifne -> 204
    //   198: aconst_null
    //   199: astore #7
    //   201: goto -> 261
    //   204: aload #9
    //   206: invokeinterface next : ()Ljava/lang/Object;
    //   211: checkcast java/lang/Comparable
    //   214: astore #6
    //   216: aload #6
    //   218: astore #7
    //   220: aload #9
    //   222: invokeinterface hasNext : ()Z
    //   227: ifeq -> 261
    //   230: aload #9
    //   232: invokeinterface next : ()Ljava/lang/Object;
    //   237: checkcast java/lang/Comparable
    //   240: astore #7
    //   242: aload #6
    //   244: aload #7
    //   246: invokeinterface compareTo : (Ljava/lang/Object;)I
    //   251: ifle -> 216
    //   254: aload #7
    //   256: astore #6
    //   258: goto -> 216
    //   261: aload #7
    //   263: checkcast java/lang/Integer
    //   266: astore #6
    //   268: aload #6
    //   270: ifnull -> 282
    //   273: aload #6
    //   275: invokevirtual intValue : ()I
    //   278: istore_1
    //   279: goto -> 284
    //   282: iconst_0
    //   283: istore_1
    //   284: aload_0
    //   285: invokevirtual length : ()I
    //   288: istore #4
    //   290: aload #8
    //   292: invokeinterface size : ()I
    //   297: pop
    //   298: aload #8
    //   300: invokeinterface size : ()I
    //   305: istore #5
    //   307: new java/util/ArrayList
    //   310: dup
    //   311: invokespecial <init> : ()V
    //   314: astore #6
    //   316: aload #8
    //   318: invokeinterface iterator : ()Ljava/util/Iterator;
    //   323: astore #7
    //   325: iload_3
    //   326: istore_2
    //   327: aload #7
    //   329: invokeinterface hasNext : ()Z
    //   334: ifeq -> 443
    //   337: aload #7
    //   339: invokeinterface next : ()Ljava/lang/Object;
    //   344: astore_0
    //   345: iload_2
    //   346: iflt -> 438
    //   349: aload_0
    //   350: checkcast java/lang/String
    //   353: astore_0
    //   354: iload_2
    //   355: ifeq -> 366
    //   358: iload_2
    //   359: iload #5
    //   361: iconst_1
    //   362: isub
    //   363: if_icmpne -> 378
    //   366: aload_0
    //   367: invokestatic L0 : (Ljava/lang/String;)Z
    //   370: ifeq -> 378
    //   373: aconst_null
    //   374: astore_0
    //   375: goto -> 408
    //   378: aload_0
    //   379: invokevirtual getClass : ()Ljava/lang/Class;
    //   382: pop
    //   383: iload_1
    //   384: iflt -> 425
    //   387: aload_0
    //   388: invokevirtual length : ()I
    //   391: istore_3
    //   392: iload_1
    //   393: iload_3
    //   394: if_icmple -> 400
    //   397: goto -> 402
    //   400: iload_1
    //   401: istore_3
    //   402: aload_0
    //   403: iload_3
    //   404: invokevirtual substring : (I)Ljava/lang/String;
    //   407: astore_0
    //   408: aload_0
    //   409: ifnull -> 419
    //   412: aload #6
    //   414: aload_0
    //   415: invokevirtual add : (Ljava/lang/Object;)Z
    //   418: pop
    //   419: iinc #2, 1
    //   422: goto -> 327
    //   425: iload_1
    //   426: ldc 'Requested character count '
    //   428: ldc ' is less than zero.'
    //   430: invokestatic i : (ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   433: invokestatic e : (Ljava/lang/Object;)V
    //   436: aconst_null
    //   437: areturn
    //   438: invokestatic j0 : ()V
    //   441: aconst_null
    //   442: athrow
    //   443: new java/lang/StringBuilder
    //   446: dup
    //   447: iload #4
    //   449: invokespecial <init> : (I)V
    //   452: astore_0
    //   453: aload #6
    //   455: aload_0
    //   456: invokestatic o0 : (Ljava/util/ArrayList;Ljava/lang/StringBuilder;)V
    //   459: aload_0
    //   460: invokevirtual toString : ()Ljava/lang/String;
    //   463: areturn
  }
  
  public static String C0(String paramString) {
    // Byte code:
    //   0: ldc '|'
    //   2: invokestatic L0 : (Ljava/lang/String;)Z
    //   5: ifne -> 233
    //   8: aload_0
    //   9: invokestatic M0 : (Ljava/lang/String;)Ljava/util/List;
    //   12: astore #6
    //   14: aload_0
    //   15: invokevirtual length : ()I
    //   18: istore #4
    //   20: aload #6
    //   22: invokeinterface size : ()I
    //   27: pop
    //   28: aload #6
    //   30: invokeinterface size : ()I
    //   35: istore_3
    //   36: new java/util/ArrayList
    //   39: dup
    //   40: invokespecial <init> : ()V
    //   43: astore #7
    //   45: aload #6
    //   47: invokeinterface iterator : ()Ljava/util/Iterator;
    //   52: astore #8
    //   54: iconst_0
    //   55: istore_2
    //   56: aload #8
    //   58: invokeinterface hasNext : ()Z
    //   63: ifeq -> 212
    //   66: aload #8
    //   68: invokeinterface next : ()Ljava/lang/Object;
    //   73: astore_0
    //   74: iload_2
    //   75: iflt -> 207
    //   78: aload_0
    //   79: checkcast java/lang/String
    //   82: astore #6
    //   84: iload_2
    //   85: ifeq -> 95
    //   88: iload_2
    //   89: iload_3
    //   90: iconst_1
    //   91: isub
    //   92: if_icmpne -> 109
    //   95: aload #6
    //   97: invokestatic L0 : (Ljava/lang/String;)Z
    //   100: ifeq -> 109
    //   103: aconst_null
    //   104: astore #6
    //   106: goto -> 188
    //   109: aload #6
    //   111: invokevirtual length : ()I
    //   114: istore #5
    //   116: iconst_0
    //   117: istore_1
    //   118: iload_1
    //   119: iload #5
    //   121: if_icmpge -> 145
    //   124: aload #6
    //   126: iload_1
    //   127: invokevirtual charAt : (I)C
    //   130: invokestatic y : (C)Z
    //   133: ifne -> 139
    //   136: goto -> 147
    //   139: iinc #1, 1
    //   142: goto -> 118
    //   145: iconst_m1
    //   146: istore_1
    //   147: iload_1
    //   148: iconst_m1
    //   149: if_icmpne -> 157
    //   152: aconst_null
    //   153: astore_0
    //   154: goto -> 181
    //   157: aload #6
    //   159: ldc '|'
    //   161: iload_1
    //   162: invokevirtual startsWith : (Ljava/lang/String;I)Z
    //   165: ifeq -> 152
    //   168: aload #6
    //   170: ldc '|'
    //   172: invokevirtual length : ()I
    //   175: iload_1
    //   176: iadd
    //   177: invokevirtual substring : (I)Ljava/lang/String;
    //   180: astore_0
    //   181: aload_0
    //   182: ifnull -> 188
    //   185: aload_0
    //   186: astore #6
    //   188: aload #6
    //   190: ifnull -> 201
    //   193: aload #7
    //   195: aload #6
    //   197: invokevirtual add : (Ljava/lang/Object;)Z
    //   200: pop
    //   201: iinc #2, 1
    //   204: goto -> 56
    //   207: invokestatic j0 : ()V
    //   210: aconst_null
    //   211: athrow
    //   212: new java/lang/StringBuilder
    //   215: dup
    //   216: iload #4
    //   218: invokespecial <init> : (I)V
    //   221: astore_0
    //   222: aload #7
    //   224: aload_0
    //   225: invokestatic o0 : (Ljava/util/ArrayList;Ljava/lang/StringBuilder;)V
    //   228: aload_0
    //   229: invokevirtual toString : ()Ljava/lang/String;
    //   232: areturn
    //   233: ldc 'marginPrefix must be non-blank string.'
    //   235: invokestatic l : (Ljava/lang/String;)V
    //   238: aconst_null
    //   239: areturn
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\hq1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
package j$.time.format;

public final class k implements g {
  public static final String[] d = new String[] { 
      "+HH", "+HHmm", "+HH:mm", "+HHMM", "+HH:MM", "+HHMMss", "+HH:MM:ss", "+HHMMSS", "+HH:MM:SS", "+HHmmss", 
      "+HH:mm:ss", "+H", "+Hmm", "+H:mm", "+HMM", "+H:MM", "+HMMss", "+H:MM:ss", "+HMMSS", "+H:MM:SS", 
      "+Hmmss", "+H:mm:ss" };
  
  public static final k e = new k("+HH:MM:ss", "Z");
  
  public final String a;
  
  public final int b;
  
  public final int c;
  
  static {
    new k("+HH:MM:ss", "0");
  }
  
  public k(String paramString1, String paramString2) {
    for (byte b = 0; b < 22; b++) {
      if (d[b].equals(paramString1)) {
        this.b = b;
        this.c = b % 11;
        this.a = paramString2;
        return;
      } 
    } 
    throw new IllegalArgumentException("Invalid zone offset pattern: ".concat(paramString1));
  }
  
  public static void a(boolean paramBoolean, int paramInt, StringBuilder paramStringBuilder) {
    String str;
    if (paramBoolean) {
      str = ":";
    } else {
      str = "";
    } 
    paramStringBuilder.append(str);
    paramStringBuilder.append((char)(paramInt / 10 + 48));
    paramStringBuilder.append((char)(paramInt % 10 + 48));
  }
  
  public final boolean r(q paramq, StringBuilder paramStringBuilder) {
    // Byte code:
    //   0: aload_1
    //   1: getstatic j$/time/temporal/a.OFFSET_SECONDS : Lj$/time/temporal/a;
    //   4: invokevirtual a : (Lj$/time/temporal/q;)Ljava/lang/Long;
    //   7: astore_1
    //   8: iconst_0
    //   9: istore #10
    //   11: aload_1
    //   12: ifnonnull -> 17
    //   15: iconst_0
    //   16: ireturn
    //   17: aload_1
    //   18: invokevirtual longValue : ()J
    //   21: invokestatic toIntExact : (J)I
    //   24: istore_3
    //   25: aload_0
    //   26: getfield a : Ljava/lang/String;
    //   29: astore #11
    //   31: iload_3
    //   32: ifne -> 44
    //   35: aload_2
    //   36: aload #11
    //   38: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   41: pop
    //   42: iconst_1
    //   43: ireturn
    //   44: iload_3
    //   45: sipush #3600
    //   48: idiv
    //   49: bipush #100
    //   51: irem
    //   52: invokestatic abs : (I)I
    //   55: istore #4
    //   57: iload_3
    //   58: bipush #60
    //   60: idiv
    //   61: bipush #60
    //   63: irem
    //   64: invokestatic abs : (I)I
    //   67: istore #8
    //   69: iload_3
    //   70: bipush #60
    //   72: irem
    //   73: invokestatic abs : (I)I
    //   76: istore #6
    //   78: aload_2
    //   79: invokevirtual length : ()I
    //   82: istore #5
    //   84: iload_3
    //   85: ifge -> 94
    //   88: ldc '-'
    //   90: astore_1
    //   91: goto -> 97
    //   94: ldc '+'
    //   96: astore_1
    //   97: aload_2
    //   98: aload_1
    //   99: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   102: pop
    //   103: aload_0
    //   104: getfield b : I
    //   107: bipush #11
    //   109: if_icmpge -> 115
    //   112: goto -> 122
    //   115: iload #4
    //   117: bipush #10
    //   119: if_icmplt -> 132
    //   122: iconst_0
    //   123: iload #4
    //   125: aload_2
    //   126: invokestatic a : (ZILjava/lang/StringBuilder;)V
    //   129: goto -> 143
    //   132: aload_2
    //   133: iload #4
    //   135: bipush #48
    //   137: iadd
    //   138: i2c
    //   139: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   142: pop
    //   143: aload_0
    //   144: getfield c : I
    //   147: istore #7
    //   149: iload #7
    //   151: iconst_3
    //   152: if_icmplt -> 162
    //   155: iload #7
    //   157: bipush #8
    //   159: if_icmple -> 191
    //   162: iload #7
    //   164: bipush #9
    //   166: if_icmplt -> 174
    //   169: iload #6
    //   171: ifgt -> 191
    //   174: iload #4
    //   176: istore_3
    //   177: iload #7
    //   179: iconst_1
    //   180: if_icmplt -> 295
    //   183: iload #4
    //   185: istore_3
    //   186: iload #8
    //   188: ifle -> 295
    //   191: iload #7
    //   193: ifle -> 209
    //   196: iload #7
    //   198: iconst_2
    //   199: irem
    //   200: ifne -> 209
    //   203: iconst_1
    //   204: istore #9
    //   206: goto -> 212
    //   209: iconst_0
    //   210: istore #9
    //   212: iload #9
    //   214: iload #8
    //   216: aload_2
    //   217: invokestatic a : (ZILjava/lang/StringBuilder;)V
    //   220: iload #4
    //   222: iload #8
    //   224: iadd
    //   225: istore #4
    //   227: iload #7
    //   229: bipush #7
    //   231: if_icmpeq -> 258
    //   234: iload #7
    //   236: bipush #8
    //   238: if_icmpeq -> 258
    //   241: iload #4
    //   243: istore_3
    //   244: iload #7
    //   246: iconst_5
    //   247: if_icmplt -> 295
    //   250: iload #4
    //   252: istore_3
    //   253: iload #6
    //   255: ifle -> 295
    //   258: iload #10
    //   260: istore #9
    //   262: iload #7
    //   264: ifle -> 281
    //   267: iload #10
    //   269: istore #9
    //   271: iload #7
    //   273: iconst_2
    //   274: irem
    //   275: ifne -> 281
    //   278: iconst_1
    //   279: istore #9
    //   281: iload #9
    //   283: iload #6
    //   285: aload_2
    //   286: invokestatic a : (ZILjava/lang/StringBuilder;)V
    //   289: iload #4
    //   291: iload #6
    //   293: iadd
    //   294: istore_3
    //   295: iload_3
    //   296: ifne -> 312
    //   299: aload_2
    //   300: iload #5
    //   302: invokevirtual setLength : (I)V
    //   305: aload_2
    //   306: aload #11
    //   308: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   311: pop
    //   312: iconst_1
    //   313: ireturn
  }
  
  public final String toString() {
    String str1 = this.a.replace("'", "''");
    String str2 = d[this.b];
    StringBuilder stringBuilder = new StringBuilder("Offset(");
    stringBuilder.append(str2);
    stringBuilder.append(",'");
    stringBuilder.append(str1);
    stringBuilder.append("')");
    return stringBuilder.toString();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\j$\time\format\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
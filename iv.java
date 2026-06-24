public final class iv extends hv {
  public final int h;
  
  public final lv i;
  
  public final lv j;
  
  public iv(String paramString, int paramInt, lv paramlv1, lv paramlv2) {
    super(paramString);
    this.h = paramInt;
    this.i = paramlv1;
    this.j = paramlv2;
  }
  
  public final boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject instanceof iv) {
      paramObject = paramObject;
      if (this.b.equals(((hv)paramObject).b) && this.h == ((iv)paramObject).h && this.i.equals(((iv)paramObject).i) && this.j.equals(((iv)paramObject).j))
        return true; 
    } 
    return false;
  }
  
  public final String f(long paramLong) {
    return (r(paramLong)).b;
  }
  
  public final int h(long paramLong) {
    int i = (r(paramLong)).c;
    return this.h + i;
  }
  
  public final int k(long paramLong) {
    return this.h;
  }
  
  public final boolean l() {
    return false;
  }
  
  public final long m(long paramLong) {
    // Byte code:
    //   0: aload_0
    //   1: getfield h : I
    //   4: istore_3
    //   5: aload_0
    //   6: getfield i : Llv;
    //   9: astore #10
    //   11: aload_0
    //   12: getfield j : Llv;
    //   15: astore #8
    //   17: aload #10
    //   19: lload_1
    //   20: iload_3
    //   21: aload #8
    //   23: getfield c : I
    //   26: invokevirtual a : (JII)J
    //   29: lstore #6
    //   31: lload #6
    //   33: lstore #4
    //   35: lload_1
    //   36: lconst_0
    //   37: lcmp
    //   38: ifle -> 55
    //   41: lload #6
    //   43: lstore #4
    //   45: lload #6
    //   47: lconst_0
    //   48: lcmp
    //   49: ifge -> 55
    //   52: lload_1
    //   53: lstore #4
    //   55: aload #8
    //   57: lload_1
    //   58: iload_3
    //   59: aload #10
    //   61: getfield c : I
    //   64: invokevirtual a : (JII)J
    //   67: lstore #6
    //   69: lload_1
    //   70: lconst_0
    //   71: lcmp
    //   72: ifle -> 85
    //   75: lload #6
    //   77: lconst_0
    //   78: lcmp
    //   79: ifge -> 85
    //   82: goto -> 88
    //   85: lload #6
    //   87: lstore_1
    //   88: lload #4
    //   90: lstore #6
    //   92: lload #4
    //   94: lload_1
    //   95: lcmp
    //   96: ifle -> 102
    //   99: lload_1
    //   100: lstore #6
    //   102: lload #6
    //   104: lreturn
    //   105: astore #9
    //   107: goto -> 52
    //   110: astore #8
    //   112: goto -> 88
    // Exception table:
    //   from	to	target	type
    //   17	31	105	java/lang/IllegalArgumentException
    //   17	31	105	java/lang/ArithmeticException
    //   55	69	110	java/lang/IllegalArgumentException
    //   55	69	110	java/lang/ArithmeticException
  }
  
  public final long o(long paramLong) {
    // Byte code:
    //   0: lload_1
    //   1: lconst_1
    //   2: ladd
    //   3: lstore #4
    //   5: aload_0
    //   6: getfield h : I
    //   9: istore_3
    //   10: aload_0
    //   11: getfield i : Llv;
    //   14: astore #8
    //   16: aload_0
    //   17: getfield j : Llv;
    //   20: astore #9
    //   22: aload #8
    //   24: lload #4
    //   26: iload_3
    //   27: aload #9
    //   29: getfield c : I
    //   32: invokevirtual b : (JII)J
    //   35: lstore #6
    //   37: lload #6
    //   39: lstore_1
    //   40: lload #4
    //   42: lconst_0
    //   43: lcmp
    //   44: ifge -> 60
    //   47: lload #6
    //   49: lstore_1
    //   50: lload #6
    //   52: lconst_0
    //   53: lcmp
    //   54: ifle -> 60
    //   57: lload #4
    //   59: lstore_1
    //   60: aload #9
    //   62: lload #4
    //   64: iload_3
    //   65: aload #8
    //   67: getfield c : I
    //   70: invokevirtual b : (JII)J
    //   73: lstore #6
    //   75: lload #4
    //   77: lconst_0
    //   78: lcmp
    //   79: ifge -> 92
    //   82: lload #6
    //   84: lconst_0
    //   85: lcmp
    //   86: ifle -> 92
    //   89: goto -> 96
    //   92: lload #6
    //   94: lstore #4
    //   96: lload_1
    //   97: lload #4
    //   99: lcmp
    //   100: ifle -> 106
    //   103: goto -> 109
    //   106: lload #4
    //   108: lstore_1
    //   109: lload_1
    //   110: lconst_1
    //   111: lsub
    //   112: lreturn
    //   113: astore #10
    //   115: goto -> 57
    //   118: astore #8
    //   120: goto -> 96
    // Exception table:
    //   from	to	target	type
    //   22	37	113	java/lang/IllegalArgumentException
    //   22	37	113	java/lang/ArithmeticException
    //   60	75	118	java/lang/IllegalArgumentException
    //   60	75	118	java/lang/ArithmeticException
  }
  
  public final lv r(long paramLong) {
    long l;
    int i = this.h;
    lv lv1 = this.i;
    lv lv2 = this.j;
    try {
      l = lv1.a(paramLong, i, lv2.c);
    } catch (IllegalArgumentException|ArithmeticException illegalArgumentException) {
      l = paramLong;
    } 
    try {
      long l1 = lv2.a(paramLong, i, lv1.c);
      paramLong = l1;
    } catch (IllegalArgumentException|ArithmeticException illegalArgumentException) {}
    if (l <= paramLong)
      lv1 = lv2; 
    return lv1;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\iv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
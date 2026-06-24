public final class rx implements Comparable {
  public final boolean b;
  
  public final boolean c;
  
  public final boolean e;
  
  public final boolean f;
  
  public final int g;
  
  public final int h;
  
  public final int i;
  
  public final boolean j;
  
  public rx(la0 paramla0, ox paramox, int paramInt, String paramString) {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial <init> : ()V
    //   4: iconst_0
    //   5: istore #10
    //   7: aload_0
    //   8: iload_3
    //   9: iconst_0
    //   10: invokestatic t : (IZ)Z
    //   13: putfield c : Z
    //   16: aload_1
    //   17: getfield e : I
    //   20: istore_3
    //   21: aload_1
    //   22: getfield f : I
    //   25: istore #5
    //   27: aload_2
    //   28: getfield g : I
    //   31: istore #6
    //   33: aload_2
    //   34: getfield c : Ljava/lang/String;
    //   37: astore #11
    //   39: iload_3
    //   40: iload #6
    //   42: iconst_m1
    //   43: ixor
    //   44: iand
    //   45: istore_3
    //   46: iload_3
    //   47: iconst_1
    //   48: iand
    //   49: ifeq -> 58
    //   52: iconst_1
    //   53: istore #8
    //   55: goto -> 61
    //   58: iconst_0
    //   59: istore #8
    //   61: aload_0
    //   62: iload #8
    //   64: putfield e : Z
    //   67: iload_3
    //   68: iconst_2
    //   69: iand
    //   70: ifeq -> 78
    //   73: iconst_1
    //   74: istore_3
    //   75: goto -> 80
    //   78: iconst_0
    //   79: istore_3
    //   80: aload_1
    //   81: aload #11
    //   83: aload_2
    //   84: getfield f : Z
    //   87: invokestatic r : (Lla0;Ljava/lang/String;Z)I
    //   90: istore #7
    //   92: aload_0
    //   93: iload #7
    //   95: putfield g : I
    //   98: aload_2
    //   99: getfield e : I
    //   102: iload #5
    //   104: iand
    //   105: invokestatic bitCount : (I)I
    //   108: istore #6
    //   110: aload_0
    //   111: iload #6
    //   113: putfield h : I
    //   116: iload #5
    //   118: sipush #1088
    //   121: iand
    //   122: ifeq -> 131
    //   125: iconst_1
    //   126: istore #9
    //   128: goto -> 134
    //   131: iconst_0
    //   132: istore #9
    //   134: aload_0
    //   135: iload #9
    //   137: putfield j : Z
    //   140: iload #7
    //   142: ifle -> 149
    //   145: iload_3
    //   146: ifeq -> 158
    //   149: iload #7
    //   151: ifne -> 164
    //   154: iload_3
    //   155: ifeq -> 164
    //   158: iconst_1
    //   159: istore #9
    //   161: goto -> 167
    //   164: iconst_0
    //   165: istore #9
    //   167: aload_0
    //   168: iload #9
    //   170: putfield f : Z
    //   173: aload #4
    //   175: invokestatic x : (Ljava/lang/String;)Ljava/lang/String;
    //   178: ifnonnull -> 187
    //   181: iconst_1
    //   182: istore #9
    //   184: goto -> 190
    //   187: iconst_0
    //   188: istore #9
    //   190: aload_1
    //   191: aload #4
    //   193: iload #9
    //   195: invokestatic r : (Lla0;Ljava/lang/String;Z)I
    //   198: istore #5
    //   200: aload_0
    //   201: iload #5
    //   203: putfield i : I
    //   206: iload #7
    //   208: ifgt -> 243
    //   211: aload #11
    //   213: ifnonnull -> 221
    //   216: iload #6
    //   218: ifgt -> 243
    //   221: iload #8
    //   223: ifne -> 243
    //   226: iload #10
    //   228: istore #8
    //   230: iload_3
    //   231: ifeq -> 246
    //   234: iload #10
    //   236: istore #8
    //   238: iload #5
    //   240: ifle -> 246
    //   243: iconst_1
    //   244: istore #8
    //   246: aload_0
    //   247: iload #8
    //   249: putfield b : Z
    //   252: return
  }
  
  public final int a(rx paramrx) {
    boolean bool1 = paramrx.c;
    boolean bool2 = this.c;
    if (bool2 != bool1)
      return bool2 ? 1 : -1; 
    int j = paramrx.g;
    int i = this.g;
    if (i != j)
      return zv0.i(i, j); 
    j = paramrx.h;
    i = this.h;
    if (i != j)
      return zv0.i(i, j); 
    bool1 = paramrx.e;
    bool2 = this.e;
    if (bool2 != bool1)
      return bool2 ? 1 : -1; 
    bool2 = paramrx.f;
    bool1 = this.f;
    if (bool1 != bool2)
      return bool1 ? 1 : -1; 
    j = paramrx.i;
    int k = this.i;
    if (k != j)
      return zv0.i(k, j); 
    if (i == 0) {
      bool2 = paramrx.j;
      bool1 = this.j;
      if (bool1 != bool2)
        return bool1 ? -1 : 1; 
    } 
    return 0;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\rx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
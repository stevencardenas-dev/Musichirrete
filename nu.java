public final class nu extends ru {
  public final int a(cv paramcv, CharSequence paramCharSequence, int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: aload_2
    //   3: iload_3
    //   4: invokespecial a : (Lcv;Ljava/lang/CharSequence;I)I
    //   7: istore #6
    //   9: iload #6
    //   11: ifge -> 17
    //   14: goto -> 99
    //   17: aload_0
    //   18: getfield c : I
    //   21: iload_3
    //   22: iadd
    //   23: istore #5
    //   25: iload #6
    //   27: iload #5
    //   29: if_icmpeq -> 99
    //   32: iload #5
    //   34: istore #4
    //   36: aload_0
    //   37: getfield e : Z
    //   40: ifeq -> 73
    //   43: aload_2
    //   44: iload_3
    //   45: invokeinterface charAt : (I)C
    //   50: istore_3
    //   51: iload_3
    //   52: bipush #45
    //   54: if_icmpeq -> 67
    //   57: iload #5
    //   59: istore #4
    //   61: iload_3
    //   62: bipush #43
    //   64: if_icmpne -> 73
    //   67: iload #5
    //   69: iconst_1
    //   70: iadd
    //   71: istore #4
    //   73: iload #6
    //   75: iload #4
    //   77: if_icmple -> 87
    //   80: iload #4
    //   82: iconst_1
    //   83: iadd
    //   84: iconst_m1
    //   85: ixor
    //   86: ireturn
    //   87: iload #6
    //   89: iload #4
    //   91: if_icmpge -> 99
    //   94: iload #6
    //   96: iconst_m1
    //   97: ixor
    //   98: ireturn
    //   99: iload #6
    //   101: ireturn
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\nu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
public final class ai extends fk {
  public final ad0 f;
  
  public final ad0 g;
  
  public ai(ad0 paramad0, os paramos, int paramInt, hh paramhh) {
    super(paramos, paramInt, paramhh);
    this.f = paramad0;
    this.g = paramad0;
  }
  
  public final Object c(pa1 parampa1, cs paramcs) {
    // Byte code:
    //   0: aload_2
    //   1: instanceof zh
    //   4: ifeq -> 41
    //   7: aload_2
    //   8: checkcast zh
    //   11: astore #4
    //   13: aload #4
    //   15: getfield i : I
    //   18: istore_3
    //   19: iload_3
    //   20: ldc -2147483648
    //   22: iand
    //   23: ifeq -> 41
    //   26: aload #4
    //   28: iload_3
    //   29: ldc -2147483648
    //   31: iadd
    //   32: putfield i : I
    //   35: aload #4
    //   37: astore_2
    //   38: goto -> 54
    //   41: new zh
    //   44: dup
    //   45: aload_0
    //   46: aload_2
    //   47: checkcast ds
    //   50: invokespecial <init> : (Lai;Lds;)V
    //   53: astore_2
    //   54: aload_2
    //   55: getfield g : Ljava/lang/Object;
    //   58: astore #5
    //   60: aload_2
    //   61: getfield i : I
    //   64: istore_3
    //   65: getstatic l02.a : Ll02;
    //   68: astore #4
    //   70: iload_3
    //   71: ifeq -> 99
    //   74: iload_3
    //   75: iconst_1
    //   76: if_icmpne -> 92
    //   79: aload_2
    //   80: getfield f : Lpa1;
    //   83: astore_1
    //   84: aload #5
    //   86: invokestatic r0 : (Ljava/lang/Object;)V
    //   89: goto -> 152
    //   92: ldc 'call to 'resume' before 'invoke' with coroutine'
    //   94: invokestatic f : (Ljava/lang/String;)V
    //   97: aconst_null
    //   98: areturn
    //   99: aload #5
    //   101: invokestatic r0 : (Ljava/lang/Object;)V
    //   104: aload_2
    //   105: aload_1
    //   106: putfield f : Lpa1;
    //   109: aload_2
    //   110: iconst_1
    //   111: putfield i : I
    //   114: aload_0
    //   115: getfield f : Lad0;
    //   118: aload_1
    //   119: aload_2
    //   120: invokeinterface g : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   125: astore_2
    //   126: getstatic ys.b : Lys;
    //   129: astore #5
    //   131: aload_2
    //   132: aload #5
    //   134: if_acmpne -> 140
    //   137: goto -> 143
    //   140: aload #4
    //   142: astore_2
    //   143: aload_2
    //   144: aload #5
    //   146: if_acmpne -> 152
    //   149: aload #5
    //   151: areturn
    //   152: aload_1
    //   153: getfield h : Llh;
    //   156: invokevirtual z : ()Z
    //   159: ifeq -> 165
    //   162: aload #4
    //   164: areturn
    //   165: ldc ''awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\\nOtherwise, a callback/listener may leak in case of external cancellation.\\nSee callbackFlow API documentation for the details.'
    //   167: invokestatic f : (Ljava/lang/String;)V
    //   170: aconst_null
    //   171: areturn
  }
  
  public final fk d(os paramos, int paramInt, hh paramhh) {
    return new ai(this.g, paramos, paramInt, paramhh);
  }
  
  public final String toString() {
    StringBuilder stringBuilder = new StringBuilder("block[");
    stringBuilder.append(this.f);
    stringBuilder.append("] -> ");
    stringBuilder.append(super.toString());
    return stringBuilder.toString();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\ai.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
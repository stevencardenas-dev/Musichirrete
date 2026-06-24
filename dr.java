public abstract class dr {
  public static final String a = qp0.j("ConstraintTrkngWrkr");
  
  public static final Object a(bv0 parambv0, y72 paramy72, ds paramds) {
    // Byte code:
    //   0: aload_2
    //   1: instanceof br
    //   4: ifeq -> 41
    //   7: aload_2
    //   8: checkcast br
    //   11: astore #4
    //   13: aload #4
    //   15: getfield g : I
    //   18: istore_3
    //   19: iload_3
    //   20: ldc -2147483648
    //   22: iand
    //   23: ifeq -> 41
    //   26: aload #4
    //   28: iload_3
    //   29: ldc -2147483648
    //   31: iadd
    //   32: putfield g : I
    //   35: aload #4
    //   37: astore_2
    //   38: goto -> 50
    //   41: new ds
    //   44: dup
    //   45: aload_2
    //   46: invokespecial <init> : (Lcs;)V
    //   49: astore_2
    //   50: aload_2
    //   51: getfield f : Ljava/lang/Object;
    //   54: astore #4
    //   56: aload_2
    //   57: getfield g : I
    //   60: istore_3
    //   61: iload_3
    //   62: ifeq -> 88
    //   65: iload_3
    //   66: iconst_1
    //   67: if_icmpne -> 81
    //   70: aload #4
    //   72: invokestatic r0 : (Ljava/lang/Object;)V
    //   75: aload #4
    //   77: astore_0
    //   78: goto -> 149
    //   81: ldc 'call to 'resume' before 'invoke' with coroutine'
    //   83: invokestatic f : (Ljava/lang/String;)V
    //   86: aconst_null
    //   87: areturn
    //   88: aload #4
    //   90: invokestatic r0 : (Ljava/lang/Object;)V
    //   93: new ar
    //   96: dup
    //   97: iconst_0
    //   98: new d90
    //   101: dup
    //   102: aload_0
    //   103: aload_1
    //   104: invokevirtual b : (Ly72;)Lw80;
    //   107: new cr
    //   110: dup
    //   111: aload_1
    //   112: aconst_null
    //   113: iconst_0
    //   114: invokespecial <init> : (Ljava/lang/Object;Lcs;I)V
    //   117: iconst_1
    //   118: invokespecial <init> : (Lw80;Lhd0;I)V
    //   121: invokespecial <init> : (ILjava/lang/Object;)V
    //   124: astore_0
    //   125: aload_2
    //   126: iconst_1
    //   127: putfield g : I
    //   130: aload_0
    //   131: aload_2
    //   132: invokestatic u : (Lar;Lds;)Ljava/lang/Object;
    //   135: astore_1
    //   136: getstatic ys.b : Lys;
    //   139: astore_2
    //   140: aload_1
    //   141: astore_0
    //   142: aload_1
    //   143: aload_2
    //   144: if_acmpne -> 149
    //   147: aload_2
    //   148: areturn
    //   149: new java/lang/Integer
    //   152: dup
    //   153: aload_0
    //   154: checkcast kr
    //   157: getfield a : I
    //   160: invokespecial <init> : (I)V
    //   163: areturn
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\dr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
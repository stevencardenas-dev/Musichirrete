public final class uv {
  public final boolean a = true;
  
  public final int b = 65536;
  
  public int c;
  
  public int d = 0;
  
  public final qz1[] e = new qz1[100];
  
  public final void a(int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: iload_1
    //   3: aload_0
    //   4: getfield c : I
    //   7: if_icmpge -> 15
    //   10: iconst_1
    //   11: istore_2
    //   12: goto -> 17
    //   15: iconst_0
    //   16: istore_2
    //   17: aload_0
    //   18: iload_1
    //   19: putfield c : I
    //   22: iload_2
    //   23: ifeq -> 96
    //   26: aload_0
    //   27: monitorenter
    //   28: aload_0
    //   29: getfield c : I
    //   32: istore_2
    //   33: aload_0
    //   34: getfield b : I
    //   37: istore_1
    //   38: getstatic d12.a : I
    //   41: istore_3
    //   42: iconst_0
    //   43: iload_2
    //   44: iload_1
    //   45: iadd
    //   46: iconst_1
    //   47: isub
    //   48: iload_1
    //   49: idiv
    //   50: invokestatic max : (II)I
    //   53: istore_1
    //   54: aload_0
    //   55: getfield d : I
    //   58: istore_2
    //   59: iload_1
    //   60: iload_2
    //   61: if_icmplt -> 69
    //   64: aload_0
    //   65: monitorexit
    //   66: goto -> 96
    //   69: aload_0
    //   70: getfield e : [Lqz1;
    //   73: iload_1
    //   74: iload_2
    //   75: aconst_null
    //   76: invokestatic fill : ([Ljava/lang/Object;IILjava/lang/Object;)V
    //   79: aload_0
    //   80: iload_1
    //   81: putfield d : I
    //   84: aload_0
    //   85: monitorexit
    //   86: goto -> 96
    //   89: astore #4
    //   91: aload_0
    //   92: monitorexit
    //   93: aload #4
    //   95: athrow
    //   96: aload_0
    //   97: monitorexit
    //   98: return
    //   99: astore #4
    //   101: aload_0
    //   102: monitorexit
    //   103: aload #4
    //   105: athrow
    // Exception table:
    //   from	to	target	type
    //   2	10	99	finally
    //   17	22	99	finally
    //   26	28	99	finally
    //   28	59	89	finally
    //   64	66	99	finally
    //   69	84	89	finally
    //   84	86	99	finally
    //   91	93	89	finally
    //   93	96	99	finally
    //   101	103	99	finally
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar\\uv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
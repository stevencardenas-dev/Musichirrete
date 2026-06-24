public final class q4 extends n implements ms {
  public volatile Object _preHandler = this;
  
  public q4() {
    super(vs2.e);
  }
  
  public final void m(Throwable paramThrowable) {
    // Byte code:
    //   0: getstatic android/os/Build$VERSION.SDK_INT : I
    //   3: istore_2
    //   4: bipush #26
    //   6: iload_2
    //   7: if_icmpgt -> 138
    //   10: iload_2
    //   11: bipush #28
    //   13: if_icmpge -> 138
    //   16: aload_0
    //   17: getfield _preHandler : Ljava/lang/Object;
    //   20: astore #4
    //   22: aconst_null
    //   23: astore #5
    //   25: aload #4
    //   27: aload_0
    //   28: if_acmpeq -> 41
    //   31: aload #4
    //   33: checkcast java/lang/reflect/Method
    //   36: astore #4
    //   38: goto -> 87
    //   41: ldc java/lang/Thread
    //   43: ldc 'getUncaughtExceptionPreHandler'
    //   45: aconst_null
    //   46: invokevirtual getDeclaredMethod : (Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   49: astore #4
    //   51: aload #4
    //   53: invokevirtual getModifiers : ()I
    //   56: invokestatic isPublic : (I)Z
    //   59: ifeq -> 78
    //   62: aload #4
    //   64: invokevirtual getModifiers : ()I
    //   67: invokestatic isStatic : (I)Z
    //   70: istore_3
    //   71: iload_3
    //   72: ifeq -> 78
    //   75: goto -> 81
    //   78: aconst_null
    //   79: astore #4
    //   81: aload_0
    //   82: aload #4
    //   84: putfield _preHandler : Ljava/lang/Object;
    //   87: aload #4
    //   89: ifnull -> 104
    //   92: aload #4
    //   94: aconst_null
    //   95: aconst_null
    //   96: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   99: astore #4
    //   101: goto -> 107
    //   104: aconst_null
    //   105: astore #4
    //   107: aload #4
    //   109: instanceof java/lang/Thread$UncaughtExceptionHandler
    //   112: ifeq -> 122
    //   115: aload #4
    //   117: checkcast java/lang/Thread$UncaughtExceptionHandler
    //   120: astore #5
    //   122: aload #5
    //   124: ifnull -> 138
    //   127: aload #5
    //   129: invokestatic currentThread : ()Ljava/lang/Thread;
    //   132: aload_1
    //   133: invokeinterface uncaughtException : (Ljava/lang/Thread;Ljava/lang/Throwable;)V
    //   138: return
    //   139: astore #4
    //   141: goto -> 78
    // Exception table:
    //   from	to	target	type
    //   41	71	139	finally
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\q4.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
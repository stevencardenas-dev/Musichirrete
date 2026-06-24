public final class ni0 extends l5 {
  public final Throwable c;
  
  public ni0(int paramInt, Exception paramException) {
    // Byte code:
    //   0: getstatic java/util/Locale.ROOT : Ljava/util/Locale;
    //   3: astore_3
    //   4: getstatic h92.a : Ljava/util/HashMap;
    //   7: astore_3
    //   8: iload_1
    //   9: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   12: astore #4
    //   14: aload_3
    //   15: aload #4
    //   17: invokevirtual containsKey : (Ljava/lang/Object;)Z
    //   20: ifeq -> 112
    //   23: getstatic h92.b : Ljava/util/HashMap;
    //   26: astore #5
    //   28: aload #5
    //   30: aload #4
    //   32: invokevirtual containsKey : (Ljava/lang/Object;)Z
    //   35: ifne -> 41
    //   38: goto -> 112
    //   41: aload_3
    //   42: aload #4
    //   44: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   47: checkcast java/lang/String
    //   50: astore_3
    //   51: aload #5
    //   53: aload #4
    //   55: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   58: checkcast java/lang/String
    //   61: astore #5
    //   63: new java/lang/StringBuilder
    //   66: dup
    //   67: invokespecial <init> : ()V
    //   70: astore #4
    //   72: aload #4
    //   74: aload_3
    //   75: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   78: pop
    //   79: aload #4
    //   81: ldc ' (https://developer.android.com/google/play/integrity/reference/com/google/android/play/core/integrity/model/IntegrityErrorCode.html#'
    //   83: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   86: pop
    //   87: aload #4
    //   89: aload #5
    //   91: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   94: pop
    //   95: aload #4
    //   97: ldc ')'
    //   99: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   102: pop
    //   103: aload #4
    //   105: invokevirtual toString : ()Ljava/lang/String;
    //   108: astore_3
    //   109: goto -> 115
    //   112: ldc ''
    //   114: astore_3
    //   115: new java/lang/StringBuilder
    //   118: dup
    //   119: ldc 'Integrity API error ('
    //   121: invokespecial <init> : (Ljava/lang/String;)V
    //   124: astore #4
    //   126: aload #4
    //   128: iload_1
    //   129: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   132: pop
    //   133: aload #4
    //   135: ldc '): '
    //   137: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   140: pop
    //   141: aload #4
    //   143: aload_3
    //   144: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   147: pop
    //   148: aload #4
    //   150: ldc '.'
    //   152: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   155: pop
    //   156: aload_0
    //   157: new com/google/android/gms/common/api/Status
    //   160: dup
    //   161: iload_1
    //   162: aload #4
    //   164: invokevirtual toString : ()Ljava/lang/String;
    //   167: aconst_null
    //   168: aconst_null
    //   169: invokespecial <init> : (ILjava/lang/String;Landroid/app/PendingIntent;Lsp;)V
    //   172: invokespecial <init> : (Lcom/google/android/gms/common/api/Status;)V
    //   175: iload_1
    //   176: ifeq -> 185
    //   179: aload_0
    //   180: aload_2
    //   181: putfield c : Ljava/lang/Throwable;
    //   184: return
    //   185: ldc 'ErrorCode should not be 0.'
    //   187: invokestatic l : (Ljava/lang/String;)V
    //   190: aconst_null
    //   191: athrow
  }
  
  public final Throwable getCause() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield c : Ljava/lang/Throwable;
    //   6: astore_1
    //   7: aload_0
    //   8: monitorexit
    //   9: aload_1
    //   10: areturn
    //   11: astore_1
    //   12: aload_0
    //   13: monitorexit
    //   14: aload_1
    //   15: athrow
    // Exception table:
    //   from	to	target	type
    //   2	7	11	finally
    //   12	14	11	finally
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\ni0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
public final class jo1 extends l5 {
  public jo1(int paramInt) {
    // Byte code:
    //   0: getstatic ub2.a : Ljava/util/HashMap;
    //   3: astore_2
    //   4: iload_1
    //   5: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   8: astore_3
    //   9: aload_2
    //   10: aload_3
    //   11: invokevirtual containsKey : (Ljava/lang/Object;)Z
    //   14: ifeq -> 97
    //   17: getstatic ub2.b : Ljava/util/HashMap;
    //   20: astore #4
    //   22: aload #4
    //   24: aload_3
    //   25: invokevirtual containsKey : (Ljava/lang/Object;)Z
    //   28: ifne -> 34
    //   31: goto -> 97
    //   34: aload_2
    //   35: aload_3
    //   36: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   39: checkcast java/lang/String
    //   42: astore_2
    //   43: aload #4
    //   45: aload_3
    //   46: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   49: checkcast java/lang/String
    //   52: astore #4
    //   54: new java/lang/StringBuilder
    //   57: dup
    //   58: invokespecial <init> : ()V
    //   61: astore_3
    //   62: aload_3
    //   63: aload_2
    //   64: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   67: pop
    //   68: aload_3
    //   69: ldc ' (https://developer.android.com/reference/com/google/android/play/core/splitinstall/model/SplitInstallErrorCode.html#'
    //   71: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   74: pop
    //   75: aload_3
    //   76: aload #4
    //   78: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   81: pop
    //   82: aload_3
    //   83: ldc ')'
    //   85: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   88: pop
    //   89: aload_3
    //   90: invokevirtual toString : ()Ljava/lang/String;
    //   93: astore_2
    //   94: goto -> 100
    //   97: ldc ''
    //   99: astore_2
    //   100: aload_0
    //   101: new com/google/android/gms/common/api/Status
    //   104: dup
    //   105: iload_1
    //   106: ldc 'Split Install Error(%d): %s'
    //   108: iconst_2
    //   109: anewarray java/lang/Object
    //   112: dup
    //   113: iconst_0
    //   114: iload_1
    //   115: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   118: aastore
    //   119: dup
    //   120: iconst_1
    //   121: aload_2
    //   122: aastore
    //   123: invokestatic format : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   126: aconst_null
    //   127: aconst_null
    //   128: invokespecial <init> : (ILjava/lang/String;Landroid/app/PendingIntent;Lsp;)V
    //   131: invokespecial <init> : (Lcom/google/android/gms/common/api/Status;)V
    //   134: iload_1
    //   135: ifeq -> 139
    //   138: return
    //   139: ldc 'errorCode should not be 0.'
    //   141: invokestatic l : (Ljava/lang/String;)V
    //   144: aconst_null
    //   145: athrow
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\jo1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
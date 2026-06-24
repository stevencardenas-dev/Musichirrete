import android.net.ConnectivityManager;

public abstract class a21 {
  public static final String a = qp0.j("NetworkStateTracker");
  
  public static final z11 a(ConnectivityManager paramConnectivityManager, boolean paramBoolean) {
    // Byte code:
    //   0: getstatic a21.a : Ljava/lang/String;
    //   3: astore #6
    //   5: aload_0
    //   6: invokevirtual getClass : ()Ljava/lang/Class;
    //   9: pop
    //   10: aload_0
    //   11: invokevirtual getActiveNetworkInfo : ()Landroid/net/NetworkInfo;
    //   14: astore #7
    //   16: iconst_1
    //   17: istore_2
    //   18: aload #7
    //   20: ifnull -> 40
    //   23: aload #7
    //   25: invokevirtual isConnected : ()Z
    //   28: istore_3
    //   29: iload_3
    //   30: ifeq -> 40
    //   33: goto -> 42
    //   36: astore_0
    //   37: goto -> 150
    //   40: iconst_0
    //   41: istore_2
    //   42: aload_0
    //   43: aload_0
    //   44: invokevirtual getActiveNetwork : ()Landroid/net/Network;
    //   47: invokevirtual getNetworkCapabilities : (Landroid/net/Network;)Landroid/net/NetworkCapabilities;
    //   50: astore #8
    //   52: aload #8
    //   54: ifnull -> 73
    //   57: aload #8
    //   59: bipush #16
    //   61: invokevirtual hasCapability : (I)Z
    //   64: istore_3
    //   65: goto -> 93
    //   68: astore #8
    //   70: goto -> 78
    //   73: iconst_0
    //   74: istore_3
    //   75: goto -> 93
    //   78: invokestatic h : ()Lqp0;
    //   81: aload #6
    //   83: ldc 'Unable to validate active network'
    //   85: aload #8
    //   87: invokevirtual g : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   90: goto -> 73
    //   93: aload_0
    //   94: invokevirtual isActiveNetworkMetered : ()Z
    //   97: istore #5
    //   99: aload #7
    //   101: ifnull -> 122
    //   104: aload #7
    //   106: invokevirtual isRoaming : ()Z
    //   109: istore #4
    //   111: iload #4
    //   113: ifne -> 122
    //   116: iconst_1
    //   117: istore #4
    //   119: goto -> 125
    //   122: iconst_0
    //   123: istore #4
    //   125: new z11
    //   128: dup
    //   129: iload_2
    //   130: iload_3
    //   131: iload #5
    //   133: iload #4
    //   135: iload_1
    //   136: invokespecial <init> : (ZZZZZ)V
    //   139: astore_0
    //   140: aload_0
    //   141: areturn
    //   142: astore_0
    //   143: goto -> 150
    //   146: astore_0
    //   147: goto -> 143
    //   150: invokestatic h : ()Lqp0;
    //   153: aload #6
    //   155: ldc 'Unable to get active network state'
    //   157: aload_0
    //   158: invokevirtual g : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   161: new z11
    //   164: dup
    //   165: iconst_0
    //   166: iconst_0
    //   167: iconst_0
    //   168: iconst_1
    //   169: iload_1
    //   170: invokespecial <init> : (ZZZZZ)V
    //   173: areturn
    // Exception table:
    //   from	to	target	type
    //   10	16	146	java/lang/SecurityException
    //   23	29	36	java/lang/SecurityException
    //   42	52	68	java/lang/SecurityException
    //   57	65	68	java/lang/SecurityException
    //   78	90	146	java/lang/SecurityException
    //   93	99	146	java/lang/SecurityException
    //   104	111	36	java/lang/SecurityException
    //   125	140	142	java/lang/SecurityException
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\a21.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
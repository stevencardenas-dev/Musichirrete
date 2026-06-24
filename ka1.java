import android.content.Context;

public abstract class ka1 {
  public static final String a = qp0.j("ProcessUtils");
  
  public static final boolean a(Context paramContext, ip paramip) {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual getClass : ()Ljava/lang/Class;
    //   4: pop
    //   5: aload_1
    //   6: invokevirtual getClass : ()Ljava/lang/Class;
    //   9: pop
    //   10: getstatic android/os/Build$VERSION.SDK_INT : I
    //   13: bipush #28
    //   15: if_icmplt -> 25
    //   18: invokestatic g : ()Ljava/lang/String;
    //   21: astore_1
    //   22: goto -> 185
    //   25: aconst_null
    //   26: astore_3
    //   27: ldc 'android.app.ActivityThread'
    //   29: iconst_0
    //   30: ldc q72
    //   32: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   35: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   38: ldc 'currentProcessName'
    //   40: aconst_null
    //   41: invokevirtual getDeclaredMethod : (Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   44: astore_1
    //   45: aload_1
    //   46: iconst_1
    //   47: invokevirtual setAccessible : (Z)V
    //   50: aload_1
    //   51: aconst_null
    //   52: aconst_null
    //   53: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   56: astore_1
    //   57: aload_1
    //   58: invokevirtual getClass : ()Ljava/lang/Class;
    //   61: pop
    //   62: aload_1
    //   63: instanceof java/lang/String
    //   66: ifeq -> 90
    //   69: aload_1
    //   70: checkcast java/lang/String
    //   73: astore_1
    //   74: goto -> 185
    //   77: astore_1
    //   78: invokestatic h : ()Lqp0;
    //   81: getstatic ka1.a : Ljava/lang/String;
    //   84: ldc 'Unable to check ActivityThread for processName'
    //   86: aload_1
    //   87: invokevirtual d : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   90: invokestatic myPid : ()I
    //   93: istore_2
    //   94: aload_0
    //   95: getstatic in/krosbits/android/widgets/swipetoloadlayout/vZ/LHyji.dyfHLBiuzmQd : Ljava/lang/String;
    //   98: invokevirtual getSystemService : (Ljava/lang/String;)Ljava/lang/Object;
    //   101: astore_1
    //   102: aload_1
    //   103: invokevirtual getClass : ()Ljava/lang/Class;
    //   106: pop
    //   107: aload_1
    //   108: checkcast android/app/ActivityManager
    //   111: invokevirtual getRunningAppProcesses : ()Ljava/util/List;
    //   114: astore #4
    //   116: aload_3
    //   117: astore_1
    //   118: aload #4
    //   120: ifnull -> 185
    //   123: aload #4
    //   125: invokeinterface iterator : ()Ljava/util/Iterator;
    //   130: astore #4
    //   132: aload #4
    //   134: invokeinterface hasNext : ()Z
    //   139: ifeq -> 164
    //   142: aload #4
    //   144: invokeinterface next : ()Ljava/lang/Object;
    //   149: astore_1
    //   150: aload_1
    //   151: checkcast android/app/ActivityManager$RunningAppProcessInfo
    //   154: getfield pid : I
    //   157: iload_2
    //   158: if_icmpne -> 132
    //   161: goto -> 166
    //   164: aconst_null
    //   165: astore_1
    //   166: aload_1
    //   167: checkcast android/app/ActivityManager$RunningAppProcessInfo
    //   170: astore #4
    //   172: aload_3
    //   173: astore_1
    //   174: aload #4
    //   176: ifnull -> 185
    //   179: aload #4
    //   181: getfield processName : Ljava/lang/String;
    //   184: astore_1
    //   185: aload_1
    //   186: aload_0
    //   187: invokevirtual getApplicationInfo : ()Landroid/content/pm/ApplicationInfo;
    //   190: getfield processName : Ljava/lang/String;
    //   193: invokestatic c : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   196: ireturn
    // Exception table:
    //   from	to	target	type
    //   27	74	77	finally
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\ka1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
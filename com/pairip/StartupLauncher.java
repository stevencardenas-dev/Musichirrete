package com.pairip;

public final class StartupLauncher {
  private static boolean launchCalled = false;
  
  private static String startupProgramName = "vGDJYgUbXrJTN0PY";
  
  public static void launch() {
    // Byte code:
    //   0: ldc com/pairip/StartupLauncher
    //   2: monitorenter
    //   3: getstatic com/pairip/StartupLauncher.launchCalled : Z
    //   6: istore_0
    //   7: iload_0
    //   8: ifeq -> 15
    //   11: ldc com/pairip/StartupLauncher
    //   13: monitorexit
    //   14: return
    //   15: iconst_1
    //   16: putstatic com/pairip/StartupLauncher.launchCalled : Z
    //   19: getstatic com/pairip/StartupLauncher.startupProgramName : Ljava/lang/String;
    //   22: aconst_null
    //   23: invokestatic invoke : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
    //   26: pop
    //   27: ldc com/pairip/StartupLauncher
    //   29: monitorexit
    //   30: return
    //   31: astore_1
    //   32: ldc com/pairip/StartupLauncher
    //   34: monitorexit
    //   35: aload_1
    //   36: athrow
    // Exception table:
    //   from	to	target	type
    //   3	7	31	finally
    //   15	27	31	finally
    //   32	35	31	finally
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\com\pairip\StartupLauncher.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;

public final class cw extends s50 implements Runnable {
  public static volatile Thread _thread;
  
  public static volatile int debugStatus;
  
  public static final cw n;
  
  public static final long o;
  
  static {
    Long long_;
    s50 s501 = new s50();
    n = (cw)s501;
    s501.v(false);
    try {
      long_ = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
    } catch (SecurityException securityException) {
      long_ = Long.valueOf(1000L);
    } 
    long l = long_.longValue();
    o = TimeUnit.MILLISECONDS.toNanos(l);
  }
  
  public final void A(Runnable paramRunnable) {
    if (debugStatus != 4) {
      super.A(paramRunnable);
      return;
    } 
    throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
  }
  
  public final Thread E() {
    Thread thread = _thread;
    /* monitor enter ThisExpression{ObjectType{cw}} */
    if (thread == null) {
      try {
        Thread thread1 = _thread;
        thread = thread1;
        if (thread1 == null) {
          thread = new Thread();
          this(this, "kotlinx.coroutines.DefaultExecutor");
          _thread = thread;
          thread.setContextClassLoader(n.getClass().getClassLoader());
          thread.setDaemon(true);
          thread.start();
        } 
      } finally {}
      /* monitor exit ThisExpression{ObjectType{cw}} */
      return thread;
    } 
    return thread;
  }
  
  public final void G(long paramLong, q50 paramq50) {
    throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
  }
  
  public final void Q() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: getstatic cw.debugStatus : I
    //   5: istore_1
    //   6: iload_1
    //   7: iconst_2
    //   8: if_icmpeq -> 24
    //   11: iload_1
    //   12: iconst_3
    //   13: if_icmpne -> 19
    //   16: goto -> 24
    //   19: iconst_0
    //   20: istore_1
    //   21: goto -> 26
    //   24: iconst_1
    //   25: istore_1
    //   26: iload_1
    //   27: ifne -> 33
    //   30: aload_0
    //   31: monitorexit
    //   32: return
    //   33: iconst_3
    //   34: putstatic cw.debugStatus : I
    //   37: aload_0
    //   38: invokevirtual J : ()V
    //   41: aload_0
    //   42: invokevirtual notifyAll : ()V
    //   45: aload_0
    //   46: monitorexit
    //   47: return
    //   48: astore_2
    //   49: aload_0
    //   50: monitorexit
    //   51: aload_2
    //   52: athrow
    // Exception table:
    //   from	to	target	type
    //   2	6	48	finally
    //   33	45	48	finally
    //   49	51	48	finally
  }
  
  public final k00 d(long paramLong, wu1 paramwu1, os paramos) {
    long l = 0L;
    if (paramLong <= 0L) {
      paramLong = l;
    } else if (paramLong >= 9223372036854L) {
      paramLong = Long.MAX_VALUE;
    } else {
      paramLong = 1000000L * paramLong;
    } 
    if (paramLong < 4611686018427387903L) {
      l = System.nanoTime();
      p50 p50 = new p50(paramLong + l, paramwu1);
      K(l, p50);
      return p50;
    } 
    return g21.b;
  }
  
  public final void run() {
    Exception exception;
    mu1.a.set(this);
    /* monitor enter ThisExpression{ObjectType{cw}} */
    try {
      try {
        int i = debugStatus;
        if (i == 2 || i == 3) {
          i = 1;
        } else {
          i = 0;
        } 
        if (i != 0) {
          /* monitor exit ThisExpression{ObjectType{cw}} */
          _thread = null;
          Q();
          if (!F()) {
            E();
            return;
          } 
        } else {
          debugStatus = 1;
          notifyAll();
          /* monitor exit ThisExpression{ObjectType{cw}} */
          long l = Long.MAX_VALUE;
          while (true) {
            Thread.interrupted();
            long l1 = w();
            if (l1 == Long.MAX_VALUE) {
              long l3 = System.nanoTime();
              long l2 = l;
              if (l == Long.MAX_VALUE) {
                l2 = o;
                l2 += l3;
              } 
              l = l2 - l3;
              if (l <= 0L) {
                _thread = null;
                Q();
                if (!F()) {
                  E();
                  return;
                } 
              } else {
                l3 = l2;
                long l4 = l1;
                if (l1 > l) {
                  l4 = l;
                  l3 = l2;
                } 
                l = l3;
              } 
            } else {
              long l2 = Long.MAX_VALUE;
              long l3 = l1;
              l = l2;
            } 
            return;
          } 
        } 
        return;
      } finally {}
    } finally {}
    /* monitor exit ThisExpression{ObjectType{cw}} */
    throw exception;
  }
  
  public final void shutdown() {
    debugStatus = 4;
    super.shutdown();
  }
  
  public final String toString() {
    return "DefaultExecutor";
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\cw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
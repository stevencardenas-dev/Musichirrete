import java.util.concurrent.TimeUnit;

public abstract class qt1 {
  public static final String a;
  
  public static final long b = n21.S("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 1L, Long.MAX_VALUE);
  
  public static final int c;
  
  public static final int d = n21.T(2097150, 4, "kotlinx.coroutines.scheduler.max.pool.size");
  
  public static final long e;
  
  public static final j30 f = j30.e;
  
  static {
    String str;
    int i = ps1.a;
    try {
      String str1 = System.getProperty("kotlinx.coroutines.scheduler.default.name");
    } catch (SecurityException securityException1) {
      securityException1 = null;
    } 
    SecurityException securityException2 = securityException1;
    if (securityException1 == null)
      str = "DefaultDispatcher"; 
    a = str;
  }
  
  static {
    int j = ps1.a;
    i = j;
    if (j < 2)
      i = 2; 
    c = n21.T(i, 8, "kotlinx.coroutines.scheduler.core.pool.size");
  }
  
  static {
    long l = n21.S("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 1L, Long.MAX_VALUE);
    e = TimeUnit.SECONDS.toNanos(l);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\qt1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
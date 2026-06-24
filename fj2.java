import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class fj2 implements hj2 {
  public static final gj2 c = new gj2(fj2.class);
  
  public final Object b;
  
  public fj2(Object paramObject) {
    this.b = paramObject;
  }
  
  public final void b(Runnable paramRunnable, Executor paramExecutor) {
    if (paramExecutor != null)
      try {
        paramExecutor.execute(paramRunnable);
        return;
      } catch (Exception exception) {
        Logger logger = c.b();
        Level level = Level.SEVERE;
        String str1 = paramRunnable.toString();
        String str2 = String.valueOf(paramExecutor);
        StringBuilder stringBuilder = new StringBuilder("RuntimeException while executing runnable ");
        stringBuilder.append(str1);
        stringBuilder.append(" with executor ");
        stringBuilder.append(str2);
        logger.logp(level, "com.google.common.util.concurrent.ImmediateFuture", "addListener", stringBuilder.toString(), exception);
        return;
      }  
    k91.h("Executor was null.");
  }
  
  public final boolean cancel(boolean paramBoolean) {
    return false;
  }
  
  public final Object get() {
    return this.b;
  }
  
  public final Object get(long paramLong, TimeUnit paramTimeUnit) {
    paramTimeUnit.getClass();
    return this.b;
  }
  
  public final boolean isCancelled() {
    return false;
  }
  
  public final boolean isDone() {
    return true;
  }
  
  public final String toString() {
    String str2 = super.toString();
    String str1 = this.b.toString();
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(str2);
    stringBuilder.append("[status=SUCCESS, result=[");
    stringBuilder.append(str1);
    stringBuilder.append("]]");
    return stringBuilder.toString();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\fj2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
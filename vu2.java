import java.util.concurrent.Delayed;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public final class vu2 extends ws2 implements ScheduledFuture, ho0, Future {
  public final ju2 s;
  
  public final ScheduledFuture t;
  
  public vu2(ju2 paramju2, ScheduledFuture paramScheduledFuture) {
    super(28);
    this.s = paramju2;
    this.t = paramScheduledFuture;
  }
  
  public final void a(Runnable paramRunnable, Executor paramExecutor) {
    this.s.a(paramRunnable, paramExecutor);
  }
  
  public final boolean cancel(boolean paramBoolean) {
    boolean bool = this.s.cancel(paramBoolean);
    if (bool)
      this.t.cancel(paramBoolean); 
    return bool;
  }
  
  public final Object get() {
    return this.s.get();
  }
  
  public final Object get(long paramLong, TimeUnit paramTimeUnit) {
    return this.s.get(paramLong, paramTimeUnit);
  }
  
  public final long getDelay(TimeUnit paramTimeUnit) {
    return this.t.getDelay(paramTimeUnit);
  }
  
  public final boolean isCancelled() {
    return this.s.b instanceof gu2;
  }
  
  public final boolean isDone() {
    return this.s.isDone();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\vu2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
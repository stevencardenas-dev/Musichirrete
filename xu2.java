import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public final class xu2 extends uu2 implements ScheduledExecutorService {
  public final ScheduledExecutorService c;
  
  public xu2(ScheduledExecutorService paramScheduledExecutorService) {
    super(paramScheduledExecutorService);
    this.c = paramScheduledExecutorService;
  }
  
  public final ScheduledFuture schedule(Runnable paramRunnable, long paramLong, TimeUnit paramTimeUnit) {
    paramRunnable = new zu2(Executors.callable(paramRunnable, null));
    return new vu2((ju2)paramRunnable, this.c.schedule(paramRunnable, paramLong, paramTimeUnit));
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\xu2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
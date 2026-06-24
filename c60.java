import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class c60 extends b60 implements vx {
  public final Executor e;
  
  public c60(Executor paramExecutor) {
    this.e = paramExecutor;
    if (paramExecutor instanceof ScheduledThreadPoolExecutor)
      ((ScheduledThreadPoolExecutor)paramExecutor).setRemoveOnCancelPolicy(true); 
  }
  
  public static void s(os paramos, RejectedExecutionException paramRejectedExecutionException) {
    CancellationException cancellationException = new CancellationException("The task was rejected");
    cancellationException.initCause(paramRejectedExecutionException);
    g92.j(paramos, cancellationException);
  }
  
  public final void close() {
    Executor executor = this.e;
    if (executor instanceof java.util.concurrent.ExecutorService) {
      executor = executor;
    } else {
      executor = null;
    } 
    if (executor != null)
      executor.shutdown(); 
  }
  
  public final k00 d(long paramLong, wu1 paramwu1, os paramos) {
    ScheduledExecutorService scheduledExecutorService;
    Executor executor1 = this.e;
    boolean bool = executor1 instanceof ScheduledExecutorService;
    Executor executor2 = null;
    if (bool) {
      scheduledExecutorService = (ScheduledExecutorService)executor1;
    } else {
      scheduledExecutorService = null;
    } 
    executor1 = executor2;
    if (scheduledExecutorService != null)
      try {
        ScheduledFuture<?> scheduledFuture = scheduledExecutorService.schedule(paramwu1, paramLong, TimeUnit.MILLISECONDS);
      } catch (RejectedExecutionException rejectedExecutionException) {
        s(paramos, rejectedExecutionException);
        executor1 = executor2;
      }  
    return (executor1 != null) ? new j00((ScheduledFuture)executor1) : cw.n.d(paramLong, paramwu1, paramos);
  }
  
  public final boolean equals(Object paramObject) {
    return (paramObject instanceof c60 && ((c60)paramObject).e == this.e);
  }
  
  public final void g(long paramLong, ni paramni) {
    Executor executor = this.e;
    boolean bool = executor instanceof ScheduledExecutorService;
    vi2 vi22 = null;
    if (bool) {
      executor = executor;
    } else {
      executor = null;
    } 
    vi2 vi21 = vi22;
    if (executor != null) {
      vi21 = new vi2(15, this, paramni);
      os os = paramni.g;
      try {
        ScheduledFuture<?> scheduledFuture = executor.schedule(vi21, paramLong, TimeUnit.MILLISECONDS);
      } catch (RejectedExecutionException rejectedExecutionException) {
        s(os, rejectedExecutionException);
        vi21 = vi22;
      } 
    } 
    if (vi21 != null) {
      paramni.A(new gi(0, vi21));
      return;
    } 
    cw.n.g(paramLong, paramni);
  }
  
  public final int hashCode() {
    return System.identityHashCode(this.e);
  }
  
  public final void m(os paramos, Runnable paramRunnable) {
    try {
      this.e.execute(paramRunnable);
      return;
    } catch (RejectedExecutionException rejectedExecutionException) {
      s(paramos, rejectedExecutionException);
      yw yw = e00.a;
      fw.e.m(paramos, paramRunnable);
      return;
    } 
  }
  
  public final String toString() {
    return this.e.toString();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\c60.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
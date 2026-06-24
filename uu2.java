import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.TimeUnit;

public class uu2 extends AbstractExecutorService implements AutoCloseable, ExecutorService {
  public final ExecutorService b;
  
  public uu2(ExecutorService paramExecutorService) {
    paramExecutorService.getClass();
    this.b = paramExecutorService;
  }
  
  public final boolean awaitTermination(long paramLong, TimeUnit paramTimeUnit) {
    return this.b.awaitTermination(paramLong, paramTimeUnit);
  }
  
  public final void execute(Runnable paramRunnable) {
    this.b.execute(paramRunnable);
  }
  
  public final boolean isShutdown() {
    return this.b.isShutdown();
  }
  
  public final boolean isTerminated() {
    return this.b.isTerminated();
  }
  
  public final RunnableFuture newTaskFor(Runnable paramRunnable, Object paramObject) {
    return new zu2(Executors.callable(paramRunnable, paramObject));
  }
  
  public final RunnableFuture newTaskFor(Callable paramCallable) {
    return new zu2(paramCallable);
  }
  
  public final void shutdown() {
    this.b.shutdown();
  }
  
  public final List shutdownNow() {
    return this.b.shutdownNow();
  }
  
  public final String toString() {
    String str2 = super.toString();
    String str1 = String.valueOf(this.b);
    StringBuilder stringBuilder = new StringBuilder(String.valueOf(str2).length() + 1 + str1.length() + 1);
    stringBuilder.append(str2);
    stringBuilder.append("[");
    stringBuilder.append(str1);
    stringBuilder.append("]");
    return stringBuilder.toString();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar\\uu2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
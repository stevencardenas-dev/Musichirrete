import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public final class og2 implements ThreadFactory {
  public final ThreadFactory a = Executors.defaultThreadFactory();
  
  public final AtomicInteger b = new AtomicInteger(1);
  
  public og2(ef paramef) {}
  
  public final Thread newThread(Runnable paramRunnable) {
    Thread thread = this.a.newThread(paramRunnable);
    int i = this.b.getAndIncrement();
    StringBuilder stringBuilder = new StringBuilder("PlayBillingLibrary-");
    stringBuilder.append(i);
    thread.setName(stringBuilder.toString());
    return thread;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\og2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
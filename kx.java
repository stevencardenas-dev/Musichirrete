import java.io.Serializable;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public final class kx implements ThreadFactory {
  public final int a;
  
  public final Serializable b = new AtomicInteger(0);
  
  public kx() {}
  
  public kx(String paramString) {}
  
  public final Thread newThread(Runnable paramRunnable) {
    int i = this.a;
    Serializable serializable = this.b;
    switch (i) {
      default:
        paramRunnable = new Thread(paramRunnable, (String)serializable);
        paramRunnable.setDaemon(true);
        return (Thread)paramRunnable;
      case 0:
        break;
    } 
    Thread thread = new Thread(paramRunnable);
    StringBuilder stringBuilder = new StringBuilder("arch_disk_io_");
    stringBuilder.append(((AtomicInteger)serializable).getAndIncrement());
    thread.setName(stringBuilder.toString());
    return thread;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\kx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
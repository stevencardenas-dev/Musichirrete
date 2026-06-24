import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

public final class zu2 extends ju2 implements RunnableFuture {
  public volatile yu2 j;
  
  public zu2(Callable paramCallable) {
    this.j = new yu2(this, paramCallable);
  }
  
  public final void e() {
    Object object = this.b;
    if (object instanceof gu2 && ((gu2)object).a) {
      yu2 yu21 = this.j;
      if (yu21 != null) {
        object = yu2.f;
        yf0 yf0 = yu2.e;
        Runnable runnable = yu21.get();
        if (runnable instanceof Thread) {
          tu2 tu2 = new tu2(yu21);
          tu2.a(Thread.currentThread());
          if (yu21.compareAndSet(runnable, tu2))
            try {
              Thread thread = (Thread)runnable;
              thread.interrupt();
            } finally {
              if ((Runnable)yu21.getAndSet(yf0) == object)
                LockSupport.unpark((Thread)runnable); 
            }  
        } 
      } 
    } 
    this.j = null;
  }
  
  public final String f() {
    yu2 yu21 = this.j;
    if (yu21 != null) {
      String str = yu21.toString();
      return x41.o(new StringBuilder(str.length() + 7), "task=[", str, "]");
    } 
    if (this instanceof ScheduledFuture) {
      long l = ((ScheduledFuture)this).getDelay(TimeUnit.MILLISECONDS);
      StringBuilder stringBuilder = new StringBuilder(String.valueOf(l).length() + 21);
      stringBuilder.append("remaining delay=[");
      stringBuilder.append(l);
      stringBuilder.append(" ms]");
      return stringBuilder.toString();
    } 
    return null;
  }
  
  public final void run() {
    yu2 yu21 = this.j;
    if (yu21 != null)
      yu21.run(); 
    this.j = null;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\zu2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
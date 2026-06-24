import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

public final class ei implements ho0 {
  public final WeakReference b;
  
  public final di c = new di(this);
  
  public ei(bi parambi) {
    this.b = new WeakReference<bi>(parambi);
  }
  
  public final void a(Runnable paramRunnable, Executor paramExecutor) {
    this.c.a(paramRunnable, paramExecutor);
  }
  
  public final boolean cancel(boolean paramBoolean) {
    bi bi = this.b.get();
    paramBoolean = this.c.cancel(paramBoolean);
    if (paramBoolean && bi != null) {
      bi.a = null;
      bi.b = null;
      bi.c.k(null);
    } 
    return paramBoolean;
  }
  
  public final Object get() {
    return this.c.get();
  }
  
  public final Object get(long paramLong, TimeUnit paramTimeUnit) {
    return this.c.get(paramLong, paramTimeUnit);
  }
  
  public final boolean isCancelled() {
    return this.c.b instanceof x;
  }
  
  public final boolean isDone() {
    return this.c.isDone();
  }
  
  public final String toString() {
    return this.c.toString();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\ei.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

public final class js2 implements hj2 {
  public final WeakReference b;
  
  public final rr2 c = new rr2(this);
  
  public js2(tp2 paramtp2) {
    this.b = new WeakReference<tp2>(paramtp2);
  }
  
  public final void b(Runnable paramRunnable, Executor paramExecutor) {
    this.c.b(paramRunnable, paramExecutor);
  }
  
  public final boolean cancel(boolean paramBoolean) {
    tp2 tp2 = this.b.get();
    boolean bool = this.c.cancel(paramBoolean);
    paramBoolean = bool;
    if (bool) {
      paramBoolean = bool;
      if (tp2 != null) {
        tp2.a = null;
        tp2.b = null;
        tp2.c.i(null);
        paramBoolean = true;
      } 
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
    return this.c.b instanceof rj2;
  }
  
  public final boolean isDone() {
    return this.c.isDone();
  }
  
  public final String toString() {
    return this.c.toString();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\js2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
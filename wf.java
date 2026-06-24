import java.util.concurrent.locks.LockSupport;

public final class wf extends m {
  public final Thread h;
  
  public final n50 i;
  
  public wf(os paramos, Thread paramThread, n50 paramn50) {
    super(paramos, true);
    this.h = paramThread;
    this.i = paramn50;
  }
  
  public final void r(Object paramObject) {
    Thread thread = Thread.currentThread();
    paramObject = this.h;
    if (!ui0.c(thread, paramObject))
      LockSupport.unpark((Thread)paramObject); 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\wf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
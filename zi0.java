import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

public final class zi0 extends yj0 {
  public static final AtomicIntegerFieldUpdater k = AtomicIntegerFieldUpdater.newUpdater(zi0.class, "_invoked$volatile");
  
  public volatile int _invoked$volatile;
  
  public final xi0 j;
  
  public zi0(xi0 paramxi0) {
    this.j = paramxi0;
    this._invoked$volatile = 0;
  }
  
  public final boolean r() {
    return true;
  }
  
  public final void s(Throwable paramThrowable) {
    if (k.compareAndSet(this, 0, 1))
      this.j.h(paramThrowable); 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\zi0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
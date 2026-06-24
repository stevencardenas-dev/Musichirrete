import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

public final class yz extends gj1 {
  public static final AtomicIntegerFieldUpdater i = AtomicIntegerFieldUpdater.newUpdater(yz.class, "_decision$volatile");
  
  public volatile int _decision$volatile;
  
  public final void r(Object paramObject) {
    s(paramObject);
  }
  
  public final void s(Object paramObject) {
    AtomicIntegerFieldUpdater<yz> atomicIntegerFieldUpdater;
    do {
      atomicIntegerFieldUpdater = i;
      int i = atomicIntegerFieldUpdater.get(this);
      if (i != 0) {
        if (i == 1) {
          ui0.V(dd1.N(this.h), qv.W(paramObject));
          return;
        } 
        tp.f("Already resumed");
        return;
      } 
    } while (!atomicIntegerFieldUpdater.compareAndSet(this, 0, 2));
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\yz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
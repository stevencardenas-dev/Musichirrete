import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

public abstract class ek1 extends gp implements i21 {
  public static final AtomicIntegerFieldUpdater f = AtomicIntegerFieldUpdater.newUpdater(ek1.class, "cleanedAndPointers$volatile");
  
  public volatile int cleanedAndPointers$volatile;
  
  public final long e;
  
  public ek1(long paramLong, ek1 paramek1, int paramInt) {
    super(paramek1);
    this.e = paramLong;
    this.cleanedAndPointers$volatile = paramInt << 16;
  }
  
  public final boolean f() {
    return !(f.get(this) != k() || c() == null);
  }
  
  public final boolean j() {
    return !(f.addAndGet(this, -65536) != k() || c() == null);
  }
  
  public abstract int k();
  
  public abstract void l(int paramInt, os paramos);
  
  public final void m() {
    if (f.incrementAndGet(this) == k())
      h(); 
  }
  
  public final boolean n() {
    while (true) {
      AtomicIntegerFieldUpdater<ek1> atomicIntegerFieldUpdater = f;
      int i = atomicIntegerFieldUpdater.get(this);
      if (i != k() || c() == null) {
        if (atomicIntegerFieldUpdater.compareAndSet(this, i, 65536 + i))
          return true; 
        continue;
      } 
      return false;
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\ek1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

public final class ym0 extends rs implements vx {
  public static final AtomicIntegerFieldUpdater j = AtomicIntegerFieldUpdater.newUpdater(ym0.class, "runningWorkers$volatile");
  
  public final vx e;
  
  public final rs f;
  
  public final int g;
  
  public final zo0 h;
  
  public final Object i;
  
  public volatile int runningWorkers$volatile;
  
  public ym0(rs paramrs, int paramInt) {
    vx vx1;
    if (paramrs instanceof vx) {
      vx1 = (vx)paramrs;
    } else {
      vx1 = null;
    } 
    vx vx2 = vx1;
    if (vx1 == null)
      vx2 = dw.a; 
    this.e = vx2;
    this.f = paramrs;
    this.g = paramInt;
    this.h = new zo0();
    this.i = new Object();
  }
  
  public final k00 d(long paramLong, wu1 paramwu1, os paramos) {
    return this.e.d(paramLong, paramwu1, paramos);
  }
  
  public final void g(long paramLong, ni paramni) {
    this.e.g(paramLong, paramni);
  }
  
  public final void m(os paramos, Runnable paramRunnable) {
    this.h.a(paramRunnable);
    if (j.get((T)this) < this.g && u()) {
      Runnable runnable = s();
      if (runnable != null) {
        runnable = new vi2(this, runnable, 12, false);
        this.f.m(this, runnable);
      } 
    } 
  }
  
  public final void p(os paramos, Runnable paramRunnable) {
    this.h.a(paramRunnable);
    if (j.get((T)this) < this.g && u()) {
      Runnable runnable = s();
      if (runnable != null) {
        runnable = new vi2(this, runnable, 12, false);
        this.f.p(this, runnable);
      } 
    } 
  }
  
  public final Runnable s() {
    while (true) {
      Runnable runnable = (Runnable)this.h.d();
      if (runnable == null) {
        synchronized (this.i) {
          AtomicIntegerFieldUpdater<ym0> atomicIntegerFieldUpdater = j;
          atomicIntegerFieldUpdater.decrementAndGet(this);
          int i = this.h.c();
          if (i == 0)
            return null; 
          atomicIntegerFieldUpdater.incrementAndGet(this);
        } 
        continue;
      } 
      return runnable;
    } 
  }
  
  public final String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(this.f);
    stringBuilder.append(".limitedParallelism(");
    stringBuilder.append(this.g);
    stringBuilder.append(')');
    return stringBuilder.toString();
  }
  
  public final boolean u() {
    synchronized (this.i) {
      AtomicIntegerFieldUpdater<ym0> atomicIntegerFieldUpdater = j;
      int j = atomicIntegerFieldUpdater.get(this);
      int i = this.g;
      if (j >= i)
        return false; 
      atomicIntegerFieldUpdater.incrementAndGet(this);
      return true;
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\ym0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
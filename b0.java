import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public final class b0 extends ws2 {
  public final AtomicReferenceFieldUpdater s;
  
  public final AtomicReferenceFieldUpdater t;
  
  public final AtomicReferenceFieldUpdater u;
  
  public final AtomicReferenceFieldUpdater v;
  
  public final AtomicReferenceFieldUpdater w;
  
  public b0(AtomicReferenceFieldUpdater paramAtomicReferenceFieldUpdater1, AtomicReferenceFieldUpdater paramAtomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater paramAtomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater paramAtomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater paramAtomicReferenceFieldUpdater5) {
    super(5);
    this.s = paramAtomicReferenceFieldUpdater1;
    this.t = paramAtomicReferenceFieldUpdater2;
    this.u = paramAtomicReferenceFieldUpdater3;
    this.v = paramAtomicReferenceFieldUpdater4;
    this.w = paramAtomicReferenceFieldUpdater5;
  }
  
  public final void X(d0 paramd01, d0 paramd02) {
    this.t.lazySet(paramd01, paramd02);
  }
  
  public final void Y(d0 paramd0, Thread paramThread) {
    this.s.lazySet(paramd0, paramThread);
  }
  
  public final boolean i(e0 parame0, a0 parama01, a0 parama02) {
    while (true) {
      AtomicReferenceFieldUpdater<e0, a0> atomicReferenceFieldUpdater = this.v;
      if (atomicReferenceFieldUpdater.compareAndSet(parame0, parama01, parama02))
        return true; 
      if (atomicReferenceFieldUpdater.get(parame0) != parama01)
        return false; 
    } 
  }
  
  public final boolean j(e0 parame0, Object paramObject1, Object paramObject2) {
    while (true) {
      AtomicReferenceFieldUpdater<e0, Object> atomicReferenceFieldUpdater = this.w;
      if (atomicReferenceFieldUpdater.compareAndSet(parame0, paramObject1, paramObject2))
        return true; 
      if (atomicReferenceFieldUpdater.get(parame0) != paramObject1)
        return false; 
    } 
  }
  
  public final boolean k(e0 parame0, d0 paramd01, d0 paramd02) {
    while (true) {
      AtomicReferenceFieldUpdater<e0, d0> atomicReferenceFieldUpdater = this.u;
      if (atomicReferenceFieldUpdater.compareAndSet(parame0, paramd01, paramd02))
        return true; 
      if (atomicReferenceFieldUpdater.get(parame0) != paramd01)
        return false; 
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\b0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
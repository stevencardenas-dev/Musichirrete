import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public final class in2 extends ui0 {
  public final AtomicReferenceFieldUpdater o;
  
  public final AtomicReferenceFieldUpdater p;
  
  public final AtomicReferenceFieldUpdater q;
  
  public final AtomicReferenceFieldUpdater r;
  
  public final AtomicReferenceFieldUpdater s;
  
  public in2(AtomicReferenceFieldUpdater paramAtomicReferenceFieldUpdater1, AtomicReferenceFieldUpdater paramAtomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater paramAtomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater paramAtomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater paramAtomicReferenceFieldUpdater5) {
    this.o = paramAtomicReferenceFieldUpdater1;
    this.p = paramAtomicReferenceFieldUpdater2;
    this.q = paramAtomicReferenceFieldUpdater3;
    this.r = paramAtomicReferenceFieldUpdater4;
    this.s = paramAtomicReferenceFieldUpdater5;
  }
  
  public final boolean A0(pp2 parampp2, Object paramObject1, Object paramObject2) {
    return z51.V(this.s, parampp2, paramObject1, paramObject2);
  }
  
  public final boolean B0(pp2 parampp2, wo2 paramwo21, wo2 paramwo22) {
    return z51.V(this.q, parampp2, paramwo21, paramwo22);
  }
  
  public final void v0(wo2 paramwo21, wo2 paramwo22) {
    this.p.lazySet(paramwo21, paramwo22);
  }
  
  public final void x0(wo2 paramwo2, Thread paramThread) {
    this.o.lazySet(paramwo2, paramThread);
  }
  
  public final boolean y0(pp2 parampp2, vl2 paramvl21, vl2 paramvl22) {
    return z51.V(this.r, parampp2, paramvl21, paramvl22);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\in2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
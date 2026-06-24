import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public final class ku2 extends zo2 {
  public static final AtomicReferenceFieldUpdater s = AtomicReferenceFieldUpdater.newUpdater(qu2.class, Thread.class, "a");
  
  public static final AtomicReferenceFieldUpdater t = AtomicReferenceFieldUpdater.newUpdater(qu2.class, qu2.class, "b");
  
  public static final AtomicReferenceFieldUpdater u = AtomicReferenceFieldUpdater.newUpdater(ru2.class, qu2.class, "e");
  
  public static final AtomicReferenceFieldUpdater v = AtomicReferenceFieldUpdater.newUpdater(ru2.class, iu2.class, "c");
  
  public static final AtomicReferenceFieldUpdater w = AtomicReferenceFieldUpdater.newUpdater(ru2.class, Object.class, "b");
  
  public final void W(qu2 paramqu2, Thread paramThread) {
    s.lazySet(paramqu2, paramThread);
  }
  
  public final void Z(qu2 paramqu21, qu2 paramqu22) {
    t.lazySet(paramqu21, paramqu22);
  }
  
  public final boolean b0(ru2 paramru2, qu2 paramqu21, qu2 paramqu22) {
    while (true) {
      AtomicReferenceFieldUpdater<ru2, qu2> atomicReferenceFieldUpdater = u;
      if (atomicReferenceFieldUpdater.compareAndSet(paramru2, paramqu21, paramqu22))
        return true; 
      if (atomicReferenceFieldUpdater.get(paramru2) != paramqu21)
        return false; 
    } 
  }
  
  public final boolean c0(ru2 paramru2, iu2 paramiu21, iu2 paramiu22) {
    while (true) {
      AtomicReferenceFieldUpdater<ru2, iu2> atomicReferenceFieldUpdater = v;
      if (atomicReferenceFieldUpdater.compareAndSet(paramru2, paramiu21, paramiu22))
        return true; 
      if (atomicReferenceFieldUpdater.get(paramru2) != paramiu21)
        return false; 
    } 
  }
  
  public final qu2 d0(ju2 paramju2) {
    qu2 qu2 = qu2.c;
    return u.getAndSet(paramju2, qu2);
  }
  
  public final iu2 e0(ju2 paramju2) {
    iu2 iu2 = iu2.d;
    return v.getAndSet(paramju2, iu2);
  }
  
  public final boolean f0(ru2 paramru2, Object paramObject1, Object paramObject2) {
    while (true) {
      AtomicReferenceFieldUpdater<ru2, Object> atomicReferenceFieldUpdater = w;
      if (atomicReferenceFieldUpdater.compareAndSet(paramru2, paramObject1, paramObject2))
        return true; 
      if (atomicReferenceFieldUpdater.get(paramru2) != paramObject1)
        return false; 
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\ku2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
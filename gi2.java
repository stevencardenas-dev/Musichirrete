import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public final class gi2 extends wf2 {
  public static final AtomicReferenceFieldUpdater s = AtomicReferenceFieldUpdater.newUpdater(ji2.class, Thread.class, "a");
  
  public static final AtomicReferenceFieldUpdater t = AtomicReferenceFieldUpdater.newUpdater(ji2.class, ji2.class, "b");
  
  public static final AtomicReferenceFieldUpdater u = AtomicReferenceFieldUpdater.newUpdater(li2.class, ji2.class, "e");
  
  public static final AtomicReferenceFieldUpdater v = AtomicReferenceFieldUpdater.newUpdater(li2.class, fi2.class, "c");
  
  public static final AtomicReferenceFieldUpdater w = AtomicReferenceFieldUpdater.newUpdater(li2.class, Object.class, "b");
  
  public final void B0(ji2 paramji21, ji2 paramji22) {
    t.lazySet(paramji21, paramji22);
  }
  
  public final void D0(ji2 paramji2, Thread paramThread) {
    s.lazySet(paramji2, paramThread);
  }
  
  public final boolean H0(kj2 paramkj2, fi2 paramfi21, fi2 paramfi22) {
    return zo2.X(v, paramkj2, paramfi21, paramfi22);
  }
  
  public final boolean J0(li2 paramli2, Object paramObject1, Object paramObject2) {
    return zo2.X(w, paramli2, paramObject1, paramObject2);
  }
  
  public final boolean K0(li2 paramli2, ji2 paramji21, ji2 paramji22) {
    return zo2.X(u, paramli2, paramji21, paramji22);
  }
  
  public final fi2 w0(kj2 paramkj2) {
    fi2 fi2 = fi2.d;
    return v.getAndSet(paramkj2, fi2);
  }
  
  public final ji2 x0(kj2 paramkj2) {
    ji2 ji2 = ji2.c;
    return u.getAndSet(paramkj2, ji2);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\gi2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
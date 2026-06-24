import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

public final class w72 {
  public static final AtomicReferenceFieldUpdater b = AtomicReferenceFieldUpdater.newUpdater(w72.class, Object.class, "lastScheduledTask$volatile");
  
  public static final AtomicIntegerFieldUpdater c;
  
  public static final AtomicIntegerFieldUpdater d;
  
  public static final AtomicIntegerFieldUpdater e;
  
  public static final long f = oi.a.objectFieldOffset(w72.class.getDeclaredField("lastScheduledTask$volatile"));
  
  public final AtomicReferenceArray a = new AtomicReferenceArray(128);
  
  public volatile int blockingTasksInBuffer$volatile;
  
  public volatile int consumerIndex$volatile;
  
  public volatile Object lastScheduledTask$volatile;
  
  public volatile int producerIndex$volatile;
  
  static {
    c = AtomicIntegerFieldUpdater.newUpdater(w72.class, "producerIndex$volatile");
    d = AtomicIntegerFieldUpdater.newUpdater(w72.class, "consumerIndex$volatile");
    e = AtomicIntegerFieldUpdater.newUpdater(w72.class, "blockingTasksInBuffer$volatile");
  }
  
  public final mt1 a(mt1 parammt1, boolean paramBoolean) {
    if (paramBoolean)
      return b(parammt1); 
    b.getClass();
    parammt1 = (mt1)oi.a.getAndSetObject(this, f, parammt1);
    return (parammt1 == null) ? null : b(parammt1);
  }
  
  public final mt1 b(mt1 parammt1) {
    AtomicIntegerFieldUpdater<w72> atomicIntegerFieldUpdater = c;
    if (atomicIntegerFieldUpdater.get(this) - d.get(this) == 127)
      return parammt1; 
    if (parammt1.c)
      e.incrementAndGet(this); 
    int i = atomicIntegerFieldUpdater.get(this) & 0x7F;
    while (true) {
      AtomicReferenceArray<mt1> atomicReferenceArray = this.a;
      if (atomicReferenceArray.get(i) != null) {
        Thread.yield();
        continue;
      } 
      atomicReferenceArray.lazySet(i, parammt1);
      atomicIntegerFieldUpdater.incrementAndGet(this);
      return null;
    } 
  }
  
  public final int c() {
    b.getClass();
    Object object = oi.a.getObjectVolatile(this, f);
    AtomicIntegerFieldUpdater<w72> atomicIntegerFieldUpdater1 = d;
    AtomicIntegerFieldUpdater<w72> atomicIntegerFieldUpdater2 = c;
    return (object != null) ? (atomicIntegerFieldUpdater2.get(this) - atomicIntegerFieldUpdater1.get(this) + 1) : (atomicIntegerFieldUpdater2.get(this) - atomicIntegerFieldUpdater1.get(this));
  }
  
  public final void d(ge0 paramge0) {
    b.getClass();
    mt1 mt1 = (mt1)oi.a.getAndSetObject(this, f, null);
    if (mt1 != null)
      paramge0.a(mt1); 
    while (true) {
      mt1 = f();
      if (mt1 == null)
        return; 
      paramge0.a(mt1);
    } 
  }
  
  public final mt1 e() {
    b.getClass();
    mt1 mt1 = (mt1)oi.a.getAndSetObject(this, f, null);
    return (mt1 == null) ? f() : mt1;
  }
  
  public final mt1 f() {
    while (true) {
      AtomicIntegerFieldUpdater<w72> atomicIntegerFieldUpdater = d;
      int i = atomicIntegerFieldUpdater.get(this);
      if (i - c.get(this) == 0)
        return null; 
      if (atomicIntegerFieldUpdater.compareAndSet(this, i, i + 1)) {
        mt1 mt1 = this.a.getAndSet(i & 0x7F, null);
        if (mt1 == null)
          continue; 
        if (mt1.c)
          e.decrementAndGet(this); 
        return mt1;
      } 
    } 
  }
  
  public final mt1 g() {
    w72 w721 = this;
    label23: while (true) {
      b.getClass();
      Unsafe unsafe = oi.a;
      long l = f;
      mt1 mt1 = (mt1)unsafe.getObjectVolatile(w721, l);
      if (mt1 != null && mt1.c == true)
        while (true) {
          Unsafe unsafe1 = oi.a;
          if (unsafe1.compareAndSwapObject(w721, f, mt1, null))
            return mt1; 
          if (unsafe1.getObjectVolatile(w721, l) != mt1)
            continue label23; 
        }  
      break;
    } 
    int j = d.get(w721);
    int i = c.get(w721);
    while (j != i && e.get(w721) != 0) {
      mt1 mt1 = w721.h(--i, true);
      if (mt1 != null)
        return mt1; 
    } 
    return null;
  }
  
  public final mt1 h(int paramInt, boolean paramBoolean) {
    paramInt &= 0x7F;
    AtomicReferenceArray<mt1> atomicReferenceArray = this.a;
    mt1 mt1 = atomicReferenceArray.get(paramInt);
    if (mt1 != null && mt1.c == paramBoolean)
      do {
        if (atomicReferenceArray.compareAndSet(paramInt, mt1, null)) {
          if (paramBoolean)
            e.decrementAndGet(this); 
          return mt1;
        } 
      } while (atomicReferenceArray.get(paramInt) == mt1); 
    return null;
  }
  
  public final long i(int paramInt, me1 paramme1) {
    w72 w721 = this;
    label22: while (true) {
      b.getClass();
      Unsafe unsafe = oi.a;
      long l = f;
      mt1 mt1 = (mt1)unsafe.getObjectVolatile(w721, l);
      if (mt1 != null) {
        byte b;
        if (mt1.c) {
          b = 1;
        } else {
          b = 2;
        } 
        if ((b & paramInt) != 0) {
          qt1.f.getClass();
          long l1 = System.nanoTime() - mt1.b;
          long l2 = qt1.b;
          if (l1 < l2)
            return l2 - l1; 
          while (true) {
            Unsafe unsafe1 = oi.a;
            if (unsafe1.compareAndSwapObject(w721, f, mt1, null)) {
              paramme1.b = mt1;
              return -1L;
            } 
            if (unsafe1.getObjectVolatile(w721, l) != mt1)
              continue label22; 
          } 
          break;
        } 
      } 
      return -2L;
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\w72.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

public class hk1 {
  public static final AtomicReferenceFieldUpdater e = AtomicReferenceFieldUpdater.newUpdater(hk1.class, Object.class, "head$volatile");
  
  public static final AtomicLongFieldUpdater f;
  
  public static final AtomicReferenceFieldUpdater g;
  
  public static final AtomicLongFieldUpdater h;
  
  public static final AtomicIntegerFieldUpdater i;
  
  public static final long j;
  
  public static final long k;
  
  public volatile int _availablePermits$volatile;
  
  public final int b;
  
  public final mi c;
  
  public volatile long deqIdx$volatile;
  
  public volatile long enqIdx$volatile;
  
  public volatile Object head$volatile;
  
  public volatile Object tail$volatile;
  
  static {
    Unsafe unsafe = oi.a;
    j = unsafe.objectFieldOffset(hk1.class.getDeclaredField("head$volatile"));
    f = AtomicLongFieldUpdater.newUpdater(hk1.class, "deqIdx$volatile");
    g = AtomicReferenceFieldUpdater.newUpdater(hk1.class, Object.class, "tail$volatile");
    k = unsafe.objectFieldOffset(hk1.class.getDeclaredField("tail$volatile"));
    h = AtomicLongFieldUpdater.newUpdater(hk1.class, "enqIdx$volatile");
    i = AtomicIntegerFieldUpdater.newUpdater(hk1.class, "_availablePermits$volatile");
  }
  
  public hk1(int paramInt) {
    this.b = paramInt;
    if (paramInt > 0) {
      if (paramInt >= 0) {
        kk1 kk1 = new kk1(0L, null, 2);
        this.head$volatile = kk1;
        this.tail$volatile = kk1;
        this._availablePermits$volatile = paramInt;
        this.c = new mi(2, this);
        return;
      } 
      k91.e(ga1.i("The number of acquired permits should be in 0..", paramInt));
      throw null;
    } 
    k91.e(ga1.i("Semaphore should have at least 1 permit, but had ", paramInt));
    throw null;
  }
  
  public final boolean b(e52 parame52) {
    g.getClass();
    Object object = oi.a;
    long l3 = k;
    kk1 kk1 = (kk1)object.getObjectVolatile(this, l3);
    long l1 = h.getAndIncrement(this);
    fk1 fk1 = fk1.j;
    long l2 = l1 / jk1.f;
    label33: while (true) {
      object = zo2.n(kk1, l2, fk1);
      if (!g92.N(object)) {
        ek1 ek1 = g92.H(object);
        while (true) {
          ek1 ek11 = (ek1)oi.a.getObjectVolatile(this, l3);
          if (ek11.e >= ek1.e)
            break; 
          if (!ek1.n())
            continue label33; 
          while (true) {
            Unsafe unsafe = oi.a;
            long l = k;
            if (unsafe.compareAndSwapObject(this, l, ek11, ek1)) {
              if (ek11.j())
                ek11.h(); 
              break;
            } 
            if (unsafe.getObjectVolatile(this, l3) != ek11 && ek1.j())
              ek1.h(); 
          } 
          break;
        } 
      } 
      break;
    } 
    kk1 = (kk1)g92.H(object);
    object = kk1.g;
    int i = (int)(l1 % jk1.f);
    while (true) {
      if (object.compareAndSet(i, null, parame52)) {
        parame52.a(kk1, i);
        return true;
      } 
      if (object.get(i) != null) {
        f1 f12 = jk1.b;
        f1 f11 = jk1.c;
        while (true) {
          if (object.compareAndSet(i, f12, f11)) {
            ((li)parame52).i(l02.a, this.c);
            return true;
          } 
          if (object.get(i) != f12)
            return false; 
        } 
        break;
      } 
    } 
  }
  
  public final void d() {
    int i;
    AtomicIntegerFieldUpdater<hk1> atomicIntegerFieldUpdater;
    while (true) {
      atomicIntegerFieldUpdater = i;
      int j = atomicIntegerFieldUpdater.getAndIncrement(this);
      i = this.b;
      if (j < i) {
        if (j >= 0 || e())
          return; 
        continue;
      } 
      break;
    } 
    while (true) {
      int j = atomicIntegerFieldUpdater.get(this);
      if (j > i && !atomicIntegerFieldUpdater.compareAndSet(this, j, i))
        continue; 
      break;
    } 
    StringBuilder stringBuilder = new StringBuilder("The number of released permits cannot be greater than ");
    stringBuilder.append(i);
    throw new IllegalStateException(stringBuilder.toString().toString());
  }
  
  public final boolean e() {
    Object object;
    e.getClass();
    Unsafe unsafe = oi.a;
    long l3 = j;
    kk1 kk11 = (kk1)unsafe.getObjectVolatile(this, l3);
    long l2 = f.getAndIncrement(this);
    long l1 = l2 / jk1.f;
    gk1 gk1 = gk1.j;
    label50: while (true) {
      object = zo2.n(kk11, l1, gk1);
      if (!g92.N(object)) {
        ek1 ek1 = g92.H(object);
        while (true) {
          ek1 ek11 = (ek1)oi.a.getObjectVolatile(this, l3);
          if (ek11.e >= ek1.e)
            break; 
          if (!ek1.n())
            continue label50; 
          while (true) {
            Unsafe unsafe1 = oi.a;
            if (unsafe1.compareAndSwapObject(this, j, ek11, ek1)) {
              if (ek11.j())
                ek11.h(); 
              break;
            } 
            if (unsafe1.getObjectVolatile(this, l3) != ek11 && ek1.j())
              ek1.h(); 
          } 
          break;
        } 
      } 
      break;
    } 
    kk1 kk12 = (kk1)g92.H(object);
    AtomicReferenceArray<?> atomicReferenceArray = kk12.g;
    kk12.a();
    l3 = kk12.e;
    boolean bool = false;
    if (l3 <= l1) {
      f1 f1;
      int i = (int)(l2 % jk1.f);
      kk12 = (kk1)atomicReferenceArray.getAndSet(i, jk1.b);
      if (kk12 == null) {
        int j = jk1.a;
        byte b;
        for (b = 0; b < j; b++) {
          if (atomicReferenceArray.get(i) == jk1.c)
            return true; 
        } 
        f1 f11 = jk1.b;
        f1 = jk1.d;
        while (true) {
          if (atomicReferenceArray.compareAndSet(i, f11, f1)) {
            b = 1;
            break;
          } 
          if (atomicReferenceArray.get(i) != f11) {
            b = bool;
            break;
          } 
        } 
        return b ^ 0x1;
      } 
      if (f1 != jk1.e) {
        li li;
        if (f1 instanceof li) {
          li = (li)f1;
          f1 f11 = li.j(l02.a, this.c);
          if (f11 != null) {
            li.q(f11);
            return true;
          } 
          return false;
        } 
        tp.k("unexpected: ", li);
        return false;
      } 
    } 
    return false;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\hk1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
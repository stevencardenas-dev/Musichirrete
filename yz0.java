import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import org.jaudiotagger.audio.dsf.qdA.GMDx;
import sun.misc.Unsafe;

public final class yz0 extends hk1 implements wz0 {
  public static final AtomicReferenceFieldUpdater l = AtomicReferenceFieldUpdater.newUpdater(yz0.class, Object.class, "owner$volatile");
  
  public static final long m = oi.a.objectFieldOffset(yz0.class.getDeclaredField("owner$volatile"));
  
  public volatile Object owner$volatile = n21.c;
  
  public yz0() {
    super(1);
  }
  
  public final void a(Object paramObject) {
    yz0 yz01 = this;
    while (Math.max(hk1.i.get(yz01), 0) == 0) {
      l.getClass();
      Unsafe unsafe = oi.a;
      long l = m;
      Object object = unsafe.getObjectVolatile(yz01, l);
      f1 f1 = n21.c;
      if (object != f1) {
        yz0 yz02 = yz01;
        if (object != paramObject)
          if (paramObject == null) {
            yz02 = yz01;
          } else {
            m60.l("This mutex is locked by ", object, ", but ", paramObject, " is expected");
            return;
          }  
        while (true) {
          Unsafe unsafe1 = oi.a;
          if (unsafe1.compareAndSwapObject(yz02, m, object, f1)) {
            yz02.d();
            return;
          } 
          if (unsafe1.getObjectVolatile(yz02, l) != object)
            yz0 yz03 = yz02; 
        } 
      } 
    } 
    tp.f(GMDx.nIGksazTFi);
  }
  
  public final Object c(ds paramds) {
    int i = f();
    l02 l02 = l02.a;
    if (i != 0) {
      if (i != 1) {
        if (i != 2) {
          tp.f("unexpected");
          return null;
        } 
        tp.f("This mutex is already locked by the specified owner: null");
        return null;
      } 
      Object object = g92.F(dd1.N(paramds));
      try {
        xz0 xz0 = new xz0();
        this(this, (ni)object);
        while (true) {
          i = hk1.i.getAndDecrement(this);
          if (i <= this.b) {
            if (i > 0) {
              AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = l;
              yz0 yz01 = xz0.c;
              atomicReferenceFieldUpdater.set(yz01, null);
              ni ni = xz0.b;
              l l = new l();
              this(yz01, xz0);
              i = ni.e;
              mi mi = new mi();
              this(0, l);
              ni.G(l02, i, mi);
              break;
            } 
            boolean bool = b(xz0);
            if (bool)
              break; 
          } 
        } 
        object = object.v();
        ys ys = ys.b;
        if (object != ys)
          object = l02; 
      } finally {
        object.E();
      } 
    } 
    return l02;
  }
  
  public final int f() {
    label14: while (true) {
      AtomicIntegerFieldUpdater<yz0> atomicIntegerFieldUpdater = hk1.i;
      int j = atomicIntegerFieldUpdater.get(this);
      int i = this.b;
      if (j > i) {
        while (true) {
          j = atomicIntegerFieldUpdater.get(this);
          if (j > i) {
            if (atomicIntegerFieldUpdater.compareAndSet(this, j, i))
              continue label14; 
            continue;
          } 
          continue label14;
        } 
        break;
      } 
      if (j <= 0)
        return 1; 
      if (atomicIntegerFieldUpdater.compareAndSet(this, j, j - 1)) {
        l.getClass();
        oi.a.putObjectVolatile(this, m, null);
        return 0;
      } 
    } 
  }
  
  public final String toString() {
    StringBuilder stringBuilder = new StringBuilder("Mutex@");
    stringBuilder.append(qv.s(this));
    stringBuilder.append("[isLocked=");
    int i = hk1.i.get(this);
    boolean bool = false;
    if (Math.max(i, 0) == 0)
      bool = true; 
    stringBuilder.append(bool);
    stringBuilder.append(",owner=");
    l.getClass();
    stringBuilder.append(oi.a.getObjectVolatile(this, m));
    stringBuilder.append(']');
    return stringBuilder.toString();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\yz0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
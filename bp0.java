import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

public final class bp0 {
  public static final AtomicReferenceFieldUpdater e = AtomicReferenceFieldUpdater.newUpdater(bp0.class, Object.class, "_next$volatile");
  
  public static final AtomicLongFieldUpdater f;
  
  public static final f1 g;
  
  public static final long h = oi.a.objectFieldOffset(bp0.class.getDeclaredField("_next$volatile"));
  
  public volatile Object _next$volatile;
  
  public volatile long _state$volatile;
  
  public final int a;
  
  public final boolean b;
  
  public final int c;
  
  public final AtomicReferenceArray d;
  
  static {
    f = AtomicLongFieldUpdater.newUpdater(bp0.class, "_state$volatile");
    g = new f1("REMOVE_FROZEN", 4);
  }
  
  public bp0(int paramInt, boolean paramBoolean) {
    this.a = paramInt;
    this.b = paramBoolean;
    int i = paramInt - 1;
    this.c = i;
    this.d = new AtomicReferenceArray(paramInt);
    if (i <= 1073741823) {
      if ((paramInt & i) == 0)
        return; 
      tp.f("Check failed.");
      throw null;
    } 
    tp.f("Check failed.");
    throw null;
  }
  
  public final int a(Object paramObject) {
    bp0 bp01 = this;
    while (true) {
      AtomicLongFieldUpdater<bp0> atomicLongFieldUpdater = f;
      long l = atomicLongFieldUpdater.get(bp01);
      if ((0x3000000000000000L & l) != 0L) {
        if ((0x2000000000000000L & l) != 0L)
          return 2; 
      } else {
        int j = (int)(0x3FFFFFFFL & l);
        int i = (int)((0xFFFFFFFC0000000L & l) >> 30L);
        int k = bp01.c;
        if ((i + 2 & k) != (j & k)) {
          boolean bool = bp01.b;
          AtomicReferenceArray<Object> atomicReferenceArray = bp01.d;
          if (!bool && atomicReferenceArray.get(i & k) != null) {
            k = bp01.a;
            if (k < 1024 || (i - j & 0x3FFFFFFF) > k >> 1)
              return 1; 
            continue;
          } 
          long l1 = (i + 1 & 0x3FFFFFFF);
          if (f.compareAndSet(bp01, l, 0xF00000003FFFFFFFL & l | l1 << 30L)) {
            atomicReferenceArray.set(i & k, paramObject);
            bp0 bp02 = bp01;
            while ((atomicLongFieldUpdater.get(bp02) & 0x1000000000000000L) != 0L) {
              bp01 = bp02.d();
              AtomicReferenceArray<bp0> atomicReferenceArray1 = bp01.d;
              j = bp01.c & i;
              bp02 = atomicReferenceArray1.get(j);
              if (bp02 instanceof ap0 && ((ap0)bp02).a == i) {
                atomicReferenceArray1.set(j, paramObject);
              } else {
                bp01 = null;
              } 
              bp02 = bp01;
              if (bp01 == null)
                break; 
            } 
            return 0;
          } 
          continue;
        } 
      } 
      return 1;
    } 
  }
  
  public final bp0 b(long paramLong) {
    bp0 bp01 = this;
    label24: while (true) {
      e.getClass();
      Unsafe unsafe = oi.a;
      long l = h;
      bp0 bp02 = (bp0)unsafe.getObjectVolatile(bp01, l);
      if (bp02 != null)
        return bp02; 
      bp0 bp03 = new bp0(bp01.a * 2, bp01.b);
      int i = (int)(0x3FFFFFFFL & paramLong);
      int j = (int)((0xFFFFFFFC0000000L & paramLong) >> 30L);
      while (true) {
        int k = bp01.c;
        int m = i & k;
        if (m != (k & j)) {
          ap0 ap0;
          bp0 bp04 = (bp0)bp01.d.get(m);
          bp02 = bp04;
          if (bp04 == null)
            ap0 = new ap0(i); 
          k = bp03.c;
          bp03.d.set(k & i, ap0);
          i++;
          continue;
        } 
        f.set(bp03, 0xEFFFFFFFFFFFFFFFL & paramLong);
        while (true) {
          Unsafe unsafe1 = oi.a;
          if (unsafe1.compareAndSwapObject(bp01, h, null, bp03))
            continue label24; 
          if (unsafe1.getObjectVolatile(bp01, l) != null)
            continue label24; 
        } 
      } 
      continue;
    } 
  }
  
  public final boolean c() {
    bp0 bp01 = this;
    while (true) {
      AtomicLongFieldUpdater<bp0> atomicLongFieldUpdater = f;
      long l = atomicLongFieldUpdater.get(bp01);
      if ((l & 0x2000000000000000L) != 0L)
        return true; 
      if ((0x1000000000000000L & l) != 0L)
        return false; 
      if (atomicLongFieldUpdater.compareAndSet(bp01, l, 0x2000000000000000L | l))
        return true; 
    } 
  }
  
  public final bp0 d() {
    long l;
    bp0 bp01 = this;
    while (true) {
      AtomicLongFieldUpdater<bp0> atomicLongFieldUpdater = f;
      l = atomicLongFieldUpdater.get(bp01);
      if ((l & 0x1000000000000000L) != 0L)
        break; 
      long l1 = 0x1000000000000000L | l;
      if (atomicLongFieldUpdater.compareAndSet(bp01, l, l1)) {
        l = l1;
        break;
      } 
    } 
    return bp01.b(l);
  }
  
  public final Object e() {
    long l;
    bp0 bp01;
    AtomicLongFieldUpdater<bp0> atomicLongFieldUpdater;
    Object object;
    while (true) {
      atomicLongFieldUpdater = f;
      long l1 = atomicLongFieldUpdater.get(this);
      if ((l1 & 0x1000000000000000L) != 0L)
        return g; 
      int m = (int)(l1 & 0x3FFFFFFFL);
      int i = (int)((0xFFFFFFFC0000000L & l1) >> 30L);
      int j = this.c;
      int k = m & j;
      if ((i & j) != k) {
        AtomicReferenceArray<Object> atomicReferenceArray = this.d;
        object = atomicReferenceArray.get(k);
        boolean bool = this.b;
        if (object == null) {
          if (bool)
            return null; 
          continue;
        } 
        if (!(object instanceof ap0)) {
          l = (m + 1 & 0x3FFFFFFF);
          if (f.compareAndSet(this, l1, l1 & 0xFFFFFFFFC0000000L | l)) {
            atomicReferenceArray.set(k, null);
            return object;
          } 
          bp01 = this;
          if (bool)
            break; 
          continue;
        } 
      } 
      return null;
    } 
    while (true) {
      bp0 bp02;
      long l1 = atomicLongFieldUpdater.get(bp01);
      int i = (int)(l1 & 0x3FFFFFFFL);
      if ((l1 & 0x1000000000000000L) != 0L) {
        bp02 = bp01.d();
      } else if (f.compareAndSet(bp01, l1, l1 & 0xFFFFFFFFC0000000L | l)) {
        bp01.d.set(i & bp01.c, null);
        bp02 = null;
      } else {
        continue;
      } 
      bp01 = bp02;
      if (bp02 == null)
        return object; 
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\bp0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
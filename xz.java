import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

public final class xz extends zz implements zs, cs {
  public static final AtomicReferenceFieldUpdater j = AtomicReferenceFieldUpdater.newUpdater(xz.class, Object.class, "_reusableCancellableContinuation$volatile");
  
  public static final long k = oi.a.objectFieldOffset(xz.class.getDeclaredField("_reusableCancellableContinuation$volatile"));
  
  public volatile Object _reusableCancellableContinuation$volatile;
  
  public final rs f;
  
  public final ds g;
  
  public Object h;
  
  public final Object i;
  
  public xz(rs paramrs, ds paramds) {
    super(-1);
    this.f = paramrs;
    this.g = paramds;
    this.h = ui0.b;
    this.i = wf2.g0(paramds.e());
  }
  
  public final cs c() {
    return this;
  }
  
  public final zs d() {
    return this.g;
  }
  
  public final os e() {
    return this.g.e();
  }
  
  public final void f(Object paramObject) {
    Object object = rg1.a(paramObject);
    if (object == null) {
      object = paramObject;
    } else {
      object = new bo((Throwable)object, false);
    } 
    ds ds1 = this.g;
    os os = ds1.e();
    rs rs1 = this.f;
    if (rs1.q(os)) {
      this.h = object;
      this.e = 0;
      rs1.m(ds1.e(), this);
      return;
    } 
    rs1 = mu1.a();
    if (((n50)rs1).e >= 4294967296L) {
      this.h = object;
      this.e = 0;
      rs1.u(this);
      return;
    } 
    rs1.v(true);
    try {
      os = ds1.e();
      object = wf2.m0(os, this.i);
      try {
        boolean bool;
        ds1.f(paramObject);
        wf2.X(os, object);
        do {
          bool = rs1.x();
        } while (bool);
        rs1.s(true);
      } finally {}
    } finally {}
    wf2.X(os, object);
    throw paramObject;
  }
  
  public final Object l() {
    Object object = this.h;
    this.h = ui0.b;
    return object;
  }
  
  public final void m() {
    do {
      j.getClass();
    } while (oi.a.getObjectVolatile(this, k) == ui0.c);
  }
  
  public final ni n() {
    f1 f1 = ui0.c;
    xz xz1 = this;
    label21: while (true) {
      j.getClass();
      Unsafe unsafe = oi.a;
      long l = k;
      Object object = unsafe.getObjectVolatile(xz1, l);
      if (object == null) {
        unsafe.putObjectVolatile(xz1, l, f1);
        return null;
      } 
      if (object instanceof ni) {
        while (true) {
          unsafe = oi.a;
          boolean bool = unsafe.compareAndSwapObject(xz1, k, object, f1);
          if (bool)
            return (ni)object; 
          if (unsafe.getObjectVolatile(xz1, l) != object)
            continue label21; 
        } 
        break;
      } 
      xz xz2 = xz1;
      xz1 = xz2;
      if (object != f1) {
        if (object instanceof Throwable) {
          xz1 = xz2;
          continue;
        } 
        tp.k("Inconsistent state ", object);
        return null;
      } 
    } 
  }
  
  public final ni o() {
    j.getClass();
    Object object = oi.a.getObjectVolatile(this, k);
    return (object instanceof ni) ? (ni)object : null;
  }
  
  public final boolean p() {
    j.getClass();
    return (oi.a.getObjectVolatile(this, k) != null);
  }
  
  public final boolean r(Throwable paramThrowable) {
    Throwable throwable = paramThrowable;
    xz xz1 = this;
    while (true) {
      Throwable throwable2;
      xz xz2;
      xz xz4;
      Throwable throwable3;
      j.getClass();
      Unsafe unsafe = oi.a;
      long l = k;
      Object object = unsafe.getObjectVolatile(xz1, l);
      f1 f1 = ui0.c;
      if (ui0.c(object, f1)) {
        Throwable throwable5 = throwable;
        xz4 = xz1;
        while (true) {
          object = oi.a;
          long l1 = k;
          throwable2 = throwable5;
          boolean bool = object.compareAndSwapObject(xz4, l1, f1, throwable2);
          if (bool)
            return true; 
          if (object.getObjectVolatile(xz4, l) != f1)
            break; 
          throwable5 = throwable2;
        } 
      } else {
        Throwable throwable5 = throwable2;
        xz2 = xz4;
        if (object instanceof Throwable)
          continue; 
        while (true) {
          Unsafe unsafe1 = oi.a;
          if (unsafe1.compareAndSwapObject(throwable5, k, object, null))
            return false; 
          if (unsafe1.getObjectVolatile(throwable5, l) != object) {
            throwable3 = throwable5;
            break;
          } 
        } 
      } 
      Throwable throwable4 = throwable3;
      xz xz3 = xz2;
      Throwable throwable1 = throwable4;
    } 
  }
  
  public final Throwable s(ni paramni) {
    ni ni1 = paramni;
    xz xz1 = this;
    label21: while (true) {
      j.getClass();
      Unsafe unsafe = oi.a;
      long l = k;
      Object object = unsafe.getObjectVolatile(xz1, l);
      f1 f1 = ui0.c;
      if (object == f1) {
        while (true) {
          object = oi.a;
          if (object.compareAndSwapObject(xz1, k, f1, ni1))
            return null; 
          if (object.getObjectVolatile(xz1, l) != f1)
            continue label21; 
        } 
        break;
      } 
      if (object instanceof Throwable) {
        while (true) {
          Unsafe unsafe1 = oi.a;
          if (unsafe1.compareAndSwapObject(xz1, k, object, null))
            return (Throwable)object; 
          if (unsafe1.getObjectVolatile(xz1, l) == object)
            continue; 
          l0.l("Failed requirement.");
          return null;
        } 
        break;
      } 
      tp.k("Inconsistent state ", object);
      return null;
    } 
  }
  
  public final String toString() {
    StringBuilder stringBuilder = new StringBuilder("DispatchedContinuation[");
    stringBuilder.append(this.f);
    stringBuilder.append(", ");
    stringBuilder.append(qv.f0(this.g));
    stringBuilder.append(']');
    return stringBuilder.toString();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\xz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
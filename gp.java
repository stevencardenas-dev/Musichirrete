import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

public abstract class gp {
  public static final AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(gp.class, Object.class, "_next$volatile");
  
  public static final AtomicReferenceFieldUpdater b;
  
  public static final long c;
  
  public static final long d;
  
  public volatile Object _next$volatile;
  
  public volatile Object _prev$volatile;
  
  static {
    Unsafe unsafe = oi.a;
    c = unsafe.objectFieldOffset(gp.class.getDeclaredField("_next$volatile"));
    b = AtomicReferenceFieldUpdater.newUpdater(gp.class, Object.class, "_prev$volatile");
    d = unsafe.objectFieldOffset(gp.class.getDeclaredField("_prev$volatile"));
  }
  
  public gp(ek1 paramek1) {
    this._prev$volatile = paramek1;
  }
  
  public final void a() {
    b.getClass();
    oi.a.putObjectVolatile(this, d, null);
  }
  
  public final gp b() {
    gp gp1;
    for (gp1 = e(); gp1 != null && gp1.f(); gp1 = (gp)oi.a.getObjectVolatile(gp1, d))
      b.getClass(); 
    return gp1;
  }
  
  public final gp c() {
    Object object = d();
    return (object == zo2.b) ? null : (gp)object;
  }
  
  public final Object d() {
    a.getClass();
    return oi.a.getObjectVolatile(this, c);
  }
  
  public final gp e() {
    b.getClass();
    return (gp)oi.a.getObjectVolatile(this, d);
  }
  
  public abstract boolean f();
  
  public final boolean g() {
    f1 f1 = zo2.b;
    gp gp1 = this;
    while (true) {
      a.getClass();
      Unsafe unsafe = oi.a;
      long l = c;
      if (unsafe.compareAndSwapObject(gp1, l, null, f1))
        return true; 
      if (unsafe.getObjectVolatile(gp1, l) != null)
        return false; 
    } 
  }
  
  public final void h() {
    if (c() == null)
      return; 
    label30: while (true) {
      gp gp3;
      gp gp2 = b();
      gp gp1 = c();
      gp1.getClass();
      while (true) {
        gp3 = gp1;
        if (gp3.f()) {
          gp gp4 = gp3.c();
          gp1 = gp4;
          if (gp4 == null)
            break; 
          continue;
        } 
        break;
      } 
      label29: while (true) {
        gp gp4;
        b.getClass();
        Unsafe unsafe = oi.a;
        long l = d;
        Object object = unsafe.getObjectVolatile(gp3, l);
        if ((gp)object == null) {
          unsafe = null;
        } else {
          gp4 = gp2;
        } 
        while (true) {
          Unsafe unsafe1 = oi.a;
          if (unsafe1.compareAndSwapObject(gp3, d, object, gp4)) {
            if (gp2 != null) {
              a.getClass();
              unsafe1.putObjectVolatile(gp2, c, gp3);
            } 
            if (!gp3.f() || gp3.c() == null) {
              if (gp2 == null || !gp2.f())
                return; 
              continue label30;
            } 
            continue label30;
          } 
          if (unsafe1.getObjectVolatile(gp3, l) != object)
            continue label29; 
        } 
        break;
      } 
      break;
    } 
  }
  
  public final boolean i(ek1 paramek1) {
    gp gp1 = this;
    while (true) {
      a.getClass();
      Unsafe unsafe = oi.a;
      long l = c;
      if (unsafe.compareAndSwapObject(gp1, l, null, paramek1))
        return true; 
      if (unsafe.getObjectVolatile(gp1, l) != null)
        return false; 
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\gp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

public class yo0 {
  public static final AtomicReferenceFieldUpdater b = AtomicReferenceFieldUpdater.newUpdater(yo0.class, Object.class, "_next$volatile");
  
  public static final AtomicReferenceFieldUpdater c;
  
  public static final AtomicReferenceFieldUpdater e;
  
  public static final long f;
  
  public static final long g;
  
  public static final long h;
  
  public volatile Object _next$volatile = this;
  
  public volatile Object _prev$volatile = this;
  
  public volatile Object _removedRef$volatile;
  
  static {
    Unsafe unsafe = oi.a;
    f = unsafe.objectFieldOffset(yo0.class.getDeclaredField("_next$volatile"));
    c = AtomicReferenceFieldUpdater.newUpdater(yo0.class, Object.class, "_prev$volatile");
    g = unsafe.objectFieldOffset(yo0.class.getDeclaredField("_prev$volatile"));
    e = AtomicReferenceFieldUpdater.newUpdater(yo0.class, Object.class, "_removedRef$volatile");
    h = unsafe.objectFieldOffset(yo0.class.getDeclaredField("_removedRef$volatile"));
  }
  
  public static yo0 i(yo0 paramyo0) {
    while (true) {
      if (!paramyo0.n())
        return paramyo0; 
      c.getClass();
      paramyo0 = (yo0)oi.a.getObjectVolatile(paramyo0, g);
    } 
  }
  
  public final boolean e(yo0 paramyo0, int paramInt) {
    yo0 yo01;
    do {
      yo01 = m();
      if (yo01 instanceof un0) {
        if ((((un0)yo01).i & paramInt) == 0 && yo01.e(paramyo0, paramInt))
          break; 
        return false;
      } 
    } while (!yo01.f(paramyo0, this));
    return true;
  }
  
  public final boolean f(yo0 paramyo01, yo0 paramyo02) {
    c.getClass();
    Unsafe unsafe = oi.a;
    unsafe.putObjectVolatile(paramyo01, g, this);
    b.getClass();
    long l = f;
    unsafe.putObjectVolatile(paramyo01, l, paramyo02);
    yo0 yo01 = paramyo01;
    paramyo01 = this;
    while (true) {
      Unsafe unsafe1 = oi.a;
      if (unsafe1.compareAndSwapObject(paramyo01, f, paramyo02, yo01)) {
        yo01.j(paramyo02);
        return true;
      } 
      if (unsafe1.getObjectVolatile(paramyo01, l) != paramyo02)
        return false; 
    } 
  }
  
  public final void g(f21 paramf21) {
    c.getClass();
    Unsafe unsafe = oi.a;
    unsafe.putObjectVolatile(paramf21, g, this);
    b.getClass();
    long l = f;
    unsafe.putObjectVolatile(paramf21, l, this);
    yo0 yo01 = this;
    while (true) {
      yo0 yo02 = yo01;
      if (yo01.k() != yo01)
        return; 
      while (true) {
        Unsafe unsafe1 = oi.a;
        if (unsafe1.compareAndSwapObject(yo02, f, yo02, paramf21)) {
          paramf21.j(yo02);
          return;
        } 
        if (unsafe1.getObjectVolatile(yo02, l) != yo02)
          yo0 yo03 = yo02; 
      } 
      break;
    } 
  }
  
  public final yo0 h() {
    yo0 yo01 = this;
    label42: while (true) {
      c.getClass();
      Unsafe unsafe = oi.a;
      long l = g;
      yo0 yo03 = (yo0)unsafe.getObjectVolatile(yo01, l);
      yo0 yo04 = null;
      yo0 yo02 = yo03;
      label40: while (true) {
        b.getClass();
        if (yo02 != null) {
          Unsafe unsafe1 = oi.a;
          long l1 = f;
          Object object3 = unsafe1.getObjectVolatile(yo02, l1);
          if (object3 == yo01) {
            yo04 = yo03;
            if (yo03 == yo02)
              continue; 
            while (true) {
              Unsafe unsafe2 = oi.a;
              boolean bool = unsafe2.compareAndSwapObject(yo01, g, yo04, yo02);
              if (bool)
                return yo02; 
              if (unsafe2.getObjectVolatile(yo01, l) != yo04)
                continue label42; 
            } 
            break;
          } 
          if (yo01.n())
            return null; 
          if (object3 instanceof of1) {
            yo0 yo05;
            if (yo04 != null) {
              yo05 = ((of1)object3).a;
              while (true) {
                Unsafe unsafe2 = oi.a;
                boolean bool = unsafe2.compareAndSwapObject(yo04, f, yo02, yo05);
                object3 = yo02;
                if (bool) {
                  yo02 = yo04;
                  yo04 = null;
                  continue label40;
                } 
                object1 = object3;
                if (unsafe2.getObjectVolatile(yo04, l1) != object3)
                  continue label42; 
              } 
              break;
            } 
            if (object1 != null) {
              object1 = yo05.getObjectVolatile(object1, l);
              continue;
            } 
            tp.b();
            return null;
          } 
          object3.getClass();
          object3 = object3;
          Object object2 = object1;
          Object object1 = object3;
          continue;
        } 
        tp.b();
        return null;
      } 
      break;
    } 
  }
  
  public final void j(yo0 paramyo0) {
    yo0 yo02 = paramyo0;
    yo0 yo01 = this;
    label28: while (true) {
      c.getClass();
      if (yo02 != null) {
        Unsafe unsafe = oi.a;
        long l = g;
        yo0 yo05 = (yo0)unsafe.getObjectVolatile(yo02, l);
        yo0 yo03 = yo01;
        yo0 yo04 = yo02;
        if (yo01.k() != yo02)
          continue; 
        while (yo04 != null) {
          Unsafe unsafe1 = oi.a;
          if (unsafe1.compareAndSwapObject(yo04, g, yo05, yo03)) {
            if (yo03.n())
              yo04.h(); 
            return;
          } 
          if (yo04 != null) {
            Object object = unsafe1.getObjectVolatile(yo04, l);
            yo02 = yo04;
            if (object != yo05) {
              object = yo03;
              continue label28;
            } 
            yo04 = yo02;
            continue;
          } 
          tp.b();
          return;
        } 
        tp.b();
        return;
      } 
      tp.b();
      return;
    } 
  }
  
  public final Object k() {
    b.getClass();
    return oi.a.getObjectVolatile(this, f);
  }
  
  public final yo0 l() {
    Object object;
    Object object1 = k();
    if (object1 instanceof of1) {
      object = object1;
    } else {
      object = null;
    } 
    if (object != null)
      return ((of1)object).a; 
    object1.getClass();
    return (yo0)object1;
  }
  
  public final yo0 m() {
    yo0 yo01 = h();
    if (yo01 == null) {
      c.getClass();
      return i((yo0)oi.a.getObjectVolatile(this, g));
    } 
    return yo01;
  }
  
  public boolean n() {
    return k() instanceof of1;
  }
  
  public final yo0 o() {
    yo0 yo01 = this;
    label16: while (true) {
      Object object = yo01.k();
      if (object instanceof of1)
        return ((of1)object).a; 
      if (object == yo01)
        return (yo0)object; 
      object.getClass();
      yo0 yo02 = (yo0)object;
      of1 of1 = yo02.p();
      while (true) {
        b.getClass();
        Unsafe unsafe = oi.a;
        long l = f;
        if (unsafe.compareAndSwapObject(yo01, l, object, of1)) {
          yo02.h();
          return null;
        } 
        if (unsafe.getObjectVolatile(yo01, l) != object)
          continue label16; 
      } 
      break;
    } 
  }
  
  public final of1 p() {
    e.getClass();
    Unsafe unsafe = oi.a;
    long l = h;
    of1 of12 = (of1)unsafe.getObjectVolatile(this, l);
    of1 of11 = of12;
    if (of12 == null) {
      of11 = new of1(this);
      unsafe.putObjectVolatile(this, l, of11);
    } 
    return of11;
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(new xo0(this, qv.class, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;", 1));
    stringBuilder.append('@');
    stringBuilder.append(qv.s(this));
    return stringBuilder.toString();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\yo0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
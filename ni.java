import androidx.recyclerview.widget.dVrV.jLnXOLx;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import org.jaudiotagger.tag.id3.tT.hrSTyFuSIm;
import sun.misc.Unsafe;

public class ni extends zz implements li, zs, e52 {
  public static final AtomicIntegerFieldUpdater h = AtomicIntegerFieldUpdater.newUpdater(ni.class, jLnXOLx.brmwYq);
  
  public static final AtomicReferenceFieldUpdater i = AtomicReferenceFieldUpdater.newUpdater(ni.class, Object.class, "_state$volatile");
  
  public static final AtomicReferenceFieldUpdater j;
  
  public static final long k;
  
  public static final long l;
  
  public volatile int _decisionAndIndex$volatile;
  
  public volatile Object _parentHandle$volatile;
  
  public volatile Object _state$volatile;
  
  public final cs f;
  
  public final os g;
  
  static {
    Unsafe unsafe = oi.a;
    l = unsafe.objectFieldOffset(ni.class.getDeclaredField("_state$volatile"));
    j = AtomicReferenceFieldUpdater.newUpdater(ni.class, Object.class, "_parentHandle$volatile");
    k = unsafe.objectFieldOffset(ni.class.getDeclaredField("_parentHandle$volatile"));
  }
  
  public ni(int paramInt, cs paramcs) {
    super(paramInt);
    this.f = paramcs;
    this.g = paramcs.e();
    this._decisionAndIndex$volatile = 536870911;
    this._state$volatile = z1.a;
  }
  
  public static void C(Object paramObject1, Object paramObject2) {
    StringBuilder stringBuilder = new StringBuilder("It's prohibited to register multiple handlers, tried to register ");
    stringBuilder.append(paramObject1);
    stringBuilder.append(hrSTyFuSIm.JctKWUCnD);
    stringBuilder.append(paramObject2);
    throw new IllegalStateException(stringBuilder.toString().toString());
  }
  
  public static Object I(i21 parami21, Object paramObject, int paramInt, bd0 parambd0) {
    if (paramObject instanceof bo)
      return paramObject; 
    if (paramInt == 1 || paramInt == 2) {
      if (parambd0 == null && !(parami21 instanceof gi))
        return paramObject; 
      if (parami21 instanceof gi) {
        parami21 = parami21;
      } else {
        parami21 = null;
      } 
      return new zn(paramObject, (gi)parami21, parambd0, null, 16);
    } 
    return paramObject;
  }
  
  public final void A(i21 parami21) {
    Object object;
    ni ni1 = this;
    label56: while (true) {
      i.getClass();
      Unsafe unsafe = oi.a;
      long l = l;
      object = unsafe.getObjectVolatile(ni1, l);
      if (object instanceof z1) {
        while (true) {
          unsafe = oi.a;
          long l1 = l;
          if (unsafe.compareAndSwapObject(ni1, l1, object, parami21))
            break; 
          if (unsafe.getObjectVolatile(ni1, l) != object)
            continue label56; 
        } 
        continue;
      } 
      if (!(object instanceof gi) && !(object instanceof ek1)) {
        if (object instanceof bo) {
          bo bo = (bo)object;
          if (bo.b.compareAndSet(bo, 0, 1)) {
            if (object instanceof pi) {
              Throwable throwable = bo.a;
              if (parami21 instanceof gi) {
                ni1.m((gi)parami21, throwable);
                return;
              } 
              parami21.getClass();
              ni1.o((ek1)parami21, throwable);
              return;
            } 
            continue;
          } 
          C(parami21, object);
          throw null;
        } 
        if (object instanceof zn) {
          zn zn1 = (zn)object;
          if (zn1.b == null) {
            if (parami21 instanceof ek1)
              return; 
            parami21.getClass();
            gi gi = (gi)parami21;
            Throwable throwable = zn1.e;
            if (throwable != null) {
              ni1.m(gi, throwable);
              return;
            } 
            zn1 = zn.a(zn1, gi, null, 29);
            while (true) {
              Unsafe unsafe1 = oi.a;
              if (unsafe1.compareAndSwapObject(ni1, l, object, zn1))
                break; 
              Object object1 = unsafe1.getObjectVolatile(ni1, l);
              ni ni2 = ni1;
              ni1 = ni2;
              if (object1 != object)
                ni1 = ni2; 
            } 
            continue;
          } 
          C(parami21, object);
          throw null;
        } 
        if (parami21 instanceof ek1)
          return; 
        parami21.getClass();
        zn zn = new zn(object, (gi)parami21, null, null, 28);
        while (true) {
          Unsafe unsafe1 = oi.a;
          long l1 = l;
          boolean bool = unsafe1.compareAndSwapObject(ni1, l1, object, zn);
          if (bool)
            return; 
          if (unsafe1.getObjectVolatile(ni1, l) != object)
            continue label56; 
        } 
      } 
      break;
    } 
    C(parami21, object);
    throw null;
  }
  
  public final boolean B() {
    return (this.e == 2 && ((xz)this.f).p());
  }
  
  public String D() {
    return "CancellableContinuation";
  }
  
  public final void E() {
    cs cs1 = this.f;
    if (cs1 instanceof xz) {
      cs1 = cs1;
    } else {
      cs1 = null;
    } 
    if (cs1 != null) {
      Throwable throwable = cs1.s(this);
      if (throwable != null) {
        r();
        p(throwable);
      } 
    } 
  }
  
  public final boolean F() {
    i.getClass();
    Unsafe unsafe = oi.a;
    long l = l;
    Object object = unsafe.getObjectVolatile(this, l);
    if (object instanceof zn && ((zn)object).d != null) {
      r();
      return false;
    } 
    h.set(this, 536870911);
    unsafe.putObjectVolatile(this, l, z1.a);
    return true;
  }
  
  public final void G(Object paramObject, int paramInt, bd0 parambd0) {
    ni ni1 = this;
    label24: while (true) {
      i.getClass();
      Unsafe unsafe = oi.a;
      long l = l;
      Object object = unsafe.getObjectVolatile(ni1, l);
      if (object instanceof i21) {
        Object object1 = I((i21)object, paramObject, paramInt, parambd0);
        while (true) {
          Unsafe unsafe1 = oi.a;
          if (unsafe1.compareAndSwapObject(ni1, l, object, object1)) {
            if (!ni1.B())
              ni1.r(); 
            ni1.s(paramInt);
            return;
          } 
          if (unsafe1.getObjectVolatile(ni1, l) != object)
            continue label24; 
        } 
        break;
      } 
      if (object instanceof pi) {
        pi pi = (pi)object;
        if (pi.c.compareAndSet(pi, 0, 1)) {
          if (parambd0 != null)
            ni1.n(parambd0, pi.a, paramObject); 
          return;
        } 
      } 
      tp.k("Already resumed, but proposed with update ", paramObject);
      return;
    } 
  }
  
  public final void H(rs paramrs) {
    int i;
    cs cs1 = this.f;
    if (cs1 instanceof xz) {
      cs1 = cs1;
    } else {
      cs1 = null;
    } 
    if (cs1 != null) {
      rs rs1 = ((xz)cs1).f;
    } else {
      cs1 = null;
    } 
    if (cs1 == paramrs) {
      i = 4;
    } else {
      i = this.e;
    } 
    G(l02.a, i, null);
  }
  
  public final f1 J(Object paramObject, bd0 parambd0) {
    f1 f1 = m92.b;
    ni ni1 = this;
    label16: while (true) {
      i.getClass();
      Unsafe unsafe = oi.a;
      long l = l;
      Object object = unsafe.getObjectVolatile(ni1, l);
      if (object instanceof i21) {
        Object object1 = I((i21)object, paramObject, ni1.e, parambd0);
        while (true) {
          Unsafe unsafe1 = oi.a;
          if (unsafe1.compareAndSwapObject(ni1, l, object, object1)) {
            if (!ni1.B())
              ni1.r(); 
            return f1;
          } 
          if (unsafe1.getObjectVolatile(ni1, l) != object)
            continue label16; 
        } 
        break;
      } 
      return null;
    } 
  }
  
  public final void a(ek1 paramek1, int paramInt) {
    while (true) {
      AtomicIntegerFieldUpdater<ni> atomicIntegerFieldUpdater = h;
      int i = atomicIntegerFieldUpdater.get(this);
      if ((i & 0x1FFFFFFF) == 536870911) {
        if (atomicIntegerFieldUpdater.compareAndSet(this, i, (i >> 29 << 29) + paramInt)) {
          A(paramek1);
          return;
        } 
        continue;
      } 
      tp.f("invokeOnCancellation should be called at most once");
      return;
    } 
  }
  
  public final void b(CancellationException paramCancellationException) {
    CancellationException cancellationException = paramCancellationException;
    ni ni1 = this;
    label37: while (true) {
      i.getClass();
      Unsafe unsafe = oi.a;
      long l = l;
      Object object = unsafe.getObjectVolatile(ni1, l);
      if (!(object instanceof i21)) {
        if (object instanceof bo)
          continue; 
        if (object instanceof zn) {
          zn zn1 = (zn)object;
          if (zn1.e == null) {
            zn zn2 = zn.a(zn1, null, cancellationException, 15);
            while (true) {
              Unsafe unsafe1 = oi.a;
              if (unsafe1.compareAndSwapObject(ni1, l, object, zn2)) {
                object = zn1.b;
                if (object != null)
                  ni1.m((gi)object, cancellationException); 
                object = zn1.c;
                if (object != null) {
                  ni1.n((bd0)object, cancellationException, zn1.a);
                  return;
                } 
                break;
              } 
              if (unsafe1.getObjectVolatile(ni1, l) != object)
                continue label37; 
            } 
            continue;
          } 
          tp.f("Must be called at most once");
          return;
        } 
        zn zn = new zn(object, null, null, cancellationException, 14);
        while (true) {
          Unsafe unsafe1 = oi.a;
          long l1 = l;
          boolean bool = unsafe1.compareAndSwapObject(ni1, l1, object, zn);
          if (bool)
            return; 
          if (unsafe1.getObjectVolatile(ni1, l) != object)
            continue label37; 
        } 
        break;
      } 
      tp.f("Not completed");
      return;
    } 
  }
  
  public final cs c() {
    return this.f;
  }
  
  public final zs d() {
    cs cs1 = this.f;
    return (cs1 instanceof zs) ? (zs)cs1 : null;
  }
  
  public final os e() {
    return this.g;
  }
  
  public final void f(Object paramObject) {
    Throwable throwable = rg1.a(paramObject);
    if (throwable != null)
      paramObject = new bo(throwable, false); 
    G(paramObject, this.e, null);
  }
  
  public final Throwable g(Object paramObject) {
    paramObject = super.g(paramObject);
    return (Throwable)((paramObject != null) ? paramObject : null);
  }
  
  public final Object h(Object paramObject) {
    return (paramObject instanceof zn) ? ((zn)paramObject).a : paramObject;
  }
  
  public final void i(Object paramObject, bd0 parambd0) {
    G(paramObject, this.e, parambd0);
  }
  
  public final f1 j(Object paramObject, bd0 parambd0) {
    return J(paramObject, parambd0);
  }
  
  public final Object l() {
    return w();
  }
  
  public final void m(gi paramgi, Throwable paramThrowable) {
    try {
      return;
    } finally {
      paramThrowable = null;
      StringBuilder stringBuilder = new StringBuilder("Exception in invokeOnCancellation handler for ");
      stringBuilder.append(this);
      RuntimeException runtimeException = new RuntimeException(stringBuilder.toString(), paramThrowable);
      m92.G(this.g, runtimeException);
    } 
  }
  
  public final void n(bd0 parambd0, Throwable paramThrowable, Object paramObject) {
    os os1 = this.g;
    try {
      return;
    } finally {
      parambd0 = null;
      StringBuilder stringBuilder = new StringBuilder("Exception in resume onCancellation handler for ");
      stringBuilder.append(this);
      m92.G(os1, new RuntimeException(stringBuilder.toString(), (Throwable)parambd0));
    } 
  }
  
  public final void o(ek1 paramek1, Throwable paramThrowable) {
    os os1 = this.g;
    int i = h.get(this) & 0x1FFFFFFF;
    if (i != 536870911)
      try {
        return;
      } finally {
        Exception exception = null;
        StringBuilder stringBuilder = new StringBuilder("Exception in invokeOnCancellation handler for ");
        stringBuilder.append(this);
        m92.G(os1, new RuntimeException(stringBuilder.toString(), exception));
      }  
    tp.f("The index for Segment.onCancellation(..) is broken");
  }
  
  public final boolean p(Throwable paramThrowable) {
    ni ni1 = this;
    label25: while (true) {
      i.getClass();
      Unsafe unsafe = oi.a;
      long l = l;
      Object object = unsafe.getObjectVolatile(ni1, l);
      boolean bool1 = object instanceof i21;
      boolean bool = false;
      if (!bool1)
        return false; 
      if (object instanceof gi || object instanceof ek1)
        bool = true; 
      pi pi = new pi(ni1, paramThrowable, bool);
      while (true) {
        Unsafe unsafe1 = oi.a;
        if (unsafe1.compareAndSwapObject(ni1, l, object, pi)) {
          i21 i21 = (i21)object;
          if (i21 instanceof gi) {
            ni1.m((gi)object, paramThrowable);
          } else if (i21 instanceof ek1) {
            ni1.o((ek1)object, paramThrowable);
          } 
          if (!ni1.B())
            ni1.r(); 
          ni1.s(ni1.e);
          return true;
        } 
        if (unsafe1.getObjectVolatile(ni1, l) != object)
          continue label25; 
      } 
      break;
    } 
  }
  
  public final void q(Object paramObject) {
    s(this.e);
  }
  
  public final void r() {
    k00 k00 = u();
    if (k00 == null)
      return; 
    k00.b();
    j.getClass();
    oi.a.putObjectVolatile(this, k, g21.b);
  }
  
  public final void s(int paramInt) {
    int i;
    do {
      AtomicIntegerFieldUpdater<ni> atomicIntegerFieldUpdater = h;
      i = atomicIntegerFieldUpdater.get(this);
      int j = i >> 29;
      if (j != 0) {
        if (j == 1) {
          boolean bool;
          i = 0;
          if (paramInt == 4) {
            bool = true;
          } else {
            bool = false;
          } 
          cs cs1 = this.f;
          if (!bool && cs1 instanceof xz) {
            if (paramInt == 1 || paramInt == 2) {
              paramInt = 1;
            } else {
              paramInt = 0;
            } 
            j = this.e;
            if (j == 1 || j == 2)
              i = 1; 
            if (paramInt == i) {
              xz xz = (xz)cs1;
              rs rs = xz.f;
              os os1 = xz.g.e();
              if (rs.q(os1)) {
                rs.m(os1, this);
                return;
              } 
              rs = mu1.a();
              if (((n50)rs).e >= 4294967296L) {
                rs.u(this);
                return;
              } 
              rs.v(true);
              try {
                qz1.M(this, cs1, true);
                do {
                  bool = rs.x();
                } while (bool);
              } finally {
                cs1 = null;
              } 
            } 
          } 
          qz1.M(this, cs1, bool);
          return;
        } 
        tp.f("Already resumed");
        return;
      } 
    } while (!SYNTHETIC_LOCAL_VARIABLE_5.compareAndSet(this, i, 1073741824 + (0x1FFFFFFF & i)));
  }
  
  public Throwable t(dk0 paramdk0) {
    return paramdk0.C();
  }
  
  public final String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(D());
    stringBuilder.append('(');
    stringBuilder.append(qv.f0(this.f));
    stringBuilder.append("){");
    Object object = w();
    if (object instanceof i21) {
      object = "Active";
    } else if (object instanceof pi) {
      object = "Cancelled";
    } else {
      object = "Completed";
    } 
    stringBuilder.append((String)object);
    stringBuilder.append("}@");
    stringBuilder.append(qv.s(this));
    return stringBuilder.toString();
  }
  
  public final k00 u() {
    j.getClass();
    return (k00)oi.a.getObjectVolatile(this, k);
  }
  
  public final Object v() {
    boolean bool = B();
    while (true) {
      CancellationException cancellationException;
      AtomicIntegerFieldUpdater<ni> atomicIntegerFieldUpdater = h;
      int i = atomicIntegerFieldUpdater.get(this);
      int j = i >> 29;
      if (j != 0) {
        if (j == 2) {
          if (bool)
            E(); 
          Object object = w();
          if (!(object instanceof bo)) {
            i = this.e;
            if (i == 1 || i == 2) {
              vj0 vj0 = (vj0)this.g.l(vs2.g);
              if (vj0 != null && !vj0.a()) {
                cancellationException = ((dk0)vj0).C();
                b(cancellationException);
                throw cancellationException;
              } 
            } 
            return h(object);
          } 
          throw ((bo)object).a;
        } 
        tp.f("Already suspended");
        return null;
      } 
      if (cancellationException.compareAndSet(this, i, 536870912 + (0x1FFFFFFF & i))) {
        if (u() == null)
          y(); 
        if (bool)
          E(); 
        return ys.b;
      } 
    } 
  }
  
  public final Object w() {
    i.getClass();
    return oi.a.getObjectVolatile(this, l);
  }
  
  public final void x() {
    k00 k00 = y();
    if (k00 != null && !(w() instanceof i21)) {
      k00.b();
      j.getClass();
      oi.a.putObjectVolatile(this, k, g21.b);
    } 
  }
  
  public final k00 y() {
    long l;
    Unsafe unsafe;
    vj0 vj0 = (vj0)this.g.l(vs2.g);
    if (vj0 == null)
      return null; 
    k00 k00 = g92.M(vj0, true, new pk(this));
    ni ni1 = this;
    do {
      j.getClass();
      unsafe = oi.a;
      l = k;
    } while (!unsafe.compareAndSwapObject(ni1, l, null, k00) && unsafe.getObjectVolatile(ni1, l) == null);
    return k00;
  }
  
  public final void z(wc0 paramwc0) {
    A(new gi(1, paramwc0));
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\ni.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
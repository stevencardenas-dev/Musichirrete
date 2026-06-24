import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import sun.misc.Unsafe;

public abstract class s50 extends n50 implements vx {
  public static final AtomicReferenceFieldUpdater i = AtomicReferenceFieldUpdater.newUpdater(s50.class, Object.class, "_queue$volatile");
  
  public static final AtomicReferenceFieldUpdater j;
  
  public static final AtomicIntegerFieldUpdater k;
  
  public static final long l;
  
  public static final long m;
  
  public volatile Object _delayed$volatile;
  
  public volatile int _isCompleted$volatile = 0;
  
  public volatile Object _queue$volatile;
  
  static {
    Unsafe unsafe = oi.a;
    m = unsafe.objectFieldOffset(s50.class.getDeclaredField("_queue$volatile"));
    j = AtomicReferenceFieldUpdater.newUpdater(s50.class, Object.class, "_delayed$volatile");
    l = unsafe.objectFieldOffset(s50.class.getDeclaredField("_delayed$volatile"));
    k = AtomicIntegerFieldUpdater.newUpdater(s50.class, "_isCompleted$volatile");
  }
  
  public void A(Runnable paramRunnable) {
    B();
    if (C(paramRunnable)) {
      paramRunnable = E();
      if (Thread.currentThread() != paramRunnable)
        LockSupport.unpark((Thread)paramRunnable); 
      return;
    } 
    cw.n.A(paramRunnable);
  }
  
  public final void B() {
    j.getClass();
    r50 r50 = (r50)oi.a.getObjectVolatile(this, l);
    if (r50 != null) {
      Exception exception;
      if (ou1.b.get(r50) == 0)
        return; 
      long l = System.nanoTime();
      /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{r50}, name=null} */
      do {
        try {
          q50[] arrayOfQ501 = r50.a;
          q50[] arrayOfQ503 = null;
          q50[] arrayOfQ502 = null;
          if (arrayOfQ501 != null) {
            q50 q50 = arrayOfQ501[0];
          } else {
            arrayOfQ501 = null;
          } 
          if (arrayOfQ501 == null) {
            /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{r50}, name=null} */
            arrayOfQ501 = arrayOfQ503;
          } else {
            boolean bool;
            if (l - ((q50)arrayOfQ501).b >= 0L) {
              bool = C((Runnable)arrayOfQ501);
            } else {
              bool = false;
            } 
            arrayOfQ501 = arrayOfQ502;
            if (bool)
              q50 q50 = r50.b(0); 
            /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{r50}, name=null} */
          } 
        } finally {}
      } while (exception != null);
    } 
  }
  
  public final boolean C(Runnable paramRunnable) {
    Runnable runnable = paramRunnable;
    s50 s501 = this;
    while (true) {
      Runnable runnable2;
      s50 s502;
      s50 s504;
      Runnable runnable3;
      i.getClass();
      Unsafe unsafe = oi.a;
      long l = m;
      Object object = unsafe.getObjectVolatile(s501, l);
      if (k.get(s501) != 0)
        return false; 
      if (object == null) {
        Runnable runnable5 = runnable;
        s504 = s501;
        while (true) {
          object = oi.a;
          long l1 = m;
          runnable2 = runnable5;
          boolean bool = object.compareAndSwapObject(s504, l1, null, runnable2);
          if (!bool) {
            if (object.getObjectVolatile(s504, l) != null)
              break; 
            runnable5 = runnable2;
            continue;
          } 
          return true;
        } 
      } else {
        Runnable runnable5 = runnable2;
        s502 = s504;
        if (object instanceof bp0) {
          bp0 bp0 = (bp0)object;
          int i = bp0.a(s502);
          if (i != 0) {
            if (i != 1) {
              if (i != 2) {
                runnable3 = runnable5;
              } else {
                return false;
              } 
            } else {
              bp0 bp01 = runnable3.d();
              while (true) {
                Unsafe unsafe1 = oi.a;
                if (unsafe1.compareAndSwapObject(runnable5, m, object, bp01)) {
                  Runnable runnable6 = runnable5;
                  break;
                } 
                if (unsafe1.getObjectVolatile(runnable5, l) != object) {
                  Runnable runnable6 = runnable5;
                  break;
                } 
              } 
            } 
          } else {
            continue;
          } 
        } else {
          if (object == dd1.e)
            return false; 
          bp0 bp0 = new bp0(8, true);
          bp0.a(object);
          bp0.a(s502);
          while (true) {
            Unsafe unsafe1 = oi.a;
            if (!unsafe1.compareAndSwapObject(runnable5, m, object, bp0)) {
              if (unsafe1.getObjectVolatile(runnable5, l) != object) {
                runnable3 = runnable5;
                break;
              } 
              continue;
            } 
            return true;
          } 
        } 
      } 
      Runnable runnable4 = runnable3;
      s50 s503 = s502;
      Runnable runnable1 = runnable4;
    } 
  }
  
  public final long D() {
    long l;
    v8 v8 = this.g;
    if (v8 == null || v8.isEmpty()) {
      l = Long.MAX_VALUE;
    } else {
      l = 0L;
    } 
    if (l != 0L) {
      i.getClass();
      Unsafe unsafe = oi.a;
      Object object = unsafe.getObjectVolatile(this, m);
      if (object != null)
        if (object instanceof bp0) {
          object = object;
          l = bp0.f.get(object);
          if ((int)(0x3FFFFFFFL & l) != (int)((l & 0xFFFFFFFC0000000L) >> 30L))
            return 0L; 
        } else {
          return (object == dd1.e) ? Long.MAX_VALUE : 0L;
        }  
      j.getClass();
      object = unsafe.getObjectVolatile(this, l);
      /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
      if (object != null) {
        try {
          q50[] arrayOfQ50 = ((ou1)object).a;
          if (arrayOfQ50 != null) {
            q50 q50 = arrayOfQ50[0];
          } else {
            arrayOfQ50 = null;
          } 
        } finally {}
        /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
        if (unsafe == null)
          return Long.MAX_VALUE; 
        l = ((q50)unsafe).b - System.nanoTime();
        return (l >= 0L) ? l : 0L;
      } 
      return Long.MAX_VALUE;
    } 
    return 0L;
  }
  
  public abstract Thread E();
  
  public final boolean F() {
    boolean bool;
    v8 v8 = this.g;
    if (v8 != null) {
      bool = v8.isEmpty();
    } else {
      bool = true;
    } 
    if (bool) {
      j.getClass();
      Unsafe unsafe = oi.a;
      r50 r50 = (r50)unsafe.getObjectVolatile(this, l);
      if (r50 == null || ou1.b.get(r50) == 0) {
        i.getClass();
        Object object = unsafe.getObjectVolatile(this, m);
        if (object == null)
          return true; 
        if (object instanceof bp0) {
          object = object;
          long l = bp0.f.get(object);
          return ((int)(0x3FFFFFFFL & l) == (int)((l & 0xFFFFFFFC0000000L) >> 30L));
        } 
        return (object == dd1.e);
      } 
      return false;
    } 
    return false;
  }
  
  public void G(long paramLong, q50 paramq50) {
    cw.n.K(paramLong, paramq50);
  }
  
  public final void H() {
    long l = System.nanoTime();
    while (true) {
      j.getClass();
      r50 r50 = (r50)oi.a.getObjectVolatile(this, l);
      /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{r50}, name=null} */
      if (r50 != null) {
        Exception exception;
        try {
          if (ou1.b.get(r50) > 0) {
            q50 q50 = r50.b(0);
          } else {
            exception = null;
          } 
        } finally {}
        /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{r50}, name=null} */
        if (exception == null)
          break; 
        G(l, (q50)exception);
        continue;
      } 
      break;
    } 
  }
  
  public final void J() {
    i.getClass();
    Unsafe unsafe = oi.a;
    unsafe.putObjectVolatile(this, m, null);
    j.getClass();
    unsafe.putObjectVolatile(this, l, null);
  }
  
  public final void K(long paramLong, q50 paramq50) {
    int i = N(paramLong, paramq50);
    if (i != 0) {
      if (i != 1) {
        if (i != 2) {
          tp.f("unexpected result");
          return;
        } 
      } else {
        G(paramLong, paramq50);
        return;
      } 
    } else if (P(paramq50)) {
      Thread thread = E();
      if (Thread.currentThread() != thread)
        LockSupport.unpark(thread); 
    } 
  }
  
  public final int N(long paramLong, q50 paramq50) {
    s50 s501;
    if (k.get(this) != 0)
      return 1; 
    j.getClass();
    Unsafe unsafe = oi.a;
    long l = l;
    Object object = unsafe.getObjectVolatile(this, l);
    if (object == null) {
      long l1;
      Unsafe unsafe1;
      object = new Object();
      ((r50)object).c = paramLong;
      s501 = this;
      do {
        unsafe1 = oi.a;
        l1 = l;
      } while (!unsafe1.compareAndSwapObject(s501, l1, null, object) && unsafe1.getObjectVolatile(s501, l) == null);
      object = unsafe1.getObjectVolatile(s501, l);
      object.getClass();
      object = object;
    } else {
      s501 = this;
    } 
    return paramq50.a(paramLong, (r50)object, s501);
  }
  
  public final boolean P(q50 paramq50) {
    j.getClass();
    r50 r50 = (r50)oi.a.getObjectVolatile(this, l);
    q50 q501 = null;
    q50 q502 = null;
    /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{r50}, name=null} */
    if (r50 != null) {
      try {
        q50[] arrayOfQ50 = r50.a;
        q501 = q502;
        if (arrayOfQ50 != null)
          q501 = arrayOfQ50[0]; 
      } finally {}
      /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{r50}, name=null} */
    } 
    return (q501 == paramq50);
  }
  
  public k00 d(long paramLong, wu1 paramwu1, os paramos) {
    return dw.a.d(paramLong, paramwu1, paramos);
  }
  
  public final void g(long paramLong, ni paramni) {
    long l = 0L;
    if (paramLong <= 0L) {
      paramLong = l;
    } else if (paramLong >= 9223372036854L) {
      paramLong = Long.MAX_VALUE;
    } else {
      paramLong = 1000000L * paramLong;
    } 
    if (paramLong < 4611686018427387903L) {
      l = System.nanoTime();
      o50 o50 = new o50(this, paramLong + l, paramni);
      K(l, o50);
      paramni.A(new gi(2, o50));
    } 
  }
  
  public final void m(os paramos, Runnable paramRunnable) {
    A(paramRunnable);
  }
  
  public void shutdown() {
    mu1.a.set(null);
    k.set(this, 1);
    y();
    do {
    
    } while (w() <= 0L);
    H();
  }
  
  public final long w() {
    if (x())
      return 0L; 
    B();
    Runnable runnable = z();
    if (runnable != null) {
      runnable.run();
      return 0L;
    } 
    return D();
  }
  
  public final void y() {
    f1 f1 = dd1.e;
    s50 s501 = this;
    label25: while (true) {
      i.getClass();
      Unsafe unsafe = oi.a;
      long l = m;
      Object object = unsafe.getObjectVolatile(s501, l);
      if (object == null) {
        while (true) {
          object = oi.a;
          long l1 = m;
          if (object.compareAndSwapObject(s501, l1, null, f1))
            break; 
          if (object.getObjectVolatile(s501, l) != null)
            continue label25; 
        } 
        continue;
      } 
      if (object instanceof bp0) {
        ((bp0)object).c();
        return;
      } 
      if (object == f1)
        continue; 
      bp0 bp0 = new bp0(8, true);
      bp0.a(object);
      while (true) {
        Unsafe unsafe1 = oi.a;
        if (unsafe1.compareAndSwapObject(s501, m, object, bp0))
          return; 
        if (unsafe1.getObjectVolatile(s501, l) != object)
          continue label25; 
      } 
      break;
    } 
  }
  
  public final Runnable z() {
    s50 s501 = this;
    label28: while (true) {
      i.getClass();
      Unsafe unsafe = oi.a;
      long l = m;
      Object object = unsafe.getObjectVolatile(s501, l);
      if (object != null) {
        if (object instanceof bp0) {
          bp0 bp0 = (bp0)object;
          Object object1 = bp0.e();
          if (object1 != bp0.g)
            return (Runnable)object1; 
          object1 = bp0.d();
          while (true) {
            Unsafe unsafe1 = oi.a;
            long l1 = m;
            if (unsafe1.compareAndSwapObject(s501, l1, object, object1))
              continue label28; 
            if (unsafe1.getObjectVolatile(s501, l) != object)
              continue label28; 
          } 
          break;
        } 
        if (object != dd1.e) {
          while (true) {
            Unsafe unsafe1 = oi.a;
            if (unsafe1.compareAndSwapObject(s501, m, object, null))
              return (Runnable)object; 
            if (unsafe1.getObjectVolatile(s501, l) != object)
              continue label28; 
          } 
          break;
        } 
      } 
      return null;
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\s50.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;

public final class us extends Thread {
  public static final AtomicIntegerFieldUpdater k = AtomicIntegerFieldUpdater.newUpdater(us.class, "workerCtl$volatile");
  
  public final w72 b;
  
  public final me1 c;
  
  public vs e;
  
  public long f;
  
  public long g;
  
  public int h;
  
  public boolean i;
  
  public volatile int indexInArray;
  
  public final ws j;
  
  public volatile Object nextParkedWorker;
  
  public volatile int workerCtl$volatile;
  
  public us(ws paramws, int paramInt) {
    setDaemon(true);
    setContextClassLoader(ws.class.getClassLoader());
    this.b = new w72();
    this.c = (me1)new Object();
    this.e = vs.f;
    this.nextParkedWorker = ws.m;
    int i = (int)System.nanoTime();
    if (i == 0)
      i = 42; 
    this.h = i;
    f(paramInt);
  }
  
  public final mt1 a(boolean paramBoolean) {
    mt1 mt1;
    vs vs2 = this.e;
    ws ws1 = this.j;
    boolean bool = true;
    w72 w721 = this.b;
    vs vs1 = vs.b;
    if (vs2 != vs1) {
      AtomicLongFieldUpdater<ws> atomicLongFieldUpdater = ws.k;
      while (true) {
        mt1 mt11;
        long l = atomicLongFieldUpdater.get(ws1);
        if ((int)((0x7FFFFC0000000000L & l) >> 42L) == 0) {
          mt11 = w721.g();
          mt1 = mt11;
          if (mt11 == null) {
            mt11 = (mt1)ws1.h.d();
            mt1 = mt11;
            if (mt11 == null)
              return i(1); 
          } 
          return mt1;
        } 
        if (ws.k.compareAndSet(ws1, l, l - 4398046511104L)) {
          this.e = (vs)mt11;
          break;
        } 
      } 
    } 
    if (paramBoolean) {
      if (d(ws1.b * 2) != 0)
        bool = false; 
      if (bool) {
        mt1 mt11 = e();
        if (mt11 != null)
          return mt11; 
      } 
      mt1 = mt1.e();
      if (mt1 != null)
        return mt1; 
      if (!bool) {
        mt1 = e();
        if (mt1 != null)
          return mt1; 
      } 
    } else {
      mt1 = e();
      if (mt1 != null)
        return mt1; 
    } 
    return i(3);
  }
  
  public final int b() {
    return this.indexInArray;
  }
  
  public final Object c() {
    return this.nextParkedWorker;
  }
  
  public final int d(int paramInt) {
    int i = this.h;
    i ^= i << 13;
    i ^= i >> 17;
    int j = i ^ i << 5;
    this.h = j;
    i = paramInt - 1;
    return ((i & paramInt) == 0) ? (i & j) : ((Integer.MAX_VALUE & j) % paramInt);
  }
  
  public final mt1 e() {
    mt1 mt12;
    int i = d(2);
    ws ws1 = this.j;
    ge0 ge01 = ws1.h;
    ge0 ge02 = ws1.g;
    if (i == 0) {
      mt12 = (mt1)ge02.d();
      return (mt12 != null) ? mt12 : (mt1)ge01.d();
    } 
    mt1 mt11 = (mt1)ge01.d();
    return (mt11 != null) ? mt11 : (mt1)mt12.d();
  }
  
  public final void f(int paramInt) {
    String str;
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(this.j.f);
    stringBuilder.append("-worker-");
    if (paramInt == 0) {
      str = "TERMINATED";
    } else {
      str = String.valueOf(paramInt);
    } 
    stringBuilder.append(str);
    setName(stringBuilder.toString());
    this.indexInArray = paramInt;
  }
  
  public final void g(Object paramObject) {
    this.nextParkedWorker = paramObject;
  }
  
  public final boolean h(vs paramvs) {
    boolean bool;
    vs vs1 = this.e;
    if (vs1 == vs.b) {
      bool = true;
    } else {
      bool = false;
    } 
    if (bool)
      ws.k.addAndGet(this.j, 4398046511104L); 
    if (vs1 != paramvs)
      this.e = paramvs; 
    return bool;
  }
  
  public final mt1 i(int paramInt) {
    AtomicLongFieldUpdater<ws> atomicLongFieldUpdater = ws.k;
    ws ws1 = this.j;
    int j = (int)(atomicLongFieldUpdater.get(ws1) & 0x1FFFFFL);
    if (j < 2)
      return null; 
    int i = d(j);
    byte b = 0;
    long l;
    for (l = Long.MAX_VALUE; b < j; l = l1) {
      long l1;
      boolean bool = true;
      int k = i + 1;
      i = k;
      if (k > j)
        i = 1; 
      us us1 = (us)ws1.i.b(i);
      if (us1 != null && us1 != this) {
        long l2;
        mt1 mt1;
        w72 w721 = us1.b;
        if (paramInt == 3) {
          mt1 = w721.f();
        } else {
          w721.getClass();
          k = w72.d.get(w721);
          int m = w72.c.get(w721);
          if (paramInt != 1)
            bool = false; 
          while (true) {
            if (k == m || (bool && w72.e.get(w721) == 0)) {
              us1 = null;
              break;
            } 
            mt1 mt11 = w721.h(k, bool);
            mt1 = mt11;
            if (mt11 == null) {
              k++;
              continue;
            } 
            break;
          } 
        } 
        me1 me11 = this.c;
        if (mt1 != null) {
          me11.b = mt1;
          l2 = -1L;
        } else {
          l2 = w721.i(paramInt, me11);
        } 
        if (l2 == -1L) {
          mt1 = (mt1)me11.b;
          me11.b = null;
          return mt1;
        } 
        l1 = l;
        if (l2 > 0L)
          l1 = Math.min(l, l2); 
      } else {
        l1 = l;
      } 
      b++;
    } 
    if (l == Long.MAX_VALUE)
      l = 0L; 
    this.g = l;
    return null;
  }
  
  public final void run() {
    label103: while (true) {
      boolean bool = false;
      label97: while (true) {
        ws ws1 = this.j;
        if (ws.l.get(ws1) != 0)
          break; 
        vs vs2 = this.e;
        vs vs1 = vs.g;
        if (vs2 != vs1) {
          fg1 fg1;
          mt1 mt1 = a(this.i);
          if (mt1 != null) {
            Thread thread;
            this.g = 0L;
            ws ws2 = this.j;
            this.f = 0L;
            if (this.e == vs.e)
              this.e = vs.c; 
            if (mt1.c) {
              if (h(vs.c) && !ws2.k() && !ws2.h(ws.k.get(ws2)))
                ws2.k(); 
              try {
                mt1.run();
              } finally {
                Exception exception = null;
                thread = Thread.currentThread();
              } 
              ws.k.addAndGet(ws2, -2097152L);
              if (this.e != vs1) {
                this.e = vs.f;
                continue label103;
              } 
              continue label103;
            } 
            try {
              thread.run();
            } finally {
              vs1 = null;
              Thread thread1 = Thread.currentThread();
            } 
            continue label103;
          } 
          this.i = false;
          if (this.g != 0L) {
            if (!bool) {
              bool = true;
              continue;
            } 
            h(vs.e);
            Thread.interrupted();
            LockSupport.parkNanos(this.g);
            this.g = 0L;
            continue label103;
          } 
          Object object = this.nextParkedWorker;
          f1 f1 = ws.m;
          if (object != f1) {
            k.set(this, -1);
            while (this.nextParkedWorker != ws.m) {
              AtomicIntegerFieldUpdater<us> atomicIntegerFieldUpdater = k;
              if (atomicIntegerFieldUpdater.get(this) == -1) {
                object = this.j;
                AtomicIntegerFieldUpdater<Object> atomicIntegerFieldUpdater1 = ws.l;
                if (atomicIntegerFieldUpdater1.get(object) != 0)
                  break; 
                vs vs3 = this.e;
                object = vs.g;
                if (vs3 == object)
                  break; 
                h(vs.e);
                Thread.interrupted();
                if (this.f == 0L)
                  this.f = System.nanoTime() + this.j.e; 
                LockSupport.parkNanos(this.j.e);
                if (System.nanoTime() - this.f >= 0L) {
                  int i;
                  this.f = 0L;
                  ws ws2 = this.j;
                  fg1 = ws2.i;
                  /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{fg1}, name=null} */
                  try {
                    int j = atomicIntegerFieldUpdater1.get(ws2);
                    if (j != 0) {
                      j = 1;
                    } else {
                      j = 0;
                    } 
                    if (j != 0) {
                      /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{fg1}, name=null} */
                      continue;
                    } 
                    AtomicLongFieldUpdater<ws> atomicLongFieldUpdater1 = ws.k;
                    i = (int)(atomicLongFieldUpdater1.get(ws2) & 0x1FFFFFL);
                    j = ws2.b;
                    if (i <= j) {
                      /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{fg1}, name=null} */
                      continue;
                    } 
                    boolean bool1 = atomicIntegerFieldUpdater.compareAndSet(this, -1, 1);
                    if (!bool1) {
                      /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{fg1}, name=null} */
                      continue;
                    } 
                    j = this.indexInArray;
                    f(0);
                    ws2.g(this, j, 0);
                    i = (int)(atomicLongFieldUpdater1.getAndDecrement(ws2) & 0x1FFFFFL);
                    if (i != j) {
                      Object object1 = ws2.i.b(i);
                      object1.getClass();
                      object1 = object1;
                      ws2.i.c(j, (us)object1);
                      object1.f(j);
                      ws2.g((us)object1, i, j);
                    } 
                  } finally {}
                  ws2.i.c(i, null);
                  /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{fg1}, name=null} */
                  this.e = (vs)object;
                } 
              } 
            } 
            continue;
          } 
          object = this.j;
          if (this.nextParkedWorker != fg1)
            continue; 
          AtomicLongFieldUpdater<Object> atomicLongFieldUpdater = ws.j;
          while (true) {
            long l = atomicLongFieldUpdater.get(object);
            int j = (int)(l & 0x1FFFFFL);
            int i = this.indexInArray;
            this.nextParkedWorker = ((ws)object).i.b(j);
            if (ws.j.compareAndSet(object, l, l + 2097152L & 0xFFFFFFFFFFE00000L | i))
              continue label97; 
          } 
        } 
        break;
      } 
      break;
    } 
    h(vs.g);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar\\us.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
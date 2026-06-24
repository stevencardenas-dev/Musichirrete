import com.google.android.gms.common.api.internal.jEVH.KjdXPYm;
import com.pavelsikun.seekbarpreference.lu.FgdLmmRfTxSFKI;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;

public final class ws implements Executor, Closeable {
  public static final AtomicLongFieldUpdater j = AtomicLongFieldUpdater.newUpdater(ws.class, "parkedWorkersStack$volatile");
  
  public static final AtomicLongFieldUpdater k = AtomicLongFieldUpdater.newUpdater(ws.class, "controlState$volatile");
  
  public static final AtomicIntegerFieldUpdater l = AtomicIntegerFieldUpdater.newUpdater(ws.class, "_isTerminated$volatile");
  
  public static final f1 m = new f1("NOT_IN_STACK", 4);
  
  public volatile int _isTerminated$volatile;
  
  public final int b;
  
  public final int c;
  
  public volatile long controlState$volatile;
  
  public final long e;
  
  public final String f;
  
  public final ge0 g;
  
  public final ge0 h;
  
  public final fg1 i;
  
  public volatile long parkedWorkersStack$volatile;
  
  public ws(int paramInt1, int paramInt2, long paramLong, String paramString) {
    this.b = paramInt1;
    this.c = paramInt2;
    this.e = paramLong;
    this.f = paramString;
    if (paramInt1 >= 1) {
      if (paramInt2 >= paramInt1) {
        if (paramInt2 <= 2097150) {
          if (paramLong > 0L) {
            this.g = (ge0)new zo0();
            this.h = (ge0)new zo0();
            this.i = new fg1((paramInt1 + 1) * 2);
            this.controlState$volatile = paramInt1 << 42L;
            this._isTerminated$volatile = 0;
            return;
          } 
          StringBuilder stringBuilder = new StringBuilder("Idle worker keep alive time ");
          stringBuilder.append(paramLong);
          stringBuilder.append(" must be positive");
          throw new IllegalArgumentException(stringBuilder.toString().toString());
        } 
        k91.e(x41.i(paramInt2, "Max pool size ", FgdLmmRfTxSFKI.bdIQzqIZvloYPao));
        throw null;
      } 
      k91.e(ga1.j("Max pool size ", paramInt2, paramInt1, " should be greater than or equals to core pool size "));
      throw null;
    } 
    k91.e(x41.i(paramInt1, "Core pool size ", " should be at least 1"));
    throw null;
  }
  
  public final int a() {
    fg1 fg11 = this.i;
    /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{fg1}, name=null} */
    try {
      int i = l.get(this);
      if (i != 0) {
        i = 1;
      } else {
        i = 0;
      } 
      if (i != 0) {
        /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{fg1}, name=null} */
        return -1;
      } 
      AtomicLongFieldUpdater<ws> atomicLongFieldUpdater = k;
      long l = atomicLongFieldUpdater.get(this);
      int k = (int)(l & 0x1FFFFFL);
      int j = k - (int)((l & 0x3FFFFE00000L) >> 21L);
      i = j;
      if (j < 0)
        i = 0; 
      j = this.b;
      if (i >= j) {
        /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{fg1}, name=null} */
        return 0;
      } 
      j = this.c;
      if (k >= j) {
        /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{fg1}, name=null} */
        return 0;
      } 
      j = (int)(atomicLongFieldUpdater.get(this) & 0x1FFFFFL) + 1;
      if (j > 0 && this.i.b(j) == null) {
        us us = new us();
        this(this, j);
        this.i.c(j, us);
        l = atomicLongFieldUpdater.incrementAndGet(this);
        if (j == (int)(0x1FFFFFL & l)) {
          /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{fg1}, name=null} */
          us.start();
          return i + 1;
        } 
        IllegalArgumentException illegalArgumentException1 = new IllegalArgumentException();
        this("Failed requirement.");
        throw illegalArgumentException1;
      } 
    } finally {
      Exception exception;
    } 
    IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
    this("Failed requirement.");
    throw illegalArgumentException;
  }
  
  public final void c(Runnable paramRunnable, boolean paramBoolean1, boolean paramBoolean2) {
    qt1.f.getClass();
    long l = System.nanoTime();
    if (paramRunnable instanceof mt1) {
      paramRunnable = paramRunnable;
      ((mt1)paramRunnable).b = l;
      ((mt1)paramRunnable).c = paramBoolean1;
    } else {
      paramRunnable = new pt1(paramRunnable, l, paramBoolean1);
    } 
    boolean bool1 = ((mt1)paramRunnable).c;
    AtomicLongFieldUpdater<ws> atomicLongFieldUpdater = k;
    if (bool1) {
      l = atomicLongFieldUpdater.addAndGet(this, 2097152L);
    } else {
      l = 0L;
    } 
    Thread thread1 = Thread.currentThread();
    paramBoolean1 = thread1 instanceof us;
    Thread thread3 = null;
    if (paramBoolean1) {
      thread1 = thread1;
    } else {
      thread1 = null;
    } 
    Thread thread2 = thread3;
    if (thread1 != null)
      if (((us)thread1).j != this) {
        thread2 = thread3;
      } else {
        thread2 = thread1;
      }  
    boolean bool = true;
    if (thread2 != null) {
      vs vs = ((us)thread2).e;
      if (vs != vs.g && (((mt1)paramRunnable).c || vs != vs.c)) {
        ((us)thread2).i = true;
        paramRunnable = ((us)thread2).b.a((mt1)paramRunnable, paramBoolean2);
      } 
    } 
    if (paramRunnable != null) {
      if (((mt1)paramRunnable).c) {
        paramBoolean1 = this.h.a(paramRunnable);
      } else {
        paramBoolean1 = this.g.a(paramRunnable);
      } 
      if (!paramBoolean1)
        throw new RejectedExecutionException(x41.n(new StringBuilder(), this.f, " was terminated")); 
    } 
    if (!paramBoolean2 || thread2 == null)
      bool = false; 
    if (bool1) {
      if (!bool && !k() && !h(l)) {
        k();
        return;
      } 
    } else if (!bool && !k() && !h(atomicLongFieldUpdater.get(this))) {
      k();
      return;
    } 
  }
  
  public final void close() {
    // Byte code:
    //   0: getstatic ws.l : Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;
    //   3: aload_0
    //   4: iconst_0
    //   5: iconst_1
    //   6: invokevirtual compareAndSet : (Ljava/lang/Object;II)Z
    //   9: ifne -> 13
    //   12: return
    //   13: invokestatic currentThread : ()Ljava/lang/Thread;
    //   16: astore #6
    //   18: aload #6
    //   20: instanceof us
    //   23: istore_3
    //   24: aconst_null
    //   25: astore #8
    //   27: iload_3
    //   28: ifeq -> 41
    //   31: aload #6
    //   33: checkcast us
    //   36: astore #6
    //   38: goto -> 44
    //   41: aconst_null
    //   42: astore #6
    //   44: aload #8
    //   46: astore #7
    //   48: aload #6
    //   50: ifnull -> 73
    //   53: aload #6
    //   55: getfield j : Lws;
    //   58: aload_0
    //   59: if_acmpeq -> 69
    //   62: aload #8
    //   64: astore #7
    //   66: goto -> 73
    //   69: aload #6
    //   71: astore #7
    //   73: aload_0
    //   74: getfield i : Lfg1;
    //   77: astore #6
    //   79: aload #6
    //   81: monitorenter
    //   82: getstatic ws.k : Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;
    //   85: aload_0
    //   86: invokevirtual get : (Ljava/lang/Object;)J
    //   89: lstore #4
    //   91: lload #4
    //   93: ldc2_w 2097151
    //   96: land
    //   97: l2i
    //   98: istore_2
    //   99: aload #6
    //   101: monitorexit
    //   102: iconst_1
    //   103: iload_2
    //   104: if_icmpgt -> 189
    //   107: iconst_1
    //   108: istore_1
    //   109: aload_0
    //   110: getfield i : Lfg1;
    //   113: iload_1
    //   114: invokevirtual b : (I)Ljava/lang/Object;
    //   117: astore #6
    //   119: aload #6
    //   121: invokevirtual getClass : ()Ljava/lang/Class;
    //   124: pop
    //   125: aload #6
    //   127: checkcast us
    //   130: astore #6
    //   132: aload #6
    //   134: aload #7
    //   136: if_acmpeq -> 178
    //   139: aload #6
    //   141: invokevirtual getState : ()Ljava/lang/Thread$State;
    //   144: getstatic java/lang/Thread$State.TERMINATED : Ljava/lang/Thread$State;
    //   147: if_acmpeq -> 166
    //   150: aload #6
    //   152: invokestatic unpark : (Ljava/lang/Thread;)V
    //   155: aload #6
    //   157: ldc2_w 10000
    //   160: invokevirtual join : (J)V
    //   163: goto -> 139
    //   166: aload #6
    //   168: getfield b : Lw72;
    //   171: aload_0
    //   172: getfield h : Lge0;
    //   175: invokevirtual d : (Lge0;)V
    //   178: iload_1
    //   179: iload_2
    //   180: if_icmpeq -> 189
    //   183: iinc #1, 1
    //   186: goto -> 109
    //   189: aload_0
    //   190: getfield h : Lge0;
    //   193: invokevirtual b : ()V
    //   196: aload_0
    //   197: getfield g : Lge0;
    //   200: invokevirtual b : ()V
    //   203: aload #7
    //   205: ifnull -> 225
    //   208: aload #7
    //   210: iconst_1
    //   211: invokevirtual a : (Z)Lmt1;
    //   214: astore #8
    //   216: aload #8
    //   218: astore #6
    //   220: aload #8
    //   222: ifnonnull -> 298
    //   225: aload_0
    //   226: getfield g : Lge0;
    //   229: invokevirtual d : ()Ljava/lang/Object;
    //   232: checkcast mt1
    //   235: astore #8
    //   237: aload #8
    //   239: astore #6
    //   241: aload #8
    //   243: ifnonnull -> 298
    //   246: aload_0
    //   247: getfield h : Lge0;
    //   250: invokevirtual d : ()Ljava/lang/Object;
    //   253: checkcast mt1
    //   256: astore #8
    //   258: aload #8
    //   260: astore #6
    //   262: aload #8
    //   264: ifnonnull -> 298
    //   267: aload #7
    //   269: ifnull -> 281
    //   272: aload #7
    //   274: getstatic vs.g : Lvs;
    //   277: invokevirtual h : (Lvs;)Z
    //   280: pop
    //   281: getstatic ws.j : Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;
    //   284: aload_0
    //   285: lconst_0
    //   286: invokevirtual set : (Ljava/lang/Object;J)V
    //   289: getstatic ws.k : Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;
    //   292: aload_0
    //   293: lconst_0
    //   294: invokevirtual set : (Ljava/lang/Object;J)V
    //   297: return
    //   298: aload #6
    //   300: invokeinterface run : ()V
    //   305: goto -> 203
    //   308: astore #8
    //   310: invokestatic currentThread : ()Ljava/lang/Thread;
    //   313: astore #6
    //   315: aload #6
    //   317: invokevirtual getUncaughtExceptionHandler : ()Ljava/lang/Thread$UncaughtExceptionHandler;
    //   320: aload #6
    //   322: aload #8
    //   324: invokeinterface uncaughtException : (Ljava/lang/Thread;Ljava/lang/Throwable;)V
    //   329: goto -> 203
    //   332: astore #7
    //   334: aload #6
    //   336: monitorexit
    //   337: aload #7
    //   339: athrow
    // Exception table:
    //   from	to	target	type
    //   82	91	332	finally
    //   298	305	308	finally
  }
  
  public final void execute(Runnable paramRunnable) {
    d(this, paramRunnable, 6);
  }
  
  public final void g(us paramus, int paramInt1, int paramInt2) {
    ws ws1 = this;
    while (true) {
      long l = j.get(ws1);
      int j = (int)(0x1FFFFFL & l);
      int i = j;
      if (j == paramInt1)
        if (paramInt2 == 0) {
          for (Object object = paramus.c();; object = object.c()) {
            if (object == m) {
              i = -1;
              break;
            } 
            if (object == null) {
              i = 0;
              break;
            } 
            object = object;
            i = object.b();
            if (i != 0)
              break; 
          } 
        } else {
          i = paramInt2;
        }  
      if (i >= 0) {
        long l1 = i;
        if (j.compareAndSet(ws1, l, l1 | 2097152L + l & 0xFFFFFFFFFFE00000L))
          break; 
      } 
    } 
  }
  
  public final boolean h(long paramLong) {
    int j = (int)(0x1FFFFFL & paramLong) - (int)((paramLong & 0x3FFFFE00000L) >> 21L);
    int i = j;
    if (j < 0)
      i = 0; 
    j = this.b;
    if (i < j) {
      i = a();
      if (i == 1 && j > 1)
        a(); 
      if (i > 0)
        return true; 
    } 
    return false;
  }
  
  public final boolean k() {
    ws ws1 = this;
    label31: while (true) {
      long l2 = j.get(ws1);
      int i = (int)(0x1FFFFFL & l2);
      us us = (us)ws1.i.b(i);
      if (us == null) {
        Object object1 = null;
        continue;
      } 
      Object object = us.c();
      long l1 = l2;
      while (true) {
        f1 f11 = m;
        if (object == f11) {
          i = -1;
        } else if (object == null) {
          i = 0;
        } else {
          object = object;
          i = object.b();
          if (i == 0) {
            object = object.c();
            continue;
          } 
        } 
        if (i >= 0) {
          long l = i;
          if (j.compareAndSet(ws1, l1, l | 2097152L + l2 & 0xFFFFFFFFFFE00000L)) {
            us.g(f11);
            object = us;
            if (object == null)
              return false; 
            if (us.k.compareAndSet(object, -1, 0)) {
              LockSupport.unpark((Thread)object);
              return true;
            } 
            continue label31;
          } 
          continue label31;
        } 
        continue label31;
      } 
      break;
    } 
  }
  
  public final String toString() {
    ArrayList<String> arrayList = new ArrayList();
    fg1 fg11 = this.i;
    int i1 = fg11.a();
    int n = 0;
    int m = 0;
    byte b = 0;
    int i = b;
    int j = i;
    int k = 1;
    while (k < i1) {
      int i2;
      int i3;
      byte b1;
      int i4;
      us us = (us)fg11.b(k);
      if (us == null) {
        i3 = n;
        i2 = m;
        b1 = b;
        i4 = j;
      } else {
        int i5 = us.b.c();
        i2 = us.e.ordinal();
        if (i2 != 0) {
          if (i2 != 1) {
            if (i2 != 2) {
              if (i2 != 3) {
                if (i2 == 4) {
                  i4 = j + 1;
                  i3 = n;
                  i2 = m;
                  b1 = b;
                } else {
                  throw new RuntimeException();
                } 
              } else {
                int i6 = i + 1;
                i3 = n;
                i2 = m;
                b1 = b;
                i = i6;
                i4 = j;
                if (i5 > 0) {
                  StringBuilder stringBuilder1 = new StringBuilder();
                  stringBuilder1.append(i5);
                  stringBuilder1.append('d');
                  arrayList.add(stringBuilder1.toString());
                  i3 = n;
                  i2 = m;
                  b1 = b;
                  i = i6;
                  i4 = j;
                } 
              } 
            } else {
              b1 = b + 1;
              i3 = n;
              i2 = m;
              i4 = j;
            } 
          } else {
            i2 = m + 1;
            StringBuilder stringBuilder1 = new StringBuilder();
            stringBuilder1.append(i5);
            stringBuilder1.append('b');
            arrayList.add(stringBuilder1.toString());
            i3 = n;
            b1 = b;
            i4 = j;
          } 
        } else {
          i3 = n + 1;
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append(i5);
          stringBuilder1.append('c');
          arrayList.add(stringBuilder1.toString());
          i4 = j;
          b1 = b;
          i2 = m;
        } 
      } 
      k++;
      n = i3;
      m = i2;
      b = b1;
      j = i4;
    } 
    long l = k.get(this);
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(this.f);
    stringBuilder.append('@');
    stringBuilder.append(qv.s(this));
    stringBuilder.append("[Pool Size {core = ");
    k = this.b;
    stringBuilder.append(k);
    stringBuilder.append(", max = ");
    stringBuilder.append(this.c);
    stringBuilder.append("}, Worker States {CPU = ");
    stringBuilder.append(n);
    stringBuilder.append(", blocking = ");
    stringBuilder.append(m);
    stringBuilder.append(", parked = ");
    stringBuilder.append(b);
    stringBuilder.append(KjdXPYm.caEpSzyy);
    stringBuilder.append(i);
    stringBuilder.append(", terminated = ");
    stringBuilder.append(j);
    stringBuilder.append("}, running workers queues = ");
    stringBuilder.append(arrayList);
    stringBuilder.append(", global CPU queue size = ");
    stringBuilder.append(this.g.c());
    stringBuilder.append(", global blocking queue size = ");
    stringBuilder.append(this.h.c());
    stringBuilder.append(", Control State {created workers= ");
    stringBuilder.append((int)(0x1FFFFFL & l));
    stringBuilder.append(", blocking tasks = ");
    stringBuilder.append((int)((0x3FFFFE00000L & l) >> 21L));
    stringBuilder.append(", CPUs acquired = ");
    stringBuilder.append(k - (int)((l & 0x7FFFFC0000000000L) >> 42L));
    stringBuilder.append("}]");
    return stringBuilder.toString();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\ws.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
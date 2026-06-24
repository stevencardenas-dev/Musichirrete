import android.support.v4.graphics.drawable.uUq.IGBYXeDFmKYajx;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

public class pp2 implements hj2 {
  public static final boolean f = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
  
  public static final Logger g = Logger.getLogger(pp2.class.getName());
  
  public static final ui0 h;
  
  public static final Object i = new Object();
  
  public volatile Object b;
  
  public volatile vl2 c;
  
  public volatile wo2 e;
  
  public static void d(pp2 parampp2) {
    wo2 wo21;
    ui0 ui01;
    do {
      wo21 = parampp2.e;
      ui01 = h;
    } while (!ui01.B0(parampp2, wo21, wo2.c));
    while (true) {
      vl2 vl21;
      wo2 wo23 = null;
      if (wo21 == null) {
        while (true) {
          vl2 vl22 = parampp2.c;
          if (ui01.y0(parampp2, vl22, vl2.d)) {
            wo21 = wo23;
            vl2 vl23 = vl22;
            while (true) {
              vl2 vl24 = vl23;
              wo2 wo24 = wo21;
              if (vl24 != null) {
                vl23 = vl24.c;
                vl24.c = (vl2)wo21;
                vl21 = vl24;
                continue;
              } 
              break;
            } 
            while (vl23 != null) {
              Runnable runnable = vl23.a;
              vl21 = vl23.c;
              f(runnable, vl23.b);
              vl23 = vl21;
            } 
            return;
          } 
        } 
        break;
      } 
      Thread thread = ((wo2)vl21).a;
      if (thread != null) {
        ((wo2)vl21).a = null;
        LockSupport.unpark(thread);
      } 
      wo2 wo22 = ((wo2)vl21).b;
    } 
  }
  
  public static void f(Runnable paramRunnable, Executor paramExecutor) {
    try {
      paramExecutor.execute(paramRunnable);
      return;
    } catch (RuntimeException runtimeException) {
      Level level = Level.SEVERE;
      String str1 = String.valueOf(paramRunnable);
      String str2 = String.valueOf(paramExecutor);
      StringBuilder stringBuilder = new StringBuilder("RuntimeException while executing runnable ");
      stringBuilder.append(str1);
      stringBuilder.append(" with executor ");
      stringBuilder.append(str2);
      str1 = stringBuilder.toString();
      g.logp(level, "com.android.billingclient.util.concurrent.AbstractResolvableFuture", "executeListener", str1, runtimeException);
      return;
    } 
  }
  
  public static final Object h(Object paramObject) {
    if (!(paramObject instanceof rj2)) {
      if (!(paramObject instanceof gl2)) {
        Object object = paramObject;
        if (paramObject == i)
          object = null; 
        return object;
      } 
      throw new ExecutionException(((gl2)paramObject).a);
    } 
    Throwable throwable = ((rj2)paramObject).a;
    paramObject = new CancellationException("Task was cancelled.");
    paramObject.initCause(throwable);
    throw paramObject;
  }
  
  public final void b(Runnable paramRunnable, Executor paramExecutor) {
    paramExecutor.getClass();
    vl2 vl21 = this.c;
    vl2 vl22 = vl2.d;
    if (vl21 != vl22) {
      vl2 vl23;
      vl2 vl24 = new vl2(paramRunnable, paramExecutor);
      do {
        vl24.c = vl21;
        if (h.y0(this, vl21, vl24))
          return; 
        vl23 = this.c;
        vl21 = vl23;
      } while (vl23 != vl22);
    } 
    f(paramRunnable, paramExecutor);
  }
  
  public String c() {
    if (this instanceof ScheduledFuture) {
      long l = ((ScheduledFuture)this).getDelay(TimeUnit.MILLISECONDS);
      StringBuilder stringBuilder = new StringBuilder("remaining delay=[");
      stringBuilder.append(l);
      stringBuilder.append(" ms]");
      return stringBuilder.toString();
    } 
    return null;
  }
  
  public final boolean cancel(boolean paramBoolean) {
    Object object = this.b;
    if (object == null) {
      rj2 rj2;
      if (f) {
        rj2 = new rj2(new CancellationException("Future.cancel() was called."));
      } else if (paramBoolean) {
        rj2 = rj2.b;
      } else {
        rj2 = rj2.c;
      } 
      if (h.A0(this, object, rj2)) {
        d(this);
        return true;
      } 
    } 
    return false;
  }
  
  public final void e(StringBuilder paramStringBuilder) {
    // Byte code:
    //   0: getstatic com/google/android/gms/auth/api/signin/cwa/RqlokDsQOju.Cdzc : Ljava/lang/String;
    //   3: astore #4
    //   5: iconst_0
    //   6: istore_2
    //   7: aload_0
    //   8: invokevirtual get : ()Ljava/lang/Object;
    //   11: astore_3
    //   12: iload_2
    //   13: ifeq -> 33
    //   16: invokestatic currentThread : ()Ljava/lang/Thread;
    //   19: invokevirtual interrupt : ()V
    //   22: goto -> 33
    //   25: astore_3
    //   26: goto -> 85
    //   29: astore_3
    //   30: goto -> 121
    //   33: aload_1
    //   34: ldc_w 'SUCCESS, result=['
    //   37: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   40: pop
    //   41: aload_3
    //   42: aload_0
    //   43: if_acmpne -> 53
    //   46: ldc_w 'this future'
    //   49: astore_3
    //   50: goto -> 58
    //   53: aload_3
    //   54: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   57: astore_3
    //   58: aload_1
    //   59: aload_3
    //   60: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   63: pop
    //   64: aload_1
    //   65: aload #4
    //   67: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   70: pop
    //   71: return
    //   72: astore_3
    //   73: iload_2
    //   74: ifeq -> 83
    //   77: invokestatic currentThread : ()Ljava/lang/Thread;
    //   80: invokevirtual interrupt : ()V
    //   83: aload_3
    //   84: athrow
    //   85: aload_1
    //   86: ldc_w 'UNKNOWN, cause=['
    //   89: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   92: pop
    //   93: aload_1
    //   94: aload_3
    //   95: invokevirtual getClass : ()Ljava/lang/Class;
    //   98: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   101: pop
    //   102: aload_1
    //   103: ldc_w ' thrown from get()]'
    //   106: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   109: pop
    //   110: return
    //   111: astore_3
    //   112: aload_1
    //   113: ldc_w 'CANCELLED'
    //   116: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   119: pop
    //   120: return
    //   121: aload_1
    //   122: ldc_w 'FAILURE, cause=['
    //   125: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   128: pop
    //   129: aload_1
    //   130: aload_3
    //   131: invokevirtual getCause : ()Ljava/lang/Throwable;
    //   134: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   137: pop
    //   138: aload_1
    //   139: aload #4
    //   141: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   144: pop
    //   145: return
    //   146: astore_3
    //   147: iconst_1
    //   148: istore_2
    //   149: goto -> 7
    // Exception table:
    //   from	to	target	type
    //   7	12	146	java/lang/InterruptedException
    //   7	12	72	finally
    //   16	22	29	java/util/concurrent/ExecutionException
    //   16	22	111	java/util/concurrent/CancellationException
    //   16	22	25	java/lang/RuntimeException
    //   33	41	29	java/util/concurrent/ExecutionException
    //   33	41	111	java/util/concurrent/CancellationException
    //   33	41	25	java/lang/RuntimeException
    //   53	58	29	java/util/concurrent/ExecutionException
    //   53	58	111	java/util/concurrent/CancellationException
    //   53	58	25	java/lang/RuntimeException
    //   58	71	29	java/util/concurrent/ExecutionException
    //   58	71	111	java/util/concurrent/CancellationException
    //   58	71	25	java/lang/RuntimeException
    //   77	83	29	java/util/concurrent/ExecutionException
    //   77	83	111	java/util/concurrent/CancellationException
    //   77	83	25	java/lang/RuntimeException
    //   83	85	29	java/util/concurrent/ExecutionException
    //   83	85	111	java/util/concurrent/CancellationException
    //   83	85	25	java/lang/RuntimeException
  }
  
  public final void g(wo2 paramwo2) {
    paramwo2.a = null;
    label23: while (true) {
      paramwo2 = this.e;
      if (paramwo2 != wo2.c)
        for (Object object = null; paramwo2 != null; object = object1) {
          Object object1;
          wo2 wo21 = paramwo2.b;
          if (paramwo2.a != null) {
            object1 = paramwo2;
          } else if (object != null) {
            ((wo2)object).b = wo21;
            object1 = object;
            if (((wo2)object).a == null)
              continue label23; 
          } else {
            object1 = object;
            if (!h.B0(this, paramwo2, wo21))
              continue label23; 
          } 
          paramwo2 = wo21;
        }  
      break;
    } 
  }
  
  public final Object get() {
    if (!Thread.interrupted()) {
      Object object = this.b;
      if (object != null)
        return h(object); 
      object = this.e;
      wo2 wo21 = wo2.c;
      if (object != wo21) {
        wo2 wo22;
        wo2 wo23 = new wo2();
        do {
          ui0 ui01 = h;
          ui01.v0(wo23, (wo2)object);
          if (ui01.B0(this, (wo2)object, wo23))
            while (true) {
              LockSupport.park(this);
              if (!Thread.interrupted()) {
                object = this.b;
                if (object != null)
                  return h(object); 
                continue;
              } 
              g(wo23);
              throw new InterruptedException();
            }  
          wo22 = this.e;
          object = wo22;
        } while (wo22 != wo21);
      } 
      return h(this.b);
    } 
    throw new InterruptedException();
  }
  
  public final Object get(long paramLong, TimeUnit paramTimeUnit) {
    long l = paramTimeUnit.toNanos(paramLong);
    if (!Thread.interrupted()) {
      long l2;
      Object object = this.b;
      if (object != null)
        return h(object); 
      if (l > 0L) {
        l2 = System.nanoTime() + l;
      } else {
        l2 = 0L;
      } 
      long l1 = l;
      if (l >= 1000L) {
        object = this.e;
        wo2 wo21 = wo2.c;
        if (object != wo21) {
          wo2 wo22 = new wo2();
          label62: while (true) {
            ui0 ui01 = h;
            ui01.v0(wo22, (wo2)object);
            if (ui01.B0(this, (wo2)object, wo22))
              while (true) {
                LockSupport.parkNanos(this, l);
                if (!Thread.interrupted()) {
                  object = this.b;
                  if (object != null)
                    return h(object); 
                  l1 = l2 - System.nanoTime();
                  l = l1;
                  if (l1 < 1000L) {
                    g(wo22);
                    break;
                  } 
                  continue;
                } 
                g(wo22);
                throw new InterruptedException();
              }  
            wo2 wo23 = this.e;
            object = wo23;
            if (wo23 == wo21)
              break label62; 
          } 
        } else {
          return h(this.b);
        } 
      } 
      while (l1 > 0L) {
        object = this.b;
        if (object != null)
          return h(object); 
        if (!Thread.interrupted()) {
          l1 = l2 - System.nanoTime();
          continue;
        } 
        throw new InterruptedException();
      } 
      String str3 = toString();
      String str2 = paramTimeUnit.toString();
      object = Locale.ROOT;
      String str4 = str2.toLowerCase((Locale)object);
      object = paramTimeUnit.toString().toLowerCase((Locale)object);
      StringBuilder stringBuilder = new StringBuilder("Waited ");
      stringBuilder.append(paramLong);
      stringBuilder.append(" ");
      stringBuilder.append((String)object);
      String str1 = stringBuilder.toString();
      object = str1;
      if (l1 + 1000L < 0L) {
        object = str1.concat(" (plus ");
        l1 = -l1;
        paramLong = paramTimeUnit.convert(l1, TimeUnit.NANOSECONDS);
        l1 -= paramTimeUnit.toNanos(paramLong);
        int i = paramLong cmp 0L;
        boolean bool2 = true;
        boolean bool1 = bool2;
        if (i != 0)
          if (l1 > 1000L) {
            bool1 = bool2;
          } else {
            bool1 = false;
          }  
        Object object1 = object;
        if (i > 0) {
          object1 = new StringBuilder();
          object1.append((String)object);
          object1.append(paramLong);
          object1.append(" ");
          object1.append(str4);
          object = object1.toString();
          object1 = object;
          if (bool1)
            object1 = object.concat(","); 
          object1 = object1.concat(" ");
        } 
        object = object1;
        if (bool1) {
          object = new StringBuilder();
          object.append((String)object1);
          object.append(l1);
          object.append(" nanoseconds ");
          object = object.toString();
        } 
        object = object.concat("delay)");
      } 
      if (isDone())
        throw new TimeoutException(object.concat(" but future completed as timeout expired")); 
      throw new TimeoutException(x41.l(object, " for ", str3));
    } 
    throw new InterruptedException();
  }
  
  public final boolean isCancelled() {
    return this.b instanceof rj2;
  }
  
  public final boolean isDone() {
    boolean bool;
    if (this.b != null) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public final String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(super.toString());
    stringBuilder.append("[status=");
    if (this.b instanceof rj2) {
      stringBuilder.append("CANCELLED");
    } else if (isDone()) {
      e(stringBuilder);
    } else {
      String str;
      try {
        str = c();
      } catch (RuntimeException runtimeException) {
        str = "Exception thrown from implementation: ".concat(String.valueOf(runtimeException.getClass()));
      } 
      if (str != null && !str.isEmpty()) {
        stringBuilder.append("PENDING, info=[");
        stringBuilder.append(str);
        stringBuilder.append("]");
      } else if (isDone()) {
        e(stringBuilder);
      } else {
        stringBuilder.append("PENDING");
      } 
    } 
    stringBuilder.append("]");
    return stringBuilder.toString();
  }
  
  static {
    Object object;
    Exception exception;
  }
  
  static {
    try {
      object = new in2();
      this(AtomicReferenceFieldUpdater.newUpdater(wo2.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(wo2.class, wo2.class, "b"), AtomicReferenceFieldUpdater.newUpdater(pp2.class, wo2.class, IGBYXeDFmKYajx.CWQ), AtomicReferenceFieldUpdater.newUpdater(pp2.class, vl2.class, "c"), AtomicReferenceFieldUpdater.newUpdater(pp2.class, Object.class, "b"));
    } finally {
      exception = null;
    } 
    h = (ui0)object;
    if (exception != null)
      g.logp(Level.SEVERE, "com.android.billingclient.util.concurrent.AbstractResolvableFuture", "<clinit>", "SafeAtomicHelper is broken!", exception); 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\pp2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
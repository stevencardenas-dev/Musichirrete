import com.google.android.gms.cast.framework.internal.featurehighlight.aS.xveccWbRzqx;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class e0 implements ho0 {
  public static final boolean f = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
  
  public static final Logger g = Logger.getLogger(e0.class.getName());
  
  public static final ws2 h;
  
  public static final Object i = new Object();
  
  public volatile Object b;
  
  public volatile a0 c;
  
  public volatile d0 e;
  
  public static void d(e0 parame0) {
    d0 d01;
    Thread thread;
    do {
      d01 = parame0.e;
    } while (!h.k(parame0, d01, d0.c));
    while (true) {
      thread = null;
      if (d01 != null) {
        thread = d01.a;
        if (thread != null) {
          d01.a = null;
          LockSupport.unpark(thread);
        } 
        d01 = d01.b;
        continue;
      } 
      break;
    } 
    while (true) {
      a0 a01 = parame0.c;
      if (h.i(parame0, a01, a0.d)) {
        Thread thread1 = thread;
        a0 a02 = a01;
        while (true) {
          a0 a03 = a02;
          Thread thread2 = thread1;
          if (a03 != null) {
            a02 = a03.c;
            a03.c = (a0)thread1;
            a0 a04 = a03;
            continue;
          } 
          break;
        } 
        while (a02 != null) {
          a0 a03 = a02.c;
          e(a02.a, a02.b);
          a02 = a03;
        } 
        return;
      } 
    } 
  }
  
  public static void e(Runnable paramRunnable, Executor paramExecutor) {
    try {
      paramExecutor.execute(paramRunnable);
      return;
    } catch (RuntimeException runtimeException) {
      Level level = Level.SEVERE;
      StringBuilder stringBuilder = new StringBuilder("RuntimeException while executing runnable ");
      stringBuilder.append(paramRunnable);
      stringBuilder.append(" with executor ");
      stringBuilder.append(paramExecutor);
      String str = stringBuilder.toString();
      g.log(level, str, runtimeException);
      return;
    } 
  }
  
  public static Object f(Object paramObject) {
    if (!(paramObject instanceof x)) {
      if (!(paramObject instanceof z)) {
        Object object = paramObject;
        if (paramObject == i)
          object = null; 
        return object;
      } 
      throw new ExecutionException(((z)paramObject).a);
    } 
    paramObject = ((x)paramObject).a;
    CancellationException cancellationException = new CancellationException("Task was cancelled.");
    cancellationException.initCause((Throwable)paramObject);
    throw cancellationException;
  }
  
  public static Object g(Future<Object> paramFuture) {
    boolean bool = false;
    while (true) {
      try {
        return paramFuture.get();
      } catch (InterruptedException interruptedException) {
      
      } finally {
        if (bool)
          Thread.currentThread().interrupt(); 
      } 
    } 
  }
  
  public final void a(Runnable paramRunnable, Executor paramExecutor) {
    paramExecutor.getClass();
    a0 a01 = this.c;
    a0 a02 = a0.d;
    if (a01 != a02) {
      a0 a03;
      a0 a04 = new a0(paramRunnable, paramExecutor);
      do {
        a04.c = a01;
        if (h.i(this, a01, a04))
          return; 
        a03 = this.c;
        a01 = a03;
      } while (a03 != a02);
    } 
    e(paramRunnable, paramExecutor);
  }
  
  public final void c(StringBuilder paramStringBuilder) {
    try {
      object = g(this);
      paramStringBuilder.append("SUCCESS, result=[");
      if (object == this) {
        object = "this future";
      } else {
        object = String.valueOf(object);
      } 
      paramStringBuilder.append((String)object);
      paramStringBuilder.append("]");
      return;
    } catch (ExecutionException null) {
    
    } catch (CancellationException null) {
      paramStringBuilder.append("CANCELLED");
    } catch (RuntimeException object) {
      paramStringBuilder.append("UNKNOWN, cause=[");
      paramStringBuilder.append(object.getClass());
      paramStringBuilder.append(" thrown from get()]");
    } 
    paramStringBuilder.append("FAILURE, cause=[");
    paramStringBuilder.append(object.getCause());
    paramStringBuilder.append("]");
  }
  
  public final boolean cancel(boolean paramBoolean) {
    Object object = this.b;
    if (object == null) {
      x x;
      if (f) {
        x = new x(new CancellationException("Future.cancel() was called."), paramBoolean);
      } else if (paramBoolean) {
        x = x.b;
      } else {
        x = x.c;
      } 
      if (h.j(this, object, x)) {
        d(this);
        return true;
      } 
    } 
    return false;
  }
  
  public final Object get() {
    d0 d01 = d0.c;
    if (!Thread.interrupted()) {
      Object object = this.b;
      if (object != null)
        return f(object); 
      object = this.e;
      if (object != d01) {
        d0 d02;
        d0 d03 = new d0();
        do {
          ws2 ws21 = h;
          ws21.X(d03, (d0)object);
          if (ws21.k(this, (d0)object, d03))
            while (true) {
              LockSupport.park(this);
              if (!Thread.interrupted()) {
                object = this.b;
                if (object != null)
                  return f(object); 
                continue;
              } 
              i(d03);
              throw new InterruptedException();
            }  
          d02 = this.e;
          object = d02;
        } while (d02 != d01);
      } 
      return f(this.b);
    } 
    throw new InterruptedException();
  }
  
  public final Object get(long paramLong, TimeUnit paramTimeUnit) {
    d0 d01 = d0.c;
    long l = paramTimeUnit.toNanos(paramLong);
    if (!Thread.interrupted()) {
      long l2;
      Object object = this.b;
      if (object != null)
        return f(object); 
      if (l > 0L) {
        l2 = System.nanoTime() + l;
      } else {
        l2 = 0L;
      } 
      long l1 = l;
      if (l >= 1000L) {
        object = this.e;
        if (object != d01) {
          d0 d02 = new d0();
          label63: while (true) {
            ws2 ws21 = h;
            ws21.X(d02, (d0)object);
            if (ws21.k(this, (d0)object, d02))
              while (true) {
                LockSupport.parkNanos(this, l);
                if (!Thread.interrupted()) {
                  object = this.b;
                  if (object != null)
                    return f(object); 
                  l1 = l2 - System.nanoTime();
                  l = l1;
                  if (l1 < 1000L) {
                    i(d02);
                    break;
                  } 
                  continue;
                } 
                i(d02);
                throw new InterruptedException();
              }  
            d0 d03 = this.e;
            object = d03;
            if (d03 == d01)
              break label63; 
          } 
        } else {
          return f(this.b);
        } 
      } 
      while (l1 > 0L) {
        object = this.b;
        if (object != null)
          return f(object); 
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
      StringBuilder stringBuilder = new StringBuilder(xveccWbRzqx.JMfOKdWcahEUKn);
      stringBuilder.append(paramLong);
      stringBuilder.append(" ");
      stringBuilder.append(paramTimeUnit.toString().toLowerCase((Locale)object));
      String str1 = stringBuilder.toString();
      object = str1;
      if (l1 + 1000L < 0L) {
        boolean bool;
        object = str1.concat(" (plus ");
        l1 = -l1;
        paramLong = paramTimeUnit.convert(l1, TimeUnit.NANOSECONDS);
        l1 -= paramTimeUnit.toNanos(paramLong);
        int i = paramLong cmp 0L;
        if (i == 0 || l1 > 1000L) {
          bool = true;
        } else {
          bool = false;
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
          if (bool)
            object1 = object.concat(","); 
          object1 = object1.concat(" ");
        } 
        object = object1;
        if (bool) {
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
  
  public String h() {
    if (this instanceof ScheduledFuture) {
      StringBuilder stringBuilder = new StringBuilder("remaining delay=[");
      stringBuilder.append(((ScheduledFuture)this).getDelay(TimeUnit.MILLISECONDS));
      stringBuilder.append(" ms]");
      return stringBuilder.toString();
    } 
    return null;
  }
  
  public final void i(d0 paramd0) {
    paramd0.a = null;
    label24: while (true) {
      paramd0 = this.e;
      if (paramd0 == d0.c)
        break; 
      for (Object object = null; paramd0 != null; object = object1) {
        Object object1;
        d0 d01 = paramd0.b;
        if (paramd0.a != null) {
          object1 = paramd0;
        } else if (object != null) {
          ((d0)object).b = d01;
          object1 = object;
          if (((d0)object).a == null)
            continue label24; 
        } else {
          object1 = object;
          if (!h.k(this, paramd0, d01))
            continue label24; 
        } 
        paramd0 = d01;
      } 
      break;
    } 
  }
  
  public final boolean isCancelled() {
    return this.b instanceof x;
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
  
  public boolean j(Throwable paramThrowable) {
    z z = new z(paramThrowable);
    if (h.j(this, null, z)) {
      d(this);
      return true;
    } 
    return false;
  }
  
  public final String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(super.toString());
    stringBuilder.append("[status=");
    if (this.b instanceof x) {
      stringBuilder.append("CANCELLED");
    } else if (isDone()) {
      c(stringBuilder);
    } else {
      String str;
      try {
        str = h();
      } catch (RuntimeException runtimeException) {
        StringBuilder stringBuilder1 = new StringBuilder("Exception thrown from implementation: ");
        stringBuilder1.append(runtimeException.getClass());
        str = stringBuilder1.toString();
      } 
      if (str != null && !str.isEmpty()) {
        stringBuilder.append("PENDING, info=[");
        stringBuilder.append(str);
        stringBuilder.append("]");
      } else if (isDone()) {
        c(stringBuilder);
      } else {
        stringBuilder.append("PENDING");
      } 
    } 
    stringBuilder.append("]");
    return stringBuilder.toString();
  }
  
  static {
    ws2 ws21;
    Exception exception;
  }
  
  static {
    try {
      ws21 = new b0();
      this(AtomicReferenceFieldUpdater.newUpdater(d0.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(d0.class, d0.class, "b"), AtomicReferenceFieldUpdater.newUpdater(e0.class, d0.class, "e"), AtomicReferenceFieldUpdater.newUpdater(e0.class, a0.class, "c"), AtomicReferenceFieldUpdater.newUpdater(e0.class, Object.class, "b"));
    } finally {
      exception = null;
    } 
    h = ws21;
    if (exception != null)
      g.log(Level.SEVERE, "SafeAtomicHelper is broken!", exception); 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\e0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
import com.sdsmdg.harjot.crollerTest.TG.ckOPp;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class kj2 extends li2 implements hj2 {
  public hj2 j;
  
  public ScheduledFuture k;
  
  public static Object e(Object paramObject) {
    if (!(paramObject instanceof bi2)) {
      if (!(paramObject instanceof ei2)) {
        Object object = paramObject;
        if (paramObject == li2.f)
          object = null; 
        return object;
      } 
      throw new ExecutionException(((ei2)paramObject).a);
    } 
    paramObject = ((bi2)paramObject).b;
    CancellationException cancellationException = new CancellationException("Task was cancelled.");
    cancellationException.initCause((Throwable)paramObject);
    throw cancellationException;
  }
  
  public static boolean g(Object paramObject) {
    return !(paramObject instanceof ci2);
  }
  
  public static Object h(hj2 paramhj2) {
    Object object;
    if (paramhj2 instanceof kj2) {
      Object object1 = ((kj2)paramhj2).b;
      object = object1;
      if (object1 instanceof bi2) {
        bi2 bi2 = (bi2)object1;
        object = object1;
        if (bi2.a) {
          object = bi2.b;
          if (object != null) {
            object = new bi2((Throwable)object, false);
          } else {
            object = bi2.d;
          } 
        } 
      } 
      Objects.requireNonNull(object);
      return object;
    } 
    if (object instanceof li2) {
      Throwable throwable = ((li2)object).d();
      if (throwable != null)
        return new ei2(throwable); 
    } 
    boolean bool1 = object.isCancelled();
    if (((li2.h ^ true) & bool1) != 0) {
      object = bi2.d;
      Objects.requireNonNull(object);
      return object;
    } 
    boolean bool = false;
    while (true) {
      try {
        IllegalArgumentException illegalArgumentException = (IllegalArgumentException)object.get();
        if (bool)
          return bool1 ? new bi2(new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(error)), cancellationException), false) : new ei2(cancellationException.getCause()); 
        return (illegalArgumentException == null) ? li2.f : illegalArgumentException;
      } catch (InterruptedException interruptedException) {
      
      } finally {
        if (bool)
          Thread.currentThread().interrupt(); 
      } 
    } 
  }
  
  public static void j(kj2 paramkj2) {
    kj2 kj22 = null;
    kj2 kj21 = paramkj2;
    paramkj2 = kj22;
    label45: while (true) {
      boolean bool1;
      kj21.getClass();
      for (ji2 ji2 = li2.i.x0(kj21); ji2 != null; ji2 = ji2.b) {
        Thread thread = ji2.a;
        if (thread != null) {
          ji2.a = null;
          LockSupport.unpark(thread);
        } 
      } 
      hj2 hj21 = kj21.j;
      boolean bool2 = kj21.b instanceof bi2;
      boolean bool = true;
      if (hj21 != null) {
        bool1 = true;
      } else {
        bool1 = false;
      } 
      if (bool2 & bool1) {
        Object object = kj21.b;
        if (!(object instanceof bi2) || !((bi2)object).a)
          bool = false; 
        hj21.cancel(bool);
      } 
      ScheduledFuture scheduledFuture = kj21.k;
      if (scheduledFuture != null)
        scheduledFuture.cancel(false); 
      kj21.j = null;
      kj21.k = null;
      fi2 fi22 = li2.i.w0(kj21);
      kj21 = paramkj2;
      fi2 fi21 = fi22;
      while (true) {
        kj2 kj23 = kj21;
        if (fi21 != null) {
          fi22 = fi21.c;
          fi21.c = (fi2)kj21;
          fi2 fi2 = fi21;
          fi21 = fi22;
          continue;
        } 
        break;
      } 
      while (fi22 != null) {
        kj2 kj23;
        Runnable runnable = fi22.a;
        fi21 = fi22.c;
        Objects.requireNonNull(runnable);
        if (runnable instanceof ci2) {
          ci2 ci2 = (ci2)runnable;
          kj23 = ci2.b;
          if (kj23.b == ci2) {
            object = h(ci2.c);
            if (li2.i.J0(kj23, ci2, object))
              continue label45; 
          } 
        } else {
          object = ((fi2)object).b;
          Objects.requireNonNull(object);
          k((Runnable)kj23, (Executor)object);
        } 
        Object object = fi21;
      } 
      break;
    } 
  }
  
  public static void k(Runnable paramRunnable, Executor paramExecutor) {
    try {
      paramExecutor.execute(paramRunnable);
      return;
    } catch (Exception exception) {
      Logger logger = li2.g.b();
      Level level = Level.SEVERE;
      String str1 = String.valueOf(paramRunnable);
      String str2 = String.valueOf(paramExecutor);
      StringBuilder stringBuilder = new StringBuilder("RuntimeException while executing runnable ");
      stringBuilder.append(str1);
      stringBuilder.append(" with executor ");
      stringBuilder.append(str2);
      logger.logp(level, "com.google.common.util.concurrent.AbstractFuture", "executeListener", stringBuilder.toString(), exception);
      return;
    } 
  }
  
  public final void b(Runnable paramRunnable, Executor paramExecutor) {
    fi2 fi2 = fi2.d;
    if (paramExecutor != null) {
      if (!isDone()) {
        fi2 fi21 = this.c;
        if (fi21 != fi2) {
          fi2 fi22 = new fi2(paramRunnable, paramExecutor);
          while (true) {
            fi22.c = fi21;
            if (!li2.i.H0(this, fi21, fi22)) {
              fi2 fi23 = this.c;
              fi21 = fi23;
              if (fi23 == fi2)
                break; 
              continue;
            } 
            return;
          } 
        } 
      } 
      k(paramRunnable, paramExecutor);
      return;
    } 
    k91.h("Executor was null.");
  }
  
  public final boolean cancel(boolean paramBoolean) {
    boolean bool1;
    Object object = this.b;
    boolean bool2 = object instanceof ci2;
    if (object == null) {
      bool1 = true;
    } else {
      bool1 = false;
    } 
    if (bool2 | bool1) {
      bi2 bi2;
      if (li2.h) {
        bi2 = new bi2(new CancellationException("Future.cancel() was called."), paramBoolean);
      } else {
        bi2 bi21;
        if (paramBoolean) {
          bi21 = bi2.c;
        } else {
          bi21 = bi2.d;
        } 
        Objects.requireNonNull(bi21);
        bi2 = bi21;
      } 
      bool2 = false;
      kj2 kj21 = this;
      Object object1 = object;
      while (true) {
        while (li2.i.J0(kj21, object1, bi2)) {
          j(kj21);
          if (object1 instanceof ci2) {
            object1 = ((ci2)object1).c;
            if (object1 instanceof kj2) {
              kj21 = (kj2)object1;
              object1 = kj21.b;
              if (object1 == null) {
                bool1 = true;
              } else {
                bool1 = false;
              } 
              if (bool1 | object1 instanceof ci2) {
                bool2 = true;
                continue;
              } 
            } else {
              object1.cancel(paramBoolean);
            } 
          } 
          return true;
        } 
        object = kj21.b;
        object1 = object;
        if (g(object))
          return bool2; 
      } 
    } 
    return false;
  }
  
  public final Throwable d() {
    if (this instanceof kj2) {
      Object object = this.b;
      if (object instanceof ei2)
        return ((ei2)object).a; 
    } 
    return null;
  }
  
  public final String f() {
    hj2 hj21 = this.j;
    ScheduledFuture scheduledFuture = this.k;
    if (hj21 != null) {
      String str = x41.w("inputFuture=[", hj21.toString(), "]");
      if (scheduledFuture != null) {
        long l = scheduledFuture.getDelay(TimeUnit.MILLISECONDS);
        if (l > 0L) {
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append(str);
          stringBuilder.append(", remaining delay=[");
          stringBuilder.append(l);
          stringBuilder.append(" ms]");
          return stringBuilder.toString();
        } 
      } 
      return str;
    } 
    return null;
  }
  
  public final Object get() {
    ji2 ji2 = ji2.c;
    if (!Thread.interrupted()) {
      boolean bool;
      Object object = this.b;
      if (object != null) {
        bool = true;
      } else {
        bool = false;
      } 
      if (bool & g(object))
        return e(object); 
      object = this.e;
      if (object != ji2) {
        ji2 ji21;
        ji2 ji22 = new ji2();
        do {
          wf2 wf2 = li2.i;
          wf2.B0(ji22, (ji2)object);
          if (wf2.K0(this, (ji2)object, ji22))
            while (true) {
              LockSupport.park(this);
              if (!Thread.interrupted()) {
                object = this.b;
                if (object != null) {
                  bool = true;
                } else {
                  bool = false;
                } 
                if (bool & g(object))
                  return e(object); 
                continue;
              } 
              c(ji22);
              throw new InterruptedException();
            }  
          ji21 = this.e;
          object = ji21;
        } while (ji21 != ji2);
      } 
      object = this.b;
      Objects.requireNonNull(object);
      return e(object);
    } 
    throw new InterruptedException();
  }
  
  public final Object get(long paramLong, TimeUnit paramTimeUnit) {
    ji2 ji2 = ji2.c;
    long l = paramTimeUnit.toNanos(paramLong);
    if (!Thread.interrupted()) {
      Object object1;
      boolean bool;
      long l2;
      long l3;
      Object object2 = this.b;
      if (object2 != null) {
        bool = true;
      } else {
        bool = false;
      } 
      if (bool & g(object2))
        return e(object2); 
      long l1 = 0L;
      if (l > 0L) {
        l2 = System.nanoTime() + l;
      } else {
        l2 = 0L;
      } 
      if (l >= 1000L) {
        object2 = this.e;
        if (object2 != ji2) {
          ji2 ji21 = new ji2();
          while (true) {
            wf2 wf2 = li2.i;
            wf2.B0(ji21, (ji2)object2);
            if (wf2.K0(this, (ji2)object2, ji21)) {
              l3 = l1;
              while (true) {
                LockSupport.parkNanos(this, Math.min(l, 2147483647999999999L));
                if (!Thread.interrupted()) {
                  object2 = this.b;
                  if (object2 != null) {
                    bool = true;
                  } else {
                    bool = false;
                  } 
                  if (bool & g(object2))
                    return e(object2); 
                  l1 = l2 - System.nanoTime();
                  l = l1;
                  if (l1 < 1000L) {
                    c(ji21);
                    break;
                  } 
                  continue;
                } 
                c(ji21);
                throw new InterruptedException();
              } 
            } 
            object2 = this.e;
            if (object2 == ji2)
              // Byte code: goto -> 259 
          } 
        } else {
          object1 = this.b;
          Objects.requireNonNull(object1);
          return e(object1);
        } 
      } else {
        l3 = 0L;
        l1 = l;
      } 
      while (l1 > l3) {
        object2 = this.b;
        if (object2 != null) {
          bool = true;
        } else {
          bool = false;
        } 
        if (bool & g(object2))
          return e(object2); 
        if (!Thread.interrupted()) {
          l1 = l2 - System.nanoTime();
          continue;
        } 
        throw new InterruptedException();
      } 
      String str3 = toString();
      String str2 = object1.toString();
      object2 = Locale.ROOT;
      String str4 = str2.toLowerCase((Locale)object2);
      object2 = object1.toString().toLowerCase((Locale)object2);
      StringBuilder stringBuilder = new StringBuilder("Waited ");
      stringBuilder.append(paramLong);
      stringBuilder.append(" ");
      stringBuilder.append((String)object2);
      String str1 = stringBuilder.toString();
      object2 = str1;
      if (l1 + 1000L < l3) {
        object2 = str1.concat(ckOPp.XifdBMRyuJt);
        l1 = -l1;
        paramLong = object1.convert(l1, TimeUnit.NANOSECONDS);
        l1 -= object1.toNanos(paramLong);
        int i = paramLong cmp l3;
        if (i == 0 || l1 > 1000L) {
          bool = true;
        } else {
          bool = false;
        } 
        object1 = object2;
        if (i > 0) {
          object1 = new StringBuilder();
          object1.append((String)object2);
          object1.append(paramLong);
          object1.append(" ");
          object1.append(str4);
          object2 = object1.toString();
          object1 = object2;
          if (bool)
            object1 = object2.concat(","); 
          object1 = object1.concat(" ");
        } 
        object2 = object1;
        if (bool) {
          object2 = new StringBuilder();
          object2.append((String)object1);
          object2.append(l1);
          object2.append(" nanoseconds ");
          object2 = object2.toString();
        } 
        object2 = object2.concat("delay)");
      } 
      if (isDone())
        throw new TimeoutException(object2.concat(" but future completed as timeout expired")); 
      throw new TimeoutException(x41.l(object2, " for ", str3));
    } 
    throw new InterruptedException();
  }
  
  public final void i(StringBuilder paramStringBuilder) {
    // Byte code:
    //   0: iconst_0
    //   1: istore_2
    //   2: aload_0
    //   3: invokeinterface get : ()Ljava/lang/Object;
    //   8: astore_3
    //   9: iload_2
    //   10: ifeq -> 19
    //   13: invokestatic currentThread : ()Ljava/lang/Thread;
    //   16: invokevirtual interrupt : ()V
    //   19: aload_1
    //   20: ldc_w 'SUCCESS, result=['
    //   23: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   26: pop
    //   27: aload_3
    //   28: ifnonnull -> 50
    //   31: aload_1
    //   32: ldc_w 'null'
    //   35: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   38: pop
    //   39: goto -> 98
    //   42: astore_3
    //   43: goto -> 123
    //   46: astore_3
    //   47: goto -> 159
    //   50: aload_3
    //   51: aload_0
    //   52: if_acmpne -> 66
    //   55: aload_1
    //   56: ldc_w 'this future'
    //   59: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   62: pop
    //   63: goto -> 98
    //   66: aload_1
    //   67: aload_3
    //   68: invokevirtual getClass : ()Ljava/lang/Class;
    //   71: invokevirtual getName : ()Ljava/lang/String;
    //   74: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   77: pop
    //   78: aload_1
    //   79: ldc_w '@'
    //   82: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   85: pop
    //   86: aload_1
    //   87: aload_3
    //   88: invokestatic identityHashCode : (Ljava/lang/Object;)I
    //   91: invokestatic toHexString : (I)Ljava/lang/String;
    //   94: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   97: pop
    //   98: aload_1
    //   99: ldc_w ']'
    //   102: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   105: pop
    //   106: return
    //   107: astore_3
    //   108: iload_2
    //   109: ifne -> 115
    //   112: goto -> 121
    //   115: invokestatic currentThread : ()Ljava/lang/Thread;
    //   118: invokevirtual interrupt : ()V
    //   121: aload_3
    //   122: athrow
    //   123: aload_1
    //   124: ldc_w 'UNKNOWN, cause=['
    //   127: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   130: pop
    //   131: aload_1
    //   132: aload_3
    //   133: invokevirtual getClass : ()Ljava/lang/Class;
    //   136: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   139: pop
    //   140: aload_1
    //   141: ldc_w ' thrown from get()]'
    //   144: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   147: pop
    //   148: return
    //   149: astore_3
    //   150: aload_1
    //   151: ldc_w 'CANCELLED'
    //   154: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   157: pop
    //   158: return
    //   159: aload_1
    //   160: ldc_w 'FAILURE, cause=['
    //   163: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   166: pop
    //   167: aload_1
    //   168: aload_3
    //   169: invokevirtual getCause : ()Ljava/lang/Throwable;
    //   172: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   175: pop
    //   176: aload_1
    //   177: ldc_w ']'
    //   180: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   183: pop
    //   184: return
    //   185: astore_3
    //   186: iconst_1
    //   187: istore_2
    //   188: goto -> 2
    // Exception table:
    //   from	to	target	type
    //   2	9	185	java/lang/InterruptedException
    //   2	9	107	finally
    //   13	19	46	java/util/concurrent/ExecutionException
    //   13	19	149	java/util/concurrent/CancellationException
    //   13	19	42	java/lang/Exception
    //   19	27	46	java/util/concurrent/ExecutionException
    //   19	27	149	java/util/concurrent/CancellationException
    //   19	27	42	java/lang/Exception
    //   31	39	46	java/util/concurrent/ExecutionException
    //   31	39	149	java/util/concurrent/CancellationException
    //   31	39	42	java/lang/Exception
    //   55	63	46	java/util/concurrent/ExecutionException
    //   55	63	149	java/util/concurrent/CancellationException
    //   55	63	42	java/lang/Exception
    //   66	98	46	java/util/concurrent/ExecutionException
    //   66	98	149	java/util/concurrent/CancellationException
    //   66	98	42	java/lang/Exception
    //   98	106	46	java/util/concurrent/ExecutionException
    //   98	106	149	java/util/concurrent/CancellationException
    //   98	106	42	java/lang/Exception
    //   115	121	46	java/util/concurrent/ExecutionException
    //   115	121	149	java/util/concurrent/CancellationException
    //   115	121	42	java/lang/Exception
    //   121	123	46	java/util/concurrent/ExecutionException
    //   121	123	149	java/util/concurrent/CancellationException
    //   121	123	42	java/lang/Exception
  }
  
  public final boolean isCancelled() {
    return this.b instanceof bi2;
  }
  
  public final boolean isDone() {
    boolean bool1;
    Object object = this.b;
    boolean bool2 = g(object);
    if (object != null) {
      bool1 = true;
    } else {
      bool1 = false;
    } 
    return bool1 & bool2;
  }
  
  public final String toString() {
    // Byte code:
    //   0: new java/lang/StringBuilder
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: astore #5
    //   9: aload_0
    //   10: invokevirtual getClass : ()Ljava/lang/Class;
    //   13: invokevirtual getName : ()Ljava/lang/String;
    //   16: ldc_w 'com.google.common.util.concurrent.'
    //   19: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   22: ifeq -> 41
    //   25: aload #5
    //   27: aload_0
    //   28: invokevirtual getClass : ()Ljava/lang/Class;
    //   31: invokevirtual getSimpleName : ()Ljava/lang/String;
    //   34: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   37: pop
    //   38: goto -> 54
    //   41: aload #5
    //   43: aload_0
    //   44: invokevirtual getClass : ()Ljava/lang/Class;
    //   47: invokevirtual getName : ()Ljava/lang/String;
    //   50: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   53: pop
    //   54: aload #5
    //   56: bipush #64
    //   58: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   61: pop
    //   62: aload #5
    //   64: aload_0
    //   65: invokestatic identityHashCode : (Ljava/lang/Object;)I
    //   68: invokestatic toHexString : (I)Ljava/lang/String;
    //   71: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   74: pop
    //   75: aload #5
    //   77: ldc_w '[status='
    //   80: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   83: pop
    //   84: aload_0
    //   85: getfield b : Ljava/lang/Object;
    //   88: instanceof bi2
    //   91: ifeq -> 106
    //   94: aload #5
    //   96: ldc_w 'CANCELLED'
    //   99: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   102: pop
    //   103: goto -> 404
    //   106: aload_0
    //   107: invokevirtual isDone : ()Z
    //   110: ifeq -> 122
    //   113: aload_0
    //   114: aload #5
    //   116: invokevirtual i : (Ljava/lang/StringBuilder;)V
    //   119: goto -> 404
    //   122: aload #5
    //   124: invokevirtual length : ()I
    //   127: istore_2
    //   128: aload #5
    //   130: ldc_w 'PENDING'
    //   133: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   136: pop
    //   137: aload_0
    //   138: getfield b : Ljava/lang/Object;
    //   141: astore #4
    //   143: aload #4
    //   145: instanceof ci2
    //   148: ifeq -> 261
    //   151: aload #5
    //   153: ldc_w ', setFuture=['
    //   156: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   159: pop
    //   160: aload #4
    //   162: checkcast ci2
    //   165: getfield c : Lhj2;
    //   168: astore #4
    //   170: aload #4
    //   172: aload_0
    //   173: if_acmpne -> 193
    //   176: aload #5
    //   178: ldc_w 'this future'
    //   181: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   184: pop
    //   185: goto -> 249
    //   188: astore #4
    //   190: goto -> 204
    //   193: aload #5
    //   195: aload #4
    //   197: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   200: pop
    //   201: goto -> 249
    //   204: aload #4
    //   206: instanceof java/lang/Error
    //   209: ifeq -> 229
    //   212: aload #4
    //   214: instanceof java/lang/StackOverflowError
    //   217: ifeq -> 223
    //   220: goto -> 229
    //   223: aload #4
    //   225: checkcast java/lang/Error
    //   228: athrow
    //   229: aload #5
    //   231: ldc_w 'Exception thrown from implementation: '
    //   234: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   237: pop
    //   238: aload #5
    //   240: aload #4
    //   242: invokevirtual getClass : ()Ljava/lang/Class;
    //   245: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   248: pop
    //   249: aload #5
    //   251: ldc_w ']'
    //   254: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   257: pop
    //   258: goto -> 379
    //   261: aload_0
    //   262: invokevirtual f : ()Ljava/lang/String;
    //   265: astore #4
    //   267: aload #4
    //   269: ifnull -> 295
    //   272: aload #4
    //   274: invokevirtual isEmpty : ()Z
    //   277: istore_3
    //   278: iload_3
    //   279: ifeq -> 285
    //   282: goto -> 295
    //   285: iconst_0
    //   286: istore_1
    //   287: goto -> 297
    //   290: astore #4
    //   292: goto -> 307
    //   295: iconst_1
    //   296: istore_1
    //   297: iload_1
    //   298: ifeq -> 348
    //   301: aconst_null
    //   302: astore #4
    //   304: goto -> 348
    //   307: aload #4
    //   309: instanceof java/lang/Error
    //   312: ifeq -> 332
    //   315: aload #4
    //   317: instanceof java/lang/StackOverflowError
    //   320: ifeq -> 326
    //   323: goto -> 332
    //   326: aload #4
    //   328: checkcast java/lang/Error
    //   331: athrow
    //   332: ldc_w 'Exception thrown from implementation: '
    //   335: aload #4
    //   337: invokevirtual getClass : ()Ljava/lang/Class;
    //   340: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   343: invokevirtual concat : (Ljava/lang/String;)Ljava/lang/String;
    //   346: astore #4
    //   348: aload #4
    //   350: ifnull -> 379
    //   353: aload #5
    //   355: ldc_w ', info=['
    //   358: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   361: pop
    //   362: aload #5
    //   364: aload #4
    //   366: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   369: pop
    //   370: aload #5
    //   372: ldc_w ']'
    //   375: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   378: pop
    //   379: aload_0
    //   380: invokevirtual isDone : ()Z
    //   383: ifeq -> 404
    //   386: aload #5
    //   388: iload_2
    //   389: aload #5
    //   391: invokevirtual length : ()I
    //   394: invokevirtual delete : (II)Ljava/lang/StringBuilder;
    //   397: pop
    //   398: aload_0
    //   399: aload #5
    //   401: invokevirtual i : (Ljava/lang/StringBuilder;)V
    //   404: aload #5
    //   406: ldc_w ']'
    //   409: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   412: pop
    //   413: aload #5
    //   415: invokevirtual toString : ()Ljava/lang/String;
    //   418: areturn
    // Exception table:
    //   from	to	target	type
    //   176	185	188	finally
    //   193	201	188	finally
    //   261	267	290	finally
    //   272	278	290	finally
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\kj2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
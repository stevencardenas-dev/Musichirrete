import com.google.android.material.tabs.xm.VDgS;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class ju2 extends ru2 {
  public static Object d(Object paramObject) {
    if (!(paramObject instanceof gu2)) {
      if (!(paramObject instanceof hu2)) {
        Object object = paramObject;
        if (paramObject == ru2.f)
          object = null; 
        return object;
      } 
      throw new ExecutionException(((hu2)paramObject).a);
    } 
    paramObject = ((gu2)paramObject).b;
    CancellationException cancellationException = new CancellationException("Task was cancelled.");
    cancellationException.initCause((Throwable)paramObject);
    throw cancellationException;
  }
  
  public static Object g(ju2 paramju2) {
    boolean bool = false;
    while (true) {
      try {
        return paramju2.get();
      } catch (InterruptedException interruptedException) {
      
      } finally {
        if (bool)
          Thread.currentThread().interrupt(); 
      } 
    } 
  }
  
  public static void h(ju2 paramju2) {
    iu2 iu22;
    paramju2.getClass();
    for (qu2 qu2 = ru2.i.d0(paramju2); qu2 != null; qu2 = qu2.b) {
      Thread thread = qu2.a;
      if (thread != null) {
        qu2.a = null;
        LockSupport.unpark(thread);
      } 
    } 
    paramju2.e();
    iu2 iu21 = ru2.i.e0(paramju2);
    paramju2 = null;
    while (true) {
      ju2 ju21 = paramju2;
      if (iu21 != null) {
        iu22 = iu21.c;
        iu21.c = (iu2)paramju2;
        iu2 iu2 = iu21;
        iu21 = iu22;
        continue;
      } 
      break;
    } 
    while (iu22 != null) {
      Runnable runnable = iu22.a;
      iu2 iu23 = iu22.c;
      Objects.requireNonNull(runnable);
      Executor executor = iu22.b;
      Objects.requireNonNull(executor);
      j(runnable, executor);
      iu2 iu24 = iu23;
    } 
  }
  
  public static void j(Runnable paramRunnable, Executor paramExecutor) {
    try {
      paramExecutor.execute(paramRunnable);
      return;
    } catch (Exception exception) {
      Logger logger = ru2.g.b();
      Level level = Level.SEVERE;
      String str1 = String.valueOf(paramRunnable);
      String str2 = String.valueOf(paramExecutor);
      StringBuilder stringBuilder = new StringBuilder(str1.length() + 57 + str2.length());
      stringBuilder.append("RuntimeException while executing runnable ");
      stringBuilder.append(str1);
      stringBuilder.append(" with executor ");
      stringBuilder.append(str2);
      logger.logp(level, "com.google.common.util.concurrent.AbstractFuture", "executeListener", stringBuilder.toString(), exception);
      return;
    } 
  }
  
  public final void a(Runnable paramRunnable, Executor paramExecutor) {
    iu2 iu2 = iu2.d;
    if (!isDone()) {
      iu2 iu21 = this.c;
      if (iu21 != iu2) {
        iu2 iu22 = new iu2(paramRunnable, paramExecutor);
        while (true) {
          iu22.c = iu21;
          if (!ru2.i.c0(this, iu21, iu22)) {
            iu2 iu23 = this.c;
            iu21 = iu23;
            if (iu23 == iu2)
              break; 
            continue;
          } 
          return;
        } 
      } 
    } 
    j(paramRunnable, paramExecutor);
  }
  
  public final boolean cancel(boolean paramBoolean) {
    Object object = this.b;
    if (object == null) {
      gu2 gu2;
      if (ru2.h) {
        gu2 = new gu2(new CancellationException("Future.cancel() was called."), paramBoolean);
      } else {
        if (paramBoolean) {
          gu2 = gu2.c;
        } else {
          gu2 = gu2.d;
        } 
        Objects.requireNonNull(gu2);
      } 
      if (ru2.i.f0(this, object, gu2)) {
        h(this);
        return true;
      } 
    } 
    return false;
  }
  
  public void e() {}
  
  public abstract String f();
  
  public final Object get() {
    qu2 qu2 = qu2.c;
    if (!Thread.interrupted()) {
      Object object = this.b;
      if (object != null)
        return d(object); 
      object = this.e;
      if (object != qu2) {
        qu2 qu21;
        qu2 qu22 = new qu2();
        do {
          zo2 zo2 = ru2.i;
          zo2.Z(qu22, (qu2)object);
          if (zo2.b0(this, (qu2)object, qu22))
            while (true) {
              LockSupport.park(this);
              if (!Thread.interrupted()) {
                object = this.b;
                if (object != null)
                  return d(object); 
                continue;
              } 
              c(qu22);
              throw new InterruptedException();
            }  
          qu21 = this.e;
          object = qu21;
        } while (qu21 != qu2);
      } 
      object = this.b;
      Objects.requireNonNull(object);
      return d(object);
    } 
    throw new InterruptedException();
  }
  
  public final Object get(long paramLong, TimeUnit paramTimeUnit) {
    qu2 qu2 = qu2.c;
    long l = paramTimeUnit.toNanos(paramLong);
    if (!Thread.interrupted()) {
      Object object1;
      long l2;
      long l3;
      Object object2 = this.b;
      if (object2 != null)
        return d(object2); 
      long l1 = 0L;
      if (l > 0L) {
        l2 = System.nanoTime() + l;
      } else {
        l2 = 0L;
      } 
      if (l >= 1000L) {
        object2 = this.e;
        if (object2 != qu2) {
          qu2 qu21 = new qu2();
          while (true) {
            zo2 zo2 = ru2.i;
            zo2.Z(qu21, (qu2)object2);
            if (zo2.b0(this, (qu2)object2, qu21)) {
              l3 = l1;
              while (true) {
                LockSupport.parkNanos(this, Math.min(l, 2147483647999999999L));
                if (!Thread.interrupted()) {
                  object2 = this.b;
                  if (object2 != null)
                    return d(object2); 
                  l1 = l2 - System.nanoTime();
                  l = l1;
                  if (l1 < 1000L) {
                    c(qu21);
                    break;
                  } 
                  continue;
                } 
                c(qu21);
                throw new InterruptedException();
              } 
            } 
            object2 = this.e;
            if (object2 == qu2)
              // Byte code: goto -> 219 
          } 
        } else {
          object1 = this.b;
          Objects.requireNonNull(object1);
          return d(object1);
        } 
      } else {
        l3 = 0L;
        l1 = l;
      } 
      while (l1 > l3) {
        object2 = this.b;
        if (object2 != null)
          return d(object2); 
        if (!Thread.interrupted()) {
          l1 = l2 - System.nanoTime();
          continue;
        } 
        throw new InterruptedException();
      } 
      String str2 = toString();
      String str1 = object1.toString();
      object2 = Locale.ROOT;
      String str3 = str1.toLowerCase((Locale)object2);
      str1 = object1.toString().toLowerCase((Locale)object2);
      object2 = new StringBuilder(String.valueOf(paramLong).length() + 8 + String.valueOf(str1).length());
      object2.append("Waited ");
      object2.append(paramLong);
      object2.append(" ");
      object2.append(str1);
      str1 = object2.toString();
      object2 = str1;
      if (l1 + 1000L < l3) {
        int i;
        object2 = str1.concat(" (plus ");
        l1 = -l1;
        paramLong = object1.convert(l1, TimeUnit.NANOSECONDS);
        l1 -= object1.toNanos(paramLong);
        int j = paramLong cmp l3;
        if (j == 0 || l1 > 1000L) {
          i = 1;
        } else {
          i = 0;
        } 
        object1 = object2;
        if (j > 0) {
          j = object2.length();
          object1 = new StringBuilder(String.valueOf(paramLong).length() + j + 1 + String.valueOf(str3).length());
          object1.append((String)object2);
          object1.append(paramLong);
          object1.append(" ");
          object1.append(str3);
          object2 = object1.toString();
          object1 = object2;
          if (i)
            object1 = object2.concat(","); 
          object1 = object1.concat(" ");
        } 
        object2 = object1;
        if (i) {
          i = object1.length();
          object2 = new StringBuilder(String.valueOf(l1).length() + i + 13);
          object2.append((String)object1);
          object2.append(l1);
          object2.append(" nanoseconds ");
          object2 = object2.toString();
        } 
        object2 = object2.concat("delay)");
      } 
      if (isDone())
        throw new TimeoutException(object2.concat(VDgS.qBAgIUckvTyxjW)); 
      throw new TimeoutException(x41.o(new StringBuilder(object2.length() + 5 + str2.length()), object2, " for ", str2));
    } 
    throw new InterruptedException();
  }
  
  public final void i(StringBuilder paramStringBuilder) {
    try {
      object = g(this);
      paramStringBuilder.append("SUCCESS, result=[");
      if (object == null) {
        paramStringBuilder.append("null");
      } else if (object == this) {
        paramStringBuilder.append("this future");
      } else {
        paramStringBuilder.append(object.getClass().getName());
        paramStringBuilder.append("@");
        paramStringBuilder.append(Integer.toHexString(System.identityHashCode(object)));
      } 
      paramStringBuilder.append("]");
      return;
    } catch (ExecutionException null) {
    
    } catch (CancellationException null) {
      paramStringBuilder.append("CANCELLED");
      return;
    } catch (Exception object) {
      paramStringBuilder.append("UNKNOWN, cause=[");
      paramStringBuilder.append(object.getClass());
      paramStringBuilder.append(" thrown from get()]");
      return;
    } 
    paramStringBuilder.append("FAILURE, cause=[");
    paramStringBuilder.append(object.getCause());
    paramStringBuilder.append("]");
  }
  
  public final boolean isCancelled() {
    return this.b instanceof gu2;
  }
  
  public final boolean isDone() {
    return (this.b != null);
  }
  
  public final String toString() {
    // Byte code:
    //   0: new java/lang/StringBuilder
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: astore #4
    //   9: aload_0
    //   10: invokevirtual getClass : ()Ljava/lang/Class;
    //   13: invokevirtual getName : ()Ljava/lang/String;
    //   16: ldc_w 'com.google.common.util.concurrent.'
    //   19: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   22: ifeq -> 41
    //   25: aload #4
    //   27: aload_0
    //   28: invokevirtual getClass : ()Ljava/lang/Class;
    //   31: invokevirtual getSimpleName : ()Ljava/lang/String;
    //   34: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   37: pop
    //   38: goto -> 54
    //   41: aload #4
    //   43: aload_0
    //   44: invokevirtual getClass : ()Ljava/lang/Class;
    //   47: invokevirtual getName : ()Ljava/lang/String;
    //   50: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   53: pop
    //   54: aload #4
    //   56: bipush #64
    //   58: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   61: pop
    //   62: aload #4
    //   64: aload_0
    //   65: invokestatic identityHashCode : (Ljava/lang/Object;)I
    //   68: invokestatic toHexString : (I)Ljava/lang/String;
    //   71: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   74: pop
    //   75: aload #4
    //   77: ldc_w '[status='
    //   80: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   83: pop
    //   84: aload_0
    //   85: getfield b : Ljava/lang/Object;
    //   88: instanceof gu2
    //   91: ifeq -> 106
    //   94: aload #4
    //   96: ldc_w 'CANCELLED'
    //   99: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   102: pop
    //   103: goto -> 251
    //   106: aload_0
    //   107: invokevirtual isDone : ()Z
    //   110: ifeq -> 122
    //   113: aload_0
    //   114: aload #4
    //   116: invokevirtual i : (Ljava/lang/StringBuilder;)V
    //   119: goto -> 251
    //   122: aload #4
    //   124: invokevirtual length : ()I
    //   127: istore_1
    //   128: aload #4
    //   130: ldc_w 'PENDING'
    //   133: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   136: pop
    //   137: aload_0
    //   138: invokevirtual f : ()Ljava/lang/String;
    //   141: astore_3
    //   142: aload_3
    //   143: ifnull -> 155
    //   146: aload_3
    //   147: invokevirtual isEmpty : ()Z
    //   150: istore_2
    //   151: iload_2
    //   152: ifeq -> 197
    //   155: aconst_null
    //   156: astore_3
    //   157: goto -> 197
    //   160: astore_3
    //   161: aload_3
    //   162: instanceof java/lang/Error
    //   165: ifeq -> 183
    //   168: aload_3
    //   169: instanceof java/lang/StackOverflowError
    //   172: ifeq -> 178
    //   175: goto -> 183
    //   178: aload_3
    //   179: checkcast java/lang/Error
    //   182: athrow
    //   183: ldc_w 'Exception thrown from implementation: '
    //   186: aload_3
    //   187: invokevirtual getClass : ()Ljava/lang/Class;
    //   190: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   193: invokevirtual concat : (Ljava/lang/String;)Ljava/lang/String;
    //   196: astore_3
    //   197: aload_3
    //   198: ifnull -> 226
    //   201: aload #4
    //   203: getstatic com/android/billingclient/api/wH/DJqHMztxflt.mMWYi : Ljava/lang/String;
    //   206: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   209: pop
    //   210: aload #4
    //   212: aload_3
    //   213: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   216: pop
    //   217: aload #4
    //   219: ldc_w ']'
    //   222: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   225: pop
    //   226: aload_0
    //   227: invokevirtual isDone : ()Z
    //   230: ifeq -> 251
    //   233: aload #4
    //   235: iload_1
    //   236: aload #4
    //   238: invokevirtual length : ()I
    //   241: invokevirtual delete : (II)Ljava/lang/StringBuilder;
    //   244: pop
    //   245: aload_0
    //   246: aload #4
    //   248: invokevirtual i : (Ljava/lang/StringBuilder;)V
    //   251: aload #4
    //   253: ldc_w ']'
    //   256: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   259: pop
    //   260: aload #4
    //   262: invokevirtual toString : ()Ljava/lang/String;
    //   265: areturn
    // Exception table:
    //   from	to	target	type
    //   137	142	160	finally
    //   146	151	160	finally
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\ju2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
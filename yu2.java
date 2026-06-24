import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;

public final class yu2 extends AtomicReference implements Runnable {
  public static final yf0 e = new yf0(3);
  
  public static final yf0 f = new yf0(3);
  
  public final Callable b;
  
  public final zu2 c;
  
  public yu2(zu2 paramzu2, Callable paramCallable) {
    paramCallable.getClass();
    this.b = paramCallable;
  }
  
  public final void a(Thread paramThread) {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual get : ()Ljava/lang/Object;
    //   4: checkcast java/lang/Runnable
    //   7: astore #6
    //   9: aconst_null
    //   10: astore #7
    //   12: iconst_0
    //   13: istore_2
    //   14: iconst_0
    //   15: istore_3
    //   16: aload #6
    //   18: instanceof tu2
    //   21: istore #5
    //   23: getstatic yu2.f : Lyf0;
    //   26: astore #8
    //   28: iload #5
    //   30: ifne -> 52
    //   33: aload #6
    //   35: aload #8
    //   37: if_acmpne -> 43
    //   40: goto -> 59
    //   43: iload_2
    //   44: ifeq -> 51
    //   47: aload_1
    //   48: invokevirtual interrupt : ()V
    //   51: return
    //   52: aload #6
    //   54: checkcast tu2
    //   57: astore #7
    //   59: iload_3
    //   60: iconst_1
    //   61: iadd
    //   62: istore #4
    //   64: iload #4
    //   66: sipush #1000
    //   69: if_icmple -> 119
    //   72: aload #6
    //   74: aload #8
    //   76: if_acmpeq -> 92
    //   79: iload_2
    //   80: istore_3
    //   81: aload_0
    //   82: aload #6
    //   84: aload #8
    //   86: invokevirtual compareAndSet : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   89: ifeq -> 124
    //   92: invokestatic interrupted : ()Z
    //   95: ifne -> 102
    //   98: iload_2
    //   99: ifeq -> 107
    //   102: iconst_1
    //   103: istore_2
    //   104: goto -> 109
    //   107: iconst_0
    //   108: istore_2
    //   109: aload #7
    //   111: invokestatic park : (Ljava/lang/Object;)V
    //   114: iload_2
    //   115: istore_3
    //   116: goto -> 124
    //   119: invokestatic yield : ()V
    //   122: iload_2
    //   123: istore_3
    //   124: aload_0
    //   125: invokevirtual get : ()Ljava/lang/Object;
    //   128: checkcast java/lang/Runnable
    //   131: astore #6
    //   133: iload_3
    //   134: istore_2
    //   135: iload #4
    //   137: istore_3
    //   138: goto -> 16
  }
  
  public final void run() {
    Thread thread = Thread.currentThread();
    if (compareAndSet(null, (V)thread)) {
      Thread thread1;
      zu2 zu21 = this.c;
      boolean bool = zu21.isDone();
      yf0 yf01 = e;
      if (!bool) {
        try {
          thread1 = (Thread)this.b.call();
        } finally {
          Exception exception = null;
          try {
            if (exception instanceof InterruptedException)
              Thread.currentThread().interrupt(); 
          } finally {}
          if (!compareAndSet((V)thread, (V)yf01))
            a(thread); 
          thread1 = (Thread)new hu2(exception);
        } 
      } else {
        thread1 = null;
      } 
      if (!compareAndSet((V)thread, (V)yf01))
        a(thread); 
      if (!bool) {
        Object object;
        zu21.getClass();
        thread = thread1;
        if (thread1 == null)
          object = ru2.f; 
        if (ru2.i.f0(zu21, null, object))
          ju2.h(zu21); 
      } 
    } 
  }
  
  public final String toString() {
    String str1;
    Runnable runnable = (Runnable)get();
    if (runnable == e) {
      str1 = "running=[DONE]";
    } else if (str1 instanceof tu2) {
      str1 = "running=[INTERRUPTED]";
    } else if (str1 instanceof Thread) {
      str1 = ((Thread)str1).getName();
      str1 = x41.o(new StringBuilder(String.valueOf(str1).length() + 21), "running=[RUNNING ON ", str1, "]");
    } else {
      str1 = "running=[NOT STARTED YET]";
    } 
    String str3 = this.b.toString();
    String str2 = String.valueOf(str3);
    return x41.o(new StringBuilder(str1.length() + 2 + str2.length()), str1, ", ", str3);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\yu2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
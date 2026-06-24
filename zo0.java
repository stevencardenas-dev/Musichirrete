import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

public class zo0 {
  public static final AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(zo0.class, Object.class, "_cur$volatile");
  
  public static final long b = oi.a.objectFieldOffset(zo0.class.getDeclaredField("_cur$volatile"));
  
  public volatile Object _cur$volatile = new bp0(8, false);
  
  public final boolean a(Runnable paramRunnable) {
    zo0 zo01 = this;
    label19: while (true) {
      a.getClass();
      Unsafe unsafe = oi.a;
      long l = b;
      bp0 bp0 = (bp0)unsafe.getObjectVolatile(zo01, l);
      int i = bp0.a(paramRunnable);
      if (i != 0) {
        if (i != 1) {
          if (i != 2)
            continue; 
          return false;
        } 
        bp0 bp01 = bp0.d();
        while (true) {
          Unsafe unsafe1 = oi.a;
          long l1 = b;
          if (unsafe1.compareAndSwapObject(zo01, l1, bp0, bp01))
            continue label19; 
          if (unsafe1.getObjectVolatile(zo01, l) != bp0)
            continue label19; 
        } 
        break;
      } 
      return true;
    } 
  }
  
  public final void b() {
    zo0 zo01 = this;
    label15: while (true) {
      a.getClass();
      Unsafe unsafe = oi.a;
      long l = b;
      bp0 bp02 = (bp0)unsafe.getObjectVolatile(zo01, l);
      if (bp02.c())
        return; 
      bp0 bp01 = bp02.d();
      while (true) {
        Unsafe unsafe1 = oi.a;
        if (unsafe1.compareAndSwapObject(zo01, b, bp02, bp01))
          continue label15; 
        if (unsafe1.getObjectVolatile(zo01, l) != bp02)
          continue label15; 
      } 
      break;
    } 
  }
  
  public final int c() {
    a.getClass();
    bp0 bp0 = (bp0)oi.a.getObjectVolatile(this, b);
    bp0.getClass();
    long l = bp0.f.get(bp0);
    int i = (int)(0x3FFFFFFFL & l);
    return 0x3FFFFFFF & (int)((l & 0xFFFFFFFC0000000L) >> 30L) - i;
  }
  
  public final Object d() {
    zo0 zo01 = this;
    label15: while (true) {
      a.getClass();
      Unsafe unsafe = oi.a;
      long l = b;
      bp0 bp0 = (bp0)unsafe.getObjectVolatile(zo01, l);
      Object object = bp0.e();
      if (object != bp0.g)
        return object; 
      object = bp0.d();
      while (true) {
        Unsafe unsafe1 = oi.a;
        if (unsafe1.compareAndSwapObject(zo01, b, bp0, object))
          continue label15; 
        if (unsafe1.getObjectVolatile(zo01, l) != bp0)
          continue label15; 
      } 
      break;
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\zo0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
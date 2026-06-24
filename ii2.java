import java.security.AccessController;
import java.security.PrivilegedActionException;
import sun.misc.Unsafe;

public final class ii2 extends wf2 {
  public static final Unsafe s;
  
  public static final long t;
  
  public static final long u;
  
  public static final long v;
  
  public static final long w;
  
  public static final long x;
  
  static {
    try {
      Unsafe unsafe = Unsafe.getUnsafe();
    } catch (SecurityException securityException) {
      try {
        qi2 qi2 = new qi2();
        super();
        Unsafe unsafe = AccessController.<Unsafe>doPrivileged(qi2);
        try {
          u = unsafe.objectFieldOffset(li2.class.getDeclaredField("e"));
          t = unsafe.objectFieldOffset(li2.class.getDeclaredField("c"));
          v = unsafe.objectFieldOffset(li2.class.getDeclaredField("b"));
          w = unsafe.objectFieldOffset(ji2.class.getDeclaredField("a"));
          x = unsafe.objectFieldOffset(ji2.class.getDeclaredField("b"));
          s = unsafe;
          return;
        } catch (NoSuchFieldException noSuchFieldException) {
          k91.n(noSuchFieldException);
          return;
        } 
      } catch (PrivilegedActionException privilegedActionException) {
        k91.m("Could not initialize intrinsics", privilegedActionException.getCause());
        return;
      } 
    } 
    try {
      u = privilegedActionException.objectFieldOffset(li2.class.getDeclaredField("e"));
      t = privilegedActionException.objectFieldOffset(li2.class.getDeclaredField("c"));
      v = privilegedActionException.objectFieldOffset(li2.class.getDeclaredField("b"));
      w = privilegedActionException.objectFieldOffset(ji2.class.getDeclaredField("a"));
      x = privilegedActionException.objectFieldOffset(ji2.class.getDeclaredField("b"));
      s = (Unsafe)privilegedActionException;
      return;
    } catch (NoSuchFieldException noSuchFieldException) {
      k91.n(noSuchFieldException);
      return;
    } 
  }
  
  public final void B0(ji2 paramji21, ji2 paramji22) {
    s.putObject(paramji21, x, paramji22);
  }
  
  public final void D0(ji2 paramji2, Thread paramThread) {
    s.putObject(paramji2, w, paramThread);
  }
  
  public final boolean H0(kj2 paramkj2, fi2 paramfi21, fi2 paramfi22) {
    return pi2.a(s, paramkj2, t, paramfi21, paramfi22);
  }
  
  public final boolean J0(li2 paramli2, Object paramObject1, Object paramObject2) {
    return pi2.a(s, paramli2, v, paramObject1, paramObject2);
  }
  
  public final boolean K0(li2 paramli2, ji2 paramji21, ji2 paramji22) {
    return pi2.a(s, paramli2, u, paramji21, paramji22);
  }
  
  public final fi2 w0(kj2 paramkj2) {
    fi2 fi21;
    fi2 fi22 = fi2.d;
    do {
      fi21 = paramkj2.c;
    } while (fi22 != fi21 && !H0(paramkj2, fi21, fi22));
    return fi21;
  }
  
  public final ji2 x0(kj2 paramkj2) {
    ji2 ji22;
    ji2 ji21 = ji2.c;
    do {
      ji22 = paramkj2.e;
    } while (ji21 != ji22 && !K0(paramkj2, ji22, ji21));
    return ji22;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\ii2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
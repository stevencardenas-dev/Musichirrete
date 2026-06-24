import java.security.AccessController;
import java.security.PrivilegedActionException;
import org.jaudiotagger.audio.dsf.qdA.GMDx;
import org.jaudiotagger.audio.exceptions.yb.zLtYiJUm;
import sun.misc.Unsafe;

public final class pu2 extends zo2 {
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
        Unsafe unsafe = AccessController.<Unsafe>doPrivileged(su2.a);
        try {
          u = unsafe.objectFieldOffset(ru2.class.getDeclaredField(GMDx.WStTMJjWeNt));
          t = unsafe.objectFieldOffset(ru2.class.getDeclaredField(zLtYiJUm.PNvOAXEqsVox));
          v = unsafe.objectFieldOffset(ru2.class.getDeclaredField("b"));
          w = unsafe.objectFieldOffset(qu2.class.getDeclaredField("a"));
          x = unsafe.objectFieldOffset(qu2.class.getDeclaredField("b"));
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
      u = privilegedActionException.objectFieldOffset(ru2.class.getDeclaredField(GMDx.WStTMJjWeNt));
      t = privilegedActionException.objectFieldOffset(ru2.class.getDeclaredField(zLtYiJUm.PNvOAXEqsVox));
      v = privilegedActionException.objectFieldOffset(ru2.class.getDeclaredField("b"));
      w = privilegedActionException.objectFieldOffset(qu2.class.getDeclaredField("a"));
      x = privilegedActionException.objectFieldOffset(qu2.class.getDeclaredField("b"));
      s = (Unsafe)privilegedActionException;
      return;
    } catch (NoSuchFieldException noSuchFieldException) {
      k91.n(noSuchFieldException);
      return;
    } 
  }
  
  public final void W(qu2 paramqu2, Thread paramThread) {
    s.putObject(paramqu2, w, paramThread);
  }
  
  public final void Z(qu2 paramqu21, qu2 paramqu22) {
    s.putObject(paramqu21, x, paramqu22);
  }
  
  public final boolean b0(ru2 paramru2, qu2 paramqu21, qu2 paramqu22) {
    return ou2.a(s, paramru2, u, paramqu21, paramqu22);
  }
  
  public final boolean c0(ru2 paramru2, iu2 paramiu21, iu2 paramiu22) {
    return nu2.a(s, paramru2, t, paramiu21, paramiu22);
  }
  
  public final qu2 d0(ju2 paramju2) {
    qu2 qu21;
    qu2 qu22 = qu2.c;
    do {
      qu21 = paramju2.e;
    } while (qu22 != qu21 && !b0(paramju2, qu21, qu22));
    return qu21;
  }
  
  public final iu2 e0(ju2 paramju2) {
    iu2 iu21;
    iu2 iu22 = iu2.d;
    do {
      iu21 = paramju2.c;
    } while (iu22 != iu21 && !c0(paramju2, iu21, iu22));
    return iu21;
  }
  
  public final boolean f0(ru2 paramru2, Object paramObject1, Object paramObject2) {
    return mu2.a(s, paramru2, v, paramObject1, paramObject2);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\pu2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
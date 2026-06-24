import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public abstract class wk2 extends yj2 {
  public static final Map zzb = new ConcurrentHashMap<Object, Object>();
  
  public nm2 zzc;
  
  public int zzd;
  
  public wk2() {
    this.zza = 0;
    this.zzd = -1;
    this.zzc = nm2.f;
  }
  
  public static void f(Class<?> paramClass, wk2 paramwk2) {
    paramwk2.e();
    zzb.put(paramClass, paramwk2);
  }
  
  public static final boolean i(wk2 paramwk2, boolean paramBoolean) {
    byte b = ((Byte)paramwk2.j(1)).byteValue();
    if (b == 1)
      return true; 
    if (b == 0)
      return false; 
    boolean bool = bm2.c.a(paramwk2.getClass()).h(paramwk2);
    if (paramBoolean)
      paramwk2.j(2); 
    return bool;
  }
  
  public static wk2 m(Class paramClass) {
    Map<ClassNotFoundException, wk2> map = zzb;
    wk2 wk22 = (wk2)map.get(paramClass);
    wk2 wk21 = wk22;
    if (wk22 == null)
      try {
        Class.forName(paramClass.getName(), true, paramClass.getClassLoader());
        wk21 = (wk2)map.get(paramClass);
      } catch (ClassNotFoundException classNotFoundException) {
        throw new IllegalStateException("Class initialization cannot fail.", classNotFoundException);
      }  
    if (wk21 == null) {
      wk21 = (wk2)((wk2)wm2.g((Class)classNotFoundException)).j(6);
      if (wk21 != null) {
        map.put(classNotFoundException, wk21);
        return wk21;
      } 
      throw new IllegalStateException();
    } 
    return wk21;
  }
  
  public static Object o(Method paramMethod, wk2 paramwk2, Object... paramVarArgs) {
    try {
      return paramMethod.invoke(paramwk2, paramVarArgs);
    } catch (IllegalAccessException illegalAccessException) {
      k91.m("Couldn't use Java reflection to implement protocol message reflection.", illegalAccessException);
      return null;
    } catch (InvocationTargetException invocationTargetException) {
      Throwable throwable = invocationTargetException.getCause();
      if (!(throwable instanceof RuntimeException)) {
        if (!(throwable instanceof Error)) {
          k91.m("Unexpected exception thrown by generated accessor method.", throwable);
          return null;
        } 
        throw (Error)throwable;
      } 
      throw (RuntimeException)throwable;
    } 
  }
  
  public final void a(ik2 paramik2) {
    a42 a421;
    em2 em2 = bm2.c.a(getClass());
    a42 a422 = paramik2.a;
    if (a422 != null) {
      a421 = a422;
    } else {
      a421 = new a42((ik2)a421);
    } 
    em2.i(this, a421);
  }
  
  public final int c(em2 paramem2) {
    if (h()) {
      int j = paramem2.g(this);
      if (j >= 0)
        return j; 
      tp.f(ga1.i("serialized size must be non-negative, was ", j));
      return 0;
    } 
    int i = this.zzd & Integer.MAX_VALUE;
    if (i == Integer.MAX_VALUE) {
      i = paramem2.g(this);
      if (i >= 0) {
        this.zzd = this.zzd & Integer.MIN_VALUE | i;
        return i;
      } 
      tp.f(ga1.i("serialized size must be non-negative, was ", i));
      return 0;
    } 
    return i;
  }
  
  public final int d() {
    if (h()) {
      int j = bm2.c.a(getClass()).g(this);
      if (j >= 0)
        return j; 
      tp.f(ga1.i("serialized size must be non-negative, was ", j));
      return 0;
    } 
    int i = this.zzd & Integer.MAX_VALUE;
    if (i != Integer.MAX_VALUE)
      return i; 
    i = bm2.c.a(getClass()).g(this);
    if (i >= 0) {
      this.zzd = this.zzd & Integer.MIN_VALUE | i;
      return i;
    } 
    tp.f(ga1.i("serialized size must be non-negative, was ", i));
    return 0;
  }
  
  public final void e() {
    this.zzd &= Integer.MAX_VALUE;
  }
  
  public final boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject == null || getClass() != paramObject.getClass())
      return false; 
    Class<?> clazz = getClass();
    return bm2.c.a(clazz).d(this, (wk2)paramObject);
  }
  
  public final void g() {
    this.zzd = this.zzd & Integer.MIN_VALUE | Integer.MAX_VALUE;
  }
  
  public final boolean h() {
    return ((this.zzd & Integer.MIN_VALUE) != 0);
  }
  
  public final int hashCode() {
    if (!h()) {
      int j = this.zza;
      int i = j;
      if (j == 0) {
        i = bm2.c.a(getClass()).e(this);
        this.zza = i;
      } 
      return i;
    } 
    return bm2.c.a(getClass()).e(this);
  }
  
  public abstract Object j(int paramInt);
  
  public final uk2 k() {
    return (uk2)j(5);
  }
  
  public final uk2 l() {
    uk2 uk2 = (uk2)j(5);
    if (!uk2.b.equals(this)) {
      if (!uk2.c.h()) {
        wk2 wk22 = uk2.b.n();
        wk2 wk23 = uk2.c;
        bm2.c.a(wk22.getClass()).c(wk22, wk23);
        uk2.c = wk22;
      } 
      wk2 wk21 = uk2.c;
      bm2.c.a(wk21.getClass()).c(wk21, this);
    } 
    return uk2;
  }
  
  public final wk2 n() {
    return (wk2)j(4);
  }
  
  public final String toString() {
    String str = super.toString();
    char[] arrayOfChar = wl2.a;
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("# ");
    stringBuilder.append(str);
    wl2.c(this, stringBuilder, 0);
    return stringBuilder.toString();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\wk2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
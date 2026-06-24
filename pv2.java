import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public abstract class pv2 extends av2 {
  public static final Map zzd = new ConcurrentHashMap<Object, Object>();
  
  public int zzb;
  
  public kc2 zzc;
  
  public pv2() {
    this.zza = 0;
    this.zzb = -1;
    this.zzc = kc2.e;
  }
  
  public static pv2 f(Class paramClass) {
    Map<ClassNotFoundException, pv2> map = zzd;
    pv2 pv22 = (pv2)map.get(paramClass);
    pv2 pv21 = pv22;
    if (pv22 == null)
      try {
        Class.forName(paramClass.getName(), true, paramClass.getClassLoader());
        pv21 = (pv2)map.get(paramClass);
      } catch (ClassNotFoundException classNotFoundException) {
        throw new IllegalStateException("Class initialization cannot fail.", classNotFoundException);
      }  
    if (pv21 == null) {
      pv21 = (pv2)((pv2)pc2.e((Class)classNotFoundException)).i(6, null);
      if (pv21 != null) {
        map.put(classNotFoundException, pv21);
        return pv21;
      } 
      throw new IllegalStateException();
    } 
    return pv21;
  }
  
  public static void g(Class<?> paramClass, pv2 parampv2) {
    parampv2.k();
    zzd.put(paramClass, parampv2);
  }
  
  public static Object h(Method paramMethod, pv2 parampv2, Object... paramVarArgs) {
    try {
      return paramMethod.invoke(parampv2, paramVarArgs);
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
  
  public final int a() {
    if (j()) {
      int j = gw2.c.a(getClass()).d(this);
      if (j >= 0)
        return j; 
      ck2.a(String.valueOf(j).length() + 42, j);
      return 0;
    } 
    int i = this.zzb & Integer.MAX_VALUE;
    if (i != Integer.MAX_VALUE)
      return i; 
    i = gw2.c.a(getClass()).d(this);
    if (i >= 0) {
      this.zzb = this.zzb & Integer.MIN_VALUE | i;
      return i;
    } 
    ck2.a(String.valueOf(i).length() + 42, i);
    return 0;
  }
  
  public final int b(jw2 paramjw2) {
    if (j()) {
      int j = paramjw2.d(this);
      if (j >= 0)
        return j; 
      ck2.a(String.valueOf(j).length() + 42, j);
      return 0;
    } 
    int i = this.zzb & Integer.MAX_VALUE;
    if (i == Integer.MAX_VALUE) {
      i = paramjw2.d(this);
      if (i >= 0) {
        this.zzb = this.zzb & Integer.MIN_VALUE | i;
        return i;
      } 
      ck2.a(String.valueOf(i).length() + 42, i);
      return 0;
    } 
    return i;
  }
  
  public final ov2 d() {
    return (ov2)i(5, null);
  }
  
  public final void e() {
    this.zzb = this.zzb & Integer.MIN_VALUE | Integer.MAX_VALUE;
  }
  
  public final boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject == null || getClass() != paramObject.getClass())
      return false; 
    Class<?> clazz = getClass();
    return gw2.c.a(clazz).g(this, (pv2)paramObject);
  }
  
  public final int hashCode() {
    if (!j()) {
      int j = this.zza;
      int i = j;
      if (j == 0) {
        i = gw2.c.a(getClass()).b(this);
        this.zza = i;
      } 
      return i;
    } 
    return gw2.c.a(getClass()).b(this);
  }
  
  public abstract Object i(int paramInt, pv2 parampv2);
  
  public final boolean j() {
    return ((this.zzb & Integer.MIN_VALUE) != 0);
  }
  
  public final void k() {
    this.zzb &= Integer.MAX_VALUE;
  }
  
  public final String toString() {
    String str = super.toString();
    char[] arrayOfChar = cw2.a;
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("# ");
    stringBuilder.append(str);
    cw2.b(this, stringBuilder, 0);
    return stringBuilder.toString();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\pv2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
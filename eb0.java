import java.lang.reflect.InvocationTargetException;

public final class eb0 {
  public static final zm1 b = new zm1(0);
  
  public final lb0 a;
  
  public eb0(lb0 paramlb0) {
    this.a = paramlb0;
  }
  
  public static Class b(ClassLoader paramClassLoader, String paramString) {
    zm1 zm13 = b;
    zm1 zm12 = (zm1)zm13.get(paramClassLoader);
    zm1 zm11 = zm12;
    if (zm12 == null) {
      zm11 = new zm1(0);
      zm13.put(paramClassLoader, zm11);
    } 
    Class clazz = (Class)zm11.get(paramString);
    if (clazz == null) {
      Class<?> clazz1 = Class.forName(paramString, false, paramClassLoader);
      zm11.put(paramString, clazz1);
      return clazz1;
    } 
    return clazz;
  }
  
  public static Class c(ClassLoader paramClassLoader, String paramString) {
    try {
      return b(paramClassLoader, paramString);
    } catch (ClassNotFoundException classNotFoundException) {
      throw new RuntimeException(x41.w("Unable to instantiate fragment ", paramString, ": make sure class name exists"), classNotFoundException);
    } catch (ClassCastException classCastException) {
      throw new RuntimeException(x41.w("Unable to instantiate fragment ", paramString, ": make sure class is a valid subclass of Fragment"), classCastException);
    } 
  }
  
  public final ua0 a(String paramString) {
    x5 x5 = this.a.w.l;
    try {
      return c(x5.getClassLoader(), paramString).getConstructor(null).newInstance(null);
    } catch (InstantiationException instantiationException) {
    
    } catch (IllegalAccessException illegalAccessException) {
    
    } catch (NoSuchMethodException noSuchMethodException) {
    
    } catch (InvocationTargetException invocationTargetException) {}
    throw new RuntimeException(x41.w("Unable to instantiate fragment ", paramString, ": make sure class name exists, is public, and has an empty constructor that is public"), invocationTargetException);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\eb0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
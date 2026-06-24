public abstract class ne1 {
  public static final oe1 a;
  
  static {
    Object object = null;
    try {
      oe1 oe11 = (oe1)Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
      object = oe11;
    } catch (ClassCastException|ClassNotFoundException|InstantiationException|IllegalAccessException classCastException) {}
    if (object == null)
      object = new Object(); 
    a = (oe1)object;
  }
  
  public static ll a(Class paramClass) {
    a.getClass();
    return new ll(paramClass);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\ne1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
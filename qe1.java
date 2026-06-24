import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public final class qe1 extends ws2 {
  public final Method s = Class.class.getMethod("isRecord", null);
  
  public final Method t = Class.class.getMethod("getRecordComponents", null);
  
  public final Method u;
  
  public final Method v;
  
  public qe1() {
    super(19);
    Class<?> clazz = Class.forName("java.lang.reflect.RecordComponent");
    this.u = clazz.getMethod("getName", null);
    this.v = clazz.getMethod("getType", null);
  }
  
  public final Method F(Class paramClass, Field paramField) {
    try {
      return paramClass.getMethod(paramField.getName(), null);
    } catch (ReflectiveOperationException reflectiveOperationException) {
      k91.m("Unexpected ReflectiveOperationException occurred (Gson 2.14.0). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", reflectiveOperationException);
      return null;
    } 
  }
  
  public final Constructor H(Class paramClass) {
    Class[] arrayOfClass;
    try {
      Object[] arrayOfObject = (Object[])this.t.invoke(paramClass, null);
      arrayOfClass = new Class[arrayOfObject.length];
      for (byte b = 0; b < arrayOfObject.length; b++)
        arrayOfClass[b] = (Class)this.v.invoke(arrayOfObject[b], null); 
    } catch (ReflectiveOperationException reflectiveOperationException) {}
    return reflectiveOperationException.getDeclaredConstructor(arrayOfClass);
  }
  
  public final String[] R(Class paramClass) {
    try {
      Object[] arrayOfObject = (Object[])this.t.invoke(paramClass, null);
      String[] arrayOfString = new String[arrayOfObject.length];
      for (byte b = 0; b < arrayOfObject.length; b++)
        arrayOfString[b] = (String)this.u.invoke(arrayOfObject[b], null); 
    } catch (ReflectiveOperationException reflectiveOperationException) {}
    return (String[])reflectiveOperationException;
  }
  
  public final boolean V(Class paramClass) {
    try {
      return ((Boolean)this.s.invoke(paramClass, null)).booleanValue();
    } catch (ReflectiveOperationException reflectiveOperationException) {
      k91.m("Unexpected ReflectiveOperationException occurred (Gson 2.14.0). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", reflectiveOperationException);
      return false;
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\qe1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
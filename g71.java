import java.lang.reflect.Method;

public abstract class g71 {
  public static final Method a;
  
  static {
    Method method;
    Method[] arrayOfMethod = Throwable.class.getMethods();
    arrayOfMethod.getClass();
    int i = arrayOfMethod.length;
    boolean bool = false;
    byte b = 0;
    while (true) {
      Class clazz1 = null;
      Class clazz2 = null;
      if (b < i) {
        Method method1 = arrayOfMethod[b];
        if (ui0.c(method1.getName(), "addSuppressed")) {
          Class[] arrayOfClass = method1.getParameterTypes();
          arrayOfClass.getClass();
          clazz1 = clazz2;
          if (arrayOfClass.length == 1)
            clazz1 = arrayOfClass[0]; 
          if (ui0.c(clazz1, Throwable.class)) {
            method = method1;
            break;
          } 
        } 
        b++;
        continue;
      } 
      break;
    } 
    a = method;
    i = arrayOfMethod.length;
    for (b = bool; b < i && !ui0.c(arrayOfMethod[b].getName(), "getSuppressed"); b++);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\g71.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
import android.app.Application;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;

public abstract class wi1 {
  public static final List a = om.h0((Object[])new Class[] { Application.class, mi1.class });
  
  public static final List b = zo2.E(mi1.class);
  
  public static final Constructor a(Class paramClass, List<?> paramList) {
    paramList.getClass();
    Constructor[] arrayOfConstructor = (Constructor[])paramClass.getConstructors();
    arrayOfConstructor.getClass();
    int i = arrayOfConstructor.length;
    byte b = 0;
    while (b < i) {
      Constructor constructor = arrayOfConstructor[b];
      Class[] arrayOfClass = constructor.getParameterTypes();
      arrayOfClass.getClass();
      List list = g9.J0((Object[])arrayOfClass);
      if (paramList.equals(list))
        return constructor; 
      if (paramList.size() != list.size() || !list.containsAll(paramList)) {
        b++;
        continue;
      } 
      String str = paramClass.getSimpleName();
      StringBuilder stringBuilder = new StringBuilder("Class ");
      stringBuilder.append(str);
      stringBuilder.append(" must have parameters in the proper order: ");
      stringBuilder.append(paramList);
      throw new UnsupportedOperationException(stringBuilder.toString());
    } 
    return null;
  }
  
  public static final g32 b(Class paramClass, Constructor<g32> paramConstructor, Object... paramVarArgs) {
    try {
      return paramConstructor.newInstance(Arrays.copyOf(paramVarArgs, paramVarArgs.length));
    } catch (IllegalAccessException illegalAccessException) {
    
    } catch (InstantiationException instantiationException) {
    
    } catch (InvocationTargetException invocationTargetException) {}
    StringBuilder stringBuilder = new StringBuilder("A ");
    stringBuilder.append(paramClass);
    stringBuilder.append(" cannot be instantiated.");
    throw new RuntimeException(stringBuilder.toString(), instantiationException);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\wi1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
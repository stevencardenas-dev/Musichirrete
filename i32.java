import android.app.Application;
import java.lang.reflect.InvocationTargetException;

public final class i32 extends zb0 {
  public static i32 i;
  
  public static final fb0 j = (fb0)new Object();
  
  public final Application h;
  
  public i32(Application paramApplication) {
    super(19);
    this.h = paramApplication;
  }
  
  public final g32 a(Class paramClass) {
    Application application = this.h;
    if (application != null)
      return q(paramClass, application); 
    tp.j("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
    return null;
  }
  
  public final g32 g(Class<?> paramClass, uz0 paramuz0) {
    if (this.h != null)
      return a(paramClass); 
    fb0 fb01 = j;
    Application application = (Application)paramuz0.a.get(fb01);
    if (application != null)
      return q(paramClass, application); 
    if (!w4.class.isAssignableFrom(paramClass))
      return zo2.h(paramClass); 
    l0.l("CreationExtras must have an application by `APPLICATION_KEY`");
    return null;
  }
  
  public final g32 q(Class<?> paramClass, Application paramApplication) {
    if (w4.class.isAssignableFrom(paramClass)) {
      try {
        g32 g32 = paramClass.getConstructor(new Class[] { Application.class }).newInstance(new Object[] { paramApplication });
        g32.getClass();
        return g32;
      } catch (NoSuchMethodException noSuchMethodException) {
      
      } catch (IllegalAccessException illegalAccessException) {
      
      } catch (InstantiationException instantiationException) {
      
      } catch (InvocationTargetException invocationTargetException) {}
      k91.l("Cannot create an instance of ", paramClass, invocationTargetException);
      return null;
    } 
    return zo2.h(paramClass);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\i32.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
import android.window.ldG.XUaAMlaMSa;
import java.lang.reflect.Method;

public final class n02 extends r02 {
  public final Method b;
  
  public final Object c;
  
  public n02(Method paramMethod, Object paramObject) {
    this.b = paramMethod;
    this.c = paramObject;
  }
  
  public final Object a(Class paramClass) {
    Object object = g7.d(paramClass);
    if (object == null) {
      object = this.c;
      return this.b.invoke(object, new Object[] { paramClass });
    } 
    throw new AssertionError(XUaAMlaMSa.nTCxVgXo.concat(object));
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\n02.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
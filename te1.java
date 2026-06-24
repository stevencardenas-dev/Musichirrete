import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.jaudiotagger.audio.opus.bsQ.uvJYmft;

public final class te1 {
  public final String a;
  
  public final Field b;
  
  public final String c;
  
  public final Method d;
  
  public final jy1 e;
  
  public final jy1 f;
  
  public final boolean g;
  
  public final boolean h;
  
  public te1(String paramString, Field paramField, Method paramMethod, jy1 paramjy11, jy1 paramjy12, boolean paramBoolean1, boolean paramBoolean2) {
    this.d = paramMethod;
    this.e = paramjy11;
    this.f = paramjy12;
    this.g = paramBoolean1;
    this.h = paramBoolean2;
    this.a = paramString;
    this.b = paramField;
    this.c = paramField.getName();
  }
  
  public final void a(cl0 paramcl0, Object paramObject) {
    Object object;
    Method method = this.d;
    if (method != null) {
      try {
        object = method.invoke(paramObject, null);
      } catch (InvocationTargetException invocationTargetException) {
        throw new RuntimeException(x41.w("Accessor ", re1.d(method, false), uvJYmft.bRhUjQdIrVqtMW), invocationTargetException.getCause());
      } 
    } else {
      object = this.b.get(paramObject);
    } 
    if (object == paramObject)
      return; 
    invocationTargetException.l(this.a);
    this.e.c((cl0)invocationTargetException, object);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\te1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
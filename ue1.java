import java.util.Iterator;
import java.util.Map;

public abstract class ue1 extends jy1 {
  public final we1 a;
  
  public ue1(we1 paramwe1) {
    this.a = paramwe1;
  }
  
  public final Object b(tk0 paramtk0) {
    if (paramtk0.C() == 9) {
      paramtk0.y();
      return null;
    } 
    Object object = d();
    Map map = this.a.a;
    try {
      paramtk0.c();
      while (paramtk0.o()) {
        te1 te1 = (te1)map.get(paramtk0.w());
        if (te1 == null) {
          paramtk0.K();
          continue;
        } 
        f(object, paramtk0, te1);
      } 
      paramtk0.k();
      return e(object);
    } catch (IllegalStateException illegalStateException) {
      throw new RuntimeException(illegalStateException);
    } catch (IllegalAccessException illegalAccessException) {
      ws2 ws2 = re1.a;
      k91.m("Unexpected IllegalAccessException occurred (Gson 2.14.0). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", illegalAccessException);
      return null;
    } 
  }
  
  public final void c(cl0 paramcl0, Object paramObject) {
    if (paramObject == null) {
      paramcl0.o();
      return;
    } 
    paramcl0.d();
    try {
      Iterator<te1> iterator = this.a.b.iterator();
      while (iterator.hasNext())
        ((te1)iterator.next()).a(paramcl0, paramObject); 
      paramcl0.k();
      return;
    } catch (IllegalAccessException illegalAccessException) {
      paramObject = re1.a;
      k91.m("Unexpected IllegalAccessException occurred (Gson 2.14.0). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", illegalAccessException);
      return;
    } 
  }
  
  public abstract Object d();
  
  public abstract Object e(Object paramObject);
  
  public abstract void f(Object paramObject, tk0 paramtk0, te1 paramte1);
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar\\ue1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
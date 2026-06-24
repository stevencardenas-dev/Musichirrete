import java.lang.reflect.Array;
import java.util.ArrayList;

public final class f9 extends jy1 {
  public static final e9 c = new e9();
  
  public final Class a;
  
  public final sj0 b;
  
  public f9(my parammy, jy1 paramjy1, Class paramClass) {
    this.b = new sj0(parammy, paramjy1, paramClass, 2);
    this.a = paramClass;
  }
  
  public final Object b(tk0 paramtk0) {
    if (paramtk0.C() == 9) {
      paramtk0.y();
      return null;
    } 
    ArrayList<Object> arrayList = new ArrayList();
    paramtk0.a();
    while (paramtk0.o())
      arrayList.add(this.b.c.b(paramtk0)); 
    paramtk0.h();
    int i = arrayList.size();
    Object object = this.a;
    if (object.isPrimitive()) {
      object = Array.newInstance((Class<?>)object, i);
      for (byte b = 0; b < i; b++)
        Array.set(object, b, arrayList.get(b)); 
      return object;
    } 
    return arrayList.toArray((Object[])Array.newInstance((Class<?>)object, i));
  }
  
  public final void c(cl0 paramcl0, Object paramObject) {
    if (paramObject == null) {
      paramcl0.o();
      return;
    } 
    paramcl0.c();
    int i = Array.getLength(paramObject);
    for (byte b = 0; b < i; b++) {
      Object object = Array.get(paramObject, b);
      this.b.c(paramcl0, object);
    } 
    paramcl0.h();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\f9.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
import java.lang.reflect.Field;

public final class ve1 extends ue1 {
  public final e31 b;
  
  public ve1(e31 parame31, we1 paramwe1) {
    super(paramwe1);
    this.b = parame31;
  }
  
  public final Object d() {
    return this.b.d();
  }
  
  public final Object e(Object paramObject) {
    return paramObject;
  }
  
  public final void f(Object paramObject, tk0 paramtk0, te1 paramte1) {
    Field field = paramte1.b;
    Object object = paramte1.f.b(paramtk0);
    if (object != null || !paramte1.g) {
      if (!paramte1.h) {
        field.set(paramObject, object);
        return;
      } 
      throw new RuntimeException("Cannot set value of 'static final' ".concat(re1.d(field, false)));
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\ve1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
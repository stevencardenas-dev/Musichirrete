import java.util.List;

public final class fm0 implements sm0 {
  public final int b;
  
  public final Object c;
  
  public final Object e;
  
  public fm0(sm0 paramsm0) {
    this.c = paramsm0;
    ol ol = ol.c;
    Class<?> clazz = paramsm0.getClass();
    ml ml = (ml)ol.a.get(clazz);
    if (ml == null)
      ml = ol.a(clazz, null); 
    this.e = ml;
  }
  
  public fm0(w31 paramw31, b41 paramb41, wm0 paramwm0) {
    this.e = paramw31;
    this.c = paramwm0;
  }
  
  public fm0(wm0 paramwm0, j01 paramj01) {
    this.c = paramwm0;
    this.e = paramj01;
  }
  
  public final void a(um0 paramum0, om0 paramom0) {
    w31 w31;
    int i = this.b;
    Object object1 = this.c;
    Object object2 = this.e;
    switch (i) {
      default:
        object2 = object2;
        object1 = object1;
        object2 = ((ml)object2).a;
        ml.a((List)object2.get(paramom0), paramum0, paramom0, (sm0)object1);
        ml.a((List)object2.get(om0.ON_ANY), paramum0, paramom0, (sm0)object1);
        return;
      case 1:
        w31 = (w31)object2;
        i = a41.a[paramom0.ordinal()];
        if (i != 1) {
          if (i != 2) {
            if (i == 3) {
              w31.a();
              ((wm0)object1).g(this);
            } 
          } else {
            w31.b(false);
          } 
        } else {
          w31.b(true);
        } 
        return;
      case 0:
        break;
    } 
    if (paramom0 == om0.ON_START) {
      ((wm0)object1).g(this);
      ((j01)object2).B();
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\fm0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
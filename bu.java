import android.content.Context;

public final class bu implements w92 {
  public Context b;
  
  public cu a() {
    Context context = this.b;
    if (context != null) {
      Object object1 = new Object();
      ((cu)object1).b = a10.a(qz1.c);
      s0 s0 = new s0(context);
      ((cu)object1).c = s0;
      ((cu)object1).e = a10.a(new g7(28, s0, new gh1(20, s0)));
      s0 = ((cu)object1).c;
      ((cu)object1).f = new t50(s0, 1);
      fb1 fb11 = a10.a(new t50(s0, 0));
      fb1 fb12 = a10.a(new j01(((cu)object1).f, fb11, 7, false));
      ((cu)object1).g = fb12;
      Object object2 = new Object();
      fb11 = ((cu)object1).c;
      object2 = new zv0(fb11, fb12, object2, 12);
      fb1 fb13 = ((cu)object1).b;
      fb1 fb14 = ((cu)object1).e;
      cn cn = new cn(fb13, fb14, object2, fb12, fb12);
      Object object3 = new Object();
      ((rv1)object3).b = fb11;
      ((rv1)object3).c = fb14;
      ((rv1)object3).e = fb12;
      ((rv1)object3).f = object2;
      ((rv1)object3).g = fb13;
      ((rv1)object3).h = fb12;
      ((rv1)object3).i = fb12;
      ((cu)object1).h = a10.a(new zv0(cn, object3, new n2(fb13, fb12, object2, fb12, 17), 14));
      return (cu)object1;
    } 
    String str = Context.class.getCanonicalName();
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(str);
    stringBuilder.append(" must be set");
    throw new IllegalStateException(stringBuilder.toString());
  }
  
  public Object c() {
    return this.b;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\bu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
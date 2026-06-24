import android.view.View;
import java.util.Iterator;

public final class f32 extends pg1 implements ad0, id0 {
  public final int c = 2;
  
  public int e;
  
  public Object f;
  
  public final View g;
  
  public f32(View paramView, cs paramcs) {
    super(paramcs);
  }
  
  public final int b() {
    return this.c;
  }
  
  public final Object g(Object paramObject1, Object paramObject2) {
    paramObject1 = paramObject1;
    return ((f32)l((cs)paramObject2, paramObject1)).n(l02.a);
  }
  
  public final cs l(cs paramcs, Object paramObject) {
    paramcs = new f32(this.g, paramcs);
    ((f32)paramcs).f = paramObject;
    return paramcs;
  }
  
  public final Object n(Object paramObject) {
    int i = this.e;
    View view = this.g;
    ys ys = ys.b;
    if (i != 0) {
      l02 l02 = l02.a;
      if (i != 1) {
        if (i == 2) {
          dd1.r0(paramObject);
          return l02;
        } 
        tp.f("call to 'resume' before 'invoke' with coroutine");
        return null;
      } 
      ok1 ok1 = (ok1)this.f;
      dd1.r0(paramObject);
      if (view instanceof android.view.ViewGroup) {
        paramObject = view;
        this.f = null;
        this.e = 2;
        ok1.getClass();
        paramObject = new xw1(new q(2, paramObject));
        if (!((xw1)paramObject).c.hasNext()) {
          paramObject = l02;
        } else {
          ok1.e = (Iterator)paramObject;
          ok1.b = 2;
          ok1.f = this;
          paramObject = ys;
        } 
        if (paramObject != ys)
          paramObject = l02; 
        if (paramObject == ys)
          return ys; 
      } 
      return l02;
    } 
    dd1.r0(paramObject);
    paramObject = this.f;
    this.f = paramObject;
    this.e = 1;
    ((ok1)paramObject).c = view;
    ((ok1)paramObject).b = 3;
    ((ok1)paramObject).f = this;
    return ys;
  }
  
  public final String toString() {
    if (this.b == null) {
      ne1.a.getClass();
      return oe1.a(this);
    } 
    return super.toString();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\f32.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
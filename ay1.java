import android.util.Size;
import java.util.concurrent.CancellationException;

public final class ay1 extends pr1 implements ad0 {
  public int g;
  
  public Object h;
  
  public final vj0 i;
  
  public final by1 j;
  
  public final Size k;
  
  public final float l;
  
  public ay1(vj0 paramvj0, by1 paramby1, Size paramSize, float paramFloat, cs paramcs) {
    super(2, paramcs);
  }
  
  public final Object g(Object paramObject1, Object paramObject2) {
    paramObject1 = paramObject1;
    return ((ay1)l((cs)paramObject2, paramObject1)).n(l02.a);
  }
  
  public final cs l(cs paramcs, Object paramObject) {
    Size size = this.k;
    float f = this.l;
    paramcs = new ay1(this.i, this.j, size, f, paramcs);
    ((ay1)paramcs).h = paramObject;
    return paramcs;
  }
  
  public final Object n(Object paramObject) {
    xs xs = (xs)this.h;
    int i = this.g;
    Object object = this.j;
    ys ys = ys.b;
    if (i != 0) {
      if (i != 1) {
        if (i == 2) {
          try {
            dd1.r0(paramObject);
          } catch (CancellationException cancellationException) {
          
          } finally {}
        } else {
          tp.f("call to 'resume' before 'invoke' with coroutine");
          return null;
        } 
      } else {
        dd1.r0(paramObject);
        paramObject = this.k;
        float f = this.l;
        this.h = null;
        this.g = 2;
        paramObject = by1.e((by1)object, (Size)paramObject, f, xs, this);
      } 
    } else {
      dd1.r0(paramObject);
      paramObject = this.i;
      if (paramObject != null) {
        this.h = xs;
        this.g = 1;
        if (g92.k((vj0)paramObject, this) == ys)
          return ys; 
      } 
      paramObject = this.k;
      float f = this.l;
      this.h = null;
      this.g = 2;
      paramObject = by1.e((by1)object, (Size)paramObject, f, xs, this);
    } 
    paramObject = ((by1)object).c;
    do {
      object = paramObject.f();
    } while (!paramObject.e(object, cy1.a((cy1)object, null, 0.0F, 0.0F, 0.0F, null, 0.0F, null, null, null, null, null, null, null, null, null, null, null, null, 2095103)));
    return l02.a;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\ay1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
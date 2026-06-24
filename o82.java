import java.util.concurrent.CancellationException;

public final class o82 extends pr1 implements ad0 {
  public final int g;
  
  public int h;
  
  public final q82 i;
  
  public final Object g(Object paramObject1, Object paramObject2) {
    int i = this.g;
    l02 l02 = l02.a;
    paramObject1 = paramObject1;
    paramObject2 = paramObject2;
    switch (i) {
      default:
        return ((o82)l((cs)paramObject2, paramObject1)).n(l02);
      case 0:
        break;
    } 
    return ((o82)l((cs)paramObject2, paramObject1)).n(l02);
  }
  
  public final cs l(cs paramcs, Object paramObject) {
    int i = this.g;
    paramObject = this.i;
    switch (i) {
      default:
        return new o82((q82)paramObject, paramcs, 1);
      case 0:
        break;
    } 
    return new o82((q82)paramObject, paramcs, 0);
  }
  
  public final Object n(Object paramObject) {
    int i = this.g;
    ys ys = ys.b;
    q82 q821 = this.i;
    switch (i) {
      default:
        i = this.h;
        if (i != 0) {
          if (i == 1) {
            try {
              dd1.r0(paramObject);
              paramObject = paramObject;
            } catch (g82 g82) {
            
            } catch (CancellationException cancellationException) {
            
            } finally {
              ys = null;
              paramObject = s82.a;
              qp0.h().g((String)paramObject, "Unexpected error in WorkerWrapper", (Throwable)ys);
            } 
          } else {
            tp.f("call to 'resume' before 'invoke' with coroutine");
            return null;
          } 
        } else {
          dd1.r0(paramObject);
          paramObject = q821.m;
          o82 o821 = new o82();
          this(q821, null, 0);
          this.h = 1;
          Object object = qv.l0((os)paramObject, o821, this);
          paramObject = object;
          if (object == ys)
            return ys; 
          paramObject = paramObject;
        } 
        paramObject = q821.h.n(new n82((m82)paramObject, q821));
        paramObject.getClass();
        return paramObject;
      case 0:
        break;
    } 
    i = this.h;
    if (i != 0) {
      if (i == 1) {
        dd1.r0(paramObject);
      } else {
        tp.f("call to 'resume' before 'invoke' with coroutine");
        paramObject = null;
      } 
    } else {
      dd1.r0(paramObject);
      this.h = 1;
      Object object = q82.a(q821, this);
      paramObject = object;
      if (object == ys)
        paramObject = ys; 
    } 
    return paramObject;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\o82.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
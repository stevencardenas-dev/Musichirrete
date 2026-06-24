import androidx.work.CoroutineWorker;

public final class ct extends pr1 implements ad0 {
  public final int g;
  
  public int h;
  
  public final CoroutineWorker i;
  
  public final Object g(Object paramObject1, Object paramObject2) {
    int i = this.g;
    l02 l02 = l02.a;
    paramObject1 = paramObject1;
    paramObject2 = paramObject2;
    switch (i) {
      default:
        return ((ct)l((cs)paramObject2, paramObject1)).n(l02);
      case 0:
        break;
    } 
    ((ct)l((cs)paramObject2, paramObject1)).n(l02);
    return l02;
  }
  
  public final cs l(cs paramcs, Object paramObject) {
    int i = this.g;
    paramObject = this.i;
    switch (i) {
      default:
        return new ct((CoroutineWorker)paramObject, paramcs, 1);
      case 0:
        break;
    } 
    return new ct((CoroutineWorker)paramObject, paramcs, 0);
  }
  
  public final Object n(Object paramObject) {
    switch (this.g) {
      default:
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
          Object object = this.i.c(this);
          ys ys = ys.b;
          paramObject = object;
          if (object == ys)
            paramObject = ys; 
        } 
        return paramObject;
      case 0:
        break;
    } 
    int i = this.h;
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
      tp.f("Not implemented");
      paramObject = null;
    } 
    return paramObject;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\ct.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
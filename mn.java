import java.util.concurrent.atomic.AtomicInteger;

public final class mn extends pr1 implements ad0 {
  public int g;
  
  public final w80[] h;
  
  public final int i;
  
  public final AtomicInteger j;
  
  public final lh k;
  
  public mn(w80[] paramArrayOfw80, int paramInt, AtomicInteger paramAtomicInteger, lh paramlh, cs paramcs) {
    super(2, paramcs);
  }
  
  public final Object g(Object paramObject1, Object paramObject2) {
    paramObject1 = paramObject1;
    return ((mn)l((cs)paramObject2, paramObject1)).n(l02.a);
  }
  
  public final cs l(cs paramcs, Object paramObject) {
    paramObject = this.j;
    lh lh1 = this.k;
    return new mn(this.h, this.i, (AtomicInteger)paramObject, lh1, paramcs);
  }
  
  public final Object n(Object paramObject) {
    int i = this.g;
    AtomicInteger atomicInteger = this.j;
    lh lh1 = this.k;
    if (i != 0) {
      if (i == 1) {
        try {
          dd1.r0(paramObject);
        } finally {}
      } else {
        tp.f("call to 'resume' before 'invoke' with coroutine");
        return null;
      } 
    } else {
      dd1.r0(paramObject);
      paramObject = this.h;
      i = this.i;
      Object object = paramObject[i];
      paramObject = new ln();
      super(lh1, i);
      this.g = 1;
      object = object.a((x80)paramObject, this);
      paramObject = ys.b;
      if (object == paramObject)
        return paramObject; 
    } 
    if (atomicInteger.decrementAndGet() == 0)
      lh1.f(null); 
    return l02.a;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\mn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
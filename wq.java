import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicInteger;

public final class wq extends pr1 implements ad0 {
  public ho0 g;
  
  public bp1 h;
  
  public int i;
  
  public Object j;
  
  public final oo0 k;
  
  public final bv0 l;
  
  public final y72 m;
  
  public wq(oo0 paramoo0, bv0 parambv0, y72 paramy72, cs paramcs) {
    super(2, paramcs);
  }
  
  public final Object g(Object paramObject1, Object paramObject2) {
    paramObject1 = paramObject1;
    return ((wq)l((cs)paramObject2, paramObject1)).n(l02.a);
  }
  
  public final cs l(cs paramcs, Object paramObject) {
    bv0 bv01 = this.l;
    y72 y721 = this.m;
    paramcs = new wq(this.k, bv01, y721, paramcs);
    ((wq)paramcs).j = paramObject;
    return paramcs;
  }
  
  public final Object n(Object paramObject) {
    bp1 bp12;
    int i = this.i;
    oo0 oo01 = this.k;
    boolean bool = true;
    if (i != 0) {
      if (i == 1) {
        bp12 = this.h;
        ho0 ho02 = this.g;
        AtomicInteger atomicInteger2 = (AtomicInteger)this.j;
        bp1 bp14 = bp12;
        bp1 bp15 = bp12;
        ho0 ho01 = ho02;
        AtomicInteger atomicInteger1 = atomicInteger2;
        try {
          dd1.r0(paramObject);
          ho01 = ho02;
          atomicInteger1 = atomicInteger2;
        } catch (CancellationException cancellationException) {
          bp12 = bp15;
        } finally {}
      } else {
        tp.f("call to 'resume' before 'invoke' with coroutine");
        return null;
      } 
    } else {
      dd1.r0(paramObject);
      xs xs = (xs)this.j;
      AtomicInteger atomicInteger = new AtomicInteger(-256);
      paramObject = oo01.b();
      bp12 = qv.L(xs, null, null, new vq(this.l, this.m, atomicInteger, paramObject, null, 0), 3);
      xs = bp12;
      try {
        this.j = atomicInteger;
        xs = bp12;
        this.g = (ho0)paramObject;
        xs = bp12;
        this.h = bp12;
        xs = bp12;
        this.i = 1;
        xs = bp12;
        Object object1 = ws2.e((ho0)paramObject, this);
        ys ys = ys.b;
        if (object1 == ys)
          return ys; 
        Object object2 = paramObject;
        paramObject = object1;
        bp1 bp14 = bp12;
        object1 = bp12;
        paramObject = paramObject;
        bp12.c(null);
        return paramObject;
      } catch (CancellationException cancellationException) {
        Object object = paramObject;
        paramObject = bp12;
        String str = dr.a;
        paramObject = bp12;
        qp0 qp0 = qp0.h();
        paramObject = bp12;
        StringBuilder stringBuilder = new StringBuilder();
        paramObject = bp12;
        this("Delegated worker ");
        paramObject = bp12;
        stringBuilder.append(oo01.getClass());
        paramObject = bp12;
        stringBuilder.append(" was cancelled");
        paramObject = bp12;
        qp0.d(str, stringBuilder.toString(), cancellationException);
        paramObject = bp12;
        if (atomicInteger.get() == -256)
          bool = false; 
        paramObject = bp12;
        if (object.isCancelled() && bool) {
          paramObject = bp12;
          cancellationException = new sq();
          paramObject = bp12;
          super(atomicInteger.get());
          paramObject = bp12;
          throw cancellationException;
        } 
        paramObject = bp12;
        throw cancellationException;
      } 
    } 
    bp1 bp11 = bp12;
    bp1 bp13 = bp12;
    paramObject = paramObject;
    bp12.c(null);
    return paramObject;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\wq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
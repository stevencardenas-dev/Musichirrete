import java.util.concurrent.CancellationException;

public final class pa1 extends m implements dk, lk1 {
  public final lh h;
  
  public pa1(os paramos, lh paramlh) {
    super(paramos, true);
    this.h = paramlh;
  }
  
  public final Object b(cs paramcs, Object paramObject) {
    return this.h.b(paramcs, paramObject);
  }
  
  public final void c(CancellationException paramCancellationException) {
    if (N())
      return; 
    CancellationException cancellationException = paramCancellationException;
    if (paramCancellationException == null)
      cancellationException = new wj0(x(), null, this); 
    v(cancellationException);
  }
  
  public final void h0(Throwable paramThrowable, boolean paramBoolean) {
    if (!this.h.h(paramThrowable, false) && !paramBoolean)
      m92.G(this.g, paramThrowable); 
  }
  
  public final void i0(Object paramObject) {
    paramObject = paramObject;
    this.h.f(null);
  }
  
  public final ih iterator() {
    lh lh1 = this.h;
    lh1.getClass();
    return new ih(lh1);
  }
  
  public final Object m() {
    return this.h.m();
  }
  
  public final Object n(Object paramObject) {
    return this.h.n(paramObject);
  }
  
  public final Object p(nn paramnn) {
    lh lh1 = this.h;
    lh1.getClass();
    return lh.E(lh1, paramnn);
  }
  
  public final void v(CancellationException paramCancellationException) {
    this.h.h(paramCancellationException, true);
    u(paramCancellationException);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\pa1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
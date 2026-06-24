import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public final class xz0 implements li, e52 {
  public final ni b;
  
  public final yz0 c;
  
  public xz0(yz0 paramyz0, ni paramni) {
    this.c = paramyz0;
    this.b = paramni;
  }
  
  public final void a(ek1 paramek1, int paramInt) {
    this.b.a(paramek1, paramInt);
  }
  
  public final os e() {
    return this.b.g;
  }
  
  public final void f(Object paramObject) {
    this.b.f(paramObject);
  }
  
  public final void i(Object paramObject, bd0 parambd0) {
    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = yz0.l;
    paramObject = this.c;
    atomicReferenceFieldUpdater.set(paramObject, null);
    l l = new l((yz0)paramObject, this);
    paramObject = this.b;
    int i = ((zz)paramObject).e;
    mi mi = new mi(0, l);
    paramObject.G(l02.a, i, mi);
  }
  
  public final f1 j(Object paramObject, bd0 parambd0) {
    l02 l02 = (l02)paramObject;
    paramObject = this.c;
    parambd0 = new mi((yz0)paramObject, this);
    f1 f1 = this.b.J(l02, parambd0);
    if (f1 != null)
      yz0.l.set(paramObject, null); 
    return f1;
  }
  
  public final void q(Object paramObject) {
    this.b.q(paramObject);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\xz0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
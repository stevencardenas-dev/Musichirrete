import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

public final class nn0 implements Iterator {
  public pn0 b;
  
  public pn0 c;
  
  public int e;
  
  public final qn0 f;
  
  public final int g;
  
  public nn0(qn0 paramqn0, int paramInt) {
    this.f = paramqn0;
    this.b = paramqn0.h.f;
    this.c = null;
    this.e = paramqn0.g;
  }
  
  public final Object a() {
    return b();
  }
  
  public final pn0 b() {
    pn0 pn01 = this.b;
    qn0 qn01 = this.f;
    if (pn01 != qn01.h) {
      if (qn01.g == this.e) {
        this.b = pn01.f;
        this.c = pn01;
        return pn01;
      } 
      throw new ConcurrentModificationException();
    } 
    throw new NoSuchElementException();
  }
  
  public final boolean hasNext() {
    return (this.b != this.f.h);
  }
  
  public Object next() {
    switch (this.g) {
      default:
        return a();
      case 1:
        break;
    } 
    return (b()).h;
  }
  
  public final void remove() {
    pn0 pn01 = this.c;
    if (pn01 != null) {
      qn0 qn01 = this.f;
      qn01.c(pn01, true);
      this.c = null;
      this.e = qn01.g;
      return;
    } 
    throw new IllegalStateException();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\nn0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
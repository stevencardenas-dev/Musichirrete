import java.util.Iterator;

public final class fi1 extends ii1 implements Iterator {
  public gi1 b;
  
  public gi1 c;
  
  public final int e;
  
  public fi1(gi1 paramgi11, gi1 paramgi12, int paramInt) {
    this.b = paramgi12;
    this.c = paramgi11;
  }
  
  public final void a(gi1 paramgi1) {
    gi1 gi11 = this.b;
    gi1 gi12 = null;
    if (gi11 == paramgi1 && paramgi1 == this.c) {
      this.c = null;
      this.b = null;
    } 
    gi11 = this.b;
    if (gi11 == paramgi1) {
      switch (this.e) {
        default:
          gi11 = gi11.e;
          break;
        case 0:
          gi11 = gi11.f;
          break;
      } 
      this.b = gi11;
    } 
    gi11 = this.c;
    if (gi11 == paramgi1) {
      gi1 gi13 = this.b;
      paramgi1 = gi12;
      if (gi11 != gi13)
        if (gi13 == null) {
          paramgi1 = gi12;
        } else {
          paramgi1 = b(gi11);
        }  
      this.c = paramgi1;
    } 
  }
  
  public final gi1 b(gi1 paramgi1) {
    switch (this.e) {
      default:
        return paramgi1.f;
      case 0:
        break;
    } 
    return paramgi1.e;
  }
  
  public final boolean hasNext() {
    return (this.c != null);
  }
  
  public final Object next() {
    gi1 gi12 = this.c;
    gi1 gi11 = this.b;
    if (gi12 == gi11 || gi11 == null) {
      gi11 = null;
      this.c = gi11;
      return gi12;
    } 
    gi11 = b(gi12);
    this.c = gi11;
    return gi12;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\fi1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
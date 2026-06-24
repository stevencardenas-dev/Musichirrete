import java.util.Iterator;
import java.util.NoSuchElementException;

public final class ek2 implements Iterator {
  public final int b;
  
  public int c;
  
  public final int e;
  
  public final Object f;
  
  public ek2(gk2 paramgk2) {
    this.f = paramgk2;
    this.c = 0;
    this.e = paramgk2.f();
  }
  
  public ek2(hv2 paramhv2) {
    this.f = paramhv2;
    this.c = 0;
    this.e = paramhv2.e();
  }
  
  public final boolean hasNext() {
    boolean bool;
    switch (this.b) {
      default:
        if (this.c < this.e) {
          bool = true;
        } else {
          bool = false;
        } 
        return bool;
      case 0:
        break;
    } 
    if (this.c < this.e) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public final Object next() {
    int j = this.b;
    Object object = this.f;
    int i = this.e;
    switch (j) {
      default:
        j = this.c;
        if (j < i) {
          this.c = j + 1;
          return Byte.valueOf(((hv2)object).d(j));
        } 
        throw new NoSuchElementException();
      case 0:
        break;
    } 
    j = this.c;
    if (j < i) {
      this.c = j + 1;
      return Byte.valueOf(((gk2)object).d(j));
    } 
    throw new NoSuchElementException();
  }
  
  public final void remove() {
    switch (this.b) {
      default:
        throw new UnsupportedOperationException();
      case 0:
        break;
    } 
    throw new UnsupportedOperationException();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\ek2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
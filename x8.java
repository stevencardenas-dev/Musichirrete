import java.util.Iterator;
import java.util.NoSuchElementException;

public final class x8 implements Iterator, fl0 {
  public int b;
  
  public int c;
  
  public boolean e;
  
  public final int f;
  
  public final Object g;
  
  public x8(int paramInt) {
    this.b = paramInt;
  }
  
  public x8(b9 paramb9, int paramInt) {
    this(paramb9.e);
  }
  
  public x8(d9 paramd9) {
    this(paramd9.e);
  }
  
  public final boolean hasNext() {
    return (this.c < this.b);
  }
  
  public final Object next() {
    if (hasNext()) {
      int j = this.c;
      int i = this.f;
      Object object = this.g;
      switch (i) {
        default:
          object = ((d9)object).c[j];
          this.c++;
          this.e = true;
          return object;
        case 1:
          object = ((b9)object).i(j);
          this.c++;
          this.e = true;
          return object;
        case 0:
          break;
      } 
      object = ((b9)object).f(j);
      this.c++;
      this.e = true;
      return object;
    } 
    throw new NoSuchElementException();
  }
  
  public final void remove() {
    if (this.e) {
      int j = this.c - 1;
      this.c = j;
      int i = this.f;
      Object object = this.g;
      switch (i) {
        default:
          ((d9)object).c(j);
          break;
        case 1:
          ((b9)object).g(j);
          break;
        case 0:
          ((b9)object).g(j);
          break;
      } 
      this.b--;
      this.e = false;
      return;
    } 
    tp.f("Call next() before removing an element.");
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\x8.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
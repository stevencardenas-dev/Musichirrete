import java.util.Iterator;
import java.util.NoSuchElementException;

public final class td0 implements Iterator, fl0 {
  public Object b;
  
  public int c;
  
  public final zx e;
  
  public td0(zx paramzx) {
    this.e = paramzx;
    this.c = -2;
  }
  
  public final void a() {
    int i = this.c;
    Object object = this.e;
    if (i == -2) {
      object = ((i2)((zx)object).b).a();
    } else {
      object = ((zx)object).c;
      Object object1 = this.b;
      object1.getClass();
      object = object.h(object1);
    } 
    this.b = object;
    if (object == null) {
      i = 0;
    } else {
      i = 1;
    } 
    this.c = i;
  }
  
  public final boolean hasNext() {
    if (this.c < 0)
      a(); 
    return (this.c == 1);
  }
  
  public final Object next() {
    if (this.c < 0)
      a(); 
    if (this.c != 0) {
      Object object = this.b;
      object.getClass();
      this.c = -1;
      return object;
    } 
    throw new NoSuchElementException();
  }
  
  public final void remove() {
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\td0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
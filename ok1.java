import java.util.Iterator;
import java.util.NoSuchElementException;

public final class ok1 implements Iterator, cs, fl0 {
  public int b;
  
  public Object c;
  
  public Iterator e;
  
  public cs f;
  
  public final RuntimeException a() {
    int i = this.b;
    if (i != 4) {
      if (i != 5) {
        StringBuilder stringBuilder = new StringBuilder("Unexpected state of the iterator: ");
        stringBuilder.append(this.b);
        return new IllegalStateException(stringBuilder.toString());
      } 
      return new IllegalStateException("Iterator has failed.");
    } 
    return new NoSuchElementException();
  }
  
  public final os e() {
    return b40.b;
  }
  
  public final void f(Object paramObject) {
    dd1.r0(paramObject);
    this.b = 4;
  }
  
  public final boolean hasNext() {
    while (true) {
      int i = this.b;
      if (i != 0) {
        if (i != 1) {
          if (i != 2 && i != 3) {
            if (i == 4)
              return false; 
            throw a();
          } 
          return true;
        } 
        Iterator iterator = this.e;
        iterator.getClass();
        if (iterator.hasNext()) {
          this.b = 2;
          return true;
        } 
        this.e = null;
      } 
      this.b = 5;
      cs cs1 = this.f;
      cs1.getClass();
      this.f = null;
      cs1.f(l02.a);
    } 
  }
  
  public final Object next() {
    int i = this.b;
    if (i != 0 && i != 1) {
      if (i != 2) {
        if (i == 3) {
          this.b = 0;
          Object object = this.c;
          this.c = null;
          return object;
        } 
        throw a();
      } 
      this.b = 1;
      Iterator iterator = this.e;
      iterator.getClass();
      return iterator.next();
    } 
    if (hasNext())
      return next(); 
    throw new NoSuchElementException();
  }
  
  public final void remove() {
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\ok1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
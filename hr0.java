import java.util.Iterator;
import java.util.NoSuchElementException;

public final class hr0 extends jr0 implements Iterator, fl0 {
  public final int g;
  
  public final Object next() {
    int i = this.g;
    Object object = this.f;
    switch (i) {
      default:
        a();
        i = this.b;
        object = object;
        if (i < ((kr0)object).h) {
          this.b = i + 1;
          this.c = i;
          Object[] arrayOfObject = ((kr0)object).c;
          arrayOfObject.getClass();
          object = arrayOfObject[this.c];
          d();
          return object;
        } 
        throw new NoSuchElementException();
      case 1:
        a();
        i = this.b;
        object = object;
        if (i < ((kr0)object).h) {
          this.b = i + 1;
          this.c = i;
          object = ((kr0)object).b[i];
          d();
          return object;
        } 
        throw new NoSuchElementException();
      case 0:
        break;
    } 
    a();
    i = this.b;
    object = object;
    if (i < ((kr0)object).h) {
      this.b = i + 1;
      this.c = i;
      object = new ir0((kr0)object, i);
      d();
      return object;
    } 
    throw new NoSuchElementException();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\hr0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
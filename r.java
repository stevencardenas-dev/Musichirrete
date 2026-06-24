import java.util.ListIterator;
import java.util.NoSuchElementException;

public final class r extends q implements ListIterator {
  public final t f;
  
  public r(t paramt, int paramInt) {
    super(0, paramt);
    int i = paramt.c();
    if (paramInt >= 0 && paramInt <= i) {
      this.c = paramInt;
      return;
    } 
    m60.m(ga1.j("index: ", paramInt, i, ", size: "));
    throw null;
  }
  
  public final void add(Object paramObject) {
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
  
  public final boolean hasPrevious() {
    return (this.c > 0);
  }
  
  public final int nextIndex() {
    return this.c;
  }
  
  public final Object previous() {
    if (hasPrevious()) {
      int i = this.c - 1;
      this.c = i;
      return this.f.get(i);
    } 
    throw new NoSuchElementException();
  }
  
  public final int previousIndex() {
    return this.c - 1;
  }
  
  public final void set(Object paramObject) {
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
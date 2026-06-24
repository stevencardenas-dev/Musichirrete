import java.util.ListIterator;
import java.util.NoSuchElementException;

public final class c40 implements fl0, ListIterator {
  public static final c40 b = (c40)new Object();
  
  public final boolean hasNext() {
    return false;
  }
  
  public final boolean hasPrevious() {
    return false;
  }
  
  public final Object next() {
    throw new NoSuchElementException();
  }
  
  public final int nextIndex() {
    return 0;
  }
  
  public final Object previous() {
    throw new NoSuchElementException();
  }
  
  public final int previousIndex() {
    return -1;
  }
  
  public final void remove() {
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\c40.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
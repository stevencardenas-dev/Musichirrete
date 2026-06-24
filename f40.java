import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public final class f40 implements Serializable, Set, fl0 {
  public static final f40 b = (f40)new Object();
  
  public final boolean addAll(Collection paramCollection) {
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
  
  public final void clear() {
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
  
  public final boolean containsAll(Collection paramCollection) {
    paramCollection.getClass();
    return paramCollection.isEmpty();
  }
  
  public final boolean equals(Object paramObject) {
    return (paramObject instanceof Set && ((Set)paramObject).isEmpty());
  }
  
  public final int hashCode() {
    return 0;
  }
  
  public final boolean isEmpty() {
    return true;
  }
  
  public final Iterator iterator() {
    return c40.b;
  }
  
  public final boolean remove(Object paramObject) {
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
  
  public final boolean removeAll(Collection paramCollection) {
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
  
  public final boolean retainAll(Collection paramCollection) {
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
  
  public final Object[] toArray() {
    return wf2.h0(this);
  }
  
  public final Object[] toArray(Object[] paramArrayOfObject) {
    paramArrayOfObject.getClass();
    return wf2.i0(this, paramArrayOfObject);
  }
  
  public final String toString() {
    return "[]";
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\f40.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
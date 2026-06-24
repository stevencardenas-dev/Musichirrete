import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;

public final class mr0 extends AbstractCollection implements Collection, fl0 {
  public final kr0 b;
  
  public mr0(kr0 paramkr0) {
    this.b = paramkr0;
  }
  
  public final boolean add(Object paramObject) {
    throw new UnsupportedOperationException();
  }
  
  public final boolean addAll(Collection paramCollection) {
    paramCollection.getClass();
    throw new UnsupportedOperationException();
  }
  
  public final void clear() {
    this.b.clear();
  }
  
  public final boolean contains(Object paramObject) {
    return this.b.containsValue(paramObject);
  }
  
  public final boolean isEmpty() {
    return this.b.isEmpty();
  }
  
  public final Iterator iterator() {
    kr0 kr01 = this.b;
    kr01.getClass();
    return new hr0(kr01, 2);
  }
  
  public final boolean remove(Object paramObject) {
    kr0 kr01 = this.b;
    kr01.c();
    int i = kr01.h(paramObject);
    if (i < 0)
      return false; 
    kr01.k(i);
    return true;
  }
  
  public final boolean removeAll(Collection<?> paramCollection) {
    paramCollection.getClass();
    this.b.c();
    return super.removeAll(paramCollection);
  }
  
  public final boolean retainAll(Collection<?> paramCollection) {
    paramCollection.getClass();
    this.b.c();
    return super.retainAll(paramCollection);
  }
  
  public final int size() {
    return this.b.k;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\mr0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
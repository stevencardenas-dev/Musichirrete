import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public abstract class t implements List, Collection, fl0 {
  public final void add(int paramInt, Object paramObject) {
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
  
  public final boolean add(Object paramObject) {
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
  
  public final boolean addAll(int paramInt, Collection paramCollection) {
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
  
  public final boolean addAll(Collection paramCollection) {
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
  
  public abstract int c();
  
  public final void clear() {
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
  
  public boolean contains(Object paramObject) {
    if (super.isEmpty())
      return false; 
    Iterator<?> iterator = super.iterator();
    while (iterator.hasNext()) {
      if (ui0.c(iterator.next(), paramObject))
        return true; 
    } 
    return false;
  }
  
  public final boolean containsAll(Collection paramCollection) {
    paramCollection.getClass();
    if (paramCollection.isEmpty())
      return true; 
    Iterator iterator = paramCollection.iterator();
    while (iterator.hasNext()) {
      if (!contains(iterator.next()))
        return false; 
    } 
    return true;
  }
  
  public final boolean equals(Object<?> paramObject) {
    if (paramObject == this)
      return true; 
    if (!(paramObject instanceof List))
      return false; 
    paramObject = paramObject;
    if (super.size() != paramObject.size())
      return false; 
    Iterator iterator = paramObject.iterator();
    paramObject = (Object<?>)super.iterator();
    while (paramObject.hasNext()) {
      if (!ui0.c(paramObject.next(), iterator.next()))
        continue; 
    } 
    return true;
  }
  
  public final int hashCode() {
    Iterator<?> iterator = super.iterator();
    int i;
    for (i = 1; iterator.hasNext(); i = i * 31 + b) {
      byte b;
      Object object = iterator.next();
      if (object != null) {
        b = object.hashCode();
      } else {
        b = 0;
      } 
    } 
    return i;
  }
  
  public int indexOf(Object paramObject) {
    Iterator<?> iterator = super.iterator();
    for (byte b = 0; iterator.hasNext(); b++) {
      if (ui0.c(iterator.next(), paramObject))
        return b; 
    } 
    return -1;
  }
  
  public final boolean isEmpty() {
    return (c() == 0);
  }
  
  public final Iterator iterator() {
    return new q(0, this);
  }
  
  public int lastIndexOf(Object paramObject) {
    ListIterator<?> listIterator = super.listIterator(super.size());
    while (listIterator.hasPrevious()) {
      if (ui0.c(listIterator.previous(), paramObject))
        return listIterator.nextIndex(); 
    } 
    return -1;
  }
  
  public final ListIterator listIterator() {
    return new r(this, 0);
  }
  
  public final ListIterator listIterator(int paramInt) {
    return new r(this, paramInt);
  }
  
  public final Object remove(int paramInt) {
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
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
  
  public final Object set(int paramInt, Object paramObject) {
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
  
  public List subList(int paramInt1, int paramInt2) {
    return new s(this, paramInt1, paramInt2);
  }
  
  public final Object[] toArray() {
    return wf2.h0(this);
  }
  
  public final Object[] toArray(Object[] paramArrayOfObject) {
    paramArrayOfObject.getClass();
    return wf2.i0(this, paramArrayOfObject);
  }
  
  public final String toString() {
    return nm.p0(this, ", ", "[", "]", new l(0, this), 24);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
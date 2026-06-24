import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;

public final class a9 implements Collection {
  public final b9 b;
  
  public a9(b9 paramb9) {
    this.b = paramb9;
  }
  
  public final boolean add(Object paramObject) {
    throw new UnsupportedOperationException();
  }
  
  public final boolean addAll(Collection paramCollection) {
    throw new UnsupportedOperationException();
  }
  
  public final void clear() {
    this.b.clear();
  }
  
  public final boolean contains(Object paramObject) {
    return (this.b.a(paramObject) >= 0);
  }
  
  public final boolean containsAll(Collection paramCollection) {
    Iterator iterator = paramCollection.iterator();
    while (iterator.hasNext()) {
      if (!contains(iterator.next()))
        return false; 
    } 
    return true;
  }
  
  public final boolean isEmpty() {
    return this.b.isEmpty();
  }
  
  public final Iterator iterator() {
    return new x8(this.b, 1);
  }
  
  public final boolean remove(Object paramObject) {
    b9 b91 = this.b;
    int i = b91.a(paramObject);
    if (i >= 0) {
      b91.g(i);
      return true;
    } 
    return false;
  }
  
  public final boolean removeAll(Collection paramCollection) {
    b9 b91 = this.b;
    int j = b91.e;
    int i = 0;
    boolean bool = false;
    while (i < j) {
      int m = j;
      int k = i;
      if (paramCollection.contains(b91.i(i))) {
        b91.g(i);
        k = i - 1;
        m = j - 1;
        bool = true;
      } 
      i = k + 1;
      j = m;
    } 
    return bool;
  }
  
  public final boolean retainAll(Collection paramCollection) {
    b9 b91 = this.b;
    int j = b91.e;
    int i = 0;
    boolean bool = false;
    while (i < j) {
      int m = j;
      int k = i;
      if (!paramCollection.contains(b91.i(i))) {
        b91.g(i);
        k = i - 1;
        m = j - 1;
        bool = true;
      } 
      i = k + 1;
      j = m;
    } 
    return bool;
  }
  
  public final int size() {
    return this.b.e;
  }
  
  public final Object[] toArray() {
    b9 b91 = this.b;
    int i = b91.e;
    Object[] arrayOfObject = new Object[i];
    for (byte b = 0; b < i; b++)
      arrayOfObject[b] = b91.i(b); 
    return arrayOfObject;
  }
  
  public final Object[] toArray(Object[] paramArrayOfObject) {
    b9 b91 = this.b;
    int i = b91.e;
    Object[] arrayOfObject = paramArrayOfObject;
    if (paramArrayOfObject.length < i)
      arrayOfObject = (Object[])Array.newInstance(paramArrayOfObject.getClass().getComponentType(), i); 
    for (byte b = 0; b < i; b++)
      arrayOfObject[b] = b91.i(b); 
    if (arrayOfObject.length > i)
      arrayOfObject[i] = null; 
    return arrayOfObject;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\a9.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
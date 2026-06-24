import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public final class y8 implements Set {
  public final b9 b;
  
  public y8(b9 paramb9) {
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
    return this.b.containsKey(paramObject);
  }
  
  public final boolean containsAll(Collection paramCollection) {
    return this.b.j(paramCollection);
  }
  
  public final boolean equals(Object paramObject) {
    b9 b91 = this.b;
    if (this == paramObject)
      return true; 
    if (paramObject instanceof Set) {
      paramObject = paramObject;
      try {
        if (b91.e == paramObject.size()) {
          boolean bool = b91.j((Collection)paramObject);
          if (bool)
            return true; 
        } 
      } catch (NullPointerException|ClassCastException nullPointerException) {}
    } 
    return false;
  }
  
  public final int hashCode() {
    b9 b91 = this.b;
    int j = b91.e - 1;
    int i = 0;
    while (j >= 0) {
      int k;
      Object object = b91.f(j);
      if (object == null) {
        k = 0;
      } else {
        k = object.hashCode();
      } 
      i += k;
      j--;
    } 
    return i;
  }
  
  public final boolean isEmpty() {
    return this.b.isEmpty();
  }
  
  public final Iterator iterator() {
    return new x8(this.b, 0);
  }
  
  public final boolean remove(Object paramObject) {
    b9 b91 = this.b;
    int i = b91.d(paramObject);
    if (i >= 0) {
      b91.g(i);
      return true;
    } 
    return false;
  }
  
  public final boolean removeAll(Collection paramCollection) {
    return this.b.k(paramCollection);
  }
  
  public final boolean retainAll(Collection paramCollection) {
    b9 b91 = this.b;
    int j = b91.e;
    for (int i = j - 1; i >= 0; i--) {
      if (!paramCollection.contains(b91.f(i)))
        b91.g(i); 
    } 
    return (j != b91.e);
  }
  
  public final int size() {
    return this.b.e;
  }
  
  public final Object[] toArray() {
    b9 b91 = this.b;
    int i = b91.e;
    Object[] arrayOfObject = new Object[i];
    for (byte b = 0; b < i; b++)
      arrayOfObject[b] = b91.f(b); 
    return arrayOfObject;
  }
  
  public final Object[] toArray(Object[] paramArrayOfObject) {
    b9 b91 = this.b;
    int i = b91.e;
    Object[] arrayOfObject = paramArrayOfObject;
    if (paramArrayOfObject.length < i)
      arrayOfObject = (Object[])Array.newInstance(paramArrayOfObject.getClass().getComponentType(), i); 
    for (byte b = 0; b < i; b++)
      arrayOfObject[b] = b91.f(b); 
    if (arrayOfObject.length > i)
      arrayOfObject[i] = null; 
    return arrayOfObject;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\y8.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
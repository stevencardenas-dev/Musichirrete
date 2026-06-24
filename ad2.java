import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Spliterator;
import java.util.Spliterators;

public abstract class ad2 extends AbstractCollection implements Serializable {
  public static final Object[] c = new Object[0];
  
  public static final Object[] e = new Object[0];
  
  public final int b;
  
  public final boolean add(Object paramObject) {
    switch (this.b) {
      default:
        throw new UnsupportedOperationException();
      case 0:
        break;
    } 
    throw new UnsupportedOperationException();
  }
  
  public final boolean addAll(Collection paramCollection) {
    switch (this.b) {
      default:
        throw new UnsupportedOperationException();
      case 0:
        break;
    } 
    throw new UnsupportedOperationException();
  }
  
  public Object[] c() {
    switch (this.b) {
      default:
        return null;
      case 0:
        break;
    } 
    return null;
  }
  
  public final void clear() {
    switch (this.b) {
      default:
        throw new UnsupportedOperationException();
      case 0:
        break;
    } 
    throw new UnsupportedOperationException();
  }
  
  public int d() {
    switch (this.b) {
      default:
        throw new UnsupportedOperationException();
      case 0:
        break;
    } 
    throw new UnsupportedOperationException();
  }
  
  public int e() {
    switch (this.b) {
      default:
        throw new UnsupportedOperationException();
      case 0:
        break;
    } 
    throw new UnsupportedOperationException();
  }
  
  public abstract int f(Object[] paramArrayOfObject);
  
  public final boolean remove(Object paramObject) {
    switch (this.b) {
      default:
        throw new UnsupportedOperationException();
      case 0:
        break;
    } 
    throw new UnsupportedOperationException();
  }
  
  public final boolean removeAll(Collection paramCollection) {
    switch (this.b) {
      default:
        throw new UnsupportedOperationException();
      case 0:
        break;
    } 
    throw new UnsupportedOperationException();
  }
  
  public final boolean retainAll(Collection paramCollection) {
    switch (this.b) {
      default:
        throw new UnsupportedOperationException();
      case 0:
        break;
    } 
    throw new UnsupportedOperationException();
  }
  
  public final Spliterator spliterator() {
    switch (this.b) {
      default:
        return Spliterators.spliterator(this, 1296);
      case 0:
        break;
    } 
    return Spliterators.spliterator(this, 1296);
  }
  
  public final Object[] toArray() {
    switch (this.b) {
      default:
        return toArray(e);
      case 0:
        break;
    } 
    return toArray(c);
  }
  
  public final Object[] toArray(Object[] paramArrayOfObject) {
    Object[] arrayOfObject;
    switch (this.b) {
      default:
        paramArrayOfObject.getClass();
        j = size();
        i = paramArrayOfObject.length;
        if (i < j) {
          arrayOfObject = c();
          if (arrayOfObject == null) {
            arrayOfObject = paramArrayOfObject;
            if (i != 0)
              arrayOfObject = Arrays.copyOf(paramArrayOfObject, 0); 
            arrayOfObject = Arrays.copyOf(arrayOfObject, j);
          } else {
            return Arrays.copyOfRange(arrayOfObject, d(), e(), (Class)paramArrayOfObject.getClass());
          } 
        } else {
          arrayOfObject = paramArrayOfObject;
          if (i > j) {
            paramArrayOfObject[j] = null;
            arrayOfObject = paramArrayOfObject;
          } 
        } 
        f(arrayOfObject);
        return arrayOfObject;
      case 0:
        break;
    } 
    paramArrayOfObject.getClass();
    int i = size();
    int j = paramArrayOfObject.length;
    if (j < i) {
      arrayOfObject = c();
      if (arrayOfObject == null) {
        arrayOfObject = paramArrayOfObject;
        if (j != 0)
          arrayOfObject = Arrays.copyOf(paramArrayOfObject, 0); 
        arrayOfObject = Arrays.copyOf(arrayOfObject, i);
      } else {
        return Arrays.copyOfRange(arrayOfObject, d(), e(), (Class)paramArrayOfObject.getClass());
      } 
    } else {
      arrayOfObject = paramArrayOfObject;
      if (j > i) {
        paramArrayOfObject[i] = null;
        arrayOfObject = paramArrayOfObject;
      } 
    } 
    f(arrayOfObject);
    return arrayOfObject;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\ad2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
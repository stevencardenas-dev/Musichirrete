import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Spliterator;
import java.util.Spliterators;

public abstract class xg2 extends AbstractCollection implements Serializable {
  public static final Object[] b = new Object[0];
  
  public final boolean add(Object paramObject) {
    throw new UnsupportedOperationException();
  }
  
  public final boolean addAll(Collection paramCollection) {
    throw new UnsupportedOperationException();
  }
  
  public abstract int c(Object[] paramArrayOfObject);
  
  public final void clear() {
    throw new UnsupportedOperationException();
  }
  
  public int d() {
    throw new UnsupportedOperationException();
  }
  
  public int e() {
    throw new UnsupportedOperationException();
  }
  
  public abstract ch2 f();
  
  public abstract boolean g();
  
  public Object[] h() {
    return null;
  }
  
  public final boolean remove(Object paramObject) {
    throw new UnsupportedOperationException();
  }
  
  public final boolean removeAll(Collection paramCollection) {
    throw new UnsupportedOperationException();
  }
  
  public final boolean retainAll(Collection paramCollection) {
    throw new UnsupportedOperationException();
  }
  
  public final Spliterator spliterator() {
    return Spliterators.spliterator(this, 1296);
  }
  
  public final Object[] toArray() {
    return toArray(b);
  }
  
  public final Object[] toArray(Object[] paramArrayOfObject) {
    Object[] arrayOfObject;
    paramArrayOfObject.getClass();
    int i = size();
    int j = paramArrayOfObject.length;
    if (j < i) {
      arrayOfObject = h();
      if (arrayOfObject == null) {
        arrayOfObject = paramArrayOfObject;
        if (j != 0)
          arrayOfObject = Arrays.copyOf(paramArrayOfObject, 0); 
        arrayOfObject = Arrays.copyOf(arrayOfObject, i);
      } else {
        return Arrays.copyOfRange(arrayOfObject, e(), d(), (Class)paramArrayOfObject.getClass());
      } 
    } else {
      arrayOfObject = paramArrayOfObject;
      if (j > i) {
        paramArrayOfObject[i] = null;
        arrayOfObject = paramArrayOfObject;
      } 
    } 
    c(arrayOfObject);
    return arrayOfObject;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\xg2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
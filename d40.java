import com.google.android.gms.cast.framework.internal.featurehighlight.aS.xveccWbRzqx;
import com.google.android.material.tabs.xm.VDgS;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

public final class d40 implements Serializable, fl0, RandomAccess, List {
  public static final d40 b = (d40)new Object();
  
  public final boolean addAll(int paramInt, Collection paramCollection) {
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
  
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
    return (paramObject instanceof List && ((List)paramObject).isEmpty());
  }
  
  public final Object get(int paramInt) {
    StringBuilder stringBuilder = new StringBuilder("Empty list doesn't contain element at index ");
    stringBuilder.append(paramInt);
    stringBuilder.append('.');
    throw new IndexOutOfBoundsException(stringBuilder.toString());
  }
  
  public final int hashCode() {
    return 1;
  }
  
  public final boolean isEmpty() {
    return true;
  }
  
  public final Iterator iterator() {
    return c40.b;
  }
  
  public final ListIterator listIterator() {
    return c40.b;
  }
  
  public final ListIterator listIterator(int paramInt) {
    if (paramInt == 0)
      return c40.b; 
    m60.m(ga1.i("Index: ", paramInt));
    return null;
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
  
  public final List subList(int paramInt1, int paramInt2) {
    if (paramInt1 == 0 && paramInt2 == 0)
      return this; 
    m60.m(ga1.j("fromIndex: ", paramInt1, paramInt2, ", toIndex: "));
    return null;
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


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\d40.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
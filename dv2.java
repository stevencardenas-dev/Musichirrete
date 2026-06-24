import java.util.AbstractList;
import java.util.Collection;

public abstract class dv2 extends AbstractList implements uv2 {
  public boolean b;
  
  public dv2(boolean paramBoolean) {
    this.b = paramBoolean;
  }
  
  public final boolean addAll(int paramInt, Collection<?> paramCollection) {
    c();
    return super.addAll(paramInt, paramCollection);
  }
  
  public boolean addAll(Collection<?> paramCollection) {
    c();
    return super.addAll(paramCollection);
  }
  
  public final void c() {
    if (this.b)
      return; 
    throw new UnsupportedOperationException();
  }
  
  public final void clear() {
    c();
    super.clear();
  }
  
  public boolean equals(Object paramObject) {
    if (paramObject == this)
      return true; 
    if (!(paramObject instanceof java.util.List))
      return false; 
    if (!(paramObject instanceof java.util.RandomAccess))
      return super.equals(paramObject); 
    paramObject = paramObject;
    int i = size();
    if (i == paramObject.size()) {
      for (byte b = 0; b < i; b++) {
        if (!get(b).equals(paramObject.get(b)))
          return false; 
      } 
      return true;
    } 
    return false;
  }
  
  public int hashCode() {
    int j = size();
    byte b = 0;
    int i = 1;
    while (b < j) {
      i = i * 31 + get(b).hashCode();
      b++;
    } 
    return i;
  }
  
  public abstract Object remove(int paramInt);
  
  public final boolean remove(Object paramObject) {
    c();
    int i = indexOf(paramObject);
    if (i == -1)
      return false; 
    remove(i);
    return true;
  }
  
  public final boolean removeAll(Collection<?> paramCollection) {
    c();
    return super.removeAll(paramCollection);
  }
  
  public final boolean retainAll(Collection<?> paramCollection) {
    c();
    return super.retainAll(paramCollection);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\dv2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
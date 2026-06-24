import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

public final class lr0 extends v {
  public final int b;
  
  public final kr0 c;
  
  public final boolean add(Object paramObject) {
    switch (this.b) {
      default:
        throw new UnsupportedOperationException();
      case 0:
        break;
    } 
    ((Map.Entry)paramObject).getClass();
    throw new UnsupportedOperationException();
  }
  
  public final boolean addAll(Collection paramCollection) {
    int i = this.b;
    paramCollection.getClass();
    switch (i) {
      default:
        throw new UnsupportedOperationException();
      case 0:
        break;
    } 
    throw new UnsupportedOperationException();
  }
  
  public final int c() {
    switch (this.b) {
      default:
        return this.c.k;
      case 0:
        break;
    } 
    return this.c.k;
  }
  
  public final void clear() {
    switch (this.b) {
      default:
        this.c.clear();
        return;
      case 0:
        break;
    } 
    this.c.clear();
  }
  
  public final boolean contains(Object paramObject) {
    int i = this.b;
    kr0 kr01 = this.c;
    switch (i) {
      default:
        return kr01.containsKey(paramObject);
      case 0:
        break;
    } 
    boolean bool2 = paramObject instanceof Map.Entry;
    boolean bool1 = false;
    if (bool2) {
      paramObject = paramObject;
      kr01.getClass();
      i = kr01.g(paramObject.getKey());
      if (i >= 0) {
        Object[] arrayOfObject = kr01.c;
        arrayOfObject.getClass();
        bool1 = ui0.c(arrayOfObject[i], paramObject.getValue());
      } 
    } 
    return bool1;
  }
  
  public boolean containsAll(Collection<?> paramCollection) {
    switch (this.b) {
      default:
        return super.containsAll(paramCollection);
      case 0:
        break;
    } 
    paramCollection.getClass();
    return this.c.e(paramCollection);
  }
  
  public final boolean isEmpty() {
    switch (this.b) {
      default:
        return this.c.isEmpty();
      case 0:
        break;
    } 
    return this.c.isEmpty();
  }
  
  public final Iterator iterator() {
    int i = this.b;
    kr0 kr01 = this.c;
    switch (i) {
      default:
        kr01.getClass();
        return new hr0(kr01, 1);
      case 0:
        break;
    } 
    kr01.getClass();
    return new hr0(kr01, 0);
  }
  
  public final boolean remove(Object paramObject) {
    int i = this.b;
    boolean bool = true;
    null = true;
    kr0 kr01 = this.c;
    switch (i) {
      default:
        kr01.c();
        i = kr01.g(paramObject);
        if (i < 0) {
          null = false;
        } else {
          kr01.k(i);
        } 
        return null;
      case 0:
        break;
    } 
    if (!(paramObject instanceof Map.Entry))
      return false; 
    paramObject = paramObject;
    kr01.getClass();
    kr01.c();
    i = kr01.g(paramObject.getKey());
    if (i < 0)
      return false; 
    Object[] arrayOfObject = kr01.c;
    arrayOfObject.getClass();
    if (!ui0.c(arrayOfObject[i], paramObject.getValue()))
      return false; 
    kr01.k(i);
    return bool;
  }
  
  public final boolean removeAll(Collection<?> paramCollection) {
    int i = this.b;
    kr0 kr01 = this.c;
    paramCollection.getClass();
    switch (i) {
      default:
        kr01.c();
        return super.removeAll(paramCollection);
      case 0:
        break;
    } 
    kr01.c();
    return super.removeAll(paramCollection);
  }
  
  public final boolean retainAll(Collection<?> paramCollection) {
    int i = this.b;
    kr0 kr01 = this.c;
    paramCollection.getClass();
    switch (i) {
      default:
        kr01.c();
        return super.retainAll(paramCollection);
      case 0:
        break;
    } 
    kr01.c();
    return super.retainAll(paramCollection);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\lr0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
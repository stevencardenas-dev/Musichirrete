import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;
import java.util.RandomAccess;

public abstract class sd2 extends ad2 implements RandomAccess, List {
  public static final fd2 f = new fd2(wd2.i, 0);
  
  public final void add(int paramInt, Object paramObject) {
    throw new UnsupportedOperationException();
  }
  
  public final boolean addAll(int paramInt, Collection paramCollection) {
    throw new UnsupportedOperationException();
  }
  
  public boolean contains(Object paramObject) {
    return (indexOf(paramObject) >= 0);
  }
  
  public final boolean equals(Object paramObject) {
    if (paramObject != this) {
      if (!(paramObject instanceof List))
        return false; 
      List list = (List)paramObject;
      int i = size();
      if (i != list.size())
        return false; 
      if (list instanceof RandomAccess) {
        for (byte b = 0; b < i; b++) {
          if (!Objects.equals(get(b), list.get(b)))
            // Byte code: goto -> 157 
        } 
      } else {
        paramObject = i(0);
        Iterator iterator = list.iterator();
        while (paramObject.hasNext()) {
          if (!iterator.hasNext())
            // Byte code: goto -> 157 
          if (!Objects.equals(paramObject.next(), iterator.next()))
            // Byte code: goto -> 157 
        } 
        return !iterator.hasNext();
      } 
    } 
    return true;
  }
  
  public int f(Object[] paramArrayOfObject) {
    int i = size();
    for (byte b = 0; b < i; b++)
      paramArrayOfObject[b] = get(b); 
    return i;
  }
  
  public sd2 g() {
    return (size() <= 1) ? this : new kd2(this);
  }
  
  public sd2 h(int paramInt1, int paramInt2) {
    wf2.E0(paramInt1, paramInt2, size());
    paramInt2 -= paramInt1;
    return (sd2)((paramInt2 == size()) ? this : ((paramInt2 == 0) ? wd2.i : new pd2(this, paramInt1, paramInt2)));
  }
  
  public final int hashCode() {
    int j = size();
    byte b = 0;
    int i = 1;
    while (b < j) {
      i = i * 31 + get(b).hashCode();
      b++;
    } 
    return i;
  }
  
  public final fd2 i(int paramInt) {
    int i = size();
    if (paramInt >= 0 && paramInt <= i)
      return isEmpty() ? f : new fd2(this, paramInt); 
    m60.m(wf2.I0(paramInt, i, "index"));
    return null;
  }
  
  public int indexOf(Object paramObject) {
    if (paramObject == null)
      return -1; 
    int i = size();
    for (byte b = 0; b < i; b++) {
      if (paramObject.equals(get(b)))
        return b; 
    } 
    return -1;
  }
  
  public int lastIndexOf(Object paramObject) {
    if (paramObject == null)
      return -1; 
    for (int i = size() - 1; i >= 0; i--) {
      if (paramObject.equals(get(i)))
        return i; 
    } 
    return -1;
  }
  
  public final Object remove(int paramInt) {
    throw new UnsupportedOperationException();
  }
  
  public final Object set(int paramInt, Object paramObject) {
    throw new UnsupportedOperationException();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\sd2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;
import java.util.RandomAccess;

public abstract class ch2 extends xg2 implements RandomAccess, List {
  public static final yg2 c = new yg2(th2.g, 0);
  
  public static th2 j(int paramInt, Object[] paramArrayOfObject) {
    return (paramInt == 0) ? th2.g : new th2(paramInt, paramArrayOfObject);
  }
  
  public static ch2 k(ArrayList paramArrayList) {
    Object[] arrayOfObject = paramArrayList.toArray();
    int i = arrayOfObject.length;
    m92.a0(i, arrayOfObject);
    return j(i, arrayOfObject);
  }
  
  public final void add(int paramInt, Object paramObject) {
    throw new UnsupportedOperationException();
  }
  
  public final boolean addAll(int paramInt, Collection paramCollection) {
    throw new UnsupportedOperationException();
  }
  
  public int c(Object[] paramArrayOfObject) {
    int i = size();
    for (byte b = 0; b < i; b++)
      paramArrayOfObject[b] = get(b); 
    return i;
  }
  
  public final boolean contains(Object paramObject) {
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
        paramObject = l(0);
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
  
  public final ch2 f() {
    return this;
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
  
  public ch2 i(int paramInt1, int paramInt2) {
    ui0.z0(paramInt1, paramInt2, size());
    paramInt2 -= paramInt1;
    return (ch2)((paramInt2 == size()) ? this : ((paramInt2 == 0) ? th2.g : new bh2(this, paramInt1, paramInt2)));
  }
  
  public final int indexOf(Object paramObject) {
    if (paramObject == null)
      return -1; 
    int i = size();
    for (byte b = 0; b < i; b++) {
      if (paramObject.equals(get(b)))
        return b; 
    } 
    return -1;
  }
  
  public final yg2 l(int paramInt) {
    ui0.w0(paramInt, size());
    return isEmpty() ? c : new yg2(this, paramInt);
  }
  
  public final int lastIndexOf(Object paramObject) {
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


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\ch2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
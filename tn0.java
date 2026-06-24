import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

public final class tn0 extends u implements Serializable, RandomAccess {
  public static final tn0 f;
  
  public Object[] b;
  
  public int c;
  
  public boolean e;
  
  static {
    tn0 tn01 = new tn0(0);
    tn01.e = true;
    f = tn01;
  }
  
  public tn0(int paramInt) {
    if (paramInt >= 0) {
      this.b = new Object[paramInt];
      return;
    } 
    l0.l("capacity must be non-negative.");
    throw null;
  }
  
  public final void add(int paramInt, Object paramObject) {
    h();
    int i = this.c;
    if (paramInt >= 0 && paramInt <= i) {
      this.modCount++;
      i(paramInt, 1);
      this.b[paramInt] = paramObject;
      return;
    } 
    m60.m(ga1.j("index: ", paramInt, i, ", size: "));
  }
  
  public final boolean add(Object paramObject) {
    h();
    int i = this.c;
    this.modCount++;
    i(i, 1);
    this.b[i] = paramObject;
    return true;
  }
  
  public final boolean addAll(int paramInt, Collection paramCollection) {
    paramCollection.getClass();
    h();
    int i = this.c;
    if (paramInt >= 0 && paramInt <= i) {
      i = paramCollection.size();
      f(paramInt, paramCollection, i);
      return (i > 0);
    } 
    m60.m(ga1.j("index: ", paramInt, i, ", size: "));
    return false;
  }
  
  public final boolean addAll(Collection paramCollection) {
    paramCollection.getClass();
    h();
    int i = paramCollection.size();
    f(this.c, paramCollection, i);
    return (i > 0);
  }
  
  public final int c() {
    return this.c;
  }
  
  public final void clear() {
    h();
    k(0, this.c);
  }
  
  public final Object d(int paramInt) {
    h();
    int i = this.c;
    if (paramInt >= 0 && paramInt < i)
      return j(paramInt); 
    m60.m(ga1.j("index: ", paramInt, i, ", size: "));
    return null;
  }
  
  public final boolean equals(Object paramObject) {
    if (paramObject != this)
      if (paramObject instanceof List) {
        List list = (List)paramObject;
        paramObject = this.b;
        int i = this.c;
        if (i != list.size())
          return false; 
        for (byte b = 0; b < i; b++) {
          if (!ui0.c(paramObject[b], list.get(b)))
            // Byte code: goto -> 75 
        } 
      } else {
        return false;
      }  
    return true;
  }
  
  public final void f(int paramInt1, Collection paramCollection, int paramInt2) {
    this.modCount++;
    i(paramInt1, paramInt2);
    Iterator iterator = paramCollection.iterator();
    for (byte b = 0; b < paramInt2; b++)
      this.b[paramInt1 + b] = iterator.next(); 
  }
  
  public final void g(int paramInt, Object paramObject) {
    this.modCount++;
    i(paramInt, 1);
    this.b[paramInt] = paramObject;
  }
  
  public final Object get(int paramInt) {
    int i = this.c;
    if (paramInt >= 0 && paramInt < i)
      return this.b[paramInt]; 
    m60.m(ga1.j("index: ", paramInt, i, ", size: "));
    return null;
  }
  
  public final void h() {
    if (!this.e)
      return; 
    throw new UnsupportedOperationException();
  }
  
  public final int hashCode() {
    Object[] arrayOfObject = this.b;
    int j = this.c;
    int i = 1;
    for (byte b = 0; b < j; b++) {
      byte b1;
      Object object = arrayOfObject[b];
      if (object != null) {
        b1 = object.hashCode();
      } else {
        b1 = 0;
      } 
      i = i * 31 + b1;
    } 
    return i;
  }
  
  public final void i(int paramInt1, int paramInt2) {
    int i = this.c + paramInt2;
    if (i >= 0) {
      Object[] arrayOfObject = this.b;
      if (i > arrayOfObject.length) {
        int j = arrayOfObject.length;
        int k = j + (j >> 1);
        j = k;
        if (k - i < 0)
          j = i; 
        k = j;
        if (j - 2147483639 > 0)
          if (i > 2147483639) {
            k = Integer.MAX_VALUE;
          } else {
            k = 2147483639;
          }  
        this.b = Arrays.copyOf(arrayOfObject, k);
      } 
      arrayOfObject = this.b;
      g9.F0(paramInt1 + paramInt2, paramInt1, this.c, arrayOfObject, arrayOfObject);
      this.c += paramInt2;
      return;
    } 
    throw new OutOfMemoryError();
  }
  
  public final int indexOf(Object paramObject) {
    for (byte b = 0; b < this.c; b++) {
      if (ui0.c(this.b[b], paramObject))
        return b; 
    } 
    return -1;
  }
  
  public final boolean isEmpty() {
    return (this.c == 0);
  }
  
  public final Iterator iterator() {
    return listIterator(0);
  }
  
  public final Object j(int paramInt) {
    this.modCount++;
    Object[] arrayOfObject = this.b;
    Object object = arrayOfObject[paramInt];
    g9.F0(paramInt, paramInt + 1, this.c, arrayOfObject, arrayOfObject);
    arrayOfObject = this.b;
    paramInt = this.c;
    arrayOfObject.getClass();
    arrayOfObject[paramInt - 1] = null;
    this.c--;
    return object;
  }
  
  public final void k(int paramInt1, int paramInt2) {
    if (paramInt2 > 0)
      this.modCount++; 
    Object[] arrayOfObject = this.b;
    g9.F0(paramInt1, paramInt1 + paramInt2, this.c, arrayOfObject, arrayOfObject);
    arrayOfObject = this.b;
    paramInt1 = this.c;
    wf2.W(arrayOfObject, paramInt1 - paramInt2, paramInt1);
    this.c -= paramInt2;
  }
  
  public final int l(int paramInt1, int paramInt2, Collection paramCollection, boolean paramBoolean) {
    int i = 0;
    byte b = 0;
    while (true) {
      Object[] arrayOfObject2 = this.b;
      if (i < paramInt2) {
        int j = paramInt1 + i;
        if (paramCollection.contains(arrayOfObject2[j]) == paramBoolean) {
          arrayOfObject2 = this.b;
          i++;
          arrayOfObject2[b + paramInt1] = arrayOfObject2[j];
          b++;
          continue;
        } 
        i++;
        continue;
      } 
      i = paramInt2 - b;
      g9.F0(paramInt1 + b, paramInt2 + paramInt1, this.c, arrayOfObject2, arrayOfObject2);
      Object[] arrayOfObject1 = this.b;
      paramInt1 = this.c;
      wf2.W(arrayOfObject1, paramInt1 - i, paramInt1);
      if (i > 0)
        this.modCount++; 
      this.c -= i;
      return i;
    } 
  }
  
  public final int lastIndexOf(Object paramObject) {
    for (int i = this.c - 1; i >= 0; i--) {
      if (ui0.c(this.b[i], paramObject))
        return i; 
    } 
    return -1;
  }
  
  public final ListIterator listIterator() {
    return listIterator(0);
  }
  
  public final ListIterator listIterator(int paramInt) {
    int i = this.c;
    if (paramInt >= 0 && paramInt <= i)
      return new rn0(this, paramInt); 
    m60.m(ga1.j("index: ", paramInt, i, ", size: "));
    return null;
  }
  
  public final boolean remove(Object paramObject) {
    h();
    int i = indexOf(paramObject);
    if (i >= 0)
      d(i); 
    return (i >= 0);
  }
  
  public final boolean removeAll(Collection paramCollection) {
    paramCollection.getClass();
    h();
    return (l(0, this.c, paramCollection, false) > 0);
  }
  
  public final boolean retainAll(Collection paramCollection) {
    paramCollection.getClass();
    h();
    return (l(0, this.c, paramCollection, true) > 0);
  }
  
  public final Object set(int paramInt, Object paramObject) {
    h();
    int i = this.c;
    if (paramInt >= 0 && paramInt < i) {
      Object[] arrayOfObject = this.b;
      Object object = arrayOfObject[paramInt];
      arrayOfObject[paramInt] = paramObject;
      return object;
    } 
    m60.m(ga1.j("index: ", paramInt, i, ", size: "));
    return null;
  }
  
  public final List subList(int paramInt1, int paramInt2) {
    wf2.j(paramInt1, paramInt2, this.c);
    return new sn0(this.b, paramInt1, paramInt2 - paramInt1, null, this);
  }
  
  public final Object[] toArray() {
    return g9.H0(this.b, 0, this.c);
  }
  
  public final Object[] toArray(Object[] paramArrayOfObject) {
    paramArrayOfObject.getClass();
    int i = paramArrayOfObject.length;
    int j = this.c;
    Object[] arrayOfObject = this.b;
    if (i < j) {
      paramArrayOfObject = Arrays.copyOfRange(arrayOfObject, 0, j, (Class)paramArrayOfObject.getClass());
      paramArrayOfObject.getClass();
      return paramArrayOfObject;
    } 
    g9.F0(0, 0, j, arrayOfObject, paramArrayOfObject);
    i = this.c;
    if (i < paramArrayOfObject.length)
      paramArrayOfObject[i] = null; 
    return paramArrayOfObject;
  }
  
  public final String toString() {
    return wf2.b(this.b, 0, this.c, this);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\tn0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
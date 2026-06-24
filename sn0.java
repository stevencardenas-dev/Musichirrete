import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

public final class sn0 extends u implements RandomAccess, Serializable {
  public Object[] b;
  
  public final int c;
  
  public int e;
  
  public final sn0 f;
  
  public final tn0 g;
  
  public sn0(Object[] paramArrayOfObject, int paramInt1, int paramInt2, sn0 paramsn0, tn0 paramtn0) {
    this.b = paramArrayOfObject;
    this.c = paramInt1;
    this.e = paramInt2;
    this.f = paramsn0;
    this.g = paramtn0;
    this.modCount = tn0.e(paramtn0);
  }
  
  public final void add(int paramInt, Object paramObject) {
    i();
    h();
    int i = this.e;
    if (paramInt >= 0 && paramInt <= i) {
      g(this.c + paramInt, paramObject);
      return;
    } 
    m60.m(ga1.j("index: ", paramInt, i, ", size: "));
  }
  
  public final boolean add(Object paramObject) {
    i();
    h();
    g(this.c + this.e, paramObject);
    return true;
  }
  
  public final boolean addAll(int paramInt, Collection paramCollection) {
    paramCollection.getClass();
    i();
    h();
    int i = this.e;
    if (paramInt >= 0 && paramInt <= i) {
      i = paramCollection.size();
      f(this.c + paramInt, paramCollection, i);
      return (i > 0);
    } 
    m60.m(ga1.j("index: ", paramInt, i, ", size: "));
    return false;
  }
  
  public final boolean addAll(Collection paramCollection) {
    paramCollection.getClass();
    i();
    h();
    int i = paramCollection.size();
    f(this.c + this.e, paramCollection, i);
    return (i > 0);
  }
  
  public final int c() {
    h();
    return this.e;
  }
  
  public final void clear() {
    i();
    h();
    k(this.c, this.e);
  }
  
  public final Object d(int paramInt) {
    i();
    h();
    int i = this.e;
    if (paramInt >= 0 && paramInt < i)
      return j(this.c + paramInt); 
    m60.m(ga1.j("index: ", paramInt, i, ", size: "));
    return null;
  }
  
  public final boolean equals(Object paramObject) {
    h();
    if (paramObject != this)
      if (paramObject instanceof List) {
        List list = (List)paramObject;
        paramObject = this.b;
        int i = this.e;
        if (i != list.size())
          return false; 
        for (byte b = 0; b < i; b++) {
          if (!ui0.c(paramObject[this.c + b], list.get(b)))
            // Byte code: goto -> 84 
        } 
      } else {
        return false;
      }  
    return true;
  }
  
  public final void f(int paramInt1, Collection paramCollection, int paramInt2) {
    this.modCount++;
    tn0 tn01 = this.g;
    sn0 sn01 = this.f;
    if (sn01 != null) {
      sn01.f(paramInt1, paramCollection, paramInt2);
    } else {
      tn0 tn02 = tn0.f;
      tn01.f(paramInt1, paramCollection, paramInt2);
    } 
    this.b = tn01.b;
    this.e += paramInt2;
  }
  
  public final void g(int paramInt, Object paramObject) {
    this.modCount++;
    tn0 tn01 = this.g;
    sn0 sn01 = this.f;
    if (sn01 != null) {
      sn01.g(paramInt, paramObject);
    } else {
      tn0 tn02 = tn0.f;
      tn01.g(paramInt, paramObject);
    } 
    this.b = tn01.b;
    this.e++;
  }
  
  public final Object get(int paramInt) {
    h();
    int i = this.e;
    if (paramInt >= 0 && paramInt < i)
      return this.b[this.c + paramInt]; 
    m60.m(ga1.j("index: ", paramInt, i, ", size: "));
    return null;
  }
  
  public final void h() {
    if (tn0.e(this.g) == this.modCount)
      return; 
    throw new ConcurrentModificationException();
  }
  
  public final int hashCode() {
    h();
    Object[] arrayOfObject = this.b;
    int j = this.e;
    int i = 1;
    for (byte b = 0; b < j; b++) {
      byte b1;
      Object object = arrayOfObject[this.c + b];
      if (object != null) {
        b1 = object.hashCode();
      } else {
        b1 = 0;
      } 
      i = i * 31 + b1;
    } 
    return i;
  }
  
  public final void i() {
    if (!this.g.e)
      return; 
    throw new UnsupportedOperationException();
  }
  
  public final int indexOf(Object paramObject) {
    h();
    for (byte b = 0; b < this.e; b++) {
      if (ui0.c(this.b[this.c + b], paramObject))
        return b; 
    } 
    return -1;
  }
  
  public final boolean isEmpty() {
    h();
    return (this.e == 0);
  }
  
  public final Iterator iterator() {
    return listIterator(0);
  }
  
  public final Object j(int paramInt) {
    this.modCount++;
    Object object = this.f;
    if (object != null) {
      Object object1 = object.j(paramInt);
    } else {
      tn0 tn01 = tn0.f;
      object = this.g.j(paramInt);
    } 
    this.e--;
    return object;
  }
  
  public final void k(int paramInt1, int paramInt2) {
    if (paramInt2 > 0)
      this.modCount++; 
    sn0 sn01 = this.f;
    if (sn01 != null) {
      sn01.k(paramInt1, paramInt2);
    } else {
      tn0 tn01 = tn0.f;
      this.g.k(paramInt1, paramInt2);
    } 
    this.e -= paramInt2;
  }
  
  public final int l(int paramInt1, int paramInt2, Collection paramCollection, boolean paramBoolean) {
    sn0 sn01 = this.f;
    if (sn01 != null) {
      paramInt1 = sn01.l(paramInt1, paramInt2, paramCollection, paramBoolean);
    } else {
      tn0 tn01 = tn0.f;
      paramInt1 = this.g.l(paramInt1, paramInt2, paramCollection, paramBoolean);
    } 
    if (paramInt1 > 0)
      this.modCount++; 
    this.e -= paramInt1;
    return paramInt1;
  }
  
  public final int lastIndexOf(Object paramObject) {
    h();
    for (int i = this.e - 1; i >= 0; i--) {
      if (ui0.c(this.b[this.c + i], paramObject))
        return i; 
    } 
    return -1;
  }
  
  public final ListIterator listIterator() {
    return listIterator(0);
  }
  
  public final ListIterator listIterator(int paramInt) {
    h();
    int i = this.e;
    if (paramInt >= 0 && paramInt <= i)
      return new rn0(this, paramInt); 
    m60.m(ga1.j("index: ", paramInt, i, ", size: "));
    return null;
  }
  
  public final boolean remove(Object paramObject) {
    i();
    h();
    int i = indexOf(paramObject);
    if (i >= 0)
      d(i); 
    return (i >= 0);
  }
  
  public final boolean removeAll(Collection paramCollection) {
    paramCollection.getClass();
    i();
    h();
    int i = this.e;
    return (l(this.c, i, paramCollection, false) > 0);
  }
  
  public final boolean retainAll(Collection paramCollection) {
    paramCollection.getClass();
    i();
    h();
    int i = this.e;
    return (l(this.c, i, paramCollection, true) > 0);
  }
  
  public final Object set(int paramInt, Object paramObject) {
    i();
    h();
    int i = this.e;
    if (paramInt >= 0 && paramInt < i) {
      Object[] arrayOfObject = this.b;
      i = this.c;
      Object object = arrayOfObject[i + paramInt];
      arrayOfObject[i + paramInt] = paramObject;
      return object;
    } 
    m60.m(ga1.j("index: ", paramInt, i, ", size: "));
    return null;
  }
  
  public final List subList(int paramInt1, int paramInt2) {
    wf2.j(paramInt1, paramInt2, this.e);
    return new sn0(this.b, this.c + paramInt1, paramInt2 - paramInt1, this, this.g);
  }
  
  public final Object[] toArray() {
    h();
    Object[] arrayOfObject = this.b;
    int i = this.e;
    int j = this.c;
    return g9.H0(arrayOfObject, j, i + j);
  }
  
  public final Object[] toArray(Object[] paramArrayOfObject) {
    paramArrayOfObject.getClass();
    h();
    int j = paramArrayOfObject.length;
    int i = this.e;
    Object[] arrayOfObject = this.b;
    int k = this.c;
    if (j < i) {
      paramArrayOfObject = Arrays.copyOfRange(arrayOfObject, k, i + k, (Class)paramArrayOfObject.getClass());
      paramArrayOfObject.getClass();
      return paramArrayOfObject;
    } 
    g9.F0(0, k, i + k, arrayOfObject, paramArrayOfObject);
    i = this.e;
    if (i < paramArrayOfObject.length)
      paramArrayOfObject[i] = null; 
    return paramArrayOfObject;
  }
  
  public final String toString() {
    h();
    return wf2.b(this.b, this.c, this.e, this);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\sn0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
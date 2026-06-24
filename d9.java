import java.lang.reflect.Array;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;

public final class d9 implements Collection, Set, fl0 {
  public int[] b = ws2.e;
  
  public Object[] c = ws2.f;
  
  public int e;
  
  public d9(int paramInt) {
    if (paramInt > 0) {
      this.b = new int[paramInt];
      this.c = new Object[paramInt];
    } 
  }
  
  public final boolean add(Object paramObject) {
    int j;
    int k = this.e;
    if (paramObject == null) {
      i = qv.F(this, null, 0);
      j = 0;
    } else {
      j = paramObject.hashCode();
      i = qv.F(this, paramObject, j);
    } 
    if (i >= 0)
      return false; 
    int m = i ^ 0xFFFFFFFF;
    int[] arrayOfInt = this.b;
    if (k >= arrayOfInt.length) {
      i = 8;
      if (k >= 8) {
        i = (k >> 1) + k;
      } else if (k < 4) {
        i = 4;
      } 
      Object[] arrayOfObject = this.c;
      int[] arrayOfInt1 = new int[i];
      this.b = arrayOfInt1;
      this.c = new Object[i];
      if (k == this.e) {
        if (arrayOfInt1.length != 0) {
          g9.E0(0, 0, arrayOfInt.length, arrayOfInt, arrayOfInt1);
          Object[] arrayOfObject1 = this.c;
          g9.G0(0, arrayOfObject.length, 6, arrayOfObject, arrayOfObject1);
        } 
      } else {
        throw new ConcurrentModificationException();
      } 
    } 
    if (m < k) {
      int[] arrayOfInt1 = this.b;
      i = m + 1;
      g9.E0(i, m, k, arrayOfInt1, arrayOfInt1);
      Object[] arrayOfObject = this.c;
      g9.F0(i, m, k, arrayOfObject, arrayOfObject);
    } 
    int i = this.e;
    if (k == i) {
      int[] arrayOfInt1 = this.b;
      if (m < arrayOfInt1.length) {
        arrayOfInt1[m] = j;
        this.c[m] = paramObject;
        this.e = i + 1;
        return true;
      } 
    } 
    throw new ConcurrentModificationException();
  }
  
  public final boolean addAll(Collection paramCollection) {
    paramCollection.getClass();
    int i = this.e;
    int k = paramCollection.size() + i;
    i = this.e;
    int[] arrayOfInt = this.b;
    int j = arrayOfInt.length;
    boolean bool = false;
    if (j < k) {
      Object[] arrayOfObject = this.c;
      int[] arrayOfInt1 = new int[k];
      this.b = arrayOfInt1;
      this.c = new Object[k];
      if (i > 0) {
        g9.E0(0, 0, i, arrayOfInt, arrayOfInt1);
        Object[] arrayOfObject1 = this.c;
        g9.G0(0, this.e, 6, arrayOfObject, arrayOfObject1);
      } 
    } 
    if (this.e == i) {
      Iterator iterator = paramCollection.iterator();
      while (iterator.hasNext())
        bool |= add(iterator.next()); 
      return bool;
    } 
    throw new ConcurrentModificationException();
  }
  
  public final Object c(int paramInt) {
    int j = this.e;
    Object[] arrayOfObject = this.c;
    Object object = arrayOfObject[paramInt];
    if (j <= 1) {
      clear();
      return object;
    } 
    int k = j - 1;
    int[] arrayOfInt = this.b;
    int m = arrayOfInt.length;
    int i = 8;
    if (m > 8 && j < arrayOfInt.length / 3) {
      if (j > 8)
        i = j + (j >> 1); 
      int[] arrayOfInt1 = new int[i];
      this.b = arrayOfInt1;
      this.c = new Object[i];
      if (paramInt > 0) {
        g9.E0(0, 0, paramInt, arrayOfInt, arrayOfInt1);
        g9.G0(0, paramInt, 6, arrayOfObject, this.c);
      } 
      if (paramInt < k) {
        arrayOfInt1 = this.b;
        i = paramInt + 1;
        g9.E0(paramInt, i, j, arrayOfInt, arrayOfInt1);
        g9.F0(paramInt, i, j, arrayOfObject, this.c);
      } 
    } else {
      if (paramInt < k) {
        i = paramInt + 1;
        g9.E0(paramInt, i, j, arrayOfInt, arrayOfInt);
        Object[] arrayOfObject1 = this.c;
        g9.F0(paramInt, i, j, arrayOfObject1, arrayOfObject1);
      } 
      this.c[k] = null;
    } 
    if (j == this.e) {
      this.e = k;
      return object;
    } 
    throw new ConcurrentModificationException();
  }
  
  public final void clear() {
    if (this.e != 0) {
      this.b = ws2.e;
      this.c = ws2.f;
      this.e = 0;
    } 
    if (this.e == 0)
      return; 
    throw new ConcurrentModificationException();
  }
  
  public final boolean contains(Object paramObject) {
    int i;
    if (paramObject == null) {
      i = qv.F(this, null, 0);
    } else {
      i = qv.F(this, paramObject, paramObject.hashCode());
    } 
    return (i >= 0);
  }
  
  public final boolean containsAll(Collection paramCollection) {
    paramCollection.getClass();
    Iterator iterator = paramCollection.iterator();
    while (iterator.hasNext()) {
      if (!contains(iterator.next()))
        return false; 
    } 
    return true;
  }
  
  public final boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject instanceof Set) {
      if (this.e != ((Set)paramObject).size())
        return false; 
      try {
        int i = this.e;
        for (byte b = 0; b < i; b++) {
          Object object = this.c[b];
          boolean bool = ((Set)paramObject).contains(object);
          if (!bool)
            return false; 
        } 
        return true;
      } catch (NullPointerException|ClassCastException nullPointerException) {}
    } 
    return false;
  }
  
  public final int hashCode() {
    int[] arrayOfInt = this.b;
    int j = this.e;
    byte b = 0;
    int i = 0;
    while (b < j) {
      i += arrayOfInt[b];
      b++;
    } 
    return i;
  }
  
  public final boolean isEmpty() {
    return (this.e <= 0);
  }
  
  public final Iterator iterator() {
    return new x8(this);
  }
  
  public final boolean remove(Object paramObject) {
    int i;
    if (paramObject == null) {
      i = qv.F(this, null, 0);
    } else {
      i = qv.F(this, paramObject, paramObject.hashCode());
    } 
    if (i >= 0) {
      c(i);
      return true;
    } 
    return false;
  }
  
  public final boolean removeAll(Collection paramCollection) {
    paramCollection.getClass();
    Iterator iterator = paramCollection.iterator();
    boolean bool;
    for (bool = false; iterator.hasNext(); bool |= remove(iterator.next()));
    return bool;
  }
  
  public final boolean retainAll(Collection paramCollection) {
    paramCollection.getClass();
    int i = this.e - 1;
    boolean bool = false;
    while (-1 < i) {
      if (!paramCollection.contains(this.c[i])) {
        c(i);
        bool = true;
      } 
      i--;
    } 
    return bool;
  }
  
  public final int size() {
    return this.e;
  }
  
  public final Object[] toArray() {
    return g9.H0(this.c, 0, this.e);
  }
  
  public final Object[] toArray(Object[] paramArrayOfObject) {
    Object[] arrayOfObject;
    paramArrayOfObject.getClass();
    int i = this.e;
    if (paramArrayOfObject.length < i) {
      arrayOfObject = (Object[])Array.newInstance(paramArrayOfObject.getClass().getComponentType(), i);
    } else {
      arrayOfObject = paramArrayOfObject;
      if (paramArrayOfObject.length > i) {
        paramArrayOfObject[i] = null;
        arrayOfObject = paramArrayOfObject;
      } 
    } 
    paramArrayOfObject = this.c;
    g9.F0(0, 0, this.e, paramArrayOfObject, arrayOfObject);
    return arrayOfObject;
  }
  
  public final String toString() {
    if (isEmpty())
      return "{}"; 
    StringBuilder stringBuilder = new StringBuilder(this.e * 14);
    stringBuilder.append('{');
    int i = this.e;
    for (byte b = 0; b < i; b++) {
      if (b > 0)
        stringBuilder.append(", "); 
      Object object = this.c[b];
      if (object != this) {
        stringBuilder.append(object);
      } else {
        stringBuilder.append("(this Set)");
      } 
    } 
    stringBuilder.append('}');
    return stringBuilder.toString();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\d9.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
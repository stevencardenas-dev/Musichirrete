import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

public final class kr0 implements Serializable, fl0, Map {
  public static final kr0 p;
  
  public Object[] b;
  
  public Object[] c;
  
  public int[] e;
  
  public int[] f;
  
  public int g;
  
  public int h;
  
  public int i;
  
  public int j;
  
  public int k;
  
  public lr0 l;
  
  public mr0 m;
  
  public lr0 n;
  
  public boolean o;
  
  static {
    kr0 kr01 = new kr0(0);
    kr01.o = true;
    p = kr01;
  }
  
  public kr0() {
    this(8);
  }
  
  public kr0(int paramInt) {}
  
  public final int a(Object paramObject) {
    c();
    label29: while (true) {
      int i = i(paramObject);
      int k = this.g * 2;
      int m = this.f.length / 2;
      int j = k;
      if (k > m)
        j = m; 
      k = 0;
      while (true) {
        int[] arrayOfInt = this.f;
        m = arrayOfInt[i];
        if (m == 0) {
          j = this.h;
          Object[] arrayOfObject = this.b;
          if (j >= arrayOfObject.length) {
            f(1);
            continue label29;
          } 
          m = j + 1;
          this.h = m;
          arrayOfObject[j] = paramObject;
          this.e[j] = i;
          arrayOfInt[i] = m;
          this.k++;
          this.j++;
          if (k > this.g)
            this.g = k; 
          return j;
        } 
        if (ui0.c(this.b[m - 1], paramObject))
          return -m; 
        if (++k > j) {
          j(this.f.length * 2);
          continue label29;
        } 
        if (i == 0) {
          i = this.f.length - 1;
          continue;
        } 
        i--;
      } 
      break;
    } 
  }
  
  public final kr0 b() {
    c();
    this.o = true;
    if (this.k > 0)
      return this; 
    kr0 kr01 = p;
    kr01.getClass();
    return kr01;
  }
  
  public final void c() {
    if (!this.o)
      return; 
    throw new UnsupportedOperationException();
  }
  
  public final void clear() {
    c();
    int i = this.h - 1;
    if (i >= 0) {
      int j = 0;
      while (true) {
        int[] arrayOfInt = this.e;
        int k = arrayOfInt[j];
        if (k >= 0) {
          this.f[k] = 0;
          arrayOfInt[j] = -1;
        } 
        if (j != i) {
          j++;
          continue;
        } 
        break;
      } 
    } 
    wf2.W(this.b, 0, this.h);
    Object[] arrayOfObject = this.c;
    if (arrayOfObject != null)
      wf2.W(arrayOfObject, 0, this.h); 
    this.k = 0;
    this.h = 0;
    this.j++;
  }
  
  public final boolean containsKey(Object paramObject) {
    return (g(paramObject) >= 0);
  }
  
  public final boolean containsValue(Object paramObject) {
    return (h(paramObject) >= 0);
  }
  
  public final void d(boolean paramBoolean) {
    Object[] arrayOfObject = this.c;
    byte b = 0;
    int i = 0;
    while (true) {
      int j = this.h;
      if (b < j) {
        int[] arrayOfInt = this.e;
        int k = arrayOfInt[b];
        j = i;
        if (k >= 0) {
          Object[] arrayOfObject1 = this.b;
          arrayOfObject1[i] = arrayOfObject1[b];
          if (arrayOfObject != null)
            arrayOfObject[i] = arrayOfObject[b]; 
          if (paramBoolean) {
            arrayOfInt[i] = k;
            this.f[k] = i + 1;
          } 
          j = i + 1;
        } 
        b++;
        i = j;
        continue;
      } 
      wf2.W(this.b, i, j);
      if (arrayOfObject != null)
        wf2.W(arrayOfObject, i, this.h); 
      this.h = i;
      return;
    } 
  }
  
  public final boolean e(Collection paramCollection) {
    paramCollection.getClass();
    Iterator<Object> iterator = paramCollection.iterator();
    while (true) {
      if (iterator.hasNext()) {
        Map.Entry entry = (Map.Entry)iterator.next();
        if (entry != null)
          try {
            boolean bool;
            Map.Entry entry1 = entry;
            int i = g(entry1.getKey());
            if (i < 0) {
              bool = false;
            } else {
              Object[] arrayOfObject = this.c;
              arrayOfObject.getClass();
              bool = ui0.c(arrayOfObject[i], entry1.getValue());
            } 
            if (!bool)
              return false; 
            continue;
          } catch (ClassCastException classCastException) {} 
        return false;
      } 
      return true;
    } 
  }
  
  public final Set entrySet() {
    lr0 lr02 = this.n;
    lr0 lr01 = lr02;
    if (lr02 == null) {
      lr01 = new lr0(this, 0);
      this.n = lr01;
    } 
    return lr01;
  }
  
  public final boolean equals(Object paramObject) {
    if (paramObject != this) {
      if (paramObject instanceof Map) {
        paramObject = paramObject;
        if (this.k == paramObject.size() && e(paramObject.entrySet()))
          return true; 
      } 
      return false;
    } 
    return true;
  }
  
  public final void f(int paramInt) {
    Object[] arrayOfObject = this.b;
    int j = arrayOfObject.length;
    int i = this.h;
    int m = j - i;
    int k = i - this.k;
    j = 1;
    if (m < paramInt && m + k >= paramInt && k >= arrayOfObject.length / 4) {
      d(true);
      return;
    } 
    k = i + paramInt;
    if (k >= 0) {
      if (k > arrayOfObject.length) {
        paramInt = arrayOfObject.length;
        paramInt += paramInt >> 1;
        i = paramInt;
        if (paramInt - k < 0)
          i = k; 
        paramInt = i;
        if (i - 2147483639 > 0)
          if (k > 2147483639) {
            paramInt = Integer.MAX_VALUE;
          } else {
            paramInt = 2147483639;
          }  
        this.b = Arrays.copyOf(arrayOfObject, paramInt);
        arrayOfObject = this.c;
        if (arrayOfObject != null) {
          arrayOfObject = Arrays.copyOf(arrayOfObject, paramInt);
        } else {
          arrayOfObject = null;
        } 
        this.c = arrayOfObject;
        this.e = Arrays.copyOf(this.e, paramInt);
        if (paramInt < 1)
          paramInt = j; 
        paramInt = Integer.highestOneBit(paramInt * 3);
        if (paramInt > this.f.length)
          j(paramInt); 
      } 
      return;
    } 
    throw new OutOfMemoryError();
  }
  
  public final int g(Object paramObject) {
    int i = i(paramObject);
    int j = this.g;
    while (true) {
      int k = this.f[i];
      if (k == 0)
        return -1; 
      Object[] arrayOfObject = this.b;
      if (ui0.c(arrayOfObject[--k], paramObject))
        return k; 
      if (--j < 0)
        return -1; 
      if (i == 0) {
        i = this.f.length - 1;
        continue;
      } 
      i--;
    } 
  }
  
  public final Object get(Object paramObject) {
    int i = g(paramObject);
    if (i < 0)
      return null; 
    paramObject = this.c;
    paramObject.getClass();
    return paramObject[i];
  }
  
  public final int h(Object paramObject) {
    int i = this.h;
    while (true) {
      int j = i - 1;
      if (j >= 0) {
        i = j;
        if (this.e[j] >= 0) {
          Object[] arrayOfObject = this.c;
          arrayOfObject.getClass();
          i = j;
          if (ui0.c(arrayOfObject[j], paramObject))
            return j; 
        } 
        continue;
      } 
      return -1;
    } 
  }
  
  public final int hashCode() {
    hr0 hr0 = new hr0(this, 0);
    int i = 0;
    while (hr0.hasNext()) {
      int j = hr0.b;
      kr0 kr01 = (kr0)hr0.f;
      if (j < kr01.h) {
        byte b;
        hr0.b = j + 1;
        hr0.c = j;
        Object object = kr01.b[j];
        if (object != null) {
          j = object.hashCode();
        } else {
          j = 0;
        } 
        object = kr01.c;
        object.getClass();
        object = object[hr0.c];
        if (object != null) {
          b = object.hashCode();
        } else {
          b = 0;
        } 
        hr0.d();
        i += j ^ b;
        continue;
      } 
      throw new NoSuchElementException();
    } 
    return i;
  }
  
  public final int i(Object paramObject) {
    byte b;
    if (paramObject != null) {
      b = paramObject.hashCode();
    } else {
      b = 0;
    } 
    return b * -1640531527 >>> this.i;
  }
  
  public final boolean isEmpty() {
    return (this.k == 0);
  }
  
  public final void j(int paramInt) {
    this.j++;
    int k = this.h;
    int j = this.k;
    int i = 0;
    if (k > j)
      d(false); 
    this.f = new int[paramInt];
    this.i = Integer.numberOfLeadingZeros(paramInt) + 1;
    label21: while (i < this.h) {
      k = i + 1;
      paramInt = i(this.b[i]);
      j = this.g;
      while (true) {
        int[] arrayOfInt = this.f;
        if (arrayOfInt[paramInt] == 0) {
          arrayOfInt[paramInt] = k;
          this.e[i] = paramInt;
          i = k;
          continue label21;
        } 
        if (--j >= 0) {
          if (paramInt == 0) {
            paramInt = arrayOfInt.length - 1;
            continue;
          } 
          paramInt--;
          continue;
        } 
        tp.f("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
        break;
      } 
    } 
  }
  
  public final void k(int paramInt) {
    Object[] arrayOfObject = this.b;
    arrayOfObject.getClass();
    arrayOfObject[paramInt] = null;
    arrayOfObject = this.c;
    if (arrayOfObject != null)
      arrayOfObject[paramInt] = null; 
    int i = this.e[paramInt];
    while (true) {
      int k = i;
      int m = 0;
      int j = k;
      while (true) {
        if (j == 0) {
          i = this.f.length - 1;
        } else {
          i = j - 1;
        } 
        int[] arrayOfInt = this.f;
        int i1 = arrayOfInt[i];
        int n = m + 1;
        if (n > this.g) {
          arrayOfInt[k] = 0;
        } else if (i1 == 0) {
          arrayOfInt[k] = 0;
        } else {
          Object[] arrayOfObject1 = this.b;
          int i3 = i1 - 1;
          int i2 = i(arrayOfObject1[i3]);
          int[] arrayOfInt1 = this.f;
          j = i;
          m = n;
          if ((i2 - i & arrayOfInt1.length - 1) >= n) {
            arrayOfInt1[k] = i1;
            this.e[i3] = k;
          } 
          continue;
        } 
        this.e[paramInt] = -1;
        this.k--;
        this.j++;
        return;
      } 
      break;
    } 
  }
  
  public final Set keySet() {
    lr0 lr02 = this.l;
    lr0 lr01 = lr02;
    if (lr02 == null) {
      lr01 = new lr0(this, 1);
      this.l = lr01;
    } 
    return lr01;
  }
  
  public final Object put(Object paramObject1, Object paramObject2) {
    c();
    int i = a(paramObject1);
    paramObject1 = this.c;
    if (paramObject1 == null) {
      int j = this.b.length;
      if (j >= 0) {
        paramObject1 = new Object[j];
        this.c = (Object[])paramObject1;
      } else {
        l0.l("capacity must be non-negative.");
        return null;
      } 
    } 
    if (i < 0) {
      int j = -i - 1;
      Object object = paramObject1[j];
      paramObject1[j] = paramObject2;
      return object;
    } 
    paramObject1[i] = paramObject2;
    return null;
  }
  
  public final void putAll(Map paramMap) {
    paramMap.getClass();
    c();
    Set set = paramMap.entrySet();
    if (!set.isEmpty()) {
      f(set.size());
      for (Map.Entry entry : set) {
        int i = a(entry.getKey());
        Object[] arrayOfObject = this.c;
        if (arrayOfObject == null) {
          int j = this.b.length;
          if (j >= 0) {
            arrayOfObject = new Object[j];
            this.c = arrayOfObject;
          } else {
            l0.l("capacity must be non-negative.");
            break;
          } 
        } 
        if (i >= 0) {
          arrayOfObject[i] = entry.getValue();
          continue;
        } 
        i = -i - 1;
        Object object = arrayOfObject[i];
        if (!ui0.c(entry.getValue(), object))
          arrayOfObject[i] = entry.getValue(); 
      } 
    } 
  }
  
  public final Object remove(Object paramObject) {
    c();
    int i = g(paramObject);
    if (i < 0)
      return null; 
    paramObject = this.c;
    paramObject.getClass();
    paramObject = paramObject[i];
    k(i);
    return paramObject;
  }
  
  public final int size() {
    return this.k;
  }
  
  public final String toString() {
    StringBuilder stringBuilder = new StringBuilder(this.k * 3 + 2);
    stringBuilder.append("{");
    byte b = 0;
    hr0 hr0 = new hr0(this, 0);
    while (hr0.hasNext()) {
      if (b)
        stringBuilder.append(", "); 
      int i = hr0.b;
      kr0 kr01 = (kr0)hr0.f;
      if (i < kr01.h) {
        hr0.b = i + 1;
        hr0.c = i;
        Object object = kr01.b[i];
        if (object == kr01) {
          stringBuilder.append("(this Map)");
        } else {
          stringBuilder.append(object);
        } 
        stringBuilder.append('=');
        object = kr01.c;
        object.getClass();
        object = object[hr0.c];
        if (object == kr01) {
          stringBuilder.append("(this Map)");
        } else {
          stringBuilder.append(object);
        } 
        hr0.d();
        b++;
        continue;
      } 
      throw new NoSuchElementException();
    } 
    stringBuilder.append("}");
    return stringBuilder.toString();
  }
  
  public final Collection values() {
    mr0 mr02 = this.m;
    mr0 mr01 = mr02;
    if (mr02 == null) {
      mr01 = new mr0(this);
      this.m = mr01;
    } 
    return mr01;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\kr0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
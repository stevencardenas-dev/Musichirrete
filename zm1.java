import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;

public class zm1 {
  public int[] b;
  
  public Object[] c;
  
  public int e;
  
  public zm1(int paramInt) {
    int[] arrayOfInt;
    Object[] arrayOfObject;
    if (paramInt == 0) {
      arrayOfInt = ws2.e;
    } else {
      arrayOfInt = new int[paramInt];
    } 
    this.b = arrayOfInt;
    if (paramInt == 0) {
      arrayOfObject = ws2.f;
    } else {
      arrayOfObject = new Object[paramInt << 1];
    } 
    this.c = arrayOfObject;
  }
  
  public final int a(Object paramObject) {
    int i = this.e * 2;
    Object[] arrayOfObject = this.c;
    if (paramObject == null) {
      for (byte b = 1; b < i; b += 2) {
        if (arrayOfObject[b] == null)
          return b >> 1; 
      } 
    } else {
      for (byte b = 1; b < i; b += 2) {
        if (paramObject.equals(arrayOfObject[b]))
          return b >> 1; 
      } 
    } 
    return -1;
  }
  
  public final void b(int paramInt) {
    int i = this.e;
    int[] arrayOfInt = this.b;
    if (arrayOfInt.length < paramInt) {
      this.b = Arrays.copyOf(arrayOfInt, paramInt);
      this.c = Arrays.copyOf(this.c, paramInt * 2);
    } 
    if (this.e == i)
      return; 
    throw new ConcurrentModificationException();
  }
  
  public final int c(int paramInt, Object paramObject) {
    int k = this.e;
    if (k == 0)
      return -1; 
    int j = ws2.f(k, paramInt, this.b);
    if (j < 0 || ui0.c(paramObject, this.c[j << 1]))
      return j; 
    int i;
    for (i = j + 1; i < k && this.b[i] == paramInt; i++) {
      if (ui0.c(paramObject, this.c[i << 1]))
        return i; 
    } 
    while (--j >= 0 && this.b[j] == paramInt) {
      if (ui0.c(paramObject, this.c[j << 1]))
        return j; 
      j--;
    } 
    return i ^ 0xFFFFFFFF;
  }
  
  public final void clear() {
    if (this.e > 0) {
      this.b = ws2.e;
      this.c = ws2.f;
      this.e = 0;
    } 
    if (this.e <= 0)
      return; 
    throw new ConcurrentModificationException();
  }
  
  public boolean containsKey(Object paramObject) {
    return (d(paramObject) >= 0);
  }
  
  public boolean containsValue(Object paramObject) {
    return (a(paramObject) >= 0);
  }
  
  public final int d(Object paramObject) {
    return (paramObject == null) ? e() : c(paramObject.hashCode(), paramObject);
  }
  
  public final int e() {
    int j = this.e;
    if (j == 0)
      return -1; 
    int k = ws2.f(j, 0, this.b);
    if (k < 0 || this.c[k << 1] == null)
      return k; 
    int i;
    for (i = k + 1; i < j && this.b[i] == 0; i++) {
      if (this.c[i << 1] == null)
        return i; 
    } 
    for (j = k - 1; j >= 0 && this.b[j] == 0; j--) {
      if (this.c[j << 1] == null)
        return j; 
    } 
    return i ^ 0xFFFFFFFF;
  }
  
  public final boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    try {
      if (paramObject instanceof zm1) {
        int i = this.e;
        if (i != ((zm1)paramObject).e)
          return false; 
        zm1 zm11 = (zm1)paramObject;
        for (byte b = 0; b < i; b++) {
          Object object2 = f(b);
          Object object1 = i(b);
          paramObject = zm11.get(object2);
          if (object1 == null) {
            if (paramObject != null || !zm11.containsKey(object2))
              return false; 
          } else if (!object1.equals(paramObject)) {
            return false;
          } 
        } 
        return true;
      } 
      if (paramObject instanceof Map) {
        if (this.e != ((Map)paramObject).size())
          return false; 
        int i = this.e;
        for (byte b = 0; b < i; b++) {
          Object object2 = f(b);
          Object object1 = i(b);
          Object object3 = ((Map)paramObject).get(object2);
          if (object1 == null) {
            if (object3 != null || !((Map)paramObject).containsKey(object2))
              return false; 
          } else {
            boolean bool = object1.equals(object3);
            if (!bool)
              return false; 
          } 
        } 
        return true;
      } 
    } catch (NullPointerException|ClassCastException nullPointerException) {}
    return false;
  }
  
  public final Object f(int paramInt) {
    if (paramInt >= 0 && paramInt < this.e)
      return this.c[paramInt << 1]; 
    k91.e(ga1.i("Expected index to be within 0..size()-1, but was ", paramInt));
    return null;
  }
  
  public final Object g(int paramInt) {
    if (paramInt >= 0) {
      int i = this.e;
      if (paramInt < i) {
        Object[] arrayOfObject = this.c;
        int m = paramInt << 1;
        Object object = arrayOfObject[m + 1];
        if (i <= 1) {
          clear();
          return object;
        } 
        int k = i - 1;
        int[] arrayOfInt = this.b;
        int n = arrayOfInt.length;
        int j = 8;
        if (n > 8 && i < arrayOfInt.length / 3) {
          if (i > 8)
            j = i + (i >> 1); 
          this.b = Arrays.copyOf(arrayOfInt, j);
          this.c = Arrays.copyOf(this.c, j << 1);
          if (i == this.e) {
            if (paramInt > 0) {
              g9.E0(0, 0, paramInt, arrayOfInt, this.b);
              g9.F0(0, 0, m, arrayOfObject, this.c);
            } 
            if (paramInt < k) {
              int[] arrayOfInt1 = this.b;
              j = paramInt + 1;
              g9.E0(paramInt, j, i, arrayOfInt, arrayOfInt1);
              g9.F0(m, j << 1, i << 1, arrayOfObject, this.c);
            } 
          } else {
            throw new ConcurrentModificationException();
          } 
        } else {
          if (paramInt < k) {
            j = paramInt + 1;
            g9.E0(paramInt, j, i, arrayOfInt, arrayOfInt);
            Object[] arrayOfObject2 = this.c;
            g9.F0(m, j << 1, i << 1, arrayOfObject2, arrayOfObject2);
          } 
          Object[] arrayOfObject1 = this.c;
          paramInt = k << 1;
          arrayOfObject1[paramInt] = null;
          arrayOfObject1[paramInt + 1] = null;
        } 
        if (i == this.e) {
          this.e = k;
          return object;
        } 
        throw new ConcurrentModificationException();
      } 
    } 
    k91.e(ga1.i("Expected index to be within 0..size()-1, but was ", paramInt));
    return null;
  }
  
  public Object get(Object paramObject) {
    int i = d(paramObject);
    return (i >= 0) ? this.c[(i << 1) + 1] : null;
  }
  
  public final Object getOrDefault(Object paramObject1, Object paramObject2) {
    int i = d(paramObject1);
    return (i >= 0) ? this.c[(i << 1) + 1] : paramObject2;
  }
  
  public final Object h(int paramInt, Object paramObject) {
    if (paramInt >= 0 && paramInt < this.e) {
      paramInt = (paramInt << 1) + 1;
      Object[] arrayOfObject = this.c;
      Object object = arrayOfObject[paramInt];
      arrayOfObject[paramInt] = paramObject;
      return object;
    } 
    k91.e(ga1.i("Expected index to be within 0..size()-1, but was ", paramInt));
    return null;
  }
  
  public final int hashCode() {
    int[] arrayOfInt = this.b;
    Object[] arrayOfObject = this.c;
    int j = this.e;
    boolean bool = true;
    byte b = 0;
    int i = 0;
    while (b < j) {
      int k;
      Object object = arrayOfObject[bool];
      int m = arrayOfInt[b];
      if (object != null) {
        k = object.hashCode();
      } else {
        k = 0;
      } 
      i += k ^ m;
      b++;
      bool += true;
    } 
    return i;
  }
  
  public final Object i(int paramInt) {
    if (paramInt >= 0 && paramInt < this.e)
      return this.c[(paramInt << 1) + 1]; 
    k91.e(ga1.i("Expected index to be within 0..size()-1, but was ", paramInt));
    return null;
  }
  
  public final boolean isEmpty() {
    return (this.e <= 0);
  }
  
  public final Object put(Object paramObject1, Object paramObject2) {
    int j;
    int k = this.e;
    if (paramObject1 != null) {
      j = paramObject1.hashCode();
    } else {
      j = 0;
    } 
    if (paramObject1 != null) {
      i = c(j, paramObject1);
    } else {
      i = e();
    } 
    if (i >= 0) {
      i = (i << 1) + 1;
      paramObject1 = this.c;
      Object object = paramObject1[i];
      paramObject1[i] = paramObject2;
      return object;
    } 
    int m = i ^ 0xFFFFFFFF;
    int[] arrayOfInt = this.b;
    if (k >= arrayOfInt.length) {
      i = 8;
      if (k >= 8) {
        i = (k >> 1) + k;
      } else if (k < 4) {
        i = 4;
      } 
      this.b = Arrays.copyOf(arrayOfInt, i);
      this.c = Arrays.copyOf(this.c, i << 1);
      if (k != this.e)
        throw new ConcurrentModificationException(); 
    } 
    if (m < k) {
      arrayOfInt = this.b;
      i = m + 1;
      g9.E0(i, m, k, arrayOfInt, arrayOfInt);
      Object[] arrayOfObject = this.c;
      g9.F0(i << 1, m << 1, this.e << 1, arrayOfObject, arrayOfObject);
    } 
    int i = this.e;
    if (k == i) {
      arrayOfInt = this.b;
      if (m < arrayOfInt.length) {
        arrayOfInt[m] = j;
        Object[] arrayOfObject = this.c;
        j = m << 1;
        arrayOfObject[j] = paramObject1;
        arrayOfObject[j + 1] = paramObject2;
        this.e = i + 1;
        return null;
      } 
    } 
    throw new ConcurrentModificationException();
  }
  
  public final Object putIfAbsent(Object paramObject1, Object paramObject2) {
    Object object = get(paramObject1);
    return (object == null) ? put(paramObject1, paramObject2) : object;
  }
  
  public Object remove(Object paramObject) {
    int i = d(paramObject);
    return (i >= 0) ? g(i) : null;
  }
  
  public final boolean remove(Object paramObject1, Object paramObject2) {
    int i = d(paramObject1);
    if (i >= 0 && ui0.c(paramObject2, i(i))) {
      g(i);
      return true;
    } 
    return false;
  }
  
  public final Object replace(Object paramObject1, Object paramObject2) {
    int i = d(paramObject1);
    return (i >= 0) ? h(i, paramObject2) : null;
  }
  
  public final boolean replace(Object paramObject1, Object paramObject2, Object paramObject3) {
    int i = d(paramObject1);
    if (i >= 0 && ui0.c(paramObject2, i(i))) {
      h(i, paramObject3);
      return true;
    } 
    return false;
  }
  
  public final int size() {
    return this.e;
  }
  
  public final String toString() {
    if (isEmpty())
      return "{}"; 
    StringBuilder stringBuilder = new StringBuilder(this.e * 28);
    stringBuilder.append('{');
    int i = this.e;
    for (byte b = 0; b < i; b++) {
      if (b > 0)
        stringBuilder.append(", "); 
      Object object = f(b);
      if (object != stringBuilder) {
        stringBuilder.append(object);
      } else {
        stringBuilder.append("(this Map)");
      } 
      stringBuilder.append('=');
      object = i(b);
      if (object != stringBuilder) {
        stringBuilder.append(object);
      } else {
        stringBuilder.append("(this Map)");
      } 
    } 
    stringBuilder.append('}');
    return stringBuilder.toString();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\zm1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
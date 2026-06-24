import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import me.zhanghai.android.materialprogressbar.internal.pozR.kOkiWEITVb;

public final class v8 extends u {
  public static final Object[] f = new Object[0];
  
  public int b;
  
  public Object[] c = f;
  
  public int e;
  
  public final void add(int paramInt, Object paramObject) {
    int i = this.e;
    if (paramInt >= 0 && paramInt <= i) {
      if (paramInt == i) {
        addLast(paramObject);
        return;
      } 
      if (paramInt == 0) {
        addFirst(paramObject);
        return;
      } 
      k();
      f(this.e + 1);
      i = j(this.b + paramInt);
      int j = this.e;
      if (paramInt < j + 1 >> 1) {
        if (i == 0) {
          Object[] arrayOfObject1 = this.c;
          arrayOfObject1.getClass();
          paramInt = arrayOfObject1.length - 1;
        } else {
          paramInt = i - 1;
        } 
        j = this.b;
        i = j;
        if (j == 0) {
          Object[] arrayOfObject1 = this.c;
          arrayOfObject1.getClass();
          i = arrayOfObject1.length;
        } 
        j = i - 1;
        i = this.b;
        Object[] arrayOfObject = this.c;
        if (paramInt >= i) {
          arrayOfObject[j] = arrayOfObject[i];
          g9.F0(i, i + 1, paramInt + 1, arrayOfObject, arrayOfObject);
        } else {
          g9.F0(i - 1, i, arrayOfObject.length, arrayOfObject, arrayOfObject);
          arrayOfObject = this.c;
          arrayOfObject[arrayOfObject.length - 1] = arrayOfObject[0];
          g9.F0(0, 1, paramInt + 1, arrayOfObject, arrayOfObject);
        } 
        this.c[paramInt] = paramObject;
        this.b = j;
      } else {
        paramInt = j(j + this.b);
        Object[] arrayOfObject = this.c;
        if (i < paramInt) {
          g9.F0(i + 1, i, paramInt, arrayOfObject, arrayOfObject);
        } else {
          g9.F0(1, 0, paramInt, arrayOfObject, arrayOfObject);
          arrayOfObject = this.c;
          arrayOfObject[0] = arrayOfObject[arrayOfObject.length - 1];
          g9.F0(i + 1, i, arrayOfObject.length - 1, arrayOfObject, arrayOfObject);
        } 
        this.c[i] = paramObject;
      } 
      this.e++;
      return;
    } 
    m60.m(ga1.j("index: ", paramInt, i, ", size: "));
  }
  
  public final boolean add(Object paramObject) {
    addLast(paramObject);
    return true;
  }
  
  public final boolean addAll(int paramInt, Collection paramCollection) {
    paramCollection.getClass();
    int i = this.e;
    if (paramInt >= 0 && paramInt <= i) {
      if (paramCollection.isEmpty())
        return false; 
      if (paramInt == this.e)
        return addAll(paramCollection); 
      k();
      i = this.e;
      f(paramCollection.size() + i);
      i = this.b;
      int k = j(this.e + i);
      i = j(this.b + paramInt);
      int j = paramCollection.size();
      if (paramInt < this.e + 1 >> 1) {
        k = this.b;
        paramInt = k - j;
        Object[] arrayOfObject1 = this.c;
        if (i >= k) {
          if (paramInt >= 0) {
            g9.F0(paramInt, k, i, arrayOfObject1, arrayOfObject1);
          } else {
            paramInt += arrayOfObject1.length;
            int m = arrayOfObject1.length - paramInt;
            if (m >= i - k) {
              g9.F0(paramInt, k, i, arrayOfObject1, arrayOfObject1);
            } else {
              g9.F0(paramInt, k, k + m, arrayOfObject1, arrayOfObject1);
              arrayOfObject1 = this.c;
              g9.F0(0, this.b + m, i, arrayOfObject1, arrayOfObject1);
            } 
          } 
        } else {
          g9.F0(paramInt, k, arrayOfObject1.length, arrayOfObject1, arrayOfObject1);
          arrayOfObject1 = this.c;
          if (j >= i) {
            g9.F0(arrayOfObject1.length - j, 0, i, arrayOfObject1, arrayOfObject1);
          } else {
            g9.F0(arrayOfObject1.length - j, 0, j, arrayOfObject1, arrayOfObject1);
            arrayOfObject1 = this.c;
            g9.F0(0, j, i, arrayOfObject1, arrayOfObject1);
          } 
        } 
        this.b = paramInt;
        e(h(i - j), paramCollection);
        return true;
      } 
      paramInt = i + j;
      Object[] arrayOfObject = this.c;
      if (i < k) {
        j += k;
        if (j <= arrayOfObject.length) {
          g9.F0(paramInt, i, k, arrayOfObject, arrayOfObject);
        } else if (paramInt >= arrayOfObject.length) {
          g9.F0(paramInt - arrayOfObject.length, i, k, arrayOfObject, arrayOfObject);
        } else {
          j = k - j - arrayOfObject.length;
          g9.F0(0, j, k, arrayOfObject, arrayOfObject);
          arrayOfObject = this.c;
          g9.F0(paramInt, i, j, arrayOfObject, arrayOfObject);
        } 
      } else {
        g9.F0(j, 0, k, arrayOfObject, arrayOfObject);
        arrayOfObject = this.c;
        if (paramInt >= arrayOfObject.length) {
          g9.F0(paramInt - arrayOfObject.length, i, arrayOfObject.length, arrayOfObject, arrayOfObject);
        } else {
          g9.F0(0, arrayOfObject.length - j, arrayOfObject.length, arrayOfObject, arrayOfObject);
          arrayOfObject = this.c;
          g9.F0(paramInt, i, arrayOfObject.length - j, arrayOfObject, arrayOfObject);
        } 
      } 
      e(i, paramCollection);
      return true;
    } 
    m60.m(ga1.j("index: ", paramInt, i, ", size: "));
    return false;
  }
  
  public final boolean addAll(Collection paramCollection) {
    paramCollection.getClass();
    if (paramCollection.isEmpty())
      return false; 
    k();
    int i = c();
    f(paramCollection.size() + i);
    i = this.b;
    e(j(c() + i), paramCollection);
    return true;
  }
  
  public final void addFirst(Object paramObject) {
    k();
    f(this.e + 1);
    int j = this.b;
    int i = j;
    if (j == 0) {
      Object[] arrayOfObject = this.c;
      arrayOfObject.getClass();
      i = arrayOfObject.length;
    } 
    this.b = --i;
    this.c[i] = paramObject;
    this.e++;
  }
  
  public final void addLast(Object paramObject) {
    k();
    f(c() + 1);
    Object[] arrayOfObject = this.c;
    int i = this.b;
    arrayOfObject[j(c() + i)] = paramObject;
    this.e = c() + 1;
  }
  
  public final int c() {
    return this.e;
  }
  
  public final void clear() {
    if (!super.isEmpty()) {
      k();
      int i = this.b;
      i = j(c() + i);
      i(this.b, i);
    } 
    this.b = 0;
    this.e = 0;
  }
  
  public final boolean contains(Object paramObject) {
    return (indexOf(paramObject) != -1);
  }
  
  public final Object d(int paramInt) {
    int i = this.e;
    if (paramInt >= 0 && paramInt < i) {
      if (paramInt == c() - 1)
        return removeLast(); 
      if (paramInt == 0)
        return removeFirst(); 
      k();
      i = j(this.b + paramInt);
      Object[] arrayOfObject = this.c;
      Object object = arrayOfObject[i];
      int j = this.e;
      int k = this.b;
      if (paramInt < j >> 1) {
        if (i >= k) {
          g9.F0(k + 1, k, i, arrayOfObject, arrayOfObject);
        } else {
          g9.F0(1, 0, i, arrayOfObject, arrayOfObject);
          arrayOfObject = this.c;
          arrayOfObject[0] = arrayOfObject[arrayOfObject.length - 1];
          paramInt = this.b;
          g9.F0(paramInt + 1, paramInt, arrayOfObject.length - 1, arrayOfObject, arrayOfObject);
        } 
        arrayOfObject = this.c;
        paramInt = this.b;
        arrayOfObject[paramInt] = null;
        this.b = g(paramInt);
      } else {
        paramInt = j(c() - 1 + k);
        arrayOfObject = this.c;
        if (i <= paramInt) {
          g9.F0(i, i + 1, paramInt + 1, arrayOfObject, arrayOfObject);
        } else {
          g9.F0(i, i + 1, arrayOfObject.length, arrayOfObject, arrayOfObject);
          arrayOfObject = this.c;
          arrayOfObject[arrayOfObject.length - 1] = arrayOfObject[0];
          g9.F0(0, 1, paramInt + 1, arrayOfObject, arrayOfObject);
        } 
        this.c[paramInt] = null;
      } 
      this.e--;
      return object;
    } 
    m60.m(ga1.j("index: ", paramInt, i, kOkiWEITVb.cHWsFPc));
    return null;
  }
  
  public final void e(int paramInt, Collection paramCollection) {
    Iterator iterator = paramCollection.iterator();
    int i = this.c.length;
    while (paramInt < i && iterator.hasNext()) {
      this.c[paramInt] = iterator.next();
      paramInt++;
    } 
    i = this.b;
    for (paramInt = 0; paramInt < i && iterator.hasNext(); paramInt++)
      this.c[paramInt] = iterator.next(); 
    paramInt = this.e;
    this.e = paramCollection.size() + paramInt;
  }
  
  public final void f(int paramInt) {
    if (paramInt >= 0) {
      Object[] arrayOfObject2 = this.c;
      if (paramInt <= arrayOfObject2.length)
        return; 
      if (arrayOfObject2 == f) {
        int k = paramInt;
        if (paramInt < 10)
          k = 10; 
        this.c = new Object[k];
        return;
      } 
      int i = arrayOfObject2.length;
      int j = i + (i >> 1);
      i = j;
      if (j - paramInt < 0)
        i = paramInt; 
      j = i;
      if (i - 2147483639 > 0)
        if (paramInt > 2147483639) {
          j = Integer.MAX_VALUE;
        } else {
          j = 2147483639;
        }  
      Object[] arrayOfObject1 = new Object[j];
      g9.F0(0, this.b, arrayOfObject2.length, arrayOfObject2, arrayOfObject1);
      arrayOfObject2 = this.c;
      paramInt = arrayOfObject2.length;
      i = this.b;
      g9.F0(paramInt - i, 0, i, arrayOfObject2, arrayOfObject1);
      this.b = 0;
      this.c = arrayOfObject1;
      return;
    } 
    tp.f("Deque is too big.");
  }
  
  public final int g(int paramInt) {
    Object[] arrayOfObject = this.c;
    arrayOfObject.getClass();
    return (paramInt == arrayOfObject.length - 1) ? 0 : (paramInt + 1);
  }
  
  public final Object get(int paramInt) {
    int i = c();
    if (paramInt >= 0 && paramInt < i)
      return this.c[j(this.b + paramInt)]; 
    m60.m(ga1.j("index: ", paramInt, i, ", size: "));
    return null;
  }
  
  public final int h(int paramInt) {
    int i = paramInt;
    if (paramInt < 0)
      i = paramInt + this.c.length; 
    return i;
  }
  
  public final void i(int paramInt1, int paramInt2) {
    Object[] arrayOfObject = this.c;
    if (paramInt1 < paramInt2) {
      g9.I0(arrayOfObject, null, paramInt1, paramInt2);
      return;
    } 
    Arrays.fill(arrayOfObject, paramInt1, arrayOfObject.length, (Object)null);
    g9.I0(this.c, null, 0, paramInt2);
  }
  
  public final int indexOf(Object paramObject) {
    int i = this.b;
    int j = j(c() + i);
    i = this.b;
    if (i < j) {
      while (i < j) {
        if (ui0.c(paramObject, this.c[i])) {
          j = this.b;
          return i - j;
        } 
        i++;
      } 
    } else if (!super.isEmpty()) {
      i = this.b;
      if (i >= j) {
        int k = this.c.length;
        while (i < k) {
          if (ui0.c(paramObject, this.c[i])) {
            j = this.b;
            return i - j;
          } 
          i++;
        } 
        for (i = 0; i < j; i++) {
          if (ui0.c(paramObject, this.c[i])) {
            i += this.c.length;
            j = this.b;
            return i - j;
          } 
        } 
      } 
    } 
    return -1;
  }
  
  public final boolean isEmpty() {
    return (c() == 0);
  }
  
  public final int j(int paramInt) {
    Object[] arrayOfObject = this.c;
    int i = paramInt;
    if (paramInt >= arrayOfObject.length)
      i = paramInt - arrayOfObject.length; 
    return i;
  }
  
  public final void k() {
    this.modCount++;
  }
  
  public final int lastIndexOf(Object paramObject) {
    int i = this.b;
    i = j(this.e + i);
    int j = this.b;
    if (j < i) {
      if (j <= --i)
        while (true) {
          if (ui0.c(paramObject, this.c[i])) {
            j = this.b;
            return i - j;
          } 
          if (i != j) {
            i--;
            continue;
          } 
          break;
        }  
    } else if (!isEmpty() && this.b >= i) {
      i--;
      while (true) {
        Object[] arrayOfObject = this.c;
        if (-1 < i) {
          if (ui0.c(paramObject, arrayOfObject[i])) {
            i += this.c.length;
            j = this.b;
            // Byte code: goto -> 52
          } 
          i--;
          continue;
        } 
        arrayOfObject.getClass();
        i = arrayOfObject.length - 1;
        j = this.b;
        if (j <= i)
          while (true) {
            if (ui0.c(paramObject, this.c[i])) {
              j = this.b;
              return i - j;
            } 
            if (i != j) {
              i--;
              continue;
            } 
            break;
          }  
        break;
      } 
    } 
    return -1;
  }
  
  public final boolean remove(Object paramObject) {
    int i = indexOf(paramObject);
    if (i == -1)
      return false; 
    d(i);
    return true;
  }
  
  public final boolean removeAll(Collection paramCollection) {
    paramCollection.getClass();
    boolean bool = isEmpty();
    boolean bool1 = false;
    boolean bool2 = false;
    boolean bool4 = false;
    boolean bool3 = bool2;
    if (!bool)
      if (this.c.length == 0) {
        bool3 = bool2;
      } else {
        int i = this.b;
        int j = j(this.e + i);
        i = this.b;
        if (i < j) {
          int k = i;
          bool2 = bool4;
          while (true) {
            Object object = this.c;
            if (i < j) {
              object = object[i];
              if (!paramCollection.contains(object)) {
                this.c[k] = object;
                k++;
              } else {
                bool2 = true;
              } 
              i++;
              continue;
            } 
            g9.I0((Object[])object, null, k, j);
            i = k;
            bool3 = bool2;
          } 
        } else {
          int m = this.c.length;
          bool2 = false;
          int k = i;
          while (i < m) {
            Object[] arrayOfObject = this.c;
            Object object = arrayOfObject[i];
            arrayOfObject[i] = null;
            if (!paramCollection.contains(object)) {
              this.c[k] = object;
              k++;
            } else {
              bool2 = true;
            } 
            i++;
          } 
          i = j(k);
          for (k = bool1; k < j; k++) {
            Object[] arrayOfObject = this.c;
            Object object = arrayOfObject[k];
            arrayOfObject[k] = null;
            if (!paramCollection.contains(object)) {
              this.c[i] = object;
              i = g(i);
            } else {
              bool2 = true;
            } 
          } 
          bool3 = bool2;
        } 
      }  
    return bool3;
  }
  
  public final Object removeFirst() {
    if (!isEmpty()) {
      k();
      Object[] arrayOfObject = this.c;
      int i = this.b;
      Object object = arrayOfObject[i];
      arrayOfObject[i] = null;
      this.b = g(i);
      this.e = c() - 1;
      return object;
    } 
    throw new NoSuchElementException("ArrayDeque is empty.");
  }
  
  public final Object removeLast() {
    if (!isEmpty()) {
      k();
      int i = this.b;
      i = j(size() - 1 + i);
      Object[] arrayOfObject = this.c;
      Object object = arrayOfObject[i];
      arrayOfObject[i] = null;
      this.e = c() - 1;
      return object;
    } 
    throw new NoSuchElementException("ArrayDeque is empty.");
  }
  
  public final void removeRange(int paramInt1, int paramInt2) {
    wf2.j(paramInt1, paramInt2, this.e);
    int k = paramInt2 - paramInt1;
    if (k == 0)
      return; 
    if (k == this.e) {
      clear();
      return;
    } 
    if (k == 1) {
      d(paramInt1);
      return;
    } 
    k();
    int i = this.e;
    int j = this.b;
    if (paramInt1 < i - paramInt2) {
      j = j(paramInt1 - 1 + j);
      i = j(this.b + paramInt2 - 1);
      paramInt2 = j;
      while (paramInt1 > 0) {
        int m = paramInt2 + 1;
        j = Math.min(paramInt1, Math.min(m, i + 1));
        Object[] arrayOfObject = this.c;
        i -= j;
        paramInt2 -= j;
        g9.F0(i + 1, paramInt2 + 1, m, arrayOfObject, arrayOfObject);
        paramInt2 = h(paramInt2);
        i = h(i);
        paramInt1 -= j;
      } 
      paramInt1 = j(this.b + k);
      i(this.b, paramInt1);
      this.b = paramInt1;
    } else {
      int m = j(j + paramInt2);
      paramInt1 = j(this.b + paramInt1);
      i = this.e;
      j = paramInt2;
      paramInt2 = m;
      while (true) {
        i -= j;
        if (i > 0) {
          Object[] arrayOfObject = this.c;
          j = Math.min(i, Math.min(arrayOfObject.length - paramInt2, arrayOfObject.length - paramInt1));
          arrayOfObject = this.c;
          m = paramInt2 + j;
          g9.F0(paramInt1, paramInt2, m, arrayOfObject, arrayOfObject);
          paramInt2 = j(m);
          paramInt1 = j(paramInt1 + j);
          continue;
        } 
        paramInt1 = this.b;
        paramInt1 = j(this.e + paramInt1);
        i(h(paramInt1 - k), paramInt1);
        this.e -= k;
        return;
      } 
    } 
    this.e -= k;
  }
  
  public final boolean retainAll(Collection paramCollection) {
    paramCollection.getClass();
    boolean bool = isEmpty();
    boolean bool1 = false;
    boolean bool2 = false;
    boolean bool4 = false;
    boolean bool3 = bool2;
    if (!bool)
      if (this.c.length == 0) {
        bool3 = bool2;
      } else {
        int i = this.b;
        int j = j(this.e + i);
        i = this.b;
        if (i < j) {
          int k = i;
          bool2 = bool4;
          while (true) {
            Object object = this.c;
            if (i < j) {
              object = object[i];
              if (paramCollection.contains(object)) {
                this.c[k] = object;
                k++;
              } else {
                bool2 = true;
              } 
              i++;
              continue;
            } 
            g9.I0((Object[])object, null, k, j);
            i = k;
            bool3 = bool2;
          } 
        } else {
          int m = this.c.length;
          bool2 = false;
          int k = i;
          while (i < m) {
            Object[] arrayOfObject = this.c;
            Object object = arrayOfObject[i];
            arrayOfObject[i] = null;
            if (paramCollection.contains(object)) {
              this.c[k] = object;
              k++;
            } else {
              bool2 = true;
            } 
            i++;
          } 
          i = j(k);
          for (k = bool1; k < j; k++) {
            Object[] arrayOfObject = this.c;
            Object object = arrayOfObject[k];
            arrayOfObject[k] = null;
            if (paramCollection.contains(object)) {
              this.c[i] = object;
              i = g(i);
            } else {
              bool2 = true;
            } 
          } 
          bool3 = bool2;
        } 
      }  
    return bool3;
  }
  
  public final Object set(int paramInt, Object paramObject) {
    int i = c();
    if (paramInt >= 0 && paramInt < i) {
      paramInt = j(this.b + paramInt);
      Object[] arrayOfObject = this.c;
      Object object = arrayOfObject[paramInt];
      arrayOfObject[paramInt] = paramObject;
      return object;
    } 
    m60.m(ga1.j("index: ", paramInt, i, ", size: "));
    return null;
  }
  
  public final Object[] toArray() {
    return toArray(new Object[c()]);
  }
  
  public final Object[] toArray(Object[] paramArrayOfObject) {
    Object object;
    paramArrayOfObject.getClass();
    int j = paramArrayOfObject.length;
    int i = this.e;
    if (j < i) {
      object = Array.newInstance(paramArrayOfObject.getClass().getComponentType(), i);
      object.getClass();
      object = object;
    } 
    i = this.b;
    i = j(this.e + i);
    j = this.b;
    if (j < i) {
      g9.G0(j, i, 2, this.c, (Object[])object);
    } else if (!isEmpty()) {
      Object[] arrayOfObject = this.c;
      g9.F0(0, this.b, arrayOfObject.length, arrayOfObject, (Object[])object);
      arrayOfObject = this.c;
      g9.F0(arrayOfObject.length - this.b, 0, i, arrayOfObject, (Object[])object);
    } 
    i = this.e;
    if (i < object.length)
      object[i] = null; 
    return (Object[])object;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\v8.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
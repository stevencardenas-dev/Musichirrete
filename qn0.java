import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Comparator;
import java.util.Set;

public final class qn0 extends AbstractMap implements Serializable {
  public static final ij k = new ij(7);
  
  public final Comparator b = k;
  
  public final boolean c;
  
  public pn0 e;
  
  public int f = 0;
  
  public int g = 0;
  
  public final pn0 h;
  
  public on0 i;
  
  public on0 j;
  
  public qn0(boolean paramBoolean) {
    this.c = paramBoolean;
    this.h = new pn0(paramBoolean);
  }
  
  public final pn0 a(Object paramObject, boolean paramBoolean) {
    boolean bool;
    Object object = this.e;
    ij ij1 = k;
    Comparator<Object> comparator = this.b;
    if (object != null) {
      Comparable<Object> comparable;
      if (comparator == ij1) {
        comparable = (Comparable)paramObject;
      } else {
        comparable = null;
      } 
      while (true) {
        Object object1 = ((pn0)object).h;
        if (comparable != null) {
          bool = comparable.compareTo(object1);
        } else {
          bool = comparator.compare(paramObject, object1);
        } 
        if (bool == 0)
          return (pn0)object; 
        if (bool < 0) {
          object1 = ((pn0)object).c;
        } else {
          object1 = ((pn0)object).e;
        } 
        if (object1 == null)
          break; 
        object = object1;
      } 
    } else {
      bool = false;
    } 
    if (!paramBoolean)
      return null; 
    pn0 pn01 = this.h;
    if (object == null) {
      if (comparator != ij1 || paramObject instanceof Comparable) {
        paramObject = new pn0(this.c, (pn0)object, paramObject, pn01, pn01.g);
        this.e = (pn0)paramObject;
        this.f++;
        this.g++;
        return (pn0)paramObject;
      } 
      throw new ClassCastException(paramObject.getClass().getName().concat(" is not Comparable"));
    } 
    paramObject = new pn0(this.c, (pn0)object, paramObject, pn01, pn01.g);
    if (bool) {
      ((pn0)object).c = (pn0)paramObject;
    } else {
      ((pn0)object).e = (pn0)paramObject;
    } 
    b((pn0)object, true);
    this.f++;
    this.g++;
    return (pn0)paramObject;
  }
  
  public final void b(pn0 parampn0, boolean paramBoolean) {
    while (parampn0 != null) {
      int i;
      int j;
      pn0 pn02 = parampn0.c;
      pn0 pn01 = parampn0.e;
      boolean bool = false;
      byte b = 0;
      if (pn02 != null) {
        i = pn02.k;
      } else {
        i = 0;
      } 
      if (pn01 != null) {
        j = pn01.k;
      } else {
        j = 0;
      } 
      int k = i - j;
      if (k == -2) {
        pn0 pn03 = pn01.c;
        pn02 = pn01.e;
        if (pn02 != null) {
          i = pn02.k;
        } else {
          i = 0;
        } 
        j = b;
        if (pn03 != null)
          j = pn03.k; 
        i = j - i;
        if (i == -1 || (i == 0 && !paramBoolean)) {
          e(parampn0);
        } else {
          f(pn01);
          e(parampn0);
        } 
        if (paramBoolean)
          break; 
      } else if (k == 2) {
        pn01 = pn02.c;
        pn0 pn03 = pn02.e;
        if (pn03 != null) {
          i = pn03.k;
        } else {
          i = 0;
        } 
        j = bool;
        if (pn01 != null)
          j = pn01.k; 
        i = j - i;
        if (i == 1 || (i == 0 && !paramBoolean)) {
          f(parampn0);
        } else {
          e(pn02);
          f(parampn0);
        } 
        if (paramBoolean)
          break; 
      } else if (k == 0) {
        parampn0.k = i + 1;
        if (paramBoolean)
          break; 
      } else {
        parampn0.k = Math.max(i, j) + 1;
        if (!paramBoolean)
          break; 
      } 
      parampn0 = parampn0.b;
    } 
  }
  
  public final void c(pn0 parampn0, boolean paramBoolean) {
    if (paramBoolean) {
      pn0 pn04 = parampn0.g;
      pn04.f = parampn0.f;
      parampn0.f.g = pn04;
    } 
    pn0 pn01 = parampn0.c;
    pn0 pn02 = parampn0.e;
    pn0 pn03 = parampn0.b;
    int i = 0;
    if (pn01 != null && pn02 != null) {
      boolean bool;
      if (pn01.k > pn02.k) {
        pn03 = pn01.e;
        pn02 = pn01;
        pn01 = pn03;
        while (true) {
          pn03 = pn02;
          pn02 = pn01;
          pn01 = pn03;
          if (pn02 != null) {
            pn01 = pn02.e;
            continue;
          } 
          break;
        } 
      } else {
        for (pn01 = pn02.c; pn01 != null; pn01 = pn03) {
          pn03 = pn01.c;
          pn02 = pn01;
        } 
        pn01 = pn02;
      } 
      c(pn01, false);
      pn02 = parampn0.c;
      if (pn02 != null) {
        bool = pn02.k;
        pn01.c = pn02;
        pn02.b = pn01;
        parampn0.c = null;
      } else {
        bool = false;
      } 
      pn02 = parampn0.e;
      if (pn02 != null) {
        i = pn02.k;
        pn01.e = pn02;
        pn02.b = pn01;
        parampn0.e = null;
      } 
      pn01.k = Math.max(bool, i) + 1;
      d(parampn0, pn01);
      return;
    } 
    if (pn01 != null) {
      d(parampn0, pn01);
      parampn0.c = null;
    } else if (pn02 != null) {
      d(parampn0, pn02);
      parampn0.e = null;
    } else {
      d(parampn0, null);
    } 
    b(pn03, false);
    this.f--;
    this.g++;
  }
  
  public final void clear() {
    this.e = null;
    this.f = 0;
    this.g++;
    pn0 pn01 = this.h;
    pn01.g = pn01;
    pn01.f = pn01;
  }
  
  public final boolean containsKey(Object paramObject) {
    pn0 pn02 = null;
    pn0 pn01 = pn02;
    if (paramObject != null)
      try {
        pn01 = a(paramObject, false);
      } catch (ClassCastException classCastException) {
        pn01 = pn02;
      }  
    return (pn01 != null);
  }
  
  public final void d(pn0 parampn01, pn0 parampn02) {
    pn0 pn01 = parampn01.b;
    parampn01.b = null;
    if (parampn02 != null)
      parampn02.b = pn01; 
    if (pn01 != null) {
      if (pn01.c == parampn01) {
        pn01.c = parampn02;
        return;
      } 
      pn01.e = parampn02;
      return;
    } 
    this.e = parampn02;
  }
  
  public final void e(pn0 parampn0) {
    pn0 pn03 = parampn0.c;
    pn0 pn02 = parampn0.e;
    pn0 pn04 = pn02.c;
    pn0 pn01 = pn02.e;
    parampn0.e = pn04;
    if (pn04 != null)
      pn04.b = parampn0; 
    d(parampn0, pn02);
    pn02.c = parampn0;
    parampn0.b = pn02;
    byte b = 0;
    if (pn03 != null) {
      i = pn03.k;
    } else {
      i = 0;
    } 
    if (pn04 != null) {
      j = pn04.k;
    } else {
      j = 0;
    } 
    int j = Math.max(i, j) + 1;
    parampn0.k = j;
    int i = b;
    if (pn01 != null)
      i = pn01.k; 
    pn02.k = Math.max(j, i) + 1;
  }
  
  public final Set entrySet() {
    on0 on02 = this.i;
    on0 on01 = on02;
    if (on02 == null) {
      on01 = new on0(this, 0);
      this.i = on01;
    } 
    return on01;
  }
  
  public final void f(pn0 parampn0) {
    pn0 pn04 = parampn0.c;
    pn0 pn01 = parampn0.e;
    pn0 pn03 = pn04.c;
    pn0 pn02 = pn04.e;
    parampn0.c = pn02;
    if (pn02 != null)
      pn02.b = parampn0; 
    d(parampn0, pn04);
    pn04.e = parampn0;
    parampn0.b = pn04;
    byte b = 0;
    if (pn01 != null) {
      i = pn01.k;
    } else {
      i = 0;
    } 
    if (pn02 != null) {
      j = pn02.k;
    } else {
      j = 0;
    } 
    int j = Math.max(i, j) + 1;
    parampn0.k = j;
    int i = b;
    if (pn03 != null)
      i = pn03.k; 
    pn04.k = Math.max(j, i) + 1;
  }
  
  public final Object get(Object paramObject) {
    if (paramObject != null)
      try {
        paramObject = a(paramObject, false);
        return (paramObject != null) ? ((pn0)paramObject).j : null;
      } catch (ClassCastException classCastException) {} 
    paramObject = null;
    return (paramObject != null) ? ((pn0)paramObject).j : null;
  }
  
  public final Set keySet() {
    on0 on02 = this.j;
    on0 on01 = on02;
    if (on02 == null) {
      on01 = new on0(this, 1);
      this.j = on01;
    } 
    return on01;
  }
  
  public final Object put(Object paramObject1, Object paramObject2) {
    if (paramObject1 != null) {
      if (paramObject2 != null || this.c) {
        pn0 pn01 = a(paramObject1, true);
        paramObject1 = pn01.j;
        pn01.j = paramObject2;
        return paramObject1;
      } 
      k91.h("value == null");
      return null;
    } 
    k91.h("key == null");
    return null;
  }
  
  public final Object remove(Object paramObject) {
    if (paramObject != null)
      try {
        paramObject = a(paramObject, false);
        if (paramObject != null)
          c((pn0)paramObject, true); 
        return (paramObject != null) ? ((pn0)paramObject).j : null;
      } catch (ClassCastException classCastException) {} 
    paramObject = null;
    if (paramObject != null)
      c((pn0)paramObject, true); 
    return (paramObject != null) ? ((pn0)paramObject).j : null;
  }
  
  public final int size() {
    return this.f;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\qn0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
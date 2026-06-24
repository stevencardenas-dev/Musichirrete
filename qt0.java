import android.util.Pair;

public final class qt0 {
  public final su1 a = new su1();
  
  public final tu1 b = new tu1();
  
  public long c;
  
  public uu1 d = uu1.a;
  
  public int e;
  
  public boolean f;
  
  public ot0 g;
  
  public ot0 h;
  
  public ot0 i;
  
  public int j;
  
  public Object k;
  
  public long l;
  
  public final ot0 a() {
    ot0 ot01 = this.g;
    if (ot01 == null)
      return null; 
    if (ot01 == this.h)
      this.h = ot01.k; 
    ot01.e();
    int i = this.j - 1;
    this.j = i;
    if (i == 0) {
      this.i = null;
      ot01 = this.g;
      this.k = ot01.b;
      this.l = ot01.f.a.d;
    } 
    ot01 = this.g.k;
    this.g = ot01;
    return ot01;
  }
  
  public final void b(boolean paramBoolean) {
    ot0 ot01 = this.g;
    if (ot01 != null) {
      Object object;
      if (paramBoolean) {
        object = ot01.b;
      } else {
        object = null;
      } 
      this.k = object;
      this.l = ot01.f.a.d;
      h(ot01);
      ot01.e();
    } else if (!paramBoolean) {
      this.k = null;
    } 
    this.g = null;
    this.i = null;
    this.h = null;
    this.j = 0;
  }
  
  public final pt0 c(ot0 paramot0, long paramLong) {
    Pair pair;
    pt0 pt0 = paramot0.f;
    long l2 = paramot0.n;
    long l1 = pt0.d;
    fw0 fw0 = pt0.a;
    Object object2 = fw0.a;
    boolean bool = pt0.e;
    uu1 uu11 = this.d;
    Object object1 = this.a;
    if (bool) {
      int k = uu11.b(object2);
      object2 = this.d;
      int j = this.e;
      bool = this.f;
      j = object2.d(k, this.a, this.b, j, bool);
      if (j == -1)
        return null; 
      k = (this.d.f(j, (su1)object1, true)).c;
      object1 = ((su1)object1).b;
      long l3 = fw0.d;
      uu1 uu12 = this.d;
      object2 = this.b;
      long l4 = 0L;
      if ((uu12.l(k, (tu1)object2, 0L)).g == j) {
        object1 = this.d;
        paramLong = Math.max(0L, l2 + l1 - paramLong);
        pair = object1.j(this.b, this.a, k, -9223372036854775807L, paramLong);
        if (pair == null)
          return null; 
        object1 = pair.first;
        l4 = ((Long)pair.second).longValue();
        paramot0 = paramot0.k;
        if (paramot0 != null && paramot0.b.equals(object1)) {
          paramLong = paramot0.f.a.d;
        } else {
          paramLong = this.c;
          this.c = 1L + paramLong;
        } 
        l3 = paramLong;
      } 
      return d(j(object1, l4, l3), l4);
    } 
    uu11.g(object2, (su1)object1);
    if (pair.b()) {
      int j = ((fw0)pair).b;
      ((su1)object1).f.c[j].getClass();
      return null;
    } 
    int i = object1.b(pt0.c);
    if (i == -1)
      return e(((fw0)pair).a, pt0.d, ((fw0)pair).d); 
    s2 s2 = ((su1)object1).f.c[i];
    byte b = 0;
    while (true) {
      int[] arrayOfInt = s2.b;
      if (b < arrayOfInt.length) {
        int j = arrayOfInt[b];
        if (j == 0 || j == 1)
          break; 
        b++;
        continue;
      } 
      break;
    } 
    ((su1)object1).f.c[i].getClass();
    return null;
  }
  
  public final pt0 d(fw0 paramfw0, long paramLong) {
    uu1 uu11 = this.d;
    Object object = paramfw0.a;
    su1 su11 = this.a;
    uu11.g(object, su11);
    if (paramfw0.b()) {
      int i = paramfw0.b;
      su11.f.c[i].getClass();
      return null;
    } 
    return e(paramfw0.a, paramLong, paramfw0.d);
  }
  
  public final pt0 e(Object paramObject, long paramLong1, long paramLong2) {
    boolean bool;
    su1 su11 = this.a;
    int i = su11.a(paramLong1);
    paramObject = new fw0(paramObject, paramLong2, i);
    if (!paramObject.b() && i == -1) {
      bool = true;
    } else {
      bool = false;
    } 
    boolean bool1 = g((fw0)paramObject, bool);
    if (i != -1) {
      paramLong2 = su11.f.b[i];
    } else {
      paramLong2 = -9223372036854775807L;
    } 
    if (paramLong2 == -9223372036854775807L || paramLong2 == Long.MIN_VALUE) {
      long l1 = su11.d;
      return new pt0((fw0)paramObject, paramLong1, paramLong2, l1, bool, bool1);
    } 
    long l = paramLong2;
    return new pt0((fw0)paramObject, paramLong1, paramLong2, l, bool, bool1);
  }
  
  public final pt0 f(pt0 parampt0) {
    boolean bool;
    fw0 fw0 = parampt0.a;
    if (!fw0.b() && fw0.e == -1) {
      bool = true;
    } else {
      bool = false;
    } 
    boolean bool1 = g(fw0, bool);
    uu1 uu11 = this.d;
    Object object = fw0.a;
    su1 su11 = this.a;
    uu11.g(object, su11);
    boolean bool2 = fw0.b();
    long l = -9223372036854775807L;
    if (bool2) {
      int i = fw0.b;
      su11.f.c[i].getClass();
    } else {
      l = parampt0.c;
      if (l == -9223372036854775807L || l == Long.MIN_VALUE)
        l = su11.d; 
    } 
    return new pt0(fw0, parampt0.b, parampt0.c, l, bool, bool1);
  }
  
  public final boolean g(fw0 paramfw0, boolean paramBoolean) {
    int i = this.d.b(paramfw0.a);
    int j = (this.d.f(i, this.a, false)).c;
    if (!(this.d.l(j, this.b, 0L)).f) {
      uu1 uu11 = this.d;
      j = this.e;
      boolean bool = this.f;
      if (uu11.d(i, this.a, this.b, j, bool) == -1 && paramBoolean)
        return true; 
    } 
    return false;
  }
  
  public final boolean h(ot0 paramot0) {
    boolean bool2 = false;
    if (paramot0 != null) {
      bool1 = true;
    } else {
      bool1 = false;
    } 
    n21.r(bool1);
    this.i = paramot0;
    boolean bool1 = bool2;
    while (true) {
      paramot0 = paramot0.k;
      if (paramot0 != null) {
        if (paramot0 == this.h) {
          this.h = this.g;
          bool1 = true;
        } 
        paramot0.e();
        this.j--;
        continue;
      } 
      paramot0 = this.i;
      if (paramot0.k == null)
        return bool1; 
      paramot0.b();
      paramot0.k = null;
      paramot0.c();
      return bool1;
    } 
  }
  
  public final fw0 i(long paramLong, Object paramObject) {
    uu1 uu11 = this.d;
    su1 su11 = this.a;
    int i = (uu11.g(paramObject, su11)).c;
    Object object = this.k;
    if (object != null) {
      int j = this.d.b(object);
      if (j != -1 && (this.d.f(j, su11, false)).c == i) {
        long l = this.l;
        return j(paramObject, paramLong, l);
      } 
    } 
    for (object = this.g; object != null; object = ((ot0)object).k) {
      if (((ot0)object).b.equals(paramObject)) {
        long l = ((ot0)object).f.a.d;
        // Byte code: goto -> 251
      } 
    } 
    for (object = this.g; object != null; object = ((ot0)object).k) {
      int j = this.d.b(((ot0)object).b);
      if (j != -1 && (this.d.f(j, su11, false)).c == i) {
        long l = ((ot0)object).f.a.d;
        // Byte code: goto -> 251
      } 
    } 
    long l2 = this.c;
    this.c = 1L + l2;
    long l1 = l2;
    if (this.g == null) {
      this.k = paramObject;
      this.l = l2;
      l1 = l2;
    } 
    return j(paramObject, paramLong, l1);
  }
  
  public final fw0 j(Object paramObject, long paramLong1, long paramLong2) {
    uu1 uu11 = this.d;
    su1 su11 = this.a;
    uu11.g(paramObject, su11);
    int i = su11.b(paramLong1);
    if (i == -1)
      return new fw0(paramObject, paramLong2, su11.a(paramLong1)); 
    s2 s2 = su11.f.c[i];
    byte b = 0;
    while (true) {
      int[] arrayOfInt = s2.b;
      if (b < arrayOfInt.length) {
        int j = arrayOfInt[b];
        if (j == 0 || j == 1)
          break; 
        b++;
        continue;
      } 
      break;
    } 
    return new fw0(paramObject, i, b, paramLong2, -1);
  }
  
  public final boolean k() {
    ot0 ot02;
    ot0 ot01 = this.g;
    if (ot01 == null)
      return true; 
    int i = this.d.b(ot01.b);
    do {
      uu1 uu11 = this.d;
      int j = this.e;
      boolean bool1 = this.f;
      i = uu11.d(i, this.a, this.b, j, bool1);
      ot02 = ot01;
      while (true) {
        ot01 = ot02.k;
        if (ot01 != null && !ot02.f.e) {
          ot02 = ot01;
          continue;
        } 
        break;
      } 
    } while (i != -1 && ot01 != null && this.d.b(ot01.b) == i);
    boolean bool = h(ot02);
    ot02.f = f(ot02.f);
    return bool ^ true;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\qt0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
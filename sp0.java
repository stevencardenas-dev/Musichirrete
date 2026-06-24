import java.util.Arrays;

public final class sp0 implements Cloneable {
  public boolean b;
  
  public long[] c;
  
  public Object[] e;
  
  public int f;
  
  public sp0() {
    int j;
    int i = 4;
    while (true) {
      j = 80;
      if (i < 32) {
        j = (1 << i) - 12;
        if (80 <= j)
          break; 
        i++;
        continue;
      } 
      break;
    } 
    i = j / 8;
    this.c = new long[i];
    this.e = new Object[i];
  }
  
  public final void a() {
    int i = this.f;
    Object[] arrayOfObject = this.e;
    for (byte b = 0; b < i; b++)
      arrayOfObject[b] = null; 
    this.f = 0;
    this.b = false;
  }
  
  public final Object b(long paramLong) {
    int i = ws2.g(this.c, this.f, paramLong);
    if (i >= 0) {
      Object object = this.e[i];
      if (object != ws2.g)
        return object; 
    } 
    return null;
  }
  
  public final long c(int paramInt) {
    if (paramInt >= 0) {
      int i = this.f;
      if (paramInt < i) {
        if (this.b) {
          long[] arrayOfLong = this.c;
          Object[] arrayOfObject = this.e;
          int k = 0;
          int j;
          for (j = 0; k < i; j = m) {
            Object object = arrayOfObject[k];
            int m = j;
            if (object != ws2.g) {
              if (k != j) {
                arrayOfLong[j] = arrayOfLong[k];
                arrayOfObject[j] = object;
                arrayOfObject[k] = null;
              } 
              m = j + 1;
            } 
            k++;
          } 
          this.b = false;
          this.f = j;
        } 
        return this.c[paramInt];
      } 
    } 
    k91.e(ga1.i("Expected index to be within 0..size()-1, but was ", paramInt));
    return 0L;
  }
  
  public final Object clone() {
    Object object = super.clone();
    object.getClass();
    object = object;
    ((sp0)object).c = (long[])this.c.clone();
    ((sp0)object).e = (Object[])this.e.clone();
    return object;
  }
  
  public final void d(long paramLong, Object paramObject) {
    Object object = ws2.g;
    int i = ws2.g(this.c, this.f, paramLong);
    if (i >= 0) {
      this.e[i] = paramObject;
      return;
    } 
    int j = i ^ 0xFFFFFFFF;
    int k = this.f;
    if (j < k) {
      Object[] arrayOfObject = this.e;
      if (arrayOfObject[j] == object) {
        this.c[j] = paramLong;
        arrayOfObject[j] = paramObject;
        return;
      } 
    } 
    i = j;
    if (this.b) {
      long[] arrayOfLong = this.c;
      i = j;
      if (k >= arrayOfLong.length) {
        Object[] arrayOfObject = this.e;
        i = 0;
        for (j = 0; i < k; j = m) {
          Object object1 = arrayOfObject[i];
          int m = j;
          if (object1 != object) {
            if (i != j) {
              arrayOfLong[j] = arrayOfLong[i];
              arrayOfObject[j] = object1;
              arrayOfObject[i] = null;
            } 
            m = j + 1;
          } 
          i++;
        } 
        this.b = false;
        this.f = j;
        i = ws2.g(this.c, j, paramLong) ^ 0xFFFFFFFF;
      } 
    } 
    j = this.f;
    if (j >= this.c.length) {
      int m;
      k = (j + 1) * 8;
      j = 4;
      while (true) {
        m = k;
        if (j < 32) {
          m = (1 << j) - 12;
          if (k <= m)
            break; 
          j++;
          continue;
        } 
        break;
      } 
      j = m / 8;
      this.c = Arrays.copyOf(this.c, j);
      this.e = Arrays.copyOf(this.e, j);
    } 
    j = this.f - i;
    if (j != 0) {
      object = this.c;
      int m = i + 1;
      object.getClass();
      System.arraycopy(object, i, object, m, j);
      object = this.e;
      g9.F0(m, i, this.f, (Object[])object, (Object[])object);
    } 
    this.c[i] = paramLong;
    this.e[i] = paramObject;
    this.f++;
  }
  
  public final int e() {
    if (this.b) {
      int k = this.f;
      long[] arrayOfLong = this.c;
      Object[] arrayOfObject = this.e;
      int i = 0;
      int j;
      for (j = 0; i < k; j = m) {
        Object object = arrayOfObject[i];
        int m = j;
        if (object != ws2.g) {
          if (i != j) {
            arrayOfLong[j] = arrayOfLong[i];
            arrayOfObject[j] = object;
            arrayOfObject[i] = null;
          } 
          m = j + 1;
        } 
        i++;
      } 
      this.b = false;
      this.f = j;
    } 
    return this.f;
  }
  
  public final Object f(int paramInt) {
    if (paramInt >= 0) {
      int i = this.f;
      if (paramInt < i) {
        if (this.b) {
          long[] arrayOfLong = this.c;
          Object[] arrayOfObject = this.e;
          int k = 0;
          int j;
          for (j = 0; k < i; j = m) {
            Object object = arrayOfObject[k];
            int m = j;
            if (object != ws2.g) {
              if (k != j) {
                arrayOfLong[j] = arrayOfLong[k];
                arrayOfObject[j] = object;
                arrayOfObject[k] = null;
              } 
              m = j + 1;
            } 
            k++;
          } 
          this.b = false;
          this.f = j;
        } 
        return this.e[paramInt];
      } 
    } 
    k91.e(ga1.i("Expected index to be within 0..size()-1, but was ", paramInt));
    return null;
  }
  
  public final String toString() {
    if (e() <= 0)
      return "{}"; 
    StringBuilder stringBuilder = new StringBuilder(this.f * 28);
    stringBuilder.append('{');
    int i = this.f;
    for (byte b = 0; b < i; b++) {
      if (b > 0)
        stringBuilder.append(", "); 
      stringBuilder.append(c(b));
      stringBuilder.append('=');
      Object object = f(b);
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


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\sp0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
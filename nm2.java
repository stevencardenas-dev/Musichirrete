import java.util.Arrays;

public final class nm2 {
  public static final nm2 f = new nm2(0, new int[0], new Object[0], false);
  
  public int a;
  
  public int[] b;
  
  public Object[] c;
  
  public int d = -1;
  
  public boolean e;
  
  public nm2(int paramInt, int[] paramArrayOfint, Object[] paramArrayOfObject, boolean paramBoolean) {
    this.a = paramInt;
    this.b = paramArrayOfint;
    this.c = paramArrayOfObject;
    this.e = paramBoolean;
  }
  
  public static nm2 b() {
    return new nm2(0, new int[8], new Object[8], true);
  }
  
  public final int a() {
    int i = this.d;
    if (i == -1) {
      byte b = 0;
      i = 0;
      while (true) {
        if (b < this.a) {
          int k = this.b[b];
          int j = k >>> 3;
          k &= 0x7;
          if (k != 0) {
            if (k != 1) {
              if (k != 2) {
                if (k != 3) {
                  if (k == 5) {
                    ((Integer)this.c[b]).getClass();
                    j = ik2.n(j << 3) + 4;
                  } else {
                    throw new IllegalStateException(new kl2());
                  } 
                } else {
                  j = ik2.n(j << 3);
                  j += j;
                  k = ((nm2)this.c[b]).a();
                  i = k + j + i;
                } 
              } else {
                gk2 gk2 = (gk2)this.c[b];
                j = ik2.n(j << 3);
                k = gk2.f();
                i = ga1.g(k, k, j, i);
                b++;
              } 
            } else {
              ((Long)this.c[b]).getClass();
              j = ik2.n(j << 3) + 8;
            } 
            i = j + i;
          } else {
            long l = ((Long)this.c[b]).longValue();
            j = ik2.n(j << 3);
            k = ik2.o(l);
            i = k + j + i;
          } 
        } else {
          break;
        } 
        b++;
      } 
      this.d = i;
      return i;
    } 
    return i;
  }
  
  public final void c(int paramInt, Object paramObject) {
    if (this.e) {
      e(this.a + 1);
      int[] arrayOfInt = this.b;
      int i = this.a;
      arrayOfInt[i] = paramInt;
      this.c[i] = paramObject;
      this.a = i + 1;
      return;
    } 
    throw new UnsupportedOperationException();
  }
  
  public final void d(a42 parama42) {
    ik2 ik2 = (ik2)parama42.c;
    if (this.a != 0)
      for (byte b = 0; b < this.a; b++) {
        int j = this.b[b];
        Object object = this.c[b];
        int i = j & 0x7;
        j >>>= 3;
        if (i != 0) {
          if (i != 1) {
            if (i != 2) {
              if (i != 3) {
                if (i == 5) {
                  ik2.c(j, ((Integer)object).intValue());
                } else {
                  k91.n(new kl2());
                  return;
                } 
              } else {
                ik2.i(j, 3);
                ((nm2)object).d(parama42);
                ik2.i(j, 4);
              } 
            } else {
              object = object;
              ik2.k(j << 3 | 0x2);
              ik2.k(object.f());
              object.h(ik2);
            } 
          } else {
            ik2.e(j, ((Long)object).longValue());
          } 
        } else {
          ik2.l(j, ((Long)object).longValue());
        } 
      }  
  }
  
  public final void e(int paramInt) {
    int[] arrayOfInt = this.b;
    if (paramInt > arrayOfInt.length) {
      int i = this.a;
      int j = i / 2 + i;
      i = paramInt;
      if (j >= paramInt)
        i = j; 
      paramInt = i;
      if (i < 8)
        paramInt = 8; 
      this.b = Arrays.copyOf(arrayOfInt, paramInt);
      this.c = Arrays.copyOf(this.c, paramInt);
    } 
  }
  
  public final boolean equals(Object paramObject) {
    if (this != paramObject) {
      if (paramObject != null && paramObject instanceof nm2) {
        paramObject = paramObject;
        int i = this.a;
        if (i == ((nm2)paramObject).a) {
          int[] arrayOfInt1 = this.b;
          int[] arrayOfInt2 = ((nm2)paramObject).b;
          byte b;
          for (b = 0; b < i; b++) {
            if (arrayOfInt1[b] != arrayOfInt2[b])
              // Byte code: goto -> 126 
          } 
          Object[] arrayOfObject = this.c;
          paramObject = ((nm2)paramObject).c;
          i = this.a;
          b = 0;
          while (b < i) {
            if (arrayOfObject[b].equals(paramObject[b])) {
              b++;
              continue;
            } 
            // Byte code: goto -> 126
          } 
          return true;
        } 
      } 
      return false;
    } 
    return true;
  }
  
  public final int hashCode() {
    int k = this.a;
    int[] arrayOfInt = this.b;
    byte b1 = 0;
    byte b2 = 17;
    int j = 0;
    int i = 17;
    while (j < k) {
      i = i * 31 + arrayOfInt[j];
      j++;
    } 
    Object[] arrayOfObject = this.c;
    int m = this.a;
    j = b2;
    while (b1 < m) {
      j = j * 31 + arrayOfObject[b1].hashCode();
      b1++;
    } 
    return ((k + 527) * 31 + i) * 31 + j;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\nm2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
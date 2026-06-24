package j$.time.chrono;

import j$.time.LocalDate;
import j$.time.LocalTime;
import j$.time.b;
import j$.time.temporal.a;
import j$.time.temporal.m;
import j$.time.temporal.n;
import j$.time.temporal.o;
import j$.time.temporal.q;
import j$.time.temporal.s;
import j$.time.temporal.u;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Arrays;

public final class r extends d {
  private static final long serialVersionUID = -5207853542612002020L;
  
  public final transient p a;
  
  public final transient int b;
  
  public final transient int c;
  
  public final transient int d;
  
  public r(p paramp, int paramInt1, int paramInt2, int paramInt3) {
    paramp.E(paramInt1, paramInt2, paramInt3);
    this.a = paramp;
    this.b = paramInt1;
    this.c = paramInt2;
    this.d = paramInt3;
  }
  
  public r(p paramp, long paramLong) {
    int i = (int)paramLong;
    paramp.t();
    if (i >= paramp.e && i < paramp.f) {
      int k = Arrays.binarySearch(paramp.d, i);
      int j = k;
      if (k < 0)
        j = -k - 2; 
      int n = paramp.g;
      k = (j + n) / 12;
      int m = paramp.d[j];
      int[] arrayOfInt = new int[3];
      arrayOfInt[0] = k;
      arrayOfInt[1] = (n + j) % 12 + 1;
      arrayOfInt[2] = i - m + 1;
      this.a = paramp;
      this.b = arrayOfInt[0];
      this.c = arrayOfInt[1];
      this.d = arrayOfInt[2];
      return;
    } 
    throw new RuntimeException("Hijrah date out of range");
  }
  
  private void readObject(ObjectInputStream paramObjectInputStream) {
    throw new InvalidObjectException("Deserialization via serialization delegate");
  }
  
  private Object writeReplace() {
    return new f0((byte)6, this);
  }
  
  public final long A() {
    return this.a.E(this.b, this.c, this.d);
  }
  
  public final e B(LocalTime paramLocalTime) {
    return new g(this, paramLocalTime);
  }
  
  public final n C() {
    return s.AH;
  }
  
  public final b E(long paramLong) {
    return (paramLong == 0L) ? this : L(Math.addExact(this.b, (int)paramLong), this.c, this.d);
  }
  
  public final b G(o paramo) {
    return super.G(paramo);
  }
  
  public final int I() {
    return this.a.K(this.b, this.c - 1) + this.d;
  }
  
  public final r J(long paramLong) {
    return new r(this.a, A() + paramLong);
  }
  
  public final r K(long paramLong) {
    if (paramLong == 0L)
      return this; 
    long l = this.b * 12L + (this.c - 1) + paramLong;
    p p1 = this.a;
    paramLong = Math.floorDiv(l, 12L);
    int i = p1.g;
    if (paramLong >= (i / 12) && paramLong <= ((p1.d.length - 1 + i) / 12 - 1))
      return L((int)paramLong, (int)Math.floorMod(l, 12L) + 1, this.d); 
    StringBuilder stringBuilder = new StringBuilder("Invalid Hijrah year: ");
    stringBuilder.append(paramLong);
    throw new RuntimeException(stringBuilder.toString());
  }
  
  public final r L(int paramInt1, int paramInt2, int paramInt3) {
    int j = this.a.G(paramInt1, paramInt2);
    int i = paramInt3;
    if (paramInt3 > j)
      i = j; 
    return new r(this.a, paramInt1, paramInt2, i);
  }
  
  public final r M(long paramLong, q paramq) {
    if (paramq instanceof a) {
      a a = (a)paramq;
      this.a.J(a).b(paramLong, (q)a);
      int i = (int)paramLong;
      switch (q.a[a.ordinal()]) {
        default:
          throw new RuntimeException(b.a("Unsupported field: ", paramq));
        case 13:
          return L(1 - this.b, this.c, this.d);
        case 12:
          return L(i, this.c, this.d);
        case 11:
          if (this.b < 1)
            i = 1 - i; 
          return L(i, this.c, this.d);
        case 10:
          return K(paramLong - this.b * 12L + this.c - 1L);
        case 9:
          return L(this.b, i, this.d);
        case 8:
          return J((paramLong - g((q)a.ALIGNED_WEEK_OF_YEAR)) * 7L);
        case 7:
          return new r(this.a, paramLong);
        case 6:
          return J(paramLong - g((q)a.ALIGNED_DAY_OF_WEEK_IN_YEAR));
        case 5:
          return J(paramLong - g((q)a.ALIGNED_DAY_OF_WEEK_IN_MONTH));
        case 4:
          return J(paramLong - ((int)Math.floorMod(A() + 3L, 7L) + 1));
        case 3:
          return J((paramLong - g((q)a.ALIGNED_WEEK_OF_MONTH)) * 7L);
        case 2:
          return J((Math.min(i, this.a.K(this.b, 12)) - I()));
        case 1:
          break;
      } 
      return L(this.b, this.c, i);
    } 
    return (r)super.h(paramLong, paramq);
  }
  
  public final b a(long paramLong, s params) {
    return super.a(paramLong, params);
  }
  
  public final m a(long paramLong, s params) {
    return super.a(paramLong, params);
  }
  
  public final m d() {
    return this.a;
  }
  
  public final boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject instanceof r) {
      paramObject = paramObject;
      if (this.b == ((r)paramObject).b && this.c == ((r)paramObject).c && this.d == ((r)paramObject).d && this.a.equals(((r)paramObject).a))
        return true; 
    } 
    return false;
  }
  
  public final long g(q paramq) {
    if (paramq instanceof a) {
      int j = q.a[((a)paramq).ordinal()];
      int i = 1;
      switch (j) {
        default:
          throw new RuntimeException(b.a("Unsupported field: ", paramq));
        case 13:
          if (this.b <= 1)
            i = 0; 
          return i;
        case 12:
          i = this.b;
          return i;
        case 11:
          i = this.b;
          return i;
        case 10:
          return this.b * 12L + this.c - 1L;
        case 9:
          i = this.c;
          return i;
        case 8:
          i = (I() - 1) / 7;
          return ++i;
        case 7:
          return A();
        case 6:
          i = (I() - 1) % 7;
          return ++i;
        case 5:
          i = (this.d - 1) % 7;
          return ++i;
        case 4:
          i = (int)Math.floorMod(A() + 3L, 7L);
          return ++i;
        case 3:
          i = (this.d - 1) / 7;
          return ++i;
        case 2:
          i = I();
          return i;
        case 1:
          break;
      } 
      i = this.d;
      return i;
    } 
    return paramq.E((n)this);
  }
  
  public final int hashCode() {
    int i = this.b;
    int k = this.c;
    int j = this.d;
    this.a.getClass();
    return i & 0xFFFFF800 ^ 0x7D2CFBB3 ^ (i << 11) + (k << 6) + j;
  }
  
  public final m i(LocalDate paramLocalDate) {
    return super.G((o)paramLocalDate);
  }
  
  public final u j(q paramq) {
    a a;
    if (paramq instanceof a) {
      if (f(paramq)) {
        a = (a)paramq;
        int i = q.a[a.ordinal()];
        return (i != 1) ? ((i != 2) ? ((i != 3) ? this.a.J(a) : u.e(1L, 5L)) : u.e(1L, this.a.K(this.b, 12))) : u.e(1L, this.a.G(this.b, this.c));
      } 
      throw new RuntimeException(b.a("Unsupported field: ", a));
    } 
    return a.t((n)this);
  }
  
  public final b k(long paramLong, s params) {
    return super.k(paramLong, params);
  }
  
  public final m k(long paramLong, s params) {
    return super.k(paramLong, params);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\j$\time\chrono\r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
package j$.time;

import j$.time.chrono.m;
import j$.time.chrono.t;
import j$.time.format.b;
import j$.time.format.o;
import j$.time.format.u;
import j$.time.format.v;
import j$.time.temporal.a;
import j$.time.temporal.b;
import j$.time.temporal.m;
import j$.time.temporal.n;
import j$.time.temporal.o;
import j$.time.temporal.q;
import j$.time.temporal.r;
import j$.time.temporal.s;
import j$.time.temporal.u;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Locale;

public final class Year implements m, o, Comparable<Year>, Serializable {
  public static final int b = 0;
  
  private static final long serialVersionUID = -23038383694477807L;
  
  public final int a;
  
  static {
    o o1 = new o();
    o1.h((q)a.YEAR, 4, 10, v.EXCEEDS_PAD);
    o1.l(Locale.getDefault(), u.SMART, null);
  }
  
  public Year(int paramInt) {
    this.a = paramInt;
  }
  
  public static Year of(int paramInt) {
    a.YEAR.I(paramInt);
    return new Year(paramInt);
  }
  
  private void readObject(ObjectInputStream paramObjectInputStream) {
    throw new InvalidObjectException("Deserialization via serialization delegate");
  }
  
  private Object writeReplace() {
    return new m((byte)11, this);
  }
  
  public final m a(long paramLong, s params) {
    if (paramLong == Long.MIN_VALUE) {
      Year year1 = r(Long.MAX_VALUE, params);
      paramLong = 1L;
      return year1.r(paramLong, params);
    } 
    paramLong = -paramLong;
    Year year = this;
    return year.r(paramLong, params);
  }
  
  public final Object b(b paramb) {
    return (paramb == r.b) ? t.c : ((paramb == r.c) ? b.YEARS : super.b(paramb));
  }
  
  public final m c(m paramm) {
    if (m.m((n)paramm).equals(t.c)) {
      a a = a.YEAR;
      return paramm.h(this.a, (q)a);
    } 
    throw new RuntimeException("Adjustment only supported on ISO date-time");
  }
  
  public final int compareTo(Object paramObject) {
    paramObject = paramObject;
    return this.a - ((Year)paramObject).a;
  }
  
  public final int e(q paramq) {
    return j(paramq).a(g(paramq), paramq);
  }
  
  public final boolean equals(Object paramObject) {
    return (this == paramObject) ? true : ((paramObject instanceof Year && this.a == ((Year)paramObject).a));
  }
  
  public final boolean f(q paramq) {
    return ((paramq instanceof a) ? (paramq == a.YEAR || paramq == a.YEAR_OF_ERA || paramq == a.ERA) : (paramq != null && paramq.r((n)this)));
  }
  
  public final long g(q paramq) {
    if (paramq instanceof a) {
      int j = n.a[((a)paramq).ordinal()];
      int i = 1;
      if (j != 1) {
        if (j != 2) {
          if (j == 3) {
            if (this.a < 1)
              i = 0; 
            return i;
          } 
          throw new RuntimeException(b.a("Unsupported field: ", paramq));
        } 
        return this.a;
      } 
      j = this.a;
      i = j;
      if (j < 1)
        i = 1 - j; 
      return i;
    } 
    return paramq.E((n)this);
  }
  
  public int getValue() {
    return this.a;
  }
  
  public final int hashCode() {
    return this.a;
  }
  
  public final m i(LocalDate paramLocalDate) {
    return paramLocalDate.c(this);
  }
  
  public final u j(q paramq) {
    if (paramq == a.YEAR_OF_ERA) {
      if (this.a <= 0) {
        long l1 = 1000000000L;
        return u.e(1L, l1);
      } 
      long l = 999999999L;
      return u.e(1L, l);
    } 
    return super.j(paramq);
  }
  
  public final Year r(long paramLong, s params) {
    a a;
    if (params instanceof b) {
      int i = n.b[((b)params).ordinal()];
      if (i != 1) {
        if (i != 2) {
          if (i != 3) {
            if (i != 4) {
              if (i == 5) {
                a = a.ERA;
                return z(Math.addExact(g((q)a), paramLong), (q)a);
              } 
              f.c("Unsupported unit: ", a);
              return null;
            } 
            return t(Math.multiplyExact(paramLong, 1000L));
          } 
          return t(Math.multiplyExact(paramLong, 100L));
        } 
        return t(Math.multiplyExact(paramLong, 10L));
      } 
      return t(paramLong);
    } 
    return (Year)a.r(this, paramLong);
  }
  
  public final Year t(long paramLong) {
    if (paramLong == 0L)
      return this; 
    a a = a.YEAR;
    long l = this.a;
    return of(a.b.a(l + paramLong, (q)a));
  }
  
  public final String toString() {
    return Integer.toString(this.a);
  }
  
  public final Year z(long paramLong, q paramq) {
    if (paramq instanceof a) {
      a a = (a)paramq;
      a.I(paramLong);
      int i = n.a[a.ordinal()];
      if (i != 1) {
        if (i != 2) {
          if (i == 3)
            return (g((q)a.ERA) == paramLong) ? this : of(1 - this.a); 
          throw new RuntimeException(b.a("Unsupported field: ", paramq));
        } 
        return of((int)paramLong);
      } 
      long l = paramLong;
      if (this.a < 1)
        l = 1L - paramLong; 
      return of((int)l);
    } 
    return (Year)paramq.G(this, paramLong);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\j$\time\Year.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
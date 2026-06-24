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

public final class YearMonth implements m, o, Comparable<YearMonth>, Serializable {
  public static final int c = 0;
  
  private static final long serialVersionUID = 4183400860270640070L;
  
  public final int a;
  
  public final int b;
  
  static {
    o o1 = new o();
    o1.h((q)a.YEAR, 4, 10, v.EXCEEDS_PAD);
    o1.c('-');
    o1.g((q)a.MONTH_OF_YEAR, 2);
    o1.l(Locale.getDefault(), u.SMART, null);
  }
  
  public YearMonth(int paramInt1, int paramInt2) {
    this.a = paramInt1;
    this.b = paramInt2;
  }
  
  public static YearMonth of(int paramInt1, int paramInt2) {
    a.YEAR.I(paramInt1);
    a.MONTH_OF_YEAR.I(paramInt2);
    return new YearMonth(paramInt1, paramInt2);
  }
  
  private void readObject(ObjectInputStream paramObjectInputStream) {
    throw new InvalidObjectException("Deserialization via serialization delegate");
  }
  
  private Object writeReplace() {
    return new m((byte)12, this);
  }
  
  public final YearMonth E(long paramLong) {
    if (paramLong == 0L)
      return this; 
    a a = a.YEAR;
    long l = this.a;
    return G(a.b.a(l + paramLong, (q)a), this.b);
  }
  
  public final YearMonth G(int paramInt1, int paramInt2) {
    return (this.a == paramInt1 && this.b == paramInt2) ? this : new YearMonth(paramInt1, paramInt2);
  }
  
  public final YearMonth I(long paramLong, q paramq) {
    if (paramq instanceof a) {
      a a = (a)paramq;
      a.I(paramLong);
      int i = o.a[a.ordinal()];
      if (i != 1) {
        if (i != 2) {
          if (i != 3) {
            if (i != 4) {
              if (i == 5) {
                if (g((q)a.ERA) == paramLong)
                  return this; 
                i = 1 - this.a;
                a.YEAR.I(i);
                return G(i, this.b);
              } 
              throw new RuntimeException(b.a("Unsupported field: ", paramq));
            } 
            i = (int)paramLong;
            a.YEAR.I(i);
            return G(i, this.b);
          } 
          long l = paramLong;
          if (this.a < 1)
            l = 1L - paramLong; 
          i = (int)l;
          a.YEAR.I(i);
          return G(i, this.b);
        } 
        return z(paramLong - r());
      } 
      i = (int)paramLong;
      a.MONTH_OF_YEAR.I(i);
      return G(this.a, i);
    } 
    return (YearMonth)paramq.G(this, paramLong);
  }
  
  public final m a(long paramLong, s params) {
    if (paramLong == Long.MIN_VALUE) {
      YearMonth yearMonth1 = t(Long.MAX_VALUE, params);
      paramLong = 1L;
      return yearMonth1.t(paramLong, params);
    } 
    paramLong = -paramLong;
    YearMonth yearMonth = this;
    return yearMonth.t(paramLong, params);
  }
  
  public final Object b(b paramb) {
    return (paramb == r.b) ? t.c : ((paramb == r.c) ? b.MONTHS : super.b(paramb));
  }
  
  public final m c(m paramm) {
    if (m.m((n)paramm).equals(t.c)) {
      a a = a.PROLEPTIC_MONTH;
      return paramm.h(r(), (q)a);
    } 
    throw new RuntimeException("Adjustment only supported on ISO date-time");
  }
  
  public final int compareTo(Object paramObject) {
    paramObject = paramObject;
    int i = this.a - ((YearMonth)paramObject).a;
    return (i == 0) ? (this.b - ((YearMonth)paramObject).b) : i;
  }
  
  public final int e(q paramq) {
    return j(paramq).a(g(paramq), paramq);
  }
  
  public final boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject instanceof YearMonth) {
      paramObject = paramObject;
      if (this.a == ((YearMonth)paramObject).a && this.b == ((YearMonth)paramObject).b)
        return true; 
    } 
    return false;
  }
  
  public final boolean f(q paramq) {
    return ((paramq instanceof a) ? (paramq == a.YEAR || paramq == a.MONTH_OF_YEAR || paramq == a.PROLEPTIC_MONTH || paramq == a.YEAR_OF_ERA || paramq == a.ERA) : (paramq != null && paramq.r((n)this)));
  }
  
  public final long g(q paramq) {
    if (paramq instanceof a) {
      int j = o.a[((a)paramq).ordinal()];
      int i = 1;
      if (j != 1) {
        if (j != 2) {
          if (j != 3) {
            if (j != 4) {
              if (j == 5) {
                if (this.a < 1)
                  i = 0; 
                return i;
              } 
              throw new RuntimeException(b.a("Unsupported field: ", paramq));
            } 
            i = this.a;
            return i;
          } 
          j = this.a;
          i = j;
          if (j < 1)
            i = 1 - j; 
          return i;
        } 
        return r();
      } 
      i = this.b;
      return i;
    } 
    return paramq.E((n)this);
  }
  
  public int getMonthValue() {
    return this.b;
  }
  
  public int getYear() {
    return this.a;
  }
  
  public final int hashCode() {
    int i = this.a;
    return this.b << 27 ^ i;
  }
  
  public final m i(LocalDate paramLocalDate) {
    return paramLocalDate.c(this);
  }
  
  public final u j(q paramq) {
    if (paramq == a.YEAR_OF_ERA) {
      if (getYear() <= 0) {
        long l1 = 1000000000L;
        return u.e(1L, l1);
      } 
      long l = 999999999L;
      return u.e(1L, l);
    } 
    return super.j(paramq);
  }
  
  public final long r() {
    return this.a * 12L + this.b - 1L;
  }
  
  public final YearMonth t(long paramLong, s params) {
    a a;
    if (params instanceof b) {
      switch (o.b[((b)params).ordinal()]) {
        default:
          f.c("Unsupported unit: ", params);
          return null;
        case 6:
          a = a.ERA;
          return I(Math.addExact(g((q)a), paramLong), (q)a);
        case 5:
          return E(Math.multiplyExact(paramLong, 1000L));
        case 4:
          return E(Math.multiplyExact(paramLong, 100L));
        case 3:
          return E(Math.multiplyExact(paramLong, 10L));
        case 2:
          return E(paramLong);
        case 1:
          break;
      } 
      return z(paramLong);
    } 
    return (YearMonth)a.r(this, paramLong);
  }
  
  public final String toString() {
    String str;
    int i = Math.abs(this.a);
    StringBuilder stringBuilder = new StringBuilder(9);
    int j = this.a;
    if (i < 1000) {
      if (j < 0) {
        stringBuilder.append(j - 10000);
        stringBuilder.deleteCharAt(1);
      } else {
        stringBuilder.append(j + 10000);
        stringBuilder.deleteCharAt(0);
      } 
    } else {
      stringBuilder.append(j);
    } 
    if (this.b < 10) {
      str = "-0";
    } else {
      str = "-";
    } 
    stringBuilder.append(str);
    stringBuilder.append(this.b);
    return stringBuilder.toString();
  }
  
  public final YearMonth z(long paramLong) {
    if (paramLong == 0L)
      return this; 
    paramLong = this.a * 12L + (this.b - 1) + paramLong;
    a a = a.YEAR;
    long l = Math.floorDiv(paramLong, 12L);
    return G(a.b.a(l, (q)a), (int)Math.floorMod(paramLong, 12L) + 1);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\j$\time\YearMonth.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
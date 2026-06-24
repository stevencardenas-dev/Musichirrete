package j$.time;

import j$.time.chrono.b;
import j$.time.chrono.e;
import j$.time.chrono.m;
import j$.time.chrono.t;
import j$.time.format.b;
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
import java.util.Objects;

public final class LocalDate implements m, o, b, Serializable {
  public static final LocalDate d = of(-999999999, 1, 1);
  
  public static final LocalDate e = of(999999999, 12, 31);
  
  private static final long serialVersionUID = 2942565459149668126L;
  
  public final int a;
  
  public final short b;
  
  public final short c;
  
  static {
    of(1970, 1, 1);
  }
  
  public LocalDate(int paramInt1, int paramInt2, int paramInt3) {
    this.a = paramInt1;
    this.b = (short)paramInt2;
    this.c = (short)paramInt3;
  }
  
  public static LocalDate L(long paramLong) {
    a.EPOCH_DAY.I(paramLong);
    long l1 = 719468L + paramLong;
    if (l1 < 0L) {
      long l = (paramLong + 719469L) / 146097L - 1L;
      paramLong = l * 400L;
      l1 += -l * 146097L;
    } else {
      paramLong = 0L;
    } 
    long l4 = (l1 * 400L + 591L) / 146097L;
    long l3 = l4 / 4L;
    long l2 = l4 / 100L;
    long l5 = l1 - l4 / 400L + l3 + l4 * 365L - l2;
    l3 = l4;
    l2 = l5;
    if (l5 < 0L) {
      l3 = l4 - 1L;
      l4 = l3 / 4L;
      l2 = l3 / 100L;
      l2 = l1 - l3 / 400L + l4 + 365L * l3 - l2;
    } 
    int i = (int)l2;
    int j = (i * 5 + 2) / 153;
    int k = (j * 306 + 5) / 10;
    l1 = (j / 10);
    a a = a.YEAR;
    return new LocalDate(a.b.a(l3 + paramLong + l1, (q)a), (j + 2) % 12 + 1, i - k + 1);
  }
  
  public static LocalDate Q(int paramInt1, int paramInt2, int paramInt3) {
    if (paramInt2 != 2) {
      if (paramInt2 == 4 || paramInt2 == 6 || paramInt2 == 9 || paramInt2 == 11)
        paramInt3 = Math.min(paramInt3, 30); 
    } else {
      byte b1;
      t t = t.c;
      long l = paramInt1;
      t.getClass();
      if (t.t(l)) {
        b1 = 29;
      } else {
        b1 = 28;
      } 
      paramInt3 = Math.min(paramInt3, b1);
    } 
    return new LocalDate(paramInt1, paramInt2, paramInt3);
  }
  
  public static LocalDate of(int paramInt1, int paramInt2, int paramInt3) {
    a.YEAR.I(paramInt1);
    a.MONTH_OF_YEAR.I(paramInt2);
    a.DAY_OF_MONTH.I(paramInt3);
    return t(paramInt1, paramInt2, paramInt3);
  }
  
  private void readObject(ObjectInputStream paramObjectInputStream) {
    throw new InvalidObjectException("Deserialization via serialization delegate");
  }
  
  public static LocalDate t(int paramInt1, int paramInt2, int paramInt3) {
    byte b1 = 28;
    if (paramInt3 > 28) {
      if (paramInt2 != 2) {
        if (paramInt2 != 4 && paramInt2 != 6 && paramInt2 != 9 && paramInt2 != 11) {
          b1 = 31;
        } else {
          b1 = 30;
        } 
      } else {
        t t = t.c;
        long l = paramInt1;
        t.getClass();
        if (t.t(l))
          b1 = 29; 
      } 
      if (paramInt3 > b1) {
        if (paramInt3 == 29) {
          f.b("Invalid date 'February 29' as '", paramInt1, "' is not a leap year");
          return null;
        } 
        String str = j.E(paramInt2).name();
        StringBuilder stringBuilder = new StringBuilder("Invalid date '");
        stringBuilder.append(str);
        stringBuilder.append(" ");
        stringBuilder.append(paramInt3);
        stringBuilder.append("'");
        throw new RuntimeException(stringBuilder.toString());
      } 
    } 
    return new LocalDate(paramInt1, paramInt2, paramInt3);
  }
  
  private Object writeReplace() {
    return new m((byte)3, this);
  }
  
  public static LocalDate z(n paramn) {
    Objects.requireNonNull(paramn, "temporal");
    LocalDate localDate = (LocalDate)paramn.b(r.f);
    if (localDate != null)
      return localDate; 
    String str = paramn.getClass().getName();
    StringBuilder stringBuilder = new StringBuilder("Unable to obtain LocalDate from TemporalAccessor: ");
    stringBuilder.append(paramn);
    stringBuilder.append(" of type ");
    stringBuilder.append(str);
    throw new RuntimeException(stringBuilder.toString());
  }
  
  public final long A() {
    long l1 = this.a;
    long l3 = this.b;
    long l2 = 365L * l1;
    if (l1 >= 0L) {
      long l4 = (3L + l1) / 4L;
      long l5 = (99L + l1) / 100L;
      l1 = (l1 + 399L) / 400L + l4 - l5 + l2;
    } else {
      long l4 = l1 / -4L;
      long l5 = l1 / -100L;
      l1 = l2 - l1 / -400L + l4 - l5;
    } 
    l2 = (367L * l3 - 362L) / 12L + l1 + (this.c - 1);
    l1 = l2;
    if (l3 > 2L)
      if (!J()) {
        l1 = l2 - 2L;
      } else {
        l1 = l2 - 1L;
      }  
    return l1 - 719528L;
  }
  
  public final e B(LocalTime paramLocalTime) {
    return LocalDateTime.of(this, paramLocalTime);
  }
  
  public final int E(q paramq) {
    int i;
    switch (e.a[((a)paramq).ordinal()]) {
      default:
        throw new RuntimeException(b.a("Unsupported field: ", paramq));
      case 13:
        return (this.a >= 1) ? 1 : 0;
      case 12:
        return this.a;
      case 11:
        throw new RuntimeException("Invalid field 'ProlepticMonth' for get() method, use getLong() instead");
      case 10:
        return this.b;
      case 9:
        return (I() - 1) / 7 + 1;
      case 8:
        throw new RuntimeException("Invalid field 'EpochDay' for get() method, use getLong() instead");
      case 7:
        return (I() - 1) % 7 + 1;
      case 6:
        return (this.c - 1) % 7 + 1;
      case 5:
        return G().getValue();
      case 4:
        i = this.a;
        return (i >= 1) ? i : (1 - i);
      case 3:
        return (this.c - 1) / 7 + 1;
      case 2:
        return I();
      case 1:
        break;
    } 
    return this.c;
  }
  
  public final int F(b paramb) {
    return (paramb instanceof LocalDate) ? r((LocalDate)paramb) : super.F(paramb);
  }
  
  public final c G() {
    return c.r((int)Math.floorMod(A() + 3L, 7L) + 1);
  }
  
  public final int I() {
    return j.E(this.b).r(J()) + this.c - 1;
  }
  
  public final boolean J() {
    t t = t.c;
    long l = this.a;
    t.getClass();
    return t.t(l);
  }
  
  public final int K() {
    short s = this.b;
    return (s != 2) ? ((s != 4 && s != 6 && s != 9 && s != 11) ? 31 : 30) : (J() ? 29 : 28);
  }
  
  public final LocalDate M(long paramLong, s params) {
    a a;
    if (params instanceof b) {
      b b1 = (b)params;
      switch (e.b[b1.ordinal()]) {
        default:
          f.c("Unsupported unit: ", params);
          return null;
        case 8:
          a = a.ERA;
          return R(Math.addExact(g((q)a), paramLong), (q)a);
        case 7:
          return P(Math.multiplyExact(paramLong, 1000L));
        case 6:
          return P(Math.multiplyExact(paramLong, 100L));
        case 5:
          return P(Math.multiplyExact(paramLong, 10L));
        case 4:
          return P(paramLong);
        case 3:
          return O(paramLong);
        case 2:
          return N(Math.multiplyExact(paramLong, 7L));
        case 1:
          break;
      } 
      return N(paramLong);
    } 
    return (LocalDate)a.r(this, paramLong);
  }
  
  public final LocalDate N(long paramLong) {
    if (paramLong == 0L)
      return this; 
    long l = this.c + paramLong;
    if (l > 0L) {
      if (l <= 28L)
        return new LocalDate(this.a, this.b, (int)l); 
      if (l <= 59L) {
        paramLong = K();
        if (l <= paramLong)
          return new LocalDate(this.a, this.b, (int)l); 
        short s = this.b;
        if (s < 12)
          return new LocalDate(this.a, s + 1, (int)(l - paramLong)); 
        a.YEAR.I((this.a + 1));
        return new LocalDate(this.a + 1, 1, (int)(l - paramLong));
      } 
    } 
    return L(Math.addExact(A(), paramLong));
  }
  
  public final LocalDate O(long paramLong) {
    if (paramLong == 0L)
      return this; 
    long l = this.a * 12L + (this.b - 1) + paramLong;
    a a = a.YEAR;
    paramLong = Math.floorDiv(l, 12L);
    return Q(a.b.a(paramLong, (q)a), (int)Math.floorMod(l, 12L) + 1, this.c);
  }
  
  public final LocalDate P(long paramLong) {
    if (paramLong == 0L)
      return this; 
    a a = a.YEAR;
    long l = this.a;
    return Q(a.b.a(l + paramLong, (q)a), this.b, this.c);
  }
  
  public final LocalDate R(long paramLong, q paramq) {
    if (paramq instanceof a) {
      a a = (a)paramq;
      a.I(paramLong);
      switch (e.a[a.ordinal()]) {
        default:
          throw new RuntimeException(b.a("Unsupported field: ", paramq));
        case 13:
          return (g((q)a.ERA) != paramLong) ? U(1 - this.a) : this;
        case 12:
          return U((int)paramLong);
        case 11:
          return O(paramLong - this.a * 12L + this.b - 1L);
        case 10:
          i = (int)paramLong;
          if (this.b != i) {
            a.MONTH_OF_YEAR.I(i);
            return Q(this.a, i, this.c);
          } 
          return this;
        case 9:
          return N(Math.multiplyExact(paramLong - g((q)a.ALIGNED_WEEK_OF_YEAR), 7L));
        case 8:
          return L(paramLong);
        case 7:
          return N(paramLong - g((q)a.ALIGNED_DAY_OF_WEEK_IN_YEAR));
        case 6:
          return N(paramLong - g((q)a.ALIGNED_DAY_OF_WEEK_IN_MONTH));
        case 5:
          return N(paramLong - G().getValue());
        case 4:
          if (this.a < 1)
            paramLong = 1L - paramLong; 
          return U((int)paramLong);
        case 3:
          return N(Math.multiplyExact(paramLong - g((q)a.ALIGNED_WEEK_OF_MONTH), 7L));
        case 2:
          return T((int)paramLong);
        case 1:
          break;
      } 
      int i = (int)paramLong;
      return (this.c != i) ? of(this.a, this.b, i) : this;
    } 
    return (LocalDate)paramq.G(this, paramLong);
  }
  
  public final LocalDate S(o paramo) {
    return (paramo instanceof LocalDate) ? (LocalDate)paramo : (LocalDate)paramo.c(this);
  }
  
  public final LocalDate T(int paramInt) {
    if (I() == paramInt)
      return this; 
    int i = this.a;
    a a = a.YEAR;
    long l = i;
    a.I(l);
    a.DAY_OF_YEAR.I(paramInt);
    t.c.getClass();
    boolean bool = t.t(l);
    if (paramInt != 366 || bool) {
      j j2 = j.E((paramInt - 1) / 31 + 1);
      int j = j2.r(bool);
      j j1 = j2;
      if (paramInt > j2.t(bool) + j - 1)
        j1 = j.a[(j2.ordinal() + 13) % 12]; 
      j = j1.r(bool);
      return new LocalDate(i, j1.getValue(), paramInt - j + 1);
    } 
    f.b("Invalid date 'DayOfYear 366' as '", i, "' is not a leap year");
    return null;
  }
  
  public final LocalDate U(int paramInt) {
    if (this.a == paramInt)
      return this; 
    a.YEAR.I(paramInt);
    return Q(paramInt, this.b, this.c);
  }
  
  public final m a(long paramLong, s params) {
    if (paramLong == Long.MIN_VALUE) {
      LocalDate localDate1 = M(Long.MAX_VALUE, params);
      paramLong = 1L;
      return localDate1.M(paramLong, params);
    } 
    paramLong = -paramLong;
    LocalDate localDate = this;
    return localDate.M(paramLong, params);
  }
  
  public final Object b(b paramb) {
    return (paramb == r.f) ? this : super.b(paramb);
  }
  
  public final m d() {
    return (m)t.c;
  }
  
  public final int e(q paramq) {
    return (paramq instanceof a) ? E(paramq) : super.e(paramq);
  }
  
  public final boolean equals(Object paramObject) {
    return (this == paramObject) ? true : ((paramObject instanceof LocalDate && r((LocalDate)paramObject) == 0));
  }
  
  public final long g(q paramq) {
    return (paramq instanceof a) ? ((paramq == a.EPOCH_DAY) ? A() : ((paramq == a.PROLEPTIC_MONTH) ? (this.a * 12L + this.b - 1L) : E(paramq))) : paramq.E((n)this);
  }
  
  public int getDayOfMonth() {
    return this.c;
  }
  
  public int getMonthValue() {
    return this.b;
  }
  
  public int getYear() {
    return this.a;
  }
  
  public final int hashCode() {
    int i = this.a;
    return i & 0xFFFFF800 ^ (i << 11) + (this.b << 6) + this.c;
  }
  
  public final u j(q paramq) {
    if (paramq instanceof a) {
      a a = (a)paramq;
      if (a.isDateBased()) {
        int i = e.a[a.ordinal()];
        if (i != 1) {
          if (i != 2) {
            long l;
            if (i != 3)
              return (i != 4) ? a.b : ((getYear() <= 0) ? u.e(1L, 1000000000L) : u.e(1L, 999999999L)); 
            if (j.E(this.b) == j.FEBRUARY && !J()) {
              l = 4L;
            } else {
              l = 5L;
            } 
            return u.e(1L, l);
          } 
          if (J()) {
            i = 366;
          } else {
            i = 365;
          } 
          return u.e(1L, i);
        } 
        return u.e(1L, K());
      } 
      throw new RuntimeException(b.a("Unsupported field: ", paramq));
    } 
    return paramq.t((n)this);
  }
  
  public final int r(LocalDate paramLocalDate) {
    int j = this.a - paramLocalDate.a;
    int i = j;
    if (j == 0) {
      j = this.b - paramLocalDate.b;
      i = j;
      if (j == 0)
        return this.c - paramLocalDate.c; 
    } 
    return i;
  }
  
  public final String toString() {
    int j = this.a;
    short s1 = this.b;
    short s2 = this.c;
    int i = Math.abs(j);
    StringBuilder stringBuilder = new StringBuilder(10);
    if (i < 1000) {
      if (j < 0) {
        stringBuilder.append(j - 10000);
        stringBuilder.deleteCharAt(1);
      } else {
        stringBuilder.append(j + 10000);
        stringBuilder.deleteCharAt(0);
      } 
    } else {
      if (j > 9999)
        stringBuilder.append('+'); 
      stringBuilder.append(j);
    } 
    String str2 = "-";
    if (s1 < 10) {
      str1 = "-0";
    } else {
      str1 = "-";
    } 
    stringBuilder.append(str1);
    stringBuilder.append(s1);
    String str1 = str2;
    if (s2 < 10)
      str1 = "-0"; 
    stringBuilder.append(str1);
    stringBuilder.append(s2);
    return stringBuilder.toString();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\j$\time\LocalDate.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
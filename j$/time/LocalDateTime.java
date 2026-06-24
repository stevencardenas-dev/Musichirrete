package j$.time;

import j$.time.chrono.b;
import j$.time.chrono.e;
import j$.time.chrono.j;
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

public final class LocalDateTime implements m, o, e, Serializable {
  public static final LocalDateTime c = of(LocalDate.d, LocalTime.e);
  
  public static final LocalDateTime d = of(LocalDate.e, LocalTime.f);
  
  private static final long serialVersionUID = 6207766400415563566L;
  
  public final LocalDate a;
  
  public final LocalTime b;
  
  public LocalDateTime(LocalDate paramLocalDate, LocalTime paramLocalTime) {
    this.a = paramLocalDate;
    this.b = paramLocalTime;
  }
  
  public static LocalDateTime E(long paramLong, int paramInt, ZoneOffset paramZoneOffset) {
    Objects.requireNonNull(paramZoneOffset, "offset");
    a a = a.NANO_OF_SECOND;
    long l1 = paramInt;
    a.I(l1);
    paramLong += paramZoneOffset.getTotalSeconds();
    long l2 = Math.floorDiv(paramLong, 86400L);
    paramInt = (int)Math.floorMod(paramLong, 86400L);
    return new LocalDateTime(LocalDate.L(l2), LocalTime.G(paramInt * 1000000000L + l1));
  }
  
  public static LocalDateTime of(LocalDate paramLocalDate, LocalTime paramLocalTime) {
    Objects.requireNonNull(paramLocalDate, "date");
    Objects.requireNonNull(paramLocalTime, "time");
    return new LocalDateTime(paramLocalDate, paramLocalTime);
  }
  
  private void readObject(ObjectInputStream paramObjectInputStream) {
    throw new InvalidObjectException("Deserialization via serialization delegate");
  }
  
  public static LocalDateTime t(n paramn) {
    if (paramn instanceof LocalDateTime)
      return (LocalDateTime)paramn; 
    if (paramn instanceof ZonedDateTime)
      return ((ZonedDateTime)paramn).toLocalDateTime(); 
    if (paramn instanceof OffsetDateTime)
      return ((OffsetDateTime)paramn).toLocalDateTime(); 
    try {
      return new LocalDateTime(LocalDate.z(paramn), LocalTime.z(paramn));
    } catch (a a) {
      String str = paramn.getClass().getName();
      StringBuilder stringBuilder = new StringBuilder("Unable to obtain LocalDateTime from TemporalAccessor: ");
      stringBuilder.append(paramn);
      stringBuilder.append(" of type ");
      stringBuilder.append(str);
      throw new RuntimeException(stringBuilder.toString(), a);
    } 
  }
  
  private Object writeReplace() {
    return new m((byte)5, this);
  }
  
  public final int D(e parame) {
    return (parame instanceof LocalDateTime) ? r((LocalDateTime)parame) : super.D(parame);
  }
  
  public final LocalDateTime G(long paramLong, s params) {
    LocalDateTime localDateTime;
    if (params instanceof b) {
      long l;
      b b = (b)params;
      switch (g.a[b.ordinal()]) {
        default:
          return L(this.a.M(paramLong, params), this.b);
        case 7:
          l = paramLong / 256L;
          localDateTime = L(this.a.N(l), this.b);
          return localDateTime.J(localDateTime.a, paramLong % 256L * 12L, 0L, 0L, 0L);
        case 6:
          return J(this.a, paramLong, 0L, 0L, 0L);
        case 5:
          return J(this.a, 0L, paramLong, 0L, 0L);
        case 4:
          return I(paramLong);
        case 3:
          l = paramLong / 86400000L;
          localDateTime = L(this.a.N(l), this.b);
          return localDateTime.J(localDateTime.a, 0L, 0L, 0L, paramLong % 86400000L * 1000000L);
        case 2:
          l = paramLong / 86400000000L;
          localDateTime = L(this.a.N(l), this.b);
          return localDateTime.J(localDateTime.a, 0L, 0L, 0L, paramLong % 86400000000L * 1000L);
        case 1:
          break;
      } 
      return J(this.a, 0L, 0L, 0L, paramLong);
    } 
    return (LocalDateTime)localDateTime.r(this, paramLong);
  }
  
  public final LocalDateTime I(long paramLong) {
    return J(this.a, 0L, 0L, paramLong, 0L);
  }
  
  public final LocalDateTime J(LocalDate paramLocalDate, long paramLong1, long paramLong2, long paramLong3, long paramLong4) {
    LocalTime localTime = this.b;
    if ((paramLong1 | paramLong2 | paramLong3 | paramLong4) == 0L)
      return L(paramLocalDate, localTime); 
    long l1 = paramLong4 / 86400000000000L;
    long l4 = paramLong3 / 86400L;
    long l5 = paramLong2 / 1440L;
    long l2 = paramLong1 / 24L;
    long l3 = localTime.O();
    paramLong2 = paramLong1 % 24L * 3600000000000L + paramLong2 % 1440L * 60000000000L + paramLong3 % 86400L * 1000000000L + paramLong4 % 86400000000000L + l3;
    paramLong1 = Math.floorDiv(paramLong2, 86400000000000L);
    paramLong2 = Math.floorMod(paramLong2, 86400000000000L);
    if (paramLong2 == l3) {
      localTime = this.b;
    } else {
      localTime = LocalTime.G(paramLong2);
    } 
    return L(paramLocalDate.N(paramLong1 + l2 + l5 + l4 + l1), localTime);
  }
  
  public final LocalDateTime K(long paramLong, q paramq) {
    if (paramq instanceof a) {
      boolean bool = ((a)paramq).J();
      LocalDate localDate = this.a;
      return bool ? L(localDate, this.b.Q(paramLong, paramq)) : L(localDate.R(paramLong, paramq), this.b);
    } 
    return (LocalDateTime)paramq.G(this, paramLong);
  }
  
  public final LocalDateTime L(LocalDate paramLocalDate, LocalTime paramLocalTime) {
    return (this.a == paramLocalDate && this.b == paramLocalTime) ? this : new LocalDateTime(paramLocalDate, paramLocalTime);
  }
  
  public final e a(long paramLong, s params) {
    if (paramLong == Long.MIN_VALUE) {
      LocalDateTime localDateTime1 = G(Long.MAX_VALUE, params);
      paramLong = 1L;
      return localDateTime1.G(paramLong, params);
    } 
    paramLong = -paramLong;
    LocalDateTime localDateTime = this;
    return localDateTime.G(paramLong, params);
  }
  
  public final m a(long paramLong, s params) {
    if (paramLong == Long.MIN_VALUE) {
      LocalDateTime localDateTime1 = G(Long.MAX_VALUE, params);
      paramLong = 1L;
      return localDateTime1.G(paramLong, params);
    } 
    paramLong = -paramLong;
    LocalDateTime localDateTime = this;
    return localDateTime.G(paramLong, params);
  }
  
  public final Object b(b paramb) {
    return (paramb == r.f) ? this.a : super.b(paramb);
  }
  
  public final int e(q paramq) {
    return (paramq instanceof a) ? (((a)paramq).J() ? this.b.e(paramq) : this.a.e(paramq)) : super.e(paramq);
  }
  
  public final boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject instanceof LocalDateTime) {
      paramObject = paramObject;
      if (this.a.equals(((LocalDateTime)paramObject).a) && this.b.equals(((LocalDateTime)paramObject).b))
        return true; 
    } 
    return false;
  }
  
  public final boolean f(q paramq) {
    a a;
    if (paramq instanceof a) {
      a = (a)paramq;
      if (a.isDateBased() || a.J())
        return true; 
    } else if (a != null && a.r((n)this)) {
      return true;
    } 
    return false;
  }
  
  public final long g(q paramq) {
    return (paramq instanceof a) ? (((a)paramq).J() ? this.b.g(paramq) : this.a.g(paramq)) : paramq.E((n)this);
  }
  
  public final int hashCode() {
    int i = this.a.hashCode();
    return this.b.hashCode() ^ i;
  }
  
  public final m i(LocalDate paramLocalDate) {
    return L(paramLocalDate, this.b);
  }
  
  public final u j(q paramq) {
    return (paramq instanceof a) ? (((a)paramq).J() ? this.b.j(paramq) : this.a.j(paramq)) : paramq.t((n)this);
  }
  
  public final j o(ZoneOffset paramZoneOffset) {
    return ZonedDateTime.t(this, null, paramZoneOffset);
  }
  
  public final int r(LocalDateTime paramLocalDateTime) {
    int i = this.a.r(paramLocalDateTime.toLocalDate());
    return (i == 0) ? this.b.r(paramLocalDateTime.toLocalTime()) : i;
  }
  
  public LocalDate toLocalDate() {
    return this.a;
  }
  
  public LocalTime toLocalTime() {
    return this.b;
  }
  
  public final String toString() {
    String str2 = this.a.toString();
    String str1 = this.b.toString();
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(str2);
    stringBuilder.append("T");
    stringBuilder.append(str1);
    return stringBuilder.toString();
  }
  
  public final boolean z(e parame) {
    if (parame instanceof LocalDateTime)
      return (r((LocalDateTime)parame) < 0); 
    int i = ((LocalDate)l()).A() cmp parame.l().A();
    return (i < 0 || (i == 0 && super.toLocalTime().O() < parame.toLocalTime().O()));
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\j$\time\LocalDateTime.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
package j$.time;

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

public final class OffsetDateTime implements m, o, Comparable<OffsetDateTime>, Serializable {
  public static final int c = 0;
  
  private static final long serialVersionUID = 2287754244819255394L;
  
  public final LocalDateTime a;
  
  public final ZoneOffset b;
  
  static {
    LocalDateTime localDateTime = LocalDateTime.c;
    ZoneOffset zoneOffset = ZoneOffset.g;
    localDateTime.getClass();
    of(localDateTime, zoneOffset);
    localDateTime = LocalDateTime.d;
    zoneOffset = ZoneOffset.f;
    localDateTime.getClass();
    of(localDateTime, zoneOffset);
  }
  
  public OffsetDateTime(LocalDateTime paramLocalDateTime, ZoneOffset paramZoneOffset) {
    Objects.requireNonNull(paramLocalDateTime, "dateTime");
    LocalDateTime localDateTime = paramLocalDateTime;
    this.a = paramLocalDateTime;
    Objects.requireNonNull(paramZoneOffset, "offset");
    ZoneOffset zoneOffset = paramZoneOffset;
    this.b = paramZoneOffset;
  }
  
  public static OffsetDateTime of(LocalDateTime paramLocalDateTime, ZoneOffset paramZoneOffset) {
    return new OffsetDateTime(paramLocalDateTime, paramZoneOffset);
  }
  
  private void readObject(ObjectInputStream paramObjectInputStream) {
    throw new InvalidObjectException("Deserialization via serialization delegate");
  }
  
  private Object writeReplace() {
    return new m((byte)10, this);
  }
  
  public final m a(long paramLong, s params) {
    if (paramLong == Long.MIN_VALUE) {
      OffsetDateTime offsetDateTime1 = r(Long.MAX_VALUE, params);
      paramLong = 1L;
      return offsetDateTime1.r(paramLong, params);
    } 
    paramLong = -paramLong;
    OffsetDateTime offsetDateTime = this;
    return offsetDateTime.r(paramLong, params);
  }
  
  public final Object b(b paramb) {
    return (paramb == r.d || paramb == r.e) ? getOffset() : ((paramb == r.a) ? null : ((paramb == r.f) ? this.a.toLocalDate() : ((paramb == r.g) ? this.a.toLocalTime() : ((paramb == r.b) ? t.c : ((paramb == r.c) ? b.NANOS : paramb.a((n)this))))));
  }
  
  public final m c(m paramm) {
    a a2 = a.EPOCH_DAY;
    m m1 = paramm.h(this.a.toLocalDate().A(), (q)a2);
    a a1 = a.NANO_OF_DAY;
    m1 = m1.h(this.a.toLocalTime().O(), (q)a1);
    a1 = a.OFFSET_SECONDS;
    return m1.h(getOffset().getTotalSeconds(), (q)a1);
  }
  
  public final int compareTo(Object paramObject) {
    int i;
    paramObject = paramObject;
    if (getOffset().equals(paramObject.getOffset())) {
      i = toLocalDateTime().D(paramObject.toLocalDateTime());
    } else {
      int j = Long.compare(this.a.q(this.b), ((OffsetDateTime)paramObject).a.q(((OffsetDateTime)paramObject).b));
      i = j;
      if (j == 0)
        i = this.a.toLocalTime().getNano() - ((OffsetDateTime)paramObject).a.toLocalTime().getNano(); 
    } 
    return (i == 0) ? toLocalDateTime().D(paramObject.toLocalDateTime()) : i;
  }
  
  public final int e(q paramq) {
    if (paramq instanceof a) {
      int i = l.a[((a)paramq).ordinal()];
      if (i != 1)
        return (i != 2) ? this.a.e(paramq) : getOffset().getTotalSeconds(); 
      throw new RuntimeException("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
    } 
    return super.e(paramq);
  }
  
  public final boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject instanceof OffsetDateTime) {
      paramObject = paramObject;
      if (this.a.equals(((OffsetDateTime)paramObject).a) && this.b.equals(((OffsetDateTime)paramObject).b))
        return true; 
    } 
    return false;
  }
  
  public final boolean f(q paramq) {
    return (paramq instanceof a || (paramq != null && paramq.r((n)this)));
  }
  
  public final long g(q paramq) {
    if (paramq instanceof a) {
      int i = l.a[((a)paramq).ordinal()];
      return (i != 1) ? ((i != 2) ? this.a.g(paramq) : getOffset().getTotalSeconds()) : this.a.q(this.b);
    } 
    return paramq.E((n)this);
  }
  
  public ZoneOffset getOffset() {
    return this.b;
  }
  
  public final m h(long paramLong, q paramq) {
    Instant instant;
    if (paramq instanceof a) {
      a a = (a)paramq;
      int i = l.a[a.ordinal()];
      LocalDateTime localDateTime = this.a;
      if (i != 1)
        return (i != 2) ? t(localDateTime.K(paramLong, paramq), this.b) : t(localDateTime, ZoneOffset.ofTotalSeconds(a.b.a(paramLong, (q)a))); 
      instant = Instant.ofEpochSecond(paramLong, localDateTime.b.getNano());
      ZoneOffset zoneOffset = this.b;
      Objects.requireNonNull(instant, "instant");
      Objects.requireNonNull(zoneOffset, "zone");
      zoneOffset = zoneOffset.r().d(instant);
      return new OffsetDateTime(LocalDateTime.E(instant.getEpochSecond(), instant.getNano(), zoneOffset), zoneOffset);
    } 
    return instant.G(this, paramLong);
  }
  
  public final int hashCode() {
    int i = this.a.hashCode();
    return this.b.a ^ i;
  }
  
  public final m i(LocalDate paramLocalDate) {
    LocalDateTime localDateTime = this.a;
    return t(localDateTime.L(paramLocalDate, localDateTime.b), this.b);
  }
  
  public final u j(q paramq) {
    return (paramq instanceof a) ? ((paramq == a.INSTANT_SECONDS || paramq == a.OFFSET_SECONDS) ? ((a)paramq).b : this.a.j(paramq)) : paramq.t((n)this);
  }
  
  public final OffsetDateTime r(long paramLong, s params) {
    return (params instanceof b) ? t(this.a.G(paramLong, params), this.b) : (OffsetDateTime)params.r(this, paramLong);
  }
  
  public final OffsetDateTime t(LocalDateTime paramLocalDateTime, ZoneOffset paramZoneOffset) {
    return (this.a == paramLocalDateTime && this.b.equals(paramZoneOffset)) ? this : new OffsetDateTime(paramLocalDateTime, paramZoneOffset);
  }
  
  public LocalDateTime toLocalDateTime() {
    return this.a;
  }
  
  public final String toString() {
    String str1 = this.a.toString();
    String str2 = this.b.b;
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(str1);
    stringBuilder.append(str2);
    return stringBuilder.toString();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\j$\time\OffsetDateTime.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
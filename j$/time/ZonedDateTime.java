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
import j$.time.zone.b;
import j$.time.zone.f;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

public final class ZonedDateTime implements m, j, Serializable {
  private static final long serialVersionUID = -6260982410461394882L;
  
  public final LocalDateTime a;
  
  public final ZoneOffset b;
  
  public final ZoneId c;
  
  public ZonedDateTime(LocalDateTime paramLocalDateTime, ZoneOffset paramZoneOffset, ZoneId paramZoneId) {
    this.a = paramLocalDateTime;
    this.b = paramZoneOffset;
    this.c = paramZoneId;
  }
  
  public static ZonedDateTime ofInstant(LocalDateTime paramLocalDateTime, ZoneOffset paramZoneOffset, ZoneId paramZoneId) {
    Objects.requireNonNull(paramLocalDateTime, "localDateTime");
    Objects.requireNonNull(paramZoneOffset, "offset");
    Objects.requireNonNull(paramZoneId, "zone");
    return paramZoneId.r().f(paramLocalDateTime).contains(paramZoneOffset) ? new ZonedDateTime(paramLocalDateTime, paramZoneOffset, paramZoneId) : r(paramLocalDateTime.q(paramZoneOffset), paramLocalDateTime.b.getNano(), paramZoneId);
  }
  
  public static ZonedDateTime r(long paramLong, int paramInt, ZoneId paramZoneId) {
    ZoneOffset zoneOffset = paramZoneId.r().d(Instant.ofEpochSecond(paramLong, paramInt));
    return new ZonedDateTime(LocalDateTime.E(paramLong, paramInt, zoneOffset), zoneOffset, paramZoneId);
  }
  
  private void readObject(ObjectInputStream paramObjectInputStream) {
    throw new InvalidObjectException("Deserialization via serialization delegate");
  }
  
  public static ZonedDateTime t(LocalDateTime paramLocalDateTime, ZoneOffset paramZoneOffset, ZoneId paramZoneId) {
    Object object;
    Objects.requireNonNull(paramLocalDateTime, "localDateTime");
    Objects.requireNonNull(paramZoneId, "zone");
    if (paramZoneId instanceof ZoneOffset)
      return new ZonedDateTime(paramLocalDateTime, (ZoneOffset)paramZoneId, paramZoneId); 
    f f = paramZoneId.r();
    List<ZoneOffset> list = f.f(paramLocalDateTime);
    if (list.size() == 1) {
      paramZoneOffset = list.get(0);
    } else if (list.size() == 0) {
      object = f.e(paramLocalDateTime);
      if (object instanceof b) {
        object = object;
      } else {
        object = null;
      } 
      paramLocalDateTime = paramLocalDateTime.I(Duration.r((((b)object).d.getTotalSeconds() - ((b)object).c.getTotalSeconds()), 0).getSeconds());
      object = ((b)object).d;
    } else if (object == null || !list.contains(object)) {
      object = list.get(0);
      Objects.requireNonNull(object, "offset");
    } 
    return new ZonedDateTime(paramLocalDateTime, (ZoneOffset)object, paramZoneId);
  }
  
  private Object writeReplace() {
    return new m((byte)6, this);
  }
  
  public final ZonedDateTime E(LocalDate paramLocalDate) {
    LocalDateTime localDateTime = LocalDateTime.of(paramLocalDate, this.a.toLocalTime());
    ZoneId zoneId = this.c;
    return t(localDateTime, this.b, zoneId);
  }
  
  public final j a(long paramLong, s params) {
    if (paramLong == Long.MIN_VALUE) {
      ZonedDateTime zonedDateTime1 = z(Long.MAX_VALUE, params);
      paramLong = 1L;
      return zonedDateTime1.z(paramLong, params);
    } 
    paramLong = -paramLong;
    ZonedDateTime zonedDateTime = this;
    return zonedDateTime.z(paramLong, params);
  }
  
  public final m a(long paramLong, s params) {
    if (paramLong == Long.MIN_VALUE) {
      ZonedDateTime zonedDateTime1 = z(Long.MAX_VALUE, params);
      paramLong = 1L;
      return zonedDateTime1.z(paramLong, params);
    } 
    paramLong = -paramLong;
    ZonedDateTime zonedDateTime = this;
    return zonedDateTime.z(paramLong, params);
  }
  
  public final Object b(b paramb) {
    return (paramb == r.f) ? this.a.toLocalDate() : super.b(paramb);
  }
  
  public final int e(q paramq) {
    if (paramq instanceof a) {
      int i = q.a[((a)paramq).ordinal()];
      if (i != 1)
        return (i != 2) ? this.a.e(paramq) : getOffset().getTotalSeconds(); 
      throw new RuntimeException("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
    } 
    return super.e(paramq);
  }
  
  public final boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject instanceof ZonedDateTime) {
      paramObject = paramObject;
      if (this.a.equals(((ZonedDateTime)paramObject).a) && this.b.equals(((ZonedDateTime)paramObject).b) && this.c.equals(((ZonedDateTime)paramObject).c))
        return true; 
    } 
    return false;
  }
  
  public final boolean f(q paramq) {
    return (paramq instanceof a || (paramq != null && paramq.r((n)this)));
  }
  
  public final long g(q paramq) {
    if (paramq instanceof a) {
      int i = q.a[((a)paramq).ordinal()];
      return (i != 1) ? ((i != 2) ? this.a.g(paramq) : getOffset().getTotalSeconds()) : H();
    } 
    return paramq.E((n)this);
  }
  
  public ZoneOffset getOffset() {
    return this.b;
  }
  
  public ZoneId getZone() {
    return this.c;
  }
  
  public final m h(long paramLong, q paramq) {
    ZonedDateTime zonedDateTime;
    if (paramq instanceof a) {
      a a = (a)paramq;
      int i = q.a[a.ordinal()];
      if (i != 1) {
        LocalDateTime localDateTime;
        if (i != 2) {
          localDateTime = this.a.K(paramLong, paramq);
          ZoneId zoneId = this.c;
          return t(localDateTime, this.b, zoneId);
        } 
        ZoneOffset zoneOffset = ZoneOffset.ofTotalSeconds(((a)localDateTime).b.a(paramLong, (q)localDateTime));
        zonedDateTime = this;
        if (!zoneOffset.equals(this.b)) {
          zonedDateTime = this;
          if (this.c.r().f(this.a).contains(zoneOffset))
            zonedDateTime = new ZonedDateTime(this.a, zoneOffset, this.c); 
        } 
        return zonedDateTime;
      } 
      return r(paramLong, this.a.b.getNano(), this.c);
    } 
    return zonedDateTime.G(this, paramLong);
  }
  
  public final int hashCode() {
    int k = this.a.hashCode();
    int i = this.b.a;
    return Integer.rotateLeft(this.c.hashCode(), 3) ^ k ^ i;
  }
  
  public final u j(q paramq) {
    return (paramq instanceof a) ? ((paramq == a.INSTANT_SECONDS || paramq == a.OFFSET_SECONDS) ? ((a)paramq).b : this.a.j(paramq)) : paramq.t((n)this);
  }
  
  public final b l() {
    return this.a.toLocalDate();
  }
  
  public LocalDateTime toLocalDateTime() {
    return this.a;
  }
  
  public final LocalTime toLocalTime() {
    return this.a.toLocalTime();
  }
  
  public final String toString() {
    String str3 = this.a.toString();
    String str2 = this.b.b;
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(str3);
    stringBuilder.append(str2);
    String str1 = stringBuilder.toString();
    ZoneOffset zoneOffset = this.b;
    ZoneId zoneId = this.c;
    if (zoneOffset != zoneId) {
      String str = zoneId.toString();
      StringBuilder stringBuilder1 = new StringBuilder();
      stringBuilder1.append(str1);
      stringBuilder1.append("[");
      stringBuilder1.append(str);
      stringBuilder1.append("]");
      return stringBuilder1.toString();
    } 
    return str1;
  }
  
  public final j v(ZoneId paramZoneId) {
    Objects.requireNonNull(paramZoneId, "zone");
    return this.c.equals(paramZoneId) ? this : t(this.a, this.b, paramZoneId);
  }
  
  public final ZonedDateTime z(long paramLong, s params) {
    LocalDateTime localDateTime;
    if (params instanceof b) {
      b<b> b = (b)params;
      if (b.compareTo(b.DAYS) >= 0 && b != b.FOREVER) {
        localDateTime = this.a.G(paramLong, params);
        ZoneId zoneId = this.c;
        return t(localDateTime, this.b, zoneId);
      } 
      return ofInstant(this.a.G(paramLong, (s)localDateTime), this.b, this.c);
    } 
    return (ZonedDateTime)localDateTime.r(this, paramLong);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\j$\time\ZonedDateTime.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
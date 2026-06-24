package j$.time;

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

public final class OffsetTime implements m, o, Comparable<OffsetTime>, Serializable {
  public static final int c = 0;
  
  private static final long serialVersionUID = 7264499704384272492L;
  
  public final LocalTime a;
  
  public final ZoneOffset b;
  
  static {
    LocalTime localTime2 = LocalTime.e;
    ZoneOffset zoneOffset1 = ZoneOffset.g;
    localTime2.getClass();
    of(localTime2, zoneOffset1);
    LocalTime localTime1 = LocalTime.f;
    ZoneOffset zoneOffset2 = ZoneOffset.f;
    localTime1.getClass();
    of(localTime1, zoneOffset2);
  }
  
  public OffsetTime(LocalTime paramLocalTime, ZoneOffset paramZoneOffset) {
    Objects.requireNonNull(paramLocalTime, "time");
    LocalTime localTime = paramLocalTime;
    this.a = paramLocalTime;
    Objects.requireNonNull(paramZoneOffset, "offset");
    ZoneOffset zoneOffset = paramZoneOffset;
    this.b = paramZoneOffset;
  }
  
  public static OffsetTime of(LocalTime paramLocalTime, ZoneOffset paramZoneOffset) {
    return new OffsetTime(paramLocalTime, paramZoneOffset);
  }
  
  private void readObject(ObjectInputStream paramObjectInputStream) {
    throw new InvalidObjectException("Deserialization via serialization delegate");
  }
  
  private Object writeReplace() {
    return new m((byte)9, this);
  }
  
  public final m a(long paramLong, s params) {
    if (paramLong == Long.MIN_VALUE) {
      OffsetTime offsetTime1 = r(Long.MAX_VALUE, params);
      paramLong = 1L;
      return offsetTime1.r(paramLong, params);
    } 
    paramLong = -paramLong;
    OffsetTime offsetTime = this;
    return offsetTime.r(paramLong, params);
  }
  
  public final Object b(b paramb) {
    boolean bool1;
    if (paramb == r.d || paramb == r.e)
      return this.b; 
    b b1 = r.a;
    boolean bool2 = false;
    if (paramb == b1) {
      bool1 = true;
    } else {
      bool1 = false;
    } 
    if (paramb == r.b)
      bool2 = true; 
    return ((bool1 | bool2) != 0 || paramb == r.f) ? null : ((paramb == r.g) ? this.a : ((paramb == r.c) ? b.NANOS : paramb.a((n)this)));
  }
  
  public final m c(m paramm) {
    a a2 = a.NANO_OF_DAY;
    m m1 = paramm.h(this.a.O(), (q)a2);
    a a1 = a.OFFSET_SECONDS;
    return m1.h(this.b.getTotalSeconds(), (q)a1);
  }
  
  public final int compareTo(Object paramObject) {
    paramObject = paramObject;
    boolean bool = this.b.equals(((OffsetTime)paramObject).b);
    LocalTime localTime = this.a;
    if (bool)
      return localTime.r(((OffsetTime)paramObject).a); 
    int i = Long.compare(localTime.O() - this.b.getTotalSeconds() * 1000000000L, ((OffsetTime)paramObject).a.O() - ((OffsetTime)paramObject).b.getTotalSeconds() * 1000000000L);
    return (i == 0) ? this.a.r(((OffsetTime)paramObject).a) : i;
  }
  
  public final boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject instanceof OffsetTime) {
      paramObject = paramObject;
      if (this.a.equals(((OffsetTime)paramObject).a) && this.b.equals(((OffsetTime)paramObject).b))
        return true; 
    } 
    return false;
  }
  
  public final boolean f(q paramq) {
    return ((paramq instanceof a) ? (((a)paramq).J() || paramq == a.OFFSET_SECONDS) : (paramq != null && paramq.r((n)this)));
  }
  
  public final long g(q paramq) {
    return (paramq instanceof a) ? ((paramq == a.OFFSET_SECONDS) ? this.b.getTotalSeconds() : this.a.g(paramq)) : paramq.E((n)this);
  }
  
  public ZoneOffset getOffset() {
    return this.b;
  }
  
  public final m h(long paramLong, q paramq) {
    a a;
    if (paramq instanceof a) {
      a a1 = a.OFFSET_SECONDS;
      LocalTime localTime = this.a;
      if (paramq == a1) {
        a = (a)paramq;
        return t(localTime, ZoneOffset.ofTotalSeconds(a.b.a(paramLong, (q)a)));
      } 
      return t(localTime.Q(paramLong, (q)a), this.b);
    } 
    return a.G(this, paramLong);
  }
  
  public final int hashCode() {
    int i = this.a.hashCode();
    return this.b.a ^ i;
  }
  
  public final m i(LocalDate paramLocalDate) {
    return paramLocalDate.c(this);
  }
  
  public final u j(q paramq) {
    return (paramq instanceof a) ? ((paramq == a.OFFSET_SECONDS) ? ((a)paramq).b : this.a.j(paramq)) : paramq.t((n)this);
  }
  
  public final OffsetTime r(long paramLong, s params) {
    return (params instanceof b) ? t(this.a.I(paramLong, params), this.b) : (OffsetTime)params.r(this, paramLong);
  }
  
  public final OffsetTime t(LocalTime paramLocalTime, ZoneOffset paramZoneOffset) {
    return (this.a == paramLocalTime && this.b.equals(paramZoneOffset)) ? this : new OffsetTime(paramLocalTime, paramZoneOffset);
  }
  
  public LocalTime toLocalTime() {
    return this.a;
  }
  
  public final String toString() {
    String str2 = this.a.toString();
    String str1 = this.b.b;
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(str2);
    stringBuilder.append(str1);
    return stringBuilder.toString();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\j$\time\OffsetTime.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
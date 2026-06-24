package j$.time.chrono;

import j$.time.Duration;
import j$.time.Instant;
import j$.time.LocalDateTime;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.f;
import j$.time.temporal.a;
import j$.time.temporal.b;
import j$.time.temporal.m;
import j$.time.temporal.n;
import j$.time.temporal.q;
import j$.time.temporal.s;
import j$.time.zone.b;
import j$.time.zone.f;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

public final class l implements j, Serializable {
  private static final long serialVersionUID = -5261813987200935591L;
  
  public final transient g a;
  
  public final transient ZoneOffset b;
  
  public final transient ZoneId c;
  
  public l(ZoneId paramZoneId, ZoneOffset paramZoneOffset, g paramg) {
    Objects.requireNonNull(paramg, "dateTime");
    g g1 = paramg;
    this.a = paramg;
    Objects.requireNonNull(paramZoneOffset, "offset");
    ZoneOffset zoneOffset = paramZoneOffset;
    this.b = paramZoneOffset;
    Objects.requireNonNull(paramZoneId, "zone");
    ZoneId zoneId = paramZoneId;
    this.c = paramZoneId;
  }
  
  public static l r(m paramm, m paramm1) {
    paramm1 = paramm1;
    if (paramm.equals(paramm1.d()))
      return (l)paramm1; 
    f.d("Chronology mismatch, required: ", paramm.getId(), paramm1.d().getId());
    return null;
  }
  
  private void readObject(ObjectInputStream paramObjectInputStream) {
    throw new InvalidObjectException("Deserialization via serialization delegate");
  }
  
  public static l t(ZoneId paramZoneId, ZoneOffset paramZoneOffset, g paramg) {
    Object object;
    Objects.requireNonNull(paramg, "localDateTime");
    Objects.requireNonNull(paramZoneId, "zone");
    if (paramZoneId instanceof ZoneOffset)
      return new l(paramZoneId, (ZoneOffset)paramZoneId, paramg); 
    f f = paramZoneId.r();
    LocalDateTime localDateTime = LocalDateTime.t((n)paramg);
    List<ZoneOffset> list = f.f(localDateTime);
    if (list.size() == 1) {
      paramZoneOffset = list.get(0);
    } else if (list.size() == 0) {
      object = f.e(localDateTime);
      if (object instanceof b) {
        object = object;
      } else {
        object = null;
      } 
      long l1 = Duration.r((((b)object).d.getTotalSeconds() - ((b)object).c.getTotalSeconds()), 0).getSeconds();
      paramg = paramg.z(paramg.a, 0L, 0L, l1, 0L);
      object = ((b)object).d;
    } else if (object == null || !list.contains(object)) {
      object = list.get(0);
    } 
    Objects.requireNonNull(object, "offset");
    return new l(paramZoneId, (ZoneOffset)object, paramg);
  }
  
  private Object writeReplace() {
    return new f0((byte)3, this);
  }
  
  public final boolean equals(Object paramObject) {
    return (this == paramObject || (paramObject instanceof j && n((j)paramObject) == 0));
  }
  
  public final boolean f(q paramq) {
    return (paramq instanceof a || (paramq != null && paramq.r((n)this)));
  }
  
  public final ZoneOffset getOffset() {
    return this.b;
  }
  
  public final ZoneId getZone() {
    return this.c;
  }
  
  public final m h(long paramLong, q paramq) {
    ZoneId zoneId;
    if (paramq instanceof a) {
      a a = (a)paramq;
      int i = k.a[a.ordinal()];
      if (i != 1) {
        if (i != 2) {
          g g2 = this.a.E(paramLong, paramq);
          return t(this.c, this.b, g2);
        } 
        ZoneOffset zoneOffset = ZoneOffset.ofTotalSeconds(a.b.a(paramLong, (q)a));
        g g1 = this.a;
        Instant instant = Instant.ofEpochSecond(g1.q(zoneOffset), g1.b.getNano());
        zoneId = this.c;
        m m = d();
        zoneOffset = zoneId.r().d(instant);
        Objects.requireNonNull(zoneOffset, "offset");
        return new l(zoneId, zoneOffset, (g)m.y(LocalDateTime.E(instant.getEpochSecond(), instant.getNano(), zoneOffset)));
      } 
      return z(paramLong - H(), (s)b.SECONDS);
    } 
    return r(d(), zoneId.G(this, paramLong));
  }
  
  public final int hashCode() {
    int i = this.a.hashCode();
    int k = this.b.a;
    return Integer.rotateLeft(this.c.hashCode(), 3) ^ i ^ k;
  }
  
  public final e s() {
    return this.a;
  }
  
  public final String toString() {
    String str1 = this.a.toString();
    String str2 = this.b.b;
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(str1);
    stringBuilder.append(str2);
    str1 = stringBuilder.toString();
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
    g g1 = this.a;
    return t(paramZoneId, this.b, g1);
  }
  
  public final l z(long paramLong, s params) {
    return (params instanceof b) ? (l)w(this.a.t(paramLong, params)) : r(d(), params.r(this, paramLong));
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\j$\time\chrono\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
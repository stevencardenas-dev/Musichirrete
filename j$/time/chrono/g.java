package j$.time.chrono;

import j$.time.LocalDate;
import j$.time.LocalTime;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.f;
import j$.time.temporal.a;
import j$.time.temporal.b;
import j$.time.temporal.m;
import j$.time.temporal.n;
import j$.time.temporal.o;
import j$.time.temporal.q;
import j$.time.temporal.s;
import j$.time.temporal.u;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Objects;

public final class g implements e, m, o, Serializable {
  private static final long serialVersionUID = 4556003607393004514L;
  
  public final transient b a;
  
  public final transient LocalTime b;
  
  public g(b paramb, LocalTime paramLocalTime) {
    Objects.requireNonNull(paramLocalTime, "time");
    this.a = paramb;
    this.b = paramLocalTime;
  }
  
  public static g r(m paramm, m paramm1) {
    paramm1 = paramm1;
    if (paramm.equals(paramm1.d()))
      return (g)paramm1; 
    f.d("Chronology mismatch, required: ", paramm.getId(), paramm1.d().getId());
    return null;
  }
  
  private void readObject(ObjectInputStream paramObjectInputStream) {
    throw new InvalidObjectException("Deserialization via serialization delegate");
  }
  
  private Object writeReplace() {
    return new f0((byte)2, this);
  }
  
  public final g E(long paramLong, q paramq) {
    if (paramq instanceof a) {
      boolean bool = ((a)paramq).J();
      b b1 = this.a;
      return bool ? G(b1, this.b.Q(paramLong, paramq)) : G(b1.h(paramLong, paramq), this.b);
    } 
    return r(this.a.d(), paramq.G(this, paramLong));
  }
  
  public final g G(m paramm, LocalTime paramLocalTime) {
    b b1 = this.a;
    return (b1 == paramm && this.b == paramLocalTime) ? this : new g(d.r(b1.d(), paramm), paramLocalTime);
  }
  
  public final int e(q paramq) {
    return (paramq instanceof a) ? (((a)paramq).J() ? this.b.e(paramq) : this.a.e(paramq)) : j(paramq).a(g(paramq), paramq);
  }
  
  public final boolean equals(Object paramObject) {
    return (this == paramObject) ? true : ((paramObject instanceof e && D((e)paramObject) == 0));
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
    return G((m)paramLocalDate, this.b);
  }
  
  public final u j(q paramq) {
    if (paramq instanceof a) {
      if (((a)paramq).J()) {
        LocalTime localTime = this.b;
        return localTime.j(paramq);
      } 
      b b1 = this.a;
      return b1.j(paramq);
    } 
    return paramq.t((n)this);
  }
  
  public final b l() {
    return this.a;
  }
  
  public final j o(ZoneOffset paramZoneOffset) {
    return l.t((ZoneId)paramZoneOffset, null, this);
  }
  
  public final g t(long paramLong, s params) {
    g g1;
    if (params instanceof b) {
      long l;
      b b1 = (b)params;
      switch (f.a[b1.ordinal()]) {
        default:
          return G(this.a.k(paramLong, params), this.b);
        case 7:
          l = paramLong / 256L;
          g1 = G(this.a.k(l, (s)b.DAYS), this.b);
          return g1.z(g1.a, paramLong % 256L * 12L, 0L, 0L, 0L);
        case 6:
          return z(this.a, paramLong, 0L, 0L, 0L);
        case 5:
          return z(this.a, 0L, paramLong, 0L, 0L);
        case 4:
          return z(this.a, 0L, 0L, paramLong, 0L);
        case 3:
          l = paramLong / 86400000L;
          g1 = G(this.a.k(l, (s)b.DAYS), this.b);
          return g1.z(g1.a, 0L, 0L, 0L, paramLong % 86400000L * 1000000L);
        case 2:
          l = paramLong / 86400000000L;
          g1 = G(this.a.k(l, (s)b.DAYS), this.b);
          return g1.z(g1.a, 0L, 0L, 0L, paramLong % 86400000000L * 1000L);
        case 1:
          break;
      } 
      return z(this.a, 0L, 0L, 0L, paramLong);
    } 
    return r(this.a.d(), g1.r(this, paramLong));
  }
  
  public final LocalTime toLocalTime() {
    return this.b;
  }
  
  public final String toString() {
    String str1 = this.a.toString();
    String str2 = this.b.toString();
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(str1);
    stringBuilder.append("T");
    stringBuilder.append(str2);
    return stringBuilder.toString();
  }
  
  public final g z(b paramb, long paramLong1, long paramLong2, long paramLong3, long paramLong4) {
    LocalTime localTime = this.b;
    if ((paramLong1 | paramLong2 | paramLong3 | paramLong4) == 0L)
      return G(paramb, localTime); 
    long l4 = paramLong4 / 86400000000000L;
    long l5 = paramLong3 / 86400L;
    long l1 = paramLong2 / 1440L;
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
    return G(paramb.k(paramLong1 + l2 + l1 + l5 + l4, (s)b.DAYS), localTime);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\j$\time\chrono\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
package j$.time.chrono;

import j$.time.LocalDate;
import j$.time.LocalTime;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
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

public interface j extends m, Comparable {
  default long H() {
    return l().A() * 86400L + toLocalTime().P() - getOffset().getTotalSeconds();
  }
  
  default j a(long paramLong, s params) {
    return l.r(d(), super.a(paramLong, params));
  }
  
  default Object b(b paramb) {
    return (paramb == r.e || paramb == r.a) ? getZone() : ((paramb == r.d) ? getOffset() : ((paramb == r.g) ? toLocalTime() : ((paramb == r.b) ? d() : ((paramb == r.c) ? b.NANOS : paramb.a((n)this)))));
  }
  
  default m d() {
    return l().d();
  }
  
  default int e(q paramq) {
    if (paramq instanceof a) {
      int i = i.a[((a)paramq).ordinal()];
      if (i != 1)
        return (i != 2) ? s().e(paramq) : getOffset().getTotalSeconds(); 
      throw new RuntimeException("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
    } 
    return super.e(paramq);
  }
  
  default long g(q paramq) {
    if (paramq instanceof a) {
      int i = i.a[((a)paramq).ordinal()];
      return (i != 1) ? ((i != 2) ? s().g(paramq) : getOffset().getTotalSeconds()) : H();
    } 
    return paramq.E((n)this);
  }
  
  ZoneOffset getOffset();
  
  ZoneId getZone();
  
  default u j(q paramq) {
    return (paramq instanceof a) ? ((paramq == a.INSTANT_SECONDS || paramq == a.OFFSET_SECONDS) ? ((a)paramq).b : s().j(paramq)) : paramq.t((n)this);
  }
  
  default b l() {
    return s().l();
  }
  
  default int n(j paramj) {
    int k = Long.compare(H(), paramj.H());
    int i = k;
    if (k == 0) {
      k = toLocalTime().getNano() - paramj.toLocalTime().getNano();
      i = k;
      if (k == 0) {
        k = s().D(paramj.s());
        i = k;
        if (k == 0) {
          k = getZone().getId().compareTo(paramj.getZone().getId());
          i = k;
          if (k == 0) {
            m m2 = d();
            m m1 = paramj.d();
            return ((a)m2).getId().compareTo(m1.getId());
          } 
        } 
      } 
    } 
    return i;
  }
  
  e s();
  
  default LocalTime toLocalTime() {
    return s().toLocalTime();
  }
  
  j v(ZoneId paramZoneId);
  
  default j w(o paramo) {
    return l.r(d(), paramo.c(this));
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\j$\time\chrono\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
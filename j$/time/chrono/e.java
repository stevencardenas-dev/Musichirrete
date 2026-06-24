package j$.time.chrono;

import j$.time.LocalTime;
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
import java.util.Objects;

public interface e extends m, o, Comparable {
  default int D(e parame) {
    int j = l().F(parame.l());
    int i = j;
    if (j == 0) {
      j = toLocalTime().r(parame.toLocalTime());
      i = j;
      if (j == 0) {
        m m2 = d();
        m m1 = parame.d();
        return ((a)m2).getId().compareTo(m1.getId());
      } 
    } 
    return i;
  }
  
  default e a(long paramLong, s params) {
    return g.r(d(), super.a(paramLong, params));
  }
  
  default Object b(b paramb) {
    return (paramb == r.a || paramb == r.e || paramb == r.d) ? null : ((paramb == r.g) ? toLocalTime() : ((paramb == r.b) ? d() : ((paramb == r.c) ? b.NANOS : paramb.a((n)this))));
  }
  
  default m c(m paramm) {
    a a2 = a.EPOCH_DAY;
    m m1 = paramm.h(l().A(), (q)a2);
    a a1 = a.NANO_OF_DAY;
    return m1.h(toLocalTime().O(), (q)a1);
  }
  
  default m d() {
    return l().d();
  }
  
  b l();
  
  j o(ZoneOffset paramZoneOffset);
  
  default long q(ZoneOffset paramZoneOffset) {
    Objects.requireNonNull(paramZoneOffset, "offset");
    return l().A() * 86400L + toLocalTime().P() - paramZoneOffset.getTotalSeconds();
  }
  
  LocalTime toLocalTime();
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\j$\time\chrono\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
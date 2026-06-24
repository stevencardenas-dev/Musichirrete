package j$.time.chrono;

import j$.time.LocalTime;
import j$.time.format.b;
import j$.time.temporal.a;
import j$.time.temporal.b;
import j$.time.temporal.m;
import j$.time.temporal.n;
import j$.time.temporal.o;
import j$.time.temporal.q;
import j$.time.temporal.r;
import j$.time.temporal.s;

public interface b extends m, o, Comparable {
  default long A() {
    return g((q)a.EPOCH_DAY);
  }
  
  default e B(LocalTime paramLocalTime) {
    return new g(this, paramLocalTime);
  }
  
  default n C() {
    return d().u(e((q)a.ERA));
  }
  
  default int F(b paramb) {
    int i = Long.compare(A(), paramb.A());
    if (i == 0) {
      m m2 = d();
      m m1 = paramb.d();
      return ((a)m2).getId().compareTo(m1.getId());
    } 
    return i;
  }
  
  default b a(long paramLong, s params) {
    return d.r(d(), a(paramLong, params));
  }
  
  default Object b(b paramb) {
    return (paramb == r.a || paramb == r.e || paramb == r.d || paramb == r.g) ? null : ((paramb == r.b) ? d() : ((paramb == r.c) ? b.DAYS : paramb.a((n)this)));
  }
  
  default m c(m paramm) {
    a a = a.EPOCH_DAY;
    return paramm.h(A(), (q)a);
  }
  
  m d();
  
  default boolean f(q paramq) {
    return (paramq instanceof a) ? ((a)paramq).isDateBased() : ((paramq != null && paramq.r((n)this)));
  }
  
  b h(long paramLong, q paramq);
  
  int hashCode();
  
  b k(long paramLong, s params);
  
  String toString();
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\j$\time\chrono\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
package j$.time.chrono;

import j$.time.b;
import j$.time.format.b;
import j$.time.temporal.a;
import j$.time.temporal.b;
import j$.time.temporal.m;
import j$.time.temporal.n;
import j$.time.temporal.o;
import j$.time.temporal.q;
import j$.time.temporal.r;

public interface n extends n, o {
  default Object b(b paramb) {
    return (paramb == r.c) ? b.ERAS : super.b(paramb);
  }
  
  default m c(m paramm) {
    a a = a.ERA;
    return paramm.h(getValue(), (q)a);
  }
  
  default int e(q paramq) {
    return (paramq == a.ERA) ? getValue() : super.e(paramq);
  }
  
  default boolean f(q paramq) {
    return ((paramq instanceof a) ? (paramq == a.ERA) : (paramq != null && paramq.r(this)));
  }
  
  default long g(q paramq) {
    if (paramq == a.ERA)
      return getValue(); 
    if (!(paramq instanceof a))
      return paramq.E(this); 
    throw new RuntimeException(b.a("Unsupported field: ", paramq));
  }
  
  int getValue();
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\j$\time\chrono\n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
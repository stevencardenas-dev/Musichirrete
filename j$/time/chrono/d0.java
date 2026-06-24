package j$.time.chrono;

import j$.time.LocalDate;
import j$.time.LocalTime;
import j$.time.b;
import j$.time.temporal.a;
import j$.time.temporal.m;
import j$.time.temporal.n;
import j$.time.temporal.o;
import j$.time.temporal.q;
import j$.time.temporal.s;
import j$.time.temporal.u;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Objects;

public final class d0 extends d {
  private static final long serialVersionUID = 1300372329181994526L;
  
  public final transient LocalDate a;
  
  public d0(LocalDate paramLocalDate) {
    Objects.requireNonNull(paramLocalDate, "isoDate");
    this.a = paramLocalDate;
  }
  
  private void readObject(ObjectInputStream paramObjectInputStream) {
    throw new InvalidObjectException("Deserialization via serialization delegate");
  }
  
  private Object writeReplace() {
    return new f0((byte)7, this);
  }
  
  public final long A() {
    return this.a.A();
  }
  
  public final e B(LocalTime paramLocalTime) {
    return new g(this, paramLocalTime);
  }
  
  public final n C() {
    return (I() >= 1) ? e0.ROC : e0.BEFORE_ROC;
  }
  
  public final b E(long paramLong) {
    return K(this.a.P(paramLong));
  }
  
  public final b G(o paramo) {
    return super.G(paramo);
  }
  
  public final int I() {
    return this.a.getYear() - 1911;
  }
  
  public final d0 J(long paramLong, q paramq) {
    LocalDate localDate;
    if (paramq instanceof a) {
      a a = (a)paramq;
      if (g((q)a) == paramLong)
        return this; 
      int[] arrayOfInt = c0.a;
      int i = arrayOfInt[a.ordinal()];
      if (i != 4)
        if (i != 5) {
          if (i != 6 && i != 7)
            return K(this.a.R(paramLong, paramq)); 
        } else {
          b0.c.t(a).b(paramLong, (q)a);
          long l2 = I();
          long l1 = this.a.getMonthValue();
          return K(this.a.O(paramLong - l2 * 12L + l1 - 1L));
        }  
      i = b0.c.t(a).a(paramLong, (q)a);
      int j = arrayOfInt[a.ordinal()];
      if (j != 4)
        return (j != 6) ? ((j == 7) ? K(this.a.U(1912 - I())) : K(this.a.R(paramLong, paramq))) : K(this.a.U(i + 1911)); 
      localDate = this.a;
      if (I() >= 1) {
        i += 1911;
      } else {
        i = 1912 - i;
      } 
      return K(localDate.U(i));
    } 
    return (d0)super.h(paramLong, (q)localDate);
  }
  
  public final d0 K(LocalDate paramLocalDate) {
    return paramLocalDate.equals(this.a) ? this : new d0(paramLocalDate);
  }
  
  public final b a(long paramLong, s params) {
    return super.a(paramLong, params);
  }
  
  public final m a(long paramLong, s params) {
    return super.a(paramLong, params);
  }
  
  public final m d() {
    return b0.c;
  }
  
  public final boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject instanceof d0) {
      paramObject = paramObject;
      return this.a.equals(((d0)paramObject).a);
    } 
    return false;
  }
  
  public final long g(q paramq) {
    if (paramq instanceof a) {
      int j = c0.a[((a)paramq).ordinal()];
      int i = 1;
      if (j != 4) {
        if (j != 5) {
          if (j != 6) {
            if (j != 7)
              return this.a.g(paramq); 
            if (I() < 1)
              i = 0; 
            return i;
          } 
          return I();
        } 
        return I() * 12L + this.a.getMonthValue() - 1L;
      } 
      i = I();
      if (i < 1)
        i = 1 - i; 
      return i;
    } 
    return paramq.E((n)this);
  }
  
  public final int hashCode() {
    b0.c.getClass();
    return this.a.hashCode() ^ 0x89605DCF;
  }
  
  public final m i(LocalDate paramLocalDate) {
    return super.G((o)paramLocalDate);
  }
  
  public final u j(q paramq) {
    u u;
    if (paramq instanceof a) {
      if (f(paramq)) {
        a a = (a)paramq;
        int i = c0.a[a.ordinal()];
        if (i != 1 && i != 2 && i != 3) {
          long l;
          if (i != 4)
            return b0.c.t(a); 
          u = a.YEAR.b;
          if (I() <= 0) {
            l = -u.a + 1912L;
          } else {
            l = u.d - 1911L;
          } 
          return u.e(1L, l);
        } 
        return this.a.j((q)u);
      } 
      throw new RuntimeException(b.a("Unsupported field: ", u));
    } 
    return u.t((n)this);
  }
  
  public final b k(long paramLong, s params) {
    return super.k(paramLong, params);
  }
  
  public final m k(long paramLong, s params) {
    return super.k(paramLong, params);
  }
  
  public final b t(long paramLong) {
    return K(this.a.N(paramLong));
  }
  
  public final b z(long paramLong) {
    return K(this.a.O(paramLong));
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\j$\time\chrono\d0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
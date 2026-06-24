package j$.time;

import j$.time.format.a;
import j$.time.format.b;
import j$.time.format.f;
import j$.time.format.q;
import j$.time.temporal.a;
import j$.time.temporal.b;
import j$.time.temporal.m;
import j$.time.temporal.n;
import j$.time.temporal.o;
import j$.time.temporal.q;
import j$.time.temporal.r;
import j$.time.temporal.s;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

public final class Instant implements m, o, Comparable<Instant>, Serializable {
  public static final Instant c = new Instant(0L, 0);
  
  private static final long serialVersionUID = -665713676816604388L;
  
  public final long a;
  
  public final int b;
  
  static {
    ofEpochSecond(-31557014167219200L, 0L);
    ofEpochSecond(31556889864403199L, 999999999L);
  }
  
  public Instant(long paramLong, int paramInt) {
    this.a = paramLong;
    this.b = paramInt;
  }
  
  public static Instant ofEpochSecond(long paramLong1, long paramLong2) {
    return r(Math.addExact(paramLong1, Math.floorDiv(paramLong2, 1000000000L)), (int)Math.floorMod(paramLong2, 1000000000L));
  }
  
  public static Instant r(long paramLong, int paramInt) {
    if ((paramInt | paramLong) == 0L)
      return c; 
    if (paramLong >= -31557014167219200L && paramLong <= 31556889864403199L)
      return new Instant(paramLong, paramInt); 
    throw new RuntimeException("Instant exceeds minimum or maximum instant");
  }
  
  private void readObject(ObjectInputStream paramObjectInputStream) {
    throw new InvalidObjectException("Deserialization via serialization delegate");
  }
  
  private Object writeReplace() {
    return new m((byte)2, this);
  }
  
  public final m a(long paramLong, s params) {
    if (paramLong == Long.MIN_VALUE) {
      Instant instant1 = z(Long.MAX_VALUE, params);
      paramLong = 1L;
      return instant1.z(paramLong, params);
    } 
    paramLong = -paramLong;
    Instant instant = this;
    return instant.z(paramLong, params);
  }
  
  public final Object b(b paramb) {
    return (paramb == r.c) ? b.NANOS : ((paramb == r.b || paramb == r.a || paramb == r.e || paramb == r.d || paramb == r.f || paramb == r.g) ? null : paramb.a((n)this));
  }
  
  public final m c(m paramm) {
    a a = a.INSTANT_SECONDS;
    paramm = paramm.h(this.a, (q)a);
    a = a.NANO_OF_SECOND;
    return paramm.h(this.b, (q)a);
  }
  
  public final int compareTo(Object paramObject) {
    paramObject = paramObject;
    int i = Long.compare(this.a, ((Instant)paramObject).a);
    return (i != 0) ? i : (this.b - ((Instant)paramObject).b);
  }
  
  public final int e(q paramq) {
    if (paramq instanceof a) {
      int i = d.a[((a)paramq).ordinal()];
      if (i != 1) {
        if (i != 2) {
          if (i != 3) {
            if (i == 4) {
              a a = a.INSTANT_SECONDS;
              long l = this.a;
              a.b.a(l, (q)a);
            } 
            throw new RuntimeException(b.a("Unsupported field: ", paramq));
          } 
          return this.b / 1000000;
        } 
        return this.b / 1000;
      } 
      return this.b;
    } 
    return j(paramq).a(paramq.E((n)this), paramq);
  }
  
  public final boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject instanceof Instant) {
      paramObject = paramObject;
      if (this.a == ((Instant)paramObject).a && this.b == ((Instant)paramObject).b)
        return true; 
    } 
    return false;
  }
  
  public final boolean f(q paramq) {
    return ((paramq instanceof a) ? (paramq == a.INSTANT_SECONDS || paramq == a.NANO_OF_SECOND || paramq == a.MICRO_OF_SECOND || paramq == a.MILLI_OF_SECOND) : (paramq != null && paramq.r((n)this)));
  }
  
  public final long g(q paramq) {
    if (paramq instanceof a) {
      int i = d.a[((a)paramq).ordinal()];
      if (i != 1) {
        if (i != 2) {
          if (i != 3) {
            if (i == 4)
              return this.a; 
            throw new RuntimeException(b.a("Unsupported field: ", paramq));
          } 
          i = this.b / 1000000;
          return i;
        } 
        i = this.b / 1000;
        return i;
      } 
      i = this.b;
      return i;
    } 
    return paramq.E((n)this);
  }
  
  public long getEpochSecond() {
    return this.a;
  }
  
  public int getNano() {
    return this.b;
  }
  
  public final m h(long paramLong, q paramq) {
    Instant instant;
    if (paramq instanceof a) {
      a a = (a)paramq;
      a.I(paramLong);
      int i = d.a[a.ordinal()];
      if (i != 1) {
        if (i != 2) {
          if (i != 3) {
            if (i == 4) {
              instant = this;
              if (paramLong != this.a)
                return r(paramLong, this.b); 
            } else {
              throw new RuntimeException(b.a("Unsupported field: ", instant));
            } 
          } else {
            i = (int)paramLong * 1000000;
            instant = this;
            if (i != this.b)
              return r(this.a, i); 
          } 
        } else {
          i = (int)paramLong * 1000;
          instant = this;
          if (i != this.b)
            return r(this.a, i); 
        } 
      } else {
        instant = this;
        if (paramLong != this.b)
          instant = r(this.a, (int)paramLong); 
      } 
      return instant;
    } 
    return instant.G(this, paramLong);
  }
  
  public final int hashCode() {
    long l = this.a;
    int i = (int)(l ^ l >>> 32L);
    return this.b * 51 + i;
  }
  
  public final m i(LocalDate paramLocalDate) {
    return paramLocalDate.c(this);
  }
  
  public final Instant t(long paramLong1, long paramLong2) {
    return ((paramLong1 | paramLong2) == 0L) ? this : ofEpochSecond(Math.addExact(Math.addExact(this.a, paramLong1), paramLong2 / 1000000000L), this.b + paramLong2 % 1000000000L);
  }
  
  public final String toString() {
    a a = a.e;
    StringBuilder stringBuilder = new StringBuilder(32);
    f f = a.a;
    try {
      q q = new q();
      this(this, a);
      f.r(q, stringBuilder);
      return stringBuilder.toString();
    } catch (IOException iOException) {
      throw new RuntimeException(iOException.getMessage(), iOException);
    } 
  }
  
  public final Instant z(long paramLong, s params) {
    if (params instanceof b) {
      switch (d.b[((b)params).ordinal()]) {
        default:
          f.c("Unsupported unit: ", params);
          return null;
        case 8:
          return t(Math.multiplyExact(paramLong, 86400L), 0L);
        case 7:
          return t(Math.multiplyExact(paramLong, 43200L), 0L);
        case 6:
          return t(Math.multiplyExact(paramLong, 3600L), 0L);
        case 5:
          return t(Math.multiplyExact(paramLong, 60L), 0L);
        case 4:
          return t(paramLong, 0L);
        case 3:
          return t(paramLong / 1000L, paramLong % 1000L * 1000000L);
        case 2:
          return t(paramLong / 1000000L, paramLong % 1000000L * 1000L);
        case 1:
          break;
      } 
      return t(0L, paramLong);
    } 
    return (Instant)params.r(this, paramLong);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\j$\time\Instant.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
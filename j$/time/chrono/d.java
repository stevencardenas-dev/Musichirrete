package j$.time.chrono;

import j$.time.LocalDate;
import j$.time.b;
import j$.time.f;
import j$.time.temporal.a;
import j$.time.temporal.b;
import j$.time.temporal.m;
import j$.time.temporal.o;
import j$.time.temporal.q;
import j$.time.temporal.s;
import java.io.Serializable;

public abstract class d implements b, m, o, Serializable {
  private static final long serialVersionUID = 6282433883239719096L;
  
  public static b r(m paramm, m paramm1) {
    paramm1 = paramm1;
    if (paramm.equals(paramm1.d()))
      return (b)paramm1; 
    f.d("Chronology mismatch, expected: ", paramm.getId(), paramm1.d().getId());
    return null;
  }
  
  public abstract b E(long paramLong);
  
  public b G(o paramo) {
    return r(d(), paramo.c(this));
  }
  
  public boolean equals(Object paramObject) {
    return (this == paramObject) ? true : ((paramObject instanceof b && F((b)paramObject) == 0));
  }
  
  public b h(long paramLong, q paramq) {
    if (!(paramq instanceof a))
      return r(d(), paramq.G(this, paramLong)); 
    throw new RuntimeException(b.a("Unsupported field: ", paramq));
  }
  
  public int hashCode() {
    long l = A();
    return d().hashCode() ^ (int)(l ^ l >>> 32L);
  }
  
  public b k(long paramLong, s params) {
    a a;
    boolean bool = params instanceof b;
    if (bool) {
      b b1 = (b)params;
      switch (c.a[b1.ordinal()]) {
        default:
          f.c("Unsupported unit: ", params);
          return null;
        case 8:
          a = a.ERA;
          return h(Math.addExact(g((q)a), paramLong), (q)a);
        case 7:
          return E(Math.multiplyExact(paramLong, 1000L));
        case 6:
          return E(Math.multiplyExact(paramLong, 100L));
        case 5:
          return E(Math.multiplyExact(paramLong, 10L));
        case 4:
          return E(paramLong);
        case 3:
          return z(paramLong);
        case 2:
          return t(Math.multiplyExact(paramLong, 7L));
        case 1:
          break;
      } 
      return t(paramLong);
    } 
    if (!bool)
      return r(d(), a.r(this, paramLong)); 
    f.c("Unsupported unit: ", a);
    return null;
  }
  
  public abstract b t(long paramLong);
  
  public final String toString() {
    long l1 = g((q)a.YEAR_OF_ERA);
    long l2 = g((q)a.MONTH_OF_YEAR);
    long l3 = g((q)a.DAY_OF_MONTH);
    StringBuilder stringBuilder = new StringBuilder(30);
    stringBuilder.append(d().toString());
    stringBuilder.append(" ");
    stringBuilder.append(C());
    stringBuilder.append(" ");
    stringBuilder.append(l1);
    String str2 = "-";
    if (l2 < 10L) {
      str1 = "-0";
    } else {
      str1 = "-";
    } 
    stringBuilder.append(str1);
    stringBuilder.append(l2);
    String str1 = str2;
    if (l3 < 10L)
      str1 = "-0"; 
    stringBuilder.append(str1);
    stringBuilder.append(l3);
    return stringBuilder.toString();
  }
  
  public abstract b z(long paramLong);
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\j$\time\chrono\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
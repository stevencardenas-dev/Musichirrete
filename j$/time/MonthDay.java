package j$.time;

import j$.time.chrono.m;
import j$.time.chrono.t;
import j$.time.format.b;
import j$.time.format.o;
import j$.time.format.u;
import j$.time.temporal.a;
import j$.time.temporal.m;
import j$.time.temporal.n;
import j$.time.temporal.o;
import j$.time.temporal.q;
import j$.time.temporal.r;
import j$.time.temporal.u;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Locale;
import java.util.Objects;

public final class MonthDay implements n, o, Comparable<MonthDay>, Serializable {
  public static final int c = 0;
  
  private static final long serialVersionUID = -939150713474957432L;
  
  public final int a;
  
  public final int b;
  
  static {
    o o1 = new o();
    o1.d("--");
    o1.g((q)a.MONTH_OF_YEAR, 2);
    o1.c('-');
    o1.g((q)a.DAY_OF_MONTH, 2);
    o1.l(Locale.getDefault(), u.SMART, null);
  }
  
  public MonthDay(int paramInt1, int paramInt2) {
    this.a = paramInt1;
    this.b = paramInt2;
  }
  
  public static MonthDay of(int paramInt1, int paramInt2) {
    j j = j.E(paramInt1);
    Objects.requireNonNull(j, "month");
    a.DAY_OF_MONTH.I(paramInt2);
    if (paramInt2 <= j.z())
      return new MonthDay(j.getValue(), paramInt2); 
    String str = j.name();
    StringBuilder stringBuilder = new StringBuilder("Illegal value for DayOfMonth field, value ");
    stringBuilder.append(paramInt2);
    stringBuilder.append(" is not valid for month ");
    stringBuilder.append(str);
    throw new RuntimeException(stringBuilder.toString());
  }
  
  private void readObject(ObjectInputStream paramObjectInputStream) {
    throw new InvalidObjectException("Deserialization via serialization delegate");
  }
  
  private Object writeReplace() {
    return new m((byte)13, this);
  }
  
  public final Object b(b paramb) {
    return (paramb == r.b) ? t.c : super.b(paramb);
  }
  
  public final m c(m paramm) {
    if (m.m((n)paramm).equals(t.c)) {
      a a2 = a.MONTH_OF_YEAR;
      m m1 = paramm.h(this.a, (q)a2);
      a a1 = a.DAY_OF_MONTH;
      return m1.h(Math.min((m1.j((q)a1)).d, this.b), (q)a1);
    } 
    throw new RuntimeException("Adjustment only supported on ISO date-time");
  }
  
  public final int compareTo(Object paramObject) {
    paramObject = paramObject;
    int i = this.a - ((MonthDay)paramObject).a;
    return (i == 0) ? (this.b - ((MonthDay)paramObject).b) : i;
  }
  
  public final int e(q paramq) {
    return j(paramq).a(g(paramq), paramq);
  }
  
  public final boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject instanceof MonthDay) {
      paramObject = paramObject;
      if (this.a == ((MonthDay)paramObject).a && this.b == ((MonthDay)paramObject).b)
        return true; 
    } 
    return false;
  }
  
  public final boolean f(q paramq) {
    return ((paramq instanceof a) ? (paramq == a.MONTH_OF_YEAR || paramq == a.DAY_OF_MONTH) : (paramq != null && paramq.r(this)));
  }
  
  public final long g(q paramq) {
    if (paramq instanceof a) {
      int i = k.a[((a)paramq).ordinal()];
      if (i != 1) {
        if (i == 2) {
          i = this.a;
          return i;
        } 
        throw new RuntimeException(b.a("Unsupported field: ", paramq));
      } 
      i = this.b;
      return i;
    } 
    return paramq.E(this);
  }
  
  public int getDayOfMonth() {
    return this.b;
  }
  
  public int getMonthValue() {
    return this.a;
  }
  
  public final int hashCode() {
    return (this.a << 6) + this.b;
  }
  
  public final u j(q paramq) {
    j j;
    if (paramq == a.MONTH_OF_YEAR)
      return paramq.z(); 
    if (paramq == a.DAY_OF_MONTH) {
      j = j.E(this.a);
      j.getClass();
      int i = i.a[j.ordinal()];
      if (i != 1) {
        if (i != 2 && i != 3 && i != 4 && i != 5) {
          i = 31;
        } else {
          i = 30;
        } 
      } else {
        i = 28;
      } 
      return u.f(i, j.E(this.a).z());
    } 
    return super.j((q)j);
  }
  
  public final String toString() {
    String str;
    StringBuilder stringBuilder = new StringBuilder(10);
    stringBuilder.append("--");
    if (this.a < 10) {
      str = "0";
    } else {
      str = "";
    } 
    stringBuilder.append(str);
    stringBuilder.append(this.a);
    if (this.b < 10) {
      str = "-0";
    } else {
      str = "-";
    } 
    stringBuilder.append(str);
    stringBuilder.append(this.b);
    return stringBuilder.toString();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\j$\time\MonthDay.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
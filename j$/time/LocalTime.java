package j$.time;

import j$.time.format.b;
import j$.time.temporal.a;
import j$.time.temporal.b;
import j$.time.temporal.m;
import j$.time.temporal.n;
import j$.time.temporal.o;
import j$.time.temporal.q;
import j$.time.temporal.r;
import j$.time.temporal.s;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Objects;

public final class LocalTime implements m, o, Comparable<LocalTime>, Serializable {
  public static final LocalTime e;
  
  public static final LocalTime f;
  
  public static final LocalTime g;
  
  public static final LocalTime[] h = new LocalTime[24];
  
  private static final long serialVersionUID = 6414437269572265201L;
  
  public final byte a;
  
  public final byte b;
  
  public final byte c;
  
  public final int d;
  
  static {
    byte b = 0;
    while (true) {
      LocalTime[] arrayOfLocalTime = h;
      if (b < arrayOfLocalTime.length) {
        arrayOfLocalTime[b] = new LocalTime(b, 0, 0, 0);
        b++;
        continue;
      } 
      LocalTime localTime1 = arrayOfLocalTime[0];
      g = localTime1;
      LocalTime localTime2 = arrayOfLocalTime[12];
      e = localTime1;
      f = new LocalTime(23, 59, 59, 999999999);
      return;
    } 
  }
  
  public LocalTime(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    this.a = (byte)paramInt1;
    this.b = (byte)paramInt2;
    this.c = (byte)paramInt3;
    this.d = paramInt4;
  }
  
  public static LocalTime G(long paramLong) {
    a.NANO_OF_DAY.I(paramLong);
    int i = (int)(paramLong / 3600000000000L);
    paramLong -= i * 3600000000000L;
    int k = (int)(paramLong / 60000000000L);
    paramLong -= k * 60000000000L;
    int j = (int)(paramLong / 1000000000L);
    return t(i, k, j, (int)(paramLong - j * 1000000000L));
  }
  
  public static LocalTime N(DataInput paramDataInput) {
    int j;
    int k;
    int n = paramDataInput.readByte();
    int i = 0;
    if (n < 0) {
      n = n ^ 0xFFFFFFFF;
      k = 0;
      j = 0;
    } else {
      i = paramDataInput.readByte();
      if (i < 0) {
        j = 0;
        i ^= 0xFFFFFFFF;
        k = 0;
      } else {
        k = paramDataInput.readByte();
        if (k < 0) {
          k = k ^ 0xFFFFFFFF;
          j = 0;
        } else {
          j = paramDataInput.readInt();
        } 
      } 
    } 
    return of(n, i, k, j);
  }
  
  public static LocalTime of(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    a.HOUR_OF_DAY.I(paramInt1);
    a.MINUTE_OF_HOUR.I(paramInt2);
    a.SECOND_OF_MINUTE.I(paramInt3);
    a.NANO_OF_SECOND.I(paramInt4);
    return t(paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  private void readObject(ObjectInputStream paramObjectInputStream) {
    throw new InvalidObjectException("Deserialization via serialization delegate");
  }
  
  public static LocalTime t(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    return ((paramInt2 | paramInt3 | paramInt4) == 0) ? h[paramInt1] : new LocalTime(paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  private Object writeReplace() {
    return new m((byte)4, this);
  }
  
  public static LocalTime z(n paramn) {
    Objects.requireNonNull(paramn, "temporal");
    LocalTime localTime = (LocalTime)paramn.b(r.g);
    if (localTime != null)
      return localTime; 
    String str = paramn.getClass().getName();
    StringBuilder stringBuilder = new StringBuilder("Unable to obtain LocalTime from TemporalAccessor: ");
    stringBuilder.append(paramn);
    stringBuilder.append(" of type ");
    stringBuilder.append(str);
    throw new RuntimeException(stringBuilder.toString());
  }
  
  public final int E(q paramq) {
    int i;
    byte b;
    switch (h.a[((a)paramq).ordinal()]) {
      default:
        throw new RuntimeException(b.a("Unsupported field: ", paramq));
      case 15:
        return this.a / 12;
      case 14:
        b = this.a;
        i = b;
        if (b == 0)
          i = 24; 
        return i;
      case 13:
        return this.a;
      case 12:
        i = this.a % 12;
        return (i % 12 == 0) ? 12 : i;
      case 11:
        return this.a % 12;
      case 10:
        return this.a * 60 + this.b;
      case 9:
        return this.b;
      case 8:
        return P();
      case 7:
        return this.c;
      case 6:
        return (int)(O() / 1000000L);
      case 5:
        return this.d / 1000000;
      case 4:
        throw new RuntimeException("Invalid field 'MicroOfDay' for get() method, use getLong() instead");
      case 3:
        return this.d / 1000;
      case 2:
        throw new RuntimeException("Invalid field 'NanoOfDay' for get() method, use getLong() instead");
      case 1:
        break;
    } 
    return this.d;
  }
  
  public final LocalTime I(long paramLong, s params) {
    if (params instanceof b) {
      switch (h.b[((b)params).ordinal()]) {
        default:
          f.c("Unsupported unit: ", params);
          return null;
        case 7:
          return J(paramLong % 2L * 12L);
        case 6:
          return J(paramLong);
        case 5:
          return K(paramLong);
        case 4:
          return M(paramLong);
        case 3:
          return L(paramLong % 86400000L * 1000000L);
        case 2:
          return L(paramLong % 86400000000L * 1000L);
        case 1:
          break;
      } 
      return L(paramLong);
    } 
    return (LocalTime)params.r(this, paramLong);
  }
  
  public final LocalTime J(long paramLong) {
    return (paramLong == 0L) ? this : t(((int)(paramLong % 24L) + this.a + 24) % 24, this.b, this.c, this.d);
  }
  
  public final LocalTime K(long paramLong) {
    if (paramLong != 0L) {
      int j = this.a * 60 + this.b;
      int i = ((int)(paramLong % 1440L) + j + 1440) % 1440;
      if (j != i)
        return t(i / 60, i % 60, this.c, this.d); 
    } 
    return this;
  }
  
  public final LocalTime L(long paramLong) {
    if (paramLong != 0L) {
      long l = O();
      paramLong = (paramLong % 86400000000000L + l + 86400000000000L) % 86400000000000L;
      if (l != paramLong)
        return t((int)(paramLong / 3600000000000L), (int)(paramLong / 60000000000L % 60L), (int)(paramLong / 1000000000L % 60L), (int)(paramLong % 1000000000L)); 
    } 
    return this;
  }
  
  public final LocalTime M(long paramLong) {
    if (paramLong != 0L) {
      byte b = this.a;
      int j = this.b * 60 + b * 3600 + this.c;
      int i = ((int)(paramLong % 86400L) + j + 86400) % 86400;
      if (j != i)
        return t(i / 3600, i / 60 % 60, i % 60, this.d); 
    } 
    return this;
  }
  
  public final long O() {
    long l1 = this.a;
    long l2 = this.b;
    return this.c * 1000000000L + l2 * 60000000000L + l1 * 3600000000000L + this.d;
  }
  
  public final int P() {
    byte b = this.a;
    return this.b * 60 + b * 3600 + this.c;
  }
  
  public final LocalTime Q(long paramLong, q paramq) {
    if (paramq instanceof a) {
      int i;
      long l;
      a a = (a)paramq;
      a.I(paramLong);
      switch (h.a[a.ordinal()]) {
        default:
          throw new RuntimeException(b.a("Unsupported field: ", paramq));
        case 15:
          return J((paramLong - (this.a / 12)) * 12L);
        case 14:
          l = paramLong;
          if (paramLong == 24L)
            l = 0L; 
          i = (int)l;
          if (this.a != i) {
            a.HOUR_OF_DAY.I(i);
            return t(i, this.b, this.c, this.d);
          } 
          return this;
        case 13:
          i = (int)paramLong;
          if (this.a != i) {
            a.HOUR_OF_DAY.I(i);
            return t(i, this.b, this.c, this.d);
          } 
          return this;
        case 12:
          l = paramLong;
          if (paramLong == 12L)
            l = 0L; 
          return J(l - (this.a % 12));
        case 11:
          return J(paramLong - (this.a % 12));
        case 10:
          return K(paramLong - (this.a * 60 + this.b));
        case 9:
          i = (int)paramLong;
          if (this.b != i) {
            a.MINUTE_OF_HOUR.I(i);
            return t(this.a, i, this.c, this.d);
          } 
          return this;
        case 8:
          return M(paramLong - P());
        case 7:
          i = (int)paramLong;
          if (this.c != i) {
            a.SECOND_OF_MINUTE.I(i);
            return t(this.a, this.b, i, this.d);
          } 
          return this;
        case 6:
          return G(paramLong * 1000000L);
        case 5:
          return R((int)paramLong * 1000000);
        case 4:
          return G(paramLong * 1000L);
        case 3:
          return R((int)paramLong * 1000);
        case 2:
          return G(paramLong);
        case 1:
          break;
      } 
      return R((int)paramLong);
    } 
    return (LocalTime)paramq.G(this, paramLong);
  }
  
  public final LocalTime R(int paramInt) {
    if (this.d == paramInt)
      return this; 
    a.NANO_OF_SECOND.I(paramInt);
    return t(this.a, this.b, this.c, paramInt);
  }
  
  public final void S(DataOutput paramDataOutput) {
    if (this.d == 0) {
      if (this.c == 0) {
        byte b2 = this.b;
        byte b1 = this.a;
        if (b2 == 0) {
          paramDataOutput.writeByte(b1 ^ 0xFFFFFFFF);
          return;
        } 
        paramDataOutput.writeByte(b1);
        paramDataOutput.writeByte(this.b ^ 0xFFFFFFFF);
        return;
      } 
      paramDataOutput.writeByte(this.a);
      paramDataOutput.writeByte(this.b);
      paramDataOutput.writeByte(this.c ^ 0xFFFFFFFF);
      return;
    } 
    paramDataOutput.writeByte(this.a);
    paramDataOutput.writeByte(this.b);
    paramDataOutput.writeByte(this.c);
    paramDataOutput.writeInt(this.d);
  }
  
  public final m a(long paramLong, s params) {
    if (paramLong == Long.MIN_VALUE) {
      LocalTime localTime1 = I(Long.MAX_VALUE, params);
      paramLong = 1L;
      return localTime1.I(paramLong, params);
    } 
    paramLong = -paramLong;
    LocalTime localTime = this;
    return localTime.I(paramLong, params);
  }
  
  public final Object b(b paramb) {
    if (paramb != r.b && paramb != r.a && paramb != r.e && paramb != r.d) {
      if (paramb == r.g)
        return this; 
      if (paramb != r.f)
        return (paramb == r.c) ? b.NANOS : paramb.a((n)this); 
    } 
    return null;
  }
  
  public final m c(m paramm) {
    a a = a.NANO_OF_DAY;
    return paramm.h(O(), (q)a);
  }
  
  public final int e(q paramq) {
    return (paramq instanceof a) ? E(paramq) : super.e(paramq);
  }
  
  public final boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject instanceof LocalTime) {
      paramObject = paramObject;
      if (this.a == ((LocalTime)paramObject).a && this.b == ((LocalTime)paramObject).b && this.c == ((LocalTime)paramObject).c && this.d == ((LocalTime)paramObject).d)
        return true; 
    } 
    return false;
  }
  
  public final boolean f(q paramq) {
    return (paramq instanceof a) ? ((a)paramq).J() : ((paramq != null && paramq.r((n)this)));
  }
  
  public final long g(q paramq) {
    return (paramq instanceof a) ? ((paramq == a.NANO_OF_DAY) ? O() : ((paramq == a.MICRO_OF_DAY) ? (O() / 1000L) : E(paramq))) : paramq.E((n)this);
  }
  
  public int getHour() {
    return this.a;
  }
  
  public int getMinute() {
    return this.b;
  }
  
  public int getNano() {
    return this.d;
  }
  
  public int getSecond() {
    return this.c;
  }
  
  public final int hashCode() {
    long l = O();
    return (int)(l ^ l >>> 32L);
  }
  
  public final m i(LocalDate paramLocalDate) {
    return paramLocalDate.c(this);
  }
  
  public final int r(LocalTime paramLocalTime) {
    int j = Integer.compare(this.a, paramLocalTime.a);
    int i = j;
    if (j == 0) {
      j = Integer.compare(this.b, paramLocalTime.b);
      i = j;
      if (j == 0) {
        j = Integer.compare(this.c, paramLocalTime.c);
        i = j;
        if (j == 0)
          return Integer.compare(this.d, paramLocalTime.d); 
      } 
    } 
    return i;
  }
  
  public final String toString() {
    String str1;
    StringBuilder stringBuilder = new StringBuilder(18);
    byte b2 = this.a;
    byte b3 = this.b;
    byte b1 = this.c;
    int i = this.d;
    if (b2 < 10) {
      str1 = "0";
    } else {
      str1 = "";
    } 
    stringBuilder.append(str1);
    stringBuilder.append(b2);
    String str2 = ":";
    if (b3 < 10) {
      str1 = ":0";
    } else {
      str1 = ":";
    } 
    stringBuilder.append(str1);
    stringBuilder.append(b3);
    if (b1 > 0 || i > 0) {
      str1 = str2;
      if (b1 < 10)
        str1 = ":0"; 
      stringBuilder.append(str1);
      stringBuilder.append(b1);
      if (i > 0) {
        stringBuilder.append('.');
        if (i % 1000000 == 0) {
          stringBuilder.append(Integer.toString(i / 1000000 + 1000).substring(1));
        } else if (i % 1000 == 0) {
          stringBuilder.append(Integer.toString(i / 1000 + 1000000).substring(1));
        } else {
          stringBuilder.append(Integer.toString(i + 1000000000).substring(1));
        } 
      } 
    } 
    return stringBuilder.toString();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\j$\time\LocalTime.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
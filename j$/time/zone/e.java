package j$.time.zone;

import j$.time.LocalTime;
import j$.time.ZoneOffset;
import j$.time.c;
import j$.time.j;
import j$.time.temporal.a;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Objects;

public final class e implements Serializable {
  private static final long serialVersionUID = 6889046316657758795L;
  
  public final j a;
  
  public final byte b;
  
  public final c c;
  
  public final LocalTime d;
  
  public final boolean e;
  
  public final d f;
  
  public final ZoneOffset g;
  
  public final ZoneOffset h;
  
  public final ZoneOffset i;
  
  public e(j paramj, int paramInt, c paramc, LocalTime paramLocalTime, boolean paramBoolean, d paramd, ZoneOffset paramZoneOffset1, ZoneOffset paramZoneOffset2, ZoneOffset paramZoneOffset3) {
    this.a = paramj;
    this.b = (byte)paramInt;
    this.c = paramc;
    this.d = paramLocalTime;
    this.e = paramBoolean;
    this.f = paramd;
    this.g = paramZoneOffset1;
    this.h = paramZoneOffset2;
    this.i = paramZoneOffset3;
  }
  
  public static e a(DataInput paramDataInput) {
    c c1;
    LocalTime localTime;
    int n = paramDataInput.readInt();
    j j1 = j.E(n >>> 28);
    int k = ((0xFC00000 & n) >>> 22) - 32;
    int i = (0x380000 & n) >>> 19;
    if (i == 0) {
      c1 = null;
    } else {
      c1 = c.r(i);
    } 
    int m = (0x7C000 & n) >>> 14;
    d d1 = d.values()[(n & 0x3000) >>> 12];
    i = (n & 0xFF0) >>> 4;
    int i1 = (n & 0xC) >>> 2;
    n &= 0x3;
    boolean bool = false;
    if (m == 31) {
      long l = paramDataInput.readInt();
      localTime = LocalTime.e;
      a.SECOND_OF_DAY.I(l);
      int i3 = (int)(l / 3600L);
      l -= (i3 * 3600);
      int i2 = (int)(l / 60L);
      localTime = LocalTime.t(i3, i2, (int)(l - (i2 * 60)), 0);
    } else {
      int i2 = m % 24;
      localTime = LocalTime.e;
      a.HOUR_OF_DAY.I(i2);
      localTime = LocalTime.h[i2];
    } 
    if (i == 255) {
      i = paramDataInput.readInt();
    } else {
      i = (i - 128) * 900;
    } 
    ZoneOffset zoneOffset2 = ZoneOffset.ofTotalSeconds(i);
    if (i1 == 3) {
      i = paramDataInput.readInt();
    } else {
      i = i1 * 1800 + zoneOffset2.getTotalSeconds();
    } 
    ZoneOffset zoneOffset3 = ZoneOffset.ofTotalSeconds(i);
    if (n == 3) {
      i = paramDataInput.readInt();
    } else {
      i = n * 1800 + zoneOffset2.getTotalSeconds();
    } 
    ZoneOffset zoneOffset1 = ZoneOffset.ofTotalSeconds(i);
    if (m == 24)
      bool = true; 
    Objects.requireNonNull(j1, "month");
    Objects.requireNonNull(localTime, "time");
    Objects.requireNonNull(d1, "timeDefnition");
    Objects.requireNonNull(zoneOffset2, "standardOffset");
    Objects.requireNonNull(zoneOffset3, "offsetBefore");
    Objects.requireNonNull(zoneOffset1, "offsetAfter");
    if (k >= -28 && k <= 31 && k != 0) {
      if (!bool || localTime.equals(LocalTime.g)) {
        if (localTime.getNano() == 0)
          return new e(j1, k, c1, localTime, bool, d1, zoneOffset2, zoneOffset3, zoneOffset1); 
        throw new IllegalArgumentException("Time's nano-of-second must be zero");
      } 
      throw new IllegalArgumentException("Time must be midnight when end of day flag is true");
    } 
    throw new IllegalArgumentException("Day of month indicator must be between -28 and 31 inclusive excluding zero");
  }
  
  private void readObject(ObjectInputStream paramObjectInputStream) {
    throw new InvalidObjectException("Deserialization via serialization delegate");
  }
  
  private Object writeReplace() {
    return new a((byte)3, this);
  }
  
  public final void b(DataOutput paramDataOutput) {
    byte b;
    int i;
    char c1;
    int n;
    if (this.e) {
      i = 86400;
    } else {
      i = this.d.P();
    } 
    int i1 = this.g.getTotalSeconds();
    int k = this.h.getTotalSeconds() - i1;
    int m = this.i.getTotalSeconds() - i1;
    if (i % 3600 == 0) {
      if (this.e) {
        b = 24;
      } else {
        b = this.d.getHour();
      } 
    } else {
      b = 31;
    } 
    if (i1 % 900 == 0) {
      c1 = i1 / 900 + 128;
    } else {
      c1 = 'ÿ';
    } 
    if (k == 0 || k == 1800 || k == 3600) {
      k /= 1800;
    } else {
      k = 3;
    } 
    if (m == 0 || m == 1800 || m == 3600) {
      m /= 1800;
    } else {
      m = 3;
    } 
    c c2 = this.c;
    if (c2 == null) {
      n = 0;
    } else {
      n = c2.getValue();
    } 
    paramDataOutput.writeInt((this.a.getValue() << 28) + (this.b + 32 << 22) + (n << 19) + (b << 14) + (this.f.ordinal() << 12) + (c1 << 4) + (k << 2) + m);
    if (b == 31)
      paramDataOutput.writeInt(i); 
    if (c1 == 'ÿ')
      paramDataOutput.writeInt(i1); 
    if (k == 3)
      paramDataOutput.writeInt(this.h.getTotalSeconds()); 
    if (m == 3)
      paramDataOutput.writeInt(this.i.getTotalSeconds()); 
  }
  
  public final boolean equals(Object paramObject) {
    if (paramObject == this)
      return true; 
    if (paramObject instanceof e) {
      paramObject = paramObject;
      if (this.a == ((e)paramObject).a && this.b == ((e)paramObject).b && this.c == ((e)paramObject).c && this.f == ((e)paramObject).f && this.d.equals(((e)paramObject).d) && this.e == ((e)paramObject).e && this.g.equals(((e)paramObject).g) && this.h.equals(((e)paramObject).h) && this.i.equals(((e)paramObject).i))
        return true; 
    } 
    return false;
  }
  
  public final int hashCode() {
    int i;
    int k = this.d.P();
    boolean bool = this.e;
    int m = this.a.ordinal();
    byte b = this.b;
    c c1 = this.c;
    if (c1 == null) {
      i = 7;
    } else {
      i = c1.ordinal();
    } 
    int i1 = this.f.ordinal();
    int n = this.g.a;
    int i2 = this.h.a;
    return this.i.a ^ n ^ i1 + (k + bool << 15) + (m << 11) + (b + 32 << 5) + (i << 2) ^ i2;
  }
  
  public final String toString() {
    String str2;
    String str1;
    StringBuilder stringBuilder = new StringBuilder("TransitionRule[");
    ZoneOffset zoneOffset = this.h;
    if (this.i.a - zoneOffset.a > 0) {
      str2 = "Gap ";
    } else {
      str2 = "Overlap ";
    } 
    stringBuilder.append(str2);
    stringBuilder.append(this.h);
    stringBuilder.append(" to ");
    stringBuilder.append(this.i);
    stringBuilder.append(", ");
    c c1 = this.c;
    if (c1 != null) {
      byte b = this.b;
      if (b == -1) {
        stringBuilder.append(c1.name());
        stringBuilder.append(" on or before last day of ");
        stringBuilder.append(this.a.name());
      } else if (b < 0) {
        stringBuilder.append(c1.name());
        stringBuilder.append(" on or before last day minus ");
        stringBuilder.append(-this.b - 1);
        stringBuilder.append(" of ");
        stringBuilder.append(this.a.name());
      } else {
        stringBuilder.append(c1.name());
        stringBuilder.append(" on or after ");
        stringBuilder.append(this.a.name());
        stringBuilder.append(' ');
        stringBuilder.append(this.b);
      } 
    } else {
      stringBuilder.append(this.a.name());
      stringBuilder.append(' ');
      stringBuilder.append(this.b);
    } 
    stringBuilder.append(" at ");
    if (this.e) {
      str1 = "24:00";
    } else {
      str1 = this.d.toString();
    } 
    stringBuilder.append(str1);
    stringBuilder.append(" ");
    stringBuilder.append(this.f);
    stringBuilder.append(", standard offset ");
    stringBuilder.append(this.g);
    stringBuilder.append(']');
    return stringBuilder.toString();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\j$\time\zone\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
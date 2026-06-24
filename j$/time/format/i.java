package j$.time.format;

import j$.time.LocalDateTime;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.temporal.a;
import j$.time.temporal.n;
import j$.time.temporal.q;

public final class i implements g {
  public final int a;
  
  public final boolean r(q paramq, StringBuilder paramStringBuilder) {
    StringBuilder stringBuilder;
    n n2;
    b b1;
    Object object;
    int j = this.a;
    boolean bool2 = true;
    boolean bool1 = true;
    byte b = 0;
    switch (j) {
      default:
        b1 = o.f;
        n2 = paramq.a;
        object = n2.b(b1);
        if (object != null || paramq.c != 0) {
          ZoneId zoneId = (ZoneId)object;
          if (zoneId == null) {
            bool1 = false;
          } else {
            paramStringBuilder.append(zoneId.getId());
          } 
          return bool1;
        } 
        stringBuilder = new StringBuilder("Unable to extract ");
        stringBuilder.append(b1);
        stringBuilder.append(" from temporal ");
        stringBuilder.append(n2);
        throw new RuntimeException(stringBuilder.toString());
      case 0:
        break;
    } 
    Long long_ = stringBuilder.a((q)a.INSTANT_SECONDS);
    n n1 = ((q)stringBuilder).a;
    a a = a.NANO_OF_SECOND;
    if (n1.f((q)a)) {
      Long long_1 = Long.valueOf(n1.g((q)a));
    } else {
      n1 = null;
    } 
    if (long_ == null) {
      bool1 = false;
    } else {
      long l1;
      long l2 = long_.longValue();
      if (n1 != null) {
        l1 = n1.longValue();
      } else {
        l1 = 0L;
      } 
      int k = a.b.a(l1, (q)a);
      if (l2 >= -62167219200L) {
        l2 -= 253402300800L;
        l1 = Math.floorDiv(l2, 315569520000L) + 1L;
        LocalDateTime localDateTime = LocalDateTime.E(Math.floorMod(l2, 315569520000L) - 62167219200L, 0, ZoneOffset.e);
        if (l1 > 0L) {
          paramStringBuilder.append('+');
          paramStringBuilder.append(l1);
        } 
        paramStringBuilder.append(localDateTime);
        if (localDateTime.b.getSecond() == 0)
          paramStringBuilder.append(":00"); 
      } else {
        l2 += 62167219200L;
        l1 = l2 / 315569520000L;
        l2 %= 315569520000L;
        LocalDateTime localDateTime = LocalDateTime.E(l2 - 62167219200L, 0, ZoneOffset.e);
        j = paramStringBuilder.length();
        paramStringBuilder.append(localDateTime);
        if (localDateTime.b.getSecond() == 0)
          paramStringBuilder.append(":00"); 
        if (l1 < 0L)
          if (localDateTime.a.getYear() == -10000) {
            paramStringBuilder.replace(j, j + 2, Long.toString(l1 - 1L));
          } else if (l2 == 0L) {
            paramStringBuilder.insert(j, l1);
          } else {
            paramStringBuilder.insert(j + 1, Math.abs(l1));
          }  
      } 
      if (k > 0) {
        paramStringBuilder.append('.');
        j = 100000000;
        while (true) {
          if (k > 0 || b % 3 != 0 || b < -2) {
            int m = k / j;
            paramStringBuilder.append((char)(m + 48));
            k -= m * j;
            j /= 10;
            b++;
            continue;
          } 
          paramStringBuilder.append('Z');
          bool1 = bool2;
        } 
      } 
      paramStringBuilder.append('Z');
      bool1 = bool2;
    } 
    return bool1;
  }
  
  public final String toString() {
    switch (this.a) {
      default:
        return "ZoneRegionId()";
      case 0:
        break;
    } 
    return "Instant()";
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\j$\time\format\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
package j$.time.format;

import j$.time.Instant;
import j$.time.ZoneId;
import j$.time.chrono.b;
import j$.time.chrono.m;
import j$.time.temporal.n;
import j$.time.temporal.q;
import j$.time.temporal.r;
import j$.time.temporal.u;

public final class p implements n {
  public final b a;
  
  public final Instant b;
  
  public final m c;
  
  public final ZoneId d;
  
  public p(b paramb, Instant paramInstant, m paramm, ZoneId paramZoneId) {
    this.a = paramb;
    this.b = paramInstant;
    this.c = paramm;
    this.d = paramZoneId;
  }
  
  public final Object b(b paramb) {
    return (paramb == r.b) ? this.c : ((paramb == r.a) ? this.d : ((paramb == r.c) ? this.b.b(paramb) : paramb.a(this)));
  }
  
  public final boolean f(q paramq) {
    b b1 = this.a;
    return (b1 != null && paramq.isDateBased()) ? b1.f(paramq) : this.b.f(paramq);
  }
  
  public final long g(q paramq) {
    b b1 = this.a;
    return (b1 != null && paramq.isDateBased()) ? b1.g(paramq) : this.b.g(paramq);
  }
  
  public final u j(q paramq) {
    b b1 = this.a;
    return (b1 != null && paramq.isDateBased()) ? b1.j(paramq) : this.b.j(paramq);
  }
  
  public final String toString() {
    String str1;
    String str2 = "";
    m m1 = this.c;
    if (m1 != null) {
      StringBuilder stringBuilder1 = new StringBuilder(" with chronology ");
      stringBuilder1.append(m1);
      str1 = stringBuilder1.toString();
    } else {
      str1 = "";
    } 
    ZoneId zoneId = this.d;
    if (zoneId != null) {
      StringBuilder stringBuilder1 = new StringBuilder(" with zone ");
      stringBuilder1.append(zoneId);
      str2 = stringBuilder1.toString();
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(this.b);
    stringBuilder.append(str1);
    stringBuilder.append(str2);
    return stringBuilder.toString();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\j$\time\format\p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
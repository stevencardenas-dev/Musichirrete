package j$.time.format;

import j$.time.chrono.m;
import j$.time.chrono.t;
import j$.time.temporal.q;
import j$.time.temporal.r;
import java.util.Locale;

public final class n implements g {
  public final q a;
  
  public final w b;
  
  public final c c;
  
  public volatile j d;
  
  public n(q paramq, w paramw, c paramc) {
    this.a = paramq;
    this.b = paramw;
    this.c = paramc;
  }
  
  public final boolean r(q paramq, StringBuilder paramStringBuilder) {
    String str;
    w w1;
    Long long_ = paramq.a(this.a);
    if (long_ == null)
      return false; 
    m m = (m)paramq.a.b(r.b);
    if (m == null || m == t.c) {
      c c1 = this.c;
      long l = long_.longValue();
      w1 = this.b;
      Locale locale = paramq.b.b;
      str = c1.a.a(l, w1);
    } else {
      c c1 = this.c;
      long l = w1.longValue();
      w w2 = this.b;
      Locale locale = paramq.b.b;
      str = c1.a.a(l, w2);
    } 
    if (str == null) {
      if (this.d == null)
        this.d = new j(this.a, 1, 19, v.NORMAL); 
      return this.d.r(paramq, paramStringBuilder);
    } 
    paramStringBuilder.append(str);
    return true;
  }
  
  public final String toString() {
    StringBuilder stringBuilder1;
    w w2 = w.FULL;
    w w1 = this.b;
    q q1 = this.a;
    if (w1 == w2) {
      stringBuilder1 = new StringBuilder("Text(");
      stringBuilder1.append(q1);
      stringBuilder1.append(")");
      return stringBuilder1.toString();
    } 
    StringBuilder stringBuilder2 = new StringBuilder("Text(");
    stringBuilder2.append(q1);
    stringBuilder2.append(",");
    stringBuilder2.append(stringBuilder1);
    stringBuilder2.append(")");
    return stringBuilder2.toString();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\j$\time\format\n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
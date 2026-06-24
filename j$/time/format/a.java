package j$.time.format;

import j$.time.chrono.m;
import j$.time.chrono.t;
import j$.time.temporal.a;
import j$.time.temporal.j;
import j$.time.temporal.q;
import j$.time.temporal.u;
import java.util.HashMap;
import java.util.Locale;
import java.util.Objects;

public final class a {
  public static final a e;
  
  public final f a;
  
  public final Locale b;
  
  public final t c;
  
  public final m d;
  
  static {
    o o3;
    o o1 = new o();
    a a3 = a.YEAR;
    v v = v.EXCEEDS_PAD;
    o1.h((q)a3, 4, 10, v);
    o1.c('-');
    a a2 = a.MONTH_OF_YEAR;
    o1.g((q)a2, 2);
    o1.c('-');
    a a1 = a.DAY_OF_MONTH;
    o1.g((q)a1, 2);
    u u = u.STRICT;
    t t1 = t.c;
    a a7 = o1.k(u, (m)t1);
    o o2 = new o();
    l l = l.INSENSITIVE;
    o2.b(l);
    o2.a(a7);
    k k = k.e;
    o2.b(k);
    o2.k(u, (m)t1);
    o2 = new o();
    o2.b(l);
    o2.a(a7);
    o2.j();
    o2.b(k);
    o2.k(u, (m)t1);
    o o4 = new o();
    a a6 = a.HOUR_OF_DAY;
    o4.g((q)a6, 2);
    o4.c(':');
    a a5 = a.MINUTE_OF_HOUR;
    o4.g((q)a5, 2);
    o4.j();
    o4.c(':');
    a a4 = a.SECOND_OF_MINUTE;
    o4.g((q)a4, 2);
    o4.j();
    a a8 = a.NANO_OF_SECOND;
    h h = new h((q)a8, 0, 9, true, 0);
    Objects.requireNonNull(a8, "field");
    u u1 = a8.b;
    if (u1.a == u1.b && u1.c == u1.d) {
      o4.b(h);
      a a10 = o4.k(u, null);
      o o7 = new o();
      o7.b(l);
      o7.a(a10);
      o7.b(k);
      o7.k(u, null);
      o7 = new o();
      o7.b(l);
      o7.a(a10);
      o7.j();
      o7.b(k);
      o7.k(u, null);
      o7 = new o();
      o7.b(l);
      o7.a(a7);
      o7.c('T');
      o7.a(a10);
      a a11 = o7.k(u, (m)t1);
      o4 = new o();
      o4.b(l);
      o4.a(a11);
      l l1 = l.LENIENT;
      o4.b(l1);
      o4.b(k);
      l l2 = l.STRICT;
      o4.b(l2);
      a a12 = o4.k(u, (m)t1);
      o o8 = new o();
      o8.a(a12);
      o8.j();
      o8.c('[');
      l l3 = l.SENSITIVE;
      o8.b(l3);
      o8.b(new i(1));
      o8.c(']');
      o8.k(u, (m)t1);
      o8 = new o();
      o8.a(a11);
      o8.j();
      o8.b(k);
      o8.j();
      o8.c('[');
      o8.b(l3);
      o8.b(new i(1));
      o8.c(']');
      o8.k(u, (m)t1);
      o o6 = new o();
      o6.b(l);
      o6.h((q)a3, 4, 10, v);
      o6.c('-');
      o6.g((q)a.DAY_OF_YEAR, 3);
      o6.j();
      o6.b(k);
      o6.k(u, (m)t1);
      o6 = new o();
      o6.b(l);
      o6.h((q)j.c, 4, 10, v);
      o6.d("-W");
      o6.g((q)j.b, 2);
      o6.c('-');
      a a9 = a.DAY_OF_WEEK;
      o6.g((q)a9, 1);
      o6.j();
      o6.b(k);
      o6.k(u, (m)t1);
      o o5 = new o();
      o5.b(l);
      o5.b(new i(0));
      e = o5.k(u, null);
      o5 = new o();
      o5.b(l);
      o5.g((q)a3, 4);
      o5.g((q)a2, 2);
      o5.g((q)a1, 2);
      o5.j();
      o5.b(l1);
      o5.b(new k("+HHMMss", "Z"));
      o5.b(l2);
      o5.k(u, (m)t1);
      HashMap<Object, Object> hashMap1 = new HashMap<Object, Object>();
      Long long_2 = Long.valueOf(1L);
      hashMap1.put(long_2, "Mon");
      Long long_1 = Long.valueOf(2L);
      hashMap1.put(long_1, "Tue");
      Long long_6 = Long.valueOf(3L);
      hashMap1.put(long_6, "Wed");
      Long long_3 = Long.valueOf(4L);
      hashMap1.put(long_3, "Thu");
      Long long_4 = Long.valueOf(5L);
      hashMap1.put(long_4, "Fri");
      Long long_5 = Long.valueOf(6L);
      hashMap1.put(long_5, "Sat");
      Long long_7 = Long.valueOf(7L);
      hashMap1.put(long_7, "Sun");
      HashMap<Object, Object> hashMap2 = new HashMap<Object, Object>();
      hashMap2.put(long_2, "Jan");
      hashMap2.put(long_1, "Feb");
      hashMap2.put(long_6, "Mar");
      hashMap2.put(long_3, "Apr");
      hashMap2.put(long_4, "May");
      hashMap2.put(long_5, "Jun");
      hashMap2.put(long_7, "Jul");
      hashMap2.put(Long.valueOf(8L), "Aug");
      hashMap2.put(Long.valueOf(9L), "Sep");
      hashMap2.put(Long.valueOf(10L), "Oct");
      hashMap2.put(Long.valueOf(11L), "Nov");
      hashMap2.put(Long.valueOf(12L), "Dec");
      o3 = new o();
      o3.b(l);
      o3.b(l1);
      o3.j();
      o3.e(a9, hashMap1);
      o3.d(", ");
      o3.i();
      o3.h((q)a1, 1, 2, v.NOT_NEGATIVE);
      o3.c(' ');
      o3.e(a2, hashMap2);
      o3.c(' ');
      o3.g((q)a3, 4);
      o3.c(' ');
      o3.g((q)a6, 2);
      o3.c(':');
      o3.g((q)a5, 2);
      o3.j();
      o3.c(':');
      o3.g((q)a4, 2);
      o3.i();
      o3.c(' ');
      o3.b(new k("+HHMM", "GMT"));
      o3.k(u.SMART, (m)t1);
      return;
    } 
    StringBuilder stringBuilder = new StringBuilder("Field must have a fixed set of values: ");
    stringBuilder.append(o3);
    throw new IllegalArgumentException(stringBuilder.toString());
  }
  
  public a(f paramf, Locale paramLocale, u paramu, m paramm) {
    this.a = paramf;
    Objects.requireNonNull(paramLocale, "locale");
    this.b = paramLocale;
    this.c = t1;
    Objects.requireNonNull(paramu, "resolverStyle");
    this.d = paramm;
  }
  
  public final String toString() {
    String str = this.a.toString();
    return str.startsWith("[") ? str : str.substring(1, str.length() - 1);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\j$\time\format\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
package j$.time.format;

import j$.time.chrono.m;
import j$.time.temporal.a;
import j$.time.temporal.h;
import j$.time.temporal.j;
import j$.time.temporal.l;
import j$.time.temporal.q;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;

public final class o {
  public static final b f = new b(0);
  
  public o a = this;
  
  public final o b = null;
  
  public final List c = new ArrayList();
  
  public final boolean d = false;
  
  public int e = -1;
  
  static {
    HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
    hashMap.put(Character.valueOf('G'), a.ERA);
    hashMap.put(Character.valueOf('y'), a.YEAR_OF_ERA);
    hashMap.put(Character.valueOf('u'), a.YEAR);
    h h = j.a;
    hashMap.put(Character.valueOf('Q'), h);
    hashMap.put(Character.valueOf('q'), h);
    a a = a.MONTH_OF_YEAR;
    hashMap.put(Character.valueOf('M'), a);
    hashMap.put(Character.valueOf('L'), a);
    hashMap.put(Character.valueOf('D'), a.DAY_OF_YEAR);
    hashMap.put(Character.valueOf('d'), a.DAY_OF_MONTH);
    hashMap.put(Character.valueOf('F'), a.ALIGNED_DAY_OF_WEEK_IN_MONTH);
    a = a.DAY_OF_WEEK;
    hashMap.put(Character.valueOf('E'), a);
    hashMap.put(Character.valueOf('c'), a);
    hashMap.put(Character.valueOf('e'), a);
    hashMap.put(Character.valueOf('a'), a.AMPM_OF_DAY);
    hashMap.put(Character.valueOf('H'), a.HOUR_OF_DAY);
    hashMap.put(Character.valueOf('k'), a.CLOCK_HOUR_OF_DAY);
    hashMap.put(Character.valueOf('K'), a.HOUR_OF_AMPM);
    hashMap.put(Character.valueOf('h'), a.CLOCK_HOUR_OF_AMPM);
    hashMap.put(Character.valueOf('m'), a.MINUTE_OF_HOUR);
    hashMap.put(Character.valueOf('s'), a.SECOND_OF_MINUTE);
    a = a.NANO_OF_SECOND;
    hashMap.put(Character.valueOf('S'), a);
    hashMap.put(Character.valueOf('A'), a.MILLI_OF_DAY);
    hashMap.put(Character.valueOf('n'), a);
    hashMap.put(Character.valueOf('N'), a.NANO_OF_DAY);
    hashMap.put(Character.valueOf('g'), l.a);
  }
  
  public o() {}
  
  public o(o paramo) {}
  
  public final void a(a parama) {
    f f = parama.a;
    if (f.b)
      f = new f(f.a, false); 
    b(f);
  }
  
  public final int b(g paramg) {
    Objects.requireNonNull(paramg, "pp");
    o o2 = this.a;
    o2.getClass();
    ((ArrayList<g>)o2.c).add(paramg);
    o o1 = this.a;
    o1.e = -1;
    return ((ArrayList)o1.c).size() - 1;
  }
  
  public final void c(char paramChar) {
    b(new e(paramChar));
  }
  
  public final void d(String paramString) {
    if (!paramString.isEmpty()) {
      if (paramString.length() == 1) {
        b(new e(paramString.charAt(0)));
        return;
      } 
      b(new m(paramString));
    } 
  }
  
  public final void e(a parama, Map<?, ?> paramMap) {
    Objects.requireNonNull(parama, "field");
    LinkedHashMap<Object, Object> linkedHashMap = new LinkedHashMap<Object, Object>(paramMap);
    w w = w.FULL;
    b(new n((q)parama, w, new c(new s(Collections.singletonMap(w, linkedHashMap)))));
  }
  
  public final void f(j paramj) {
    j j1;
    o o1 = this.a;
    int i = o1.e;
    if (i >= 0) {
      j1 = ((ArrayList<j>)o1.c).get(i);
      int m = paramj.b;
      int k = paramj.c;
      if (m == k && paramj.d == v.NOT_NEGATIVE) {
        j1 = j1.b(k);
        b(paramj.a());
        this.a.e = i;
        paramj = j1;
      } else {
        j1 = j1.a();
        this.a.e = b(paramj);
        paramj = j1;
      } 
      ((ArrayList<j>)this.a.c).set(i, paramj);
      return;
    } 
    ((o)j1).e = b(paramj);
  }
  
  public final void g(q paramq, int paramInt) {
    Objects.requireNonNull(paramq, "field");
    if (paramInt >= 1 && paramInt <= 19) {
      f(new j(paramq, paramInt, paramInt, v.NOT_NEGATIVE));
      return;
    } 
    StringBuilder stringBuilder = new StringBuilder("The width must be from 1 to 19 inclusive but was ");
    stringBuilder.append(paramInt);
    throw new IllegalArgumentException(stringBuilder.toString());
  }
  
  public final void h(q paramq, int paramInt1, int paramInt2, v paramv) {
    if (paramInt1 == paramInt2 && paramv == v.NOT_NEGATIVE) {
      g(paramq, paramInt2);
      return;
    } 
    Objects.requireNonNull(paramq, "field");
    Objects.requireNonNull(paramv, "signStyle");
    if (paramInt1 >= 1 && paramInt1 <= 19) {
      if (paramInt2 >= 1 && paramInt2 <= 19) {
        if (paramInt2 >= paramInt1) {
          f(new j(paramq, paramInt1, paramInt2, paramv));
          return;
        } 
        StringBuilder stringBuilder2 = new StringBuilder("The maximum width must exceed or equal the minimum width but ");
        stringBuilder2.append(paramInt2);
        stringBuilder2.append(" < ");
        stringBuilder2.append(paramInt1);
        throw new IllegalArgumentException(stringBuilder2.toString());
      } 
      StringBuilder stringBuilder1 = new StringBuilder("The maximum width must be from 1 to 19 inclusive but was ");
      stringBuilder1.append(paramInt2);
      throw new IllegalArgumentException(stringBuilder1.toString());
    } 
    StringBuilder stringBuilder = new StringBuilder("The minimum width must be from 1 to 19 inclusive but was ");
    stringBuilder.append(paramInt1);
    throw new IllegalArgumentException(stringBuilder.toString());
  }
  
  public final void i() {
    o o1 = this.a;
    if (o1.b != null) {
      f f;
      int i = ((ArrayList)o1.c).size();
      o1 = this.a;
      if (i > 0) {
        f = new f(o1.c, o1.d);
        this.a = this.a.b;
        b(f);
        return;
      } 
      this.a = ((o)f).b;
      return;
    } 
    throw new IllegalStateException("Cannot call optionalEnd() as there was no previous call to optionalStart()");
  }
  
  public final void j() {
    o o1 = this.a;
    o1.e = -1;
    this.a = new o(o1);
  }
  
  public final a k(u paramu, m paramm) {
    return l(Locale.getDefault(), paramu, paramm);
  }
  
  public final a l(Locale paramLocale, u paramu, m paramm) {
    Objects.requireNonNull(paramLocale, "locale");
    while (this.a.b != null)
      i(); 
    f f = new f(this.c, false);
    t t = t.a;
    return new a(f, paramLocale, paramu, paramm);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\j$\time\format\o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
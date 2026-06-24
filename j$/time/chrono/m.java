package j$.time.chrono;

import j$.time.LocalDateTime;
import j$.time.LocalTime;
import j$.time.a;
import j$.time.temporal.n;
import j$.time.temporal.r;
import java.util.Arrays;
import java.util.Objects;
import java.util.ServiceLoader;
import java.util.concurrent.ConcurrentHashMap;

public interface m extends Comparable {
  static m m(n paramn) {
    Objects.requireNonNull(paramn, "temporal");
    m m1 = (m)paramn.b(r.b);
    t t = t.c;
    if (m1 != null)
      return m1; 
    Objects.requireNonNull(t, "defaultObj");
    return t;
  }
  
  static m of(String paramString) {
    ConcurrentHashMap concurrentHashMap = a.a;
    Objects.requireNonNull(paramString, "id");
    while (true) {
      ConcurrentHashMap concurrentHashMap1 = a.a;
      m2 = (m)concurrentHashMap1.get(paramString);
      m m1 = m2;
      if (m2 == null)
        m1 = (m)a.b.get(paramString); 
      if (m1 != null)
        return m1; 
      if (concurrentHashMap1.get("ISO") == null) {
        m1 = p.l;
        m1.getClass();
        a.r(m1, "Hijrah-umalqura");
        m1 = w.c;
        m1.getClass();
        a.r(m1, "Japanese");
        m1 = b0.c;
        m1.getClass();
        a.r(m1, "Minguo");
        m1 = h0.c;
        m1.getClass();
        a.r(m1, "ThaiBuddhist");
        try {
          for (m m2 : Arrays.<a>asList(new a[0])) {
            if (!m2.getId().equals("ISO"))
              a.r(m2, m2.getId()); 
          } 
          m1 = t.c;
          m1.getClass();
        } finally {
          paramString = null;
        } 
        continue;
      } 
      for (m m2 : ServiceLoader.<m>load(m.class)) {
        if (paramString.equals(m2.getId()) || paramString.equals(m2.p()))
          return m2; 
      } 
      throw new RuntimeException("Unknown chronology: ".concat(paramString));
    } 
  }
  
  boolean equals(Object paramObject);
  
  String getId();
  
  int hashCode();
  
  String p();
  
  String toString();
  
  n u(int paramInt);
  
  b x(n paramn);
  
  default e y(LocalDateTime paramLocalDateTime) {
    try {
      return x((n)paramLocalDateTime).B(LocalTime.z((n)paramLocalDateTime));
    } catch (a a) {
      StringBuilder stringBuilder = new StringBuilder("Unable to obtain ChronoLocalDateTime from TemporalAccessor: ");
      stringBuilder.append(LocalDateTime.class);
      throw new RuntimeException(stringBuilder.toString(), a);
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\j$\time\chrono\m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
package j$.time.temporal;

import j$.time.b;
import j$.time.format.b;
import java.util.Objects;

public interface n {
  default Object b(b paramb) {
    return (paramb == r.a || paramb == r.b || paramb == r.c) ? null : paramb.a(this);
  }
  
  default int e(q paramq) {
    u u = j(paramq);
    if (u.a >= -2147483648L && u.d <= 2147483647L) {
      long l = g(paramq);
      if (u.d(l))
        return (int)l; 
      StringBuilder stringBuilder1 = new StringBuilder("Invalid value for ");
      stringBuilder1.append(paramq);
      stringBuilder1.append(" (valid values ");
      stringBuilder1.append(u);
      stringBuilder1.append("): ");
      stringBuilder1.append(l);
      throw new RuntimeException(stringBuilder1.toString());
    } 
    StringBuilder stringBuilder = new StringBuilder("Invalid field ");
    stringBuilder.append(paramq);
    stringBuilder.append(" for get() method, use getLong() instead");
    throw new RuntimeException(stringBuilder.toString());
  }
  
  boolean f(q paramq);
  
  long g(q paramq);
  
  default u j(q paramq) {
    if (paramq instanceof a) {
      if (f(paramq))
        return ((a)paramq).b; 
      throw new RuntimeException(b.a("Unsupported field: ", paramq));
    } 
    Objects.requireNonNull(paramq, "field");
    return paramq.t(this);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\j$\time\temporal\n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
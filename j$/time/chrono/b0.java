package j$.time.chrono;

import j$.time.LocalDate;
import j$.time.f;
import j$.time.temporal.a;
import j$.time.temporal.n;
import j$.time.temporal.u;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

public final class b0 extends a implements Serializable {
  public static final b0 c = new b0();
  
  private static final long serialVersionUID = 1039765215346859963L;
  
  private void readObject(ObjectInputStream paramObjectInputStream) {
    throw new InvalidObjectException("Deserialization via serialization delegate");
  }
  
  public final String getId() {
    return "Minguo";
  }
  
  public final String p() {
    return "roc";
  }
  
  public final u t(a parama) {
    int i = a0.a[parama.ordinal()];
    if (i != 1) {
      if (i != 2) {
        if (i != 3)
          return parama.b; 
        u u2 = a.YEAR.b;
        return u.e(u2.a - 1911L, u2.d - 1911L);
      } 
      u u1 = a.YEAR.b;
      return u.f(u1.d - 1911L, -u1.a + 1912L);
    } 
    u u = a.PROLEPTIC_MONTH.b;
    return u.e(u.a - 22932L, u.d - 22932L);
  }
  
  public final n u(int paramInt) {
    if (paramInt != 0) {
      if (paramInt == 1)
        return e0.ROC; 
      f.a("Invalid era: ", paramInt);
      return null;
    } 
    return e0.BEFORE_ROC;
  }
  
  public Object writeReplace() {
    return new f0((byte)1, this);
  }
  
  public final b x(n paramn) {
    return (paramn instanceof d0) ? (d0)paramn : new d0(LocalDate.z(paramn));
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\j$\time\chrono\b0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
package j$.time.chrono;

import j$.time.LocalDate;
import j$.time.f;
import j$.time.temporal.a;
import j$.time.temporal.n;
import j$.time.temporal.u;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.HashMap;

public final class h0 extends a implements Serializable {
  public static final h0 c = new h0();
  
  private static final long serialVersionUID = 2775954514031616474L;
  
  static {
    HashMap<Object, Object> hashMap3 = new HashMap<Object, Object>();
    HashMap<Object, Object> hashMap2 = new HashMap<Object, Object>();
    HashMap<Object, Object> hashMap1 = new HashMap<Object, Object>();
    hashMap3.put("en", new String[] { "BB", "BE" });
    hashMap3.put("th", new String[] { "BB", "BE" });
    hashMap2.put("en", new String[] { "B.B.", "B.E." });
    hashMap2.put("th", new String[] { "พ.ศ.", "ปีก่อนคริสต์กาลที่" });
    hashMap1.put("en", new String[] { "Before Buddhist", "Budhhist Era" });
    hashMap1.put("th", new String[] { "พุทธศักราช", "ปีก่อนคริสต์กาลที่" });
  }
  
  private void readObject(ObjectInputStream paramObjectInputStream) {
    throw new InvalidObjectException("Deserialization via serialization delegate");
  }
  
  public final String getId() {
    return "ThaiBuddhist";
  }
  
  public final String p() {
    return "buddhist";
  }
  
  public final u t(a parama) {
    int i = g0.a[parama.ordinal()];
    if (i != 1) {
      if (i != 2) {
        if (i != 3)
          return parama.b; 
        u u2 = a.YEAR.b;
        return u.e(u2.a + 543L, u2.d + 543L);
      } 
      u u1 = a.YEAR.b;
      return u.f(-(u1.a + 543L) + 1L, u1.d + 543L);
    } 
    u u = a.PROLEPTIC_MONTH.b;
    return u.e(u.a + 6516L, u.d + 6516L);
  }
  
  public final n u(int paramInt) {
    if (paramInt != 0) {
      if (paramInt == 1)
        return k0.BE; 
      f.a("Invalid era: ", paramInt);
      return null;
    } 
    return k0.BEFORE_BE;
  }
  
  public Object writeReplace() {
    return new f0((byte)1, this);
  }
  
  public final b x(n paramn) {
    return (paramn instanceof j0) ? (j0)paramn : new j0(LocalDate.z(paramn));
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\j$\time\chrono\h0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
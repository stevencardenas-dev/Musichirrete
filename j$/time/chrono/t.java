package j$.time.chrono;

import j$.time.LocalDate;
import j$.time.LocalDateTime;
import j$.time.f;
import j$.time.temporal.n;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

public final class t extends a implements Serializable {
  public static final t c = new t();
  
  private static final long serialVersionUID = -1440403870442975015L;
  
  private void readObject(ObjectInputStream paramObjectInputStream) {
    throw new InvalidObjectException("Deserialization via serialization delegate");
  }
  
  public static boolean t(long paramLong) {
    return ((0x3L & paramLong) == 0L && (paramLong % 100L != 0L || paramLong % 400L == 0L));
  }
  
  public final String getId() {
    return "ISO";
  }
  
  public final String p() {
    return "iso8601";
  }
  
  public final n u(int paramInt) {
    if (paramInt != 0) {
      if (paramInt == 1)
        return u.CE; 
      f.a("Invalid era: ", paramInt);
      return null;
    } 
    return u.BCE;
  }
  
  public Object writeReplace() {
    return new f0((byte)1, this);
  }
  
  public final b x(n paramn) {
    return (b)LocalDate.z(paramn);
  }
  
  public final e y(LocalDateTime paramLocalDateTime) {
    return (e)LocalDateTime.t((n)paramLocalDateTime);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\j$\time\chrono\t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
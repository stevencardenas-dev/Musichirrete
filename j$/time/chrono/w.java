package j$.time.chrono;

import j$.time.LocalDate;
import j$.time.f;
import j$.time.temporal.a;
import j$.time.temporal.n;
import j$.time.temporal.u;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

public final class w extends a implements Serializable {
  public static final w c = new w();
  
  private static final long serialVersionUID = 459996390165777884L;
  
  private void readObject(ObjectInputStream paramObjectInputStream) {
    throw new InvalidObjectException("Deserialization via serialization delegate");
  }
  
  public final String getId() {
    return "Japanese";
  }
  
  public final String p() {
    return "japanese";
  }
  
  public final u t(a parama) {
    z[] arrayOfZ2;
    z z2;
    z[] arrayOfZ1;
    z z1;
    int j;
    int k;
    long l;
    z[] arrayOfZ3;
    int i = v.a[parama.ordinal()];
    byte b = 0;
    switch (i) {
      default:
        return parama.b;
      case 8:
        l = z.d.a;
        arrayOfZ2 = z.e;
        return u.e(l, (arrayOfZ2[arrayOfZ2.length - 1]).a);
      case 7:
        return u.e(y.d.getYear(), 999999999L);
      case 6:
        z2 = z.d;
        l = a.DAY_OF_YEAR.b.c;
        arrayOfZ3 = z.e;
        j = arrayOfZ3.length;
        while (b < j) {
          z2 = arrayOfZ3[b];
          if (z2.b.J()) {
            i = 366;
          } else {
            i = 365;
          } 
          long l1 = Math.min(l, (i - z2.b.I() + 1));
          l = l1;
          if (z2.p() != null)
            l = Math.min(l1, ((z2.p()).b.I() - 1)); 
          b++;
        } 
        return u.f(l, a.DAY_OF_YEAR.b.d);
      case 5:
        arrayOfZ1 = z.e;
        k = (arrayOfZ1[arrayOfZ1.length - 1]).b.getYear();
        i = 1000000000 - (arrayOfZ1[arrayOfZ1.length - 1]).b.getYear();
        j = (arrayOfZ1[0]).b.getYear();
        b = 1;
        while (true) {
          arrayOfZ1 = z.e;
          if (b < arrayOfZ1.length) {
            z1 = arrayOfZ1[b];
            i = Math.min(i, z1.b.getYear() - j + 1);
            j = z1.b.getYear();
            b++;
            continue;
          } 
          return u.f(i, (999999999 - k));
        } 
      case 1:
      case 2:
      case 3:
      case 4:
        break;
    } 
    f.c("Unsupported field: ", z1);
    return null;
  }
  
  public final n u(int paramInt) {
    return z.r(paramInt);
  }
  
  public Object writeReplace() {
    return new f0((byte)1, this);
  }
  
  public final b x(n paramn) {
    return (paramn instanceof y) ? (y)paramn : new y(LocalDate.z(paramn));
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\j$\time\chrono\w.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
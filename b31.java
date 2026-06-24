import java.util.Calendar;
import java.util.GregorianCalendar;

public final class b31 implements ky1 {
  public final int b;
  
  public final jy1 c;
  
  public final jy1 a(my parammy, rz1 paramrz1) {
    c31 c31;
    Class<Calendar> clazz;
    int i = this.b;
    jy1 jy11 = this.c;
    qj0 qj02 = null;
    parammy = null;
    switch (i) {
      default:
        clazz = paramrz1.a;
        if (clazz == Calendar.class || clazz == GregorianCalendar.class)
          qj01 = (qj0)jy11; 
        return qj01;
      case 0:
        break;
    } 
    qj0 qj01 = qj02;
    if (((rz1)clazz).a == Number.class)
      c31 = (c31)jy11; 
    return c31;
  }
  
  public String toString() {
    switch (this.b) {
      default:
        return super.toString();
      case 1:
        break;
    } 
    StringBuilder stringBuilder = new StringBuilder("Factory[type=");
    stringBuilder.append(Calendar.class.getName());
    stringBuilder.append("+");
    stringBuilder.append(GregorianCalendar.class.getName());
    stringBuilder.append(",adapter=");
    stringBuilder.append(this.c);
    stringBuilder.append("]");
    return stringBuilder.toString();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\b31.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
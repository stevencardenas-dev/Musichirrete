import j$.time.Duration;
import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.LocalTime;
import j$.time.MonthDay;
import j$.time.Period;
import j$.time.Year;
import j$.time.YearMonth;
import java.util.Arrays;
import java.util.GregorianCalendar;
import java.util.List;

public final class qj0 extends jy1 {
  public final List a;
  
  public final int b;
  
  public qj0(int paramInt, String[] paramArrayOfString) {
    this.a = Arrays.asList(paramArrayOfString);
  }
  
  public final Object b(tk0 paramtk0) {
    if (paramtk0.C() == 9) {
      paramtk0.y();
      return null;
    } 
    paramtk0.c();
    List list = this.a;
    long[] arrayOfLong = new long[list.size()];
    while (paramtk0.C() != 4) {
      int i = list.indexOf(paramtk0.w());
      if (i >= 0) {
        arrayOfLong[i] = paramtk0.v();
        continue;
      } 
      paramtk0.K();
    } 
    paramtk0.k();
    switch (this.b) {
      default:
        return new GregorianCalendar(pz1.b(arrayOfLong[0]), pz1.b(arrayOfLong[1]), pz1.b(arrayOfLong[2]), pz1.b(arrayOfLong[3]), pz1.b(arrayOfLong[4]), pz1.b(arrayOfLong[5]));
      case 7:
        return Period.of(Math.toIntExact(arrayOfLong[0]), Math.toIntExact(arrayOfLong[1]), Math.toIntExact(arrayOfLong[2]));
      case 6:
        return MonthDay.of(Math.toIntExact(arrayOfLong[0]), Math.toIntExact(arrayOfLong[1]));
      case 5:
        return LocalTime.of(Math.toIntExact(arrayOfLong[0]), Math.toIntExact(arrayOfLong[1]), Math.toIntExact(arrayOfLong[2]), Math.toIntExact(arrayOfLong[3]));
      case 4:
        return LocalDate.of(Math.toIntExact(arrayOfLong[0]), Math.toIntExact(arrayOfLong[1]), Math.toIntExact(arrayOfLong[2]));
      case 3:
        return Instant.ofEpochSecond(arrayOfLong[0], arrayOfLong[1]);
      case 2:
        return Duration.ofSeconds(arrayOfLong[0], arrayOfLong[1]);
      case 1:
        return YearMonth.of(Math.toIntExact(arrayOfLong[0]), Math.toIntExact(arrayOfLong[1]));
      case 0:
        break;
    } 
    return Year.of(Math.toIntExact(arrayOfLong[0]));
  }
  
  public final void c(cl0 paramcl0, Object paramObject) {
    long l1;
    long l2;
    long l3;
    long l4;
    long l5;
    long l6;
    if (paramObject == null) {
      paramcl0.o();
      return;
    } 
    paramcl0.d();
    switch (this.b) {
      default:
        paramObject = paramObject;
        l3 = paramObject.get(1);
        l1 = paramObject.get(2);
        l6 = paramObject.get(5);
        l2 = paramObject.get(11);
        l4 = paramObject.get(12);
        l5 = paramObject.get(13);
        paramObject = new long[6];
        paramObject[0] = l3;
        paramObject[1] = l1;
        paramObject[2] = l6;
        paramObject[3] = l2;
        paramObject[4] = l4;
        paramObject[5] = l5;
        break;
      case 7:
        paramObject = paramObject;
        l1 = paramObject.getYears();
        l3 = paramObject.getMonths();
        l2 = paramObject.getDays();
        paramObject = new long[3];
        paramObject[0] = l1;
        paramObject[1] = l3;
        paramObject[2] = l2;
        break;
      case 6:
        paramObject = paramObject;
        l1 = paramObject.getMonthValue();
        l2 = paramObject.getDayOfMonth();
        paramObject = new long[2];
        paramObject[0] = l1;
        paramObject[1] = l2;
        break;
      case 5:
        paramObject = paramObject;
        l2 = paramObject.getHour();
        l4 = paramObject.getMinute();
        l1 = paramObject.getSecond();
        l3 = paramObject.getNano();
        paramObject = new long[4];
        paramObject[0] = l2;
        paramObject[1] = l4;
        paramObject[2] = l1;
        paramObject[3] = l3;
        break;
      case 4:
        paramObject = paramObject;
        l3 = paramObject.getYear();
        l2 = paramObject.getMonthValue();
        l1 = paramObject.getDayOfMonth();
        paramObject = new long[3];
        paramObject[0] = l3;
        paramObject[1] = l2;
        paramObject[2] = l1;
        break;
      case 3:
        paramObject = paramObject;
        l2 = paramObject.getEpochSecond();
        l1 = paramObject.getNano();
        paramObject = new long[2];
        paramObject[0] = l2;
        paramObject[1] = l1;
        break;
      case 2:
        paramObject = paramObject;
        l1 = paramObject.getSeconds();
        l2 = paramObject.getNano();
        paramObject = new long[2];
        paramObject[0] = l1;
        paramObject[1] = l2;
        break;
      case 1:
        paramObject = paramObject;
        l1 = paramObject.getYear();
        l2 = paramObject.getMonthValue();
        paramObject = new long[2];
        paramObject[0] = l1;
        paramObject[1] = l2;
        break;
      case 0:
        l1 = ((Year)paramObject).getValue();
        paramObject = new long[1];
        paramObject[0] = l1;
        break;
    } 
    byte b = 0;
    while (true) {
      List<String> list = this.a;
      if (b < list.size()) {
        paramcl0.l(list.get(b));
        paramcl0.u(paramObject[b]);
        b++;
        continue;
      } 
      paramcl0.k();
      return;
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\qj0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
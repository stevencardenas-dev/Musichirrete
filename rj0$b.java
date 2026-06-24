import j$.time.Duration;
import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.LocalDateTime;
import j$.time.LocalTime;
import j$.time.MonthDay;
import j$.time.OffsetDateTime;
import j$.time.OffsetTime;
import j$.time.Period;
import j$.time.Year;
import j$.time.YearMonth;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.ZonedDateTime;

public class b implements ky1 {
  public final jy1 a(my parammy, rz1 paramrz1) {
    Class<Duration> clazz = paramrz1.a;
    if (clazz.getName().startsWith("java.time.")) {
      qj0 qj0;
      if (clazz == Duration.class)
        return rj0.a; 
      if (clazz == Instant.class)
        return rj0.b; 
      if (clazz == LocalDate.class)
        return rj0.c; 
      if (clazz == LocalTime.class)
        return rj0.d; 
      if (clazz == LocalDateTime.class)
        return rj0.b(parammy); 
      if (clazz == MonthDay.class)
        return rj0.e; 
      if (clazz == OffsetDateTime.class)
        return (new lm(rj0.b(parammy), parammy.b(new rz1(ZoneOffset.class)), 1)).a(); 
      if (clazz == OffsetTime.class) {
        qj0 = rj0.a;
        parammy.getClass();
        return (new tj0(parammy.b(new rz1(LocalTime.class)), parammy.b(new rz1(ZoneOffset.class)), 1)).a();
      } 
      if (qj0 == Period.class)
        return rj0.f; 
      if (qj0 == Year.class)
        return rj0.g; 
      if (qj0 == YearMonth.class)
        return rj0.h; 
      if (qj0 == ZoneId.class || qj0 == ZoneOffset.class)
        return rj0.i; 
      if (qj0 == ZonedDateTime.class)
        return (new sj0(rj0.b(parammy), parammy.b(new rz1(ZoneOffset.class)), parammy.b(new rz1(ZoneId.class)), 0)).a(); 
    } 
    return null;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\rj0$b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
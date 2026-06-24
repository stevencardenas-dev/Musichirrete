import androidx.work.impl.diagnostics.UWhQ.OETETTfAjV;
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
import java.io.Serializable;

public final class rj0 implements oz1 {
  public static final qj0 a = new qj0(2, new String[] { "seconds", "nanos" });
  
  public static final qj0 b = new qj0(3, new String[] { "seconds", "nanos" });
  
  public static final qj0 c = new qj0(4, new String[] { "year", "month", "day" });
  
  public static final qj0 d = new qj0(5, new String[] { "hour", OETETTfAjV.xCwVolrGj, "second", "nano" });
  
  public static final qj0 e = new qj0(6, new String[] { "month", "day" });
  
  public static final qj0 f = new qj0(7, new String[] { "years", "months", "days" });
  
  public static final qj0 g = new qj0(0, new String[] { "year" });
  
  public static final qj0 h = new qj0(1, new String[] { "year", "month" });
  
  public static final iy1 i = (new a()).a();
  
  public static final b j = new b();
  
  public static void a(Serializable paramSerializable, String paramString, tk0 paramtk0) {
    if (paramSerializable != null)
      return; 
    paramSerializable = x41.q("Missing ", paramString, " field; at path ");
    paramSerializable.append(paramtk0.m(true));
    throw new RuntimeException(paramSerializable.toString());
  }
  
  public static iy1 b(my parammy) {
    parammy.getClass();
    return (new tj0(parammy.b(new rz1(LocalDate.class)), parammy.b(new rz1(LocalTime.class)), 0)).a();
  }
  
  public class a extends jy1 {
    public final Object b(tk0 param1tk0) {
      param1tk0.c();
      String str = null;
      Integer integer;
      for (integer = null; param1tk0.C() != 4; integer = Integer.valueOf(param1tk0.u())) {
        String str1 = param1tk0.w();
        if (!str1.equals("totalSeconds")) {
          if (!str1.equals("id")) {
            param1tk0.K();
            continue;
          } 
          str = param1tk0.A();
          continue;
        } 
      } 
      param1tk0.k();
      if (str != null)
        return ZoneId.of(str); 
      if (integer != null)
        return ZoneOffset.ofTotalSeconds(integer.intValue()); 
      throw new RuntimeException("Missing id or totalSeconds field; at path ".concat(param1tk0.m(true)));
    }
    
    public final void c(cl0 param1cl0, Object param1Object) {
      param1Object = param1Object;
      if (param1Object instanceof ZoneOffset) {
        param1cl0.d();
        param1cl0.l("totalSeconds");
        param1cl0.u(((ZoneOffset)param1Object).getTotalSeconds());
        param1cl0.k();
        return;
      } 
      param1cl0.d();
      param1cl0.l("id");
      param1cl0.w(param1Object.getId());
      param1cl0.k();
    }
  }
  
  public class b implements ky1 {
    public final jy1 a(my param1my, rz1 param1rz1) {
      Class<Duration> clazz = param1rz1.a;
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
          return rj0.b(param1my); 
        if (clazz == MonthDay.class)
          return rj0.e; 
        if (clazz == OffsetDateTime.class)
          return (new lm(rj0.b(param1my), param1my.b(new rz1(ZoneOffset.class)), 1)).a(); 
        if (clazz == OffsetTime.class) {
          qj0 = rj0.a;
          param1my.getClass();
          return (new tj0(param1my.b(new rz1(LocalTime.class)), param1my.b(new rz1(ZoneOffset.class)), 1)).a();
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
          return (new sj0(rj0.b(param1my), param1my.b(new rz1(ZoneOffset.class)), param1my.b(new rz1(ZoneId.class)), 0)).a(); 
      } 
      return null;
    }
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\rj0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
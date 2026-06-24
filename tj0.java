import j$.time.LocalDate;
import j$.time.LocalDateTime;
import j$.time.LocalTime;
import j$.time.OffsetTime;
import j$.time.ZoneOffset;
import java.io.Serializable;

public final class tj0 extends jy1 {
  public final int a;
  
  public final jy1 b;
  
  public final jy1 c;
  
  public final Object b(tk0 paramtk0) {
    LocalDate localDate;
    LocalTime localTime2;
    int i = this.a;
    jy1 jy11 = this.c;
    jy1 jy12 = this.b;
    String str2 = null;
    LocalTime localTime1 = null;
    switch (i) {
      default:
        paramtk0.c();
        for (zoneOffset = null; paramtk0.C() != 4; zoneOffset = (ZoneOffset)jy11.b(paramtk0)) {
          str2 = paramtk0.w();
          if (!str2.equals("offset")) {
            if (!str2.equals("time")) {
              paramtk0.K();
              continue;
            } 
            localTime1 = (LocalTime)jy12.b(paramtk0);
            continue;
          } 
        } 
        paramtk0.k();
        rj0.a((Serializable)localTime1, "time", paramtk0);
        rj0.a((Serializable)zoneOffset, "offset", paramtk0);
        return OffsetTime.of(localTime1, zoneOffset);
      case 0:
        break;
    } 
    paramtk0.c();
    ZoneOffset zoneOffset = null;
    String str1 = str2;
    while (paramtk0.C() != 4) {
      str2 = paramtk0.w();
      if (!str2.equals("date")) {
        if (!str2.equals("time")) {
          paramtk0.K();
          continue;
        } 
        localTime2 = (LocalTime)jy11.b(paramtk0);
        continue;
      } 
      localDate = (LocalDate)jy12.b(paramtk0);
    } 
    paramtk0.k();
    rj0.a((Serializable)localDate, "date", paramtk0);
    rj0.a((Serializable)localTime2, "time", paramtk0);
    return LocalDateTime.of(localDate, localTime2);
  }
  
  public final void c(cl0 paramcl0, Object paramObject) {
    int i = this.a;
    jy1 jy11 = this.c;
    jy1 jy12 = this.b;
    switch (i) {
      default:
        paramObject = paramObject;
        paramcl0.d();
        paramcl0.l("time");
        jy12.c(paramcl0, paramObject.toLocalTime());
        paramcl0.l("offset");
        jy11.c(paramcl0, paramObject.getOffset());
        paramcl0.k();
        return;
      case 0:
        break;
    } 
    paramObject = paramObject;
    paramcl0.d();
    paramcl0.l("date");
    jy12.c(paramcl0, paramObject.toLocalDate());
    paramcl0.l("time");
    jy11.c(paramcl0, paramObject.toLocalTime());
    paramcl0.k();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\tj0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
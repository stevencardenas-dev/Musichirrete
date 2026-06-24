import j$.time.ZoneId;
import j$.time.ZoneOffset;

public class a extends jy1 {
  public final Object b(tk0 paramtk0) {
    paramtk0.c();
    String str = null;
    Integer integer;
    for (integer = null; paramtk0.C() != 4; integer = Integer.valueOf(paramtk0.u())) {
      String str1 = paramtk0.w();
      if (!str1.equals("totalSeconds")) {
        if (!str1.equals("id")) {
          paramtk0.K();
          continue;
        } 
        str = paramtk0.A();
        continue;
      } 
    } 
    paramtk0.k();
    if (str != null)
      return ZoneId.of(str); 
    if (integer != null)
      return ZoneOffset.ofTotalSeconds(integer.intValue()); 
    throw new RuntimeException("Missing id or totalSeconds field; at path ".concat(paramtk0.m(true)));
  }
  
  public final void c(cl0 paramcl0, Object paramObject) {
    paramObject = paramObject;
    if (paramObject instanceof ZoneOffset) {
      paramcl0.d();
      paramcl0.l("totalSeconds");
      paramcl0.u(((ZoneOffset)paramObject).getTotalSeconds());
      paramcl0.k();
      return;
    } 
    paramcl0.d();
    paramcl0.l("id");
    paramcl0.w(paramObject.getId());
    paramcl0.k();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\rj0$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
import java.sql.Timestamp;
import java.util.Date;

public final class qo1 extends jy1 {
  public static final po1 b = new po1();
  
  public final jy1 a;
  
  public qo1(jy1 paramjy1) {
    this.a = paramjy1;
  }
  
  public final Object b(tk0 paramtk0) {
    Date date = (Date)this.a.b(paramtk0);
    return (date != null) ? new Timestamp(date.getTime()) : null;
  }
  
  public final void c(cl0 paramcl0, Object paramObject) {
    paramObject = paramObject;
    this.a.c(paramcl0, paramObject);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\qo1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
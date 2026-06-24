import java.sql.Date;
import java.sql.Timestamp;
import java.util.Date;

public final class ro1 extends aw {
  public final int c;
  
  public final Date a(Date paramDate) {
    switch (this.c) {
      default:
        return new Timestamp(paramDate.getTime());
      case 0:
        break;
    } 
    return new Date(paramDate.getTime());
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\ro1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
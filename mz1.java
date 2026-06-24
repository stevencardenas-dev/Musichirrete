import java.util.concurrent.atomic.AtomicInteger;

public class mz1 extends jy1 {
  public final Object b(tk0 paramtk0) {
    try {
      return new AtomicInteger(paramtk0.u());
    } catch (NumberFormatException numberFormatException) {
      throw new RuntimeException(numberFormatException);
    } 
  }
  
  public final void c(cl0 paramcl0, Object paramObject) {
    paramcl0.u(((AtomicInteger)paramObject).get());
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\mz1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
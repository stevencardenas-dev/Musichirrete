import java.util.Currency;

public class cz1 extends jy1 {
  public final Object b(tk0 paramtk0) {
    String str = paramtk0.A();
    try {
      return Currency.getInstance(str);
    } catch (IllegalArgumentException illegalArgumentException) {
      StringBuilder stringBuilder = x41.q("Failed parsing '", str, "' as Currency; at path ");
      stringBuilder.append(paramtk0.m(true));
      throw new RuntimeException(stringBuilder.toString(), illegalArgumentException);
    } 
  }
  
  public final void c(cl0 paramcl0, Object paramObject) {
    paramcl0.w(((Currency)paramObject).getCurrencyCode());
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\cz1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
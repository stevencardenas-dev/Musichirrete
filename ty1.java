import java.math.BigInteger;

public class ty1 extends jy1 {
  public final Object b(tk0 paramtk0) {
    if (paramtk0.C() == 9) {
      paramtk0.y();
      return null;
    } 
    String str = paramtk0.A();
    try {
      n21.o(str);
      return new BigInteger(str);
    } catch (NumberFormatException numberFormatException) {
      StringBuilder stringBuilder = x41.q("Failed parsing '", str, "' as BigInteger; at path ");
      stringBuilder.append(paramtk0.m(true));
      throw new RuntimeException(stringBuilder.toString(), numberFormatException);
    } 
  }
  
  public final void c(cl0 paramcl0, Object paramObject) {
    paramcl0.v((BigInteger)paramObject);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\ty1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
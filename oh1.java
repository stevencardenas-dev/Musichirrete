import java.math.BigInteger;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.RSAPrivateCrtKeySpec;
import java.security.spec.RSAPrivateKeySpec;
import java.security.spec.RSAPublicKeySpec;
import java.util.LinkedHashMap;
import java.util.Map;

public final class oh1 extends gb1 {
  public oh1(Map paramMap) {
    super(paramMap);
    BigInteger bigInteger1 = gb1.i(paramMap, "n", true);
    BigInteger bigInteger2 = gb1.i(paramMap, "e", true);
    Object object = new Object();
    RSAPublicKeySpec rSAPublicKeySpec = new RSAPublicKeySpec(bigInteger1, bigInteger2);
    try {
      RSAPublicKey rSAPublicKey = (RSAPublicKey)object.h().generatePublic(rSAPublicKeySpec);
      this.h = rSAPublicKey;
      g();
      if (paramMap.containsKey("d")) {
        BigInteger bigInteger = gb1.i(paramMap, "d", false);
        if (paramMap.containsKey("p")) {
          RSAPrivateCrtKeySpec rSAPrivateCrtKeySpec = new RSAPrivateCrtKeySpec(bigInteger1, bigInteger2, bigInteger, gb1.i(paramMap, "p", false), gb1.i(paramMap, "q", false), gb1.i(paramMap, "dp", false), gb1.i(paramMap, "dq", false), gb1.i(paramMap, "qi", false));
          try {
            RSAPrivateKey rSAPrivateKey = (RSAPrivateKey)object.h().generatePrivate(rSAPrivateCrtKeySpec);
            this.i = rSAPrivateKey;
          } catch (InvalidKeySpecException invalidKeySpecException) {
            throw new Exception("", invalidKeySpecException);
          } 
        } else {
          RSAPrivateKeySpec rSAPrivateKeySpec = new RSAPrivateKeySpec(bigInteger1, bigInteger);
          try {
            RSAPrivateKey rSAPrivateKey = (RSAPrivateKey)object.h().generatePrivate(rSAPrivateKeySpec);
            this.i = rSAPrivateKey;
          } catch (InvalidKeySpecException invalidKeySpecException) {
            throw new Exception("", invalidKeySpecException);
          } 
        } 
      } 
      f(new String[] { "n", "e", "d", "p", "q", "dp", "dq", "qi" });
      return;
    } catch (InvalidKeySpecException invalidKeySpecException) {
      throw new Exception("", invalidKeySpecException);
    } 
  }
  
  public final String b() {
    return "RSA";
  }
  
  public final void h(LinkedHashMap paramLinkedHashMap) {
    RSAPublicKey rSAPublicKey = (RSAPublicKey)this.h;
    gb1.j(paramLinkedHashMap, "n", rSAPublicKey.getModulus());
    gb1.j(paramLinkedHashMap, "e", rSAPublicKey.getPublicExponent());
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\oh1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
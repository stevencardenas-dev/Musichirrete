import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPrivateKeySpec;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.InvalidKeySpecException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public final class p30 extends gb1 {
  public final String n;
  
  public p30(Map paramMap) {
    super(paramMap);
    String str = yk0.d(paramMap, "crv", true);
    this.n = str;
    ECParameterSpec eCParameterSpec = (ECParameterSpec)q30.a.get(str);
    ECPublicKeySpec eCPublicKeySpec = new ECPublicKeySpec(new ECPoint(gb1.i(paramMap, "x", true), gb1.i(paramMap, "y", true)), eCParameterSpec);
    try {
      KeyFactory keyFactory = KeyFactory.getInstance("EC");
      ECPublicKey eCPublicKey = (ECPublicKey)keyFactory.generatePublic(eCPublicKeySpec);
      this.h = eCPublicKey;
      g();
      if (paramMap.containsKey("d")) {
        ECPrivateKeySpec eCPrivateKeySpec = new ECPrivateKeySpec(gb1.i(paramMap, "d", false), eCParameterSpec);
        try {
          KeyFactory keyFactory1 = KeyFactory.getInstance("EC");
          ECPrivateKey eCPrivateKey = (ECPrivateKey)keyFactory1.generatePrivate(eCPrivateKeySpec);
          this.i = eCPrivateKey;
        } catch (NoSuchAlgorithmException noSuchAlgorithmException) {
          ek0 ek0 = new ek0();
          super("", noSuchAlgorithmException);
          throw ek0;
        } catch (NoSuchProviderException noSuchProviderException) {
          ek0 ek0 = new ek0();
          super("null", noSuchProviderException);
          throw ek0;
        } catch (InvalidKeySpecException null) {}
      } 
      f(new String[] { "crv", "x", "y", "d" });
      return;
    } catch (NoSuchAlgorithmException noSuchAlgorithmException) {
      ek0 ek0 = new ek0();
      super("", noSuchAlgorithmException);
      throw ek0;
    } catch (NoSuchProviderException noSuchProviderException) {
      ek0 ek0 = new ek0();
      super("null", noSuchProviderException);
      throw ek0;
    } catch (InvalidKeySpecException invalidKeySpecException) {}
    throw new Exception("", invalidKeySpecException);
  }
  
  public final String b() {
    return "EC";
  }
  
  public final void h(LinkedHashMap<String, String> paramLinkedHashMap) {
    ECPoint eCPoint = ((ECPublicKey)this.h).getW();
    HashMap hashMap = q30.a;
    String str = this.n;
    int i = (int)Math.ceil(((ECParameterSpec)hashMap.get(str)).getCurve().getField().getFieldSize() / 8.0D);
    gb1.k(paramLinkedHashMap, "x", eCPoint.getAffineX(), i);
    gb1.k(paramLinkedHashMap, "y", eCPoint.getAffineY(), i);
    paramLinkedHashMap.put("crv", str);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\p30.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
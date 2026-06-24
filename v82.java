import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.SecureRandom;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.spec.OAEPParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.jaudiotagger.audio.dsf.qdA.GMDx;

public abstract class v82 extends e4 implements il0 {
  public OAEPParameterSpec c;
  
  public v82(String paramString1, String paramString2) {
    this.b = paramString1;
    this.a = paramString2;
  }
  
  public final p01 d(Key paramKey, n2 paramn2, j01 paramj01) {
    Object object = paramj01.c;
    object = qz1.v(this.b);
    try {
      OAEPParameterSpec oAEPParameterSpec = this.c;
      if (oAEPParameterSpec == null) {
        object.init(4, paramKey);
      } else {
        object.init(4, paramKey, oAEPParameterSpec);
      } 
      return new p01(object, null, null, 6);
    } catch (InvalidKeyException invalidKeyException) {
      object = new StringBuilder("");
      object.append(invalidKeyException);
      throw new Exception(object.toString(), invalidKeyException);
    } catch (InvalidAlgorithmParameterException invalidAlgorithmParameterException) {
      StringBuilder stringBuilder = new StringBuilder("");
      stringBuilder.append(invalidAlgorithmParameterException);
      throw new Exception(stringBuilder.toString(), invalidAlgorithmParameterException);
    } 
  }
  
  public final Key h(p01 paramp01, byte[] paramArrayOfbyte, qp0 paramqp0, n2 paramn2, j01 paramj01) {
    Cipher cipher = (Cipher)paramp01.c;
    paramqp0.getClass();
    try {
      return cipher.unwrap(paramArrayOfbyte, "AES", 3);
    } catch (Exception exception) {
      int i = paramqp0.b;
      SecureRandom secureRandom = new SecureRandom();
      byte[] arrayOfByte = new byte[i];
      secureRandom.nextBytes(arrayOfByte);
      return new SecretKeySpec(arrayOfByte, "AES");
    } 
  }
  
  public final void j(Key paramKey, qp0 paramqp0, j01 paramj01) {
    int i = paramqp0.b;
    SecureRandom secureRandom = new SecureRandom();
    byte[] arrayOfByte = new byte[i];
    secureRandom.nextBytes(arrayOfByte);
    String str = GMDx.PfeCgloMaNwRc;
    Cipher cipher = qz1.v(this.b);
    try {
      OAEPParameterSpec oAEPParameterSpec = this.c;
      if (oAEPParameterSpec == null) {
        cipher.init(3, paramKey);
      } else {
        cipher.init(3, paramKey, oAEPParameterSpec);
      } 
      paramKey = new SecretKeySpec();
      super(arrayOfByte, "AES");
      cipher.wrap(paramKey);
      return;
    } catch (InvalidKeyException invalidKeyException) {
    
    } catch (IllegalBlockSizeException illegalBlockSizeException) {
    
    } catch (InvalidAlgorithmParameterException invalidAlgorithmParameterException) {}
    StringBuilder stringBuilder = new StringBuilder(str);
    stringBuilder.append(invalidAlgorithmParameterException);
    throw new Exception(stringBuilder.toString(), invalidAlgorithmParameterException);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\v82.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
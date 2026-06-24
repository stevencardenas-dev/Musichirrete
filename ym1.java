import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.spec.GCMParameterSpec;

public final class ym1 {
  public static final String b = new String(qz1.o("QUVTL0dDTS9Ob1BhZGRpbmc"));
  
  public final String a;
  
  public ym1(String paramString) {
    this.a = paramString;
  }
  
  public static byte[] a(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, byte[] paramArrayOfbyte3, Cipher paramCipher) {
    if (paramArrayOfbyte3 != null && paramArrayOfbyte3.length > 0)
      paramCipher.updateAAD(paramArrayOfbyte3); 
    try {
      return paramCipher.doFinal(qz1.i(new byte[][] { paramArrayOfbyte1, paramArrayOfbyte2 }));
    } catch (IllegalBlockSizeException|javax.crypto.BadPaddingException illegalBlockSizeException) {
      throw new Exception(illegalBlockSizeException.toString(), illegalBlockSizeException);
    } 
  }
  
  public final Cipher b(Key paramKey, byte[] paramArrayOfbyte) {
    String str = this.a;
    Cipher cipher = qz1.v(str);
    try {
      GCMParameterSpec gCMParameterSpec = new GCMParameterSpec();
      this(qz1.e(16), paramArrayOfbyte);
      cipher.init(2, paramKey, gCMParameterSpec);
      return cipher;
    } catch (InvalidKeyException invalidKeyException) {
    
    } catch (InvalidAlgorithmParameterException invalidAlgorithmParameterException) {
      throw new Exception(invalidAlgorithmParameterException.toString(), invalidAlgorithmParameterException);
    } 
    throw new Exception(x41.k("", str), invalidAlgorithmParameterException);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\ym1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
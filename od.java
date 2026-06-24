import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.PSSParameterSpec;

public abstract class od extends e4 implements al0 {
  public PSSParameterSpec c;
  
  public od(String paramString1, String paramString2) {
    this.a = paramString1;
    this.b = paramString2;
  }
  
  public final void b(Key paramKey) {
    if (paramKey != null)
      try {
        k((PublicKey)paramKey);
        return;
      } catch (ClassCastException classCastException) {
        m60.f();
        return;
      }  
    m60.f();
  }
  
  public final boolean g() {
    try {
      j01 j01 = new j01();
      this(5);
      Signature signature = j(j01);
      if (signature != null)
        return true; 
    } catch (Exception exception) {}
    return false;
  }
  
  public boolean i(byte[] paramArrayOfbyte1, Key paramKey, byte[] paramArrayOfbyte2, j01 paramj01) {
    Signature signature = j(paramj01);
    try {
      signature.initVerify((PublicKey)paramKey);
      try {
        signature.update(paramArrayOfbyte2);
        return signature.verify(paramArrayOfbyte1);
      } catch (SignatureException signatureException) {
        return false;
      } 
    } catch (InvalidKeyException invalidKeyException) {
      throw new Exception("", invalidKeyException);
    } 
  }
  
  public final Signature j(j01 paramj01) {
    object = paramj01.c;
    object = this.b;
    try {
      Signature signature = Signature.getInstance((String)object);
      PSSParameterSpec pSSParameterSpec = this.c;
      if (pSSParameterSpec != null)
        try {
          signature.setParameter(pSSParameterSpec);
          return signature;
        } catch (UnsupportedOperationException unsupportedOperationException) {} 
      return signature;
    } catch (NoSuchAlgorithmException noSuchAlgorithmException) {
    
    } catch (InvalidAlgorithmParameterException invalidAlgorithmParameterException) {
    
    } catch (NoSuchProviderException object) {
      throw new Exception("null", object);
    } 
    throw new Exception(x41.k("", object), invalidAlgorithmParameterException);
  }
  
  public abstract void k(PublicKey paramPublicKey);
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\od.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
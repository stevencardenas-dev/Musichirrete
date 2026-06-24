import java.security.Key;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;

public final class eg0 extends e4 implements al0 {
  public final int c;
  
  public eg0(int paramInt, String paramString1, String paramString2) {
    this.a = paramString1;
    this.b = paramString2;
    this.c = paramInt;
  }
  
  public final void b(Key paramKey) {
    if (paramKey != null) {
      if (paramKey.getEncoded() != null && qz1.e((paramKey.getEncoded()).length) < this.c)
        m60.f(); 
      return;
    } 
    m60.f();
  }
  
  public final boolean g() {
    try {
      Mac.getInstance(this.b);
      return true;
    } catch (NoSuchAlgorithmException noSuchAlgorithmException) {
      return false;
    } 
  }
  
  public final boolean i(byte[] paramArrayOfbyte1, Key paramKey, byte[] paramArrayOfbyte2, j01 paramj01) {
    if (paramKey instanceof javax.crypto.SecretKey) {
      Object object = paramj01.c;
      return qz1.O(paramArrayOfbyte1, dd1.C(this.b, paramKey).doFinal(paramArrayOfbyte2));
    } 
    m60.f();
    return false;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\eg0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;

public final class k3 extends v82 {
  public final int d;
  
  public k3(int paramInt) {
    this("A192KW", 24);
  }
  
  public k3(String paramString, int paramInt) {
    super("AESWrap", paramString);
    this.d = paramInt;
  }
  
  public final void a(Key paramKey, qr paramqr) {
    qv.j0(paramKey, this.d);
  }
  
  public final boolean g() {
    int i = this.d;
    String str = this.b;
    boolean bool = false;
    try {
      Cipher.getInstance(str);
      int j = qz1.e(i);
      i = Cipher.getMaxAllowedKeyLength(str);
      if (j <= i)
        bool = true; 
    } catch (NoSuchAlgorithmException|javax.crypto.NoSuchPaddingException noSuchAlgorithmException) {}
    return bool;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\k3.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
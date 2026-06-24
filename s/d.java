package s;

import java.security.KeyFactory;
import java.security.spec.X509EncodedKeySpec;
import qz1;

public class d {
  public static c a(byte[] paramArrayOfbyte) {
    return new c(KeyFactory.getInstance(new String(qz1.o("RUM"))).generatePublic(new X509EncodedKeySpec(paramArrayOfbyte)));
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\s\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
import androidx.work.impl.diagnostics.UWhQ.OETETTfAjV;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import org.conscrypt.Conscrypt;
import org.conscrypt.OpenSSLProvider;

public final class zp extends e71 {
  public static zp e() {
    try {
      Class.forName("org.conscrypt.ConscryptEngineSocket");
      if (Conscrypt.isAvailable())
        return (zp)new Object(); 
    } catch (ClassNotFoundException classNotFoundException) {}
    return null;
  }
  
  public static Provider f() {
    return (Provider)new OpenSSLProvider();
  }
  
  public final void c(SSLSocketFactory paramSSLSocketFactory) {
    if (Conscrypt.isConscrypt(paramSSLSocketFactory))
      Conscrypt.setUseEngineSocket(paramSSLSocketFactory, true); 
  }
  
  public final SSLContext d() {
    try {
      return SSLContext.getInstance("TLS", f());
    } catch (NoSuchAlgorithmException noSuchAlgorithmException) {
      throw new IllegalStateException(OETETTfAjV.UbRszPDay, noSuchAlgorithmException);
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\zp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
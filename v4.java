import java.lang.reflect.Method;
import java.security.NoSuchAlgorithmException;
import java.security.cert.X509Certificate;
import javax.net.ssl.SSLContext;
import javax.net.ssl.X509TrustManager;

public final class v4 extends e71 {
  public final int b;
  
  public ws2 a(X509TrustManager paramX509TrustManager) {
    ws2 ws2;
    switch (this.b) {
      default:
        return super.a(paramX509TrustManager);
      case 0:
        break;
    } 
    try {
      Class<?> clazz = Class.forName("android.net.http.X509TrustManagerExtensions");
      Object object = clazz.getConstructor(new Class[] { X509TrustManager.class }).newInstance(new Object[] { paramX509TrustManager });
      clazz.getMethod("checkServerTrusted", new Class[] { X509Certificate[].class, String.class, String.class });
      t4 t4 = new t4();
      this(object);
      ws2 = t4;
    } catch (Exception exception) {
      ws2 = super.a((X509TrustManager)ws2);
    } 
    return ws2;
  }
  
  public ey1 b(X509TrustManager paramX509TrustManager) {
    u4 u4;
    se se;
    switch (this.b) {
      default:
        return super.b(paramX509TrustManager);
      case 0:
        break;
    } 
    try {
      Method method = paramX509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", new Class[] { X509Certificate.class });
      method.setAccessible(true);
      u4 u41 = new u4();
      this(paramX509TrustManager, method);
      u4 = u41;
    } catch (NoSuchMethodException noSuchMethodException) {
      se = new se(u4.getAcceptedIssuers());
    } 
    return se;
  }
  
  public SSLContext d() {
    switch (this.b) {
      default:
        return super.d();
      case 0:
        break;
    } 
    try {
      return SSLContext.getInstance("TLS");
    } catch (NoSuchAlgorithmException noSuchAlgorithmException) {
      throw new IllegalStateException("No TLS provider", noSuchAlgorithmException);
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\v4.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
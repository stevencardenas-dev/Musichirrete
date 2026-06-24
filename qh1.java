import java.security.PublicKey;
import java.security.Security;
import java.util.Set;

public final class qh1 extends od {
  public static String l(String paramString) {
    Set<String> set = Security.getAlgorithms("Signature");
    boolean bool = Boolean.getBoolean("org.jose4j.jws.use-legacy-rsapss-alg-names");
    return (set.contains("RSASSA-PSS") && !bool) ? "RSASSA-PSS" : paramString;
  }
  
  public final void k(PublicKey paramPublicKey) {
    qv.i(paramPublicKey);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\qh1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
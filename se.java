import java.security.cert.X509Certificate;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import javax.security.auth.x500.X500Principal;

public final class se implements ey1 {
  public final LinkedHashMap a = new LinkedHashMap<Object, Object>();
  
  public se(X509Certificate... paramVarArgs) {
    int i = paramVarArgs.length;
    for (byte b = 0; b < i; b++) {
      X509Certificate x509Certificate = paramVarArgs[b];
      X500Principal x500Principal = x509Certificate.getSubjectX500Principal();
      Set<X509Certificate> set2 = (Set)this.a.get(x500Principal);
      Set<X509Certificate> set1 = set2;
      if (set2 == null) {
        set1 = new LinkedHashSet(1);
        this.a.put(x500Principal, set1);
      } 
      set1.add(x509Certificate);
    } 
  }
  
  public final boolean equals(Object paramObject) {
    return (paramObject == this || (paramObject instanceof se && ((se)paramObject).a.equals(this.a)));
  }
  
  public final int hashCode() {
    return this.a.hashCode();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\se.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
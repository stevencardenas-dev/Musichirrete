import java.lang.reflect.Method;
import javax.net.ssl.X509TrustManager;

public final class u4 implements ey1 {
  public final X509TrustManager a;
  
  public final Method b;
  
  public u4(X509TrustManager paramX509TrustManager, Method paramMethod) {
    this.b = paramMethod;
    this.a = paramX509TrustManager;
  }
  
  public final boolean equals(Object paramObject) {
    if (paramObject == this)
      return true; 
    if (paramObject instanceof u4) {
      paramObject = paramObject;
      if (this.a.equals(((u4)paramObject).a) && this.b.equals(((u4)paramObject).b))
        return true; 
    } 
    return false;
  }
  
  public final int hashCode() {
    int i = this.a.hashCode();
    return this.b.hashCode() * 31 + i;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar\\u4.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
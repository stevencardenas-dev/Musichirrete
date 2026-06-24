import android.net.NetworkRequest;

public final class v11 {
  public static final String b = qp0.j("NetworkRequestCompat");
  
  public final Object a;
  
  public v11(NetworkRequest paramNetworkRequest) {
    this.a = paramNetworkRequest;
  }
  
  public final boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (!(paramObject instanceof v11))
      return false; 
    paramObject = paramObject;
    return !!ui0.c(this.a, ((v11)paramObject).a);
  }
  
  public final int hashCode() {
    Object object = this.a;
    return (object == null) ? 0 : object.hashCode();
  }
  
  public final String toString() {
    StringBuilder stringBuilder = new StringBuilder("NetworkRequestCompat(wrapped=");
    stringBuilder.append(this.a);
    stringBuilder.append(')');
    return stringBuilder.toString();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\v11.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
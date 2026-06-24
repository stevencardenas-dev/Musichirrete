import java.util.LinkedHashMap;

public abstract class gt {
  public final LinkedHashMap a = new LinkedHashMap<Object, Object>();
  
  public final boolean equals(Object paramObject) {
    if (paramObject instanceof gt) {
      paramObject = ((gt)paramObject).a;
      if (ui0.c(this.a, paramObject))
        return true; 
    } 
    return false;
  }
  
  public final int hashCode() {
    return this.a.hashCode();
  }
  
  public final String toString() {
    StringBuilder stringBuilder = new StringBuilder("CreationExtras(extras=");
    stringBuilder.append(this.a);
    stringBuilder.append(')');
    return stringBuilder.toString();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\gt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
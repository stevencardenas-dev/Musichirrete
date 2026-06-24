import java.lang.reflect.Method;

public final class nl {
  public final int a;
  
  public final Method b;
  
  public nl(int paramInt, Method paramMethod) {
    this.a = paramInt;
    this.b = paramMethod;
    paramMethod.setAccessible(true);
  }
  
  public final boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject instanceof nl) {
      paramObject = paramObject;
      if (this.a == ((nl)paramObject).a && this.b.getName().equals(((nl)paramObject).b.getName()))
        return true; 
    } 
    return false;
  }
  
  public final int hashCode() {
    int i = this.a;
    return this.b.getName().hashCode() + i * 31;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\nl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
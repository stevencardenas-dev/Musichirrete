import java.lang.reflect.Type;
import java.util.Objects;

public class rz1<T> {
  public final Class a;
  
  public final Type b;
  
  public final int c;
  
  public rz1(Type paramType) {
    Objects.requireNonNull(paramType);
    paramType = g92.l(paramType);
    this.b = paramType;
    this.a = g92.G(paramType);
    this.c = paramType.hashCode();
  }
  
  public final boolean equals(Object paramObject) {
    if (paramObject instanceof rz1) {
      paramObject = ((rz1)paramObject).b;
      if (g92.A(this.b, (Type)paramObject))
        return true; 
    } 
    return false;
  }
  
  public final int hashCode() {
    return this.c;
  }
  
  public final String toString() {
    return g92.e0(this.b);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\rz1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
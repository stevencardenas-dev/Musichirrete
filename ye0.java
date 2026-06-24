import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.Objects;

public final class ye0 implements GenericArrayType {
  public final Type b;
  
  public ye0(Type paramType) {
    Objects.requireNonNull(paramType);
    this.b = g92.l(paramType);
  }
  
  public final boolean equals(Object paramObject) {
    return (paramObject instanceof GenericArrayType && g92.A(this, (GenericArrayType)paramObject));
  }
  
  public final Type getGenericComponentType() {
    return this.b;
  }
  
  public final int hashCode() {
    return this.b.hashCode();
  }
  
  public final String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(g92.e0(this.b));
    stringBuilder.append("[]");
    return stringBuilder.toString();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\ye0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
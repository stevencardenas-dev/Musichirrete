import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Objects;

public final class ze0 implements ParameterizedType {
  public final Type b;
  
  public final Type c;
  
  public final Type[] e;
  
  public ze0(Type paramType, Class<?> paramClass, Type... paramVarArgs) {
    Objects.requireNonNull(paramClass);
    Type type = null;
    if (paramType != null || Modifier.isStatic(paramClass.getModifiers()) || paramClass.getDeclaringClass() == null) {
      if (paramType == null) {
        paramType = type;
      } else {
        paramType = g92.l(paramType);
      } 
      this.b = paramType;
      this.c = g92.l(paramClass);
      Type[] arrayOfType = (Type[])paramVarArgs.clone();
      this.e = arrayOfType;
      int i = arrayOfType.length;
      for (byte b = 0; b < i; b++) {
        Objects.requireNonNull(this.e[b]);
        g92.n(this.e[b]);
        arrayOfType = this.e;
        arrayOfType[b] = g92.l(arrayOfType[b]);
      } 
      return;
    } 
    m60.k("Must specify owner type for ", paramClass);
    throw null;
  }
  
  public final boolean equals(Object paramObject) {
    return (paramObject instanceof ParameterizedType && g92.A(this, (ParameterizedType)paramObject));
  }
  
  public final Type[] getActualTypeArguments() {
    return (Type[])this.e.clone();
  }
  
  public final Type getOwnerType() {
    return this.b;
  }
  
  public final Type getRawType() {
    return this.c;
  }
  
  public final int hashCode() {
    boolean bool;
    int i = Arrays.hashCode((Object[])this.e);
    int j = this.c.hashCode();
    Type type = this.b;
    if (type != null) {
      bool = type.hashCode();
    } else {
      bool = false;
    } 
    return bool ^ i ^ j;
  }
  
  public final String toString() {
    Type[] arrayOfType = this.e;
    int i = arrayOfType.length;
    Type type = this.c;
    if (i == 0)
      return g92.e0(type); 
    StringBuilder stringBuilder = new StringBuilder((i + 1) * 30);
    stringBuilder.append(g92.e0(type));
    stringBuilder.append("<");
    stringBuilder.append(g92.e0(arrayOfType[0]));
    for (byte b = 1; b < i; b++) {
      stringBuilder.append(", ");
      stringBuilder.append(g92.e0(arrayOfType[b]));
    } 
    stringBuilder.append(">");
    return stringBuilder.toString();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\ze0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
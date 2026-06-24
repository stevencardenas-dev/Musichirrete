import java.io.Serializable;

public final class t51 implements Serializable {
  public final Object b;
  
  public final Object c;
  
  public t51(Object paramObject1, Object paramObject2) {
    this.b = paramObject1;
    this.c = paramObject2;
  }
  
  public final boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (!(paramObject instanceof t51))
      return false; 
    paramObject = paramObject;
    return !ui0.c(this.b, ((t51)paramObject).b) ? false : (!!ui0.c(this.c, ((t51)paramObject).c));
  }
  
  public final int hashCode() {
    int i;
    int j = 0;
    Object object = this.b;
    if (object == null) {
      i = 0;
    } else {
      i = object.hashCode();
    } 
    object = this.c;
    if (object != null)
      j = object.hashCode(); 
    return i * 31 + j;
  }
  
  public final String toString() {
    StringBuilder stringBuilder = new StringBuilder("(");
    stringBuilder.append(this.b);
    stringBuilder.append(", ");
    stringBuilder.append(this.c);
    stringBuilder.append(')');
    return stringBuilder.toString();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\t51.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
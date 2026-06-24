import java.util.Objects;

public final class u51 {
  public final Object a;
  
  public final Object b;
  
  public u51(Object paramObject1, Object paramObject2) {
    this.a = paramObject1;
    this.b = paramObject2;
  }
  
  public final boolean equals(Object paramObject) {
    if (!(paramObject instanceof u51))
      return false; 
    paramObject = paramObject;
    return (Objects.equals(((u51)paramObject).a, this.a) && Objects.equals(((u51)paramObject).b, this.b));
  }
  
  public final int hashCode() {
    int i;
    int j = 0;
    Object object = this.a;
    if (object == null) {
      i = 0;
    } else {
      i = object.hashCode();
    } 
    object = this.b;
    if (object != null)
      j = object.hashCode(); 
    return i ^ j;
  }
  
  public final String toString() {
    StringBuilder stringBuilder = new StringBuilder("Pair{");
    stringBuilder.append(this.a);
    stringBuilder.append(" ");
    stringBuilder.append(this.b);
    stringBuilder.append("}");
    return stringBuilder.toString();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar\\u51.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
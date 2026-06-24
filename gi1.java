import java.util.Map;

public final class gi1 implements Map.Entry {
  public final Object b;
  
  public final Object c;
  
  public gi1 e;
  
  public gi1 f;
  
  public gi1(Object paramObject1, Object paramObject2) {
    this.b = paramObject1;
    this.c = paramObject2;
  }
  
  public final boolean equals(Object paramObject) {
    if (paramObject == this)
      return true; 
    if (paramObject instanceof gi1) {
      paramObject = paramObject;
      if (this.b.equals(((gi1)paramObject).b) && this.c.equals(((gi1)paramObject).c))
        return true; 
    } 
    return false;
  }
  
  public final Object getKey() {
    return this.b;
  }
  
  public final Object getValue() {
    return this.c;
  }
  
  public final int hashCode() {
    int i = this.b.hashCode();
    return this.c.hashCode() ^ i;
  }
  
  public final Object setValue(Object paramObject) {
    throw new UnsupportedOperationException("An entry modification is not supported");
  }
  
  public final String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(this.b);
    stringBuilder.append("=");
    stringBuilder.append(this.c);
    return stringBuilder.toString();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\gi1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
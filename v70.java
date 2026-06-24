import java.util.Collections;
import java.util.Map;

public final class v70 {
  public final String a;
  
  public final Map b;
  
  public v70(String paramString, Map paramMap) {
    this.a = paramString;
    this.b = paramMap;
  }
  
  public static v70 a(String paramString) {
    return new v70(paramString, Collections.EMPTY_MAP);
  }
  
  public final boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject instanceof v70) {
      paramObject = paramObject;
      if (this.a.equals(((v70)paramObject).a) && this.b.equals(((v70)paramObject).b))
        return true; 
    } 
    return false;
  }
  
  public final int hashCode() {
    int i = this.a.hashCode();
    return this.b.hashCode() + i * 31;
  }
  
  public final String toString() {
    StringBuilder stringBuilder = new StringBuilder("FieldDescriptor{name=");
    stringBuilder.append(this.a);
    stringBuilder.append(", properties=");
    stringBuilder.append(this.b.values());
    stringBuilder.append("}");
    return stringBuilder.toString();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\v70.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
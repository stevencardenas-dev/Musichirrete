import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class jh2 {
  public static final jh2 c;
  
  public final Integer a;
  
  public final Map b;
  
  static {
    Map<?, ?> map = Collections.unmodifiableMap(new HashMap<Object, Object>());
    if (map != null) {
      c = new jh2(null, map);
      return;
    } 
    k91.h("Null splitInstallErrorCodeByModule");
  }
  
  public jh2(Integer paramInteger, Map paramMap) {
    this.a = paramInteger;
    this.b = paramMap;
  }
  
  public final boolean equals(Object paramObject) {
    if (paramObject == this)
      return true; 
    if (paramObject instanceof jh2) {
      jh2 jh21 = (jh2)paramObject;
      Integer integer = jh21.a;
      paramObject = this.a;
      if (((paramObject == null) ? (integer == null) : paramObject.equals(integer)) && this.b.equals(jh21.b))
        return true; 
    } 
    return false;
  }
  
  public final int hashCode() {
    int i;
    Integer integer = this.a;
    if (integer == null) {
      i = 0;
    } else {
      i = integer.hashCode();
    } 
    return this.b.hashCode() ^ (i ^ 0xF4243) * 1000003;
  }
  
  public final String toString() {
    String str = String.valueOf(this.b);
    StringBuilder stringBuilder = new StringBuilder("LocalTestingConfig{defaultSplitInstallErrorCode=");
    stringBuilder.append(this.a);
    stringBuilder.append(", splitInstallErrorCodeByModule=");
    stringBuilder.append(str);
    stringBuilder.append("}");
    return stringBuilder.toString();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\jh2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
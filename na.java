import java.util.Collections;
import java.util.HashMap;

public final class na implements f31 {
  public static final na a = (na)new Object();
  
  public static final v70 b;
  
  public static final v70 c;
  
  static {
    j9 j9 = new j9(1);
    HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
    hashMap.put(ab1.class, j9);
    b = new v70("logSource", Collections.unmodifiableMap(new HashMap<Object, Object>(hashMap)));
    j9 = new j9(2);
    hashMap = new HashMap<Object, Object>();
    hashMap.put(ab1.class, j9);
    c = new v70("logEventDropped", Collections.unmodifiableMap(new HashMap<Object, Object>(hashMap)));
  }
  
  public final void a(Object paramObject1, Object paramObject2) {
    paramObject1 = paramObject1;
    paramObject2 = paramObject2;
    paramObject2.a(b, ((op0)paramObject1).a);
    paramObject2.a(c, ((op0)paramObject1).b);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\na.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
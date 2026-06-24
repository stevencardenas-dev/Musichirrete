import java.util.Collections;
import java.util.HashMap;

public final class la implements f31 {
  public static final la a = (la)new Object();
  
  public static final v70 b;
  
  static {
    j9 j9 = new j9(1);
    HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
    hashMap.put(ab1.class, j9);
    b = new v70("storageMetrics", Collections.unmodifiableMap(new HashMap<Object, Object>(hashMap)));
  }
  
  public final void a(Object paramObject1, Object paramObject2) {
    paramObject1 = paramObject1;
    ((g31)paramObject2).a(b, ((fe0)paramObject1).a);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\la.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
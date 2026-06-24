import java.util.Collections;
import java.util.HashMap;

public final class ma implements f31 {
  public static final ma a = (ma)new Object();
  
  public static final v70 b;
  
  public static final v70 c;
  
  static {
    j9 j9 = new j9(1);
    HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
    hashMap.put(ab1.class, j9);
    b = new v70("eventsDroppedCount", Collections.unmodifiableMap(new HashMap<Object, Object>(hashMap)));
    j9 = new j9(3);
    hashMap = new HashMap<Object, Object>();
    hashMap.put(ab1.class, j9);
    c = new v70("reason", Collections.unmodifiableMap(new HashMap<Object, Object>(hashMap)));
  }
  
  public final void a(Object paramObject1, Object paramObject2) {
    paramObject1 = paramObject1;
    paramObject2 = paramObject2;
    paramObject2.d(b, ((mp0)paramObject1).a);
    paramObject2.a(c, ((mp0)paramObject1).b);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\ma.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
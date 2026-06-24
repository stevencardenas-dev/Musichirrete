import java.util.Collections;
import java.util.HashMap;

public final class ka implements f31 {
  public static final ka a = (ka)new Object();
  
  public static final v70 b;
  
  public static final v70 c;
  
  public static final v70 d;
  
  public static final v70 e;
  
  static {
    j9 j94 = new j9(1);
    HashMap<Object, Object> hashMap2 = new HashMap<Object, Object>();
    hashMap2.put(ab1.class, j94);
    b = new v70("window", Collections.unmodifiableMap(new HashMap<Object, Object>(hashMap2)));
    j9 j92 = new j9(2);
    HashMap<Object, Object> hashMap4 = new HashMap<Object, Object>();
    hashMap4.put(ab1.class, j92);
    c = new v70("logSourceMetrics", Collections.unmodifiableMap(new HashMap<Object, Object>(hashMap4)));
    j9 j93 = new j9(3);
    HashMap<Object, Object> hashMap1 = new HashMap<Object, Object>();
    hashMap1.put(ab1.class, j93);
    d = new v70("globalMetrics", Collections.unmodifiableMap(new HashMap<Object, Object>(hashMap1)));
    j9 j91 = new j9(4);
    HashMap<Object, Object> hashMap3 = new HashMap<Object, Object>();
    hashMap3.put(ab1.class, j91);
    e = new v70("appNamespace", Collections.unmodifiableMap(new HashMap<Object, Object>(hashMap3)));
  }
  
  public final void a(Object paramObject1, Object paramObject2) {
    paramObject1 = paramObject1;
    paramObject2 = paramObject2;
    paramObject2.a(b, ((xl)paramObject1).a);
    paramObject2.a(c, ((xl)paramObject1).b);
    paramObject2.a(d, ((xl)paramObject1).c);
    paramObject2.a(e, ((xl)paramObject1).d);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\ka.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
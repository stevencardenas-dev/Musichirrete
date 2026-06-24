import java.util.Collections;
import java.util.HashMap;

public final class qa implements f31 {
  public static final qa a = (qa)new Object();
  
  public static final v70 b;
  
  public static final v70 c;
  
  static {
    j9 j91 = new j9(1);
    HashMap<Object, Object> hashMap2 = new HashMap<Object, Object>();
    hashMap2.put(ab1.class, j91);
    b = new v70("startMs", Collections.unmodifiableMap(new HashMap<Object, Object>(hashMap2)));
    j9 j92 = new j9(2);
    HashMap<Object, Object> hashMap1 = new HashMap<Object, Object>();
    hashMap1.put(ab1.class, j92);
    c = new v70("endMs", Collections.unmodifiableMap(new HashMap<Object, Object>(hashMap1)));
  }
  
  public final void a(Object paramObject1, Object paramObject2) {
    paramObject1 = paramObject1;
    paramObject2 = paramObject2;
    paramObject2.d(b, ((qu1)paramObject1).a);
    paramObject2.d(c, ((qu1)paramObject1).b);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\qa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
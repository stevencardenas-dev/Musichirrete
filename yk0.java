import in.krosbits.android.widgets.swipetoloadlayout.vZ.LHyji;
import java.io.Serializable;
import java.security.Key;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public abstract class yk0 implements Serializable {
  public final String b;
  
  public final String c;
  
  public final String e;
  
  public final List f;
  
  public final LinkedHashMap g;
  
  public Key h;
  
  public yk0(Map<?, ?> paramMap) {
    LinkedHashMap<Object, Object> linkedHashMap = new LinkedHashMap<Object, Object>();
    this.g = linkedHashMap;
    linkedHashMap.putAll(paramMap);
    f(new String[] { "kty", "use", "kid", "alg", "key_ops" });
    this.b = c("use", paramMap);
    this.c = c("kid", paramMap);
    this.e = c("alg", paramMap);
    if (paramMap.containsKey("key_ops"))
      this.f = (List)paramMap.get("key_ops"); 
  }
  
  public static String c(String paramString, Map paramMap) {
    paramString = (String)paramMap.get(paramString);
    try {
      return paramString;
    } catch (ClassCastException classCastException) {
      throw new Exception("");
    } 
  }
  
  public static String d(Map paramMap, String paramString, boolean paramBoolean) {
    String str = c(paramString, paramMap);
    if (str != null || !paramBoolean)
      return str; 
    throw new Exception("");
  }
  
  public static void e(String paramString, Object paramObject, LinkedHashMap<String, Object> paramLinkedHashMap) {
    if (paramObject != null)
      paramLinkedHashMap.put(paramString, paramObject); 
  }
  
  public abstract void a(LinkedHashMap paramLinkedHashMap);
  
  public abstract String b();
  
  public final void f(String... paramVarArgs) {
    int i = paramVarArgs.length;
    for (byte b = 0; b < i; b++) {
      String str = paramVarArgs[b];
      this.g.remove(str);
    } 
  }
  
  public final String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(getClass().getName());
    LinkedHashMap<Object, Object> linkedHashMap = new LinkedHashMap<Object, Object>();
    linkedHashMap.put("kty", b());
    e("kid", this.c, linkedHashMap);
    e(LHyji.lMyrjAlkVTJBH, this.b, linkedHashMap);
    e("key_ops", this.f, linkedHashMap);
    e("alg", this.e, linkedHashMap);
    a(linkedHashMap);
    linkedHashMap.putAll(this.g);
    stringBuilder.append(linkedHashMap);
    return stringBuilder.toString();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\yk0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
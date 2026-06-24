import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class q01 {
  public final int a;
  
  public final HashMap b = new HashMap<Object, Object>();
  
  public q01(int paramInt) {}
  
  public String a(String paramString) {
    if (paramString == null)
      return null; 
    if (paramString.isEmpty())
      return ""; 
    HashMap<String, String> hashMap = this.b;
    String str = (String)hashMap.get(paramString);
    if (str != null)
      return str; 
    hashMap.put(paramString, paramString);
    return paramString;
  }
  
  public void b(String paramString1, String paramString2, String paramString3) {
    HashMap hashMap = this.b;
    if (!hashMap.containsKey(paramString2))
      hashMap.put(paramString2, new HashMap<Object, Object>()); 
    ((Map<String, String>)hashMap.get(paramString2)).put(paramString1, paramString3);
  }
  
  public a42 c() {
    HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
    for (Map.Entry entry : this.b.entrySet())
      hashMap.put(entry.getKey(), Collections.unmodifiableMap(new HashMap<Object, Object>((Map<?, ?>)entry.getValue()))); 
    return new a42(21, Collections.unmodifiableMap(hashMap));
  }
  
  public void finalize() {
    switch (this.a) {
      default:
        super.finalize();
        return;
      case 0:
        break;
    } 
    this.b.clear();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\q01.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
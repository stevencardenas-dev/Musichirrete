import java.util.HashMap;

public final class zi extends HashMap {
  public final Object a(String paramString, Object paramObject) {
    return (paramString != null) ? super.put(paramString.toLowerCase(), paramObject) : super.put(paramString, paramObject);
  }
  
  public final boolean containsKey(Object paramObject) {
    return (paramObject instanceof String) ? super.containsKey(((String)paramObject).toLowerCase()) : super.containsKey(paramObject);
  }
  
  public final Object get(Object paramObject) {
    return (paramObject instanceof String) ? super.get(((String)paramObject).toLowerCase()) : super.get(paramObject);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\zi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
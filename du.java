import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public final class du {
  public static final du b;
  
  public final HashMap a;
  
  static {
    du du1 = new du(new LinkedHashMap<Object, Object>());
    ws2.n0(du1);
    b = du1;
  }
  
  public du(du paramdu) {
    this.a = new HashMap<Object, Object>(paramdu.a);
  }
  
  public du(LinkedHashMap<?, ?> paramLinkedHashMap) {
    this.a = new HashMap<Object, Object>(paramLinkedHashMap);
  }
  
  public final boolean a(String paramString) {
    paramString = (String)this.a.get(paramString);
    return (paramString != null && String.class.isAssignableFrom(paramString.getClass()));
  }
  
  public final boolean equals(Object paramObject) {
    if (this != paramObject) {
      if (paramObject == null || !du.class.equals(paramObject.getClass()))
        return false; 
      paramObject = ((du)paramObject).a;
      HashMap hashMap = this.a;
      Set set = hashMap.keySet();
      if (!ui0.c(set, paramObject.keySet()))
        return false; 
      for (String str : set) {
        Object object = hashMap.get(str);
        str = (String)paramObject.get(str);
        if (object == null || str == null) {
          if (object == str) {
            boolean bool1 = true;
          } else {
            boolean bool1 = false;
          } 
          continue;
        } 
        if (object instanceof Object[]) {
          Object[] arrayOfObject = (Object[])object;
          if (str instanceof Object[]) {
            boolean bool1 = g9.D0(arrayOfObject, (Object[])str);
            continue;
          } 
        } 
        boolean bool = object.equals(str);
        continue;
        if (SYNTHETIC_LOCAL_VARIABLE_2 == null)
          // Byte code: goto -> 192 
      } 
    } 
    return true;
  }
  
  public final int hashCode() {
    Iterator<Map.Entry> iterator = this.a.entrySet().iterator();
    int i;
    for (i = 0; iterator.hasNext(); i += j) {
      int j;
      Map.Entry entry = iterator.next();
      Object object = entry.getValue();
      if (object instanceof Object[]) {
        j = Objects.hashCode(entry.getKey()) ^ Arrays.deepHashCode((Object[])object);
      } else {
        j = entry.hashCode();
      } 
    } 
    return i * 31;
  }
  
  public final String toString() {
    return x41.n(new StringBuilder("Data {"), nm.p0(this.a.entrySet(), null, null, null, new ps(1), 31), "}");
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\du.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
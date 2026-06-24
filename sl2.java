import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public final class sl2 extends LinkedHashMap {
  public static final sl2 c;
  
  public boolean b = true;
  
  static {
    sl2 sl21 = new sl2();
    c = sl21;
    sl21.b = false;
  }
  
  public static int a(Object paramObject) {
    if (paramObject instanceof byte[]) {
      paramObject = paramObject;
      int i = paramObject.length;
      int j = il2.a(i, (byte[])paramObject, 0, i);
      i = j;
      if (j == 0)
        i = 1; 
      return i;
    } 
    if (!(paramObject instanceof on2))
      return paramObject.hashCode(); 
    throw new UnsupportedOperationException();
  }
  
  public final void b() {
    if (this.b)
      return; 
    throw new UnsupportedOperationException();
  }
  
  public final void clear() {
    b();
    super.clear();
  }
  
  public final Set entrySet() {
    return isEmpty() ? Collections.EMPTY_SET : super.entrySet();
  }
  
  public final boolean equals(Object paramObject) {
    if (paramObject instanceof Map) {
      paramObject = paramObject;
      if (this != paramObject) {
        if (size() != paramObject.size())
          return false; 
        for (Map.Entry entry : entrySet()) {
          if (paramObject.containsKey(entry.getKey())) {
            boolean bool;
            Object object = entry.getValue();
            entry = (Map.Entry)paramObject.get(entry.getKey());
            if (object instanceof byte[] && entry instanceof byte[]) {
              bool = Arrays.equals((byte[])object, (byte[])entry);
            } else {
              bool = object.equals(entry);
            } 
            if (!bool)
              // Byte code: goto -> 156 
            continue;
          } 
          // Byte code: goto -> 156
        } 
      } 
      return true;
    } 
    return false;
  }
  
  public final int hashCode() {
    Iterator<Map.Entry> iterator = entrySet().iterator();
    int i;
    for (i = 0; iterator.hasNext(); i += a(entry.getValue()) ^ j) {
      Map.Entry entry = iterator.next();
      int j = a(entry.getKey());
    } 
    return i;
  }
  
  public final Object put(Object paramObject1, Object paramObject2) {
    b();
    Charset charset = il2.a;
    paramObject1.getClass();
    paramObject2.getClass();
    return super.put(paramObject1, paramObject2);
  }
  
  public final void putAll(Map<?, ?> paramMap) {
    b();
    for (Object object : paramMap.keySet()) {
      Charset charset = il2.a;
      object.getClass();
      paramMap.get(object).getClass();
    } 
    super.putAll(paramMap);
  }
  
  public final Object remove(Object paramObject) {
    b();
    return super.remove(paramObject);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\sl2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
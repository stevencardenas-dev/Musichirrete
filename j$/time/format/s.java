package j$.time.format;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class s {
  public final Map a;
  
  public s(Map paramMap) {
    this.a = paramMap;
    HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
    ArrayList<?> arrayList = new ArrayList();
    for (Map.Entry entry : paramMap.entrySet()) {
      HashMap<Object, Object> hashMap1 = new HashMap<Object, Object>();
      for (Map.Entry entry1 : ((Map)entry.getValue()).entrySet()) {
        String str1 = (String)entry1.getValue();
        String str2 = (String)entry1.getValue();
        Long long_ = (Long)entry1.getKey();
        r r = c.b;
        hashMap1.put(str1, new AbstractMap.SimpleImmutableEntry<String, Long>(str2, long_));
      } 
      ArrayList<?> arrayList1 = new ArrayList(hashMap1.values());
      Collections.sort(arrayList1, c.b);
      hashMap.put(entry.getKey(), arrayList1);
      arrayList.addAll(arrayList1);
      hashMap.put(null, arrayList);
    } 
    Collections.sort(arrayList, c.b);
  }
  
  public final String a(long paramLong, w paramw) {
    Map map = (Map)this.a.get(paramw);
    return (map != null) ? (String)map.get(Long.valueOf(paramLong)) : null;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\j$\time\format\s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
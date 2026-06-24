import java.util.Iterator;
import java.util.LinkedHashMap;

public final class k32 {
  public final LinkedHashMap a = new LinkedHashMap<Object, Object>();
  
  public final void a() {
    LinkedHashMap linkedHashMap = this.a;
    Iterator<g32> iterator = linkedHashMap.values().iterator();
    while (iterator.hasNext())
      ((g32)iterator.next()).b(); 
    linkedHashMap.clear();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\k32.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

public class ji1 implements Iterable {
  public gi1 b;
  
  public gi1 c;
  
  public final WeakHashMap e = new WeakHashMap<Object, Object>();
  
  public int f = 0;
  
  public gi1 c(Object paramObject) {
    gi1 gi11;
    for (gi11 = this.b; gi11 != null && !gi11.b.equals(paramObject); gi11 = gi11.e);
    return gi11;
  }
  
  public Object d(Object paramObject) {
    paramObject = c(paramObject);
    if (paramObject == null)
      return null; 
    this.f--;
    WeakHashMap weakHashMap = this.e;
    if (!weakHashMap.isEmpty()) {
      Iterator<ii1> iterator = weakHashMap.keySet().iterator();
      while (iterator.hasNext())
        ((ii1)iterator.next()).a((gi1)paramObject); 
    } 
    gi1 gi11 = ((gi1)paramObject).f;
    gi1 gi12 = ((gi1)paramObject).e;
    if (gi11 != null) {
      gi11.e = gi12;
    } else {
      this.b = gi12;
    } 
    gi12 = ((gi1)paramObject).e;
    if (gi12 != null) {
      gi12.f = gi11;
    } else {
      this.c = gi11;
    } 
    ((gi1)paramObject).e = null;
    ((gi1)paramObject).f = null;
    return ((gi1)paramObject).c;
  }
  
  public final boolean equals(Object paramObject) {
    Map.Entry entry;
    if (paramObject == this)
      return true; 
    if (!(paramObject instanceof ji1))
      return false; 
    ji1 ji11 = (ji1)paramObject;
    if (this.f != ji11.f)
      return false; 
    paramObject = iterator();
    Iterator iterator = ji11.iterator();
    while (true) {
      fi1 fi1 = (fi1)paramObject;
      if (fi1.hasNext()) {
        fi1 fi11 = (fi1)iterator;
        if (fi11.hasNext()) {
          entry = (Map.Entry)fi1.next();
          Object object = fi11.next();
          if ((entry == null && object != null) || (entry != null && !entry.equals(object)))
            return false; 
          continue;
        } 
      } 
      break;
    } 
    return (!entry.hasNext() && !((fi1)iterator).hasNext());
  }
  
  public final int hashCode() {
    Iterator iterator = iterator();
    int i = 0;
    while (true) {
      fi1 fi1 = (fi1)iterator;
      if (fi1.hasNext()) {
        i += ((Map.Entry)fi1.next()).hashCode();
        continue;
      } 
      return i;
    } 
  }
  
  public final Iterator iterator() {
    fi1 fi1 = new fi1(this.b, this.c, 0);
    this.e.put(fi1, Boolean.FALSE);
    return fi1;
  }
  
  public final String toString() {
    StringBuilder stringBuilder = new StringBuilder("[");
    Iterator iterator = iterator();
    while (true) {
      fi1 fi1 = (fi1)iterator;
      if (fi1.hasNext()) {
        stringBuilder.append(((Map.Entry)fi1.next()).toString());
        if (fi1.hasNext())
          stringBuilder.append(", "); 
        continue;
      } 
      stringBuilder.append("]");
      return stringBuilder.toString();
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\ji1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
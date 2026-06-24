package j$.time.chrono;

import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;

public abstract class a implements m {
  public static final ConcurrentHashMap a = new ConcurrentHashMap<Object, Object>();
  
  public static final ConcurrentHashMap b = new ConcurrentHashMap<Object, Object>();
  
  static {
    new Locale("ja", "JP", "JP");
  }
  
  public static m r(m paramm, String paramString) {
    m m1 = a.putIfAbsent(paramString, paramm);
    if (m1 == null) {
      String str = paramm.p();
      if (str != null)
        b.putIfAbsent(str, paramm); 
    } 
    return m1;
  }
  
  public final int compareTo(Object paramObject) {
    paramObject = paramObject;
    return getId().compareTo(paramObject.getId());
  }
  
  public final boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject instanceof a) {
      paramObject = paramObject;
      if (getId().compareTo(paramObject.getId()) == 0)
        return true; 
    } 
    return false;
  }
  
  public final int hashCode() {
    int i = getClass().hashCode();
    return getId().hashCode() ^ i;
  }
  
  public final String toString() {
    return getId();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\j$\time\chrono\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
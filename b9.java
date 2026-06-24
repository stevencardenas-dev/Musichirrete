import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class b9 extends zm1 implements Map {
  public on0 f;
  
  public y8 g;
  
  public a9 h;
  
  public b9(zm1 paramzm1) {
    super(0);
    int i = paramzm1.e;
    b(this.e + i);
    if (this.e == 0) {
      if (i > 0) {
        g9.E0(0, 0, i, paramzm1.b, this.b);
        g9.F0(0, 0, i << 1, paramzm1.c, this.c);
        this.e = i;
        return;
      } 
    } else {
      while (b < i) {
        put(paramzm1.f(b), paramzm1.i(b));
        b++;
      } 
    } 
  }
  
  public final Set entrySet() {
    on0 on02 = this.f;
    on0 on01 = on02;
    if (on02 == null) {
      on01 = new on0(this, 2);
      this.f = on01;
    } 
    return on01;
  }
  
  public final boolean j(Collection paramCollection) {
    Iterator iterator = paramCollection.iterator();
    while (iterator.hasNext()) {
      if (!containsKey(iterator.next()))
        return false; 
    } 
    return true;
  }
  
  public final boolean k(Collection paramCollection) {
    int i = this.e;
    Iterator iterator = paramCollection.iterator();
    while (iterator.hasNext())
      remove(iterator.next()); 
    return (i != this.e);
  }
  
  public final Set keySet() {
    y8 y82 = this.g;
    y8 y81 = y82;
    if (y82 == null) {
      y81 = new y8(this);
      this.g = y81;
    } 
    return y81;
  }
  
  public final void putAll(Map paramMap) {
    int i = this.e;
    b(paramMap.size() + i);
    for (Map.Entry entry : paramMap.entrySet())
      put(entry.getKey(), entry.getValue()); 
  }
  
  public final Collection values() {
    a9 a92 = this.h;
    a9 a91 = a92;
    if (a92 == null) {
      a91 = new a9(this);
      this.h = a91;
    } 
    return a91;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\b9.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
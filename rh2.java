import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public abstract class rh2 extends xg2 implements Set {
  public transient ch2 c;
  
  public final boolean equals(Object paramObject) {
    if (paramObject != this) {
      if (paramObject == this)
        return true; 
      if (paramObject instanceof Set) {
        paramObject = paramObject;
        try {
          if (size() == paramObject.size()) {
            boolean bool = containsAll((Collection<?>)paramObject);
            return !!bool;
          } 
        } catch (NullPointerException|ClassCastException nullPointerException) {}
      } 
      return false;
    } 
    return true;
  }
  
  public ch2 f() {
    ch2 ch22 = this.c;
    ch2 ch21 = ch22;
    if (ch22 == null) {
      ch21 = i();
      this.c = ch21;
    } 
    return ch21;
  }
  
  public final int hashCode() {
    Iterator<E> iterator = iterator();
    int i;
    for (i = 0; iterator.hasNext(); i += b) {
      byte b;
      E e = iterator.next();
      if (e != null) {
        b = e.hashCode();
      } else {
        b = 0;
      } 
    } 
    return i;
  }
  
  public ch2 i() {
    Object[] arrayOfObject = toArray(xg2.b);
    yg2 yg2 = ch2.c;
    return ch2.j(arrayOfObject.length, arrayOfObject);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\rh2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
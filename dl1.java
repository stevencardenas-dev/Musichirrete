import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;

public final class dl1 extends v implements Serializable {
  public static final dl1 c = new dl1(kr0.p);
  
  public final kr0 b;
  
  public dl1() {
    this.b = kr01;
  }
  
  public dl1(kr0 paramkr0) {
    this.b = paramkr0;
  }
  
  public final boolean add(Object paramObject) {
    return (this.b.a(paramObject) >= 0);
  }
  
  public final boolean addAll(Collection<?> paramCollection) {
    paramCollection.getClass();
    this.b.c();
    return super.addAll(paramCollection);
  }
  
  public final int c() {
    return this.b.k;
  }
  
  public final void clear() {
    this.b.clear();
  }
  
  public final boolean contains(Object paramObject) {
    return this.b.containsKey(paramObject);
  }
  
  public final boolean isEmpty() {
    return this.b.isEmpty();
  }
  
  public final Iterator iterator() {
    kr0 kr01 = this.b;
    kr01.getClass();
    return new hr0(kr01, 1);
  }
  
  public final boolean remove(Object paramObject) {
    kr0 kr01 = this.b;
    kr01.c();
    int i = kr01.g(paramObject);
    if (i < 0)
      return false; 
    kr01.k(i);
    return true;
  }
  
  public final boolean removeAll(Collection<?> paramCollection) {
    paramCollection.getClass();
    this.b.c();
    return super.removeAll(paramCollection);
  }
  
  public final boolean retainAll(Collection<?> paramCollection) {
    paramCollection.getClass();
    this.b.c();
    return super.retainAll(paramCollection);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\dl1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
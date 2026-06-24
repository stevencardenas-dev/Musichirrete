import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

public final class e40 implements Serializable, fl0, Map {
  public static final e40 b = (e40)new Object();
  
  public final void clear() {
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
  
  public final boolean containsKey(Object paramObject) {
    return false;
  }
  
  public final boolean equals(Object paramObject) {
    return (paramObject instanceof Map && ((Map)paramObject).isEmpty());
  }
  
  public final int hashCode() {
    return 0;
  }
  
  public final boolean isEmpty() {
    return true;
  }
  
  public final void putAll(Map paramMap) {
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
  
  public final Object remove(Object paramObject) {
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
  
  public final boolean remove(Object paramObject1, Object paramObject2) {
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
  
  public final String toString() {
    return "{}";
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\e40.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
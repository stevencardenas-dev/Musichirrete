import android.support.v4.graphics.drawable.uUq.IGBYXeDFmKYajx;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public final class u8 implements Collection, fl0 {
  public final Object[] b;
  
  public u8(Object[] paramArrayOfObject) {
    this.b = paramArrayOfObject;
  }
  
  public final boolean add(Object paramObject) {
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
  
  public final boolean addAll(Collection paramCollection) {
    throw new UnsupportedOperationException(IGBYXeDFmKYajx.GCiZ);
  }
  
  public final void clear() {
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
  
  public final boolean contains(Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: getfield b : [Ljava/lang/Object;
    //   4: astore #4
    //   6: aload_1
    //   7: ifnonnull -> 37
    //   10: aload #4
    //   12: arraylength
    //   13: istore_3
    //   14: iconst_0
    //   15: istore_2
    //   16: iload_2
    //   17: iload_3
    //   18: if_icmpge -> 68
    //   21: aload #4
    //   23: iload_2
    //   24: aaload
    //   25: ifnonnull -> 31
    //   28: goto -> 70
    //   31: iinc #2, 1
    //   34: goto -> 16
    //   37: aload #4
    //   39: arraylength
    //   40: istore_3
    //   41: iconst_0
    //   42: istore_2
    //   43: iload_2
    //   44: iload_3
    //   45: if_icmpge -> 68
    //   48: aload_1
    //   49: aload #4
    //   51: iload_2
    //   52: aaload
    //   53: invokevirtual equals : (Ljava/lang/Object;)Z
    //   56: ifeq -> 62
    //   59: goto -> 70
    //   62: iinc #2, 1
    //   65: goto -> 43
    //   68: iconst_m1
    //   69: istore_2
    //   70: iload_2
    //   71: iflt -> 76
    //   74: iconst_1
    //   75: ireturn
    //   76: iconst_0
    //   77: ireturn
  }
  
  public final boolean containsAll(Collection paramCollection) {
    paramCollection.getClass();
    if (paramCollection.isEmpty())
      return true; 
    Iterator iterator = paramCollection.iterator();
    while (iterator.hasNext()) {
      if (!contains(iterator.next()))
        return false; 
    } 
    return true;
  }
  
  public final boolean isEmpty() {
    return (this.b.length == 0);
  }
  
  public final Iterator iterator() {
    return new q(1, this.b);
  }
  
  public final boolean remove(Object paramObject) {
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
  
  public final boolean removeAll(Collection paramCollection) {
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
  
  public final boolean retainAll(Collection paramCollection) {
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
  
  public final int size() {
    return this.b.length;
  }
  
  public final Object[] toArray() {
    Object[] arrayOfObject = this.b;
    if (arrayOfObject.getClass().equals(Object[].class))
      return arrayOfObject; 
    arrayOfObject = Arrays.copyOf(arrayOfObject, arrayOfObject.length, Object[].class);
    arrayOfObject.getClass();
    return arrayOfObject;
  }
  
  public final Object[] toArray(Object[] paramArrayOfObject) {
    paramArrayOfObject.getClass();
    return wf2.i0(this, paramArrayOfObject);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar\\u8.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
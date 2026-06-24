import java.util.AbstractList;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

public abstract class tm extends sm {
  public static void l0(AbstractList paramAbstractList, Iterable paramIterable) {
    paramIterable.getClass();
    if (paramIterable instanceof Collection) {
      paramAbstractList.addAll((Collection)paramIterable);
      return;
    } 
    Iterator iterator = paramIterable.iterator();
    while (iterator.hasNext())
      paramAbstractList.add(iterator.next()); 
  }
  
  public static Object m0(AbstractList paramAbstractList) {
    paramAbstractList.getClass();
    if (!paramAbstractList.isEmpty())
      return paramAbstractList.remove(paramAbstractList.size() - 1); 
    throw new NoSuchElementException("List is empty.");
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\tm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
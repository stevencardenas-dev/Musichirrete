import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class kg2 extends zv0 {
  public final void H(List paramList) {
    int i;
    Object[] arrayOfObject2 = (Object[])E();
    if (arrayOfObject2 == null) {
      i = 0;
    } else {
      i = arrayOfObject2.length;
    } 
    Object[] arrayOfObject1 = (Object[])Array.newInstance(((Field)this.e).getType().getComponentType(), paramList.size() + i);
    if (arrayOfObject2 != null)
      System.arraycopy(arrayOfObject2, 0, arrayOfObject1, 0, arrayOfObject2.length); 
    Iterator iterator = paramList.iterator();
    while (iterator.hasNext()) {
      arrayOfObject1[i] = iterator.next();
      i++;
    } 
    G(arrayOfObject1);
  }
  
  public final void I(Collection paramCollection) {
    Object[] arrayOfObject2 = (Object[])E();
    boolean bool = false;
    if (arrayOfObject2 == null) {
      i = 0;
    } else {
      i = arrayOfObject2.length;
    } 
    Object[] arrayOfObject1 = (Object[])Array.newInstance(((Field)this.e).getType().getComponentType(), paramCollection.size() + i);
    if (arrayOfObject2 != null)
      System.arraycopy(arrayOfObject2, 0, arrayOfObject1, paramCollection.size(), arrayOfObject2.length); 
    Iterator iterator = paramCollection.iterator();
    for (int i = bool; iterator.hasNext(); i++)
      arrayOfObject1[i] = iterator.next(); 
    G(arrayOfObject1);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\kg2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
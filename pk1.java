import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class pk1 extends qk1 {
  public static List e0(nk1 paramnk1) {
    Iterator<nk1> iterator = paramnk1.iterator();
    if (!iterator.hasNext())
      return d40.b; 
    paramnk1 = iterator.next();
    if (!iterator.hasNext())
      return zo2.E(paramnk1); 
    ArrayList<nk1> arrayList = new ArrayList();
    arrayList.add(paramnk1);
    while (iterator.hasNext())
      arrayList.add(iterator.next()); 
    return arrayList;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\pk1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
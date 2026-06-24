import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

public final class kb0 implements ib0 {
  public final lb0 a;
  
  public kb0(lb0 paramlb0) {
    this.a = paramlb0;
  }
  
  public final boolean a(ArrayList<lb0> paramArrayList1, ArrayList<Boolean> paramArrayList2) {
    boolean bool;
    lb0 lb01 = this.a;
    ArrayList<ArrayList<lb0>> arrayList = lb01.n;
    if (lb0.M(2)) {
      StringBuilder stringBuilder = new StringBuilder("FragmentManager has the following pending actions inside of prepareBackStackState: ");
      stringBuilder.append(lb01.a);
      Log.v("FragmentManager", stringBuilder.toString());
    } 
    if (lb01.d.isEmpty()) {
      Log.i("FragmentManager", "Ignoring call to start back stack pop because the back stack is empty.");
      bool = false;
    } else {
      ArrayList<lb> arrayList2 = lb01.d;
      lb lb = arrayList2.get(arrayList2.size() - 1);
      lb01.h = lb;
      ArrayList<Object> arrayList1 = lb.a;
      int j = arrayList1.size();
      int i = 0;
      while (i < j) {
        ua0 ua0 = (ua0)arrayList1.get(i);
        int k = i + 1;
        ua0 = ((vb0)ua0).b;
        i = k;
        if (ua0 != null) {
          ua0.p = true;
          i = k;
        } 
      } 
      bool = lb01.V(paramArrayList1, paramArrayList2, -1, 0);
    } 
    if (!arrayList.isEmpty() && paramArrayList1.size() > 0) {
      ((Boolean)paramArrayList2.get(paramArrayList1.size() - 1)).getClass();
      LinkedHashSet linkedHashSet = new LinkedHashSet();
      int i = paramArrayList1.size();
      byte b = 0;
      while (b < i) {
        lb01 = paramArrayList1.get(b);
        b++;
        linkedHashSet.addAll(lb0.G((lb)lb01));
      } 
      i = arrayList.size();
      b = 0;
      while (b < i) {
        paramArrayList1 = arrayList.get(b);
        b++;
        if (paramArrayList1 == null) {
          Iterator<ua0> iterator = linkedHashSet.iterator();
          if (!iterator.hasNext())
            continue; 
          ua0 ua0 = iterator.next();
          throw null;
        } 
        tp.b();
        return false;
      } 
    } 
    return bool;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\kb0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
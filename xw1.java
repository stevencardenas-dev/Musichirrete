import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;

public final class xw1 implements Iterator, fl0 {
  public final ArrayList b = new ArrayList();
  
  public Iterator c;
  
  public xw1(q paramq) {
    this.c = paramq;
  }
  
  public final boolean hasNext() {
    return this.c.hasNext();
  }
  
  public final Object next() {
    View view2 = (View)this.c.next();
    View view1 = view2;
    boolean bool = view1 instanceof ViewGroup;
    q q = null;
    if (bool) {
      ViewGroup viewGroup = (ViewGroup)view1;
    } else {
      view1 = null;
    } 
    if (view1 != null)
      q = new q(2, view1); 
    ArrayList<Iterator> arrayList = this.b;
    if (q != null && q.hasNext()) {
      arrayList.add(this.c);
      this.c = q;
      return view2;
    } 
    while (!this.c.hasNext() && !arrayList.isEmpty()) {
      this.c = (Iterator)nm.q0(arrayList);
      tm.m0(arrayList);
    } 
    return view2;
  }
  
  public final void remove() {
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\xw1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
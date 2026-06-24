import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;

public final class ae1 extends kd1 {
  public final RecyclerView a;
  
  public ae1(RecyclerView paramRecyclerView) {
    this.a = paramRecyclerView;
  }
  
  public final void a() {
    RecyclerView recyclerView = this.a;
    recyclerView.j(null);
    recyclerView.j0.f = true;
    recyclerView.b0(true);
    if (!recyclerView.g.j())
      recyclerView.requestLayout(); 
  }
  
  public final void b(int paramInt1, int paramInt2, Object paramObject) {
    RecyclerView recyclerView = this.a;
    recyclerView.j(null);
    v2 v2 = recyclerView.g;
    ArrayList<u2> arrayList = (ArrayList)v2.c;
    if (paramInt2 >= 1) {
      arrayList.add(v2.l(paramObject, 4, paramInt1, paramInt2));
      v2.a |= 0x4;
      if (arrayList.size() == 1)
        f(); 
    } 
  }
  
  public final void c(int paramInt1, int paramInt2) {
    RecyclerView recyclerView = this.a;
    recyclerView.j(null);
    v2 v2 = recyclerView.g;
    ArrayList<u2> arrayList = (ArrayList)v2.c;
    if (paramInt2 >= 1) {
      arrayList.add(v2.l(null, 1, paramInt1, paramInt2));
      v2.a |= 0x1;
      if (arrayList.size() == 1)
        f(); 
    } 
  }
  
  public final void d(int paramInt1, int paramInt2) {
    RecyclerView recyclerView = this.a;
    recyclerView.j(null);
    v2 v2 = recyclerView.g;
    ArrayList<u2> arrayList = (ArrayList)v2.c;
    if (paramInt1 != paramInt2) {
      arrayList.add(v2.l(null, 8, paramInt1, paramInt2));
      v2.a |= 0x8;
      if (arrayList.size() == 1)
        f(); 
    } 
  }
  
  public final void e(int paramInt1, int paramInt2) {
    RecyclerView recyclerView = this.a;
    recyclerView.j(null);
    v2 v2 = recyclerView.g;
    ArrayList<u2> arrayList = (ArrayList)v2.c;
    if (paramInt2 >= 1) {
      arrayList.add(v2.l(null, 2, paramInt1, paramInt2));
      v2.a |= 0x2;
      if (arrayList.size() == 1)
        f(); 
    } 
  }
  
  public final void f() {
    RecyclerView recyclerView = this.a;
    if (recyclerView.v && recyclerView.u) {
      hd1 hd1 = recyclerView.k;
      WeakHashMap weakHashMap = v22.a;
      recyclerView.postOnAnimation(hd1);
      return;
    } 
    recyclerView.C = true;
    recyclerView.requestLayout();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\ae1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
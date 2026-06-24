import android.util.Log;
import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

public final class l90 {
  public final ArrayList a = new ArrayList();
  
  public boolean b;
  
  public final CopyOnWriteArrayList c;
  
  public final int d;
  
  public final Object e;
  
  public l90(lb0 paramlb0) {
    this(false);
  }
  
  public l90(boolean paramBoolean) {
    this.b = paramBoolean;
    this.c = new CopyOnWriteArrayList();
  }
  
  public void a() {
    switch (this.d) {
      default:
        return;
      case 1:
        break;
    } 
    lb0 lb0 = (lb0)this.e;
    if (lb0.M(3)) {
      StringBuilder stringBuilder = new StringBuilder("handleOnBackCancelled. PREDICTIVE_BACK = true fragment manager ");
      stringBuilder.append(lb0);
      Log.d("FragmentManager", stringBuilder.toString());
    } 
    if (lb0.M(3)) {
      StringBuilder stringBuilder = new StringBuilder("cancelBackStackTransition for transition ");
      stringBuilder.append(lb0.h);
      Log.d("FragmentManager", stringBuilder.toString());
    } 
    lb lb = lb0.h;
    if (lb != null) {
      lb.s = false;
      lb.e();
      lb = lb0.h;
      e e = new e(20, lb0);
      if (lb.q == null)
        lb.q = new ArrayList(); 
      lb.q.add(e);
      lb0.h.f();
      lb0.i = true;
      lb0.C();
      lb0.i = false;
      lb0.h = null;
    } 
  }
  
  public final void b() {}
  
  public final void c(kb paramkb) {}
  
  public final void d(kb paramkb) {}
  
  public final void e(boolean paramBoolean) {
    this.b = paramBoolean;
    ArrayList<Object> arrayList = this.a;
    int j = arrayList.size();
    int i = 0;
    while (i < j) {
      boolean bool;
      w31 w31 = (w31)arrayList.get(i);
      int k = i + 1;
      w31 = w31;
      if (w31.e && paramBoolean) {
        bool = true;
      } else {
        bool = false;
      } 
      if (w31.b == bool) {
        i = k;
        continue;
      } 
      w31.b = bool;
      n2 n2 = w31.c;
      i = k;
      if (n2 != null) {
        e11 e11 = (e11)n2.e;
        i = k;
        if (e11 != null) {
          e11.b();
          i = k;
        } 
      } 
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\l90.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
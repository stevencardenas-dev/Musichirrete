import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.CopyOnWriteArrayList;

public abstract class ad {
  public final ArrayList a = new ArrayList(1);
  
  public final HashSet b = new HashSet(1);
  
  public final d7 c = new d7(new CopyOnWriteArrayList(), 0, null);
  
  public Looper d;
  
  public uu1 e;
  
  public abstract nt0 a(fw0 paramfw0, uv paramuv, long paramLong);
  
  public final void b(gw0 paramgw0) {
    HashSet hashSet = this.b;
    boolean bool = hashSet.isEmpty();
    hashSet.remove(paramgw0);
    if (!bool && hashSet.isEmpty())
      c(); 
  }
  
  public void c() {}
  
  public final void d(gw0 paramgw0) {
    this.d.getClass();
    HashSet<gw0> hashSet = this.b;
    boolean bool = hashSet.isEmpty();
    hashSet.add(paramgw0);
    if (bool)
      e(); 
  }
  
  public void e() {}
  
  public abstract Object f();
  
  public abstract void g();
  
  public final void h(gw0 paramgw0, wv paramwv) {
    boolean bool;
    Looper looper1 = Looper.myLooper();
    Looper looper2 = this.d;
    if (looper2 == null || looper2 == looper1) {
      bool = true;
    } else {
      bool = false;
    } 
    n21.h(bool);
    uu1 uu11 = this.e;
    this.a.add(paramgw0);
    if (this.d == null) {
      this.d = looper1;
      this.b.add(paramgw0);
      i(paramwv);
      return;
    } 
    if (uu11 != null) {
      d(paramgw0);
      paramgw0.a(this, uu11);
    } 
  }
  
  public abstract void i(wv paramwv);
  
  public final void j(uu1 paramuu1) {
    this.e = paramuu1;
    ArrayList<Object> arrayList = this.a;
    int i = arrayList.size();
    byte b = 0;
    while (b < i) {
      gw0 gw0 = (gw0)arrayList.get(b);
      b++;
      ((gw0)gw0).a(this, paramuu1);
    } 
  }
  
  public abstract void k(nt0 paramnt0);
  
  public final void l(gw0 paramgw0) {
    ArrayList arrayList = this.a;
    arrayList.remove(paramgw0);
    if (arrayList.isEmpty()) {
      this.d = null;
      this.e = null;
      this.b.clear();
      m();
      return;
    } 
    b(paramgw0);
  }
  
  public abstract void m();
  
  public final void n(jw0 paramjw0) {
    CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList)this.c.e;
    for (iw0 iw0 : copyOnWriteArrayList) {
      if (iw0.b == paramjw0)
        copyOnWriteArrayList.remove(iw0); 
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\ad.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
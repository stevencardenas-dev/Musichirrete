import android.os.Handler;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public abstract class vo extends ad {
  public final HashMap f = new HashMap<Object, Object>();
  
  public Handler g;
  
  public wv h;
  
  public void c() {
    for (uo uo : this.f.values())
      uo.a.b(uo.b); 
  }
  
  public void e() {
    for (uo uo : this.f.values())
      uo.a.d(uo.b); 
  }
  
  public void g() {
    Iterator iterator = this.f.values().iterator();
    while (iterator.hasNext())
      ((uo)iterator.next()).a.g(); 
  }
  
  public void m() {
    HashMap hashMap = this.f;
    for (uo uo : hashMap.values()) {
      uo.a.l(uo.b);
      uo.a.n(uo.c);
    } 
    hashMap.clear();
  }
  
  public abstract fw0 o(Object paramObject, fw0 paramfw0);
  
  public int p(int paramInt, Object paramObject) {
    return paramInt;
  }
  
  public abstract void q(Object paramObject, uu1 paramuu1);
  
  public final void r(dp paramdp, ad paramad) {
    HashMap<dp, uo> hashMap = this.f;
    n21.h(hashMap.containsKey(paramdp) ^ true);
    to to = new to(this, paramdp);
    zv0 zv0 = new zv0(this, paramdp);
    hashMap.put(paramdp, new uo(paramad, to, zv0));
    Handler handler = this.g;
    handler.getClass();
    d7 d7 = paramad.c;
    d7.getClass();
    ((CopyOnWriteArrayList<iw0>)d7.e).add(new iw0(handler, zv0));
    paramad.h(to, this.h);
    if (this.b.isEmpty())
      paramad.b(to); 
  }
  
  public boolean s(fw0 paramfw0) {
    return true;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\vo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
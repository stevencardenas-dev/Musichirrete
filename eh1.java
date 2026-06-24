import android.os.Looper;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

public abstract class eh1 {
  public as a;
  
  public Executor b;
  
  public tk1 c;
  
  public ah1 d;
  
  public yi0 e;
  
  public final g7 f = new g7((dh1)new jd0(0, this, eh1.class, "onClosed", "onClosed()V", 0, 0));
  
  public boolean g;
  
  public final ThreadLocal h = new ThreadLocal();
  
  public final LinkedHashMap i = new LinkedHashMap<Object, Object>();
  
  public boolean j = true;
  
  public final void a() {
    if (!this.g) {
      boolean bool;
      if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
        bool = true;
      } else {
        bool = false;
      } 
      if (bool) {
        tp.f("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        return;
      } 
    } 
  }
  
  public final void b() {
    a();
    a();
    ac0 ac0 = g().M();
    if (!ac0.l())
      g92.b0(new tq(f(), null, 2)); 
    if (ac0.b.isWriteAheadLoggingEnabled()) {
      ac0.c();
      return;
    } 
    ac0.a();
  }
  
  public List c(LinkedHashMap paramLinkedHashMap) {
    LinkedHashMap<Object, Object> linkedHashMap = new LinkedHashMap<Object, Object>(or0.a0(paramLinkedHashMap.size()));
    for (Map.Entry entry : paramLinkedHashMap.entrySet()) {
      ll ll = (ll)entry.getKey();
      ll.getClass();
      Class clazz = ll.a();
      clazz.getClass();
      linkedHashMap.put(clazz, entry.getValue());
    } 
    return d40.b;
  }
  
  public abstract yi0 d();
  
  public f51 e() {
    throw new j21(0);
  }
  
  public final yi0 f() {
    yi0 yi01 = this.e;
    if (yi01 != null)
      return yi01; 
    ui0.n0("internalTracker");
    throw null;
  }
  
  public final ir1 g() {
    ah1 ah11 = this.d;
    if (ah11 != null) {
      ir1 ir1 = ah11.c();
      if (ir1 != null)
        return ir1; 
      tp.f("Cannot return a SupportSQLiteOpenHelper since no SupportSQLiteOpenHelper.Factory was configured with Room.");
      return null;
    } 
    ui0.n0("connectionManager");
    throw null;
  }
  
  public Set h() {
    return nm.x0(new ArrayList(pm.k0(f40.b)));
  }
  
  public LinkedHashMap i() {
    int j = or0.a0(pm.k0(f40.b));
    int i = j;
    if (j < 16)
      i = 16; 
    return new LinkedHashMap<Object, Object>(i);
  }
  
  public final boolean j() {
    ah1 ah11 = this.d;
    if (ah11 != null)
      return (ah11.c() != null); 
    ui0.n0("connectionManager");
    throw null;
  }
  
  public final boolean k() {
    return (m() && g().M().l());
  }
  
  public final void l() {
    g().M().g();
    if (!k()) {
      yi0 yi01 = f();
      yi01.b.e(yi01.e, yi01.f);
    } 
  }
  
  public final boolean m() {
    ah1 ah11 = this.d;
    if (ah11 != null) {
      ac0 ac0 = ah11.g;
      return (ac0 != null) ? ac0.b.isOpen() : false;
    } 
    ui0.n0("connectionManager");
    throw null;
  }
  
  public final Object n(Callable<Callable> paramCallable) {
    b();
    try {
      paramCallable = paramCallable.call();
      o();
      return paramCallable;
    } finally {
      l();
    } 
  }
  
  public final void o() {
    g().M().m();
  }
  
  public final Object p(boolean paramBoolean, ad0 paramad0, ds paramds) {
    ah1 ah11 = this.d;
    if (ah11 != null)
      return ah11.f.t(paramBoolean, paramad0, paramds); 
    ui0.n0("connectionManager");
    throw null;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\eh1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
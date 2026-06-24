import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.concurrent.CopyOnWriteArrayList;

public final class p60 extends hd {
  public final oz0 b;
  
  public final zv0 c;
  
  public final cj d;
  
  public final t60 e;
  
  public final Handler f;
  
  public final CopyOnWriteArrayList g;
  
  public final su1 h;
  
  public final ArrayDeque i;
  
  public boolean j;
  
  public int k;
  
  public int l;
  
  public boolean m;
  
  public boolean n;
  
  public int o;
  
  public r71 p;
  
  public q71 q;
  
  public int r;
  
  public int s;
  
  public long t;
  
  public p60(lz0[] paramArrayOflz0, zv0 paramzv0, nw paramnw, wv paramwv, Looper paramLooper) {
    boolean bool;
    StringBuilder stringBuilder = new StringBuilder("Init ");
    stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
    stringBuilder.append(" [ExoPlayerLib/2.11.8] [");
    stringBuilder.append(d12.d);
    stringBuilder.append("]");
    Log.i("ExoPlayerImpl", stringBuilder.toString());
    if (paramArrayOflz0.length > 0) {
      bool = true;
    } else {
      bool = false;
    } 
    n21.r(bool);
    this.c = paramzv0;
    this.j = false;
    this.g = new CopyOnWriteArrayList();
    oz0 oz01 = new oz0(new pf1[paramArrayOflz0.length], new zd[paramArrayOflz0.length], null);
    this.b = oz01;
    this.h = new su1();
    this.p = r71.d;
    bk1 bk1 = bk1.c;
    this.k = 0;
    cj cj1 = new cj(this, paramLooper, 2);
    this.d = cj1;
    vv1 vv1 = vv1.f;
    ru1 ru1 = uu1.a;
    fw0 fw0 = q71.n;
    this.q = new q71(ru1, fw0, 0L, -9223372036854775807L, 1, null, false, vv1, oz01, fw0, 0L, 0L, 0L);
    this.i = new ArrayDeque();
    t60 t601 = new t60(paramArrayOflz0, paramzv0, oz01, paramnw, paramwv, this.j, cj1);
    this.e = t601;
    this.f = new Handler(t601.j.getLooper());
  }
  
  public final boolean c() {
    return this.j;
  }
  
  public final int d() {
    return this.q.e;
  }
  
  public final int e() {
    return this.k;
  }
  
  public final a81 l(lz0 paramlz0) {
    uu1 uu1 = this.q.a;
    int i = n();
    Handler handler = this.f;
    return new a81(this.e, paramlz0, uu1, i, handler);
  }
  
  public final long m() {
    if (s())
      return this.t; 
    boolean bool = this.q.b.b();
    q71 q711 = this.q;
    if (bool)
      return rh.b(q711.m); 
    fw0 fw0 = q711.b;
    long l = rh.b(q711.m);
    uu1 uu1 = this.q.a;
    Object object = fw0.a;
    su1 su11 = this.h;
    uu1.g(object, su11);
    return rh.b(su11.e) + l;
  }
  
  public final int n() {
    if (s())
      return this.r; 
    q71 q711 = this.q;
    return (q711.a.g(q711.b.a, this.h)).c;
  }
  
  public final q71 o(boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, int paramInt) {
    boolean bool;
    long l2;
    fw0 fw0;
    uu1 uu1;
    l60 l60;
    vv1 vv1;
    oz0 oz01;
    long l1 = 0L;
    if (paramBoolean1) {
      this.r = 0;
      this.s = 0;
      this.t = 0L;
    } else {
      this.r = n();
      if (s()) {
        bool = this.s;
      } else {
        q71 q712 = this.q;
        bool = q712.a.b(q712.b.a);
      } 
      this.s = bool;
      this.t = m();
    } 
    if (paramBoolean1 || paramBoolean2) {
      bool = true;
    } else {
      bool = false;
    } 
    q71 q711 = this.q;
    if (bool) {
      fw0 = q711.d(false, (tu1)this.a, this.h);
    } else {
      fw0 = ((q71)fw0).b;
    } 
    if (!bool)
      l1 = this.q.m; 
    if (bool) {
      l2 = -9223372036854775807L;
    } else {
      l2 = this.q.d;
    } 
    if (paramBoolean2) {
      uu1 = uu1.a;
    } else {
      uu1 = this.q.a;
    } 
    if (paramBoolean3) {
      l60 = null;
    } else {
      l60 = this.q.f;
    } 
    if (paramBoolean2) {
      vv1 = vv1.f;
    } else {
      vv1 = this.q.h;
    } 
    if (paramBoolean2) {
      oz01 = this.b;
    } else {
      oz01 = this.q.i;
    } 
    return new q71(uu1, fw0, l1, l2, paramInt, l60, false, vv1, oz01, fw0, l1, 0L, l1);
  }
  
  public final boolean p() {
    return (!s() && this.q.b.b());
  }
  
  public final void q(gd paramgd) {
    r(new e6(5, new CopyOnWriteArrayList(this.g), paramgd));
  }
  
  public final void r(Runnable paramRunnable) {
    ArrayDeque<Runnable> arrayDeque = this.i;
    boolean bool = arrayDeque.isEmpty();
    arrayDeque.addLast(paramRunnable);
    if (!bool)
      return; 
    while (true) {
      try {
        if (!arrayDeque.isEmpty()) {
          paramRunnable = arrayDeque.peekFirst();
          if (paramRunnable != null)
            paramRunnable.run(); 
          arrayDeque.removeFirst();
          continue;
        } 
        continue;
      } finally {
        paramRunnable = null;
        paramRunnable.printStackTrace();
        arrayDeque.clear();
      } 
    } 
  }
  
  public final boolean s() {
    return (this.q.a.n() || this.l > 0);
  }
  
  public final void t(q71 paramq71, boolean paramBoolean1, int paramInt1, int paramInt2, boolean paramBoolean2) {
    boolean bool3 = f();
    q71 q711 = this.q;
    this.q = paramq71;
    boolean bool1 = f();
    boolean bool2 = this.j;
    if (bool3 != bool1) {
      bool1 = true;
    } else {
      bool1 = false;
    } 
    r(new o60(paramq71, q711, this.g, this.c, paramBoolean1, paramInt1, paramInt2, paramBoolean2, bool2, bool1));
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\p60.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
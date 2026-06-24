import android.os.Handler;
import android.util.Pair;
import java.util.concurrent.CopyOnWriteArrayList;

public final class ur0 extends vo {
  public final ad i;
  
  public final boolean j;
  
  public final tu1 k;
  
  public final su1 l;
  
  public tr0 m;
  
  public rr0 n;
  
  public d7 o;
  
  public boolean p;
  
  public boolean q;
  
  public ur0(ad paramad, boolean paramBoolean) {
    this.i = paramad;
    this.j = paramBoolean;
    this.k = new tu1();
    this.l = new su1();
    this.m = new tr0(new sr0(paramad.f()), tu1.k, tr0.e);
  }
  
  public final Object f() {
    return this.i.f();
  }
  
  public final void g() {}
  
  public final void i(wv paramwv) {
    this.h = paramwv;
    this.g = new Handler();
    if (!this.j) {
      this.p = true;
      r(null, this.i);
    } 
  }
  
  public final void k(nt0 paramnt0) {
    rr0 rr01 = (rr0)paramnt0;
    nt0 nt01 = rr01.f;
    if (nt01 != null)
      rr01.b.k(nt01); 
    if (paramnt0 == this.n) {
      d7 d71 = this.o;
      d71.getClass();
      d71.g();
      this.o = null;
      this.n = null;
    } 
  }
  
  public final void m() {
    this.q = false;
    this.p = false;
    super.m();
  }
  
  public final fw0 o(Object paramObject, fw0 paramfw0) {
    paramObject = paramObject;
    Object object = paramfw0.a;
    paramObject = object;
    if (this.m.d.equals(object))
      paramObject = tr0.e; 
    return paramfw0.a(paramObject);
  }
  
  public final void q(Object paramObject, uu1 paramuu1) {
    paramObject = paramObject;
    if (this.q) {
      paramObject = this.m;
      this.m = new tr0(paramuu1, ((tr0)paramObject).c, ((tr0)paramObject).d);
    } else {
      boolean bool = paramuu1.n();
      Object object = tr0.e;
      if (bool) {
        this.m = new tr0(paramuu1, tu1.k, object);
      } else {
        tu1 tu11 = this.k;
        paramuu1.l(0, tu11, 0L);
        long l2 = tu11.i;
        paramObject = this.n;
        long l1 = l2;
        if (paramObject != null) {
          long l = ((rr0)paramObject).h;
          l1 = l2;
          if (l != 0L)
            l1 = l; 
        } 
        paramObject = tu11.a;
        Pair pair = paramuu1.i(tu11, this.l, 0, l1);
        Object object1 = pair.first;
        l1 = ((Long)pair.second).longValue();
        this.m = new tr0(paramuu1, paramObject, object1);
        object1 = this.n;
        if (object1 != null) {
          ((rr0)object1).i = l1;
          fw0 fw0 = ((rr0)object1).c;
          Object object2 = fw0.a;
          paramObject = object2;
          if (object2.equals(object))
            paramObject = this.m.d; 
          object1.f(fw0.a(paramObject));
        } 
      } 
    } 
    this.q = true;
    j(this.m);
  }
  
  public final boolean s(fw0 paramfw0) {
    rr0 rr01 = this.n;
    return (rr01 == null || !paramfw0.equals(rr01.c));
  }
  
  public final rr0 t(fw0 paramfw0, uv paramuv, long paramLong) {
    rr0 rr01 = new rr0(this.i, paramfw0, paramuv, paramLong);
    if (this.q) {
      Object object2 = paramfw0.a;
      Object object1 = object2;
      if (object2.equals(tr0.e))
        object1 = this.m.d; 
      rr01.f(paramfw0.a(object1));
      return rr01;
    } 
    this.n = rr01;
    d7 d71 = new d7((CopyOnWriteArrayList)this.c.e, 0, paramfw0);
    this.o = d71;
    d71.f();
    if (!this.p) {
      this.p = true;
      r(null, this.i);
    } 
    return rr01;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar\\ur0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
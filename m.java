public abstract class m extends dk0 implements cs, xs {
  public final os g;
  
  public m(os paramos, boolean paramBoolean) {
    super(paramBoolean);
    L((vj0)paramos.l(vs2.g));
    this.g = paramos.k(this);
  }
  
  public final void K(co paramco) {
    m92.G(this.g, paramco);
  }
  
  public final void V(Object paramObject) {
    if (paramObject instanceof bo) {
      boolean bool;
      paramObject = paramObject;
      Throwable throwable = ((bo)paramObject).a;
      if (bo.b.get(paramObject) != 0) {
        bool = true;
      } else {
        bool = false;
      } 
      h0(throwable, bool);
      return;
    } 
    i0(paramObject);
  }
  
  public final os e() {
    return this.g;
  }
  
  public final void f(Object paramObject) {
    Throwable throwable = rg1.a(paramObject);
    if (throwable != null)
      paramObject = new bo(throwable, false); 
    paramObject = R(paramObject);
    if (paramObject == wf2.g)
      return; 
    s(paramObject);
  }
  
  public final os g() {
    return this.g;
  }
  
  public void h0(Throwable paramThrowable, boolean paramBoolean) {}
  
  public void i0(Object paramObject) {}
  
  public final void j0(at paramat, m paramm, ad0 paramad0) {
    int i = paramat.ordinal();
    null = l02.a;
    if (i != 0) {
      if (i != 1) {
        if (i != 2) {
          if (i == 3) {
            Object object;
            try {
              os os1 = this.g;
              object = wf2.m0(os1, null);
              try {
                qz1.d(2, paramad0);
                Object object1 = paramad0.g(paramm, this);
                wf2.X(os1, object);
                if (object1 != ys.b) {
                  f(object1);
                  return;
                } 
              } finally {}
            } finally {}
            wf2.X((os)null, object);
            throw paramm;
          } 
          throw new RuntimeException();
        } 
        dd1.N(((uc)paramad0).l(this, paramm)).f(null);
      } 
      return;
    } 
    try {
      return;
    } finally {
      f(new qg1((Throwable)null));
    } 
  }
  
  public final String x() {
    return getClass().getSimpleName().concat(" was cancelled");
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
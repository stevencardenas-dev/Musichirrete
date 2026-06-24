public abstract class rs extends n implements ms {
  public static final qs c = new qs(vs2.c, new ps(0));
  
  public rs() {
    super(vs2.c);
  }
  
  public final ms l(ns paramns) {
    ms ms1;
    paramns.getClass();
    if (paramns instanceof qs) {
      paramns = paramns;
      ns ns1 = this.b;
      if (ns1 == paramns || ((qs)paramns).c == ns1) {
        ms1 = (ms)((qs)paramns).b.h(this);
        return (ms1 != null) ? ms1 : null;
      } 
      return null;
    } 
    return (vs2.c == ms1) ? this : null;
  }
  
  public abstract void m(os paramos, Runnable paramRunnable);
  
  public final os o(ns paramns) {
    paramns.getClass();
    if (paramns instanceof qs) {
      paramns = paramns;
      ns ns1 = this.b;
      if (ns1 == paramns || ((qs)paramns).c == ns1) {
        rs rs2 = this;
        return (os)(((ms)((qs)paramns).b.h(this) != null) ? b40.b : rs2);
      } 
      return this;
    } 
    rs rs1 = this;
    return (os)((vs2.c == paramns) ? b40.b : rs1);
  }
  
  public void p(os paramos, Runnable paramRunnable) {
    m(paramos, paramRunnable);
  }
  
  public boolean q(os paramos) {
    return this instanceof e02 ^ true;
  }
  
  public rs r(int paramInt) {
    m92.g(paramInt);
    return new ym0(this, paramInt);
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(getClass().getSimpleName());
    stringBuilder.append('@');
    stringBuilder.append(qv.s(this));
    return stringBuilder.toString();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\rs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
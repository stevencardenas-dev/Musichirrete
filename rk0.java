public final class rk0 extends nk0 {
  public final qn0 b;
  
  public rk0() {
    ij ij = qn0.k;
    this.b = new qn0(false);
  }
  
  public final boolean equals(Object paramObject) {
    return (paramObject == this || (paramObject instanceof rk0 && ((rk0)paramObject).b.equals(this.b)));
  }
  
  public final int hashCode() {
    return this.b.hashCode();
  }
  
  public final void j(String paramString, nk0 paramnk0) {
    this.b.put(paramString, paramnk0);
  }
  
  public final void k(String paramString, Number paramNumber) {
    sk0 sk0 = new sk0(paramNumber);
    this.b.put(paramString, sk0);
  }
  
  public final void l(String paramString1, String paramString2) {
    qk0 qk0;
    sk0 sk0;
    if (paramString2 == null) {
      qk0 = qk0.b;
    } else {
      sk0 = new sk0((String)qk0);
    } 
    j(paramString1, sk0);
  }
  
  public final nk0 m(String paramString) {
    return (nk0)this.b.get(paramString);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\rk0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
public final class pk extends yj0 {
  public final ni j;
  
  public pk(ni paramni) {
    this.j = paramni;
  }
  
  public final boolean r() {
    return true;
  }
  
  public final void s(Throwable paramThrowable) {
    boolean bool;
    dk0 dk0 = q();
    ni ni1 = this.j;
    Throwable throwable = ni1.t(dk0);
    if (!ni1.B()) {
      bool = false;
    } else {
      bool = ((xz)ni1.f).r(throwable);
    } 
    if (!bool) {
      ni1.p(throwable);
      if (!ni1.B())
        ni1.r(); 
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\pk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
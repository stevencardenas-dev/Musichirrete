public class xj0 extends dk0 {
  public final boolean g;
  
  public xj0(vj0 paramvj0) {
    super(true);
    L(paramvj0);
    qk qk = H();
    if (qk instanceof rk) {
      qk = qk;
    } else {
      qk = null;
    } 
    if (qk != null) {
      dk0 dk01 = qk.q();
      while (!dk01.E()) {
        qk qk1 = dk01.H();
        if (qk1 instanceof rk) {
          qk1 = qk1;
        } else {
          qk1 = null;
        } 
        if (qk1 != null) {
          dk0 dk02 = qk1.q();
          continue;
        } 
        // Byte code: goto -> 87
      } 
    } else {
      bool = false;
    } 
    this.g = bool;
  }
  
  public final boolean E() {
    return this.g;
  }
  
  public final boolean F() {
    return true;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\xj0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
public final class bk0 extends yj0 {
  public final dk0 j;
  
  public final ck0 k;
  
  public final rk l;
  
  public final Object m;
  
  public bk0(dk0 paramdk0, ck0 paramck0, rk paramrk, Object paramObject) {
    this.j = paramdk0;
    this.k = paramck0;
    this.l = paramrk;
    this.m = paramObject;
  }
  
  public final boolean r() {
    return false;
  }
  
  public final void s(Throwable paramThrowable) {
    rk rk1 = this.l;
    rk rk2 = dk0.T(rk1);
    dk0 dk01 = this.j;
    ck0 ck01 = this.k;
    Object object = this.m;
    if (rk2 == null || !dk01.g0(ck01, rk2, object)) {
      ck01.b.e(new un0(2), 2);
      rk1 = dk0.T(rk1);
      if (rk1 == null || !dk01.g0(ck01, rk1, object)) {
        dk01.r(dk01.B(ck01, object));
        return;
      } 
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\bk0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
public final class ci2 implements Runnable {
  public final kj2 b;
  
  public final hj2 c;
  
  public ci2(kj2 paramkj2, hj2 paramhj2) {
    this.b = paramkj2;
    this.c = paramhj2;
  }
  
  public final void run() {
    if (this.b.b == this) {
      hj2 hj21 = this.c;
      kj2 kj21 = this.b;
      Object object = kj2.h(hj21);
      if (li2.i.J0(kj21, this, object))
        kj2.j(this.b); 
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\ci2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
public abstract class ot2 implements Runnable {
  public final nt1 b = null;
  
  public ot2() {}
  
  public ot2(nt1 paramnt1) {}
  
  public abstract void a();
  
  public final void run() {
    try {
      a();
      return;
    } catch (Exception exception) {
      nt1 nt11 = this.b;
      if (nt11 != null)
        nt11.c(exception); 
      return;
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\ot2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
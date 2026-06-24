public abstract class ia2 implements Runnable {
  public final nt1 b = null;
  
  public ia2() {}
  
  public ia2(nt1 paramnt1) {}
  
  public void a(Exception paramException) {
    nt1 nt11 = this.b;
    if (nt11 != null)
      nt11.c(paramException); 
  }
  
  public abstract void b();
  
  public final void run() {
    try {
      b();
      return;
    } catch (Exception exception) {
      a(exception);
      return;
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\ia2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
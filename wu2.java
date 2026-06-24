public final class wu2 extends ju2 implements Runnable {
  public final Runnable j;
  
  public wu2(Runnable paramRunnable) {
    paramRunnable.getClass();
    this.j = paramRunnable;
  }
  
  public final String f() {
    String str = this.j.toString();
    return x41.o(new StringBuilder(str.length() + 7), "task=[", str, "]");
  }
  
  public final void run() {
    try {
      return;
    } finally {
      hu2 hu2 = new hu2(null);
      if (ru2.i.f0(this, null, hu2))
        ju2.h(this); 
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\wu2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
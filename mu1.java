public abstract class mu1 {
  public static final ThreadLocal a = new ThreadLocal();
  
  public static n50 a() {
    ThreadLocal<n50> threadLocal = a;
    n50 n502 = threadLocal.get();
    n50 n501 = n502;
    if (n502 == null) {
      n501 = new xf(Thread.currentThread());
      threadLocal.set(n501);
    } 
    return n501;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\mu1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
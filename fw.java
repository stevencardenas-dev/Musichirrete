import java.util.concurrent.Executor;

public final class fw extends b60 implements Executor {
  public static final fw e = (fw)new rs();
  
  public static final rs f;
  
  static {
    m02 m02 = m02.e;
    int i = ps1.a;
    if (64 >= i)
      i = 64; 
    f = m02.r(n21.T(i, 12, "kotlinx.coroutines.io.parallelism"));
  }
  
  public final void close() {
    throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
  }
  
  public final void execute(Runnable paramRunnable) {
    m(b40.b, paramRunnable);
  }
  
  public final void m(os paramos, Runnable paramRunnable) {
    f.m(paramos, paramRunnable);
  }
  
  public final void p(os paramos, Runnable paramRunnable) {
    f.p(paramos, paramRunnable);
  }
  
  public final String toString() {
    return "Dispatchers.IO";
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\fw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
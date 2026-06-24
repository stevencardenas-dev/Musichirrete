import java.util.concurrent.Executor;

public enum sz implements Executor {
  b;
  
  public static final sz[] c;
  
  static {
    Enum<Enum> enum_ = new Enum<Enum>("INSTANCE", 0);
    b = (sz)enum_;
    c = new sz[] { (sz)enum_ };
  }
  
  public final void execute(Runnable paramRunnable) {
    paramRunnable.getClass();
    paramRunnable.run();
  }
  
  public final String toString() {
    return "DirectExecutor";
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\sz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
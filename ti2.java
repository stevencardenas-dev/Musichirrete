import java.util.concurrent.Executor;

public enum ti2 implements Executor {
  b;
  
  public static final ti2[] c;
  
  static {
    Enum<Enum> enum_ = new Enum<Enum>("INSTANCE", 0);
    b = (ti2)enum_;
    c = new ti2[] { (ti2)enum_ };
  }
  
  public final void execute(Runnable paramRunnable) {
    paramRunnable.run();
  }
  
  public final String toString() {
    return "MoreExecutors.directExecutor()";
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\ti2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
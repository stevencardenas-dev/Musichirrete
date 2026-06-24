import java.util.concurrent.Executor;

public enum tz implements Executor {
  b;
  
  public static final tz[] c;
  
  static {
    Enum<Enum> enum_ = new Enum<Enum>("INSTANCE", 0);
    b = (tz)enum_;
    c = new tz[] { (tz)enum_ };
  }
  
  public final void execute(Runnable paramRunnable) {
    paramRunnable.run();
  }
  
  public final String toString() {
    return "DirectExecutor";
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\tz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
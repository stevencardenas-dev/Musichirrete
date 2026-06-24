import java.util.concurrent.Executor;

public final class f6 implements Executor {
  public final void execute(Runnable paramRunnable) {
    (new Thread(paramRunnable)).start();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\f6.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
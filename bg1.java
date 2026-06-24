import android.os.Process;

public final class bg1 extends Thread {
  public final int b = 10;
  
  public bg1(Runnable paramRunnable) {
    super(paramRunnable, "fonts-androidx");
  }
  
  public final void run() {
    Process.setThreadPriority(this.b);
    super.run();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\bg1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
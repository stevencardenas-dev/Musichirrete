import java.util.concurrent.ThreadFactory;

public final class cg1 implements ThreadFactory {
  public final int a;
  
  public final Thread newThread(Runnable paramRunnable) {
    switch (this.a) {
      default:
        return new Thread(paramRunnable, "SplitCompatBackgroundThread");
      case 0:
        break;
    } 
    return new bg1(paramRunnable);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\cg1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
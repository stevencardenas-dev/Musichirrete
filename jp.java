import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public final class jp implements ThreadFactory {
  public final AtomicInteger a;
  
  public final boolean b;
  
  public jp(boolean paramBoolean) {
    this.b = paramBoolean;
    this.a = new AtomicInteger(0);
  }
  
  public final Thread newThread(Runnable paramRunnable) {
    String str;
    paramRunnable.getClass();
    if (this.b) {
      str = "WM.task-";
    } else {
      str = "androidx.work-";
    } 
    StringBuilder stringBuilder = x41.p(str);
    stringBuilder.append(this.a.incrementAndGet());
    return new Thread(paramRunnable, stringBuilder.toString());
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\jp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
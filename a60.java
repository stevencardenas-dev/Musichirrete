import android.os.Handler;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

public final class a60 implements Executor {
  public final int b;
  
  public final Handler c;
  
  public final void execute(Runnable paramRunnable) {
    int i = this.b;
    Handler handler = this.c;
    switch (i) {
      default:
        handler.post(paramRunnable);
        return;
      case 1:
        paramRunnable.getClass();
        if (handler.post(paramRunnable))
          return; 
        stringBuilder = new StringBuilder();
        stringBuilder.append(handler);
        stringBuilder.append(" is shutting down");
        throw new RejectedExecutionException(stringBuilder.toString());
      case 0:
        break;
    } 
    stringBuilder.getClass();
    if (handler.post((Runnable)stringBuilder))
      return; 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(handler);
    stringBuilder.append(" is shutting down");
    throw new RejectedExecutionException(stringBuilder.toString());
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\a60.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
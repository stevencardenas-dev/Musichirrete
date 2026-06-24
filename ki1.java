import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

public final class ki1 implements Executor {
  public final int b;
  
  public final Object c;
  
  public ki1() {
    cl cl = new cl(Looper.getMainLooper(), 5, false);
    Looper.getMainLooper();
    this.c = cl;
  }
  
  public final void execute(Runnable paramRunnable) {
    int i = this.b;
    Object object = this.c;
    switch (i) {
      default:
        ((cl)object).post(paramRunnable);
        return;
      case 1:
        ((Handler)((n2)object).f).post(paramRunnable);
        return;
      case 0:
        break;
    } 
    ((Executor)object).execute(new e3(29, paramRunnable));
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\ki1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
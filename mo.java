import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.concurrent.Executor;

public final class mo implements ViewTreeObserver.OnDrawListener, Runnable, Executor {
  public final long b;
  
  public Runnable c;
  
  public boolean e;
  
  public final qo f;
  
  public mo(qo paramqo) {
    this.f = paramqo;
    this.b = SystemClock.uptimeMillis() + 10000L;
  }
  
  public final void a(View paramView) {
    if (!this.e) {
      this.e = true;
      paramView.getViewTreeObserver().addOnDrawListener(this);
    } 
  }
  
  public final void execute(Runnable paramRunnable) {
    paramRunnable.getClass();
    this.c = paramRunnable;
    View view = this.f.getWindow().getDecorView();
    view.getClass();
    if (this.e) {
      if (ui0.c(Looper.myLooper(), Looper.getMainLooper())) {
        view.invalidate();
        return;
      } 
      view.postInvalidate();
      return;
    } 
    view.postOnAnimation(new e(10, this));
  }
  
  public final void onDraw() {
    Runnable runnable = this.c;
    if (runnable != null) {
      runnable.run();
      this.c = null;
      null = (kc0)this.f.j.getValue();
      synchronized (null.a) {
        boolean bool = null.b;
        if (bool) {
          this.e = false;
          this.f.getWindow().getDecorView().post(this);
          return;
        } 
      } 
    } else if (SystemClock.uptimeMillis() > this.b) {
      this.e = false;
      this.f.getWindow().getDecorView().post(this);
    } 
  }
  
  public final void run() {
    this.f.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\mo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
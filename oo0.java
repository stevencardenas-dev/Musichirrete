import android.content.Context;
import androidx.work.WorkerParameters;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class oo0 {
  public final Context a;
  
  public final WorkerParameters b;
  
  public final AtomicInteger c = new AtomicInteger(-256);
  
  public boolean d;
  
  public oo0(Context paramContext, WorkerParameters paramWorkerParameters) {
    this.a = paramContext;
    this.b = paramWorkerParameters;
  }
  
  public abstract ei a();
  
  public abstract ei b();
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\oo0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
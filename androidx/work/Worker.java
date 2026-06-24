package androidx.work;

import android.content.Context;
import ci;
import dd1;
import ei;
import i2;
import java.util.concurrent.ExecutorService;
import no0;
import oo0;
import pp;
import vn;

public abstract class Worker extends oo0 {
  public Worker(Context paramContext, WorkerParameters paramWorkerParameters) {
    super(paramContext, paramWorkerParameters);
  }
  
  public final ei a() {
    ExecutorService executorService = this.b.c;
    executorService.getClass();
    return dd1.A((ci)new vn(23, executorService, new i2(7, this)));
  }
  
  public final ei b() {
    ExecutorService executorService = this.b.c;
    executorService.getClass();
    return dd1.A((ci)new vn(23, executorService, new pp(10, this)));
  }
  
  public abstract no0 c();
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\androidx\work\Worker.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
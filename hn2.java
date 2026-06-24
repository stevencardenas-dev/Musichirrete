import android.content.Context;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public final class hn2 {
  public static final rp0 j = new rp0("ClientCastAnalytics", null);
  
  public static boolean k = true;
  
  public final bl1 a;
  
  public final vh2 b;
  
  public final hf2 c;
  
  public final String d;
  
  public Long e;
  
  public final ExecutorService f;
  
  public cn g;
  
  public ki2 h;
  
  public int i;
  
  public hn2(Context paramContext, pb2 parampb2, bl1 parambl1, vh2 paramvh2, hf2 paramhf2) {
    this.a = parambl1;
    this.b = paramvh2;
    this.c = paramhf2;
    this.i = 1;
    this.d = UUID.randomUUID().toString();
    this.f = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool());
  }
  
  public final void a(oq2 paramoq2, int paramInt) {
    x7 x7 = new x7(paramInt, 3, this, paramoq2);
    this.f.execute(x7);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\hn2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
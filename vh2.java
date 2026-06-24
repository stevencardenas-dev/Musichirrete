import android.os.Looper;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public final class vh2 {
  public static final rp0 g = new rp0("SessionTransController", null);
  
  public final mj a;
  
  public final Set b = Collections.synchronizedSet(new HashSet());
  
  public final cl c;
  
  public final qh2 d;
  
  public boolean e;
  
  public bl1 f;
  
  public vh2(mj parammj) {
    this.a = parammj;
    this.c = new cl(Looper.getMainLooper(), 6);
    this.d = new qh2(this, 1);
  }
  
  public final void a() {
    cl cl1 = this.c;
    n21.m(cl1);
    qh2 qh21 = this.d;
    n21.m(qh21);
    cl1.removeCallbacks(qh21);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\vh2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
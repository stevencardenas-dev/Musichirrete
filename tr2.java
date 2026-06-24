import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import java.util.HashSet;

public abstract class tr2 {
  public final f1 a;
  
  public final IntentFilter b;
  
  public final Context c;
  
  public final HashSet d = new HashSet();
  
  public q6 e = null;
  
  public volatile boolean f = false;
  
  public tr2(f1 paramf1, IntentFilter paramIntentFilter, Context paramContext) {
    this.a = paramf1;
    this.b = paramIntentFilter;
    Context context = paramContext.getApplicationContext();
    if (context != null)
      paramContext = context; 
    this.c = paramContext;
  }
  
  public final void a() {
    if ((this.f || !this.d.isEmpty()) && this.e == null) {
      q6 q61 = new q6(9, this);
      this.e = q61;
      int i = Build.VERSION.SDK_INT;
      Context context = this.c;
      IntentFilter intentFilter = this.b;
      if (i >= 33) {
        context.registerReceiver(q61, intentFilter, 2);
      } else {
        context.registerReceiver(q61, intentFilter);
      } 
    } 
    if (!this.f && this.d.isEmpty()) {
      q6 q61 = this.e;
      if (q61 != null) {
        this.c.unregisterReceiver(q61);
        this.e = null;
      } 
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\tr2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import com.pairip.VMRunner;

public final class l9 extends BroadcastReceiver implements Runnable {
  public final an1 b;
  
  public final Handler c;
  
  public final m9 e;
  
  public l9(m9 paramm9, Handler paramHandler, an1 paraman1) {
    this.c = paramHandler;
    this.b = paraman1;
  }
  
  public final void onReceive(Context paramContext, Intent paramIntent) {
    VMRunner.invoke("jANT8Um6q5XpWakx", new Object[] { this, paramContext, paramIntent });
  }
  
  public final void run() {
    if (this.e.a)
      this.b.b.r(false); 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\l9.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.support.v4.media.session.PlaybackStateCompat;

public abstract class g01 implements IBinder.DeathRecipient {
  public final zs0 a = new zs0(this);
  
  public at0 b;
  
  public h01 c;
  
  public void a() {}
  
  public abstract void b(PlaybackStateCompat paramPlaybackStateCompat);
  
  public final void binderDied() {
    c(8, null, null);
  }
  
  public final void c(int paramInt, Object paramObject, Bundle paramBundle) {
    at0 at01 = this.b;
    if (at01 != null) {
      paramObject = at01.obtainMessage(paramInt, paramObject);
      paramObject.setData(paramBundle);
      paramObject.sendToTarget();
    } 
  }
  
  public final void d(Handler paramHandler) {
    if (paramHandler == null) {
      paramHandler = this.b;
      if (paramHandler != null) {
        ((at0)paramHandler).b = false;
        paramHandler.removeCallbacksAndMessages(null);
        this.b = null;
      } 
      return;
    } 
    paramHandler = new at0(this, paramHandler.getLooper(), 1);
    this.b = (at0)paramHandler;
    ((at0)paramHandler).b = true;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\g01.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
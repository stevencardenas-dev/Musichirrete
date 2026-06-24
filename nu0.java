import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.PlaybackStateCompat;

public final class nu0 implements IBinder.DeathRecipient {
  public final zs0 a = new zs0(this);
  
  public at0 b;
  
  public bt0 c;
  
  public final qu0 d;
  
  public nu0(qu0 paramqu0) {}
  
  public final void a(MediaMetadataCompat paramMediaMetadataCompat) {
    MediaDescriptionCompat mediaDescriptionCompat;
    if (paramMediaMetadataCompat == null) {
      paramMediaMetadataCompat = null;
    } else {
      mediaDescriptionCompat = paramMediaMetadataCompat.e();
    } 
    qu0 qu01 = this.d;
    qu01.Y = mediaDescriptionCompat;
    qu01.r();
    qu01.q(false);
  }
  
  public final void b(PlaybackStateCompat paramPlaybackStateCompat) {
    qu0 qu01 = this.d;
    qu01.X = paramPlaybackStateCompat;
    qu01.q(false);
  }
  
  public final void binderDied() {
    d(8, null, null);
  }
  
  public final void c() {
    qu0 qu01 = this.d;
    g7 g7 = qu01.V;
    if (g7 != null) {
      g7.L(qu01.W);
      qu01.V = null;
    } 
  }
  
  public final void d(int paramInt, Object paramObject, Bundle paramBundle) {
    at0 at01 = this.b;
    if (at01 != null) {
      paramObject = at01.obtainMessage(paramInt, paramObject);
      paramObject.setData(paramBundle);
      paramObject.sendToTarget();
    } 
  }
  
  public final void e(Handler paramHandler) {
    if (paramHandler == null) {
      paramHandler = this.b;
      if (paramHandler != null) {
        ((at0)paramHandler).b = false;
        paramHandler.removeCallbacksAndMessages(null);
        this.b = null;
      } 
      return;
    } 
    paramHandler = new at0(this, paramHandler.getLooper(), 0);
    this.b = (at0)paramHandler;
    ((at0)paramHandler).b = true;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\nu0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
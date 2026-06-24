import android.media.AudioManager;
import android.os.Handler;

public final class p9 implements AudioManager.OnAudioFocusChangeListener {
  public final Handler b;
  
  public final q9 c;
  
  public p9(q9 paramq9, Handler paramHandler) {
    this.c = paramq9;
    this.b = paramHandler;
  }
  
  public final void onAudioFocusChange(int paramInt) {
    y2 y2 = new y2(paramInt, 1, this);
    this.b.post(y2);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\p9.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
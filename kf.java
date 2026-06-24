import android.content.Intent;
import android.media.AudioTrack;
import in.krosbits.musicolet.MusicService;
import in.krosbits.musicolet.MyApplication;

public final class kf extends Thread {
  public final int b;
  
  public final Object c;
  
  public kf(AudioTrack paramAudioTrack) {
    this.c = paramAudioTrack;
  }
  
  public final void run() {
    int i = this.b;
    Object object = this.c;
    switch (i) {
      default:
        ((AudioTrack)object).release();
        return;
      case 1:
        try {
          MusicService.q0(true);
          MusicService musicService = (MusicService)object;
          if (musicService.r) {
            object = new Intent();
            super(MyApplication.i.getApplicationContext(), MusicService.class);
            musicService.startService(object.setAction("ACTION_CLOSE"));
          } 
        } finally {
          object = null;
        } 
      case 0:
        break;
    } 
    object = object;
    object.getClass();
    object.l(new y2(0, 2, object));
    lf.a((lf)object, 0);
    if (MyApplication.h)
      lf.a((lf)object, 1); 
    object.m();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\kf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
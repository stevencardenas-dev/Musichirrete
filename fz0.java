import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import in.krosbits.musicolet.MusicService;
import in.krosbits.musicolet.MyApplication;
import in.krosbits.musicolet.TaskSaviour;

public final class fz0 extends i61 {
  public final long c;
  
  public final MusicService e;
  
  public fz0(MusicService paramMusicService, long paramLong) {}
  
  public final void run() {
    if (MusicService.Q0 <= this.c) {
      j61 j61;
      if (MyApplication.k() && MusicService.F0 && !ag0.e && ag0.d != null) {
        MyApplication.o().edit().putString("k_s_wdthmaw", ag0.d).apply();
        ag0.e = true;
      } 
      if (MyApplication.k() && MusicService.F0) {
        String str = ag0.d;
        if (str != null && str.length() == 1) {
          StringBuilder stringBuilder = new StringBuilder("sqstt");
          stringBuilder.append(ag0.d);
          n21.F(stringBuilder.toString());
          return;
        } 
      } 
      MusicService musicService = this.e;
      try {
        MusicService.q0(true);
        if (musicService.O)
          Thread.sleep(2000L); 
      } finally {
        Exception exception = null;
      } 
      if (j61 == null || j61.a.isEmpty()) {
        musicService.stopService(new Intent((Context)musicService, TaskSaviour.class));
        PowerManager.WakeLock wakeLock = musicService.l0;
        if (wakeLock != null)
          try {
            if (wakeLock.isHeld())
              musicService.l0.release(); 
          } finally {
            musicService = null;
          }  
      } 
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\fz0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
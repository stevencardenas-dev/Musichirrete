import android.media.AudioManager;
import in.krosbits.musicolet.MusicService;
import in.krosbits.musicolet.MyApplication;

public final class iz0 implements AudioManager.OnModeChangedListener {
  public final MusicService a;
  
  public iz0(MusicService paramMusicService) {
    this.a = paramMusicService;
  }
  
  public final void onModeChanged(int paramInt) {
    boolean bool = MusicService.K();
    MusicService musicService = this.a;
    if (musicService.p != bool) {
      StringBuilder stringBuilder = new StringBuilder("m_onc:");
      stringBuilder.append(musicService.p);
      stringBuilder.append(">");
      stringBuilder.append(bool);
      n21.F(stringBuilder.toString());
      musicService.p = bool;
      paramInt = MyApplication.o().getInt("B_R_AFL", 3);
      if (paramInt == 0 || paramInt == 1)
        if (bool) {
          musicService.P(-1, false);
        } else {
          musicService.P(1, false);
        }  
      boolean bool1 = MyApplication.o().getBoolean("B_RAF_RACE", true);
      if (paramInt >= 1 && !bool1 && bool && musicService.x)
        musicService.x = false; 
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\iz0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
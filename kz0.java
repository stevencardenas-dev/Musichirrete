import android.content.SharedPreferences;
import in.krosbits.musicolet.MusicService;
import in.krosbits.musicolet.RestoreActivity;

public final class kz0 implements SharedPreferences.OnSharedPreferenceChangeListener {
  public final MusicService b;
  
  public kz0(MusicService paramMusicService) {
    this.b = paramMusicService;
  }
  
  public final void onSharedPreferenceChanged(SharedPreferences paramSharedPreferences, String paramString) {
    if (!RestoreActivity.A0) {
      hc hc = MusicService.E0;
      if (hc != null && hc.H() && "etu2".equals(paramString))
        this.b.a0(3000L); 
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\kz0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
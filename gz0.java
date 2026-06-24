import android.os.Handler;
import in.krosbits.musicolet.MusicService;

public final class gz0 implements Runnable {
  public final int b;
  
  public final MusicService c;
  
  public final void run() {
    int i = this.b;
    MusicService musicService = this.c;
    switch (i) {
      default:
        try {
          musicService.N0(false);
          Handler handler = musicService.v;
          if (handler != null)
            handler.removeCallbacks(this); 
        } catch (Exception exception) {
          exception.printStackTrace();
        } 
        return;
      case 1:
        try {
          i = Integer.parseInt(((MusicService)exception).u.getString(exception.getResources().getString(2131886709), "2"));
        } catch (NumberFormatException numberFormatException) {
          i = 0;
        } 
        if (i == 1) {
          exception.S(false, true, false);
        } else if (i == 2) {
          exception.T(false, true, false);
        } 
        return;
      case 0:
        break;
    } 
    try {
      i = Integer.parseInt(((MusicService)exception).u.getString(exception.getResources().getString(2131886708), "1"));
    } catch (NumberFormatException numberFormatException) {
      i = 0;
    } 
    if (i == 1) {
      exception.S(false, true, false);
    } else if (i == 2) {
      exception.T(false, true, false);
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\gz0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
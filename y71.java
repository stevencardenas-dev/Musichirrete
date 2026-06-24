import android.content.Intent;
import in.krosbits.musicolet.MusicService;

public final class y71 implements Runnable {
  public final int b;
  
  public final z71 c;
  
  public final void run() {
    int i = this.b;
    z71 z711 = this.c;
    switch (i) {
      default:
        y711 = z711.m1;
        if (z711.M0 != null) {
          z711.P().startService((new Intent(z711.P(), MusicService.class)).setAction("AF10"));
          z711.K0.removeCallbacks(y711);
          if (z711.Q0 > 0L)
            z711.K0.postDelayed(y711, 700L); 
        } 
        return;
      case 0:
        break;
    } 
    y71 y711 = z711.l1;
    if (z711.M0 != null) {
      z711.P().startService((new Intent(z711.P(), MusicService.class)).setAction("AR10"));
      z711.K0.removeCallbacks(y711);
      if (z711.Q0 > 0L)
        z711.K0.postDelayed(y711, 700L); 
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\y71.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
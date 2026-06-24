import android.content.Intent;
import android.view.View;
import in.krosbits.musicolet.LockScreenActivity;
import in.krosbits.musicolet.MusicService;

public final class dp0 implements Runnable {
  public final int b;
  
  public final LockScreenActivity c;
  
  public final void run() {
    int i = this.b;
    LockScreenActivity lockScreenActivity = this.c;
    switch (i) {
      default:
        if (lockScreenActivity.m0)
          lockScreenActivity.y0(); 
        lockScreenActivity.G0.postDelayed(lockScreenActivity.E0, 1000L);
        return;
      case 1:
        dp01 = lockScreenActivity.D0;
        if (lockScreenActivity.l0 != null) {
          lockScreenActivity.startService((new Intent(lockScreenActivity.getApplicationContext(), MusicService.class)).setAction("AF10"));
          lockScreenActivity.G0.removeCallbacks(dp01);
          if (lockScreenActivity.o0 > 0L) {
            lockScreenActivity.G0.postDelayed(dp01, 700L);
            if ((System.currentTimeMillis() - lockScreenActivity.o0) < 1050.0D)
              ag0.G0((View)lockScreenActivity.a0); 
          } 
        } 
        return;
      case 0:
        break;
    } 
    dp0 dp01 = lockScreenActivity.C0;
    if (lockScreenActivity.l0 != null) {
      lockScreenActivity.startService((new Intent(lockScreenActivity.getApplicationContext(), MusicService.class)).setAction("AR10"));
      lockScreenActivity.G0.removeCallbacks(dp01);
      if (lockScreenActivity.o0 > 0L) {
        lockScreenActivity.G0.postDelayed(dp01, 700L);
        if ((System.currentTimeMillis() - lockScreenActivity.o0) < 1050.0D)
          ag0.G0((View)lockScreenActivity.e0); 
      } 
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\dp0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
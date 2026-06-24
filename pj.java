import android.os.Handler;
import android.view.Display;
import in.krosbits.android.widgets.swipetoloadlayout.vZ.LHyji;
import in.krosbits.musicolet.MusicService;
import in.krosbits.musicolet.MyApplication;

public final class pj extends ki {
  public final boolean c;
  
  public pj(boolean paramBoolean) {
    this.c = paramBoolean;
  }
  
  public final void run() {
    String str = LHyji.opJW;
    n21.F("kcapT:s");
    try {
      while (!this.b) {
        Thread.sleep(1000L);
        MusicService.P0.o();
        Display display = MyApplication.m().getSelectedRoute(1).getPresentationDisplay();
        MusicService musicService = MusicService.P0;
        if (display != null) {
          if (!musicService.B0.b()) {
            Handler handler = ag0.m;
            r9 r9 = new r9();
            this(musicService, 1);
            handler.postDelayed(r9, 300L);
          } 
          if (!this.c)
            zo2.a(); 
        } 
      } 
      return;
    } catch (InterruptedException interruptedException) {
    
    } finally {
      null = null;
      try {
        null.printStackTrace();
      } finally {
        n21.F(str);
        zo2.m = null;
      } 
    } 
    n21.F(str);
    zo2.m = null;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\pj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
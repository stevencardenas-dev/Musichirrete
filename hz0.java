import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import in.krosbits.musicolet.MusicService;
import in.krosbits.musicolet.MyApplication;
import java.util.LinkedList;

public final class hz0 extends BroadcastReceiver {
  public final int a;
  
  public final MusicService b;
  
  public final void onReceive(Context paramContext, Intent paramIntent) {
    boolean bool1;
    boolean bool2;
    StringBuilder stringBuilder;
    int i = this.a;
    MusicService musicService = this.b;
    switch (i) {
      default:
        stringBuilder = new StringBuilder("MSECR>");
        stringBuilder.append(paramIntent);
        n21.F(stringBuilder.toString());
        if ("android.intent.action.HEADSET_PLUG".equals(paramIntent.getAction())) {
          MusicService.R0 = paramIntent.getIntExtra("state", -1);
          MusicService.T0 = String.valueOf(paramIntent.getStringExtra("name")).toLowerCase();
          MusicService.S0 = paramIntent.getIntExtra("microphone", -1);
          if (isInitialStickyBroadcast())
            return; 
        } 
        stringBuilder = new StringBuilder("MSOHOBSC>");
        stringBuilder.append(paramIntent);
        n21.F(stringBuilder.toString());
        if ("android.intent.action.HEADSET_PLUG".equals(paramIntent.getAction()) && paramIntent.getIntExtra("state", -1) == 1 && musicService.j && MyApplication.o().getBoolean("k_b_rwwhct", false) && (musicService.V || !MyApplication.o().getBoolean("k_b_oripbdct", false)))
          musicService.X(new Integer[0]); 
        bool1 = MusicService.L();
        bool2 = musicService.N;
        if (bool2 && !bool1) {
          musicService.O();
        } else if (!bool2 && bool1) {
          if (!musicService.w)
            musicService.stopSelf(); 
        } else if (!musicService.w) {
          musicService.stopSelf();
        } 
        musicService.N = bool1;
        musicService.p();
        return;
      case 0:
        break;
    } 
    hz0 hz01 = musicService.o0;
    if (MyApplication.w == 4) {
      if (hz01 != null)
        cn.o(musicService.getApplicationContext()).C(hz01); 
      (new z21(MyApplication.i.getApplicationContext())).b(120);
      ag0.m.postDelayed(new hi(120), 5200L);
      MyApplication.o = false;
      LinkedList<PendingIntent> linkedList = musicService.n0;
      while (!linkedList.isEmpty())
        PendingIntent pendingIntent = linkedList.removeFirst(); 
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\hz0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
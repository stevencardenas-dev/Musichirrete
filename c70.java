import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import in.krosbits.musicolet.MusicService;
import in.krosbits.musicolet.MyApplication;
import java.util.HashMap;

public final class c70 extends BroadcastReceiver {
  public final int a;
  
  public final void onReceive(Context paramContext, Intent paramIntent) {
    switch (this.a) {
      default:
        if ((paramIntent.getIntExtra("android.media.EXTRA_VOLUME_STREAM_TYPE", -1) == 3 || paramIntent.getIntExtra("android.media.EXTRA_VOLUME_STREAM_TYPE_ALIAS", -1) == 3) && paramIntent.getIntExtra("android.media.EXTRA_VOLUME_STREAM_VALUE", -1) != paramIntent.getIntExtra("android.media.EXTRA_PREV_VOLUME_STREAM_VALUE", -1))
          try {
            MusicService.P0.U();
          } finally {
            paramContext = null;
          }  
        return;
      case 1:
        cn.o(MyApplication.i.getApplicationContext()).C(this);
        MyApplication.A();
        return;
      case 0:
        break;
    } 
    try {
      Context context;
      String str = paramIntent.getAction();
      if ("android.intent.action.DATE_CHANGED".equals(str) || "android.intent.action.TIME_SET".equals(str)) {
        HashMap hashMap = l51.a;
        k51 k51 = new k51();
        super();
        k51.execute(new Object[0]);
        m92.i();
        MyApplication.s();
        return;
      } 
    } finally {
      paramContext = null;
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\c70.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
import android.content.Context;
import android.os.Handler;
import android.view.View;
import android.widget.Toast;
import in.krosbits.musicolet.MyApplication;
import in.krosbits.musicolet.SettingsActivity;

public final class nl1 implements Runnable {
  public final int b;
  
  public final SettingsActivity c;
  
  public final void run() {
    Handler handler;
    int i = this.b;
    SettingsActivity settingsActivity = this.c;
    switch (i) {
      default:
        handler = ((pc)settingsActivity).N;
        try {
          handler.removeCallbacks(this);
          if (settingsActivity.k0) {
            Context context = MyApplication.i.getApplicationContext();
            z21 z21 = new z21();
            this(context);
            if (z21.a()) {
              settingsActivity.startActivity(settingsActivity.getIntent().addFlags(67108864));
            } else {
              handler.postDelayed(this, 1000L);
            } 
          } 
        } finally {
          settingsActivity = null;
        } 
      case 0:
        break;
    } 
    try {
      Toast toast = Toast.makeText(MyApplication.i.getApplicationContext(), 2131887302, 1);
      settingsActivity.h0 = toast;
      ag0.q0(toast, (View)settingsActivity.S, settingsActivity.getWindow());
      settingsActivity.h0.show();
    } finally {}
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\nl1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
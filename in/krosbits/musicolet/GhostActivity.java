package in.krosbits.musicolet;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class GhostActivity extends Activity {
  public final void onCreate(Bundle paramBundle) {
    super.onCreate(paramBundle);
    try {
      Intent intent;
      String str = getIntent().getAction();
      boolean bool = "musicolet.media.r.1".equals(str);
    } finally {
      paramBundle = null;
    } 
    finish();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\in\krosbits\musicolet\GhostActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
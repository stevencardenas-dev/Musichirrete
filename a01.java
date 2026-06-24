import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import in.krosbits.musicolet.MyApplication;

public final class a01 extends ContentObserver {
  public final void onChange(boolean paramBoolean, Uri paramUri) {
    super.onChange(paramBoolean, paramUri);
    if (!MyApplication.o().getBoolean("k_b_atsc", true))
      return; 
    StringBuilder stringBuilder = new StringBuilder("MA>CO:");
    stringBuilder.append(paramUri);
    stringBuilder.append(" s=");
    stringBuilder.append(paramBoolean);
    n21.F(stringBuilder.toString());
    Handler handler = ag0.n;
    yf0 yf0 = ag0.r;
    handler.removeCallbacks(yf0);
    handler.postDelayed(yf0, 5000L);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\a01.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
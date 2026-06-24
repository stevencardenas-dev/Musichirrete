import android.content.Context;
import android.os.AsyncTask;
import com.pairip.VMRunner;
import in.krosbits.musicolet.MusicActivity;
import java.util.Calendar;

public final class k51 extends AsyncTask {
  public boolean a;
  
  public final Object doInBackground(Object... paramVarArgs) {
    return VMRunner.invoke("hkKjcnRnomdudXEk", new Object[] { this, paramVarArgs });
  }
  
  public final void onPostExecute(Object paramObject) {
    paramObject = MusicActivity.R0;
    if (paramObject != null && ((MusicActivity)paramObject).e0 != null && this.a)
      try {
        l51.a.clear();
        paramObject = MusicActivity.R0.e0;
        ((l81)paramObject).Z0 = null;
        ((l81)paramObject).Y0 = null;
        if (((l81)paramObject).C0) {
          int i = ((l81)paramObject).a0;
          if (i >= 2 && i < 6)
            return; 
        } 
      } finally {
        paramObject = null;
      }  
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\k51.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
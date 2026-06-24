import android.os.AsyncTask;
import com.pairip.VMRunner;
import in.krosbits.musicolet.MusicService;
import in.krosbits.musicolet.ReplayGainReadCalcService;
import java.util.HashSet;

public final class jz0 extends AsyncTask {
  public final int a;
  
  public final int b;
  
  public HashSet c;
  
  public jz0(int paramInt1, int paramInt2) {
    this.a = paramInt1;
    this.b = paramInt2;
  }
  
  public final Object doInBackground(Object... paramVarArgs) {
    return VMRunner.invoke("03NqSru3ugQoE6Sf", new Object[] { this, paramVarArgs });
  }
  
  public final void onPostExecute(Object paramObject) {
    paramObject = this.c;
    if (paramObject != null && !paramObject.isEmpty()) {
      boolean bool = ReplayGainReadCalcService.t;
      boolean bool1 = true;
      if (bool) {
        MusicService.g1 = true;
        return;
      } 
      paramObject = this.c;
      if (this.b == 2) {
        bool = true;
      } else {
        bool = false;
      } 
      if (this.a != 2)
        bool1 = false; 
      ReplayGainReadCalcService.b((HashSet)paramObject, false, bool, bool1, false);
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\jz0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
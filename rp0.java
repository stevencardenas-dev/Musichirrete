import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import androidx.recyclerview.widget.dVrV.jLnXOLx;
import java.util.Locale;
import org.jaudiotagger.tag.id3.tT.hrSTyFuSIm;

public final class rp0 {
  public final String a;
  
  public final boolean b;
  
  public final String c;
  
  public rp0(String paramString1, String paramString2) {
    boolean bool;
    n21.l(paramString1, hrSTyFuSIm.nvMUeSQok);
    this.a = paramString1;
    this.c = paramString2;
    if (paramString1.length() <= 23) {
      bool = true;
    } else {
      bool = false;
    } 
    this.b = bool;
  }
  
  public final void a(Exception paramException, String paramString, Object... paramVarArgs) {
    if (!Build.TYPE.equals("user") && this.b) {
      String str = this.a;
      if (Log.isLoggable(str, 3))
        Log.d(str, c(paramString, paramVarArgs), paramException); 
    } 
  }
  
  public final void b(String paramString, Object... paramVarArgs) {
    if (!Build.TYPE.equals("user") && this.b) {
      String str = this.a;
      if (Log.isLoggable(str, 3))
        Log.d(str, c(paramString, paramVarArgs)); 
    } 
  }
  
  public final String c(String paramString, Object... paramVarArgs) {
    String str = paramString;
    if (paramVarArgs.length != 0)
      str = String.format(Locale.ROOT, paramString, paramVarArgs); 
    paramString = this.c;
    if (TextUtils.isEmpty(paramString)) {
      paramString = "";
    } else {
      paramString = x41.w("[", paramString, jLnXOLx.FeohUVonVP);
    } 
    return !TextUtils.isEmpty(paramString) ? paramString.concat(str) : str;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\rp0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
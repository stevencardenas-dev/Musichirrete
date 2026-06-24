import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import java.util.IllegalFormatException;
import java.util.Locale;

public final class ha2 {
  public final String a;
  
  public ha2(String paramString) {
    int j = Process.myUid();
    int i = Process.myPid();
    StringBuilder stringBuilder = new StringBuilder("UID: [");
    stringBuilder.append(j);
    stringBuilder.append("]  PID: [");
    stringBuilder.append(i);
    stringBuilder.append("] ");
    this.a = stringBuilder.toString().concat(paramString);
  }
  
  public static String c(String paramString1, String paramString2, Object... paramVarArgs) {
    String str = paramString2;
    if (paramVarArgs.length > 0)
      try {
        str = String.format(Locale.US, paramString2, paramVarArgs);
      } catch (IllegalFormatException illegalFormatException) {
        Log.e("PlayCore", "Unable to format ".concat(paramString2), illegalFormatException);
        String str1 = TextUtils.join(", ", paramVarArgs);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(paramString2);
        stringBuilder.append(" [");
        stringBuilder.append(str1);
        stringBuilder.append("]");
        str = stringBuilder.toString();
      }  
    return x41.l(paramString1, " : ", str);
  }
  
  public final void a(String paramString, Object... paramVarArgs) {
    if (Log.isLoggable("PlayCore", 4))
      Log.i("PlayCore", c(this.a, paramString, paramVarArgs)); 
  }
  
  public final void b(String paramString, Object... paramVarArgs) {
    if (Log.isLoggable("PlayCore", 5))
      Log.w("PlayCore", c(this.a, paramString, paramVarArgs)); 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\ha2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
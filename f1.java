import android.os.Process;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.Qg.nFLlOYeP;
import in.krosbits.musicolet.MyApplication;
import java.util.IllegalFormatException;
import java.util.Locale;

public final class f1 implements e31, rs0 {
  public final int b;
  
  public String c;
  
  public f1(String paramString) {
    int j = Process.myUid();
    int i = Process.myPid();
    StringBuilder stringBuilder = new StringBuilder("UID: [");
    stringBuilder.append(j);
    stringBuilder.append("]  PID: [");
    stringBuilder.append(i);
    stringBuilder.append("] ");
    this.c = stringBuilder.toString().concat(paramString);
  }
  
  public static String g(String paramString1, String paramString2, Object... paramVarArgs) {
    String str = paramString2;
    if (paramVarArgs.length > 0)
      try {
        str = String.format(Locale.US, paramString2, paramVarArgs);
      } catch (IllegalFormatException illegalFormatException) {
        Log.e("PlayCore", "Unable to format ".concat(paramString2), illegalFormatException);
        str = TextUtils.join(", ", paramVarArgs);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(paramString2);
        stringBuilder.append(" [");
        stringBuilder.append(str);
        stringBuilder.append("]");
        str = stringBuilder.toString();
      }  
    return x41.l(paramString1, " : ", str);
  }
  
  public void Q(ss0 paramss0, qy paramqy) {
    MyApplication.o().edit().remove(this.c).apply();
  }
  
  public void a(String paramString, Object... paramVarArgs) {
    String str = nFLlOYeP.sZdRAdDzWQwsnAj;
    if (Log.isLoggable(str, 3))
      Log.d(str, g(this.c, paramString, paramVarArgs)); 
  }
  
  public void b(String paramString, Object... paramVarArgs) {
    if (Log.isLoggable("PlayCore", 6))
      Log.e("PlayCore", g(this.c, paramString, paramVarArgs)); 
  }
  
  public void c(RemoteException paramRemoteException, String paramString, Object... paramVarArgs) {
    if (Log.isLoggable("PlayCore", 6))
      Log.e("PlayCore", g(this.c, paramString, paramVarArgs), (Throwable)paramRemoteException); 
  }
  
  public Object d() {
    throw new RuntimeException(this.c);
  }
  
  public void e(String paramString, Object... paramVarArgs) {
    if (Log.isLoggable("PlayCore", 4))
      Log.i("PlayCore", g(this.c, paramString, paramVarArgs)); 
  }
  
  public void f(String paramString, Object... paramVarArgs) {
    if (Log.isLoggable("PlayCore", 5))
      Log.w("PlayCore", g(this.c, paramString, paramVarArgs)); 
  }
  
  public String toString() {
    switch (this.b) {
      default:
        return super.toString();
      case 4:
        break;
    } 
    StringBuilder stringBuilder = new StringBuilder("<");
    stringBuilder.append(this.c);
    stringBuilder.append('>');
    return stringBuilder.toString();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\f1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
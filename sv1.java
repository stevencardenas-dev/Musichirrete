import android.os.Trace;

public abstract class sv1 {
  public static void a(String paramString, int paramInt) {
    Trace.beginAsyncSection(paramString, paramInt);
  }
  
  public static void b(String paramString, int paramInt) {
    Trace.endAsyncSection(paramString, paramInt);
  }
  
  public static boolean c() {
    return Trace.isEnabled();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\sv1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
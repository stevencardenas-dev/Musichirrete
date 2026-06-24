import android.util.Log;

public abstract class ub0 {
  public static final tb0 a = tb0.a;
  
  public static tb0 a(ua0 paramua0) {
    while (paramua0 != null) {
      if (paramua0.Y())
        paramua0.R(); 
      paramua0 = paramua0.z;
    } 
    return a;
  }
  
  public static void b(l42 paraml42) {
    if (lb0.M(3))
      Log.d("FragmentManager", "StrictMode violation in ".concat(paraml42.b.getClass().getName()), paraml42); 
  }
  
  public static final void c(ua0 paramua0, String paramString) {
    paramua0.getClass();
    paramString.getClass();
    StringBuilder stringBuilder = new StringBuilder("Attempting to reuse fragment ");
    stringBuilder.append(paramua0);
    stringBuilder.append(" with previous ID ");
    stringBuilder.append(paramString);
    b(new l42(paramua0, stringBuilder.toString()));
    a(paramua0).getClass();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar\\ub0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
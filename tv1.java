import android.os.Build;
import android.os.Trace;
import android.util.Log;
import java.lang.reflect.Method;

public abstract class tv1 {
  public static final long a;
  
  public static final Method b;
  
  static {
    if (Build.VERSION.SDK_INT < 29)
      try {
        a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
        Class<long> clazz1 = long.class;
        b = Trace.class.getMethod("isTagEnabled", new Class[] { clazz1 });
        Class<int> clazz = int.class;
        Trace.class.getMethod("asyncTraceBegin", new Class[] { clazz1, String.class, clazz });
        Trace.class.getMethod("asyncTraceEnd", new Class[] { clazz1, String.class, clazz });
        Trace.class.getMethod("traceCounter", new Class[] { clazz1, String.class, clazz });
        return;
      } catch (Exception exception) {
        Log.i("TraceCompat", "Unable to initialize via reflection.", exception);
      }  
  }
  
  public static boolean a() {
    if (Build.VERSION.SDK_INT >= 29)
      return p8.c(); 
    try {
      return ((Boolean)b.invoke(null, new Object[] { Long.valueOf(a) })).booleanValue();
    } catch (Exception exception) {
      Log.v("TraceCompat", "Unable to invoke isTagEnabled() via reflection.");
      return false;
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\tv1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
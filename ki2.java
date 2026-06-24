import android.content.Context;
import android.os.Looper;

public final class ki2 {
  public static final rp0 d = new rp0("AnalyticsConsent", null);
  
  public final pb2 a;
  
  public final long b;
  
  public final cl c;
  
  public ki2(Context paramContext, long paramLong) {
    Object object = new Object();
    this.a = (pb2)new je0(paramContext, jl2.a, (j5)object, ie0.c);
    this.b = paramLong;
    this.c = new cl(Looper.getMainLooper(), 6);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\ki2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
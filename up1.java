import android.content.Context;
import android.content.SharedPreferences;
import java.util.concurrent.locks.ReentrantLock;

public final class up1 {
  public static final ReentrantLock c = new ReentrantLock();
  
  public static up1 d;
  
  public final ReentrantLock a = new ReentrantLock();
  
  public final SharedPreferences b;
  
  public up1(Context paramContext) {
    this.b = paramContext.getSharedPreferences("com.google.android.gms.signin", 0);
  }
  
  public final String a(String paramString) {
    ReentrantLock reentrantLock = this.a;
    reentrantLock.lock();
    try {
      paramString = this.b.getString(paramString, null);
      return paramString;
    } finally {
      reentrantLock.unlock();
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar\\up1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
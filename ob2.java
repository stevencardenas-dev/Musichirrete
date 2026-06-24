import android.os.Build;

public abstract class ob2 {
  public static final int a;
  
  static {
    boolean bool;
    if (Build.VERSION.SDK_INT >= 31) {
      bool = true;
    } else {
      bool = false;
    } 
    a = bool;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\ob2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
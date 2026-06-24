import android.os.Build;

public abstract class jm1 {
  public static final int a;
  
  public static final int[] b = new int[] { 
      84, 85, 86, 212, 596, 214, 87, 213, 124, 597, 
      598, 724, 215, 125, 725, 599, 726, 637, 254, 727, 
      255, 639, 765, 766, 767 };
  
  public static final int[] c = new int[] { 
      84, 85, 86, 212, 596, 214, 87, 213, 124, 597, 
      598, 724, 215, 125, 725, 599, 726, 637, 254, 727, 
      255, 639, 765, 766, 767, 511 };
  
  public static final int d;
  
  public static final int e;
  
  static {
    int i = Build.VERSION.SDK_INT;
    boolean bool = false;
    if (i >= 31 || qz1.I()) {
      b = 2;
    } else {
      b = 0;
    } 
    d = b;
    if (i >= 33) {
      b = bool;
    } else {
      b = 1;
    } 
    e = b;
  }
  
  static {
    byte b;
    if (ag0.c0()) {
      b = 6;
    } else {
      b = 4;
    } 
    a = b;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\jm1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
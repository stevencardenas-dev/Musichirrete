import android.graphics.BitmapFactory;
import android.net.NetworkInfo;

public abstract class dg1 {
  public static void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, BitmapFactory.Options paramOptions, zf1 paramzf1) {
    if (paramInt4 > paramInt2 || paramInt3 > paramInt1) {
      double d;
      if (paramInt2 == 0) {
        d = Math.floor((paramInt3 / paramInt1));
      } else if (paramInt1 == 0) {
        d = Math.floor((paramInt4 / paramInt2));
      } else {
        paramInt2 = (int)Math.floor((paramInt4 / paramInt2));
        paramInt1 = (int)Math.floor((paramInt3 / paramInt1));
        if (paramzf1.h) {
          paramInt1 = Math.max(paramInt2, paramInt1);
        } else {
          paramInt1 = Math.min(paramInt2, paramInt1);
        } 
        paramOptions.inSampleSize = paramInt1;
        paramOptions.inJustDecodeBounds = false;
      } 
      paramInt1 = (int)d;
    } else {
      paramInt1 = 1;
    } 
    paramOptions.inSampleSize = paramInt1;
    paramOptions.inJustDecodeBounds = false;
  }
  
  public static BitmapFactory.Options c(zf1 paramzf1) {
    boolean bool = paramzf1.a();
    if (!bool)
      return null; 
    BitmapFactory.Options options = new BitmapFactory.Options();
    options.inJustDecodeBounds = bool;
    return options;
  }
  
  public abstract boolean b(zf1 paramzf1);
  
  public int d() {
    return 0;
  }
  
  public abstract m40 e(zf1 paramzf1);
  
  public boolean f(NetworkInfo paramNetworkInfo) {
    return false;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\dg1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
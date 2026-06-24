import android.app.Notification;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;

public final class b71 implements kt1 {
  public final boolean a;
  
  public final boolean[] b;
  
  public final boolean c;
  
  public final km0 d;
  
  public boolean e;
  
  public b71(Context paramContext, km0 paramkm0) {
    boolean bool2 = true;
    this.b = new boolean[1];
    this.d = paramkm0;
    SharedPreferences sharedPreferences = paramContext.getSharedPreferences("PP", 0);
    int i = sharedPreferences.getInt("k_i_nstl", jm1.d);
    if (i == 2) {
      bool1 = true;
    } else {
      bool1 = false;
    } 
    this.a = bool1;
    if (i == 1) {
      i = 1;
    } else {
      i = 0;
    } 
    if (i != 0 || !sharedPreferences.getBoolean("k_b_mn_adv", true))
      sharedPreferences.getBoolean("k_b_mn_sfav", true); 
    boolean bool1 = bool2;
    if (i == 0)
      if (sharedPreferences.getInt("k_i_mn_bg", jm1.a) == 4) {
        bool1 = bool2;
      } else {
        bool1 = false;
      }  
    this.c = bool1;
  }
  
  public static void d(y51 paramy51, Bitmap paramBitmap, d51 paramd51) {
    s21 s21 = paramd51.b;
    Notification.Builder builder = paramd51.a;
    if (builder != null) {
      builder.setLargeIcon(paramBitmap);
    } else {
      s21.e(paramBitmap);
    } 
    x51 x512 = paramy51.g(lt1.f);
    x51 x511 = x512;
    if (x512 == null)
      x511 = paramy51.g(lt1.e); 
    x512 = x511;
    if (x511 == null)
      x512 = paramy51.g(lt1.i); 
    if (x512 != null) {
      int i = x512.d;
      if (builder != null) {
        builder.setColor(i);
        return;
      } 
      s21.t = i;
    } 
  }
  
  public final void a(Drawable paramDrawable) {}
  
  public final void b() {}
  
  public final void c(Bitmap paramBitmap) {
    boolean[] arrayOfBoolean = this.b;
    km0 km01 = this.d;
    try {
      return;
    } finally {
      paramBitmap = null;
      paramBitmap.printStackTrace();
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\b71.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
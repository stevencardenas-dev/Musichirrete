import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.RectF;

public final class bp2 implements vb2 {
  public final int b;
  
  public final qr2 c;
  
  public final void a(Bitmap paramBitmap) {
    rp0 rp01;
    Bitmap bitmap;
    int i = this.b;
    qr2 qr21 = this.c;
    switch (i) {
      default:
        qr21.c(paramBitmap, 3);
        return;
      case 0:
        break;
    } 
    rp0 rp02 = qr2.v;
    rp02 = null;
    if (paramBitmap == null) {
      rp01 = rp02;
    } else {
      i = rp01.getWidth();
      float f1 = i;
      int j = rp01.getHeight();
      int k = (int)(9.0F * f1 / 16.0F + 0.5F);
      float f2 = (k - j) / 2.0F;
      RectF rectF = new RectF(0.0F, f2, f1, j + f2);
      Bitmap.Config config2 = rp01.getConfig();
      Bitmap.Config config1 = config2;
      if (config2 == null)
        config1 = Bitmap.Config.ARGB_8888; 
      Bitmap bitmap1 = Bitmap.createBitmap(i, k, config1);
      (new Canvas(bitmap1)).drawBitmap((Bitmap)rp01, null, rectF, null);
      bitmap = bitmap1;
    } 
    qr21.c(bitmap, 0);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\bp2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
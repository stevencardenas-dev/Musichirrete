import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import in.krosbits.musicolet.MyApplication;
import java.util.ArrayList;

public final class x61 implements cw1 {
  public final int a;
  
  public final int b;
  
  public final int c;
  
  public x61(int paramInt1, int paramInt2, int paramInt3) {
    this.b = paramInt2;
    this.a = paramInt1;
    this.c = paramInt3;
  }
  
  public final Bitmap a(Bitmap paramBitmap) {
    int j = this.a;
    int i = this.c;
    if (i == 1) {
      i = jn.i(j, 192);
    } else if (i == 2) {
      i = jn.i(j, 153);
    } else {
      if (i == 3) {
        int k;
        Configuration configuration = MyApplication.i.getApplicationContext().getResources().getConfiguration();
        v51 v51 = new v51(paramBitmap);
        v51.d = 576;
        v51.e = -1;
        if (paramBitmap.getWidth() / paramBitmap.getHeight() != configuration.screenWidthDp / configuration.screenHeightDp)
          try {
            if (paramBitmap.getWidth() / paramBitmap.getHeight() > configuration.screenWidthDp / configuration.screenHeightDp) {
              k = paramBitmap.getHeight();
              i = (int)(k * configuration.screenWidthDp / configuration.screenHeightDp);
              v51.b((paramBitmap.getWidth() - i) / 2, 0, (paramBitmap.getWidth() + i) / 2, k);
            } else {
              i = paramBitmap.getWidth();
              k = (int)(i * configuration.screenHeightDp / configuration.screenWidthDp);
              v51.b(0, (paramBitmap.getHeight() - k) / 2, i, (paramBitmap.getHeight() + k) / 2);
            } 
          } finally {} 
        v51.f.clear();
        ArrayList arrayList = v51.b;
        if (arrayList != null)
          arrayList.clear(); 
        x51 x51 = (v51.a()).d;
        int m = this.b;
        if (x51 != null) {
          k = x51.d;
        } else {
          k = m;
        } 
        int n = jn.i(j, 102);
        i = n;
        if (jn.d(m, jn.g(n, k)) < 3.5D) {
          n = jn.i(j, 140);
          i = n;
          if (jn.d(m, jn.g(n, k)) < 3.5D) {
            n = jn.i(j, 178);
            i = n;
            if (jn.d(m, jn.g(n, k)) < 3.5D)
              i = jn.i(j, 216); 
          } 
        } 
        PorterDuffColorFilter porterDuffColorFilter1 = new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_OVER);
        Paint paint1 = new Paint();
        paint1.setColorFilter((ColorFilter)porterDuffColorFilter1);
        Bitmap bitmap1 = Bitmap.createBitmap(paramBitmap.getWidth(), paramBitmap.getHeight(), Bitmap.Config.ARGB_8888);
        (new Canvas(bitmap1)).drawBitmap(paramBitmap, new Matrix(), paint1);
        paramBitmap.recycle();
        return bitmap1;
      } 
      return null;
    } 
    PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_OVER);
    Paint paint = new Paint();
    paint.setColorFilter((ColorFilter)porterDuffColorFilter);
    Bitmap bitmap = Bitmap.createBitmap(paramBitmap.getWidth(), paramBitmap.getHeight(), Bitmap.Config.ARGB_8888);
    (new Canvas(bitmap)).drawBitmap(paramBitmap, new Matrix(), paint);
    paramBitmap.recycle();
    return bitmap;
  }
  
  public final String b() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(x61.class.getName());
    stringBuilder.append(":");
    stringBuilder.append(this.a);
    return stringBuilder.toString();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\x61.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.os.Build;

public final class cz extends Thread {
  public boolean b;
  
  public final dz c;
  
  public cz(dz paramdz) {}
  
  public final void a() {
    System.gc();
    dz dz1 = this.c;
    int i = dz1.m;
    Rect rect1 = dz1.q;
    Rect rect2 = dz1.r;
    Context context = dz1.f;
    float f = dz1.s;
    Bitmap bitmap = dz1.c;
    if (bitmap != null) {
      bitmap.recycle();
      dz1.c = null;
    } 
    if (!dz1.o) {
      int k = rect2.top;
      int i5 = k - rect1.top;
      int i3 = rect2.right;
      int i4 = rect2.left;
      int m = rect1.bottom;
      int j = rect2.bottom;
      int i2 = m - j;
      int i1 = rect1.right - i3;
      m = i4 - rect1.left;
      int n = j - k;
      if (rect1.height() >= rect1.width()) {
        j = 1;
      } else {
        j = 0;
      } 
      Bitmap bitmap1 = dz1.b.copy(Bitmap.Config.ARGB_8888, true);
      Canvas canvas = new Canvas(bitmap1);
      Paint paint2 = new Paint(2);
      paint2.setColor(i);
      paint2.setColorFilter((ColorFilter)new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_ATOP));
      paint2.setAlpha(Color.alpha(i));
      Paint paint1 = new Paint(2);
      i = m92.f;
      if (i == 0) {
        k = 1;
      } else {
        k = 0;
      } 
      if (i == 0 && Build.VERSION.SDK_INT >= 26) {
        i = 1;
      } else {
        i = 0;
      } 
      if (i5 > 20.0F * f) {
        Paint paint;
        int i6 = Math.min(i5, (int)(22.0F * f));
        Bitmap bitmap2 = BitmapFactory.decodeResource(context.getResources(), 2131231052);
        int i8 = bitmap2.getWidth() * i6 / bitmap2.getHeight();
        int i7 = rect1.left + m + (int)(f * 8.0F);
        double d1 = i5 / 2.0D;
        double d2 = i6 / 2.0D;
        Rect rect = new Rect(i7, (int)(d1 - d2), i8 + i7, (int)(d1 + d2));
        if (k != 0) {
          paint = paint2;
        } else {
          paint = paint1;
        } 
        canvas.drawBitmap(bitmap2, null, rect, paint);
        bitmap2.recycle();
      } 
      paint2.setAlpha(Color.alpha(m92.h[6]));
      paint1.setAlpha(137);
      if (j != 0 && i2 >= f * 40.0F) {
        Paint paint;
        Bitmap bitmap2 = BitmapFactory.decodeResource(context.getResources(), 2131231580);
        k = Math.min((int)(f * 48.0F), i2);
        i5 = bitmap2.getWidth() * k / bitmap2.getHeight();
        double d1 = (i3 - i4) / 2.0D;
        double d2 = i5 / 2.0D;
        i3 = (int)(d1 - d2);
        i4 = (int)(d1 + d2);
        d1 = i2 / 2.0D;
        d2 = k / 2.0D;
        i2 = (int)(d1 - d2);
        i5 = (int)(d1 + d2);
        k = rect2.bottom;
        Rect rect = new Rect(i3, i2 + k, i4, i5 + k);
        if (i != 0) {
          paint = paint2;
        } else {
          paint = paint1;
        } 
        canvas.drawBitmap(bitmap2, null, rect, paint);
        bitmap2.recycle();
      } 
      if (j == 0 && i1 >= f * 40.0F && i1 >= m) {
        k = 1;
      } else {
        k = 0;
      } 
      if (k != 0) {
        Paint paint;
        Bitmap bitmap2 = BitmapFactory.decodeResource(context.getResources(), 2131231580);
        String str = ag0.a;
        Matrix matrix = new Matrix();
        matrix.postRotate(-90.0F);
        Bitmap bitmap3 = Bitmap.createBitmap(bitmap2, 0, 0, bitmap2.getWidth(), bitmap2.getHeight(), matrix, true);
        i4 = Math.min((int)(f * 48.0F), i1);
        i3 = bitmap3.getHeight() * i4 / bitmap3.getWidth();
        i2 = rect2.right;
        double d1 = i1 / 2.0D;
        double d2 = i4 / 2.0D;
        i4 = (int)(d1 - d2);
        i1 = (int)(d1 + d2);
        d1 = n / 2.0D;
        d2 = i3 / 2.0D;
        rect2 = new Rect(i4 + i2, (int)(d1 - d2), i2 + i1, (int)(d1 + d2));
        if (i != 0) {
          paint = paint2;
        } else {
          paint = paint1;
        } 
        canvas.drawBitmap(bitmap3, null, rect2, paint);
        bitmap3.recycle();
      } 
      if (j == 0 && k == 0 && m >= f * 40.0F) {
        Bitmap bitmap2 = BitmapFactory.decodeResource(context.getResources(), 2131231580);
        String str = ag0.a;
        Matrix matrix = new Matrix();
        matrix.postRotate(90.0F);
        Bitmap bitmap3 = Bitmap.createBitmap(bitmap2, 0, 0, bitmap2.getWidth(), bitmap2.getHeight(), matrix, true);
        k = Math.min((int)(f * 48.0F), m);
        j = bitmap3.getHeight() * k / bitmap3.getWidth();
        double d2 = m / 2.0D;
        double d1 = k / 2.0D;
        k = (int)(d2 - d1);
        m = (int)(d2 + d1);
        d2 = n / 2.0D;
        d1 = j / 2.0D;
        Rect rect = new Rect(k, (int)(d2 - d1), m, (int)(d2 + d1));
        if (i != 0)
          paint1 = paint2; 
        canvas.drawBitmap(bitmap3, null, rect, paint1);
        bitmap3.recycle();
      } 
      dz1.b.recycle();
      dz1.b = bitmap1;
      dz1.o = true;
    } 
    if (dz1.i.isChecked()) {
      if (!dz1.n) {
        Bitmap bitmap2 = ag0.v0(dz1.e, 24, 24);
        bitmap = dz1.e;
        if (bitmap2 != bitmap)
          bitmap.recycle(); 
        int k = 0;
        bitmap = null;
        while (k < 2) {
          if (bitmap == null) {
            bitmap = wf2.g(bitmap2, 4);
          } else {
            bitmap = wf2.g(bitmap, 4);
          } 
          k++;
        } 
        dz1.e = bitmap;
        bitmap2.recycle();
        bitmap = dz1.e;
        k = Math.max(dz1.b.getWidth(), dz1.b.getHeight());
        dz1.e = Bitmap.createScaledBitmap(bitmap, k, k, true);
        bitmap.recycle();
        dz1.n = true;
      } 
      dz1.c = dz1.e.copy(Bitmap.Config.ARGB_8888, true);
      Canvas canvas = new Canvas(dz1.c);
      Paint paint = new Paint(2);
      if (dz1.b.getWidth() >= dz1.b.getHeight()) {
        i = (int)(canvas.getWidth() * dz1.b.getHeight() / dz1.b.getWidth());
        Bitmap bitmap2 = dz1.b;
        int k = canvas.getHeight() / 2;
        i /= 2;
        canvas.drawBitmap(bitmap2, null, new Rect(0, k - i, canvas.getWidth(), canvas.getHeight() / 2 + i), paint);
        return;
      } 
      i = (int)(canvas.getHeight() * dz1.b.getWidth() / dz1.b.getHeight());
      Bitmap bitmap1 = dz1.b;
      int j = canvas.getWidth() / 2;
      i /= 2;
      canvas.drawBitmap(bitmap1, null, new Rect(j - i, 0, canvas.getWidth() / 2 + i, canvas.getHeight()), paint);
      return;
    } 
    dz1.c = dz1.b.copy(Bitmap.Config.ARGB_8888, true);
  }
  
  public final void run() {
    this.c.k.post(new bz(this, 0));
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\cz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
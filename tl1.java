import android.graphics.Paint;
import android.graphics.Path;

public final class tl1 {
  public static final int[] i = new int[3];
  
  public static final float[] j = new float[] { 0.0F, 0.5F, 1.0F };
  
  public static final int[] k = new int[4];
  
  public static final float[] l = new float[] { 0.0F, 0.0F, 0.5F, 1.0F };
  
  public final Paint a;
  
  public final Paint b;
  
  public final Paint c;
  
  public int d;
  
  public int e;
  
  public int f;
  
  public final Path g = new Path();
  
  public final Paint h;
  
  public tl1() {
    Paint paint = new Paint();
    this.h = paint;
    this.a = new Paint();
    a(-16777216);
    paint.setColor(0);
    paint = new Paint(4);
    this.b = paint;
    paint.setStyle(Paint.Style.FILL);
    this.c = new Paint(paint);
  }
  
  public final void a(int paramInt) {
    this.d = jn.i(paramInt, 68);
    this.e = jn.i(paramInt, 20);
    this.f = jn.i(paramInt, 0);
    this.a.setColor(this.d);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\tl1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import in.krosbits.musicolet.MyApplication;

public final class wg extends Drawable {
  public final int a;
  
  public final Paint b;
  
  public final Paint c;
  
  public int d = (int)(MyApplication.p * 1.0F);
  
  public wg(int paramInt1, int paramInt2) {
    Paint paint = new Paint();
    this.c = paint;
    Paint.Style style = Paint.Style.FILL;
    paint.setStyle(style);
    paint.setColor(m92.h[8]);
    if (paramInt1 != 0) {
      paint = new Paint();
      this.b = paint;
      paint.setStyle(style);
      paint.setColor(paramInt1);
    } else {
      this.b = null;
    } 
  }
  
  private final void a(int paramInt) {}
  
  private final void b(int paramInt) {}
  
  private final void c(ColorFilter paramColorFilter) {}
  
  private final void d(ColorFilter paramColorFilter) {}
  
  public final void draw(Canvas paramCanvas) {
    switch (this.a) {
      default:
        paramCanvas.drawRect(0.0F, 0.0F, getBounds().width(), this.d, this.c);
        paint = this.b;
        if (paint != null)
          paramCanvas.drawRect(0.0F, this.d, getBounds().width(), getBounds().height(), paint); 
        return;
      case 0:
        break;
    } 
    Paint paint = this.b;
    if (paint != null)
      paramCanvas.drawRect(0.0F, 0.0F, getBounds().width(), (getBounds().height() - this.d), paint); 
    paramCanvas.drawRect(0.0F, (getBounds().height() - this.d), getBounds().width(), getBounds().height(), this.c);
  }
  
  public final int getOpacity() {
    switch (this.a) {
      default:
        return -1;
      case 0:
        break;
    } 
    return -1;
  }
  
  public final void setAlpha(int paramInt) {
    paramInt = this.a;
  }
  
  public final void setColorFilter(ColorFilter paramColorFilter) {
    int i = this.a;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\wg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
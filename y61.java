import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.widget.ImageView;

public final class y61 extends BitmapDrawable {
  public Drawable a;
  
  public final long b;
  
  public boolean c;
  
  public int d = 255;
  
  static {
    new Paint();
  }
  
  public y61(Context paramContext, Bitmap paramBitmap, Drawable paramDrawable, int paramInt, boolean paramBoolean) {
    super(paramContext.getResources(), paramBitmap);
    float f = (paramContext.getResources().getDisplayMetrics()).density;
    if (paramInt != 1 && !paramBoolean) {
      this.a = paramDrawable;
      this.c = true;
      this.b = SystemClock.uptimeMillis();
    } 
  }
  
  public static void a(ImageView paramImageView, Context paramContext, Bitmap paramBitmap, int paramInt, boolean paramBoolean) {
    Drawable drawable = paramImageView.getDrawable();
    if (drawable instanceof AnimationDrawable)
      ((AnimationDrawable)drawable).stop(); 
    if (paramBitmap != null && !paramBitmap.isRecycled())
      paramImageView.setImageDrawable((Drawable)new y61(paramContext, paramBitmap, drawable, paramInt, paramBoolean)); 
  }
  
  public static void b(ImageView paramImageView, Drawable paramDrawable) {
    paramImageView.setImageDrawable(paramDrawable);
    if (paramImageView.getDrawable() instanceof AnimationDrawable)
      ((AnimationDrawable)paramImageView.getDrawable()).start(); 
  }
  
  public final void draw(Canvas paramCanvas) {
    try {
      return;
    } finally {
      paramCanvas = null;
      paramCanvas.printStackTrace();
    } 
  }
  
  public final void onBoundsChange(Rect paramRect) {
    Drawable drawable = this.a;
    if (drawable != null)
      drawable.setBounds(paramRect); 
    super.onBoundsChange(paramRect);
  }
  
  public final void setAlpha(int paramInt) {
    this.d = paramInt;
    Drawable drawable = this.a;
    if (drawable != null)
      drawable.setAlpha(paramInt); 
    super.setAlpha(paramInt);
  }
  
  public final void setColorFilter(ColorFilter paramColorFilter) {
    Drawable drawable = this.a;
    if (drawable != null)
      drawable.setColorFilter(paramColorFilter); 
    super.setColorFilter(paramColorFilter);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\y61.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
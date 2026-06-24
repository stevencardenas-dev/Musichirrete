import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.view.animation.Interpolator;

public final class j51 {
  public final BitmapDrawable a;
  
  public float b = 1.0F;
  
  public final Rect c;
  
  public Interpolator d;
  
  public long e;
  
  public final Rect f;
  
  public int g;
  
  public float h = 1.0F;
  
  public long i;
  
  public boolean j;
  
  public boolean k;
  
  public g7 l;
  
  public j51(BitmapDrawable paramBitmapDrawable, Rect paramRect) {
    this.a = paramBitmapDrawable;
    this.f = paramRect;
    paramRect = new Rect(paramRect);
    this.c = paramRect;
    if (paramBitmapDrawable != null) {
      paramBitmapDrawable.setAlpha((int)(this.b * 255.0F));
      paramBitmapDrawable.setBounds(paramRect);
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\j51.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
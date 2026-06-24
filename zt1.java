import android.content.Context;
import android.text.TextPaint;
import java.lang.ref.WeakReference;

public final class zt1 {
  public final TextPaint a = new TextPaint(1);
  
  public final xt1 b = new xt1(this);
  
  public float c;
  
  public float d;
  
  public boolean e = true;
  
  public final WeakReference f = new WeakReference(null);
  
  public vt1 g;
  
  public zt1(yt1 paramyt1) {
    this.f = new WeakReference<yt1>(paramyt1);
  }
  
  public final void a(String paramString) {
    float f1;
    TextPaint textPaint = this.a;
    float f2 = 0.0F;
    if (paramString == null) {
      f1 = 0.0F;
    } else {
      f1 = textPaint.measureText(paramString, 0, paramString.length());
    } 
    this.c = f1;
    if (paramString == null) {
      f1 = f2;
    } else {
      f1 = Math.abs((textPaint.getFontMetrics()).ascent);
    } 
    this.d = f1;
    this.e = false;
  }
  
  public final void b(vt1 paramvt1, Context paramContext) {
    if (this.g != paramvt1) {
      this.g = paramvt1;
      WeakReference<yt1> weakReference = this.f;
      if (paramvt1 != null) {
        TextPaint textPaint = this.a;
        xt1 xt11 = this.b;
        paramvt1.e(paramContext, textPaint, xt11);
        yt1 yt11 = weakReference.get();
        if (yt11 != null)
          textPaint.drawableState = yt11.getState(); 
        paramvt1.d(paramContext, textPaint, xt11);
        this.e = true;
      } 
      yt1 yt1 = weakReference.get();
      if (yt1 != null) {
        yt1.a();
        yt1.onStateChange(yt1.getState());
      } 
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\zt1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
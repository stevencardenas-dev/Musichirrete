import android.widget.ImageView;

public final class n61 implements Runnable {
  public final float b;
  
  public final float c;
  
  public final long e;
  
  public final float f;
  
  public final float g;
  
  public final u61 h;
  
  public n61(u61 paramu61, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4) {
    this.h = paramu61;
    this.b = paramFloat3;
    this.c = paramFloat4;
    this.e = System.currentTimeMillis();
    this.f = paramFloat1;
    this.g = paramFloat2;
  }
  
  public final void run() {
    u61 u611 = this.h;
    ImageView imageView = u611.h();
    if (imageView != null) {
      float f1 = Math.min(1.0F, (float)(System.currentTimeMillis() - this.e) * 1.0F / u611.c);
      f1 = u611.b.getInterpolation(f1);
      float f2 = this.f;
      u611.l(x41.e(this.g, f2, f1, f2) / u611.k(), this.b, this.c);
      if (f1 < 1.0F)
        imageView.postOnAnimation(this); 
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\n61.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
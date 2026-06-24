import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;

public final class q9 {
  public final AudioManager a;
  
  public final p9 b;
  
  public an1 c;
  
  public int d;
  
  public float e = 1.0F;
  
  public q9(Context paramContext, Handler paramHandler, an1 paraman1) {
    this.a = (AudioManager)paramContext.getApplicationContext().getSystemService("audio");
    this.c = paraman1;
    this.b = new p9(this, paramHandler);
    this.d = 0;
  }
  
  public final void a() {
    if (this.d == 0)
      return; 
    if (d12.a < 26) {
      p9 p91 = this.b;
      this.a.abandonAudioFocus(p91);
    } 
    b(0);
  }
  
  public final void b(int paramInt) {
    if (this.d != paramInt) {
      float f;
      this.d = paramInt;
      if (paramInt == 3) {
        f = 0.2F;
      } else {
        f = 1.0F;
      } 
      if (this.e != f) {
        this.e = f;
        an1 an11 = this.c;
        if (an11 != null) {
          bn1 bn1 = an11.b;
          float f1 = bn1.r;
          f = bn1.j.e;
          lz0[] arrayOfLz0 = bn1.b;
          int i = arrayOfLz0.length;
          for (paramInt = 0; paramInt < i; paramInt++) {
            lz0 lz0 = arrayOfLz0[paramInt];
            lz0.getClass();
            a81 a81 = bn1.c.l(lz0);
            n21.r(a81.f ^ true);
            a81.c = 2;
            n21.r(a81.f ^ true);
            a81.d = Float.valueOf(f1 * f);
            a81.b();
          } 
        } 
      } 
    } 
  }
  
  public final int c(int paramInt, boolean paramBoolean) {
    a();
    return paramBoolean ? 1 : -1;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\q9.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
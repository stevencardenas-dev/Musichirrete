import android.graphics.SurfaceTexture;
import android.os.PowerManager;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;

public final class an1 implements SurfaceHolder.Callback, TextureView.SurfaceTextureListener, u71 {
  public final bn1 b;
  
  public an1(bn1 parambn1) {
    this.b = parambn1;
  }
  
  public final void c() {}
  
  public final void n(int paramInt) {
    bn1 bn11 = this.b;
    nf nf = bn11.l;
    p60 p60 = bn11.c;
    up up = bn11.k;
    paramInt = bn11.d();
    if (paramInt != 1)
      if (paramInt != 2 && paramInt != 3) {
        if (paramInt != 4)
          throw new IllegalStateException(); 
      } else {
        boolean bool = p60.j;
        up.b = bool;
        PowerManager.WakeLock wakeLock1 = (PowerManager.WakeLock)up.d;
        if (wakeLock1 != null)
          if (up.a && bool) {
            wakeLock1.acquire();
          } else {
            wakeLock1.release();
          }  
        nf.getClass();
        return;
      }  
    up.b = false;
    PowerManager.WakeLock wakeLock = (PowerManager.WakeLock)up.d;
    if (wakeLock != null)
      wakeLock.release(); 
    nf.getClass();
  }
  
  public final void onSurfaceTextureAvailable(SurfaceTexture paramSurfaceTexture, int paramInt1, int paramInt2) {
    Surface surface = new Surface(paramSurfaceTexture);
    bn1 bn11 = this.b;
    bn1.m(bn11, surface, true);
    bn1.l(bn11, paramInt1, paramInt2);
  }
  
  public final boolean onSurfaceTextureDestroyed(SurfaceTexture paramSurfaceTexture) {
    bn1 bn11 = this.b;
    bn1.m(bn11, null, true);
    bn1.l(bn11, 0, 0);
    return true;
  }
  
  public final void onSurfaceTextureSizeChanged(SurfaceTexture paramSurfaceTexture, int paramInt1, int paramInt2) {
    bn1.l(this.b, paramInt1, paramInt2);
  }
  
  public final void onSurfaceTextureUpdated(SurfaceTexture paramSurfaceTexture) {}
  
  public final void surfaceChanged(SurfaceHolder paramSurfaceHolder, int paramInt1, int paramInt2, int paramInt3) {
    bn1.l(this.b, paramInt2, paramInt3);
  }
  
  public final void surfaceCreated(SurfaceHolder paramSurfaceHolder) {
    Surface surface = paramSurfaceHolder.getSurface();
    bn1.m(this.b, surface, false);
  }
  
  public final void surfaceDestroyed(SurfaceHolder paramSurfaceHolder) {
    bn1 bn11 = this.b;
    bn1.m(bn11, null, false);
    bn1.l(bn11, 0, 0);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\an1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
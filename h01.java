import android.os.Bundle;
import android.support.v4.media.session.PlaybackStateCompat;
import java.lang.ref.WeakReference;

public final class h01 extends ig0 {
  public final WeakReference e;
  
  public h01(g01 paramg01) {
    this.e = new WeakReference<g01>(paramg01);
  }
  
  public final void C(int paramInt) {
    g01 g01 = this.e.get();
    if (g01 != null)
      g01.c(12, Integer.valueOf(paramInt), null); 
  }
  
  public final void D() {
    g01 g01 = this.e.get();
    if (g01 != null)
      g01.c(13, null, null); 
  }
  
  public final void I() {
    throw new AssertionError();
  }
  
  public final void S() {
    throw new AssertionError();
  }
  
  public final void W() {
    throw new AssertionError();
  }
  
  public final void b0() {
    throw new AssertionError();
  }
  
  public final void c0(boolean paramBoolean) {
    g01 g01 = this.e.get();
    if (g01 != null)
      g01.c(11, Boolean.valueOf(paramBoolean), null); 
  }
  
  public final void d() {
    throw new AssertionError();
  }
  
  public final void i(int paramInt) {
    g01 g01 = this.e.get();
    if (g01 != null)
      g01.c(9, Integer.valueOf(paramInt), null); 
  }
  
  public final void i0(PlaybackStateCompat paramPlaybackStateCompat) {
    g01 g01 = this.e.get();
    if (g01 != null)
      g01.c(2, paramPlaybackStateCompat, null); 
  }
  
  public final void j0(String paramString, Bundle paramBundle) {
    g01 g01 = this.e.get();
    if (g01 != null)
      g01.c(1, paramString, paramBundle); 
  }
  
  public final void r() {
    throw new AssertionError();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\h01.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
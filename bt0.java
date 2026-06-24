import android.os.Bundle;
import android.support.v4.media.session.PlaybackStateCompat;
import java.lang.ref.WeakReference;

public final class bt0 extends ig0 {
  public final WeakReference e;
  
  public bt0(nu0 paramnu0) {
    this.e = new WeakReference<nu0>(paramnu0);
  }
  
  public final void C(int paramInt) {
    nu0 nu0 = this.e.get();
    if (nu0 != null)
      nu0.d(12, Integer.valueOf(paramInt), null); 
  }
  
  public final void D() {
    nu0 nu0 = this.e.get();
    if (nu0 != null)
      nu0.d(13, null, null); 
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
    nu0 nu0 = this.e.get();
    if (nu0 != null)
      nu0.d(11, Boolean.valueOf(paramBoolean), null); 
  }
  
  public final void d() {
    throw new AssertionError();
  }
  
  public final void i(int paramInt) {
    nu0 nu0 = this.e.get();
    if (nu0 != null)
      nu0.d(9, Integer.valueOf(paramInt), null); 
  }
  
  public final void i0(PlaybackStateCompat paramPlaybackStateCompat) {
    nu0 nu0 = this.e.get();
    if (nu0 != null)
      nu0.d(2, paramPlaybackStateCompat, null); 
  }
  
  public final void j0(String paramString, Bundle paramBundle) {
    nu0 nu0 = this.e.get();
    if (nu0 != null)
      nu0.d(1, paramString, paramBundle); 
  }
  
  public final void r() {
    throw new AssertionError();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\bt0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.media.RatingCompat;
import in.krosbits.musicolet.BluetoothUsbReceiver;
import in.krosbits.musicolet.MusicService;
import in.krosbits.musicolet.MyApplication;
import java.lang.ref.WeakReference;

public final class l01 {
  public final Object a = new Object();
  
  public final qv0 b = new qv0(1, this);
  
  public WeakReference c = new WeakReference(null);
  
  public cj d;
  
  public final int e;
  
  public l01(int paramInt) {}
  
  public static boolean a() {
    return MyApplication.o().getBoolean("k_b_mstrcc", false);
  }
  
  public final void b(String paramString, Bundle paramBundle) {}
  
  public final void c() {}
  
  public final void d() {}
  
  public final void e() {}
  
  public final void f(String paramString) {}
  
  public final void g(String paramString, Bundle paramBundle) {}
  
  public final void h() {}
  
  public final void i(long paramLong) {}
  
  public void j(float paramFloat) {
    switch (this.e) {
      default:
        return;
      case 1:
        break;
    } 
    if (MusicService.P0 != null && MusicService.F0 && !a() && !BluetoothUsbReceiver.a()) {
      MusicService musicService = MusicService.P0;
      if (musicService != null)
        musicService.getClass(); 
    } 
  }
  
  public final void k(float paramFloat) {}
  
  public final void l(RatingCompat paramRatingCompat) {}
  
  public void m(int paramInt) {
    switch (this.e) {
      default:
        return;
      case 1:
        break;
    } 
    if (MusicService.P0 != null && !BluetoothUsbReceiver.a() && !a() && ew0.d) {
      ws2.d();
      Intent intent = (new Intent(MyApplication.i.getApplicationContext(), MusicService.class)).setAction("A_RMMS").putExtra("E_RMMS", paramInt);
      ag0.n0(MyApplication.i.getApplicationContext(), intent);
    } 
  }
  
  public final void n(int paramInt) {}
  
  public void o(int paramInt) {
    switch (this.e) {
      default:
        return;
      case 1:
        break;
    } 
    if (MusicService.P0 != null && !BluetoothUsbReceiver.a()) {
      boolean bool2 = true;
      boolean bool1 = bool2;
      if (paramInt != 2)
        if (paramInt == 1) {
          bool1 = bool2;
        } else {
          bool1 = false;
        }  
      if (MusicService.C0 != bool1 && !BluetoothUsbReceiver.a() && !a() && ew0.d) {
        ws2.d();
        Intent intent = (new Intent(MyApplication.i.getApplicationContext(), MusicService.class)).setAction("ACT_SFL");
        ag0.n0(MyApplication.i.getApplicationContext(), intent);
      } 
    } 
  }
  
  public final void p(int paramInt) {}
  
  public final void q() {}
  
  public final void r() {}
  
  public final void s(long paramLong) {}
  
  public final void t() {}
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\l01.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
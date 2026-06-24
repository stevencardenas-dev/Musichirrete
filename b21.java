import android.content.Context;
import android.net.ConnectivityManager;
import org.jaudiotagger.audio.opus.bsQ.uvJYmft;

public final class b21 extends qq {
  public final ConnectivityManager f;
  
  public final Object g;
  
  public volatile boolean h;
  
  public final zh0 i;
  
  public b21(Context paramContext, n2 paramn2) {
    super(paramContext, paramn2);
    Object object = this.b.getSystemService("connectivity");
    object.getClass();
    this.f = (ConnectivityManager)object;
    this.g = new Object();
    this.i = new zh0(1, this);
  }
  
  public final Object a() {
    return a21.a(this.f, this.h);
  }
  
  public final void c() {
    try {
      qp0.h().b(a21.a, "Registering network callback");
      ConnectivityManager connectivityManager = this.f;
      zh0 zh01 = this.i;
      connectivityManager.getClass();
      zh01.getClass();
      connectivityManager.registerDefaultNetworkCallback(zh01);
      return;
    } catch (IllegalArgumentException illegalArgumentException) {
      qp0.h().g(a21.a, "Received exception while registering network callback", illegalArgumentException);
    } catch (SecurityException securityException) {}
  }
  
  public final void d() {
    try {
      qp0.h().b(a21.a, uvJYmft.IPqkpESbpIKAPjS);
      this.f.unregisterNetworkCallback(this.i);
      return;
    } catch (IllegalArgumentException illegalArgumentException) {
      qp0.h().g(a21.a, "Received exception while unregistering network callback", illegalArgumentException);
    } catch (SecurityException securityException) {}
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\b21.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
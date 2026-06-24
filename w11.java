import android.net.ConnectivityManager;

public final class w11 implements dq {
  public final ConnectivityManager a;
  
  public w11(ConnectivityManager paramConnectivityManager) {
    this.a = paramConnectivityManager;
  }
  
  public final ai a(hr paramhr) {
    paramhr.getClass();
    ek ek = new ek(paramhr, this, null, 3);
    hh hh = hh.b;
    return new ai(ek, b40.b, -2, hh);
  }
  
  public final boolean b(y72 paramy72) {
    paramy72.getClass();
    hr hr = paramy72.j;
    return (hr.a() != null || hr.a != c21.b);
  }
  
  public final boolean c(y72 paramy72) {
    if (!b(paramy72))
      return false; 
    tp.f("isCurrentlyConstrained() must never be called onNetworkRequestConstraintController. isCurrentlyConstrained() is called only on older platforms where NetworkRequest isn't supported");
    return false;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\w11.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
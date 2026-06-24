import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.pavelsikun.seekbarpreference.lu.FgdLmmRfTxSFKI;

public final class q92 extends ia2 {
  public final byte[] c;
  
  public final nt1 e;
  
  public final ba2 f;
  
  public final s92 g;
  
  public q92(s92 params92, nt1 paramnt11, byte[] paramArrayOfbyte, nt1 paramnt12, ba2 paramba2) {
    super(paramnt11);
  }
  
  public final void a(Exception paramException) {
    if (paramException instanceof l92) {
      super.a(new ni0(-9, paramException));
      return;
    } 
    super.a(paramException);
  }
  
  public final void b() {
    nt1 nt11 = this.e;
    s92 s921 = this.g;
    try {
      ga2 ga2 = s921.e.n;
      Bundle bundle = s92.a(s921, this.c);
      null = new r92();
      this(s921, nt11);
      ea2 ea2 = (ea2)ga2;
      ea2.getClass();
      Parcel parcel = Parcel.obtain();
      parcel.writeInterfaceToken(FgdLmmRfTxSFKI.zfGDDxuiiGgCj);
      int i = z92.a;
      parcel.writeInt(1);
      bundle.writeToParcel(parcel, 0);
      parcel.writeStrongBinder((IBinder)null);
      try {
        ea2.e.transact(2, parcel, null, 1);
        return;
      } finally {
        parcel.recycle();
      } 
    } catch (RemoteException remoteException) {
      ha2 ha2 = s921.a;
      ba2 ba21 = this.f;
      ha2.getClass();
      if (Log.isLoggable("PlayCore", 6))
        Log.e("PlayCore", ha2.c(ha2.a, "requestIntegrityToken(%s)", new Object[] { ba21 }), (Throwable)remoteException); 
      nt11.c(new ni0(-100, (Exception)remoteException));
      return;
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\q92.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
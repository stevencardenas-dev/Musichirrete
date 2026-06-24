import android.content.Context;
import android.os.Parcel;
import android.os.RemoteException;
import com.sdsmdg.harjot.crollerTest.TG.ckOPp;
import org.jaudiotagger.audio.real.Nq.JkpGFvCVQHzgc;

public abstract class al1 {
  public static final rp0 b = new rp0("Session", null);
  
  public final ef2 a;
  
  public al1(Context paramContext, String paramString1, String paramString2) {
    dc2 dc2 = new dc2(this);
    try {
      ef2 ef21 = lf2.b(paramContext).s0(paramString1, paramString2, dc2);
    } catch (RemoteException remoteException) {
      lf2.a.a((Exception)remoteException, "Unable to call %s on %s.", new Object[] { "newSessionImpl", zf2.class.getSimpleName() });
      remoteException = null;
    } catch (wx0 wx0) {}
    this.a = (ef2)wx0;
  }
  
  public final boolean a() {
    n21.j();
    ef2 ef21 = this.a;
    if (ef21 != null)
      try {
        boolean bool;
        ef21 = ef21;
        Parcel parcel = ef21.u(ef21.o(), 5);
        int i = mh2.a;
        if (parcel.readInt() != 0) {
          bool = true;
        } else {
          bool = false;
        } 
        parcel.recycle();
        return bool;
      } catch (RemoteException remoteException) {
        String str = ef2.class.getSimpleName();
        b.a((Exception)remoteException, "Unable to call %s on %s.", new Object[] { "isConnected", str });
      }  
    return false;
  }
  
  public final boolean b() {
    n21.j();
    ef2 ef21 = this.a;
    if (ef21 != null)
      try {
        boolean bool;
        ef21 = ef21;
        Parcel parcel = ef21.u(ef21.o(), 6);
        int i = mh2.a;
        if (parcel.readInt() != 0) {
          bool = true;
        } else {
          bool = false;
        } 
        parcel.recycle();
        return bool;
      } catch (RemoteException remoteException) {
        String str = ef2.class.getSimpleName();
        b.a((Exception)remoteException, "Unable to call %s on %s.", new Object[] { "isConnecting", str });
      }  
    return false;
  }
  
  public final boolean c() {
    n21.j();
    ef2 ef21 = this.a;
    if (ef21 != null)
      try {
        boolean bool;
        ef21 = ef21;
        Parcel parcel = ef21.u(ef21.o(), 8);
        int i = mh2.a;
        if (parcel.readInt() != 0) {
          bool = true;
        } else {
          bool = false;
        } 
        parcel.recycle();
        return bool;
      } catch (RemoteException remoteException) {
        String str = ef2.class.getSimpleName();
        b.a((Exception)remoteException, "Unable to call %s on %s.", new Object[] { "isDisconnected", str });
      }  
    return true;
  }
  
  public final boolean d() {
    n21.j();
    ef2 ef21 = this.a;
    if (ef21 != null)
      try {
        boolean bool;
        ef21 = ef21;
        Parcel parcel = ef21.u(ef21.o(), 9);
        int i = mh2.a;
        if (parcel.readInt() != 0) {
          bool = true;
        } else {
          bool = false;
        } 
        parcel.recycle();
        return bool;
      } catch (RemoteException remoteException) {
        String str1 = ef2.class.getSimpleName();
        String str2 = ckOPp.WDgEVbAeBL;
        b.a((Exception)remoteException, str2, new Object[] { "isResuming", str1 });
      }  
    return false;
  }
  
  public final boolean e() {
    n21.j();
    ef2 ef21 = this.a;
    if (ef21 != null)
      try {
        boolean bool;
        ef21 = ef21;
        Parcel parcel = ef21.u(ef21.o(), 10);
        int i = mh2.a;
        if (parcel.readInt() != 0) {
          bool = true;
        } else {
          bool = false;
        } 
        parcel.recycle();
        return bool;
      } catch (RemoteException remoteException) {
        String str = ef2.class.getSimpleName();
        b.a((Exception)remoteException, "Unable to call %s on %s.", new Object[] { "isSuspended", str });
      }  
    return false;
  }
  
  public final void f(int paramInt) {
    ef2 ef21 = this.a;
    if (ef21 == null)
      return; 
    try {
      ef21 = ef21;
      Parcel parcel = ef21.o();
      parcel.writeInt(paramInt);
      ef21.o0(parcel, 13);
      return;
    } catch (RemoteException remoteException) {
      String str = ef2.class.getSimpleName();
      b.a((Exception)remoteException, "Unable to call %s on %s.", new Object[] { "notifySessionEnded", str });
      return;
    } 
  }
  
  public final int g() {
    n21.j();
    ef2 ef21 = this.a;
    if (ef21 != null)
      try {
        xe2 xe2 = (xe2)ef21;
        Parcel parcel = xe2.u(xe2.o(), 17);
        int i = parcel.readInt();
        parcel.recycle();
        if (i >= 211100000) {
          ef21 = ef21;
          Parcel parcel1 = ef21.u(ef21.o(), 18);
          i = parcel1.readInt();
          parcel1.recycle();
          return i;
        } 
      } catch (RemoteException remoteException) {
        String str1 = ef2.class.getSimpleName();
        String str2 = JkpGFvCVQHzgc.avneqptJukumq;
        b.a((Exception)remoteException, "Unable to call %s on %s.", new Object[] { str2, str1 });
      }  
    return 0;
  }
  
  public final sg0 h() {
    ef2 ef21 = this.a;
    if (ef21 != null)
      try {
        ef21 = ef21;
        Parcel parcel = ef21.u(ef21.o(), 1);
        sg0 sg0 = j31.p0(parcel.readStrongBinder());
        parcel.recycle();
        return sg0;
      } catch (RemoteException remoteException) {
        String str = ef2.class.getSimpleName();
        b.a((Exception)remoteException, "Unable to call %s on %s.", new Object[] { "getWrappedObject", str });
      }  
    return null;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\al1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
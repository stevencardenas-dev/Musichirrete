import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import java.util.Map;

public final class lb2 extends za2 {
  public final ah b;
  
  public final nt1 c;
  
  public final ip2 d;
  
  public lb2(int paramInt, ah paramah, nt1 paramnt1, ip2 paramip2) {
    super(paramInt);
    this.c = paramnt1;
    this.b = paramah;
    this.d = paramip2;
    if (paramInt != 2 || !paramah.c)
      return; 
    l0.l("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
    throw null;
  }
  
  public final u70[] a(qa2 paramqa2) {
    return (u70[])this.b.d;
  }
  
  public final boolean b(qa2 paramqa2) {
    return this.b.c;
  }
  
  public final void c(Status paramStatus) {
    l5 l5;
    this.d.getClass();
    if (paramStatus.e != null) {
      l5 = new l5(paramStatus);
    } else {
      l5 = new l5((Status)l5);
    } 
    this.c.c(l5);
  }
  
  public final void d(Exception paramException) {
    this.c.c(paramException);
  }
  
  public final void e(j01 paramj01, boolean paramBoolean) {
    Map<nt1, Boolean> map = (Map)paramj01.e;
    nt1 nt11 = this.c;
    map.put(nt11, Boolean.valueOf(paramBoolean));
    nt11.a.a(new j01(paramj01, nt11));
  }
  
  public final void f(qa2 paramqa2) {
    nt1 nt11 = this.c;
    try {
      ah ah1 = this.b;
      he0 he0 = paramqa2.f;
      ((kf1)((ah)ah1.e).d).accept(he0, nt11);
      return;
    } catch (DeadObjectException deadObjectException) {
      throw deadObjectException;
    } catch (RemoteException remoteException) {
      c(za2.g(remoteException));
      return;
    } catch (RuntimeException runtimeException) {
      nt11.c(runtimeException);
      return;
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\lb2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
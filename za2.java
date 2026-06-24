import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

public abstract class za2 {
  public final int a;
  
  public za2(int paramInt) {
    this.a = paramInt;
  }
  
  public static Status g(RemoteException paramRemoteException) {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(paramRemoteException.getClass().getSimpleName());
    stringBuilder.append(": ");
    stringBuilder.append(paramRemoteException.getLocalizedMessage());
    return new Status(19, stringBuilder.toString(), null, null);
  }
  
  public abstract u70[] a(qa2 paramqa2);
  
  public abstract boolean b(qa2 paramqa2);
  
  public abstract void c(Status paramStatus);
  
  public abstract void d(Exception paramException);
  
  public abstract void e(j01 paramj01, boolean paramBoolean);
  
  public abstract void f(qa2 paramqa2);
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\za2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
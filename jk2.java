import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.Qg.nFLlOYeP;

public final class jk2 extends ac2 {
  public final IBinder g;
  
  public final yc h;
  
  public jk2(yc paramyc, int paramInt, IBinder paramIBinder, Bundle paramBundle) {
    super(paramyc, paramInt, paramBundle);
    this.g = paramIBinder;
  }
  
  public final boolean a() {
    IInterface iInterface;
    String str = nFLlOYeP.wnrLYp;
    IBinder iBinder = this.g;
    try {
      String str2;
      StringBuilder stringBuilder;
      n21.m(iBinder);
      String str1 = iBinder.getInterfaceDescriptor();
      yc yc1 = this.h;
      String str3 = yc1.j();
      a42 a42 = yc1.o;
      if (!str3.equals(str1)) {
        str2 = yc1.j();
        stringBuilder = new StringBuilder(str2.length() + 34 + String.valueOf(str1).length());
        stringBuilder.append("service descriptor mismatch: ");
        stringBuilder.append(str2);
        stringBuilder.append(" vs. ");
        stringBuilder.append(str1);
        Log.w(str, stringBuilder.toString());
        return false;
      } 
      iInterface = str2.a(iBinder);
      if (iInterface != null && (str2.s(2, 4, iInterface) || str2.s(3, 4, iInterface))) {
        ((yc)str2).u = null;
        str2.e();
        if (stringBuilder != null)
          ((me0)((a42)stringBuilder).c).u(); 
        return true;
      } 
      return false;
    } catch (RemoteException remoteException) {
      Log.w((String)iInterface, "service probably died");
      return false;
    } 
  }
  
  public final void b(sp paramsp) {
    yc yc1 = this.h;
    a42 a42 = yc1.p;
    if (a42 != null)
      ((ne0)a42.c).o(paramsp); 
    yc1.o(paramsp);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\jk2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
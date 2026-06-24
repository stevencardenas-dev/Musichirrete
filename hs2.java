import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import java.util.ArrayList;

public abstract class hs2 {
  public static final rp0 a = new rp0("MediaSessionUtils", null);
  
  public static ArrayList a(sj2 paramsj2) {
    try {
      Parcel parcel = paramsj2.u(paramsj2.o(), 3);
      ArrayList arrayList = parcel.createTypedArrayList(m21.CREATOR);
      parcel.recycle();
      return arrayList;
    } catch (RemoteException remoteException) {
      String str = sj2.class.getSimpleName();
      rp0 rp01 = a;
      Log.e(rp01.a, rp01.c("Unable to call %s on %s.", new Object[] { "getNotificationActions", str }), (Throwable)remoteException);
      return null;
    } 
  }
  
  public static int[] b(sj2 paramsj2) {
    try {
      Parcel parcel = paramsj2.u(paramsj2.o(), 4);
      int[] arrayOfInt = parcel.createIntArray();
      parcel.recycle();
      return arrayOfInt;
    } catch (RemoteException remoteException) {
      String str = sj2.class.getSimpleName();
      rp0 rp01 = a;
      Log.e(rp01.a, rp01.c("Unable to call %s on %s.", new Object[] { "getCompactViewActionIndices", str }), (Throwable)remoteException);
      return null;
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\hs2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
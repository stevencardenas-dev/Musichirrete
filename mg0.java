import android.os.IBinder;
import android.os.Parcel;

public final class mg0 implements ng0 {
  public IBinder e;
  
  public final IBinder asBinder() {
    return this.e;
  }
  
  public final void t(String[] paramArrayOfString) {
    Parcel parcel = Parcel.obtain();
    try {
      parcel.writeInterfaceToken(ng0.a);
      parcel.writeStringArray(paramArrayOfString);
      this.e.transact(1, parcel, null, 1);
      return;
    } finally {
      parcel.recycle();
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\mg0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
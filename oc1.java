import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

public final class oc1 implements qc1 {
  public IBinder e;
  
  public final IBinder asBinder() {
    return this.e;
  }
  
  public final Bundle m(int paramInt, Bundle paramBundle) {
    Parcel parcel1 = Parcel.obtain();
    Parcel parcel2 = Parcel.obtain();
    try {
      parcel1.writeInterfaceToken("aidl.krosbits.RCC_i_v1");
      parcel1.writeInt(paramInt);
      if (paramBundle != null) {
        parcel1.writeInt(1);
        paramBundle.writeToParcel(parcel1, 0);
      } else {
        parcel1.writeInt(0);
      } 
      this.e.transact(1, parcel1, parcel2, 0);
      parcel2.readException();
      Parcelable.Creator creator = Bundle.CREATOR;
      if (parcel2.readInt() != 0) {
        Object object = creator.createFromParcel(parcel2);
      } else {
        creator = null;
      } 
      return (Bundle)creator;
    } finally {
      parcel2.recycle();
      parcel1.recycle();
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\oc1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
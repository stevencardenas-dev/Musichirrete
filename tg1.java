import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

public final class tg1 extends Binder implements vg0 {
  public static final int f = 0;
  
  public final ug1 e;
  
  public tg1(ug1 paramug1) {
    attachInterface(this, vg0.d);
  }
  
  public final IBinder asBinder() {
    return (IBinder)this;
  }
  
  public final boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2) {
    String str = vg0.d;
    if (paramInt1 >= 1 && paramInt1 <= 16777215)
      paramParcel1.enforceInterface(str); 
    if (paramInt1 == 1598968902) {
      paramParcel2.writeString(str);
      return true;
    } 
    if (paramInt1 != 1)
      return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2); 
    paramInt1 = paramParcel1.readInt();
    Bundle bundle = (Bundle)paramParcel1.readTypedObject(Bundle.CREATOR);
    this.e.b(paramInt1, bundle);
    return true;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\tg1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
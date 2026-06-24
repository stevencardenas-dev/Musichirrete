import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class of2 extends Binder implements IInterface {
  public IBinder asBinder() {
    return (IBinder)this;
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2) {
    String str;
    if (paramInt1 > 16777215) {
      if (super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2))
        return true; 
    } else {
      paramParcel1.enforceInterface(getInterfaceDescriptor());
    } 
    ej2 ej2 = (ej2)this;
    if (paramInt1 != 1) {
      boolean bool1 = false;
      if (paramInt1 != 2) {
        if (paramInt1 != 3) {
          if (paramInt1 != 4) {
            if (paramInt1 != 5)
              return false; 
            str = ej2.getStringFlagValue(paramParcel1.readString(), paramParcel1.readString(), paramParcel1.readInt());
            paramParcel2.writeNoException();
            paramParcel2.writeString(str);
            return true;
          } 
          long l = ej2.getLongFlagValue(str.readString(), str.readLong(), str.readInt());
          paramParcel2.writeNoException();
          paramParcel2.writeLong(l);
          return true;
        } 
        paramInt1 = ej2.getIntFlagValue(str.readString(), str.readInt(), str.readInt());
        paramParcel2.writeNoException();
        paramParcel2.writeInt(paramInt1);
        return true;
      } 
      String str1 = str.readString();
      paramInt1 = oh2.a;
      if (str.readInt() != 0)
        bool1 = true; 
      boolean bool = ej2.getBooleanFlagValue(str1, bool1, str.readInt());
      paramParcel2.writeNoException();
      paramParcel2.writeInt(bool);
      return true;
    } 
    ej2.init(j31.p0(str.readStrongBinder()));
    paramParcel2.writeNoException();
    return true;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\of2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
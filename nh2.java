import android.os.BadParcelableException;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

public abstract class nh2 {
  static {
    nh2.class.getClassLoader();
  }
  
  public static Parcelable a(Parcel paramParcel, Parcelable.Creator paramCreator) {
    return (paramParcel.readInt() == 0) ? null : (Parcelable)paramCreator.createFromParcel(paramParcel);
  }
  
  public static void b(Parcel paramParcel, IInterface paramIInterface) {
    if (paramIInterface == null) {
      paramParcel.writeStrongBinder(null);
      return;
    } 
    paramParcel.writeStrongBinder(paramIInterface.asBinder());
  }
  
  public static void c(Parcel paramParcel) {
    int i = paramParcel.dataAvail();
    if (i <= 0)
      return; 
    StringBuilder stringBuilder = new StringBuilder(String.valueOf(i).length() + 45);
    stringBuilder.append("Parcel data not fully consumed, unread size: ");
    stringBuilder.append(i);
    throw new BadParcelableException(stringBuilder.toString());
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\nh2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
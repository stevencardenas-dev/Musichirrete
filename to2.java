import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

public abstract class to2 {
  public static final int a = 0;
  
  static {
    to2.class.getClassLoader();
  }
  
  public static Parcelable a(Parcel paramParcel) {
    Parcelable.Creator creator = Bundle.CREATOR;
    return (paramParcel.readInt() == 0) ? null : (Parcelable)creator.createFromParcel(paramParcel);
  }
  
  public static void b(Parcel paramParcel) {
    int i = paramParcel.dataAvail();
    if (i <= 0)
      return; 
    throw new BadParcelableException(ga1.i("Parcel data not fully consumed, unread size: ", i));
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\to2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
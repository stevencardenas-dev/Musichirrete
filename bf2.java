import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

public abstract class bf2 {
  public static final int a = 0;
  
  static {
    bf2.class.getClassLoader();
  }
  
  public static Parcelable a(Parcel paramParcel) {
    Parcelable.Creator creator = Bundle.CREATOR;
    return (paramParcel.readInt() == 0) ? null : (Parcelable)creator.createFromParcel(paramParcel);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\bf2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
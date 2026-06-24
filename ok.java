import android.os.Parcel;
import android.os.Parcelable;

public final class ok extends j {
  public static final Parcelable.Creator<ok> CREATOR = (Parcelable.Creator<ok>)new i(2);
  
  public boolean e;
  
  public ok(Parcel paramParcel, ClassLoader paramClassLoader) {
    super(paramParcel, paramClassLoader);
    int i = paramParcel.readInt();
    boolean bool = true;
    if (i != 1)
      bool = false; 
    this.e = bool;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt) {
    super.writeToParcel(paramParcel, paramInt);
    paramParcel.writeInt(this.e);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\ok.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
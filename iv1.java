import android.os.Parcel;
import android.os.Parcelable;

public final class iv1 extends j {
  public static final Parcelable.Creator<iv1> CREATOR = (Parcelable.Creator<iv1>)new i(11);
  
  public int e;
  
  public boolean f;
  
  public iv1(Parcel paramParcel, ClassLoader paramClassLoader) {
    super(paramParcel, paramClassLoader);
    boolean bool;
    this.e = paramParcel.readInt();
    if (paramParcel.readInt() != 0) {
      bool = true;
    } else {
      bool = false;
    } 
    this.f = bool;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt) {
    super.writeToParcel(paramParcel, paramInt);
    paramParcel.writeInt(this.e);
    paramParcel.writeInt(this.f);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\iv1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
import android.os.Parcel;
import android.os.Parcelable;

public final class in0 implements Parcelable {
  public static final Parcelable.Creator<in0> CREATOR = new zb2(22);
  
  public int b;
  
  public int c;
  
  public boolean e;
  
  public final int describeContents() {
    return 0;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt) {
    paramParcel.writeInt(this.b);
    paramParcel.writeInt(this.c);
    paramParcel.writeInt(this.e);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\in0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
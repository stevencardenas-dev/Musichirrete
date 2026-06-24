import android.os.Parcel;
import android.os.Parcelable;

public final class hb0 implements Parcelable {
  public static final Parcelable.Creator<hb0> CREATOR = new zb2(18);
  
  public String b;
  
  public int c;
  
  public final int describeContents() {
    return 0;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt) {
    paramParcel.writeString(this.b);
    paramParcel.writeInt(this.c);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\hb0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
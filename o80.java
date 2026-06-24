import android.os.Parcel;
import android.os.Parcelable;

public final class o80 implements Parcelable {
  public static final Parcelable.Creator<o80> CREATOR = new zb2(16);
  
  public int b;
  
  public int c;
  
  public final int describeContents() {
    return 0;
  }
  
  public final String toString() {
    StringBuilder stringBuilder = new StringBuilder("SavedState{mAnchorPosition=");
    stringBuilder.append(this.b);
    stringBuilder.append(", mAnchorOffset=");
    stringBuilder.append(this.c);
    stringBuilder.append('}');
    return stringBuilder.toString();
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt) {
    paramParcel.writeInt(this.b);
    paramParcel.writeInt(this.c);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\o80.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
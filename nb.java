import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

public final class nb implements Parcelable {
  public static final Parcelable.Creator<nb> CREATOR = new zb2(4);
  
  public final ArrayList b;
  
  public final ArrayList c;
  
  public nb(Parcel paramParcel) {
    this.b = paramParcel.createStringArrayList();
    this.c = paramParcel.createTypedArrayList(mb.CREATOR);
  }
  
  public final int describeContents() {
    return 0;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt) {
    paramParcel.writeStringList(this.b);
    paramParcel.writeTypedList(this.c);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\nb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
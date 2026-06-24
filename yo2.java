import android.os.Parcel;
import android.os.Parcelable;

public final class yo2 extends f0 {
  public static final Parcelable.Creator<yo2> CREATOR = new pk2(11);
  
  public final int b;
  
  public yo2(int paramInt) {
    this.b = paramInt;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt) {
    paramInt = qv.D0(paramParcel, 20293);
    qv.C0(paramParcel, 2, 4);
    paramParcel.writeInt(this.b);
    qv.G0(paramParcel, paramInt);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\yo2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
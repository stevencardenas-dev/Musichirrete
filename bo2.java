import android.os.Parcel;
import android.os.Parcelable;

public final class bo2 extends f0 {
  public static final Parcelable.Creator<bo2> CREATOR = new pk2(9);
  
  public final boolean b;
  
  public bo2(boolean paramBoolean) {
    this.b = paramBoolean;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt) {
    paramInt = qv.D0(paramParcel, 20293);
    qv.C0(paramParcel, 2, 4);
    paramParcel.writeInt(this.b);
    qv.G0(paramParcel, paramInt);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\bo2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
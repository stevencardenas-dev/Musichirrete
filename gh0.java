import android.os.Parcel;
import android.os.Parcelable;

public final class gh0 extends f0 {
  public static final Parcelable.Creator<gh0> CREATOR = new pk2(5);
  
  public final int b;
  
  public final int c;
  
  public final int e;
  
  public gh0(int paramInt1, int paramInt2, int paramInt3) {
    this.b = paramInt1;
    this.c = paramInt2;
    this.e = paramInt3;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt) {
    paramInt = qv.D0(paramParcel, 20293);
    qv.C0(paramParcel, 2, 4);
    paramParcel.writeInt(this.b);
    qv.C0(paramParcel, 3, 4);
    paramParcel.writeInt(this.c);
    qv.C0(paramParcel, 4, 4);
    paramParcel.writeInt(this.e);
    qv.G0(paramParcel, paramInt);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\gh0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
import android.os.Parcel;
import android.os.Parcelable;

public final class tk2 extends f0 {
  public static final Parcelable.Creator<tk2> CREATOR = new pk2(2);
  
  public final boolean b;
  
  public final int c;
  
  public tk2(int paramInt, boolean paramBoolean) {
    this.b = paramBoolean;
    this.c = paramInt;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt) {
    paramInt = qv.D0(paramParcel, 20293);
    qv.C0(paramParcel, 2, 4);
    paramParcel.writeInt(this.b);
    qv.C0(paramParcel, 3, 4);
    paramParcel.writeInt(this.c);
    qv.G0(paramParcel, paramInt);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\tk2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
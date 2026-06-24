import android.os.Parcel;
import android.os.Parcelable;

public final class wp extends f0 {
  public static final Parcelable.Creator<wp> CREATOR = new pk2(8);
  
  public final hh1 b;
  
  public final boolean c;
  
  public final boolean e;
  
  public final int[] f;
  
  public final int g;
  
  public final int[] h;
  
  public wp(hh1 paramhh1, boolean paramBoolean1, boolean paramBoolean2, int[] paramArrayOfint1, int paramInt, int[] paramArrayOfint2) {
    this.b = paramhh1;
    this.c = paramBoolean1;
    this.e = paramBoolean2;
    this.f = paramArrayOfint1;
    this.g = paramInt;
    this.h = paramArrayOfint2;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt) {
    int i = qv.D0(paramParcel, 20293);
    qv.u0(paramParcel, 1, this.b, paramInt);
    qv.C0(paramParcel, 2, 4);
    paramParcel.writeInt(this.c);
    qv.C0(paramParcel, 3, 4);
    paramParcel.writeInt(this.e);
    qv.r0(paramParcel, 4, this.f);
    qv.C0(paramParcel, 5, 4);
    paramParcel.writeInt(this.g);
    qv.r0(paramParcel, 6, this.h);
    qv.G0(paramParcel, i);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\wp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
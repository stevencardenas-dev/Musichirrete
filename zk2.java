import android.os.Parcel;
import android.os.Parcelable;

public final class zk2 extends f0 {
  public static final Parcelable.Creator<zk2> CREATOR = new pk2(3);
  
  public final boolean b;
  
  public final boolean c;
  
  public final int e;
  
  public zk2(int paramInt, boolean paramBoolean1, boolean paramBoolean2) {
    this.b = paramBoolean1;
    this.c = paramBoolean2;
    this.e = paramInt;
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


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\zk2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
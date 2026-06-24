import android.os.Parcel;
import android.os.Parcelable;

public final class hh1 extends f0 {
  public static final Parcelable.Creator<hh1> CREATOR = new yb2(4);
  
  public final int b;
  
  public final boolean c;
  
  public final boolean e;
  
  public final int f;
  
  public final int g;
  
  public hh1(int paramInt1, boolean paramBoolean1, boolean paramBoolean2, int paramInt2, int paramInt3) {
    this.b = paramInt1;
    this.c = paramBoolean1;
    this.e = paramBoolean2;
    this.f = paramInt2;
    this.g = paramInt3;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt) {
    paramInt = qv.D0(paramParcel, 20293);
    qv.C0(paramParcel, 1, 4);
    paramParcel.writeInt(this.b);
    qv.C0(paramParcel, 2, 4);
    paramParcel.writeInt(this.c);
    qv.C0(paramParcel, 3, 4);
    paramParcel.writeInt(this.e);
    qv.C0(paramParcel, 4, 4);
    paramParcel.writeInt(this.f);
    qv.C0(paramParcel, 5, 4);
    paramParcel.writeInt(this.g);
    qv.G0(paramParcel, paramInt);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\hh1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
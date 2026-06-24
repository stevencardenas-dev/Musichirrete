import android.os.Parcel;
import android.os.Parcelable;

public final class px0 extends f0 {
  public static final Parcelable.Creator<px0> CREATOR = new lx0(26);
  
  public final int b;
  
  public final int c;
  
  public final int e;
  
  public final long f;
  
  public final long g;
  
  public final String h;
  
  public final String i;
  
  public final int j;
  
  public final int k;
  
  public px0(int paramInt1, int paramInt2, int paramInt3, long paramLong1, long paramLong2, String paramString1, String paramString2, int paramInt4, int paramInt5) {
    this.b = paramInt1;
    this.c = paramInt2;
    this.e = paramInt3;
    this.f = paramLong1;
    this.g = paramLong2;
    this.h = paramString1;
    this.i = paramString2;
    this.j = paramInt4;
    this.k = paramInt5;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt) {
    paramInt = qv.D0(paramParcel, 20293);
    qv.C0(paramParcel, 1, 4);
    paramParcel.writeInt(this.b);
    qv.C0(paramParcel, 2, 4);
    paramParcel.writeInt(this.c);
    qv.C0(paramParcel, 3, 4);
    paramParcel.writeInt(this.e);
    qv.C0(paramParcel, 4, 8);
    paramParcel.writeLong(this.f);
    qv.C0(paramParcel, 5, 8);
    paramParcel.writeLong(this.g);
    qv.v0(paramParcel, 6, this.h);
    qv.v0(paramParcel, 7, this.i);
    qv.C0(paramParcel, 8, 4);
    paramParcel.writeInt(this.j);
    qv.C0(paramParcel, 9, 4);
    paramParcel.writeInt(this.k);
    qv.G0(paramParcel, paramInt);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\px0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
import android.os.Parcel;
import android.os.Parcelable;

public final class nb2 extends f0 {
  public static final Parcelable.Creator<nb2> CREATOR = new lx0(25);
  
  public final int b;
  
  public final sp c;
  
  public final sb2 e;
  
  public nb2(int paramInt, sp paramsp, sb2 paramsb2) {
    this.b = paramInt;
    this.c = paramsp;
    this.e = paramsb2;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt) {
    int i = qv.D0(paramParcel, 20293);
    qv.C0(paramParcel, 1, 4);
    paramParcel.writeInt(this.b);
    qv.u0(paramParcel, 2, this.c, paramInt);
    qv.u0(paramParcel, 3, this.e, paramInt);
    qv.G0(paramParcel, i);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\nb2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
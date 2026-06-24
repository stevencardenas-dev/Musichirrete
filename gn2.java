import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

public final class gn2 extends f0 {
  public static final Parcelable.Creator<gn2> CREATOR = new pk2(7);
  
  public Bundle b;
  
  public u70[] c;
  
  public int e;
  
  public wp f;
  
  public final void writeToParcel(Parcel paramParcel, int paramInt) {
    int i = qv.D0(paramParcel, 20293);
    qv.p0(paramParcel, 1, this.b);
    qv.x0(paramParcel, 2, (Parcelable[])this.c, paramInt);
    int j = this.e;
    qv.C0(paramParcel, 3, 4);
    paramParcel.writeInt(j);
    qv.u0(paramParcel, 4, this.f, paramInt);
    qv.G0(paramParcel, i);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\gn2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
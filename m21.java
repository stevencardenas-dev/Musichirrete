import android.os.Parcel;
import android.os.Parcelable;

public final class m21 extends f0 {
  public static final Parcelable.Creator<m21> CREATOR = new pk2(13);
  
  public final String b;
  
  public final int c;
  
  public final String e;
  
  public m21(String paramString1, int paramInt, String paramString2) {
    this.b = paramString1;
    this.c = paramInt;
    this.e = paramString2;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt) {
    paramInt = qv.D0(paramParcel, 20293);
    qv.v0(paramParcel, 2, this.b);
    qv.C0(paramParcel, 3, 4);
    paramParcel.writeInt(this.c);
    qv.v0(paramParcel, 4, this.e);
    qv.G0(paramParcel, paramInt);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\m21.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
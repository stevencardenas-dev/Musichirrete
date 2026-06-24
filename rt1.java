import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

public final class rt1 extends f0 {
  public static final Parcelable.Creator<rt1> CREATOR = new lx0(20);
  
  public final int b;
  
  public List c;
  
  public rt1(int paramInt, List paramList) {
    this.b = paramInt;
    this.c = paramList;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt) {
    paramInt = qv.D0(paramParcel, 20293);
    qv.C0(paramParcel, 1, 4);
    paramParcel.writeInt(this.b);
    qv.y0(paramParcel, 2, this.c);
    qv.G0(paramParcel, paramInt);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\rt1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
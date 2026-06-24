import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

public final class f22 extends f0 {
  public static final Parcelable.Creator<f22> CREATOR;
  
  public static final rp0 f = new rp0("VideoInfo", null);
  
  public final int b;
  
  public final int c;
  
  public final int e;
  
  static {
    CREATOR = new yb2(28);
  }
  
  public f22(int paramInt1, int paramInt2, int paramInt3) {
    this.b = paramInt1;
    this.c = paramInt2;
    this.e = paramInt3;
  }
  
  public final boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (!(paramObject instanceof f22))
      return false; 
    paramObject = paramObject;
    return (this.c == ((f22)paramObject).c && this.b == ((f22)paramObject).b && this.e == ((f22)paramObject).e);
  }
  
  public final int hashCode() {
    return Arrays.hashCode(new Object[] { Integer.valueOf(this.c), Integer.valueOf(this.b), Integer.valueOf(this.e) });
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


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\f22.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
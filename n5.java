import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

public final class n5 extends f0 {
  public static final Parcelable.Creator<n5> CREATOR = zb2.b;
  
  public static final n5 f;
  
  public final eo b;
  
  public final boolean c;
  
  public boolean e;
  
  static {
    n5 n51 = new n5(null, false);
    n51.e = false;
    f = n51;
  }
  
  public n5(eo parameo, boolean paramBoolean) {
    this.b = parameo;
    this.c = paramBoolean;
  }
  
  public final boolean equals(Object paramObject) {
    if (paramObject instanceof n5) {
      paramObject = paramObject;
      if (z51.g(this.b, ((n5)paramObject).b) && this.e == ((n5)paramObject).e && this.c == ((n5)paramObject).c)
        return true; 
    } 
    return false;
  }
  
  public final int hashCode() {
    boolean bool1 = this.e;
    boolean bool2 = this.c;
    return Arrays.hashCode(new Object[] { this.b, Boolean.valueOf(bool1), Boolean.valueOf(bool2) });
  }
  
  public final String toString() {
    String str = String.valueOf(this.b);
    return x41.o(new StringBuilder(str.length() + 31), "ApiMetadata(complianceOptions=", str, ")");
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt) {
    if (this.e) {
      paramParcel.setDataPosition(paramParcel.dataPosition() - 4);
      paramParcel.setDataSize(paramParcel.dataSize() - 4);
      return;
    } 
    paramParcel.writeInt(-204102970);
    int i = qv.D0(paramParcel, 20293);
    qv.u0(paramParcel, 1, this.b, paramInt);
    qv.C0(paramParcel, 2, 4);
    paramParcel.writeInt(this.c);
    qv.G0(paramParcel, i);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\n5.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
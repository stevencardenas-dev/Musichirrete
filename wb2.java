import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

public final class wb2 extends f0 {
  public static final Parcelable.Creator<wb2> CREATOR = new yb2(8);
  
  public final String b;
  
  public wb2(String paramString) {
    this.b = paramString;
  }
  
  public final boolean equals(Object paramObject) {
    if (paramObject == this)
      return true; 
    if (!(paramObject instanceof wb2))
      return false; 
    paramObject = paramObject;
    return qj.c(this.b, ((wb2)paramObject).b);
  }
  
  public final int hashCode() {
    return Arrays.hashCode(new Object[] { this.b });
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt) {
    paramInt = qv.D0(paramParcel, 20293);
    qv.v0(paramParcel, 2, this.b);
    qv.G0(paramParcel, paramInt);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\wb2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
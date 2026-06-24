import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

public final class oe2 extends f0 {
  public static final Parcelable.Creator<oe2> CREATOR = new yb2(7);
  
  public final he2 b;
  
  public final he2 c;
  
  public oe2(he2 paramhe21, he2 paramhe22) {
    this.b = paramhe21;
    this.c = paramhe22;
  }
  
  public final boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (!(paramObject instanceof oe2))
      return false; 
    paramObject = paramObject;
    return (qj.c(this.b, ((oe2)paramObject).b) && qj.c(this.c, ((oe2)paramObject).c));
  }
  
  public final int hashCode() {
    return Arrays.hashCode(new Object[] { this.b, this.c });
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt) {
    int i = qv.D0(paramParcel, 20293);
    qv.u0(paramParcel, 2, this.b, paramInt);
    qv.u0(paramParcel, 3, this.c, paramInt);
    qv.G0(paramParcel, i);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\oe2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
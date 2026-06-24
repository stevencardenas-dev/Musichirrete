import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

public final class ht extends f0 {
  public static final Parcelable.Creator<ht> CREATOR = new yb2(5);
  
  public final String b;
  
  public final String c;
  
  public ht(String paramString1, String paramString2) {
    this.b = paramString1;
    this.c = paramString2;
  }
  
  public final boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (!(paramObject instanceof ht))
      return false; 
    paramObject = paramObject;
    return (z51.g(this.b, ((ht)paramObject).b) && z51.g(this.c, ((ht)paramObject).c));
  }
  
  public final int hashCode() {
    return Arrays.hashCode(new Object[] { this.b, this.c });
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt) {
    paramInt = qv.D0(paramParcel, 20293);
    qv.v0(paramParcel, 1, this.b);
    qv.v0(paramParcel, 2, this.c);
    qv.G0(paramParcel, paramInt);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\ht.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
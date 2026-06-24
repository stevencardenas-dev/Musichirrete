import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

public final class r2 extends f0 {
  public static final Parcelable.Creator<r2> CREATOR;
  
  public static final rp0 h = new rp0("AdBreakStatus", null);
  
  public final long b;
  
  public final long c;
  
  public final String e;
  
  public final String f;
  
  public final long g;
  
  static {
    CREATOR = new yb2(22);
  }
  
  public r2(long paramLong1, long paramLong2, String paramString1, String paramString2, long paramLong3) {
    this.b = paramLong1;
    this.c = paramLong2;
    this.e = paramString1;
    this.f = paramString2;
    this.g = paramLong3;
  }
  
  public final boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (!(paramObject instanceof r2))
      return false; 
    paramObject = paramObject;
    return (this.b == ((r2)paramObject).b && this.c == ((r2)paramObject).c && qj.c(this.e, ((r2)paramObject).e) && qj.c(this.f, ((r2)paramObject).f) && this.g == ((r2)paramObject).g);
  }
  
  public final int hashCode() {
    long l2 = this.b;
    long l1 = this.c;
    long l3 = this.g;
    return Arrays.hashCode(new Object[] { Long.valueOf(l2), Long.valueOf(l1), this.e, this.f, Long.valueOf(l3) });
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt) {
    paramInt = qv.D0(paramParcel, 20293);
    qv.C0(paramParcel, 2, 8);
    paramParcel.writeLong(this.b);
    qv.C0(paramParcel, 3, 8);
    paramParcel.writeLong(this.c);
    qv.v0(paramParcel, 4, this.e);
    qv.v0(paramParcel, 5, this.f);
    qv.C0(paramParcel, 6, 8);
    paramParcel.writeLong(this.g);
    qv.G0(paramParcel, paramInt);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\r2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
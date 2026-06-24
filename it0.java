import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

public final class it0 extends f0 {
  public static final Parcelable.Creator<it0> CREATOR;
  
  public static final rp0 g = new rp0("MediaLiveSeekableRange", null);
  
  public final long b;
  
  public final long c;
  
  public final boolean e;
  
  public final boolean f;
  
  static {
    CREATOR = new yb2(14);
  }
  
  public it0(long paramLong1, long paramLong2, boolean paramBoolean1, boolean paramBoolean2) {
    this.b = Math.max(paramLong1, 0L);
    this.c = Math.max(paramLong2, 0L);
    this.e = paramBoolean1;
    this.f = paramBoolean2;
  }
  
  public final boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (!(paramObject instanceof it0))
      return false; 
    paramObject = paramObject;
    return (this.b == ((it0)paramObject).b && this.c == ((it0)paramObject).c && this.e == ((it0)paramObject).e && this.f == ((it0)paramObject).f);
  }
  
  public final int hashCode() {
    return Arrays.hashCode(new Object[] { Long.valueOf(this.b), Long.valueOf(this.c), Boolean.valueOf(this.e), Boolean.valueOf(this.f) });
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt) {
    paramInt = qv.D0(paramParcel, 20293);
    qv.C0(paramParcel, 2, 8);
    paramParcel.writeLong(this.b);
    qv.C0(paramParcel, 3, 8);
    paramParcel.writeLong(this.c);
    qv.C0(paramParcel, 4, 4);
    paramParcel.writeInt(this.e);
    qv.C0(paramParcel, 5, 4);
    paramParcel.writeInt(this.f);
    qv.G0(paramParcel, paramInt);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\it0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
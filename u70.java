import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

public final class u70 extends f0 {
  public static final Parcelable.Creator<u70> CREATOR = new yb2(9);
  
  public final String b;
  
  public final int c;
  
  public final long e;
  
  public final boolean f;
  
  public u70(String paramString, int paramInt, long paramLong, boolean paramBoolean) {
    this.b = paramString;
    this.c = paramInt;
    this.e = paramLong;
    this.f = paramBoolean;
  }
  
  public final long e() {
    long l = this.e;
    return (l == -1L) ? this.c : l;
  }
  
  public final boolean equals(Object paramObject) {
    if (paramObject instanceof u70) {
      paramObject = paramObject;
      if (z51.g(this.b, ((u70)paramObject).b) && e() == paramObject.e() && this.f == ((u70)paramObject).f)
        return true; 
    } 
    return false;
  }
  
  public final int hashCode() {
    long l = e();
    boolean bool = this.f;
    return Arrays.hashCode(new Object[] { this.b, Long.valueOf(l), Boolean.valueOf(bool) });
  }
  
  public final String toString() {
    zu zu = new zu(this);
    zu.a("name", this.b);
    zu.a("version", Long.valueOf(e()));
    zu.a("is_fully_rolled_out", Boolean.valueOf(this.f));
    return zu.toString();
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt) {
    paramInt = qv.D0(paramParcel, 20293);
    qv.v0(paramParcel, 1, this.b);
    qv.C0(paramParcel, 2, 4);
    paramParcel.writeInt(this.c);
    long l = e();
    qv.C0(paramParcel, 3, 8);
    paramParcel.writeLong(l);
    qv.C0(paramParcel, 4, 4);
    paramParcel.writeInt(this.f);
    qv.G0(paramParcel, paramInt);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar\\u70.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
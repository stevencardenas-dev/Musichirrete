import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.UUID;

public final class r10 implements Parcelable {
  public static final Parcelable.Creator<r10> CREATOR = new zb2(12);
  
  public int b;
  
  public final UUID c;
  
  public final String e;
  
  public final String f;
  
  public final byte[] g;
  
  public r10(Parcel paramParcel) {
    this.c = new UUID(paramParcel.readLong(), paramParcel.readLong());
    this.e = paramParcel.readString();
    String str = paramParcel.readString();
    int i = d12.a;
    this.f = str;
    this.g = paramParcel.createByteArray();
  }
  
  public final int describeContents() {
    return 0;
  }
  
  public final boolean equals(Object paramObject) {
    if (!(paramObject instanceof r10))
      return false; 
    if (paramObject == this)
      return true; 
    paramObject = paramObject;
    return (d12.a(this.e, ((r10)paramObject).e) && d12.a(this.f, ((r10)paramObject).f) && d12.a(this.c, ((r10)paramObject).c) && Arrays.equals(this.g, ((r10)paramObject).g));
  }
  
  public final int hashCode() {
    if (this.b == 0) {
      int i;
      int j = this.c.hashCode();
      String str = this.e;
      if (str == null) {
        i = 0;
      } else {
        i = str.hashCode();
      } 
      int k = this.f.hashCode();
      this.b = Arrays.hashCode(this.g) + (k + (j * 31 + i) * 31) * 31;
    } 
    return this.b;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt) {
    UUID uUID = this.c;
    paramParcel.writeLong(uUID.getMostSignificantBits());
    paramParcel.writeLong(uUID.getLeastSignificantBits());
    paramParcel.writeString(this.e);
    paramParcel.writeString(this.f);
    paramParcel.writeByteArray(this.g);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\r10.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
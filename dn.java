import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

public final class dn implements Parcelable {
  public static final Parcelable.Creator<dn> CREATOR = new zb2(8);
  
  public final int b;
  
  public final int c;
  
  public final int e;
  
  public final byte[] f;
  
  public int g;
  
  public dn(Parcel paramParcel) {
    this.b = paramParcel.readInt();
    this.c = paramParcel.readInt();
    this.e = paramParcel.readInt();
    int i = d12.a;
    if (paramParcel.readInt() != 0) {
      byte[] arrayOfByte = paramParcel.createByteArray();
    } else {
      paramParcel = null;
    } 
    this.f = (byte[])paramParcel;
  }
  
  public final int describeContents() {
    return 0;
  }
  
  public final boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject != null && dn.class == paramObject.getClass()) {
      paramObject = paramObject;
      if (this.b == ((dn)paramObject).b && this.c == ((dn)paramObject).c && this.e == ((dn)paramObject).e && Arrays.equals(this.f, ((dn)paramObject).f))
        return true; 
    } 
    return false;
  }
  
  public final int hashCode() {
    if (this.g == 0) {
      int j = this.b;
      int i = this.c;
      int k = this.e;
      this.g = Arrays.hashCode(this.f) + (((527 + j) * 31 + i) * 31 + k) * 31;
    } 
    return this.g;
  }
  
  public final String toString() {
    boolean bool;
    StringBuilder stringBuilder = new StringBuilder("ColorInfo(");
    stringBuilder.append(this.b);
    stringBuilder.append(", ");
    stringBuilder.append(this.c);
    stringBuilder.append(", ");
    stringBuilder.append(this.e);
    stringBuilder.append(", ");
    if (this.f != null) {
      bool = true;
    } else {
      bool = false;
    } 
    stringBuilder.append(bool);
    stringBuilder.append(")");
    return stringBuilder.toString();
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt) {
    paramParcel.writeInt(this.b);
    paramParcel.writeInt(this.c);
    paramParcel.writeInt(this.e);
    byte[] arrayOfByte = this.f;
    if (arrayOfByte != null) {
      paramInt = 1;
    } else {
      paramInt = 0;
    } 
    int i = d12.a;
    paramParcel.writeInt(paramInt);
    if (arrayOfByte != null)
      paramParcel.writeByteArray(arrayOfByte); 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\dn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
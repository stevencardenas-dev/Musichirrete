import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

public final class qx implements Parcelable {
  public static final Parcelable.Creator<qx> CREATOR = new zb2(10);
  
  public final int b;
  
  public final int[] c;
  
  public final int e;
  
  public final int f;
  
  public qx(Parcel paramParcel) {
    this.b = paramParcel.readInt();
    int[] arrayOfInt = new int[paramParcel.readByte()];
    this.c = arrayOfInt;
    paramParcel.readIntArray(arrayOfInt);
    this.e = paramParcel.readInt();
    this.f = paramParcel.readInt();
  }
  
  public final int describeContents() {
    return 0;
  }
  
  public final boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject != null && qx.class == paramObject.getClass()) {
      paramObject = paramObject;
      if (this.b == ((qx)paramObject).b && Arrays.equals(this.c, ((qx)paramObject).c) && this.e == ((qx)paramObject).e && this.f == ((qx)paramObject).f)
        return true; 
    } 
    return false;
  }
  
  public final int hashCode() {
    int i = this.b;
    return ((Arrays.hashCode(this.c) + i * 31) * 31 + this.e) * 31 + this.f;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt) {
    paramParcel.writeInt(this.b);
    int[] arrayOfInt = this.c;
    paramParcel.writeInt(arrayOfInt.length);
    paramParcel.writeIntArray(arrayOfInt);
    paramParcel.writeInt(this.e);
    paramParcel.writeInt(this.f);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\qx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
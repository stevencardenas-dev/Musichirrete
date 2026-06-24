import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

public final class nx0 implements Parcelable {
  public static final Parcelable.Creator<nx0> CREATOR = new lx0(0);
  
  public final mx0[] b;
  
  public nx0(Parcel paramParcel) {
    this.b = new mx0[paramParcel.readInt()];
    byte b = 0;
    while (true) {
      mx0[] arrayOfMx0 = this.b;
      if (b < arrayOfMx0.length) {
        if (paramParcel.readParcelable(mx0.class.getClassLoader()) == null) {
          arrayOfMx0[b] = null;
          b++;
          continue;
        } 
        tp.b();
        throw null;
      } 
      break;
    } 
  }
  
  public final int describeContents() {
    return 0;
  }
  
  public final boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject == null || nx0.class != paramObject.getClass())
      return false; 
    paramObject = paramObject;
    return Arrays.equals((Object[])this.b, (Object[])((nx0)paramObject).b);
  }
  
  public final int hashCode() {
    return Arrays.hashCode((Object[])this.b);
  }
  
  public final String toString() {
    StringBuilder stringBuilder = new StringBuilder("entries=");
    stringBuilder.append(Arrays.toString((Object[])this.b));
    return stringBuilder.toString();
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt) {
    mx0[] arrayOfMx0 = this.b;
    paramParcel.writeInt(arrayOfMx0.length);
    int i = arrayOfMx0.length;
    for (paramInt = 0; paramInt < i; paramInt++) {
      mx0 mx01 = arrayOfMx0[paramInt];
      paramParcel.writeParcelable(null, 0);
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\nx0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
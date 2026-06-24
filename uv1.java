import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

public final class uv1 implements Parcelable {
  public static final Parcelable.Creator<uv1> CREATOR = new lx0(16);
  
  public final int b;
  
  public final la0[] c;
  
  public int e;
  
  public uv1(Parcel paramParcel) {
    int i = paramParcel.readInt();
    this.b = i;
    this.c = new la0[i];
    for (i = 0; i < this.b; i++)
      this.c[i] = (la0)paramParcel.readParcelable(la0.class.getClassLoader()); 
  }
  
  public uv1(la0... paramVarArgs) {
    boolean bool;
    if (paramVarArgs.length > 0) {
      bool = true;
    } else {
      bool = false;
    } 
    n21.r(bool);
    this.c = paramVarArgs;
    this.b = paramVarArgs.length;
  }
  
  public final int describeContents() {
    return 0;
  }
  
  public final boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject != null && uv1.class == paramObject.getClass()) {
      paramObject = paramObject;
      if (this.b == ((uv1)paramObject).b && Arrays.equals((Object[])this.c, (Object[])((uv1)paramObject).c))
        return true; 
    } 
    return false;
  }
  
  public final int hashCode() {
    if (this.e == 0)
      this.e = 527 + Arrays.hashCode((Object[])this.c); 
    return this.e;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt) {
    int i = this.b;
    paramParcel.writeInt(i);
    for (paramInt = 0; paramInt < i; paramInt++)
      paramParcel.writeParcelable(this.c[paramInt], 0); 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar\\uv1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
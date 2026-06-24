import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

public final class vv1 implements Parcelable {
  public static final Parcelable.Creator<vv1> CREATOR;
  
  public static final vv1 f = new vv1(new uv1[0]);
  
  public final int b;
  
  public final uv1[] c;
  
  public int e;
  
  static {
    CREATOR = new lx0(17);
  }
  
  public vv1(Parcel paramParcel) {
    int i = paramParcel.readInt();
    this.b = i;
    this.c = new uv1[i];
    for (i = 0; i < this.b; i++)
      this.c[i] = (uv1)paramParcel.readParcelable(uv1.class.getClassLoader()); 
  }
  
  public vv1(uv1... paramVarArgs) {
    this.c = paramVarArgs;
    this.b = paramVarArgs.length;
  }
  
  public final int describeContents() {
    return 0;
  }
  
  public final boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject != null && vv1.class == paramObject.getClass()) {
      paramObject = paramObject;
      if (this.b == ((vv1)paramObject).b && Arrays.equals((Object[])this.c, (Object[])((vv1)paramObject).c))
        return true; 
    } 
    return false;
  }
  
  public final int hashCode() {
    if (this.e == 0)
      this.e = Arrays.hashCode((Object[])this.c); 
    return this.e;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt) {
    int i = this.b;
    paramParcel.writeInt(i);
    for (paramInt = 0; paramInt < i; paramInt++)
      paramParcel.writeParcelable(this.c[paramInt], 0); 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\vv1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
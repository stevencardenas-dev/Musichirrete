import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Comparator;

public final class s10 implements Comparator, Parcelable {
  public static final Parcelable.Creator<s10> CREATOR = new zb2(11);
  
  public final r10[] b;
  
  public int c;
  
  public final String e;
  
  public s10(Parcel paramParcel) {
    this.e = paramParcel.readString();
    r10[] arrayOfR10 = (r10[])paramParcel.createTypedArray(r10.CREATOR);
    int i = d12.a;
    this.b = arrayOfR10;
    i = arrayOfR10.length;
  }
  
  public final int compare(Object paramObject1, Object paramObject2) {
    paramObject1 = paramObject1;
    r10 r101 = (r10)paramObject2;
    paramObject2 = rh.a;
    return paramObject2.equals(((r10)paramObject1).c) ? (paramObject2.equals(r101.c) ? 0 : 1) : ((r10)paramObject1).c.compareTo(r101.c);
  }
  
  public final int describeContents() {
    return 0;
  }
  
  public final boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject != null && s10.class == paramObject.getClass()) {
      paramObject = paramObject;
      if (d12.a(this.e, ((s10)paramObject).e) && Arrays.equals((Object[])this.b, (Object[])((s10)paramObject).b))
        return true; 
    } 
    return false;
  }
  
  public final int hashCode() {
    if (this.c == 0) {
      int i;
      String str = this.e;
      if (str == null) {
        i = 0;
      } else {
        i = str.hashCode();
      } 
      this.c = i * 31 + Arrays.hashCode((Object[])this.b);
    } 
    return this.c;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt) {
    paramParcel.writeString(this.e);
    paramParcel.writeTypedArray((Parcelable[])this.b, 0);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\s10.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
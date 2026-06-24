import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;

public final class qk2 extends f0 {
  public static final Parcelable.Creator<qk2> CREATOR = new pk2(0);
  
  public final String b;
  
  public final byte[] c;
  
  public final ArrayList e;
  
  public qk2(String paramString, byte[] paramArrayOfbyte, ArrayList<?> paramArrayList) {
    ArrayList arrayList;
    this.b = paramString;
    this.c = paramArrayOfbyte;
    if (paramArrayList == null) {
      arrayList = new ArrayList(0);
    } else {
      arrayList = new ArrayList(paramArrayList);
    } 
    this.e = arrayList;
  }
  
  public final boolean equals(Object paramObject) {
    if (paramObject == this)
      return true; 
    if (paramObject instanceof qk2) {
      paramObject = paramObject;
      if (z51.g(this.b, ((qk2)paramObject).b) && z51.g(this.c, ((qk2)paramObject).c) && z51.g(this.e, ((qk2)paramObject).e))
        return true; 
    } 
    return false;
  }
  
  public final int hashCode() {
    byte[] arrayOfByte = this.c;
    ArrayList arrayList = this.e;
    return Arrays.hashCode(new Object[] { this.b, arrayOfByte, arrayList });
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt) {
    int i = qv.D0(paramParcel, 20293);
    qv.v0(paramParcel, 1, this.b);
    byte[] arrayOfByte = this.c;
    if (arrayOfByte != null) {
      paramInt = qv.D0(paramParcel, 2);
      paramParcel.writeByteArray(arrayOfByte);
      qv.G0(paramParcel, paramInt);
    } 
    ArrayList<Integer> arrayList = new ArrayList(this.e);
    int j = qv.D0(paramParcel, 3);
    int k = arrayList.size();
    paramParcel.writeInt(k);
    for (paramInt = 0; paramInt < k; paramInt++)
      paramParcel.writeInt(((Integer)arrayList.get(paramInt)).intValue()); 
    qv.G0(paramParcel, j);
    qv.G0(paramParcel, i);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\qk2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
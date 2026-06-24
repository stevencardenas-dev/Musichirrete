import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;

public final class ks extends j {
  public static final Parcelable.Creator<ks> CREATOR = (Parcelable.Creator<ks>)new i(3);
  
  public SparseArray e;
  
  public ks(Parcel paramParcel, ClassLoader paramClassLoader) {
    super(paramParcel, paramClassLoader);
    int i = paramParcel.readInt();
    int[] arrayOfInt = new int[i];
    paramParcel.readIntArray(arrayOfInt);
    Parcelable[] arrayOfParcelable = paramParcel.readParcelableArray(paramClassLoader);
    this.e = new SparseArray(i);
    for (byte b = 0; b < i; b++)
      this.e.append(arrayOfInt[b], arrayOfParcelable[b]); 
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt) {
    byte b1;
    super.writeToParcel(paramParcel, paramInt);
    SparseArray sparseArray = this.e;
    byte b2 = 0;
    if (sparseArray != null) {
      b1 = sparseArray.size();
    } else {
      b1 = 0;
    } 
    paramParcel.writeInt(b1);
    int[] arrayOfInt = new int[b1];
    Parcelable[] arrayOfParcelable = new Parcelable[b1];
    while (b2 < b1) {
      arrayOfInt[b2] = this.e.keyAt(b2);
      arrayOfParcelable[b2] = (Parcelable)this.e.valueAt(b2);
      b2++;
    } 
    paramParcel.writeIntArray(arrayOfInt);
    paramParcel.writeParcelableArray(arrayOfParcelable, paramInt);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\ks.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
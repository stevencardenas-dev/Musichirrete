import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

public final class yo1 implements Parcelable {
  public static final Parcelable.Creator<yo1> CREATOR = new lx0(14);
  
  public int b;
  
  public int c;
  
  public int[] e;
  
  public boolean f;
  
  public final int describeContents() {
    return 0;
  }
  
  public final String toString() {
    StringBuilder stringBuilder = new StringBuilder("FullSpanItem{mPosition=");
    stringBuilder.append(this.b);
    stringBuilder.append(", mGapDir=");
    stringBuilder.append(this.c);
    stringBuilder.append(", mHasUnwantedGapAfter=");
    stringBuilder.append(this.f);
    stringBuilder.append(", mGapPerSpan=");
    stringBuilder.append(Arrays.toString(this.e));
    stringBuilder.append('}');
    return stringBuilder.toString();
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt) {
    paramParcel.writeInt(this.b);
    paramParcel.writeInt(this.c);
    paramParcel.writeInt(this.f);
    int[] arrayOfInt = this.e;
    if (arrayOfInt != null && arrayOfInt.length > 0) {
      paramParcel.writeInt(arrayOfInt.length);
      paramParcel.writeIntArray(this.e);
      return;
    } 
    paramParcel.writeInt(0);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\yo1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
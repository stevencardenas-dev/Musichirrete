import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;

public final class x91 extends l91 {
  public static final Parcelable.Creator<x91> CREATOR = new lx0(8);
  
  public final int b;
  
  public x91(int paramInt) {
    super((Parcelable)AbsSavedState.EMPTY_STATE);
    this.b = paramInt;
  }
  
  public x91(Parcel paramParcel) {
    super(paramParcel);
    this.b = paramParcel.readInt();
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt) {
    super.writeToParcel(paramParcel, paramInt);
    paramParcel.writeInt(this.b);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\x91.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
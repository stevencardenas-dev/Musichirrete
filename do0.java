import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;

public final class do0 extends l91 {
  public static final Parcelable.Creator<do0> CREATOR = new zb2(23);
  
  public String b;
  
  public do0() {
    super((Parcelable)AbsSavedState.EMPTY_STATE);
  }
  
  public do0(Parcel paramParcel) {
    super(paramParcel);
    this.b = paramParcel.readString();
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt) {
    super.writeToParcel(paramParcel, paramInt);
    paramParcel.writeString(this.b);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\do0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
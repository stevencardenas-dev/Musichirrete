import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;

public final class k30 extends l91 {
  public static final Parcelable.Creator<k30> CREATOR = new zb2(13);
  
  public String b;
  
  public k30() {
    super((Parcelable)AbsSavedState.EMPTY_STATE);
  }
  
  public k30(Parcel paramParcel) {
    super(paramParcel);
    this.b = paramParcel.readString();
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt) {
    super.writeToParcel(paramParcel, paramInt);
    paramParcel.writeString(this.b);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\k30.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
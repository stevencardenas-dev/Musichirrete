import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

public final class s7 extends View.BaseSavedState {
  public static final Parcelable.Creator<s7> CREATOR = new zb2(2);
  
  public boolean b;
  
  public final void writeToParcel(Parcel paramParcel, int paramInt) {
    super.writeToParcel(paramParcel, paramInt);
    paramParcel.writeByte((byte)this.b);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\s7.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
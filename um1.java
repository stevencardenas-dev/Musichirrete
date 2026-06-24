import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import com.google.android.material.sidesheet.SideSheetBehavior;

public final class um1 extends j {
  public static final Parcelable.Creator<um1> CREATOR = (Parcelable.Creator<um1>)new i(9);
  
  public final int e;
  
  public um1(Parcel paramParcel, ClassLoader paramClassLoader) {
    super(paramParcel, paramClassLoader);
    this.e = paramParcel.readInt();
  }
  
  public um1(SideSheetBehavior paramSideSheetBehavior) {
    super((Parcelable)AbsSavedState.EMPTY_STATE);
    this.e = paramSideSheetBehavior.h;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt) {
    super.writeToParcel(paramParcel, paramInt);
    paramParcel.writeInt(this.e);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar\\um1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
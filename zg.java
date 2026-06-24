import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

public final class zg extends j {
  public static final Parcelable.Creator<zg> CREATOR = (Parcelable.Creator<zg>)new i(1);
  
  public final int e;
  
  public final int f;
  
  public final boolean g;
  
  public final boolean h;
  
  public final boolean i;
  
  public zg(Parcel paramParcel, ClassLoader paramClassLoader) {
    super(paramParcel, paramClassLoader);
    this.e = paramParcel.readInt();
    this.f = paramParcel.readInt();
    int i = paramParcel.readInt();
    boolean bool2 = false;
    if (i == 1) {
      bool1 = true;
    } else {
      bool1 = false;
    } 
    this.g = bool1;
    if (paramParcel.readInt() == 1) {
      bool1 = true;
    } else {
      bool1 = false;
    } 
    this.h = bool1;
    boolean bool1 = bool2;
    if (paramParcel.readInt() == 1)
      bool1 = true; 
    this.i = bool1;
  }
  
  public zg(BottomSheetBehavior paramBottomSheetBehavior) {
    super((Parcelable)AbsSavedState.EMPTY_STATE);
    this.e = paramBottomSheetBehavior.N;
    this.f = paramBottomSheetBehavior.e;
    this.g = paramBottomSheetBehavior.b;
    this.h = paramBottomSheetBehavior.I;
    this.i = paramBottomSheetBehavior.J;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt) {
    super.writeToParcel(paramParcel, paramInt);
    paramParcel.writeInt(this.e);
    paramParcel.writeInt(this.f);
    paramParcel.writeInt(this.g);
    paramParcel.writeInt(this.h);
    paramParcel.writeInt(this.i);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\zg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
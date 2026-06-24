import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;

public final class hy1 extends l91 {
  public static final Parcelable.Creator<hy1> CREATOR = new lx0(19);
  
  public boolean b;
  
  public hy1() {
    super((Parcelable)AbsSavedState.EMPTY_STATE);
  }
  
  public hy1(Parcel paramParcel) {
    super(paramParcel);
    int i = paramParcel.readInt();
    boolean bool = true;
    if (i != 1)
      bool = false; 
    this.b = bool;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt) {
    super.writeToParcel(paramParcel, paramInt);
    paramParcel.writeInt(this.b);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\hy1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
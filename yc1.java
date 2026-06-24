import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;

public final class yc1 extends AbsSavedState {
  public static final Parcelable.Creator<yc1> CREATOR = new lx0(10);
  
  public float b;
  
  public int c;
  
  public yc1(Parcel paramParcel) {
    super(paramParcel.readParcelable(yc1.class.getClassLoader()));
    this.b = paramParcel.readFloat();
    this.c = paramParcel.readInt();
  }
  
  public yc1(wd paramwd) {
    super((Parcelable)paramwd);
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt) {
    super.writeToParcel(paramParcel, paramInt);
    paramParcel.writeFloat(this.b);
    paramParcel.writeInt(this.c);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\yc1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;

public final class xc1 extends AbsSavedState {
  public static final Parcelable.Creator<xc1> CREATOR = new lx0(9);
  
  public float b;
  
  public int c;
  
  public xc1(Parcel paramParcel) {
    super(paramParcel.readParcelable(xc1.class.getClassLoader()));
    this.b = paramParcel.readFloat();
    this.c = paramParcel.readInt();
  }
  
  public xc1(ud paramud) {
    super((Parcelable)paramud);
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt) {
    super.writeToParcel(paramParcel, paramInt);
    paramParcel.writeFloat(this.b);
    paramParcel.writeInt(this.c);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\xc1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;

public final class ak1 extends l91 {
  public static final Parcelable.Creator<ak1> CREATOR = new lx0(13);
  
  public int b;
  
  public int c;
  
  public int e;
  
  public ak1() {
    super((Parcelable)AbsSavedState.EMPTY_STATE);
  }
  
  public ak1(Parcel paramParcel) {
    super(paramParcel);
    this.b = paramParcel.readInt();
    this.c = paramParcel.readInt();
    this.e = paramParcel.readInt();
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt) {
    super.writeToParcel(paramParcel, paramInt);
    paramParcel.writeInt(this.b);
    paramParcel.writeInt(this.c);
    paramParcel.writeInt(this.e);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\ak1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

public final class mb0 implements Parcelable {
  public static final Parcelable.Creator<mb0> CREATOR = new zb2(19);
  
  public ArrayList b;
  
  public ArrayList c;
  
  public mb[] e;
  
  public int f;
  
  public String g;
  
  public ArrayList h;
  
  public ArrayList i;
  
  public ArrayList j;
  
  public final int describeContents() {
    return 0;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt) {
    paramParcel.writeStringList(this.b);
    paramParcel.writeStringList(this.c);
    paramParcel.writeTypedArray((Parcelable[])this.e, paramInt);
    paramParcel.writeInt(this.f);
    paramParcel.writeString(this.g);
    paramParcel.writeStringList(this.h);
    paramParcel.writeTypedList(this.i);
    paramParcel.writeTypedList(this.j);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\mb0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
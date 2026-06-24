import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

public final class zo1 implements Parcelable {
  public static final Parcelable.Creator<zo1> CREATOR = new lx0(15);
  
  public int b;
  
  public int c;
  
  public int e;
  
  public int[] f;
  
  public int g;
  
  public int[] h;
  
  public ArrayList i;
  
  public boolean j;
  
  public boolean k;
  
  public boolean l;
  
  public final int describeContents() {
    return 0;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt) {
    paramParcel.writeInt(this.b);
    paramParcel.writeInt(this.c);
    paramParcel.writeInt(this.e);
    if (this.e > 0)
      paramParcel.writeIntArray(this.f); 
    paramParcel.writeInt(this.g);
    if (this.g > 0)
      paramParcel.writeIntArray(this.h); 
    paramParcel.writeInt(this.j);
    paramParcel.writeInt(this.k);
    paramParcel.writeInt(this.l);
    paramParcel.writeList(this.i);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\zo1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
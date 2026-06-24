import android.os.Parcel;
import android.os.Parcelable;

public final class ds0 extends j {
  public static final Parcelable.Creator<ds0> CREATOR = (Parcelable.Creator<ds0>)new i(6);
  
  public boolean e;
  
  public ds0(Parcel paramParcel, ClassLoader paramClassLoader) {
    super(paramParcel, paramClassLoader);
    if (paramClassLoader == null)
      ds0.class.getClassLoader(); 
    int i = paramParcel.readInt();
    boolean bool = true;
    if (i != 1)
      bool = false; 
    this.e = bool;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt) {
    super.writeToParcel(paramParcel, paramInt);
    paramParcel.writeInt(this.e);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\ds0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
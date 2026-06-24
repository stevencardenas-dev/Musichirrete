import android.os.Parcel;
import android.os.Parcelable;

public abstract class j implements Parcelable {
  public static final Parcelable.Creator<j> CREATOR;
  
  public static final h c = (h)new j();
  
  public final Parcelable b;
  
  static {
    CREATOR = (Parcelable.Creator<j>)new i(0);
  }
  
  public j() {
    this.b = null;
  }
  
  public j(Parcel paramParcel, ClassLoader paramClassLoader) {
    Parcelable parcelable = paramParcel.readParcelable(paramClassLoader);
    if (parcelable == null)
      parcelable = c; 
    this.b = parcelable;
  }
  
  public j(Parcelable paramParcelable) {
    if (paramParcelable != null) {
      if (paramParcelable == c)
        paramParcelable = null; 
      this.b = paramParcelable;
      return;
    } 
    l0.l("superState must not be null");
    throw null;
  }
  
  public final int describeContents() {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt) {
    paramParcel.writeParcelable(this.b, paramInt);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
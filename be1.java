import android.os.Parcel;
import android.os.Parcelable;
import androidx.recyclerview.widget.a;

public final class be1 extends j {
  public static final Parcelable.Creator<be1> CREATOR = (Parcelable.Creator<be1>)new i(7);
  
  public Parcelable e;
  
  public be1(Parcel paramParcel, ClassLoader paramClassLoader) {
    super(paramParcel, paramClassLoader);
    if (paramClassLoader == null)
      paramClassLoader = a.class.getClassLoader(); 
    this.e = paramParcel.readParcelable(paramClassLoader);
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt) {
    super.writeToParcel(paramParcel, paramInt);
    paramParcel.writeParcelable(this.e, 0);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\be1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
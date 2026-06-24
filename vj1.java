import android.os.Parcel;
import android.os.Parcelable;

public final class vj1 extends j {
  public static final Parcelable.Creator<vj1> CREATOR = (Parcelable.Creator<vj1>)new i(8);
  
  public boolean e;
  
  public vj1(Parcel paramParcel, ClassLoader paramClassLoader) {
    super(paramParcel, paramClassLoader);
    this.e = ((Boolean)paramParcel.readValue(null)).booleanValue();
  }
  
  public final String toString() {
    StringBuilder stringBuilder = new StringBuilder("SearchView.SavedState{");
    stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
    stringBuilder.append(" isIconified=");
    stringBuilder.append(this.e);
    stringBuilder.append("}");
    return stringBuilder.toString();
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt) {
    super.writeToParcel(paramParcel, paramInt);
    paramParcel.writeValue(Boolean.valueOf(this.e));
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\vj1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
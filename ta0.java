import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

public final class ta0 implements Parcelable {
  public static final Parcelable.Creator<ta0> CREATOR = (Parcelable.Creator<ta0>)new i(5);
  
  public final Bundle b;
  
  public ta0(Bundle paramBundle) {
    this.b = paramBundle;
  }
  
  public ta0(Parcel paramParcel, ClassLoader paramClassLoader) {
    Bundle bundle = paramParcel.readBundle();
    this.b = bundle;
    if (paramClassLoader != null && bundle != null)
      bundle.setClassLoader(paramClassLoader); 
  }
  
  public final int describeContents() {
    return 0;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt) {
    paramParcel.writeBundle(this.b);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\ta0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
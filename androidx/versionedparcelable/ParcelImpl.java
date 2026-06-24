package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import b22;
import c22;
import lx0;

public class ParcelImpl implements Parcelable {
  public static final Parcelable.Creator<ParcelImpl> CREATOR = (Parcelable.Creator<ParcelImpl>)new lx0(4);
  
  public final c22 b;
  
  public ParcelImpl(Parcel paramParcel) {
    this.b = (new b22(paramParcel)).h();
  }
  
  public ParcelImpl(c22 paramc22) {
    this.b = paramc22;
  }
  
  public final int describeContents() {
    return 0;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt) {
    (new b22(paramParcel)).l(this.b);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\androidx\versionedparcelable\ParcelImpl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
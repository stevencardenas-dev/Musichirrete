import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import java.util.Collections;
import java.util.HashSet;

public final class ny0 extends l91 {
  public static final Parcelable.Creator<ny0> CREATOR = new lx0(1);
  
  public HashSet b;
  
  public ny0() {
    super((Parcelable)AbsSavedState.EMPTY_STATE);
  }
  
  public ny0(Parcel paramParcel) {
    super(paramParcel);
    int i = paramParcel.readInt();
    this.b = new HashSet();
    String[] arrayOfString = new String[i];
    paramParcel.readStringArray(arrayOfString);
    Collections.addAll(this.b, arrayOfString);
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt) {
    super.writeToParcel(paramParcel, paramInt);
    paramParcel.writeInt(this.b.size());
    HashSet hashSet = this.b;
    paramParcel.writeStringArray((String[])hashSet.toArray((Object[])new String[hashSet.size()]));
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\ny0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
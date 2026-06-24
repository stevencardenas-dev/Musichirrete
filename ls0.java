import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

public final class ls0 extends View.BaseSavedState {
  public static final Parcelable.Creator<ls0> CREATOR = new zb2(24);
  
  public int b;
  
  public final String toString() {
    String str;
    StringBuilder stringBuilder = new StringBuilder("MaterialCheckBox.SavedState{");
    stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
    stringBuilder.append(" CheckedState=");
    int i = this.b;
    if (i != 1) {
      if (i != 2) {
        str = "unchecked";
      } else {
        str = "indeterminate";
      } 
    } else {
      str = "checked";
    } 
    return x41.n(stringBuilder, str, "}");
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt) {
    super.writeToParcel(paramParcel, paramInt);
    paramParcel.writeValue(Integer.valueOf(this.b));
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\ls0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

public final class k11 extends View.BaseSavedState {
  public static final Parcelable.Creator<k11> CREATOR = new lx0(3);
  
  public int b;
  
  public final String toString() {
    StringBuilder stringBuilder = new StringBuilder("HorizontalScrollView.SavedState{");
    stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
    stringBuilder.append(" scrollPosition=");
    return x41.m(stringBuilder, this.b, "}");
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt) {
    super.writeToParcel(paramParcel, paramInt);
    paramParcel.writeInt(this.b);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\k11.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
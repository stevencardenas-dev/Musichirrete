import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import java.util.ArrayList;

public final class wd extends View.BaseSavedState {
  public static final Parcelable.Creator<wd> CREATOR = new zb2(7);
  
  public float b;
  
  public float c;
  
  public ArrayList e;
  
  public float f;
  
  public boolean g;
  
  public final void writeToParcel(Parcel paramParcel, int paramInt) {
    super.writeToParcel(paramParcel, paramInt);
    paramParcel.writeFloat(this.b);
    paramParcel.writeFloat(this.c);
    paramParcel.writeList(this.e);
    paramParcel.writeFloat(this.f);
    paramParcel.writeBooleanArray(new boolean[] { this.g });
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\wd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
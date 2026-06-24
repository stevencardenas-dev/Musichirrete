import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import java.util.ArrayList;

public final class ud extends View.BaseSavedState {
  public static final Parcelable.Creator<ud> CREATOR = new zb2(6);
  
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


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar\\ud.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
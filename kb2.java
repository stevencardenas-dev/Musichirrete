import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.List;

public final class kb2 extends f0 implements sg1 {
  public static final Parcelable.Creator<kb2> CREATOR = new lx0(24);
  
  public final List b;
  
  public final String c;
  
  public kb2(String paramString, ArrayList paramArrayList) {
    this.b = paramArrayList;
    this.c = paramString;
  }
  
  public final Status b() {
    return (this.c != null) ? Status.g : Status.i;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt) {
    paramInt = qv.D0(paramParcel, 20293);
    qv.w0(paramParcel, 1, this.b);
    qv.v0(paramParcel, 2, this.c);
    qv.G0(paramParcel, paramInt);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\kb2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
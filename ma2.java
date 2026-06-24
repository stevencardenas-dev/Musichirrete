import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;

public final class ma2 extends f0 implements sg1 {
  public static final Parcelable.Creator<ma2> CREATOR = new lx0(21);
  
  public final int b;
  
  public final int c;
  
  public final Intent e;
  
  public ma2(int paramInt1, int paramInt2, Intent paramIntent) {
    this.b = paramInt1;
    this.c = paramInt2;
    this.e = paramIntent;
  }
  
  public final Status b() {
    return (this.c == 0) ? Status.g : Status.i;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt) {
    int i = qv.D0(paramParcel, 20293);
    qv.C0(paramParcel, 1, 4);
    paramParcel.writeInt(this.b);
    qv.C0(paramParcel, 2, 4);
    paramParcel.writeInt(this.c);
    qv.u0(paramParcel, 3, (Parcelable)this.e, paramInt);
    qv.G0(paramParcel, i);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\ma2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;

public final class oi0 implements Parcelable {
  public static final Parcelable.Creator<oi0> CREATOR = new zb2(21);
  
  public final IntentSender b;
  
  public final Intent c;
  
  public final int e;
  
  public final int f;
  
  public oi0(IntentSender paramIntentSender, Intent paramIntent, int paramInt1, int paramInt2) {
    this.b = paramIntentSender;
    this.c = paramIntent;
    this.e = paramInt1;
    this.f = paramInt2;
  }
  
  public final int describeContents() {
    return 0;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt) {
    paramParcel.getClass();
    paramParcel.writeParcelable((Parcelable)this.b, paramInt);
    paramParcel.writeParcelable((Parcelable)this.c, paramInt);
    paramParcel.writeInt(this.e);
    paramParcel.writeInt(this.f);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\oi0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

public final class e2 implements Parcelable {
  public static final Parcelable.Creator<e2> CREATOR = new zb2(1);
  
  public final int b;
  
  public final Intent c;
  
  public e2(Intent paramIntent, int paramInt) {
    this.b = paramInt;
    this.c = paramIntent;
  }
  
  public final int describeContents() {
    return 0;
  }
  
  public final String toString() {
    String str;
    StringBuilder stringBuilder = new StringBuilder("ActivityResult{resultCode=");
    int i = this.b;
    if (i != -1) {
      if (i != 0) {
        str = String.valueOf(i);
      } else {
        str = "RESULT_CANCELED";
      } 
    } else {
      str = "RESULT_OK";
    } 
    stringBuilder.append(str);
    stringBuilder.append(", data=");
    stringBuilder.append(this.c);
    stringBuilder.append('}');
    return stringBuilder.toString();
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt) {
    boolean bool;
    paramParcel.getClass();
    paramParcel.writeInt(this.b);
    Intent intent = this.c;
    if (intent == null) {
      bool = false;
    } else {
      bool = true;
    } 
    paramParcel.writeInt(bool);
    if (intent != null)
      intent.writeToParcel(paramParcel, paramInt); 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\e2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

public class ug1 implements Parcelable {
  public static final Parcelable.Creator<ug1> CREATOR = new lx0(12);
  
  public vg0 b;
  
  public void b(int paramInt, Bundle paramBundle) {}
  
  public final int describeContents() {
    return 0;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt) {
    /* monitor enter ThisExpression{ObjectType{ug1}} */
    try {
      if (this.b == null) {
        tg1 tg1 = new tg1();
        this(this);
        this.b = tg1;
      } 
    } finally {}
    paramParcel.writeStrongBinder(this.b.asBinder());
    /* monitor exit ThisExpression{ObjectType{ug1}} */
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar\\ug1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
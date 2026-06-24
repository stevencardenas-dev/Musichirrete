import android.app.Notification;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.graphics.drawable.uUq.IGBYXeDFmKYajx;

public final class v21 {
  public final String a;
  
  public final int b;
  
  public final Notification c;
  
  public v21(String paramString, int paramInt, Notification paramNotification) {
    this.a = paramString;
    this.b = paramInt;
    this.c = paramNotification;
  }
  
  public final void a(rg0 paramrg0) {
    null = this.a;
    int i = this.b;
    Notification notification = this.c;
    pg0 pg0 = (pg0)paramrg0;
    pg0.getClass();
    Parcel parcel = Parcel.obtain();
    try {
      parcel.writeInterfaceToken(rg0.c);
      parcel.writeString(null);
      parcel.writeInt(i);
      parcel.writeString(null);
      parcel.writeTypedObject((Parcelable)notification, 0);
      pg0.e.transact(1, parcel, null, 1);
      return;
    } finally {
      parcel.recycle();
    } 
  }
  
  public final String toString() {
    StringBuilder stringBuilder = new StringBuilder("NotifyTask[packageName:");
    stringBuilder.append(this.a);
    stringBuilder.append(IGBYXeDFmKYajx.lvmrIdHMiQANKQ);
    return x41.m(stringBuilder, this.b, ", tag:null]");
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\v21.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
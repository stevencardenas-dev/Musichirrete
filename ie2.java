import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

public final class ie2 extends na2 implements qe2 {
  public final int s0(int paramInt, String paramString1, String paramString2, Bundle paramBundle) {
    Parcel parcel2 = q0();
    parcel2.writeInt(paramInt);
    parcel2.writeString(paramString1);
    parcel2.writeString(paramString2);
    paramInt = bf2.a;
    parcel2.writeInt(1);
    paramBundle.writeToParcel(parcel2, 0);
    Parcel parcel1 = r0(parcel2, 10);
    paramInt = parcel1.readInt();
    parcel1.recycle();
    return paramInt;
  }
  
  public final Bundle t0(String paramString1, String paramString2, Bundle paramBundle) {
    Parcel parcel2 = q0();
    parcel2.writeInt(9);
    parcel2.writeString(paramString1);
    parcel2.writeString(paramString2);
    int i = bf2.a;
    parcel2.writeInt(1);
    paramBundle.writeToParcel(parcel2, 0);
    Parcel parcel1 = r0(parcel2, 902);
    Parcelable.Creator creator = Bundle.CREATOR;
    Bundle bundle = (Bundle)bf2.a(parcel1);
    parcel1.recycle();
    return bundle;
  }
  
  public final Bundle u0(String paramString1, String paramString2, String paramString3) {
    Parcel parcel2 = q0();
    parcel2.writeInt(3);
    parcel2.writeString(paramString1);
    parcel2.writeString(paramString2);
    parcel2.writeString(paramString3);
    parcel2.writeString(null);
    Parcel parcel1 = r0(parcel2, 3);
    Parcelable.Creator creator = Bundle.CREATOR;
    Bundle bundle = (Bundle)bf2.a(parcel1);
    parcel1.recycle();
    return bundle;
  }
  
  public final Bundle v0(int paramInt, String paramString1, String paramString2, String paramString3, Bundle paramBundle) {
    Parcel parcel2 = q0();
    parcel2.writeInt(paramInt);
    parcel2.writeString(paramString1);
    parcel2.writeString(paramString2);
    parcel2.writeString(paramString3);
    parcel2.writeString(null);
    paramInt = bf2.a;
    parcel2.writeInt(1);
    paramBundle.writeToParcel(parcel2, 0);
    Parcel parcel1 = r0(parcel2, 8);
    Parcelable.Creator creator = Bundle.CREATOR;
    Bundle bundle = (Bundle)bf2.a(parcel1);
    parcel1.recycle();
    return bundle;
  }
  
  public final Bundle w0(String paramString1, String paramString2, String paramString3) {
    Parcel parcel2 = q0();
    parcel2.writeInt(3);
    parcel2.writeString(paramString1);
    parcel2.writeString(paramString2);
    parcel2.writeString(paramString3);
    Parcel parcel1 = r0(parcel2, 4);
    Parcelable.Creator creator = Bundle.CREATOR;
    Bundle bundle = (Bundle)bf2.a(parcel1);
    parcel1.recycle();
    return bundle;
  }
  
  public final Bundle x0(int paramInt, String paramString1, String paramString2, String paramString3, Bundle paramBundle) {
    Parcel parcel2 = q0();
    parcel2.writeInt(paramInt);
    parcel2.writeString(paramString1);
    parcel2.writeString(paramString2);
    parcel2.writeString(paramString3);
    paramInt = bf2.a;
    parcel2.writeInt(1);
    paramBundle.writeToParcel(parcel2, 0);
    Parcel parcel1 = r0(parcel2, 11);
    Parcelable.Creator creator = Bundle.CREATOR;
    Bundle bundle = (Bundle)bf2.a(parcel1);
    parcel1.recycle();
    return bundle;
  }
  
  public final Bundle y0(int paramInt, String paramString1, String paramString2, Bundle paramBundle1, Bundle paramBundle2) {
    Parcel parcel2 = q0();
    parcel2.writeInt(paramInt);
    parcel2.writeString(paramString1);
    parcel2.writeString(paramString2);
    paramInt = bf2.a;
    parcel2.writeInt(1);
    paramBundle1.writeToParcel(parcel2, 0);
    parcel2.writeInt(1);
    paramBundle2.writeToParcel(parcel2, 0);
    Parcel parcel1 = r0(parcel2, 901);
    Parcelable.Creator creator = Bundle.CREATOR;
    Bundle bundle = (Bundle)bf2.a(parcel1);
    parcel1.recycle();
    return bundle;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\ie2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
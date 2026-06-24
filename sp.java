import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.work.impl.utils.qnuS.eRUgfgGAccgka;
import com.google.android.material.textview.pJx.ybWnIKHovcRr;
import java.util.Arrays;

public final class sp extends f0 {
  public static final Parcelable.Creator<sp> CREATOR;
  
  public static final sp h = new sp(0, null, null);
  
  public final int b;
  
  public final int c;
  
  public final PendingIntent e;
  
  public final String f;
  
  public final Integer g;
  
  static {
    CREATOR = new yb2(0);
  }
  
  public sp(int paramInt1, int paramInt2, PendingIntent paramPendingIntent, String paramString, Integer paramInteger) {
    this.b = paramInt1;
    this.c = paramInt2;
    this.e = paramPendingIntent;
    this.f = paramString;
    this.g = paramInteger;
  }
  
  public sp(int paramInt, PendingIntent paramPendingIntent, String paramString) {
    this(1, paramInt, paramPendingIntent, paramString, null);
  }
  
  public static String e(int paramInt) {
    if (paramInt != 99) {
      if (paramInt != 1500) {
        StringBuilder stringBuilder;
        switch (paramInt) {
          default:
            switch (paramInt) {
              default:
                stringBuilder = new StringBuilder(String.valueOf(paramInt).length() + 20);
                stringBuilder.append("UNKNOWN_ERROR_CODE(");
                stringBuilder.append(paramInt);
                stringBuilder.append(")");
                return stringBuilder.toString();
              case 25:
                return "API_INSTALL_REQUIRED";
              case 24:
                return "API_DISABLED_FOR_CONNECTION";
              case 23:
                return "API_DISABLED";
              case 22:
                return "RESOLUTION_ACTIVITY_NOT_FOUND";
              case 21:
                return "API_VERSION_UPDATE_REQUIRED";
              case 20:
                return "RESTRICTED_PROFILE";
              case 19:
                return "SERVICE_MISSING_PERMISSION";
              case 18:
                return "SERVICE_UPDATING";
              case 17:
                return "SIGN_IN_FAILED";
              case 16:
                return "API_UNAVAILABLE";
              case 15:
                return "INTERRUPTED";
              case 14:
                return "TIMEOUT";
              case 13:
                break;
            } 
            return "CANCELED";
          case 11:
            return "LICENSE_CHECK_FAILED";
          case 10:
            return "DEVELOPER_ERROR";
          case 9:
            return "SERVICE_INVALID";
          case 8:
            return "INTERNAL_ERROR";
          case 7:
            return "NETWORK_ERROR";
          case 6:
            return eRUgfgGAccgka.wHRXwu;
          case 5:
            return "INVALID_ACCOUNT";
          case 4:
            return "SIGN_IN_REQUIRED";
          case 3:
            return "SERVICE_DISABLED";
          case 2:
            return "SERVICE_VERSION_UPDATE_REQUIRED";
          case 1:
            return "SERVICE_MISSING";
          case 0:
            return "SUCCESS";
          case -1:
            break;
        } 
        return "UNKNOWN";
      } 
      return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
    } 
    return ybWnIKHovcRr.KbRlBBPPox;
  }
  
  public final boolean equals(Object paramObject) {
    if (paramObject == this)
      return true; 
    if (!(paramObject instanceof sp))
      return false; 
    paramObject = paramObject;
    return (this.c == ((sp)paramObject).c && z51.g(this.e, ((sp)paramObject).e) && z51.g(this.f, ((sp)paramObject).f) && z51.g(this.g, ((sp)paramObject).g));
  }
  
  public final int hashCode() {
    int i = this.c;
    String str = this.f;
    Integer integer = this.g;
    return Arrays.hashCode(new Object[] { Integer.valueOf(i), this.e, str, integer });
  }
  
  public final String toString() {
    zu zu = new zu(this);
    zu.a("statusCode", e(this.c));
    zu.a("resolution", this.e);
    zu.a("message", this.f);
    zu.a("clientMethodKey", this.g);
    return zu.toString();
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt) {
    int i = qv.D0(paramParcel, 20293);
    qv.C0(paramParcel, 1, 4);
    paramParcel.writeInt(this.b);
    qv.C0(paramParcel, 2, 4);
    paramParcel.writeInt(this.c);
    qv.u0(paramParcel, 3, (Parcelable)this.e, paramInt);
    qv.v0(paramParcel, 4, this.f);
    qv.s0(paramParcel, 5, this.g);
    qv.G0(paramParcel, i);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\sp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.util.DyJ.oXrNDUqUkE;
import f0;
import java.util.Arrays;
import qv;
import sg1;
import sp;
import yb2;
import z51;
import zu;

public final class Status extends f0 implements sg1, ReflectedParcelable {
  public static final Parcelable.Creator<Status> CREATOR;
  
  public static final Status g = new Status(0, null, null, null);
  
  public static final Status h = new Status(15, null, null, null);
  
  public static final Status i = new Status(16, null, null, null);
  
  public final int b;
  
  public final String c;
  
  public final PendingIntent e;
  
  public final sp f;
  
  static {
    CREATOR = (Parcelable.Creator<Status>)new yb2(29);
  }
  
  public Status(int paramInt, String paramString, PendingIntent paramPendingIntent, sp paramsp) {
    this.b = paramInt;
    this.c = paramString;
    this.e = paramPendingIntent;
    this.f = paramsp;
  }
  
  public final Status b() {
    return this;
  }
  
  public final boolean equals(Object paramObject) {
    if (!(paramObject instanceof Status))
      return false; 
    paramObject = paramObject;
    return (this.b == ((Status)paramObject).b && z51.g(this.c, ((Status)paramObject).c) && z51.g(this.e, ((Status)paramObject).e) && z51.g(this.f, ((Status)paramObject).f));
  }
  
  public final int hashCode() {
    int i = this.b;
    PendingIntent pendingIntent = this.e;
    sp sp1 = this.f;
    return Arrays.hashCode(new Object[] { Integer.valueOf(i), this.c, pendingIntent, sp1 });
  }
  
  public final String toString() {
    zu zu = new zu(this);
    String str = this.c;
    if (str == null) {
      StringBuilder stringBuilder;
      int i = this.b;
      switch (i) {
        default:
          stringBuilder = new StringBuilder(String.valueOf(i).length() + 21);
          stringBuilder.append("unknown status code: ");
          stringBuilder.append(i);
          str = stringBuilder.toString();
          zu.a("statusCode", str);
          zu.a("resolution", this.e);
          return zu.toString();
        case 22:
          str = "RECONNECTION_TIMED_OUT";
          zu.a("statusCode", str);
          zu.a("resolution", this.e);
          return zu.toString();
        case 21:
          str = "RECONNECTION_TIMED_OUT_DURING_UPDATE";
          zu.a("statusCode", str);
          zu.a("resolution", this.e);
          return zu.toString();
        case 20:
          str = "CONNECTION_SUSPENDED_DURING_CALL";
          zu.a("statusCode", str);
          zu.a("resolution", this.e);
          return zu.toString();
        case 19:
          str = "REMOTE_EXCEPTION";
          zu.a("statusCode", str);
          zu.a("resolution", this.e);
          return zu.toString();
        case 18:
          str = "DEAD_CLIENT";
          zu.a("statusCode", str);
          zu.a("resolution", this.e);
          return zu.toString();
        case 17:
          str = "API_NOT_CONNECTED";
          zu.a("statusCode", str);
          zu.a("resolution", this.e);
          return zu.toString();
        case 16:
          str = "CANCELED";
          zu.a("statusCode", str);
          zu.a("resolution", this.e);
          return zu.toString();
        case 15:
          str = "TIMEOUT";
          zu.a("statusCode", str);
          zu.a("resolution", this.e);
          return zu.toString();
        case 14:
          str = "INTERRUPTED";
          zu.a("statusCode", str);
          zu.a("resolution", this.e);
          return zu.toString();
        case 13:
          str = oXrNDUqUkE.oIQ;
          zu.a("statusCode", str);
          zu.a("resolution", this.e);
          return zu.toString();
        case 10:
          str = "DEVELOPER_ERROR";
          zu.a("statusCode", str);
          zu.a("resolution", this.e);
          return zu.toString();
        case 8:
          str = "INTERNAL_ERROR";
          zu.a("statusCode", str);
          zu.a("resolution", this.e);
          return zu.toString();
        case 7:
          str = "NETWORK_ERROR";
          zu.a("statusCode", str);
          zu.a("resolution", this.e);
          return zu.toString();
        case 6:
          str = "RESOLUTION_REQUIRED";
          zu.a("statusCode", str);
          zu.a("resolution", this.e);
          return zu.toString();
        case 5:
          str = "INVALID_ACCOUNT";
          zu.a("statusCode", str);
          zu.a("resolution", this.e);
          return zu.toString();
        case 4:
          str = "SIGN_IN_REQUIRED";
          zu.a("statusCode", str);
          zu.a("resolution", this.e);
          return zu.toString();
        case 3:
          str = "SERVICE_DISABLED";
          zu.a("statusCode", str);
          zu.a("resolution", this.e);
          return zu.toString();
        case 2:
          str = "SERVICE_VERSION_UPDATE_REQUIRED";
          zu.a("statusCode", str);
          zu.a("resolution", this.e);
          return zu.toString();
        case 0:
          str = "SUCCESS";
          zu.a("statusCode", str);
          zu.a("resolution", this.e);
          return zu.toString();
        case -1:
          break;
      } 
      str = "SUCCESS_CACHE";
    } 
    zu.a("statusCode", str);
    zu.a("resolution", this.e);
    return zu.toString();
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt) {
    int i = qv.D0(paramParcel, 20293);
    qv.C0(paramParcel, 1, 4);
    paramParcel.writeInt(this.b);
    qv.v0(paramParcel, 2, this.c);
    qv.u0(paramParcel, 3, (Parcelable)this.e, paramInt);
    qv.u0(paramParcel, 4, (Parcelable)this.f, paramInt);
    qv.G0(paramParcel, i);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\com\google\android\gms\common\api\Status.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import f0;
import org.json.JSONObject;
import qj;
import qv;
import yb2;

public class MediaError extends f0 implements ReflectedParcelable {
  public static final Parcelable.Creator<MediaError> CREATOR = (Parcelable.Creator<MediaError>)new yb2(12);
  
  public final String b;
  
  public final long c;
  
  public final Integer e;
  
  public final String f;
  
  public String g;
  
  public final JSONObject h;
  
  public MediaError(String paramString1, long paramLong, Integer paramInteger, String paramString2, JSONObject paramJSONObject) {
    this.b = paramString1;
    this.c = paramLong;
    this.e = paramInteger;
    this.f = paramString2;
    this.h = paramJSONObject;
  }
  
  public static MediaError e(JSONObject paramJSONObject) {
    Integer integer;
    String str1 = paramJSONObject.optString("type", "ERROR");
    long l = paramJSONObject.optLong("requestId");
    boolean bool = paramJSONObject.has("detailedErrorCode");
    JSONObject jSONObject = null;
    if (bool) {
      integer = Integer.valueOf(paramJSONObject.optInt("detailedErrorCode"));
    } else {
      integer = null;
    } 
    String str2 = qj.a(paramJSONObject, "reason");
    if (paramJSONObject.has("customData"))
      jSONObject = paramJSONObject.optJSONObject("customData"); 
    return new MediaError(str1, l, integer, str2, jSONObject);
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt) {
    String str;
    JSONObject jSONObject = this.h;
    if (jSONObject == null) {
      jSONObject = null;
    } else {
      str = jSONObject.toString();
    } 
    this.g = str;
    paramInt = qv.D0(paramParcel, 20293);
    qv.v0(paramParcel, 2, this.b);
    qv.C0(paramParcel, 3, 8);
    paramParcel.writeLong(this.c);
    qv.s0(paramParcel, 4, this.e);
    qv.v0(paramParcel, 5, this.f);
    qv.v0(paramParcel, 6, this.g);
    qv.G0(paramParcel, paramInt);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\com\google\android\gms\cast\MediaError.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
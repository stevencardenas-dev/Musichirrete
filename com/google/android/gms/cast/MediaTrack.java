package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.window.ldG.XUaAMlaMSa;
import androidx.profileinstaller.Vuyf.nBRIsU;
import androidx.work.impl.diagnostics.UWhQ.OETETTfAjV;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.material.tabs.xm.VDgS;
import f0;
import java.util.Arrays;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import qj;
import qv;
import vk0;
import yb2;

public final class MediaTrack extends f0 implements ReflectedParcelable {
  public static final Parcelable.Creator<MediaTrack> CREATOR = (Parcelable.Creator<MediaTrack>)new yb2(23);
  
  public final long b;
  
  public final int c;
  
  public final String e;
  
  public final String f;
  
  public final String g;
  
  public final String h;
  
  public final int i;
  
  public final List j;
  
  public String k;
  
  public final JSONObject l;
  
  public MediaTrack(long paramLong, int paramInt1, String paramString1, String paramString2, String paramString3, String paramString4, int paramInt2, List paramList, JSONObject paramJSONObject) {
    this.b = paramLong;
    this.c = paramInt1;
    this.e = paramString1;
    this.f = paramString2;
    this.g = paramString3;
    this.h = paramString4;
    this.i = paramInt2;
    this.j = paramList;
    this.l = paramJSONObject;
  }
  
  public final JSONObject e() {
    JSONObject jSONObject = new JSONObject();
    try {
      jSONObject.put("trackId", this.b);
      int i = this.c;
      if (i != 1) {
        if (i != 2) {
          if (i == 3)
            jSONObject.put("type", "VIDEO"); 
        } else {
          jSONObject.put("type", "AUDIO");
        } 
      } else {
        jSONObject.put("type", OETETTfAjV.YsZXxNItzmUFmU);
      } 
      String str = this.e;
      if (str != null)
        jSONObject.put("trackContentId", str); 
      str = this.f;
      if (str != null)
        jSONObject.put(VDgS.LONGQiGYVjxym, str); 
      str = this.g;
      if (str != null)
        jSONObject.put("name", str); 
      str = this.h;
      if (!TextUtils.isEmpty(str))
        jSONObject.put("language", str); 
      i = this.i;
      if (i != 1) {
        if (i != 2) {
          if (i != 3) {
            if (i != 4) {
              if (i == 5)
                jSONObject.put("subtype", nBRIsU.jMaqBpo); 
            } else {
              jSONObject.put("subtype", XUaAMlaMSa.SinalQFDgbWE);
            } 
          } else {
            jSONObject.put("subtype", "DESCRIPTIONS");
          } 
        } else {
          jSONObject.put("subtype", "CAPTIONS");
        } 
      } else {
        jSONObject.put("subtype", "SUBTITLES");
      } 
      List list = this.j;
      if (list != null) {
        JSONArray jSONArray = new JSONArray();
        this(list);
        jSONObject.put("roles", jSONArray);
      } 
      JSONObject jSONObject1 = this.l;
      if (jSONObject1 != null)
        jSONObject.put("customData", jSONObject1); 
    } catch (JSONException jSONException) {}
    return jSONObject;
  }
  
  public final boolean equals(Object paramObject) {
    boolean bool1;
    boolean bool2;
    if (this == paramObject)
      return true; 
    if (!(paramObject instanceof MediaTrack))
      return false; 
    MediaTrack mediaTrack = (MediaTrack)paramObject;
    JSONObject jSONObject = this.l;
    if (jSONObject != null) {
      bool1 = false;
    } else {
      bool1 = true;
    } 
    paramObject = mediaTrack.l;
    if (paramObject != null) {
      bool2 = false;
    } else {
      bool2 = true;
    } 
    return (bool1 != bool2) ? false : ((jSONObject != null && paramObject != null && !vk0.a(jSONObject, paramObject)) ? false : ((this.b == mediaTrack.b && this.c == mediaTrack.c && qj.c(this.e, mediaTrack.e) && qj.c(this.f, mediaTrack.f) && qj.c(this.g, mediaTrack.g) && qj.c(this.h, mediaTrack.h) && this.i == mediaTrack.i && qj.c(this.j, mediaTrack.j))));
  }
  
  public final int hashCode() {
    long l = this.b;
    int i = this.c;
    int j = this.i;
    String str = String.valueOf(this.l);
    return Arrays.hashCode(new Object[] { Long.valueOf(l), Integer.valueOf(i), this.e, this.f, this.g, this.h, Integer.valueOf(j), this.j, str });
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt) {
    String str;
    JSONObject jSONObject = this.l;
    if (jSONObject == null) {
      jSONObject = null;
    } else {
      str = jSONObject.toString();
    } 
    this.k = str;
    paramInt = qv.D0(paramParcel, 20293);
    qv.C0(paramParcel, 2, 8);
    paramParcel.writeLong(this.b);
    qv.C0(paramParcel, 3, 4);
    paramParcel.writeInt(this.c);
    qv.v0(paramParcel, 4, this.e);
    qv.v0(paramParcel, 5, this.f);
    qv.v0(paramParcel, 6, this.g);
    qv.v0(paramParcel, 7, this.h);
    qv.C0(paramParcel, 8, 4);
    paramParcel.writeInt(this.i);
    qv.w0(paramParcel, 9, this.j);
    qv.v0(paramParcel, 10, this.k);
    qv.G0(paramParcel, paramInt);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\com\google\android\gms\cast\MediaTrack.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
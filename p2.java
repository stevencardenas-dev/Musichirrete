import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import android.window.ldG.XUaAMlaMSa;
import java.util.Arrays;
import java.util.Locale;
import java.util.regex.Pattern;
import org.jaudiotagger.audio.dsf.qdA.GMDx;
import org.json.JSONException;
import org.json.JSONObject;

public final class p2 extends f0 {
  public static final Parcelable.Creator<p2> CREATOR = new yb2(1);
  
  public final String b;
  
  public final String c;
  
  public final long e;
  
  public final String f;
  
  public final String g;
  
  public final String h;
  
  public final String i;
  
  public final String j;
  
  public final String k;
  
  public final long l;
  
  public final String m;
  
  public final m12 n;
  
  public final JSONObject o;
  
  public p2(String paramString1, String paramString2, long paramLong1, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, String paramString8, long paramLong2, String paramString9, m12 paramm12) {
    this.b = paramString1;
    this.c = paramString2;
    this.e = paramLong1;
    this.f = paramString3;
    this.g = paramString4;
    this.h = paramString5;
    this.i = paramString6;
    this.j = paramString7;
    this.k = paramString8;
    this.l = paramLong2;
    this.m = paramString9;
    this.n = paramm12;
    if (!TextUtils.isEmpty(paramString6))
      try {
        JSONObject jSONObject = new JSONObject();
        this(paramString6);
        this.o = jSONObject;
        return;
      } catch (JSONException jSONException) {
        Locale locale = Locale.ROOT;
        String str = jSONException.getMessage();
        StringBuilder stringBuilder = new StringBuilder("Error creating AdBreakClipInfo: ");
        stringBuilder.append(str);
        Log.w("AdBreakClipInfo", stringBuilder.toString());
        this.i = null;
        this.o = new JSONObject();
        return;
      }  
    this.o = new JSONObject();
  }
  
  public final JSONObject e() {
    JSONObject jSONObject = new JSONObject();
    try {
      jSONObject.put("id", this.b);
      long l = this.e;
      Pattern pattern = qj.a;
      jSONObject.put("duration", l / 1000.0D);
      l = this.l;
      if (l != -1L)
        jSONObject.put("whenSkippable", l / 1000.0D); 
      String str2 = this.j;
      if (str2 != null)
        jSONObject.put(GMDx.TEFSBYfknDYlxrY, str2); 
      str2 = this.g;
      if (str2 != null)
        jSONObject.put("contentType", str2); 
      str2 = this.c;
      if (str2 != null)
        jSONObject.put("title", str2); 
      str2 = this.f;
      if (str2 != null)
        jSONObject.put("contentUrl", str2); 
      str2 = this.h;
      if (str2 != null)
        jSONObject.put("clickThroughUrl", str2); 
      JSONObject jSONObject1 = this.o;
      if (jSONObject1 != null)
        jSONObject.put("customData", jSONObject1); 
      String str1 = this.k;
      if (str1 != null)
        jSONObject.put("posterUrl", str1); 
      str1 = this.m;
      if (str1 != null)
        jSONObject.put("hlsSegmentFormat", str1); 
      m12 m121 = this.n;
      if (m121 != null)
        jSONObject.put(XUaAMlaMSa.kQdSOWQGpd, m121.e()); 
    } catch (JSONException jSONException) {}
    return jSONObject;
  }
  
  public final boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (!(paramObject instanceof p2))
      return false; 
    paramObject = paramObject;
    return (qj.c(this.b, ((p2)paramObject).b) && qj.c(this.c, ((p2)paramObject).c) && this.e == ((p2)paramObject).e && qj.c(this.f, ((p2)paramObject).f) && qj.c(this.g, ((p2)paramObject).g) && qj.c(this.h, ((p2)paramObject).h) && qj.c(this.i, ((p2)paramObject).i) && qj.c(this.j, ((p2)paramObject).j) && qj.c(this.k, ((p2)paramObject).k) && this.l == ((p2)paramObject).l && qj.c(this.m, ((p2)paramObject).m) && qj.c(this.n, ((p2)paramObject).n));
  }
  
  public final int hashCode() {
    long l2 = this.e;
    long l1 = this.l;
    String str = this.m;
    m12 m121 = this.n;
    return Arrays.hashCode(new Object[] { 
          this.b, this.c, Long.valueOf(l2), this.f, this.g, this.h, this.i, this.j, this.k, Long.valueOf(l1), 
          str, m121 });
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt) {
    int i = qv.D0(paramParcel, 20293);
    qv.v0(paramParcel, 2, this.b);
    qv.v0(paramParcel, 3, this.c);
    qv.C0(paramParcel, 4, 8);
    paramParcel.writeLong(this.e);
    qv.v0(paramParcel, 5, this.f);
    qv.v0(paramParcel, 6, this.g);
    qv.v0(paramParcel, 7, this.h);
    qv.v0(paramParcel, 8, this.i);
    qv.v0(paramParcel, 9, this.j);
    qv.v0(paramParcel, 10, this.k);
    qv.C0(paramParcel, 11, 8);
    paramParcel.writeLong(this.l);
    qv.v0(paramParcel, 12, this.m);
    qv.u0(paramParcel, 13, this.n, paramInt);
    qv.G0(paramParcel, i);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\p2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
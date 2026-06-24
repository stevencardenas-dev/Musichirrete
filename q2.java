import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.tabs.xm.VDgS;
import java.util.Arrays;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class q2 extends f0 {
  public static final Parcelable.Creator<q2> CREATOR = new yb2(10);
  
  public final long b;
  
  public final String c;
  
  public final long e;
  
  public final boolean f;
  
  public final String[] g;
  
  public final boolean h;
  
  public final boolean i;
  
  public q2(long paramLong1, String paramString, long paramLong2, boolean paramBoolean1, String[] paramArrayOfString, boolean paramBoolean2, boolean paramBoolean3) {
    this.b = paramLong1;
    this.c = paramString;
    this.e = paramLong2;
    this.f = paramBoolean1;
    this.g = paramArrayOfString;
    this.h = paramBoolean2;
    this.i = paramBoolean3;
  }
  
  public final JSONObject e() {
    JSONObject jSONObject = new JSONObject();
    try {
      jSONObject.put("id", this.c);
      long l = this.b;
      Pattern pattern = qj.a;
      jSONObject.put("position", l / 1000.0D);
      jSONObject.put("isWatched", this.f);
      jSONObject.put("isEmbedded", this.h);
      jSONObject.put("duration", this.e / 1000.0D);
      jSONObject.put(VDgS.adniJWzzxqSU, this.i);
      String[] arrayOfString = this.g;
      if (arrayOfString != null) {
        JSONArray jSONArray = new JSONArray();
        this();
        int i = arrayOfString.length;
        for (byte b = 0; b < i; b++)
          jSONArray.put(arrayOfString[b]); 
        jSONObject.put("breakClipIds", jSONArray);
      } 
    } catch (JSONException jSONException) {}
    return jSONObject;
  }
  
  public final boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (!(paramObject instanceof q2))
      return false; 
    paramObject = paramObject;
    return (qj.c(this.c, ((q2)paramObject).c) && this.b == ((q2)paramObject).b && this.e == ((q2)paramObject).e && this.f == ((q2)paramObject).f && Arrays.equals((Object[])this.g, (Object[])((q2)paramObject).g) && this.h == ((q2)paramObject).h && this.i == ((q2)paramObject).i);
  }
  
  public final int hashCode() {
    return this.c.hashCode();
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt) {
    int i = qv.D0(paramParcel, 20293);
    qv.C0(paramParcel, 2, 8);
    paramParcel.writeLong(this.b);
    qv.v0(paramParcel, 3, this.c);
    qv.C0(paramParcel, 4, 8);
    paramParcel.writeLong(this.e);
    qv.C0(paramParcel, 5, 4);
    paramParcel.writeInt(this.f);
    String[] arrayOfString = this.g;
    if (arrayOfString != null) {
      paramInt = qv.D0(paramParcel, 6);
      paramParcel.writeStringArray(arrayOfString);
      qv.G0(paramParcel, paramInt);
    } 
    qv.C0(paramParcel, 7, 4);
    paramParcel.writeInt(this.h);
    qv.C0(paramParcel, 8, 4);
    paramParcel.writeInt(this.i);
    qv.G0(paramParcel, i);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\q2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
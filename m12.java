import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

public final class m12 extends f0 {
  public static final Parcelable.Creator<m12> CREATOR = new yb2(27);
  
  public final String b;
  
  public final String c;
  
  public m12(String paramString1, String paramString2) {
    this.b = paramString1;
    this.c = paramString2;
  }
  
  public final JSONObject e() {
    JSONObject jSONObject = new JSONObject();
    try {
      String str = this.b;
      if (str != null)
        jSONObject.put("adTagUrl", str); 
      str = this.c;
      if (str != null)
        jSONObject.put("adsResponse", str); 
    } catch (JSONException jSONException) {}
    return jSONObject;
  }
  
  public final boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (!(paramObject instanceof m12))
      return false; 
    paramObject = paramObject;
    return (qj.c(this.b, ((m12)paramObject).b) && qj.c(this.c, ((m12)paramObject).c));
  }
  
  public final int hashCode() {
    return Arrays.hashCode(new Object[] { this.b, this.c });
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt) {
    paramInt = qv.D0(paramParcel, 20293);
    qv.v0(paramParcel, 2, this.b);
    qv.v0(paramParcel, 3, this.c);
    qv.G0(paramParcel, paramInt);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\m12.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
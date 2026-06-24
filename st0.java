import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import in.krosbits.utils.SgV.zpEN;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class st0 extends f0 {
  public static final Parcelable.Creator<st0> CREATOR = new yb2(17);
  
  public int b;
  
  public String c;
  
  public List e;
  
  public List f;
  
  public double g;
  
  public final JSONObject e() {
    JSONObject jSONObject = new JSONObject();
    try {
      int i = this.b;
      if (i != 0) {
        if (i == 1)
          jSONObject.put("containerType", zpEN.bCsoriIr); 
      } else {
        jSONObject.put("containerType", "GENERIC_CONTAINER");
      } 
      if (!TextUtils.isEmpty(this.c))
        jSONObject.put("title", this.c); 
      List list = this.e;
      if (list != null && !list.isEmpty()) {
        JSONArray jSONArray = new JSONArray();
        this();
        Iterator<kt0> iterator = this.e.iterator();
        while (iterator.hasNext())
          jSONArray.put(((kt0)iterator.next()).f()); 
        jSONObject.put("sections", jSONArray);
      } 
      list = this.f;
      if (list != null && !list.isEmpty())
        jSONObject.put("containerImages", xb2.b(this.f)); 
      jSONObject.put("containerDuration", this.g);
    } catch (JSONException jSONException) {}
    return jSONObject;
  }
  
  public final boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (!(paramObject instanceof st0))
      return false; 
    paramObject = paramObject;
    return (this.b == ((st0)paramObject).b && TextUtils.equals(this.c, ((st0)paramObject).c) && z51.g(this.e, ((st0)paramObject).e) && z51.g(this.f, ((st0)paramObject).f) && this.g == ((st0)paramObject).g);
  }
  
  public final int hashCode() {
    return Arrays.hashCode(new Object[] { Integer.valueOf(this.b), this.c, this.e, this.f, Double.valueOf(this.g) });
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt) {
    int i = qv.D0(paramParcel, 20293);
    paramInt = this.b;
    qv.C0(paramParcel, 2, 4);
    paramParcel.writeInt(paramInt);
    qv.v0(paramParcel, 3, this.c);
    List<?> list = this.e;
    List list1 = null;
    if (list == null) {
      list = null;
    } else {
      list = Collections.unmodifiableList(list);
    } 
    qv.y0(paramParcel, 4, list);
    list = this.f;
    if (list == null) {
      list = list1;
    } else {
      list = Collections.unmodifiableList(list);
    } 
    qv.y0(paramParcel, 5, list);
    double d = this.g;
    qv.C0(paramParcel, 6, 8);
    paramParcel.writeDouble(d);
    qv.G0(paramParcel, i);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\st0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
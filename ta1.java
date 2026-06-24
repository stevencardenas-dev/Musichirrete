import android.text.TextUtils;
import java.util.ArrayList;
import org.jaudiotagger.audio.Hy.PwbbJfsdcHrAjW;
import org.json.JSONArray;
import org.json.JSONObject;

public final class ta1 {
  public final String a;
  
  public final JSONObject b;
  
  public final String c;
  
  public final String d;
  
  public final String e;
  
  public final String f;
  
  public final String g;
  
  public final String h;
  
  public final ArrayList i;
  
  public final ArrayList j;
  
  public ta1(String paramString) {
    this.a = paramString;
    JSONObject jSONObject = new JSONObject(paramString);
    this.b = jSONObject;
    String str = jSONObject.optString("productId");
    this.c = str;
    paramString = jSONObject.optString("type");
    this.d = paramString;
    if (!TextUtils.isEmpty(str)) {
      if (!TextUtils.isEmpty(paramString)) {
        this.e = jSONObject.optString("title");
        jSONObject.optString("name");
        this.f = jSONObject.optString("description");
        jSONObject.optString("packageDisplayName");
        jSONObject.optString("iconUrl");
        this.g = jSONObject.optString("skuDetailsToken");
        this.h = jSONObject.optString("serializedDocid");
        JSONArray jSONArray = jSONObject.optJSONArray("subscriptionOfferDetails");
        byte b = 0;
        if (jSONArray != null) {
          arrayList = new ArrayList();
          for (byte b1 = 0; b1 < jSONArray.length(); b1++)
            arrayList.add(new sa1(jSONArray.getJSONObject(b1))); 
          this.i = arrayList;
        } else {
          if (arrayList.equals("subs") || arrayList.equals("play_pass_subs")) {
            arrayList = new ArrayList<sa1>();
          } else {
            arrayList = null;
          } 
          this.i = arrayList;
        } 
        JSONObject jSONObject1 = this.b.optJSONObject("oneTimePurchaseOfferDetails");
        jSONArray = this.b.optJSONArray("oneTimePurchaseOfferDetailsList");
        ArrayList<sa1> arrayList = new ArrayList<sa1>();
        if (jSONArray != null) {
          for (byte b1 = b; b1 < jSONArray.length(); b1++)
            arrayList.add(new qa1(jSONArray.getJSONObject(b1))); 
          this.j = arrayList;
          return;
        } 
        if (jSONObject1 != null) {
          arrayList.add(new qa1(jSONObject1));
          this.j = arrayList;
          return;
        } 
        this.j = null;
        return;
      } 
      l0.l("Product type cannot be empty.");
      throw null;
    } 
    l0.l("Product id cannot be empty.");
    throw null;
  }
  
  public final qa1 a() {
    ArrayList<qa1> arrayList = this.j;
    return (arrayList != null && !arrayList.isEmpty()) ? arrayList.get(0) : null;
  }
  
  public final boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (!(paramObject instanceof ta1))
      return false; 
    paramObject = paramObject;
    return TextUtils.equals(this.a, ((ta1)paramObject).a);
  }
  
  public final int hashCode() {
    return this.a.hashCode();
  }
  
  public final String toString() {
    String str2 = this.b.toString();
    String str1 = String.valueOf(this.i);
    StringBuilder stringBuilder = new StringBuilder("ProductDetails{jsonString='");
    x41.v(stringBuilder, this.a, "', parsedJson=", str2, ", productId='");
    stringBuilder.append(this.c);
    stringBuilder.append("', productType='");
    stringBuilder.append(this.d);
    stringBuilder.append("', title='");
    stringBuilder.append(this.e);
    stringBuilder.append(PwbbJfsdcHrAjW.USdXsDzs);
    stringBuilder.append(this.g);
    stringBuilder.append("', subscriptionOfferDetails=");
    stringBuilder.append(str1);
    stringBuilder.append("}");
    return stringBuilder.toString();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\ta1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
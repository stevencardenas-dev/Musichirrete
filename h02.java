import android.text.TextUtils;
import com.google.android.gms.common.api.Gldr.hbrAVtEa;
import org.json.JSONObject;

public final class h02 {
  public final String a;
  
  public final String b;
  
  public final String c;
  
  public final int d;
  
  public h02(String paramString) {
    boolean bool;
    this.a = paramString;
    JSONObject jSONObject = new JSONObject(paramString);
    this.b = jSONObject.optString("productId");
    String str1 = jSONObject.optString("type");
    this.c = str1;
    String str2 = hbrAVtEa.JRqmXq;
    if (jSONObject.has(str2)) {
      bool = jSONObject.optInt(str2);
    } else {
      bool = false;
    } 
    this.d = bool;
    if (!TextUtils.isEmpty(str1)) {
      jSONObject.optString("serializedDocid");
      return;
    } 
    l0.l("Product type cannot be empty.");
    throw null;
  }
  
  public final boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (!(paramObject instanceof h02))
      return false; 
    paramObject = paramObject;
    return TextUtils.equals(this.a, ((h02)paramObject).a);
  }
  
  public final int hashCode() {
    return this.a.hashCode();
  }
  
  public final String toString() {
    StringBuilder stringBuilder = new StringBuilder("UnfetchedProduct{productId='");
    stringBuilder.append(this.b);
    stringBuilder.append("', productType='");
    stringBuilder.append(this.c);
    stringBuilder.append("', statusCode=");
    return x41.m(stringBuilder, this.d, "}");
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\h02.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
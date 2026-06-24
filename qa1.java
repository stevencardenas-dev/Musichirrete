import androidx.recyclerview.widget.dVrV.jLnXOLx;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

public final class qa1 {
  public final String a;
  
  public final long b;
  
  public final String c;
  
  public final String d;
  
  public final ArrayList e;
  
  public final String f;
  
  public final eg2 g;
  
  public qa1(JSONObject paramJSONObject) {
    eg2 eg21;
    this.a = paramJSONObject.optString("formattedPrice");
    this.b = paramJSONObject.optLong("priceAmountMicros");
    this.c = paramJSONObject.optString("priceCurrencyCode");
    String str = paramJSONObject.optString("offerIdToken");
    boolean bool = str.isEmpty();
    JSONObject jSONObject2 = null;
    if (true == bool)
      str = null; 
    this.d = str;
    paramJSONObject.optString("offerId").getClass();
    paramJSONObject.optString("purchaseOptionId").getClass();
    paramJSONObject.optInt("offerType");
    JSONArray jSONArray2 = paramJSONObject.optJSONArray("offerTags");
    this.e = new ArrayList();
    byte b = 0;
    if (jSONArray2 != null)
      for (byte b1 = 0; b1 < jSONArray2.length(); b1++)
        this.e.add(jSONArray2.getString(b1));  
    if (paramJSONObject.has("fullPriceMicros"))
      paramJSONObject.optLong("fullPriceMicros"); 
    JSONObject jSONObject1 = paramJSONObject.optJSONObject("discountDisplayInfo");
    if (jSONObject1 != null) {
      if (jSONObject1.has("percentageDiscount"))
        jSONObject1.optInt("percentageDiscount"); 
      jSONObject1 = jSONObject1.optJSONObject("discountAmount");
      if (jSONObject1 != null) {
        jSONObject1.optString("formattedDiscountAmount");
        jSONObject1.optLong("discountAmountMicros");
        jSONObject1.optString("discountAmountCurrencyCode");
      } 
    } 
    JSONObject jSONObject3 = paramJSONObject.optJSONObject("validTimeWindow");
    if (jSONObject3 != null) {
      if (jSONObject3.has("startTimeMillis"))
        jSONObject3.optLong("startTimeMillis"); 
      String str1 = jLnXOLx.ORkRVZhvZdmiI;
      if (jSONObject3.has(str1))
        jSONObject3.optLong(str1); 
    } 
    jSONObject1 = paramJSONObject.optJSONObject("limitedQuantityInfo");
    if (jSONObject1 != null) {
      jSONObject1.getInt("maximumQuantity");
      jSONObject1.getInt("remainingQuantity");
    } 
    this.f = paramJSONObject.optString("serializedDocid");
    jSONObject1 = paramJSONObject.optJSONObject("preorderDetails");
    if (jSONObject1 != null) {
      jSONObject1.getLong("preorderReleaseTimeMillis");
      jSONObject1.getLong("preorderPresaleEndTimeMillis");
    } 
    jSONObject1 = paramJSONObject.optJSONObject("rentalDetails");
    if (jSONObject1 != null) {
      jSONObject1.getString("rentalPeriod");
      jSONObject1.optString("rentalExpirationPeriod").getClass();
    } 
    jSONObject3 = paramJSONObject.optJSONObject("autoPayDetails");
    if (jSONObject3 == null) {
      jSONObject1 = jSONObject2;
    } else {
      eg21 = new eg2(3);
      jSONObject3.getString("type");
    } 
    this.g = eg21;
    JSONArray jSONArray1 = paramJSONObject.optJSONArray("pricingPhases");
    if (jSONArray1 != null) {
      ArrayList<ra1> arrayList = new ArrayList();
      for (byte b1 = b; b1 < jSONArray1.length(); b1++) {
        jSONObject2 = jSONArray1.optJSONObject(b1);
        if (jSONObject2 != null)
          arrayList.add(new ra1(jSONObject2)); 
      } 
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\qa1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

public final class sa1 {
  public final String a;
  
  public final String b;
  
  public final bv0 c;
  
  public sa1(JSONObject paramJSONObject) {
    this.a = paramJSONObject.optString("basePlanId");
    paramJSONObject.optString("offerId").getClass();
    this.b = paramJSONObject.getString("offerIdToken");
    JSONArray jSONArray2 = paramJSONObject.getJSONArray("pricingPhases");
    Object object = new Object();
    ArrayList<ra1> arrayList1 = new ArrayList();
    byte b = 0;
    if (jSONArray2 != null)
      for (byte b1 = 0; b1 < jSONArray2.length(); b1++) {
        JSONObject jSONObject1 = jSONArray2.optJSONObject(b1);
        if (jSONObject1 != null)
          arrayList1.add(new ra1(jSONObject1)); 
      }  
    ((bv0)object).a = arrayList1;
    this.c = (bv0)object;
    JSONObject jSONObject = paramJSONObject.optJSONObject("installmentPlanDetails");
    if (jSONObject != null) {
      jSONObject.getInt("commitmentPaymentsCount");
      jSONObject.optInt("subsequentCommitmentPaymentsCount");
    } 
    jSONObject = paramJSONObject.optJSONObject("transitionPlanDetails");
    if (jSONObject != null) {
      jSONObject.getString("productId");
      jSONObject.optString("title");
      jSONObject.optString("name");
      jSONObject.optString("description");
      jSONObject.optString("basePlanId");
      jSONObject = jSONObject.optJSONObject("pricingPhase");
      if (jSONObject != null) {
        jSONObject.optString("billingPeriod");
        jSONObject.optString("priceCurrencyCode");
        jSONObject.optString("formattedPrice");
        jSONObject.optLong("priceAmountMicros");
        jSONObject.optInt("recurrenceMode");
        jSONObject.optInt("billingCycleCount");
      } 
    } 
    ArrayList<String> arrayList = new ArrayList();
    JSONArray jSONArray1 = paramJSONObject.optJSONArray("offerTags");
    if (jSONArray1 != null)
      for (byte b1 = b; b1 < jSONArray1.length(); b1++)
        arrayList.add(jSONArray1.getString(b1));  
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\sa1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
import org.json.JSONObject;

public final class ra1 {
  public final String a;
  
  public final String b;
  
  public ra1(JSONObject paramJSONObject) {
    this.b = paramJSONObject.optString("billingPeriod");
    paramJSONObject.optString("priceCurrencyCode");
    this.a = paramJSONObject.optString("formattedPrice");
    paramJSONObject.optLong("priceAmountMicros");
    paramJSONObject.optInt("recurrenceMode");
    paramJSONObject.optInt("billingCycleCount");
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\ra1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
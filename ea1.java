import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class ea1 {
  public final String a;
  
  public final short[] b;
  
  public ea1(String paramString) {
    try {
      JSONObject jSONObject = new JSONObject();
      this(paramString);
      this.a = jSONObject.getString("presetName");
      JSONArray jSONArray = jSONObject.getJSONArray("levels");
      this.b = new short[jSONArray.length()];
      for (byte b = 0; b < jSONArray.length(); b++)
        this.b[b] = (short)jSONArray.getInt(b); 
      return;
    } catch (JSONException jSONException) {
      jSONException.printStackTrace();
      return;
    } 
  }
  
  public ea1(short[] paramArrayOfshort, String paramString) {
    this.a = paramString;
    this.b = paramArrayOfshort;
    short[] arrayOfShort = new short[paramArrayOfshort.length];
    this.b = arrayOfShort;
    System.arraycopy(paramArrayOfshort, 0, arrayOfShort, 0, paramArrayOfshort.length);
  }
  
  public final String toString() {
    try {
      JSONArray jSONArray = new JSONArray();
      this();
      short[] arrayOfShort = this.b;
      int i = arrayOfShort.length;
      for (byte b = 0; b < i; b++)
        jSONArray.put(arrayOfShort[b]); 
      JSONObject jSONObject = new JSONObject();
      this();
      return jSONObject.put("presetName", this.a).put("levels", jSONArray).toString();
    } catch (JSONException jSONException) {
      jSONException.printStackTrace();
      return null;
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\ea1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
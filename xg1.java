import android.media.audiofx.EnvironmentalReverb;
import org.json.JSONException;
import org.json.JSONObject;

public final class xg1 {
  public String a;
  
  public final EnvironmentalReverb.Settings b;
  
  public double c;
  
  public xg1(String paramString) {
    try {
      JSONObject jSONObject = new JSONObject();
      this(paramString);
      this.a = jSONObject.getString("presetName");
      EnvironmentalReverb.Settings settings = new EnvironmentalReverb.Settings();
      this(jSONObject.getString("settings"));
      this.b = settings;
      this.c = jSONObject.getDouble("level");
      return;
    } catch (JSONException jSONException) {
      jSONException.printStackTrace();
      return;
    } 
  }
  
  public xg1(String paramString, EnvironmentalReverb.Settings paramSettings, double paramDouble) {
    this.a = paramString;
    this.b = new EnvironmentalReverb.Settings(paramSettings.toString());
    this.c = paramDouble;
  }
  
  public final String toString() {
    try {
      JSONObject jSONObject = new JSONObject();
      this();
      return jSONObject.put("presetName", this.a).put("level", this.c).put("settings", this.b.toString()).toString();
    } catch (JSONException jSONException) {
      jSONException.printStackTrace();
      return null;
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\xg1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
import org.json.JSONException;
import org.json.JSONObject;

public final class cf2 extends cg2 {
  public final double o;
  
  public final nf1 p;
  
  public cf2(nf1 paramnf1, double paramDouble) {
    super(paramnf1, false);
  }
  
  public final void i() {
    te2 te2 = this.p.c;
    ye2 ye2 = j();
    double d = this.o;
    if (te2.f != null) {
      JSONObject jSONObject = new JSONObject();
      long l = te2.n();
      try {
        jSONObject.put("requestId", l);
        jSONObject.put("type", "SET_PLAYBACK_RATE");
        jSONObject.put("playbackRate", d);
        n21.n("mediaStatus should not be null", te2.f);
        jSONObject.put("mediaSessionId", te2.f.c);
      } catch (JSONException jSONException) {}
      te2.m(l, jSONObject.toString());
      te2.v.a(l, ye2);
      return;
    } 
    throw new Exception();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\cf2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
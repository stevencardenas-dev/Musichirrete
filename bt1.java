import android.content.Context;
import android.content.SharedPreferences;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.a;
import in.krosbits.musicolet.SettingsActivity;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;

public final class bt1 extends ms0 {
  public final ArrayList B0;
  
  public int C0;
  
  public final RecyclerView D0;
  
  public final ij0 E0;
  
  public final SharedPreferences F0;
  
  public final boolean G0;
  
  public bt1(SettingsActivity paramSettingsActivity) {
    super((Context)paramSettingsActivity);
    byte b = 0;
    Integer integer7 = Integer.valueOf(0);
    SharedPreferences sharedPreferences = paramSettingsActivity.getSharedPreferences("PP", 0);
    this.F0 = sharedPreferences;
    RecyclerView recyclerView = new RecyclerView((Context)paramSettingsActivity);
    this.D0 = recyclerView;
    f((View)recyclerView, false);
    Integer integer1 = Integer.valueOf(1);
    this.G0 = sharedPreferences.getBoolean("B_GEN_SPT", true);
    String str = sharedPreferences.getString("IA_TABO", "[0, 1, 2, 3, 4, 6, 5]");
    try {
      JSONArray jSONArray = new JSONArray();
      this(str);
      ArrayList arrayList = new ArrayList();
      this(jSONArray.length());
      this.B0 = arrayList;
      while (b < jSONArray.length()) {
        if (jSONArray.getInt(b) != 6 || this.G0)
          this.B0.add(Integer.valueOf(jSONArray.getInt(b))); 
        b++;
      } 
    } catch (JSONException jSONException) {}
    this.C0 = this.B0.size();
    if (!this.B0.contains(integer7))
      this.B0.add(integer7); 
    if (!this.B0.contains(jSONException))
      this.B0.add(jSONException); 
    if (!this.B0.contains(integer2))
      this.B0.add(integer2); 
    if (!this.B0.contains(integer3))
      this.B0.add(integer3); 
    if (!this.B0.contains(integer4))
      this.B0.add(integer4); 
    if (!this.B0.contains(integer6))
      this.B0.add(integer6); 
    if (this.G0 && !this.B0.contains(integer5))
      this.B0.add(integer5); 
    q(2131886203);
    n(2131887265);
    k(2131886278);
    this.A = new ds1(1, this);
    this.D0.setAdapter(new m90(this));
    this.D0.setLayoutManager((a)new LinearLayoutManager(1));
    ij0 ij01 = new ij0(new kz(2, this));
    this.E0 = ij01;
    ij01.g(this.D0);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\bt1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
import android.content.Context;
import android.graphics.Typeface;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import in.krosbits.musicolet.MyApplication;

public final class zp0 extends ms0 {
  public zp0(Context paramContext) {
    super(paramContext);
    q(2131886489);
    e(2131492962, true);
    String str = MyApplication.o().getString("k_s_lrcff", "d_serif");
    MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup)this.u.findViewById(2131297637);
    int j = -1;
    int i;
    for (i = 0; i < materialButtonToggleGroup.getChildCount(); i++) {
      MaterialButton materialButton = (MaterialButton)materialButtonToggleGroup.getChildAt(i);
      materialButton.setAllCaps(false);
      String str1 = (String)materialButton.getTag();
      if ("d_sans".equals(str1))
        materialButton.setTypeface(Typeface.DEFAULT); 
      if ("d_serif".equals(str1))
        materialButton.setTypeface(Typeface.SERIF); 
      if (str.equals(str1))
        j = materialButton.getId(); 
    } 
    materialButtonToggleGroup.g(j, true);
    materialButtonToggleGroup.f(new yp0(0));
    materialButtonToggleGroup = (MaterialButtonToggleGroup)this.u.findViewById(2131297604);
    i = MyApplication.o().getInt("I_FS_LYCS_DP", 16);
    if (i >= 30) {
      materialButtonToggleGroup.g(2131296374, true);
    } else if (i >= 22) {
      materialButtonToggleGroup.g(2131296373, true);
    } else {
      materialButtonToggleGroup.g(2131296446, true);
    } 
    materialButtonToggleGroup.f(new yp0(1));
    materialButtonToggleGroup = (MaterialButtonToggleGroup)this.u.findViewById(2131297591);
    i = MyApplication.o().getInt("k_i_lrctaln", 0);
    if (i == -1) {
      materialButtonToggleGroup.g(2131296401, true);
    } else if (i == 1) {
      materialButtonToggleGroup.g(2131296432, true);
    } else {
      materialButtonToggleGroup.g(2131296377, true);
    } 
    materialButtonToggleGroup.f(new yp0(2));
    n(2131886363);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\zp0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
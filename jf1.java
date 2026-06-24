import android.content.Context;
import android.content.SharedPreferences;
import android.view.ViewGroup;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import androidx.appcompat.widget.SwitchCompat;
import in.krosbits.musicolet.SettingsActivity;

public final class jf1 extends ms0 {
  public final SwitchCompat B0;
  
  public final SharedPreferences C0;
  
  public final ViewGroup D0;
  
  public jf1(SettingsActivity paramSettingsActivity) {
    super((Context)paramSettingsActivity);
    SharedPreferences sharedPreferences = paramSettingsActivity.getSharedPreferences("PP", 0);
    this.C0 = sharedPreferences;
    e(2131492971, true);
    SwitchCompat switchCompat = (SwitchCompat)this.u.findViewById(2131296551);
    this.B0 = switchCompat;
    Spinner spinner = (Spinner)this.u.findViewById(2131297511);
    ViewGroup viewGroup = (ViewGroup)this.u.findViewById(2131296957);
    this.D0 = viewGroup;
    RadioGroup radioGroup = (RadioGroup)this.u.findViewById(2131297374);
    spinner.setAdapter((SpinnerAdapter)new x3((Context)paramSettingsActivity, 17367043));
    spinner.setSelection(sharedPreferences.getInt("k_i_rlpmd", 9) - 1);
    spinner.setOnItemSelectedListener(new z10(2, this));
    if (sharedPreferences.getInt("k_i_rsb", 1) == 1) {
      radioGroup.check(2131297324);
    } else {
      radioGroup.check(2131297345);
    } 
    radioGroup.setOnCheckedChangeListener(new hp0(this, 1));
    switchCompat.setChecked(sharedPreferences.getBoolean("k_b_rlpis", false));
    switchCompat.setOnCheckedChangeListener(new fz(3, this));
    if (switchCompat.isChecked()) {
      viewGroup.setVisibility(0);
      return;
    } 
    viewGroup.setVisibility(8);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\jf1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
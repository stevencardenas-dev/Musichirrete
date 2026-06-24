import android.widget.CompoundButton;
import androidx.preference.CheckBoxPreference;
import androidx.preference.SwitchPreference;
import androidx.preference.SwitchPreferenceCompat;
import in.krosbits.musicolet.RGReadCalcActivity;

public final class nk implements CompoundButton.OnCheckedChangeListener {
  public final int b;
  
  public final Object c;
  
  public final void onCheckedChanged(CompoundButton paramCompoundButton, boolean paramBoolean) {
    int i = this.b;
    Object object = this.c;
    switch (i) {
      default:
        ((SwitchPreferenceCompat)object).F(paramBoolean);
        return;
      case 2:
        ((SwitchPreference)object).F(paramBoolean);
        return;
      case 1:
        object = ((RGReadCalcActivity)object).T;
        if (paramBoolean) {
          i = 0;
        } else {
          i = 8;
        } 
        object.setVisibility(i);
        return;
      case 0:
        break;
    } 
    ((CheckBoxPreference)object).F(paramBoolean);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\nk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
import android.os.Bundle;
import androidx.preference.ListPreference;
import in.krosbits.android.widgets.swipetoloadlayout.vZ.LHyji;

public class fo0 extends t91 {
  public CharSequence[] A0;
  
  public int y0;
  
  public CharSequence[] z0;
  
  public final void K0(boolean paramBoolean) {
    if (paramBoolean) {
      int i = this.y0;
      if (i >= 0) {
        String str = this.A0[i].toString();
        ListPreference listPreference = (ListPreference)I0();
        listPreference.getClass();
        listPreference.H(str);
      } 
    } 
  }
  
  public final void L0(mi2 parammi2) {
    CharSequence[] arrayOfCharSequence = this.z0;
    int i = this.y0;
    eo0 eo0 = new eo0(this);
    v3 v3 = (v3)parammi2.e;
    v3.n = arrayOfCharSequence;
    v3.p = eo0;
    v3.u = i;
    v3.t = true;
    v3.g = null;
    v3.h = null;
  }
  
  public final void f0(Bundle paramBundle) {
    CharSequence[] arrayOfCharSequence;
    super.f0(paramBundle);
    if (paramBundle == null) {
      ListPreference listPreference = (ListPreference)I0();
      arrayOfCharSequence = listPreference.U;
      CharSequence[] arrayOfCharSequence1 = listPreference.V;
      if (arrayOfCharSequence != null && arrayOfCharSequence1 != null) {
        this.y0 = listPreference.F(listPreference.W);
        this.z0 = listPreference.U;
        this.A0 = arrayOfCharSequence1;
        return;
      } 
      tp.f("ListPreference requires an entries array and an entryValues array.");
      return;
    } 
    this.y0 = arrayOfCharSequence.getInt("ListPreferenceDialogFragment.index", 0);
    this.z0 = arrayOfCharSequence.getCharSequenceArray("ListPreferenceDialogFragment.entries");
    this.A0 = arrayOfCharSequence.getCharSequenceArray("ListPreferenceDialogFragment.entryValues");
  }
  
  public final void n0(Bundle paramBundle) {
    super.n0(paramBundle);
    paramBundle.putInt("ListPreferenceDialogFragment.index", this.y0);
    paramBundle.putCharSequenceArray(LHyji.yuNxjERYoxZI, this.z0);
    paramBundle.putCharSequenceArray("ListPreferenceDialogFragment.entryValues", this.A0);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\fo0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
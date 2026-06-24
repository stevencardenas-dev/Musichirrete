import android.os.Bundle;
import androidx.preference.MultiSelectListPreference;
import java.util.ArrayList;
import java.util.HashSet;
import org.jaudiotagger.audio.dff.vR.CKYHNesT;

public class py0 extends t91 {
  public CharSequence[] A0;
  
  public CharSequence[] B0;
  
  public final HashSet y0 = new HashSet();
  
  public boolean z0;
  
  public final void K0(boolean paramBoolean) {
    if (paramBoolean && this.z0) {
      MultiSelectListPreference multiSelectListPreference = (MultiSelectListPreference)I0();
      multiSelectListPreference.getClass();
      multiSelectListPreference.F(this.y0);
    } 
    this.z0 = false;
  }
  
  public final void L0(mi2 parammi2) {
    int i = this.B0.length;
    boolean[] arrayOfBoolean = new boolean[i];
    for (byte b = 0; b < i; b++) {
      String str = this.B0[b].toString();
      arrayOfBoolean[b] = this.y0.contains(str);
    } 
    CharSequence[] arrayOfCharSequence = this.A0;
    oy0 oy0 = new oy0(this);
    v3 v3 = (v3)parammi2.e;
    v3.n = arrayOfCharSequence;
    v3.v = oy0;
    v3.r = arrayOfBoolean;
    v3.s = true;
  }
  
  public final void f0(Bundle paramBundle) {
    MultiSelectListPreference multiSelectListPreference;
    super.f0(paramBundle);
    HashSet hashSet = this.y0;
    if (paramBundle == null) {
      multiSelectListPreference = (MultiSelectListPreference)I0();
      CharSequence[] arrayOfCharSequence1 = multiSelectListPreference.U;
      CharSequence[] arrayOfCharSequence2 = multiSelectListPreference.V;
      if (arrayOfCharSequence1 != null && arrayOfCharSequence2 != null) {
        hashSet.clear();
        hashSet.addAll(multiSelectListPreference.W);
        this.z0 = false;
        this.A0 = multiSelectListPreference.U;
        this.B0 = arrayOfCharSequence2;
        return;
      } 
      tp.f("MultiSelectListPreference requires an entries array and an entryValues array.");
      return;
    } 
    hashSet.clear();
    hashSet.addAll(multiSelectListPreference.getStringArrayList("MultiSelectListPreferenceDialogFragmentCompat.values"));
    this.z0 = multiSelectListPreference.getBoolean("MultiSelectListPreferenceDialogFragmentCompat.changed", false);
    this.A0 = multiSelectListPreference.getCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entries");
    this.B0 = multiSelectListPreference.getCharSequenceArray(CKYHNesT.qzTRwfqjKJ);
  }
  
  public final void n0(Bundle paramBundle) {
    super.n0(paramBundle);
    paramBundle.putStringArrayList("MultiSelectListPreferenceDialogFragmentCompat.values", new ArrayList(this.y0));
    paramBundle.putBoolean("MultiSelectListPreferenceDialogFragmentCompat.changed", this.z0);
    paramBundle.putCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entries", this.A0);
    paramBundle.putCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entryValues", this.B0);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\py0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
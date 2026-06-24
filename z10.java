import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.SearchView;
import androidx.preference.ListPreference;

public final class z10 implements AdapterView.OnItemSelectedListener {
  public final int b;
  
  public final Object c;
  
  private final void a(AdapterView paramAdapterView) {}
  
  private final void b(AdapterView paramAdapterView) {}
  
  private final void c(AdapterView paramAdapterView) {}
  
  private final void d(AdapterView paramAdapterView) {}
  
  public final void onItemSelected(AdapterView paramAdapterView, View paramView, int paramInt, long paramLong) {
    int i = this.b;
    Object object = this.c;
    switch (i) {
      default:
        ((SearchView)object).onItemSelected(paramInt);
        return;
      case 2:
        ((jf1)object).C0.edit().putInt("k_i_rlpmd", paramInt + 1).apply();
        return;
      case 1:
        if (paramInt != -1) {
          object = ((co0)object).e;
          if (object != null)
            object.setListSelectionHidden(false); 
        } 
        return;
      case 0:
        break;
    } 
    object = object;
    if (paramInt >= 0) {
      String str = ((ListPreference)object).V[paramInt].toString();
      if (!str.equals(((ListPreference)object).W))
        object.H(str); 
    } 
  }
  
  public final void onNothingSelected(AdapterView paramAdapterView) {
    int i = this.b;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\z10.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
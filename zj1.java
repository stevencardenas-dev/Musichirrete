import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.SeekBar;
import androidx.preference.SeekBarPreference;
import androidx.work.impl.diagnostics.UWhQ.OETETTfAjV;

public final class zj1 implements View.OnKeyListener {
  public final SeekBarPreference b;
  
  public zj1(SeekBarPreference paramSeekBarPreference) {
    this.b = paramSeekBarPreference;
  }
  
  public final boolean onKey(View paramView, int paramInt, KeyEvent paramKeyEvent) {
    if (paramKeyEvent.getAction() == 0) {
      SeekBarPreference seekBarPreference = this.b;
      if ((seekBarPreference.V || (paramInt != 21 && paramInt != 22)) && paramInt != 23 && paramInt != 66) {
        SeekBar seekBar = seekBarPreference.T;
        if (seekBar == null) {
          Log.e("SeekBarPreference", OETETTfAjV.UcLUimXZTUIpURp);
          return false;
        } 
        return seekBar.onKeyDown(paramInt, paramKeyEvent);
      } 
    } 
    return false;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\zj1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
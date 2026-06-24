import android.content.Context;
import android.content.SharedPreferences;
import android.widget.SeekBar;
import android.widget.TextView;
import com.google.android.gms.common.api.Gldr.hbrAVtEa;
import in.krosbits.musicolet.SettingsActivity;

public final class o9 extends ms0 implements SeekBar.OnSeekBarChangeListener, rs0 {
  public final SharedPreferences B0;
  
  public final TextView C0;
  
  public final TextView D0;
  
  public final SeekBar E0;
  
  public final SeekBar F0;
  
  public o9(SettingsActivity paramSettingsActivity) {
    super((Context)paramSettingsActivity);
    SharedPreferences sharedPreferences = paramSettingsActivity.getSharedPreferences("PP", 0);
    this.B0 = sharedPreferences;
    e(2131492953, false);
    this.C0 = (TextView)this.u.findViewById(2131297775);
    this.D0 = (TextView)this.u.findViewById(2131297851);
    SeekBar seekBar2 = (SeekBar)this.u.findViewById(2131297435);
    this.E0 = seekBar2;
    SeekBar seekBar1 = (SeekBar)this.u.findViewById(2131297440);
    this.F0 = seekBar1;
    seekBar2.setProgress(sharedPreferences.getInt("k_i_lfch", 100));
    seekBar1.setProgress(sharedPreferences.getInt("k_i_rgch", 100));
    r();
    seekBar2.setOnSeekBarChangeListener(this);
    seekBar1.setOnSeekBarChangeListener(this);
    q(2131886218);
    l(2131887193);
    n(2131886467);
    this.D = this;
  }
  
  public final void Q(ss0 paramss0, qy paramqy) {
    if (paramqy == qy.c) {
      this.B0.edit().putInt("k_i_lfch", 100).putInt("k_i_rgch", 100).apply();
      try {
        return;
      } finally {
        paramss0 = null;
      } 
    } 
  }
  
  public final void onProgressChanged(SeekBar paramSeekBar, int paramInt, boolean paramBoolean) {
    if (paramBoolean)
      r(); 
  }
  
  public final void onStartTrackingTouch(SeekBar paramSeekBar) {}
  
  public final void onStopTrackingTouch(SeekBar paramSeekBar) {
    int i = this.E0.getProgress();
    int j = this.F0.getProgress();
    this.B0.edit().putInt("k_i_lfch", i).putInt(hbrAVtEa.SqeJv, j).apply();
    try {
      return;
    } finally {
      paramSeekBar = null;
      paramSeekBar.printStackTrace();
    } 
  }
  
  public final void r() {
    StringBuilder stringBuilder2 = new StringBuilder();
    stringBuilder2.append(String.valueOf(this.E0.getProgress()));
    stringBuilder2.append("%");
    String str2 = stringBuilder2.toString();
    this.C0.setText(str2);
    StringBuilder stringBuilder1 = new StringBuilder();
    stringBuilder1.append(String.valueOf(this.F0.getProgress()));
    stringBuilder1.append("%");
    String str1 = stringBuilder1.toString();
    this.D0.setText(str1);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\o9.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
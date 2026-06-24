import android.media.AudioManager;
import android.os.Handler;
import android.view.View;
import android.widget.PopupWindow;
import android.widget.SeekBar;
import androidx.appcompat.widget.AppCompatSeekBar;
import in.krosbits.android.widgets.SmartImageView;
import in.krosbits.android.widgets.SmartTextView;
import in.krosbits.musicolet.MusicService;

public final class q42 extends PopupWindow implements SeekBar.OnSeekBarChangeListener, View.OnClickListener {
  public AudioManager b;
  
  public AppCompatSeekBar c;
  
  public SmartTextView e;
  
  public SmartImageView f;
  
  public int g;
  
  public Handler h;
  
  public xt0 i;
  
  public z71 j;
  
  public final void a() {
    Handler handler = this.h;
    xt0 xt01 = this.i;
    handler.removeCallbacks(xt01);
    handler.postDelayed(xt01, 3500L);
  }
  
  public final void b(int paramInt) {
    hc hc = MusicService.E0;
    if (hc instanceof fl) {
      ((fl)hc).q0(paramInt);
      return;
    } 
    this.b.setStreamVolume(3, paramInt, 0);
  }
  
  public final void onClick(View paramView) {
    int i = paramView.getId();
    if (i == 2131296915 || i == 2131297905) {
      this.j.O0(0);
      this.c.setProgress(0);
      this.e.setText("0");
      this.f.setImageResource(ag0.X(0, this.g));
      b(0);
      a();
      return;
    } 
  }
  
  public final void onProgressChanged(SeekBar paramSeekBar, int paramInt, boolean paramBoolean) {
    if (paramBoolean) {
      this.j.O0(paramInt);
      this.e.setText(String.valueOf(paramInt));
      this.f.setImageResource(ag0.X(paramInt, this.g));
      b(paramInt);
      a();
    } 
  }
  
  public final void onStartTrackingTouch(SeekBar paramSeekBar) {}
  
  public final void onStopTrackingTouch(SeekBar paramSeekBar) {}
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\q42.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
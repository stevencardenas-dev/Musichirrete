import android.widget.SeekBar;

public final class ou0 implements SeekBar.OnSeekBarChangeListener {
  public final e3 b;
  
  public final qu0 c;
  
  public ou0(qu0 paramqu0) {
    this.c = paramqu0;
    this.b = new e3(20, this);
  }
  
  public final void onProgressChanged(SeekBar paramSeekBar, int paramInt, boolean paramBoolean) {
    if (paramBoolean) {
      hv0 hv0 = (hv0)paramSeekBar.getTag();
      int i = qu0.s0;
      hv0.j(paramInt);
    } 
  }
  
  public final void onStartTrackingTouch(SeekBar paramSeekBar) {
    qu0 qu01 = this.c;
    if (qu01.P != null)
      qu01.N.removeCallbacks(this.b); 
    qu01.P = (hv0)paramSeekBar.getTag();
  }
  
  public final void onStopTrackingTouch(SeekBar paramSeekBar) {
    this.c.N.postDelayed(this.b, 500L);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\ou0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import com.pavelsikun.seekbarpreference.SeekBarPreferenceCompat;

public final class q91 implements SeekBar.OnSeekBarChangeListener, View.OnClickListener {
  public final String b = q91.class.getSimpleName();
  
  public int c;
  
  public int e;
  
  public int f;
  
  public int g;
  
  public String h;
  
  public boolean i;
  
  public int j;
  
  public TextView k;
  
  public SeekBar l;
  
  public TextView m;
  
  public LinearLayout n;
  
  public FrameLayout o;
  
  public TextView p;
  
  public TextView q;
  
  public boolean r;
  
  public final boolean s;
  
  public final Context t;
  
  public SeekBarPreferenceCompat u;
  
  public SeekBarPreferenceCompat v;
  
  public String[] w = null;
  
  public q91(Context paramContext) {
    this.t = paramContext;
    this.s = false;
  }
  
  public final void a(int paramInt) {
    int k = this.e;
    int m = this.f;
    int j = k * m;
    int i = paramInt;
    if (paramInt < j)
      i = j; 
    j = (this.c - k) * m;
    paramInt = i;
    if (i > j)
      paramInt = j; 
    this.g = paramInt;
    SeekBar seekBar = this.l;
    if (seekBar != null)
      seekBar.setProgress(paramInt / m - k); 
    SeekBarPreferenceCompat seekBarPreferenceCompat = this.v;
    if (seekBarPreferenceCompat != null)
      seekBarPreferenceCompat.x(this.g); 
  }
  
  public final void onClick(View paramView) {
    int i = this.j;
    int k = this.e;
    int m = this.c;
    int j = this.g;
    pt pt = new pt(this.t, i, k, m, j);
    pt.f = new bh0(20, this);
    pt.b.show();
  }
  
  public final void onProgressChanged(SeekBar paramSeekBar, int paramInt, boolean paramBoolean) {
    String str;
    int i = this.e;
    paramInt = paramInt * this.f + i;
    this.g = paramInt;
    TextView textView = this.k;
    String[] arrayOfString = this.w;
    if (arrayOfString != null && paramInt >= 0 && paramInt < arrayOfString.length) {
      str = arrayOfString[paramInt];
    } else {
      str = String.valueOf(paramInt);
    } 
    textView.setText(str);
  }
  
  public final void onStartTrackingTouch(SeekBar paramSeekBar) {}
  
  public final void onStopTrackingTouch(SeekBar paramSeekBar) {
    a(this.g);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\q91.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
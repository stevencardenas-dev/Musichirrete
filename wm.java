import android.graphics.Color;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.preference.SeekBarPreference;
import in.krosbits.musicolet.MusicService;
import in.krosbits.musicolet.MyApplication;
import in.krosbits.musicolet.WidgetPrefActivity;

public final class wm implements SeekBar.OnSeekBarChangeListener {
  public final int b;
  
  public final Object c;
  
  private final void a(SeekBar paramSeekBar) {}
  
  private final void b(SeekBar paramSeekBar) {}
  
  private final void c(SeekBar paramSeekBar) {}
  
  public final void onProgressChanged(SeekBar paramSeekBar, int paramInt, boolean paramBoolean) {
    WidgetPrefActivity widgetPrefActivity;
    TextView textView;
    int i = this.b;
    Object object = this.c;
    switch (i) {
      default:
        if (paramBoolean) {
          i = paramSeekBar.getMax();
          int j = 100 / paramSeekBar.getMax();
          widgetPrefActivity = (WidgetPrefActivity)object;
          object = WidgetPrefActivity.O0;
          widgetPrefActivity.p0(j * (i - paramInt));
        } 
        return;
      case 2:
        object = object;
        if (paramBoolean && (((SeekBarPreference)object).X || !((SeekBarPreference)object).S)) {
          paramInt = ((SeekBarPreference)object).P;
          paramInt = widgetPrefActivity.getProgress() + paramInt;
          if (paramInt != ((SeekBarPreference)object).O)
            object.F(paramInt, false); 
        } else {
          i = ((SeekBarPreference)object).P;
          textView = ((SeekBarPreference)object).U;
          if (textView != null)
            textView.setText(String.valueOf(paramInt + i)); 
        } 
        return;
      case 1:
        if (paramBoolean) {
          object = object;
          if (textView == ((p71)object).B0) {
            float f = paramInt / 20.0F;
            p71.x(((p71)object).D0, f + 0.5F);
          } else if (textView == ((p71)object).C0) {
            float f = paramInt / 20.0F;
            p71.x(((p71)object).E0, f + 0.5F);
          } 
        } 
        return;
      case 0:
        break;
    } 
    an an = (an)object;
    if (paramBoolean) {
      an.J0().getClass();
      paramInt = Color.argb(an.z0.getProgress(), an.B0.getProgress(), an.D0.getProgress(), an.F0.getProgress());
      an.w0.setText(String.format("%08X", new Object[] { Integer.valueOf(paramInt) }));
    } 
    an.A0.setText(String.format("%d", new Object[] { Integer.valueOf(an.z0.getProgress()) }));
    an.C0.setText(String.format("%d", new Object[] { Integer.valueOf(an.B0.getProgress()) }));
    an.E0.setText(String.format("%d", new Object[] { Integer.valueOf(an.D0.getProgress()) }));
    an.G0.setText(String.format("%d", new Object[] { Integer.valueOf(an.F0.getProgress()) }));
  }
  
  public final void onStartTrackingTouch(SeekBar paramSeekBar) {
    int i = this.b;
    Object object = this.c;
    switch (i) {
      default:
        return;
      case 2:
        ((SeekBarPreference)object).S = true;
        return;
      case 1:
        ((p71)object).F0 = true;
        break;
      case 0:
        break;
    } 
  }
  
  public final void onStopTrackingTouch(SeekBar paramSeekBar) {
    int j;
    int i = this.b;
    Object object = this.c;
    switch (i) {
      default:
        try {
          i = paramSeekBar.getMax();
          int m = paramSeekBar.getProgress();
          int k = 100 / paramSeekBar.getMax();
          MyApplication.o().edit().putInt("I_WIDTRS", (i - m) * k).apply();
          MusicService.Q0(MyApplication.i.getApplicationContext());
        } catch (Exception exception) {
          exception.printStackTrace();
        } 
        return;
      case 2:
        object = object;
        ((SeekBarPreference)object).S = false;
        i = exception.getProgress();
        j = ((SeekBarPreference)object).P;
        if (i + j != ((SeekBarPreference)object).O) {
          i = exception.getProgress() + j;
          if (i != ((SeekBarPreference)object).O)
            object.F(i, false); 
        } 
        return;
      case 1:
        ((p71)object).F0 = false;
        break;
      case 0:
        break;
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\wm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
import android.widget.CompoundButton;
import android.widget.TextView;
import in.krosbits.musicolet.MyApplication;

public final class d21 implements CompoundButton.OnCheckedChangeListener {
  public final int b;
  
  public final j01 c;
  
  public final void onCheckedChanged(CompoundButton paramCompoundButton, boolean paramBoolean) {
    TextView textView;
    int i = this.b;
    j01 j011 = this.c;
    switch (i) {
      default:
        MyApplication.o().edit().putBoolean("k_i_oenxpvbowptw", paramBoolean).apply();
        textView = ((yy)j011.e).j;
        if (paramBoolean) {
          i = 0;
        } else {
          i = 8;
        } 
        textView.setVisibility(i);
        return;
      case 0:
        break;
    } 
    MyApplication.o().edit().putBoolean("k_b_ornxpvbarwrw", paramBoolean).apply();
    textView.G();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\d21.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
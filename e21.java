import android.widget.RadioGroup;

public final class e21 implements RadioGroup.OnCheckedChangeListener {
  public final int b;
  
  public final j01 c;
  
  public final void onCheckedChanged(RadioGroup paramRadioGroup, int paramInt) {
    int i = this.b;
    boolean bool1 = true;
    boolean bool2 = true;
    j01 j011 = this.c;
    switch (i) {
      default:
        if (paramInt == ((yy)j011.e).f.getId()) {
          paramInt = bool2;
        } else {
          paramInt = 2;
        } 
        x41.u("k_i_oenxpvbowplps", paramInt);
        return;
      case 0:
        break;
    } 
    if (paramInt == ((yy)j011.e).d.getId()) {
      paramInt = bool1;
    } else {
      paramInt = 0;
    } 
    x41.u("k_i_oenxpvbfltp", paramInt);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\e21.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
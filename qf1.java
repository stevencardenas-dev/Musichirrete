import com.google.android.material.button.MaterialButtonToggleGroup;
import in.krosbits.musicolet.MyApplication;

public final class qf1 implements hs0 {
  public final rf1 b;
  
  public qf1(rf1 paramrf1) {
    this.b = paramrf1;
  }
  
  public final void a(MaterialButtonToggleGroup paramMaterialButtonToggleGroup, int paramInt, boolean paramBoolean) {
    if (paramBoolean) {
      if (paramInt == 2131297596) {
        paramBoolean = true;
      } else {
        paramBoolean = false;
      } 
      MyApplication.u().edit().putBoolean("R_b_RPUMS", paramBoolean).apply();
      ui0.t();
      this.b.b();
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\qf1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
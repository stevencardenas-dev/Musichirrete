import android.content.Context;
import in.krosbits.musicolet.MyApplication;
import in.krosbits.musicolet.SettingsActivity;

public final class ol1 implements y00 {
  public final int b;
  
  public final SettingsActivity c;
  
  public final void f(Context paramContext, v00 paramv00) {
    int i = this.b;
    SettingsActivity settingsActivity = this.c;
    switch (i) {
      default:
        MyApplication.v().edit().putString("SAF_S_ATEXCVPFL", paramv00.j().toString()).apply();
        sl1.X0(settingsActivity.Z.D0("SAF_S_ATEXCVPFL"));
        return;
      case 0:
        break;
    } 
    MyApplication.v().edit().putString("SAF_S_ATBKPFL", paramv00.j().toString()).apply();
    sl1.W0(settingsActivity.Z.D0("SAF_S_ATBKPFL"));
  }
  
  public final boolean n(v00 paramv00) {
    xp1 xp1;
    int i = this.b;
    boolean bool3 = true;
    boolean bool2 = true;
    switch (i) {
      default:
        bool1 = bool2;
        if (paramv00 instanceof cd1) {
          String str = ((cd1)paramv00).H();
          xp1 = MyApplication.F.h(str);
          bool1 = bool2;
          if (xp1 != null) {
            bool1 = bool2;
            if (str.equals(xp1.l))
              bool1 = false; 
          } 
        } 
        return bool1;
      case 0:
        break;
    } 
    boolean bool1 = bool3;
    if (xp1 instanceof cd1) {
      String str = ((cd1)xp1).H();
      xp1 = MyApplication.F.h(str);
      bool1 = bool3;
      if (xp1 != null) {
        bool1 = bool3;
        if (str.equals(xp1.l))
          bool1 = false; 
      } 
    } 
    return bool1;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\ol1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
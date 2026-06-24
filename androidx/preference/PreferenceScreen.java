package androidx.preference;

import android.content.Context;
import android.util.AttributeSet;
import dd1;
import in.krosbits.musicolet.SettingsActivity;
import ua0;
import w91;

public final class PreferenceScreen extends PreferenceGroup {
  public final boolean U = true;
  
  public PreferenceScreen(Context paramContext, AttributeSet paramAttributeSet) {
    super(paramContext, paramAttributeSet, dd1.x(paramContext, 2130969822, 16842891), 0);
  }
  
  public final void o() {
    if (this.n == null && this.o == null && this.P.size() != 0) {
      w91 w91 = this.c.j;
      if (w91 != null) {
        boolean bool = false;
        w91 w911 = w91;
        while (w911 != null)
          ua0 ua0 = ((ua0)w911).z; 
        if (w91.P() instanceof SettingsActivity) {
          ((SettingsActivity)w91.P()).p0(this);
          bool = true;
        } 
        if (!bool && w91.M() instanceof SettingsActivity)
          ((SettingsActivity)w91.M()).p0(this); 
      } 
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\androidx\preference\PreferenceScreen.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
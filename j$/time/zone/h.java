package j$.time.zone;

import java.security.PrivilegedAction;
import java.util.ArrayList;
import java.util.List;

public final class h implements PrivilegedAction {
  public final List a;
  
  public h(List paramList) {
    this.a = paramList;
  }
  
  public final Object run() {
    String str = System.getProperty("java.time.zone.DefaultZoneRulesProvider");
    if (str != null) {
      try {
        i i = i.class.cast(Class.forName(str, true, i.class.getClassLoader()).newInstance());
        i.b(i);
        ((ArrayList<i>)this.a).add(i);
      } catch (Exception exception) {
        throw new Error(exception);
      } 
    } else {
      i.b(new i());
    } 
    return null;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\j$\time\zone\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
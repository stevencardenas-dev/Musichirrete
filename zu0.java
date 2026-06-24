import android.content.ComponentName;
import android.content.Context;
import java.util.Objects;

public abstract class zu0 {
  public final Context b;
  
  public final bh0 c;
  
  public final cj e = new cj(6, this);
  
  public ae0 f;
  
  public tu0 g;
  
  public boolean h;
  
  public av0 i;
  
  public boolean j;
  
  public zu0(Context paramContext, bh0 parambh0) {
    if (paramContext != null) {
      this.b = paramContext;
      if (parambh0 == null) {
        this.c = new bh0(9, new ComponentName(paramContext, getClass()));
        return;
      } 
      this.c = parambh0;
      return;
    } 
    l0.l("context must not be null");
    throw null;
  }
  
  public wu0 a(String paramString, yu0 paramyu0) {
    if (paramString != null)
      return null; 
    l0.l("initialMemberRouteId cannot be null.");
    return null;
  }
  
  public xu0 b(String paramString) {
    if (paramString != null)
      return null; 
    l0.l("routeId cannot be null");
    return null;
  }
  
  public xu0 c(String paramString, yu0 paramyu0) {
    return b(paramString);
  }
  
  public xu0 d(String paramString1, String paramString2) {
    if (paramString1 != null) {
      if (paramString2 != null)
        return c(paramString1, yu0.b); 
      l0.l("routeGroupId cannot be null");
      return null;
    } 
    l0.l("routeId cannot be null");
    return null;
  }
  
  public abstract void e(tu0 paramtu0);
  
  public final void f(av0 paramav0) {
    iv0.b();
    if (this.i != paramav0) {
      this.i = paramav0;
      if (!this.j) {
        this.j = true;
        this.e.sendEmptyMessage(1);
      } 
    } 
  }
  
  public final void g(tu0 paramtu0) {
    iv0.b();
    if (!Objects.equals(this.g, paramtu0)) {
      this.g = paramtu0;
      if (!this.h) {
        this.h = true;
        this.e.sendEmptyMessage(2);
      } 
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\zu0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
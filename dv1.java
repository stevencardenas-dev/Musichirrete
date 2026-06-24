import android.view.MenuItem;
import androidx.appcompat.widget.Toolbar;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public final class dv1 implements x1, pw0 {
  public final Toolbar b;
  
  public boolean c(rw0 paramrw0, MenuItem paramMenuItem) {
    return false;
  }
  
  public void g(rw0 paramrw0) {
    Toolbar toolbar = this.b;
    u1 u1 = toolbar.b.g;
    if (u1 == null || !u1.h()) {
      Iterator iterator = ((CopyOnWriteArrayList)toolbar.I.e).iterator();
      while (iterator.hasNext())
        ((db0)iterator.next()).a.t(); 
    } 
    jv1 jv1 = toolbar.Q;
    if (jv1 != null)
      jv1.g(paramrw0); 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\dv1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
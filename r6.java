import android.content.Context;
import android.content.IntentFilter;
import android.view.MenuItem;
import java.util.ArrayList;

public abstract class r6 {
  public Object a;
  
  public Object b;
  
  public r6(int paramInt) {
    this.b = new ArrayList();
    for (byte b = 0; b < paramInt; b++)
      ((ArrayList<o10>)this.b).add(new o10()); 
  }
  
  public r6(Context paramContext) {
    this.a = paramContext;
  }
  
  public r6(u6 paramu6) {
    this.b = paramu6;
  }
  
  public abstract void c();
  
  public void d() {
    q6 q6 = (q6)this.a;
    if (q6 != null) {
      try {
        ((u6)this.b).m.unregisterReceiver(q6);
      } catch (IllegalArgumentException illegalArgumentException) {}
      this.a = null;
    } 
  }
  
  public abstract IntentFilter e();
  
  public abstract int f();
  
  public MenuItem g(MenuItem paramMenuItem) {
    if (paramMenuItem instanceof dr1) {
      dr1 dr1 = (dr1)paramMenuItem;
      if ((zm1)this.b == null)
        this.b = new zm1(0); 
      MenuItem menuItem = (MenuItem)((zm1)this.b).get(dr1);
      paramMenuItem = menuItem;
      if (menuItem == null) {
        paramMenuItem = new yw0((Context)this.a, dr1);
        ((zm1)this.b).put(dr1, paramMenuItem);
      } 
      return paramMenuItem;
    } 
    return paramMenuItem;
  }
  
  public abstract void h();
  
  public abstract void i();
  
  public abstract void j(md parammd);
  
  public abstract void k();
  
  public void l() {
    d();
    IntentFilter intentFilter = e();
    if (intentFilter.countActions() == 0)
      return; 
    if ((q6)this.a == null)
      this.a = new q6(0, this); 
    ((u6)this.b).m.registerReceiver((q6)this.a, intentFilter);
  }
  
  public abstract void m();
  
  public abstract void n();
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\r6.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
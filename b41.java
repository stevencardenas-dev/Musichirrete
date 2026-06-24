import android.window.OnBackInvokedDispatcher;

public final class b41 {
  public final Runnable a;
  
  public final cs1 b;
  
  public b41(Runnable paramRunnable) {
    this.a = paramRunnable;
    this.b = new cs1(new pp(4, this));
  }
  
  public final void a(l90 paraml90) {
    paraml90.getClass();
    w31 w31 = new w31(paraml90, new x31(paraml90, null));
    paraml90.a.add(w31);
    n2.h((b()).c, w31);
  }
  
  public final z31 b() {
    return (z31)this.b.getValue();
  }
  
  public final void c(OnBackInvokedDispatcher paramOnBackInvokedDispatcher) {
    (b()).c.j(new v31(paramOnBackInvokedDispatcher, 0), 1);
    (b()).c.j(new v31(paramOnBackInvokedDispatcher, 1000000), 0);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\b41.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */